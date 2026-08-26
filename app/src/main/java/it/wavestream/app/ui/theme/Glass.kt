package it.wavestream.app.ui.theme

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * FASE 1 — "Liquid Glass" Design System.
 *
 * Sistema di token e componenti per le superfici in vetro.
 *
 * IMPORTANTE (performance su GPU TV):
 *  - Il blur `RenderEffect` è disponibile solo da API 31+. Sotto questa soglia
 *    (minSdk 26) il componente cade automaticamente su un fill semitrasparente
 *    + bordo gradiente, cioè il "fallback smart" già usato dall'app.
 *  - Il blur va usato SOLO su overlay piccoli e statici (drawer, dialog, banner),
 *    MAI su schermo intero continuo né durante scroll.
 *
 * Per la Fase 1 il vetro viene applicato con fill + bordo gradiente (zero blur),
 * che è la via più sicura e più economica. Il blur true-to-glass verrà attivato
 * in Fase 2 sugli overlay del player/drawer EPG tramite [glassSurfaceBlur].
 */
object GlassTokens {

    /** Raggio blur (px) — deliberatamente contenuto: 18 è già sufficiente ed economico. */
    const val BlurRadius = 18f

    // Fill semitrasparenti (fallback & look base del vetro)
    val SurfaceFill = Color(0x1FFFFFFF)          // 12% white — chip, pill
    val SurfaceFillStrong = Color(0x2EFFFFFF)    // 18% white — card flottanti
    val SurfaceFillDark = Color(0x40101418)      // scrim overlay (video)

    // Bordo vetro "neutro": bianco 30% → trasparente
    val StrokeGradient = Brush.linearGradient(
        colors = listOf(
            Color.White.copy(alpha = 0.30f),
            Color.White.copy(alpha = 0.05f)
        )
    )

    // Forme standard
    val RadiusSmall = RoundedCornerShape(8.dp)
    val RadiusMedium = RoundedCornerShape(16.dp)
    val RadiusLarge = RoundedCornerShape(28.dp)

    /**
     * Bordo "accent" da usare quando l'elemento è focalizzato.
     * È una funzione perché dipende dall'accent colore dinamico (non statico).
     */
    fun accentStroke(accent: Color): Brush = Brush.linearGradient(
        colors = listOf(
            accent.copy(alpha = 0.55f),
            Color.White.copy(alpha = 0.10f)
        )
    )
}

/**
 * Modifier che applica il blur "frosted glass" via RenderEffect (solo API 31+).
 *
 * NOTA TECNICA: `RenderEffect` sfoca il contenuto del layer a cui è applicato.
 * Per ottenere il vero effetto "sfocato dietro" il contenitore glass va quindi
 * posizionato sopra un layer che contiene lo sfondo (video/immagine), oppure lo
 * sfondo va applicato allo stesso layer. Sugli overlay statici questo pattern è
 * quello corretto ed è il più economico.
 *
 * Se [enabled] è false, oppure su API < 31, restituisce il modifier invariato
 * (nessun blur — si usa il fill semitrasparente).
 */
fun Modifier.glassSurfaceBlur(enabled: Boolean = true): Modifier {
    if (!enabled || Build.VERSION.SDK_INT < Build.VERSION_CODES.S) return this
    val renderEffect = RenderEffect.createBlurEffect(
        GlassTokens.BlurRadius,
        GlassTokens.BlurRadius,
        Shader.TileMode.CLAMP
    )
    return this.graphicsLayer { this.renderEffect = renderEffect }
}

/**
 * Superficie in vetro riusabile: fill semitrasparente + bordo gradiente.
 *
 * @param shape      forma della superficie
 * @param fill       fill semitrasparente (vedi [GlassTokens.SurfaceFill])
 * @param stroke     brush del bordo (neutro o accent su focus)
 * @param strokeWidth spessore del bordo
 * @param blurEnabled abilita il blur RenderEffect (solo API 31+, economico su overlay statici)
 * @param content    contenuto della superficie
 */
@Composable
fun GlassSurface(
    modifier: Modifier = Modifier,
    shape: Shape = GlassTokens.RadiusMedium,
    fill: Color = GlassTokens.SurfaceFill,
    stroke: Brush = GlassTokens.StrokeGradient,
    strokeWidth: Dp = 1.dp,
    blurEnabled: Boolean = false,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .glassSurfaceBlur(enabled = blurEnabled)
            .clip(shape)
            .background(fill)
            .border(strokeWidth, stroke, shape),
        content = content
    )
}
