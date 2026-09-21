package it.wavestream.app.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import java.time.LocalTime
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.togetherWith
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.core.app.ActivityOptionsCompat
import it.wavestream.app.ui.theme.AppAnimations
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import android.net.Uri
import it.wavestream.app.data.preferences.UserPreferences
import javax.inject.Inject
import androidx.lifecycle.lifecycleScope
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.FormatListBulleted
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.Download
import it.wavestream.app.ui.downloads.DownloadsActivity
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import it.wavestream.app.ui.util.requestFocusSafely
import it.wavestream.app.ui.util.requestFocusWhenReady
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.Key
import androidx.fragment.app.FragmentActivity
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.CustomGroup
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.home.CarouselItem
import it.wavestream.app.ui.home.HeroItem
import it.wavestream.app.ui.home.resolveCurrentHero
import it.wavestream.app.ui.home.SerieAMatchHeroBackdrop
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import coil.compose.AsyncImage
import it.wavestream.app.ui.home.HomeContentType
import it.wavestream.app.ui.home.HomeViewModel
import it.wavestream.app.ui.home.SerieAChannelPickerDialog
import it.wavestream.app.ui.player.PlayerActivity
import it.wavestream.app.ui.search.SearchActivity
import it.wavestream.app.ui.settings.SettingsActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.ui.theme.AccentColor
import it.wavestream.app.ui.tv.TvHomeScreen
import it.wavestream.app.ui.components.ExpandableNavRail
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.itemsIndexed
import androidx.tv.foundation.lazy.list.rememberTvLazyListState
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.focus.focusRestorer
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.input.key.onPreviewKeyEvent



/**
 * Main Tab enum for navigation
 */
enum class MainTab { HOME, MOVIES, SERIES, LIVE, FAVORITES, LISTS, HISTORY }

/**
 * Main Activity for Android TV
 * Pure Jetpack Compose implementation (no Leanback Fragments)
 */
@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    
    private var currentTab = MainTab.HOME
    private var lastBackPressTime = 0L
    private var backKeyDownTime = 0L
    
    // Companion object for focus control communication
    companion object {
        var isTopBarFocused = false
        var topBarView: View? = null
        private const val BACK_PRESS_INTERVAL = 2000L // 2 seconds
        private const val LONG_PRESS_THRESHOLD = 500L // 500ms for long press
        
        // Callback to focus search button (set by Composable)
        var onLongPressBackToSearch: (() -> Unit)? = null
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Edge-to-edge: contenuto a tutto schermo con system bar TRASPARENTI
        // (niente scrim grigio della navigation bar in basso né della status bar in alto).
        // Su TV non esistono system bar; su emulatore/dispositivi touch sparisce la banda.
        enableEdgeToEdge()
        
        // Restore state
        if (savedInstanceState != null) {
            try {
                currentTab = MainTab.valueOf(savedInstanceState.getString("current_tab", "HOME"))
            } catch (e: Exception) {
                currentTab = MainTab.HOME
            }
        }
        
        setContent {
            WaveStreamTheme {
                MainActivityScreen(
                    initialTab = currentTab,
                    onTabChanged = { currentTab = it },
                    activity = this
                )
            }
        }
    }
    
    @Inject lateinit var userPreferences: UserPreferences
    @Inject lateinit var trailerManager: it.wavestream.app.util.TrailerManager
    
    fun playTrailer(trailerKey: String) {
        lifecycleScope.launch {
            trailerManager.openTrailer(this@MainActivity, trailerKey)
        }
    }
    
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        // Double-back to exit on all tabs
        val currentTime = System.currentTimeMillis()
        
        if (currentTime - lastBackPressTime < BACK_PRESS_INTERVAL) {
            // Second press within interval - exit
            super.onBackPressed()
        } else {
            // First press - show toast
            lastBackPressTime = currentTime
            android.widget.Toast.makeText(
                this,
                "Premi di nuovo per uscire",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        }
    }
    
    override fun dispatchKeyEvent(event: android.view.KeyEvent): Boolean {
        if (event.keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            when (event.action) {
                android.view.KeyEvent.ACTION_DOWN -> {
                    if (event.repeatCount == 0) {
                        backKeyDownTime = System.currentTimeMillis()
                    }
                }
                android.view.KeyEvent.ACTION_UP -> {
                    val pressDuration = System.currentTimeMillis() - backKeyDownTime
                    if (pressDuration >= LONG_PRESS_THRESHOLD) {
                        // Long press detected - focus search button
                        onLongPressBackToSearch?.invoke()
                        return true // Consume the event
                    }
                    backKeyDownTime = 0L
                }
            }
        }
        return super.dispatchKeyEvent(event)
    }

    
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("current_tab", currentTab.name)
    }
    
    // Focus the TopBar - called when UP from first row via TvHomeScreen
    fun focusTopBar() {
        isTopBarFocused = true
        topBarView?.let { view ->
            val focusables = ArrayList<View>()
            view.addFocusables(focusables, View.FOCUS_FORWARD)
            focusables.firstOrNull()?.requestFocus()
            android.util.Log.d("MainActivity", "TopBar focused, ${focusables.size} focusables found")
        }
    }
}


