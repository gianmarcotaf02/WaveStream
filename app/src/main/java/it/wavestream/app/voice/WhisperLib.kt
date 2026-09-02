package it.wavestream.app.voice

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

/**
 * JNI bridge verso whisper.cpp (libreria nativa "whisper_jni" compilata via CMake).
 */
object WhisperLib {

    init {
        System.loadLibrary("whisper_jni")
    }

    external fun initContext(modelPath: String): Long
    external fun freeContext(contextPtr: Long)
    external fun fullTranscribe(contextPtr: Long, numThreads: Int, audioData: FloatArray, language: String)
    external fun getTextSegmentCount(contextPtr: Long): Int
    external fun getTextSegment(contextPtr: Long, index: Int): String
    external fun systemInfo(): String
}

/**
 * Wrapper sicuro di un contesto whisper.
 * vincolo whisper.cpp: non accedere da più thread contemporaneamente → dispatcher single-thread.
 */
class WhisperContext private constructor(private var ptr: Long) {

    private val scope = CoroutineScope(Executors.newSingleThreadExecutor().asCoroutineDispatcher())

    private val numThreads: Int
        get() = (Runtime.getRuntime().availableProcessors() - 2).coerceIn(2, 6)

    /**
     * Trascrive audio PCM 16kHz mono (valori normalizzati -1..1).
     */
    suspend fun transcribe(audioData: FloatArray, language: String = "it"): String =
        withContext(scope.coroutineContext) {
            require(ptr != 0L) { "WhisperContext già rilasciato" }
            WhisperLib.fullTranscribe(ptr, numThreads, audioData, language)
            buildString {
                for (i in 0 until WhisperLib.getTextSegmentCount(ptr)) {
                    append(WhisperLib.getTextSegment(ptr, i))
                }
            }.trim()
        }

    suspend fun release() = withContext(scope.coroutineContext) {
        if (ptr != 0L) {
            WhisperLib.freeContext(ptr)
            ptr = 0L
        }
    }

    protected fun finalize() {
        if (ptr != 0L) {
            WhisperLib.freeContext(ptr)
            ptr = 0L
        }
    }

    companion object {
        private const val TAG = "WhisperContext"

        fun create(modelPath: String): WhisperContext? {
            val ptr = WhisperLib.initContext(modelPath)
            if (ptr == 0L) {
                Log.e(TAG, "Impossibile inizializzare il modello: $modelPath")
                return null
            }
            return WhisperContext(ptr)
        }
    }
}
