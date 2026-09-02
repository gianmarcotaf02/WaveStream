package it.wavestream.app.ui.loading

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import it.wavestream.app.ui.theme.WaveStreamColors
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import android.util.Log
import it.wavestream.app.R
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.PlaylistDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.dao.ProfileDao
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.data.repository.EpgRepository
import it.wavestream.app.data.repository.ImdbRatingsRepository
import it.wavestream.app.data.repository.PlaylistRepository
import it.wavestream.app.data.repository.TMDBRepository
import it.wavestream.app.data.tmdb.TMDBService
import it.wavestream.app.ui.MainActivity
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.util.ContentFilters
import it.wavestream.app.vpn.VpnManager
import it.wavestream.app.vpn.VpnStrategy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import javax.inject.Inject
import it.wavestream.app.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import androidx.activity.viewModels
import it.wavestream.app.ui.home.HomeViewModel
import it.wavestream.app.ui.home.HomeContentType
import it.wavestream.app.data.cache.ContentCache

/**
 * Loading Activity - Shows sync progress after setup
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class LoadingActivity : ComponentActivity() {
    
    @Inject lateinit var playlistDao: PlaylistDao
    @Inject lateinit var playlistRepository: PlaylistRepository
    @Inject lateinit var tmdbRepository: TMDBRepository
    @Inject lateinit var epgRepository: EpgRepository
    @Inject lateinit var userPreferences: UserPreferences
    @Inject lateinit var movieDao: MovieDao
    @Inject lateinit var seriesDao: SeriesDao
    @Inject lateinit var tmdbService: TMDBService
    @Inject lateinit var imdbRatingsRepository: ImdbRatingsRepository
    @Inject lateinit var watchProgressDao: it.wavestream.app.data.database.dao.WatchProgressDao
    @Inject lateinit var profileDao: ProfileDao
    @Inject lateinit var vpnManager: VpnManager
    @Inject @ApplicationScope lateinit var applicationScope: CoroutineScope
    @Inject lateinit var contentCache: ContentCache
    
    private val homeViewModel: HomeViewModel by viewModels()

    
    private var profileId: Long = 1L
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        profileId = intent.getLongExtra("profile_id", 1L)
        val forceRefresh = intent.getBooleanExtra("force_refresh", false)
        
        // Clear cache only if stale (>24h) or force refresh — reuse fresh data when possible
        val homeRowsTime = contentCache.getHomeSessionDataTimestamp("rows_HOME")
        val cacheAge = if (homeRowsTime != null) System.currentTimeMillis() - homeRowsTime else Long.MAX_VALUE
        val staleThreshold = 10 * 24 * 60 * 60 * 1000L // 10 days - match CAROUSEL_CACHE_DURATION
        if (forceRefresh || cacheAge > staleThreshold) {
            contentCache.clearHomeSessionData()
            Log.d("LoadingActivity", "Cache cleared (forceRefresh=$forceRefresh, age=${cacheAge / 3600_000}h)")
        } else {
            Log.d("LoadingActivity", "Cache fresh (age=${cacheAge / 60_000}m), reusing")
        }
        
        // Trigger lazy initialization to start preloading HomeViewModel content in background
        val triggerVm = homeViewModel
        Log.d("LoadingActivity", "Preloading HomeViewModel triggered: $triggerVm")
        
        if (!forceRefresh) {
            // Preload all 3 tabs into ContentCache using applicationScope.
            // These coroutines survive Activity transitions (unlike ViewModel-scoped ones).
            // ContentCache is a @Singleton, so data persists to MainActivity's ViewModel.
            applicationScope.launch(Dispatchers.IO) { homeViewModel.preloadTabIntoCache(HomeContentType.HOME) }
            applicationScope.launch(Dispatchers.IO) { homeViewModel.preloadTabIntoCache(HomeContentType.MOVIES) }
            applicationScope.launch(Dispatchers.IO) { homeViewModel.preloadTabIntoCache(HomeContentType.SERIES) }
        }
        
        setContent {
            WaveStreamTheme {
                LoadingContent(forceRefresh = forceRefresh)
            }
        }
    }
    
    @Composable
    private fun LoadingContent(forceRefresh: Boolean) {
        var loadingState by remember { 
            mutableStateOf(
                LoadingState(
                    status = getString(R.string.loading),
                    detail = "",
                    progress = 0,
                    showProgress = false
                )
            ) 
        }
        
        var profileLoaded by remember { mutableStateOf(false) }
        var profileName by remember { mutableStateOf("") }
        var avatarIndex by remember { mutableIntStateOf(0) }
        var avatarColor by remember { mutableStateOf("#8B5CF6") }
        
        LaunchedEffect(profileId) {
            withContext(Dispatchers.IO) {
                profileDao.getProfileById(profileId)?.let { profile ->
                    profileName = profile.name
                    avatarIndex = profile.avatarIndex
                    avatarColor = profile.avatarColor
                }
                profileLoaded = true
            }
        }
        
        // Start loading on first composition
        LaunchedEffect(Unit) {
            startLoading(forceRefresh) { state ->
                loadingState = state
            }
        }
        
        if (!profileLoaded) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(WaveStreamColors.BackgroundDark)
            )
        } else {
            LoadingScreen(
                profileName = profileName,
                avatarIndex = avatarIndex,
                avatarColorHex = avatarColor,
                statusText = loadingState.status,
                detailText = loadingState.detail,
                progress = loadingState.progress,
                showProgressBar = loadingState.showProgress
            )
        }
    }
    
    private fun startLoading(
        forceRefresh: Boolean = false,
        onStateUpdate: (LoadingState) -> Unit
    ) {
        lifecycleScope.launch {
            try {
                val playlists = playlistDao.getAllPlaylists().first()
                
                if (playlists.isEmpty()) {
                    goToSetup()
                    return@launch
                }
                
                // Phase 1: Playlist sync + EPG — SEMPRE in primo piano, con progresso
                // visibile a schermo. Il refresh avviene rigorosamente e solo qui nella
                // LoadingActivity: mai in background dopo l'avvio (né worker periodici,
                // né coroutine che sopravvivono alla navigazione verso Main).
                val autoUpdateEnabled = userPreferences.getPlaylistAutoUpdate()
                val updateIntervalHours = userPreferences.getPlaylistUpdateIntervalHours()
                val intervalMs = updateIntervalHours * 60 * 60 * 1000L
                val now = System.currentTimeMillis()
                val totalSteps = playlists.size
                var refreshedAny = false
                
                onStateUpdate(LoadingState(status = getString(R.string.loading), detail = "Inizializzazione...", progress = 5, showProgress = true))
                
                playlists.forEachIndexed { index, playlist ->
                    val timeSinceUpdate = now - playlist.lastUpdated
                    val needsUpdate = forceRefresh || (autoUpdateEnabled && timeSinceUpdate > intervalMs)
                    val phaseProgress = 5 + ((index + 1) * 25 / totalSteps)
                    
                    if (needsUpdate) {
                        refreshedAny = true
                        onStateUpdate(LoadingState(status = getString(R.string.loading_syncing), detail = playlist.name, progress = phaseProgress, showProgress = true))
                        try {
                            playlistRepository.refreshPlaylist(playlist.id)
                        } catch (e: Exception) {
                            Log.e("LoadingActivity", "Failed to sync ${playlist.name}", e)
                        }
                    } else {
                        onStateUpdate(LoadingState(status = getString(R.string.loading_using_cache), detail = "${playlist.name}", progress = phaseProgress, showProgress = true))
                    }
                }
                
                loadEpgIfNeeded(playlists, forceRefresh, onStateUpdate)
                refreshTrendingCategoriesIfNeeded(onStateUpdate)
                enrichHeroContent(onStateUpdate)
                
                // Invalida la cache di sessione solo se i dati sono effettivamente cambiati
                if (refreshedAny || forceRefresh) {
                    contentCache.clearHomeSessionData()
                }
                
                // Preload all 3 tabs into ContentCache (idempotent — skips cached tabs):
                // dopo un refresh la session cache è invalidata, senza questo la home
                // si ricostruirebbe lazy (enrichment TMDB inline) mostrando a lungo lo skeleton.
                applicationScope.launch(Dispatchers.IO) { homeViewModel.preloadTabIntoCache(HomeContentType.HOME) }
                applicationScope.launch(Dispatchers.IO) { homeViewModel.preloadTabIntoCache(HomeContentType.MOVIES) }
                applicationScope.launch(Dispatchers.IO) { homeViewModel.preloadTabIntoCache(HomeContentType.SERIES) }
                
                // Phase 2: Wait for HomeViewModel tabs to be ready
                onStateUpdate(LoadingState(
                    status = "Caricamento contenuti...",
                    detail = "Preparazione Home, Film e Serie TV",
                    progress = 85,
                    showProgress = true
                ))
                
                val tabsReady = waitForAllTabsReady(timeoutMs = 120_000)
                if (!tabsReady) {
                    Log.w("LoadingActivity", "Some tabs did not load in time, proceeding anyway")
                }
                
                // Phase 3: Navigate to main screen
                onStateUpdate(LoadingState(
                    status = getString(R.string.loading_complete),
                    detail = "Tutto pronto!",
                    progress = 100,
                    showProgress = true,
                    isComplete = true
                ))
                delay(500) // brief pause to show "Tutto pronto!"
                startVpnIfNeeded()
                goToMain()
                
            } catch (e: Exception) {
                Log.e("LoadingActivity", "Error in startLoading", e)
                startVpnIfNeeded()
                goToMain()
            }
        }
    }
    
    /**
     * Wait for all 3 main tabs (HOME, MOVIES, SERIES) to have content ready.
     * The HomeViewModel init {} triggers loadContent(HOME) which starts loading.
     * We poll isReadyForTab() until all are ready or timeout.
     */
    private suspend fun waitForAllTabsReady(timeoutMs: Long = 120_000): Boolean {
        val tabs = listOf(HomeContentType.HOME, HomeContentType.MOVIES, HomeContentType.SERIES)
        val start = System.currentTimeMillis()
        
        while (System.currentTimeMillis() - start < timeoutMs) {
            val readyCount = tabs.count { homeViewModel.isReadyForTab(it) }
            val elapsed = System.currentTimeMillis() - start
            if (readyCount == tabs.size) {
                Log.d("LoadingActivity", "All 3 tabs ready in ${elapsed}ms")
                return true
            }
            if (elapsed % 3000 < 300) {
                Log.d("LoadingActivity", "waitForAllTabsReady: $readyCount/3 tabs ready after ${elapsed}ms")
            }
            kotlinx.coroutines.delay(300)
        }
        
        val readyCount = tabs.count { homeViewModel.isReadyForTab(it) }
        Log.w("LoadingActivity", "waitForAllTabsReady timed out: $readyCount/3 tabs ready after ${timeoutMs}ms")
        return false
    }
    
    /**
     * Avvia automaticamente la VPN (se l'opzione è attiva) dopo la scelta del profilo,
     * rispettando le ultime impostazioni (strategia, rotazione, intervallo).
     * Viene avviato solo se il consenso VPN è già stato concesso (non si può mostrare
     * il dialogo di consenso durante il caricamento); altrimenti viene saltato.
     */
    private suspend fun startVpnIfNeeded() {
        try {
            if (!userPreferences.getVpnAutoStart()) return
            if (vpnManager.isRunning()) return
            if (vpnManager.getConsentIntent() != null) {
                Log.d("LoadingActivity", "VPN auto-start skipped: consent non ancora concesso")
                return
            }
            val pool = userPreferences.getVpnConfigs()
            if (pool.isEmpty()) return
            val strategy = when (userPreferences.getVpnStrategy()) {
                "round_robin" -> VpnStrategy.ROUND_ROBIN
                "fastest" -> VpnStrategy.FASTEST
                else -> VpnStrategy.RANDOM
            }
            val chosen = vpnManager.selectConfig(pool, strategy) ?: return
            val r = vpnManager.start(chosen)
            if (r.isSuccess && userPreferences.getVpnAutoRotate()) {
                val interval = userPreferences.getVpnRotateInterval().toLongOrNull() ?: 60L
                vpnManager.startAutoRotation(pool, strategy, interval)
            }
            Log.d("LoadingActivity", "VPN auto-start completato (strategia=$strategy)")
        } catch (e: Exception) {
            Log.e("LoadingActivity", "VPN auto-start error", e)
        }
    }

    private fun goToMain() {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("profile_id", profileId)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
    }
    
    private fun goToSetup() {
        val intent = Intent(this, it.wavestream.app.ui.setup.SetupActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
    }
    
    /**
     * Load EPG data if needed based on cache age and user preferences
     */
    private suspend fun loadEpgIfNeeded(
        playlists: List<it.wavestream.app.data.database.entity.Playlist>,
        forceRefresh: Boolean,
        onStateUpdate: (LoadingState) -> Unit
    ) {
        try {
            val epgLastUpdate = userPreferences.getEpgLastUpdate()
            val epgInterval = userPreferences.getEpgUpdateInterval()
            val now = System.currentTimeMillis()
            
            // Calculate interval in milliseconds
            val intervalMs = when (epgInterval) {
                "startup" -> 0L // Always update on startup
                "3h" -> 3 * 60 * 60 * 1000L
                "6h" -> 6 * 60 * 60 * 1000L
                "12h" -> 12 * 60 * 60 * 1000L
                "24h" -> 24 * 60 * 60 * 1000L
                "3d" -> 3 * 24 * 60 * 60 * 1000L
                "weekly" -> 7 * 24 * 60 * 60 * 1000L
                else -> 24 * 60 * 60 * 1000L // Default: 24h
            }
            
            val timeSinceUpdate = now - epgLastUpdate
            val needsUpdate = forceRefresh || 
                              (epgInterval == "startup") ||
                              (intervalMs > 0 && timeSinceUpdate > intervalMs)
            
            if (!needsUpdate) {
                val hoursAgo = timeSinceUpdate / (60 * 60 * 1000)
                android.util.Log.d("LoadingActivity", "EPG cache still valid (updated ${hoursAgo}h ago)")
                return
            }
            
            onStateUpdate(
                LoadingState(
                    status = "Caricamento guida TV...",
                    detail = "",
                    progress = 40,  // Fixed: was 92, causing progress to jump back
                    showProgress = true
                )
            )
            
            // Load EPG for each Xtream playlist with TIMEOUT to prevent hanging
            for (playlist in playlists) {
                try {
                    if (playlist.type == "xtream" && 
                        !playlist.username.isNullOrEmpty() && 
                        !playlist.password.isNullOrEmpty()) {
                        
                        android.util.Log.d("LoadingActivity", "Loading EPG for: ${playlist.name}")
                        
                        // Use timeout to prevent indefinite hang (30 seconds max)
                        val result = withTimeoutOrNull(30_000L) {
                            withContext(Dispatchers.IO) {
                                epgRepository.loadEpgFromXtream(
                                    baseUrl = playlist.url,
                                    username = playlist.username,
                                    password = playlist.password
                                )
                            }
                        }
                        
                        if (result == null) {
                            android.util.Log.w("LoadingActivity", "EPG loading timed out for ${playlist.name}")
                        }
                        
                    } else if (!playlist.epgUrl.isNullOrEmpty()) {
                        // Timeout for EPG URL loading too
                        val result = withTimeoutOrNull(30_000L) {
                            withContext(Dispatchers.IO) {
                                epgRepository.loadEpgFromUrl(playlist.epgUrl)
                            }
                        }
                        if (result == null) {
                            android.util.Log.w("LoadingActivity", "EPG URL loading timed out")
                        }
                    }
                } catch (e: Exception) {
                    android.util.Log.e("LoadingActivity", "Error loading EPG for ${playlist.name}", e)
                    // Continue with other playlists, don't block
                }
            }
            
            // Update last EPG update timestamp
            userPreferences.setEpgLastUpdate(now)
            android.util.Log.d("LoadingActivity", "EPG loaded and cached")
            
        } catch (e: Exception) {
            android.util.Log.e("LoadingActivity", "Error loading EPG", e)
            // Don't block app startup if EPG fails
        }
    }
    
    /**
     * Enrich ALL trending content with full TMDB metadata + OMDB/RT ratings.
     * Skips items already enriched within 7 days.
     * Concurrency limited to 5 parallel API calls to avoid rate limits.
     * This ensures trending content has complete metadata for heroes + carousels.
     */
    private suspend fun enrichHeroContent(onStateUpdate: (LoadingState) -> Unit) {
        try {
            // True se almeno una valutazione è stata aggiornata/scritta nel DB
            var ratingsUpdated = false
            withContext(Dispatchers.IO) {
                val sevenDaysAgo = System.currentTimeMillis() - 7 * 24 * 60 * 60 * 1000L
                
                // === MOVIES: enrich ALL trending ===
                val allTrendingMovies = movieDao.getByTrendingCategory("Film Popolari")
                val moviesToEnrich = allTrendingMovies.filter { movie ->
                    movie.tmdbLastFetchAt == null || movie.tmdbLastFetchAt < sevenDaysAgo || movie.tmdbVoteAverage == null ||
                    // Retry anche se arricchito di recente ma manca qualche voto OMDB:
                    // un rating può comparare nelle API dopo (es. uscita recente) e
                    // deve poter essere recuperato già all'avvio successivo.
                    movie.omdbImdbRating == null || movie.omdbRottenTomatoesScore == null || movie.omdbMetacriticScore == null
                }.sortedByDescending { it.tmdbPopularity ?: 0f }.take(100)
                
                val moviesCached = allTrendingMovies.size - moviesToEnrich.size
                android.util.Log.d("LoadingActivity", 
                    "Movies: ${allTrendingMovies.size} trending, $moviesCached already enriched, ${moviesToEnrich.size} to enrich")
                
                if (moviesToEnrich.isNotEmpty()) {
                    withContext(Dispatchers.Main) {
                        onStateUpdate(LoadingState(
                            status = "Preparazione film...",
                            detail = "",
                            progress = 55,
                            showProgress = true
                        ))
                    }
                    
                    // Enrich in batches of 5 (concurrency limit)
                    val batchSize = 5
                    for (batchStart in moviesToEnrich.indices step batchSize) {
                        val batch = moviesToEnrich.drop(batchStart).take(batchSize)
                        val deferredMovies = batch.map { movie ->
                            async(Dispatchers.IO) {
                                try {
                                    val enrichedMovie = tmdbService.enrichMovieDetails(movie)
                                    // Refresh whenever any rating field is empty (not only imdb)
                                    if (enrichedMovie.omdbImdbRating == null ||
                                        enrichedMovie.omdbRottenTomatoesScore == null ||
                                        enrichedMovie.omdbMetacriticScore == null
                                    ) {
                                        val ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                                            imdbId = enrichedMovie.tmdbImdbId,
                                            originalTitle = movie.name,
                                            englishTitle = enrichedMovie.tmdbOriginalTitle ?: enrichedMovie.tmdbTitle,
                                            year = enrichedMovie.year,
                                            type = "movie"
                                        )
                                        if (ratings != null) {
                                            var withRatings = enrichedMovie.copy(
                                                omdbImdbRating = ratings.getFormattedImdbRating(),
                                                omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                                                omdbMetacriticScore = ratings.metacriticScore,
                                                omdbAudienceScore = ratings.audienceScore,
                                                omdbLastFetchAt = System.currentTimeMillis()
                                            )
                                            if (withRatings.omdbAudienceScore == null) {
                                                val searchTitle = withRatings.tmdbOriginalTitle ?: withRatings.tmdbTitle ?: movie.name
                                                val rtScores = imdbRatingsRepository.fetchRtScores(
                                                    title = searchTitle, year = withRatings.year, isMovie = true
                                                )
                                                if (rtScores != null) {
                                                    withRatings = withRatings.copy(
                                                        omdbAudienceScore = withRatings.omdbAudienceScore ?: rtScores.audienceScore,
                                                        omdbRottenTomatoesScore = withRatings.omdbRottenTomatoesScore ?: rtScores.criticsScore
                                                    )
                                                }
                                            }
                                            movieDao.update(withRatings)
                                            ratingsUpdated = true
                                        }
                                    } else if (enrichedMovie.omdbAudienceScore == null || enrichedMovie.omdbRottenTomatoesScore == null) {
                                        val searchTitle = enrichedMovie.tmdbOriginalTitle ?: enrichedMovie.tmdbTitle ?: movie.name
                                        val rtScores = imdbRatingsRepository.fetchRtScores(
                                            title = searchTitle, year = enrichedMovie.year, isMovie = true
                                        )
                                        if (rtScores != null) {
                                            movieDao.update(enrichedMovie.copy(
                                                omdbAudienceScore = enrichedMovie.omdbAudienceScore ?: rtScores.audienceScore,
                                                omdbRottenTomatoesScore = enrichedMovie.omdbRottenTomatoesScore ?: rtScores.criticsScore
                                            ))
                                            ratingsUpdated = true
                                        }
                                    }
                                } catch (e: Exception) {
                                    android.util.Log.e("LoadingActivity", "Error enriching movie: ${movie.name}", e)
                                }
                                Unit
                            }
                        }
                        deferredMovies.awaitAll()
                        val progress = 55 + ((batchStart + batch.size) * 20 / moviesToEnrich.size.coerceAtLeast(1))
                        withContext(Dispatchers.Main) {
                            onStateUpdate(LoadingState(
                                status = "Preparazione film...",
                                detail = "",
                                progress = progress,
                                showProgress = true
                            ))
                        }
                        android.util.Log.d("LoadingActivity", "Movies enriched: ${batchStart + batch.size}/${moviesToEnrich.size}")
                    }
                } else {
                    android.util.Log.d("LoadingActivity", "All movies already enriched, skipping")
                    withContext(Dispatchers.Main) {
                        onStateUpdate(LoadingState(
                            status = "Contenuti già pronti!",
                            detail = "",
                            progress = 75,
                            showProgress = true
                        ))
                    }
                }

                // === SERIES: enrich ALL trending ===
                val allTrendingSeries = seriesDao.getByTrendingCategory("Serie Popolari")
                val seriesToEnrich = allTrendingSeries.filter { series ->
                    series.tmdbLastFetchAt == null || series.tmdbLastFetchAt < sevenDaysAgo || series.tmdbVoteAverage == null ||
                    // Retry anche se arricchita di recente ma manca qualche voto OMDB
                    series.omdbImdbRating == null || series.omdbRottenTomatoesScore == null || series.omdbMetacriticScore == null
                }.sortedByDescending { it.tmdbPopularity ?: 0f }.take(100)
                
                val seriesCached = allTrendingSeries.size - seriesToEnrich.size
                android.util.Log.d("LoadingActivity", 
                    "Series: ${allTrendingSeries.size} trending, $seriesCached already enriched, ${seriesToEnrich.size} to enrich")
                
                if (seriesToEnrich.isNotEmpty()) {
                    withContext(Dispatchers.Main) {
                        onStateUpdate(LoadingState(
                            status = "Preparazione serie TV...",
                            detail = "",
                            progress = 76,
                            showProgress = true
                        ))
                    }
                    
                    val batchSize = 5
                    for (batchStart in seriesToEnrich.indices step batchSize) {
                        val batch = seriesToEnrich.drop(batchStart).take(batchSize)
                        val deferredSeries = batch.map { series ->
                            async(Dispatchers.IO) {
                                try {
                                    val enrichedSeries = tmdbService.enrichSeriesDetails(series)
                                    // Refresh whenever any rating field is empty (not only imdb)
                                    if (enrichedSeries.omdbImdbRating == null ||
                                        enrichedSeries.omdbRottenTomatoesScore == null ||
                                        enrichedSeries.omdbMetacriticScore == null
                                    ) {
                                        val ratings = imdbRatingsRepository.getRatingsWithFallbacks(
                                            imdbId = enrichedSeries.tmdbImdbId,
                                            originalTitle = series.name,
                                            englishTitle = enrichedSeries.tmdbOriginalName ?: enrichedSeries.tmdbName,
                                            year = enrichedSeries.year,
                                            type = "series"
                                        )
                                        if (ratings != null) {
                                            var withRatings = enrichedSeries.copy(
                                                omdbImdbRating = ratings.getFormattedImdbRating(),
                                                omdbRottenTomatoesScore = ratings.rottenTomatoesScore,
                                                omdbMetacriticScore = ratings.metacriticScore,
                                                omdbAudienceScore = ratings.audienceScore,
                                                omdbLastFetchAt = System.currentTimeMillis()
                                            )
                                            if (withRatings.omdbAudienceScore == null || withRatings.omdbRottenTomatoesScore == null) {
                                                val searchTitle = withRatings.tmdbOriginalName ?: withRatings.tmdbName ?: series.name
                                                val rtScores = imdbRatingsRepository.fetchRtScores(
                                                    title = searchTitle, year = withRatings.year, isMovie = false
                                                )
                                                if (rtScores != null) {
                                                    withRatings = withRatings.copy(
                                                        omdbAudienceScore = withRatings.omdbAudienceScore ?: rtScores.audienceScore,
                                                        omdbRottenTomatoesScore = withRatings.omdbRottenTomatoesScore ?: rtScores.criticsScore
                                                    )
                                                }
                                            }
                                            seriesDao.update(withRatings)
                                            ratingsUpdated = true
                                        }
                                    } else if (enrichedSeries.omdbAudienceScore == null || enrichedSeries.omdbRottenTomatoesScore == null) {
                                        val searchTitle = enrichedSeries.tmdbOriginalName ?: enrichedSeries.tmdbName ?: series.name
                                        val rtScores = imdbRatingsRepository.fetchRtScores(
                                            title = searchTitle, year = enrichedSeries.year, isMovie = false
                                        )
                                        if (rtScores != null) {
                                            seriesDao.update(enrichedSeries.copy(
                                                omdbAudienceScore = enrichedSeries.omdbAudienceScore ?: rtScores.audienceScore,
                                                omdbRottenTomatoesScore = enrichedSeries.omdbRottenTomatoesScore ?: rtScores.criticsScore
                                            ))
                                            ratingsUpdated = true
                                        }
                                    }
                                } catch (e: Exception) {
                                    android.util.Log.e("LoadingActivity", "Error enriching series: ${series.name}", e)
                                }
                                Unit
                            }
                        }
                        deferredSeries.awaitAll()
                        val progress = 76 + ((batchStart + batch.size) * 20 / seriesToEnrich.size.coerceAtLeast(1))
                        withContext(Dispatchers.Main) {
                            onStateUpdate(LoadingState(
                                status = "Preparazione serie TV...",
                                detail = "",
                                progress = progress,
                                showProgress = true
                            ))
                        }
                        android.util.Log.d("LoadingActivity", "Series enriched: ${batchStart + batch.size}/${seriesToEnrich.size}")
                    }
                } else {
                    android.util.Log.d("LoadingActivity", "All series already enriched, skipping")
                    withContext(Dispatchers.Main) {
                        onStateUpdate(LoadingState(
                            status = "Contenuti già pronti!",
                            detail = "",
                            progress = 96,
                            showProgress = true
                        ))
                    }
                }
            }
            
            // Se almeno una valutazione è stata aggiornata nel DB, invalida la cache
            // degli hero: verranno ricostruiti leggendo i voti appena aggiornati, così
            // un voto comparso nelle API dopo la prima enrichment diventa visibile in home.
            if (ratingsUpdated) {
                listOf("hero_HOME", "hero_MOVIES", "hero_SERIES").forEach { key ->
                    contentCache.removeHomeSessionData(key)
                }
                android.util.Log.d("LoadingActivity", "Ratings updated → invalidata cache hero per ricostruzione con voti freschi")
            }
            
            android.util.Log.d("LoadingActivity", "Hero content enrichment complete")
            
        } catch (e: Exception) {
            android.util.Log.e("LoadingActivity", "Error enriching hero content", e)
        }
    }
    
    /**
     * Refresh TMDB trending categories if cache has expired (7 days)
     * Clears old trending assignments and populates with fresh trending data
     */
    private suspend fun refreshTrendingCategoriesIfNeeded(onStateUpdate: (LoadingState) -> Unit) {
        try {
            val lastUpdate = userPreferences.getTmdbPopularLastUpdate()
            val oneWeekMs = 7 * 24 * 60 * 60 * 1000L
            
            // FORCE REFRESH: Disabled (returning to 7-day cycle)
            val forceRefresh = false
            val needsUpdate = forceRefresh || (System.currentTimeMillis() - lastUpdate) > oneWeekMs
            
            // Force re-populate if trending is empty but catalog is large enough
            val existingMovieTrending = movieDao.getByTrendingCategory("Film Popolari").size
            val existingSeriesTrending = seriesDao.getByTrendingCategory("Serie Popolari").size
            val shouldForceBecauseEmpty = (existingMovieTrending == 0 && movieDao.getAllMoviesCount() > 50) ||
                                          (existingSeriesTrending == 0 && seriesDao.getAllSeriesCount() > 50)
            
            if (!needsUpdate && !shouldForceBecauseEmpty) {
                android.util.Log.d("LoadingActivity", "Trending categories cache still valid, skipping refresh")
                return
            }
            
            if (shouldForceBecauseEmpty) {
                android.util.Log.d("LoadingActivity", "Trending vuoto ma catalogo grande (movies=$existingMovieTrending, series=$existingSeriesTrending), forzo re-populate")
            }
            
            android.util.Log.d("LoadingActivity", "Trending categories: Refreshing...")
            
            withContext(Dispatchers.Main) {
                onStateUpdate(
                    LoadingState(
                        status = "Aggiornamento contenuti trending...",
                        detail = "",
                        progress = 52,
                        showProgress = true
                    )
                )
            }
            
            withContext(Dispatchers.IO) {
                // NOTA: il clear delle vecchie categorie avviene DENTRO TMDBService,
                // subito dopo il fetch riuscito — così un errore di rete non lascia
                // mai i caroselli trending vuoti.
                
                // Populate new trending from TMDB
                val movieCount = tmdbService.populateTrendingMovies()
                val seriesCount = tmdbService.populateTrendingSeries()
                
                android.util.Log.d("LoadingActivity", "Trending populated: $movieCount movies, $seriesCount series")
            }
            
            // Update timestamp
            userPreferences.setTmdbPopularLastUpdate(System.currentTimeMillis())
            
            withContext(Dispatchers.Main) {
                onStateUpdate(
                    LoadingState(
                        status = "Contenuti trending aggiornati",
                        detail = "",
                        progress = 55,
                        showProgress = true
                    )
                )
            }
            delay(200)
            
        } catch (e: Exception) {
            android.util.Log.e("LoadingActivity", "Error refreshing trending categories", e)
            // Don't block app startup if trending refresh fails
        }
    }
}