@Composable
private fun MainActivityScreen(
    initialTab: MainTab,
    onTabChanged: (MainTab) -> Unit,
    @Suppress("UNUSED_PARAMETER") // activity kept for future use
    activity: MainActivity
) {
    val context = LocalContext.current
    val rootView = LocalView.current

    // ViewModel for home content
    val homeViewModel: HomeViewModel = hiltViewModel()

    val homeState by homeViewModel.uiState.collectAsStateWithLifecycle()
    

    
    // State
    var selectedTab by remember { mutableStateOf(initialTab) }
    var railExpanded by remember { mutableStateOf(false) }
    var showCreateListDialog by remember { mutableStateOf(false) }
    // Hero per cui è aperto il selettore liste (null = chiuso)
    var heroListPicker by remember { mutableStateOf<HeroItem?>(null) }
    
    // Handle back press to exit grid mode (See All view) - restore previous scroll position
    androidx.activity.compose.BackHandler(enabled = homeState.isGridMode) {
        homeViewModel.exitGridMode()
    }
    
    // Focus manager: usato per spostare il focus sul contenuto in modo
    // deterministico (prima si chiamava requestFocus() su un FocusRequester
    // applicato a un nodo NON focusable: lanciava sempre e il focus non si
    // spostava mai, dando l'impressione che la UI fosse bloccata).
    val focusManager = LocalFocusManager.current

    // Coroutine scope for async operations
    val coroutineScope = rememberCoroutineScope()
    
    // Focus requester for top bar (Film tab)
    val topBarFocusRequester = remember { FocusRequester() }
    
    // Focus requester for search button (for long press back)
    val searchButtonFocusRequester = remember { FocusRequester() }
    
    // Store reference to root view for focus control
    LaunchedEffect(rootView) {
        MainActivity.topBarView = rootView
    }
    
    // Register callback for long press back to open SearchActivity directly
    LaunchedEffect(Unit) {
        MainActivity.onLongPressBackToSearch = {
            try {
                val intent = Intent(context, SearchActivity::class.java)
                context.startActivity(intent)
            } catch (e: Exception) {
                // Ignore focus errors
            }
        }
    }
    
    // Refresh content on resume (e.g., after returning from player)
    val lifecycleOwner = LocalLifecycleOwner.current
    var isFirstResume by remember { mutableStateOf(true) }
    // Contatore dei ritorni in foreground: usato per ripristinare il focus.
    var resumeTick by remember { mutableIntStateOf(0) }
    DisposableEffect(lifecycleOwner) {
        val observer = androidx.lifecycle.LifecycleEventObserver { _, event ->
            when (event) {
                androidx.lifecycle.Lifecycle.Event.ON_RESUME -> {
                    if (isFirstResume) {
                        isFirstResume = false
                    } else {
                        // Force refresh to show updated "Continue Watching" and Hero buttons immediately
                        homeViewModel.forceRefresh()
                        resumeTick++
                    }
                }
                else -> {}
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    // Al ritorno da un'altra Activity il contenuto viene ricomposto (forceRefresh):
    // l'elemento che aveva il focus può non esistere più e, senza nessun target
    // focusato, la finestra perde il focus e i tasti del telecomando vengono
    // scartati (ANR "no focused window"). Se dopo qualche frame non c'è più
    // nessun elemento focusato, riportiamo il focus sulla top bar.
    LaunchedEffect(resumeTick) {
        if (resumeTick == 0) return@LaunchedEffect
        repeat(3) { withFrameNanos { } }
        kotlinx.coroutines.delay(250)
        if (rootView.findFocus() == null) {
            try {
                topBarFocusRequester.requestFocus()
            } catch (e: Exception) {
                // Requester non ancora collegato: nessun problema.
            }
        }
    }
    
    // Sposta il focus sul contenuto aspettando un frame, così la ricerca
    // spaziale del D-pad lavora sul layout già aggiornato (es. rail appena chiuso).
    fun moveFocusToContent(direction: FocusDirection) {
        coroutineScope.launch {
            withFrameNanos { }
            try {
                focusManager.moveFocus(direction)
            } catch (_: Exception) {
                // Nessun candidato nella direzione: il focus resta dov'è
            }
        }
    }

    // Helper for animated activity navigation
    fun startActivityWithTransition(intent: Intent) {
        val options = ActivityOptionsCompat.makeCustomAnimation(
            context,
            it.wavestream.app.R.anim.zoom_in_enter,
            it.wavestream.app.R.anim.zoom_in_exit
        )
        context.startActivity(intent, options.toBundle())
    }
    
    // Handle tab selection
    fun selectTab(tab: MainTab) {
        // For LIVE tab, just navigate to LiveActivity without changing selectedTab
        // This way when user returns, the previous tab is still selected
        if (tab == MainTab.LIVE) {
            startActivityWithTransition(Intent(context, it.wavestream.app.ui.live.LiveActivity::class.java))
            return
        }
        
        if (tab == selectedTab) return
        selectedTab = tab
        onTabChanged(tab)
        
        // Load content for the selected tab
        val contentType = when (tab) {
            MainTab.HOME -> HomeContentType.HOME
            MainTab.MOVIES -> HomeContentType.MOVIES
            MainTab.SERIES -> HomeContentType.SERIES
            MainTab.FAVORITES -> HomeContentType.FAVORITES
            MainTab.LISTS -> HomeContentType.LISTS
            MainTab.HISTORY -> HomeContentType.HISTORY
            MainTab.LIVE -> HomeContentType.MOVIES  // Fallback (shouldn't reach here)
        }
        homeViewModel.loadContent(contentType)
    }

    
    // Handle item click
    fun handleItemClick(item: CarouselItem) {
        when (item.contentType) {
            "CHANNEL" -> {
                startActivityWithTransition(Intent(context, PlayerActivity::class.java).apply {
                    putExtra("content_type", ContentType.CHANNEL.name)
                    putExtra("content_id", item.id)
                    putExtra("title", item.title)
                })
            }
            "MOVIE" -> {
                startActivityWithTransition(Intent(context, DetailsActivity::class.java).apply {
                    putExtra("content_type", ContentType.MOVIE.name)
                    putExtra("content_id", item.id)
                    putExtra("title", item.title)
                    putExtra("poster_url", item.posterUrl)
                    putExtra("backdrop_url", item.backdropUrl)
                })
            }
            "SERIES" -> {
                startActivityWithTransition(Intent(context, DetailsActivity::class.java).apply {
                    putExtra("content_type", ContentType.SERIES.name)
                    putExtra("content_id", item.id)
                    putExtra("title", item.title)
                    putExtra("poster_url", item.posterUrl)
                    putExtra("backdrop_url", item.backdropUrl)
                })
            }
            // Category cards -> CategoryActivity
            "CATEGORY_MOVIE", "CATEGORY_SERIES", "CATEGORY_LIVE" -> {
                startActivityWithTransition(Intent(context, it.wavestream.app.ui.category.CategoryActivity::class.java).apply {
                    putExtra("categoryName", item.title)
                    putExtra("contentType", item.contentType)
                })
            }
        }
    }
    
    fun handleSeeAllClick(rowTitle: String) {
        if (rowTitle.isEmpty()) {
            homeViewModel.exitGridMode()
            return
        }
        
        // "Vedi tutto" must show exactly the same items as the carousel. The
        // carousel already holds the final item list, so pass its ids + types to
        // CategoryActivity instead of the raw row title (which is often NOT a real
        // DB category — e.g. "Continua a guardare", "Film per te", "Prossimo episodio").
        val row = homeState.carouselRows.find { it.title == rowTitle }
        if (row != null && row.items.isNotEmpty()) {
            val ids = LongArray(row.items.size) { index -> row.items[index].id }
            val types = ArrayList<String>(row.items.size)
            row.items.forEach { types.add(it.contentType) }
            
            val contentType = when {
                types.all { it == "MOVIE" } -> "CATEGORY_MOVIE"
                types.all { it == "SERIES" } -> "CATEGORY_SERIES"
                types.all { it == "CHANNEL" } -> "CATEGORY_LIVE"
                else -> "SEE_ALL"
            }
            
            startActivityWithTransition(Intent(context, it.wavestream.app.ui.category.CategoryActivity::class.java).apply {
                putExtra("categoryName", rowTitle)
                putExtra("contentType", contentType)
                putExtra("item_ids", ids)
                putStringArrayListExtra("item_types", types)
            })
            return
        }
        
        // Fallback: navigate to CategoryActivity with the row title (same as sidebar navigation)
        val contentType = when (selectedTab) {
            MainTab.MOVIES -> "CATEGORY_MOVIE"
            MainTab.SERIES -> "CATEGORY_SERIES"
            else -> {
                // For mixed tabs, detect based on row title
                if (rowTitle.contains("Film", ignoreCase = true) || 
                    rowTitle == context.getString(it.wavestream.app.R.string.popular_movies)) {
                    "CATEGORY_MOVIE"
                } else {
                    "CATEGORY_SERIES"
                }
            }
        }
        
        startActivityWithTransition(Intent(context, it.wavestream.app.ui.category.CategoryActivity::class.java).apply {
            putExtra("categoryName", rowTitle)
            putExtra("contentType", contentType)
        })
    }
    
    // ---------------------------------------------------------------------
    // Fase 1b — backdrop immersivo a TUTTO schermo.
    // L'hero non è più ritagliato in una fascia alta 340dp: l'immagine copre anche
    // rail e top bar (che sono resi traslucidi). Attivo solo sulla Home, perché è
    // l'unica tab con un hero a cui agganciarsi.
    // ---------------------------------------------------------------------
    val immersiveHome = homeState.isHomeTab && !homeState.isGridMode && !homeState.isLoading
    val ambientHero = remember(
        homeState.heroItems,
        homeState.serieAMatchHeroes,
        homeState.currentHeroIndex,
        homeState.isHomeTab
    ) {
        resolveCurrentHero(homeState)
    }
    // Su Home lo sfondo radice deve essere trasparente, altrimenti il gradiente
    // opaco coprirebbe il backdrop.
    val rootBackground: Brush = if (immersiveHome) {
        Brush.verticalGradient(listOf(Color.Transparent, Color.Transparent))
    } else {
        Brush.verticalGradient(
            colors = listOf(
                WaveStreamColors.Accent.copy(alpha = 0.045f),
                WaveStreamColors.GradientMiddle,
                WaveStreamColors.GradientBottom
            )
        )
    }

    Box(modifier = Modifier.fillMaxSize()) {

        if (immersiveHome && ambientHero != null) {
            HeroAmbientBackdrop(
                hero = ambientHero,
                serieAMatch = homeState.serieAMatches.firstOrNull {
                    it.id == ambientHero.serieAMatchId
                }
            )
        }

    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(rootBackground)
    ) {
        // Navigation Rail (expandable)
        ExpandableNavRail(
            selectedTab = selectedTab,
            onTabSelected = { selectTab(it) },
            isExpanded = railExpanded,
            onExpandedChange = { railExpanded = it },
            onSettingsClick = {
                startActivityWithTransition(Intent(context, SettingsActivity::class.java))
            },
            onAssistantClick = {
                startActivityWithTransition(Intent(context, it.wavestream.app.ui.assistant.AssistantActivity::class.java))
            },
            onCollapseRequest = { railExpanded = false },
            onContentFocusRequest = { moveFocusToContent(FocusDirection.Right) },
            onExploreCategoriesClick = { isMovies ->
                val contentType = if (isMovies) "movies" else "series"
                startActivityWithTransition(Intent(context, it.wavestream.app.ui.category.AllCategoriesActivity::class.java).apply {
                    putExtra("contentType", contentType)
                })
            },
            onViewAllClick = { isMovies ->
                val intent = if (isMovies) {
                    Intent(context, it.wavestream.app.ui.film.FilmActivity::class.java)
                } else {
                    Intent(context, it.wavestream.app.ui.series.SeriesActivity::class.java)
                }
                startActivityWithTransition(intent)
            },
            modifier = Modifier.fillMaxHeight()
        )
        
        // Main content area
        Column(modifier = Modifier.fillMaxSize()) {
            // Mini Top Bar (clock + actions only)
            val profileName by homeViewModel.profileName.collectAsStateWithLifecycle()
            MiniTopBar(
                profileName = profileName,
                onProfileClick = { 
                    startActivityWithTransition(Intent(context, it.wavestream.app.ui.profile.ProfileSelectionActivity::class.java))
                },
                onSearchClick = {
                    startActivityWithTransition(Intent(context, SearchActivity::class.java))
                },
                onRandomClick = {
                    coroutineScope.launch {
                        val randomItem = homeViewModel.getRandomContent()
                        if (randomItem != null) {
                            val intent = Intent(context, DetailsActivity::class.java).apply {
                                putExtra("content_id", randomItem.first)
                                putExtra("content_type", randomItem.second)
                            }
                            startActivityWithTransition(intent)
                        }
                    }
                },
                onDownloadsClick = {
                    startActivityWithTransition(Intent(context, DownloadsActivity::class.java))
                },
                onContentFocusRequest = { moveFocusToContent(FocusDirection.Down) },
                searchButtonFocusRequester = searchButtonFocusRequester,
                firstButtonFocusRequester = topBarFocusRequester,
                modifier = Modifier.fillMaxWidth()
            )

            // Main content with animated tab transition
            androidx.compose.animation.AnimatedContent(
                targetState = selectedTab,
                transitionSpec = {
                    androidx.compose.animation.fadeIn(
                        animationSpec = androidx.compose.animation.core.tween(400)
                    ).togetherWith(
                        androidx.compose.animation.fadeOut(
                            animationSpec = androidx.compose.animation.core.tween(400)
                        )
                    )
                },
                label = "tabTransition"
            ) { targetTab ->
                TvHomeScreen(
                    state = homeState,
                    onItemClick = { handleItemClick(it) },
                        onSeeAllClick = { handleSeeAllClick(it) },
                        onPlayClick = { handleItemClick(it) },
                        onTopBarFocusRequest = {
                            try {
                                topBarFocusRequester.requestFocus()
                            } catch (e: Exception) {
                                // Ignore focus errors
                            }
                        },
                        topBarFocusRequester = topBarFocusRequester,
                        onCreateListClick = {
                            showCreateListDialog = true
                        },
                        onHeroClick = { heroItem ->
                            val intent = Intent(context, DetailsActivity::class.java).apply {
                                putExtra("content_id", heroItem.id)
                                putExtra("content_type", heroItem.contentType)
                                putExtra("title", heroItem.title)
                                putExtra("poster_url", heroItem.posterUrl)
                                putExtra("backdrop_url", heroItem.backdropUrl)
                            }
                            startActivityWithTransition(intent)
                        },
                        onHeroPlayClick = { heroItem ->
                            if (heroItem.contentType == "SERIEA_MATCH") {
                                // "Guarda adesso" → griglia canali della partita mostrata
                                homeViewModel.openSerieAChannelPicker(heroItem.serieAMatchId)
                            } else {
                                val intent = Intent(context, it.wavestream.app.ui.player.PlayerActivity::class.java).apply {
                                    putExtra("content_id", heroItem.id)
                                    putExtra("content_type", heroItem.contentType)
                                    putExtra("title", heroItem.title)
                                }
                                startActivityWithTransition(intent)
                            }
                        },
                        onTrailerClick = { heroItem ->
                            heroItem.trailerKey?.let { activity.playTrailer(it) }
                        },
                        onNextHero = { homeViewModel.nextHero() },
                        onPrevHero = { homeViewModel.prevHero() },
                        onToggleHeroFavorite = { homeViewModel.toggleHeroFavorite(it) },
                        onAddHeroToPlaylist = { hero ->
                            // Apre il selettore liste: niente più aggiunta automatica
                            // alla lista "Da guardare".
                            heroListPicker = hero
                        },
                        onToggleCategoryFilter = { category -> homeViewModel.toggleCategoryFilter(category) },
                        onSelectAllCategories = { homeViewModel.selectAllCategories() },
                        onClearCategoryFilters = { homeViewModel.clearCategoryFilters() },
                        onMarkAsWatchedClick = { heroItem ->
                            homeViewModel.markAsWatched(heroItem)
                            android.widget.Toast.makeText(context, "Rimosso da Continua a guardare", android.widget.Toast.LENGTH_SHORT).show()
                        },
                        onRailFocusRequest = {
                            // Focus on rail when LEFT is pressed from content
                            railExpanded = true
                        },
                        onManageHistoryClick = {
                            startActivityWithTransition(
                                Intent(context, it.wavestream.app.ui.history.HistoryActivity::class.java)
                            )
                        },
                        modifier = Modifier.fillMaxSize()
                    )
            }
        }

        // Serie A channel picker dialog ("Guarda adesso")
        homeState.serieAChannelPicker?.let { picker ->
            SerieAChannelPickerDialog(
                match = picker.match,
                channels = picker.channels,
                isLoading = picker.isLoading,
                tabellinoState = homeState.serieATabellino,
                epg = picker.epg,
                onDismiss = { homeViewModel.dismissSerieAChannelPicker() },
                onChannelClick = { channel ->
                    // Niente dismiss: il dialog resta aperto sotto il player,
                    // così il BACK dal live riporta alla griglia canali
                    val intent = Intent(context, it.wavestream.app.ui.player.PlayerActivity::class.java).apply {
                        putExtra("content_id", channel.id)
                        putExtra("content_type", "CHANNEL")
                        putExtra("stream_url", channel.streamUrl)
                        putExtra("title", channel.name)
                    }
                    startActivityWithTransition(intent)
                }
            )
        }

        // Create list dialog
        if (showCreateListDialog) {
            CreateListDialog(
                onDismiss = { showCreateListDialog = false },
                onCreate = { listName ->
                    showCreateListDialog = false
                    // Ricarica il tab Liste solo dopo l'inserimento nel DB, così la
                    // nuova lista compare immediatamente anche se è vuota.
                    homeViewModel.createList(listName) {
                        homeViewModel.loadContent(HomeContentType.LISTS)
                    }
                }
            )
        }

        // Selettore liste dell'hero (scelta lista esistente o creazione)
        heroListPicker?.let { hero ->
            HeroListPickerDialog(
                hero = hero,
                viewModel = homeViewModel,
                onDismiss = { heroListPicker = null }
            )
        }
    }
    }
}

/**
 * Backdrop immersivo a tutto schermo (Fase 1b).
 *
 * Disegna l'hero corrente dietro rail e top bar. Riceve l'hero già risolto da
 * [resolveCurrentHero], la stessa funzione usata dal banner in `TvHomeScreen`: così
 * immagine di sfondo e testo dell'hero non possono divergere durante la rotazione.
 *
 * Le due scrim sono volutamente leggere nella fascia dell'hero: il contrasto del
 * testo è già gestito dalle scrim interne di `HeroBanner`. Qui servono solo a dare
 * respiro alla rail (a sinistra) e a dissolvere l'immagine verso il nero nella parte
 * bassa, dove scorrono le righe di contenuto.
 */
@Composable
private fun HeroAmbientBackdrop(
    hero: HeroItem,
    serieAMatch: SerieAMatchEntity?
) {
    androidx.compose.animation.Crossfade(
        targetState = hero,
        animationSpec = tween(450),
        label = "heroAmbientBackdrop"
    ) { current ->
        Box(modifier = Modifier.fillMaxSize()) {
            if (current.contentType == "SERIEA_MATCH" && serieAMatch != null) {
                SerieAMatchHeroBackdrop(
                    match = serieAMatch,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                AsyncImage(
                    model = current.backdropUrl ?: current.posterUrl,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.horizontalGradient(
                    colorStops = arrayOf(
                        0.00f to Color.Black.copy(alpha = 0.50f),
                        0.12f to Color.Black.copy(alpha = 0.34f),
                        0.24f to Color.Black.copy(alpha = 0.12f),
                        0.38f to Color.Transparent,
                        1.00f to Color.Transparent
                    )
                )
            )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colorStops = arrayOf(
                        0.00f to Color.Black.copy(alpha = 0.30f),
                        0.14f to Color.Transparent,
                        0.52f to Color.Transparent,
                        0.84f to Color.Black.copy(alpha = 0.86f),
                        1.00f to Color.Black
                    )
                )
            )
    )
}

/**
 * Main Top Bar with tabs and action buttons
 */
@Composable
private fun MainTopBar(
    selectedTab: MainTab,
    onTabSelected: (MainTab) -> Unit,
    onMenuClick: () -> Unit,
    onProfileClick: () -> Unit,
    onSearchClick: () -> Unit,
    onSettingsClick: () -> Unit,
    onRandomClick: () -> Unit = {},
    onDownloadsClick: () -> Unit = {},
    onContentFocusRequest: () -> Unit = {},
    filmTabFocusRequester: FocusRequester = remember { FocusRequester() },
    searchButtonFocusRequester: FocusRequester? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .background(Color.Black.copy(alpha = 0.9f))
            .padding(horizontal = 24.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Left side: Menu + Tabs
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Menu button with TV-friendly focus indicator
            TopBarIconButton(
                icon = Icons.Default.Menu,
                contentDescription = "Menu",
                onClick = onMenuClick,
                onDownPress = onContentFocusRequest
            )
            
            // Tabs container with sliding indicator
            // Use a stable MutableState<IntArray> instead of mutableStateMapOf to avoid recompose loops:
            // onGloballyPositioned -> map update -> recompose -> onGloballyPositioned
            val tabWidthsState = remember { mutableStateOf(IntArray(MainTab.entries.size) { 80 }) }
            val tabWidths = tabWidthsState.value
            val selectedTabIndex = MainTab.entries.indexOf(selectedTab)

            // Calculate indicator offset with spring animation
            val indicatorOffset by animateDpAsState(
                targetValue = (0 until selectedTabIndex).sumOf {
                    tabWidths[it] + 16 // tab width + spacing
                }.dp,
                animationSpec = spring(
                    dampingRatio = 0.6f,
                    stiffness = 300f
                ),
                label = "indicatorOffset"
            )

            val indicatorWidth by animateDpAsState(
                targetValue = tabWidths[selectedTabIndex].dp,
                animationSpec = spring(
                    dampingRatio = 0.6f,
                    stiffness = 300f
                ),
                label = "indicatorWidth"
            )
            
            Box {
                // Sliding indicator behind tabs (hide for FAVORITES/LISTS/HISTORY - they have their own background)
                if (selectedTab != MainTab.FAVORITES && selectedTab != MainTab.LISTS && selectedTab != MainTab.HISTORY) {
                    Box(
                        modifier = Modifier
                            .offset(x = indicatorOffset)
                            .width(indicatorWidth)
                            .height(36.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(WaveStreamColors.Accent)
                    )
                }
                
                // Tab buttons row
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MainTab.entries.forEachIndexed { index, tab ->
                        if (tab == MainTab.HISTORY) {
                            // History icon button
                            HistoryTabButton(
                                isSelected = tab == selectedTab,
                                onClick = { onTabSelected(tab) },
                                onDownPress = onContentFocusRequest,
                                onWidthMeasured = { width ->
                                    val current = tabWidthsState.value
                                    val w = width.toInt()
                                    if (current[index] != w) {
                                        tabWidthsState.value = current.copyOf().also { it[index] = w }
                                    }
                                }
                            )
                        } else if (tab == MainTab.FAVORITES) {
                            // Heart icon button for favorites
                            FavoritesTabButton(
                                isSelected = tab == selectedTab,
                                onClick = { onTabSelected(tab) },
                                onDownPress = onContentFocusRequest,
                                onWidthMeasured = { width ->
                                    val current = tabWidthsState.value
                                    val w = width.toInt()
                                    if (current[index] != w) {
                                        tabWidthsState.value = current.copyOf().also { it[index] = w }
                                    }
                                }
                            )
                        } else if (tab == MainTab.LISTS) {
                            // List icon button for custom lists
                            ListsTabButton(
                                isSelected = tab == selectedTab,
                                onClick = { onTabSelected(tab) },
                                onDownPress = onContentFocusRequest,
                                onWidthMeasured = { width ->
                                    val current = tabWidthsState.value
                                    val w = width.toInt()
                                    if (current[index] != w) {
                                        tabWidthsState.value = current.copyOf().also { it[index] = w }
                                    }
                                }
                            )
                        } else {
                            TabButton(
                                text = when (tab) {
                                    MainTab.MOVIES -> "Film"
                                    MainTab.SERIES -> "Serie TV"
                                    MainTab.LIVE -> "Live"
                                    else -> ""
                                },
                                isSelected = tab == selectedTab,
                                onClick = { onTabSelected(tab) },
                                focusRequester = if (tab == MainTab.MOVIES) filmTabFocusRequester else null,
                                onDownPress = onContentFocusRequest,
                                onWidthMeasured = { width ->
                                    val current = tabWidthsState.value
                                    val w = width.toInt()
                                    if (current[index] != w) {
                                        tabWidthsState.value = current.copyOf().also { it[index] = w }
                                    }
                                }
                            )
                        }
                    }
                }
            }
            
            // Request focus on Film tab at startup
            LaunchedEffect(Unit) {
                kotlinx.coroutines.delay(300) // Wait for composition
                try {
                    filmTabFocusRequester.requestFocus()
                } catch (e: Exception) {
                    // Ignore focus errors
                }
            }
        }
        
        // Right side: Clock + Actions with TV-friendly focus indicators
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Digital Clock
            DigitalClock()
            
            // Divider
            Box(
                modifier = Modifier
                    .width(1.dp)
                    .height(24.dp)
                    .background(Color.White.copy(alpha = 0.3f))
            )
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // Random content button (dice/shuffle)
            TopBarIconButton(
                painter = androidx.compose.ui.res.painterResource(it.wavestream.app.R.drawable.dadi),
                contentDescription = "Contenuto casuale",
                onClick = onRandomClick,
                onDownPress = onContentFocusRequest
            )
            TopBarIconButton(
                icon = Icons.Default.Download,
                contentDescription = "Download",
                onClick = onDownloadsClick,
                onDownPress = onContentFocusRequest
            )
            TopBarIconButton(
                icon = Icons.Default.Search,
                contentDescription = "Cerca",
                onClick = onSearchClick,
                onDownPress = onContentFocusRequest,
                focusRequester = searchButtonFocusRequester
            )
            TopBarIconButton(
                icon = Icons.Default.Settings,
                contentDescription = "Impostazioni",
                onClick = onSettingsClick,
                onDownPress = onContentFocusRequest
            )
            TopBarIconButton(
                icon = Icons.Default.Person,
                contentDescription = "Profilo",
                onClick = onProfileClick,
                onDownPress = onContentFocusRequest
            )
        }
    }
}

/**
 * Mini Top Bar - versione semplificata senza tabs
 * Mostra solo orologio e azioni (search, download, profile)
 * Usata con il Navigation Rail
 */
/**
 * Restituisce un saluto in base all'ora corrente:
 * Buongiorno (05:00 - 13:59), Buon pomeriggio (14:00 - 18:59), Buonasera (19:00 - 04:59)
 */
private fun timeBasedGreeting(): String {
    val hour = LocalTime.now().hour
    return when (hour) {
        in 5..13 -> "Buongiorno"
        in 14..18 -> "Buon pomeriggio"
        else -> "Buonasera"
    }
}

@Composable
private fun MiniTopBar(
    profileName: String = "",
    onProfileClick: () -> Unit,
    onSearchClick: () -> Unit,
    onRandomClick: () -> Unit = {},
    onDownloadsClick: () -> Unit = {},
    onContentFocusRequest: () -> Unit = {},
    searchButtonFocusRequester: FocusRequester? = null,
    firstButtonFocusRequester: FocusRequester? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            // Fase 2.3 — top bar in vetro: prima 0.8 di nero copriva quasi del tutto
            // il backdrop immersivo (Fase 1b). Ora l'immagine traspare.
            .background(Color.Black.copy(alpha = 0.35f))
            .padding(horizontal = 24.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Left: greeting + profile name
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (profileName.isNotEmpty()) {
                Text(
                    text = "${timeBasedGreeting()}, $profileName",
                    style = MaterialTheme.typography.titleMedium,
                    color = WaveStreamColors.TextPrimary,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
        
        // Right: clock + actions
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            DigitalClock()
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // Random content button
            TopBarIconButton(
                painter = androidx.compose.ui.res.painterResource(it.wavestream.app.R.drawable.dadi),
                contentDescription = "Contenuto casuale",
                onClick = onRandomClick,
                onDownPress = onContentFocusRequest,
                focusRequester = firstButtonFocusRequester
            )
            
            TopBarIconButton(
                icon = Icons.Default.Download,
                contentDescription = "Download",
                onClick = onDownloadsClick,
                onDownPress = onContentFocusRequest
            )
            
            TopBarIconButton(
                icon = Icons.Default.Search,
                contentDescription = "Cerca",
                onClick = onSearchClick,
                onDownPress = onContentFocusRequest,
                focusRequester = searchButtonFocusRequester
            )
            
            TopBarIconButton(
                icon = Icons.Default.Person,
                contentDescription = "Profilo",
                onClick = onProfileClick,
                onDownPress = onContentFocusRequest
            )
        }
    }
}

@Composable
private fun TabButton(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null,
    onDownPress: () -> Unit = {},
    onWidthMeasured: (Float) -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val density = LocalDensity.current
    
    // No background here - indicator is behind
    val focusBackground by animateColorAsState(
        targetValue = if (isFocused && !isSelected) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "tabFocusBg"
    )
    
    // Border color when focused (purple border for visibility)
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "tabBorderColor"
    )
    
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
        color = if (isSelected || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(focusBackground)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown &&
                    keyEvent.key == Key.DirectionDown) {
                    onDownPress()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .onGloballyPositioned { coordinates ->
                with(density) {
                    onWidthMeasured(coordinates.size.width.toDp().value)
                }
            }
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}

/**
 * Top bar icon button with TV-friendly focus indicator
 * Shows scale animation and accent border when focused
 */
@Composable
private fun TopBarIconButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    onDownPress: () -> Unit = {},
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.2f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "iconButtonScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "iconButtonBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "iconButtonBorder"
    )
    
    val iconColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextPrimary,
        label = "iconButtonColor"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(40.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown &&
                    keyEvent.key == Key.DirectionDown) {
                    onDownPress()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = iconColor,
            modifier = Modifier.size(24.dp)
        )
    }
}

