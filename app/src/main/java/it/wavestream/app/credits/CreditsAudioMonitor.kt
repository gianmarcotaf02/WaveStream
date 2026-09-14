package it.wavestream.app.credits

import android.util.Log
import androidx.media3.common.C
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.audio.TeeAudioProcessor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.nio.ByteBuffer
import java.nio.ByteOrder
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.log10
import kotlin.math.sqrt

/**
 * Fase 2/4 — monitor audio always-on.
 *
 * Riceve il PCM decodificato da un [TeeAudioProcessor] (sink passivo, nessun calcolo sul
 * thread di playback) e su un worker separato calcola feature a basso costo:
 *
 * - **Credits (Fase 2)**: RMS dB, zero-crossing, spectral flux -> `candidate`, usato come
 *   corroborazione dal rilevatore video.
 * - **Sigle (Fase 4)**: una sequenza di vettori di bande spettrali normalizzate tenuta in
 *   una storia scorrevole (fino a ~15 min). Da qui si estrae il fingerprint di una sigla
 *   marcata dall'utente e lo si confronta, negli episodi successivi, per riconoscerla e
 *   mostrare "Salta sigla".
 *
 * Tutto è best-effort e non impatta mai la riproduzione.
 */
@Singleton
class CreditsAudioMonitor @Inject constructor() {

    companion object {
        private const val TAG = "CreditsDiag"
        private const val RING_SAMPLES = 48_000 * 4          // ~4s mono @48k
        private const val ANALYSIS_INTERVAL_MS = 250L
        private const val SILENCE_DB = -45f
        private const val ENERGY_DB = -32f
        private const val FFT_N = 256
        private const val CANDIDATE_HOLD_MS = 6_000L

        /** Bande spettrali per frame del fingerprint. */
        const val BANDS = 16

        /** Frame usati per riconoscere l'INIZIO della sigla (~2s). */
        const val PREFIX_FRAMES = 8

        private const val INTRO_MATCH_THRESHOLD = 0.90f
        private const val HISTORY_MAX_FRAMES = 4_000        // ~16 min a 250ms
    }

    private val ring = ShortRing(RING_SAMPLES)
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var worker: Job? = null

    @Volatile private var sampleRate = 48_000
    @Volatile private var channels = 2
    @Volatile private var encoding = C.ENCODING_PCM_16BIT

    /** True nella finestra finale dell'episodio: abilita le metriche credits. */
    @Volatile var windowActive: Boolean = false

    /** True all'inizio dell'episodio: abilita la storia per il fingerprint della sigla. */
    @Volatile var introActive: Boolean = false

    /** Interruttore utente: se false, il monitor non analizza nulla. */
    @Volatile var enabled: Boolean = true

    /** Posizione corrente del player, fornita dal PlayerActivity ad ogni tick (~1s). */
    @Volatile var playerPositionMs: Long = 0L

    @Volatile var lastRmsDb: Float = -120f; private set
    @Volatile var lastFlux: Float = 0f; private set
    @Volatile var speechLike: Boolean = false; private set
    @Volatile var candidate: Boolean = false; private set

    /** True quando la testa della sigla di riferimento è stata riconosciuta nell'audio corrente. */
    @Volatile var introMatch: Boolean = false; private set

    private var prevSpectrum: FloatArray? = null
    private var quietSinceMs = 0L
    private var lastCandidateMs = 0L

    private val historyLock = Any()
    private val history = ArrayDeque<Frame>()
    private var introReference: AudioFingerprint? = null

    private data class Frame(val timeMs: Long, val bands: FloatArray)

    private val isActive: Boolean get() = enabled && (windowActive || introActive)

    /** Sink passivo da agganciare al [TeeAudioProcessor]. */
    val sink: TeeAudioProcessor.AudioBufferSink = object : TeeAudioProcessor.AudioBufferSink {
        override fun flush(sampleRateHz: Int, channelCount: Int, pcmEncoding: Int) {
            sampleRate = sampleRateHz.coerceAtLeast(8_000)
            channels = channelCount.coerceAtLeast(1)
            encoding = pcmEncoding
            ring.reset()
            startWorker()
        }

        override fun handleBuffer(buffer: ByteBuffer) {
            ring.write(buffer, channels, encoding)
        }
    }

    fun reset() {
        ring.reset()
        prevSpectrum = null
        quietSinceMs = 0L
        lastCandidateMs = 0L
        candidate = false
        lastRmsDb = -120f
        lastFlux = 0f
        speechLike = false
        introMatch = false
        synchronized(historyLock) { history.clear() }
    }

