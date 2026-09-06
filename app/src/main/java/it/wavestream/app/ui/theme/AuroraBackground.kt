package it.wavestream.app.ui.theme

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

/**
 * FASE 3 — "Corrente" ambientale animata.
 *
 * Una luce organica che respira dietro il contenuto: due bagliori radiali molto
 * morbidi (uno accent, uno blu profondo) che derivano lentamente sullo schermo.
 *
 * PERCHE' È ECONOMICO SU TV:
 *  - Il gradiente radiale viene disegnato UNA volta dentro un Box a misura fissa.
 *  - Il movimento avviene SOLO tramite `graphicsLayer` (translation), che è una
 *    pura trasformazione di matrice sulla GPU: NESSUNA ricomposizione per frame.
 *  - Ciclo lungo (~45s) e easing lineare → la GPU non deve mai disegnare nulla di
 *    nuovo tra un frame e l'altro, solo spostare due layer.
 *
 * Da mettere come PRIMO figlio dietro al contenuto di una schermata.
 */
@Composable
fun AuroraBackground(
    modifier: Modifier = Modifier.fillMaxSize()
) {
    val transition = rememberInfiniteTransition(label = "aurora")

    // 0f..1f su cicli lunghi e sfasati: i bagliori non si muovono mai in sincrono.
    val driftA by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 42000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
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

    Box(modifier = modifier) {
        // Bagliore accent (in alto a destra) — illumina come una "luce d'acqua".
        AuroraGlow(
            baseColor = WaveStreamColors.Accent,
            sizeFraction = 0.72f,
            alpha = 0.085f,
            anchor = Alignment.TopEnd,
            drift = driftA,
            baseDrift = 0f,
            modifier = Modifier.fillMaxSize()
        )
        // Bagliore blu profondo (in basso a sinistra) — profondità oceanica.
        AuroraGlow(
            baseColor = WaveStreamColors.GradientTop,
            sizeFraction = 0.9f,
            alpha = 0.16f,
            anchor = Alignment.BottomStart,
            drift = driftB,
            baseDrift = 0f,
            modifier = Modifier.fillMaxSize()
        )
    }
}

/**
 * Un singolo bagliore radiale morbido, ancorato a un angolo e fatto derivare
 * lentamente via graphicsLayer. La forma circolare è grande quanto la schermata
 * e fuoriesce dai bordi (soft, senza tagli netti).
 */
@Composable
private fun BoxScope.AuroraGlow(
    baseColor: androidx.compose.ui.graphics.Color,
    sizeFraction: Float,
    alpha: Float,
    anchor: Alignment,
    drift: Float,
    baseDrift: Float,
    modifier: Modifier
) {
    // Range di spostamento in px: abbastanza da far "respirare" ma senza
    // sbilanciare la scena.
    val amplitude = 220f

    Box(
        modifier = modifier
            // Solo traslazione: il layer è cacheato, nessun redraw per frame.
            .graphicsLayer {
                translationX = (drift - baseDrift) * amplitude
                translationY = (drift * 0.6f) * (amplitude * 0.6f)
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
                            androidx.compose.ui.graphics.Color.Transparent
                        ),
                        radius = 900f
                    ),
                    shape = CircleShape
                )
        )
    }
}
