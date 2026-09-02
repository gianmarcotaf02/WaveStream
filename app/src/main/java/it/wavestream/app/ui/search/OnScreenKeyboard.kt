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
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.ui.theme.WaveStreamColors

/**
 * On-screen keyboard in Netflix TV style (alphabetical grid, not QWERTY).
 * Uniform grid: all keys have the same size (7 columns, no oversized keys).
 * Two sections switchable with a toggle button on the bottom row:
 * - Letters: a-z in lowercase (alphabetical, 4 rows)
 * - ?123: numbers and special characters (4 rows)
 * Space bar and Backspace always available on the bottom row.
 * Controlled with the D-pad, applies accent color on focus (no scaling).
 * After switching section, focus is restored on the toggle button itself.
 */
@Composable
fun OnScreenKeyboard(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var showSymbols by remember { mutableStateOf(false) }

    // Contatore dei cambi di sezione: dopo ogni cambio il focus viene
    // riportato sul bottone toggle (?123 / ABC), che altrimenti perderebbe
    // il focus perché l'intera griglia dei tasti viene ricomposta.
    var sectionToggleCount by remember { mutableStateOf(0) }
    val toggleFocusRequester = remember { FocusRequester() }

    LaunchedEffect(sectionToggleCount) {
        if (sectionToggleCount > 0) {
            // Attende il frame in cui la nuova sezione è già composta
            withFrameNanos { }
            toggleFocusRequester.requestFocus()
        }
    }

    // Letters section (alphabetical, Netflix style): 7 uniform columns.
    // Rows: a-g, h-n, o-t, u-z (le ultime due righe hanno una cella vuota).
    val letterRows: List<List<KeyboardKey?>> = listOf(
        "abcdefg".map { KeyboardKey.Letter(it.toString()) },
        "hijklmn".map { KeyboardKey.Letter(it.toString()) },
        "opqrst".map { KeyboardKey.Letter(it.toString()) } + null,
        "uvwxyz".map { KeyboardKey.Letter(it.toString()) } + null
    )

    // Numbers & special characters section (?123): 28 simboli = 4 righe da 7
    val symbolRows: List<List<KeyboardKey?>> = listOf(
        "1234567".map { KeyboardKey.Letter(it.toString()) },
        "890.,!?".map { KeyboardKey.Letter(it.toString()) },
        "@#€&()-".map { KeyboardKey.Letter(it.toString()) },
        "_=+:;'\"".map { KeyboardKey.Letter(it.toString()) }
    )

    val rows = if (showSymbols) symbolRows else letterRows

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        rows.forEach { row ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                row.forEach { keyData ->
                    when (keyData) {
                        // Cella vuota per mantenere la griglia allineata su 7 colonne
                        null -> Spacer(modifier = Modifier.weight(1f))
                        is KeyboardKey.Letter -> key(keyData) {
                            KeyboardButton(
                                label = keyData.value,
                                onClick = { onQueryChange(query + keyData.value) },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }
        }

        // Bottom controls row: section toggle, space, backspace
        // (2 + 4 + 1 = 7 colonne, allineato con la griglia sopra)
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            KeyboardButton(
                label = if (showSymbols) "ABC" else "?123",
                onClick = {
                    showSymbols = !showSymbols
                    sectionToggleCount++
                },
                modifier = Modifier
                    .weight(2f)
                    .focusRequester(toggleFocusRequester)
            )
            KeyboardButton(
                label = "",
                onClick = { onQueryChange(query + " ") },
                modifier = Modifier.weight(4f)
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
    data class Letter(val value: String) : KeyboardKey()
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
