package it.wavestream.app.ui.live

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.tv.foundation.lazy.list.itemsIndexed
import androidx.tv.foundation.lazy.grid.items as tvGridItems
import androidx.tv.foundation.lazy.list.items as tvListItems
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.input.key.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.CategoryWithCount
import it.wavestream.app.data.database.dao.PlaylistDao
import it.wavestream.app.data.database.dao.RecentlyWatchedDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.RecentlyWatchedChannel
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.data.repository.EpgRepository
import it.wavestream.app.ui.epg.EpgProgram
import it.wavestream.app.ui.multiscreen.MultiscreenActivity
import it.wavestream.app.ui.player.PlayerActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import it.wavestream.app.data.database.entity.FavoriteCategory
import it.wavestream.app.data.database.dao.FavoriteCategoryDao
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kotlinx.coroutines.withContext
import java.util.concurrent.ConcurrentHashMap
import androidx.lifecycle.lifecycleScope
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

/**
 * Live TV Activity with Jetpack Compose
 * Converted from original XML-based LiveActivity
 * Features:
 * - Grid mode: channel cards
 * - Timeline mode: EPG with horizontal program blocks and current time line (red)
 * - EPG parsing from Xtream or URL
 */
@AndroidEntryPoint
class LiveActivity : ComponentActivity() {
    
    companion object {
        private const val RECENT_CATEGORY = "Visti di recente"
        private const val RECENT_WINDOW_MS = 24 * 60 * 60 * 1000L // 24 hours
    }
    
