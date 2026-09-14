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
 * Fase 2 — monitor audio always-on.
 *
 * Riceve il PCM decodificato da un [TeeAudioProcessor] (sink passivo, nessun calcolo
 * sul thread di playback) e calcola, su un worker separato, alcune feature a basso costo:
 * RMS in dB, zero-crossing rate, spectral flux. Da queste ricava un segnale "candidate"
 * per la transizione di fine scena (silenzio/parlato che cala -> energia musicale).
 *
 * Il monitor NON decide il trigger da solo: espone `candidate`, usato come corroborazione
 * dal rilevatore video (rilassa la persistenza richiesta). Le soglie sono provvisorie e
 * vanno calibrate sui log `CreditsDiag` (`audioMetrics`).
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
    }

    private val ring = ShortRing(RING_SAMPLES)
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var worker: Job? = null

    @Volatile private var sampleRate = 48_000
    @Volatile private var channels = 2
    @Volatile private var encoding = C.ENCODING_PCM_16BIT

    /** True solo nella finestra finale dell'episodio: fuori finestra il worker non fa nulla. */
    @Volatile var windowActive: Boolean = false

    @Volatile var lastRmsDb: Float = -120f; private set
    @Volatile var lastFlux: Float = 0f; private set
    @Volatile var speechLike: Boolean = false; private set
    @Volatile var candidate: Boolean = false; private set

    private var prevSpectrum: FloatArray? = null
    private var quietSinceMs = 0L
    private var lastCandidateMs = 0L

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
    }

    private fun startWorker() {
        if (worker?.isActive == true) return
        worker = scope.launch {
            while (isActive) {
                delay(ANALYSIS_INTERVAL_MS)
                if (!windowActive) {
                    reset()
                    continue
                }
                try {
                    analyzeOnce()
                } catch (_: Exception) {
                    // Il monitor è best-effort: non deve mai impattare la riproduzione.
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

        Log.d(
            TAG,
            "audioMetrics rmsDb=%.1f zcr=%.3f flux=%.4f speech=%s candidate=%s".format(
                rmsDb, zcr, flux, speechLike, candidate
            )
        )
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
     * Ring buffer lock-free-ish di campioni mono a 16 bit. La scrittura avviene sul thread
     * di playback e non alloca: legge dal ByteBuffer, fa il downmix e scrive.
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
            val frames: Int
            if (encoding == C.ENCODING_PCM_FLOAT) {
                val fb = dup.asFloatBuffer()
                frames = fb.remaining() / channels
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
                frames = sb.remaining() / channels
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
