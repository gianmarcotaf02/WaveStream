package it.wavestream.app.data.repository

import android.content.Context
import android.util.Log
import androidx.annotation.OptIn
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.common.Tracks
import androidx.media3.common.VideoSize
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.datasource.okhttp.OkHttpDataSource
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.data.database.dao.StreamProviderDao
import it.wavestream.app.data.database.entity.StreamProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume

/**
 * Misura la qualità **REALE** di una sorgente senza riprodurla a schermo.
 *
 * Apre lo stream con un [ExoPlayer] *headless* (nessuna Surface, nessun audio),
 * legge la risoluzione video dai metadati (`Tracks`/`VideoSize`) e la salva in
 * [StreamProvider.detectedHeight]. È lo stesso campo che il player riempie in
 * `onVideoSizeChanged`, quindi il menu delle versioni può mostrare un badge
 * verificato **già alla prima apertura**, senza obbligare l'utente a riprodurre
 * ogni doppione.
 *
 * Linee guida:
 * - **Mai la categoria**: la misura viene dal flusso reale, non dal nome/categoria.
 * - **Economico**: scarica solo l'inizio dello stream (manifest + primo segmento),
 *   poi rilascia. Timeout breve e nessuna traccia riprodotta.
 * - **Seriale a monte**: il chiamante (dialog) invoca i probe uno alla volta, così
 *   non si satura il limite di connessioni simultanee del provider.
 * - **Best-effort**: se lo stream è geobloccato/scaduto/rifiuta la connessione,
 *   ritorna `null` e il badge ricade sulla qualità dichiarata dal nome.
 */
@Singleton
class StreamProbeRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val streamProviderDao: StreamProviderDao
) {

    companion object {
        private const val TAG = "StreamProbe"

        /** Oltre questa soglia il probe viene abortito: meglio nessun badge che un menu lento. */
        private const val PROBE_TIMEOUT_MS = 8_000L

        private const val USER_AGENT = "WaveStream/1.0"
    }

    private val httpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(6, TimeUnit.SECONDS)
            .readTimeout(8, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .connectionPool(ConnectionPool(4, 2, TimeUnit.MINUTES))
            .build()
    }

    /**
     * Ritorna l'altezza video reale (px) della sorgente, salvandola se misurata.
     *
     * @return l'altezza misurata, oppure `null` se già nota a DB o se il probe fallisce.
     */
    suspend fun probeHeight(provider: StreamProvider): Int? {
        // Già verificato in passato (misurato dal player o da un probe precedente).
        provider.detectedHeight?.takeIf { it > 0 }?.let { return it }
        if (provider.id <= 0 || provider.streamUrl.isBlank()) return null

        val height = probeStream(provider.streamUrl) ?: return null
        if (height > 0) {
            runCatching { streamProviderDao.updateDetectedHeight(provider.id, height) }
                .onFailure { Log.w(TAG, "Impossibile salvare detectedHeight per ${provider.id}: ${it.message}") }
        }
        return height.takeIf { it > 0 }
    }

    @OptIn(UnstableApi::class)
    private suspend fun probeStream(url: String): Int? = withTimeoutOrNull(PROBE_TIMEOUT_MS) {
        // ExoPlayer deve essere creato e usato su un thread con Looper: usiamo il main.
        withContext(Dispatchers.Main) {
            suspendCancellableCoroutine { cont ->
                val player = buildProbePlayer()
                var done = false

                fun finish(height: Int?) {
                    if (done) return
                    done = true
                    runCatching { player.release() }
                    if (cont.isActive) cont.resume(height)
                }

                // Risoluzione massima dichiarata dalle tracce video caricate.
                // Per HLS/DASH adattivi espone TUTTE le varianti (non solo quella scelta),
                // quindi è più affidabile del solo `VideoSize` (variante corrente).
                fun maxTrackHeight(): Int {
                    var max = 0
                    for (group in player.currentTracks.groups) {
                        if (group.type != C.TRACK_TYPE_VIDEO) continue
                        for (i in 0 until group.length) {
                            val h = group.getTrackFormat(i).height
                            if (h > max) max = h
                        }
                    }
                    return max
                }

                val listener = object : Player.Listener {
                    override fun onTracksChanged(tracks: Tracks) {
                        val h = maxTrackHeight()
                        if (h > 0) finish(h)
                    }

                    override fun onVideoSizeChanged(videoSize: VideoSize) {
                        // Fallback per stream "nudi" (es. TS senza manifest) in cui le tracce
                        // non riportano l'altezza: a quel punto ci si fida del decoder.
                        if (videoSize.height > 0 && maxTrackHeight() <= 0) {
                            finish(videoSize.height)
                        }
                    }

                    override fun onPlaybackStateChanged(playbackState: Int) {
                        if (playbackState == Player.STATE_READY) {
                            val h = maxTrackHeight()
                            if (h > 0) finish(h)
                        }
                    }

                    override fun onPlayerError(error: PlaybackException) {
                        Log.d(TAG, "Probe fallito su ${url.take(80)}: ${error.errorCodeName}")
                        finish(null)
                    }
                }

                cont.invokeOnCancellation {
                    if (!done) {
                        done = true
                        runCatching { player.release() }
                    }
                }

                player.addListener(listener)
                player.setMediaItem(MediaItem.fromUri(url))
                player.playWhenReady = false
                player.prepare()
            }
        }
    }

    @OptIn(UnstableApi::class)
    private fun buildProbePlayer(): ExoPlayer {
        val httpFactory = OkHttpDataSource.Factory(httpClient).setUserAgent(USER_AGENT)
        val dataSourceFactory = DefaultDataSource.Factory(context, httpFactory)
        val loadControl = DefaultLoadControl.Builder()
            .setBufferDurationsMs(1_500, 4_000, 500, 1_000)
            .setPrioritizeTimeOverSizeThresholds(true)
            .build()
        return ExoPlayer.Builder(context)
            .setMediaSourceFactory(DefaultMediaSourceFactory(dataSourceFactory))
            .setLoadControl(loadControl)
            .build()
    }
}
