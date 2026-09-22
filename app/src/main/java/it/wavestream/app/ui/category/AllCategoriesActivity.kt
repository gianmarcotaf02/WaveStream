package it.wavestream.app.ui.category

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Tv
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.foundation.lazy.grid.TvGridCells
import androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid
import androidx.tv.foundation.lazy.grid.items
import androidx.tv.foundation.lazy.grid.itemsIndexed
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.dao.FavoriteCategoryDao
import it.wavestream.app.data.database.entity.FavoriteCategory
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.components.CategoryFavoriteHeart
import it.wavestream.app.ui.components.categoryLongPress
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.math.abs

/**
 * Data class for category with item count
 */
@Immutable
data class CategoryInfo(
    val name: String,
    val itemCount: Int,
    /** Prima card "Tutti i film" / "Tutte le serie TV": contiene l'intera playlist. */
    val isViewAll: Boolean = false
)

/**
 * Activity for displaying all categories in a grid
 */
@AndroidEntryPoint
class AllCategoriesActivity : ComponentActivity() {
    
    @Inject lateinit var movieDao: MovieDao
    @Inject lateinit var seriesDao: SeriesDao
    @Inject lateinit var favoriteCategoryDao: FavoriteCategoryDao
    @Inject lateinit var userPreferences: UserPreferences
    
    private var contentType: String = "" // "movies" or "series"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        contentType = intent.getStringExtra("contentType") ?: "movies"
        
        setContent {
            WaveStreamTheme {
                AllCategoriesScreen(
                    contentType = contentType,
                    onCategoryClick = { categoryName ->
                        val categoryType = if (contentType == "movies") "CATEGORY_MOVIE" else "CATEGORY_SERIES"
                        val intent = Intent(this, CategoryActivity::class.java).apply {
                            putExtra("categoryName", categoryName)
                            putExtra("contentType", categoryType)
                        }
                        startActivity(intent)
                    },
                    onViewAllClick = {
                        // "Tutti i film" / "Tutte le serie TV" → griglia completa con
                        // sidebar categorie (FilmActivity / SeriesActivity).
                        val intent = if (contentType == "movies") {
                            Intent(this, it.wavestream.app.ui.film.FilmActivity::class.java)
                        } else {
                            Intent(this, it.wavestream.app.ui.series.SeriesActivity::class.java)
                        }
                        startActivity(intent)
                    },
                    onBack = { finish() },
                    loadCategories = { loadCategories() },
                    loadFavorites = {
                        val pid = userPreferences.getCurrentProfileId() ?: 1L
                        val type = if (contentType == "movies") "movies" else "series"
                        favoriteCategoryDao.getFavoriteCategoriesByType(pid, type)
                            .map { it.categoryName }
                            .toSet()
                    },
                    onToggleFavorite = { name ->
                        val pid = userPreferences.getCurrentProfileId() ?: 1L
                        val type = if (contentType == "movies") "movies" else "series"
                        favoriteCategoryDao.toggleFavoriteCategory(
                            FavoriteCategory(profileId = pid, categoryType = type, categoryName = name)
                        )
                    }
                )
            }
        }
    }
    
    private suspend fun loadCategories(): List<CategoryInfo> {
        return withContext(Dispatchers.IO) {
            if (contentType == "movies") {
                // UNA query GROUP BY invece di N+1 COUNT (era la causa del "caricamento").
                val list = movieDao.getCategoriesWithCount().map { c ->
                    CategoryInfo(name = c.name, itemCount = c.count)
                }
                // Fuori ordine alfabetico: "Tutti i film" sempre in prima posizione.
                listOf(
                    CategoryInfo(
                        name = "Tutti i film",
                        itemCount = movieDao.getAllMoviesCount(),
                        isViewAll = true
                    )
                ) + list
            } else {
                val list = seriesDao.getCategoriesWithCount().map { c ->
                    CategoryInfo(name = c.name, itemCount = c.count)
                }
                // Fuori ordine alfabetico: "Tutte le serie TV" sempre in prima posizione.
                listOf(
                    CategoryInfo(
                        name = "Tutte le serie TV",
                        itemCount = seriesDao.getAllSeriesCount(),
                        isViewAll = true
                    )
                ) + list
            }
        }
    }
}

/**
 * All Categories Screen
 */
