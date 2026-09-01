package it.wavestream.app.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkManager
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

/**
 * Worker DISABILITATO: l'aggiornamento dell'EPG avviene rigorosamente e SOLO
 * nella LoadingActivity (con progresso visibile all'utente), qualunque sia la
 * frequenza impostata nelle preferenze (all'avvio, ogni 3h, 6h, ecc.).
 *
 * La classe resta solo per:
 * 1. annullare eventuali aggiornamenti periodici ancora schedulati da versioni
 *    precedenti dell'app (WorkManager persiste tra gli avvii);
 * 2. eseguire come no-op un eventuale lavoro residuo ancora in coda,
 *    così che nessun aggiornamento possa avvenire "in silenzio".
 */
@HiltWorker
class EpgUpdateWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters
) : CoroutineWorker(context, params) {

    companion object {
        private const val TAG = "EpgUpdateWorker"
        const val WORK_NAME = "epg_update_work"

        /**
         * Annulla l'eventuale aggiornamento EPG schedulato.
         */
        fun cancel(context: Context) {
            WorkManager.getInstance(context).cancelUniqueWork(WORK_NAME)
            Log.d(TAG, "Cancelled EPG update work")
        }
    }

    override suspend fun doWork(): Result {
        // Nessun aggiornamento in background: l'EPG si aggiorna solo nella LoadingActivity.
        Log.d(TAG, "EpgUpdateWorker disabilitato: l'EPG si aggiorna solo nella LoadingActivity")
        return Result.success()
    }
}
