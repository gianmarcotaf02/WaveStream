package it.wavestream.app.ui.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
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
 * Stato del long-press tenuto fuori dal sistema osservabile di Compose: cosi'
 * le ricomposizioni (es. l'animazione della scala al focus) non rimpiazzano il
 * nodo di input mentre l'utente tiene premuto OK, che era la causa del
 * long-press che non scattava piu'.
 */
private class CategoryLongPressTracker {
    var job: Job? = null
    var fired: Boolean = false
}

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
    val tracker = remember { CategoryLongPressTracker() }
    val currentOnLongPress by rememberUpdatedState(onLongPress)

    return this.onPreviewKeyEvent { event ->
        val isConfirm = event.key == Key.Enter ||
            event.key == Key.NumPadEnter ||
            event.key == Key.DirectionCenter
        if (!isConfirm) return@onPreviewKeyEvent false

        when (event.type) {
            KeyEventType.KeyDown -> {
                // Auto-repeat del telecomando: avvia il timer solo al primo KeyDown.
                if (tracker.job == null && !tracker.fired) {
                    tracker.job = scope.launch {
                        delay(durationMs)
                        tracker.fired = true
                        currentOnLongPress()
                    }
                }
                false
            }
            KeyEventType.KeyUp -> {
                tracker.job?.cancel()
                tracker.job = null
                if (tracker.fired) {
                    tracker.fired = false
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
 * Compare con un'animazione "pop" (scala + fade) quando la categoria diventa preferita.
 */
@Composable
fun CategoryFavoriteHeart(
    isFavorite: Boolean,
    modifier: Modifier = Modifier
) {
    val scale by animateFloatAsState(
        targetValue = if (isFavorite) 1f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "categoryFavoriteScale"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isFavorite) 1f else 0f,
        animationSpec = spring(stiffness = Spring.StiffnessMedium),
        label = "categoryFavoriteAlpha"
    )

    Box(
        modifier = modifier
            .size(30.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
                this.alpha = alpha
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = if (isFavorite) "Preferito" else null,
            tint = CategoryFavoriteRed,
            modifier = Modifier.size(20.dp)
        )
    }
}