@Composable
private fun AllCategoriesScreen(
    contentType: String,
    onCategoryClick: (String) -> Unit,
    onViewAllClick: () -> Unit,
    onBack: () -> Unit,
    loadCategories: suspend () -> List<CategoryInfo>,
    loadFavorites: suspend () -> Set<String>,
    onToggleFavorite: suspend (String) -> Unit
) {
    var categories by remember { mutableStateOf<List<CategoryInfo>>(emptyList()) }
    var favoriteCategories by remember { mutableStateOf<Set<String>>(emptySet()) }
    var isLoading by remember { mutableStateOf(true) }
    var searchQuery by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()

    // Ricerca interna alla sezione categorie: filtra solo per nome categoria.
    val filteredCategories = remember(categories, searchQuery) {
        val q = searchQuery.trim()
        if (q.isEmpty()) categories
        else categories.filter { it.name.contains(q, ignoreCase = true) }
    }

    // Focus iniziale sulla prima categoria (non sul bottone indietro)
    val firstCategoryFocusRequester = remember { FocusRequester() }
    
    LaunchedEffect(Unit) {
        isLoading = true
        categories = loadCategories()
        favoriteCategories = loadFavorites()
        isLoading = false
    }

    // Dopo il caricamento porta il focus sulla prima card (attende un paio di
    // frame per essere sicuri che la griglia sia composta/focusable).
    LaunchedEffect(categories, isLoading) {
        if (!isLoading && categories.isNotEmpty()) {
            kotlinx.coroutines.delay(100)
            try {
                firstCategoryFocusRequester.requestFocus()
            } catch (_: Exception) {
                // Requester non ancora collegato: nessun problema.
            }
        }
    }
    
    val title = if (contentType == "movies") "Categorie Film" else "Categorie Serie TV"
    val itemLabel = if (contentType == "movies") "film" else "serie"

    // Fondale coerente con la Home: gradiente accent soft → tinte di fondo.
    val screenBackground = remember {
        Brush.verticalGradient(
            colors = listOf(
                WaveStreamColors.Accent.copy(alpha = 0.045f),
                WaveStreamColors.GradientMiddle,
                WaveStreamColors.GradientBottom
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(screenBackground)
            .padding(horizontal = 24.dp)
    ) {
        // Header FLOTTANTE in vetro: capsula con back + icona + titolo, non più una
        // barra piena a bordo netto. Il conteggio resta fuori, a destra.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            GlassSurface(
                shape = RoundedCornerShape(18.dp),
                fill = GlassTokens.SurfaceFill
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Back button in vetro, focus ad alone
                    FocusedBackButton(onClick = onBack)

                    // Icon (4 squares)
                    FourSquaresIcon(
                        modifier = Modifier.size(22.dp)
                    )

                    // Title
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            // Count (esclude la card "Tutti i film"/"Tutte le serie TV")
            Text(
                text = "${filteredCategories.count { !it.isViewAll }} categorie",
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextSecondary
            )
        }

        // Barra di ricerca interna (solo sezione categorie)
        CategorySearchBar(
            query = searchQuery,
            onQueryChange = { searchQuery = it },
            onClear = { searchQuery = "" }
        )
        
        // Content
        if (isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = WaveStreamColors.Accent)
            }
        } else if (filteredCategories.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (searchQuery.isBlank()) "Nessuna categoria" else "Nessuna categoria trovata per \"$searchQuery\"",
                    style = MaterialTheme.typography.bodyLarge,
                    color = WaveStreamColors.TextSecondary
                )
            }
        } else {
            TvLazyVerticalGrid(
                columns = TvGridCells.Adaptive(minSize = 200.dp),
                contentPadding = PaddingValues(top = 12.dp, bottom = 40.dp),
                horizontalArrangement = Arrangement.spacedBy(14.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(filteredCategories, key = { _, it -> it.name }) { index, category ->
                    val isFav = favoriteCategories.contains(category.name)
                    CategoryCard(
                        category = category,
                        itemLabel = itemLabel,
                        isSeries = contentType == "series",
                        isFavorite = isFav,
                        isViewAll = category.isViewAll,
                        focusRequester = if (index == 0) firstCategoryFocusRequester else null,
                        onClick = {
                            if (category.isViewAll) onViewAllClick()
                            else onCategoryClick(category.name)
                        },
                        onLongPress = {
                            // La card "Tutti i film"/"Tutte le serie TV" non è un preferito
                            if (!category.isViewAll) {
                                favoriteCategories = if (isFav) {
                                    favoriteCategories - category.name
                                } else {
                                    favoriteCategories + category.name
                                }
                                scope.launch { onToggleFavorite(category.name) }
                            }
                        }
                    )
                }
            }
        }
    }
}