    @Inject lateinit var channelDao: ChannelDao
    @Inject lateinit var playlistDao: PlaylistDao
    @Inject lateinit var epgRepository: EpgRepository
    @Inject lateinit var userPreferences: UserPreferences
    @Inject lateinit var recentlyWatchedDao: RecentlyWatchedDao
    @Inject lateinit var favoriteCategoryDao: FavoriteCategoryDao
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            WaveStreamTheme {
                LiveScreenContent()
            }
        }
    }
    
    @Composable
    private fun LiveScreenContent() {
        var categories by remember { mutableStateOf<List<String>>(emptyList()) }
        var selectedCategory by remember { mutableStateOf<String?>(null) }
        var lastSelectedCategory by remember { mutableStateOf<String?>(null) }
        var channels by remember { mutableStateOf<List<Channel>>(emptyList()) }
        var channelPrograms by remember { mutableStateOf<Map<Long, List<EpgProgram>>>(emptyMap()) }
        var isGridMode by remember { mutableStateOf(true) }
        var isLoading by remember { mutableStateOf(true) }
        var isEpgLoading by remember { mutableStateOf(false) }
        var currentTime by remember { mutableStateOf(System.currentTimeMillis()) }
        var favoriteCategories by remember { mutableStateOf<Set<String>>(emptySet()) }
        var channelCounts by remember { mutableStateOf<Map<String, Int>>(emptyMap()) }
        var searchQuery by remember { mutableStateOf("") }
        var isSearchActive by remember { mutableStateOf(false) }
        
        // D-pad/system back: go back to the category grid first, then exit.
        // Also releases the heavy per-category data (channels + EPG map) so the
        // grid renders without memory pressure / GC pauses.
        val backToGrid = {
            channels = emptyList()
            channelPrograms = emptyMap()
            selectedCategory = null
            searchQuery = ""
            isSearchActive = false
        }
        BackHandler(enabled = selectedCategory != null) { backToGrid() }
        
        // Load favorites
        LaunchedEffect(Unit) {
            withContext(Dispatchers.IO) {
                val profileId = userPreferences.getCurrentProfileId() ?: 1L
                val favs = favoriteCategoryDao.getFavoriteCategoriesByType(profileId, "channels")
                favoriteCategories = favs.map { it.categoryName }.toSet()
            }
        }
        
        val onToggleFavorite: (String) -> Unit = { category ->
            lifecycleScope.launch(Dispatchers.IO) {
                val profileId = userPreferences.getCurrentProfileId() ?: 1L
                val item = FavoriteCategory(profileId = profileId, categoryType = "channels", categoryName = category)
                favoriteCategoryDao.toggleFavoriteCategory(item)
                val favs = favoriteCategoryDao.getFavoriteCategoriesByType(profileId, "channels")
                favoriteCategories = favs.map { it.categoryName }.toSet()
            }
        }
        
        // Load categories and preferences
        LaunchedEffect(Unit) {
            // Load preference for layout mode
            val mode = userPreferences.getLiveLayoutMode()
            isGridMode = (mode == "grid")
            
            // Cleanup old entries
            val cutoff = System.currentTimeMillis() - RECENT_WINDOW_MS
            recentlyWatchedDao.cleanupOlderThan(cutoff)
            
            // Get categories and prepend "Visti di recente" (always shown)
            val cats = channelDao.getCategoriesList().toMutableList()
            cats.add(0, RECENT_CATEGORY)  // Always show, even if empty
            categories = cats
            
            // Load channel counts per category for the grid cards (single query)
            val countsMap = mutableMapOf<String, Int>()
            val countsResult = channelDao.getCategoriesWithCount()
            for (item in countsResult) {
                countsMap[item.name] = item.count
            }
            // "Visti di recente" count
            countsMap[RECENT_CATEGORY] = recentlyWatchedDao.getRecentChannelIds(cutoff).size
            channelCounts = countsMap
            
            isLoading = false
            // Don't auto-select — start with category grid view
        }
        
        // Load EPG data if needed (respecting cache)
        // EPG is already being loaded in background by LoadingActivity
        // This LaunchedEffect only handles edge cases where LoadingActivity didn't load it
        LaunchedEffect(Unit) {
            // Check if we already have valid data in RAM
            if (epgRepository.isCacheValid()) {
                 isEpgLoading = false
                 return@LaunchedEffect
            }
            
            try {
                isEpgLoading = true
                val playlists = playlistDao.getAllPlaylists().first()
                
                for (playlist in playlists) {
                    if (playlist.type == "xtream" &&
                        !playlist.username.isNullOrEmpty() &&
                        !playlist.password.isNullOrEmpty()) {
                        
                        withContext(Dispatchers.IO) {
                            epgRepository.loadEpgFromXtream(
                                baseUrl = playlist.url,
                                username = playlist.username,
                                password = playlist.password
                            )
                        }
                    } else if (!playlist.epgUrl.isNullOrEmpty()) {
                        withContext(Dispatchers.IO) {
                            epgRepository.loadEpgFromUrl(playlist.epgUrl)
                        }
                    }
                }
                isEpgLoading = false
            } catch (e: Exception) {
                isEpgLoading = false
            }
        }
        
        // Load channels and EPG when category changes
        LaunchedEffect(selectedCategory, isEpgLoading) {
            if (isEpgLoading) return@LaunchedEffect
            
            selectedCategory?.let { cat ->
                isLoading = true
                
                // Load channels based on category type (single fast query)
                val loadedChannels = if (cat == RECENT_CATEGORY) {
                    val cutoff = System.currentTimeMillis() - RECENT_WINDOW_MS
                    val recentIds = recentlyWatchedDao.getRecentChannelIds(cutoff)
                    channelDao.getChannelsByIds(recentIds)
                } else {
                    channelDao.getChannelsByCategoryList(cat)
                }
                
                channels = loadedChannels
                channelPrograms = emptyMap()
                // Show the grid/timeline immediately — EPG fills in progressively below
                isLoading = false
                
                // Load EPG with bounded concurrency (8 at a time) and batched state updates,
                // instead of one coroutine per channel + awaitAll(): avoids a lag spike when
                // entering categories with hundreds/thousands of channels.
                if (loadedChannels.isNotEmpty()) {
                    val semaphore = Semaphore(8)
                    val results = ConcurrentHashMap<Long, List<EpgProgram>>(loadedChannels.size)
                    
                    loadedChannels.map { channel ->
                        async(Dispatchers.Default) {
                            semaphore.withPermit {
                                val channelIds = listOfNotNull(
                                    channel.xtreamEpgChannelId,
                                    channel.name,
                                    channel.xtreamStreamId?.toString()
                                )
                                try {
                                    results[channel.id] = epgRepository.getProgramsForChannelWithFallback(channelIds)
                                } catch (e: Exception) {
                                    results[channel.id] = emptyList()
                                }
                            }
                        }
                    }
                    
                    // Flush completed results into state every 250ms (and once at the end)
                    while (results.size < loadedChannels.size) {
                        if (results.isNotEmpty()) channelPrograms = results.toMap()
                        delay(250)
                    }
                    if (results.isNotEmpty()) channelPrograms = results.toMap()
                }
            }
        }
        
        // Update current time every minute (for red line position)
        LaunchedEffect(Unit) {
            while (true) {
                delay(60_000)
                currentTime = System.currentTimeMillis()
            }
        }
        
        // Derived state: compute current programs only when they actually change
        // This avoids recomposing all channel cards every 60s when the program is still the same
        val currentPrograms: Map<Long, EpgProgram?> = deriveCurrentPrograms(channels, channelPrograms, currentTime)
        
        LiveScreen(
            categories = categories,
            selectedCategory = selectedCategory,
            restoreCategory = lastSelectedCategory,
            channels = channels,
            channelPrograms = channelPrograms,
            currentPrograms = currentPrograms,
            isGridMode = isGridMode,
            isLoading = isLoading,
            isEpgLoading = isEpgLoading,
            currentTime = currentTime,
            onCategorySelect = {
                selectedCategory = it
                lastSelectedCategory = it
                searchQuery = ""
                isSearchActive = false
            },
            onChannelClick = { playChannel(it) },
            onToggleMode = { isGridMode = !isGridMode },
            onSearchClick = {
                isSearchActive = !isSearchActive
                if (!isSearchActive) searchQuery = ""
            },
            searchQuery = searchQuery,
            isSearchActive = isSearchActive,
            onSearchQueryChange = { searchQuery = it },
            onSearchClose = {
                isSearchActive = false
                searchQuery = ""
            },
            onBackClick = {
                if (selectedCategory != null) {
                    backToGrid()  // Go back to category grid (releases per-category data)
                } else {
                    finish()
                }
            },
            onMultiscreenClick = {
                startActivity(Intent(this@LiveActivity, MultiscreenActivity::class.java))
            },
            favoriteCategories = favoriteCategories,
            onToggleFavorite = onToggleFavorite,
            channelCounts = channelCounts
        )
    }
    
    private fun playChannel(channel: Channel) {
        // Track recently watched
        lifecycleScope.launch {
            recentlyWatchedDao.insertOrUpdate(
                RecentlyWatchedChannel(channel.id, System.currentTimeMillis())
            )
        }
        
        val intent = Intent(this, PlayerActivity::class.java).apply {
            putExtra("content_id", channel.id)
            putExtra("content_type", "CHANNEL")
            putExtra("stream_url", channel.streamUrl)
            putExtra("title", channel.name)
        }
        startActivity(intent)
    }
}

