package it.wavestream.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * Button con focus board animato, ottimizzato per navigazione D-pad su Android TV.
 *
 * - Bordo 2dp che diventa [focusBorderColor] quando focused (default bianco per
 *   garantire visibilita su sfondi Accent/viola).
 * - Nessuno scale (no overflow visivo).
 * - Se [width] = null, il bottone occupa tutta la larghezza disponibile.
 * - Supporta stato [enabled] con containerColor disabilitato.
 */
@Composable
fun FocusedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    width: Dp? = null,
    height: Dp = 56.dp,
    containerColor: Color = WaveStreamColors.Accent,
    contentColor: Color = Color.White,
    borderRadius: Dp = 16.dp,
    focusBorderColor: Color = WaveStreamColors.TextPrimary,
    focusBorderWidth: Dp = 2.dp,
    content: @Composable RowScope.() -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val animatedBorder by animateColorAsState(
        targetValue = if (isFocused && enabled) focusBorderColor else Color.Transparent,
        label = "focusedButtonBorder"
    )

    Box(
        modifier = modifier
            .then(if (width != null) Modifier.width(width) else Modifier.fillMaxWidth())
            .height(height)
            .border(focusBorderWidth, animatedBorder, RoundedCornerShape(borderRadius))
            .padding(focusBorderWidth),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onClick,
            enabled = enabled,
            modifier = Modifier
                .fillMaxSize()
                .focusable(interactionSource = interactionSource),
            shape = RoundedCornerShape(borderRadius - focusBorderWidth),
            colors = ButtonDefaults.buttonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                disabledContainerColor = containerColor.copy(alpha = 0.4f),
                disabledContentColor = contentColor.copy(alpha = 0.6f)
            )
        ) {
            content()
        }
    }
}
