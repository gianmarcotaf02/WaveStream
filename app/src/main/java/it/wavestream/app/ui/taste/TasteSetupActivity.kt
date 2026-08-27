package it.wavestream.app.ui.taste

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.UserTaste
import it.wavestream.app.data.tmdb.TMDBService
import it.wavestream.app.ui.loading.LoadingActivity
import it.wavestream.app.ui.components.FocusedButton
import it.wavestream.app.ui.components.OnboardingBackground
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.delay

@AndroidEntryPoint
class TasteSetupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaveStreamTheme {
                TasteSetupScreen(
                    onComplete = {
                        startActivity(Intent(this, LoadingActivity::class.java).apply {
                            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        })
                        finish()
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TasteSetupScreen(
    onComplete: () -> Unit,
    viewModel: TasteSetupViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(state.isComplete) {
        if (state.isComplete) onComplete()
    }

    OnboardingBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
        ) {
            TopAppBar(
                title = {
                    Text(
                        when (state.currentStep) {
                            0 -> "I tuoi generi preferiti"
                            1 -> "Film e serie che hai visto"
                            else -> "Preferenze"
                        },
                        color = Color.White
                    )
                },
                navigationIcon = {
                    if (state.currentStep > 0) {
                        IconButton(onClick = { viewModel.goToStep(state.currentStep - 1) }) {
                            Icon(Icons.Default.ArrowBack, contentDescription = "Indietro", tint = Color.White)
                        }
                    }
                },
                actions = {
                    TextButton(onClick = { viewModel.skip() }) {
                        Text("Salta", color = Color.White.copy(alpha = 0.7f))
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                )
            )

            StepIndicator(currentStep = state.currentStep, totalSteps = 2)

            when (state.currentStep) {
                0 -> GenresStep(viewModel, state)
                1 -> WatchedStep(viewModel, state)
            }
        }
    }
}

@Composable
private fun StepIndicator(currentStep: Int, totalSteps: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 0 until totalSteps) {
            Box(
                modifier = Modifier
                    .size(if (i == currentStep) 12.dp else 8.dp)
                    .clip(CircleShape)
                    .background(
                        if (i <= currentStep) WaveStreamColors.Accent
                        else MaterialTheme.colorScheme.surfaceVariant
                    )
            )
            if (i < totalSteps - 1) {
                Box(
                    modifier = Modifier
                        .width(24.dp)
                        .height(2.dp)
                        .background(
                            if (i < currentStep) WaveStreamColors.Accent
                            else MaterialTheme.colorScheme.surfaceVariant
                        )
                )
            }
        }
    }
}

@Composable
private fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    isSearching: Boolean,
    onSearch: () -> Unit = {}
) {
    OutlinedTextField(
        value = query,
        onValueChange = onQueryChange,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        placeholder = { Text("Cerca film o serie...") },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
        trailingIcon = {
            if (isSearching) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    strokeWidth = 2.dp
                )
            } else if (query.isNotEmpty()) {
                IconButton(onClick = { onQueryChange("") }) {
                    Icon(Icons.Default.Clear, contentDescription = "Cancella")
                }
            }
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearch() }),
        shape = RoundedCornerShape(12.dp)
    )
}

@Composable
private fun SearchResultsRow(
    results: List<TMDBService.TMDBItem>,
    addedTmdbIds: Set<Int>,
    onAdd: (TMDBService.TMDBItem) -> Unit,
    firstResultFocusRequester: FocusRequester? = null
) {
    if (results.isEmpty()) return

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(results, key = { it.id }) { item ->
            val isAdded = item.id in addedTmdbIds
            val isFirst = item.id == results.firstOrNull()?.id
            SearchResultCard(
                item = item,
                isAdded = isAdded,
                onClick = { if (!isAdded) onAdd(item) },
                focusRequester = if (isFirst) firstResultFocusRequester else null
            )
        }
    }
}

@Composable
private fun SearchResultCard(
    item: TMDBService.TMDBItem,
    isAdded: Boolean,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val focusScale by animateFloatAsState(
        targetValue = if (isFocused && !isAdded) 1.05f else 1f,
        label = "cardScale"
    )

    val borderColor by animateColorAsState(
        targetValue = if (isFocused && !isAdded) WaveStreamColors.Accent else Color.Transparent,
        label = "cardBorder"
    )

    Card(
        modifier = Modifier
            .width(140.dp)
            .graphicsLayer {
                scaleX = focusScale
                scaleY = focusScale
            }
            .border(2.dp, borderColor, RoundedCornerShape(12.dp))
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource, enabled = !isAdded)
            .clickable(interactionSource = interactionSource, indication = null, enabled = !isAdded, onClick = onClick),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isAdded) MaterialTheme.colorScheme.primaryContainer
            else MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column {
            Box(modifier = Modifier.height(200.dp)) {
                if (item.posterPath != null) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://image.tmdb.org/t/p/w342${item.posterPath}")
                            .crossfade(true)
                            .build(),
                        contentDescription = item.title,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(MaterialTheme.colorScheme.surfaceVariant),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Default.Movie,
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                if (isAdded) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(4.dp)
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.primary),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Default.Check,
                            contentDescription = "Aggiunto",
                            modifier = Modifier.size(16.dp),
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            }
            Text(
                text = item.title,
                modifier = Modifier.padding(8.dp),
                maxLines = 2,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Composable
private fun AddedItemsList(
    items: List<UserTaste>,
    onRemove: (Int, ContentType) -> Unit,
    modifier: Modifier = Modifier
) {
    if (items.isEmpty()) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Nessun elemento aggiunto.\nCerca e tocca per aggiungere.",
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        return
    }

    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = "Aggiunti (${items.size})",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(items, key = { it.tmdbId }) { item ->
                AddedItemRow(item = item, onRemove = { onRemove(item.tmdbId, item.contentType) })
            }
        }
    }
}

