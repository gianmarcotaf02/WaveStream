package it.wavestream.app.ui.loading

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.R
import it.wavestream.app.ui.components.WaveForm
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.SoraFontFamily
import it.wavestream.app.ui.theme.WaveStreamColors
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sin

// ======================================================================
//  Timeline della splash (ms)
// ======================================================================

/** Scorrimento continuo dell'onda — identico al player. */
private const val AmbientScrollMs = 1600

/** "Respiro" dell'ampiezza — identico al player. */
private const val AmbientBreathMs = 1100

private const val T_BG_END = 360f            // Corrente + alone + logo entrano
private const val T_WAVE_IN_START = 360f     // l'onda emerge da dietro il marchio
private const val T_WAVE_IN_END = 700f
private const val T_WORD_START = 720f        // cascade del wordmark
private const val T_WORD_STAGGER = 28f
private const val T_WORD_DUR = 280f
private const val T_CRASH_START = 1420f      // l'ondata si alza, si arriccia e si schianta
private const val T_MAX_HOLD_MS = 4000L      // rete di sicurezza: si procede comunque

/** Istante (ms) in cui l'ondata copre completamente lo schermo. */
const val SplashCoveredMs = 2030

/** Durata (ms) della ritirata che scopre la destinazione. */
const val SplashDrainMs = 420

private val T_COVER = SplashCoveredMs.toFloat()

/** Geometria del blocco marchio ([SplashMark]) — 480x340 dp, centrato. */
private const val MarkWidth = 480
private const val MarkHeight = 340
private const val MarkLogoSize = 152
private const val WaveBandTop = 96           // offset Y dell'onda dentro il blocco
private const val WaveBandHeight = 150
private const val WordmarkTop = 214

// 3D finto dell'ondata (2.5D). Valori volutamente contenuti: "più piano".
private const val CrashAmpMax = 46f
private const val CrashLipMax = 78f
private const val CrashSegments = 72
private const val CrashSlope = -0.17f        // cresta inclinata: scopre da sinistra

// ======================================================================
//  Utilità di timeline
// ======================================================================

private fun progress(t: Float, from: Float, to: Float): Float =
    if (to <= from) 1f else ((t - from) / (to - from)).coerceIn(0f, 1f)

private fun eased(t: Float, from: Float, to: Float, curve: Easing): Float =
    curve.transform(progress(t, from, to))

private fun lerp(a: Float, b: Float, p: Float) = a + (b - a) * p

/**
 * Splash screen WaveStream.
 *
 * Sequenza unica e continua, in quattro atti:
 *
 *  1. **Affiorare** — la Corrente entra, l'alone accent si accende, il marchio
 *     compare in vetro.
 *  2. **Onda** — le tre sinusoidi di [WaveForm] emergono da dietro il marchio,
 *     rivelate dal centro verso i lati.
 *  3. **Marchio** — il wordmark entra lettera per lettera (cascade).
 *  4. **Schianto** — l'onda monta dalla *stessa linea* su cui stava, si arriccia
 *     (labbro + barile + riflesso + spruzzi) e travolge lo schermo. Poi la cresta
 *     recede, inclinata, scoprendo la selezione profili composta **sotto**:
 *     non c'è dissolvenza tra le due schermate, le rivela l'onda.
 *
 * La fase 4 non parte finché [ready] non è `true`, così la cresta non si ritira
 * su una schermata ancora vuota. Oltre [T_MAX_HOLD_MS] si procede comunque.
 *
 * ## Nota sulle performance (importante)
 * Tutti i valori animati sono passati come **provider** (`() -> Float`) e letti
 * dentro `graphicsLayer { }` o dentro il blocco di disegno del `Canvas`. Questo è
 * il *deferred read*: l'aggiornamento a 60 fps tocca solo il layer o il disegno e
 * **non ricompone** l'albero. Leggere `Animatable.value` nel corpo del composable
 * farebbe invece ricomporre l'intera splash — wordmark compreso — ad ogni frame.
 *
 * Vincoli rispettati: nessun blur / `RenderEffect`, nessuna animazione di layout
 * (solo `graphicsLayer` e disegno su Canvas), loop infiniti solo decorativi.
 */
