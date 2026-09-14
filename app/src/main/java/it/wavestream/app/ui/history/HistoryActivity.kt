package it.wavestream.app.ui.history

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.tv.foundation.lazy.grid.TvGridCells
import androidx.tv.foundation.lazy.grid.TvGridItemSpan
import androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid
import androidx.tv.foundation.lazy.grid.items as tvGridItems
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.RecentlyWatchedDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.dao.WatchProgressDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.launch
import javax.inject.Inject

/** Voce della cronologia mostrata nella schermata di gestione. */
data class HistoryEntry(
    val key: String,
    val progressId: Long? = null,
    val seriesId: Long? = null,
    val contentId: Long,
    val contentType: String,
    val title: String,
    val posterUrl: String?,
    val subtitle: String,
    val lastWatchedAt: Long
)

/**
 * Gestione della cronologia: selezione multipla con checkbox, eliminazione
 * dei singoli elementi oppure di tutta la cronologia.
 */
@AndroidEntryPoint
class HistoryActivity : ComponentActivity() {

    @Inject lateinit var movieDao: MovieDao
    @Inject lateinit var seriesDao: SeriesDao
    @Inject lateinit var channelDao: ChannelDao
    @Inject lateinit var watchProgressDao: WatchProgressDao
    @Inject lateinit var recentlyWatchedDao: RecentlyWatchedDao
    @Inject lateinit var userPreferences: UserPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaveStreamTheme {
                HistoryScreenContent()
            }
        }
    }

    @Composable
    private fun HistoryScreenContent() {
        var entries by remember { mutableStateOf<List<HistoryEntry>>(emptyList()) }
        var selectedKeys by remember { mutableStateOf<Set<String>>(emptySet()) }
        var isLoading by remember { mutableStateOf(true) }
        var profileId by remember { mutableStateOf(1L) }
        var showDeleteAllDialog by remember { mutableStateOf(false) }
        var showDeleteSelectedDialog by remember { mutableStateOf(false) }

        suspend fun loadEntries(pid: Long) {
            val all = watchProgressDao.getRecentlyWatched(pid, 200)

            val movieProgress = all.filter { it.contentType == ContentType.MOVIE }
            val seriesProgress = all
                .filter { it.contentType == ContentType.SERIES || it.contentType == ContentType.EPISODE }
                .sortedByDescending { it.lastWatchedAt }
            val channelProgress = all.filter { it.contentType == ContentType.CHANNEL }

            val moviesById = if (movieProgress.isNotEmpty()) {
                movieDao.getMoviesByIds(movieProgress.map { it.contentId }.distinct()).associateBy { it.id }
            } else emptyMap()

            val seriesIds = seriesProgress.map { it.seriesId ?: it.contentId }.distinct()
            val seriesById = if (seriesIds.isNotEmpty()) {
                seriesDao.getSeriesByIds(seriesIds).associateBy { it.id }
            } else emptyMap()

            val result = mutableListOf<HistoryEntry>()

            // 1. Film
            movieProgress.forEach { p ->
                val m = moviesById[p.contentId] ?: return@forEach
                result += HistoryEntry(
                    key = "movie_${p.contentId}",
                    progressId = p.id,
                    contentId = p.contentId,
                    contentType = "MOVIE",
                    title = m.tmdbTitle ?: m.name,
                    posterUrl = m.posterUrl,
                    subtitle = "Film",
                    lastWatchedAt = p.lastWatchedAt
                )
            }

            // 2. Serie TV (dedup per seriesId, mantiene l'episodio più recente)
            val seenSeries = mutableSetOf<Long>()
            seriesProgress.forEach { p ->
                val sid = p.seriesId ?: p.contentId
                if (!seenSeries.add(sid)) return@forEach
                val s = seriesById[sid] ?: return@forEach
                val label = if (p.season != null && p.episode != null) {
                    "Serie TV · S${p.season} E${p.episode}"
                } else {
                    "Serie TV"
                }
                result += HistoryEntry(
                    key = "series_$sid",
                    progressId = p.id,
                    seriesId = sid,
                    contentId = sid,
                    contentType = "SERIES",
                    title = s.tmdbName ?: s.name,
                    posterUrl = s.posterUrl,
                    subtitle = label,
                    lastWatchedAt = p.lastWatchedAt
                )
            }

            // 3. Canali (fonte primaria: recently_watched_channels)
            val recentChannelIds = recentlyWatchedDao.getRecentChannelIds(0L)
            val channelsById = if (recentChannelIds.isNotEmpty()) {
                channelDao.getChannelsByIds(recentChannelIds).associateBy { it.id }
            } else emptyMap()
            val seenChannels = mutableSetOf<Long>()
            recentChannelIds.forEach { id ->
                val c = channelsById[id] ?: return@forEach
                seenChannels.add(id)
                result += HistoryEntry(
                    key = "channel_$id",
                    contentId = id,
                    contentType = "CHANNEL",
                    title = c.name,
                    posterUrl = c.logoUrl,
                    subtitle = "Canale live",
                    lastWatchedAt = 0L
                )
            }
            // Fallback: canali eventualmente tracciati in watch_progress
            channelProgress.forEach { p ->
                if (!seenChannels.add(p.contentId)) return@forEach
                val c = channelDao.getChannelById(p.contentId) ?: return@forEach
                result += HistoryEntry(
                    key = "channel_${p.contentId}",
                    progressId = p.id,
                    contentId = p.contentId,
                    contentType = "CHANNEL",
                    title = c.name,
                    posterUrl = c.logoUrl,
                    subtitle = "Canale live",
                    lastWatchedAt = p.lastWatchedAt
                )
            }

            entries = result.sortedByDescending { it.lastWatchedAt }
        }

        fun reload() {
            lifecycleScope.launch {
                isLoading = true
                loadEntries(profileId)
                isLoading = false
            }
        }

        fun deleteSelected() {
            lifecycleScope.launch {
                val chosen = entries.filter { it.key in selectedKeys }
                val progressIds = chosen.mapNotNull { it.progressId }
                val seriesIds = chosen.mapNotNull { it.seriesId }.distinct()
                val channelIds = chosen.filter { it.contentType == "CHANNEL" }.map { it.contentId }

                if (progressIds.isNotEmpty()) {
                    watchProgressDao.deleteByIds(profileId, progressIds)
                }
                seriesIds.forEach { watchProgressDao.deleteProgressBySeriesId(profileId, it) }
                if (channelIds.isNotEmpty()) {
                    recentlyWatchedDao.deleteByChannelIds(channelIds)
                }

                selectedKeys = emptySet()
                loadEntries(profileId)
            }
        }

        fun deleteAll() {
            lifecycleScope.launch {
                watchProgressDao.deleteAllForProfile(profileId)
                recentlyWatchedDao.clearAll()
                selectedKeys = emptySet()
                loadEntries(profileId)
            }
        }

        LaunchedEffect(Unit) {
            profileId = userPreferences.getCurrentProfileId() ?: 1L
            isLoading = true
            loadEntries(profileId)
            isLoading = false
        }

        HistoryScreen(
            entries = entries,
            selectedKeys = selectedKeys,
            isLoading = isLoading,
            onToggleSelection = { key ->
                selectedKeys = if (selectedKeys.contains(key)) selectedKeys - key else selectedKeys + key
            },
            onSelectAll = { selectedKeys = entries.map { it.key }.toSet() },
            onDeselectAll = { selectedKeys = emptySet() },
            onDeleteSelected = { if (selectedKeys.isNotEmpty()) showDeleteSelectedDialog = true },
            onDeleteAll = { showDeleteAllDialog = true },
            onBackClick = { finish() }
        )

        if (showDeleteAllDialog) {
            AlertDialog(
                onDismissRequest = { showDeleteAllDialog = false },
                title = { Text("Eliminare tutta la cronologia?") },
                text = { Text("Verranno rimossi tutti i contenuti visti di recente per questo profilo.") },
                confirmButton = {
                    TextButton(onClick = {
                        showDeleteAllDialog = false
                        deleteAll()
                    }) { Text("Elimina tutto", color = WaveStreamColors.Error) }
                },
                dismissButton = {
                    TextButton(onClick = { showDeleteAllDialog = false }) { Text("Annulla") }
                }
            )
        }

        if (showDeleteSelectedDialog) {
            AlertDialog(
                onDismissRequest = { showDeleteSelectedDialog = false },
                title = { Text("Sei un codardo!") },
                text = {
                    Text(
                        "Hai scelto di eliminare solo ${selectedKeys.size} contenuti. " +
                            "Eliminare l'intera cronologia ti spaventa?"
                    )
                },
                confirmButton = {
                    TextButton(onClick = {
                        showDeleteSelectedDialog = false
                        deleteSelected()
                    }) { Text("Sì, sono un codardo", color = WaveStreamColors.Accent) }
                },
                dismissButton = {
                    TextButton(onClick = { showDeleteSelectedDialog = false }) { Text("Ci ho ripensato") }
                }
            )
        }
    }
}

