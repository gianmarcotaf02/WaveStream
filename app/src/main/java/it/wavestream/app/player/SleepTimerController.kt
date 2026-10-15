package it.wavestream.app.player

import android.os.SystemClock
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Timer "dormire" (mezzaluna) condiviso a livello di applicazione.
 *
 * Il conto alla rovescia **non** vive dentro il composable del player (dove ogni
 * ricomposizione del player, cambio episodio, mini-player o riapertura della
 * PlayerActivity lo azzererebbe). Vive qui, in un singleton Hilt: così continua
 * quando si passa all'episodio **successivo** o **precedente** e il valore
 * mostrato scende di minuto in minuto (es. 30 → 29 → 28 …).
 *
 * La scadenza è ancorata a [SystemClock.elapsedRealtime] (monotono e immune ai
 * salti dell'orologio di sistema, frequenti sui box TV): il tempo residuo resta
 * corretto anche se qualche tick viene perso durante un rebuffering.
 */
@Singleton
class SleepTimerController @Inject constructor() {

    data class State(
        /** Minuti scelti nel menu (0 = timer disattivato). */
        val minutes: Int = 0,
        /** Secondi residui (0 = scaduto o disattivato). */
        val remainingSeconds: Long = 0L
    ) {
        val isActive: Boolean get() = minutes > 0 && remainingSeconds > 0L
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    private val _state = MutableStateFlow(State())
    val state: StateFlow<State> = _state.asStateFlow()

    private var tickJob: Job? = null
    private var deadlineElapsedMs = 0L
    private var onExpire: (() -> Unit)? = null

    /**
     * Registra l'azione da eseguire alla scadenza (pausa + uscita dal player).
     * Chiamata a ogni nuova PlayerActivity: l'activity precedente si sgancia in
     * onDestroy, quindi il callback punta sempre a quella viva.
     */
    fun bindOnExpire(callback: () -> Unit) {
        onExpire = callback
    }

    /** Sgancia il callback solo se è ancora quello registrato da questa Activity. */
    fun unbindOnExpire(callback: () -> Unit) {
        if (onExpire === callback) onExpire = null
    }

    /**
     * Imposta il timer. Con [minutes] <= 0 lo disattiva e azzera il conto.
     */
    fun setTimer(minutes: Int) {
        tickJob?.cancel()
        tickJob = null
        if (minutes <= 0) {
            deadlineElapsedMs = 0L
            _state.value = State()
            return
        }
        deadlineElapsedMs = SystemClock.elapsedRealtime() + minutes * MINUTE_MS
        _state.value = State(minutes = minutes, remainingSeconds = minutes * 60L)
        tickJob = scope.launch {
            while (isActive) {
                val leftMs = deadlineElapsedMs - SystemClock.elapsedRealtime()
                if (leftMs <= 0L) {
                    expire()
                    return@launch
                }
                _state.value = _state.value.copy(
                    remainingSeconds = (leftMs + 999L) / 1000L
                )
                delay(TICK_MS)
            }
        }
    }

    /** Disattiva il timer senza eseguire l'azione di scadenza. */
    fun cancel() = setTimer(0)

    private fun expire() {
        tickJob = null
        deadlineElapsedMs = 0L
        _state.value = State()
        onExpire?.invoke()
    }

    private companion object {
        const val MINUTE_MS = 60_000L
        const val TICK_MS = 1_000L
    }
}