/**
 * Top bar icon button with TV-friendly focus indicator (Painter overload)
 */
@Composable
private fun TopBarIconButton(
    painter: androidx.compose.ui.graphics.painter.Painter,
    contentDescription: String,
    onClick: () -> Unit,
    onDownPress: () -> Unit = {},
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.2f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "iconButtonScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "iconButtonBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "iconButtonBorder"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(40.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown &&
                    keyEvent.key == Key.DirectionDown) {
                    onDownPress()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = Color.Unspecified, // Use original PNG colors
            modifier = Modifier.size(24.dp)
        )
    }
}

/**
 * Digital clock that shows the current time
 * Updates every second.
 * Isolated as its own composable so the surrounding Row doesn't recompose every second
 * — only this Text is invalidated.
 */
@Composable
fun DigitalClock(
    modifier: Modifier = Modifier,
    textColor: Color = Color.White,
    textStyle: androidx.compose.ui.text.TextStyle = MaterialTheme.typography.titleMedium
) {
    val currentTime by produceState(initialValue = getCurrentTimeString()) {
        while (true) {
            value = getCurrentTimeString()
            kotlinx.coroutines.delay(1000L)
        }
    }

    Text(
        text = currentTime,
        color = textColor,
        style = textStyle,
        fontWeight = FontWeight.Medium,
        modifier = modifier
    )
}

