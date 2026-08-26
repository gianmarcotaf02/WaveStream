package it.wavestream.app.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.accentStroke

/**
 * FASE 1 — Card in vetro riusabile e ottimizzata per D-pad.
 *
 * Combina [GlassSurface] con focus nativo Compose:
 *  - scala + glow accent sul focus (spring, via graphicsLayer: zero ricomposizioni di layout)
 *  - fill semitrasparente + bordo gradiente (fallback sicuro su ogni API)
 *
 * Questa card è la base pronta per sostituire, fase dopo fase, i vari
 * `PosterCard`/`TvContentCard`/`WideCard` sparsi nell'app mantenendo invariata
 * la logica di navigazione.
 */
@Composable
fun GlassCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = GlassTokens.RadiusMedium,
    fill: Color = GlassTokens.SurfaceFill,
    enabled: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.ButtonFocusScale else 1f,
        animationSpec = AppAnimations.SpringSmooth,
        label = "glassCardScale"
    )

    GlassSurface(
        shape = shape,
        fill = fill,
        stroke = if (isFocused) accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient,
        strokeWidth = if (isFocused) 2.dp else 1.dp,
        modifier = modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = enabled,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource),
        content = content
    )
}