/**
 * Category card with background image or gradient fallback
 */
@Composable
private fun CategoryCard(
    category: CategoryInfo,
    itemLabel: String,
    isSeries: Boolean = false,
    isFavorite: Boolean = false,
    isViewAll: Boolean = false,
    focusRequester: FocusRequester? = null,
    onClick: () -> Unit,
    onLongPress: () -> Unit = {}
) {
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "categoryScale"
    )

    // Alone di focus (Fase C2): il focus è una velatura chiara, non un bordo accent
    // accesso. Derivato da UNA sola animazione.
    val focusOverlay by animateFloatAsState(
        targetValue = if (isFocused) 1f else 0f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "categoryFocusOverlay"
    )
    
    // Generate unique gradient colors for fallback
    val gradientColors = remember(category.name) {
        generateGradientColors(category.name)
    }

    // Try to get background image resource ID (mai per la card "Tutti i film")
    val backgroundImageRes = remember(category.name, isSeries, isViewAll) {
        if (isViewAll) null else getCategoryBackgroundImage(context, category.name, isSeries)
    }

    // Dark gradient overlay for text readability (increased opacity)
    val scrimColors = listOf(
        Color.Black.copy(alpha = 0f),
        Color.Black.copy(alpha = 0.85f)
    )

    GlassSurface(
        shape = RoundedCornerShape(14.dp),
        fill = Color.Transparent,
        stroke = GlassTokens.StrokeGradient,
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .height(150.dp)  // Increased from 120dp
            .then(
                if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier
            )
            .focusable(interactionSource = interactionSource)
            .categoryLongPress(onLongPress)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
     Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
        // Background: Image or gradient fallback
        if (isViewAll) {
            // Card "Tutti i film"/"Tutte le serie TV": gradiente accent dedicato
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                WaveStreamColors.Accent,
                                WaveStreamColors.Accent.copy(alpha = 0.35f)
                            ),
                            start = Offset.Zero,
                            end = Offset.Infinite
                        )
                    )
            )
            Icon(
                imageVector = if (isSeries) Icons.Default.Tv else Icons.Default.Movie,
                contentDescription = null,
                tint = Color.White.copy(alpha = 0.35f),
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp)
                    .size(48.dp)
            )
        } else if (backgroundImageRes != null) {
            // Background image - fills entire card with rounded corners
            AsyncImage(
                model = backgroundImageRes,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        } else {
            // Fallback gradient
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            colors = gradientColors,
                            start = Offset.Zero,
                            end = Offset.Infinite
                        )
                    )
            )
        }
        
        // Dark gradient overlay for text readability (SrcOver, mai DstIn)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = scrimColors
                    )
                )
        )

        // Alone di focus (sotto testo e cuoricino, così restano leggibili)
        if (focusOverlay > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White.copy(alpha = 0.16f * focusOverlay))
            )
        }

        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = category.name,
                style = MaterialTheme.typography.titleMedium,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "${category.itemCount} $itemLabel",
                style = MaterialTheme.typography.bodySmall,
                color = Color.White.copy(alpha = 0.8f)
            )
        }

        // Cuoricino rosso in basso a destra quando la categoria è tra i preferiti
        // (mai sulla card "Tutti i film"/"Tutte le serie TV")
        if (!isViewAll) {
            CategoryFavoriteHeart(
                isFavorite = isFavorite,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(12.dp)
            )
        }
     }
    }
}

/**
 * Barra di ricerca interna alla sezione categorie (filtra solo i nomi delle categorie).
 */