// ========== Constants ==========
private const val PIXELS_PER_MINUTE = 2
private const val TIMELINE_HOURS = 6

/**
 * Requests focus on the given FocusRequester, retrying while the target node is not yet
 * attached to composition (e.g. lazy items that still have to be composed after a scroll).
 */
private suspend fun requestFocusWithRetry(
    focusRequester: FocusRequester,
    attempts: Int = 6,
    retryDelayMs: Long = 100
) {
    repeat(attempts) {
        try {
            focusRequester.requestFocus()
            return
        } catch (e: IllegalStateException) {
            delay(retryDelayMs)
        }
    }
}

/**
 * Derived state helper: computes current programs only when they actually change.
 * This prevents unnecessary recompositions when currentTime ticks but the current program is still the same.
 */
@Composable
private fun deriveCurrentPrograms(
    channels: List<Channel>,
    channelPrograms: Map<Long, List<EpgProgram>>,
    currentTime: Long
): Map<Long, EpgProgram?> {
    return remember(channels, channelPrograms, currentTime) {
        channels.associate { channel ->
            val programs = channelPrograms[channel.id] ?: emptyList()
            val currentProgram = programs.find { it.start <= currentTime && it.end > currentTime }
            channel.id to currentProgram
        }
    }
}

/**
 * Live Screen Composable
 */