@Composable
fun SplashScreen(
    ready: Boolean,
    onRevealStart: () -> Unit,
    onComplete: () -> Unit,
    modifier: Modifier = Modifier,
) {
    // ---- Onda ambientale: scorrimento e respiro (loop decorativi, come nel player)
    val ambient = rememberInfiniteTransition(label = "splashAmbient")
    val scrollPhase = ambient.animateFloat(
        initialValue = 0f,
        targetValue = (2.0 * PI).toFloat(),
        animationSpec = infiniteRepeatable(
            animation = tween(AmbientScrollMs, easing = LinearEasing),
            repeatMode = RepeatMode.Restart,
        ),
        label = "scrollPhase",
    )
    val breath = ambient.animateFloat(
        initialValue = 0.55f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(AmbientBreathMs, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "breath",
    )

    // ---- Le due fasi coreografate
    val approach = remember { Animatable(0f) }
    val drain = remember { Animatable(0f) }
    var drainStarted by remember { mutableStateOf(false) }
    var forcedReady by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        approach.animateTo(1f, tween(SplashCoveredMs, easing = LinearEasing))
    }
    LaunchedEffect(Unit) {
        delay(T_MAX_HOLD_MS)
        forcedReady = true
    }
    LaunchedEffect(ready, forcedReady) {
        if (drainStarted || !(ready || forcedReady)) return@LaunchedEffect
        drainStarted = true
        onRevealStart()
        drain.animateTo(1f, tween(SplashDrainMs, easing = LinearEasing))
        onComplete()
    }

    // ---- Provider (deferred read): la composizione non legge mai lo stato animato
    val tProvider: () -> Float = remember(approach) { { approach.value * T_COVER } }
    val phaseProvider: () -> Float = remember(scrollPhase) { { scrollPhase.value } }
    val breathProvider: () -> Float = remember(breath) { { breath.value } }
    val crashProvider: () -> Float = remember(approach) {
        { eased(tProvider(), T_CRASH_START, T_COVER, AppAnimations.EmphasizedDecelerate) }
    }
    val drainProvider: () -> Float = remember(drain) { { drain.value } }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        // ---------- Atto 1 · Corrente ----------
        Box(
            Modifier
                .fillMaxSize()
                .graphicsLayer {
                    alpha = eased(tProvider(), 0f, T_BG_END, AppAnimations.EmphasizedDecelerate)
                }
                .background(WaveStreamColors.BackgroundGradient)
        )

        // ---------- Alone accent ----------
        // Gradiente radiale "finto": nessun blur (regola GPU del redesign).
        Box(
            Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.56f)
                .aspectRatio(1f)
                .graphicsLayer {
                    val t = tProvider()
                    val base = eased(t, 60f, T_BG_END + 120f, AppAnimations.EmphasizedDecelerate)
                    val out = eased(t, T_CRASH_START, T_CRASH_START + 380f, AppAnimations.Emphasized)
                    alpha = base * (1f - out)
                    val s = lerp(0.86f, 1f, base)
                    scaleX = s
                    scaleY = s
                }
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            WaveStreamColors.Accent.copy(alpha = 0.16f),
                            Color.Transparent,
                        )
                    )
                )
        )

        // ---------- Atti 2-3 · il marchio ----------
        SplashMark(
            tProvider = tProvider,
            scrollPhaseProvider = phaseProvider,
            breathProvider = breathProvider,
            modifier = Modifier.align(Alignment.Center),
        )

        // ---------- Atto 4 · l'ondata ----------
        // Sempre composta: sopra tutto copre marchio e wordmark. Finché `front` è
        // fuori schermo il blocco di disegno esce subito, quindi non costa nulla.
        Canvas3dSurge(
            crashProvider = crashProvider,
            drainProvider = drainProvider,
            phaseProvider = phaseProvider,
        )
    }
}

// ======================================================================
//  Blocco marchio: logo + banda dell'onda + wordmark
// ======================================================================

