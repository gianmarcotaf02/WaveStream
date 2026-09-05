package it.wavestream.app.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImage
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.ui.theme.WaveStreamColors

data class SerieAChannelPickerState(
    val match: SerieAMatchEntity,
    val channels: List<Channel>,
    val isLoading: Boolean = false
)

/** Stato del tabellino (incidents + formazioni) mostrato nel match center. */
data class SerieATabellinoState(
    val loading: Boolean = false,
    val tabellino: SerieATabellino? = null,
    val error: Boolean = false
)

/**
 * Dialog with the playlist channels that broadcast the match (matched via
 * team-name aliases), grouped by category with visible category headers.
 * D-pad navigable, click → player.
 */
@Composable
fun SerieAChannelPickerDialog(
    match: SerieAMatchEntity,
    channels: List<Channel>,
    isLoading: Boolean,
    onDismiss: () -> Unit,
    onChannelClick: (Channel) -> Unit,
    modifier: Modifier = Modifier
) {
    // Channels grouped by category, categories sorted alphabetically
    val grouped: List<Pair<String, List<Channel>>> = remember(channels) {
        channels
            .groupBy { it.category?.trim()?.takeUnless { c -> c.isEmpty() } ?: "Altri canali" }
            .map { (category, chans) -> category to chans.sortedBy { it.name.lowercase() } }
            .sortedBy { it.first.lowercase() }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth(0.72f)
                .fillMaxHeight(0.82f)
                .clip(RoundedCornerShape(24.dp))
                .background(WaveStreamColors.BackgroundSecondary)
                .border(1.dp, Color.White.copy(alpha = 0.08f), RoundedCornerShape(24.dp))
                .padding(32.dp)
        ) {
            // Header
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(Modifier.weight(1f)) {
                    if (match.isLive) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Box(
                                Modifier
                                    .size(8.dp)
                                    .background(Color(0xFFE01B2C), CircleShape)
                            )
                            Text(
                                text = "LIVE",
                                color = Color(0xFFE01B2C),
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp,
                                letterSpacing = 2.sp
                            )
                        }
                        Spacer(Modifier.height(4.dp))
                    }
                    Text(
                        text = "${match.homeShortName} - ${match.awayShortName}",
                        style = MaterialTheme.typography.headlineSmall,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Canali che trasmettono la partita",
                        style = MaterialTheme.typography.bodyMedium,
                        color = WaveStreamColors.TextSecondary
                    )
                }
                CloseButton(onDismiss)
            }

            Spacer(Modifier.height(24.dp))

            when {
                isLoading -> {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "Ricerca canali in corso…",
                            color = WaveStreamColors.TextSecondary
                        )
                    }
                }
                grouped.isEmpty() -> {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "Nessun canale trovato per questa partita nella tua playlist",
                            color = WaveStreamColors.TextSecondary,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                else -> {
                    val firstFocusRequester = remember { FocusRequester() }
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        grouped.forEach { (category, chans) ->
                            // Category header
                            item(key = "header_$category") {
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                                    ) {
                                        Text(
                                            text = category.uppercase(),
                                            style = MaterialTheme.typography.titleSmall,
                                            color = WaveStreamColors.Accent,
                                            fontWeight = FontWeight.Bold,
                                            letterSpacing = 2.sp
                                        )
                                        Text(
                                            text = "(${chans.size})",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = WaveStreamColors.TextSecondary
                                        )
                                    }
                                    Spacer(Modifier.height(4.dp))
                                    Box(
                                        Modifier
                                            .fillMaxWidth()
                                            .height(1.dp)
                                            .background(Color.White.copy(alpha = 0.08f))
                                    )
                                }
                            }
                            // Channel cards, 2 per row
                            item(key = "grid_$category") {
                                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                                    chans.chunked(2).forEach { rowChans ->
                                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                                            rowChans.forEachIndexed { index, channel ->
                                                val isFirstOverall =
                                                    category === grouped.first().first &&
                                                        rowChans === chans.take(2) && index == 0
                                                Box(Modifier.weight(1f)) {
                                                    ChannelPickCard(
                                                        channel = channel,
                                                        modifier = if (isFirstOverall) {
                                                            Modifier.focusRequester(firstFocusRequester)
                                                        } else {
                                                            Modifier
                                                        }
                                                    ) {
                                                        onChannelClick(channel)
                                                    }
                                                }
                                            }
                                            // Pad incomplete rows so cards keep equal width
                                            repeat(2 - rowChans.size) {
                                                Spacer(Modifier.weight(1f))
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    // Request focus once the first card is laid out
                    Box(
                        Modifier
                            .size(1.dp)
                            .onGloballyPositioned {
                                runCatching { firstFocusRequester.requestFocus() }
                            }
                    )
                }
            }
        }
    }
}

@Composable
private fun CloseButton(onDismiss: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(44.dp)
            .graphicsLayer {
                val s = if (isFocused) 1.1f else 1f
                scaleX = s
                scaleY = s
            }
            .background(
                color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.BackgroundTertiary,
                shape = CircleShape
            )
            .border(
                width = if (isFocused) 2.dp else 0.dp,
                color = if (isFocused) Color.White else Color.Transparent,
                shape = CircleShape
            )
            .clip(CircleShape)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onDismiss)
            .focusable(interactionSource = interactionSource)
    ) {
        Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = "Chiudi",
            tint = Color.White
        )
    }
}

@Composable
private fun ChannelPickCard(
    channel: Channel,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .graphicsLayer {
                val s = if (isFocused) 1.05f else 1f
                scaleX = s
                scaleY = s
            }
            .fillMaxWidth()
            .background(
                color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.BackgroundTertiary,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = if (isFocused) 2.dp else 0.dp,
                color = if (isFocused) Color.White else Color.Transparent,
                shape = RoundedCornerShape(12.dp)
            )
            .clip(RoundedCornerShape(12.dp))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .focusable(interactionSource = interactionSource)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        AsyncImage(
            model = channel.logoUrl,
            contentDescription = null,
            modifier = Modifier.size(44.dp)
        )
        Text(
            text = channel.name,
            color = Color.White,
            fontWeight = if (isFocused) FontWeight.Bold else FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Filled.PlayArrow,
            contentDescription = null,
            tint = Color.White.copy(alpha = 0.9f)
        )
    }
}