@Composable
private fun HistoryScreen(
    entries: List<HistoryEntry>,
    selectedKeys: Set<String>,
    isLoading: Boolean,
    onToggleSelection: (String) -> Unit,
    onSelectAll: () -> Unit,
    onDeselectAll: () -> Unit,
    onDeleteSelected: () -> Unit,
    onDeleteAll: () -> Unit,
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
            .padding(24.dp)
    ) {
        // Header
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = onBackClick, modifier = Modifier.size(40.dp)) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Indietro",
                    tint = WaveStreamColors.TextPrimary
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Gestisci cronologia",
                    style = MaterialTheme.typography.headlineMedium,
                    color = WaveStreamColors.TextPrimary,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = if (selectedKeys.isEmpty()) "${entries.size} contenuti"
                    else "${selectedKeys.size} selezionati",
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Actions
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            HistoryActionButton(
                label = "Seleziona tutti",
                icon = Icons.Default.Check,
                enabled = entries.isNotEmpty(),
                onClick = onSelectAll
            )
            HistoryActionButton(
                label = "Deseleziona",
                icon = Icons.Default.Close,
                enabled = selectedKeys.isNotEmpty(),
                onClick = onDeselectAll
            )
            HistoryActionButton(
                label = "Elimina selezionati (${selectedKeys.size})",
                icon = Icons.Default.Delete,
                enabled = selectedKeys.isNotEmpty(),
                onClick = onDeleteSelected
            )
            HistoryActionButton(
                label = "Elimina tutto",
                icon = Icons.Default.Delete,
                enabled = entries.isNotEmpty(),
                danger = true,
                onClick = onDeleteAll
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        when {
            isLoading -> {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = WaveStreamColors.Accent)
                }
            }
            entries.isEmpty() -> {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Nessuna cronologia",
                            style = MaterialTheme.typography.headlineSmall,
                            color = WaveStreamColors.TextPrimary,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "I contenuti visti di recente appariranno qui",
                            style = MaterialTheme.typography.bodyMedium,
                            color = WaveStreamColors.TextSecondary
                        )
                    }
                }
            }
            else -> {
                TvLazyVerticalGrid(
                    columns = TvGridCells.Adaptive(minSize = 180.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    tvGridItems(entries, key = { it.key }) { entry ->
                        HistoryCard(
                            entry = entry,
                            isSelected = entry.key in selectedKeys,
                            onClick = { onToggleSelection(entry.key) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun HistoryActionButton(
    label: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    enabled: Boolean,
    danger: Boolean = false,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val accent = if (danger) WaveStreamColors.Error else WaveStreamColors.Accent
    val background by animateColorAsState(
        targetValue = when {
            isFocused && enabled -> accent.copy(alpha = 0.28f)
            else -> WaveStreamColors.BackgroundSecondary.copy(alpha = 0.8f)
        },
        label = "historyActionBg"
    )
    val scale by animateFloatAsState(if (isFocused && enabled) 1.05f else 1f, label = "historyActionScale")

    Row(
        modifier = Modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, if (isFocused && enabled) accent else Color.Transparent, RoundedCornerShape(8.dp))
            .background(background)
            .focusable(enabled = enabled, interactionSource = interactionSource)
            .clickable(enabled = enabled, interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = if (enabled) accent else WaveStreamColors.TextDisabled,
            modifier = Modifier.size(18.dp)
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge,
            color = if (enabled) WaveStreamColors.TextPrimary else WaveStreamColors.TextDisabled,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun HistoryCard(
    entry: HistoryEntry,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(if (isFocused) 1.06f else 1f, label = "historyCardScale")
    val borderColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.Accent.copy(alpha = 0.7f)
            else -> Color.Transparent
        },
        label = "historyCardBorder"
    )

    Column(
        modifier = Modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .width(180.dp)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(if (isSelected) 3.dp else 2.dp, borderColor, RoundedCornerShape(8.dp))
                .background(WaveStreamColors.CardBackground)
        ) {
            AsyncImage(
                model = entry.posterUrl,
                contentDescription = entry.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Checkbox selezione
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(Color.Black.copy(alpha = 0.55f))
            ) {
                Checkbox(
                    checked = isSelected,
                    onCheckedChange = null,
                    colors = CheckboxDefaults.colors(
                        checkedColor = WaveStreamColors.Accent,
                        uncheckedColor = Color.White,
                        checkmarkColor = Color.White
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = entry.title,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isFocused || isSelected) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            lineHeight = 18.sp
        )
        Text(
            text = entry.subtitle,
            style = MaterialTheme.typography.labelSmall,
            color = WaveStreamColors.TextTertiary
        )
    }
}
