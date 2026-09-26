package it.wavestream.app.ui.details

import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.PlaylistAdd
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.zIndex
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import it.wavestream.app.R
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.CustomGroup
import it.wavestream.app.data.database.entity.Episode
import it.wavestream.app.data.entity.PersonInfo
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.util.TitleCleaner
import it.wavestream.app.ai.EndingSource
import it.wavestream.app.ai.MovieEnding
import it.wavestream.app.ai.MovieEndingRequest
import it.wavestream.app.ai.MovieEndingUiState
import it.wavestream.app.ai.MovieEndingUnavailableException
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.window.Dialog
import kotlinx.coroutines.launch
import androidx.compose.ui.input.key.*


/**
 * Episode progress info for display
 */
@Immutable
data class EpisodeProgress(
    val episodeId: Long,
    val progress: Float,           // 0f to 1f
    val remainingMinutes: Int,     // Minutes remaining
    val isCompleted: Boolean       // True if watched > 95%
)

/**
 * Details state holder
 */
@Immutable
data class DetailsState(
    val title: String = "",
    val year: String = "",
    val overview: String = "",
    val genres: String = "",
    val duration: String? = null,
    val director: String? = null,
    val cast: String? = null,
    val castPeople: List<it.wavestream.app.data.entity.PersonInfo> = emptyList(),
    val directorPeople: List<it.wavestream.app.data.entity.PersonInfo> = emptyList(),
    val posterUrl: String? = null,
    val backdropUrl: String? = null,
    val logoUrl: String? = null,  // Titolo grafico (clear logo TMDb), null = testo
    val contentType: ContentType = ContentType.MOVIE,
    val isFavorite: Boolean = false,
    val trailerKey: String? = null,
    val isLoading: Boolean = true,
    // Ratings
    val tmdbRating: Float? = null,
    val imdbRating: String? = null,
    val rottenTomatoesScore: Int? = null,
    val metacriticScore: Int? = null,
    val audienceScore: Int? = null,  // Popcornmeter
    // Series specific
    val seasons: List<Int> = emptyList(),
    val selectedSeason: Int = 1,
    val episodes: List<Episode> = emptyList(),
    // Watch progress (for resume button)
    val resumeMinutes: Int? = null,  // Remaining minutes if watching in progress
    val resumeProgress: Float? = null, // 0f to 1f progress
    val resumeEpisodeSeason: Int? = null,  // Season number for series resume
    val resumeEpisodeNumber: Int? = null,  // Episode number for series resume
    // Episode progress map (episodeId -> progress)
    val episodeProgress: Map<Long, EpisodeProgress> = emptyMap(),
    // Next episode info (for "Watch next" button)
    val nextEpisodeInfo: String? = null,  // "S1 E2 - Episode Title"
    val nextEpisodeId: Long? = null,  // Episode ID to play when clicking "Watch next"
    // Custom lists
    val customLists: List<CustomGroup> = emptyList(),
    val selectedListIds: Set<Long> = emptySet(),  // Lists containing this content
    // Download state (for movies)
    val isDownloaded: Boolean = false,
    val isDownloading: Boolean = false,
    val downloadProgress: Int = 0,  // 0-100%
    // Episode download states (episodeId -> EpisodeDownloadState)
    val episodeDownloadStates: Map<Long, EpisodeDownloadState> = emptyMap(),
    // Auto-scroll target: index of the episode to scroll to in the episodes list
    val scrollToEpisodeIndex: Int? = null,
    // Contenuti correlati per il rail "Potrebbe piacerti" (piano L5)
    val relatedContent: List<RelatedContent> = emptyList()
)

/** Voce del rail "Potrebbe piacerti" (piano L5). */
@Immutable
data class RelatedContent(
    val contentId: Long,
    val title: String,
    val posterUrl: String?,
    val contentType: ContentType
)

// State for individual episode downloads
@Immutable
data class EpisodeDownloadState(
    val isDownloaded: Boolean = false,
    val isDownloading: Boolean = false,
    val downloadProgress: Int = 0  // 0-100%
)

