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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

/**
 * L'"orb" dell'assistente: sfera luminosa con anelli di particelle orbitanti,
 * ispirata a HUD fantascientifici (glow blu su sfondo scuro).
 *
 * Stati:
 * - IDLE:      respiro lento e soffuso
 * - LISTENING: pulsa con l'ampiezza del microfono
 * - THINKING:  rotazione rapida, particelle accelerano
 * - SPEAKING:  pulsa a ritmo costante
 * - ERROR:     alone rosso
 */
@Composable
fun AssistantOrb(
    phase: AssistantViewModel.Phase,
    amplitude: Float,
    modifier: Modifier = Modifier
) {
    // Transizioni infinite per le rotazioni orbitali (velocità diverse per profondità)
    val transition = rememberInfiniteTransition(label = "orb")

    val speedFactor = when (phase) {
        AssistantViewModel.Phase.THINKING -> 0.25f   // rotazioni molto veloci
        AssistantViewModel.Phase.LISTENING -> 0.6f
        AssistantViewModel.Phase.SPEAKING -> 0.7f
        else -> 1f
    }

    val rotationA by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween((18_000 * speedFactor).toInt(), easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "orbitA"
    )
    val rotationB by transition.animateFloat(
        initialValue = 360f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween((26_000 * speedFactor).toInt(), easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "orbitB"
    )
    val rotationC by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween((34_000 * speedFactor).toInt(), easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "orbitC"
    )

    // Respiro quando idle / ritmo quando parla
    val breathing by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(2400, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "breathing"
    )

    // Pulse da microfono (solo in ascolto)
    val micPulse by animateFloatAsState(
        targetValue = if (phase == AssistantViewModel.Phase.LISTENING) amplitude else 0f,
        animationSpec = tween(80),
        label = "micPulse"
    )

    // Colori dinamici per stato
    val coreColor = when (phase) {
        AssistantViewModel.Phase.ERROR -> Color(0xFFFF5252)
        AssistantViewModel.Phase.LISTENING -> Color(0xFF64D2FF)
        AssistantViewModel.Phase.THINKING -> Color(0xFF7EB6FF)
        else -> Color(0xFF4DA3FF)
    }
    val glowColor = when (phase) {
        AssistantViewModel.Phase.ERROR -> Color(0xFF7A1F1F)
        else -> Color(0xFF1E5AA8)
    }

    Canvas(modifier = modifier) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val baseRadius = size.minDimension * 0.14f

        // Ampiezza di pulsazione combinata
        val pulse = when (phase) {
            AssistantViewModel.Phase.LISTENING -> micPulse * 0.45f
            AssistantViewModel.Phase.SPEAKING -> breathing * 0.12f
            else -> breathing * 0.06f
        }
        val coreRadius = baseRadius * (1f + pulse * 2f)

        // ---- Alone esterno (glow) ----
        val glowRadius = size.minDimension * 0.48f * (1f + pulse)
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    glowColor.copy(alpha = 0.35f + pulse),
                    glowColor.copy(alpha = 0.12f),
                    Color.Transparent
                ),
                center = center,
                radius = glowRadius
            ),
            radius = glowRadius,
            center = center
        )

        // ---- Anelli orbitanti con particelle ----
        val orbits = listOf(
            OrbitSpec(radius = size.minDimension * 0.30f, tilt = -18f, rotation = rotationA, particles = 22, dotSize = 3.2f),
            OrbitSpec(radius = size.minDimension * 0.38f, tilt = 14f, rotation = rotationB, particles = 28, dotSize = 2.6f),
            OrbitSpec(radius = size.minDimension * 0.46f, tilt = -8f, rotation = rotationC, particles = 34, dotSize = 2.2f)
        )

        orbits.forEach { orbit ->
            // traiettoria ellittica appena percettibile
            rotate(degrees = orbit.tilt, pivot = center) {
                drawCircle(
                    brush = Brush.sweepGradient(
                        colors = listOf(
                            Color.Transparent,
                            coreColor.copy(alpha = 0.10f),
                            Color.Transparent,
                            coreColor.copy(alpha = 0.05f),
                            Color.Transparent
                        ),
                        center = center
                    ),
                    radius = orbit.radius,
                    center = center,
                    style = Stroke(width = 1.2.dp.toPx(), cap = StrokeCap.Round)
                )
            }

            // particelle lungo l'orbita
            rotate(degrees = orbit.tilt, pivot = center) {
                repeat(orbit.particles) { i ->
                    val angle = Math.toRadians(
                        ((orbit.rotation + (i * 360f / orbit.particles)) % 360f).toDouble()
                    )
                    val angleDeg = ((orbit.rotation + (i * 360f / orbit.particles)) % 360f)
                    val angle = (angleDeg * (Math.PI.toFloat() / 180f))
                    val x = center.x + orbit.radius * cos(angle)
                    val y = center.y + orbit.radius * sin(angle) * 0.96f

                    // luminosità variabile: le particelle "scintillano"
                    val twinkle = 0.35f + 0.65f * ((sin(angle * 3f + orbit.rotation * 0.05f) + 1f) / 2f)
                    drawCircle(
                        color = coreColor.copy(alpha = 0.55f * twinkle + 0.15f),
                        radius = orbit.dotSize.dp.toPx() * (0.7f + twinkle * 0.6f),
                        center = Offset(x, y)
                    )
                }
            }
        }

        // ---- Segmenti di mirino attorno al nucleo (stile HUD) ----
        val tickRadius = coreRadius * 2.1f
        listOf(0f, 90f, 180f, 270f).forEach { deg ->
            rotate(degrees = deg + rotationA * 0.15f, pivot = center) {
                drawLine(
                    color = coreColor.copy(alpha = 0.8f),
                    start = Offset(center.x, center.y - tickRadius - 6.dp.toPx()),
                    end = Offset(center.x, center.y - tickRadius),
                    strokeWidth = 2.dp.toPx(),
                    cap = StrokeCap.Round
                )
            }
        }

        // ---- Nucleo: sfera con gradiente luminoso ----
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color.White,
                    coreColor,
                    glowColor.copy(alpha = 0.9f),
                    Color(0xFF0A1628)
                ),
                center = center.copy(y = center.y - coreRadius * 0.15f),
                radius = coreRadius * 1.6f
            ),
            radius = coreRadius,
            center = center
        )

        // riflesso alto-sinistra
        translate(left = -coreRadius * 0.3f, top = -coreRadius * 0.35f) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.5f),
                        Color.Transparent
                    ),
                    center = center,
                    radius = coreRadius * 0.6f
                ),
                radius = coreRadius * 0.55f,
                center = center
            )
        }
    }
}

private data class OrbitSpec(
    val radius: Float,
    val tilt: Float,
    val rotation: Float,
    val particles: Int,
    val dotSize: Float
)
