package it.wavestream.app.ui.film

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid
import androidx.tv.foundation.lazy.grid.TvGridCells
import androidx.tv.foundation.lazy.grid.items as tvGridItems
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.items as tvListItems
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.sqlite.db.SimpleSQLiteQuery
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.dao.CategoryWithCount
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.WatchProgressDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.ContinueWatchingItem
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.ui.components.ContentQueryBuilder
import it.wavestream.app.ui.components.ContentSortFilterBar
import it.wavestream.app.ui.components.ContinueWatchingCarousel
import it.wavestream.app.ui.components.SortFilterState
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Film Activity with category sidebar and movie grid
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class FilmActivity : ComponentActivity() {

    companion object {
        private const val PAGE_SIZE = 150
    }

    @Inject lateinit var movieDao: MovieDao
    @Inject lateinit var watchProgressDao: WatchProgressDao
    @Inject lateinit var contentCache: ContentCache
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Read filter_category - null means "View All"
        val initialCategory = intent.getStringExtra("filter_category")
        
        setContent {
            WaveStreamTheme {
                FilmScreenContent(initialCategory)
            }
        }
    }
    
    @Composable
    private fun FilmScreenContent(initialCategory: String?) {
        var categories by remember { mutableStateOf<List<CategoryWithCount>>(emptyList()) }
        var selectedCategory by remember { mutableStateOf<String?>(null) }
        var movies by remember { mutableStateOf<List<Movie>>(emptyList()) }
        var isLoading by remember { mutableStateOf(true) }
        var isLoadingMore by remember { mutableStateOf(false) }
        var hasMoreMovies by remember { mutableStateOf(false) }
        var totalMoviesCount by remember { mutableIntStateOf(0) }
        var showingAllMovies by remember { mutableStateOf(initialCategory == null) }
        var continueWatchingItems by remember { mutableStateOf<List<ContinueWatchingItem>>(emptyList()) }
        var sortFilter by remember { mutableStateOf(SortFilterState()) }
        var reloadToken by remember { mutableIntStateOf(0) }
        // Debounce dei cambi filtri: evita un reload ad ogni click sullo stepper
        // (era la causa di sfarfallii e reset dello scroll).
        var pendingFilterReload by remember { mutableIntStateOf(0) }

        // Stato griglia: quando cambiano categoria o filtri si riparte dall'alto.
        val gridState = androidx.tv.foundation.lazy.grid.rememberTvLazyGridState()
        LaunchedEffect(sortFilter, selectedCategory, showingAllMovies) {
            try {
                gridState.scrollToItem(0)
            } catch (_: Exception) {
            }
        }

        // Categoria corrente: null = "Tutti i film"
        fun currentCategory(): String? = if (showingAllMovies) null else selectedCategory

        fun buildMoviesQuery(offset: Int, limit: Int): SimpleSQLiteQuery {
            val q = ContentQueryBuilder.movies(currentCategory(), sortFilter, limit, offset)
            return SimpleSQLiteQuery(q.sql, q.args.toTypedArray())
        }

        // Ricarica da zero applicando ordinamento/filtri correnti.
        fun reloadMovies() {
            val token = ++reloadToken
            lifecycleScope.launch {
                isLoading = true
                val countQ = ContentQueryBuilder.moviesCount(currentCategory(), sortFilter)
                val total = movieDao.countMoviesRaw(
                    SimpleSQLiteQuery(countQ.sql, countQ.args.toTypedArray())
                )
                val first = movieDao.queryMoviesRaw(buildMoviesQuery(0, PAGE_SIZE))
                if (token != reloadToken) return@launch
                totalMoviesCount = total
                movies = first
                hasMoreMovies = first.size < totalMoviesCount
                isLoading = false
            }
        }

        // Load more: appends next page to current list
        fun loadMoreMovies() {
            if (isLoadingMore) return
            lifecycleScope.launch {
                isLoadingMore = true
                val offset = movies.size
                val more = movieDao.queryMoviesRaw(buildMoviesQuery(offset, PAGE_SIZE))
                movies = movies + more
                hasMoreMovies = movies.size < totalMoviesCount
                isLoadingMore = false
            }
        }

        // Initial load
        LaunchedEffect(Unit) {
            // Continue watching — batch query (N+1 fix)
            val progressList = watchProgressDao.getContinueWatchingMovies(1L)
            if (progressList.isNotEmpty()) {
                val ids = progressList.map { it.contentId }
                val moviesById = movieDao.getMoviesByIds(ids).associateBy { it.id }
                continueWatchingItems = progressList.mapNotNull { progress ->
                    val movie = moviesById[progress.contentId] ?: return@mapNotNull null
                    val remaining = ((progress.duration - progress.position) / 60000).toInt()
                    ContinueWatchingItem(
                        watchProgressId = progress.id,
                        contentType = ContentType.MOVIE,
                        contentId = progress.contentId,
                        title = movie.tmdbTitle ?: movie.name,
                        posterUrl = movie.posterUrl,
                        backdropUrl = movie.backdropUrl,
                        position = progress.position,
                        duration = progress.duration,
                        progressPercent = progress.progressPercent,
                        remainingMinutes = remaining.coerceAtLeast(1),
                        lastWatchedAt = progress.lastWatchedAt
                    )
                }
            }

            val cats = movieDao.getCategoriesWithCount()
            categories = cats

            if (initialCategory == null) {
                showingAllMovies = true
                selectedCategory = null
            } else {
                showingAllMovies = false
                selectedCategory = initialCategory
            }
            reloadMovies()
        }

        // Applica i filtri dopo una breve pausa: un'unica query anche se l'utente
        // preme pi\u00f9 volte di fila le frecce degli stepper.
        LaunchedEffect(pendingFilterReload) {
            if (pendingFilterReload > 0) {
                delay(250)
                reloadMovies()
            }
        }

        FilmScreen(
            categories = categories,
            selectedCategory = selectedCategory,
            movies = movies,
            isLoading = isLoading,
            isLoadingMore = isLoadingMore,
            hasMoreMovies = hasMoreMovies,
            showingAllMovies = showingAllMovies,
            totalMoviesCount = totalMoviesCount,
            sortFilter = sortFilter,
            availableCategories = categories.map { it.name },
            showCategoryFilter = showingAllMovies,
            continueWatchingItems = continueWatchingItems,
            onSortFilterChange = { newState ->
                if (newState != sortFilter) {
                    sortFilter = newState
                    pendingFilterReload++
                }
            },
            onCategorySelect = { cat ->
                showingAllMovies = false
                selectedCategory = cat
                // La categoria della sidebar sostituisce il filtro multi-categoria.
                sortFilter = sortFilter.copy(filter = sortFilter.filter.copy(categories = emptySet()))
                reloadMovies()
            },
            onViewAllClick = {
                showingAllMovies = true
                selectedCategory = null
                reloadMovies()
            },
            onLoadMore = { loadMoreMovies() },
            onMovieClick = { openMovieDetails(it) },
            onContinueWatchingClick = { item ->
                val intent = Intent(this@FilmActivity, DetailsActivity::class.java).apply {
                    putExtra("content_id", item.contentId)
                    putExtra("content_type", "MOVIE")
                    putExtra("title", item.title)
                    putExtra("poster_url", item.posterUrl)
                    putExtra("backdrop_url", item.backdropUrl)
                }
                startActivity(intent)
            },
            onBackClick = { finish() },
            gridState = gridState
        )
    }
    
    private fun openMovieDetails(movie: Movie) {
        val intent = Intent(this, DetailsActivity::class.java).apply {
            putExtra("content_id", movie.id)
            putExtra("content_type", "MOVIE")
            putExtra("title", movie.tmdbTitle ?: movie.name)
            putExtra("poster_url", movie.posterUrl ?: movie.logoUrl)
            putExtra("backdrop_url", movie.backdropUrl)
        }
        startActivity(intent)
    }
}

