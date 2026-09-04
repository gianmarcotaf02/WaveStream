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
 * On-screen keyboard, layout QWERTY italiano.
 * Uniform grid: all keys have the same width (10-unit columns, no oversized keys).
 * Two sections switchable with a toggle button on the bottom row:
 * - Letters: QWERTY italiano (qwertyuiop / asdfghjkl / zxcvbnm), righe centrate
 * - ?123: numbers, punctuation and Italian accented vowels (à è é ì ò ù, apostrofo, €)
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

    // LETTERE: layout QWERTY italiano su 10 colonne uniformi. Ogni riga è
    // centrata simmetricamente: quelle con meno tasti (9 e 7) ricevono spaziature
    // laterali uguali, così OGNI tasto ha la stessa larghezza (1 unità su 10).
    // Riga italiana standard: qwertyuiop / asdfghjkl / zxcvbnm.
    val letterRows = listOf(
        KeyboardRowSpec("qwertyuiop", paddingUnits = 0f),
        KeyboardRowSpec("asdfghjkl", paddingUnits = 0.5f),
        KeyboardRowSpec("zxcvbnm", paddingUnits = 1.5f)
    )

    // SIMBOLI (?123): numeri, punteggiatura e vocali accentate italiane
    // (à è é ì ò ù) con apostrofo ed €, anch'esse su 10 colonne uniformi.
    val symbolRows = listOf(
        KeyboardRowSpec("1234567890", paddingUnits = 0f),
        KeyboardRowSpec(".,!?-_+()#", paddingUnits = 0f),
        KeyboardRowSpec("àèéìòù'\"@€", paddingUnits = 0f)
    )

    val rows = if (showSymbols) symbolRows else letterRows

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        rows.forEach { spec ->
            CenteredKeysRow(
                keys = spec.chars,
                paddingUnits = spec.paddingUnits
            ) { ch ->
                onQueryChange(query + ch)
            }
        }

        // Bottom controls row (simmetrica su 10 unità): 1 sp. + toggle(2) +
        // space(4) + backspace(2) + 1 sp.
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1f))
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
                modifier = Modifier.weight(2f)
            )
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

/** Specifica di una riga di tasti e le sue spaziature laterali in unità. */
private data class KeyboardRowSpec(
    val chars: String,
    val paddingUnits: Float = 0f
)

/**
 * Riga di tasti centrata su 10 colonne uniformi: i tasti pesano 1 unità l'uno,
 * e `paddingUnits` (stesso valore a sinistra e a destra) centra le righe più
 * corte mantenendo la stessa larghezza dei tasti in tutta la tastiera.
 */
@Composable
private fun CenteredKeysRow(
    keys: String,
    paddingUnits: Float,
    onKey: (String) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        if (paddingUnits > 0f) Spacer(modifier = Modifier.weight(paddingUnits))
        keys.forEach { ch ->
            KeyboardButton(
                label = ch.toString(),
                onClick = { onKey(ch.toString()) },
                modifier = Modifier.weight(1f)
            )
        }
        if (paddingUnits > 0f) Spacer(modifier = Modifier.weight(paddingUnits))
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