@Composable
fun LiveScreen(
    categories: List<String>,
    selectedCategory: String?,
    restoreCategory: String? = null,
    channels: List<Channel>,
    channelPrograms: Map<Long, List<EpgProgram>>,
    currentPrograms: Map<Long, EpgProgram?>,
    isGridMode: Boolean,
    isLoading: Boolean,
    isEpgLoading: Boolean,
    currentTime: Long,
    onCategorySelect: (String) -> Unit,
    onChannelClick: (Channel) -> Unit,
    onToggleMode: () -> Unit,
    onSearchClick: () -> Unit,
    searchQuery: String = "",
    isSearchActive: Boolean = false,
    onSearchQueryChange: (String) -> Unit = {},
    onSearchClose: () -> Unit = {},
    onBackClick: () -> Unit,
    onMultiscreenClick: () -> Unit = {},
    favoriteCategories: Set<String> = emptySet(),
    onToggleFavorite: (String) -> Unit = {},
    channelCounts: Map<String, Int> = emptyMap()
) {
    val timeFormat = remember { SimpleDateFormat("HH:mm", Locale.getDefault()) }
    
    // In-category search filter: searches only within the currently selected
    // category's channels, without touching the global SearchActivity.
    val filteredChannels = remember(channels, searchQuery) {
        if (searchQuery.isBlank()) channels
        else channels.filter { it.name.contains(searchQuery.trim(), ignoreCase = true) }
    }
    
    // Hoisted category-grid state: LiveCategoryGrid leaves composition while a
    // category is open, so without hoisting it would be recreated from scratch on
    // every back navigation (scroll reset + double composition + delayed focus
    // jump). LiveScreen itself never leaves composition, so this survives.
    val categoryGridState = androidx.tv.foundation.lazy.grid.rememberTvLazyGridState()
    val categoryFocusRequester = remember { FocusRequester() }
    
    // FocusRequesters for header buttons - allow navigation from content back to header
    val searchButtonFocusRequester = remember { FocusRequester() }
    val toggleButtonFocusRequester = remember { FocusRequester() }
    
    // Dedicated requester for the in-category search field
    val searchFieldFocusRequester = remember { FocusRequester() }
    // Auto-focus the search field when it opens (so the TV IME appears)
    LaunchedEffect(isSearchActive) {
        if (isSearchActive) {
            delay(100)
            try { searchFieldFocusRequester.requestFocus() } catch (e: Exception) { /* ignore */ }
        }
    }
    
    // Request focus on the first channel (top-left) when a category is opened
    val firstChannelFocusRequester = remember { FocusRequester() }
    LaunchedEffect(selectedCategory, isLoading, filteredChannels) {
        if (!isLoading && filteredChannels.isNotEmpty()) {
            delay(150)
            requestFocusWithRetry(firstChannelFocusRequester)
        }
    }
    
    // When no category is selected, show full-screen grid of category cards
    if (selectedCategory == null) {
        LiveCategoryGrid(
            categories = categories,
            favoriteCategories = favoriteCategories,
            channelCounts = channelCounts,
            restoreCategory = restoreCategory,
            gridState = categoryGridState,
            categoryFocusRequester = categoryFocusRequester,
            onCategorySelect = onCategorySelect,
            onBackClick = onBackClick,
            onMultiscreenClick = onMultiscreenClick
        )
        return
    }

    // Category selected — show channels directly (no sidebar)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Header with back button, category name, search, toggle
        LiveHeader(
            selectedCategory = selectedCategory,
            channelCount = filteredChannels.size,
            isGridMode = isGridMode,
            onToggleMode = onToggleMode,
            onSearchClick = onSearchClick,
            onBackClick = onBackClick,
            searchButtonFocusRequester = searchButtonFocusRequester,
            toggleButtonFocusRequester = toggleButtonFocusRequester
        )
        
        // In-category search bar (shown only while the search is active)
        if (isSearchActive) {
            LiveSearchBar(
                searchQuery = searchQuery,
                onSearchQueryChange = onSearchQueryChange,
                onClose = onSearchClose,
                focusRequester = searchFieldFocusRequester
            )
        }
        
        // Content
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            when {
                isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center),
                        color = WaveStreamColors.Accent
                    )
                }
                filteredChannels.isEmpty() -> {
                    Text(
                        text = if (searchQuery.isNotBlank())
                            "Nessun canale trovato per \"$searchQuery\""
                        else
                            "Nessun canale in questa categoria",
                        style = MaterialTheme.typography.bodyLarge,
                        color = WaveStreamColors.TextSecondary,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                isGridMode -> {
                    // Grid mode - channel cards using TvLazyVerticalGrid for proper D-pad navigation
                    androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid(
                        columns = androidx.tv.foundation.lazy.grid.TvGridCells.Adaptive(minSize = 160.dp),
                        contentPadding = PaddingValues(top = 16.dp, bottom = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 24.dp)
                            .focusProperties {
                                // Allow navigating up to header buttons
                                up = toggleButtonFocusRequester
                            }
                    ) {
                        tvGridItems(filteredChannels, key = { it.id }) { channel ->
                            LiveChannelCard(
                                channel = channel,
                                currentProgram = currentPrograms[channel.id],
                                currentTime = currentTime,
                                onClick = { onChannelClick(channel) },
                                modifier = if (filteredChannels.isNotEmpty() && channel.id == filteredChannels.first().id) {
                                    Modifier.focusRequester(firstChannelFocusRequester)
                                } else {
                                    Modifier
                                }
                            )
                        }
                    }
                }
                else -> {
                    // EPG Timeline mode with time header and red current time line
                    Column(modifier = Modifier.fillMaxSize()) {
                        // Time header
                        EpgTimeHeader(
                            currentTime = currentTime,
                            timeFormat = timeFormat
                        )
                        
                        // Channel rows with programs using TvLazyColumn for proper D-pad navigation
                        Box(modifier = Modifier.weight(1f)) {
                            androidx.tv.foundation.lazy.list.TvLazyColumn(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .focusProperties {
                                        // Allow navigating up to header buttons
                                        up = toggleButtonFocusRequester
                                    },
                                verticalArrangement = Arrangement.spacedBy(2.dp)
                            ) {
                                tvListItems(filteredChannels, key = { it.id }) { channel ->
                                    EpgChannelRow(
                                        channel = channel,
                                        programs = channelPrograms[channel.id] ?: emptyList(),
                                        currentTime = currentTime,
                                        timeFormat = timeFormat,
                                        onClick = { onChannelClick(channel) },
                                        modifier = if (filteredChannels.isNotEmpty() && channel.id == filteredChannels.first().id) {
                                            Modifier.focusRequester(firstChannelFocusRequester)
                                        } else {
                                            Modifier
                                        }
                                    )
                                }
                            }
                            
                            // Current time line (RED)
                            CurrentTimeLine(currentTime = currentTime)
                            
                            // Loading overlay for EPG
                            if (isEpgLoading) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(Color.Black.copy(alpha = 0.5f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        CircularProgressIndicator(color = WaveStreamColors.Accent)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "Caricamento EPG...",
                                            color = WaveStreamColors.TextPrimary
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
 * EPG Time Header - shows hours (e.g., 18:00, 19:00, 20:00...)
 */
@Composable
private fun EpgTimeHeader(
    currentTime: Long,
    timeFormat: SimpleDateFormat
) {
    val calendar = remember(currentTime) {
        Calendar.getInstance().apply {
            timeInMillis = currentTime
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }
    }
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(WaveStreamColors.BackgroundSecondary)
            .padding(start = 180.dp) // Offset for channel column
            .horizontalScroll(rememberScrollState())
    ) {
        for (i in 0 until TIMELINE_HOURS) {
            val slotCalendar = calendar.clone() as Calendar
            slotCalendar.add(Calendar.HOUR_OF_DAY, i)
            
            Box(
                modifier = Modifier
                    .width((PIXELS_PER_MINUTE * 60).dp)
                    .fillMaxHeight()
                    .background(
                        if (i == 0) WaveStreamColors.Accent.copy(alpha = 0.2f) 
                        else Color.Transparent
                    )
                    .border(
                        width = 1.dp,
                        color = WaveStreamColors.BackgroundTertiary
                    ),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = timeFormat.format(slotCalendar.time),
                    color = WaveStreamColors.TextPrimary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

/**
 * Current time line (RED vertical line)
 */
@Composable
private fun CurrentTimeLine(currentTime: Long) {
    val calendar = remember(currentTime) { Calendar.getInstance() }
    val currentMinute = calendar.get(Calendar.MINUTE)
    
    // Calculate offset: channel column (180dp) + minutes into current hour
    val channelColumnWidth = 180
    val minuteOffset = currentMinute * PIXELS_PER_MINUTE
    val totalOffset = channelColumnWidth + minuteOffset
    
    Box(
        modifier = Modifier
            .offset(x = totalOffset.dp)
            .width(2.dp)
            .fillMaxHeight()
            .background(Color.Red)
    )
}

/**
 * EPG Channel Row - channel info + horizontal program blocks
 */
@Composable
private fun EpgChannelRow(
    channel: Channel,
    programs: List<EpgProgram>,
    currentTime: Long,
    timeFormat: SimpleDateFormat,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else WaveStreamColors.BackgroundSecondary,
        label = "rowBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "rowBorder"
    )
    
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(72.dp)
            .padding(horizontal = 4.dp, vertical = 2.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Channel info column (fixed 180dp)
        Row(
            modifier = Modifier
                .width(180.dp)
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(WaveStreamColors.CardBackground),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = channel.logoUrl,
                    contentDescription = channel.name,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(4.dp)
                )
            }
            
            Text(
                text = channel.name,
                style = MaterialTheme.typography.bodySmall,
                color = WaveStreamColors.TextPrimary,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Medium
            )
        }
        
        // Programs timeline (scrollable row — same proven approach as EPGActivity,
        // avoids nested lazy lists which can crash the TV timeline)
        Row(
            modifier = Modifier
                .weight(1f)
                .horizontalScroll(rememberScrollState())
                .padding(end = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            if (programs.isEmpty()) {
                EpgProgramBlock(
                    title = "Nessun programma disponibile",
                    timeRange = "",
                    durationMinutes = TIMELINE_HOURS * 60,
                    isCurrent = false,
                    isEmpty = true
                )
            } else {
                programs.forEach { program ->
                    val isCurrent = program.start <= currentTime && program.end > currentTime
                    val durationMinutes = ((program.end - program.start) / 60_000).toInt()
                    EpgProgramBlock(
                        title = program.title,
                        timeRange = "${timeFormat.format(Date(program.start))} - ${timeFormat.format(Date(program.end))}",
                        durationMinutes = durationMinutes,
                        isCurrent = isCurrent,
                        isEmpty = false
                    )
                }
            }
        }
    }
}

/**
 * EPG Program Block - width based on duration
 */
@Composable
private fun EpgProgramBlock(
    title: String,
    timeRange: String,
    durationMinutes: Int,
    isCurrent: Boolean,
    isEmpty: Boolean
) {
    val widthDp = (durationMinutes * PIXELS_PER_MINUTE).coerceIn(60, 400)
    
    val backgroundColor = when {
        isCurrent -> WaveStreamColors.Accent.copy(alpha = 0.4f)
        isEmpty -> WaveStreamColors.BackgroundTertiary.copy(alpha = 0.5f)
        else -> WaveStreamColors.CardBackground
    }
    
    val borderColor = if (isCurrent) WaveStreamColors.Accent else Color.Transparent
    
    Box(
        modifier = Modifier
            .width(widthDp.dp)
            .fillMaxHeight()
            .padding(vertical = 4.dp)
            .clip(RoundedCornerShape(4.dp))
            .border(2.dp, borderColor, RoundedCornerShape(4.dp))
            .background(backgroundColor)
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall,
                color = if (isCurrent) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Normal
            )
            if (timeRange.isNotEmpty()) {
                Text(
                    text = timeRange,
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                    color = WaveStreamColors.TextTertiary,
                    maxLines = 1
                )
            }
        }
    }
}

/**
 * Live header with category info and mode toggle
 */
@Composable
private fun LiveHeader(
    selectedCategory: String?,
    channelCount: Int,
    isGridMode: Boolean,
    onToggleMode: () -> Unit,
    onSearchClick: () -> Unit,
    onBackClick: () -> Unit,
    searchButtonFocusRequester: FocusRequester,
    toggleButtonFocusRequester: FocusRequester
) {
    val searchInteractionSource = remember { MutableInteractionSource() }
    val toggleInteractionSource = remember { MutableInteractionSource() }
    val backInteractionSource = remember { MutableInteractionSource() }
    val isSearchFocused by searchInteractionSource.collectIsFocusedAsState()
    val isToggleFocused by toggleInteractionSource.collectIsFocusedAsState()
    val isBackFocused by backInteractionSource.collectIsFocusedAsState()
    
    val searchBorderColor by animateColorAsState(
        targetValue = if (isSearchFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "searchBorder"
    )
    val toggleBorderColor by animateColorAsState(
        targetValue = if (isToggleFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "toggleBorder"
    )
    val backBorderColor by animateColorAsState(
        targetValue = if (isBackFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "backBorder"
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Back button
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .border(2.dp, backBorderColor, CircleShape)
                .background(WaveStreamColors.BackgroundSecondary.copy(alpha = 0.5f))
                .focusable(interactionSource = backInteractionSource)
                .clickable(
                    interactionSource = backInteractionSource,
                    indication = null,
                    onClick = onBackClick
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Indietro",
                tint = if (isBackFocused) WaveStreamColors.Accent else WaveStreamColors.TextPrimary
            )
        }
        
        // Category info
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = selectedCategory ?: "Live TV",
                style = MaterialTheme.typography.headlineMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$channelCount canali",
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextSecondary
            )
        }
        
        // Actions
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Search button
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .focusRequester(searchButtonFocusRequester)
                    .clip(RoundedCornerShape(8.dp))
                    .border(2.dp, searchBorderColor, RoundedCornerShape(8.dp))
                    .background(if (isSearchFocused) WaveStreamColors.BackgroundTertiary else WaveStreamColors.BackgroundSecondary.copy(alpha = 0.5f))
                    .focusable(interactionSource = searchInteractionSource)
                    .clickable(
                        interactionSource = searchInteractionSource,
                        indication = null,
                        onClick = onSearchClick
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Cerca",
                    tint = WaveStreamColors.TextPrimary
                )
            }
            
            // Toggle button (Griglia / EPG) - labeled so it's discoverable
            Row(
                modifier = Modifier
                    .height(48.dp)
                    .focusRequester(toggleButtonFocusRequester)
                    .clip(RoundedCornerShape(8.dp))
                    .border(2.dp, toggleBorderColor, RoundedCornerShape(8.dp))
                    .background(if (isToggleFocused) WaveStreamColors.BackgroundTertiary else WaveStreamColors.BackgroundSecondary.copy(alpha = 0.5f))
                    .focusable(interactionSource = toggleInteractionSource)
                    .clickable(
                        interactionSource = toggleInteractionSource,
                        indication = null,
                        onClick = onToggleMode
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = if (isGridMode) Icons.AutoMirrored.Filled.List else Icons.Default.GridView,
                    contentDescription = null,
                    tint = if (isToggleFocused) WaveStreamColors.Accent else WaveStreamColors.TextPrimary,
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = if (isGridMode) "EPG" else "Griglia",
                    style = MaterialTheme.typography.labelLarge,
                    color = if (isToggleFocused) WaveStreamColors.Accent else WaveStreamColors.TextPrimary,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

/**
 * In-category search bar.
 * Filters only the currently selected category's channels.
 */
@Composable
private fun LiveSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onClose: () -> Unit,
    focusRequester: FocusRequester
) {
    val closeInteractionSource = remember { MutableInteractionSource() }
    val isCloseFocused by closeInteractionSource.collectIsFocusedAsState()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = onSearchQueryChange,
            modifier = Modifier
                .weight(1f)
                .focusRequester(focusRequester),
            placeholder = { Text("Cerca nella categoria...", color = WaveStreamColors.TextTertiary) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = WaveStreamColors.TextSecondary) },
            trailingIcon = if (searchQuery.isNotEmpty()) {
                {
                    IconButton(onClick = { onSearchQueryChange("") }) {
                        Icon(Icons.Default.Close, contentDescription = "Cancella", tint = WaveStreamColors.TextSecondary)
                    }
                }
            } else null,
            singleLine = true,
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = WaveStreamColors.Accent,
                unfocusedBorderColor = WaveStreamColors.BackgroundTertiary,
                focusedContainerColor = WaveStreamColors.BackgroundSecondary,
                unfocusedContainerColor = WaveStreamColors.BackgroundSecondary,
                cursorColor = WaveStreamColors.Accent
            ),
            textStyle = MaterialTheme.typography.bodyMedium.copy(color = WaveStreamColors.TextPrimary)
        )

        // Close button (hides the search bar and clears the filter)
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(2.dp, if (isCloseFocused) WaveStreamColors.Accent else Color.Transparent, CircleShape)
                .background(WaveStreamColors.BackgroundSecondary.copy(alpha = 0.5f))
                .focusable(interactionSource = closeInteractionSource)
                .clickable(
                    interactionSource = closeInteractionSource,
                    indication = null,
                    onClick = onClose
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Chiudi ricerca",
                tint = if (isCloseFocused) WaveStreamColors.Accent else WaveStreamColors.TextPrimary
            )
        }
    }
}

/**
 * Category sidebar with back button at top
 */
@Composable
private fun LiveCategoryGrid(
    categories: List<String>,
    favoriteCategories: Set<String> = emptySet(),
    channelCounts: Map<String, Int> = emptyMap(),
    restoreCategory: String? = null,
    gridState: androidx.tv.foundation.lazy.grid.TvLazyGridState,
    categoryFocusRequester: FocusRequester,
    onCategorySelect: (String) -> Unit,
    onBackClick: () -> Unit,
    onMultiscreenClick: () -> Unit = {}
) {
    val backFocusRequester = remember { FocusRequester() }
    val restoreIndex = if (restoreCategory != null) categories.indexOf(restoreCategory) else -1
    val focusIndex = if (restoreIndex >= 0) restoreIndex else 0
    
    // The grid state is retained across back-navigation (hoisted in LiveScreen),
    // so the scroll position is already where we left it: no scrollToItem jump.
    // Focus is restored instantly (with retry while the target card composes)
    // instead of the old delay(150) + slow retry that caused a visible lag/jump.
    LaunchedEffect(categories, restoreCategory, focusIndex) {
        if (categories.isEmpty()) return@LaunchedEffect
        requestFocusWithRetry(categoryFocusRequester, attempts = 8, retryDelayMs = 50)
    }
    val backInteractionSource = remember { MutableInteractionSource() }
    val isBackFocused by backInteractionSource.collectIsFocusedAsState()
    val backBorderColor by animateColorAsState(
        targetValue = if (isBackFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "backBorder"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Top bar with back + title
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(WaveStreamColors.BackgroundPrimary.copy(alpha = 0.9f))
                .padding(horizontal = 24.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .focusRequester(backFocusRequester)
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(2.dp, backBorderColor, CircleShape)
                    .background(WaveStreamColors.BackgroundSecondary.copy(alpha = 0.5f))
                    .focusable(interactionSource = backInteractionSource)
                    .clickable(
                        interactionSource = backInteractionSource,
                        indication = null,
                        onClick = onBackClick
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Indietro",
                    tint = if (isBackFocused) WaveStreamColors.Accent else WaveStreamColors.TextPrimary
                )
            }

            Text(
                text = "Live TV",
                style = MaterialTheme.typography.headlineSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
        }

        // Grid of category cards
        androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid(
            columns = androidx.tv.foundation.lazy.grid.TvGridCells.Adaptive(minSize = 160.dp),
            state = gridState,
            contentPadding = PaddingValues(24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxSize()
                .focusProperties { up = backFocusRequester }
        ) {
            tvGridItems(categories.indices.toList(), key = { categories[it] }) { index ->
                val category = categories[index]
                val isFav = favoriteCategories.contains(category)
                val count = channelCounts[category] ?: 0
                LiveCategoryCard(
                    category = category,
                    channelCount = count,
                    isFavorite = isFav,
                    onClick = { onCategorySelect(category) },
                    modifier = if (index == focusIndex) {
                        Modifier.focusRequester(categoryFocusRequester)
                    } else {
                        Modifier
                    }
                )
            }
        }
    }
}

@Composable
private fun LiveCategoryCard(
    category: String,
    channelCount: Int,
    isFavorite: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isFocused by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "catCardScale"
    )

    // Color derived from category name for visual variety
    val categoryColor = remember(category) {
        val colors = listOf(
            Color(0xFF1E88E5), // Blue
            Color(0xFF43A047), // Green
            Color(0xFFE53935), // Red
            Color(0xFF8E24AA), // Purple
            Color(0xFFFF8F00), // Orange
            Color(0xFF00ACC1), // Cyan
            Color(0xFFD81B60), // Pink
            Color(0xFF5E35B1), // Deep Purple
            Color(0xFF3949AB), // Indigo
            Color(0xFF00897B), // Teal
        )
        colors[Math.abs(category.hashCode()) % colors.size]
    }

    Card(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
            .onFocusChanged { isFocused = it.isFocused }
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = WaveStreamColors.BackgroundSecondary
        ),
        border = BorderStroke(
            width = if (isFocused) 3.dp else 0.dp,
            color = if (isFocused) WaveStreamColors.Accent else Color.Transparent
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(categoryColor.copy(alpha = if (isFocused) 0.25f else 0.1f))
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top
                ) {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.titleMedium,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    if (isFavorite) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Preferito",
                            tint = Color(0xFFE91E63),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Text(
                    text = if (channelCount > 0) "$channelCount canali" else "Nessun canale",
                    style = MaterialTheme.typography.bodySmall,
                    color = WaveStreamColors.TextSecondary
                )
            }
        }
    }
}

@Composable
private fun LiveCategorySidebar(
    categories: List<String>,
    selectedCategory: String?,
    favoriteCategories: Set<String> = emptySet(),
    onCategorySelect: (String) -> Unit,
    onToggleFavorite: (String) -> Unit = {},
    onBackClick: () -> Unit,
    onMultiscreenClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(WaveStreamColors.BackgroundPrimary)
    ) {
        // Back button and title at top
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            IconButton(
                onClick = onBackClick,
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(WaveStreamColors.BackgroundSecondary.copy(alpha = 0.5f))
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Indietro",
                    tint = WaveStreamColors.TextPrimary
                )
            }
            
            Text(
                text = "Live TV",
                style = MaterialTheme.typography.titleMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
        }
        
        HorizontalDivider(
            color = WaveStreamColors.BackgroundTertiary,
            thickness = 1.dp
        )
        
        // Multiscreen button
        MultiscreenButton(onClick = onMultiscreenClick)
        
        // Categories list
        val firstCategoryFocusRequester = remember { FocusRequester() }
        val listState = androidx.tv.foundation.lazy.list.rememberTvLazyListState()
        
        // Request focus on first category when loaded
        LaunchedEffect(categories) {
            if (categories.isNotEmpty()) {
                kotlinx.coroutines.delay(300)
                try {
                    firstCategoryFocusRequester.requestFocus()
                } catch (e: Exception) {
                    // Ignore focus errors
                }
            }
        }
        
        androidx.tv.foundation.lazy.list.TvLazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            itemsIndexed(categories) { index, category ->
                LiveCategoryItem(
                    category = category,
                    isSelected = category == selectedCategory,
                    isFavorite = favoriteCategories.contains(category),
                    onClick = { onCategorySelect(category) },
                    onLongPress = { onToggleFavorite(category) },
                    focusRequester = if (index == 0) firstCategoryFocusRequester else null
                )
            }
        }
    }
}

