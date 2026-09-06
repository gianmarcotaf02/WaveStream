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
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.dao.CategoryWithCount
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.WatchProgressDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.ContinueWatchingItem
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.ui.components.ContinueWatchingCarousel
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
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

        // Load more: appends next page to current list
        fun loadMoreMovies() {
            if (isLoadingMore) return
            lifecycleScope.launch {
                isLoadingMore = true
                val offset = movies.size
                val more = if (showingAllMovies) {
                    movieDao.getAllMoviesListPaged(PAGE_SIZE, offset)
                } else {
                    movieDao.getMoviesByCategoryListPaged(selectedCategory!!, PAGE_SIZE, offset)
                }
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
                val total = movieDao.getAllMoviesCount()
                totalMoviesCount = total
                val first = movieDao.getAllMoviesListPaged(PAGE_SIZE, 0)
                movies = first
                hasMoreMovies = first.size < total
            } else {
                showingAllMovies = false
                selectedCategory = initialCategory
                val total = movieDao.getMoviesCountByCategory(initialCategory)
                totalMoviesCount = total
                val first = movieDao.getMoviesByCategoryListPaged(initialCategory, PAGE_SIZE, 0)
                movies = first
                hasMoreMovies = first.size < total
            }
            isLoading = false
        }

        // Load movies when category changes (user taps sidebar)
        LaunchedEffect(selectedCategory) {
            if (selectedCategory != null) {
                isLoading = true
                showingAllMovies = false
                val total = movieDao.getMoviesCountByCategory(selectedCategory!!)
                totalMoviesCount = total
                val first = movieDao.getMoviesByCategoryListPaged(selectedCategory!!, PAGE_SIZE, 0)
                movies = first
                hasMoreMovies = first.size < total
                isLoading = false
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
            continueWatchingItems = continueWatchingItems,
            onCategorySelect = { cat ->
                showingAllMovies = false
                selectedCategory = cat
            },
            onViewAllClick = {
                lifecycleScope.launch {
                    isLoading = true
                    showingAllMovies = true
                    selectedCategory = null
                    val total = movieDao.getAllMoviesCount()
                    totalMoviesCount = total
                    val first = movieDao.getAllMoviesListPaged(PAGE_SIZE, 0)
                    movies = first
                    hasMoreMovies = first.size < total
                    isLoading = false
                }
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
            onBackClick = { finish() }
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
    continueWatchingItems: List<ContinueWatchingItem> = emptyList(),
    onCategorySelect: (String) -> Unit,
    onViewAllClick: () -> Unit,
    onMovieClick: (Movie) -> Unit,
    onLoadMore: () -> Unit = {},
    onContinueWatchingClick: (ContinueWatchingItem) -> Unit = {},
    onBackClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Left sidebar - categories
        CategorySidebar(
            categories = categories,
            selectedCategory = selectedCategory,
            showingAllMovies = showingAllMovies,
            totalMoviesCount = totalMoviesCount,
            onCategorySelect = onCategorySelect,
            onViewAllClick = onViewAllClick,
            modifier = Modifier
                .width(280.dp)
                .fillMaxHeight()
        )
        
        // Right content - movie grid
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(24.dp)
        ) {
            if (isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center),
                    color = WaveStreamColors.Accent
                )
            } else if (movies.isEmpty()) {
                Text(
                    text = "Nessun film in questa categoria",
                    style = MaterialTheme.typography.bodyLarge,
                    color = WaveStreamColors.TextSecondary,
                    modifier = Modifier.align(Alignment.Center)
                )
            } else {
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
                                text = if (showingAllMovies) "🎬 Tutti i film" else (selectedCategory ?: ""),
                                style = MaterialTheme.typography.headlineMedium,
                                color = WaveStreamColors.TextPrimary,
                                fontWeight = FontWeight.Bold
                            )
                            
                            Text(
                                text = "${movies.size} film",
                                style = MaterialTheme.typography.bodyMedium,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
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
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp),
                        modifier = Modifier.fillMaxSize()
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
        }
    }
}

/**
 * Category sidebar
 */
@Composable
private fun CategorySidebar(
    categories: List<CategoryWithCount>,
    selectedCategory: String?,
    showingAllMovies: Boolean,
    totalMoviesCount: Int,
    onCategorySelect: (String) -> Unit,
    onViewAllClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TvLazyColumn(
        modifier = modifier
            .background(WaveStreamColors.BackgroundGradient)  // atmosfera oceanica, mai nero puro
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        // "View All" item at the top
        item(key = "__view_all__") {
            ViewAllItem(
                label = "🎬 Tutti i film",
                count = totalMoviesCount,
                isSelected = showingAllMovies,
                onClick = onViewAllClick
            )
        }
        
        tvListItems(categories, key = { it.name }) { category ->
            CategoryItem(
                category = category,
                isSelected = !showingAllMovies && category.name == selectedCategory,
                onClick = { onCategorySelect(category.name) }
            )
        }
    }
}

/**
 * View All item in sidebar
 */
@Composable
private fun ViewAllItem(
    label: String,
    count: Int,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent.copy(alpha = 0.3f)
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> Color.Transparent
        },
        label = "viewAllBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "viewAllBorder"
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isSelected || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        
        Text(
            text = count.toString(),
            style = MaterialTheme.typography.labelMedium,
            color = WaveStreamColors.TextTertiary
        )
    }
}

/**
 * Category item in sidebar
 */
@Composable
private fun CategoryItem(
    category: CategoryWithCount,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent.copy(alpha = 0.3f)
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> Color.Transparent
        },
        label = "catBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "catBorder"
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = category.name,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isSelected || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        
        Text(
            text = category.count.toString(),
            style = MaterialTheme.typography.labelMedium,
            color = WaveStreamColors.TextTertiary
        )
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
                .height(225.dp)
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


