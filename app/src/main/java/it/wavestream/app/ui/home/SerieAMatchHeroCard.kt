package it.wavestream.app.ui.home

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.ui.theme.WaveStreamColors
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * Hero card for a Serie A match:
 * - Backdrop: diagonal split (bottom-left → top-right), home team gradient on the
 *   upper-left side, away team gradient on the lower-right side, white slash in the middle.
 * - Team crests loaded from football-data.org URLs.
 * - LIVE pill (pulsing red) when the match is in play, kickoff time/countdown otherwise.
 * - "Guarda adesso" button → opens the channel grid for the two teams.
 *
 * Simultaneous matches: the Home screen renders one instance of this card per match.
 */
@Composable
fun SerieAMatchHeroCard(
    match: SerieAMatchEntity,
    onWatchClick: (SerieAMatchEntity) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        // ===== Backdrop: diagonal split + gradients + slash =====
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height

            // Upper-left triangle = home, lower-right = away (slash from BL to TR)
            val homePath = Path().apply {
                moveTo(0f, 0f); lineTo(w, 0f); lineTo(0f, h); close()
            }
            val awayPath = Path().apply {
                moveTo(w, 0f); lineTo(w, h); lineTo(0f, h); close()
            }

            val (homeTop, homeBottom) = SerieATeamColors.forTla(match.homeTla)
            val (awayTop, awayBottom) = SerieATeamColors.forTla(match.awayTla)

            drawPath(homePath, Brush.verticalGradient(listOf(homeTop, homeBottom)))
            drawPath(awayPath, Brush.verticalGradient(listOf(awayTop, awayBottom)))

            // White slash (bottom-left → top-right), feathered with layered strokes
            val a = Offset(0f, h)
            val b = Offset(w, 0f)
            drawLine(Color.White.copy(alpha = 0.10f), a, b, strokeWidth = h * 0.085f, strokeCap = StrokeCap.Butt)
            drawLine(Color.White.copy(alpha = 0.22f), a, b, strokeWidth = h * 0.045f, strokeCap = StrokeCap.Butt)
            drawLine(Color.White.copy(alpha = 0.95f), a, b, strokeWidth = h * 0.016f, strokeCap = StrokeCap.Butt)

            // Bottom scrim for text legibility
            drawRect(
                Brush.verticalGradient(
                    0.55f to Color.Transparent,
                    1f to Color.Black.copy(alpha = 0.55f),
                    startY = size.height * 0.55f,
                    endY = size.height
                )
            )
        }

        // ===== Crests =====
        AsyncImage(
            model = match.homeCrest,
            contentDescription = match.homeName,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 56.dp)
                .size(170.dp)
        )
        AsyncImage(
            model = match.awayCrest,
            contentDescription = match.awayName,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 56.dp)
                .size(170.dp)
        )

        // ===== Info overlay (bottom-left) =====
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 56.dp, bottom = 44.dp)
        ) {
            // Status: LIVE pill / countdown / kickoff time
            if (match.isLive) {
                LivePulseIndicator()
            } else {
                Text(
                    text = kickoffLabel(match),
                    style = MaterialTheme.typography.labelLarge,
                    color = WaveStreamColors.AccentGold,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 2.sp
                )
            }

            Spacer(Modifier.height(8.dp))

            Text(
                text = "SERIE A • GIORNATA ${match.matchday ?: "-"}",
                style = MaterialTheme.typography.labelMedium,
                color = Color.White.copy(alpha = 0.75f),
                letterSpacing = 2.sp
            )

            Spacer(Modifier.height(4.dp))

            Text(
                text = "${match.homeShortName.uppercase()} - ${match.awayShortName.uppercase()}",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.White,
                fontWeight = FontWeight.Black
            )

            if (match.isLive && match.homeScore != null && match.awayScore != null) {
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "${match.homeScore} - ${match.awayScore}",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(Modifier.height(16.dp))

            WatchNowButton(onClick = { onWatchClick(match) })
        }
    }
}

// ========== Sub-components ==========

/** Red pulsing LIVE pill. */
@Composable
private fun LivePulseIndicator() {
    val transition = rememberInfiniteTransition(label = "livePulse")
    val alpha by transition.animateFloat(
        initialValue = 1f,
        targetValue = 0.45f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse
        ),
        label = "livePulseAlpha"
    )
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .background(
                color = Color(0xFFE01B2C).copy(alpha = alpha),
                shape = RoundedCornerShape(6.dp)
            )
            .padding(horizontal = 12.dp, vertical = 5.dp)
    ) {
        Box(
            modifier = Modifier
                .size(8.dp)
                .background(Color.White, CircleShape)
        )
        Text(
            text = "LIVE",
            color = Color.White,
            fontWeight = FontWeight.Black,
            fontSize = 14.sp,
            letterSpacing = 2.sp
        )
    }
}

/** TV focusable "Guarda adesso" button. */
@Composable
private fun WatchNowButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .graphicsLayer {
                val s = if (isFocused) 1.08f else 1f
                scaleX = s
                scaleY = s
            }
            .background(
                color = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.14f),
                shape = RoundedCornerShape(28.dp)
            )
            .border(
                width = if (isFocused) 2.dp else 0.dp,
                color = if (isFocused) Color.White else Color.Transparent,
                shape = RoundedCornerShape(28.dp)
            )
            .clip(RoundedCornerShape(28.dp))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .focusable(interactionSource = interactionSource)
            .padding(horizontal = 24.dp, vertical = 12.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.PlayArrow,
            contentDescription = null,
            tint = Color.White
        )
        Text(
            text = "Guarda adesso",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

// ========== Helpers ==========

/** "ORE 20:45" or "INIZIA TRA X MIN" when close to kickoff. */
private fun kickoffLabel(match: SerieAMatchEntity): String {
    val now = System.currentTimeMillis()
    val diffMin = (match.utcDateMillis - now) / 60_000L
    return when {
        diffMin in 0..59 -> "INIZIA TRA $diffMin MIN"
        else -> {
            val local = ZonedDateTime.ofInstant(
                java.time.Instant.ofEpochMilli(match.utcDateMillis),
                ZoneId.of("Europe/Rome")
            )
            "ORE " + local.format(DateTimeFormatter.ofPattern("HH:mm"))
        }
    }
}
