package it.wavestream.app.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.WaveStreamColors
import kotlinx.coroutines.delay

/**
 * Banner "aggiornamento disponibile", mostrato all'ingresso nell'app quando su Firebase
 * (`/app_update`) c'è una versione più recente di quella installata.
 *
 * Tre azioni, con esiti diversi:
 * - [onUpdateNow]  → apre la sezione "Aggiornamenti" delle Impostazioni;
 * - [onNotNow]     → "Non ora": non lo rivedere più per QUESTA versione (persistito);
 * - [onRemindLater] → "Ricordamelo al prossimo avvio": solo per questa sessione.
 *
 * Se l'aggiornamento è forzato (`forceUpdate`) le due azioni di rinvio restano visibili
 * ma non silenziano il banner per le prossime volte: vedi `canDismiss` in MainActivity.
 */
@Composable
fun UpdateAvailableBanner(
    versionName: String,
    onUpdateNow: () -> Unit,
    onNotNow: () -> Unit,
    onRemindLater: () -> Unit,
    modifier: Modifier = Modifier,
    canDismiss: Boolean = true
) {
    val primaryFocus = remember { FocusRequester() }
    val primaryInteraction = remember { MutableInteractionSource() }
    val primaryFocused by primaryInteraction.collectIsFocusedAsState()
    val notNowInteraction = remember { MutableInteractionSource() }
    val notNowFocused by notNowInteraction.collectIsFocusedAsState()
    val remindInteraction = remember { MutableInteractionSource() }
    val remindFocused by remindInteraction.collectIsFocusedAsState()

    // Autofocus su "Aggiorna ora": col telecomando il banner è utilizzabile subito.
    LaunchedEffect(versionName) {
        repeat(6) {
            delay(60)
            if (runCatching { primaryFocus.requestFocus() }.isSuccess) return@LaunchedEffect
        }
    }

    val shape = RoundedCornerShape(16.dp)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        modifier = modifier
            .clip(shape)
            .background(
                Brush.horizontalGradient(
                    listOf(
                        WaveStreamColors.Accent.copy(alpha = 0.22f),
                        Color.Black.copy(alpha = 0.82f)
                    )
                )
            )
            .border(1.dp, WaveStreamColors.Accent.copy(alpha = 0.55f), shape)
            .padding(horizontal = 18.dp, vertical = 12.dp)
    ) {
        Icon(
            imageVector = Icons.Default.SystemUpdate,
            contentDescription = null,
            tint = WaveStreamColors.Accent,
            modifier = Modifier.size(26.dp)
        )

        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text(
                text = "Aggiornamento disponibile",
                style = MaterialTheme.typography.titleSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "WaveStream $versionName è pronto da installare",
                style = MaterialTheme.typography.bodySmall,
                color = WaveStreamColors.TextSecondary
            )
        }

        Spacer(modifier = Modifier.width(4.dp))

        Button(
            onClick = onUpdateNow,
            colors = ButtonDefaults.buttonColors(
                containerColor = WaveStreamColors.Accent,
                contentColor = Color.White
            ),
            border = if (primaryFocused) BorderStroke(2.dp, Color.White) else null,
            modifier = Modifier
                .focusRequester(primaryFocus)
                .focusable(interactionSource = primaryInteraction)
        ) {
            Text("Aggiorna ora", fontWeight = FontWeight.SemiBold)
        }

        if (canDismiss) {
            TextButton(
                onClick = onNotNow,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = if (notNowFocused) Color.White else WaveStreamColors.TextSecondary
                ),
                border = if (notNowFocused) BorderStroke(
                    1.dp,
                    WaveStreamColors.Accent
                ) else null,
                modifier = Modifier.focusable(interactionSource = notNowInteraction)
            ) {
                Icon(Icons.Default.Close, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Non ora")
            }

            TextButton(
                onClick = onRemindLater,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = if (remindFocused) Color.White else WaveStreamColors.TextSecondary
                ),
                border = if (remindFocused) BorderStroke(
                    1.dp,
                    WaveStreamColors.Accent
                ) else null,
                modifier = Modifier.focusable(interactionSource = remindInteraction)
            ) {
                Icon(Icons.Default.Schedule, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Ricordamelo al prossimo avvio")
            }
        }
    }
}
