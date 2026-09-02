package it.wavestream.app.voice

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Gestisce il modello Whisper on-device:
 * - download di ggml-base.bin (~150 MB) al primo utilizzo
 * - caricamento del contesto nativo
 * - trascrizione
 */
@Singleton
class WhisperManager @Inject constructor(
    @ApplicationContext private val context: Context
) {

    enum class ModelState {
        NOT_DOWNLOADED,   // il modello non è ancora sul device
        DOWNLOADING,      // download in corso
        LOADING,          // caricamento in memoria
        READY,            // pronto a trascrivere
        ERROR             // errore download/caricamento
    }

    companion object {
        // Modello base — buon compromesso accuratezza/velocità per l'italiano (~150 MB)
        private const val MODEL_URL = "https://huggingface.co/ggml-org/whisper.cpp/resolve/main/ggml-base.bin"
        private const val MODEL_FILE = "ggml-base.bin"
        private const val LANGUAGE = "it"
    }

    private val _state = MutableStateFlow(ModelState.NOT_DOWNLOADED)
    val state: StateFlow<ModelState> = _state

    private val _downloadProgress = MutableStateFlow(0)
    val downloadProgress: StateFlow<Int> = _downloadProgress // 0..100

    val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage

    private val modelFile: File
        get() = File(File(context.filesDir, "whisper"), MODEL_FILE)

    private var whisperContext: WhisperContext? = null
    private val downloadClient = OkHttpClient.Builder()
        .connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .readTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
        .build()

    init {
        _state.value = if (modelFile.exists() && modelFile.length() > 0)
            ModelState.NOT_DOWNLOADED // esiste ma non caricato
        else
            ModelState.NOT_DOWNLOADED
    }

    fun isModelDownloaded(): Boolean = modelFile.exists() && modelFile.length() > 10_000_000

    /**
     * Scarica il modello se assente. Sospensiva: chiamare da coroutine IO.
     */
    suspend fun downloadModelIfNeeded(): Boolean = withContext(Dispatchers.IO) {
        if (isModelDownloaded()) {
            _state.value = ModelState.NOT_DOWNLOADED
            return@withContext true
        }

        try {
            _state.value = ModelState.DOWNLOADING
            _downloadProgress.value = 0
            _errorMessage.value = null

            modelFile.parentFile?.mkdirs()
            val tempFile = File(modelFile.absolutePath + ".tmp")

            val request = Request.Builder().url(MODEL_URL).build()
            downloadClient.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    throw java.io.IOException("Download modello fallito: HTTP ${response.code}")
                }
                val body = response.body ?: throw java.io.IOException("Download modello: body vuoto")
                val total = body.contentLength()

                body.byteStream().use { input ->
                    tempFile.outputStream().use { output ->
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
            }

            if (tempFile.length() < 10_000_000) {
                tempFile.delete()
                throw java.io.IOException("Modello scaricato incompleto")
            }
            tempFile.renameTo(modelFile)
            _state.value = ModelState.NOT_DOWNLOADED
            true
        } catch (e: Exception) {
            _state.value = ModelState.ERROR
            _errorMessage.value = e.message ?: "Errore sconosciuto"
            false
        }
    }

    /**
     * Garantisce il contesto caricato (scarica + carica se necessario).
     */
    suspend fun ensureReady(): Boolean = withContext(Dispatchers.IO) {
        if (whisperContext != null) return@withContext true
        if (!downloadModelIfNeeded()) return@withContext false

        try {
            _state.value = ModelState.LOADING
            whisperContext = WhisperContext.create(modelFile.absolutePath)
            if (whisperContext != null) {
                _state.value = ModelState.READY
                true
            } else {
                _state.value = ModelState.ERROR
                _errorMessage.value = "Impossibile caricare il modello Whisper"
                false
            }
        } catch (e: Exception) {
            _state.value = ModelState.ERROR
            _errorMessage.value = e.message ?: "Errore caricamento modello"
            false
        }
    }

    /**
     * Trascrive audio PCM 16kHz mono. Chiama ensureReady() implicitamente.
     */
    suspend fun transcribe(audio: FloatArray): String? = withContext(Dispatchers.IO) {
        if (!ensureReady()) return@withContext null
        try {
            whisperContext?.transcribe(audio, LANGUAGE)
        } catch (e: Exception) {
            _errorMessage.value = e.message
            null
        }
    }

    suspend fun release() = withContext(Dispatchers.IO) {
        whisperContext?.release()
        whisperContext = null
        _state.value = if (isModelDownloaded()) ModelState.NOT_DOWNLOADED else ModelState.NOT_DOWNLOADED
    }
}