@Composable
private fun SplashMark(
    tProvider: () -> Float,
    scrollPhaseProvider: () -> Float,
    breathProvider: () -> Float,
    modifier: Modifier = Modifier,
) {
    // L'onda emerge dal marchio e viene poi inghiottita dall'ondata.
    val emitProvider: () -> Float = remember(tProvider) {
        { eased(tProvider(), T_WAVE_IN_START, T_WAVE_IN_END, AppAnimations.EmphasizedDecelerate) }
    }
    val smallWaveAlphaProvider: () -> Float = remember(tProvider) {
        {
            val t = tProvider()
            if (t < T_CRASH_START) 1f
            else 1f - eased(t, T_CRASH_START, T_CRASH_START + 130f, AppAnimations.Emphasized)
        }
    }

    Box(modifier = modifier.size(MarkWidth.dp, MarkHeight.dp)) {
        // Banda dell'onda — disegnata prima del logo, quindi gli passa dietro.
        CanvasSurface(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = WaveBandTop.dp)
                .width(MarkWidth.dp)
                .height(WaveBandHeight.dp),
            emitProvider = emitProvider,
            smallWaveAlphaProvider = smallWaveAlphaProvider,
            scrollPhaseProvider = scrollPhaseProvider,
            breathProvider = breathProvider,
        )

        // Logo — vetro, non più il box grigio della v1.
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .size(MarkLogoSize.dp)
                .graphicsLayer {
                    val p = eased(tProvider(), 60f, 480f, AppAnimations.EmphasizedDecelerate)
                    val s = lerp(0.92f, 1f, p)
                    scaleX = s
                    scaleY = s
                    alpha = p
                }
                .clip(RoundedCornerShape(26))
                .background(Color(0xFF05080E))
                .glassBorder(),
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )
        }

        // Wordmark — cascade, lettera per lettera.
        Wordmark(
            tProvider = tProvider,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = WordmarkTop.dp),
        )
    }
}

/** Bordo vetro luminoso (`GlassTokens.StrokeGradient`) senza `RenderEffect`. */
private fun Modifier.glassBorder(): Modifier = this.border(
    width = 1.dp,
    brush = Brush.linearGradient(
        listOf(Color.White.copy(alpha = 0.30f), Color.White.copy(alpha = 0.05f))
    ),
    shape = RoundedCornerShape(26),
)

@Composable
private fun Wordmark(tProvider: () -> Float, modifier: Modifier = Modifier) {
    val letters = remember { "WaveStream".map { it.toString() } }
    val slidePx = with(LocalDensity.current) { 12.dp.toPx() }

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        letters.forEachIndexed { index, letter ->
            Text(
                text = letter,
                fontFamily = SoraFontFamily,
                fontSize = 44.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = (-0.5).sp,
                color = WaveStreamColors.TextPrimary,
                modifier = Modifier.graphicsLayer {
                    val start = T_WORD_START + index * T_WORD_STAGGER
                    val p = eased(tProvider(), start, start + T_WORD_DUR, AppAnimations.EmphasizedDecelerate)
                    alpha = p
                    translationY = (1f - p) * slidePx
                },
            )
        }
    }
}

// ======================================================================
//  L'onda (atti 2-3)
// ======================================================================

@Composable
private fun CanvasSurface(
    modifier: Modifier,
    emitProvider: () -> Float,
    smallWaveAlphaProvider: () -> Float,
    scrollPhaseProvider: () -> Float,
    breathProvider: () -> Float,
) {
    Canvas(modifier = modifier) {
        val alphaFactor = smallWaveAlphaProvider()
        val emit = emitProvider()
        if (emit <= 0f || alphaFactor <= 0f) return@Canvas

        val w = size.width
        val h = size.height
        val breath = breathProvider()
        val scrollPhase = scrollPhaseProvider()

        // Reveal dal centro verso i lati: l'onda "esce" da dietro il marchio.
        val cw = w * emit
        clipRect(
            left = w / 2f - cw / 2f,
            top = 0f,
            right = w / 2f + cw / 2f,
            bottom = h,
        ) {
            // Le tre passate identiche al player: fasi 0 / 0.9 / 1.8,
            // ampiezze 1.0 / 0.7 / 0.5, spessori 5.5 / 3.5 / 2.5 dp.
            val passes = listOf(
                Triple(0.0f, 1.0f, 5.5f),
                Triple(0.9f, 0.7f, 3.5f),
                Triple(1.8f, 0.5f, 2.5f),
            )
            passes.forEachIndexed { index, (phaseOffset, ampFactor, strokeDp) ->
                val amp = h * 0.24f * ampFactor * breath * emit
                val color = when (index) {
                    0 -> WaveStreamColors.Accent.copy(alpha = 0.95f * alphaFactor)
                    1 -> WaveStreamColors.Accent.copy(alpha = 0.45f * alphaFactor)
                    else -> Color.White.copy(alpha = 0.20f * alphaFactor)
                }
                drawPath(
                    path = WaveForm.wavePath(
                        width = w,
                        centerY = h / 2f,
                        amplitude = amp,
                        phase = scrollPhase,
                        phaseOffset = phaseOffset,
                    ),
                    color = color,
                    style = Stroke(width = strokeDp.dp.toPx(), cap = StrokeCap.Round),
                )
            }
        }
    }
}