    // ===================== Sigle (Fase 4) =====================

    fun setIntroReference(fingerprint: AudioFingerprint?) {
        introReference = fingerprint
        introMatch = false
        if (fingerprint != null) {
            Log.i(
                TAG,
                "introRef set bands=${fingerprint.bands} frames=${fingerprint.frames} durMs=${fingerprint.durationMs}"
            )
        }
    }

    fun referenceDurationMs(): Long = introReference?.durationMs ?: 0L

    /** Durata del prefisso usato per riconoscere l'inizio sigla. */
    fun prefixDurationMs(): Long = PREFIX_FRAMES * ANALYSIS_INTERVAL_MS

    /**
     * Estrae il fingerprint del segmento [startMs, endMs] dalla storia spettrale.
     * Null se non ci sono abbastanza frame (es. marker fuori dalla storia disponibile).
     */
    fun buildFingerprint(startMs: Long, endMs: Long): AudioFingerprint? {
        val frames: List<Frame>
        synchronized(historyLock) {
            frames = history.filter { it.timeMs in startMs..endMs }
        }
        if (frames.size < 4) return null
        val bands = frames.first().bands.size
        val data = FloatArray(frames.size * bands)
        frames.forEachIndexed { i, f -> f.bands.copyInto(data, i * bands) }
        return AudioFingerprint(bands, frames.size, ANALYSIS_INTERVAL_MS.toInt(), data)
    }

    private fun appendFrame(timeMs: Long, bands: FloatArray) {
        synchronized(historyLock) {
            history.addLast(Frame(timeMs, bands))
            while (history.size > HISTORY_MAX_FRAMES) history.removeFirst()
        }
    }

    /**
     * Confronta gli ultimi [PREFIX_FRAMES] frame con la testa del fingerprint di riferimento.
     * Similarità = media del prodotto scalare (entrambi i frame sono normalizzati).
     */
    private fun updateIntroMatch() {
        val ref = introReference
        if (ref == null || ref.bands != BANDS) {
            if (introMatch) introMatch = false
            return
        }
        val prefix = minOf(PREFIX_FRAMES, ref.frames)
        if (prefix <= 0) {
            introMatch = false
            return
        }
        synchronized(historyLock) {
            if (history.size < prefix) {
                introMatch = false
                return
            }
            var sim = 0f
            for (i in 0 until prefix) {
                val h = history[history.size - prefix + i].bands
                val refBase = i * ref.bands
                var dot = 0f
                for (b in 0 until BANDS) dot += h[b] * ref.data[refBase + b]
                sim += dot
            }
            sim /= prefix
            val matched = sim >= INTRO_MATCH_THRESHOLD
            if (matched && !introMatch) {
                Log.i(TAG, "introMatch sim=%.3f".format(sim))
            }
            introMatch = matched
        }
    }

    private fun startWorker() {
        if (worker?.isActive == true) return
        worker = scope.launch {
            while (isActive) {
                delay(ANALYSIS_INTERVAL_MS)
                if (!isActive) continue
                try {
                    analyzeOnce()
                } catch (_: Exception) {
                    // Best-effort: mai impattare la riproduzione.
                }
            }
        }
    }

