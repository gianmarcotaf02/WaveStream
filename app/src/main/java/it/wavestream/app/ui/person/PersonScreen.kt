package it.wavestream.app.ui.person

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.CachePolicy
import it.wavestream.app.data.api.TMDBPersonDetails
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.Series
import it.wavestream.app.ui.theme.WaveStreamColors

@Composable
fun PersonScreen(
    person: TMDBPersonDetails?,
    personName: String,
    libraryMovies: List<Movie>,
    libraryTV: List<Series>,
    isLoading: Boolean,
    onBackClick: () -> Unit,
    onContentClick: (Long, ContentType) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        AnimatedVisibility(
            visible = isLoading,
            enter = fadeIn(tween(300)),
            exit = fadeOut(tween(400))
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = WaveStreamColors.Accent)
            }
        }

        AnimatedVisibility(
            visible = !isLoading,
            enter = fadeIn(tween(600)),
            exit = fadeOut(tween(300))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 48.dp, vertical = 24.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 24.dp)
                ) {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Indietro",
                            tint = WaveStreamColors.TextPrimary
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = person?.name ?: personName,
                        style = MaterialTheme.typography.headlineMedium,
                        color = WaveStreamColors.TextPrimary
                    )
                }

                if (person != null) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp)
                    ) {
                        val profileUrl = person.profilePath?.let {
                            "https://image.tmdb.org/t/p/w342$it"
                        }

                        Box(
                            modifier = Modifier
                                .width(200.dp)
                                .height(300.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(WaveStreamColors.BackgroundTertiary),
                            contentAlignment = Alignment.Center
                        ) {
                            if (profileUrl != null) {
                                AsyncImage(
                                    model = ImageRequest.Builder(androidx.compose.ui.platform.LocalContext.current)
                                        .data(profileUrl)
                                        .diskCachePolicy(CachePolicy.ENABLED)
                                        .memoryCachePolicy(CachePolicy.ENABLED)
                                        .crossfade(true)
                                        .build(),
                                    contentDescription = person.name,
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            } else {
                                Icon(
                                    Icons.Default.Person,
                                    contentDescription = null,
                                    modifier = Modifier.size(64.dp),
                                    tint = WaveStreamColors.TextTertiary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(24.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = person.name ?: personName,
                                style = MaterialTheme.typography.titleLarge,
                                color = WaveStreamColors.TextPrimary,
                                fontWeight = FontWeight.Bold
                            )
                            person.knownForDepartment?.let {
                                Text(
                                    text = it,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = WaveStreamColors.TextPrimary.copy(alpha = 0.6f)
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            person.birthday?.let {
                                Text(
                                    text = "Nato: $it",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = WaveStreamColors.TextPrimary.copy(alpha = 0.7f)
                                )
                            }
                            person.placeOfBirth?.let {
                                Text(
                                    text = "Luogo: $it",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = WaveStreamColors.TextPrimary.copy(alpha = 0.7f)
                                )
                            }
                            Spacer(modifier = Modifier.height(12.dp))
                            person.biography?.let { bio ->
                                ExpandableBiography(bio)
                            }
                        }
                    }
                }

                if (libraryMovies.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "Film in libreria",
                        style = MaterialTheme.typography.titleMedium,
                        color = WaveStreamColors.TextPrimary,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        contentPadding = PaddingValues(end = 16.dp)
                    ) {
                        items(libraryMovies) { movie ->
                            LibraryContentCard(
                                title = movie.title,
                                posterUrl = movie.posterUrl,
                                onClick = { onContentClick(movie.id, ContentType.MOVIE) }
                            )
                        }
                    }
                }

                if (libraryTV.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "Serie in libreria",
                        style = MaterialTheme.typography.titleMedium,
                        color = WaveStreamColors.TextPrimary,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        contentPadding = PaddingValues(end = 16.dp)
                    ) {
                        items(libraryTV) { series ->
                            LibraryContentCard(
                                title = series.title,
                                posterUrl = series.posterUrl,
                                onClick = { onContentClick(series.id, ContentType.SERIES) }
                            )
                        }
                    }
                }

                if (libraryMovies.isEmpty() && libraryTV.isEmpty()) {
                    Spacer(modifier = Modifier.height(48.dp))
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Nessun contenuto trovato in libreria",
                            color = WaveStreamColors.TextPrimary.copy(alpha = 0.5f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ExpandableBiography(biography: String) {
    var isExpanded by remember { mutableStateOf(false) }
    val maxLines = if (isExpanded) Int.MAX_VALUE else 4

    Column {
        Text(
            text = biography,
            style = MaterialTheme.typography.bodyMedium,
            color = WaveStreamColors.TextSecondary,
            maxLines = maxLines,
            overflow = TextOverflow.Ellipsis
        )
        if (biography.length > 200) {
            Text(
                text = if (isExpanded) "Leggi meno" else "Leggi di più",
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.Accent,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(top = 4.dp)
                    .clickable { isExpanded = !isExpanded }
            )
        }
    }
}

@Composable
private fun LibraryContentCard(
    title: String,
    posterUrl: String?,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "cardScale"
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(140.dp)
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .clip(RoundedCornerShape(12.dp))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .focusable()
    ) {
        Box(
            modifier = Modifier
                .width(140.dp)
                .height(210.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(WaveStreamColors.BackgroundTertiary),
            contentAlignment = Alignment.Center
        ) {
            if (posterUrl != null) {
                AsyncImage(
                    model = ImageRequest.Builder(androidx.compose.ui.platform.LocalContext.current)
                        .data(posterUrl)
                        .diskCachePolicy(CachePolicy.ENABLED)
                        .memoryCachePolicy(CachePolicy.ENABLED)
                        .crossfade(true)
                        .build(),
                    contentDescription = title,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            } else {
                Icon(
                    Icons.Default.Person,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = WaveStreamColors.TextTertiary
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.labelSmall,
            color = WaveStreamColors.TextPrimary,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            fontSize = 12.sp
        )
    }
}
