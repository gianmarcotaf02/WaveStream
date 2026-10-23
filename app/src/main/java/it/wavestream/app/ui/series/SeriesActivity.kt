package it.wavestream.app.ui.series

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
import androidx.tv.foundation.lazy.grid.itemsIndexed as tvGridItemsIndexed
import it.wavestream.app.ui.theme.cascadeIn
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
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.compose.LifecycleResumeEffect
import androidx.sqlite.db.SimpleSQLiteQuery
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.dao.EpisodeDao
import it.wavestream.app.data.database.dao.SeriesCategoryWithCount
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.Series
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.components.ContentQueryBuilder
import it.wavestream.app.ui.components.ContentSortFilterBar
import it.wavestream.app.ui.components.SortFilterState
import it.wavestream.app.ui.util.requestFocusWhenReady
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Series Activity with category sidebar and series grid
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class SeriesActivity : ComponentActivity() {

    companion object {
        private const val PAGE_SIZE = 150
    }

    @Inject lateinit var seriesDao: SeriesDao
    @Inject lateinit var episodeDao: EpisodeDao
    @Inject lateinit var contentCache: ContentCache
    @Inject lateinit var userPreferences: UserPreferences
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Read filter_category - null means "View All"
        val initialCategory = intent.getStringExtra("filter_category")
        
        setContent {
            WaveStreamTheme {
                SeriesScreenContent(initialCategory)
            }
        }
    }
    
    @Composable
    private fun SeriesScreenContent(initialCategory: String?) {
        var categories by remember { mutableStateOf<List<SeriesCategoryWithCount>>(emptyList()) }
        var selectedCategory by remember { mutableStateOf<String?>(null) }
        var seriesList by remember { mutableStateOf<List<Series>>(emptyList()) }
        var isLoading by remember { mutableStateOf(true) }
        var isLoadingMore by remember { mutableStateOf(false) }
        var hasMoreSeries by remember { mutableStateOf(false) }
        var totalSeriesCount by remember { mutableIntStateOf(0) }
        var showingAllSeries by remember { mutableStateOf(initialCategory == null) }
        var sortFilter by remember { mutableStateOf(SortFilterState()) }
        var reloadToken by remember { mutableIntStateOf(0) }
        // Debounce dei cambi filtri: un'unica query anche premendo pi\u00f9 volte lo stepper.
        var pendingFilterReload by remember { mutableIntStateOf(0) }

        // Stato griglia: quando cambiano categoria o filtri si riparte dall'alto.
        val gridState = androidx.tv.foundation.lazy.grid.rememberTvLazyGridState()
        LaunchedEffect(sortFilter, selectedCategory, showingAllSeries) {
            try {
                gridState.scrollToItem(0)
            } catch (_: Exception) {
            }
        }

        // Categoria corrente: null = "Tutte le serie TV"
        fun currentCategory(): String? = if (showingAllSeries) null else selectedCategory

        fun buildSeriesQuery(offset: Int, limit: Int): SimpleSQLiteQuery {
            val q = ContentQueryBuilder.series(currentCategory(), sortFilter, limit, offset)
            return SimpleSQLiteQuery(q.sql, q.args.toTypedArray())
        }

        // Ricarica da zero applicando ordinamento/filtri correnti.
        fun reloadSeries() {
            val token = ++reloadToken
            lifecycleScope.launch {
                isLoading = true
                val countQ = ContentQueryBuilder.seriesCount(currentCategory(), sortFilter)
                val total = seriesDao.countSeriesRaw(
                    SimpleSQLiteQuery(countQ.sql, countQ.args.toTypedArray())
                )
                val first = seriesDao.querySeriesRaw(buildSeriesQuery(0, PAGE_SIZE))
                if (token != reloadToken) return@launch
                totalSeriesCount = total
                seriesList = first
                hasMoreSeries = first.size < totalSeriesCount
                isLoading = false
            }
        }

        // Load more: appends next page to current list
        fun loadMoreSeries() {
            if (isLoadingMore) return
            lifecycleScope.launch {
                isLoadingMore = true
                val offset = seriesList.size
                val more = seriesDao.querySeriesRaw(buildSeriesQuery(offset, PAGE_SIZE))
                seriesList = seriesList + more
                hasMoreSeries = seriesList.size < totalSeriesCount
                isLoadingMore = false
            }
        }

        // La riga "Continua a guardare" è stata RIMOSSA da questa schermata: vive solo nella
        // Home, dove ha senso. Qui occupava ~270dp permanenti sopra la griglia e riduceva lo
        // spazio dei poster. Non reintrodurla: se serve ripartire da un contenuto, c'è la Home.

        // Initial load
        LaunchedEffect(Unit) {
            val cats = seriesDao.getCategoriesWithCount()
            categories = cats

            if (initialCategory == null) {
                showingAllSeries = true
                selectedCategory = null
            } else {
                showingAllSeries = false
                selectedCategory = initialCategory
            }
            reloadSeries()
        }

        LaunchedEffect(pendingFilterReload) {
            if (pendingFilterReload > 0) {
                delay(250)
                reloadSeries()
            }
        }

        // Al ritorno dal detail view (che può aver arricchito TMDB), rilegge dal DB
        // le serie già caricate e aggiorna i badge con il voto TMDB, senza ricaricare
        // tutta la lista (mantiene scroll e ordine).
        var resumeTick by remember { mutableIntStateOf(0) }
        LifecycleResumeEffect(Unit) {
            resumeTick++
            onPauseOrDispose { }
        }
        LaunchedEffect(resumeTick) {
            if (resumeTick <= 1) return@LaunchedEffect
            val ids = seriesList.map { it.id }
            if (ids.isNotEmpty()) {
                val fresh = seriesDao.getSeriesByIds(ids).associateBy { it.id }
                seriesList = seriesList.map { s -> fresh[s.id] ?: s }
            }
        }

        SeriesScreen(
            categories = categories,
            selectedCategory = selectedCategory,
            seriesList = seriesList,
            isLoading = isLoading,
            isLoadingMore = isLoadingMore,
            hasMoreSeries = hasMoreSeries,
            showingAllSeries = showingAllSeries,
            totalSeriesCount = totalSeriesCount,
            sortFilter = sortFilter,
            availableCategories = categories.map { it.name },
            showCategoryFilter = showingAllSeries,
            onSortFilterChange = { newState ->
                if (newState != sortFilter) {
                    sortFilter = newState
                    pendingFilterReload++
                }
            },
            onCategorySelect = { cat ->
                showingAllSeries = false
                selectedCategory = cat
                sortFilter = sortFilter.copy(filter = sortFilter.filter.copy(categories = emptySet()))
                reloadSeries()
            },
            onViewAllClick = {
                showingAllSeries = true
                selectedCategory = null
                reloadSeries()
            },
            onLoadMore = { loadMoreSeries() },
            onSeriesClick = { openSeriesDetails(it) },
            onBackClick = { finish() },
            gridState = gridState
        )
    }
    
    private fun openSeriesDetails(series: Series) {
        val intent = Intent(this, DetailsActivity::class.java).apply {
            putExtra("content_id", series.id)
            putExtra("content_type", "SERIES")
            putExtra("title", series.tmdbName ?: series.name)
            putExtra("poster_url", series.posterUrl ?: series.logoUrl)
            putExtra("backdrop_url", series.backdropUrl)
        }
        it.wavestream.app.ui.theme.ActivityTransitions.start(this, intent)
    }
}