private fun getCurrentTimeString(): String {
    val formatter = java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault())
    return formatter.format(java.util.Date())
}
/**
 * Favorites tab button - Heart icon only (Prime Video style)
 */
@Composable
private fun FavoritesTabButton(
    isSelected: Boolean,
    onClick: () -> Unit,
    onDownPress: () -> Unit = {},
    onWidthMeasured: (Float) -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val density = LocalDensity.current
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "heartTabScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> Color.Transparent
        },
        label = "heartTabBg"
    )
    
    val iconColor by animateColorAsState(
        targetValue = when {
            isSelected -> Color.White
            isFocused -> WaveStreamColors.Accent
            else -> WaveStreamColors.TextSecondary
        },
        label = "heartTabIcon"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(36.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown &&
                    keyEvent.key == Key.DirectionDown) {
                    onDownPress()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .onGloballyPositioned { coordinates ->
                with(density) {
                    onWidthMeasured(coordinates.size.width.toDp().value)
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isSelected) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
            contentDescription = "Preferiti",
            tint = iconColor,
            modifier = Modifier.size(20.dp)
        )
    }
}

/**
 * Lists tab button - List icon only
 */
@Composable
private fun ListsTabButton(
    isSelected: Boolean,
    onClick: () -> Unit,
    onDownPress: () -> Unit = {},
    onWidthMeasured: (Float) -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val density = LocalDensity.current
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "listsTabScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> Color.Transparent
        },
        label = "listsTabBg"
    )
    
    val iconColor by animateColorAsState(
        targetValue = when {
            isSelected -> Color.White
            isFocused -> WaveStreamColors.Accent
            else -> WaveStreamColors.TextSecondary
        },
        label = "listsTabIcon"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(36.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown &&
                    keyEvent.key == Key.DirectionDown) {
                    onDownPress()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .onGloballyPositioned { coordinates ->
                with(density) {
                    onWidthMeasured(coordinates.size.width.toDp().value)
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.FormatListBulleted,
            contentDescription = "Liste",
            tint = iconColor,
            modifier = Modifier.size(20.dp)
        )
    }
}

/**
 * History tab button - History icon only
 */
@Composable
private fun HistoryTabButton(
    isSelected: Boolean,
    onClick: () -> Unit,
    onDownPress: () -> Unit = {},
    onWidthMeasured: (Float) -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val density = LocalDensity.current
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "historyTabScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> Color.Transparent
        },
        label = "historyTabBg"
    )
    
    val iconColor by animateColorAsState(
        targetValue = when {
            isSelected -> Color.White
            isFocused -> WaveStreamColors.Accent
            else -> WaveStreamColors.TextSecondary
        },
        label = "historyTabIcon"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(36.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown &&
                    keyEvent.key == Key.DirectionDown) {
                    onDownPress()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .onGloballyPositioned { coordinates ->
                with(density) {
                    onWidthMeasured(coordinates.size.width.toDp().value)
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = androidx.compose.ui.res.painterResource(it.wavestream.app.R.drawable.cronologia),
            contentDescription = "Cronologia",
            tint = iconColor,
            modifier = Modifier.size(20.dp)
        )
    }
}

/**
 * Category Sidebar for filtering content
 */
@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
private fun CategorySidebar(
    categories: List<String>,
    selectedCategory: String?,
    favoriteCategories: Set<String> = emptySet(),
    onCategorySelected: (String) -> Unit,
    onToggleFavorite: (String) -> Unit = {},
    onViewAllCategories: () -> Unit = {},
    onClose: () -> Unit
) {
    // Focus requester for view all button and first category
    val viewAllFocusRequester = remember { FocusRequester() }
    val firstCategoryFocusRequester = remember { FocusRequester() }
    
    // Track list state to prevent UP from escaping sidebar
    val listState = androidx.tv.foundation.lazy.list.rememberTvLazyListState()
    
    Column(
        modifier = Modifier
            .width(280.dp)
            .fillMaxHeight()
            .background(WaveStreamColors.BackgroundElevated.copy(alpha = 0.92f))  // pannello flottante, non nero pieno
    ) {
        // Header with close button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Categorie",
                style = MaterialTheme.typography.titleLarge,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
            
            // TV-friendly close button
            TopBarIconButton(
                icon = Icons.Default.Close,
                contentDescription = "Chiudi",
                onClick = onClose
            )
        }

        // Category list using TvLazyColumn for proper D-pad navigation
        androidx.tv.foundation.lazy.list.TvLazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .onKeyEvent { event ->
                    if (event.type == KeyEventType.KeyDown) {
                        when (event.key) {
                            Key.Back -> {
                                onClose()
                                true  // Consume BACK to close sidebar
                            }
                            Key.DirectionLeft -> {
                                onClose()
                                true  // LEFT closes sidebar
                            }
                            else -> false
                        }
                    } else false
                },
            contentPadding = PaddingValues(8.dp)
        ) {
            // View All Categories button at top
            item {
                ViewAllCategoriesButton(
                    onClick = onViewAllCategories,
                    focusRequester = viewAllFocusRequester
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            itemsIndexed(categories) { index, category ->
                // Strip count suffix for favorite comparison (e.g., "4k UHD (377)" -> "4k UHD")
                val cleanCategory = category.replace(Regex("\\s*\\(\\d+\\)$"), "").trim()
                CategoryItem(
                    category = category,
                    isSelected = category == selectedCategory,
                    isFavorite = favoriteCategories.contains(cleanCategory),
                    onClick = { onCategorySelected(category) },
                    onLongPress = { onToggleFavorite(category) },
                    focusRequester = if (index == 0) firstCategoryFocusRequester else null
                )
            }
        }
    }
    
    // Request focus on first category when sidebar opens
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(100) // Wait for composition
        try {
            firstCategoryFocusRequester.requestFocus()
        } catch (e: Exception) {
            // Ignore focus errors
        }
    }
}

