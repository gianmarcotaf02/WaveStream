package it.wavestream.app.voice

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.media.AudioFormat
import android.media.AudioRecord
import android.media.MediaRecorder
import androidx.core.content.ContextCompat
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.concurrent.thread

/**
 * Cattura audio dal microfono: PCM 16kHz mono.
 * Espone l'ampiezza in tempo reale (per l'orb) e il buffer PCM alla stop.
 */
@Singleton
class AudioRecorder @Inject constructor(
    @ApplicationContext private val context: Context
) {

    companion object {
        const val SAMPLE_RATE = 16000
        private const val MAX_DURATION_MS = 12_000L
        private const val SILENCE_THRESHOLD = 0.03f
        private const val SILENCE_DURATION_MS = 1_400L
    }

    @Volatile
    private var isRecording = false

    private var audioRecord: AudioRecord? = null
    private var recordingThread: Thread? = null

    // Buffer accumulato (short PCM)
    private val samples = mutableListOf<Short>()

    /** Ampiezza normalizzata 0..1 in tempo reale (per l'orb e il rilevamento silenzio) */
    private val _amplitude = MutableStateFlow(0f)
    val amplitude: StateFlow<Float> = _amplitude

    /** true quando l'utente ha effettivamente cominciato a parlare */
    @Volatile
    var speechDetected: Boolean = false
        private set

    /** Chiamato quando la registrazione termina da sola (silenzio o timeout) */
    @Volatile
    var onAutoStop: (() -> Unit)? = null

    /** Ultimo errore di inizializzazione (per messaggi precisi in UI) */
    @Volatile
    var lastError: String? = null
        private set

    /**
     * Avvia la registrazione. Ritorna false se il microfono non è disponibile.
     */
    @SuppressLint("MissingPermission") // il permesso viene richiesto nell'Activity
    fun start(): Boolean {
        if (isRecording) return true
        lastError = null

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO)
            != PackageManager.PERMISSION_GRANTED
        ) {
            lastError = "Permesso microfono non concesso"
            return false
        }

        val minBuffer = AudioRecord.getMinBufferSize(
            SAMPLE_RATE, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT
        )
        if (minBuffer <= 0) {
            lastError = "Registrazione audio non supportata dal device"
            return false
        }

        audioRecord = AudioRecord(
            MediaRecorder.AudioSource.MIC,
            SAMPLE_RATE,
            AudioFormat.CHANNEL_IN_MONO,
            AudioFormat.ENCODING_PCM_16BIT,
            minBuffer * 2
        )

        if (audioRecord?.state != AudioRecord.STATE_INITIALIZED) {
            audioRecord?.release()
            audioRecord = null
            lastError = "Microfono non inizializzabile (assente, disattivato o occupato da un'altra app)"
            return false
        }

        samples.clear()
        speechDetected = false
        _amplitude.value = 0f
        isRecording = true
        audioRecord?.startRecording()

        recordingThread = thread(name = "WaveStreamAudioRecorder") {
            val chunk = ShortArray(1024)
            var lastSoundAt = System.currentTimeMillis()
            val startedAt = lastSoundAt

            while (isRecording) {
                val read = audioRecord?.read(chunk, 0, chunk.size) ?: -1
                if (read <= 0) continue

                synchronized(samples) { samples.addAll(chunk.toList().take(read)) }

                // ampiezza RMS normalizzata
                var sum = 0.0
                for (i in 0 until read) {
                    val v = chunk[i] / 32768f
                    sum += v * v
                }
                val rms = kotlin.math.sqrt(sum / read).toFloat().coerceIn(0f, 1f)
                _amplitude.value = rms

                val now = System.currentTimeMillis()
                if (rms > SILENCE_THRESHOLD) {
                    speechDetected = true
                    lastSoundAt = now
                }

                // Auto-stop: silenzio dopo speech, o timeout massimo
                val silenceElapsed = now - lastSoundAt
                val totalElapsed = now - startedAt
                if ((speechDetected && silenceElapsed > SILENCE_DURATION_MS) ||
                    totalElapsed > MAX_DURATION_MS
                ) {
                    isRecording = false
                    onAutoStop?.invoke()
                }
            }
        }
        return true
    }

    /**
     * Ferma la registrazione e ritorna il buffer PCM normalizzato (-1..1).
     * Ritorna null se non c'è audio utile.
     */
    fun stop(): FloatArray? {
        if (!isRecording && audioRecord == null) return null
        isRecording = false

        try {
            recordingThread?.join(1500)
        } catch (_: InterruptedException) {
        }
        recordingThread = null

        try {
            audioRecord?.stop()
        } catch (_: IllegalStateException) {
        }
        audioRecord?.release()
        audioRecord = null

        _amplitude.value = 0f

        val buffer: FloatArray
        synchronized(samples) {
            buffer = FloatArray(samples.size) { samples[it] / 32768f }
            samples.clear()
        }

        // Serve almeno ~0.5s di audio per una trascrizione sensata
        return if (buffer.size > SAMPLE_RATE / 2) buffer else null
    }
}
