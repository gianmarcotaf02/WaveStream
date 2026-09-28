package it.wavestream.app.ui.components

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.window.Dialog
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens

/**
 * FASE 2 — Dialog in vetro riusabile.
 *
 * Wrapper su [androidx.compose.ui.window.Dialog] con superficie glass (fill
 * semitrasparente + bordo gradiente). Pronto per unificare i vari dialog dell'app
 * (selezione stream, conferme, ecc.) senza toccarne la logica.
 */
@Composable
fun GlassDialog(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = GlassTokens.RadiusLarge,
    fill: Color = GlassTokens.SurfaceFillStrong,
    content: @Composable BoxScope.() -> Unit
) {
    Dialog(onDismissRequest = onDismissRequest) {
        GlassSurface(
            shape = shape,
            fill = fill,
            stroke = GlassTokens.StrokeGradient,
            modifier = modifier,
            content = content
        )
    }
}
