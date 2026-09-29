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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import coil.compose.AsyncImage
import coil.imageLoader
import coil.request.ImageRequest
import it.wavestream.app.ui.theme.AppAnimations

/**
 * Overlay "espansione simulata" poster → hero (Motion Contract · EXPAND).
 *
 * Anima una copia dell'immagine della card dal [origin] (rect in coordinate di
 * window) fino a coprire l'intero schermo, poi svanisce rivelando il backdrop
 * reale dei dettagli. Solo `graphicsLayer` (transform + alpha): nessun costo di
 * layout, sicuro per la GPU delle TV.
 *
 * Due accorgimenti contro lo "scatto" dell'immagine:
 *  1. l'immagine viene **precaricata alla dimensione target** prima di far
 *     partire l'animazione (`imageLoader.execute`): senza questo il primo frame
 *     mostrava un overlay vuoto e la copertina compariva a metà espansione;
 *  2. disegno con la **stessa** `ImageRequest` del preload e `crossfade(false)`,
 *     così il bitmap è già in memory cache e non c'è un fade di Coil a
 *     "sporcare" l'expand.
 *
 * Tutte le letture animate avvengono **dentro** `graphicsLayer`: la
 * composizione non viene ricostruita a ogni frame (niente jank su TV stick).
 *
 * @param onFinished invocato al termine (dopo il fade-out) per rimuovere l'overlay.
 */
@Composable
fun ExpandHeroOverlay(
    origin: Rect,
    imageUrl: String?,
    onFinished: () -> Unit,
    modifier: Modifier = Modifier,
) {
    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val density = LocalDensity.current
        val targetW = with(density) { maxWidth.toPx() }
        val targetH = with(density) { maxHeight.toPx() }
        val context = LocalContext.current
        val imageLoader = context.imageLoader

        // Stessa richiesta per preload e disegno: chiave di cache identica →
        // AsyncImage trova il bitmap già decodificato al primo frame.
        val request = remember(imageUrl, targetW, targetH) {
            ImageRequest.Builder(context)
                .data(imageUrl)
                .size(targetW.toInt().coerceAtLeast(1), targetH.toInt().coerceAtLeast(1))
                .crossfade(false)
                .build()
        }

        val expand = remember { Animatable(0f) }
        val fade = remember { Animatable(1f) }

        LaunchedEffect(request) {
            // Attende la decodifica prima di animare: evita il "pop" a metà corsa.
            runCatching { imageLoader.execute(request) }
            expand.animateTo(
                1f,
                tween(AppAnimations.ExpandEnterMs, easing = AppAnimations.Emphasized)
            )
            fade.animateTo(0f, tween(180))
            onFinished()
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    // Letture animate DENTRO il layer: aggiorna solo il graphics
                    // layer, nessuna recomposition per frame.
                    val p = expand.value
                    val left = origin.left + (0f - origin.left) * p
                    val top = origin.top + (0f - origin.top) * p
                    val right = origin.right + (targetW - origin.right) * p
                    val bottom = origin.bottom + (targetH - origin.bottom) * p
                    val rectW = (right - left).coerceAtLeast(1f)
                    val rectH = (bottom - top).coerceAtLeast(1f)

                    transformOrigin = TransformOrigin(0f, 0f)
                    translationX = left
                    translationY = top
                    scaleX = if (targetW > 0f) rectW / targetW else 1f
                    scaleY = if (targetH > 0f) rectH / targetH else 1f
                    alpha = fade.value
                }
        ) {
            AsyncImage(
                model = request,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
