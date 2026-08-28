package it.wavestream.app.ui.home

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.R
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.dao.*
import it.wavestream.app.data.database.entity.*
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.util.ContentFilters
import it.wavestream.app.util.CoilImagePreloader
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import javax.inject.Inject
import android.util.Log
import it.wavestream.app.data.tmdb.TMDBService
import it.wavestream.app.data.repository.ImdbRatingsRepository
import it.wavestream.app.data.api.XtreamApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Content type for tab-specific loading
 */
enum class HomeContentType {
    HOME,      // Home tab - all content mixed
    MOVIES,    // Film tab - only movies
    SERIES,    // Serie TV tab - only series
    FAVORITES, // Preferiti tab - favorites
    LISTS,     // Liste tab - custom lists
    HISTORY    // Cronologia tab - watch history
}

/**
 * ViewModel for TvHomeScreen
 * Manages home screen state for the Compose TV implementation
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val channelDao: ChannelDao,
    private val movieDao: MovieDao,
    private val seriesDao: SeriesDao,
    private val watchStateDao: WatchStateDao,
    private val watchProgressDao: WatchProgressDao,
    private val favoriteDao: FavoriteDao,
    private val favoriteCategoryDao: it.wavestream.app.data.database.dao.FavoriteCategoryDao,
    private val customGroupDao: CustomGroupDao,
    private val userPreferences: UserPreferences,
    private val contentCache: ContentCache,
    private val imagePreloader: CoilImagePreloader,
    private val tmdbService: TMDBService,
    private val imdbRatingsRepository: ImdbRatingsRepository,
    private val playlistDao: PlaylistDao,
    private val episodeDao: EpisodeDao,
    private val profileDao: ProfileDao,
    private val recommendationEngine: it.wavestream.app.data.tmdb.RecommendationEngine
) : ViewModel() {

    companion object {
        private const val HERO_CACHE_DURATION = 10 * 24 * 60 * 60 * 1000L // 10 days
        private const val POPULAR_CACHE_DURATION = 10 * 24 * 60 * 60 * 1000L // 10 days
        private const val CAROUSEL_CACHE_DURATION = 10 * 24 * 60 * 60 * 1000L // 10 days - carousel order stays stable
    }

    private val _uiState = MutableStateFlow(HomeScreenState())
    val uiState: StateFlow<HomeScreenState> = _uiState.asStateFlow()
    
    private val _profileName = MutableStateFlow("")
    val profileName: StateFlow<String> = _profileName.asStateFlow()
    
    // Available categories for sidebar
    private val _movieCategories = MutableStateFlow<List<String>>(emptyList())
    val movieCategories: StateFlow<List<String>> = _movieCategories.asStateFlow()
    
    private val _seriesCategories = MutableStateFlow<List<String>>(emptyList())
    val seriesCategories: StateFlow<List<String>> = _seriesCategories.asStateFlow()
    
    // Trending refresh state — LoadingActivity can observe this to show overlay
    private val _isRefreshingTrending = MutableStateFlow(false)
    val isRefreshingTrending: StateFlow<Boolean> = _isRefreshingTrending.asStateFlow()
    
    private var currentProfileId: Long = 1L
    private var currentContentType: HomeContentType = HomeContentType.HOME
    
    // Active loading jobs per tab — cancels previous job when switching tabs to avoid race conditions
    private val loadingJobs = mutableMapOf<HomeContentType, Job>()
    
    // Cache for tab content to avoid reloading when switching tabs - delegated to ContentCache for persistence across VM recreation
    private val cachedCarouselRows = object : MutableMap<HomeContentType, List<CarouselRow>> {
        override val size: Int get() = 0
        override fun containsKey(key: HomeContentType): Boolean = get(key) != null
        override fun containsValue(value: List<CarouselRow>): Boolean = false
        override fun get(key: HomeContentType): List<CarouselRow>? = contentCache.getCarouselRows("rows_${key.name}")
        override fun isEmpty(): Boolean = size == 0
        override val entries: MutableSet<MutableMap.MutableEntry<HomeContentType, List<CarouselRow>>> get() = mutableSetOf()
        override val keys: MutableSet<HomeContentType> get() = mutableSetOf()
        override val values: MutableCollection<List<CarouselRow>> get() = mutableListOf()
        override fun clear() = contentCache.clearHomeSessionData()
        override fun put(key: HomeContentType, value: List<CarouselRow>): List<CarouselRow>? {
            contentCache.putCarouselRows("rows_${key.name}", value)
            return null
        }
        override fun putAll(from: Map<out HomeContentType, List<CarouselRow>>) {
            from.forEach { (k, v) -> put(k, v) }
        }
        override fun remove(key: HomeContentType): List<CarouselRow>? {
            contentCache.removeHomeSessionData("rows_${key.name}")
            return null
        }
    }

    private val cachedCarouselRowsTime = object : MutableMap<HomeContentType, Long> {
        override val size: Int get() = 0
        override fun containsKey(key: HomeContentType): Boolean = get(key) != null
        override fun containsValue(value: Long): Boolean = false
        override fun get(key: HomeContentType): Long? = contentCache.getTimestamp("rows_time_${key.name}")
        override fun isEmpty(): Boolean = size == 0
        override val entries: MutableSet<MutableMap.MutableEntry<HomeContentType, Long>> get() = mutableSetOf()
        override val keys: MutableSet<HomeContentType> get() = mutableSetOf()
        override val values: MutableCollection<Long> get() = mutableListOf()
        override fun clear() {}
        override fun put(key: HomeContentType, value: Long): Long? {
            contentCache.putTimestamp("rows_time_${key.name}", value)
            return null
        }
        override fun putAll(from: Map<out HomeContentType, Long>) {
            from.forEach { (k, v) -> put(k, v) }
        }
        override fun remove(key: HomeContentType): Long? {
            contentCache.removeHomeSessionData("rows_time_${key.name}")
            return null
        }
    }

    private val cachedHeroItems = object : MutableMap<HomeContentType, HeroPairData> {
        override val size: Int get() = 0
        override fun containsKey(key: HomeContentType): Boolean = get(key) != null
        override fun containsValue(value: HeroPairData): Boolean = false
        override fun get(key: HomeContentType): HeroPairData? = contentCache.getHeroPair("hero_${key.name}")
        override fun isEmpty(): Boolean = size == 0
        override val entries: MutableSet<MutableMap.MutableEntry<HomeContentType, HeroPairData>> get() = mutableSetOf()
        override val keys: MutableSet<HomeContentType> get() = mutableSetOf()
        override val values: MutableCollection<HeroPairData> get() = mutableListOf()
        override fun clear() {}
        override fun put(key: HomeContentType, value: HeroPairData): HeroPairData? {
            contentCache.putHeroPair("hero_${key.name}", value)
            return null
        }
        override fun putAll(from: Map<out HomeContentType, HeroPairData>) {
            from.forEach { (k, v) -> put(k, v) }
        }
        override fun remove(key: HomeContentType): HeroPairData? {
            contentCache.removeHomeSessionData("hero_${key.name}")
            return null
        }
    }
    
    // In-memory session cache for "Recently Added" content
    private var cachedRecentlyAddedMovies: List<Movie>? = null
    private var cachedRecentlyAddedSeries: List<Series>? = null
    
    // Favorite categories state
    private val _favoriteMovieCategories = MutableStateFlow<Set<String>>(emptySet())
    val favoriteMovieCategories: StateFlow<Set<String>> = _favoriteMovieCategories.asStateFlow()
    
    private val _favoriteSeriesCategories = MutableStateFlow<Set<String>>(emptySet())
    val favoriteSeriesCategories: StateFlow<Set<String>> = _favoriteSeriesCategories.asStateFlow()


    // Saved state before entering grid mode (for back navigation)
    private var savedPreGridState: HomeScreenState? = null

    init {
        // Load HOME tab content (the critical first-frame path)
        loadContent(HomeContentType.HOME)

        // Defer non-critical background work to avoid CPU contention during first frame.
        viewModelScope.launch {
            kotlinx.coroutines.delay(2000)
            loadAllCategories()
            loadFavoriteCategories()
        }

        // Load profile name for HOME tab greeting (off Main thread)
        viewModelScope.launch(Dispatchers.IO) {
            currentProfileId = userPreferences.getCurrentProfileId() ?: 1L
            val profile = profileDao.getProfileById(currentProfileId)
            _profileName.value = profile?.name ?: ""
        }
    }

    /**
     * Remove WatchProgress entries that reference movies/series that no longer exist
     * This happens when playlists are reimported and content gets new IDs
     */
    private fun cleanupOrphanedProgress() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val allProgress = watchProgressDao.getAllProgress()
                var removedCount = 0
                
                for (progress in allProgress) {
                    val exists = when (progress.contentType) {
                        ContentType.MOVIE -> movieDao.getMovieById(progress.contentId) != null
                        ContentType.SERIES, ContentType.EPISODE -> {
                            val seriesId = progress.seriesId ?: progress.contentId
                            seriesDao.getSeriesById(seriesId) != null
                        }
                        ContentType.CHANNEL -> channelDao.getChannelById(progress.contentId) != null
                    }
                    
                    if (!exists) {
                        watchProgressDao.delete(progress)
                        removedCount++
                    }
                }
                
                if (removedCount > 0) {
                    Log.d("HomeViewModel", "Cleaned up $removedCount orphaned WatchProgress entries")
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error cleaning orphaned progress: ${e.message}")
            }
        }
    }
    
    /**
     * Soft refresh: only updates the "Continua a guardare" carousel in-place.
     * The order of other carousels (Popular, categories) is preserved for 30 minutes.
     * A full reload only happens if the carousel cache has expired.
     */
    fun forceRefresh() {
        val contentType = currentContentType
        Log.d("HomeViewModel", "Soft refresh for $contentType")
        
        // Check if trending is > 7 days old → re-populate in background
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val lastUpdate = userPreferences.getTmdbPopularLastUpdate()
                val sevenDaysMs = 7 * 24 * 60 * 60 * 1000L
                if (System.currentTimeMillis() - lastUpdate > sevenDaysMs) {
                    Log.d("HomeViewModel", "Trending > 7 days old, re-populating in background")
                    _isRefreshingTrending.value = true
                    try {
                        tmdbService.populateTrendingMovies()
                        tmdbService.populateTrendingSeries()
                        userPreferences.setTmdbPopularLastUpdate(System.currentTimeMillis())
                        Log.d("HomeViewModel", "Background trending refresh complete")
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Background trending refresh failed", e)
                    } finally {
                        _isRefreshingTrending.value = false
                    }
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error checking trending age", e)
            }
        }
        
        val cachedRows = cachedCarouselRows[contentType]
        val cacheTime = cachedCarouselRowsTime[contentType] ?: 0L
        val isCacheStillValid = cachedRows != null &&
            (System.currentTimeMillis() - cacheTime) < CAROUSEL_CACHE_DURATION &&
            (contentType == HomeContentType.HOME || contentType == HomeContentType.MOVIES || contentType == HomeContentType.SERIES)
        
        if (isCacheStillValid && cachedRows != null) {
            // Only refresh the "Continua a guardare" row in-place
            viewModelScope.launch(Dispatchers.IO) {
                try {
                    // Check if tab changed while we were queued — abort if so
                    if (currentContentType != contentType) return@launch
                    
                    val continueWatchingData = loadContinueWatching() ?: emptyList()
                    val cwItems = when (contentType) {
                        HomeContentType.MOVIES -> continueWatchingData.filter { it.contentType == ContentType.MOVIE }
                        HomeContentType.SERIES -> continueWatchingData.filter { it.contentType == ContentType.SERIES }
                        else -> continueWatchingData
                    }
                    
                    // Replace just the "Continua a guardare" row, keep everything else intact
                    val updatedRows = cachedRows.toMutableList()
                    val cwIndex = updatedRows.indexOfFirst { it.title == "Continua a guardare" }
                    val newCwItems = cwItems.mapNotNull { it.toCarouselItem() }
                    
                    when {
                        cwIndex >= 0 && newCwItems.isNotEmpty() -> {
                            // Update existing CW row
                            updatedRows[cwIndex] = updatedRows[cwIndex].copy(items = newCwItems)
                        }
                        cwIndex >= 0 && newCwItems.isEmpty() -> {
                            // Remove CW row if nothing left
                            updatedRows.removeAt(cwIndex)
                        }
                        cwIndex < 0 && newCwItems.isNotEmpty() -> {
                            // Add CW row at the top if it's new
                            updatedRows.add(0, CarouselRow(title = "Continua a guardare", items = newCwItems))
                        }
                    }
                    
                    // Also refresh the popular carousels with fresh DB data, so poster/backdrop
                    // corrections (e.g. after opening the detail view and enriching via TMDB)
                    // are reflected in the home rows.
                    try {
                        loadPopularMovies()?.let { movies ->
                            if (movies.isNotEmpty()) {
                                val newItems = movies.map { it.toCarouselItem() }
                                // HOME tab uses "Film per te"; MOVIES tab uses "Film popolari"
                                val idx = updatedRows.indexOfFirst {
                                    it.title == "Film per te" || it.title == "Film popolari"
                                }
                                if (idx >= 0) {
                                    updatedRows[idx] = updatedRows[idx].copy(items = newItems)
                                }
                            }
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error refreshing popular movies row", e)
                    }
                    try {
                        loadPopularSeries()?.let { series ->
                            if (series.isNotEmpty()) {
                                val newItems = series.map { it.toCarouselItem() }
                                // HOME tab uses "Serie TV per te"; SERIES tab uses "Serie TV popolari"
                                val idx = updatedRows.indexOfFirst {
                                    it.title == "Serie TV per te" || it.title == "Serie TV popolari"
                                }
                                if (idx >= 0) {
                                    updatedRows[idx] = updatedRows[idx].copy(items = newItems)
                                }
                            }
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error refreshing popular series row", e)
                    }
                    
                    // Update cache with the patched rows
                    cachedCarouselRows[contentType] = updatedRows
                    cachedCarouselRowsTime[contentType] = System.currentTimeMillis()
                    
                    // ALSO refresh watch progress for current heroes!
                    var currentHeroes = _uiState.value.heroItems
                    if (currentHeroes.isEmpty()) {
                        currentHeroes = cachedHeroItems[contentType]?.heroes ?: emptyList()
                    }
                    val freshHeroes = refreshHeroItemsRatings(currentHeroes).let { refreshHeroItemsWatchProgress(it) }
                    val hasAnyCW = freshHeroes.any { it.resumeMinutes != null || it.resumeEpisodeSeason != null }
                    
                    // Update cachedHeroItems with the fresh progress so the cache stays synced
                    val cachedHero = cachedHeroItems[contentType]
                    if (cachedHero != null) {
                        cachedHeroItems[contentType] = cachedHero.copy(heroes = freshHeroes, isContinueWatching = hasAnyCW)
                    }
                    
                    // Only update UI if tab hasn't changed
                    if (currentContentType == contentType) {
                        withContext(Dispatchers.Main) {
                            _uiState.update { 
                                it.copy(
                                    carouselRows = updatedRows,
                                    heroItems = freshHeroes,
                                    isContinueWatchingHero = hasAnyCW
                                ) 
                            }
                        }
                    }
                    Log.d("HomeViewModel", "Soft refresh done: CW row updated, carousels stable, hero progress refreshed")
                } catch (e: Exception) {
                    Log.e("HomeViewModel", "Error in soft refresh", e)
                }
            }
        } else {
            // Cache expired (> 7 days) or not yet built → full reload
            if (currentContentType != contentType) return  // Tab changed, abort stale refresh
            Log.d("HomeViewModel", "Carousel cache expired, doing full reload")
            cachedCarouselRows.remove(contentType)
            cachedCarouselRowsTime.remove(contentType)
            cachedHeroItems.remove(contentType)
            loadContent(contentType)
        }
    }
    
    /**
     * Mark content as watched (remove from "Continue Watching")
     * Deletes the WatchProgress entry for the given hero item and refreshes the UI
     * 
     * Note: For series, WatchProgress stores the episode with contentType=EPISODE 
     * and seriesId pointing to the series. So we need to delete by seriesId for series content.
     */
    fun markAsWatched(hero: HeroItem) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                if (hero.contentType == ContentType.MOVIE.name) {
                    // For movies: delete by contentType=MOVIE and contentId=movie.id
                    watchProgressDao.deleteProgress(currentProfileId, ContentType.MOVIE, hero.id)
                    Log.d("HomeViewModel", "Marked as watched (movie): ${hero.title} (id=${hero.id})")
                } else {
                    // For series: WatchProgress is stored with contentType=EPISODE and seriesId=series.id
                    // So we need to delete by seriesId
                    watchProgressDao.deleteProgressBySeriesId(currentProfileId, hero.id)
                    Log.d("HomeViewModel", "Marked as watched (series): ${hero.title} (seriesId=${hero.id})")
                }
                
                // Force refresh to update the UI
                withContext(Dispatchers.Main) {
                    forceRefresh()
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error marking as watched: ${hero.title}", e)
            }
        }
    }
    
    /**
     * Load all categories for sidebar (filtered) with counts
     */
    private fun loadAllCategories() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                // Load and filter movie categories with counts
                val allMovieCategories = movieDao.getCategoriesList()
                val filteredMovies = ContentFilters.filterMovieCategories(allMovieCategories)
                val movieCategoriesWithCounts = filteredMovies.map { cat ->
                    val count = movieDao.getMovieCountByCategory(cat)
                    "$cat ($count)"
                }
                val totalMovies = movieDao.getAllMoviesCount()
                // Add "Tutti i Film" + "Aggiunti di recente" + "Film Popolari" + rest of categories
                _movieCategories.value = listOf(
                    "Tutti i Film ($totalMovies)",
                    "Aggiunti di recente",
                    "Film Popolari"
                ) + movieCategoriesWithCounts
                
                // Load and filter series categories with counts
                val allSeriesCategories = seriesDao.getCategoriesList()
                val filteredSeries = ContentFilters.filterSeriesCategories(allSeriesCategories)
                val seriesCategoriesWithCounts = filteredSeries.map { cat ->
                    val count = seriesDao.getSeriesCountByCategory(cat)
                    "$cat ($count)"
                }
                val totalSeries = seriesDao.getAllSeriesCount()
                // Add "Tutte le Serie" + "Aggiunti di recente" + "Serie Popolari" + rest of categories
                _seriesCategories.value = listOf(
                    "Tutte le Serie ($totalSeries)",
                    "Aggiunti di recente",
                    "Serie Popolari"
                ) + seriesCategoriesWithCounts
            } catch (e: Exception) {
                // Keep empty on error
            }
        }
    }

    /**
     * Load content based on content type (tab)
     * Uses cache for MOVIES and SERIES to avoid reloading when switching tabs
     * Cancels any in-flight loading job for the same tab to avoid race conditions
     */
    fun loadContent(contentType: HomeContentType = currentContentType) {
        Log.d("HomeViewModel", "loadContent: contentType=$contentType, previous=$currentContentType")
        currentContentType = contentType
        // Cancel ALL in-flight loading jobs to prevent stale data overwriting current tab
        loadingJobs.values.forEach { it.cancel() }
        loadingJobs.clear()
        loadingJobs[contentType] = viewModelScope.launch {
            try {
                // Move DB reads off Main thread to avoid ANR
                withContext(Dispatchers.IO) {
                    currentProfileId = userPreferences.getCurrentProfileId() ?: 1L
                    val profile = profileDao.getProfileById(currentProfileId)
                    _profileName.value = profile?.name ?: ""
                }

            // Check if we have cached data for this content type
            val cachedRows = cachedCarouselRows[contentType]
            val cachedHero = cachedHeroItems[contentType]
            Log.d("HomeViewModel", "loadContent: $contentType cache check — rows=${cachedRows != null} (${cachedRows?.size ?: 0}), heroes=${cachedHero != null}")
            
            if (cachedRows != null && (contentType == HomeContentType.HOME || contentType == HomeContentType.MOVIES || contentType == HomeContentType.SERIES)) {
                // Use cached rows immediately — show content fast
                if (currentContentType != contentType) return@launch
                
                // Refresh ratings + watch progress for cached heroes on load
                val freshHeroes = cachedHero?.heroes
                    ?.let { refreshHeroItemsRatings(it) }
                    ?.let { refreshHeroItemsWatchProgress(it) }
                    ?: emptyList()
                val hasAnyCW = freshHeroes.any { it.resumeMinutes != null || it.resumeEpisodeSeason != null }
                
                // Update cachedHeroItems with the fresh progress so the cache stays synced
                if (cachedHero != null) {
                    cachedHeroItems[contentType] = cachedHero.copy(heroes = freshHeroes, isContinueWatching = hasAnyCW)
                }
                
                _uiState.update { 
                    it.copy(
                        isLoading = false,
                        carouselRows = cachedRows,
                        heroItem = cachedRows.flatMap { r -> r.items }.firstOrNull(),
                        isGridMode = false,
                        selectedCategory = null,
                        isListsTab = false,
                        isFavoritesTab = false,
                        isHistoryTab = false,
                        isHomeTab = contentType == HomeContentType.HOME,
                        heroItems = freshHeroes,
                        currentHeroIndex = 0,
                        isContinueWatchingHero = hasAnyCW
                    )
                }
                // Warm Coil caches with visible posters + hero backdrops (non-blocking)
                preloadContentImages(cachedRows, freshHeroes)
                // If heroes not cached yet, load them in background
                if (cachedHero == null || cachedHero.heroes.isEmpty()) {
                    launch(Dispatchers.IO) {
                        try {
                            val heroResult = when (contentType) {
                                HomeContentType.HOME -> loadHomeHeroItems()
                                HomeContentType.MOVIES -> loadHeroItems(ContentType.MOVIE)
                                HomeContentType.SERIES -> loadHeroItems(ContentType.SERIES)
                                else -> null
                            }
                            if (heroResult != null) {
                                cachedHeroItems[contentType] = heroResult
                                if (currentContentType == contentType) {
                                    withContext(Dispatchers.Main) {
                                        _uiState.update {
                                            it.copy(
                                                heroItems = heroResult.heroes,
                                                currentHeroIndex = 0,
                                                isContinueWatchingHero = heroResult.isContinueWatching
                                            )
                                        }
                                    }
                                }
                                Log.d("HomeViewModel", "Background hero load done for $contentType: ${heroResult.heroes.size} heroes")
                            }
                        } catch (e: Exception) {
                            Log.e("HomeViewModel", "Error background hero load for $contentType", e)
                        }
                    }
                }
                return@launch
            }
            
            // No cache — show skeleton immediately
            if (currentContentType != contentType) return@launch
            _uiState.update {
                it.copy(
                    isLoading = true,
                    carouselRows = emptyList(),
                    heroItems = emptyList(),
                    isGridMode = false,
                    isHomeTab = contentType == HomeContentType.HOME
                )
            }
            
            val rows = mutableListOf<CarouselRow>()
            
            // Run independent tasks in parallel
            val heroDeferred = async(Dispatchers.IO) {
                try {
                     when (contentType) {
                        HomeContentType.HOME -> loadHomeHeroItems()
                        HomeContentType.MOVIES -> loadHeroItems(ContentType.MOVIE)
                        HomeContentType.SERIES -> loadHeroItems(ContentType.SERIES)
                        else -> null
                    }
                } catch (e: Exception) {
                    Log.e("HomeViewModel", "Error loading heroes for $contentType", e)
                    null
                }
            }
            
            // Stage 1: fast rows only (DB/cache — no TMDB network). Shown immediately
            // so the skeleton disappears; recommendations / genre carousels (TMDB)
            // and heroes fill in afterwards in the background.
            val fastContentDeferred = async(Dispatchers.IO) {
                try {
                    val contentRows = mutableListOf<CarouselRow>()
                    when (contentType) {
                        HomeContentType.HOME -> loadHomeContent(contentRows, fastOnly = true)
                        HomeContentType.MOVIES -> loadMoviesContent(contentRows, fastOnly = true)
                        HomeContentType.SERIES -> loadSeriesContent(contentRows, fastOnly = true)
                        // Secondary tabs have no slow parts worth deferring
                        HomeContentType.FAVORITES -> loadFavoritesContent(contentRows)
                        HomeContentType.LISTS -> loadListsContent(contentRows)
                        HomeContentType.HISTORY -> loadHistoryContent(contentRows)
                    }
                    contentRows
                } catch (e: Exception) {
                    Log.e("HomeViewModel", "Error loading fast rows for $contentType", e)
                    emptyList<CarouselRow>()
                }
            }
            
            val fastRows = fastContentDeferred.await()
            rows.addAll(fastRows)
            
            // Cache the fast rows immediately: even if the slow parts never finish,
            // a restart (or the LoadingActivity preload) shows content instantly.
            if (contentType == HomeContentType.HOME || contentType == HomeContentType.MOVIES || contentType == HomeContentType.SERIES) {
                cachedCarouselRows[contentType] = rows.toList()
                cachedCarouselRowsTime[contentType] = System.currentTimeMillis()
            }
            
            // Only update UI if we're still on the same tab
            if (currentContentType != contentType) {
                Log.w("HomeViewModel", "loadContent: $contentType SKIPPED — tab changed to $currentContentType")
                return@launch
            }
            Log.d("HomeViewModel", "loadContent: $contentType SHOWING FAST ROWS — ${rows.size} rows")
            _uiState.update { 
                it.copy(
                    isLoading = false,
                    carouselRows = rows,
                    heroItem = rows.flatMap { r -> r.items }.firstOrNull(),
                    isGridMode = false,  // Reset grid mode when loading tabs
                    selectedCategory = null,
                    isListsTab = contentType == HomeContentType.LISTS,
                    isFavoritesTab = contentType == HomeContentType.FAVORITES,
                    isHistoryTab = contentType == HomeContentType.HISTORY,
                    isHomeTab = contentType == HomeContentType.HOME,
                    heroItems = emptyList(),
                    currentHeroIndex = 0,
                    isContinueWatchingHero = false
                )
            }
            preloadContentImages(rows, emptyList())
            
            // Stage 2: full rows (adds recommendations / genre carousels / category rows).
            // Only the cached tabs need the second pass — secondary tabs already got everything.
            if (contentType == HomeContentType.HOME || contentType == HomeContentType.MOVIES || contentType == HomeContentType.SERIES) {
                val fullContentDeferred = async(Dispatchers.IO) {
                    try {
                        val contentRows = mutableListOf<CarouselRow>()
                        when (contentType) {
                            HomeContentType.HOME -> loadHomeContent(contentRows)
                            HomeContentType.MOVIES -> loadMoviesContent(contentRows)
                            HomeContentType.SERIES -> loadSeriesContent(contentRows)
                            else -> contentRows
                        }
                        contentRows
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error loading full rows for $contentType", e)
                        emptyList<CarouselRow>()
                    }
                }
                val fullRows = fullContentDeferred.await()
                rows.clear()
                rows.addAll(fullRows)
                
                // Refresh the cache with the complete rows
                cachedCarouselRows[contentType] = rows.toList()
                cachedCarouselRowsTime[contentType] = System.currentTimeMillis()
                
                if (currentContentType == contentType) {
                    Log.d("HomeViewModel", "loadContent: $contentType FULL ROWS — ${rows.size} rows")
                    _uiState.update { it.copy(carouselRows = rows) }
                    preloadContentImages(rows, emptyList())
                }
            }
            
            // Stage 3: heroes (may include slow TMDB/OMDB enrichment) — update in place
            val heroResult = heroDeferred.await()
            if (heroResult != null && (contentType == HomeContentType.HOME || contentType == HomeContentType.MOVIES || contentType == HomeContentType.SERIES)) {
                cachedHeroItems[contentType] = heroResult
            }
            if (currentContentType == contentType) {
                Log.d("HomeViewModel", "loadContent: $contentType HEROES READY — ${heroResult?.heroes?.size ?: 0}")
                _uiState.update {
                    it.copy(
                        heroItems = heroResult?.heroes ?: emptyList(),
                        currentHeroIndex = 0,
                        isContinueWatchingHero = heroResult?.isContinueWatching ?: false
                    )
                }
                preloadContentImages(rows, heroResult?.heroes ?: emptyList())
            }
        } catch (e: Exception) {
            Log.e("HomeViewModel", "CRITICAL ERROR in loadContent: ${e.message}", e)
             _uiState.update { it.copy(isLoading = false) }
        }
    }
    }

    /**
     * Check if a tab has finished loading (has cached content or is not loading).
     * Used by LoadingActivity to know when all tabs are ready.
     */
    fun isReadyForTab(type: HomeContentType): Boolean {
        return when (type) {
            HomeContentType.HOME -> {
                val rows = cachedCarouselRows[HomeContentType.HOME]
                val heroes = cachedHeroItems[HomeContentType.HOME]
                rows != null && rows.isNotEmpty() && heroes != null && heroes.heroes.isNotEmpty()
            }
            HomeContentType.MOVIES -> {
                val rows = cachedCarouselRows[HomeContentType.MOVIES]
                val heroes = cachedHeroItems[HomeContentType.MOVIES]
                rows != null && rows.isNotEmpty() && heroes != null && heroes.heroes.isNotEmpty()
            }
            HomeContentType.SERIES -> {
                val rows = cachedCarouselRows[HomeContentType.SERIES]
                val heroes = cachedHeroItems[HomeContentType.SERIES]
                rows != null && rows.isNotEmpty() && heroes != null && heroes.heroes.isNotEmpty()
            }
            else -> false
        }
    }
    
    /**
     * Preload a tab's carousel rows AND heroes into ContentCache without touching _uiState.
     * Used during LoadingActivity to warm all tab caches so tab switches
     * in MainActivity are instant (cache hit, no skeleton loading).
     */
    suspend fun preloadTabIntoCache(contentType: HomeContentType) {
        try {
            val existingRows = cachedCarouselRows[contentType]
            val existingHeroes = cachedHeroItems[contentType]
            if (existingRows != null && existingRows.isNotEmpty() && existingHeroes != null && existingHeroes.heroes.isNotEmpty()) {
                Log.d("HomeViewModel", "preloadTabIntoCache: $contentType already cached, skipping")
                return
            }

            Log.d("HomeViewModel", "preloadTabIntoCache: Loading $contentType into cache")

            coroutineScope {
                val heroDeferred = async(Dispatchers.IO) {
                    try {
                        when (contentType) {
                            HomeContentType.HOME -> loadHomeHeroItems()
                            HomeContentType.MOVIES -> loadHeroItems(ContentType.MOVIE)
                            HomeContentType.SERIES -> loadHeroItems(ContentType.SERIES)
                            else -> null
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error preloading heroes for $contentType", e)
                        null
                    }
                }

                // Stage 1: fast rows (DB/cache only) — cached FIRST so that even if the
                // slow TMDB parts (recommendations, genre carousels) time out, the home
                // loads rows instantly on a cache hit.
                val fastDeferred = async(Dispatchers.IO) {
                    try {
                        val contentRows = mutableListOf<CarouselRow>()
                        when (contentType) {
                            HomeContentType.HOME -> loadHomeContent(contentRows, fastOnly = true)
                            HomeContentType.MOVIES -> loadMoviesContent(contentRows, fastOnly = true)
                            HomeContentType.SERIES -> loadSeriesContent(contentRows, fastOnly = true)
                            else -> {}
                        }
                        contentRows
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error preloading fast rows for $contentType", e)
                        emptyList<CarouselRow>()
                    }
                }
                val fastRows = fastDeferred.await()
                cachedCarouselRows[contentType] = fastRows
                cachedCarouselRowsTime[contentType] = System.currentTimeMillis()

                // Stage 2: full rows (adds recommendations / genre carousels / category rows)
                val fullDeferred = async(Dispatchers.IO) {
                    try {
                        val contentRows = mutableListOf<CarouselRow>()
                        when (contentType) {
                            HomeContentType.HOME -> loadHomeContent(contentRows)
                            HomeContentType.MOVIES -> loadMoviesContent(contentRows)
                            HomeContentType.SERIES -> loadSeriesContent(contentRows)
                            else -> {}
                        }
                        contentRows
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error preloading full rows for $contentType", e)
                        fastRows
                    }
                }
                val fullRows = fullDeferred.await()
                val heroResult = heroDeferred.await()

                cachedCarouselRows[contentType] = fullRows
                cachedCarouselRowsTime[contentType] = System.currentTimeMillis()
                if (heroResult != null) {
                    cachedHeroItems[contentType] = heroResult
                }

                Log.d("HomeViewModel", "preloadTabIntoCache: $contentType cached — ${fullRows.size} rows, ${heroResult?.heroes?.size ?: 0} heroes")
                // Warm Coil caches so the first frame of the tab renders without placeholder pops
                preloadContentImages(fullRows, heroResult?.heroes ?: emptyList())
            }
        } catch (e: Exception) {
            Log.e("HomeViewModel", "CRITICAL ERROR preloading $contentType: ${e.message}", e)
        }
    }

    /**
     * Warm Coil's memory/disk cache for the visible content: hero backdrops
     * (current + next, for seamless auto-rotation) and the first posters of each
     * visible row. Non-blocking — only enqueues image requests.
     */
    private fun preloadContentImages(rows: List<CarouselRow>, heroes: List<HeroItem>) {
        try {
            // Hero backdrops (current + next, for seamless auto-rotation)
            heroes.take(2).forEach { hero ->
                imagePreloader.preloadBackdrop(hero.backdropUrl ?: hero.posterUrl)
            }
            // Posters of the first items of each visible row
            val posters = rows.take(8).flatMap { row -> row.items.take(12).map { it.posterUrl } }
            imagePreloader.preloadCarouselPosters(posters)
        } catch (e: Exception) {
            // Preloading is best-effort — never let it break the UI
        }
    }

    /**
     * Check if the current visible tab is still loading.
     */
    fun isCurrentTabLoading(): Boolean = _uiState.value.isLoading
    
    /**
     * Suspend function that waits for a tab to be ready, with timeout.
     * Returns true if ready, false if timed out.
     */
    suspend fun waitForTabReady(type: HomeContentType, timeoutMs: Long = 30_000): Boolean {
        val start = System.currentTimeMillis()
        while (System.currentTimeMillis() - start < timeoutMs) {
            if (isReadyForTab(type)) return true
            kotlinx.coroutines.delay(200)
        }
        Log.w("HomeViewModel", "waitForTabReady timed out for $type after ${timeoutMs}ms")
        return false
    }

    
    /**
     * Navigate to next hero
     */
    fun nextHero() {
        // Preload the upcoming hero's backdrop so the 7s auto-rotation slides are seamless
        preloadAdjacentHeroBackdrop(offset = 1)
        _uiState.update { state ->
            val newIndex = if (state.heroItems.isNotEmpty()) {
                (state.currentHeroIndex + 1) % state.heroItems.size
            } else 0
            state.copy(currentHeroIndex = newIndex)
        }
    }
    
    /**
     * Navigate to previous hero
     */
    fun prevHero() {
        // Preload the upcoming hero's backdrop before navigating to it
        preloadAdjacentHeroBackdrop(offset = -1)
        _uiState.update { state ->
            val newIndex = if (state.heroItems.isNotEmpty()) {
                if (state.currentHeroIndex == 0) state.heroItems.size - 1
                else state.currentHeroIndex - 1
            } else 0
            state.copy(currentHeroIndex = newIndex)
        }
    }

    /**
     * Preload the hero backdrop at [offset] from the current one (for smooth rotation).
     */
    private fun preloadAdjacentHeroBackdrop(offset: Int) {
        val heroes = _uiState.value.heroItems
        if (heroes.isNotEmpty()) {
            val index = (heroes.size + _uiState.value.currentHeroIndex + offset) % heroes.size
            heroes.getOrNull(index)?.let { hero ->
                imagePreloader.preloadBackdrop(hero.backdropUrl ?: hero.posterUrl)
            }
        }
    }
    
    /**
     * Get a random movie or series for the "Random" button
     * Returns Pair(contentId, contentType) or null if no content available
     */
    suspend fun getRandomContent(): Pair<Long, String>? {
        return withContext(Dispatchers.IO) {
            try {
                // Get random from both movies and series based on current tab
                val randomMovie = movieDao.getRandomMovies(1).firstOrNull()
                val randomSeries = seriesDao.getRandomSeries(1).firstOrNull()
                
                // Pick one at random
                val choices = listOfNotNull(
                    randomMovie?.let { Pair(it.id, ContentType.MOVIE.name) },
                    randomSeries?.let { Pair(it.id, ContentType.SERIES.name) }
                )
                
                if (choices.isEmpty()) return@withContext null
                
                choices.random()
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error getting random content", e)
                null
            }
        }
    }
    
    /**
     * Load favorite categories from database
     */
    private fun loadFavoriteCategories() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val movieFavorites = favoriteCategoryDao.getFavoriteCategoriesByType(currentProfileId, "movies")
                _favoriteMovieCategories.value = movieFavorites.map { it.categoryName }.toSet()
                
                val seriesFavorites = favoriteCategoryDao.getFavoriteCategoriesByType(currentProfileId, "series")
                _favoriteSeriesCategories.value = seriesFavorites.map { it.categoryName }.toSet()
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading favorite categories", e)
            }
        }
    }
    
    /**
     * Toggle favorite status for a category
     * @param categoryName The category name to toggle
     * @param isMovies true for movie category, false for series
     */
    fun toggleFavoriteCategory(categoryName: String, isMovies: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val categoryType = if (isMovies) "movies" else "series"
                
                // Strip the count suffix from category name (e.g., "4k UHD (377)" -> "4k UHD")
                val cleanCategoryName = categoryName
                    .replace(Regex("\\s*\\(\\d+\\)$"), "")  // Remove " (123)" at end
                    .trim()
                
                Log.d("HomeViewModel", "Toggling favorite: original='$categoryName', clean='$cleanCategoryName', type=$categoryType")
                
                val favoriteCategory = it.wavestream.app.data.database.entity.FavoriteCategory(
                    profileId = currentProfileId,
                    categoryType = categoryType,
                    categoryName = cleanCategoryName
                )
                
                val isNowFavorite = favoriteCategoryDao.toggleFavoriteCategory(favoriteCategory)
                
                // Update state with clean name
                if (isMovies) {
                    _favoriteMovieCategories.value = if (isNowFavorite) {
                        _favoriteMovieCategories.value + cleanCategoryName
                    } else {
                        _favoriteMovieCategories.value - cleanCategoryName
                    }
                } else {
                    _favoriteSeriesCategories.value = if (isNowFavorite) {
                        _favoriteSeriesCategories.value + cleanCategoryName
                    } else {
                        _favoriteSeriesCategories.value - cleanCategoryName
                    }
                }
                
                Log.d("HomeViewModel", "Category '$cleanCategoryName' (type=$categoryType, profileId=$currentProfileId) favorite status: $isNowFavorite")
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error toggling favorite category", e)
            }
        }
    }
    
    /**
     * Load hero items - prioritize continue watching, fallback to popular carousels
     * Returns Pair(heroItems, isContinueWatching)
     */
    private suspend fun loadHeroItems(@Suppress("UNUSED_PARAMETER") filterType: ContentType): HeroPairData? {
        return withContext(Dispatchers.IO) {
            try {
                Log.d("HomeViewModel", "loadHeroItems: Loading heroes for filterType=$filterType")

                val mergedHeroes = mutableListOf<HeroItem>()
                val seenIds = mutableSetOf<Pair<Long, String>>() // (id, contentType) to deduplicate

                fun addHero(item: HeroItem?) {
                    if (item != null && seenIds.add(item.id to item.contentType)) {
                        mergedHeroes.add(item)
                    }
                }

                // === Priority 1: Continue Watching ===
                val allContinueWatching = watchProgressDao.getContinueWatching(currentProfileId, 10)
                Log.d("HomeViewModel", "loadHeroItems: profileId=$currentProfileId, allContinueWatching=${allContinueWatching.size}")

                val continueWatching = allContinueWatching.filter { progress ->
                    when (filterType) {
                        ContentType.MOVIE -> progress.contentType == ContentType.MOVIE
                        ContentType.SERIES -> progress.contentType in listOf(ContentType.SERIES, ContentType.EPISODE)
                        else -> false
                    }
                }.filter { progress ->
                    // Filter out series where the user finished the last episode of the last season
                    if (progress.contentType in listOf(ContentType.SERIES, ContentType.EPISODE) &&
                        progress.season != null && progress.episode != null) {
                        val seriesId = progress.seriesId ?: progress.contentId
                        val seasonNumbers = episodeDao.getSeasonNumbers(seriesId)
                        val maxSeason = seasonNumbers.maxOrNull()
                        if (maxSeason != null && progress.season == maxSeason) {
                            val lastEp = episodeDao.getLastEpisodeOfSeason(seriesId, maxSeason)
                            if (lastEp != null && progress.episode == lastEp.episodeNumber) {
                                // Last episode of last season — auto-mark as completed
                                if (!progress.isCompleted) {
                                    watchProgressDao.upsert(progress.copy(isCompleted = true))
                                }
                                false  // Remove from continue watching heroes
                            } else true
                        } else true
                    } else true
                }
                Log.d("HomeViewModel", "loadHeroItems: filtered continueWatching=${continueWatching.size}")

                // Build CW heroes in parallel for faster OMDB/TMDB fetches
                val cwHeroes = coroutineScope {
                    continueWatching.take(5).map { progress ->
                        async { buildHeroItem(progress, filterType) }
                    }.awaitAll().filterNotNull()
                }
                cwHeroes.forEach { addHero(it) }
                Log.d("HomeViewModel", "loadHeroItems: CW heroes added=${cwHeroes.size}")

                // === Priority 2: Next episode after completion (SERIES only) ===
                if (filterType == ContentType.SERIES) {
                    val recentAll = watchProgressDao.getRecentlyWatched(currentProfileId, 10)
                    val recentCompleted = recentAll.filter {
                        it.contentType in listOf(ContentType.SERIES, ContentType.EPISODE) && it.isCompleted
                    }
                    Log.d("HomeViewModel", "loadHeroItems: recentCompleted series=${recentCompleted.size}")

                    for (progress in recentCompleted) {
                        if (mergedHeroes.size >= 10) break
                        val seriesId = progress.seriesId ?: continue
                        val season = progress.season ?: continue
                        val episode = progress.episode ?: continue

                        if (seenIds.any { it.first == seriesId && it.second == ContentType.SERIES.name }) continue

                        val totalEpisodes = episodeDao.getCountBySeries(seriesId)
                        val allSeriesProgress = watchProgressDao.getRecentlyWatched(currentProfileId, 200)
                            .filter { it.seriesId == seriesId && it.isCompleted }
                            .distinctBy { Pair(it.season, it.episode) }
                        if (allSeriesProgress.size >= totalEpisodes && totalEpisodes > 0) {
                            Log.d("HomeViewModel", "loadHeroItems: Series $seriesId fully watched, skipping")
                            continue
                        }

                        val nextEpisode = episodeDao.getNextEpisode(seriesId, season, episode) ?: continue
                        Log.d("HomeViewModel", "loadHeroItems: found next episode S${nextEpisode.seasonNumber}E${nextEpisode.episodeNumber} for seriesId=$seriesId")

                        var series = seriesDao.getSeriesById(seriesId) ?: continue

                        if (series.tmdbTrailerKey == null) {
                            try { series = tmdbService.enrichSeriesDetails(series) } catch (_: Exception) {}
                        }

                        val heroItem = buildHeroItemFromSeries(
                            series,
                            resumeMinutes = null,
                            progressPercent = null,
                            resumeEpisodeSeason = nextEpisode.seasonNumber,
                            resumeEpisodeNumber = nextEpisode.episodeNumber
                        )
                        addHero(heroItem)
                        Log.d("HomeViewModel", "loadHeroItems: next-episode hero added for seriesId=$seriesId")
                    }
                }

                // === Priority 3: Taste-based recommendations ===
                if (mergedHeroes.size < 10) {
                    try {
                        val recommendations = recommendationEngine.generateRecommendations(currentProfileId)
                        Log.d("HomeViewModel", "loadHeroItems: recommendations from engine=${recommendations.size}")

                        for (rec in recommendations) {
                            if (mergedHeroes.size >= 10) break
                            val heroItem = buildHeroItemFromRecommendation(rec, filterType)
                            addHero(heroItem)
                        }
                        Log.d("HomeViewModel", "loadHeroItems: recommendation heroes added, total now=${mergedHeroes.size}")
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "loadHeroItems: Error loading recommendation heroes", e)
                    }
                }

                // === Priority 4: Popular/trending fallback ===
                if (mergedHeroes.size < 5) {
                    Log.d("HomeViewModel", "loadHeroItems: Merged only ${mergedHeroes.size} heroes, loading popular fallback for filterType=$filterType")

                    val popularHeroes = when (filterType) {
                        ContentType.MOVIE -> {
                            val popularMovies = loadPopularMovies()
                                ?.filter { movie ->
                                    !ContentFilters.shouldExcludeMovieFromHero(movie.name, movie.category) &&
                                    (movie.backdropUrl != null || movie.posterUrl != null)
                                } ?: emptyList()

                            val candidateMovies = if (popularMovies.isNotEmpty()) {
                                popularMovies.shuffled().take(5)
                            } else {
                                movieDao.getFullyEnrichedMovies(10).shuffled().take(5)
                            }

                            // Build popular movie heroes in parallel
                            coroutineScope {
                                candidateMovies.map { movie ->
                                    async {
                                        val enrichedMovie = if (movie.omdbImdbRating == null || movie.omdbRottenTomatoesScore == null || movie.omdbMetacriticScore == null || movie.tmdbTrailerKey == null) {
                                            try {
                                                val withTmdb = if (movie.tmdbId == null || movie.tmdbOverview == null || movie.tmdbTrailerKey == null) {
                                                    try { tmdbService.enrichMovieDetails(movie) } catch (e: Exception) { movie }
                                                } else movie
                                                val ratings = withTmdb.tmdbImdbId?.let { imdbId ->
                                                    imdbRatingsRepository.getRatingsByImdbId(imdbId)
                                                } ?: imdbRatingsRepository.getRatingsByTitle(
                                                    withTmdb.tmdbOriginalTitle ?: withTmdb.title,
                                                    withTmdb.year,
                                                    "movie"
                                                )
                                                if (ratings != null) {
                                                    val withRatings = withTmdb.copy(
                                                        omdbImdbRating = ratings.getFormattedImdbRating(),
                                                        omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                                                        omdbMetacriticScore = ratings.metacriticScore,
                                                        omdbAudienceScore = ratings.audienceScore,
                                                        omdbLastFetchAt = System.currentTimeMillis()
                                                    )
                                                    movieDao.update(withRatings)
                                                    withRatings
                                                } else withTmdb
                                            } catch (e: Exception) {
                                                Log.e("HomeViewModel", "Error enrichment movie for hero: ${movie.name}", e)
                                                movie
                                            }
                                        } else movie
                                        buildHeroItemFromMovie(enrichedMovie)
                                    }
                                }.awaitAll()
                            }
                        }
                        ContentType.SERIES -> {
                            val popularSeries = loadPopularSeries()
                                ?.filter { series ->
                                    !ContentFilters.shouldExcludeSeriesFromHero(series.name, series.category) &&
                                    (series.backdropUrl != null || series.posterUrl != null)
                                } ?: emptyList()

                            val candidateSeries = if (popularSeries.isNotEmpty()) {
                                popularSeries.shuffled().take(5)
                            } else {
                                seriesDao.getFullyEnrichedSeries(10).shuffled().take(5)
                            }

                            // Build popular series heroes in parallel
                            coroutineScope {
                                candidateSeries.map { series ->
                                    async {
                                        val enrichedSeries = if (series.omdbImdbRating == null || series.omdbRottenTomatoesScore == null || series.omdbMetacriticScore == null || series.tmdbTrailerKey == null) {
                                            try {
                                                val withTmdb = if (series.tmdbId == null || series.tmdbOverview == null || series.tmdbTrailerKey == null) {
                                                    try { tmdbService.enrichSeriesDetails(series) } catch (e: Exception) { series }
                                                } else series
                                                val ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                                                    imdbId = withTmdb.tmdbImdbId,
                                                    originalTitle = withTmdb.title,
                                                    englishTitle = withTmdb.tmdbOriginalName ?: withTmdb.tmdbName,
                                                    year = withTmdb.year,
                                                    type = "series"
                                                )
                                                if (ratings != null) {
                                                    val withRatings = withTmdb.copy(
                                                        omdbImdbRating = ratings.getFormattedImdbRating(),
                                                        omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                                                        omdbMetacriticScore = ratings.metacriticScore,
                                                        omdbAudienceScore = ratings.audienceScore,
                                                        omdbLastFetchAt = System.currentTimeMillis()
                                                    )
                                                    seriesDao.update(withRatings)
                                                    withRatings
                                                } else withTmdb
                                            } catch (e: Exception) {
                                                Log.e("HomeViewModel", "Error enrichment series for hero: ${series.name}", e)
                                                series
                                            }
                                        } else series
                                        buildHeroItemFromSeries(enrichedSeries)
                                    }
                                }.awaitAll()
                            }
                        }
                        else -> emptyList()
                    }

                    popularHeroes.forEach { addHero(it) }
                    Log.d("HomeViewModel", "loadHeroItems: popular heroes added, total now=${mergedHeroes.size}")
                }

                val hasAnyCW = mergedHeroes.any { it.resumeMinutes != null || it.resumeEpisodeSeason != null }
                Log.d("HomeViewModel", "loadHeroItems: final mergedHeroes=${mergedHeroes.size}, hasAnyCW=$hasAnyCW")
                HeroPairData(mergedHeroes.toList(), hasAnyCW)
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading hero items: ${e.message}", e)
                null
            }
        }
    }
    
    /**
     * Build HeroItem from WatchProgress (continue watching)
     */
    private suspend fun buildHeroItem(progress: WatchProgress, @Suppress("UNUSED_PARAMETER") filterType: ContentType): HeroItem? {
        val remainingMinutes = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(1)
        val progressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
        
        Log.d("HomeViewModel", "buildHeroItem: contentType=${progress.contentType}, contentId=${progress.contentId}, seriesId=${progress.seriesId}")
        
        return when (progress.contentType) {
            ContentType.MOVIE -> {
                var movie = movieDao.getMovieById(progress.contentId)
                Log.d("HomeViewModel", "buildHeroItem: movie lookup for id=${progress.contentId}, found=${movie != null}")
                if (movie == null) return null
                
                // Ensure trailer AND vote are available
                if (movie!!.tmdbTrailerKey == null || movie!!.tmdbVoteAverage == null) {
                    try {
                        movie = tmdbService.enrichMovieDetails(movie!!)
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error enrichment movie for continue watching hero: ${movie?.name}", e)
                    }
                }
                
                buildHeroItemFromMovie(movie!!, remainingMinutes, progressPercent)
            }
            ContentType.SERIES, ContentType.EPISODE -> {
                val seriesId = progress.seriesId ?: progress.contentId
                var series = seriesDao.getSeriesById(seriesId)
                Log.d("HomeViewModel", "buildHeroItem: series lookup for id=$seriesId, found=${series != null}")
                if (series == null) return null
                
                // Ensure trailer AND vote are available
                if (series!!.tmdbTrailerKey == null || series!!.tmdbVoteAverage == null) {
                    try {
                        series = tmdbService.enrichSeriesDetails(series!!)
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error enrichment series for continue watching hero: ${series?.name}", e)
                    }
                }
                
                // Pass season and episode info from WatchProgress
                buildHeroItemFromSeries(
                    series!!, 
                    remainingMinutes, 
                    progressPercent,
                    resumeEpisodeSeason = progress.season,
                    resumeEpisodeNumber = progress.episode
                )
            }
            else -> null
        }
    }
    
    /**
     * Build HeroItem from a RecommendedItem (from RecommendationEngine)
     * Filters by content type and enriches with ratings/trailer
     */
    private suspend fun buildHeroItemFromRecommendation(
        rec: it.wavestream.app.data.tmdb.RecommendedItem,
        filterType: ContentType
    ): HeroItem? {
        return when {
            rec.localMovie != null && (filterType == ContentType.MOVIE || filterType != ContentType.SERIES) -> {
                var movie = rec.localMovie!!
                if (movie.omdbImdbRating == null || movie.omdbRottenTomatoesScore == null || movie.omdbMetacriticScore == null || movie.tmdbTrailerKey == null) {
                    try {
                        if (movie.tmdbId == null || movie.tmdbOverview == null || movie.tmdbTrailerKey == null) {
                            try { movie = tmdbService.enrichMovieDetails(movie) } catch (_: Exception) {}
                        }
                        val ratings = movie.tmdbImdbId?.let { imdbId ->
                            imdbRatingsRepository.getRatingsByImdbId(imdbId)
                        } ?: imdbRatingsRepository.getRatingsByTitle(
                            movie.tmdbOriginalTitle ?: movie.title,
                            movie.year,
                            "movie"
                        )
                        // Metacritic scraper fallback when OMDB Metascore is missing.
                        val effectiveRatings = if (ratings?.metacriticScore == null) {
                            val mc = imdbRatingsRepository.fetchMetacriticScore(
                                movie.tmdbOriginalTitle ?: movie.title, movie.year, true
                            )
                            if (mc != null) ratings?.copy(metacriticScore = mc) else ratings
                        } else ratings
                        if (effectiveRatings != null) {
                            movie = movie.copy(
                                omdbImdbRating = effectiveRatings.getFormattedImdbRating(),
                                omdbRottenTomatoesScore = effectiveRatings.rottenTomatoesScore,
                                omdbMetacriticScore = effectiveRatings.metacriticScore,
                                omdbAudienceScore = effectiveRatings.audienceScore,
                                omdbLastFetchAt = System.currentTimeMillis()
                            )
                            viewModelScope.launch(Dispatchers.IO) { movieDao.update(movie) }
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error enriching rec movie: ${movie.name}", e)
                    }
                }
                buildHeroItemFromMovie(movie)
            }
            rec.localSeries != null && (filterType == ContentType.SERIES || filterType != ContentType.MOVIE) -> {
                var series = rec.localSeries!!
                if (series.omdbImdbRating == null || series.omdbRottenTomatoesScore == null || series.omdbMetacriticScore == null || series.tmdbTrailerKey == null) {
                    try {
                        if (series.tmdbId == null || series.tmdbOverview == null || series.tmdbTrailerKey == null) {
                            try { series = tmdbService.enrichSeriesDetails(series) } catch (_: Exception) {}
                        }
                        val ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                            imdbId = series.tmdbImdbId,
                            originalTitle = series.title,
                            englishTitle = series.tmdbOriginalName ?: series.tmdbName,
                            year = series.year,
                            type = "series"
                        )
                        // getRatingsWithFallbacks already includes the Metacritic fallback.
                        if (ratings != null) {
                            series = series.copy(
                                omdbImdbRating = ratings.getFormattedImdbRating(),
                                omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                                omdbMetacriticScore = ratings.metacriticScore,
                                omdbAudienceScore = ratings.audienceScore,
                                omdbLastFetchAt = System.currentTimeMillis()
                            )
                            viewModelScope.launch(Dispatchers.IO) { seriesDao.update(series) }
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error enriching rec series: ${series.name}", e)
                    }
                }
                buildHeroItemFromSeries(series)
            }
            else -> null
        }
    }
    
    /**
     * Build HeroItem from Movie entity
     * Loads plot from Xtream API if not available from TMDB
     */
    private suspend fun buildHeroItemFromMovie(
        movie: Movie,
        resumeMinutes: Int? = null,
        progressPercent: Float? = null
    ): HeroItem {
        var actualResumeMinutes = resumeMinutes
        var actualProgressPercent = progressPercent

        if (actualResumeMinutes == null) {
            val progress = watchProgressDao.getProgress(currentProfileId, ContentType.MOVIE, movie.id)
            if (progress != null && !progress.isCompleted) {
                actualResumeMinutes = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(1)
                actualProgressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
            }
        }
        // Format duration
        val durationStr = movie.tmdbRuntime?.let { mins ->
            if (mins >= 60) "${mins / 60}h ${mins % 60}m" else "${mins}m"
        }
        
        // Try to get overview from TMDB first, if null try Xtream API
        var overview = movie.tmdbOverview
        var cast = movie.tmdbCast
        var genres = movie.tmdbGenres
        
        // If overview is still null, try to load from Xtream API (like DetailsActivity does)
        if (overview.isNullOrEmpty() && movie.xtreamStreamId != null) {
            try {
                val playlist = playlistDao.getPlaylistById(movie.playlistId)
                if (playlist?.type == "xtream" && playlist.username != null && playlist.password != null) {
                    val baseUrl = playlist.url.trimEnd('/') + "/"
                    val moshi = com.squareup.moshi.Moshi.Builder()
                        .build()
                    val api = Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .client(OkHttpClient.Builder().build())
                        .addConverterFactory(MoshiConverterFactory.create(moshi))
                        .build()
                        .create(XtreamApiService::class.java)
                    
                    val vodInfo = api.getVodInfo(
                        username = playlist.username,
                        password = playlist.password,
                        vodId = movie.xtreamStreamId
                    )
                    
                    vodInfo.info?.let { info ->
                        overview = info.plot ?: overview
                        if (cast.isNullOrEmpty()) cast = info.cast
                        if (genres.isNullOrEmpty()) genres = info.genre
                    }
                    Log.d("HomeViewModel", "Loaded plot from Xtream for ${movie.name}: ${overview?.take(50)}")
                    
                    // Persist Xtream data to entity so it survives process death
                    if (overview != null || cast != null || genres != null) {
                        val updatedMovie = movie.copy(
                            xtreamPlot = overview?.takeIf { it.isNotEmpty() } ?: movie.xtreamPlot,
                            xtreamCast = cast?.takeIf { it.isNotEmpty() } ?: movie.xtreamCast,
                            xtreamGenre = genres?.takeIf { it.isNotEmpty() } ?: movie.xtreamGenre
                        )
                        viewModelScope.launch(Dispatchers.IO) { movieDao.update(updatedMovie) }
                    }
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading Xtream VOD info for ${movie.name}", e)
            }
        }

        // Check if OMDB ratings need refresh (logic from DetailsActivity)
        var currentMovie = movie
        val hasAnyOmdbRating = movie.omdbImdbRating != null || 
            movie.omdbRottenTomatoesScore != null || 
            movie.omdbMetacriticScore != null
        val needsOmdbRefresh = movie.omdbLastFetchAt == null || 
            !hasAnyOmdbRating || 
            System.currentTimeMillis() - movie.omdbLastFetchAt!! > 7 * 24 * 60 * 60 * 1000 // 7 days cache

        if (needsOmdbRefresh) {
            try {
                Log.d("HomeViewModel", "Fetching missing OMDB ratings for hero movie: ${movie.name}")
                var ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                    imdbId = movie.tmdbImdbId,
                    originalTitle = movie.name,
                    englishTitle = movie.tmdbOriginalTitle ?: movie.tmdbTitle,
                    year = movie.year,
                    type = "movie"
                )

                // Retry once after short delay if first attempt failed
                if (ratings == null) {
                    Log.d("HomeViewModel", "OMDB first attempt failed for ${movie.name}, retrying in 1.5s...")
                    kotlinx.coroutines.delay(1500)
                    ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                        imdbId = movie.tmdbImdbId,
                        originalTitle = movie.name,
                        englishTitle = movie.tmdbOriginalTitle ?: movie.tmdbTitle,
                        year = movie.year,
                        type = "movie"
                    )
                }

                if (ratings != null) {
                    currentMovie = movie.copy(
                        omdbImdbRating = ratings.getFormattedImdbRating(),
                        omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                        omdbMetacriticScore = ratings.metacriticScore,
                        omdbAudienceScore = ratings.audienceScore,
                        omdbLastFetchAt = System.currentTimeMillis()
                    )
                    
                    // If OMDB didn't provide audience score OR critics score, try RT scraper
                    if (currentMovie.omdbAudienceScore == null || currentMovie.omdbRottenTomatoesScore == null) {
                        val searchTitle = currentMovie.tmdbOriginalTitle ?: currentMovie.tmdbTitle ?: movie.name
                        val rtScores = imdbRatingsRepository.fetchRtScores(
                            title = searchTitle,
                            year = currentMovie.year,
                            isMovie = true
                        )
                        if (rtScores != null) {
                             currentMovie = currentMovie.copy(
                                 omdbAudienceScore = currentMovie.omdbAudienceScore ?: rtScores.audienceScore,
                                 omdbRottenTomatoesScore = currentMovie.omdbRottenTomatoesScore ?: rtScores.criticsScore
                             )
                        }
                    }
                    
                    // Save to database asynchronously
                    viewModelScope.launch(Dispatchers.IO) {
                        movieDao.update(currentMovie)
                    }
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error fetching OMDB ratings for hero movie ${movie.name}", e)
            }
        } else if (currentMovie.omdbAudienceScore == null || currentMovie.omdbRottenTomatoesScore == null) {
            // Logic added: If ratings are fresh but RT scores are missing, try to fetch them specifically
             try {
                Log.d("HomeViewModel", "Hero movie has ratings but missing RT scores: ${movie.name}")
                val searchTitle = currentMovie.tmdbOriginalTitle ?: currentMovie.tmdbTitle ?: movie.name
                val rtScores = imdbRatingsRepository.fetchRtScores(
                    title = searchTitle,
                    year = currentMovie.year,
                    isMovie = true
                )
                if (rtScores != null) {
                    val newAudience = currentMovie.omdbAudienceScore ?: rtScores.audienceScore
                    val newCritics = currentMovie.omdbRottenTomatoesScore ?: rtScores.criticsScore
                    
                    if (newAudience != currentMovie.omdbAudienceScore || newCritics != currentMovie.omdbRottenTomatoesScore) {
                        Log.d("HomeViewModel", "Fetched missing RT scores: Audience=$newAudience%, Critics=$newCritics%")
                        currentMovie = currentMovie.copy(
                            omdbAudienceScore = newAudience,
                            omdbRottenTomatoesScore = newCritics
                        )
                        // Save to database asynchronously
                        viewModelScope.launch(Dispatchers.IO) {
                            movieDao.update(currentMovie)
                        }
                    }
                }
             } catch (e: Exception) {
                 Log.e("HomeViewModel", "Error fetching separate RT scores for ${movie.name}", e)
             }
        }
        
        return HeroItem(
            id = currentMovie.id,
            title = currentMovie.title,
            backdropUrl = currentMovie.backdropUrl ?: currentMovie.posterUrl,
            posterUrl = currentMovie.posterUrl,
            contentType = ContentType.MOVIE.name,
            overview = overview,
            cast = cast,
            imdbRating = currentMovie.omdbImdbRating,
            rottenTomatoesScore = currentMovie.omdbRottenTomatoesScore,
            audienceScore = currentMovie.omdbAudienceScore,
            metacriticScore = currentMovie.omdbMetacriticScore,
            tmdbRating = currentMovie.tmdbVoteAverage,
            resumeMinutes = actualResumeMinutes,
            progressPercent = actualProgressPercent,
            year = currentMovie.year,
            duration = durationStr,
            genres = genres,
            totalDurationMinutes = currentMovie.tmdbRuntime,
            isFavorite = try {
                favoriteDao.isFavorite(currentProfileId, ContentType.MOVIE, currentMovie.id)
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error checking favorite status for movie ${currentMovie.id}", e)
                false
            },
            trailerKey = currentMovie.tmdbTrailerKey
        )
    }

    
    /**
     * Build HeroItem from Series entity
     * Loads plot from Xtream API if not available from TMDB
     */
    private suspend fun buildHeroItemFromSeries(
        series: Series,
        resumeMinutes: Int? = null,
        progressPercent: Float? = null,
        resumeEpisodeSeason: Int? = null,
        resumeEpisodeNumber: Int? = null
    ): HeroItem {
        var actualResumeMinutes = resumeMinutes
        var actualProgressPercent = progressPercent
        var actualResumeEpisodeSeason = resumeEpisodeSeason
        var actualResumeEpisodeNumber = resumeEpisodeNumber

        if (actualResumeMinutes == null) {
            val progress = watchProgressDao.getSeriesProgress(currentProfileId, series.id)
            if (progress != null && !progress.isCompleted) {
                actualResumeMinutes = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(1)
                actualProgressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
                actualResumeEpisodeSeason = progress.season
                actualResumeEpisodeNumber = progress.episode
            }
        }
        // Try to get overview from TMDB first, if null try Xtream API
        var overview = series.tmdbOverview
        var cast = series.tmdbCast
        var genres = series.tmdbGenres
        
        // If overview is still null, try to load from Xtream API (like DetailsActivity does)
        if (overview.isNullOrEmpty() && series.xtreamSeriesId != null) {
            try {
                val playlist = playlistDao.getPlaylistById(series.playlistId)
                if (playlist?.type == "xtream" && playlist.username != null && playlist.password != null) {
                    val baseUrl = playlist.url.trimEnd('/') + "/"
                    val moshi = com.squareup.moshi.Moshi.Builder()
                        .build()
                    val api = Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .client(OkHttpClient.Builder().build())
                        .addConverterFactory(MoshiConverterFactory.create(moshi))
                        .build()
                        .create(XtreamApiService::class.java)
                    
                    val seriesInfo = api.getSeriesInfo(
                        username = playlist.username,
                        password = playlist.password,
                        seriesId = series.xtreamSeriesId
                    )
                    
                    seriesInfo.info?.let { info ->
                        overview = info.plot ?: overview
                        if (cast.isNullOrEmpty()) cast = info.cast
                        if (genres.isNullOrEmpty()) genres = info.genre
                    }
                    Log.d("HomeViewModel", "Loaded plot from Xtream for ${series.name}: ${overview?.take(50)}")
                    
                    // Persist Xtream data to entity so it survives process death
                    if (overview != null || cast != null || genres != null) {
                        val updatedSeries = series.copy(
                            xtreamPlot = overview?.takeIf { it.isNotEmpty() } ?: series.xtreamPlot,
                            xtreamCast = cast?.takeIf { it.isNotEmpty() } ?: series.xtreamCast,
                            xtreamGenre = genres?.takeIf { it.isNotEmpty() } ?: series.xtreamGenre
                        )
                        viewModelScope.launch(Dispatchers.IO) { seriesDao.update(updatedSeries) }
                    }
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading Xtream series info for ${series.name}", e)
            }
        }

        // Check if OMDB ratings need refresh (logic from DetailsActivity)
        var currentSeries = series
        val hasAnyOmdbRating = series.omdbImdbRating != null || 
            series.omdbRottenTomatoesScore != null || 
            series.omdbMetacriticScore != null
        val needsOmdbRefresh = series.omdbLastFetchAt == null || 
            !hasAnyOmdbRating || 
            System.currentTimeMillis() - series.omdbLastFetchAt!! > 7 * 24 * 60 * 60 * 1000 // 7 days cache

        if (needsOmdbRefresh) {
            try {
                Log.d("HomeViewModel", "Fetching missing OMDB ratings for hero series: ${series.name}")
                var ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                    imdbId = series.tmdbImdbId,
                    originalTitle = series.name,
                    englishTitle = series.tmdbOriginalName ?: series.tmdbName,
                    year = series.year,
                    type = "series"
                )

                // Retry once after short delay if first attempt failed
                if (ratings == null) {
                    Log.d("HomeViewModel", "OMDB first attempt failed for ${series.name}, retrying in 1.5s...")
                    kotlinx.coroutines.delay(1500)
                    ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                        imdbId = series.tmdbImdbId,
                        originalTitle = series.name,
                        englishTitle = series.tmdbOriginalName ?: series.tmdbName,
                        year = series.year,
                        type = "series"
                    )
                }

                if (ratings != null) {
                    currentSeries = series.copy(
                        omdbImdbRating = ratings.getFormattedImdbRating(),
                        omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                        omdbMetacriticScore = ratings.metacriticScore,
                        omdbAudienceScore = ratings.audienceScore,
                        omdbLastFetchAt = System.currentTimeMillis()
                    )
                    
                    // If OMDB didn't provide audience score OR critics score, try RT scraper
                    if (currentSeries.omdbAudienceScore == null || currentSeries.omdbRottenTomatoesScore == null) {
                        val searchTitle = series.tmdbOriginalName ?: series.tmdbName ?: series.name
                        val rtScores = imdbRatingsRepository.fetchRtScores(
                            title = searchTitle,
                            year = currentSeries.year,
                            isMovie = false
                        )
                        if (rtScores != null) {
                             currentSeries = currentSeries.copy(
                                 omdbAudienceScore = currentSeries.omdbAudienceScore ?: rtScores.audienceScore,
                                 omdbRottenTomatoesScore = currentSeries.omdbRottenTomatoesScore ?: rtScores.criticsScore
                             )
                        }
                    }
                    
                    // Save to database asynchronously
                    viewModelScope.launch(Dispatchers.IO) {
                        seriesDao.update(currentSeries)
                    }
                }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error fetching OMDB ratings for hero series ${series.name}", e)
            }
        } else if (currentSeries.omdbAudienceScore == null || currentSeries.omdbRottenTomatoesScore == null) {
            // Logic added: If ratings are fresh but RT scores are missing, try to fetch them specifically
             try {
                Log.d("HomeViewModel", "Hero series has ratings but missing RT scores: ${series.name}")
                val searchTitle = series.tmdbOriginalName ?: series.tmdbName ?: series.name
                val rtScores = imdbRatingsRepository.fetchRtScores(
                    title = searchTitle,
                    year = currentSeries.year,
                    isMovie = false
                )
                if (rtScores != null) {
                    val newAudience = currentSeries.omdbAudienceScore ?: rtScores.audienceScore
                    val newCritics = currentSeries.omdbRottenTomatoesScore ?: rtScores.criticsScore
                    
                    if (newAudience != currentSeries.omdbAudienceScore || newCritics != currentSeries.omdbRottenTomatoesScore) {
                        Log.d("HomeViewModel", "Fetched missing RT scores for series: Audience=$newAudience%, Critics=$newCritics%")
                        currentSeries = currentSeries.copy(
                            omdbAudienceScore = newAudience,
                            omdbRottenTomatoesScore = newCritics
                        )
                        // Save to database asynchronously
                        viewModelScope.launch(Dispatchers.IO) {
                            seriesDao.update(currentSeries)
                        }
                    }
                }
             } catch (e: Exception) {
                 Log.e("HomeViewModel", "Error fetching separate RT scores for series ${series.name}", e)
             }
        }
        
        // Check for new episode
        var newEpisodeSeason: Int? = null
        var newEpisodeNumber: Int? = null

        if (currentSeries.latestEpisodeAddedAt != null &&
            currentSeries.latestEpisodeSeason != null &&
            currentSeries.latestEpisodeNumber != null) {

            val episode = episodeDao.getEpisode(currentSeries.id, currentSeries.latestEpisodeSeason!!, currentSeries.latestEpisodeNumber!!)
            if (episode != null) {
                val progress = watchProgressDao.getProgress(currentProfileId, ContentType.EPISODE, episode.id)
                if (progress == null || !progress.isCompleted) {
                    newEpisodeSeason = currentSeries.latestEpisodeSeason
                    newEpisodeNumber = currentSeries.latestEpisodeNumber
                }
            }
        }

        return HeroItem(
            id = currentSeries.id,
            title = currentSeries.title,
            backdropUrl = currentSeries.backdropUrl ?: currentSeries.posterUrl,
            posterUrl = currentSeries.posterUrl,
            contentType = ContentType.SERIES.name,
            overview = overview,
            cast = cast,
            imdbRating = currentSeries.omdbImdbRating,
            rottenTomatoesScore = currentSeries.omdbRottenTomatoesScore,
            audienceScore = currentSeries.omdbAudienceScore,
            metacriticScore = currentSeries.omdbMetacriticScore,
            tmdbRating = currentSeries.tmdbVoteAverage,
            resumeMinutes = actualResumeMinutes,
            progressPercent = actualProgressPercent,
            year = currentSeries.year,
            duration = null,  // Series don't have single duration
            genres = genres,
            seasonCount = currentSeries.tmdbNumberOfSeasons ?: currentSeries.seasonCount.takeIf { it > 0 },
            isFavorite = try {
                favoriteDao.isFavorite(currentProfileId, ContentType.SERIES, currentSeries.id)
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error checking favorite status for series ${currentSeries.id}", e)
                false
            },
            trailerKey = currentSeries.tmdbTrailerKey,
            resumeEpisodeSeason = actualResumeEpisodeSeason,
            resumeEpisodeNumber = actualResumeEpisodeNumber,
            newEpisodeSeason = newEpisodeSeason,
            newEpisodeNumber = newEpisodeNumber
        )
    }

    /**
     * Dynamically updates the watch progress fields of a list of HeroItems using the database.
     * This is useful to correct stale progress data when items are loaded from cache or when returning to home.
     */
    private suspend fun refreshHeroItemsWatchProgress(heroes: List<HeroItem>): List<HeroItem> {
        return withContext(Dispatchers.IO) {
            heroes.map { hero ->
                if (hero.contentType == ContentType.MOVIE.name) {
                    val progress = watchProgressDao.getProgress(currentProfileId, ContentType.MOVIE, hero.id)
                    if (progress != null && !progress.isCompleted) {
                        val remainingMinutes = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(1)
                        val progressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
                        hero.copy(
                            resumeMinutes = remainingMinutes,
                            progressPercent = progressPercent
                        )
                    } else {
                        hero.copy(
                            resumeMinutes = null,
                            progressPercent = null
                        )
                    }
                } else if (hero.contentType == ContentType.SERIES.name) {
                    val progress = watchProgressDao.getSeriesProgress(currentProfileId, hero.id)
                    if (progress != null && !progress.isCompleted) {
                        val remainingMinutes = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(1)
                        val progressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
                        hero.copy(
                            resumeMinutes = remainingMinutes,
                            progressPercent = progressPercent,
                            resumeEpisodeSeason = progress.season,
                            resumeEpisodeNumber = progress.episode
                        )
                    } else {
                        hero.copy(
                            resumeMinutes = null,
                            progressPercent = null,
                            resumeEpisodeSeason = null,
                            resumeEpisodeNumber = null
                        )
                    }
                } else {
                    hero
                }
            }
        }
    }
    
    /**
     * Refresh the rating fields of cached heroes from the DB. Cached heroes are
     * often written before background TMDB/OMDB enrichment has finished, so their
     * imdbRating/tmdbRating/etc. are null. On cache load we re-read the fresh values
     * from the database and patch them in (no network calls here).
     */
    private suspend fun refreshHeroItemsRatings(heroes: List<HeroItem>): List<HeroItem> {
        return withContext(Dispatchers.IO) {
            heroes.map { hero ->
                try {
                    when (hero.contentType) {
                        ContentType.MOVIE.name -> {
                            val movie = movieDao.getMovieById(hero.id)
                            movie?.let {
                                hero.copy(
                                    imdbRating = it.omdbImdbRating,
                                    rottenTomatoesScore = it.omdbRottenTomatoesScore,
                                    audienceScore = it.omdbAudienceScore,
                                    metacriticScore = it.omdbMetacriticScore,
                                    tmdbRating = it.tmdbVoteAverage
                                )
                            } ?: hero
                        }
                        ContentType.SERIES.name -> {
                            val series = seriesDao.getSeriesById(hero.id)
                            series?.let {
                                hero.copy(
                                    imdbRating = it.omdbImdbRating,
                                    rottenTomatoesScore = it.omdbRottenTomatoesScore,
                                    audienceScore = it.omdbAudienceScore,
                                    metacriticScore = it.omdbMetacriticScore,
                                    tmdbRating = it.tmdbVoteAverage
                                )
                            } ?: hero
                        }
                        else -> hero
                    }
                } catch (e: Exception) {
                    Log.e("HomeViewModel", "Error refreshing ratings for hero ${hero.id}", e)
                    hero
                }
            }
        }
    }
    
    /**
     * Load hero items for HOME tab (mix of movies and series from continue watching or popular)
     */
    private suspend fun loadHomeHeroItems(): HeroPairData? {
        return withContext(Dispatchers.IO) {
            try {
                val mergedHeroes = mutableListOf<HeroItem>()
                val seenIds = mutableSetOf<Pair<Long, String>>()

                fun addHero(item: HeroItem?) {
                    if (item != null && seenIds.add(item.id to item.contentType)) {
                        mergedHeroes.add(item)
                    }
                }

                // Priority 1: Continue Watching (both movies and series)
                val allContinueWatching = watchProgressDao.getContinueWatching(currentProfileId, 10)
                // Build CW heroes in parallel for faster OMDB/TMDB fetches
                val cwHeroes = coroutineScope {
                    allContinueWatching.take(5).map { progress ->
                        async { buildHeroItem(progress, progress.contentType) }
                    }.awaitAll().filterNotNull()
                }
                cwHeroes.forEach { addHero(it) }
                Log.d("HomeViewModel", "loadHomeHeroItems: CW heroes added=${cwHeroes.size}")

                // Priority 2: Taste-based recommendations
                if (mergedHeroes.size < 10) {
                    try {
                        val recommendations = recommendationEngine.generateRecommendations(currentProfileId)
                        Log.d("HomeViewModel", "loadHomeHeroItems: recommendations from engine=${recommendations.size}")

                        for (rec in recommendations) {
                            if (mergedHeroes.size >= 10) break
                            val heroItem = buildHeroItemFromRecommendation(rec, rec.localMovie?.let { ContentType.MOVIE } ?: ContentType.SERIES)
                            addHero(heroItem)
                        }
                        Log.d("HomeViewModel", "loadHomeHeroItems: rec heroes added, total now=${mergedHeroes.size}")
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "loadHomeHeroItems: Error loading recommendation heroes", e)
                    }
                }

                // Priority 3: Popular movies + series fallback
                if (mergedHeroes.size < 5) {
                    val popularMovies = loadPopularMovies()?.filter { movie ->
                        !ContentFilters.shouldExcludeMovieFromHero(movie.name, movie.category) &&
                        (movie.backdropUrl != null || movie.posterUrl != null)
                    } ?: emptyList()

                    val popularSeries = loadPopularSeries()?.filter { series ->
                        !ContentFilters.shouldExcludeSeriesFromHero(series.name, series.category) &&
                        (series.backdropUrl != null || series.posterUrl != null)
                    } ?: emptyList()

                    val candidates = (popularMovies.shuffled().take(3) + popularSeries.shuffled().take(3)).shuffled()
                    // Build popular heroes in parallel
                    coroutineScope {
                        candidates.map { content ->
                            async {
                                when (content) {
                                    is Movie -> buildHeroItemFromMovie(content)
                                    is Series -> buildHeroItemFromSeries(content)
                                    else -> null
                                }
                            }
                        }.awaitAll().filterNotNull()
                    }.forEach { addHero(it) }
                    Log.d("HomeViewModel", "loadHomeHeroItems: popular heroes added, total now=${mergedHeroes.size}")
                }

                val hasAnyCW = mergedHeroes.any { it.resumeMinutes != null || it.resumeEpisodeSeason != null }
                Log.d("HomeViewModel", "loadHomeHeroItems: final mergedHeroes=${mergedHeroes.size}, hasAnyCW=$hasAnyCW")
                if (mergedHeroes.isNotEmpty()) HeroPairData(mergedHeroes.toList(), hasAnyCW) else null
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading home heroes", e)
                null
            }
        }
    }
    
    /**
     * Load content for HOME tab (all content mixed, with genre carousels)
     */
    private suspend fun loadHomeContent(rows: MutableList<CarouselRow>, fastOnly: Boolean = false) {
        // Load in parallel for speed — use coroutineScope instead of viewModelScope
        // so tasks survive ViewModel destruction during preload from LoadingActivity
        coroutineScope {
        val popularMoviesDeferred = async(Dispatchers.IO) { loadPopularMovies() }
        val popularSeriesDeferred = async(Dispatchers.IO) { loadPopularSeries() }
        val continueWatchingDeferred = async(Dispatchers.IO) { loadContinueWatching() }
        // Slow parts (TMDB network): skipped in the fast pass so the home shows the
        // DB/cached rows immediately and the skeleton disappears; they fill in later.
        val recommendationsDeferred = if (fastOnly) null else async(Dispatchers.IO) { loadRecommendations() }
        val genreCarouselsDeferred = if (fastOnly) null else async(Dispatchers.IO) {
            recommendationEngine.generateGenreCarousels(currentProfileId)
        }
        
        // 1. Continue watching first
        continueWatchingDeferred.await()?.let { watchStates ->
            if (watchStates.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = context.getString(R.string.continue_watching),
                    items = watchStates.mapNotNull { it.toCarouselItem() }
                ))
            }
        }
        
        // 2. Recommendations for you
        recommendationsDeferred?.await()?.let { recs ->
            if (recs.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Raccomandati per te",
                    items = recs
                ))
            }
        }
        
        // 3. Film per te
        popularMoviesDeferred.await()?.let { movies ->
            if (movies.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Film per te",
                    items = movies.map { it.toCarouselItem() }
                ))
            }
        }
        
        // 4. Serie TV per te
        popularSeriesDeferred.await()?.let { series ->
            if (series.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Serie TV per te",
                    items = series.map { it.toCarouselItem() }
                ))
            }
        }
        
        // 5. Genre-based carousels (from TMDB discover)
        val genreCarousels = genreCarouselsDeferred?.await() ?: emptyMap()
        for ((genreId, items) in genreCarousels) {
            if (items.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = getGenreName(genreId),
                    items = items.mapNotNull { rec -> recommendedToCarouselItem(rec) }
                ))
            }
        }
        } // coroutineScope
    }
    
    /**
     * Convert RecommendedItem to CarouselItem
     */
    private fun recommendedToCarouselItem(rec: it.wavestream.app.data.tmdb.RecommendedItem): CarouselItem? {
        val posterUrl = when {
            rec.localMovie?.posterUrl != null -> rec.localMovie.posterUrl
            rec.localSeries?.posterUrl != null -> rec.localSeries.posterUrl
            rec.posterPath != null -> "https://image.tmdb.org/t/p/w342${rec.posterPath}"
            else -> null
        }
        val backdropUrl = rec.backdropPath?.let { "https://image.tmdb.org/t/p/w780$it" }
        return when {
            rec.localMovie != null -> CarouselItem(
                id = rec.localMovie.id,
                title = rec.title,
                posterUrl = posterUrl,
                backdropUrl = backdropUrl,
                contentType = ContentType.MOVIE.name,
                year = rec.year,
                rating = rec.voteAverage,
                ratingText = rec.voteAverage?.let { "%.1f".format(it) }
            )
            rec.localSeries != null -> CarouselItem(
                id = rec.localSeries.id,
                title = rec.title,
                posterUrl = posterUrl,
                backdropUrl = backdropUrl,
                contentType = ContentType.SERIES.name,
                year = rec.year,
                rating = rec.voteAverage,
                ratingText = rec.voteAverage?.let { "%.1f".format(it) }
            )
            else -> null
        }
    }
    
    /**
     * Map TMDB genre ID to Italian name
     */
    private fun getGenreName(genreId: Int): String {
        return when (genreId) {
            28 -> "Azione"
            12 -> "Avventura"
            16 -> "Animazione"
            35 -> "Commedia"
            80 -> "Crime"
            99 -> "Documentario"
            18 -> "Dramma"
            10751 -> "Famiglia"
            14 -> "Fantasy"
            36 -> "Storia"
            27 -> "Horror"
            10402 -> "Musica"
            9648 -> "Mistero"
            10749 -> "Romantico"
            878 -> "Fantascienza"
            53 -> "Thriller"
            10752 -> "Guerra"
            37 -> "Western"
            10759 -> "Azione & Avventura"
            10762 -> "Bambini"
            10763 -> "Notizie"
            10764 -> "Reality"
            10765 -> "Sci-Fi & Fantasy"
            10766 -> "Soap"
            10767 -> "Talk"
            10768 -> "Guerra & Politica"
            else -> "Genere"
        }
    }
    
    /**
     * Load content for MOVIES tab only
     * 6 carousels: Continua a guardare, Visti di recente, Film popolari,
     * Aggiunti di recente, Raccomandati, Categorie
     */
    private suspend fun loadMoviesContent(rows: MutableList<CarouselRow>, fastOnly: Boolean = false) {
        // 1. Continue watching movies
        loadContinueWatchingForTab(ContentType.MOVIE)?.let {
            if (it.isNotEmpty()) rows.add(CarouselRow(title = "Continua a guardare", items = it))
        }
        
        // 2. Recently watched movies (completed)
        loadRecentlyWatched(ContentType.MOVIE)?.let {
            if (it.isNotEmpty()) rows.add(CarouselRow(title = "Visti di recente", items = it))
        }
        
        // 3. Popular movies (trending → fallback getPopularMovies)
        loadPopularMovies()?.let { movies ->
            if (movies.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Film popolari",
                    items = movies.map { it.toCarouselItem() }
                ))
            }
        }
        
        // 4. Recently added movies
        loadRecentlyAddedMovies()?.let { movies ->
            if (movies.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Aggiunti di recente",
                    items = movies.map { it.toCarouselItem() }
                ))
            }
        }
        
        // 5. Recommendations (movie-only) — skipped in the fast pass (TMDB network)
        if (!fastOnly) {
            loadRecommendations()?.let { recs ->
                val movieRecs = recs.filter { it.contentType == ContentType.MOVIE.name }
                if (movieRecs.isNotEmpty()) {
                    rows.add(CarouselRow(
                        title = "Raccomandati per te",
                        items = movieRecs
                    ))
                }
            }
            
            // 6. Random category carousels (5-6 categories) — skipped in the fast pass
            loadFilteredCategoryRows(rows, includeMovies = true, includeSeries = false)
        }
    }
    
    /**
     * Load content for HISTORY tab
     * Divided into Movies, Series, Live
     */
    private suspend fun loadHistoryContent(rows: MutableList<CarouselRow>) {
        try {
            // Load comprehensive history (limit 100 items)
            val history = watchProgressDao.getRecentlyWatched(currentProfileId, 100)
            
            // 1. Movies History
            val movieHistory = history.filter { it.contentType == ContentType.MOVIE }
            if (movieHistory.isNotEmpty()) {
                val items = mutableListOf<CarouselItem>()
                for (progress in movieHistory) {
                    try {
                        val heroItem = buildHeroItem(progress, ContentType.MOVIE)
                        if (heroItem != null) {
                            items.add(heroItem.toCarouselItem())
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error building hero item for movie history: ${progress.contentId}", e)
                    }
                }
                
                if (items.isNotEmpty()) {
                    rows.add(CarouselRow(
                        title = "Film visti di recente",
                        items = items
                    ))
                }
            }
            
            // 2. Series History (deduplicate by seriesId to avoid showing same series multiple times)
            val seriesHistory = history.filter { it.contentType == ContentType.SERIES || it.contentType == ContentType.EPISODE }
            if (seriesHistory.isNotEmpty()) {
                val items = mutableListOf<CarouselItem>()
                val seenSeriesIds = mutableSetOf<Long>()
                
                for (progress in seriesHistory) {
                    try {
                        val seriesId = progress.seriesId ?: progress.contentId
                        if (seriesId in seenSeriesIds) continue
                        seenSeriesIds.add(seriesId)
                        
                        val heroItem = buildHeroItem(progress, ContentType.SERIES)
                        if (heroItem != null) {
                            items.add(heroItem.toCarouselItem())
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error building hero item for series history: ${progress.contentId}", e)
                    }
                }

                if (items.isNotEmpty()) {
                    rows.add(CarouselRow(
                        title = "Serie TV viste di recente",
                        items = items
                    ))
                }
            }
            
            // 3. Live History (Channels)
            val channelHistory = history.filter { it.contentType == ContentType.CHANNEL }
            if (channelHistory.isNotEmpty()) {
                val items = mutableListOf<CarouselItem>()
                for (progress in channelHistory) {
                    try {
                        val channel = channelDao.getChannelById(progress.contentId)
                        if (channel != null) {
                            items.add(CarouselItem(
                                id = channel.id,
                                title = channel.name,
                                posterUrl = channel.logoUrl,
                                backdropUrl = null,
                                contentType = ContentType.CHANNEL.name
                            ))
                        }
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error loading channel for history: ${progress.contentId}", e)
                    }
                }
                
                if (items.isNotEmpty()) {
                    rows.add(CarouselRow(
                        title = "Canali visti di recente",
                        items = items
                    ))
                }
            }
        } catch (e: Exception) {
            Log.e("HomeViewModel", "Error loading history content", e)
        }
    }

    /**
     * Load content for SERIES tab only
     * 8 carousels: Continua a guardare, Prossimo episodio, Visti di recente,
     * Nuovi episodi, Serie popolari, Aggiunte di recente, Raccomandati, Categorie
     */
    private suspend fun loadSeriesContent(rows: MutableList<CarouselRow>, fastOnly: Boolean = false) {
        Log.d("HomeViewModel", "loadSeriesContent: START")
        
        val allSeries = withContext(Dispatchers.IO) { seriesDao.getAllSeriesList() }
        Log.d("HomeViewModel", "loadSeriesContent: total series in DB = ${allSeries.size}")
        if (allSeries.isNotEmpty()) {
            Log.d("HomeViewModel", "loadSeriesContent: sample series = ${allSeries.take(3).map { "${it.name} (logoUrl=${it.logoUrl != null}, tmdbPosterPath=${it.tmdbPosterPath != null})" }}")
        }
        
        // 1. Continue watching series (dedupe per seriesId, max 10)
        loadContinueWatchingForTab(ContentType.SERIES)?.let {
            if (it.isNotEmpty()) rows.add(CarouselRow(title = "Continua a guardare", items = it))
        }
        
        // 2. Next unwatched episode per series (max 8)
        loadNextEpisodesForTab(limit = 8)?.let {
            if (it.isNotEmpty()) rows.add(CarouselRow(title = "Prossimo episodio", items = it))
        }
        
        // 3. Recently watched series (completed)
        loadRecentlyWatched(ContentType.SERIES)?.let {
            if (it.isNotEmpty()) rows.add(CarouselRow(title = "Visti di recente", items = it))
        }
        
        // 4. New episodes this week (latestEpisodeAddedAt < 7 days)
        loadNewEpisodesThisWeek(limit = 10)?.let {
            if (it.isNotEmpty()) rows.add(CarouselRow(title = "Nuovi episodi", items = it))
        }
        
        // 5. Popular series (trending → fallback getPopularSeries)
        loadPopularSeries()?.let { series ->
            if (series.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Serie TV popolari",
                    items = series.map { it.toCarouselItem() }
                ))
            }
        }
        
        // 6. Recently added series
        loadRecentlyAddedSeries()?.let { series ->
            if (series.isNotEmpty()) {
                rows.add(CarouselRow(
                    title = "Aggiunte di recente",
                    items = series.map { it.toCarouselItem() }
                ))
            }
        }
        
        // 7. Recommendations (series-only) — skipped in the fast pass (TMDB network)
        if (!fastOnly) {
            loadRecommendations()?.let { recs ->
                val seriesRecs = recs.filter { it.contentType == ContentType.SERIES.name }
                if (seriesRecs.isNotEmpty()) {
                    rows.add(CarouselRow(
                        title = "Raccomandati per te",
                        items = seriesRecs
                    ))
                }
            }
            
            // 8. Random category carousels (5-6 categories) — skipped in the fast pass
            loadFilteredCategoryRows(rows, includeMovies = false, includeSeries = true)
        }
        
        Log.d("HomeViewModel", "loadSeriesContent: END, rows=${rows.size}")
    }
    
    /**
     * Load content for FAVORITES tab
     */
    private suspend fun loadFavoritesContent(rows: MutableList<CarouselRow>) {
        withContext(Dispatchers.IO) {
            try {
                val favorites = favoriteDao.getFavoritesByProfileList(currentProfileId)
                
                // Collect category cards by type
                val movieCategoryCards = mutableListOf<CarouselItem>()
                val seriesCategoryCards = mutableListOf<CarouselItem>()
                val liveCategoryCards = mutableListOf<CarouselItem>()
                
                // --- Favorite Categories as Cards ---
                Log.d("HomeViewModel", "Loading favorite categories for profileId=$currentProfileId")
                
                // 1. Favorite Movie Categories -> CATEGORY_MOVIE cards
                val favMovieCats = favoriteCategoryDao.getFavoriteCategoriesByType(currentProfileId, "movies")
                Log.d("HomeViewModel", "Found ${favMovieCats.size} favorite movie categories: ${favMovieCats.map { it.categoryName }}")
                favMovieCats.forEach { cat ->
                    val movieCount = movieDao.getMoviesByCategoryList(cat.categoryName).size
                    if (movieCount > 0) {
                        movieCategoryCards.add(CarouselItem(
                            id = cat.categoryName.hashCode().toLong(),
                            title = cat.categoryName,
                            posterUrl = null,
                            backdropUrl = null,
                            contentType = "CATEGORY_MOVIE",
                            contentCount = movieCount
                        ))
                    }
                }
                
                // 2. Favorite Series Categories -> CATEGORY_SERIES cards
                val favSeriesCats = favoriteCategoryDao.getFavoriteCategoriesByType(currentProfileId, "series")
                favSeriesCats.forEach { cat ->
                    val seriesCount = seriesDao.getSeriesByCategoryList(cat.categoryName).size
                    if (seriesCount > 0) {
                        seriesCategoryCards.add(CarouselItem(
                            id = cat.categoryName.hashCode().toLong(),
                            title = cat.categoryName,
                            posterUrl = null,
                            backdropUrl = null,
                            contentType = "CATEGORY_SERIES",
                            contentCount = seriesCount
                        ))
                    }
                }
                
                // 3. Favorite Channel Categories -> CATEGORY_LIVE cards
                val favChannelCats = favoriteCategoryDao.getFavoriteCategoriesByType(currentProfileId, "channels")
                favChannelCats.forEach { cat ->
                    val channelCount = channelDao.getChannelsByCategoryList(cat.categoryName).size
                    if (channelCount > 0) {
                        liveCategoryCards.add(CarouselItem(
                            id = cat.categoryName.hashCode().toLong(),
                            title = cat.categoryName,
                            posterUrl = null,
                            backdropUrl = null,
                            contentType = "CATEGORY_LIVE",
                            contentCount = channelCount
                        ))
                    }
                }
                
                // Add "Categorie" section header if any category favorites exist
                val hasAnyCategoryFavorites = movieCategoryCards.isNotEmpty() || seriesCategoryCards.isNotEmpty() || liveCategoryCards.isNotEmpty()
                if (hasAnyCategoryFavorites) {
                    rows.add(CarouselRow(
                        title = "Categorie",
                        items = emptyList(),
                        showSeeAll = false,
                        isSectionHeader = true
                    ))
                    
                    // Add 3 separate carousels for each type
                    if (movieCategoryCards.isNotEmpty()) {
                        rows.add(CarouselRow(
                            title = "Categorie Film",
                            items = movieCategoryCards,
                            showSeeAll = false
                        ))
                    }
                    
                    if (seriesCategoryCards.isNotEmpty()) {
                        rows.add(CarouselRow(
                            title = "Categorie Serie",
                            items = seriesCategoryCards,
                            showSeeAll = false
                        ))
                    }
                    
                    if (liveCategoryCards.isNotEmpty()) {
                        rows.add(CarouselRow(
                            title = "Categorie Live",
                            items = liveCategoryCards,
                            showSeeAll = false
                        ))
                    }
                }
                
                // Now collect individual favorites by type
                val movieFavorites = favorites.filter { it.contentType == ContentType.MOVIE }
                val seriesFavorites = favorites.filter { it.contentType == ContentType.SERIES }
                val channelFavorites = favorites.filter { it.contentType == ContentType.CHANNEL }
                
                // Load movie details for favorites
                if (movieFavorites.isNotEmpty()) {
                    val movieItems = movieFavorites.mapNotNull { fav ->
                        movieDao.getMovieById(fav.contentId)?.toCarouselItem()
                    }
                    if (movieItems.isNotEmpty()) {
                        // Add "Film" section header
                        rows.add(CarouselRow(
                            title = "Film",
                            items = emptyList(),
                            showSeeAll = false,
                            isSectionHeader = true
                        ))
                        rows.add(CarouselRow(
                            title = "Film Preferiti",
                            items = movieItems
                        ))
                    }
                }
                
                // Load series details for favorites
                if (seriesFavorites.isNotEmpty()) {
                    val seriesItems = seriesFavorites.mapNotNull { fav ->
                        seriesDao.getSeriesById(fav.contentId)?.toCarouselItem()
                    }
                    if (seriesItems.isNotEmpty()) {
                        // Add "Serie TV" section header
                        rows.add(CarouselRow(
                            title = "Serie TV",
                            items = emptyList(),
                            showSeeAll = false,
                            isSectionHeader = true
                        ))
                        rows.add(CarouselRow(
                            title = "Serie TV Preferite",
                            items = seriesItems
                        ))
                    }
                }
                
                // Load channel details for favorites
                if (channelFavorites.isNotEmpty()) {
                    val channelItems = channelFavorites.mapNotNull { fav ->
                        channelDao.getChannelById(fav.contentId)?.let { 
                             CarouselItem(
                                id = it.id,
                                title = it.name,
                                posterUrl = it.logoUrl,
                                backdropUrl = null,
                                contentType = ContentType.CHANNEL.name
                            )
                        }
                    }
                    if (channelItems.isNotEmpty()) {
                        // Add "Canali" section header
                        rows.add(CarouselRow(
                            title = "Canali",
                            items = emptyList(),
                            showSeeAll = false,
                            isSectionHeader = true
                        ))
                        rows.add(CarouselRow(
                            title = "Canali Preferiti",
                            items = channelItems
                        ))
                    }
                }
                Unit // Explicit Unit to avoid if-expression error
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading favorites", e)
            }
        }
    }
    
    /**
     * Load content for LISTS tab
     */
    private suspend fun loadListsContent(rows: MutableList<CarouselRow>) {
        withContext(Dispatchers.IO) {
            try {
                val groups = customGroupDao.getGroupsForProfileList(currentProfileId)
                
                if (groups.isEmpty()) {
                    // No lists - UI will show empty state
                    return@withContext
                }
                
                // Load each group as a carousel row
                groups.forEach { group ->
                    val items = customGroupDao.getItemsForGroupList(group.id)
                    if (items.isNotEmpty()) {
                        val carouselItems = items.map { item ->
                            CarouselItem(
                                id = item.contentId,
                                title = item.title,
                                posterUrl = item.posterUrl,
                                contentType = item.contentType.name
                            )
                        }
                        rows.add(CarouselRow(
                            title = group.name,
                            items = carouselItems
                        ))
                    }
                }
            } catch (e: Exception) {
                // Ignore errors
            }
        }
    }
    
    /**
     * Create a new custom list
     */
    fun createList(name: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    val group = it.wavestream.app.data.database.entity.CustomGroup(
                        profileId = currentProfileId,
                        name = name
                    )
                    customGroupDao.insertGroup(group)
                    Log.d("HomeViewModel", "Created new list: $name")
                } catch (e: Exception) {
                    Log.e("HomeViewModel", "Error creating list: ${e.message}")
                }
            }
        }
    }

    /**
     * Add hero item to default "Da guardare" list
     */
    fun addHeroToWatchLater(hero: HeroItem) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    // Find or create "Da guardare" list
                    val groups = customGroupDao.getGroupsForProfileList(currentProfileId)
                    var watchLaterGroup = groups.find { it.name.equals("Da guardare", ignoreCase = true) || it.name.equals("Watch Later", ignoreCase = true) }
                    
                    if (watchLaterGroup == null) {
                        val newGroup = CustomGroup(
                            profileId = currentProfileId,
                            name = "Da guardare"
                        )
                        customGroupDao.insertGroup(newGroup)
                        // Re-fetch to get the ID
                        watchLaterGroup = customGroupDao.getGroupsForProfileList(currentProfileId).find { it.name == "Da guardare" }
                    }
                    
                    if (watchLaterGroup != null) {
                        val contentType = if (hero.contentType == "MOVIE") ContentType.MOVIE else ContentType.SERIES
                        
                        // Check if already exists
                        val existing = customGroupDao.getItemsForGroupList(watchLaterGroup!!.id).find { 
                            it.contentId == hero.id && it.contentType == contentType 
                        }
                        
                        if (existing == null) {
                            val item = GroupItem(
                                groupId = watchLaterGroup!!.id,
                                contentId = hero.id,
                                contentType = contentType,
                                title = hero.title,
                                posterUrl = hero.posterUrl,
                                addedAt = System.currentTimeMillis()
                            )
                            customGroupDao.insertItem(item)
                            Log.d("HomeViewModel", "Added to Watch Later: ${hero.title}")
                        } else {
                            Log.d("HomeViewModel", "Item already in Watch Later: ${hero.title}")
                        }
                    }
                } catch (e: Exception) {
                    Log.e("HomeViewModel", "Error adding to watch later", e)
                }
            }
        }
    }
    
    /**
     * Load popular movies from "Film Popolari" trending category
     * Category is populated weekly by LoadingActivity
     * Results are cached for 15 minutes to avoid reshuffling on every resume
     *
     * Fallback chain: trending category → TMDB refresh → getPopularMovies(20)
     */
    /**
     * Load popular movies from "Film Popolari" trending category
     * Category is populated weekly by LoadingActivity
     * Results are cached for 15 minutes to avoid reshuffling on every resume
     */
    private suspend fun loadPopularMovies(): List<Movie>? {
        // Cache stores only IDs (10 days) to keep ordering stable; objects are re-fetched fresh
        // from DB each time so poster/backdrop updates (e.g. from detail enrichment) are reflected.
        val cachedIds = contentCache.popularMoviesCache
        if (cachedIds != null && (System.currentTimeMillis() - contentCache.popularMoviesCacheTime) < POPULAR_CACHE_DURATION) {
            Log.d("HomeViewModel", "Using cached popular movie IDs (${cachedIds.size} items)")
            return withContext(Dispatchers.IO) {
                val fresh = movieDao.getMoviesByIds(cachedIds)
                // Preserve cached ordering, dropping any that no longer exist
                val byId = fresh.associateBy { it.id }
                val ordered = cachedIds.mapNotNull { byId[it] }
                ordered.ifEmpty { null }
            }
        }
        
        return withContext(Dispatchers.IO) {
            try {
                var movies = movieDao.getByTrendingCategory("Film Popolari")
                
                if (movies.isEmpty()) {
                    Log.w("HomeViewModel", "No trending movies found, triggering TMDB refresh...")
                    try {
                        tmdbService.populateTrendingMovies()
                        movies = movieDao.getByTrendingCategory("Film Popolari")
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error re-populating trending movies", e)
                    }
                }
                
                if (movies.isEmpty()) {
                    Log.d("HomeViewModel", "Trending movies still 0, fallback: random from DB")
                    movies = movieDao.getRandomMoviesAny(10)
                }
                
                if (movies.isEmpty()) return@withContext null
                
                val result = movies.shuffled().take(10)
                contentCache.popularMoviesCache = result.map { it.id }
                contentCache.popularMoviesCacheTime = System.currentTimeMillis()
                result
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading popular movies", e)
                null
            }
        }
    }
    
    /**
     * Load popular series from "Serie Popolari" trending category
     * Category is populated weekly by LoadingActivity
     * Results are cached for 15 minutes to avoid reshuffling on every resume
     */
    private suspend fun loadPopularSeries(): List<Series>? {
        // Cache stores only IDs (10 days) to keep ordering stable; objects are re-fetched fresh
        // from DB each time so poster/backdrop updates (e.g. from detail enrichment) are reflected.
        val cachedIds = contentCache.popularSeriesCache
        if (cachedIds != null && (System.currentTimeMillis() - contentCache.popularSeriesCacheTime) < POPULAR_CACHE_DURATION) {
            Log.d("HomeViewModel", "Using cached popular series IDs (${cachedIds.size} items)")
            return withContext(Dispatchers.IO) {
                val fresh = seriesDao.getSeriesByIds(cachedIds)
                // Preserve cached ordering, dropping any that no longer exist
                val byId = fresh.associateBy { it.id }
                val ordered = cachedIds.mapNotNull { byId[it] }
                ordered.ifEmpty { null }
            }
        }
        
        return withContext(Dispatchers.IO) {
            try {
                var series = seriesDao.getByTrendingCategory("Serie Popolari")
                
                if (series.isEmpty()) {
                    Log.w("HomeViewModel", "No trending series found, triggering TMDB refresh...")
                    try {
                        tmdbService.populateTrendingSeries()
                        series = seriesDao.getByTrendingCategory("Serie Popolari")
                    } catch (e: Exception) {
                        Log.e("HomeViewModel", "Error re-populating trending series", e)
                    }
                }
                
                if (series.isEmpty()) {
                    Log.d("HomeViewModel", "Trending series still 0, fallback: random from DB")
                    series = seriesDao.getRandomSeriesAny(10)
                }
                
                if (series.isEmpty()) return@withContext null
                
                val result = series.shuffled().take(10)
                contentCache.popularSeriesCache = result.map { it.id }
                contentCache.popularSeriesCacheTime = System.currentTimeMillis()
                result
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading popular series", e)
                null
            }
        }
    }
    
    private suspend fun loadContinueWatching(): List<ContinueWatchingData>? {
        return withContext(Dispatchers.IO) {
            try {
                // Load more items to account for duplicates that will be filtered out
                val progressList = watchProgressDao.getContinueWatching(currentProfileId, 30)
                Log.d("HomeViewModel", "WatchProgress items found: ${progressList.size}")
                
                progressList.mapNotNull { progress ->
                    // Enrich with title and poster from database
                    when (progress.contentType) {
                        ContentType.MOVIE -> {
                            val movie = movieDao.getMovieById(progress.contentId)
                            movie?.let {
                                ContinueWatchingData(
                                    contentId = progress.contentId,
                                    seriesId = null,  // Movies don't have seriesId
                                    contentType = ContentType.MOVIE,
                                    title = it.title,
                                    posterUrl = it.posterUrl,
                                    position = progress.position,
                                    duration = progress.duration,
                                    seasonNumber = null,
                                    episodeNumber = null
                                )
                            }
                        }
                        ContentType.SERIES, ContentType.EPISODE -> {
                            // Get the series ID (either from progress.seriesId or use contentId as fallback)
                            val resolvedSeriesId = progress.seriesId ?: progress.contentId
                            val series = seriesDao.getSeriesById(resolvedSeriesId)
                            series?.let {
                                ContinueWatchingData(
                                    contentId = progress.contentId,
                                    seriesId = resolvedSeriesId,  // Store series ID for deduplication and navigation
                                    contentType = ContentType.SERIES,
                                    title = it.title,
                                    posterUrl = it.posterUrl,
                                    position = progress.position,
                                    duration = progress.duration,
                                    seasonNumber = progress.season,
                                    episodeNumber = progress.episode
                                )
                            }
                        }
                        else -> null
                    }
                }
                // Deduplicate: for series, keep only the most recently watched episode (first in list since sorted by lastWatchedAt DESC)
                // Movies are deduplicated by contentId, series by seriesId
                .distinctBy { data ->
                    if (data.contentType == ContentType.SERIES && data.seriesId != null) {
                        "SERIES_${data.seriesId}"  // Group by series ID
                    } else {
                        "MOVIE_${data.contentId}"  // Movies by content ID
                    }
                }
                // Filter out series where the user finished the last episode of the last season
                .filter { data ->
                    if (data.contentType == ContentType.SERIES && data.seriesId != null && data.seasonNumber != null && data.episodeNumber != null) {
                        val seasonNumbers = episodeDao.getSeasonNumbers(data.seriesId)
                        val maxSeason = seasonNumbers.maxOrNull()
                        if (maxSeason != null && data.seasonNumber == maxSeason) {
                            val lastEp = episodeDao.getLastEpisodeOfSeason(data.seriesId, maxSeason)
                            if (lastEp != null && data.episodeNumber == lastEp.episodeNumber) {
                                // Last episode of last season — treat as completed
                                // Auto-mark as completed in background
                                val progress = watchProgressDao.getProgress(currentProfileId, ContentType.EPISODE, data.contentId)
                                if (progress != null && !progress.isCompleted) {
                                    watchProgressDao.upsert(progress.copy(isCompleted = true))
                                }
                                false  // Remove from continue watching
                            } else true
                        } else true
                    } else true
                }
                .take(10)  // Limit to 10 items after deduplication
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading continue watching: ${e.message}")
                null
            }
        }
    }

    /**
     * Load continue watching items filtered by content type (MOVIE or SERIES)
     * Deduplicates series by seriesId, movies by contentId
     */
    private suspend fun loadContinueWatchingForTab(filterType: ContentType, limit: Int = 10): List<CarouselItem>? {
        return withContext(Dispatchers.IO) {
            try {
                val progressList = watchProgressDao.getContinueWatching(currentProfileId, 30)
                progressList
                    .filter { progress ->
                        when (filterType) {
                            ContentType.MOVIE -> progress.contentType == ContentType.MOVIE
                            ContentType.SERIES -> progress.contentType in listOf(ContentType.SERIES, ContentType.EPISODE)
                            else -> false
                        }
                    }
                    // Filter out series where the user finished the last episode of the last season
                    .filter { progress ->
                        if (progress.contentType in listOf(ContentType.SERIES, ContentType.EPISODE) &&
                            progress.season != null && progress.episode != null) {
                            val seriesId = progress.seriesId ?: progress.contentId
                            val seasonNumbers = episodeDao.getSeasonNumbers(seriesId)
                            val maxSeason = seasonNumbers.maxOrNull()
                            if (maxSeason != null && progress.season == maxSeason) {
                                val lastEp = episodeDao.getLastEpisodeOfSeason(seriesId, maxSeason)
                                if (lastEp != null && progress.episode == lastEp.episodeNumber) {
                                    // Last episode of last season — auto-mark as completed
                                    if (!progress.isCompleted) {
                                        watchProgressDao.upsert(progress.copy(isCompleted = true))
                                    }
                                    false  // Remove from continue watching
                                } else true
                            } else true
                        } else true
                    }
                    .take(limit)
                    .mapNotNull { progress ->
                        when (progress.contentType) {
                            ContentType.MOVIE -> {
                                val movie = movieDao.getMovieById(progress.contentId) ?: return@mapNotNull null
                                val progressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
                                val remaining = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(0)
                                CarouselItem(
                                    id = movie.id,
                                    title = movie.title,
                                    posterUrl = movie.posterUrl,
                                    backdropUrl = movie.backdropUrl,
                                    contentType = ContentType.MOVIE.name,
                                    progressPercent = progressPercent.coerceIn(0f, 1f),
                                    remainingMinutes = remaining,
                                    rating = movie.rating
                                )
                            }
                            ContentType.SERIES, ContentType.EPISODE -> {
                                val seriesId = progress.seriesId ?: progress.contentId
                                val series = seriesDao.getSeriesById(seriesId) ?: return@mapNotNull null
                                val progressPercent = if (progress.duration > 0) progress.position.toFloat() / progress.duration.toFloat() else 0f
                                val remaining = ((progress.duration - progress.position) / 60000).toInt().coerceAtLeast(0)
                                val episodeLabel = if (progress.season != null && progress.episode != null) {
                                    "S${progress.season} E${progress.episode}"
                                } else null
                                CarouselItem(
                                    id = series.id,
                                    title = series.title,
                                    posterUrl = series.posterUrl,
                                    backdropUrl = series.backdropUrl,
                                    contentType = ContentType.SERIES.name,
                                    progressPercent = progressPercent.coerceIn(0f, 1f),
                                    remainingMinutes = remaining,
                                    episodeLabel = episodeLabel,
                                    rating = series.rating
                                )
                            }
                            else -> null
                        }
                    }
                    .distinctBy { it.id }
                    .ifEmpty { null }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading continue watching for tab: ${e.message}")
                null
            }
        }
    }

    /**
     * Load next unwatched episodes for series (SERIES tab only)
     * For each series with at least one completed episode, find the next unwatched episode
     */
    private suspend fun loadNextEpisodesForTab(limit: Int = 8): List<CarouselItem>? {
        return withContext(Dispatchers.IO) {
            try {
                val recentCompleted = watchProgressDao.getRecentlyWatched(currentProfileId, 200)
                    .filter { it.contentType in listOf(ContentType.SERIES, ContentType.EPISODE) && it.isCompleted }
                    .distinctBy { it.seriesId }

                val items = mutableListOf<CarouselItem>()
                for (progress in recentCompleted) {
                    if (items.size >= limit) break
                    val seriesId = progress.seriesId ?: continue
                    val season = progress.season ?: continue
                    val episode = progress.episode ?: continue

                    // Check if all episodes are watched
                    val totalEpisodes = episodeDao.getCountBySeries(seriesId)
                    val allSeriesProgress = watchProgressDao.getRecentlyWatched(currentProfileId, 200)
                        .filter { it.seriesId == seriesId && it.isCompleted }
                        .distinctBy { Pair(it.season, it.episode) }
                    if (allSeriesProgress.size >= totalEpisodes && totalEpisodes > 0) continue

                    val nextEpisode = episodeDao.getNextEpisode(seriesId, season, episode) ?: continue
                    val series = seriesDao.getSeriesById(seriesId) ?: continue

                    // Skip if already in items
                    if (items.any { it.id == series.id }) continue

                    val label = "S${nextEpisode.seasonNumber} E${nextEpisode.episodeNumber}"
                    items.add(CarouselItem(
                        id = series.id,
                        title = series.title,
                        posterUrl = series.posterUrl,
                        backdropUrl = series.backdropUrl,
                        contentType = ContentType.SERIES.name,
                        nextEpisodeLabel = label,
                        seasonCount = series.tmdbNumberOfSeasons ?: series.seasonCount.takeIf { it > 0 },
                        rating = series.rating
                    ))
                }
                items.ifEmpty { null }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading next episodes", e)
                null
            }
        }
    }

    /**
     * Load series with new episodes added this week (SERIES tab only)
     */
    private suspend fun loadNewEpisodesThisWeek(limit: Int = 10): List<CarouselItem>? {
        return withContext(Dispatchers.IO) {
            try {
                val oneWeekAgo = System.currentTimeMillis() - (7 * 24 * 60 * 60 * 1000L)
                val series = seriesDao.getRecentlyAddedSeries(50)
                    .filter { s ->
                        val isRecent = s.latestEpisodeAddedAt != null && s.latestEpisodeAddedAt > oneWeekAgo
                        isRecent && !ContentFilters.isHiddenSeriesName(s.name)
                    }
                    .take(limit)

                series.map { s ->
                    val epLabel = if (s.latestEpisodeSeason != null && s.latestEpisodeNumber != null) {
                        "S${s.latestEpisodeSeason} E${s.latestEpisodeNumber}"
                    } else null

                    CarouselItem(
                        id = s.id,
                        title = s.title,
                        posterUrl = s.posterUrl,
                        backdropUrl = s.backdropUrl,
                        contentType = ContentType.SERIES.name,
                        nextEpisodeLabel = epLabel,
                        newEpisodeBadge = true,
                        seasonCount = s.tmdbNumberOfSeasons ?: s.seasonCount.takeIf { it > 0 },
                        rating = s.rating
                    )
                }.ifEmpty { null }
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading new episodes this week", e)
                null
            }
        }
    }

    /**
     * Load recommendations based on user's taste profile
     */
    private var cachedRecommendations: List<CarouselItem>? = null

    private suspend fun loadRecommendations(): List<CarouselItem>? {
        cachedRecommendations?.let { return it }

        return withContext(Dispatchers.IO) {
            try {
                val recommended = recommendationEngine.generateRecommendations(currentProfileId)
                if (recommended.isEmpty()) return@withContext null

                val items = recommended.mapNotNull { rec ->
                    val posterUrl = when {
                        rec.localMovie?.posterUrl != null -> rec.localMovie.posterUrl
                        rec.localSeries?.posterUrl != null -> rec.localSeries.posterUrl
                        rec.posterPath != null -> "https://image.tmdb.org/t/p/w342${rec.posterPath}"
                        else -> null
                    }
                    val backdropUrl = rec.backdropPath?.let { "https://image.tmdb.org/t/p/w780$it" }
                    when {
                        rec.localMovie != null -> CarouselItem(
                            id = rec.localMovie.id,
                            title = rec.title,
                            posterUrl = posterUrl,
                            backdropUrl = backdropUrl,
                            contentType = ContentType.MOVIE.name,
                            year = rec.year,
                            rating = rec.voteAverage
                        )
                        rec.localSeries != null -> CarouselItem(
                            id = rec.localSeries.id,
                            title = rec.title,
                            posterUrl = posterUrl,
                            backdropUrl = backdropUrl,
                            contentType = ContentType.SERIES.name,
                            year = rec.year,
                            rating = rec.voteAverage
                        )
                        else -> null
                    }
                }
                if (items.isEmpty()) return@withContext null
                cachedRecommendations = items
                items
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading recommendations", e)
                null
            }
        }
    }

    /**
     * Load recently watched content (COMPLETED items only)
     * Shows content that was fully watched (or with <= 8 min remaining to exclude credits)
     */
    private suspend fun loadRecentlyWatched(filterType: ContentType? = null): List<CarouselItem>? {
        return withContext(Dispatchers.IO) {
            try {
                val watchHistory = watchProgressDao.getRecentlyWatched(currentProfileId, 50)
                Log.d("HomeViewModel", "Recently watched items found: ${watchHistory.size}")
                
                // 6 minutes in milliseconds (threshold for "completed" excluding credits)
                val completedThresholdMs = 6 * 60 * 1000L

                watchHistory
                    .filter { progress ->
                        // Only include COMPLETED content
                        // Completed = isCompleted flag OR remaining time <= 8 minutes
                        val remainingMs = progress.duration - progress.position
                        val isEffectivelyCompleted = progress.isCompleted || remainingMs <= completedThresholdMs
                        
                        if (!isEffectivelyCompleted) return@filter false
                        
                        // Filter by content type if specified
                        when (filterType) {
                            ContentType.MOVIE -> progress.contentType == ContentType.MOVIE
                            ContentType.SERIES -> progress.contentType in listOf(ContentType.SERIES, ContentType.EPISODE)
                            else -> true
                        }
                    }
                    .mapNotNull { progress ->
                        // Enrich with title and poster from database
                        when (progress.contentType) {
                            ContentType.MOVIE -> {
                                val movie = movieDao.getMovieById(progress.contentId)
                                movie?.let {
                                    CarouselItem(
                                        id = it.id,
                                        title = it.title,
                                        posterUrl = it.posterUrl,
                                        contentType = ContentType.MOVIE.name
                                    )
                                }
                            }
                            ContentType.SERIES, ContentType.EPISODE -> {
                                // Get the series (not the episode) for display
                                val seriesId = progress.seriesId ?: progress.contentId
                                val series = seriesDao.getSeriesById(seriesId)
                                series?.let {
                                    CarouselItem(
                                        id = it.id,
                                        title = it.title,
                                        posterUrl = it.posterUrl,
                                        contentType = ContentType.SERIES.name
                                    )
                                }
                            }
                            else -> null
                        }
                    }
                    .distinctBy { it.id to it.contentType } // Remove duplicates (same series from different episodes)
                    .take(15) // Limit items
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading recently watched: ${e.message}")
                null
            }
        }
    }

    /**
     * Helper data class for continue watching items
     */
    private data class ContinueWatchingData(
        val contentId: Long,
        val seriesId: Long?,  // For series, this is the parent series ID (used for navigation and deduplication)
        val contentType: ContentType,
        val title: String,
        val posterUrl: String?,
        val position: Long,
        val duration: Long,
        val seasonNumber: Int?,
        val episodeNumber: Int?
    )

    private fun ContinueWatchingData.toCarouselItem(): CarouselItem {
        val progressPercent = if (duration > 0) position.toFloat() / duration.toFloat() else 0f
        val remaining = ((duration - position) / 60000).toInt()
        val episodeLabel = if (seasonNumber != null && episodeNumber != null) {
            "S$seasonNumber E$episodeNumber"
        } else null

        // For series, use seriesId for navigation so clicking opens the series details page
        // For movies, use contentId as usual
        val navigationId = seriesId ?: contentId

        return CarouselItem(
            id = navigationId,  // Use series ID for series, content ID for movies
            title = title,
            posterUrl = posterUrl,
            backdropUrl = null,
            contentType = contentType.name,
            progressPercent = progressPercent.coerceIn(0f, 1f),
            remainingMinutes = remaining.coerceAtLeast(0),
            episodeLabel = episodeLabel
        )
    }
    
    /**
     * Load recently added movies, excluding hidden categories
     * Uses session cache to avoid reloading
     */
    private suspend fun loadRecentlyAddedMovies(): List<Movie>? {
        // Return cache if available
        cachedRecentlyAddedMovies?.let { return it }
        
        return withContext(Dispatchers.IO) {
            try {
                // Filter for content added in the last 7 days
                val oneWeekAgo = System.currentTimeMillis() - (7 * 24 * 60 * 60 * 1000L)
                
                val movies = movieDao.getRecentlyAddedMovies(100)
                    .filter { movie ->
                        val category = movie.category ?: ""
                        val isRecent = movie.addedAt >= oneWeekAgo
                        !ContentFilters.shouldExcludeMovieCategory(category) && isRecent
                    }.take(15)
                // Cache result
                cachedRecentlyAddedMovies = movies
                movies
            } catch (e: Exception) {
                null
            }
        }
    }
    
    /**
     * Load recently added series, excluding hidden categories and names
     * Uses session cache to avoid reloading
     */
    private suspend fun loadRecentlyAddedSeries(): List<Series>? {
        // Return cache if available
        cachedRecentlyAddedSeries?.let { return it }
        
        return withContext(Dispatchers.IO) {
            try {
                // Filter for content added in the last 7 days
                val oneWeekAgo = System.currentTimeMillis() - (7 * 24 * 60 * 60 * 1000L)
                
                val series = seriesDao.getRecentlyAddedSeries(100)
                    .filter { series ->
                        val category = series.category ?: ""
                        val name = series.name
                        val isRecent = series.addedAt >= oneWeekAgo
                        !ContentFilters.shouldExcludeSeriesCategory(category) && 
                        !ContentFilters.isHiddenSeriesName(name) && 
                        isRecent
                    }.take(20)
                // Cache result
                cachedRecentlyAddedSeries = series
                series
            } catch (e: Exception) {
                null
            }
        }
    }
    
    /**
     * Load category carousel rows with filtering
     * Categories are shuffled ONCE at first load and cached for the app session
     */
    private suspend fun loadFilteredCategoryRows(
        rows: MutableList<CarouselRow>,
        includeMovies: Boolean,
        includeSeries: Boolean
    ) {
        withContext(Dispatchers.IO) {
            try {
                // Movie categories (filtered and shuffled ONCE)
                if (includeMovies) {
                    // Only shuffle once at first load
                    if (contentCache.cachedShuffledMovieCategories == null) {
                        val allMovieCategories = movieDao.getCategoriesList()
                        Log.d("CarouselDebug", "All movie categories: ${allMovieCategories.size} -> ${allMovieCategories.take(10)}")
                        val filteredCategories = ContentFilters.filterMovieCategories(allMovieCategories)
                        Log.d("CarouselDebug", "Filtered movie categories: ${filteredCategories.size} -> ${filteredCategories.take(10)}")
                        contentCache.cachedShuffledMovieCategories = filteredCategories.shuffled()
                    }
                    
                    val categoriesToShow = contentCache.cachedShuffledMovieCategories!!.take(8)
                    Log.d("CarouselDebug", "Categories to show: $categoriesToShow")
                    
                    for (category in categoriesToShow) {
                        val movies = contentCache.getMoviesByCategory(category)
                            ?: movieDao.getMoviesByCategoryList(category).also {
                                contentCache.putMoviesByCategory(category, it)
                            }
                        
                        Log.d("CarouselDebug", "Category '$category': ${movies.size} movies")
                        movies.take(3).forEach { m ->
                            Log.d("CarouselDebug", "  - '${m.name}' logoUrl=${m.logoUrl} tmdbPosterPath=${m.tmdbPosterPath} posterUrl=${m.posterUrl}")
                        }
                        if (movies.isNotEmpty()) {
                            rows.add(CarouselRow(
                                title = ContentFilters.cleanCategoryTitle(category),
                                items = movies.shuffled().take(10).map { it.toCarouselItem() },
                                showSeeAll = true
                            ))
                        }
                    }
                }
                
                // Series categories (filtered and shuffled ONCE)
                if (includeSeries) {
                    // Only shuffle once at first load
                    if (contentCache.cachedShuffledSeriesCategories == null) {
                        val allSeriesCategories = seriesDao.getCategoriesList()
                        Log.d("CarouselDebug", "All series categories: ${allSeriesCategories.size} -> ${allSeriesCategories.take(10)}")
                        val filteredCategories = ContentFilters.filterSeriesCategories(allSeriesCategories)
                        Log.d("CarouselDebug", "Filtered series categories: ${filteredCategories.size} -> ${filteredCategories.take(10)}")
                        contentCache.cachedShuffledSeriesCategories = filteredCategories.shuffled()
                    }
                    
                    val categoriesToShow = contentCache.cachedShuffledSeriesCategories!!.take(8)
                    Log.d("CarouselDebug", "Series categories to show: ${categoriesToShow.size} -> $categoriesToShow")
                    
                    for (category in categoriesToShow) {
                        val series = contentCache.getSeriesByCategory(category)
                            ?: seriesDao.getSeriesByCategoryList(category).also {
                                contentCache.putSeriesByCategory(category, it)
                            }
                        
                        Log.d("CarouselDebug", "Series category '$category': ${series.size} series")
                        if (series.isNotEmpty()) {
                            rows.add(CarouselRow(
                                title = ContentFilters.cleanCategoryTitle(category),
                                items = series.shuffled().take(10).map { it.toCarouselItem() },
                                showSeeAll = true
                            ))
                        }
                    }
                }
            } catch (e: Exception) {
                // Ignore errors
            }
        }
    }
    
    /**
     * Load content for a specific category (or all categories with filters)
     */
    fun loadCategoryContent(category: String, isMovies: Boolean) {
        viewModelScope.launch {
            // Save current state before entering grid mode (for back navigation)
            if (!_uiState.value.isGridMode) {
                savedPreGridState = _uiState.value
            }
            _uiState.update { it.copy(isLoading = true) }
            
            // Extract clean category name (remove count suffix like " (123)")
            val cleanCategory = category.replace(Regex("\\s*\\(\\d+\\)$"), "")
            
            // Get all available categories for the filter
            val allCategories = if (isMovies) {
                movieDao.getCategoriesList().filter { cat ->
                    !ContentFilters.shouldExcludeMovieCategory(cat)
                }
            } else {
                seriesDao.getCategoriesList().filter { cat ->
                    !ContentFilters.shouldExcludeSeriesCategory(cat)
                }
            }
            
            // Check if we're loading "all" content
        val isAllContent = if (isMovies) {
            cleanCategory.startsWith("Tutti i Film")
        } else {
            cleanCategory.startsWith("Tutte le Serie")
        }
        
        // Check special lists
        val isRecentlyAdded = cleanCategory.contains("Aggiunti di recente") || cleanCategory.contains("Aggiunte di recente")
        val isContinueWatching = cleanCategory.equals("Continua a guardare", ignoreCase = true)
        val isFavorites = cleanCategory.contains("Preferiti", ignoreCase = true)
        val isPopular = cleanCategory.contains("popolari", ignoreCase = true)
        
        Log.d("HomeViewModel", "loadCategoryContent: category='$category', clean='$cleanCategory', isMovies=$isMovies, isPopular=$isPopular")
        
        val items: List<CarouselItem> = if (isMovies) {
            when {
                isAllContent -> loadAllMovies()
                isRecentlyAdded -> loadRecentlyAddedMoviesForGrid()
                isContinueWatching -> {
                    // Load all continue watching movies
                    val progressList = watchProgressDao.getProgressByProfile(currentProfileId).first()
                        .filter { it.contentType == ContentType.MOVIE }
                    progressList.mapNotNull { buildHeroItem(it, ContentType.MOVIE)?.toCarouselItem() }
                }
                isFavorites -> {
                    val favs = favoriteDao.getFavoritesByType(currentProfileId, ContentType.MOVIE).first()
                    favs.mapNotNull { fav -> movieDao.getMovieById(fav.contentId)?.toCarouselItem() }
                }
                isPopular -> {
                    Log.d("HomeViewModel", "Loading POPULAR movies from trending category")
                     val result = movieDao.getByTrendingCategory("Film Popolari").map { it.toCarouselItem() }
                     Log.d("HomeViewModel", "Found ${result.size} popular movies")
                     result
                }
                else -> {
                    Log.d("HomeViewModel", "Loading GENERIC category: $cleanCategory")
                    movieDao.getMoviesByCategoryList(cleanCategory).map { it.toCarouselItem() }
                }
            }
        } else {
            when {
                isAllContent -> loadAllSeries()
                isRecentlyAdded -> loadRecentlyAddedSeriesForGrid()
                isContinueWatching -> {
                    // Load all continue watching series
                    val progressList = watchProgressDao.getProgressByProfile(currentProfileId).first()
                        .filter { it.contentType == ContentType.SERIES || it.contentType == ContentType.EPISODE }
                    progressList.mapNotNull { buildHeroItem(it, ContentType.SERIES)?.toCarouselItem() }
                }
                isFavorites -> {
                    val favs = favoriteDao.getFavoritesByType(currentProfileId, ContentType.SERIES).first()
                    favs.mapNotNull { fav -> seriesDao.getSeriesById(fav.contentId)?.toCarouselItem() }
                }
                isPopular -> {
                    seriesDao.getByTrendingCategory("Serie Popolari").map { it.toCarouselItem() }
                }
                else -> seriesDao.getSeriesByCategoryList(cleanCategory).map { it.toCarouselItem() }
            }
        }
        
        _uiState.update { 
            it.copy(
                isLoading = false,
                carouselRows = listOf(CarouselRow(title = cleanCategory, items = items, showSeeAll = false)),
                heroItem = items.firstOrNull(), // Use first item as hero backdrop in grid mode
                isGridMode = true,
                selectedCategory = cleanCategory,
                // Category filter fields
                availableCategories = if (isAllContent) allCategories else emptyList(),
                selectedCategoryFilters = if (isAllContent) allCategories.toSet() else emptySet(),  // All selected by default
                isMoviesGrid = isMovies
            )
        }
    }
}

    /**
     * Exit grid mode and restore the previous carousel state.
     * This preserves scroll position when navigating back from "Vedi tutti".
     */
    fun exitGridMode() {
        savedPreGridState?.let { savedState ->
            _uiState.update { savedState }
            savedPreGridState = null
        }
    }

    /**
 * Load content for a category trying to auto-detect if it's movies or series.
 * Useful for Favorites/Home/Search tabs where context is mixed.
 */
