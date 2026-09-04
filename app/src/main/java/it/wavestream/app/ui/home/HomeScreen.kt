package it.wavestream.app.ui.home

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.focusRestorer
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import it.wavestream.app.R
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import androidx.compose.runtime.Immutable

/**
 * Content item for carousels (Movie, Series, Channel)
 */
@Immutable
data class CarouselItem(
    val id: Long,
    val title: String,
    val posterUrl: String?,
    val backdropUrl: String? = null,
    val contentType: String, // "MOVIE", "SERIES", "CHANNEL", "CATEGORY_MOVIE", "CATEGORY_SERIES", "CATEGORY_LIVE"
    val year: Int? = null,
    val rating: Float? = null,
    val ratingText: String? = null,  // Pre-formatted rating to avoid String.format in composables
    // Continue Watching fields
    val progressPercent: Float? = null,  // 0.0 to 1.0
    val remainingMinutes: Int? = null,
    val episodeLabel: String? = null,  // "S2 E5" for series
    // Series-specific fields
    val nextEpisodeLabel: String? = null,    // "S2 E5" next unwatched episode
    val seasonCount: Int? = null,           // Number of seasons (e.g. "3 stagioni")
    val newEpisodeBadge: Boolean = false,   // Badge "NUOVO" for recent episodes
    // Category card fields
    val contentCount: Int? = null  // Number of items in category (for category cards)
)

/**
 * Hero banner item with enriched content
 */
@Immutable
data class HeroItem(
    val id: Long,
    val title: String,
    val backdropUrl: String?,
    val posterUrl: String?,
    val contentType: String, // "MOVIE", "SERIES"
    val overview: String?,
    val cast: String?,  // Comma-separated cast names
    val imdbRating: String?,
    val rottenTomatoesScore: Int?,
    val audienceScore: Int? = null,  // Popcornmeter (audience score)
    val metacriticScore: Int?,
    val tmdbRating: Float?,  // TMDB vote average
    val resumeMinutes: Int?,  // null = not continue watching (random hero)
    val progressPercent: Float?,
    val year: Int?,
    val duration: String?,  // e.g., "2h 15m"
    val genres: String?,  // Comma-separated genres
    val seasonCount: Int? = null,  // Number of seasons (for series only)
    val totalDurationMinutes: Int? = null, // Total duration in minutes (for "xx min left of yy min")
    val isFavorite: Boolean = false,
    val trailerKey: String? = null,
    val resumeEpisodeSeason: Int? = null,  // Season number for resume (series only)
    val resumeEpisodeNumber: Int? = null,  // Episode number for resume (series only)
    val newEpisodeSeason: Int? = null,     // Season number for new episode (series only)
    val newEpisodeNumber: Int? = null,      // Episode number for new episode (series only)
    val newEpisodeCaughtUp: Boolean = false // True solo se l'utente ha visto tutti gli episodi precedenti al nuovo
)

/**
 * Wrapper for hero pair data to fix Gson deserialization.
 * Gson cannot reliably deserialize Kotlin Pair — it creates LinkedTreeMap
 * instead of a proper Pair, causing silent failures after process death.
 */
data class HeroPairData(
    val heroes: List<HeroItem>,
    val isContinueWatching: Boolean
)

/**
 * Carousel row data
 */
@Immutable
data class CarouselRow(
    val title: String,
    val items: List<CarouselItem>,
    val showSeeAll: Boolean = true,
    val isSectionHeader: Boolean = false  // True for section headers (Categorie, Film, Serie, etc.)
)

/**
 * Home screen state
 */
