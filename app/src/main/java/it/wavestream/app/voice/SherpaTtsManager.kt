package it.wavestream.app.voice

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import android.os.Handler
import android.os.Looper
import com.k2fsa.sherpa.onnx.OfflineTts
import com.k2fsa.sherpa.onnx.OfflineTtsConfig
import com.k2fsa.sherpa.onnx.OfflineTtsModelConfig
import com.k2fsa.sherpa.onnx.OfflineTtsVitsModelConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
import java.io.File
import java.io.FileInputStream
import java.net.URL
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.tanh

/**
 * Motore TTS neurale on-device di Nova: sherpa-onnx + Piper VITS
 * (voce `it_IT-riccardo-x_low`, ~28 MB, licenza MIT, motore Apache 2.0).
 *
 * Vantaggi sul TTS di sistema:
 * - voce naturale (VITS neurale) invece di quella robotica
 * - output PCM gestito da noi → GAIN software libero (anche oltre il 100%)
 * - sintesi in ~300-600ms per frasi brevi su TV low-end
 *
 * Il modello (~26 MB compressi) viene scaricato al primo utilizzo ed estratto
 * nella memoria interna dell'app.
 */
@Singleton
class SherpaTtsManager @Inject constructor(
    @ApplicationContext private val context: Context
) {

    enum class State {
        NOT_DOWNLOADED,
        DOWNLOADING,
        EXTRACTING,
        LOADING,
        READY,
        ERROR
    }

    companion object {
        private const val MODEL_URL = "https://github.com/k2-fsa/sherpa-onnx/releases/download/tts-models/vits-piper-it_IT-riccardo-x_low.tar.bz2"
        private const val MODEL_DIR = "vits-piper-it_IT-riccardo-x_low"
        private const val MODEL_ONNX = "it_IT-riccardo-x_low.onnx"
    }

    private val _state = MutableStateFlow(State.NOT_DOWNLOADED)
    val state: StateFlow<State> = _state

    private val _downloadProgress = MutableStateFlow(0)
    val downloadProgress: StateFlow<Int> = _downloadProgress // 0..100

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val mainHandler = Handler(Looper.getMainLooper())

    private val baseDir: File get() = File(context.filesDir, "sherpa-tts")
    private val modelDir: File get() = File(baseDir, MODEL_DIR)
    private val onnxFile: File get() = File(modelDir, MODEL_ONNX)
    private val tokensFile: File get() = File(modelDir, "tokens.txt")
    private val espeakDir: File get() = File(modelDir, "espeak-ng-data")

    @Volatile
    private var tts: OfflineTts? = null

    @Volatile
    private var audioTrack: AudioTrack? = null

    fun isModelDownloaded(): Boolean = onnxFile.exists() && tokensFile.exists()

    fun isReady(): Boolean = tts != null

    fun sampleRate(): Int = tts?.sampleRate() ?: 22050

    /**
     * Scarica (se serve), estrae e carica il modello. Idempotente.
     */
    suspend fun ensureReady(): Boolean = withContext(Dispatchers.IO) {
        if (tts != null) return@withContext true
        try {
            if (!isModelDownloaded()) {
                if (!downloadModel()) return@withContext false
            }
            if (tts == null) {
                _state.value = State.LOADING
                val config = OfflineTtsConfig(
                    model = OfflineTtsModelConfig(
                        vits = OfflineTtsVitsModelConfig(
                            model = onnxFile.absolutePath,
                            tokens = tokensFile.absolutePath,
                            dataDir = espeakDir.absolutePath,
                            noiseScale = 0.667f,
                            noiseScaleW = 0.8f,
                            lengthScale = 1.0f
                        ),
                        numThreads = 2, // ottimale per quad-core TV low-end
                        debug = false,
                        provider = "cpu"
                    )
                )
                tts = OfflineTts(assetManager = null, config = config)
            }
            _state.value = State.READY
            true
        } catch (t: Throwable) {
            android.util.Log.e("NovaVoice", "ensureReady fallito", t)
            _errorMessage.value = t.message ?: t.javaClass.simpleName
            _state.value = State.ERROR
            false
        }
    }

    /**
     * Sintetizza il testo e riproduce l'audio con [gain] software (>1 = amplificato).
     * [onDone] è invocato sul main thread a fine riproduzione (o in caso di errore).
     */
    fun synthesizeAndPlay(text: String, speed: Float, gain: Float, onDone: () -> Unit) {
        val engine = tts ?: run { onDone(); return }
        scope.launch {
            try {
                val audio = engine.generate(text = text, sid = 0, speed = speed)
                if (audio.samples.isEmpty()) {
                    mainHandler.post(onDone)
                    return@launch
                }
                playWithGain(audio.samples, audio.sampleRate, gain, onDone)
            } catch (t: Throwable) {
                mainHandler.post(onDone)
            }
        }
    }

    /** Interrompe la riproduzione in corso */
    fun stopPlayback() {
        try {
            audioTrack?.pause()
            audioTrack?.flush()
            audioTrack?.stop()
            audioTrack?.release()
        } catch (_: Exception) {
        }
        audioTrack = null
    }

    /**
     * Amplificazione software: tanh soft-clip → alza il volume senza
     * distorsione dura dei clamp lineari.
     */
    private fun playWithGain(samples: FloatArray, sampleRate: Int, gain: Float, onDone: () -> Unit) {
        stopPlayback()

        val pcm = ShortArray(samples.size) { i ->
            (tanh(samples[i] * gain) * 32767f).toInt().toShort()
        }

        val minBuffer = AudioTrack.getMinBufferSize(
            sampleRate, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT
        )
        val track = AudioTrack.Builder()
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                    .build()
            )
            .setAudioFormat(
                AudioFormat.Builder()
                    .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                    .setSampleRate(sampleRate)
                    .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                    .build()
            )
            .setBufferSizeInBytes(maxOf(minBuffer, pcm.size * 2))
            .setTransferMode(AudioTrack.MODE_STREAM)
            .build()

        audioTrack = track

        // notifica a fine riproduzione (marker sull'ultimo frame)
        track.positionNotificationPeriod = 0
        track.setNotificationMarkerPosition(pcm.size)
        track.setPlaybackPositionUpdateListener(
            object : AudioTrack.OnPlaybackPositionUpdateListener {
                override fun onMarkerReached(track: AudioTrack?) {
                    stopPlayback()
                    mainHandler.post {
                        onDone()
                    }
                }

                override fun onPeriodicNotification(track: AudioTrack?) = Unit
            },
            mainHandler
        )

        track.play()
        track.write(pcm, 0, pcm.size)
    }

    // ---------- Download & estrazione ----------

    private suspend fun downloadModel(): Boolean = withContext(Dispatchers.IO) {
        _state.value = State.DOWNLOADING
        _downloadProgress.value = 0
        try {
            baseDir.mkdirs()
            val tarFile = File(baseDir, "model.tar.bz2")

            val connection = URL(MODEL_URL).openConnection()
            connection.connect()
            val total = connection.contentLengthLong

            connection.getInputStream().use { input ->
                tarFile.outputStream().use { output ->
                    val buffer = ByteArray(256 * 1024)
                    var read: Int
                    var written = 0L
                    while (input.read(buffer).also { read = it } != -1) {
                        output.write(buffer, 0, read)
                        written += read
                        if (total > 0) {
                            _downloadProgress.value = ((written * 100) / total).toInt()
                        }
                    }
                }
            }

            _state.value = State.EXTRACTING
            extractTarBz2(tarFile, baseDir)
            tarFile.delete()

            isModelDownloaded().also { downloaded ->
                if (!downloaded) {
                    _state.value = State.ERROR
                    _errorMessage.value = "Il file scaricato è incompleto o corrotto"
                }
            }
        } catch (t: Throwable) {
            android.util.Log.e("NovaVoice", "Download modello fallito", t)
            _state.value = State.ERROR
            _errorMessage.value = when (t) {
                is java.net.UnknownHostException -> "DNS non raggiungibile (github.com) — controlla la rete del device"
                is java.net.SocketTimeoutException -> "Timeout di rete durante il download"
                is java.io.IOException -> "Errore di rete: ${t.message}"
                else -> t.message ?: t.javaClass.simpleName
            }
            false
        }
    }

    private fun extractTarBz2(tarFile: File, destDir: File) {
        TarArchiveInputStream(BZip2CompressorInputStream(FileInputStream(tarFile))).use { tar ->
            var entry = tar.nextTarEntry
            while (entry != null) {
                val outFile = File(destDir, entry.name)
                // protezione path traversal
                if (!outFile.canonicalPath.startsWith(destDir.canonicalPath)) {
                    throw SecurityException("Entry non valida nel tarball: ${entry.name}")
                }
                if (entry.isDirectory) {
                    outFile.mkdirs()
                } else {
                    outFile.parentFile?.mkdirs()
                    outFile.outputStream().use { tar.copyTo(it) }
                }
                entry = tar.nextTarEntry
            }
        }
    }
}
