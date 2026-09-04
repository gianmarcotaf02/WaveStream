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
 * On-screen keyboard in Netflix TV style.
 * Uniform 6-column grid with near-square keys, like the Netflix app:
 * - Top row: section toggle ("abc" / "?123") + Backspace
 * - Letters & numbers integrated: a-f / g-l / m-r / s-x / y-z + 1-4 / 5-0
 * - Wide space bar on the bottom row
 * - ?123 page: punctuation and Italian accented vowels on the same 6-column grid
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
    // riportato sul bottone toggle (abc / ?123), che altrimenti perderebbe
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

    // LETTERE + NUMERI (layout Netflix): griglia uniforme 6x6, numeri
    // integrati nelle ultime due righe come sull'app Netflix.
    val letterRows = listOf(
        "abcdef",
        "ghijkl",
        "mnopqr",
        "stuvwx",
        "yz1234",
        "567890"
    )

    // Simboli (?123): punteggiatura e vocali accentate italiane,
    // stessa griglia a 6 colonne per non cambiare dimensioni ai tasti.
    val symbolRows = listOf(
        ".,!?'\"",
        "-_:;+=",
        "àèéìòù",
        "()#@€*"
    )

    val rows = if (showSymbols) symbolRows else letterRows

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        // Top row (stile Netflix): toggle sezione + backspace, con una
        // cella vuota in mezzo a separare i due comandi.
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            KeyboardButton(
                label = if (showSymbols) "abc" else "?123",
                onClick = {
                    showSymbols = !showSymbols
                    sectionToggleCount++
                },
                modifier = Modifier
                    .weight(2f)
                    .focusRequester(toggleFocusRequester)
            )
            Spacer(modifier = Modifier.weight(1f))
            KeyboardButton(
                label = "⌫",
                onClick = { onQueryChange(query.dropLast(1)) },
                modifier = Modifier.weight(2f)
            )
        }

        // Griglia 6 colonne: lettere/numeri (oppure simboli)
        rows.forEach { rowChars ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                rowChars.forEach { ch ->
                    KeyboardButton(
                        label = ch.toString(),
                        onClick = { onQueryChange(query + ch) },
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

        // Bottom row: barra spazio larga (4 unità su 6, centrata)
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1f))
            KeyboardButton(
                label = "",
                onClick = { onQueryChange(query + " ") },
                modifier = Modifier.weight(4f)
            )
            Spacer(modifier = Modifier.weight(1f))
        }
    }
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
            .height(40.dp)
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
            fontSize = 15.sp
        )
    }
}
