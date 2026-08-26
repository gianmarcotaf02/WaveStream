package it.wavestream.app

import android.app.Application
import android.content.ComponentCallbacks2
import android.os.StrictMode
import dagger.hilt.android.HiltAndroidApp
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.DatabaseCheckpointManager
import it.wavestream.app.data.database.dao.FtsSearchDao
import it.wavestream.app.data.repository.FtsSearchRepository
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.theme.AccentColor
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.worker.SyncWorker
import coil.Coil
import it.wavestream.app.util.WaveStreamImageLoaderFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltAndroidApp
class WaveStreamApplication : Application() {

    @Inject
    lateinit var checkpointManager: DatabaseCheckpointManager

    @Inject
    lateinit var userPreferences: UserPreferences

    @Inject
    lateinit var imageLoaderFactory: WaveStreamImageLoaderFactory

    @Inject
    lateinit var contentCache: ContentCache

    @Inject
    lateinit var ftsSearchDao: FtsSearchDao

    @Inject
    lateinit var ftsSearchRepository: FtsSearchRepository

    private val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onCreate() {
        // Uncaught exception handler to write crash logs to a file
        val defaultHandler = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            try {
                val file = java.io.File(filesDir, "crash_log.txt")
                java.io.PrintWriter(file).use { writer ->
                    throwable.printStackTrace(writer)
                }
            } catch (e: Exception) {
                // Ignore
            }
            defaultHandler?.uncaughtException(thread, throwable)
        }

        super.onCreate()

        // StrictMode in debug — catches disk I/O on main thread, leaked closeable objects, etc.
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()
                    .penaltyLog()
                    .build()
            )
            StrictMode.setVmPolicy(
                StrictMode.VmPolicy.Builder()
                    .detectLeakedSqlLiteObjects()
                    .detectLeakedClosableObjects()
                    .penaltyLog()
                    .build()
            )
        }

        // Load accent color — blocking on main thread is OK here since DataStore
        // caches the value after first read; on cold start it's ~2-5ms.
        val accentColorId = userPreferences.getAccentColorSync()
        WaveStreamColors.updateAccent(AccentColor.fromId(accentColorId))

        Coil.setImageLoader(imageLoaderFactory.newImageLoader())

        // Load session cache from Room DB into memory (survives process death)
        applicationScope.launch {
            try {
                contentCache.loadSessionDataFromDB()
            } catch (_: Exception) { }
        }

        applicationScope.launch {
            try {
                SyncWorker.updateSchedules(this@WaveStreamApplication, userPreferences)
            } catch (_: Exception) { }
        }

        // Periodic WAL checkpoint: guarantees playlist/watch data survives sudden
        // TV power-off, not only onTrimMemory/onLowMemory callbacks
        checkpointManager.startPeriodicCheckpoint()

        // FASE 4 — Rebuild FTS5 search index in background (covers data present
        // before the 25→26 migration, since triggers only fire on new writes).
        // Only runs if FTS5 is actually available (not compiled on all devices).
        applicationScope.launch {
            try {
                if (ftsSearchRepository.isFts5Available()) rebuildFtsIndex()
            } catch (_: Exception) { }
        }
    }

    /**
     * Ripopola l'indice FTS5 dalle tabelle sorgente.
     * DELETE + INSERT completo: l'UPSERT (ON CONFLICT DO UPDATE) non è disponibile
     * su SQLite < 3.24 (minSdk 26 → Android 8, SQLite 3.18). Eseguirsi in background.
     */
    private fun rebuildFtsIndex() {
        val statements = listOf(
            "DELETE FROM fts_channel",
            "INSERT INTO fts_channel(rowid, name, category, logoUrl) SELECT id, name, COALESCE(category,''), COALESCE(logoUrl,'') FROM channels",
            "DELETE FROM fts_movie",
            "INSERT INTO fts_movie(rowid, name, category, logoUrl) SELECT id, name, COALESCE(category,''), COALESCE(logoUrl,'') FROM movies",
            "DELETE FROM fts_series",
            "INSERT INTO fts_series(rowid, name, category, logoUrl) SELECT id, name, COALESCE(category,''), COALESCE(logoUrl,'') FROM series"
        )
        statements.forEach { sql ->
            ftsSearchDao.reindexAll(androidx.sqlite.db.SimpleSQLiteQuery(sql))
        }
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)

        when (level) {
            ComponentCallbacks2.TRIM_MEMORY_RUNNING_LOW,
            ComponentCallbacks2.TRIM_MEMORY_RUNNING_CRITICAL,
            ComponentCallbacks2.TRIM_MEMORY_BACKGROUND,
            ComponentCallbacks2.TRIM_MEMORY_MODERATE,
            ComponentCallbacks2.TRIM_MEMORY_COMPLETE -> {
                checkpointManager.forceCheckpoint()
            }
        }
    }

    override fun onLowMemory() {
        super.onLowMemory()
        checkpointManager.onLowMemory()
    }

    override fun onTerminate() {
        checkpointManager.forceCheckpoint()
        super.onTerminate()
    }
}
