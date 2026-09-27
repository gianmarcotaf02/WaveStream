package it.wavestream.app.update

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import it.wavestream.app.BuildConfig
import it.wavestream.app.service.NotificationHelper
import it.wavestream.app.ui.profile.ProfileSelectionActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Notifica e (dove possibile) riapertura di WaveStream dopo un self-update.
 *
 * Quando l'app si aggiorna, Android **uccide il processo** per sostituire il pacchetto,
 * mostra la home della TV e invia `ACTION_MY_PACKAGE_REPLACED`. Da Android 10 in poi
 * il sistema applica le restrizioni **BAL** (Background Activity Launch): un'app in
 * background NON può avviare Activity. `startActivity()` in quel caso non lancia
 * eccezioni, viene semplicemente ignorato (log del sistema: "Background activity
 * launch blocked! goo.gle/android-bal"). Nei log reali di un self-update su Android TV:
 *
 * ```
 * E/ActivityTaskManager: Background activity launch blocked! [... cmp=it.wavestream.app/.ui.profile.ProfileSelectionActivity ...]
 * I/ActivityTaskManager: START ... (BAL_BLOCK) result code=102
 * ```
 *
 * Quindi la riapertura automatica funziona solo su dispositivi vecchi/permissivi
 * (es. Fire OS 7 / Android 9): sui TV Android 10+ resta alla Home e sembra che l'app
 * sia "crashata". Per questo:
 *
 * 1. si pubblica **sempre** una notifica "Aggiornamento installato" (il tap su una
 *    notifica è un'interazione utente ed è sempre permesso) → feedback + via di rientro;
 * 2. si tenta comunque la riapertura diretta, che su alcuni dispositivi riesce;
 * 3. si lascia un flag che [ProfileSelectionActivity] consuma al primo rientro, così
 *    l'utente vede comunque la conferma anche se ignora la notifica.
 */
class PackageReplacedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Intent.ACTION_MY_PACKAGE_REPLACED) return
        Log.i(TAG, "App aggiornata a ${BuildConfig.VERSION_NAME}: notifica l'utente e provo la riapertura")

        markPendingUpdateNotice(context)

        runCatching {
            NotificationHelper.postUpdateInstalledNotification(context, BuildConfig.VERSION_NAME)
        }.onFailure {
            Log.w(TAG, "Notifica di aggiornamento non pubblicata: ${it.message}")
        }

        val pendingResult = goAsync()
        CoroutineScope(Dispatchers.Main).launch {
            try {
                // Sulle TV lente il PackageManager può impiegare qualche secondo a
                // finalizzare l'installazione: si ritenta invece di provarci una volta sola.
                val launch = launchIntent(context)
                for (attempt in 1..3) {
                    delay(if (attempt == 1) 2000L else 2500L)
                    try {
                        context.startActivity(launch)
                        // NB: da Android 10 startActivity() NON lancia eccezioni quando il
                        // sistema blocca l'avvio in background, quindi non possiamo sapere
                        // qui se l'app è davvero tornata in primo piano. Sui dispositivi
                        // dove funziona ProfileSelectionActivity cancella la notifica;
                        // altrimenti la notifica resta e l'utente la tocca.
                        Log.i(TAG, "Riapertura richiesta (tentativo $attempt); se il sistema la blocca resta la notifica")
                        return@launch
                    } catch (e: Exception) {
                        Log.w(TAG, "Tentativo $attempt di riapertura fallito: ${e.message}")
                    }
                }
            } finally {
                pendingResult.finish()
            }
        }
    }

    /**
     * L'app è una TV app: `getLaunchIntentForPackage` cerca CATEGORY_LAUNCHER e
     * nell'app è dichiarata solo LEANBACK_LAUNCHER, quindi spesso torna null. Il
     * fallback esplicito verso [ProfileSelectionActivity] è il percorso normale.
     */
    private fun launchIntent(context: Context): Intent {
        val launch = context.packageManager
            .getLaunchIntentForPackage(context.packageName)
            ?: Intent(context, ProfileSelectionActivity::class.java)
        launch.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        return launch
    }

    /**
     * Segna che al primo ingresso nell'app va mostrata la conferma di aggiornamento.
     * `commit()` (non `apply()`) perché il processo di questo receiver può essere
     * ucciso subito dopo: il flag deve essere su disco prima che finisca onReceive.
     */
    private fun markPendingUpdateNotice(context: Context) {
        runCatching {
            context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                .edit()
                .putString(KEY_PENDING_VERSION, BuildConfig.VERSION_NAME)
                .commit()
        }
    }

    companion object {
        private const val TAG = "PackageReplacedReceiver"

        /** SharedPreferences lette anche da ProfileSelectionActivity al rientro nell'app. */
        const val PREFS = "wavestream_update_notice"
        const val KEY_PENDING_VERSION = "pending_version"
    }
}