fun loadCategoryContentAutoDetect(category: String) {
    viewModelScope.launch {
        _uiState.update { it.copy(isLoading = true) }
        val cleanCategory = category.replace(Regex("\\s*\\(\\d+\\)$"), "")
        
        // Special handling for special carousels
        val lowerCat = cleanCategory.lowercase()
        if (lowerCat.contains("popolari") || 
            lowerCat.contains("preferiti") || 
            lowerCat.contains("aggiunti di recente") || 
            lowerCat.contains("aggiunte di recente")) {
            
            val isMovies = lowerCat.contains("film") // "Film popolari", "Film Preferiti", "Film aggiunti..."
            val isSeries = lowerCat.contains("serie") // "Serie popolari", "Serie TV Preferite", ...
            
            if (isMovies) {
                loadCategoryContent(category, isMovies = true)
                return@launch
            } else if (isSeries) {
                loadCategoryContent(category, isMovies = false)
                return@launch
            }
            // If neither (e.g. just "Preferiti"?), fall through to DB check or default
        }
        
        // "Continua a guardare" - Try to determine based on content or default to mixed/movies
        if (lowerCat.equals("continua a guardare")) {
            // For now, default to movies, or we could support mixed if loadCategoryContent allows it
            // Let's rely on DB check below to see what we have
        }
        
        // Check if it has movies (on IO thread)
        withContext(Dispatchers.IO) {
            try {
                // For "Continua a guardare", check watch progress
                if (lowerCat.equals("continua a guardare")) {
                    val hasMovies = watchProgressDao.getProgressByProfile(currentProfileId).first().any { it.contentType == ContentType.MOVIE }
                    // Prioritize movies if present, otherwise series
                    loadCategoryContent(category, isMovies = hasMovies)
                    return@withContext
                }

                // Standard category check
                val movies = movieDao.getMoviesByCategoryList(cleanCategory)
                if (movies.isNotEmpty()) {
                    // Found movies! Load as movies
                    loadCategoryContent(category, isMovies = true)
                } else {
                    // No movies, try series (default fallback)
                    loadCategoryContent(category, isMovies = false)
                }
            } catch (e: Exception) {
                // Start error, fallback to series
                loadCategoryContent(category, isMovies = false)
            }
        }
    }
}
    
    /**
     * Toggle a category filter on/off
     */
    fun toggleCategoryFilter(category: String) {
        viewModelScope.launch {
            val currentState = _uiState.value
            val newFilters = if (currentState.selectedCategoryFilters.contains(category)) {
                currentState.selectedCategoryFilters - category
            } else {
                currentState.selectedCategoryFilters + category
            }
            
            // Reload content with new filters
            applyFilters(newFilters, currentState.isMoviesGrid)
        }
    }
    
    /**
     * Select all categories
     */
    fun selectAllCategories() {
        viewModelScope.launch {
            val currentState = _uiState.value
            applyFilters(currentState.availableCategories.toSet(), currentState.isMoviesGrid)
        }
    }
    
    /**
     * Clear all category filters
     */
    fun clearCategoryFilters() {
        viewModelScope.launch {
            val currentState = _uiState.value
            applyFilters(emptySet(), currentState.isMoviesGrid)
        }
    }
    
    /**
     * Apply category filters and reload content
     */
    private suspend fun applyFilters(filters: Set<String>, isMovies: Boolean) {
        val items = if (filters.isEmpty()) {
            emptyList()
        } else if (isMovies) {
            withContext(Dispatchers.IO) {
                movieDao.getAllMoviesList().filter { movie ->
                    val category = movie.category ?: ""
                    filters.contains(category)
                }.map { it.toCarouselItem() }
            }
        } else {
            withContext(Dispatchers.IO) {
                seriesDao.getAllSeriesList().filter { series ->
                    val category = series.category ?: ""
                    filters.contains(category)
                }.map { it.toCarouselItem() }
            }
        }
        
        _uiState.update { state ->
            val title = if (isMovies) "Tutti i Film" else "Tutte le Serie TV"
            state.copy(
                carouselRows = listOf(CarouselRow(title = title, items = items, showSeeAll = false)),
                heroItem = items.firstOrNull(),
                selectedCategoryFilters = filters
            )
        }
    }
    
    private suspend fun loadAllMovies(): List<CarouselItem> {
        return withContext(Dispatchers.IO) {
            try {
                movieDao.getAllMoviesList().filter { movie ->
                    val category = movie.category ?: ""
                    !ContentFilters.shouldExcludeMovieCategory(category)
                }.map { it.toCarouselItem() }
                 .filter { it.title.isNotEmpty() } // Filter out ghost movies
            } catch (e: Exception) {
                emptyList()
            }
        }
    }
    
    private suspend fun loadAllSeries(): List<CarouselItem> {
        return withContext(Dispatchers.IO) {
            try {
                seriesDao.getAllSeriesList().filter { series ->
                    val category = series.category ?: ""
                    !ContentFilters.shouldExcludeSeriesCategory(category)
                }.map { it.toCarouselItem() }
            } catch (e: Exception) {
                emptyList()
            }
        }
    }
    
    /**
     * Load recently added movies for grid - ordered by playlistOrder (higher = added later in M3U)
     */
    private suspend fun loadRecentlyAddedMoviesForGrid(): List<CarouselItem> {
        return withContext(Dispatchers.IO) {
            try {
                movieDao.getAllMoviesList()
                    .filter { movie ->
                        val category = movie.category ?: ""
                        !ContentFilters.shouldExcludeMovieCategory(category)
                    }
                    .sortedByDescending { it.playlistOrder }  // Higher order = added later in playlist
                    .take(100)
                    .map { it.toCarouselItem() }
            } catch (e: Exception) {
                emptyList()
            }
        }
    }
    
    /**
     * Load recently added series for grid - ordered by playlistOrder (higher = added later in M3U)
     */
    private suspend fun loadRecentlyAddedSeriesForGrid(): List<CarouselItem> {
        return withContext(Dispatchers.IO) {
            try {
                seriesDao.getAllSeriesList()
                    .filter { series ->
                        val category = series.category ?: ""
                        !ContentFilters.shouldExcludeSeriesCategory(category)
                    }
                    .sortedByDescending { it.playlistOrder }  // Higher order = added later in playlist
                    .take(100)
                    .map { it.toCarouselItem() }
            } catch (e: Exception) {
                emptyList()
            }
        }
    }
    
    fun refreshContinueWatching() {
        viewModelScope.launch {
            val watchStates = loadContinueWatching()
            if (watchStates != null && watchStates.isNotEmpty()) {
                _uiState.update { state ->
                    val newRows = state.carouselRows.toMutableList()
                    val continueIndex = newRows.indexOfFirst { 
                        it.title.contains(context.getString(R.string.continue_watching)) ||
                        it.title.contains("Continua a guardare")
                    }
                    val newRow = CarouselRow(
                        title = "â–¶ï¸ " + context.getString(R.string.continue_watching),
                        items = watchStates.mapNotNull { it.toCarouselItem() }
                    )
                    if (continueIndex >= 0) {
                        newRows[continueIndex] = newRow
                    } else {
                        newRows.add(0, newRow)
                    }
                    state.copy(carouselRows = newRows)
                }
            }
        }
    }
    
    // Extension functions to convert entities to CarouselItem
    private fun Movie.toCarouselItem() = CarouselItem(
        id = id,
        title = title,
        posterUrl = posterUrl,
        backdropUrl = backdropUrl,
        contentType = "MOVIE",
        year = year ?: tmdbReleaseDate?.take(4)?.toIntOrNull(),
        rating = rating,
        ratingText = rating?.let { "%.1f".format(it) }
    )
    
    private fun Series.toCarouselItem() = CarouselItem(
        id = id,
        title = title,
        posterUrl = posterUrl,
        backdropUrl = backdropUrl,
        contentType = "SERIES",
        year = year,
        rating = rating,
        ratingText = rating?.let { "%.1f".format(it) }
    )
    
    private fun Channel.toCarouselItem() = CarouselItem(
        id = id,
        title = name,
        posterUrl = logoUrl,
        backdropUrl = null,
        contentType = "CHANNEL"
    )
    
    private fun WatchState.toCarouselItem(): CarouselItem? {
        val progressPercent = if (duration > 0) position.toFloat() / duration.toFloat() else progress
        val remaining = ((duration - position) / 60000).toInt()
        val episodeLabel = if (seasonNumber != null && episodeNumber != null) {
            "S$seasonNumber E$episodeNumber"
        } else null
        
        return CarouselItem(
            id = contentId,
            title = title ?: "Unknown",
            posterUrl = thumbnailUrl,
            backdropUrl = null,
            contentType = contentType.name,
            progressPercent = progressPercent.coerceIn(0f, 1f),
            remainingMinutes = remaining.coerceAtLeast(0),
            episodeLabel = episodeLabel
        )
    }

    private fun HeroItem.toCarouselItem(): CarouselItem {
        val heroRating = tmdbRating ?: imdbRating?.toFloatOrNull()
        return CarouselItem(
            id = id,
            title = title,
            posterUrl = posterUrl,
            backdropUrl = backdropUrl,
            contentType = contentType,
            year = year,
            rating = heroRating,
            ratingText = heroRating?.let { "%.1f".format(it) },
            // Continue Watching fields
            progressPercent = progressPercent,
            remainingMinutes = resumeMinutes,
            episodeLabel = null
        )
    }

    fun toggleHeroFavorite(hero: HeroItem) {
        viewModelScope.launch {
            val contentType = if (hero.contentType == "MOVIE") ContentType.MOVIE else ContentType.SERIES
            val favorite = Favorite(
                profileId = currentProfileId,
                contentId = hero.id,
                contentType = contentType,
                title = hero.title,
                posterUrl = hero.posterUrl,
                addedAt = System.currentTimeMillis()
            )
            
            // Toggle in DB
            val isNowFavorite = favoriteDao.toggleFavorite(favorite)
            
            // Update UI state
            _uiState.update { state ->
                val updatedHeroes = state.heroItems.map { 
                    if (it.id == hero.id) it.copy(isFavorite = isNowFavorite) else it 
                }
                state.copy(heroItems = updatedHeroes)
            }
            
            // Also update the cache so switching tabs preserves the favorite state
            val heroContentType = if (hero.contentType == "MOVIE") HomeContentType.MOVIES else HomeContentType.SERIES
            cachedHeroItems[heroContentType]?.let { cached ->
                val updatedCachedHeroes = cached.heroes.map { 
                    if (it.id == hero.id) it.copy(isFavorite = isNowFavorite) else it 
                }
                cachedHeroItems[heroContentType] = HeroPairData(updatedCachedHeroes, cached.isContinueWatching)
            }
        }
    }
}