/**
 * Details Screen - Shows movie/series/channel details
 * Premium design with backdrop, ratings badges, and episodes list
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DetailsScreen(
    state: DetailsState,
    onBackClick: () -> Unit,
    onPlayClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    onSeasonSelected: (Int) -> Unit,
    onEpisodeClick: (Episode) -> Unit,
    onEpisodeLongClick: (Episode) -> Unit = {},
    onTrailerClick: () -> Unit = {},
    // Custom lists callbacks
    onAddToList: (Long) -> Unit = {},
    onRemoveFromList: (Long) -> Unit = {},
    onCreateList: (String) -> Unit = {},
    onRenameList: (Long, String) -> Unit = { _, _ -> },
    onMarkAsWatchedClick: () -> Unit = {},
    onPersonClick: (personId: Int, personName: String) -> Unit = { _, _ -> },
    onRelatedClick: (contentId: Long, contentType: ContentType) -> Unit = { _, _ -> },
    // Download callbacks
    onDownloadClick: () -> Unit = {},
    onDeleteDownloadClick: () -> Unit = {},
    onDownloadEpisode: (Episode) -> Unit = {},
    onDownloadSeason: (Int) -> Unit = {},  // Season number
    // AI: spiega il finale (solo film). L'attività inietta MovieEndingRepository.
    onExplainEnding: (suspend (MovieEndingRequest) -> MovieEnding)? = null,
    modifier: Modifier = Modifier
) {
    // FocusRequester for automatic focus on Play button
    val playButtonFocusRequester = remember { FocusRequester() }
    // True quando il bottone Riproduci ha DAVVERO il focus (usato dal retry di autofocus)
    var playButtonFocused by remember { mutableStateOf(false) }
    
    // Dialog state for mark as watched confirmation
    var showMarkAsWatchedDialog by remember { mutableStateOf(false) }

    // Stato del popup "finale del film" (AI)
    var endingState by remember { mutableStateOf<MovieEndingUiState>(MovieEndingUiState.Idle) }
    val endingScope = rememberCoroutineScope()

    // Altezze reali (px) misurate a runtime per distribuire lo spazio verticale:
    // il blocco titolo→Cast viene abbassato quando avanza spazio, così non resta
    // un vuoto fra la riga "Cast & Regia" e l'hint "Scorri per i suggerimenti".
    var backRowHeightPx by remember { mutableIntStateOf(0) }
    var topBlockHeightPx by remember { mutableIntStateOf(0) }
    
    // Lazy list state for auto-scroll to current/next episode
    val listState = remember { androidx.tv.foundation.lazy.list.TvLazyListState() }
    // Carosello "Potrebbe piacerti" a SCOMPARSA — RIVELAZIONE RIBALTABILE:
    // c'è SOLO mentre si scorre verso il basso (offset > 0) e sparisce di nuovo
    // tornando in cima, così risalendo su "Riproduci" la scheda torna senza il
    // carosello. Derivato, non latch.
    val relatedRevealed by remember {
        derivedStateOf { listState.firstVisibleItemScrollOffset > 0 }
    }
    // Stati delle due rail con frecce laterali (come l'hero)
    val castRailState = rememberLazyListState()
    val relatedRailState = rememberLazyListState()
    val episodeRailState = rememberLazyListState()
    val railScope = rememberCoroutineScope()
    // Solo redirect D-pad (giù dall'header stagione → primo episodio): NON richiede mai il focus
    val firstEpisodeFocusRequester = remember { FocusRequester() }

    // NOTE: nessun auto-scroll né auto-focus sulla lista episodi all'apertura:
    // la vista resta in alto e il focus va SOLO al bottone Riproduci.
    
    // Request focus on Play button when content loads.
    // RIPROVA finché il bottone non ha davvero il focus: nei primi frame può non essere
    // ancora composto (AnimatedVisibility) o il focus può essere rivendicato da altri elementi.
    LaunchedEffect(state.isLoading) {
        if (!state.isLoading) {
            var attempts = 0
            while (!playButtonFocused && attempts < 20) {
                kotlinx.coroutines.delay(100)
                attempts++
                try {
                    playButtonFocusRequester.requestFocus()
                } catch (e: Exception) {
                    // Bottone non ancora attaccato: riprova al prossimo giro
                }
            }
        }
    }
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Skeleton loader while fetching content
        AnimatedVisibility(
            visible = state.isLoading,
            enter = fadeIn(tween(300)),
            exit = fadeOut(tween(400))
        ) {
            DetailsSkeletonLoader()
        }
        
        // Full content fade-in
        AnimatedVisibility(
            visible = !state.isLoading,
            enter = fadeIn(tween(600)),
            exit = fadeOut(tween(300))
        ) {
            BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                // Distribuzione verticale del blocco titolo→Cast: con contenuti più
                // corti del viewport il blocco resta ancorato in alto e il vuoto si
                // accumula in fondo. Misurando le altezze reali lo si abbassa quanto
                // basta a riservare l'area dell'hint, ma mai sopra i 32dp storici.
                val verticalDensity = LocalDensity.current
                val backRowDp = with(verticalDensity) { backRowHeightPx.toDp() }
                val topBlockDp = with(verticalDensity) { topBlockHeightPx.toDp() }
                // Adattivo solo dove NON c'è la sezione episodi: nelle serie il
                // carosello sotto il blocco deve restare subito visibile, quindi
                // si mantiene lo spazio storico di 32dp.
                val hasEpisodesSection = state.contentType == ContentType.SERIES && state.seasons.isNotEmpty()
                val topSpacing = if (!hasEpisodesSection && backRowHeightPx > 0 && topBlockHeightPx > 0) {
                    (maxHeight - backRowDp - topBlockDp - 56.dp).coerceIn(32.dp, 96.dp)
                } else {
                    32.dp
                }
        // Backdrop image - FULLSCREEN, shifted RIGHT
        if (!state.backdropUrl.isNullOrEmpty()) {
            AsyncImage(
                model = coil.request.ImageRequest.Builder(androidx.compose.ui.platform.LocalContext.current)
                    .data(state.backdropUrl)
                    .size(1920, 1080)
                    .crossfade(true)
                    .diskCachePolicy(coil.request.CachePolicy.ENABLED)
                    .memoryCachePolicy(coil.request.CachePolicy.ENABLED)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            )
            
            // Scrim VERTICALE: sostituisce lo scrim orizzontale (che rendeva il
            // lato sinistro più scuro del destro, incompatibile con un testo centrato)
            // e il gradiente top. Il backdrop resta visibile in alto e sfuma nel
            // grigio scuro/nero scendendo verso il basso, come da specifica. Il
            // blocco centrato titolo/info/ratings cade intorno al 45% dell'altezza,
            // dove l'alpha è già ~0.65.
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                WaveStreamColors.BackgroundDark.copy(alpha = 0.35f),
                                WaveStreamColors.BackgroundDark.copy(alpha = 0.20f),
                                WaveStreamColors.BackgroundDark.copy(alpha = 0.45f),
                                WaveStreamColors.BackgroundDark.copy(alpha = 0.78f),
                                WaveStreamColors.BackgroundDark.copy(alpha = 0.93f),
                                WaveStreamColors.BackgroundDark,
                                WaveStreamColors.BackgroundDark
                            )
                        )
                    )
            )
            // Vertical gradient at BOTTOM for cast/director readability
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .align(Alignment.BottomCenter)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                WaveStreamColors.BackgroundDark.copy(alpha = 0.8f),
                                WaveStreamColors.BackgroundDark
                            )
                        )
                    )
            )
        }
        
        // Content — CENTRATO su tutta la larghezza (nuovo layout "billboard").
        // TvLazyColumn resta per lo scroll D-pad e per gli episodi.
        androidx.tv.foundation.lazy.list.TvLazyColumn(
            state = listState,
            contentPadding = androidx.compose.foundation.layout.PaddingValues(top = 8.dp),
            pivotOffsets = androidx.tv.foundation.PivotOffsets(parentFraction = 0.6f),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            // Top content block — tutto centrato sull'asse dello schermo
            item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Il back resta in alto a SINISTRA: è un controllo di navigazione,
                // non fa parte del contenuto centrato.
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onSizeChanged { backRowHeightPx = it.height },
                    horizontalArrangement = Arrangement.Start
                ) {
                    DetailsTopBar(
                        onBackClick = onBackClick,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
                
                // Spazio superiore adattivo (vedi topSpacing): abbassa tutto il
                // blocco titolo→Cast quando il contenuto è più corto del viewport.
                Spacer(modifier = Modifier.height(topSpacing))
                
                // Contenuto centrato
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onSizeChanged { if (!relatedRevealed) topBlockHeightPx = it.height }
                        .animateContentSize(
                            animationSpec = tween(durationMillis = 400)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Title: clear logo TMDb se disponibile, altrimenti testo di sistema
                    if (!state.logoUrl.isNullOrEmpty()) {
                        AsyncImage(
                            model = state.logoUrl,
                            contentDescription = state.title,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .heightIn(max = 48.dp)
                                .widthIn(max = 300.dp)
                        )
                    } else {
                        Text(
                            text = state.title,
                            style = MaterialTheme.typography.displaySmall,
                            color = WaveStreamColors.TextPrimary,
                            fontWeight = FontWeight.Bold,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // META su una sola riga: anno · durata · generi.
                    // La durata era una riga separata e "Valutazioni" era un heading
                    // ridondante: entrambi spariscono e la colonna guadagna due righe
                    // verticali. Ordine NON casuale: il chip sta SUBITO dopo l'anno,
                    // nella zona sinistra ancora scura — appoggiato in coda alla riga dei
                    // generi finiva sull'arte chiara del backdrop e diventava illeggibile.
                    // I generi sono l'unico elemento che può accorciarsi (ellissi).
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        if (state.year.isNotEmpty()) {
                            Text(
                                text = state.year,
                                style = MaterialTheme.typography.bodyMedium,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                        
                        state.duration?.let { duration ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(percent = 50))
                                    .background(GlassTokens.SurfaceFillStrong)
                                    .border(
                                        width = 1.dp,
                                        brush = GlassTokens.StrokeGradient,
                                        shape = RoundedCornerShape(percent = 50)
                                    )
                                    .padding(horizontal = 10.dp, vertical = 1.dp)
                            ) {
                                Text(
                                    text = "⏱ ${formatDurationInHours(duration)}",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = WaveStreamColors.TextPrimary,
                                    maxLines = 1
                                )
                            }
                        }
                        
                        if (state.genres.isNotEmpty()) {
                            Text(
                                text = state.genres,
                                style = MaterialTheme.typography.bodyMedium,
                                color = WaveStreamColors.TextSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                    
                    // Rating: striscia inline, NESSUN heading. FlowRow resta volutamente
                    // flessibile in altezza: su schermi stretti va a capo invece di
                    // tagliare l'ultimo badge (era già la ragione della scelta).
                    Spacer(modifier = Modifier.height(12.dp))
                    RatingsBadges(
                        tmdbRating = state.tmdbRating,
                        imdbRating = state.imdbRating,
                        rottenTomatoesScore = state.rottenTomatoesScore,
                        metacriticScore = state.metacriticScore,
                        audienceScore = state.audienceScore
                    )
                    
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    // Azioni: CENTRATE e SOLO ICONA (come da specifica: "sotto i
                    // ratings ... i bottoni, senza il nome"). Con le sole icone le 7
                    // azioni entrano comode in una riga: niente scroll.
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Play button - compatto: etichetta breve + badge SxEy ridotto
                        // accanto al testo, così il bottone non si allarga e non schiaccia
                        // gli altri pulsanti della riga (trailer, preferiti, liste...).
                        val episodeBadgeRegex = remember { Regex("S\\d+E\\d+") }
                        val nextEpisodeBadge = state.nextEpisodeInfo?.let { episodeBadgeRegex.find(it)?.value }
                        val resumeBadge = run {
                            // Codice episodio corrente SEMPRE visibile nel bottone
                            // (incluso S1E1: l'utente vuole vedere l'episodio in corso)
                            if (state.resumeEpisodeSeason != null && state.resumeEpisodeNumber != null) {
                                "S${state.resumeEpisodeSeason}E${state.resumeEpisodeNumber}"
                            } else null
                        }
                        val seriesBadge = if (state.contentType == ContentType.SERIES) {
                            // Serie mai iniziata: primo episodio della stagione selezionata (S1E1).
                            // Con episodi non ancora caricati (sync in corso) mostri comunque S1E1 come default.
                            state.episodes.minByOrNull { it.episodeNumber }
                                ?.let { "S${it.seasonNumber}E${it.episodeNumber}" } ?: "S1E1"
                        } else null
                        PlayButton(
                            text = when {
                                // If there's a next episode to watch (previous completed)
                                state.nextEpisodeInfo != null -> stringResource(R.string.play)
                                // If there's watch progress, show resume with S/E info only.
                                state.resumeMinutes != null -> "Riprendi"
                                state.contentType == ContentType.CHANNEL -> stringResource(R.string.watch_live)
                                else -> stringResource(R.string.play)
                            },
                            badge = when {
                                state.nextEpisodeInfo != null -> nextEpisodeBadge
                                state.resumeMinutes != null -> resumeBadge
                                state.contentType == ContentType.SERIES -> seriesBadge
                                else -> null
                            },
                            // Use white button for resume/next episode states
                            isResume = state.resumeMinutes != null || state.nextEpisodeInfo != null,
                            resumeProgress = state.resumeProgress,
                            onClick = onPlayClick,
                            focusRequester = playButtonFocusRequester,
                            onFocusedChanged = { playButtonFocused = it }
                        )
                        
                        // Trailer button
                        if (state.trailerKey != null) {
                            TrailerButton(
                                onClick = onTrailerClick
                            )
                        }
                        
                        // Favorite button
                        FavoriteButton(
                            isFavorite = state.isFavorite,
                            onClick = onFavoriteClick
                        )
                        
                        // Add to list button
                        AddToListButton(
                            customLists = state.customLists,
                            selectedListIds = state.selectedListIds,
                            onAddToList = onAddToList,
                            onRemoveFromList = onRemoveFromList,
                            onCreateList = onCreateList,
                            onRenameList = onRenameList
                        )
                        
                        // AI: spiega il finale (solo film)
                        if (state.contentType == ContentType.MOVIE && onExplainEnding != null) {
                            ExplainEndingButton(
                                onClick = {
                                    onExplainEnding?.let { fetch ->
                                        endingState = MovieEndingUiState.Loading
                                        endingScope.launch {
                                            val request = MovieEndingRequest(
                                                title = state.title,
                                                year = state.year,
                                                director = state.director,
                                                cast = state.cast,
                                                genres = state.genres,
                                                overview = state.overview
                                            )
                                            endingState = try {
                                                MovieEndingUiState.Success(fetch(request))
                                            } catch (e: MovieEndingUnavailableException) {
                                                MovieEndingUiState.Error(
                                                    e.message ?: "Informazioni non disponibili."
                                                )
                                            } catch (e: Exception) {
                                                MovieEndingUiState.Error(
                                                    "Impossibile recuperare la spiegazione. " +
                                                        "Controlla la connessione e la chiave OpenRouter nelle impostazioni."
                                                )
                                            }
                                        }
                                    }
                                }
                            )
                        }
                        
                        // Mark as watched button (only for content with progress)
                        if (state.resumeMinutes != null) {
                            MarkAsWatchedButton(
                                onClick = { showMarkAsWatchedDialog = true }
                            )
                        }
                        
                        // Download button (only for movies, not series)
                        if (state.contentType == ContentType.MOVIE) {
                            DownloadButton(
                                isDownloaded = state.isDownloaded,
                                isDownloading = state.isDownloading,
                                downloadProgress = state.downloadProgress,
                                onDownloadClick = onDownloadClick,
                                onDeleteClick = onDeleteDownloadClick
                            )
                        }
                    }
                    
                    // Mark as watched confirmation dialog
                    if (showMarkAsWatchedDialog) {
                        AlertDialog(
                            onDismissRequest = { showMarkAsWatchedDialog = false },
                            title = { Text("Conferma") },
                            text = { Text("Sei sicuro di eliminare il contenuto dai \"Continua a guardare\"?") },
                            confirmButton = {
                                TextButton(
                                    onClick = {
                                        showMarkAsWatchedDialog = false
                                        onMarkAsWatchedClick()
                                    }
                                ) {
                                    Text("Sì", color = WaveStreamColors.Accent)
                                }
                            },
                            dismissButton = {
                                TextButton(onClick = { showMarkAsWatchedDialog = false }) {
                                    Text("Annulla", color = WaveStreamColors.TextSecondary)
                                }
                            },
                            containerColor = WaveStreamColors.BackgroundSecondary,
                            titleContentColor = WaveStreamColors.TextPrimary,
                            textContentColor = WaveStreamColors.TextSecondary
                        )
                    }

                    // Popup "finale del film" (AI)
                    if (endingState != MovieEndingUiState.Idle) {
                        EndingDialog(
                            state = endingState,
                            onDismiss = { endingState = MovieEndingUiState.Idle }
                        )
                    }
                    
                    // Remaining time text below buttons (for resume state)
                    if (state.resumeMinutes != null) {
                        val remainingText = when {
                            state.resumeMinutes <= 0 -> "Pochi minuti rimasti"
                            state.resumeMinutes >= 60 -> {
                                val hours = state.resumeMinutes / 60
                                val mins = state.resumeMinutes % 60
                                if (mins > 0) "${hours}h ${mins}min rimasti" else "${hours}h rimaste"
                            }
                            else -> "${state.resumeMinutes} min rimasti"
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = remainingText,
                            style = MaterialTheme.typography.bodyMedium,
                            color = WaveStreamColors.TextTertiary,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // 1. Overview (Trama) — corpo RIDOTTO (19sp → 14sp) e testo SEMPRE
                    // per intero: niente "Leggi di più" (rev. §0/§2).
                    if (state.overview.isNotEmpty()) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = state.overview,
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontSize = 12.sp,
                                    lineHeight = 17.sp
                                ),
                                color = WaveStreamColors.TextSecondary,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    
                    // NOTA: "Potrebbe piacerti" NON è più qui: era inserito SOPRA
                    // "Cast & Regia" e, svelato durante lo scroll, spostava il layout
                    // facendolo comparire sopra il cast. Ora è una item a parte in
                    // fondo alla pagina (sotto cast ed episodi).

                    // ULTIMA RIGA: CAST E REGIA SULLA STESSA RIGA, centrati
                    // (chiarimento della specifica). La regia apre la riga, il cast
                    // la segue: un solo heading, una sola riga orizzontale.
                    // Deduplica per persona: nel crew TMDB la stessa persona
                    // compare UNA VOLTA PER RUOLO (es. "Christophe…" = Director +
                    // Writer + Producer → 3 card identiche). Il "Director" va per
                    // primo e distinctBy tiene la prima occorrenza, così anche un
                    // attore che è anche nella crew non genera una seconda card.
                    val crew = (
                        state.directorPeople.sortedBy { p ->
                            if (p.job.equals("Director", ignoreCase = true)) 0 else 1
                        } + state.castPeople
                    ).distinctBy { it.id }
                    if (crew.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Cast & Regia",
                            style = MaterialTheme.typography.titleMedium,
                            color = WaveStreamColors.TextSecondary,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        RailRow(
                            listState = castRailState,
                            onScroll = { forward ->
                                railScope.launch {
                                    castRailState.animateScrollToItem(
                                        (castRailState.firstVisibleItemIndex + if (forward) 3 else -3)
                                            .coerceAtLeast(0)
                                    )
                                }
                            }
                        ) {
                            LazyRow(
                                state = castRailState,
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                items(crew.size) { index ->
                                    val person = crew[index]
                                    CastPersonCard(
                                        person = person,
                                        onClick = { onPersonClick(person.id, person.name) }
                                    )
                                }
                            }
                        }
                    } else {
                        // Nessun dato strutturato: due righe di testo, sempre centrate
                        state.director?.let {
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Regia: $it",
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextSecondary,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        state.cast?.let {
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Cast: $it",
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextTertiary,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }
            }
            
            }  // end of top content item
            
            // Episodes section (for series) - inlined into TvLazyColumn
            if (state.contentType == ContentType.SERIES && state.seasons.isNotEmpty()) {
                // Season selector as its own item
                item {
                    Spacer(modifier = Modifier.height(40.dp))
                    EpisodesSectionHeader(
                        seasons = state.seasons,
                        selectedSeason = state.selectedSeason,
                        onSeasonSelected = onSeasonSelected,
                        onDownloadSeason = onDownloadSeason,
                        // Passa il requester solo se ci sono episodi: il redirect "giù" verso un
                        // FocusRequester non attaccato a nessun composable crasha l'app.
                        firstEpisodeFocusRequester = if (state.episodes.isNotEmpty()) firstEpisodeFocusRequester else null,
                        // "su" dall'header stagione deve tornare al bottone Riproduci
                        upFocusRequester = playButtonFocusRequester
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                }

                // Carosello episodi: gli episodi scorrono orizzontalmente come le
                // rail di cast e suggerimenti, invece della vecchia lista verticale.
                // Le frecce di RailRow e il D-pad sinistra/destra scorrono la rail.
                item {
                    Spacer(modifier = Modifier.height(8.dp))
                    RailRow(
                        listState = episodeRailState,
                        onScroll = { forward ->
                            railScope.launch {
                                episodeRailState.animateScrollToItem(
                                    (episodeRailState.firstVisibleItemIndex + if (forward) 2 else -2)
                                        .coerceAtLeast(0)
                                )
                            }
                        }
                    ) {
                        LazyRow(
                            state = episodeRailState,
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(state.episodes.size, key = { state.episodes[it].id }) { index ->
                                val episode = state.episodes[index]
                                EpisodeCarouselCard(
                                    episode = episode,
                                    progress = state.episodeProgress[episode.id],
                                    downloadState = state.episodeDownloadStates[episode.id],
                                    seriesName = state.title,
                                    // Il requester DEVE restare attaccato alla PRIMA card:
                                    // è il destinatario del redirect D-pad "giù" dall'header stagione.
                                    cardFocusRequester = if (index == 0) firstEpisodeFocusRequester else null,
                                    // Dal primo episodio, "su" deve andare al bottone Riproduci,
                                    // NON al bottone indietro in alto a sinistra.
                                    upFocusRequester = if (index == 0) playButtonFocusRequester else null,
                                    onClick = { onEpisodeClick(episode) },
                                    onLongClick = { onEpisodeLongClick(episode) },
                                    onDownloadClick = { onDownloadEpisode(episode) }
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
            
            // "Potrebbe piacerti" — carosello a SCOMPARSA, ORA IN FONDO alla pagina:
            // si svela solo dopo aver iniziato a scorrere e resta sotto cast, trama
            // ed episodi. Prima veniva inserito sopra "Cast & Regia", quindi durante
            // lo scroll spostava il layout e compariva sopra il cast.
            item {
                AnimatedVisibility(
                    visible = relatedRevealed && state.relatedContent.isNotEmpty(),
                    enter = fadeIn(tween(300)) +
                        slideInVertically(animationSpec = tween(340)) { it / 4 },
                    exit = fadeOut(tween(220))
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = "Potrebbe piacerti",
                            style = MaterialTheme.typography.titleMedium,
                            color = WaveStreamColors.TextSecondary,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        RailRow(
                            listState = relatedRailState,
                            onScroll = { forward ->
                                railScope.launch {
                                    relatedRailState.animateScrollToItem(
                                        (relatedRailState.firstVisibleItemIndex + if (forward) 3 else -3)
                                            .coerceAtLeast(0)
                                    )
                                }
                            }
                        ) {
                            LazyRow(
                                state = relatedRailState,
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                items(state.relatedContent.size) { index ->
                                    val related = state.relatedContent[index]
                                    RelatedContentCard(
                                        related = related,
                                        onClick = { onRelatedClick(related.contentId, related.contentType) }
                                    )
                                }
                            }
                        }
                    }
                }
            }

            item {
                // Spazio di scorrimento: SENZA questa coda la pagina entra tutta,
                // l'offset resta a 0 e il carosello a scomparsa non si attiverebbe
                // mai. Serve solo se ci sono suggerimenti da rivelare.
                Spacer(
                    modifier = Modifier.height(
                        // Coda di scorrimento: consente di portare in alto il carosello
                        // episodi (col titolo + trama sotto) senza che la trama venga
                        // tagliata dal bordo inferiore, anche senza suggerimenti.
                        if (state.relatedContent.isNotEmpty()) 220.dp else 170.dp
                    )
                )
            }
    }
            
            // Scroll hint in basso: freccia verso il basso che invita a scorrere per
            // i suggerimenti. Sparisce appena l'utente scorre (relatedRevealed), cioè
            // nel momento stesso in cui il carosello a scomparsa si svela.
            AnimatedVisibility(
                visible = !relatedRevealed && state.relatedContent.isNotEmpty(),
                enter = fadeIn(tween(300)),
                exit = fadeOut(tween(220)),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 10.dp)
            ) {
                val hintBob by rememberInfiniteTransition(label = "scrollHint").animateFloat(
                    initialValue = 0f,
                    targetValue = 8f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(900),
                        repeatMode = RepeatMode.Reverse
                    ),
                    label = "scrollHintBob"
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .offset(y = hintBob.dp)
                        .clip(RoundedCornerShape(999.dp))
                        .background(GlassTokens.SurfaceFillStrong)
                        .border(1.dp, GlassTokens.StrokeGradient, RoundedCornerShape(999.dp))
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Scorri per i suggerimenti",
                        style = MaterialTheme.typography.labelMedium,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null,
                        tint = WaveStreamColors.Accent,
                        modifier = Modifier.size(15.dp)
                    )
                }
            }
    }  // end inner Box (AnimatedVisibility content)
    }  // end AnimatedVisibility
}  // end Box
}  // end DetailsScreen

/**
 * Top bar with back button
 */
