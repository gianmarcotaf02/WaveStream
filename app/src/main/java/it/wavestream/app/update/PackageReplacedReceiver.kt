package it.wavestream.app.update

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import it.wavestream.app.ui.profile.ProfileSelectionActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Riapre automaticamente WaveStream dopo un self-update.
 *
 * Quando l'app si aggiorna, Android **uccide il processo** per sostituire il pacchetto e
 * mostra la home del dispositivo. Alla fine dell'installazione il sistema invia
 * `ACTION_MY_PACKAGE_REPLACED`: qui riapriamo l'app, così l'utente non deve rilanciarla a
 * mano e la prima esecuzione della nuova versione (incluse eventuali migrazioni DB) parte
 * da sola.
 *
 * Un breve ritardo evita di lanciare l'Activity mentre il PackageManager sta ancora
 * finalizzando l'installazione (su Fire TV il primo avvio immediato può altrimenti fallire).
 */
class PackageReplacedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Intent.ACTION_MY_PACKAGE_REPLACED) return
        Log.i("PackageReplacedReceiver", "App aggiornata: riavvio automatico")

        val pendingResult = goAsync()
        CoroutineScope(Dispatchers.Main).launch {
            try {
                delay(1500)
                context.startActivity(
                    Intent(context, ProfileSelectionActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    }
                )
            } catch (e: Exception) {
                // Best-effort: se il sistema blocca l'avvio in background, l'utente riapre a mano.
                Log.w("PackageReplacedReceiver", "Impossibile riaprire l'app: ${e.message}")
            } finally {
                pendingResult.finish()
            }
        }
    }
}
