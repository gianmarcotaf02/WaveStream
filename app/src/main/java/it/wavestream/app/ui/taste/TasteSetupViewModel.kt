package it.wavestream.app.ui.taste

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.wavestream.app.data.database.dao.ProfileDao
import it.wavestream.app.data.database.dao.UserTasteDao
import it.wavestream.app.data.database.entity.*
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.data.tmdb.TMDBService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class TasteSetupState(
    val currentStep: Int = 0,  // 0=genres, 1=watched
    val searchQuery: String = "",
    val searchResults: List<TMDBService.TMDBItem> = emptyList(),
    val isSearching: Boolean = false,
    val watchedItems: List<UserTaste> = emptyList(),
    val selectedGenres: Set<Int> = emptySet(),
    val isSaving: Boolean = false,
    val isComplete: Boolean = false
)

data class GenreOption(
    val id: Int,
    val name: String
)

@HiltViewModel
class TasteSetupViewModel @Inject constructor(
    private val tmdbService: TMDBService,
    private val userTasteDao: UserTasteDao,
    private val profileDao: ProfileDao,
    private val userPreferences: UserPreferences
) : ViewModel() {

    private val _state = MutableStateFlow(TasteSetupState())
    val state: StateFlow<TasteSetupState> = _state.asStateFlow()

    val movieGenres = listOf(
        GenreOption(28, "Azione"),
        GenreOption(12, "Avventura"),
        GenreOption(16, "Animazione"),
        GenreOption(35, "Commedia"),
        GenreOption(80, "Crime"),
        GenreOption(99, "Documentario"),
        GenreOption(18, "Dramma"),
        GenreOption(10751, "Famiglia"),
        GenreOption(14, "Fantasy"),
        GenreOption(36, "Storia"),
        GenreOption(27, "Horror"),
        GenreOption(10402, "Musica"),
        GenreOption(9648, "Mistero"),
        GenreOption(10749, "Romantico"),
        GenreOption(878, "Fantascienza"),
        GenreOption(53, "Thriller"),
        GenreOption(10752, "Guerra"),
        GenreOption(37, "Western")
    )

    init {
        viewModelScope.launch(Dispatchers.IO) { refreshItems() }
    }

    fun search(query: String) {
        _state.update { it.copy(searchQuery = query) }
        if (query.length < 2) {
            _state.update { it.copy(searchResults = emptyList(), isSearching = false) }
            return
        }
        _state.update { it.copy(isSearching = true) }
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val movies = tmdbService.searchMovie(query)
                val series = tmdbService.searchSeries(query)
                val results = (movies + series).distinctBy { it.id }
                _state.update { it.copy(searchResults = results.take(20), isSearching = false) }
            } catch (e: Exception) {
                _state.update { it.copy(searchResults = emptyList(), isSearching = false) }
            }
        }
    }

    fun addItem(item: TMDBService.TMDBItem) {
        val contentType = if (item.mediaType == "movie") ContentType.MOVIE else ContentType.SERIES
        viewModelScope.launch(Dispatchers.IO) {
            val profileId = userPreferences.getCurrentProfileId() ?: return@launch
            val existing = userTasteDao.getByTmdbId(profileId, item.id)
            if (existing == null) {
                userTasteDao.insert(UserTaste(
                    profileId = profileId,
                    contentType = contentType,
                    tmdbId = item.id,
                    title = item.title,
                    posterPath = item.posterPath,
                    year = extractYear(item.releaseDate),
                    status = TasteStatus.WATCHED
                ))
            }
            refreshItems()
        }
    }

    fun removeItem(tmdbId: Int, contentType: ContentType) {
        viewModelScope.launch(Dispatchers.IO) {
            val profileId = userPreferences.getCurrentProfileId() ?: return@launch
            userTasteDao.deleteByTmdbId(profileId, tmdbId, contentType)
            refreshItems()
        }
    }

    fun toggleGenre(genreId: Int) {
        _state.update {
            val newGenres = if (genreId in it.selectedGenres) {
                it.selectedGenres - genreId
            } else {
                it.selectedGenres + genreId
            }
            it.copy(selectedGenres = newGenres)
        }
    }

    fun goToStep(step: Int) {
        _state.update { it.copy(currentStep = step, searchQuery = "", searchResults = emptyList()) }
        if (step < 2) {
            viewModelScope.launch(Dispatchers.IO) { refreshItems() }
        }
    }

    fun saveAndComplete() {
        _state.update { it.copy(isSaving = true) }
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val profileId = userPreferences.getCurrentProfileId() ?: return@launch
                val profile = profileDao.getProfileById(profileId)
                if (profile != null) {
                    val genresStr = _state.value.selectedGenres.joinToString(",")
                    profileDao.update(profile.copy(selectedGenres = genresStr))
                }
                userPreferences.setSetupComplete(true)
                _state.update { it.copy(isSaving = false, isComplete = true) }
            } catch (e: Exception) {
                _state.update { it.copy(isSaving = false) }
            }
        }
    }

    fun skip() {
        viewModelScope.launch(Dispatchers.IO) {
            userPreferences.setSetupComplete(true)
            _state.update { it.copy(isComplete = true) }
        }
    }

    private suspend fun refreshItems() {
        val profileId = userPreferences.getCurrentProfileId() ?: return
        val watched = userTasteDao.getByProfileAndStatus(profileId, TasteStatus.WATCHED)
        _state.update { it.copy(watchedItems = watched) }
    }

    private fun extractYear(dateStr: String?): Int? {
        if (dateStr.isNullOrEmpty()) return null
        return dateStr.take(4).toIntOrNull()
    }
}
