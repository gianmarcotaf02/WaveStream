package it.wavestream.app.ui.theme

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import kotlinx.coroutines.delay

/**
 * Ingresso a cascata riutilizzabile per item di righe/caroselli/griglie
 * (FASE MOTION CONTRACT · categoria CASCADE).
 *
 * Ogni item entra con un fade + slide-up, sfalsato di `staggerMs` rispetto al
 * precedente (max `maxSteps`). La chiave, una volta animata, viene aggiunta a
 * [seen] così l'animazione NON si ripete quando l'item rientra nel viewport
 * durante lo scroll.
 *
 * Usa solo `alpha` + `translationY` (graphicsLayer): nessun costo di layout,
 * sicuro per la GPU delle TV.
 *
 * @param seen registro condiviso per riga/griglia delle chiavi già entrate in scena.
 * @param key chiave stabile dell'item (es. `"MOVIE_123"`).
 * @param index indice dell'item nella riga/griglia.
 */
@Composable
fun Modifier.cascadeIn(
    seen: MutableSet<String>,
    key: String,
    index: Int,
    maxSteps: Int = 8,
    staggerMs: Int = AppAnimations.CascadeStaggerMs,
    durationMs: Int = 350,
    offsetY: Float = 40f,
): Modifier {
    val alreadySeen = remember(key) { key in seen }
    val progress = remember(key) { Animatable(if (alreadySeen) 1f else 0f) }

    LaunchedEffect(key) {
        if (!alreadySeen) {
            delay(index.coerceAtMost(maxSteps) * staggerMs.toLong())
            progress.animateTo(1f, tween(durationMs, easing = FastOutSlowInEasing))
            seen.add(key)
        }
    }

    return this.graphicsLayer {
        alpha = progress.value
        translationY = (1f - progress.value) * offsetY
    }
}
