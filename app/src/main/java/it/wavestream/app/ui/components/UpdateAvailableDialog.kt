package it.wavestream.app.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.SystemUpdate
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import kotlinx.coroutines.delay

/**
 * Finestra popup "aggiornamento disponibile", mostrata sopra la Home quando su Firebase
 * (`/app_update`) c'è una versione più recente di quella installata.
 *
 * Prima era un banner ancorato in alto sopra l'hero: ora è una finestra centrata, a schermo
 * grande (`usePlatformDefaultWidth = false`), con il changelog leggibile e i tre esiti:
 * - [onUpdateNow]   → apre la sezione "Aggiornamenti" delle Impostazioni;
 * - [onNotNow]      → "Non ora": non lo rivedere più per QUESTA versione (persistito);
 * - [onRemindLater] → "Ricordamelo al prossimo avvio": solo per questa sessione, ed è anche
 *   l'effetto del tasto Back quando l'aggiornamento non è forzato.
 *
 * Con `forceUpdate` le due azioni di rinvio sono nascoste e la finestra non si chiude con
 * Back o tap fuori: vedi `canDismiss` in MainActivity.
 */
@Composable
fun UpdateAvailableDialog(
    versionName: String,
    changelog: String,
    forceUpdate: Boolean,
    onUpdateNow: () -> Unit,
    onNotNow: () -> Unit,
    onRemindLater: () -> Unit
) {
    val canDismiss = !forceUpdate
    val primaryFocus = remember { FocusRequester() }
    // Il Dialog monta la finestra già "visibile": il flag parte da false e si alza al primo
    // frame, così l'animazione di ingresso (fade + scale) viene davvero eseguita.
    var shown by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { shown = true }

    // Autofocus su "Aggiorna ora": col telecomando la finestra è utilizzabile subito.
    LaunchedEffect(versionName) {
        repeat(6) {
            delay(60)
            if (runCatching { primaryFocus.requestFocus() }.isSuccess) return@LaunchedEffect
        }
    }

    Dialog(
        onDismissRequest = { if (canDismiss) onRemindLater() },
        properties = DialogProperties(
            dismissOnBackPress = canDismiss,
            dismissOnClickOutside = false,
            usePlatformDefaultWidth = false
        )
    ) {
        AnimatedVisibility(
            visible = shown,
            enter = fadeIn() + scaleIn(initialScale = 0.94f)
        ) {
            // Scrim: la finestra deve leggersi come popup sopra la Home, non come un pannello
            // incollato all'hero.
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.74f)),
                contentAlignment = Alignment.Center
            ) {
                val shape = RoundedCornerShape(24.dp)
                // Popup grande ma mai oltre i bordi: su TV ~1100dp, altrove il 90% della
                // larghezza disponibile.
                val cardWidth = minOf(maxWidth * 0.9f, 1100.dp).coerceAtMost(maxWidth - 32.dp)
                Column(
                    modifier = Modifier
                        .width(cardWidth)
                        .clip(shape)
                        .background(GlassTokens.SurfaceFillOpaque)
                        .border(1.5.dp, GlassTokens.accentStroke(WaveStreamColors.Accent), shape)
                        .padding(horizontal = 40.dp, vertical = 32.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    HeaderBlock(versionName = versionName, forceUpdate = forceUpdate)

                    val changelogLines = changelog.lines().map { it.trim() }.filter { it.isNotEmpty() }
                    if (changelogLines.isNotEmpty()) {
                        ChangelogBlock(lines = changelogLines)
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.End),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (canDismiss) {
                            DialogTextButton(
                                label = "Ricordamelo al prossimo avvio",
                                icon = Icons.Default.Schedule,
                                onClick = onRemindLater
                            )
                            DialogTextButton(
                                label = "Non ora",
                                icon = Icons.Default.Close,
                                onClick = onNotNow
                            )
                        }
                        PrimaryActionButton(
                            label = "Aggiorna ora",
                            onClick = onUpdateNow,
                            focusRequester = primaryFocus
                        )
                    }
                }
            }
        }
    }
}

/** Intestazione: icona accent, titolo, versione e (se forzato) il badge "obbligatorio". */
@Composable
private fun HeaderBlock(versionName: String, forceUpdate: Boolean) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Box(
            modifier = Modifier
                .size(68.dp)
                .clip(CircleShape)
                .background(WaveStreamColors.Accent.copy(alpha = 0.18f))
                .border(1.dp, WaveStreamColors.Accent.copy(alpha = 0.45f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.SystemUpdate,
                contentDescription = null,
                tint = WaveStreamColors.Accent,
                modifier = Modifier.size(36.dp)
            )
        }

        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(
                text = "Aggiornamento disponibile",
                style = MaterialTheme.typography.headlineSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "WaveStream $versionName è pronto da installare",
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextSecondary
            )
            if (forceUpdate) {
                Text(
                    text = "Aggiornamento obbligatorio",
                    style = MaterialTheme.typography.labelMedium,
                    color = WaveStreamColors.Accent,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .background(WaveStreamColors.Accent.copy(alpha = 0.16f))
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                )
            }
        }
    }
}

/** Riquadro "Novità" in vetro, scrollabile quando il changelog è lungo. */
@Composable
private fun ChangelogBlock(lines: List<String>) {
    GlassSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        fill = Color.White.copy(alpha = 0.06f),
        stroke = SolidColor(Color.White.copy(alpha = 0.10f)),
        strokeWidth = 1.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 260.dp)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 22.dp, vertical = 18.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                text = "Novità",
                style = MaterialTheme.typography.titleSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold
            )
            lines.forEach { line ->
                Text(
                    text = line,
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary
                )
            }
        }
    }
}

/** Azione principale (accent) con anello bianco quando ha il focus. */
@Composable
private fun PrimaryActionButton(
    label: String,
    onClick: () -> Unit,
    focusRequester: FocusRequester
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = WaveStreamColors.Accent,
            contentColor = Color.White
        ),
        border = if (isFocused) BorderStroke(2.dp, Color.White) else null,
        modifier = Modifier
            .focusRequester(focusRequester)
            .focusable(interactionSource = interactionSource)
            .heightIn(min = 52.dp)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.SemiBold
        )
    }
}

/** Azione secondaria testuale, con bordo accent quando ha il focus. */
@Composable
private fun DialogTextButton(
    label: String,
    icon: ImageVector,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    TextButton(
        onClick = onClick,
        colors = ButtonDefaults.textButtonColors(
            contentColor = if (isFocused) Color.White else WaveStreamColors.TextSecondary
        ),
        border = if (isFocused) BorderStroke(1.dp, WaveStreamColors.Accent) else null,
        modifier = Modifier
            .focusable(interactionSource = interactionSource)
            .heightIn(min = 52.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null, modifier = Modifier.size(18.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = label, style = MaterialTheme.typography.bodyMedium)
    }
}
