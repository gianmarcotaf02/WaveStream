package it.wavestream.app.ui.assistant

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.wavestream.app.ai.AiAssistantService
import it.wavestream.app.ai.AiResultItem
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.voice.AudioRecorder
import it.wavestream.app.voice.TtsManager
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel dell'assistente vocale AI.
 *
 * Flusso: LISTENING (mic) → THINKING (audio → Gemini + function calling) →
 * SPEAKING (TTS) con risultati nel carosello.
 */
@HiltViewModel
class AssistantViewModel @Inject constructor(
    private val aiAssistantService: AiAssistantService,
    private val audioRecorder: AudioRecorder,
    private val ttsManager: TtsManager,
    private val userPreferences: UserPreferences
) : ViewModel() {

    enum class Phase {
        IDLE,        // in attesa: premi il microfono
        LISTENING,   // registrazione in corso
        THINKING,    // Gemini sta elaborando
        SPEAKING,    // TTS in riproduzione
        ERROR
    }

    data class UiState(
        val phase: Phase = Phase.IDLE,
        val userText: String? = null,        // ultima richiesta (per il transcript)
        val assistantText: String? = null,   // ultima risposta
        val results: List<AiResultItem> = emptyList(),
        val amplitude: Float = 0f,           // per il pulse dell'orb
        val waveform: List<Float> = emptyList(), // storico ampiezze → visualizer circolare
        val ttsEnabled: Boolean = true,
        val errorMessage: String? = null
    )

    sealed class Event {
        data class OpenContent(val item: AiResultItem) : Event()
    }

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState

    private val _events = Channel<Event>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    private var listeningJob: Job? = null
    private var conversationJob: Job? = null

    // Buffer circolare delle ampiezze del microfono → visualizer musicale dell'orb
    private val waveformHistory = ArrayDeque<Float>()

    init {
        aiAssistantService.resetConversation()

        // Ampiezza microfono in tempo reale → orb (pulse + equalizer circolare)
        viewModelScope.launch {
            audioRecorder.amplitude.collect { amp ->
                if (_uiState.value.phase == Phase.LISTENING) {
                    // radice: rende visibili anche le voci basse (percezione umana)
                    waveformHistory.addLast(kotlin.math.sqrt(amp))
                    while (waveformHistory.size > WAVEFORM_SAMPLES) {
                        waveformHistory.removeFirst()
                    }
                    _uiState.value = _uiState.value.copy(
                        amplitude = amp,
                        waveform = waveformHistory.toList()
                    )
                }
            }
        }

        // Auto-stop del microfono (silenzio/timeout)
        audioRecorder.onAutoStop = {
            if (_uiState.value.phase == Phase.LISTENING) {
                stopListeningAndProcess()
            }
        }

        // Preferenza risposta vocale
        viewModelScope.launch {
            userPreferences.getAssistantTtsEnabledFlow().collect { enabled ->
                _uiState.value = _uiState.value.copy(ttsEnabled = enabled)
            }
        }
    }

    /**
     * Avvia l'ascolto. Chiamato automaticamente all'apertura dell'assistente
     * e a fine di ogni risposta (conversazione continua).
     * Il permesso RECORD_AUDIO va già concesso a questo punto (gestito dall'Activity).
     */
    fun startListening() {
        if (!audioRecorder.start()) {
            _uiState.value = _uiState.value.copy(
                phase = Phase.ERROR,
                errorMessage = (audioRecorder.lastError ?: "Microfono non disponibile su questo device") +
                    " — riprovo automaticamente…"
            )
            // Il microfono può diventare disponibile più tardi (permesso concesso,
            // mic abilitato dall'utente): riprova periodicamente invece di arrendersi
            listeningJob?.cancel()
            listeningJob = viewModelScope.launch {
                delay(8_000)
                if (_uiState.value.phase == Phase.ERROR) {
                    startListening()
                }
            }
            return
        }
        waveformHistory.clear()
        ttsManager.stop()
        _uiState.value = _uiState.value.copy(
            phase = Phase.LISTENING,
            userText = null,
            assistantText = null,
            errorMessage = null,
            amplitude = 0f
            // NB: i risultati del carosello restano visibili durante il nuovo ascolto
        )

        // safety: se onAutoStop non dovesse scattare, timeout fisso
        listeningJob?.cancel()
        listeningJob = viewModelScope.launch {
            delay(13_000)
            if (_uiState.value.phase == Phase.LISTENING) {
                stopListeningAndProcess()
            }
        }
    }

    /**
     * Permesso microfono negato dall'utente: messaggio chiaro (senza auto-retry,
     * per non tormentare l'utente con richieste ripetute).
     */
    fun onMicPermissionDenied() {
        _uiState.value = _uiState.value.copy(
            phase = Phase.ERROR,
            errorMessage = "Permesso microfono necessario per parlarmi — concedilo e rientra"
        )
    }

    private fun stopListeningAndProcess() {
        listeningJob?.cancel()
        val audio = audioRecorder.stop()
        if (audio == null) {
            _uiState.value = _uiState.value.copy(
                phase = Phase.IDLE,
                errorMessage = "Non ho sentito nulla. Riprova!"
            )
            return
        }

        _uiState.value = _uiState.value.copy(phase = Phase.THINKING)

        conversationJob?.cancel()
        conversationJob = viewModelScope.launch {
            try {
                val turn = aiAssistantService.sendVoiceMessage(audio)
                showTurn(turn)
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    phase = Phase.ERROR,
                    errorMessage = e.message ?: "Errore di comunicazione con l'AI"
                )
            }
        }
    }

    private fun showTurn(turn: it.wavestream.app.ai.AiTurn) {
        _uiState.value = _uiState.value.copy(
            phase = Phase.SPEAKING,
            userText = turn.transcript?.takeIf { t -> t.isNotBlank() } ?: _uiState.value.userText,
            assistantText = turn.replyText,
            results = turn.results
        )

        // Voce di risposta (se abilitata) — a fine pronuncia si riattiva l'ascolto.
        // Durante la pronuncia, alimenta il visualizer con un ritmo parlato simulato
        // (burst e pause), così l'orb "balla" con la voce dell'AI.
        if (_uiState.value.ttsEnabled && turn.replyText.isNotBlank()) {
            viewModelScope.launch {
                var t = 0f
                while (_uiState.value.phase == Phase.SPEAKING) {
                    val w1 = kotlin.math.sin(t * 5.5f) * 0.5f + 0.5f
                    val w2 = kotlin.math.sin(t * 13.7f + 1.3f) * 0.5f + 0.5f
                    // pseudo-pause tra le frasi (il ritmo della voce)
                    val pauseFactor = if (kotlin.math.sin(t * 0.9f) > -0.6f) 1f else 0.25f
                    val v = ((w1 * 0.6f + w2 * 0.4f) * pauseFactor).coerceIn(0.03f, 1f)
                    waveformHistory.addLast(kotlin.math.sqrt(v))
                    while (waveformHistory.size > WAVEFORM_SAMPLES) {
                        waveformHistory.removeFirst()
                    }
                    _uiState.value = _uiState.value.copy(waveform = waveformHistory.toList())
                    t += 0.09f
                    delay(55)
                }
            }
            ttsManager.speak(turn.replyText) {
                if (_uiState.value.phase == Phase.SPEAKING) {
                    startListening()
                }
            }
        } else {
            _uiState.value = _uiState.value.copy(phase = Phase.IDLE)
            // Senza voce: dopo una pausa si torna in ascolto automaticamente
            viewModelScope.launch {
                delay(6_000)
                if (_uiState.value.phase == Phase.IDLE) {
                    startListening()
                }
            }
        }
    }

    /**
     * L'utente ha selezionato un risultato dal carosello.
     */
    fun onResultSelected(item: AiResultItem) {
        ttsManager.stop()
        viewModelScope.launch {
            _events.send(Event.OpenContent(item))
        }
    }

    override fun onCleared() {
        if (audioRecorder.amplitude.value > 0f || listeningJob?.isActive == true) {
            audioRecorder.stop()
        }
        ttsManager.stop()
        super.onCleared()
    }

    companion object {
        /** Numero di barre del visualizer circolare */
        private const val WAVEFORM_SAMPLES = 90
    }
}
