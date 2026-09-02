package it.wavestream.app.voice

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.speech.tts.Voice
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.data.preferences.UserPreferences
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Gestisce la voce dell'assistente (Text-to-Speech di sistema, gratuito e offline).
 * Rispetta le impostazioni utente: voce, lingua, velocità, tono.
 */
@Singleton
class TtsManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val userPreferences: UserPreferences
) {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    private val _isReady = MutableStateFlow(false)
    val isReady: StateFlow<Boolean> = _isReady

    private val _isSpeaking = MutableStateFlow(false)
    val isSpeaking: StateFlow<Boolean> = _isSpeaking

    private val _availableVoices = MutableStateFlow<List<Voice>>(emptyList())
    val availableVoices: StateFlow<List<Voice>> = _availableVoices

    private var tts: TextToSpeech? = null
    private var onDoneCallback: (() -> Unit)? = null

    // Impostazioni correnti (aggiornate dalle preferenze)
    private var speechRate: Float = 1.0f
    private var pitch: Float = 1.0f
    private var voiceName: String? = null
    private var languageTag: String = "it-IT"

    private val initListener = TextToSpeech.InitListener { status ->
        if (status == TextToSpeech.SUCCESS) {
            val engine = tts ?: return@InitListener
            try {
                engine.language = Locale.ITALY
                val voices = engine.voices?.filter {
                    it.locale.language == Locale.ITALIAN.language || it.name.contains("it", ignoreCase = true)
                }.orEmpty()
                _availableVoices.value = voices
            } catch (_: Exception) {
            }
            _isReady.value = true
            applySettings()
        } else {
            _isReady.value = false
        }
    }

    init {
        // Inizializza il motore TTS al primo avvio (lazy: non blocca l'app)
        tts = TextToSpeech(context, initListener)

        // Rileggi le impostazioni utente
        scope.launch {
            userPreferences.getAssistantTtsRateFlow().collect { speechRate = it; applySettings() }
        }
        scope.launch {
            userPreferences.getAssistantTtsPitchFlow().collect { pitch = it; applySettings() }
        }
        scope.launch {
            userPreferences.getAssistantTtsVoiceFlow().collect { voiceName = it; applySettings() }
        }
        scope.launch {
            userPreferences.getAssistantTtsLanguageFlow().collect {
                languageTag = it
                try {
                    tts?.language = Locale.forLanguageTag(it)
                } catch (_: Exception) {
                }
            }
        }
    }

    private fun applySettings() {
        val engine = tts ?: return
        try {
            engine.setSpeechRate(speechRate)
            engine.setPitch(pitch)
            voiceName?.let { name ->
                _availableVoices.value.find { it.name == name }?.let { engine.voice = it }
            }
        } catch (_: Exception) {
        }
    }

    /**
     * Pronuncia un testo. [onDone] opzionale chiamato a fine pronuncia.
     */
    fun speak(text: String, onDone: (() -> Unit)? = null) {
        val engine = tts ?: run { onDone?.invoke(); return }
        if (!_isReady.value) { onDone?.invoke(); return }

        onDoneCallback = onDone
        _isSpeaking.value = true
        val utteranceId = "wavestream_assistant_${System.currentTimeMillis()}"
        engine.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
    }

    fun stop() {
        try {
            tts?.stop()
        } catch (_: Exception) {
        }
        _isSpeaking.value = false
        onDoneCallback = null
    }

    /** Anteprima live della velocità (dalla sezione impostazioni, senza salvare) */
    fun previewRate(rate: Float) {
        speechRate = rate.coerceIn(0.5f, 2f)
        applySettings()
    }

    /** Anteprima live del tono (dalla sezione impostazioni, senza salvare) */
    fun previewPitch(value: Float) {
        pitch = value.coerceIn(0.5f, 2f)
        applySettings()
    }

    init {
        // notifica fine pronuncia
        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                _isSpeaking.value = true
            }

            override fun onDone(utteranceId: String?) {
                _isSpeaking.value = false
                onDoneCallback?.invoke()
                onDoneCallback = null
            }

            @Deprecated("Deprecated in Java")
            override fun onError(utteranceId: String?) {
                _isSpeaking.value = false
                onDoneCallback?.invoke()
                onDoneCallback = null
            }
        })
    }
}
