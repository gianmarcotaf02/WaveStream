package it.wavestream.app.ui.assistant

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.carousel
import coil.compose.AsyncImage
import it.wavestream.app.ai.AiResultItem
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * Schermata dell'assistente vocale AI:
 * orb centrale (mic/feedback), transcript della conversazione,
 * e carosello dei risultati sfogliabile col D-pad "davanti" al blob.
 */
@Composable
fun AssistantScreen(
    uiState: AssistantViewModel.UiState,
    onMicPressed: () -> Unit,
    onResultSelected: (AiResultItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF060B18),
                        Color(0xFF0A1628),
                        Color(0xFF060B18)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(24.dp))

            // ---- Orb ----
            Box(contentAlignment = Alignment.Center) {
                AssistantOrb(
                    phase = uiState.phase,
                    amplitude = uiState.amplitude,
                    modifier = Modifier.size(280.dp)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // ---- Stato corrente ----
            val statusText = when (uiState.phase) {
                AssistantViewModel.Phase.IDLE -> "Premi il microfono e dimmi cosa vuoi vedere"
                AssistantViewModel.Phase.LISTENING -> "Ti ascolto…"
                AssistantViewModel.Phase.THINKING -> "Sto pensando…"
                AssistantViewModel.Phase.SPEAKING -> if (uiState.results.isEmpty()) "" else "Scegli dal carosello"
                AssistantViewModel.Phase.ERROR -> uiState.errorMessage ?: "Si è verificato un errore"
            }
            Text(
                text = statusText,
                color = when (uiState.phase) {
                    AssistantViewModel.Phase.ERROR -> Color(0xFFFF8A80)
                    AssistantViewModel.Phase.LISTENING -> WaveStreamColors.Accent
                    else -> WaveStreamColors.TextSecondary
                },
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )

            // ---- Transcript conversazione ----
            if (uiState.userText != null || uiState.assistantText != null) {
                Spacer(modifier = Modifier.height(12.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 80.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    uiState.userText?.let {
                        TranscriptBubble(text = it, isUser = true)
                    }
                    uiState.assistantText?.let {
                        TranscriptBubble(text = it, isUser = false)
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            // ---- Bottone microfono ----
            MicButton(
                phase = uiState.phase,
                onClick = onMicPressed
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ---- Carosello risultati ----
            if (uiState.results.isNotEmpty()) {
                ResultsCarousel(
                    results = uiState.results,
                    onResultSelected = onResultSelected,
                    enabled = uiState.phase != AssistantViewModel.Phase.LISTENING
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Composable
private fun TranscriptBubble(text: String, isUser: Boolean) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(18.dp))
            .background(
                if (isUser) WaveStreamColors.Accent.copy(alpha = 0.16f)
                else Color.White.copy(alpha = 0.06f)
            )
            .border(
                width = 1.dp,
                color = if (isUser) WaveStreamColors.Accent.copy(alpha = 0.35f)
                else Color.White.copy(alpha = 0.12f),
                shape = RoundedCornerShape(18.dp)
            )
            .padding(horizontal = 18.dp, vertical = 10.dp)
    ) {
        Text(
            text = text,
            color = WaveStreamColors.TextPrimary,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun MicButton(phase: AssistantViewModel.Phase, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val focused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(
        targetValue = if (focused) 1.15f else 1f,
        animationSpec = tween(150),
        label = "micScale"
    )
    val active = phase == AssistantViewModel.Phase.LISTENING

    Box(
        modifier = Modifier
            .size(64.dp)
            .scale(scale)
            .clip(CircleShape)
            .background(
                Brush.radialGradient(
                    colors = if (active) listOf(Color(0xFF64D2FF), Color(0xFF1976D2))
                    else listOf(Color(0xFF2A3B5A), Color(0xFF14213D))
                )
            )
            .border(
                width = if (focused || active) 2.dp else 1.dp,
                color = if (active) Color(0xFF64D2FF)
                else if (focused) WaveStreamColors.Accent
                else Color.White.copy(alpha = 0.2f),
                shape = CircleShape
            )
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Mic,
            contentDescription = if (active) "Ferma l'ascolto" else "Parla con l'assistente",
            tint = if (active) Color.White else WaveStreamColors.TextSecondary,
            modifier = Modifier.size(30.dp)
        )
    }
}

@Composable
private fun ResultsCarousel(
    results: List<AiResultItem>,
    onResultSelected: (AiResultItem) -> Unit,
    enabled: Boolean
) {
    val listState = rememberLazyListState()
    val focusRequester = remember { FocusRequester() }

    // Al primo arrivo dei risultati, focus sul primo item (navigazione D-pad immediata)
    LaunchedEffect(results) {
        if (results.isNotEmpty()) {
            kotlinx.coroutines.delay(300) // lascia partire l'animazione
            try {
                focusRequester.requestFocus()
            } catch (_: Exception) {
            }
        }
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "RISULTATI",
            color = WaveStreamColors.TextTertiary,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        LazyRow(
            state = listState,
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 120.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(results, key = { _, item -> "${item.type}_${item.id}_${item.title}" }) { index, item ->
                ResultCard(
                    item = item,
                    onClick = { if (enabled) onResultSelected(item) },
                    focusRequester = if (index == 0) focusRequester else null
                )
            }
        }
    }
}

@Composable
private fun ResultCard(
    item: AiResultItem,
    onClick: () -> Unit,
    focusRequester: FocusRequester?
) {
    val interactionSource = remember { MutableInteractionSource() }
    val focused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(
        targetValue = if (focused) 1.12f else 1f,
        animationSpec = tween(180),
        label = "cardScale"
    )

    var cardModifier = Modifier
        .width(150.dp)
        .scale(scale)
        .clip(RoundedCornerShape(12.dp))
        .background(Color(0xFF14213D))
        .border(
            width = if (focused) 2.dp else 1.dp,
            color = if (focused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.1f),
            shape = RoundedCornerShape(12.dp)
        )
        .focusable(interactionSource = interactionSource)
        .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)

    if (focusRequester != null) {
        cardModifier = cardModifier.focusRequester(focusRequester)
    }

    Column(
        modifier = cardModifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
                .background(Color(0xFF0A1628)),
            contentAlignment = Alignment.Center
        ) {
            if (item.imageUrl != null) {
                AsyncImage(
                    model = item.imageUrl,
                    contentDescription = item.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                Text(
                    text = item.title.take(1).uppercase(),
                    color = WaveStreamColors.Accent.copy(alpha = 0.6f),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Badge tipo contenuto
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(6.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(Color.Black.copy(alpha = 0.7f))
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            ) {
                Text(
                    text = when (item.type) {
                        it.wavestream.app.data.database.entity.ContentType.MOVIE -> "FILM"
                        it.wavestream.app.data.database.entity.ContentType.SERIES -> "SERIE"
                        it.wavestream.app.data.database.entity.ContentType.CHANNEL -> "LIVE"
                        else -> ""
                    },
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Text(
            text = item.title,
            color = WaveStreamColors.TextPrimary,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
        )
    }
}
