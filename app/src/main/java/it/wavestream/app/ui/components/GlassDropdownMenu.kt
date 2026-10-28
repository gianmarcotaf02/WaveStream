package it.wavestream.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * Menu a tendina in stile "liquid glass" — contenitore unico per tutta l'app.
 *
 * Il `DropdownMenu` Material3, lasciato ai default, disegna una superficie opaca con
 * un rettangolo di stato squadrato sulla voce focalizzata: fuori dal linguaggio visivo
 * dell'app. Qui il pannello usa i token del vetro (fill quasi pieno + bordo gradiente)
 * e le voci sono [GlassDropdownMenuItem], così il focus col D-pad ha lo stesso alone
 * accent delle altre card.
 */
@Composable
fun GlassDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        shape = RoundedCornerShape(14.dp),
        containerColor = GlassTokens.SurfaceFillOpaque,
        tonalElevation = 0.dp,
        shadowElevation = 12.dp,
        border = BorderStroke(1.dp, GlassTokens.StrokeGradient),
        content = content
    )
}

/**
 * Voce di un [GlassDropdownMenu] in stile vetro.
 *
 * `DropdownMenuItem` Material3 non espone uno stato focus: qui la voce focalizzata
 * prende un alone bianco translucido, quella selezionata un fondo accent + spunta.
 */
@Composable
fun GlassDropdownMenuItem(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    style: TextStyle = MaterialTheme.typography.bodyLarge
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val background by animateColorAsState(
        targetValue = when {
            isFocused -> Color.White.copy(alpha = 0.16f)
            isSelected -> WaveStreamColors.Accent.copy(alpha = 0.18f)
            else -> Color.Transparent
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "glassMenuItemBg"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(background)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            style = style,
            color = if (isFocused || isSelected) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = if (isFocused || isSelected) FontWeight.SemiBold else FontWeight.Normal
        )
        if (isSelected) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = null,
                tint = WaveStreamColors.Accent,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}
