package it.wavestream.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * Riga focusabile dei menu "liste" (selettore liste del detail e dell'hero).
 *
 * I `DropdownMenuItem` Material3 non mostrano alcun anello di focus col D-pad:
 * questa riga disegna un bordo accent (stesso linguaggio delle altre card) e usa
 * il focus per il click, come il resto dell'app.
 */
@Composable
fun GlassMenuRow(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val fill by animateColorAsState(
        targetValue = if (isFocused) GlassTokens.accentFill(WaveStreamColors.Accent) else Color.Transparent,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "glassMenuRowFill"
    )
    val stroke = if (isFocused) {
        GlassTokens.accentStroke(WaveStreamColors.Accent)
    } else {
        SolidColor(Color.Transparent)
    }

    GlassSurface(
        shape = RoundedCornerShape(10.dp),
        fill = fill,
        stroke = stroke,
        strokeWidth = 1.5.dp,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 2.dp)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

/** Icona "modifica" focusabile (anello accent col D-pad), usata nei menu liste. */
@Composable
fun EditListButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val fill by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.20f) else Color.Transparent,
        label = "editListFill"
    )
    val border = if (isFocused) WaveStreamColors.Accent else Color.Transparent

    Box(
        modifier = Modifier
            .size(32.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(fill)
            .border(1.5.dp, border, RoundedCornerShape(8.dp))
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Edit,
            contentDescription = "Modifica nome lista",
            tint = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextTertiary,
            modifier = Modifier.size(16.dp)
        )
    }
}