@Composable
private fun CategorySearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onClear: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    // Barra custom (non OutlinedTextField): così l'altezza è compatta (42dp) senza che
    // bordo e placeholder vengano tagliati. Vetro + capsula, focus ad alone accent.
    GlassSurface(
        shape = RoundedCornerShape(50),
        fill = GlassTokens.SurfaceFill,
        stroke = if (isFocused) {
            GlassTokens.accentStroke(WaveStreamColors.Accent)
        } else {
            GlassTokens.StrokeGradient
        },
        strokeWidth = if (isFocused) 1.5.dp else 1.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, bottom = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .height(42.dp)
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = WaveStreamColors.TextSecondary,
                modifier = Modifier.size(20.dp)
            )
            Box(modifier = Modifier.weight(1f)) {
                BasicTextField(
                    value = query,
                    onValueChange = onQueryChange,
                    singleLine = true,
                    textStyle = MaterialTheme.typography.bodyMedium.copy(color = WaveStreamColors.TextPrimary),
                    cursorBrush = SolidColor(WaveStreamColors.Accent),
                    // interactionSource passato al field (pattern usato in CreateListDialog):
                    // niente .focusable() esterno, altrimenti il campo prende il focus ma
                    // non riceve la tastiera/cursore.
                    interactionSource = interactionSource,
                    modifier = Modifier.fillMaxWidth(),
                    decorationBox = { inner ->
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            if (query.isEmpty()) {
                                Text(
                                    text = "Cerca categoria...",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = WaveStreamColors.TextTertiary
                                )
                            }
                            inner()
                        }
                    }
                )
            }
            if (query.isNotEmpty()) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(RoundedCornerShape(50))
                        .clickable { onClear() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Cancella",
                        tint = WaveStreamColors.TextSecondary,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

/**
 * Bottone indietro in vetro, focus ad alone (Fase C1).
 *
 * Prima era una capsula col bordo accent acceso sul focus: dentro un header
 * flottante risultava troppo pesante. Ora il focus è solo un alone chiaro, coerente
 * con la floating bar della Home.
 */
@Composable
private fun FocusedBackButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.GlassPillFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "backScale"
    )
    val background by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else Color.Transparent,
        label = "backBg"
    )

    Box(
        modifier = Modifier
            .size(34.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(50))
            .background(background)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "Indietro",
            tint = WaveStreamColors.TextPrimary,
            modifier = Modifier.size(20.dp)
        )
    }
}

/**
 * Four squares icon (grid icon)
 */
@Composable
fun FourSquaresIcon(
    modifier: Modifier = Modifier,
    color: Color = WaveStreamColors.Accent
) {
    Canvas(modifier = modifier) {
        val squareSize = size.minDimension / 2.5f
        val gap = size.minDimension / 10f
        val cornerRadius = CornerRadius(squareSize / 4, squareSize / 4)
        
        // Top-left
        drawRoundRect(
            color = color,
            topLeft = Offset(0f, 0f),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
        
        // Top-right
        drawRoundRect(
            color = color.copy(alpha = 0.7f),
            topLeft = Offset(squareSize + gap, 0f),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
        
        // Bottom-left
        drawRoundRect(
            color = color.copy(alpha = 0.7f),
            topLeft = Offset(0f, squareSize + gap),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
        
        // Bottom-right
        drawRoundRect(
            color = color.copy(alpha = 0.5f),
            topLeft = Offset(squareSize + gap, squareSize + gap),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
    }
}

/**
 * Generate unique gradient colors based on category name hash
 */
private fun generateGradientColors(categoryName: String): List<Color> {
    val hash = abs(categoryName.hashCode())
    
    // Generate hue from hash (0-360)
    val hue = (hash % 360).toFloat()
    
    // Create two colors with same hue but different saturation/lightness
    val color1 = Color.hsl(hue, 0.7f, 0.4f)
    val color2 = Color.hsl((hue + 30) % 360, 0.8f, 0.25f)
    
    return listOf(color1, color2)
}

/**
 * Get category background image resource ID
 * Returns null if image doesn't exist
 * For series: looks for category_bg_series_[name].jpg
 * For movies: looks for category_bg_[name].jpg
 */
private fun getCategoryBackgroundImage(context: android.content.Context, categoryName: String, isSeries: Boolean = false): Int? {
    // Sanitize category name to match file naming convention
    val sanitizedName = categoryName.lowercase()
        .replace(" ", "_")
        .replace("&", "and")
        .replace("à", "a").replace("è", "e").replace("é", "e")
        .replace("ì", "i").replace("ò", "o").replace("ù", "u")
        .filter { it.isLetterOrDigit() || it == '_' }
    
    // Add series prefix for TV series
    val resourceName = if (isSeries) {
        "category_bg_series_$sanitizedName"
    } else {
        "category_bg_$sanitizedName"
    }
    
    // Try to get resource ID
    val resourceId = context.resources.getIdentifier(
        resourceName,
        "drawable",
        context.packageName
    )
    
    return if (resourceId != 0) resourceId else null
}