/**
 * Series Screen Composable - sidebar + grid layout
 */
@Composable
fun SeriesScreen(
    categories: List<SeriesCategoryWithCount>,
    selectedCategory: String?,
    seriesList: List<Series>,
    isLoading: Boolean,
    isLoadingMore: Boolean = false,
    hasMoreSeries: Boolean = false,
    showingAllSeries: Boolean,
    totalSeriesCount: Int,
    sortFilter: SortFilterState = SortFilterState(),
    availableCategories: List<String> = emptyList(),
    showCategoryFilter: Boolean = false,
    onSortFilterChange: (SortFilterState) -> Unit = {},
    onCategorySelect: (String) -> Unit,
    onViewAllClick: () -> Unit,
    onSeriesClick: (Series) -> Unit,
    onLoadMore: () -> Unit = {},
    onBackClick: () -> Unit,
    gridState: androidx.tv.foundation.lazy.grid.TvLazyGridState =
        androidx.tv.foundation.lazy.grid.rememberTvLazyGridState()
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Content - series grid (sidebar rimossa: le categorie si scelgono dal menu Filtri)
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
                                text = if (showingAllSeries) "Tutte le serie TV" else (selectedCategory ?: ""),
                                style = MaterialTheme.typography.headlineMedium,
                                color = WaveStreamColors.TextPrimary,
                                fontWeight = FontWeight.Bold
                            )
                            
                            Text(
                                text = "$totalSeriesCount serie",
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
                    // montata (nessuno sfarfallio/reset dello scroll) e mostriamo un overlay.
                    if (seriesList.isEmpty() && isLoading) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(color = WaveStreamColors.Accent)
                        }
                    } else if (seriesList.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Nessuna serie in questa categoria",
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    } else {
                    Box(modifier = Modifier.fillMaxSize()) {
                    // Focus iniziale sulla PRIMA card all'ingresso nella schermata: senza questo
                    // il telecomando non ha un elemento attivo. Il requester è agganciato solo
                    // alla card index == 0 e il focus è richiesto quando la griglia ha composto
                    // i suoi item (requestFocusWhenReady ritenta nei frame successivi).
                    val firstCardFocus = remember { FocusRequester() }
                    LaunchedEffect(seriesList.size) {
                        if (seriesList.isNotEmpty()) firstCardFocus.requestFocusWhenReady()
                    }
                    val cascadeSeen = remember { mutableSetOf<String>() }
                    TvLazyVerticalGrid(
                        columns = TvGridCells.Adaptive(minSize = 150.dp),
                        state = gridState,
                        contentPadding = PaddingValues(top = 8.dp, bottom = 64.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        // Series grid using TV Compose for proper D-pad navigation
                        tvGridItemsIndexed(seriesList, key = { _, it -> it.id }) { index, series ->
                            Box(modifier = Modifier.cascadeIn(cascadeSeen, "SERIES_${series.id}", index)) {
                                SeriesGridCard(
                                    series = series,
                                    onClick = { onSeriesClick(series) },
                                    focusRequester = if (index == 0) firstCardFocus else null
                                )
                            }
                        }
                        // Load more button — shown when more data is available
                        if (hasMoreSeries || isLoadingMore) {
                            item(key = "load_more_series", span = { androidx.tv.foundation.lazy.grid.TvGridItemSpan(maxLineSpan) }) {
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
                                        val remaining = totalSeriesCount - seriesList.size
                                        Text(
                                            text = "▼  Carica altre $remaining serie",
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
                    }   // chiude il Box contenitore (griglia + overlay di caricamento)
                }
            }
        }
    }
}

/**
 * Series card for grid
 */
@Composable
private fun SeriesGridCard(
    series: Series,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.08f else 1f,
        label = "seriesScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "seriesBorder"
    )
    
    Column(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .fillMaxWidth()
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
                .aspectRatio(2f / 3f)
                .clip(RoundedCornerShape(8.dp))
                .border(2.dp, borderColor, RoundedCornerShape(8.dp))
                .background(WaveStreamColors.CardBackground)
        ) {
            AsyncImage(
                model = series.posterUrl ?: series.logoUrl,
                contentDescription = series.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            
            // Rating badge — TMDB quando disponibile, altrimenti voto playlist/IMDB.
            (series.tmdbVoteAverage?.takeIf { it > 0f } ?: series.rating)?.takeIf { it > 0 }?.let { rating ->
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
            text = series.tmdbName ?: series.name,
            style = MaterialTheme.typography.bodySmall,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            lineHeight = 16.sp
        )
        
        // Year
        series.year?.let { year ->
            Text(
                text = year.toString(),
                style = MaterialTheme.typography.labelSmall,
                color = WaveStreamColors.TextTertiary
            )
        }
    }
}


