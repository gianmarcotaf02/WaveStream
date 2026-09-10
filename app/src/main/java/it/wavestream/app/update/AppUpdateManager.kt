package it.wavestream.app.update

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.os.StatFs
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.core.content.FileProvider
import com.google.firebase.database.FirebaseDatabase
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume

/**
 * Manager for checking and downloading app updates
 * Uses Firebase Realtime Database for version info and downloads APK from GitHub Releases
 */
@Singleton
class AppUpdateManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val okHttpClient: OkHttpClient
) {
    companion object {
        private const val TAG = "AppUpdateManager"
        private const val UPDATE_NODE = "app_update"
        private const val APK_FILENAME = "wavestream_update.apk"

        /**
         * Spazio libero minimo richiesto prima di scaricare/installare un aggiornamento.
         * Durante un update in-place Android deve conservare l'APK installato E scrivere
         * il nuovo: senza margine l'installer Fire OS fallisce con "App non installata".
         */
        private const val MIN_FREE_BYTES_FOR_UPDATE = 500L * 1024L * 1024L
    }
    
    private val database by lazy {
        FirebaseDatabase.getInstance("https://wavestream-d3972-default-rtdb.europe-west1.firebasedatabase.app")
    }
    
    private val _downloadState = MutableStateFlow<DownloadState>(DownloadState.Idle)
    val downloadState: StateFlow<DownloadState> = _downloadState
    
    private var downloadedApkFile: File? = null
    private var currentDownloadUrl: String? = null
    
    /**
     * Get current installed version code
     */
    fun getInstalledVersionCode(): Int = BuildConfig.VERSION_CODE
    
    /**
     * Get current installed version name
     */
    fun getInstalledVersionName(): String = BuildConfig.VERSION_NAME
    
    /**
     * Check for available updates from Firebase Realtime Database
     */
    suspend fun checkForUpdate(): UpdateCheckResult = withContext(Dispatchers.IO) {
        try {
            Log.d(TAG, "Checking for updates...")
            
            val updateInfo = suspendCancellableCoroutine<Pair<UpdateInfo?, String?>?> { continuation ->
                database.reference.child(UPDATE_NODE).get()
                    .addOnSuccessListener { snapshot ->
                        try {
                            if (snapshot.exists()) {
                                // Safely parse with type checks/conversions
                                val versionCodeVal = snapshot.child("version_code").value
                                val versionCode = when (versionCodeVal) {
                                    is Number -> versionCodeVal.toInt()
                                    is String -> versionCodeVal.toIntOrNull() ?: 0
                                    else -> 0
                                }
                                
                                val versionNameVal = snapshot.child("version_name").value
                                val versionName = versionNameVal?.toString() ?: ""
                                
                                val changelogVal = snapshot.child("changelog").value
                                val changelog = changelogVal?.toString() ?: ""
                                
                                val forceUpdate = snapshot.child("force_update").getValue(Boolean::class.java) ?: false
                                
                                val info = UpdateInfo(
                                    versionCode = versionCode,
                                    versionName = versionName,
                                    changelog = changelog,
                                    forceUpdate = forceUpdate
                                )
                                val downloadUrl = snapshot.child("download_url").getValue(String::class.java)
                                if (continuation.isActive) {
                                    continuation.resume(Pair(info, downloadUrl))
                                }
                            } else {
                                if (continuation.isActive) {
                                    continuation.resume(null)
                                }
                            }
                        } catch (e: Exception) {
                            Log.e(TAG, "Error parsing update info: ${e.message}")
                            if (continuation.isActive) {
                                continuation.resume(Pair(null, "Errore dati: ${e.message}"))
                            }
                        }
                    }
                    .addOnFailureListener { e ->
                        Log.e(TAG, "Failed to check for updates: ${e.message}")
                        if (continuation.isActive) {
                            continuation.resume(Pair(null, e.message))
                        }
                    }
            }
            
            if (updateInfo == null) {
                return@withContext UpdateCheckResult.Error("Errore generico verifica aggiornamenti")
            }
            
            val (info, data) = updateInfo
            
            // If info is null, data might contain error message string (hacky reuse of Pair)
            if (info == null) {
                 val errorMessage = data ?: "Dati aggiornamento non disponibili"
                 return@withContext UpdateCheckResult.Error(errorMessage)
            }
            
            val downloadUrl = data
            currentDownloadUrl = downloadUrl
            
            val installedVersion = getInstalledVersionCode()
            Log.d(TAG, "Current: $installedVersion, Available: ${info.versionCode}")
            
            if (info.isNewerThan(installedVersion)) {
                if (downloadUrl.isNullOrEmpty()) {
                    UpdateCheckResult.Error("URL download non configurato")
                } else {
                    UpdateCheckResult.UpdateAvailable(info)
                }
            } else {
                UpdateCheckResult.NoUpdateAvailable
            }
            
        } catch (e: Exception) {
            Log.e(TAG, "Error checking for updates", e)
            UpdateCheckResult.Error(e.message ?: "Errore sconosciuto")
        }
    }
    
    /**
     * Download the APK from GitHub Releases (or any URL)
     */
    suspend fun downloadUpdate(): Boolean = withContext(Dispatchers.IO) {
        val downloadUrl = currentDownloadUrl
        if (downloadUrl.isNullOrEmpty()) {
            _downloadState.value = DownloadState.Failed("URL download non disponibile")
            return@withContext false
        }
        
        // Controllo spazio libero: è la causa n.1 del fallimento su Fire TV Stick
        val freeBytes = getFreeSpaceBytes()
        if (freeBytes in 1 until MIN_FREE_BYTES_FOR_UPDATE) {
            val freeMb = freeBytes / (1024L * 1024L)
            _downloadState.value = DownloadState.Failed(
                "Spazio insufficiente: ${freeMb} MB liberi, servono almeno 500 MB. " +
                    "Libera spazio (o disinstalla temporaneamente altre app) e riprova."
            )
            return@withContext false
        }

        try {
            _downloadState.value = DownloadState.Downloading(0)
            Log.d(TAG, "Starting APK download from: $downloadUrl")
            
            // Create updates directory
            val updatesDir = File(context.getExternalFilesDir(null), "updates")
            if (!updatesDir.exists()) {
                updatesDir.mkdirs()
            }
            
            // Delete old APK if exists
            val apkFile = File(updatesDir, APK_FILENAME)
            if (apkFile.exists()) {
                apkFile.delete()
            }
            
            // Client dedicato al download: timeout lunghi (la Wi-Fi dei TV va in power-save
            // e le connessioni lente fanno scattare i 30s di default) e retry automatico
            val downloadClient = okHttpClient.newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build()
            
            // Fino a 3 tentativi con resume via Range header: se la rete scatta,
            // si riprende da dove si era fermati invece di ripartire da zero
            val maxAttempts = 3
            var downloadedBytes = 0L
            var totalBytes = -1L
            
            for (attempt in 1..maxAttempts) {
                try {
                    val requestBuilder = Request.Builder().url(downloadUrl)
                    if (downloadedBytes > 0) {
                        requestBuilder.header("Range", "bytes=$downloadedBytes-")
                        Log.d(TAG, "Download retry $attempt, resuming from byte $downloadedBytes")
                    }
                    
                    downloadClient.newCall(requestBuilder.build()).execute().use { response ->
                        // Un 206 Partial Content va bene per il resume, un 200 significa
                        // che il server non supporta il Range: ripartiamo da zero
                        val isResumed = response.code == 206
                        if (!response.isSuccessful) {
                            Log.e(TAG, "Download failed: ${response.code}")
                            _downloadState.value = DownloadState.Failed("Errore HTTP: ${response.code}")
                            return@withContext false
                        }
                        
                        val body = response.body ?: run {
                            _downloadState.value = DownloadState.Failed("Risposta vuota dal server")
                            return@withContext false
                        }
                        
                        if (!isResumed) {
                            downloadedBytes = 0L
                        }
                        
                        val contentLength = body.contentLength()
                        totalBytes = if (contentLength > 0) {
                            contentLength + downloadedBytes
                        } else {
                            -1L
                        }
                        
                        FileOutputStream(apkFile, isResumed).use { output ->
                            body.byteStream().use { input ->
                                val buffer = ByteArray(8192)
                                var bytesRead: Int
                                
                                while (input.read(buffer).also { bytesRead = it } != -1) {
                                    output.write(buffer, 0, bytesRead)
                                    downloadedBytes += bytesRead
                                    
                                    if (totalBytes > 0) {
                                        val progress = ((downloadedBytes * 100) / totalBytes).toInt()
                                        _downloadState.value = DownloadState.Downloading(progress)
                                    }
                                }
                            }
                        }
                    }
                    break // completato
                } catch (e: IOException) {
                    if (attempt == maxAttempts) throw e
                    Log.w(TAG, "Download interrupted (attempt $attempt), retrying: ${e.message}")
                    delay(2000L * attempt)
                }
            }
            
            Log.d(TAG, "Download completed: ${apkFile.absolutePath}")
            downloadedApkFile = apkFile
            _downloadState.value = DownloadState.Downloaded
            true
            
        } catch (e: Exception) {
            Log.e(TAG, "Error downloading update", e)
            _downloadState.value = DownloadState.Failed(e.message ?: "Errore download")
            false
        }
    }
    
    /**
     * Spazio libero sullo storage primario (emulato) in byte; -1 se non determinabile.
     * `getExternalFilesDir` di un'app TV vive sullo stesso storage di /data, quindi
     * questo valore copre sia il download dell'APK sia la copia usata dall'installer.
     */
    private fun getFreeSpaceBytes(): Long {
        return try {
            StatFs(Environment.getDataDirectory().absolutePath).availableBytes
        } catch (e: Exception) {
            Log.w(TAG, "Impossibile leggere lo spazio libero: ${e.message}")
            -1L
        }
    }

    /**
     * Install the downloaded APK.
     *
     * Usa l'API [PackageInstaller] (disponibile da API 26, la nostra minSdk) invece di
     * ACTION_VIEW + FileProvider: su Fire OS il percorso content:// viene letto in modo
     * inaffidabile dall'installer di sistema e fallisce con il generico "App non installata"
     * senza esporre il motivo. Con PackageInstaller l'installer copia lui stesso l'APK e
     * [UpdateInstallReceiver] riceve il codice di errore reale.
     */
    fun installUpdate() {
        if (downloadedApkFile == null) {
            val updatesDir = File(context.getExternalFilesDir(null), "updates")
            val apkFile = File(updatesDir, APK_FILENAME)
            if (apkFile.exists()) {
                downloadedApkFile = apkFile
            }
        }

        val apkFile = downloadedApkFile ?: run {
            Log.e(TAG, "Nessun APK scaricato da installare")
            return
        }

        if (!apkFile.exists() || apkFile.length() == 0L) {
            Log.e(TAG, "File APK non trovato o vuoto: ${apkFile.absolutePath}")
            Toast.makeText(context, "File di aggiornamento non valido, riscarica", Toast.LENGTH_LONG).show()
            return
        }

        // Verifica permesso "installa app sconosciute"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            !context.packageManager.canRequestPackageInstalls()
        ) {
            Log.d(TAG, "Richiesta permesso installazione pacchetti")
            try {
                val intent = Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                    data = Uri.parse("package:${context.packageName}")
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e: Exception) {
                Log.e(TAG, "Impossibile aprire le impostazioni installazione", e)
                Toast.makeText(
                    context,
                    "Abilita \"Origini sconosciute\" per WaveStream e riprova",
                    Toast.LENGTH_LONG
                ).show()
            }
            return
        }

        // Avviso preventivo sullo spazio (causa più comune di fallimento su Fire TV)
        val freeBytes = getFreeSpaceBytes()
        if (freeBytes in 1 until (apkFile.length() + 100L * 1024L * 1024L)) {
            Toast.makeText(
                context,
                "Spazio insufficiente per aggiornare. Libera almeno 500 MB e riprova.",
                Toast.LENGTH_LONG
            ).show()
            return
        }

        try {
            installWithPackageInstaller(apkFile)
        } catch (e: Exception) {
            Log.e(TAG, "PackageInstaller fallito, provo con ACTION_VIEW", e)
            try {
                installWithViewIntent(apkFile)
            } catch (fallback: Exception) {
                Log.e(TAG, "Anche il fallback ACTION_VIEW è fallito", fallback)
                Toast.makeText(context, "Installazione non avviata: ${fallback.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun installWithPackageInstaller(apkFile: File) {
        val packageInstaller = context.packageManager.packageInstaller
        val params = PackageInstaller.SessionParams(
            PackageInstaller.SessionParams.MODE_FULL_INSTALL
        )

        val sessionId = packageInstaller.createSession(params)
        val session = packageInstaller.openSession(sessionId)
        try {
            session.openWrite("base.apk", 0L, apkFile.length()).use { output ->
                apkFile.inputStream().use { input ->
                    input.copyTo(output)
                }
                session.fsync(output)
            }

            val resultIntent = Intent(context, UpdateInstallReceiver::class.java).apply {
                action = UpdateInstallReceiver.ACTION_INSTALL_RESULT
            }
            val flags = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
            } else {
                PendingIntent.FLAG_UPDATE_CURRENT
            }
            val pendingIntent = PendingIntent.getBroadcast(
                context,
                sessionId,
                resultIntent,
                flags
            )
            session.commit(pendingIntent.intentSender)
            Log.d(TAG, "Sessione PackageInstaller $sessionId avviata")
        } finally {
            session.close()
        }
    }

    private fun installWithViewIntent(apkFile: File) {
        val apkUri: Uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.fileprovider",
            apkFile
        )
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(apkUri, "application/vnd.android.package-archive")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
        Log.d(TAG, "Installation intent started (fallback)")
    }
    
    /**
     * Reset download state
     */
    fun resetState() {
        _downloadState.value = DownloadState.Idle
    }
    
    /**
     * Check if there's a downloaded APK ready to install
     */
    fun hasDownloadedUpdate(): Boolean {
        return downloadedApkFile?.exists() == true
    }
}

