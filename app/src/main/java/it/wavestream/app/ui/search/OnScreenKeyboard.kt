package it.wavestream.app.ui.search

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * On-screen keyboard in Netflix TV style (alphabetical grid, not QWERTY).
 * Letters a-z in lowercase, numbers 0-9, Backspace (X), Space (bar).
 * Controlled with the D-pad, applies accent color on focus.
 */
@Composable
fun OnScreenKeyboard(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    // Netflix-style alphabetical keyboard layout:
    // Row 1: a b c d e f
    // Row 2: g h i j k l
    // Row 3: m n o p q r
    // Row 4: s t u v w x
    // Row 5: y z 1 2 3 4
    // Row 6: 5 6 7 8 9 0
    // Row 7: [Space] [Backspace X]
    val rows: List<List<KeyboardKey>> = listOf(
        listOf("a", "b", "c", "d", "e", "f").map { KeyboardKey.Letter(it) },
        listOf("g", "h", "i", "j", "k", "l").map { KeyboardKey.Letter(it) },
        listOf("m", "n", "o", "p", "q", "r").map { KeyboardKey.Letter(it) },
        listOf("s", "t", "u", "v", "w", "x").map { KeyboardKey.Letter(it) },
        listOf("y", "z").map { KeyboardKey.Letter(it) } + listOf("1", "2", "3", "4").map { KeyboardKey.Letter(it) },
        listOf("5", "6", "7", "8", "9", "0").map { KeyboardKey.Letter(it) },
        listOf(KeyboardKey.Space, KeyboardKey.Backspace)
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        rows.forEach { row ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(3.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                row.forEach { key ->
                    when (key) {
                        is KeyboardKey.Letter -> KeyboardButton(
                            label = key.value,
                            onClick = { onQueryChange(query + key.value) },
                            modifier = Modifier.weight(1f)
                        )
                        KeyboardKey.Backspace -> KeyboardButton(
                            label = "⌫",
                            onClick = { onQueryChange(query.dropLast(1)) },
                            modifier = Modifier.weight(1f)
                        )
                        KeyboardKey.Space -> KeyboardButton(
                            label = "",
                            onClick = { onQueryChange(query + " ") },
                            modifier = Modifier.weight(2f)
                        )
                    }
                }
            }
        }
    }
}

private sealed class KeyboardKey {
    data class Letter(val value: String) : KeyboardKey()
    object Backspace : KeyboardKey()
    object Space : KeyboardKey()
}

@Composable
private fun KeyboardButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    // Solo cambio colore al focus, senza ingrandimento
    Box(
        modifier = modifier
            .height(32.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(
                if (isFocused) WaveStreamColors.Accent
                else Color.Black  // OLED black
            )
            .border(
                width = 1.dp,
                color = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.7f), // white border, accent on focus
                shape = RoundedCornerShape(4.dp)
            )
            .focusable(interactionSource = interactionSource)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            color = if (isFocused) Color.White else WaveStreamColors.TextSecondary,
            fontWeight = FontWeight.Medium,
            fontSize = 13.sp
        )
    }
}
