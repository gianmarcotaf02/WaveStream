package it.wavestream.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/** Durata del long-press del tasto OK per aggiungere/rimuovere un preferito. */
const val CATEGORY_FAVORITE_LONG_PRESS_MS = 1500L

/** Rosso del cuoricino dei preferiti. */
val CategoryFavoriteRed = Color(0xFFFF1744)

/**
 * Rileva la pressione prolungata (~1.5s) del tasto OK/Enter del telecomando.
 *
 * Va applicato a un elemento focusabile, prima di `.clickable`.
 * - Pressione breve → non consuma l'evento, quindi il click apre la categoria.
 * - Pressione lunga → invoca [onLongPress] e consuma il rilascio, così il click
 *   non apre anche la categoria.
 */
@Composable
fun Modifier.categoryLongPress(
    onLongPress: () -> Unit,
    durationMs: Long = CATEGORY_FAVORITE_LONG_PRESS_MS
): Modifier {
    val scope = rememberCoroutineScope()
    var job by remember { mutableStateOf<Job?>(null) }
    var fired by remember { mutableStateOf(false) }

    return this.onPreviewKeyEvent { event ->
        val isConfirm = event.key == Key.Enter ||
            event.key == Key.NumPadEnter ||
            event.key == Key.DirectionCenter
        if (!isConfirm) return@onPreviewKeyEvent false

        when (event.type) {
            KeyEventType.KeyDown -> {
                if (job == null) {
                    job = scope.launch {
                        delay(durationMs)
                        fired = true
                        onLongPress()
                    }
                }
                false
            }
            KeyEventType.KeyUp -> {
                job?.cancel()
                job = null
                if (fired) {
                    fired = false
                    true // consuma il rilascio per non far scattare anche il click
                } else {
                    false
                }
            }
            else -> false
        }
    }
}

/**
 * Cuoricino rosso dei preferiti, da posizionare in basso a destra della card categoria.
 */
@Composable
fun CategoryFavoriteHeart(
    isFavorite: Boolean,
    modifier: Modifier = Modifier
) {
    if (!isFavorite) return
    Box(
        modifier = modifier
            .size(30.dp)
            .clip(CircleShape)
            .background(Color.Black.copy(alpha = 0.5f)),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Preferito",
            tint = CategoryFavoriteRed,
            modifier = Modifier.size(20.dp)
        )
    }
}
