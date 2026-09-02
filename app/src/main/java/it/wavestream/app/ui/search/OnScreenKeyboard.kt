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
 * Two sections switchable with a toggle button on the bottom row:
 * - Letters: a-z in lowercase (alphabetical)
 * - ?123: numbers and special characters
 * Space bar and Backspace always available on the bottom row.
 * Controlled with the D-pad, applies accent color on focus (no scaling).
 */
@Composable
fun OnScreenKeyboard(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var showSymbols by remember { mutableStateOf(false) }

    // Letters section (alphabetical, Netflix style):
    // Row 1-4: a-x, Row 5: y z (wide keys, same width as 3 letters each)
    val letterRows: List<List<KeyboardKey>> = listOf(
        listOf("a", "b", "c", "d", "e", "f").map { KeyboardKey.Letter(it) },
        listOf("g", "h", "i", "j", "k", "l").map { KeyboardKey.Letter(it) },
        listOf("m", "n", "o", "p", "q", "r").map { KeyboardKey.Letter(it) },
        listOf("s", "t", "u", "v", "w", "x").map { KeyboardKey.Letter(it) },
        listOf("y", "z").map { KeyboardKey.Letter(it, weight = 3) }
    )

    // Numbers & special characters section (?123)
    val symbolRows: List<List<KeyboardKey>> = listOf(
        listOf("1", "2", "3", "4", "5", "6").map { KeyboardKey.Letter(it) },
        listOf("7", "8", "9", "0", ".", ",").map { KeyboardKey.Letter(it) },
        listOf("!", "?", "@", "#", "€", "&").map { KeyboardKey.Letter(it) },
        listOf("(", ")", "-", "_", "=", "+").map { KeyboardKey.Letter(it) },
        listOf(":", ";", "'", "\"", "<", ">").map { KeyboardKey.Letter(it) }
    )

    val rows = if (showSymbols) symbolRows else letterRows

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
                            modifier = Modifier.weight(key.weight.toFloat())
                        )
                        KeyboardKey.Backspace -> KeyboardButton(
                            label = "⌫",
                            onClick = { onQueryChange(query.dropLast(1)) },
                            modifier = Modifier.weight(1f)
                        )
                        KeyboardKey.Space -> KeyboardButton(
                            label = "",
                            onClick = { onQueryChange(query + " ") },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }

        // Bottom controls row: section toggle, space, backspace
        Row(
            horizontalArrangement = Arrangement.spacedBy(3.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            KeyboardButton(
                label = if (showSymbols) "ABC" else "?123",
                onClick = { showSymbols = !showSymbols },
                modifier = Modifier.weight(2f)
            )
            KeyboardButton(
                label = "",
                onClick = { onQueryChange(query + " ") },
                modifier = Modifier.weight(3f)
            )
            KeyboardButton(
                label = "⌫",
                onClick = { onQueryChange(query.dropLast(1)) },
                modifier = Modifier.weight(1f)
            )
        }
    }
}

private sealed class KeyboardKey {
    data class Letter(val value: String, val weight: Int = 1) : KeyboardKey()
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
