package it.wavestream.app.update

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.os.Build
import android.util.Log
import android.widget.Toast

/**
 * Riceve l'esito della sessione [PackageInstaller] avviata da [AppUpdateManager.installUpdate].
 *
 * È registrato nel manifest (non dinamico) così riceve il risultato anche se il processo
 * dell'app viene terminato durante l'installazione. Serve soprattutto a mostrare il codice
 * di errore reale: su Fire OS l'installer di sistema mostra solo il generico
 * "App non installata", mentre qui possiamo leggere [PackageInstaller.EXTRA_STATUS_MESSAGE]
 * (es. INSTALL_FAILED_INSUFFICIENT_STORAGE, INSTALL_FAILED_UPDATE_INCOMPATIBLE, ...).
 */
class UpdateInstallReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "UpdateInstallReceiver"
        const val ACTION_INSTALL_RESULT = "it.wavestream.app.action.INSTALL_RESULT"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != ACTION_INSTALL_RESULT) return

        val status = intent.getIntExtra(
            PackageInstaller.EXTRA_STATUS,
            PackageInstaller.STATUS_FAILURE
        )
        val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE).orEmpty()

        when (status) {
            PackageInstaller.STATUS_SUCCESS -> {
                Log.i(TAG, "Aggiornamento installato con successo")
                Toast.makeText(context, "Aggiornamento installato", Toast.LENGTH_LONG).show()
            }

            // Alcuni dispositivi (Fire OS incluso) non mostrano da soli la schermata di
            // conferma: la restituiscono qui e va lanciata manualmente.
            PackageInstaller.STATUS_PENDING_USER_ACTION -> {
                Log.d(TAG, "Installazione in attesa di conferma utente")
                val confirmIntent: Intent? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    intent.getParcelableExtra(Intent.EXTRA_INTENT, Intent::class.java)
                } else {
                    @Suppress("DEPRECATION")
                    intent.getParcelableExtra(Intent.EXTRA_INTENT)
                }
                confirmIntent?.let {
                    it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    try {
                        context.startActivity(it)
                    } catch (e: Exception) {
                        Log.e(TAG, "Impossibile mostrare la conferma di installazione", e)
                        Toast.makeText(
                            context,
                            "Conferma installazione non disponibile: ${e.message}",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }

            else -> {
                Log.e(TAG, "Installazione fallita (status=$status): $message")
                Toast.makeText(
                    context,
                    "Installazione non riuscita ($status): $message",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
