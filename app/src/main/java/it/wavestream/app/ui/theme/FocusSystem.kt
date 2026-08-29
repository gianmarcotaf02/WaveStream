package it.wavestream.app.ui.theme

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

/**
 * FASE 1 — "Aurora" Focus System.
 *
 * Su Android TV il focus È l'interfaccia: questo file centralizza il comportamento
 * di focus in un unico Modifier riutilizzabile, sostituendo il semplice bordo
 * statico usato finora. Tre livelli, tutti economici per la GPU TV:
 *
 *   Lvl 1 — SCALE      spring già esistente ([AppAnimations.SpringCardFocus])
 *   Lvl 2 — RING       bordo 2dp accent con fade [AppAnimations.DimFade]
 *   Lvl 3 — GLOW       3 stroke concentrici a alpha decrescente (NO RenderEffect
 *                      / blur: funziona identico su API 26+ e in scroll)
 *
 * Uso tipico su una card D-pad focusable:
 *
 *   val interactionSource = remember { MutableInteractionSource() }
 *   Box(
 *     modifier = Modifier
 *       .focusable(interactionSource = interactionSource)
 *       .tvFocus(interactionSource, shape = GlassTokens.RadiusMedium)
 *   )
 *
 * NOTA: applicare .tvFocus DOPO .focusable / .focusableInScroll ecc., così
 * l'InteractionSource è la stessa che genera gli stati focus.
 *
 * TODO (Fase 2+): dimming ambientale delle superfici non focalizzate
 *  ([WaveStreamColors.DimmingAlpha]) da implementare a livello di riga/carosello,
 *  dove è noto quale child ha il focus.
 */
@Composable
fun Modifier.tvFocus(
    interactionSource: InteractionSource,
    shape: Shape = GlassTokens.RadiusMedium,
    scale: Float = 1.08f,
    showRing: Boolean = true,
    showGlow: Boolean = true,
): Modifier {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val accent = WaveStreamColors.Accent

    val animatedScale by animateFloatAsState(
        targetValue = if (isFocused) scale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "tvFocusScale"
    )
    val ringAlpha by animateFloatAsState(
        targetValue = if (isFocused && showRing) 1f else 0f,
        animationSpec = AppAnimations.DimFade,
        label = "tvFocusRing"
    )
    val glowAlpha by animateFloatAsState(
        targetValue = if (isFocused && showGlow) 1f else 0f,
        animationSpec = AppAnimations.DimFade,
        label = "tvFocusGlow"
    )

    return this
        .graphicsLayer {
            scaleX = animatedScale
            scaleY = animatedScale
        }
        .drawBehind {
            if (ringAlpha > 0f || glowAlpha > 0f) {
                drawFocusOutlines(shape, accent, ringAlpha, glowAlpha)
            }
        }
}

/**
 * Variante "pulsante/pill": scala contenuta e ring pieno, pensata per elementi
 * orizzontali dove uno scale 1.08 invaderebbe il vicino (chips, bottoni riga OSD).
 */
@Composable
fun Modifier.tvFocusPill(
    interactionSource: InteractionSource,
    shape: Shape = GlassTokens.RadiusSmall,
    scale: Float = 1.04f,
): Modifier = tvFocus(
    interactionSource = interactionSource,
    shape = shape,
    scale = scale,
    showRing = true,
    showGlow = false
)

/**
 * Lvl 2 + Lvl 3: ring accent + glow "a cipolla" con stroke concentrici.
 * Un draw pass singolo, zero bitmap, zero blur — stesso costo su API 26 e 34.
 */
private fun DrawScope.drawFocusOutlines(
    shape: Shape,
    accent: Color,
    ringAlpha: Float,
    glowAlpha: Float
) {
    val outline = shape.createOutline(size, layoutDirection, this)

    if (glowAlpha > 0f) {
        val baseWidth = 14.dp.toPx()
        drawOutline(outline, accent.copy(alpha = 0.07f * glowAlpha), style = Stroke(width = baseWidth))
        drawOutline(outline, accent.copy(alpha = 0.13f * glowAlpha), style = Stroke(width = baseWidth * 0.6f))
        drawOutline(outline, accent.copy(alpha = 0.20f * glowAlpha), style = Stroke(width = baseWidth * 0.3f))
    }

    if (ringAlpha > 0f) {
        drawOutline(outline, accent.copy(alpha = ringAlpha), style = Stroke(width = 2.dp.toPx()))
    }
}