// ======================================================================
//  L'ondata che si schianta (atto 4) — 2.5D
// ======================================================================

/**
 * Disegna l'ondata. La profondità NON viene da OpenGL (fuori portata con minSdk 26
 * su GPU TV) ma da geometria e gradienti:
 *
 *  1. strato di fondo in parallasse (più lontano, più scuro)
 *  2. faccia dell'onda (cresta → fondo) con gradiente verticale
 *  3. barile — sacca scura sotto la cresta: è ciò che dà VOLUME al rotolo
 *  4. labbro arricciato verso chi guarda
 *  5. riflesso speculare sulla faccia
 *  6. rim luminoso sul bordo (sostituisce il blur, che è vietato)
 *  7. spruzzi
 *
 * `near` (0 lontano → 1 vicino) pilota la prospettiva: ampiezza, labbro e spruzzi
 * crescono man mano che l'ondata arriva addosso.
 */
@Composable
private fun Canvas3dSurge(
    crashProvider: () -> Float,
    drainProvider: () -> Float,
    phaseProvider: () -> Float,
) {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val h = size.height
        val w = size.width

        // La linea da cui nasce l'ondata è la stessa su cui poggiava l'onda piccola:
        // il centro dello schermo + 1dp (vedi la geometria di [SplashMark]).
        val waveLineY = h / 2f + 1.dp.toPx()

        val drainP = drainProvider()
        val near = crashProvider()
        val draining = drainP > 0f

        val front = if (!draining) {
            lerp(waveLineY, -h * 0.35f, near)
        } else {
            lerp(-h * 0.35f, h * 1.2f, AppAnimations.Emphasized.transform(drainP))
        }

        if (front > h + 140f) return@Canvas

        drawSurge(
            w = w,
            h = h,
            front = front,
            near = near,
            slope = if (draining) CrashSlope else 0f,
            phase = phaseProvider(),
            accent = WaveStreamColors.Accent,
        )
    }
}

