package it.wavestream.app.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.util.AgeRating

/**
 * Badge "età consigliata" in stile liquid glass.
 *
 * Pillola in vetro (fill colorato translucido + bordo gradiente) con il visto
 * censura compatto — `T`, `12+`, `14+`, `18+`. Il colore segue la fascia d'età
 * ([AgeRating.Level]): verde per tutti, ambra per i ragazzi, rosso per i
 * contenuti per adulti. Il vetro è lo stesso di [it.wavestream.app.ui.theme.GlassTokens],
 * così il badge resta coerente su hero, dettaglio e card.
 *
 * Non disegna nulla se [rating] è vuoto o non interpretabile: chi la usa non deve
 * gestire il caso "nessun visto".
 */
@Composable
fun AgeRatingBadge(
    rating: String?,
    modifier: Modifier = Modifier
) {
    val label = AgeRating.label(rating) ?: return
    val tint = when (AgeRating.level(label)) {
        AgeRating.Level.ALL -> WaveStreamColors.Success
        AgeRating.Level.TEEN -> WaveStreamColors.Warning
        AgeRating.Level.MATURE -> WaveStreamColors.Error
    }

    GlassSurface(
        shape = RoundedCornerShape(percent = 50),
        fill = tint.copy(alpha = 0.16f),
        stroke = Brush.linearGradient(
            colors = listOf(tint.copy(alpha = 0.55f), Color.White.copy(alpha = 0.06f))
        ),
        strokeWidth = 1.dp,
        modifier = modifier.semantics { contentDescription = "Età consigliata: $label" }
    ) {
        Text(
            text = label,
            // bodyMedium come la riga che lo ospita (anno, durata, generi): un
            // labelMedium da 11sp accanto a testo da 13sp si sarebbe letto come un
            // elemento di seconda importanza, mentre il visto è un'informazione pari.
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White.copy(alpha = 0.95f),
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 1.dp)
        )
    }
}
