package it.wavestream.app.ui.search

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid
import androidx.tv.foundation.lazy.grid.TvGridCells
import androidx.tv.foundation.lazy.grid.items as tvGridItems
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.R
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.repository.FtsSearchRepository
import it.wavestream.app.domain.FilterBlockedContentUseCase
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.player.PlayerActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Search result item
 */
@Immutable
data class SearchResultItem(
    val id: Long,
    val title: String,
    val subtitle: String?,
    val posterUrl: String?,
    val type: ContentType,
    val streamUrl: String?,
    val isCategory: Boolean = false,  // True for category results
    val categoryType: String? = null,  // "movies", "series", or "live"
    val isFavorite: Boolean = false   // True if item is in favorites
)

/**
 * Search Activity - Voice and text search
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class SearchActivity : ComponentActivity() {
    
    @Inject lateinit var movieDao: MovieDao
    @Inject lateinit var seriesDao: SeriesDao
    @Inject lateinit var channelDao: ChannelDao
    @Inject lateinit var ftsSearchRepository: FtsSearchRepository
    @Inject lateinit var filterBlockedContent: FilterBlockedContentUseCase
    @Inject lateinit var favoriteDao: it.wavestream.app.data.database.dao.FavoriteDao
    @Inject lateinit var userPreferences: it.wavestream.app.data.preferences.UserPreferences
    
    private var searchJob: Job? = null
    
    // Cache delle categorie (refresh ogni 5 min): evita di ricaricare 3 liste
    // dal DB a ogni lettera digitata
    private var categoryCache: Triple<List<String>, List<String>, List<String>>? = null
    private var categoryCacheTime = 0L
    
    // Cronologia delle ricerche recenti (persistita, mostrata a query vuota)
    private val recentPrefs by lazy {
        getSharedPreferences("search_recent_queries", Context.MODE_PRIVATE)
    }
    
    private fun loadRecentSearches(): List<String> {
        return recentPrefs.getString("recent_queries", null)
            ?.split('\u0001')
            ?.filter { it.isNotBlank() }
            ?: emptyList()
    }
    
    private fun saveRecentSearch(query: String) {
        val q = query.trim()
        if (q.length < 2) return
        val updated = (listOf(q) + loadRecentSearches()).distinct().take(8)
        recentPrefs.edit().putString("recent_queries", updated.joinToString("\u0001")).apply()
    }
    
    private fun removeRecentSearch(query: String) {
        val updated = loadRecentSearches().filter { it != query.trim() }
        recentPrefs.edit().putString("recent_queries", updated.joinToString("\u0001")).apply()
    }
    private var voiceResultCallback: ((String) -> Unit)? = null
    private lateinit var voiceSearchLauncher: androidx.activity.result.ActivityResultLauncher<android.content.Intent>
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Launcher per la ricerca vocale (attiva il microfono del telecomando)
        voiceSearchLauncher = registerForActivityResult(
            androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK && result.data != null) {
                val spokenText = result.data
                    ?.getStringArrayListExtra(android.speech.RecognizerIntent.EXTRA_RESULTS)
                    ?.firstOrNull()
                if (!spokenText.isNullOrBlank()) {
                    voiceResultCallback?.invoke(spokenText)
                }
            }
        }
        
        // Force keyboard to show on Android TV
        window.setSoftInputMode(
            android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE or
            android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE
        )
        
        setContent {
            WaveStreamTheme {
                SearchScreenContent()
            }
        }
    }

    // Il tasto microfono del telecomando attiva la ricerca vocale
    override fun onKeyDown(keyCode: Int, event: android.view.KeyEvent?): Boolean {
        if (keyCode == android.view.KeyEvent.KEYCODE_VOICE_ASSIST ||
            keyCode == android.view.KeyEvent.KEYCODE_SEARCH) {
            startVoiceSearch()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
    
    @Composable
    private fun SearchScreenContent() {
        var query by remember { mutableStateOf("") }
        var results by remember { mutableStateOf<List<SearchResultItem>>(emptyList()) }
        var suggestions by remember { mutableStateOf<List<SearchResultItem>>(emptyList()) }
        var isLoading by remember { mutableStateOf(false) }
        val coroutineScope = rememberCoroutineScope()
        val context = LocalContext.current
        
        // Focus on search input at start and show keyboard
        val focusRequester = remember { FocusRequester() }
        val keyboardController = LocalSoftwareKeyboardController.current
        val view = androidx.compose.ui.platform.LocalView.current
        
        LaunchedEffect(Unit) {
            delay(500)
            try {
                focusRequester.requestFocus()
                keyboardController?.show()
            } catch (e: Exception) {
                // Ignore focus/keyboard errors on TV devices
            }
        }

        // Collega il risultato della ricerca vocale alla query
        DisposableEffect(Unit) {
            voiceResultCallback = { voiceText ->
                query = voiceText
            }
            onDispose { voiceResultCallback = null }
        }
        
        // Cronologia ricerche recenti (mostrata a query vuota, cliccabile)
        var recentSearches by remember { mutableStateOf(loadRecentSearches()) }
        
        // Pipeline unica di ricerca: ogni tasto cancella il lavoro precedente.
        // 1) micro-debounce per aggregare digitazioni rapide;
        // 2) suggerimenti istantanei (limitati, ~60ms);
        // 3) risultati completi dopo il debounce (~220ms totali).
        LaunchedEffect(query) {
            val trimmed = query.trim()
            if (trimmed.length < 2) {
                suggestions = emptyList()
                results = emptyList()
                isLoading = false
                return@LaunchedEffect
            }
            isLoading = true
            delay(60)
            suggestions = performSearch(trimmed, limit = 6)
            delay(160)
            results = performSearch(trimmed, limit = 60)
            isLoading = false
        }
        
        SearchScreen(
            query = query,
            onQueryChange = { query = it },
            onVoiceSearch = { startVoiceSearch() },
            results = results,
            suggestions = suggestions,
            isLoading = isLoading,
            focusRequester = focusRequester,
            onBackClick = { finish() },
            recentSearches = recentSearches,
            onRecentSearchClick = { recent ->
                query = recent
            },
            onRecentSearchRemove = { recent ->
                removeRecentSearch(recent)
                recentSearches = loadRecentSearches()
                android.widget.Toast.makeText(context, "Ricerca rimossa", android.widget.Toast.LENGTH_SHORT).show()
            },
            onItemClick = { item ->
                // Salva la query nella cronologia (se abbastanza lunga)
                if (query.trim().length >= 2) {
                    saveRecentSearch(query.trim())
                    recentSearches = loadRecentSearches()
                }
                // Channels play directly, others go to details/category
                if (item.type == ContentType.CHANNEL && !item.isCategory) {
                    playContent(item)
                } else {
                    openDetails(item)
                }
            },
            onItemLongClick = { item ->
                // Long press toggles favorite
                coroutineScope.launch {
                    toggleFavorite(item)
                    // Refresh results to update favorite status
                    if (query.trim().length >= 2) {
                        results = performSearch(query.trim(), limit = 60)
                    }
                    val message = if (!item.isFavorite) "Aggiunto ai preferiti" else "Rimosso dai preferiti"
                    android.widget.Toast.makeText(context, message, android.widget.Toast.LENGTH_SHORT).show()
                }
            }
        )
    }
    
    private fun startVoiceSearch() {
        try {
            val intent = android.content.Intent(
                android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH
            ).apply {
                putExtra(
                    android.speech.RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                    android.speech.RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
                )
                putExtra(
                    android.speech.RecognizerIntent.EXTRA_PROMPT,
                    "Parla per cercare film, serie TV e canali"
                )
            }
            // Se non è disponibile un servizio di riconoscimento, ignora silenziosamente
            if (intent.resolveActivity(packageManager) != null) {
                voiceSearchLauncher.launch(intent)
            } else {
                android.widget.Toast.makeText(
                    this,
                    "Riconoscimento vocale non disponibile",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }
        } catch (e: Exception) {
            // Ignora errori di avvio riconoscimento vocale
        }
    }

    /**
     * Cache con TTL delle categorie (film, serie, live): caricate dal DB al
     * massimo una volta ogni 5 minuti, poi filtrate in memoria.
     */
    private suspend fun getCategoriesCached(): Triple<List<String>, List<String>, List<String>> {
        val now = System.currentTimeMillis()
        categoryCache?.let { cached ->
            if (now - categoryCacheTime < 5 * 60 * 1000) return cached
        }
        return coroutineScope {
            val movies = async { movieDao.getCategoriesList() }
            val series = async { seriesDao.getCategoriesList() }
            val live = async { channelDao.getCategoriesList() }
            Triple(movies.await(), series.await(), live.await()).also {
                categoryCache = it
                categoryCacheTime = now
            }
        }
    }
    
    /**
     * Score di pertinenza: premia match esatti, prefissi e inizio di parola,
     * i preferiti e le categorie (scorciatoie di navigazione); penalizza i
     * titoli molto lunghi. I risultati sono ordinati per score decrescente.
     */
    private fun relevanceScore(item: SearchResultItem, query: String): Int {
        val title = item.title.lowercase()
        val q = query.lowercase().trim()
        val base = when {
            title == q -> 120          // match esatto
            title.startsWith(q) -> 100 // inizia con la query
            title.contains(" $q") -> 90  // inizio di una parola nel titolo
            title.contains(q) -> 70    // contiene la query
            else -> 50                 // match FTS parziale (token intermedi)
        }
        var score = base
        if (item.isFavorite) score += 15
        if (item.isCategory) score += 10
        score -= title.length / 8 // titoli più corti = più pertinenti
        return score
    }
    
    private fun dedupeKey(item: SearchResultItem): String {
        return if (item.isCategory) "cat_${item.categoryType}_${item.title}" else "${item.type}_${item.id}"
    }
    
    private suspend fun performSearch(
        query: String,
        limit: Int = 60,
        allowFallback: Boolean = true
    ): List<SearchResultItem> {
        val trimmed = query.trim()
        if (trimmed.isEmpty()) return emptyList()
        val profileId = userPreferences.getCurrentProfileId() ?: 1L
        
        // UNA sola query per tutti i preferiti del profilo: elimina l'N+1
        // di isFavorite per ogni risultato (fino a 50+ query per ricerca)
        val favoriteKeys = coroutineScope {
            async { favoriteDao.getFavoritesByProfileList(profileId) }
                .await()
                .map { "${it.contentType}_${it.contentId}" }
                .toSet()
        }
        
        // Helper delegato al domain use case
        fun isBlockedContent(name: String, category: String?) = filterBlockedContent.isBlocked(name, category)
        
        return coroutineScope {
            // Ricerca film/serie/canali IN PARALLELO invece che in serie
            val movies = async {
                (ftsSearchRepository.searchMovies(trimmed) ?: movieDao.searchMovies(trimmed))
                    .filter { !isBlockedContent(it.name, it.category) }
                    .map { m ->
                        SearchResultItem(
                            id = m.id,
                            title = m.name,
                            subtitle = m.year?.toString(),
                            posterUrl = m.posterUrl,
                            type = ContentType.MOVIE,
                            streamUrl = m.streamUrl,
                            isFavorite = "${ContentType.MOVIE}_${m.id}" in favoriteKeys
                        )
                    }
            }
            val series = async {
                (ftsSearchRepository.searchSeries(trimmed) ?: seriesDao.searchSeries(trimmed))
                    .filter { !isBlockedContent(it.name, it.category) }
                    .map { s ->
                        SearchResultItem(
                            id = s.id,
                            title = s.name,
                            subtitle = s.year?.toString(),
                            posterUrl = s.posterUrl,
                            type = ContentType.SERIES,
                            streamUrl = null,
                            isFavorite = "${ContentType.SERIES}_${s.id}" in favoriteKeys
                        )
                    }
            }
            val channels = async {
                (ftsSearchRepository.searchChannels(trimmed) ?: channelDao.searchChannels(trimmed))
                    .filter { !isBlockedContent(it.name, it.categoryName) }
                    .map { c ->
                        SearchResultItem(
                            id = c.id,
                            title = c.name,
                            subtitle = c.categoryName,
                            posterUrl = c.logoUrl,
                            type = ContentType.CHANNEL,
                            streamUrl = c.streamUrl,
                            isFavorite = "${ContentType.CHANNEL}_${c.id}" in favoriteKeys
                        )
                    }
            }
            
            var content = movies.await() + series.await() + channels.await()
            
            // Fallback progressivo: se la query multi-parola non trova nulla,
            // riprova senza l'ultima parola (es. "batman gotham" -> "batman")
            if (content.isEmpty() && allowFallback && trimmed.contains(' ')) {
                val shorter = trimmed.substringBeforeLast(' ').trim()
                if (shorter.length >= 2) {
                    content = performSearch(shorter, limit = limit, allowFallback = false)
                }
            }
            
            val contentRanked = content
                .distinctBy { dedupeKey(it) }
                .sortedByDescending { relevanceScore(it, trimmed) }
            
            // Categorie: filtrate in memoria dalla cache (nessuna query ripetuta)
            val q = trimmed.lowercase()
            val (movieCats, seriesCats, liveCats) = getCategoriesCached()
            val categoryResults = buildList {
                movieCats.filter { it.lowercase().contains(q) && !isBlockedContent(it, it) }
                    .forEach { add(SearchResultItem(0L, it, "Categoria Film", null, ContentType.MOVIE, null, isCategory = true, categoryType = "movies")) }
                seriesCats.filter { it.lowercase().contains(q) && !isBlockedContent(it, it) }
                    .forEach { add(SearchResultItem(0L, it, "Categoria Serie TV", null, ContentType.SERIES, null, isCategory = true, categoryType = "series")) }
                liveCats.filter { it.lowercase().contains(q) && !isBlockedContent(it, it) }
                    .forEach { add(SearchResultItem(0L, it, "Categoria Live", null, ContentType.CHANNEL, null, isCategory = true, categoryType = "live")) }
            }
            
            // Ranking unificato contenuti + categorie, poi dedup e limite
            (categoryResults + contentRanked)
                .distinctBy { dedupeKey(it) }
                .sortedByDescending { relevanceScore(it, trimmed) }
                .take(limit)
        }
    }
    
    private fun openDetails(item: SearchResultItem) {
        if (item.isCategory) {
            // Navigate to CategoryActivity (same as sidebar navigation)
            val contentType = when (item.categoryType) {
                "movies" -> "CATEGORY_MOVIE"
                "series" -> "CATEGORY_SERIES"
                "live" -> "CATEGORY_LIVE"
                else -> "CATEGORY_MOVIE"
            }
            val intent = Intent(this, it.wavestream.app.ui.category.CategoryActivity::class.java).apply {
                putExtra("categoryName", item.title)
                putExtra("contentType", contentType)
            }
            startActivity(intent)
        } else {
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("content_id", item.id)
                putExtra("content_type", item.type.name)
                putExtra("title", item.title)
                putExtra("poster_url", item.posterUrl)
            }
            startActivity(intent)
        }
    }
    
    private fun playContent(item: SearchResultItem) {
        val intent = Intent(this, PlayerActivity::class.java).apply {
            putExtra("content_id", item.id)
            putExtra("content_type", item.type.name)
            putExtra("stream_url", item.streamUrl)
            putExtra("title", item.title)
        }
        startActivity(intent)
    }
    
    private suspend fun toggleFavorite(item: SearchResultItem) {
        // Categories cannot be added to favorites (only individual content)
        if (item.isCategory) return
        
        val profileId = userPreferences.getCurrentProfileId() ?: 1L
        val favorite = it.wavestream.app.data.database.entity.Favorite(
            profileId = profileId,
            contentType = item.type,
            contentId = item.id,
            title = item.title,
            posterUrl = item.posterUrl,
            addedAt = System.currentTimeMillis()
        )
        favoriteDao.toggleFavorite(favorite)
    }
}

