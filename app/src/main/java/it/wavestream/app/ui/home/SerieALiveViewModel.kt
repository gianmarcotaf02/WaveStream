package it.wavestream.app.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.data.repository.SerieAMatchRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import javax.inject.Inject

data class SerieAChannelPickerState(
    val match: SerieAMatchEntity,
    val channels: List<Channel>,
    val isLoading: Boolean = false
)

/**
 * ViewModel for the Serie A live hero: syncs the calendar from football-data.org,
 * exposes the matches currently in their hero window (one hero per match,
 * simultaneous matches supported) and handles the channel picker dialog.
 * While a hero is visible it re-syncs every 2 minutes to update live status/score.
 */
@HiltViewModel
class SerieALiveViewModel @Inject constructor(
    private val repository: SerieAMatchRepository
) : ViewModel() {

    private val _heroMatches = MutableStateFlow<List<SerieAMatchEntity>>(emptyList())
    val heroMatches: StateFlow<List<SerieAMatchEntity>> = _heroMatches.asStateFlow()

    private val _channelPicker = MutableStateFlow<SerieAChannelPickerState?>(null)
    val channelPicker: StateFlow<SerieAChannelPickerState?> = _channelPicker.asStateFlow()

    private var pollingJob: Job? = null

    init {
        viewModelScope.launch {
            runCatching { repository.syncIfStale() }
            repository.observeHeroMatches().collect { list ->
                val heroes = list
                    .filter { it.isInHeroWindow() }
                    .sortedWith(
                        compareByDescending<SerieAMatchEntity> { it.isLive }
                            .thenBy { it.utcDateMillis }
                    )
                _heroMatches.value = heroes
                managePolling()
            }
        }
    }

    /** Opens the channel picker for a match (loads matching channels by team aliases). */
    fun openChannelPicker(match: SerieAMatchEntity) {
        _channelPicker.value = SerieAChannelPickerState(
            match = match,
            channels = emptyList(),
            isLoading = true
        )
        viewModelScope.launch {
            val channels = runCatching { repository.findChannelsForMatch(match) }
                .getOrDefault(emptyList())
            _channelPicker.value = _channelPicker.value?.copy(
                channels = channels,
                isLoading = false
            )
        }
    }

    fun dismissChannelPicker() {
        _channelPicker.value = null
    }

    /** While at least one hero is visible, re-sync every 2 minutes (live status/score). */
    private fun managePolling() {
        val hasHeroes = _heroMatches.value.isNotEmpty()
        if (hasHeroes) {
            if (pollingJob?.isActive != true) {
                pollingJob = viewModelScope.launch {
                    while (isActive) {
                        delay(POLL_INTERVAL_MILLIS)
                        runCatching { repository.syncMatches() }
                    }
                }
            }
        } else {
            pollingJob?.cancel()
            pollingJob = null
        }
    }

    companion object {
        private const val POLL_INTERVAL_MILLIS = 2L * 60 * 1000
    }
}