/**
 * Film Screen Composable - sidebar + grid layout
 */
@Composable
fun FilmScreen(
    categories: List<CategoryWithCount>,
    selectedCategory: String?,
    movies: List<Movie>,
    isLoading: Boolean,
    isLoadingMore: Boolean = false,
    hasMoreMovies: Boolean = false,
    showingAllMovies: Boolean,
    totalMoviesCount: Int,
    sortFilter: SortFilterState = SortFilterState(),
    availableCategories: List<String> = emptyList(),
    showCategoryFilter: Boolean = false,
    continueWatchingItems: List<ContinueWatchingItem> = emptyList(),
    onSortFilterChange: (SortFilterState) -> Unit = {},
    onCategorySelect: (String) -> Unit,
    onViewAllClick: () -> Unit,
    onMovieClick: (Movie) -> Unit,
    onLoadMore: () -> Unit = {},
    onContinueWatchingClick: (ContinueWatchingItem) -> Unit = {},
    onBackClick: () -> Unit,
    gridState: androidx.tv.foundation.lazy.grid.TvLazyGridState =
        androidx.tv.foundation.lazy.grid.rememberTvLazyGridState()
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Content - movie grid (sidebar rimossa: le categorie si scelgono dal menu Filtri)
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(24.dp)
        ) {
            Column {
                // Back button and title row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        IconButton(
                            onClick = onBackClick,
                            modifier = Modifier.size(40.dp)
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Indietro",
                                tint = WaveStreamColors.TextPrimary
                            )
                        }
                        
                        Spacer(modifier = Modifier.width(8.dp))
                        
                        Column {
                            Text(
                                text = if (showingAllMovies) "Tutti i film" else (selectedCategory ?: ""),
                                style = MaterialTheme.typography.headlineMedium,
                                color = WaveStreamColors.TextPrimary,
                                fontWeight = FontWeight.Bold
                            )
                            
                            Text(
                                text = "$totalMoviesCount film",
                                style = MaterialTheme.typography.bodyMedium,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(12.dp))

                    ContentSortFilterBar(
                        state = sortFilter,
                        onStateChange = onSortFilterChange,
                        availableCategories = availableCategories,
                        showCategoryFilter = true
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    
                    // Loading NON distruttivo: se ci sono gi\u00e0 contenuti la griglia resta
                    // montata (nessuno sfarfallio/reset dello scroll) e mostriamo solo un
                    // overlay; lo spinner pieno compare solo al primo caricamento.
                    if (movies.isEmpty() && isLoading) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(color = WaveStreamColors.Accent)
                        }
                    } else if (movies.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Nessun film in questa categoria",
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    } else {
                    Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Column(modifier = Modifier.fillMaxSize()) {
                    // Continue Watching Carousel (if items exist)
                    if (continueWatchingItems.isNotEmpty()) {
                        ContinueWatchingCarousel(
                            title = "▶ Continua a guardare",
                            items = continueWatchingItems,
                            onItemClick = onContinueWatchingClick,
                            modifier = Modifier.padding(bottom = 24.dp)
                        )
                    }
                    
                    // Movie grid using TV Compose for proper D-pad navigation
                    TvLazyVerticalGrid(
                        columns = TvGridCells.Adaptive(minSize = 150.dp),
                        state = gridState,
                        contentPadding = PaddingValues(top = 8.dp, bottom = 64.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp),
                        modifier = Modifier.weight(1f).fillMaxWidth()
                    ) {
                        tvGridItems(movies, key = { it.id }) { movie ->
                            MovieGridCard(
                                movie = movie,
                                onClick = { onMovieClick(movie) }
                            )
                        }
                        // Load more button — shown when more data is available
                        if (hasMoreMovies || isLoadingMore) {
                            item(key = "load_more_movies", span = { androidx.tv.foundation.lazy.grid.TvGridItemSpan(maxLineSpan) }) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 24.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    if (isLoadingMore) {
                                        CircularProgressIndicator(
                                            color = WaveStreamColors.Accent,
                                            modifier = Modifier.size(32.dp)
                                        )
                                    } else {
                                        val interactionSource = remember { MutableInteractionSource() }
                                        val isFocused by interactionSource.collectIsFocusedAsState()
                                        val remaining = totalMoviesCount - movies.size
                                        Text(
                                            text = "▼  Carica altri $remaining film",
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
                                            fontWeight = if (isFocused) FontWeight.Bold else FontWeight.Normal,
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(8.dp))
                                                .background(if (isFocused) WaveStreamColors.Accent.copy(alpha = 0.1f) else Color.Transparent)
                                                .clickable { onLoadMore() }
                                                .focusable(interactionSource = interactionSource)
                                                .padding(horizontal = 24.dp, vertical = 12.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                    }
                    }
                    if (isLoading) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.35f)),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(color = WaveStreamColors.Accent)
                        }
                    }
                    }
                }
            }
        }
    }

/**
 * Movie card for grid
 */
@Composable
private fun MovieGridCard(
    movie: Movie,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.08f else 1f,
        label = "movieScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "movieBorder"
    )
    
    Column(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(150.dp)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
        // Poster
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(205.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(2.dp, borderColor, RoundedCornerShape(8.dp))
                .background(WaveStreamColors.CardBackground)
        ) {
            AsyncImage(
                model = movie.posterUrl ?: movie.logoUrl,
                contentDescription = movie.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            
            // Rating badge
            movie.rating?.takeIf { it > 0 }?.let { rating ->
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(WaveStreamColors.Accent)
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = String.format("%.1f", rating),
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // Title
        Text(
            text = movie.tmdbTitle ?: movie.name,
            style = MaterialTheme.typography.bodySmall,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            lineHeight = 16.sp
        )
        
        // Year
        movie.year?.let { year ->
            Text(
                text = year.toString(),
                style = MaterialTheme.typography.labelSmall,
                color = WaveStreamColors.TextTertiary
            )
        }
    }
}