@Composable
private fun CategoryItem(
    category: String,
    isSelected: Boolean,
    isFavorite: Boolean = false,
    onClick: () -> Unit,
    onLongPress: () -> Unit = {},
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Long press detection state
    var isLongPressing by remember { mutableStateOf(false) }
    var longPressTriggered by remember { mutableStateOf(false) }
    var longPressJob by remember { mutableStateOf<kotlinx.coroutines.Job?>(null) }
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
    
    // Parse category name and count from format "Category + (123)" or "Tutti i Film (123)"
    val (name, count) = remember(category) {
        val countMatch = Regex("\\((\\d+)\\)$").find(category)
        if (countMatch != null) {
            val countStr = countMatch.groupValues[1]
            val nameStr = category.removeSuffix(" (${countStr})").removeSuffix("(${countStr})")
                .removeSuffix(" + ").trim()
            Pair(nameStr, countStr)
        } else {
            Pair(category.trim(), null)
        }
    }
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .onKeyEvent { event ->
                val isEnter = event.key == Key.Enter || event.key == Key.DirectionCenter || event.key == Key.NumPadEnter
                
                if (isEnter) {
                     if (event.type == KeyEventType.KeyDown) {
                         if (!isLongPressing) {
                             isLongPressing = true
                             longPressTriggered = false
                             longPressJob?.cancel()
                             longPressJob = coroutineScope.launch {
                                 kotlinx.coroutines.delay(800L) // 0.8 second hold
                                 longPressTriggered = true
                                 onLongPress()
                             }
                         }
                         true // Consume key down
                     } else if (event.type == KeyEventType.KeyUp) {
                         isLongPressing = false
                         longPressJob?.cancel()
                         
                         if (!longPressTriggered) {
                             // Short press - navigate
                             onClick()
                         }
                         true // Consume key up
                     } else {
                         false
                     }
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = { /* Handled by onKeyEvent for TV D-pad, this handles touch mainly */ 
                    onClick() 
                }
            )
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Star icon for favorites
        if (isFavorite) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Preferito",
                tint = Color(0xFFE91E63),
                modifier = Modifier.size(16.dp).padding(end = 4.dp)
            )
        }
        
        Text(
            text = name,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isSelected || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        
        count?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.labelMedium,
                color = WaveStreamColors.TextTertiary
            )
        }
    }
}