@Composable
private fun DetailsTopBar(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "backScale"
    )

    // Fase D1 — top bar flottante in vetro: capsula con back, focus ad alone.
    // Prima era una capsula a tinta piena col bordo netto, staccata dall'hero.
    val fill by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill,
        label = "topBarFill"
    )

    Row(modifier = modifier) {
        GlassSurface(
            shape = CircleShape,
            fill = fill,
            modifier = Modifier
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                }
                .size(40.dp)
                .focusable(interactionSource = interactionSource)
                .clickable(
                    interactionSource = interactionSource,
                    indication = null,
                    onClick = onBackClick
                )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = WaveStreamColors.TextPrimary,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

/**
 * Freccia di scorrimento per le rail, nello stile dell'hero (cerchio, accent sul
 * focus). Fa da INDICATORE e da comando e, stando ai bordi, lascia spazio laterale
 * ai contenuti come richiesto. Difettosa quando non c'è nulla da scorrere.
 */
@Composable
private fun RailArrow(
    isLeft: Boolean,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "railArrowScale"
    )
    val backgroundColor by animateColorAsState(
        targetValue = when {
            !enabled -> Color.Transparent
            isFocused -> WaveStreamColors.Accent
            else -> WaveStreamColors.BackgroundSecondary.copy(alpha = 0.6f)
        },
        animationSpec = tween(150),
        label = "railArrowBg"
    )

    Box(
        modifier = modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(40.dp)
            .clip(CircleShape)
            .border(
                2.dp,
                if (isFocused && enabled) WaveStreamColors.Accent else Color.Transparent,
                CircleShape
            )
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isLeft) Icons.Default.ChevronLeft else Icons.Default.ChevronRight,
            contentDescription = if (isLeft) "Scorri indietro" else "Scorri avanti",
            tint = if (enabled) WaveStreamColors.TextPrimary else WaveStreamColors.TextTertiary,
            modifier = Modifier.size(26.dp)
        )
    }
}