private fun DrawScope.drawSurge(
    w: Float,
    h: Float,
    front: Float,
    near: Float,
    slope: Float,
    phase: Float,
    accent: Color,
) {
    val amp = 10f + CrashAmpMax * near          // prospettiva
    val lipH = CrashLipMax * near
    val seg = CrashSegments

    fun env(u: Float): Float {
        val s = sin(u * PI).toFloat()
        return 0.35f + 0.65f * s
    }

    fun crestY(u: Float): Float =
        front + slope * (u - 0.5f) * w +
            sin(u * 2f * PI.toFloat() * 1.35f + phase) * amp * env(u)

    fun lipY(u: Float): Float = crestY(u) - lipH * env(u).pow(0.85f)

    // Path riusati da più passate
    val crestPath = Path().apply {
        moveTo(0f, crestY(0f))
        for (i in 1..seg) {
            val u = i.toFloat() / seg
            lineTo(u * w, crestY(u))
        }
    }
    val lipPath = Path().apply {
        moveTo(0f, lipY(0f))
        for (i in 1..seg) {
            val u = i.toFloat() / seg
            lineTo(u * w, lipY(u))
        }
    }
    fun bodyPath(bottomY: Float) = Path().apply {
        addPath(crestPath)
        lineTo(w, bottomY)
        lineTo(0f, bottomY)
        close()
    }

    // ---- 1 · strato di fondo, in parallasse ----
    if (near > 0.10f) {
        val bAmp = amp * 0.55f
        val bFront = front - 30f * near
        val backPath = Path().apply {
            moveTo(0f, bFront + slope * -0.5f * w)
            for (i in 1..seg) {
                val u = i.toFloat() / seg
                val y = bFront + slope * (u - 0.5f) * w +
                    sin(u * 2f * PI.toFloat() * 1.35f + phase * 0.6f) * bAmp * env(u)
                lineTo(u * w, y)
            }
            lineTo(w, front + 180f * near)
            lineTo(0f, front + 180f * near)
            close()
        }
        drawPath(backPath, Color(0xFF091826).copy(alpha = 0.9f))
    }

    // ---- 2 · faccia dell'onda ----
    drawPath(
        path = bodyPath(h),
        brush = Brush.verticalGradient(
            colorStops = arrayOf(
                0f to accent.copy(alpha = 0.46f),
                0.16f to accent.copy(alpha = 0.16f),
                0.38f to Color(0xFF081420),
                1f to Color(0xFF02050A),
            ),
            startY = front - amp - lipH,
            endY = max(front + 560f, h),
        ),
    )

    // ---- 3 · barile: volume del rotolo ----
    if (near > 0.12f) {
        val bottom = front + 40f + 170f * near + amp * 2f
        clipPath(bodyPath(bottom)) {
            drawRect(
                brush = Brush.verticalGradient(
                    colorStops = arrayOf(
                        0f to Color.Black.copy(alpha = 0.62f * near),
                        0.55f to Color.Black.copy(alpha = 0.22f * near),
                        1f to Color.Transparent,
                    ),
                    startY = front - amp,
                    endY = bottom,
                ),
                topLeft = Offset(0f, front - amp * 2f),
                size = Size(w, bottom - front + amp * 4f),
            )
        }
    }

    // ---- 4 · labbro arricciato ----
    if (near > 0.10f) {
        val lipFill = Path().apply {
            addPath(lipPath)
            // ritorno lungo la cresta
            for (i in seg downTo 0) {
                val u = i.toFloat() / seg
                lineTo(u * w, crestY(u))
            }
            close()
        }
        drawPath(
            path = lipFill,
            brush = Brush.verticalGradient(
                colorStops = arrayOf(
                    0f to Color.White.copy(alpha = 0.34f * near),
                    0.42f to accent.copy(alpha = 0.60f * near),
                    1f to accent.copy(alpha = 0.08f * near),
                ),
                startY = front - amp - lipH,
                endY = front + amp * 0.5f,
            ),
        )
    }

    // ---- 5 · riflesso speculare ----
    if (near > 0.20f) {
        val hSpec = 110f * near
        clipPath(bodyPath(front + hSpec)) {
            drawRect(
                brush = Brush.verticalGradient(
                    colorStops = arrayOf(
                        0f to accent.copy(alpha = 0.50f * near),
                        1f to Color.Transparent,
                    ),
                    startY = front,
                    endY = front + hSpec,
                ),
                topLeft = Offset(0f, front - 60f),
                size = Size(w, hSpec + 60f),
            )
        }
    }

    // ---- 6 · rim luminoso sul labbro ----
    drawPath(
        path = lipPath,
        color = Color(0xFFE8F6FF).copy(alpha = 0.80f),
        style = Stroke(width = 1.6f + 3.4f * near),
    )

    // ---- 7 · spruzzi ----
    if (near > 0.30f) {
        val n = (30f * near).toInt()
        for (i in 0 until n) {
            val u = ((i * 0.6180339887f) + phase * 0.05f) % 1f
            val k = (i * 0.3819660113f) % 1f
            drawCircle(
                color = Color(0xFFECF9FF).copy(alpha = (0.30f + 0.55f * k) * near),
                radius = 0.7f + 2.6f * k * near,
                center = Offset(u * w, lipY(u) - (4f + 30f * k) * near),
            )
        }
    }
}