@Composable
private fun LiveCategoryItem(
    category: String,
    isSelected: Boolean,
    isFavorite: Boolean = false,
    onClick: () -> Unit,
    onLongPress: () -> Unit = {},
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val coroutineScope = rememberCoroutineScope()
    
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
    
    // Long press detection
    var isLongPressing by remember { mutableStateOf(false) }
    var longPressJob by remember { mutableStateOf<kotlinx.coroutines.Job?>(null) }
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .onKeyEvent { event ->
                if (event.key == androidx.compose.ui.input.key.Key.Enter || event.key == androidx.compose.ui.input.key.Key.DirectionCenter) {
                    if (event.type == androidx.compose.ui.input.key.KeyEventType.KeyDown && !isLongPressing) {
                        isLongPressing = true
                        longPressJob = coroutineScope.launch {
                            delay(1000L) // 1 second
                            onLongPress()
                        }
                    } else if (event.type == androidx.compose.ui.input.key.KeyEventType.KeyUp) {
                        isLongPressing = false
                        longPressJob?.cancel()
                    }
                    false
                } else false
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        if (isFavorite) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Preferito",
                tint = Color(0xFFE91E63),
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
        }
        
        Text(
            text = category,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isSelected || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
    }
}

/**
 * Live Channel Card for grid mode
 */
