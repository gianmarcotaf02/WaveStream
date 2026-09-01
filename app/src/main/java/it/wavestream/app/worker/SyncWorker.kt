package it.wavestream.app.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.*
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

/**
 * Worker DISABILITATO: il refresh delle playlist avviene rigorosamente e SOLO
 * nella LoadingActivity (con progresso visibile all'utente), qualunque sia la
 * frequenza impostata nelle preferenze (all'avvio, ogni 3h, 6h, ecc.).
 *
 * La classe resta solo per:
 * 1. annullare eventuali sync periodici ancora schedulati da versioni
 *    precedenti dell'app (WorkManager persiste tra gli avvii);
 * 2. eseguire come no-op un eventuale lavoro residuo ancora in coda,
 *    così che nessun refresh possa avvenire "in silenzio".
 */
@HiltWorker
class SyncWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    companion object {
        private const val TAG = "SyncWorker"

        private const val WORK_NAME_PLAYLIST = "playlist_sync"

        /**
         * Annulla tutti i sync schedulati (playlist + EPG).
         * Chiamato all'avvio dell'app da [it.wavestream.app.WaveStreamApplication].
         */
        fun cancelAllSyncs(context: Context) {
            WorkManager.getInstance(context).cancelUniqueWork(WORK_NAME_PLAYLIST)
            EpgUpdateWorker.cancel(context)
            Log.d(TAG, "Cancelled all scheduled syncs")
        }
    }

    override suspend fun doWork(): Result {
        // Nessun sync in background: il refresh avviene solo nella LoadingActivity.
        Log.d(TAG, "SyncWorker disabilitato: il refresh avviene solo nella LoadingActivity")
        return Result.success()
    }
}
