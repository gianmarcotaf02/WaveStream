package it.wavestream.app.ui.theme

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically

/**
 * Centralized animation constants for consistent UX across the app
 * Premium Netflix-level animation system
 */
object AppAnimations {
    
    // ============== Spring Animations ==============
    
    /** Bouncy spring for playful elements (tabs, indicators) */
    val SpringBouncy = spring<Float>(
        dampingRatio = 0.6f,
        stiffness = 300f
    )
    
    /** Smooth spring for subtle animations (focus, hover) */
    val SpringSmooth = spring<Float>(
        dampingRatio = 0.8f,
        stiffness = 400f
    )
    
    /** Quick spring for responsive feedback */
    val SpringQuick = spring<Float>(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = Spring.StiffnessMedium
    )
    
    /** Gentle spring for carousel items */
    val SpringGentle = spring<Float>(
        dampingRatio = 0.7f,
        stiffness = Spring.StiffnessLow
    )
    
    /** Card focus spring - fast and snappy with subtle overshoot */
    val SpringCardFocus = spring<Float>(
        dampingRatio = 0.75f,
        stiffness = 500f
    )
    
    /** Button press spring - instant response */
    val SpringButtonPress = spring<Float>(
        dampingRatio = 0.65f,
        stiffness = 600f
    )
    
    /** Glow spring - smooth fade for glow effects */
    val SpringGlow = spring<Float>(
        dampingRatio = 0.85f,
        stiffness = 350f
    )
    
    // ============== FASE 1 — Aurora motion tokens ==============

    /** Fade del dimming ambientale e dei bordi focus (non-spring: lineare e discreto). */
    val DimFade = tween<Float>(
        durationMillis = 220,
        easing = androidx.compose.animation.core.FastOutSlowInEasing
    )

    /** Ritardo tra un elemento e il successivo nelle cascade d'ingresso delle righe. */
    const val CascadeStaggerMs = 35
    
    // ============== Duration Constants ==============
    
    /** Fast fade duration (ms) */
    const val FadeMs = 250
    
    /** Standard slide duration (ms) */
    const val SlideMs = 300
    
    /** Stagger delay between items (ms) */
    const val StaggerMs = 50
    
    /** Activity transition duration (ms) */
    const val ActivityTransitionMs = 350
    
    /** Hero crossfade duration (ms) */
    const val HeroCrossfadeMs = 500
    
    /** Card info reveal duration (ms) */
    const val CardInfoRevealMs = 200
    
    // ============== Scale Values ==============
    
    /** Card focus scale */
    const val CardFocusScale = 1.08f
    
    /** Button focus scale */
    const val ButtonFocusScale = 1.05f
    
    /** Icon button focus scale */
    const val IconButtonFocusScale = 1.15f
    
    /** Button press scale */
    const val ButtonPressScale = 0.98f
    
    /** Grid item focus scale */
    const val GridItemFocusScale = 1.05f
    
    // ============== Glow Values ==============
    
    /** Glow shadow elevation when focused */
    const val FocusGlowElevation = 16f
    
    /** Glow shadow elevation when unfocused */
    const val UnfocusedGlowElevation = 0f
    
    /** Glow alpha when focused */
    const val FocusGlowAlpha = 0.4f

    // ============== Glass / Floating tokens (FASE 1) ==============

    /** Overlay fade in/out duration (ms) — pill, banner, drawer */
    const val GlassFadeMs = 150

    /** Drawer/slide-in duration (ms) */
    const val GlassSlideMs = 240

    /** Scale del pill vetro su focus */
    const val GlassPillFocusScale = 1.06f

    /** Spring per overlay vetro (liscio, senza overshoot eccessivo) */
    val SpringGlass = spring<Float>(
        dampingRatio = 0.8f,
        stiffness = 500f
    )

    /**
     * Spring per le animazioni di COLORE (fill/bordo su focus).
     * `animateColorAsState` richiede `AnimationSpec<Color>`, non `SpringSpec<Float>`:
     * stessi parametri di [SpringCardFocus] per restare coerenti.
     */
    val SpringCardFocusColor = spring<androidx.compose.ui.graphics.Color>(
        dampingRatio = 0.75f,
        stiffness = 500f
    )

    // ============== Pre-built Enter/Exit Specs ==============
    
    /** Fade in animation */
    val fadeInSpec = fadeIn(tween(FadeMs))
    
    /** Fade out animation */
    val fadeOutSpec = fadeOut(tween(FadeMs))
    
    /** Slide in from bottom with fade */
    fun slideInFromBottom(delayMs: Int = 0) = fadeIn(tween(SlideMs, delayMillis = delayMs)) + 
        slideInVertically(tween(SlideMs, delayMillis = delayMs)) { it / 4 }
    
    /** Slide out to bottom with fade */
    val slideOutToBottom = fadeOut(tween(SlideMs)) + 
        slideOutVertically(tween(SlideMs)) { it / 4 }

    // ======================================================================
    // FASE MOTION CONTRACT (03-motion-contract.md)
    // Categorie normative: EXPAND, ZOOM, FADE, AXIS_Y, TAB_SWAP, OVERLAY,
    // LIST_ITEM. Solo alpha + graphicsLayer; vietato blur/RenderEffect.
    // ======================================================================

    // ---------- Easing curves ----------

