package it.wavestream.app.ui.dialog

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import it.wavestream.app.data.database.entity.StreamProvider
import it.wavestream.app.data.database.entity.StreamQuality
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import kotlinx.coroutines.delay

/**
 * Dialog mostrato quando un film unificato ha più versioni/sorgenti.
 *
 * Stile **Liquid Glass**: pannello in vetro (fill semitrasparente + bordo a
 * gradiente, blur su API 31+), righe sorgente che si "accendono" al focus con
 * alone accent, coerente con la topbar della Home e i bottoni del detail view.
 *
 * Ogni riga mostra: titolo del contenuto, qualità rilevata dal VOD, categoria di
 * appartenenza e durata. Le sorgenti arrivano già ordinate per qualità dal DAO.
 *
 * @param probeQuality se non null, misura in background la qualità **REALE** delle
 *        sorgenti non ancora verificate (un probe alla volta) e aggiorna i badge.
 */
@Composable
fun MovieSourceDialog(
    movieTitle: String,
    sources: List<StreamProvider>,
    fallbackDurationSeconds: Long? = null,
    onSelect: (StreamProvider) -> Unit,
    onDismiss: () -> Unit,
    probeQuality: (suspend (StreamProvider) -> Int?)? = null
) {
    val firstFocus = remember { FocusRequester() }

    // Altezze misurate a runtime dal probe (chiave = id sorgente) e id in misurazione.
    val probedHeights = remember { mutableStateMapOf<Long, Int>() }
    val probingIds = remember { mutableStateOf(emptySet<Long>()) }

    // Probe SERIALE: una sorgente alla volta per non consumare più slot di
    // connessione del provider. Parte subito, il menu resta immediato.
    LaunchedEffect(sources, probeQuality) {
        if (probeQuality == null) return@LaunchedEffect
        val pending = sources.filter {
            it.id > 0 && (it.detectedHeight ?: 0) <= 0 && !probedHeights.containsKey(it.id)
        }
        if (pending.isEmpty()) return@LaunchedEffect
        for (provider in pending) {
            probingIds.value = probingIds.value + provider.id
            val height = runCatching { probeQuality(provider) }.getOrNull()
            if (height != null && height > 0) probedHeights[provider.id] = height
            probingIds.value = probingIds.value - provider.id
            // Piccola pausa tra un probe e l'altro: cortesia verso il provider.
            delay(150)
        }
    }

    Dialog(onDismissRequest = onDismiss) {
        GlassSurface(
            shape = RoundedCornerShape(22.dp),
            // Pannello vetro: base scura semi-opaca (leggibile) + bordo a gradiente.
            // NB: niente blur — RenderEffect sfocherebbe il contenuto stesso del dialog.
            fill = WaveStreamColors.BackgroundSecondary.copy(alpha = 0.94f),
            stroke = GlassTokens.StrokeGradient,
            strokeWidth = 1.dp,
            modifier = Modifier.width(560.dp)
        ) {
            Column(modifier = Modifier.padding(24.dp)) {
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
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    contentPadding = PaddingValues(vertical = 4.dp),
                    modifier = Modifier.heightIn(max = 420.dp)
                ) {
                    itemsIndexed(sources, key = { _, p -> p.id }) { index, provider ->
                        SourceItem(
                            provider = provider,
                            probedHeight = probedHeights[provider.id],
                            isProbing = provider.id in probingIds.value,
                            fallbackDurationSeconds = fallbackDurationSeconds,
                            focusRequester = if (index == 0) firstFocus else null,
                            onClick = { onSelect(provider) }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                Box(modifier = Modifier.align(Alignment.End)) {
                    GlassDismissButton(text = "Annulla", onClick = onDismiss)
                }
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
    probedHeight: Int?,
    isProbing: Boolean,
    fallbackDurationSeconds: Long?,
    focusRequester: FocusRequester?,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    // Vetro che si "accende" al focus: riempimento accent translucido + alone.
    val fill by animateColorAsState(
        targetValue = if (isFocused) GlassTokens.accentFill(WaveStreamColors.Accent) else GlassTokens.SurfaceFill,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "sourceFill"
    )
    val stroke = if (isFocused) GlassTokens.accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient

    GlassSurface(
        shape = RoundedCornerShape(14.dp),
        fill = fill,
        stroke = stroke,
        strokeWidth = if (isFocused) 1.5.dp else 1.dp,
        modifier = Modifier
            .fillMaxWidth()
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
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
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = subtitleParts.joinToString(" • "),
                        style = MaterialTheme.typography.bodySmall,
                        color = WaveStreamColors.TextTertiary
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            val qualityText = qualityLabel(provider, probedHeight)
            if (qualityText.isNotEmpty()) {
                // Badge OVALE in vetro accent: stessa trasparenza delle superfici della
                // topbar (GlassTokens.accentFill = 12% di accent) + bordo a gradiente.
                // Il valore è REALE quando il probe/player l'ha misurato: vedi [qualityLabel].
                GlassSurface(
                    shape = RoundedCornerShape(50),
                    fill = GlassTokens.accentFill(WaveStreamColors.Accent),
                    stroke = GlassTokens.accentStroke(WaveStreamColors.Accent),
                    strokeWidth = 1.dp
                ) {
                    Text(
                        text = qualityText,
                        style = MaterialTheme.typography.labelSmall,
                        color = WaveStreamColors.AccentLight,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
                    )
                }
            } else if (isProbing) {
                // Misurazione in corso: stesso badge ma neutro, così la riga non "salta".
                GlassSurface(
                    shape = RoundedCornerShape(50),
                    fill = GlassTokens.SurfaceFill,
                    stroke = GlassTokens.StrokeGradient,
                    strokeWidth = 1.dp
                ) {
                    Text(
                        text = "…",
                        style = MaterialTheme.typography.labelSmall,
                        color = WaveStreamColors.TextTertiary,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
                    )
                }
            }
        }
    }
}

/** Pulsante "Annulla" in vetro: coerente con le pill del detail view. */
@Composable
private fun GlassDismissButton(text: String, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val fill by animateColorAsState(
        targetValue = if (isFocused) GlassTokens.SurfaceFillFocused else Color.Transparent,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "dismissFill"
    )
    val stroke = if (isFocused) GlassTokens.accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient

    GlassSurface(
        shape = RoundedCornerShape(50),
        fill = fill,
        stroke = stroke,
        strokeWidth = 1.dp,
        modifier = Modifier
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 26.dp, vertical = 10.dp)
        )
    }
}

/**
 * Etichetta qualità del badge.
 *
 * 1. Risoluzione misurata dal **probe headless** appena eseguito ([probedHeight]).
 * 2. Risoluzione **REALE** misurata dal player in una riproduzione precedente
 *    ([StreamProvider.detectedHeight]).
 * 3. Fallback sulla qualità **dichiarata dal nome della sorgente** (`quality`/`resolution`).
 *
 * La categoria di appartenenza del contenuto NON viene mai usata: stare nella categoria
 * "4K" non significa essere 4K.
 */
private fun qualityLabel(provider: StreamProvider, probedHeight: Int?): String {
    probedHeight?.takeIf { it > 0 }?.let { return detectedQualityLabel(it) }
    provider.detectedHeight?.takeIf { it > 0 }?.let { return detectedQualityLabel(it) }
    return declaredQualityLabel(provider)
}

/** Risoluzione reale (px di altezza) → etichetta compatta. */
private fun detectedQualityLabel(height: Int): String = when {
    height >= 2160 -> "4K"
    height >= 1440 -> "1440p"
    height >= 1080 -> "1080p"
    height >= 720 -> "720p"
    height >= 576 -> "576p"
    height >= 480 -> "480p"
    else -> "${height}p"
}

/** Qualità dichiarata dal nome della sorgente (fallback, non verificata). */
private fun declaredQualityLabel(provider: StreamProvider): String = buildString {
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
