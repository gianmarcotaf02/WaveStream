package it.wavestream.app.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.R
import it.wavestream.app.ui.MainActivity
import it.wavestream.app.ui.profile.ProfileSelectionActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Helper for showing app notifications
 */
@Singleton
class NotificationHelper @Inject constructor(
    @ApplicationContext private val context: Context
) {
    
    companion object {
        const val CHANNEL_GENERAL = "wavestream_general"
        const val CHANNEL_NEW_CONTENT = "wavestream_new_content"
        const val CHANNEL_DOWNLOADS = "wavestream_downloads"

        /**
         * Canale dedicato agli aggiornamenti dell'app: importanza ALTA perché la
         * notifica "aggiornamento installato" è l'unico modo per tornare dentro
         * WaveStream dopo un self-update (vedi [it.wavestream.app.update.PackageReplacedReceiver]).
         */
        const val CHANNEL_UPDATES = "wavestream_updates"
        
        const val NOTIFICATION_NEW_CONTENT = 1001
        const val NOTIFICATION_DOWNLOAD_PROGRESS = 1002
        const val NOTIFICATION_SYNC_COMPLETE = 1003
        const val NOTIFICATION_UPDATE_INSTALLED = 1004

        /**
         * Crea (in modo idempotente) tutti i canali di notifica.
         *
         * È una funzione statica, non solo il costruttore, perché la notifica di
         * aggiornamento viene pubblicata da PackageReplacedReceiver: quel broadcast
         * può avviare il processo dell'app senza che nessuno abbia mai risolto
         * [NotificationHelper] via Hilt, quindi i canali potrebbero non esistere
         * ancora (e su API 26+ una notifica su canale inesistente viene scartata).
         */
        fun ensureChannels(context: Context) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            val generalChannel = NotificationChannel(
                CHANNEL_GENERAL,
                context.getString(R.string.notification_channel_general),
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = context.getString(R.string.notification_channel_general_desc)
            }

            val newContentChannel = NotificationChannel(
                CHANNEL_NEW_CONTENT,
                context.getString(R.string.notification_channel_new_content),
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = context.getString(R.string.notification_channel_new_content_desc)
            }

            val downloadsChannel = NotificationChannel(
                CHANNEL_DOWNLOADS,
                context.getString(R.string.notification_channel_downloads),
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = context.getString(R.string.notification_channel_downloads_desc)
            }

            val updatesChannel = NotificationChannel(
                CHANNEL_UPDATES,
                context.getString(R.string.notification_channel_updates),
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = context.getString(R.string.notification_channel_updates_desc)
            }

            manager.createNotificationChannels(listOf(
                generalChannel,
                newContentChannel,
                downloadsChannel,
                updatesChannel
            ))
        }

        /**
         * Notifica "aggiornamento installato": toccarla apre WaveStream.
         *
         * Serve perché dopo un self-update Android chiude il processo dell'app e
         * BLOCCA qualsiasi tentativo di riaprirla da solo (Background Activity
         * Launch, Android 10+): senza questa notifica l'utente resta sulla Home
         * della TV senza nessun feedback che l'aggiornamento sia riuscito.
         * Il tap su una notifica è un'interazione utente, quindi è sempre permesso.
         */
        fun postUpdateInstalledNotification(context: Context, versionName: String) {
            ensureChannels(context)

            // Stesso intent del launcher dell'app: `getLaunchIntentForPackage` cerca
            // CATEGORY_LAUNCHER e in una TV app (solo LEANBACK_LAUNCHER) può tornare null,
            // quindi il fallback esplicito è il percorso normale.
            val launchIntent = (
                context.packageManager.getLaunchIntentForPackage(context.packageName)
                    ?: Intent(context, ProfileSelectionActivity::class.java)
                ).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
            val contentIntent = PendingIntent.getActivity(
                context,
                NOTIFICATION_UPDATE_INSTALLED,
                launchIntent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

            val notification = NotificationCompat.Builder(context, CHANNEL_UPDATES)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle(context.getString(R.string.notification_update_installed))
                .setContentText(context.getString(R.string.notification_update_installed_text, versionName))
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .setContentIntent(contentIntent)
                .build()

            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(NOTIFICATION_UPDATE_INSTALLED, notification)
        }

        /** Rimuove la notifica "aggiornamento installato" (l'app è di nuovo in primo piano). */
        fun cancelUpdateInstalledNotification(context: Context) {
            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.cancel(NOTIFICATION_UPDATE_INSTALLED)
        }
    }
    
    init {
        ensureChannels(context)
    }
    
    /**
     * Show notification for new content
     */
    fun showNewContentNotification(count: Int) {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        
        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        
        val notification = NotificationCompat.Builder(context, CHANNEL_NEW_CONTENT)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(context.getString(R.string.notification_new_content_title))
            .setContentText(context.getString(R.string.notification_new_content_text, count))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()
        
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(NOTIFICATION_NEW_CONTENT, notification)
    }
    
    /**
     * Show sync complete notification
     */
    fun showSyncCompleteNotification() {
        val notification = NotificationCompat.Builder(context, CHANNEL_GENERAL)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(context.getString(R.string.notification_sync_complete))
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setAutoCancel(true)
            .build()
        
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(NOTIFICATION_SYNC_COMPLETE, notification)
    }
    
    /**
     * Show download progress notification
     */
    fun showDownloadProgressNotification(title: String, progress: Int, max: Int = 100): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, CHANNEL_DOWNLOADS)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(context.getString(R.string.notification_downloading))
            .setContentText(title)
            .setProgress(max, progress, false)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOngoing(true)
    }
    
    /**
     * Update download progress
     */
    fun updateDownloadProgress(title: String, progress: Int) {
        val notification = showDownloadProgressNotification(title, progress).build()
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(NOTIFICATION_DOWNLOAD_PROGRESS, notification)
    }
    
    /**
     * Cancel download notification
     */
    fun cancelDownloadNotification() {
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.cancel(NOTIFICATION_DOWNLOAD_PROGRESS)
    }
}

