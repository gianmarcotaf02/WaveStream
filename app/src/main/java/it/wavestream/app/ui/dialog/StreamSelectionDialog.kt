package it.wavestream.app.ui.dialog

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import it.wavestream.app.data.database.entity.StreamProvider
import it.wavestream.app.data.database.entity.StreamQuality
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * Dialog mostrato quando un film unificato ha più versioni/sorgenti.
 *
 * Ogni riga mostra: titolo del contenuto, qualità rilevata dal VOD, categoria di
 * appartenenza e durata (per sicurezza). Le sorgenti arrivano già ordinate per
 * qualità decrescente dal DAO.
 */
@Composable
fun MovieSourceDialog(
    movieTitle: String,
    sources: List<StreamProvider>,
    fallbackDurationSeconds: Long? = null,
    onSelect: (StreamProvider) -> Unit,
    onDismiss: () -> Unit
) {
    val firstFocus = remember { FocusRequester() }

    Dialog(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .width(560.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(WaveStreamColors.BackgroundSecondary)
                .padding(24.dp)
        ) {
            Text(
                text = movieTitle,
                style = MaterialTheme.typography.headlineSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = if (sources.size == 1) "1 versione disponibile" else "${sources.size} versioni disponibili",
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextSecondary
            )
            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.heightIn(max = 420.dp)
            ) {
                itemsIndexed(sources, key = { _, p -> p.id }) { index, provider ->
                    SourceItem(
                        provider = provider,
                        fallbackDurationSeconds = fallbackDurationSeconds,
                        focusRequester = if (index == 0) firstFocus else null,
                        onClick = { onSelect(provider) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            TextButton(
                onClick = onDismiss,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = "Annulla", color = WaveStreamColors.TextSecondary)
            }
        }
    }

    LaunchedEffect(Unit) {
        runCatching { firstFocus.requestFocus() }
    }
}

@Composable
private fun SourceItem(
    provider: StreamProvider,
    fallbackDurationSeconds: Long?,
    focusRequester: FocusRequester?,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent.copy(alpha = 0.2f) else WaveStreamColors.BackgroundTertiary,
        label = "sourceBg"
    )
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "sourceBorder"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .border(2.dp, borderColor, RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = provider.originalName,
                style = MaterialTheme.typography.bodyLarge,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Medium,
                maxLines = 2
            )

            val subtitleParts = buildList {
                provider.category?.takeIf { it.isNotBlank() }?.let { add(it) }
                provider.language?.let { add(it) }
                if (provider.isExtended) add("Extended")
                if (provider.isHdr) add("HDR")
                formatDuration(provider.durationSeconds ?: fallbackDurationSeconds)?.let { add(it) }
            }
            if (subtitleParts.isNotEmpty()) {
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = subtitleParts.joinToString(" • "),
                    style = MaterialTheme.typography.bodySmall,
                    color = WaveStreamColors.TextTertiary
                )
            }
        }

        Spacer(modifier = Modifier.width(12.dp))

        val qualityText = qualityLabel(provider)
        if (qualityText.isNotEmpty()) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(WaveStreamColors.Accent)
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = qualityText,
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

private fun qualityLabel(provider: StreamProvider): String = buildString {
    val base = when (provider.quality) {
        StreamQuality.AUTO -> "AUTO"
        StreamQuality.UHD_4K, StreamQuality.UHD -> "4K"
        StreamQuality.FHD -> "FHD"
        StreamQuality.HD -> "HD"
        StreamQuality.SD -> "SD"
        StreamQuality.UNKNOWN -> ""
    }
    append(base)
    val res = provider.resolution
    if (res != null && res.isNotBlank() && !base.contains(res)) {
        if (isNotEmpty()) append(" ")
        append(res)
    }
}

/** Formatta una durata in secondi come "1h 32m" (o "45 min"). */
private fun formatDuration(seconds: Long?): String? {
    if (seconds == null || seconds <= 0) return null
    val totalMinutes = seconds / 60
    return if (totalMinutes >= 60) {
        val h = totalMinutes / 60
        val m = totalMinutes % 60
        if (m == 0L) "${h}h" else "${h}h ${m}m"
    } else {
        "$totalMinutes min"
    }
}