@Composable
private fun LiveChannelCard(
    channel: Channel,
    currentProgram: EpgProgram?,
    currentTime: Long,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.08f else 1f,
        label = "channelScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "channelBorder"
    )
    
    // Calculate EPG progress for current program
    val epgProgress = remember(currentProgram, currentTime) {
        if (currentProgram != null && currentProgram.start > 0 && currentProgram.end > currentProgram.start) {
            val elapsed = currentTime - currentProgram.start
            val total = currentProgram.end - currentProgram.start
            (elapsed.toFloat() / total.toFloat()).coerceIn(0f, 1f)
        } else 0f
    }
    
    // Format time range
    val timeRange = remember(currentProgram) {
        if (currentProgram != null) {
            val fmt = SimpleDateFormat("HH:mm", java.util.Locale.getDefault())
            "${fmt.format(java.util.Date(currentProgram.start))} - ${fmt.format(java.util.Date(currentProgram.end))}"
        } else null
    }
    
    Column(
        modifier = modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(160.dp)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
        // Logo container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clip(RoundedCornerShape(12.dp))
                .border(2.dp, borderColor, RoundedCornerShape(12.dp))
                .background(WaveStreamColors.CardBackground),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = channel.logoUrl,
                contentDescription = channel.name,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp)
            )
            
            // Live badge
            if (isFocused) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(Color.Red)
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "LIVE",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            
            // EPG progress bar at bottom of logo
            if (currentProgram != null && epgProgress > 0f) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .height(3.dp)
                        .background(Color.Black.copy(alpha = 0.5f))
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(epgProgress)
                            .background(WaveStreamColors.Accent)
                    )
                }
            }
        }
        
        Spacer(modifier = Modifier.height(6.dp))
        
        // Channel name
        Text(
            text = channel.name,
            style = MaterialTheme.typography.bodySmall,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Medium
        )
        
        // EPG: current program title
        currentProgram?.let { program ->
            Text(
                text = program.title,
                style = MaterialTheme.typography.labelSmall,
                color = WaveStreamColors.TextTertiary,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        
        // EPG: time range
        timeRange?.let { range ->
            Text(
                text = range,
                style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                color = WaveStreamColors.TextTertiary.copy(alpha = 0.7f),
                maxLines = 1
            )
        }
    }
}

/**
 * Multiscreen button for Live TV sidebar
 */
@Composable
private fun MultiscreenButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isFocused -> WaveStreamColors.Accent.copy(alpha = 0.3f)
            else -> Color.Transparent
        },
        label = "multiscreenBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "multiscreenBorder"
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp)
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
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Icon(
            imageVector = Icons.Default.GridView,
            contentDescription = "Multiscreen",
            tint = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
            modifier = Modifier.size(20.dp)
        )
        
        Text(
            text = "Multiscreen",
            style = MaterialTheme.typography.bodyMedium,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = if (isFocused) FontWeight.SemiBold else FontWeight.Normal
        )
    }
}