    /** Transizioni interne importanti (EXPAND, hero, AXIS_Y). */
    val Emphasized = CubicBezierEasing(0.2f, 0f, 0f, 1f)

    /** Entrata contenuto (decelera). */
    val EmphasizedDecelerate = CubicBezierEasing(0.05f, 0.7f, 0.1f, 1f)

    /** Uscita contenuto (accelera). */
    val EmphasizedAccelerate = CubicBezierEasing(0.3f, 0f, 0.8f, 0.15f)

    // ---------- Durate per categoria (ms) ----------

    const val ExpandEnterMs = 480
    const val ExpandExitMs = 300
    const val ZoomEnterMs = 320
    const val ZoomExitMs = 260
    const val FadeEnterMs = 220
    const val FadeExitMs = 180
    const val AxisYEnterMs = 320
    const val AxisYExitMs = 260
    const val TabSwapMs = 300
    const val OverlayEnterMs = 200
    const val OverlayExitMs = 150
    const val ListItemEnterMs = 250
    const val ListItemExitMs = 200

    /** Scala iniziale/finale della categoria ZOOM. */
    const val ZoomEnterScale = 0.96f

    // ---------- Spec generiche ----------

    /** tween con easing Emphasized della durata richiesta. */
    fun <T> emphasizedSpec(durationMs: Int) = tween<T>(durationMs, easing = Emphasized)

    // ---------- Enter/Exit pre-costruiti ----------

    /** EXPAND — poster/backdrop → hero. Cinematico. */
    val expandIn: EnterTransition =
        fadeIn(tween(ExpandEnterMs, easing = EmphasizedDecelerate))

    val expandOut: ExitTransition =
        fadeOut(tween(ExpandExitMs, easing = EmphasizedAccelerate))

    /** ZOOM — player/backdrop. scale 0.96→1 + fade. */
    val zoomIn: EnterTransition =
        fadeIn(tween(ZoomEnterMs, easing = EmphasizedDecelerate)) +
            scaleIn(
                initialScale = ZoomEnterScale,
                animationSpec = tween(ZoomEnterMs, easing = EmphasizedDecelerate)
            )

    val zoomOut: ExitTransition =
        fadeOut(tween(ZoomExitMs, easing = EmphasizedAccelerate)) +
            scaleOut(
                targetScale = ZoomEnterScale,
                animationSpec = tween(ZoomExitMs, easing = EmphasizedAccelerate)
            )

    /** FADE — pari livello tra schermate (fade-through). */
    val fadeThroughIn: EnterTransition =
        fadeIn(tween(FadeEnterMs, easing = androidx.compose.animation.core.FastOutSlowInEasing))

    val fadeThroughOut: ExitTransition =
        fadeOut(tween(FadeExitMs, easing = androidx.compose.animation.core.FastOutSlowInEasing))

    /** TAB_SWAP — fade-through sequenziale per il cambio tab (out veloce, in ritardato). */
    val tabSwapIn: EnterTransition =
        fadeIn(
            tween(
                TabSwapMs,
                delayMillis = TabSwapMs / 3,
                easing = androidx.compose.animation.core.FastOutSlowInEasing
            )
        )

    val tabSwapOut: ExitTransition =
        fadeOut(
            tween(
                TabSwapMs / 2,
                easing = androidx.compose.animation.core.FastOutSlowInEasing
            )
        )

    /** AXIS_Y — modali/wizard (slide verticale breve + fade). */
    fun sharedAxisYEnter(): EnterTransition =
        fadeIn(tween(AxisYEnterMs, easing = EmphasizedDecelerate)) +
            slideInVertically(tween(AxisYEnterMs, easing = EmphasizedDecelerate)) { it / 12 }

    fun sharedAxisYExit(): ExitTransition =
        fadeOut(tween(AxisYExitMs, easing = EmphasizedAccelerate)) +
            slideOutVertically(tween(AxisYExitMs, easing = EmphasizedAccelerate)) { -it / 12 }

    /** OVERLAY — controlli/menu/pill (vetro). */
    val overlayIn: EnterTransition = fadeIn(tween(OverlayEnterMs))
    val overlayOut: ExitTransition = fadeOut(tween(OverlayExitMs))

    /** LIST_ITEM — add/remove dinamico in liste. */
    val listItemIn: EnterTransition =
        fadeIn(tween(ListItemEnterMs, easing = androidx.compose.animation.core.FastOutSlowInEasing)) +
            slideInVertically(tween(ListItemEnterMs, easing = androidx.compose.animation.core.FastOutSlowInEasing)) { it / 8 }

    val listItemOut: ExitTransition =
        fadeOut(tween(ListItemExitMs)) +
            slideOutVertically(tween(ListItemExitMs)) { -it / 8 }

    /**
     * REVEAL — apertura lenta "a scoperta" (es. rail "Potrebbe piacerti"):
     * dissolvenza lunga con un accenno di salita. Usata sia per film che per serie.
     */
    const val RevealEnterMs = 800
    const val RevealExitMs = 320

    val revealEnter: EnterTransition =
        fadeIn(tween(RevealEnterMs, easing = EmphasizedDecelerate)) +
            slideInVertically(
                tween(RevealEnterMs, easing = EmphasizedDecelerate)
            ) { it / 20 }

    val revealExit: ExitTransition =
        fadeOut(tween(RevealExitMs, easing = androidx.compose.animation.core.FastOutSlowInEasing))
}
