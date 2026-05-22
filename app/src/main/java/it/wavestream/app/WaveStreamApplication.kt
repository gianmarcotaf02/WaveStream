package it.wavestream.app

import android.app.Application
import android.content.ComponentCallbacks2
import dagger.hilt.android.HiltAndroidApp
import it.wavestream.app.data.database.DatabaseCheckpointManager
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.theme.AccentColor
import it.wavestream.app.ui.theme.WaveStreamColors
import coil.Coil
import it.wavestream.app.util.WaveStreamImageLoaderFactory
import javax.inject.Inject

@HiltAndroidApp
class WaveStreamApplication : Application() {

    @Inject
    lateinit var checkpointManager: DatabaseCheckpointManager

    @Inject
    lateinit var userPreferences: UserPreferences

    @Inject
    lateinit var imageLoaderFactory: WaveStreamImageLoaderFactory

    override fun onCreate() {
        super.onCreate()
        android.util.Log.d("WaveStreamDebug", "WaveStreamApplication onCreate STARTED")

        val accentColorId = userPreferences.getAccentColorSync()
        WaveStreamColors.updateAccent(AccentColor.fromId(accentColorId))
        android.util.Log.d("WaveStreamDebug", "App Accent Color applied: $accentColorId")

        Coil.setImageLoader(imageLoaderFactory.newImageLoader())

        android.util.Log.d("WaveStreamDebug", "WaveStreamApplication onCreate COMPLETED")
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