/**
 * Button for "View All Categories" in sidebar
 */
@Composable
private fun ViewAllCategoriesButton(
    onClick: () -> Unit,
    focusRequester: FocusRequester
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "viewAllBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "viewAllBorder"
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .focusRequester(focusRequester)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // 4-squares icon
        it.wavestream.app.ui.category.FourSquaresIcon(
            modifier = Modifier.size(20.dp),
            color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary
        )
        
        Text(
            text = "Vedi tutte le categorie",
            style = MaterialTheme.typography.bodyMedium,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

/**
 * Dialog for creating a new list
 */
@Composable
private fun CreateListDialog(
    onDismiss: () -> Unit,
    onCreate: (String) -> Unit
) {
    var listName by remember { mutableStateOf("") }
    val nameFocusRequester = remember { FocusRequester() }
    val createFocusRequester = remember { FocusRequester() }

    // Dialog reale (finestra separata): su Android TV l'input di testo funziona solo
    // se il campo ha davvero il focus. Il precedente overlay era un Box nella stessa
    // finestra, quindi il TextField non riceveva mai input: nome vuoto, "Crea" inerte
    // e lista mai creata.
    LaunchedEffect(Unit) {
        nameFocusRequester.requestFocusWhenReady()
    }

    Dialog(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .width(420.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(WaveStreamColors.BackgroundSecondary)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Nuova lista",
                style = MaterialTheme.typography.titleLarge,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Text input: BasicTextField mostra cursore e testo digitato su TV
            val fieldInteraction = remember { MutableInteractionSource() }
            val fieldFocused by fieldInteraction.collectIsFocusedAsState()
            val fieldBorder by animateColorAsState(
                targetValue = if (fieldFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
                label = "listNameBorder"
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(WaveStreamColors.BackgroundTertiary)
                    .border(if (fieldFocused) 2.dp else 1.dp, fieldBorder, RoundedCornerShape(8.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                BasicTextField(
                    value = listName,
                    onValueChange = { listName = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .focusRequester(nameFocusRequester)
                        .wrapContentHeight(Alignment.CenterVertically),
                    textStyle = TextStyle(
                        color = WaveStreamColors.TextPrimary,
                        fontSize = 16.sp
                    ),
                    cursorBrush = SolidColor(WaveStreamColors.Accent),
                    singleLine = true,
                    interactionSource = fieldInteraction,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = { createFocusRequester.requestFocusSafely() }
                    ),
                    decorationBox = { innerTextField ->
                        Box(
                            contentAlignment = Alignment.CenterStart,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            if (listName.isEmpty()) {
                                Text(
                                    text = "Nome della lista",
                                    color = WaveStreamColors.TextTertiary,
                                    fontSize = 16.sp
                                )
                            }
                            innerTextField()
                        }
                    }
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Buttons
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Cancel button
                val cancelInteraction = remember { MutableInteractionSource() }
                val cancelFocused by cancelInteraction.collectIsFocusedAsState()
                val cancelBorder by animateColorAsState(
                    targetValue = if (cancelFocused) Color.White else WaveStreamColors.TextTertiary,
                    label = "cancelBorder"
                )

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (cancelFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent)
                        .border(if (cancelFocused) 2.dp else 1.dp, cancelBorder, RoundedCornerShape(8.dp))
                        .focusable(interactionSource = cancelInteraction)
                        .clickable(
                            interactionSource = cancelInteraction,
                            indication = null,
                            onClick = onDismiss
                        )
                        .padding(horizontal = 24.dp, vertical = 12.dp)
                ) {
                    Text(
                        text = "Annulla",
                        color = WaveStreamColors.TextSecondary
                    )
                }

                // Create button
                val createInteraction = remember { MutableInteractionSource() }
                val createFocused by createInteraction.collectIsFocusedAsState()

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (createFocused) WaveStreamColors.AccentLight else WaveStreamColors.Accent)
                        .border(
                            width = if (createFocused) 2.dp else 0.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .focusRequester(createFocusRequester)
                        .focusable(interactionSource = createInteraction)
                        .clickable(
                            interactionSource = createInteraction,
                            indication = null,
                            onClick = {
                                if (listName.isNotBlank()) {
                                    onCreate(listName.trim())
                                }
                            }
                        )
                        .padding(horizontal = 24.dp, vertical = 12.dp)
                ) {
                    Text(
                        text = "Crea",
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

/**
 * Selettore liste aperto dal pulsante "Aggiungi alla lista" dell'hero.
 *
 * Permette di scegliere una lista esistente (toggle) oppure di crearne una
 * nuova, esattamente come dal dettaglio contenuto. Sostituisce il vecchio
 * toggle automatico che inseriva sempre in "Da guardare".
 */
@Composable
private fun HeroListPickerDialog(
    hero: HeroItem,
    viewModel: HomeViewModel,
    onDismiss: () -> Unit
) {
    var lists by remember { mutableStateOf<List<CustomGroup>>(emptyList()) }
    var selectedIds by remember { mutableStateOf<Set<Long>>(emptySet()) }
    var isLoading by remember { mutableStateOf(true) }
    var showCreate by remember { mutableStateOf(false) }
    var newListName by remember { mutableStateOf("") }
    val newListFocusRequester = remember { FocusRequester() }

    fun reload() {
        viewModel.loadListsForHero(hero) { loadedLists, ids ->
            lists = loadedLists
            selectedIds = ids
            isLoading = false
        }
    }

    LaunchedEffect(hero) { reload() }

    LaunchedEffect(showCreate) {
        if (showCreate) newListFocusRequester.requestFocusWhenReady()
    }

    fun createNewList() {
        if (newListName.isBlank()) return
        val name = newListName.trim()
        newListName = ""
        showCreate = false
        viewModel.createListWithHero(hero, name) { reload() }
    }

    Dialog(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .width(420.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(WaveStreamColors.BackgroundSecondary)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = if (showCreate) "Nuova lista" else "Aggiungi a lista",
                style = MaterialTheme.typography.titleLarge,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            if (showCreate) {
                val fieldInteraction = remember { MutableInteractionSource() }
                val fieldFocused by fieldInteraction.collectIsFocusedAsState()
                val fieldBorder by animateColorAsState(
                    targetValue = if (fieldFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
                    label = "newListBorder"
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(WaveStreamColors.BackgroundTertiary)
                        .border(if (fieldFocused) 2.dp else 1.dp, fieldBorder, RoundedCornerShape(8.dp))
                        .padding(horizontal = 16.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    BasicTextField(
                        value = newListName,
                        onValueChange = { newListName = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .focusRequester(newListFocusRequester)
                            .wrapContentHeight(Alignment.CenterVertically),
                        textStyle = TextStyle(
                            color = WaveStreamColors.TextPrimary,
                            fontSize = 16.sp
                        ),
                        cursorBrush = SolidColor(WaveStreamColors.Accent),
                        singleLine = true,
                        interactionSource = fieldInteraction,
                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                        keyboardActions = KeyboardActions(onDone = { createNewList() }),
                        decorationBox = { innerTextField ->
                            Box(
                                contentAlignment = Alignment.CenterStart,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                if (newListName.isEmpty()) {
                                    Text(
                                        text = "Nome della lista",
                                        color = WaveStreamColors.TextTertiary,
                                        fontSize = 16.sp
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    DialogActionButton(text = "Annulla", primary = false) {
                        newListName = ""
                        showCreate = false
                    }
                    DialogActionButton(text = "Crea", primary = true) { createNewList() }
                }
            } else {
                when {
                    isLoading -> {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(72.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Caricamento...",
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    }
                    lists.isEmpty() -> {
                        Text(
                            text = "Nessuna lista creata",
                            style = MaterialTheme.typography.bodyMedium,
                            color = WaveStreamColors.TextSecondary
                        )
                    }
                    else -> {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(max = 320.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(lists, key = { it.id }) { list ->
                                ListPickerRow(
                                    name = list.name,
                                    isSelected = selectedIds.contains(list.id),
                                    onClick = {
                                        viewModel.toggleHeroInList(hero, list.id) { added ->
                                            selectedIds = if (added) selectedIds + list.id else selectedIds - list.id
                                        }
                                    }
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    DialogActionButton(text = "Nuova lista", primary = false) { showCreate = true }
                    DialogActionButton(text = "Chiudi", primary = true, onClick = onDismiss)
                }
            }
        }
    }
}

/**
 * Riga selezionabile del selettore liste: mostra il nome e la spunta se il
 * contenuto è già presente. Con bordo bianco quando è focalizzata dal D-pad.
 */
@Composable
private fun ListPickerRow(
    name: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val background by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "listRowBg"
    )
    val border by animateColorAsState(
        targetValue = if (isFocused) Color.White else WaveStreamColors.TextTertiary.copy(alpha = 0.5f),
        label = "listRowBorder"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(background)
            .border(if (isFocused) 2.dp else 1.dp, border, RoundedCornerShape(10.dp))
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge,
            color = WaveStreamColors.TextPrimary,
            modifier = Modifier.weight(1f)
        )
        if (isSelected) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = null,
                tint = WaveStreamColors.Accent,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

/**
 * Bottone dei dialog TV: bordo bianco quando focalizzato, pieno per l'azione
 * primaria. Riusabile da CreateListDialog e dal selettore liste.
 */
@Composable
private fun DialogActionButton(
    text: String,
    primary: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val background by animateColorAsState(
        targetValue = when {
            primary && isFocused -> WaveStreamColors.AccentLight
            primary -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> Color.Transparent
        },
        label = "dialogActionBg"
    )
    val border by animateColorAsState(
        targetValue = if (isFocused) Color.White else WaveStreamColors.TextTertiary,
        label = "dialogActionBorder"
    )

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(background)
            .border(if (isFocused) 2.dp else 1.dp, border, RoundedCornerShape(8.dp))
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 24.dp, vertical = 12.dp)
    ) {
        Text(
            text = text,
            color = if (primary) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = if (primary) FontWeight.SemiBold else FontWeight.Normal
        )
    }
}

/**
 * Loading skeleton with shimmer effect (Prime Video style)
 * Shows animated placeholder cards while content loads
 */
@Composable
private fun TabLoadingSkeleton() {
    val infiniteTransition = rememberInfiniteTransition(label = "shimmer")
    
    // Shimmer animation - sweeping highlight
    val shimmerOffset by infiniteTransition.animateFloat(
        initialValue = -1f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "shimmerOffset"
    )
    
    val shimmerBrush = androidx.compose.ui.graphics.Brush.linearGradient(
        colors = listOf(
            WaveStreamColors.BackgroundSecondary,
            WaveStreamColors.BackgroundTertiary.copy(alpha = 0.8f),
            WaveStreamColors.BackgroundSecondary
        ),
        start = androidx.compose.ui.geometry.Offset(shimmerOffset * 1000f, 0f),
        end = androidx.compose.ui.geometry.Offset((shimmerOffset + 1f) * 1000f, 0f)
    )
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
            .padding(top = 80.dp) // Space for top bar
    ) {
        // Hero placeholder
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(horizontal = 48.dp, vertical = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(shimmerBrush)
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // Carousel row placeholders
        repeat(3) { rowIndex ->
            Column(
                modifier = Modifier.padding(horizontal = 48.dp)
            ) {
                // Row title placeholder
                Box(
                    modifier = Modifier
                        .width(150.dp)
                        .height(20.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(shimmerBrush)
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                // Card placeholders row
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    repeat(6) {
                        Box(
                            modifier = Modifier
                                .width(150.dp)
                                .height(225.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(shimmerBrush)
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}


