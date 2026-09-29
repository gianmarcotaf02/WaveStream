package it.wavestream.app.ui.components

import androidx.compose.ui.graphics.Path
import kotlin.math.PI
import kotlin.math.sin

/**
 * Primitiva geometrica dell'onda WaveStream.
 *
 * È la forma condivisa da:
 *  - il buffering del player ([it.wavestream.app.ui.player.ModernLoadingIndicator])
 *  - la splash screen ([it.wavestream.app.ui.loading.SplashScreen])
 *
 * Tenere qui la matematica garantisce che le due schermate disegnino
 * **la stessa onda**: se cambia un parametro, cambia in entrambe.
 *
 * La formula è quella storica del player: tre sinusoidi sovrapposte con fasi
 * sfasate, ciascuna pesata da un envelope che la fa nascere e morire ai bordi
 * (nessun taglio netto).
 */
object WaveForm {

    /** Numero di segmenti della polilinea. 72 è il valore del player: più che sufficiente. */
    const val Segments = 72

    /**
     * Envelope dell'onda.
     *
     * @param partial `true` per la forma "che nasce e muore ai bordi" (`sin(t·π)`),
     *                usata dalle tre onde del player e dall'onda della splash.
     *                `false` per la forma "piena" (0.35 + 0.65·sin(t·π)), usata
     *                dalla cresta dell'ondata, che deve coprire tutta la larghezza.
     */
    fun envelope(t: Float, partial: Boolean = true): Float {
        val s = sin(t * PI).toFloat()
        return if (partial) s else 0.35f + 0.65f * s
    }

    /**
     * Quota Y della cresta in corrispondenza della coordinata normalizzata `t` (0..1).
     *
     * @param amplitude ampiezza massima in pixel (già comprensiva dell'envelope del chiamante)
     * @param phase fase di scorrimento in radianti
     * @param phaseOffset sfasamento della singola sinusoide (0.0 / 0.9 / 1.8 nel player)
     * @param waveCount numero di periodi lungo la larghezza (1.5 nel player)
     */
    fun crestY(
        t: Float,
        centerY: Float,
        amplitude: Float,
        phase: Float,
        phaseOffset: Float = 0f,
        waveCount: Float = 1.5f,
        partialEnvelope: Boolean = true,
    ): Float {
        val angle = t * 2f * PI.toFloat() * waveCount + phase + phaseOffset
        return centerY + sin(angle) * amplitude * envelope(t, partialEnvelope)
    }

    /**
     * Polilinea della cresta, pronta per `drawPath(..., style = Stroke(...))`.
     */
    fun wavePath(
        width: Float,
        centerY: Float,
        amplitude: Float,
        phase: Float,
        phaseOffset: Float = 0f,
        waveCount: Float = 1.5f,
        partialEnvelope: Boolean = true,
    ): Path {
        val path = Path()
        for (i in 0..Segments) {
            val t = i.toFloat() / Segments
            val x = t * width
            val y = crestY(t, centerY, amplitude, phase, phaseOffset, waveCount, partialEnvelope)
            if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
        }
        return path
    }
}
