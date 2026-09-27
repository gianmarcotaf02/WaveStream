package it.wavestream.app.ui.details

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import coil.compose.AsyncImage
import it.wavestream.app.ui.theme.AppAnimations

/**
 * Overlay "espansione simulata" poster → hero (Motion Contract · EXPAND).
 *
 * Anima una copia dell'immagine della card dal [origin] (rect in coordinate di
 * window) fino a coprire l'intero schermo, poi svanisce rivelando il backdrop
 * reale dei dettagli. Solo `graphicsLayer` (transform + alpha): nessun costo di
 * layout, sicuro per la GPU delle TV.
 *
 * @param onFinished invocato al termine (dopo il fade-out) per rimuovere l'overlay.
 */
@Composable
fun ExpandHeroOverlay(
    origin: Rect,
    imageUrl: String?,
    onFinished: () -> Unit,
) {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val density = LocalDensity.current
        val targetW = with(density) { maxWidth.toPx() }
        val targetH = with(density) { maxHeight.toPx() }

        val expand = remember { Animatable(0f) }
        val fade = remember { Animatable(1f) }

        LaunchedEffect(Unit) {
            expand.animateTo(
                1f,
                tween(AppAnimations.ExpandEnterMs, easing = AppAnimations.Emphasized)
            )
            fade.animateTo(0f, tween(180))
            onFinished()
        }

        val p = expand.value
        val left = origin.left + (0f - origin.left) * p
        val top = origin.top + (0f - origin.top) * p
        val right = origin.right + (targetW - origin.right) * p
        val bottom = origin.bottom + (targetH - origin.bottom) * p
        val rectW = (right - left).coerceAtLeast(1f)
        val rectH = (bottom - top).coerceAtLeast(1f)

        Box(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    transformOrigin = TransformOrigin(0f, 0f)
                    translationX = left
                    translationY = top
                    scaleX = if (targetW > 0f) rectW / targetW else 1f
                    scaleY = if (targetH > 0f) rectH / targetH else 1f
                    alpha = fade.value
                }
        ) {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