@Immutable
data class HomeScreenState(
    val carouselRows: List<CarouselRow> = emptyList(),
    val isLoading: Boolean = false,  // Default false - loading happens in LoadingActivity
    val heroItem: CarouselItem? = null,
    val isGridMode: Boolean = false,  // True when viewing a single category as grid
    val selectedCategory: String? = null,  // Current category name for grid view
    val isListsTab: Boolean = false,  // True when viewing the Lists tab (for empty state)
    val isFavoritesTab: Boolean = false,  // True when viewing the Favorites tab (for empty state)
    val isHistoryTab: Boolean = false,    // True when viewing the History tab (for empty state)
    val isHomeTab: Boolean = false,       // True when viewing the Home tab
    // Hero banner fields
    val heroItems: List<HeroItem> = emptyList(),
    val currentHeroIndex: Int = 0,
    val isContinueWatchingHero: Boolean = false,  // True if heroes are from continue watching
    // Serie A live hero (football-data.org) — prima slide del carosello hero
    val serieAMatchHero: HeroItem? = null,
    val serieAMatch: SerieAMatchEntity? = null,
    val serieAChannelPicker: SerieAChannelPickerState? = null,
    // Category filter fields (for grid view)
    val availableCategories: List<String> = emptyList(),  // All categories available for filtering
    val selectedCategoryFilters: Set<String> = emptySet(),  // Currently selected category filters
    val isMoviesGrid: Boolean = true  // True if grid is showing movies, false for series
)

/**
 * Netflix-style Home Screen with horizontal carousels
 * Optimized for TV D-pad navigation
 */
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HomeScreen(
    state: HomeScreenState,
    onItemClick: (CarouselItem) -> Unit,
    @Suppress("UNUSED_PARAMETER") // onPlayClick kept for API consistency with TvHomeScreen
    onPlayClick: (CarouselItem) -> Unit,
    onSeeAllClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val columnListState = rememberLazyListState()
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        if (state.isLoading) {
            // Loading state
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center),
                color = WaveStreamColors.Accent
            )
        } else {
            LazyColumn(
                state = columnListState,
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(top = 80.dp, bottom = 56.dp)
            ) {
                // Carousel rows
                items(state.carouselRows, key = { it.title }) { row ->
                    // remember the closure once per row (keyed by title) so it isn't re-allocated
                    // on every recompose — this preserves Compose's skip optimization.
                    val seeAllForRow = remember(row.title) { { onSeeAllClick(row.title) } }
                    CarouselRowItem(
                        row = row,
                        onItemClick = onItemClick,
                        onSeeAllClick = seeAllForRow
                    )
                }
            }
        }
    }
}

/**
 * Hero banner at top of home screen
 */
@Composable
private fun HeroBanner(
    item: CarouselItem,
    onPlayClick: () -> Unit,
    onInfoClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(260.dp)  // Reduced for compact layout
    ) {
        // Backdrop image
        AsyncImage(
            model = item.backdropUrl ?: item.posterUrl,
            contentDescription = item.title,
            contentScale = ContentScale.Crop,  // Changed to Crop for better fit
            modifier = Modifier.fillMaxSize()
        )
        
        // Gradient overlay - less aggressive
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            WaveStreamColors.BackgroundDark.copy(alpha = 0.3f),
                            WaveStreamColors.BackgroundDark.copy(alpha = 0.8f),
                            WaveStreamColors.BackgroundDark
                        ),
                        startY = 50f
                    )
                )
        )
        
        // Content
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 48.dp, bottom = 28.dp, end = 48.dp)  // Reduced padding
        ) {
            // Title
            Text(
                text = item.title,
                style = MaterialTheme.typography.headlineMedium,  // Smaller font
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
            
            Spacer(modifier = Modifier.height(12.dp))  // Reduced spacing
            
            // Action buttons
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)  // Tighter spacing
            ) {
                // Play button
                HeroPlayButton(onClick = onPlayClick)
                
                // More info button
                HeroSecondaryButton(
                    text = "Più info",
                    onClick = onInfoClick
                )
            }
        }
    }
}

/**
 * Hero play button
 */
@Composable
private fun HeroPlayButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "heroPlayScale"
    )
    
    Button(
        onClick = onClick,
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .height(40.dp)  // Reduced from 48dp
            .focusable(interactionSource = interactionSource),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = stringResource(R.string.play),
            fontWeight = FontWeight.Bold
        )
    }
}

