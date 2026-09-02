package it.wavestream.app.voice

import android.content.Context
import android.media.AudioManager
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
import kotlinx.coroutines.withContext
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Gestisce la voce dell'assistente.
 *
 * Motore primario: TTS neurale on-device (sherpa-onnx + Piper, voce italiana naturale)
 * con GAIN software — risolve sia la roboticità sia il volume basso.
 * Fallback: TextToSpeech di sistema se il modello neurale non è ancora scaricato.
 */
@Singleton
class TtsManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val userPreferences: UserPreferences,
    private val sherpaTts: SherpaTtsManager
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
    private var voiceVolume: Float = 2.5f // gain software (1.0 = volume naturale)
    private var autoVolumeBoost: Boolean = true // massimizza volume device durante la risposta
    private var savedVolumeIndex: Int? = null // per ripristino post-risposta
    private var voiceName: String? = null
    private var languageTag: String = "it-IT"

    private val initListener = TextToSpeech.OnInitListener { status ->
        if (status == TextToSpeech.SUCCESS) {
            val engine = tts ?: return@OnInitListener
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
        scope.launch {
            userPreferences.getAssistantTtsVolumeFlow().collect { voiceVolume = it }
        }
        scope.launch {
            userPreferences.getAssistantAutoVolumeBoostFlow().collect { autoVolumeBoost = it }
        }

        // Pre-carica il modello Piper in background (download ~26MB solo al primo avvio)
        preload()
    }

    /**
     * Pre-carica il motore neurale (download+init) in background, senza bloccare nulla.
     */
    fun preload() {
        scope.launch { sherpaTts.ensureReady() }
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
     *
     * Motore primario: Piper neurale (voce naturale + gain software).
     * Fallback: TTS di sistema (mentre il modello è in download o se non disponibile).
     */
    fun speak(text: String, onDone: (() -> Unit)? = null) {
        stop()
        onDoneCallback = onDone
        _isSpeaking.value = true
        boostMediaVolume()

        scope.launch {
            // Piper se il modello è già scaricato e carica correttamente
            if (sherpaTts.isModelDownloaded() && sherpaTts.ensureReady()) {
                sherpaTts.synthesizeAndPlay(
                    text = text,
                    speed = speechRate,
                    gain = voiceVolume
                ) {
                    finishSpeaking()
                }
            } else {
                // modello assente: avvia il download in background e usa il sistema ora
                android.util.Log.w("NovaVoice", "Piper non pronto → uso TTS di sistema (fallback robotico). Download in background...")
                if (!sherpaTts.isModelDownloaded()) preload()
                speakWithSystemTts(text)
            }
        }
    }

    /** Fallback: TextToSpeech di sistema (volume limitato al 100%) */
    private fun speakWithSystemTts(text: String) {
        val engine = tts ?: run { finishSpeaking(); return }
        if (!_isReady.value) { finishSpeaking(); return }
        val utteranceId = "wavestream_assistant_${System.currentTimeMillis()}"
        val params = android.os.Bundle().apply {
            putFloat(android.speech.tts.TextToSpeech.Engine.KEY_PARAM_VOLUME, voiceVolume.coerceAtMost(1f))
        }
        engine.speak(text, TextToSpeech.QUEUE_FLUSH, params, utteranceId)
    }

    /** Alza il volume media del device al massimo durante la risposta di Nova */
    private fun boostMediaVolume() {
        if (!autoVolumeBoost) return
        try {
            val am = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
            savedVolumeIndex = am.getStreamVolume(AudioManager.STREAM_MUSIC)
            val max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
            val target = (max * 0.9f).toInt().coerceAtLeast(savedVolumeIndex ?: 0)
            if (target != savedVolumeIndex) {
                am.setStreamVolume(AudioManager.STREAM_MUSIC, target, 0)
            }
        } catch (_: Exception) {
            savedVolumeIndex = null
        }
    }

    private fun restoreMediaVolume() {
        val idx = savedVolumeIndex ?: return
        savedVolumeIndex = null
        try {
            val am = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if (am.getStreamVolume(AudioManager.STREAM_MUSIC) != idx) {
                am.setStreamVolume(AudioManager.STREAM_MUSIC, idx, 0)
            }
        } catch (_: Exception) {
        }
    }

    /** Fine della pronuncia: ripristina volume + notifica il completamento */
    private fun finishSpeaking() {
        restoreMediaVolume()
        _isSpeaking.value = false
        onDoneCallback?.invoke()
        onDoneCallback = null
    }

    fun stop() {
        sherpaTts.stopPlayback()
        try {
            tts?.stop()
        } catch (_: Exception) {
        }
        restoreMediaVolume()
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

    /** Anteprima live del volume/gain voce (0.1..3.0 — oltre 1.0 amplifica) */
    fun previewVolume(value: Float) {
        voiceVolume = value.coerceIn(0.1f, 3f)
    }

    init {
        // notifica fine pronuncia
        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                _isSpeaking.value = true
            }

            override fun onDone(utteranceId: String?) {
                finishSpeaking()
            }

            @Deprecated("Deprecated in Java")
            override fun onError(utteranceId: String?) {
                finishSpeaking()
            }
        })
    }
}
