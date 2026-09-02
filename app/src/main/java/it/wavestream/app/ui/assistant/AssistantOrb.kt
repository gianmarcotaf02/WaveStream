package it.wavestream.app.ui.assistant

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.WaveStreamColors
import kotlin.math.cos
import kotlin.math.sin

/**
 * L'"orb" dell'assistente: reattore HUD futuristico nei colori dell'accent
 * dinamico dell'app (segue il tema scelto dall'utente).
 *
 * Struttura (dal fuori verso l'interno):
 * - alone luminoso soffuso
 * - anello di tacche tipo quadrante (48 tick, i cardinali più lunghi)
 * - 3 anelli ad archi rotanti (velocità e inclinazioni diverse)
 * - anello di pulse espansivo durante l'ascolto
 * - nucleo sferico con bordo nitido e riflesso speculare
 *
 * Stati:
 * - IDLE:      rotazioni lente, respiro soffuso
 * - LISTENING: pulsa con l'ampiezza del microfono, anello di pulse
 * - THINKING:  archi accelerano
 * - SPEAKING:  respiro a ritmo sostenuto
 * - ERROR:     tutta la palette diventa rossa
 */
@Composable
fun AssistantOrb(
    phase: AssistantViewModel.Phase,
    amplitude: Float,
    modifier: Modifier = Modifier,
    waveform: List<Float> = emptyList()
) {
    // Palette dell'accent dinamico
    val accent = if (phase == AssistantViewModel.Phase.ERROR) Color(0xFFFF5252) else WaveStreamColors.Accent
    val accentLight = if (phase == AssistantViewModel.Phase.ERROR) Color(0xFFFF8A80) else WaveStreamColors.AccentLight
    val accentDark = if (phase == AssistantViewModel.Phase.ERROR) Color(0xFF7A1F1F) else WaveStreamColors.AccentDark

    val transition = rememberInfiniteTransition(label = "orb")

    // Fattore di velocità per stato (THINKING accelera tutto)
    val speedFactor = when (phase) {
        AssistantViewModel.Phase.THINKING -> 0.22f
        AssistantViewModel.Phase.LISTENING -> 0.55f
        AssistantViewModel.Phase.SPEAKING -> 0.65f
        else -> 1f
    }

    // Rotazioni degli anelli ad archi (alternano verso)
    val ringAClockwise by transition.animateFloat(
        initialValue = 0f, targetValue = 360f,
        animationSpec = infiniteRepeatable(tween((20_000 * speedFactor).toInt(), easing = LinearEasing)),
        label = "ringA"
    )
    val ringBCounter by transition.animateFloat(
        initialValue = 360f, targetValue = 0f,
        animationSpec = infiniteRepeatable(tween((14_000 * speedFactor).toInt(), easing = LinearEasing)),
        label = "ringB"
    )
    val ringCClockwise by transition.animateFloat(
        initialValue = 0f, targetValue = 360f,
        animationSpec = infiniteRepeatable(tween((28_000 * speedFactor).toInt(), easing = LinearEasing)),
        label = "ringC"
    )
    // Quadrante tacche: rotazione lentissima, quasi impercettibile
    val dialRotation by transition.animateFloat(
        initialValue = 0f, targetValue = 360f,
        animationSpec = infiniteRepeatable(tween((90_000 * speedFactor).toInt(), easing = LinearEasing)),
        label = "dial"
    )
    // Respiro del nucleo
    val breathing by transition.animateFloat(
        initialValue = 0f, targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(2200, easing = LinearEasing), RepeatMode.Reverse),
        label = "breathing"
    )

    // Rotazione dell'anello di pulse durante l'ascolto (solo in ascolto, reattività istantanea)
    val micPulse by animateFloatAsState(
        targetValue = if (phase == AssistantViewModel.Phase.LISTENING) amplitude else 0f,
        animationSpec = tween(70),
        label = "micPulse"
    )

    // Rotazione del visualizer musicale
    val waveSpin by transition.animateFloat(
        initialValue = 0f, targetValue = 360f,
        animationSpec = infiniteRepeatable(tween((16_000 * speedFactor).toInt(), easing = LinearEasing)),
        label = "waveSpin"
    )

    Canvas(modifier = modifier) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val minDim = size.minDimension

        // Ampiezza di pulsazione del nucleo
        val pulse = when (phase) {
            AssistantViewModel.Phase.LISTENING -> micPulse * 0.5f
            AssistantViewModel.Phase.SPEAKING -> breathing * 0.14f
            else -> breathing * 0.06f
        }

        // Energia complessiva: quanta "vita" ha l'orb in questo istante.
        // Sale quando parli tu (mic), resta alta quando parla l'AI (waveform simulata),
        // tenue e respirata quando idle.
        val energy = when (phase) {
            AssistantViewModel.Phase.LISTENING -> micPulse
            AssistantViewModel.Phase.SPEAKING -> (waveform.lastOrNull() ?: breathing) * 0.9f
            AssistantViewModel.Phase.THINKING -> breathing * 0.45f
            else -> breathing * 0.25f
        }

        // ---------- 1. Alone esterno soffuso (si accende con l'energia) ----------
        val glowRadius = minDim * 0.5f * (1f + pulse * 0.5f + energy * 0.14f)
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    accentDark.copy(alpha = (0.22f + energy * 0.5f + pulse * 0.2f).coerceAtMost(0.85f)),
                    accentDark.copy(alpha = 0.10f + energy * 0.15f),
                    Color.Transparent
                ),
                center = center,
                radius = glowRadius
            ),
            radius = glowRadius,
            center = center
        )

        // ---------- 2. Anello di pulse durante l'ascolto ----------
        if (phase == AssistantViewModel.Phase.LISTENING && micPulse > 0.02f) {
            val pulseRadius = minDim * 0.24f + micPulse * minDim * 0.22f
            drawCircle(
                color = accentLight.copy(alpha = (1f - micPulse) * 0.5f),
                radius = pulseRadius,
                center = center,
                style = Stroke(width = 2.5.dp.toPx())
            )
        }

        // ---------- 2b. Visualizer musicale circolare ----------
        // Barre radiali che "ballano": con la voce reale in ascolto,
        // onde sintetiche stratificate (effetto musica) quando è idle/speaking.
        val isListening = phase == AssistantViewModel.Phase.LISTENING
        val isSpeaking = phase == AssistantViewModel.Phase.SPEAKING
        val sampleCount = 90
        val barBaseRadius = minDim * 0.225f
        // l'ampiezza massima delle barre cresce con l'energia (focus quando c'è voce)
        val barMax = minDim * 0.075f * (0.72f + energy * 0.55f)
        val twoPi = (2f * Math.PI.toFloat())
        val spinRad = waveSpin * (Math.PI.toFloat() / 180f)

        // Valori effettivi per ogni barra (mic/voce AI reali, o sintetici quando idle)
        val useWaveform = (isListening || isSpeaking) && waveform.isNotEmpty()
        val barValues = FloatArray(sampleCount) { i ->
            if (useWaveform) {
                // mappa i campioni mic su tutte le barre, con smoothing dai vicini
                val micIdx = (i.toFloat() / sampleCount * waveform.size).toInt()
                val v = waveform.getOrNull(micIdx) ?: 0f
                val prev = waveform.getOrNull((micIdx - 1 + waveform.size) % waveform.size) ?: v
                val next = waveform.getOrNull((micIdx + 1) % waveform.size) ?: v
                (v * 2f + prev + next) / 4f
            } else {
                // effetto musica: onde multiple stratificate che ondeggiano nel tempo
                val u = i.toFloat() / sampleCount
                val w1 = sin(u * twoPi * 3f + spinRad * 1.6f)
                val w2 = sin(u * twoPi * 7f - spinRad * 1.1f)
                val w3 = sin(u * twoPi * 13f + spinRad * 2.3f)
                ((0.30f + 0.22f * w1 + 0.12f * w2 + 0.05f * w3) * (0.65f + 0.5f * breathing))
                    .coerceIn(0.05f, 1f)
            }
        }

        // barre radiali + percorso dell'onda liscia attraverso le punte
        val wavePath = Path()
        val tipPoints = Array(sampleCount) { Offset.Zero }
        for (i in 0 until sampleCount) {
            val v = barValues[i]
            val angle = ((i.toFloat() / sampleCount) * 360f + waveSpin * 0.25f) *
                (Math.PI.toFloat() / 180f)
            val dirX = cos(angle)
            val dirY = sin(angle)
            val innerR = barBaseRadius
            val outerR = barBaseRadius + v * barMax + minDim * 0.006f

            drawLine(
                color = accentLight.copy(alpha = 0.20f + 0.65f * v),
                start = Offset(center.x + innerR * dirX, center.y + innerR * dirY),
                end = Offset(center.x + outerR * dirX, center.y + outerR * dirY),
                strokeWidth = 2.4.dp.toPx(),
                cap = StrokeCap.Round
            )

            // puntino luminoso in cima alle barre alte
            if (v > 0.45f) {
                drawCircle(
                    color = Color.White.copy(alpha = 0.7f * v),
                    radius = 1.8.dp.toPx(),
                    center = Offset(center.x + outerR * dirX, center.y + outerR * dirY)
                )
            }

            tipPoints[i] = Offset(
                center.x + (outerR + minDim * 0.012f) * dirX,
                center.y + (outerR + minDim * 0.012f) * dirY
            )
        }

        // onda liscia avvolgente (curva chiusa passante per le punte, smooth quadratica)
        wavePath.moveTo(
            (tipPoints[sampleCount - 1].x + tipPoints[0].x) / 2f,
            (tipPoints[sampleCount - 1].y + tipPoints[0].y) / 2f
        )
        for (i in 0 until sampleCount) {
            val cur = tipPoints[i]
            val next = tipPoints[(i + 1) % sampleCount]
            wavePath.quadraticBezierTo(cur.x, cur.y, (cur.x + next.x) / 2f, (cur.y + next.y) / 2f)
        }
        wavePath.close()

        // alone dell'onda + tratto nitido (l'onda si accende quando c'è voce)
        val waveGlow = if (isListening || isSpeaking) 0.30f + energy * 0.35f else 0.15f
        val waveLine = if (isListening || isSpeaking) 0.60f + energy * 0.35f else 0.42f
        drawPath(
            path = wavePath,
            color = accent.copy(alpha = waveGlow),
            style = Stroke(width = 7.dp.toPx())
        )
        drawPath(
            path = wavePath,
            color = accentLight.copy(alpha = waveLine),
            style = Stroke(width = 1.8.dp.toPx())
        )

        // ---------- 3. Quadrante di tacche (48 tick) ----------
        rotate(degrees = dialRotation, pivot = center) {
            val tickCount = 48
            val tickInner = minDim * 0.475f
            val tickOuterBase = minDim * 0.495f
            repeat(tickCount) { i ->
                val isCardinal = i % 12 == 0
                val tickOuter = if (isCardinal) tickOuterBase + minDim * 0.02f else tickOuterBase
                val angleRad = (i * 360f / tickCount) * (Math.PI.toFloat() / 180f)
                val dirX = cos(angleRad)
                val dirY = sin(angleRad)
                drawLine(
                    color = accentLight.copy(alpha = if (isCardinal) 0.85f else 0.30f),
                    start = Offset(center.x + tickInner * dirX, center.y + tickInner * dirY),
                    end = Offset(center.x + tickOuter * dirX, center.y + tickOuter * dirY),
                    strokeWidth = if (isCardinal) 2.5.dp.toPx() else 1.dp.toPx(),
                    cap = StrokeCap.Round
                )
            }
        }

        // ---------- 4. Cerchio strutturale esterno ----------
        drawCircle(
            color = accent.copy(alpha = 0.18f),
            radius = minDim * 0.455f,
            center = center,
            style = Stroke(width = 1.dp.toPx())
        )

        // ---------- 5. Anelli ad archi rotanti ----------
        data class ArcRing(val radius: Float, val tilt: Float, val rotation: Float, val arcs: Int, val sweep: Float, val width: Float, val alpha: Float)

        val rings = listOf(
            ArcRing(minDim * 0.300f, tilt = -20f, rotation = ringAClockwise, arcs = 3, sweep = 42f, width = 2.2f, alpha = 0.65f),
            ArcRing(minDim * 0.355f, tilt = 14f, rotation = ringBCounter, arcs = 2, sweep = 80f, width = 1.4f, alpha = 0.45f),
            ArcRing(minDim * 0.410f, tilt = -7f, rotation = ringCClockwise, arcs = 5, sweep = 18f, width = 1.2f, alpha = 0.35f)
        )

        rings.forEach { ring ->
            rotate(degrees = ring.tilt, pivot = center) {
                val gap = 360f / ring.arcs
                repeat(ring.arcs) { i ->
                    val start = ring.rotation + i * gap
                    drawArc(
                        color = accentLight.copy(alpha = ring.alpha),
                        startAngle = start - 90f,
                        sweepAngle = ring.sweep,
                        useCenter = false,
                        style = Stroke(width = ring.width.dp.toPx(), cap = StrokeCap.Round)
                    )
                }
                // punta luminosa in testa a ogni arco del primo anello
                if (ring.radius < minDim * 0.32f) {
                    repeat(ring.arcs) { i ->
                        val headAngle = (ring.rotation + i * gap + ring.sweep - 90f) * (Math.PI.toFloat() / 180f)
                        drawCircle(
                            color = Color.White.copy(alpha = 0.85f),
                            radius = 2.8.dp.toPx(),
                            center = Offset(
                                center.x + ring.radius * cos(headAngle),
                                center.y + ring.radius * sin(headAngle)
                            )
                        )
                    }
                }
            }
        }

        // ---------- 6. Particelle orbitali (anello intermedio) ----------
        rotate(degrees = ringBCounter * 1.4f, pivot = center) {
            val orbitRadius = minDim * 0.255f
            repeat(24) { i ->
                val angle = (i * 360f / 24f) * (Math.PI.toFloat() / 180f)
                val twinkle = 0.4f + 0.6f * ((sin(angle * 4f + ringBCounter * 0.08f) + 1f) / 2f)
                drawCircle(
                    color = accentLight.copy(alpha = 0.15f + 0.55f * twinkle),
                    radius = (1.2f + twinkle * 1.6f).dp.toPx(),
                    center = Offset(
                        center.x + orbitRadius * cos(angle),
                        center.y + orbitRadius * sin(angle)
                    )
                )
                }
            }

        // ---------- 7. Nucleo sferico definito ----------
        val coreRadius = minDim * 0.155f * (1f + pulse)

        // alone del nucleo
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    accent.copy(alpha = 0.55f + pulse),
                    accent.copy(alpha = 0.15f),
                    Color.Transparent
                ),
                center = center,
                radius = coreRadius * 2.2f
            ),
            radius = coreRadius * 2.2f,
            center = center
        )

        // corpo sferico: centro incandescente → accent → bordo scuro (più energetico = più bianco)
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color.White.copy(alpha = (0.85f + energy * 0.15f).coerceAtMost(1f)),
                    accentLight,
                    accent,
                    accentDark
                ),
                center = center.copy(x = center.x - coreRadius * 0.2f, y = center.y - coreRadius * 0.25f),
                radius = coreRadius * 1.7f
            ),
            radius = coreRadius,
            center = center
        )

        // bordo esterno nitido (definizione!)
        drawCircle(
            color = accentLight.copy(alpha = 0.9f),
            radius = coreRadius,
            center = center,
            style = Stroke(width = 1.8.dp.toPx())
        )
        // secondo bordo, appena più esterno, tenue
        drawCircle(
            color = accentLight.copy(alpha = 0.25f),
            radius = coreRadius * 1.12f,
            center = center,
            style = Stroke(width = 1.dp.toPx())
        )

        // riflesso speculare alto-sinistra
        translate(left = -coreRadius * 0.34f, top = -coreRadius * 0.38f) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.7f),
                        Color.White.copy(alpha = 0.15f),
                        Color.Transparent
                    ),
                    center = center,
                    radius = coreRadius * 0.55f
                ),
                radius = coreRadius * 0.5f,
                center = center
            )
        }

        // micro-anello orbitale attorno al nucleo (tipo anello di Saturno HUD)
        rotate(degrees = -24f, pivot = center) {
            drawArc(
                color = accentLight.copy(alpha = 0.7f),
                startAngle = 130f,
                sweepAngle = 280f,
                useCenter = false,
                style = Stroke(width = 1.2.dp.toPx(), cap = StrokeCap.Round)
            )
        }
    }
}