@Composable
private fun AddedItemRow(
    item: UserTaste,
    onRemove: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "addedItemBorder"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .border(2.dp, borderColor, RoundedCornerShape(8.dp))
            .focusable(interactionSource = interactionSource)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.size(48.dp)) {
            if (item.posterPath != null) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://image.tmdb.org/t/p/w92${item.posterPath}")
                        .crossfade(true)
                        .build(),
                    contentDescription = item.title,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.Crop
                )
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(4.dp))
                        .background(MaterialTheme.colorScheme.surface),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Default.Movie, contentDescription = null, modifier = Modifier.size(24.dp))
                }
            }
        }
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = item.title, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Medium)
            if (item.year != null) {
                Text(text = item.year.toString(), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
        IconButton(onClick = onRemove) {
            Icon(Icons.Default.Close, contentDescription = "Rimuovi", tint = MaterialTheme.colorScheme.error)
        }
    }
}

@Composable
private fun GenreChip(
    name: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val focusScale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "genreScale"
    )
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "genreBorder"
    )
    val containerColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent
            isFocused -> Color.White.copy(alpha = 0.2f)
            else -> Color.White.copy(alpha = 0.1f)
        },
        label = "genreBg"
    )
    val labelColor by animateColorAsState(
        targetValue = when {
            isSelected -> Color.White
            isFocused -> Color.White
            else -> Color.White.copy(alpha = 0.7f)
        },
        label = "genreLabelColor"
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .graphicsLayer {
                scaleX = focusScale
                scaleY = focusScale
            }
            .clip(RoundedCornerShape(12.dp))
            .background(containerColor)
            .border(2.dp, borderColor, RoundedCornerShape(12.dp))
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = name,
            fontSize = 14.sp,
            color = labelColor,
            fontWeight = if (isSelected || isFocused) FontWeight.SemiBold else FontWeight.Normal,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun GenresStep(viewModel: TasteSetupViewModel, state: TasteSetupState) {
    val canContinue = state.selectedGenres.size >= 2

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Seleziona almeno 2 generi che preferisci",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White.copy(alpha = 0.9f)
        )
        Text(
            text = "Questo ci aiuterà a suggerirti contenuti migliori.",
            modifier = Modifier.padding(horizontal = 16.dp),
            style = MaterialTheme.typography.bodySmall,
            color = Color.White.copy(alpha = 0.5f)
        )

        if (state.selectedGenres.size < 2) {
            Text(
                text = "Seleziona almeno ${2 - state.selectedGenres.size} genere/i",
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.error
            )
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(viewModel.movieGenres) { genre ->
                val isSelected = genre.id in state.selectedGenres
                GenreChip(
                    name = genre.name,
                    isSelected = isSelected,
                    onClick = { viewModel.toggleGenre(genre.id) }
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))
        NextButton(
            text = "Continua",
            enabled = canContinue,
            onClick = { viewModel.goToStep(1) }
        )
    }
}

@Composable
private fun WatchedStep(viewModel: TasteSetupViewModel, state: TasteSetupState) {
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current
    val firstResultFocusRequester = remember { FocusRequester() }
    val hasResults = state.searchResults.isNotEmpty()
    var hasAutoFocusedResults by remember { mutableStateOf(false) }

    LaunchedEffect(state.searchQuery) {
        if (state.searchQuery.isEmpty()) {
            hasAutoFocusedResults = false
        }
    }

    LaunchedEffect(hasResults) {
        if (hasResults && !hasAutoFocusedResults) {
            delay(300)
            try {
                firstResultFocusRequester.requestFocus()
                hasAutoFocusedResults = true
            } catch (_: Exception) { }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
        ) {
            Text(
                text = "Aggiungi film e serie che hai già visto (opzionale)",
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White.copy(alpha = 0.9f)
            )

            SearchBar(
                query = state.searchQuery,
                onQueryChange = { viewModel.search(it) },
                isSearching = state.isSearching,
                onSearch = {
                    focusManager.clearFocus()
                    keyboardController?.hide()
                }
            )

            SearchResultsRow(
                results = state.searchResults,
                addedTmdbIds = state.watchedItems.map { it.tmdbId }.toSet(),
                onAdd = { viewModel.addItem(it) },
                firstResultFocusRequester = firstResultFocusRequester
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                AddedItemsList(
                    items = state.watchedItems,
                    onRemove = { tmdbId, _ -> viewModel.removeItem(tmdbId, ContentType.MOVIE) }
                )
            }
        }

        FocusedButton(
            onClick = { viewModel.saveAndComplete() },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp, start = 16.dp, end = 16.dp),
            width = 240.dp,
            height = 56.dp,
            borderRadius = 16.dp,
            focusBorderColor = WaveStreamColors.TextPrimary
        ) {
            Text("Continua")
        }
    }
}

@Composable
private fun NextButton(text: String, enabled: Boolean = true, onClick: () -> Unit) {
    FocusedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        height = 56.dp,
        borderRadius = 16.dp,
        focusBorderColor = WaveStreamColors.TextPrimary
    ) {
        Text(text)
    }
}
