package it.wavestream.app.ui.person

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.wavestream.app.data.api.TMDBApiService
import it.wavestream.app.data.api.TMDBPersonDetails
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.Series
import it.wavestream.app.data.preferences.UserPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonViewModel @Inject constructor(
    private val tmdbApi: TMDBApiService,
    private val movieDao: MovieDao,
    private val seriesDao: SeriesDao,
    private val userPreferences: UserPreferences
) : ViewModel() {

    companion object {
        private const val TAG = "PersonViewModel"
    }

    private val _person = MutableStateFlow<TMDBPersonDetails?>(null)
    val person: StateFlow<TMDBPersonDetails?> = _person

    private val _libraryMovies = MutableStateFlow<List<Movie>>(emptyList())
    val libraryMovies: StateFlow<List<Movie>> = _libraryMovies

    private val _libraryTV = MutableStateFlow<List<Series>>(emptyList())
    val libraryTV: StateFlow<List<Series>> = _libraryTV

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun loadPerson(personId: Int, personName: String) {
        viewModelScope.launch {
            _isLoading.value = true

            val apiKey = userPreferences.getTmdbApiKey() ?: return@launch

            try {
                _person.value = tmdbApi.getPersonDetails(personId, apiKey)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to load person details", e)
            }

            try {
                _libraryMovies.value = movieDao.getByPerson(personName)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to load library movies", e)
            }

            try {
                _libraryTV.value = seriesDao.getByPerson(personName)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to load library series", e)
            }

            _isLoading.value = false
        }
    }
}
