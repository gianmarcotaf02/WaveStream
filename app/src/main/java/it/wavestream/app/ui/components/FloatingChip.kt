package it.wavestream.app.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * FASE 2 — Chip vetro "flottante".
 *
 * Badge/indicatore semi-trasparente che galleggia sopra il video o il contenuto
 * (es. stato LIVE, buffering, qualità, orologio). Leggero, con fill vetro e bordo
 * gradiente; può evidenziarsi con bordo accent.
 */
@Composable
fun FloatingChip(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: ImageVector? = null,
    fill: Color = GlassTokens.SurfaceFillStrong,
    accentBorder: Boolean = false
) {
    val stroke =
        if (accentBorder) GlassTokens.accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient

    GlassSurface(
        shape = RoundedCornerShape(50),
        fill = fill,
        stroke = stroke,
        strokeWidth = if (accentBorder) 2.dp else 1.dp,
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            leadingIcon?.let {
                Icon(
                    imageVector = it,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.9f),
                    modifier = Modifier.size(16.dp)
                )
            }
            Text(
                text = text,
                style = MaterialTheme.typography.labelLarge,
                color = Color.White.copy(alpha = 0.95f),
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
            )
        }
    }
}
