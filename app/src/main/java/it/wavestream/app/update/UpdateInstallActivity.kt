package it.wavestream.app.update

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageInstaller
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast

/**
 * Riceve l'esito della sessione [PackageInstaller] avviata da [AppUpdateManager.installUpdate].
 *
 * È un'**Activity** (non un BroadcastReceiver) di proposito: quando l'installazione richiede
 * la conferma dell'utente, il sistema restituisce `STATUS_PENDING_USER_ACTION` con un Intent
 * da lanciare. Lanciare un'Activity dal background è bloccato da Android 10+, quindi con un
 * receiver il popup dell'installer non compariva mai. Il sistema avvia questa Activity tramite
 * il PendingIntent, che è in grado di aprire la conferma in modo affidabile.
 *
 * Non mostra UI: è trasparente e termina subito dopo aver inoltrato la conferma.
 */
class UpdateInstallActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val status = intent.getIntExtra(
            PackageInstaller.EXTRA_STATUS,
            PackageInstaller.STATUS_FAILURE
        )
        val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE).orEmpty()

        when (status) {
            PackageInstaller.STATUS_PENDING_USER_ACTION -> {
                val confirmIntent: Intent? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    intent.getParcelableExtra(Intent.EXTRA_INTENT, Intent::class.java)
                } else {
                    @Suppress("DEPRECATION")
                    intent.getParcelableExtra(Intent.EXTRA_INTENT)
                }
                if (confirmIntent != null) {
                    confirmIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    try {
                        Log.d(TAG, "Apro la conferma di installazione del sistema")
                        startActivity(confirmIntent)
                    } catch (e: Exception) {
                        Log.e(TAG, "Impossibile mostrare la conferma di installazione", e)
                        Toast.makeText(
                            this,
                            "Conferma installazione non disponibile: ${e.message}",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                } else {
                    Toast.makeText(this, "Conferma installazione non disponibile", Toast.LENGTH_LONG).show()
                }
            }

            PackageInstaller.STATUS_SUCCESS -> {
                Log.i(TAG, "Aggiornamento installato con successo")
                Toast.makeText(this, "Aggiornamento installato", Toast.LENGTH_LONG).show()
            }

            else -> {
                Log.e(TAG, "Installazione fallita (status=$status): $message")
                Toast.makeText(
                    this,
                    "Installazione non riuscita ($status): $message",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        finish()
        overridePendingTransition(0, 0)
    }

    companion object {
        private const val TAG = "UpdateInstallActivity"
    }
}