/**
 * Blinking white text cursor shown in the search bar,
 * indicates where the next letter will be typed.
 */
@Composable
private fun BlinkingCursor(modifier: Modifier = Modifier) {
    val infiniteTransition = rememberInfiniteTransition(label = "cursor")
    val alpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(500),
            repeatMode = RepeatMode.Reverse
        ),
        label = "cursorAlpha"
    )
    Box(
        modifier = modifier
            .width(3.dp)
            .height(24.dp)
            .alpha(alpha)
            .background(Color.White, RoundedCornerShape(2.dp))
    )
}

/**
 * Search Screen Composable
 */
@Composable
fun SearchScreen(
    query: String,
    onQueryChange: (String) -> Unit,
    onVoiceSearch: () -> Unit,
    results: List<SearchResultItem>,
    suggestions: List<SearchResultItem>,
    isLoading: Boolean,
    focusRequester: FocusRequester,
    onBackClick: () -> Unit,
    onItemClick: (SearchResultItem) -> Unit,
    onItemLongClick: (SearchResultItem) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Top spacing
        Spacer(modifier = Modifier.height(24.dp))

        // Search header: real-time search bar (query shown as you type)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 48.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(52.dp)
                    .clip(RoundedCornerShape(26.dp))
                    .background(WaveStreamColors.BackgroundSecondary)
                    .border(2.dp, WaveStreamColors.Accent, RoundedCornerShape(26.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = WaveStreamColors.TextTertiary,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    // Cursore bianco lampeggiante: quando la query è vuota resta in
                    // overlay all'inizio del placeholder; con del testo si posiziona
                    // dinamicamente subito dopo l'ultima lettera digitata
                    if (query.isEmpty()) {
                        Box {
                            Text(
                                text = "Cerca film, serie TV e canali",
                                color = WaveStreamColors.TextTertiary,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                maxLines = 1
                            )
                            BlinkingCursor(
                                modifier = Modifier.align(Alignment.CenterStart)
                            )
                        }
                    } else {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = query,
                                color = WaveStreamColors.TextPrimary,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                maxLines = 1
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            BlinkingCursor()
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Voice search button (activates TV remote microphone)
            val micInteractionSource = remember { MutableInteractionSource() }
            val micIsFocused by micInteractionSource.collectIsFocusedAsState()
            Box(
                modifier = Modifier
                    .size(52.dp)
                    .clip(RoundedCornerShape(26.dp))
                    .background(
                        if (micIsFocused) WaveStreamColors.Accent
                        else WaveStreamColors.BackgroundSecondary
                    )
                    .border(
                        2.dp,
                        if (micIsFocused) WaveStreamColors.AccentLight else WaveStreamColors.Accent,
                        RoundedCornerShape(26.dp)
                    )
                    .focusable(interactionSource = micInteractionSource)
                    .clickable(onClick = onVoiceSearch),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Mic,
                    contentDescription = "Ricerca vocale",
                    tint = if (micIsFocused) Color.White else WaveStreamColors.TextPrimary,
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Content: keyboard on left, results grid on right
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 48.dp)
        ) {
            // Left column: keyboard + instant suggestions below it
            Column(
                modifier = Modifier
                    .width(320.dp)
                    .padding(top = 8.dp)
            ) {
                // On-screen keyboard (compact Netflix style)
                OnScreenKeyboard(
                    query = query,
                    onQueryChange = onQueryChange,
                    modifier = Modifier.fillMaxWidth()
                )

                // Suggerimenti istantanei sotto la tastiera (lato sinistro):
                // così non vengono coperti dalla griglia dei risultati a destra
                if (suggestions.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(16.dp))
                    SuggestionPills(
                        suggestions = suggestions,
                        onItemClick = onItemClick,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )
                }
            }

            Spacer(modifier = Modifier.width(28.dp))

            // Results grid (right)
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(end = 48.dp)
            ) {
                when {
                    isLoading -> {
                        CircularProgressIndicator(
                            modifier = Modifier.align(Alignment.Center),
                            color = WaveStreamColors.Accent
                        )
                    }
                    query.length >= 2 && results.isEmpty() -> {
                        Text(
                            text = "Nessun risultato per \"$query\"",
                            style = MaterialTheme.typography.bodyLarge,
                            color = WaveStreamColors.TextSecondary,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                    results.isNotEmpty() -> {
                        TvLazyVerticalGrid(
                            columns = TvGridCells.Adaptive(minSize = 140.dp),
                            horizontalArrangement = Arrangement.spacedBy(16.dp),
                            verticalArrangement = Arrangement.spacedBy(24.dp),
                            contentPadding = PaddingValues(top = 8.dp, bottom = 24.dp),
                            modifier = Modifier.fillMaxSize()
                        ) {
                            tvGridItems(results, key = { item ->
                                if (item.isCategory) "cat_${item.categoryType}_${item.title}"
                                else "${item.type}_${item.id}"
                            }) { item ->
                                SearchResultCard(
                                    item = item,
                                    onClick = { onItemClick(item) },
                                    onLongClick = { onItemLongClick(item) }
                                )
                            }
                        }
                    }
                    else -> {
                        Column(
                            modifier = Modifier.align(Alignment.Center),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = null,
                                tint = WaveStreamColors.TextTertiary,
                                modifier = Modifier.size(64.dp)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Cerca film, serie TV e canali",
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * Suggerimenti istantanei stile YouTube: pill a forma di ovale disposte in
 * colonna sotto la tastiera, una parola (opzione) per pill, senza icone.
 * Al focus la pill si riempie di accent (senza ingrandimento).
 */
@Composable
private fun SuggestionPills(
    suggestions: List<SearchResultItem>,
    onItemClick: (SearchResultItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        suggestions.forEach { item ->
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused by interactionSource.collectIsFocusedAsState()
            Text(
                text = item.title,
                color = if (isFocused) Color.White else WaveStreamColors.TextPrimary,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(
                        if (isFocused) WaveStreamColors.Accent
                        else WaveStreamColors.BackgroundSecondary
                    )
                    .border(
                        width = 1.dp,
                        color = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.25f),
                        shape = RoundedCornerShape(50)
                    )
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null
                    ) { onItemClick(item) }
                    .padding(horizontal = 18.dp, vertical = 9.dp)
            )
        }
    }
}

/**
 * Search input field
 */
@Composable
private fun SearchInput(
    query: String,
    onQueryChange: (String) -> Unit,
    focusRequester: FocusRequester,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.BackgroundTertiary,
        label = "searchBorder"
    )
    
    Box(
        modifier = modifier
            .height(56.dp)
            .clip(RoundedCornerShape(28.dp))
            .border(2.dp, borderColor, RoundedCornerShape(28.dp))
            .background(WaveStreamColors.BackgroundSecondary)
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = WaveStreamColors.TextTertiary,
                modifier = Modifier.size(24.dp)
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            BasicTextField(
                value = query,
                onValueChange = onQueryChange,
                modifier = Modifier
                    .weight(1f)
                    .focusRequester(focusRequester),
                textStyle = TextStyle(
                    color = WaveStreamColors.TextPrimary,
                    fontSize = 18.sp
                ),
                cursorBrush = SolidColor(WaveStreamColors.Accent),
                singleLine = true,
                decorationBox = { innerTextField ->
                    if (query.isEmpty()) {
                        Text(
                            text = "Cerca...",
                            style = TextStyle(
                                color = WaveStreamColors.TextTertiary,
                                fontSize = 18.sp
                            )
                        )
                    }
                    innerTextField()
                }
            )
            
            // Clear button
            if (query.isNotEmpty()) {
                IconButton(
                    onClick = { onQueryChange("") },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Clear",
                        tint = WaveStreamColors.TextSecondary,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

/**
 * Search result card
 */
@OptIn(androidx.compose.ui.ExperimentalComposeUiApi::class)
@Composable
private fun SearchResultCard(
    item: SearchResultItem,
    onClick: () -> Unit,
    onLongClick: () -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Long press detection
    var pressStartTime by remember { mutableStateOf(0L) }
    val longPressThreshold = 500L // 500ms for long press
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.08f else 1f,
        label = "resultScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "resultBorder"
    )
    
    Column(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(140.dp)
            .focusable(interactionSource = interactionSource)
            .onPreviewKeyEvent { keyEvent ->
                when {
                    keyEvent.key == Key.DirectionCenter ||
                    keyEvent.key == Key.Enter -> {
                        if (keyEvent.type == KeyEventType.KeyDown) {
                            if (pressStartTime == 0L) {
                                pressStartTime = System.currentTimeMillis()
                            }
                            true // Consume to prevent default click behavior
                        } else if (keyEvent.type == KeyEventType.KeyUp) {
                            val pressDuration = System.currentTimeMillis() - pressStartTime
                            pressStartTime = 0L
                            if (pressDuration >= longPressThreshold) {
                                // Long press detected - toggle favorite
                                onLongClick()
                            } else {
                                // Short press - normal click
                                onClick()
                            }
                            true // Always consume KeyUp
                        } else false
                    }
                    else -> false
                }
            }
    ) {
        // Poster
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(210.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(2.dp, borderColor, RoundedCornerShape(8.dp))
                .background(WaveStreamColors.CardBackground),
            contentAlignment = Alignment.Center
        ) {
            if (item.isCategory) {
                // Category folder icon with gradient background
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            androidx.compose.ui.graphics.Brush.verticalGradient(
                                colors = listOf(
                                    WaveStreamColors.Accent.copy(alpha = 0.3f),
                                    WaveStreamColors.Accent.copy(alpha = 0.1f)
                                )
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Folder,
                        contentDescription = null,
                        tint = WaveStreamColors.Accent,
                        modifier = Modifier.size(64.dp)
                    )
                }
            } else {
                AsyncImage(
                    model = item.posterUrl,
                    contentDescription = item.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            
            // Type badge (top left)
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(
                        when {
                            // Aurora: tinte pastello coerenti con CategoryCard
                            item.isCategory -> Color(0xFFB48CFA) // Soft Violet
                            item.type == ContentType.MOVIE -> WaveStreamColors.Accent
                            item.type == ContentType.SERIES -> Color(0xFF86E0A4) // Soft Green
                            item.type == ContentType.CHANNEL -> Color.Red
                            else -> WaveStreamColors.BackgroundSecondary
                        }
                    )
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            ) {
                Text(
                    text = when {
                        item.isCategory -> "Categoria"
                        item.type == ContentType.MOVIE -> "Film"
                        item.type == ContentType.SERIES -> "Serie"
                        item.type == ContentType.CHANNEL -> "Live"
                        else -> ""
                    },
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            
            // Favorite heart icon (top right) - only for non-category items
            if (item.isFavorite && !item.isCategory) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .size(24.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.Black.copy(alpha = 0.6f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Preferito",
                        tint = Color(0xFFE91E63), // Red/Pink
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // Title with heart if favorite
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.bodySmall,
                color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 16.sp,
                modifier = Modifier.weight(1f, fill = false)
            )
        }
        
        // Subtitle
        item.subtitle?.let { subtitle ->
            Text(
                text = subtitle,
                style = MaterialTheme.typography.labelSmall,
                color = WaveStreamColors.TextTertiary,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


