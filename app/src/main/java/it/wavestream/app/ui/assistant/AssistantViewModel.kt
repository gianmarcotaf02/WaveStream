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

    init {
        aiAssistantService.resetConversation()

        // Ampiezza microfono in tempo reale → orb
        viewModelScope.launch {
            audioRecorder.amplitude.collect { amp ->
                if (_uiState.value.phase == Phase.LISTENING) {
                    _uiState.value = _uiState.value.copy(amplitude = amp)
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
     * Chiamato dall'Activity quando l'utente preme il bottone microfono.
     * Il permesso RECORD_AUDIO va già concesso a questo punto.
     */
    fun onMicPressed() {
        when (_uiState.value.phase) {
            Phase.LISTENING -> {
                // secondo tap: ferma e invia subito
                stopListeningAndProcess()
            }
            Phase.SPEAKING -> {
                // interrompe la voce e riascolta
                ttsManager.stop()
                startListening()
            }
            Phase.IDLE, Phase.ERROR -> startListening()
            Phase.THINKING -> { /* attendi il completamento */ }
        }
    }

    private fun startListening() {
        if (!audioRecorder.start()) {
            _uiState.value = _uiState.value.copy(
                phase = Phase.ERROR,
                errorMessage = "Microfono non disponibile su questo device"
            )
            return
        }
        ttsManager.stop()
        _uiState.value = _uiState.value.copy(
            phase = Phase.LISTENING,
            userText = null,
            assistantText = null,
            results = emptyList(),
            errorMessage = null,
            amplitude = 0f
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
            assistantText = turn.replyText,
            results = turn.results
        )

        // Voce di risposta (se abilitata)
        if (_uiState.value.ttsEnabled && turn.replyText.isNotBlank()) {
            ttsManager.speak(turn.replyText) {
                if (_uiState.value.phase == Phase.SPEAKING) {
                    _uiState.value = _uiState.value.copy(phase = Phase.IDLE)
                }
            }
        } else {
            _uiState.value = _uiState.value.copy(phase = Phase.IDLE)
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
}
