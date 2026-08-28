package it.wavestream.app.ui.search

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * On-screen keyboard in Netflix style, controlled with the D-pad.
 * Letters A-Z, Backspace, Space, Clear. Applies the accent color on focus.
 */
@Composable
fun OnScreenKeyboard(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val rows: List<List<KeyboardKey>> = listOf(
        listOf('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P').map { KeyboardKey.Letter(it) },
        listOf('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L').map { KeyboardKey.Letter(it) },
        listOf('Z', 'X', 'C', 'V', 'B', 'N', 'M').map { KeyboardKey.Letter(it) } + KeyboardKey.Backspace,
        listOf(KeyboardKey.Space, KeyboardKey.Clear)
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        rows.forEach { row ->
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                row.forEach { key ->
                    when (key) {
                        is KeyboardKey.Letter -> KeyboardButton(key.char.toString()) {
                            onQueryChange(query + key.char)
                        }
                        KeyboardKey.Backspace -> KeyboardButton("⌫") {
                            onQueryChange(query.dropLast(1))
                        }
                        KeyboardKey.Space -> KeyboardButton("Spazio", wide = true) {
                            onQueryChange(query + " ")
                        }
                        KeyboardKey.Clear -> KeyboardButton("Cancella", wide = true) {
                            onQueryChange("")
                        }
                    }
                }
            }
        }
    }
}

private sealed class KeyboardKey {
    data class Letter(val char: Char) : KeyboardKey()
    object Backspace : KeyboardKey()
    object Space : KeyboardKey()
    object Clear : KeyboardKey()
}

@Composable
private fun KeyboardButton(
    label: String,
    onClick: () -> Unit,
    wide: Boolean = false,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        label = "keyboardScale"
    )

    Box(
        modifier = modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .width(if (wide) 92.dp else 44.dp)
            .height(44.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(if (isFocused) WaveStreamColors.Accent else WaveStreamColors.BackgroundTertiary)
            .border(
                width = 1.dp,
                color = if (isFocused) WaveStreamColors.AccentLight else Color.Transparent,
                shape = RoundedCornerShape(8.dp)
            )
            .focusable(interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            color = if (isFocused) Color.White else WaveStreamColors.TextPrimary,
            fontWeight = FontWeight.SemiBold,
            fontSize = if (wide) 14.sp else 18.sp
        )
    }
}
