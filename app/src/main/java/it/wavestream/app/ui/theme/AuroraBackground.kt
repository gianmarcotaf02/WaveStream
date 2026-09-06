package it.wavestream.app.ui.theme

import android.app.ActivityManager
import android.content.Context
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext

/**
 * FASE 3 — "Corrente" ambientale.
 *
 * Una luce organica dietro il contenuto: due bagliori radiali morbidi (uno accent,
 * uno blu profondo) che danno profondità e aria alla scena.
 *
 * ADATTIVA PER HARDWARE DEBOLE (Xiaomi TV Stick 2GB ecc.):
 *  - Se il device è low-RAM o ha < 3.5 GB, il componente renderizza SOLO la
 *    versione STATICA: i due bagliori vengono disegnati una volta e restano
 *    fermi (layer cacheati, costo praticamente nullo per frame).
 *  - L'animazione continua (drift lento) parte SOLO su device con memoria
 *    sufficiente. È fatta via `graphicsLayer` (pura traslazione GPU, nessuna
 *    ricomposizione), ma su stick economici anche questo può competere con lo
 *    scroll delle righe: meglio sacrificare il movimento che i frame.
 *
 * Da mettere come PRIMO figlio dietro al contenuto di una schermata.
 */
@Composable
fun AuroraBackground(
    modifier: Modifier = Modifier.fillMaxSize()
) {
    val context = LocalContext.current
    val animate = remember(context) { isAnimationCapable(context) }

    if (animate) {
        AnimatedAurora(modifier)
    } else {
        StaticAurora(modifier)
    }
}

/**
 * Soglia conservativa: l'animazione continua vale il costo solo con memoria
 * abbondante. Xiaomi TV Stick (2GB) e simili restano sotto soglia → statico.
 */
private fun isAnimationCapable(context: Context): Boolean {
    val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    if (am.isLowRamDevice) return false
    val mem = ActivityManager.MemoryInfo()
    am.getMemoryInfo(mem)
    return mem.totalMem >= 3_500_000_000L // 3.5 GB
}

/** Bagliori statici: disegnati una volta, zero lavoro per frame. */
@Composable
private fun StaticAurora(modifier: Modifier) {
    Box(modifier = modifier) {
        AuroraGlow(
            baseColor = WaveStreamColors.Accent,
            sizeFraction = 0.72f,
            alpha = 0.085f,
            anchor = Alignment.TopEnd,
            translationX = 60f,
            translationY = -40f,
            modifier = Modifier.fillMaxSize()
        )
        AuroraGlow(
            baseColor = WaveStreamColors.GradientTop,
            sizeFraction = 0.9f,
            alpha = 0.16f,
            anchor = Alignment.BottomStart,
            translationX = -40f,
            translationY = 60f,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
private fun AnimatedAurora(modifier: Modifier) {
    val transition = rememberInfiniteTransition(label = "aurora")

    // Cicli lunghi e SFASATI, entrambi in Reverse: il movimento è sinusoidale
    // (nessuno scatto di ritorno a inizio ciclo).
    val driftA by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 42000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "auroraA"
    )
    val driftB by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 56000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "auroraB"
    )

    val amplitude = 220f

    Box(modifier = modifier) {
        AuroraGlow(
            baseColor = WaveStreamColors.Accent,
            sizeFraction = 0.72f,
            alpha = 0.085f,
            anchor = Alignment.TopEnd,
            translationX = driftA * amplitude,
            translationY = driftA * (amplitude * 0.5f),
            modifier = Modifier.fillMaxSize()
        )
        AuroraGlow(
            baseColor = WaveStreamColors.GradientTop,
            sizeFraction = 0.9f,
            alpha = 0.16f,
            anchor = Alignment.BottomStart,
            translationX = driftB * amplitude,
            translationY = driftB * (amplitude * 0.6f),
            modifier = Modifier.fillMaxSize()
        )
    }
}

/**
 * Un singolo bagliore radiale morbido, ancorato a un angolo e spostato via
 * `graphicsLayer` (solo trasformazione GPU, nessun redraw del gradiente).
 */
@Composable
private fun BoxScope.AuroraGlow(
    baseColor: Color,
    sizeFraction: Float,
    alpha: Float,
    anchor: Alignment,
    translationX: Float,
    translationY: Float,
    modifier: Modifier
) {
    Box(
        modifier = modifier.graphicsLayer {
            this.translationX = translationX
            this.translationY = translationY
        },
        contentAlignment = anchor
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(sizeFraction)
                .fillMaxHeight(sizeFraction)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            baseColor.copy(alpha = alpha),
                            baseColor.copy(alpha = alpha * 0.35f),
                            Color.Transparent
                        ),
                        radius = 900f
                    ),
                    shape = CircleShape
                )
        )
    }
}