    private fun analyzeOnce() {
        val frame = ring.readLatest(FFT_N * 4)
        if (frame.size < FFT_N) return

        var sum = 0.0
        for (s in frame) {
            val v = s / 32768f
            sum += v.toDouble() * v
        }
        val rms = sqrt(sum / frame.size)
        val rmsDb = if (rms > 1e-6) (20 * log10(rms)).toFloat() else -120f
        lastRmsDb = rmsDb

        val seg = FloatArray(FFT_N) { frame[frame.size - FFT_N + it] / 32768f }
        var zc = 0
        for (i in 1 until FFT_N) {
            if ((seg[i] >= 0f) != (seg[i - 1] >= 0f)) zc++
        }
        val zcr = zc.toFloat() / FFT_N

        val spectrum = magnitudeSpectrum(seg, FFT_N / 2)
        val prev = prevSpectrum
        var flux = 0f
        if (prev != null) {
            var d = 0f
            for (i in spectrum.indices) {
                val diff = spectrum[i] - prev[i]
                if (diff > 0f) d += diff
            }
            flux = d / spectrum.size
        }
        prevSpectrum = spectrum
        lastFlux = flux

        // Storia spettrale per il fingerprint della sigla.
        appendFrame(playerPositionMs, bandEnergies(spectrum, BANDS))
        updateIntroMatch()

        // Euristica "voce": energia presente, ZCR tipico del parlato, spettro poco variabile.
        speechLike = rmsDb > -48f && zcr in 0.02f..0.32f && flux < 0.035f

        val now = System.currentTimeMillis()
        if (rmsDb < SILENCE_DB) {
            if (quietSinceMs == 0L) quietSinceMs = now
        } else if (rmsDb > ENERGY_DB && !speechLike) {
            val quietDur = if (quietSinceMs > 0L) now - quietSinceMs else 0L
            if (quietDur in 300L..6_000L) {
                candidate = true
                lastCandidateMs = now
                Log.i(
                    TAG,
                    "audioCandidate quietMs=$quietDur rmsDb=%.1f flux=%.3f zcr=%.3f".format(rmsDb, flux, zcr)
                )
            }
            quietSinceMs = 0L
        }
        if (candidate && now - lastCandidateMs > CANDIDATE_HOLD_MS) candidate = false

        if (windowActive) {
            Log.d(
                TAG,
                "audioMetrics rmsDb=%.1f zcr=%.3f flux=%.4f speech=%s candidate=%s".format(
                    rmsDb, zcr, flux, speechLike, candidate
                )
            )
        }
    }

    /** Bande spettrali normalizzate (norma unitaria) da uno spettro di magnitudine. */
    private fun bandEnergies(spectrum: FloatArray, bands: Int): FloatArray {
        val out = FloatArray(bands)
        val n = spectrum.size
        for (b in 0 until bands) {
            val from = b * n / bands
            val to = ((b + 1) * n / bands).coerceAtMost(n)
            var s = 0f
            for (i in from until to) s += spectrum[i]
            out[b] = if (to > from) s / (to - from) else 0f
        }
        var norm = 0f
        for (v in out) norm += v * v
        norm = sqrt(norm)
        if (norm > 1e-6f) {
            for (i in out.indices) out[i] /= norm
        }
        return out
    }

    /** DFT magnitude sui primi `bins` bin (economica su finestre piccole). */
    private fun magnitudeSpectrum(samples: FloatArray, bins: Int): FloatArray {
        val out = FloatArray(bins)
        val n = samples.size
        for (k in 0 until bins) {
            var re = 0f
            var im = 0f
            val w = -2.0 * Math.PI * k / n
            for (i in 0 until n) {
                val a = w * i
                re += samples[i] * kotlin.math.cos(a).toFloat()
                im += samples[i] * kotlin.math.sin(a).toFloat()
            }
            out[k] = sqrt(re * re + im * im)
        }
        return out
    }

    /**
     * Ring buffer di campioni mono a 16 bit. La scrittura avviene sul thread di playback
     * e non alloca: legge dal ByteBuffer, fa il downmix e scrive.
     */
    private class ShortRing(private val capacity: Int) {
        private val buf = ShortArray(capacity)
        private var writePos = 0
        private var count = 0

        @Synchronized
        fun reset() {
            writePos = 0
            count = 0
        }

        @Synchronized
        fun write(buffer: ByteBuffer, channels: Int, encoding: Int) {
            val dup = buffer.duplicate().order(ByteOrder.nativeOrder())
            if (encoding == C.ENCODING_PCM_FLOAT) {
                val fb = dup.asFloatBuffer()
                val frames = fb.remaining() / channels
                for (f in 0 until frames) {
                    var acc = 0f
                    for (c in 0 until channels) acc += fb.get(f * channels + c)
                    val mono = (acc / channels).coerceIn(-1f, 1f)
                    buf[writePos] = (mono * 32767f).toInt().toShort()
                    writePos = (writePos + 1) % capacity
                    if (count < capacity) count++
                }
            } else {
                val sb = dup.asShortBuffer()
                val frames = sb.remaining() / channels
                for (f in 0 until frames) {
                    var acc = 0
                    for (c in 0 until channels) acc += sb.get(f * channels + c).toInt()
                    buf[writePos] = (acc / channels).toShort()
                    writePos = (writePos + 1) % capacity
                    if (count < capacity) count++
                }
            }
        }

        @Synchronized
        fun readLatest(max: Int): ShortArray {
            val n = minOf(max, count)
            val out = ShortArray(n)
            var idx = (writePos - n + capacity) % capacity
            for (i in 0 until n) {
                out[i] = buf[idx]
                idx = (idx + 1) % capacity
            }
            return out
        }
    }
}