/**
 * Hero secondary button
 */
@Composable
private fun HeroSecondaryButton(
    text: String,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "heroSecScale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) GlassTokens.SurfaceFillStrong else GlassTokens.SurfaceFill,
        label = "heroSecBg"
    )
    
    Button(
        onClick = onClick,
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .height(48.dp)
            .border(
                width = if (isFocused) 2.dp else 1.dp,
                brush = if (isFocused) GlassTokens.accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient,
                shape = RoundedCornerShape(8.dp)
            )
            .focusable(interactionSource = interactionSource),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = WaveStreamColors.TextPrimary
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Medium
        )
    }
}

/**
 * Single carousel row with title and horizontal list
 */
@Composable
private fun CarouselRowItem(
    row: CarouselRow,
    onItemClick: (CarouselItem) -> Unit,
    onSeeAllClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 18.dp)
    ) {
        // Row header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 48.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = row.title,
                style = MaterialTheme.typography.titleMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold
            )
            
            if (row.showSeeAll) {
                SeeAllButton(onClick = onSeeAllClick)
            }
        }
        
        Spacer(modifier = Modifier.height(10.dp))
        
        // Horizontal carousel - simple
        LazyRow(
            contentPadding = PaddingValues(horizontal = 48.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(row.items, key = { "${it.contentType}_${it.id}" }) { item ->
                PosterCard(
                    item = item,
                    onClick = { onItemClick(item) }
                )
            }
        }
    }
}

/**
 * See all button for row
 */
@Composable
private fun SeeAllButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val textColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
        label = "seeAllColor"
    )
    val pillFill by animateColorAsState(
        targetValue = if (isFocused) GlassTokens.SurfaceFillStrong else GlassTokens.SurfaceFill,
        label = "seeAllFill"
    )
    val pillScale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringSmooth,
        label = "seeAllScale"
    )
    
    // Pill vetro flottante (FASE 1 — Liquid Glass)
    GlassSurface(
        shape = RoundedCornerShape(50),
        fill = pillFill,
        stroke = if (isFocused) GlassTokens.accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient,
        strokeWidth = if (isFocused) 2.dp else 1.dp,
        modifier = Modifier
            .graphicsLayer {
                scaleX = pillScale
                scaleY = pillScale
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource)
    ) {
        Text(
            text = "Vedi tutto →",
            style = MaterialTheme.typography.labelLarge,
            color = textColor,
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 7.dp)
        )
    }
}

/**
 * Poster card for carousel items
 */
@Composable
fun PosterCard(
    item: CarouselItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.08f else 1f,
        label = "posterScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "posterBorder"
    )
    
    Column(
        modifier = modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(130.dp)  // Reduced from 150dp
            .wrapContentHeight()  // Let content determine height (poster + title)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
        // Poster image
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(195.dp)  // Reduced from 225dp (keeps aspect ratio)
                .clip(RoundedCornerShape(6.dp))  // Smaller radius
                .border(2.dp, borderColor, RoundedCornerShape(6.dp))
                .background(WaveStreamColors.CardBackground)
        ) {
            AsyncImage(
                model = item.posterUrl,
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                placeholder = coil.compose.rememberAsyncImagePainter(R.drawable.placeholder_poster),
                error = coil.compose.rememberAsyncImagePainter(R.drawable.placeholder_poster),
                modifier = Modifier.fillMaxSize()
            )
            
            // Rating badge (if available and NOT continue watching)
            if (item.progressPercent == null) {
                item.rating?.takeIf { it > 0 }?.let { rating ->
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
            
            // Episode label for series (top left)
            item.episodeLabel?.let { label ->
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(Color.Black.copy(alpha = 0.7f))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = label,
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            
            // Progress bar overlay (for Continue Watching)
            item.progressPercent?.let { progress ->
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.8f))
                            )
                        )
                        .padding(8.dp)
                ) {
                    // Remaining time text
                    item.remainingMinutes?.let { mins ->
                        val timeText = if (mins >= 60) {
                            "${mins / 60}h ${mins % 60}m rimasti"
                        } else {
                            "$mins min rimasti"
                        }
                        Text(
                            text = timeText,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                    
                    // Progress bar
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(4.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color.White.copy(alpha = 0.3f))
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(progress.coerceIn(0f, 1f))
                                .clip(RoundedCornerShape(2.dp))
                                .background(WaveStreamColors.Accent)
                        )
                    }
                }
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // Title
        Text(
            text = item.title,
            style = MaterialTheme.typography.bodySmall,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            lineHeight = 16.sp
        )
    }
}