/**
 * Riga scorrevole con le frecce ai bordi: il contenuto non tocca mai i bordi e
 * resta spazio laterale (armonia visiva). Le frecce scorrono di 3 item alla volta.
 */
@Composable
private fun RailRow(
    listState: LazyListState,
    onScroll: (forward: Boolean) -> Unit,
    content: @Composable () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RailArrow(
            isLeft = true,
            enabled = listState.canScrollBackward,
            onClick = { onScroll(false) }
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 12.dp)
        ) {
            content()
        }
        RailArrow(
            isLeft = false,
            enabled = listState.canScrollForward,
            onClick = { onScroll(true) }
        )
    }
}

/**
 * Card di un contenuto correlato — rail "Potrebbe piacerti" (piano L5).
 * Poster 2:3 (132×198dp) + titolo su due righe, con alone di focus.
 */
@Composable
private fun RelatedContentCard(
    related: RelatedContent,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "relatedScale"
    )
    val ring by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.35f) else Color.Transparent,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "relatedRing"
    )

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .width(104.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
        AsyncImage(
            model = coil.request.ImageRequest.Builder(
                androidx.compose.ui.platform.LocalContext.current
            )
                .data(related.posterUrl)
                .size(104, 156)
                .crossfade(true)
                .build(),
            contentDescription = related.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(156.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(2.dp, ring, RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = related.title,
            style = MaterialTheme.typography.bodyMedium,
            color = WaveStreamColors.TextPrimary,
            fontWeight = FontWeight.Medium,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

/**
 * Cast person card — clickable circular photo with name + role
 */
@Composable
private fun CastPersonCard(
    person: PersonInfo,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "castScale"
    )

    // Card persona in vetro (Fase D5): cerchio foto + focus ad alone.
    val cardFill by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else Color.Transparent,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "castFill"
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .width(64.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(14.dp))
            .background(cardFill)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(4.dp)
    ) {
        // Profile photo
        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(CircleShape)
                .background(WaveStreamColors.BackgroundTertiary)
        ) {
            person.profileUrl?.let { url ->
                AsyncImage(
                    model = url,
                    contentDescription = person.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            // Fallback: show initial letter
            if (person.profileUrl == null) {
                Text(
                    text = person.name.firstOrNull()?.uppercase() ?: "?",
                    style = MaterialTheme.typography.titleMedium,
                    color = WaveStreamColors.TextSecondary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        // Nome e cognome su DUE RIGHE separate (come da specifica).
        val nameParts = remember(person.name) { person.name.trim().split(Regex("\\s+")) }
        Text(
            text = nameParts.firstOrNull().orEmpty().ifBlank { person.name },
            style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
            fontWeight = FontWeight.SemiBold,
            color = WaveStreamColors.TextPrimary,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        if (nameParts.size > 1) {
            Text(
                text = nameParts.drop(1).joinToString(" "),
                style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                fontWeight = FontWeight.SemiBold,
                color = WaveStreamColors.TextPrimary,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        // Ruolo/interpretazione: leggermente più piccolo del nome (10sp → 9sp)
        person.roleLabel?.let { role ->
            Text(
                text = role,
                style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.sp),
                color = WaveStreamColors.TextTertiary,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

/**
 * Ratings row - Badge ovali semi-trasparenti con icona + valore inline.
 * Stile pill glass coerente col design dell'app. IMDb resta il badge primario
 * (fallback N/A), gli altri appaiono se il dato c'è.
 */
@Composable
@OptIn(ExperimentalLayoutApi::class)
private fun RatingsBadges(
    tmdbRating: Float?,
    imdbRating: String?,
    rottenTomatoesScore: Int?,
    metacriticScore: Int?,
    audienceScore: Int? = null,
    imdbVotes: String? = null,
    tmdbVotes: String? = null
) {
    // FlowRow (era Row): con 5 badge la riga può superare la larghezza disponibile
    // e l'ultimo veniva tagliato sul lato destro. Ora va a capo invece di essere
    // tagliato — sulle TV larghe resta comunque su una riga sola.
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
        verticalArrangement = Arrangement.spacedBy(6.dp),
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
    ) {
        if (imdbRating != null) {
            ModernRatingItem(
                iconResId = R.drawable.imdb_logo,
                value = imdbRating
            )
        } else {
            ModernRatingItem(
                iconResId = R.drawable.imdb_na,
                value = "N/A"
            )
        }

        rottenTomatoesScore?.let { rtScore ->
            val isFresh = rtScore >= 60
            ModernRatingItem(
                iconResId = if (isFresh) R.drawable.rotten_tomatoes_logo else R.drawable.rotten_tomatoes_rotten,
                value = "$rtScore%"
            )
        }

        audienceScore?.let { audScore ->
            val isFresh = audScore >= 60
            ModernRatingItem(
                iconResId = if (isFresh) R.drawable.popcornmeter_fresh else R.drawable.popcornmeter_rotten,
                value = "$audScore%"
            )
        }

        metacriticScore?.let { metaScore ->
            ModernRatingItem(
                iconResId = R.drawable.metacritic_logo,
                value = "$metaScore"
            )
        }

        if (tmdbRating != null && tmdbRating > 0) {
            ModernRatingItem(
                iconResId = R.drawable.tmdb_logo,
                value = String.format("%.1f", tmdbRating)
            )
        }
    }
}

/**
 * Badge ovale semi-trasparente: icona + valore inline, stile pill glass.
 */
@Composable
private fun ModernRatingItem(
    iconResId: Int,
    value: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        modifier = Modifier
            .clip(RoundedCornerShape(percent = 50))
            .background(GlassTokens.SurfaceFillStrong)
            .border(
                width = 1.dp,
                brush = GlassTokens.StrokeGradient,
                shape = RoundedCornerShape(percent = 50)
            )
            // Compattati (era 14/8 con icona 22dp e testo titleMedium): 5 badge
            // ora stanno in riga senza toccare il bordo destro.
            .padding(horizontal = 10.dp, vertical = 6.dp)
    ) {
        Image(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            modifier = Modifier.size(18.dp),
            contentScale = ContentScale.Fit
        )
        Text(
            text = value,
            style = MaterialTheme.typography.titleSmall,
            color = WaveStreamColors.TextPrimary,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            softWrap = false
        )
    }
}

/**
 * Forma dei pulsanti azione della scheda: cerchio se c'è solo l'icona, pill se
 * c'è anche l'etichetta (piano L2 — ogni azione deve essere leggibile da 3 m).
 */
private fun actionShape(label: String?) =
    if (label != null) RoundedCornerShape(26.dp) else CircleShape

/**
 * Durata in ore/minuti per la riga informativa (es. "2h 24m"), come da specifica
 * del nuovo layout centrato. Accetta sia "144 min" (tmdbRuntime) sia "01:31:19"
 * (Xtream): se il formato non è riconosciuto restituisce il testo invariato.
 */
private fun formatDurationInHours(raw: String?): String {
    val value = raw?.trim().orEmpty()
    if (value.isEmpty()) return value

    Regex("""^(\d{1,2}):(\d{2}):(\d{2})$""").find(value)?.let { m ->
        val h = m.groupValues[1].toInt()
        val min = m.groupValues[2].toInt()
        return if (h > 0) "${h}h ${min}m" else "${min}m"
    }

    val minutes = Regex("""^(\d+)\s*min""").find(value)?.groupValues?.get(1)?.toIntOrNull()
        ?: value.toIntOrNull()
    if (minutes != null && minutes > 0) {
        val h = minutes / 60
        val min = minutes % 60
        return if (h > 0) "${h}h ${min}m" else "${min}m"
    }
    return value
}

/**
 * Contenuto dei pulsanti azione. Con [label] disegna "icona + testo" (pill);
 * senza mantiene l'icona circolare di prima.
 */
@Composable
private fun ActionBody(label: String?, tint: Color, icon: @Composable () -> Unit) {
    if (label == null) {
        icon()
        return
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        icon()
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = label,
            // 15sp: sotto questo valore non si legge da divano (piano L2, §5)
            style = MaterialTheme.typography.bodyLarge,
            color = tint,
            fontWeight = FontWeight.Medium,
            maxLines = 1
        )
    }
}

/**
 * Primary play button with optional progress bar for resume state
 */
@Composable
private fun PlayButton(
    text: String,
    badge: String? = null,
    isResume: Boolean = false,
    resumeProgress: Float? = null,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null,
    onFocusedChanged: (Boolean) -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,  // uniforme con la famiglia azioni
        animationSpec = AppAnimations.SpringCardFocus,
        label = "playScale"
    )
    
    // Ring di focus ACCENT, 3dp — coerente con l'hero di TvHomeScreen (stesso
    // trattamento per la CTA primaria). Sul bottone in fase "resume" (sfondo
    // bianco) e su quello normale (AccentLight, più chiaro) l'accent resta sempre
    // distinto.
    // ⚠️ Il border DEVE stare DOPO .background(): `border` disegna DIETRO il
    // riempimento, quindi messo prima veniva coperto e il ring non appariva.
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "playBorder"
    )
    
    // Use white background for resume/next episode states, purple for normal play
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isResume && isFocused -> Color.White.copy(alpha = 0.9f)
            isResume -> Color.White
            isFocused -> WaveStreamColors.AccentLight
            else -> WaveStreamColors.Accent
        },
        label = "playBg"
    )
    
    val contentColor = if (isResume) Color.Black else WaveStreamColors.TextPrimary
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .widthIn(min = if (badge != null) 124.dp else 116.dp)
            // Altezza UNIFORME: il CTA non deve "saltare" quando cambia il badge.
            .height(48.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            // DOPO background: vedi nota su borderColor
            .border(3.dp, borderColor, RoundedCornerShape(12.dp))
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .onFocusChanged { onFocusedChanged(it.isFocused) }
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        // Il CTA È la barra di avanzamento: si riempie da sinistra di accent al 40% sul
        // bianco del pulsante, in base a quanto visto (stesso pattern dell'hero in
        // TvHomeScreen). Dichiarato PRIMA del contenuto: resta dietro a testo e badge.
        // matchParentSize: non entra nelle misure del bottone (widthIn + wrap content).
        if (isResume) {
            val effectiveProgress = (resumeProgress ?: 0.1f).coerceIn(0.05f, 1f)
            Box(modifier = Modifier.matchParentSize()) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(effectiveProgress)
                        .background(WaveStreamColors.Accent.copy(alpha = 0.40f))
                )
            }
        }
        if (badge != null) {
            // Layout verticale: etichetta principale in alto e codice episodio
            // (SxEy) subito sotto, in piccolo — entrambi DENTRO il box del bottone.
            // Mantiene il pulsante compatto in larghezza.
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = 20.dp).padding(top = 2.dp, bottom = 6.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = contentColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = text,
                        style = MaterialTheme.typography.labelLarge,
                        color = contentColor,
                        fontWeight = FontWeight.SemiBold,
                        maxLines = 1
                    )
                }
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = badge,
                    // labelSmall (10sp) al 70% di alpha era sotto il minimo leggibile
                    // su TV: 11sp a pieno contrasto (regola §5 del piano di layout).
                    style = MaterialTheme.typography.labelMedium,
                    color = contentColor.copy(alpha = 0.9f),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
            }
        } else {
            // Button content (senza badge): icona + testo su una sola riga
            Row(
                modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null,
                    tint = contentColor,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = text,
                    style = MaterialTheme.typography.labelLarge,
                    color = contentColor,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1
                )
            }
        }
        
    }
}