/**
 * Wide card for continue watching / channels
 */
@Composable
fun WideCard(
    item: CarouselItem,
    progress: Float? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "wideScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "wideBorder"
    )
    
    Box(
        modifier = modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(280.dp)
            .height(157.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .background(WaveStreamColors.CardBackground)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
        // Backdrop/thumbnail
        AsyncImage(
            model = item.backdropUrl ?: item.posterUrl,
            contentDescription = item.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        
        // Gradient overlay at bottom
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .align(Alignment.BottomCenter)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            WaveStreamColors.BackgroundDark.copy(alpha = 0.9f)
                        )
                    )
                )
        )
        
        // Title
        Text(
            text = item.title,
            style = MaterialTheme.typography.bodyMedium,
            color = WaveStreamColors.TextPrimary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(12.dp)
        )
        
        // Progress bar (for continue watching)
        progress?.let { prog ->
            LinearProgressIndicator(
                progress = prog,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .align(Alignment.BottomCenter),
                color = WaveStreamColors.Accent,
                trackColor = WaveStreamColors.BackgroundTertiary
            )
        }
        
        // Play icon on focus
        if (isFocused) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .align(Alignment.Center)
                    .clip(RoundedCornerShape(24.dp))
                    .background(WaveStreamColors.Accent.copy(alpha = 0.9f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
        }
    }
}

// ============ Preview ============

@Preview(
    showBackground = true,
    widthDp = 1280,
    heightDp = 720,
    uiMode = Configuration.UI_MODE_TYPE_TELEVISION
)
@Composable
private fun HomeScreenPreview() {
    WaveStreamTheme {
        HomeScreen(
            state = HomeScreenState(
                isLoading = false,
                heroItem = CarouselItem(
                    id = 1,
                    title = "Oppenheimer",
                    posterUrl = null,
                    backdropUrl = null,
                    contentType = "MOVIE",
                    rating = 8.5f
                ),
                carouselRows = listOf(
                    CarouselRow(
                        title = "📅 Aggiunti di recente",
                        items = listOf(
                            CarouselItem(1, "Film 1", null, null, "MOVIE", 2023, 7.5f),
                            CarouselItem(2, "Film 2", null, null, "MOVIE", 2022, 8.2f),
                            CarouselItem(3, "Film 3", null, null, "MOVIE", 2024, 6.8f)
                        )
                    ),
                    CarouselRow(
                        title = "⭐ Film popolari",
                        items = listOf(
                            CarouselItem(4, "Film 4", null, null, "MOVIE", 2023, 9.0f),
                            CarouselItem(5, "Film 5", null, null, "MOVIE", 2021, 7.8f)
                        )
                    )
                )
            ),
            onItemClick = {},
            onPlayClick = {},
            onSeeAllClick = {}
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 200,
    heightDp = 300,
    uiMode = Configuration.UI_MODE_TYPE_TELEVISION
)
@Composable
private fun PosterCardPreview() {
    WaveStreamTheme {
        PosterCard(
            item = CarouselItem(
                id = 1,
                title = "Oppenheimer - Il film più lungo del mondo",
                posterUrl = null,
                contentType = "MOVIE",
                rating = 8.5f
            ),
            onClick = {}
        )
    }
}