/**
 * Pulsante AI per farsi spiegare il finale del film.
 * Usa l'icona di Nova ma è indipendente dalla feature Nova (che resta in pausa).
 */
@Composable
private fun ExplainEndingButton(onClick: () -> Unit, label: String? = null) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "endingScale"
    )
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "endingBg"
    )
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.30f) else Color.White.copy(alpha = 0.10f),
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "endingBorder"
    )
    val iconColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "endingIcon"
    )

    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .then(if (label != null) Modifier.height(44.dp) else Modifier.size(44.dp))
            .clip(actionShape(label))
            .background(backgroundColor)
            .border(1.dp, borderColor, actionShape(label))
            .then(if (label != null) Modifier.padding(horizontal = 14.dp) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        ActionBody(label = label, tint = iconColor) {
            Icon(
                imageVector = Icons.Default.AutoAwesome,
                contentDescription = "Spiega il finale con l'AI",
                tint = iconColor,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

/**
 * Popup che mostra la spiegazione del finale (Wikipedia + AI oppure solo AI).
 */
@Composable
private fun EndingDialog(
    state: MovieEndingUiState,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val closeFocusRequester = remember { FocusRequester() }

    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(150)
        runCatching { closeFocusRequester.requestFocus() }
    }

    Dialog(onDismissRequest = onDismiss) {
        // Fase D6 — pannello in vetro (fill semitrasparente + bordo a gradiente),
        // niente rettangolo a tinta piena col bordo netto.
        GlassSurface(
            shape = RoundedCornerShape(20.dp),
            fill = GlassTokens.SurfaceFillStrong,
            modifier = Modifier.width(760.dp)
        ) {
            Column(modifier = Modifier.padding(28.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.AutoAwesome,
                        contentDescription = null,
                        tint = WaveStreamColors.Accent,
                        modifier = Modifier.size(26.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Come finisce il film",
                        style = MaterialTheme.typography.headlineSmall,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                when (state) {
                    MovieEndingUiState.Idle -> Unit
                    MovieEndingUiState.Loading -> {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            CircularProgressIndicator(
                                color = WaveStreamColors.Accent,
                                strokeWidth = 3.dp,
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(14.dp))
                            Text(
                                text = "Cerco la trama su Wikipedia e preparo la spiegazione…",
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextSecondary
                            )
                        }
                    }
                    is MovieEndingUiState.Error -> {
                        Text(
                            text = state.message,
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color(0xFFFFB74D)
                        )
                    }
                    is MovieEndingUiState.Success -> {
                        val ending = state.ending
                        Column(
                            modifier = Modifier
                                .heightIn(max = 420.dp)
                                .verticalScroll(rememberScrollState())
                        ) {
                            Text(
                                text = ending.explanation,
                                style = MaterialTheme.typography.bodyLarge,
                                color = WaveStreamColors.TextPrimary,
                                lineHeight = 26.sp
                            )
                            ending.warning?.let { warning ->
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "⚠ $warning",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Color(0xFFFFB74D)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(18.dp))
                        EndingSourceBadge(ending)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val url = (state as? MovieEndingUiState.Success)?.ending?.wikipediaUrl
                    if (url != null) {
                        TextButton(onClick = {
                            runCatching {
                                context.startActivity(
                                    android.content.Intent(
                                        android.content.Intent.ACTION_VIEW,
                                        android.net.Uri.parse(url)
                                    )
                                )
                            }
                        }) {
                            Text("Fonte su Wikipedia", color = WaveStreamColors.Accent)
                        }
                    } else {
                        Spacer(modifier = Modifier.width(1.dp))
                    }

                    TextButton(
                        onClick = onDismiss,
                        modifier = Modifier.focusRequester(closeFocusRequester)
                    ) {
                        Text("Chiudi", color = WaveStreamColors.TextPrimary)
                    }
                }
            }
        }
    }
}

@Composable
private fun EndingSourceBadge(ending: MovieEnding) {
    val label: String
    val color: Color
    when (ending.source) {
        EndingSource.WIKIPEDIA_AND_AI -> {
            label = "Fonti: Wikipedia + AI"
            color = Color(0xFF81C784)
        }
        EndingSource.WIKIPEDIA -> {
            label = "Fonte: Wikipedia"
            color = Color(0xFF81C784)
        }
        EndingSource.AI -> {
            label = "Solo AI · nessuna fonte verificata"
            color = Color(0xFFFFB74D)
        }
    }
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color.copy(alpha = 0.12f))
            .border(1.dp, color.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = color,
            fontWeight = FontWeight.Medium
        )
    }
}

/**
 * Favorite toggle button with fluid heart animation
 */
@Composable
private fun FavoriteButton(
    isFavorite: Boolean,
    onClick: () -> Unit,
    label: String? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Track toggle for bounce animation
    var bounceScale by remember { mutableFloatStateOf(1f) }
    
    // Bounce animation when favorite changes
    LaunchedEffect(isFavorite) {
        if (isFavorite) {
            // Start from bigger scale and bounce down
            bounceScale = 1.4f
            kotlinx.coroutines.delay(50)
            bounceScale = 1f
        }
    }
    
    // Animated bounce with spring
    val animatedBounce by animateFloatAsState(
        targetValue = bounceScale,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "heartBounce"
    )
    
    // Focus scale
    val focusScale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "focusScale"
    )
    
    // Heart color - red when favorite
    val heartColor by animateColorAsState(
        targetValue = if (isFavorite) Color(0xFFE91E63) else WaveStreamColors.TextSecondary,
        animationSpec = spring(
            dampingRatio = 0.5f,
            stiffness = 400f
        ),
        label = "heartColor"
    )
    
    // Border color - animated based on state
    val borderColor by animateColorAsState(
        targetValue = when {
            isFavorite -> Color(0xFFE91E63)  // Pink border when favorite
            isFocused -> Color.White.copy(alpha = 0.30f)  // Alone di focus
            else -> Color.White.copy(alpha = 0.10f)
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "favBorder"
    )
    
    // Background when favorite
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isFavorite -> Color(0xFFE91E63).copy(alpha = 0.15f)
            isFocused -> Color.White.copy(alpha = 0.16f)
            else -> GlassTokens.SurfaceFill
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "favBg"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = focusScale
                scaleY = focusScale
            }
            .then(if (label != null) Modifier.height(44.dp) else Modifier.size(44.dp))
            .clip(actionShape(label))
            .background(backgroundColor)
            .border(1.dp, borderColor, actionShape(label)) // Consistent 1dp border
            .then(if (label != null) Modifier.padding(horizontal = 14.dp) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        ActionBody(label = label, tint = heartColor) {
            Icon(
                imageVector = if (isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                contentDescription = "Favorite",
                tint = heartColor,
                modifier = Modifier
                    .size(24.dp)
                    .graphicsLayer {
                    scaleX = animatedBounce
                    scaleY = animatedBounce
                }
            )
        }
    }
}

/**
 * Mark as watched button with eye icon
 */
@Composable
private fun MarkAsWatchedButton(
    onClick: () -> Unit,
    label: String? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Focus scale
    val focusScale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "focusScale"
    )
    
    // Border color - animated based on state
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.30f) else Color.White.copy(alpha = 0.10f),
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "eyeBorder"
    )
    
    // Background
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "eyeBg"
    )
    
    // Icon tint
    val iconTint by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "eyeColor"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = focusScale
                scaleY = focusScale
            }
            .then(if (label != null) Modifier.height(44.dp) else Modifier.size(44.dp))
            .clip(actionShape(label))
            .background(backgroundColor)
            .border(1.dp, borderColor, actionShape(label))
            .then(if (label != null) Modifier.padding(horizontal = 14.dp) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        ActionBody(label = label, tint = iconTint) {
            Icon(
                painter = painterResource(R.drawable.ic_eye),
                contentDescription = "Segna come già visto",
                tint = iconTint,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

/**
 * Download button with progress and delete states
 */
@Composable
private fun DownloadButton(
    isDownloaded: Boolean,
    isDownloading: Boolean,
    downloadProgress: Int = 0,
    onDownloadClick: () -> Unit,
    onDeleteClick: () -> Unit,
    label: String? = null
) {
    // Solo icona, come le altre azioni: lo stato si legge dall'icona (verde quando
    // scaricato) e dalla percentuale dentro il CircularProgressIndicator.
    val buttonLabel = label
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val focusScale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "focusScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = when {
            isDownloaded && isFocused -> Color.Red
            isDownloaded -> Color.Green
            isDownloading -> WaveStreamColors.Accent
            isFocused -> Color.White.copy(alpha = 0.30f)
            else -> Color.White.copy(alpha = 0.10f)
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "downloadBorder"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isDownloaded -> Color.Green.copy(alpha = 0.15f)
            isDownloading -> WaveStreamColors.Accent.copy(alpha = 0.15f)
            isFocused -> Color.White.copy(alpha = 0.16f)
            else -> GlassTokens.SurfaceFill
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "downloadBg"
    )
    
    val iconTint by animateColorAsState(
        targetValue = when {
            isDownloaded -> Color.Green
            isDownloading -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.TextPrimary
            else -> WaveStreamColors.TextSecondary
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "downloadColor"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = focusScale
                scaleY = focusScale
            }
            .then(if (buttonLabel != null) Modifier.height(44.dp) else Modifier.size(44.dp))
            .clip(actionShape(buttonLabel))
            .background(backgroundColor)
            .border(1.dp, borderColor, actionShape(buttonLabel))
            .then(if (buttonLabel != null) Modifier.padding(horizontal = 14.dp) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = if (isDownloaded) onDeleteClick else onDownloadClick
            ),
        contentAlignment = Alignment.Center
    ) {
        ActionBody(label = buttonLabel, tint = iconTint) {
        when {
            isDownloading -> {
                Box(contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(
                        progress = { downloadProgress / 100f },
                        modifier = Modifier.size(36.dp),
                        color = WaveStreamColors.Accent,
                        strokeWidth = 3.dp,
                        trackColor = WaveStreamColors.BackgroundTertiary
                    )
                    Text(
                        text = "$downloadProgress%",
                        style = MaterialTheme.typography.labelSmall,
                        color = WaveStreamColors.TextPrimary
                    )
                }
            }
            isDownloaded -> {
                Icon(
                    imageVector = Icons.Default.DownloadDone,
                    contentDescription = "Scaricato - clicca per eliminare",
                    tint = iconTint,
                    modifier = Modifier.size(26.dp)
                )
            }
            else -> {
                Icon(
                    imageVector = Icons.Default.Download,
                    contentDescription = "Scarica",
                    tint = iconTint,
                    modifier = Modifier.size(26.dp)
                )
            }
        }
        }
    }
}

/**
 * Episodes section HEADER - Season dropdown + download button (Prime Video style)
 * Episodes are rendered separately as individual lazy items in the parent TvLazyColumn
 */
@Composable
private fun EpisodesSectionHeader(
    seasons: List<Int>,
    selectedSeason: Int,
    onSeasonSelected: (Int) -> Unit,
    onDownloadSeason: (Int) -> Unit = {},
    firstEpisodeFocusRequester: FocusRequester? = null,
    upFocusRequester: FocusRequester? = null
) {
    var dropdownExpanded by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    // Season download button focus state
    val seasonDownloadInteractionSource = remember { MutableInteractionSource() }
    val isSeasonDownloadFocused by seasonDownloadInteractionSource.collectIsFocusedAsState()

    // Section title + download button + Season dropdown
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .then(
                if (firstEpisodeFocusRequester != null) {
                    Modifier.focusProperties { down = firstEpisodeFocusRequester }
                } else Modifier
            )
            .then(
                if (upFocusRequester != null) {
                    Modifier.focusProperties { up = upFocusRequester }
                } else Modifier
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Left side: Episodi + download season button
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = stringResource(R.string.episodes),
                style = MaterialTheme.typography.headlineSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold
            )
            
            // Download season button
            val seasonDownloadScale by animateFloatAsState(
                targetValue = if (isSeasonDownloadFocused) AppAnimations.GlassPillFocusScale else 1f,
                animationSpec = AppAnimations.SpringCardFocus,
                label = "seasonDownloadScale"
            )
            val seasonDownloadBg by animateColorAsState(
                targetValue = if (isSeasonDownloadFocused) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill,
                animationSpec = AppAnimations.SpringCardFocusColor,
                label = "seasonDownloadBg"
            )
            
            Box(
                modifier = Modifier
                    .graphicsLayer {
                    scaleX = seasonDownloadScale
                    scaleY = seasonDownloadScale
                }
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(seasonDownloadBg)
                    .focusable(interactionSource = seasonDownloadInteractionSource)
                    .clickable(
                        interactionSource = seasonDownloadInteractionSource,
                        indication = null,
                        onClick = { onDownloadSeason(selectedSeason) }
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Download,
                    contentDescription = "Scarica stagione $selectedSeason",
                    tint = if (isSeasonDownloadFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        
        // Season dropdown
        Box {
            val borderColor by animateColorAsState(
                targetValue = if (isFocused || dropdownExpanded) Color.White.copy(alpha = 0.30f) else Color.White.copy(alpha = 0.10f),
                label = "dropdownBorder"
            )
            
            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .border(1.dp, borderColor, RoundedCornerShape(50))
                    .background(if (dropdownExpanded) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill)
                    .focusable(interactionSource = interactionSource)
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null,
                        onClick = { dropdownExpanded = !dropdownExpanded }
                    )
                    .padding(horizontal = 16.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.season_number, selectedSeason),
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextPrimary,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = if (dropdownExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = null,
                    tint = WaveStreamColors.TextSecondary,
                    modifier = Modifier.size(20.dp)
                )
            }
            
            DropdownMenu(
                expanded = dropdownExpanded,
                onDismissRequest = { dropdownExpanded = false },
                modifier = Modifier.background(WaveStreamColors.BackgroundSecondary)
            ) {
                seasons.forEach { season ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = stringResource(R.string.season_number, season),
                                color = if (season == selectedSeason) WaveStreamColors.Accent else WaveStreamColors.TextPrimary,
                                fontWeight = if (season == selectedSeason) FontWeight.Bold else FontWeight.Normal
                            )
                        },
                        onClick = {
                            onSeasonSelected(season)
                            dropdownExpanded = false
                        }
                    )
                }
            }
        }
    }
}

/**
 * Season tab button
 */
@Composable
private fun SeasonTab(
    seasonNumber: Int,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "seasonScale"
    )
    
    // Stagione selezionata = accent SOFT, non fondo accent pieno (Fase D5).
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent.copy(alpha = 0.22f)
            isFocused -> Color.White.copy(alpha = 0.16f)
            else -> GlassTokens.SurfaceFill
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "seasonBg"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(50))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 24.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.season_number, seasonNumber),
            style = MaterialTheme.typography.labelLarge,
            color = if (isSelected) Color.White else WaveStreamColors.TextPrimary,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
        )
    }
}

/**
 * Card episodio del carosello orizzontale, in stile "episodi" da streaming TV:
 * copertina landscape 16:9 con numero episodio grande in alto a sinistra e
 * freccia di download in basso a destra; sotto, titolo e breve trama.
 *
 * Il titolo è pulito da "Episodio N"/SxxExx: se resta un titolo vero lo mostra,
 * altrimenti usa il fallback "Episodio N" ([TitleCleaner.resolveEpisodeDisplayTitle]).
 */
@OptIn(androidx.compose.foundation.ExperimentalFoundationApi::class)
@Composable
private fun EpisodeCarouselCard(
    episode: Episode,
    progress: EpisodeProgress?,
    downloadState: EpisodeDownloadState? = null,
    seriesName: String? = null,
    cardFocusRequester: FocusRequester? = null,
    upFocusRequester: FocusRequester? = null,
    onClick: () -> Unit,
    onLongClick: () -> Unit = {},
    onDownloadClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val cardInteraction = remember { MutableInteractionSource() }
    val isFocused by cardInteraction.collectIsFocusedAsState()

    val downloadInteraction = remember { MutableInteractionSource() }
    val isDownloadFocused by downloadInteraction.collectIsFocusedAsState()

    val fallbackCardFocus = remember { FocusRequester() }
    val effectiveCardFocus = cardFocusRequester ?: fallbackCardFocus
    val downloadFocusRequester = remember { FocusRequester() }

    var pressStartTime by remember { mutableStateOf(0L) }
    val longPressThreshold = 500L

    val isDownloaded = downloadState?.isDownloaded == true
    val isDownloading = downloadState?.isDownloading == true
    val downloadProgress = downloadState?.downloadProgress ?: 0

    val hasProgress = progress != null && progress.progress > 0.01f && !progress.isCompleted
    val isWatched = progress?.isCompleted == true ||
        (progress != null && progress.remainingMinutes <= 7 && progress.progress > 0.9f)
    val progressFraction: Float? =
        if (hasProgress) progress?.progress?.coerceIn(0f, 1f) else null

    val ring by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "episodeCardRing"
    )
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.03f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "episodeCardScale"
    )

    // Titolo mostrato: titolo vero (provider, poi TMDB), altrimenti "Episodio N".
    val displayTitle = remember(episode.name, episode.tmdbName, episode.episodeNumber, seriesName) {
        TitleCleaner.resolveEpisodeDisplayTitle(
            providerName = episode.name,
            tmdbName = episode.tmdbName,
            episodeNumber = episode.episodeNumber,
            seriesName = seriesName
        )
    }
    val plot = remember(episode.tmdbOverview, episode.plot) {
        episode.tmdbOverview?.takeIf { it.isNotBlank() }
            ?: episode.plot?.takeIf { it.isNotBlank() }
    }

    Column(
        modifier = modifier
            .width(196.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
    ) {
        // Copertina landscape 16:9 — principale focus target della card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
                .clip(RoundedCornerShape(14.dp))
                .background(WaveStreamColors.BackgroundSecondary)
                .border(2.dp, ring, RoundedCornerShape(14.dp))
                .focusRequester(effectiveCardFocus)
                .then(
                    if (upFocusRequester != null) Modifier.focusProperties { up = upFocusRequester } else Modifier
                )
                .focusProperties { down = downloadFocusRequester }
                .focusable(interactionSource = cardInteraction)
                .onPreviewKeyEvent { keyEvent ->
                    when {
                        keyEvent.key == Key.DirectionCenter || keyEvent.key == Key.Enter -> {
                            if (keyEvent.type == KeyEventType.KeyDown) {
                                if (pressStartTime == 0L) pressStartTime = System.currentTimeMillis()
                                true
                            } else if (keyEvent.type == KeyEventType.KeyUp) {
                                val pressDuration = System.currentTimeMillis() - pressStartTime
                                pressStartTime = 0L
                                if (pressDuration >= longPressThreshold) onLongClick() else onClick()
                                true
                            } else false
                        }
                        else -> false
                    }
                }
                .combinedClickable(
                    interactionSource = cardInteraction,
                    indication = null,
                    onClick = onClick,
                    onLongClick = onLongClick
                )
        ) {
            AsyncImage(
                model = episode.posterUrl,
                contentDescription = episode.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Scrim in alto: dà contrasto al numero grande
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxWidth()
                    .height(72.dp)
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Black.copy(alpha = 0.55f), Color.Transparent)
                        )
                    )
            )

            // Numero episodio grande (1, 2, 3…) in alto a sinistra
            Text(
                text = "${episode.episodeNumber}",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 10.dp, top = 2.dp)
            )

            // Stato "visto": check in alto a destra
            if (isWatched) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(10.dp)
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(Color.Black.copy(alpha = 0.55f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Guardato",
                        tint = WaveStreamColors.Accent,
                        modifier = Modifier.size(15.dp)
                    )
                }
            }

            // Overlay play al focus / in ripresa
            if (isFocused || hasProgress) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.30f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }

            // Barra di avanzamento in basso
            if (progressFraction != null) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .height(4.dp)
                        .background(Color.Black.copy(alpha = 0.6f))
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(progressFraction)
                            .background(WaveStreamColors.Accent)
                    )
                }
            }

            // Freccia di download in basso a destra (focus target separato)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(6.dp)
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(if (isDownloadFocused || isDownloaded) Color.Black.copy(alpha = 0.55f) else Color.Transparent)
                    .focusRequester(downloadFocusRequester)
                    .focusProperties { up = effectiveCardFocus }
                    .focusable(interactionSource = downloadInteraction)
                    .clickable(
                        interactionSource = downloadInteraction,
                        indication = null,
                        onClick = onDownloadClick
                    ),
                contentAlignment = Alignment.Center
            ) {
                when {
                    isDownloading -> {
                        if (downloadProgress > 0) {
                            CircularProgressIndicator(
                                progress = { downloadProgress / 100f },
                                modifier = Modifier.size(18.dp),
                                color = Color.White,
                                strokeWidth = 2.dp,
                                trackColor = Color.White.copy(alpha = 0.25f)
                            )
                        } else {
                            CircularProgressIndicator(
                                modifier = Modifier.size(18.dp),
                                color = Color.White,
                                strokeWidth = 2.dp,
                                trackColor = Color.White.copy(alpha = 0.25f)
                            )
                        }
                    }
                    isDownloaded -> Icon(
                        imageVector = Icons.Default.DownloadDone,
                        contentDescription = "Scaricato",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                    else -> Icon(
                        imageVector = Icons.Default.Download,
                        contentDescription = "Scarica episodio",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Titolo pulito (1 riga)
        Text(
            text = displayTitle,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        // Breve trama (TMDB, fallback provider), come nella reference
        if (plot != null) {
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = plot,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp, lineHeight = 15.sp),
                color = WaveStreamColors.TextTertiary,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

// ============ Preview ============

/**
 * Trailer button with YouTube logo
 */
@Composable
private fun TrailerButton(
    onClick: () -> Unit,
    label: String? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "trailerBtnScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "trailerBtnBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.30f) else Color.White.copy(alpha = 0.10f),
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "trailerBtnBorder"
    )

    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .then(if (label != null) Modifier.height(44.dp) else Modifier.size(44.dp))
            .clip(actionShape(label))
            .background(backgroundColor)
            .border(1.dp, borderColor, actionShape(label))
            .then(if (label != null) Modifier.padding(horizontal = 14.dp) else Modifier)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource),
        contentAlignment = Alignment.Center
    ) {
        ActionBody(label = label, tint = WaveStreamColors.TextPrimary) {
            Image(
                painter = painterResource(id = R.drawable.ic_youtube_logo),
                contentDescription = "Trailer",
                modifier = Modifier.size(24.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

/**
 * Add to List button with dropdown menu
 */
@Composable
private fun AddToListButton(
    customLists: List<CustomGroup>,
    selectedListIds: Set<Long>,
    onAddToList: (Long) -> Unit,
    onRemoveFromList: (Long) -> Unit,
    onCreateList: (String) -> Unit,
    @Suppress("UNUSED_PARAMETER") // onRenameList kept for API consistency
    onRenameList: (Long, String) -> Unit,
    label: String? = null
) {
    var showDropdown by remember { mutableStateOf(false) }
    var showCreateDialog by remember { mutableStateOf(false) }
    var renamingListId by remember { mutableStateOf<Long?>(null) }
    
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Check if content is in any list
    val isInList = selectedListIds.isNotEmpty()
    
    // Animated scale
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "listBtnScale"
    )
    
    // Animated background - solid colors for visibility
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isInList -> Color.White
            isFocused -> Color.White.copy(alpha = 0.16f)
            else -> GlassTokens.SurfaceFill
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "listBtnBg"
    )
    
    // Animated border color
    val borderColor by animateColorAsState(
        targetValue = when {
            isInList -> Color.White
            isFocused -> Color.White.copy(alpha = 0.30f)
            else -> Color.White.copy(alpha = 0.10f)
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "listBtnBorder"
    )
    
    // Animated icon color - dark when in list (for contrast on white bg)
    val iconColor by animateColorAsState(
        targetValue = when {
            isInList -> WaveStreamColors.BackgroundDark
            isFocused -> WaveStreamColors.TextPrimary
            else -> WaveStreamColors.TextSecondary
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "listBtnIcon"
    )

    Box {
        Box(
            modifier = Modifier
                .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
                .then(if (label != null) Modifier.height(44.dp) else Modifier.size(44.dp))
                .clip(actionShape(label)) // Changed to CircleShape
                .background(backgroundColor)
                .border(1.dp, borderColor, actionShape(label)) // Consistent 1dp border
                .then(if (label != null) Modifier.padding(horizontal = 14.dp) else Modifier)
                .focusable(interactionSource = interactionSource)
                .clickable(
                    interactionSource = interactionSource,
                    indication = null,
                    onClick = { showDropdown = !showDropdown }
                ),
            contentAlignment = Alignment.Center
        ) {
            ActionBody(label = label, tint = iconColor) {
            // Crossfade between + and ✓ icons
            androidx.compose.animation.Crossfade(
                targetState = isInList,
                animationSpec = tween(durationMillis = 300),
                label = "listIconCrossfade"
            ) { inList ->
                Icon(
                    imageVector = if (inList) Icons.Default.Check else Icons.AutoMirrored.Filled.PlaylistAdd,
                    contentDescription = if (inList) "In lista" else "Aggiungi a lista",
                    tint = iconColor,
                    modifier = Modifier.size(24.dp)
                )
            }
            }
        }
        
        DropdownMenu(
            expanded = showDropdown,
            onDismissRequest = { showDropdown = false },
            modifier = Modifier.background(WaveStreamColors.BackgroundSecondary, RoundedCornerShape(12.dp)).width(280.dp)
        ) {
            Text(
                text = "Aggiungi a lista",
                style = MaterialTheme.typography.titleSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)
            )
            
            HorizontalDivider(color = WaveStreamColors.BackgroundTertiary, thickness = 1.dp)
            
            if (customLists.isEmpty()) {
                Text(
                    text = "Nessuna lista creata",
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextTertiary,
                    modifier = Modifier.padding(16.dp)
                )
            } else {
                customLists.forEach { list ->
                    val isSelected = selectedListIds.contains(list.id)
                    DropdownMenuItem(
                        text = {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = list.name,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = WaveStreamColors.TextPrimary,
                                    modifier = Modifier.weight(1f)
                                )
                                IconButton(onClick = { renamingListId = list.id }, modifier = Modifier.size(32.dp)) {
                                    Icon(Icons.Default.Edit, "Modifica", tint = WaveStreamColors.TextTertiary, modifier = Modifier.size(16.dp))
                                }
                                Checkbox(
                                    checked = isSelected,
                                    onCheckedChange = null,
                                    colors = CheckboxDefaults.colors(checkedColor = WaveStreamColors.Accent, uncheckedColor = WaveStreamColors.TextTertiary)
                                )
                            }
                        },
                        onClick = { if (isSelected) onRemoveFromList(list.id) else onAddToList(list.id) }
                    )
                }
            }
            
            HorizontalDivider(color = WaveStreamColors.BackgroundTertiary, thickness = 1.dp)
            
            DropdownMenuItem(
                text = {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Icon(Icons.Default.Add, null, tint = WaveStreamColors.Accent, modifier = Modifier.size(20.dp))
                        Text("Crea nuova lista", style = MaterialTheme.typography.bodyMedium, color = WaveStreamColors.Accent, fontWeight = FontWeight.Medium)
                    }
                },
                onClick = { showDropdown = false; showCreateDialog = true }
            )
        }
    }
    
    if (showCreateDialog) {
        var listName by remember { mutableStateOf("") }
        AlertDialog(
            onDismissRequest = { showCreateDialog = false },
            containerColor = WaveStreamColors.BackgroundSecondary,
            title = { Text("Crea nuova lista", color = WaveStreamColors.TextPrimary) },
            text = {
                OutlinedTextField(
                    value = listName,
                    onValueChange = { listName = it },
                    label = { Text("Nome lista") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = WaveStreamColors.TextPrimary,
                        unfocusedTextColor = WaveStreamColors.TextPrimary,
                        focusedBorderColor = WaveStreamColors.Accent,
                        unfocusedBorderColor = WaveStreamColors.BackgroundTertiary
                    )
                )
            },
            confirmButton = {
                TextButton(onClick = { if (listName.isNotBlank()) { onCreateList(listName.trim()); showCreateDialog = false } }) {
                    Text("Crea", color = WaveStreamColors.Accent)
                }
            },
            dismissButton = {
                TextButton(onClick = { showCreateDialog = false }) { Text("Annulla", color = WaveStreamColors.TextSecondary) }
            }
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 1280,
    heightDp = 720,
    uiMode = Configuration.UI_MODE_TYPE_TELEVISION
)
@Composable
private fun DetailsScreenPreview() {
    WaveStreamTheme {
        DetailsScreen(
            state = DetailsState(
                title = "Oppenheimer",
                year = "2023",
                overview = "The story of American scientist J. Robert Oppenheimer and his role in the development of the atomic bomb.",
                genres = "Drama, History, Biography",
                duration = "180 min",
                director = "Christopher Nolan",
                cast = "Cillian Murphy, Emily Blunt, Matt Damon",
                isFavorite = true,
                contentType = ContentType.MOVIE,
                isLoading = false,
                tmdbRating = 8.4f,
                imdbRating = "8.5",
                rottenTomatoesScore = 93,
                metacriticScore = 88
            ),
            onBackClick = {},
            onPlayClick = {},
            onFavoriteClick = {},
            onSeasonSelected = {},
            onEpisodeClick = {}
        )
    }
}

@Composable
fun DetailsSkeletonLoader(modifier: Modifier = Modifier) {
    val infiniteTransition = rememberInfiniteTransition(label = "shimmer_details")
    
    val shimmerOffset by infiniteTransition.animateFloat(
        initialValue = -1f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "shimmerOffset_details"
    )
    val pulseAlpha by infiniteTransition.animateFloat(
        initialValue = 0.5f,
        targetValue = 0.9f,
        animationSpec = infiniteRepeatable(
            animation = tween(1200, easing = FastOutSlowInEasing, delayMillis = 100),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulseAlpha_details"
    )
    
    // Shimmer in vetro: velature bianche semitrasparenti invece delle tinte piene
    // del tema (Fase D8), coerenti con le superfici finali.
    val shimmerBrush = Brush.linearGradient(
        colors = listOf(
            Color.White.copy(alpha = 0.05f * pulseAlpha),
            Color.White.copy(alpha = 0.14f * pulseAlpha),
            Color.White.copy(alpha = 0.05f * pulseAlpha)
        ),
        start = Offset(shimmerOffset * 1000f, 0f),
        end = Offset((shimmerOffset + 1f) * 1000f, 0f)
    )

    Box(modifier = modifier.fillMaxSize().background(WaveStreamColors.BackgroundDark)) {
        // Stesso scaffolding del layout CENTRATO: logo, meta, ratings, bottoni,
        // trama e riga Cast & Regia sull'asse — non piu il vecchio layout con poster.
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            
            // Logo / titolo
            Box(modifier = Modifier.width(300.dp).height(44.dp).clip(RoundedCornerShape(6.dp)).background(shimmerBrush))
            Spacer(modifier = Modifier.height(20.dp))
            
            // Meta: anno · durata · generi
            Box(modifier = Modifier.width(340.dp).height(22.dp).clip(RoundedCornerShape(6.dp)).background(shimmerBrush))
            Spacer(modifier = Modifier.height(16.dp))
            
            // Ratings
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                repeat(5) {
                    Box(modifier = Modifier.width(56.dp).height(26.dp).clip(RoundedCornerShape(13.dp)).background(shimmerBrush))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            
            // CTA + azioni
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Box(modifier = Modifier.width(116.dp).height(48.dp).clip(RoundedCornerShape(12.dp)).background(shimmerBrush))
                repeat(5) {
                    Box(modifier = Modifier.width(44.dp).height(44.dp).clip(CircleShape).background(shimmerBrush))
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            
            // Trama
            repeat(3) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(if (it == 2) 0.5f else 0.75f)
                        .height(14.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(shimmerBrush)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            Spacer(modifier = Modifier.height(16.dp))
            
            // Cast & Regia
            Box(modifier = Modifier.width(140.dp).height(18.dp).clip(RoundedCornerShape(4.dp)).background(shimmerBrush))
            Spacer(modifier = Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                repeat(6) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(modifier = Modifier.size(48.dp).clip(CircleShape).background(shimmerBrush))
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier = Modifier.width(44.dp).height(9.dp).clip(RoundedCornerShape(3.dp)).background(shimmerBrush))
                    }
                }
            }
        }
    }
}


