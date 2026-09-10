package it.wavestream.app.player

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.PixelCopy
import android.view.SurfaceView
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.math.abs

/**
 * Rilevatore di titoli di coda basato su elaborazione immagini classica.
 *
 * NESSUNA intelligenza artificiale: solo statistiche su un frame ridotto a bassa risoluzione.
 *
 * Firme tipiche dei titoli di coda (VOD / stream IPTV):
 *  1. luminanza media bassa (sfondo nero o molto scuro)
 *  2. molte transizioni chiare/scure nella fascia centrale (testo bianco su fondo scuro)
 *  3. contenuto temporalmente stabile (scena ferma o con lento scroll verticale)
 *
 * Il rilevamento scatta solo dopo [minConsecutiveHits] campioni consecutivi positivi
 * (per default 3 campioni x 2s = ~6s di persistenza), così da non reagire a
 * fade-to-black, scene notturne o cartelli pubblicitari isolati.
 *
 * L'analisi avviene su una griglia 96x54 (5184 pixel): costo CPU trascurabile,
 * compatibile con i box Android TV più lenti.
 */
class CreditsDetector(
    private val threshold: Float = SCORE_THRESHOLD,
    private val minConsecutiveHits: Int = MIN_CONSECUTIVE_HITS
) {

    data class Result(
        val score: Float,
        val darkness: Float,
        val textRatio: Float,
        val staticScore: Float,
        val hit: Boolean,
        val triggered: Boolean
    )

    private val gridBitmap: Bitmap = Bitmap.createBitmap(GRID_W, GRID_H, Bitmap.Config.ARGB_8888)
    private val canvas = Canvas(gridBitmap)
    private val paint = Paint().apply {
        isFilterBitmap = false
        isAntiAlias = false
    }
    private val dstRect = Rect(0, 0, GRID_W, GRID_H)
    private val argb = IntArray(GRID_W * GRID_H)
    private val luma = FloatArray(GRID_W * GRID_H)

    private var previousLuma: FloatArray? = null
    private var consecutiveHits = 0
    private var sampleCount = 0

    /** Diventa true quando i titoli di coda sono stati confermati. */
    var isTriggered: Boolean = false
        private set

    /** Da chiamare ad ogni nuovo episodio / seek verso l'inizio. */
    fun reset() {
        previousLuma = null
        consecutiveHits = 0
        sampleCount = 0
        isTriggered = false
    }

    /**
     * Analizza un frame di playback (bitmap a piena risoluzione, verrà ridotta internamente).
     * Non lancia eccezioni: in caso di problema restituisce un risultato neutro.
     */
    fun analyze(source: Bitmap): Result {
        if (source.width <= 0 || source.height <= 0) return neutral()

        // Downscale su griglia fissa: drawBitmap con filtro disattivato è nativo e veloce
        canvas.drawBitmap(source, null, dstRect, paint)
        gridBitmap.getPixels(argb, 0, GRID_W, 0, 0, GRID_W, GRID_H)

        // Luminanza (Rec.601)
        var lumaSum = 0f
        for (i in argb.indices) {
            val c = argb[i]
            val l = 0.299f * ((c shr 16) and 0xFF) +
                    0.587f * ((c shr 8) and 0xFF) +
                    0.114f * (c and 0xFF)
            luma[i] = l
            lumaSum += l
        }
        val meanLuma = lumaSum / (GRID_W * GRID_H)
        val darkness = (1f - meanLuma / 255f).coerceIn(0f, 1f)

        // Densità di bordi nella fascia centrale: il testo produce molte transizioni
        val textRatio = computeTextRatio(luma)

        // Stabilità temporale, con tolleranza per lo scroll verticale dei credits
        val previous = previousLuma
        val staticScore = if (previous == null) {
            NEUTRAL_STATIC
        } else {
            val bestDiff = bestShiftedDiff(luma, previous)
            (1f - bestDiff / STATIC_DIFF_SCALE).coerceIn(0f, 1f)
        }
        previousLuma = luma.copyOf()

        val textNorm = (textRatio / TEXT_RATIO_REFERENCE).coerceIn(0f, 1f)
        val score = (W_DARKNESS * darkness + W_TEXT * textNorm + W_STATIC * staticScore)
            .coerceIn(0f, 1f)

        val hit = score >= threshold &&
                textRatio >= MIN_TEXT_RATIO &&
                darkness >= MIN_DARKNESS

        if (hit) {
            consecutiveHits++
        } else {
            consecutiveHits = 0
        }

        sampleCount++
        var triggered = false
        if (!isTriggered && consecutiveHits >= minConsecutiveHits) {
            isTriggered = true
            triggered = true
            Log.d(
                TAG,
                "Titoli di coda rilevati (score=%.3f dark=%.2f text=%.3f static=%.2f campioni=%d)"
                    .format(score, darkness, textRatio, staticScore, sampleCount)
            )
        } else if (sampleCount % 5 == 0) {
            Log.d(
                TAG,
                "campione #$sampleCount score=%.3f dark=%.2f text=%.3f static=%.2f hits=$consecutiveHits"
                    .format(score, darkness, textRatio, staticScore)
            )
        }

        return Result(
            score = score,
            darkness = darkness,
            textRatio = textRatio,
            staticScore = staticScore,
            hit = hit,
            triggered = triggered
        )
    }

    private fun computeTextRatio(frame: FloatArray): Float {
        val yStart = (GRID_H * TEXT_BAND_TOP).toInt().coerceAtLeast(1)
        val yEnd = (GRID_H * TEXT_BAND_BOTTOM).toInt().coerceAtMost(GRID_H - 1)
        if (yEnd <= yStart) return 0f

        var accumulator = 0f
        var rows = 0
        for (y in yStart until yEnd) {
            val base = y * GRID_W
            var edges = 0
            for (x in 1 until GRID_W) {
                if (abs(frame[base + x] - frame[base + x - 1]) > EDGE_THRESHOLD) edges++
            }
            accumulator += edges.toFloat() / (GRID_W - 1)
            rows++
        }
        return if (rows > 0) accumulator / rows else 0f
    }

    /**
     * Differenza media minima tra frame corrente e precedente su diversi offset verticali.
     * Compensare lo scroll permette di riconoscere i titoli di coda che scorrono.
     */
    private fun bestShiftedDiff(current: FloatArray, previous: FloatArray): Float {
        var best = Float.MAX_VALUE
        var dy = -MAX_SHIFT
        while (dy <= MAX_SHIFT) {
            var sum = 0f
            var count = 0
            var y = maxOf(0, -dy)
            val yEnd = minOf(GRID_H, GRID_H - dy)
            while (y < yEnd) {
                val curBase = y * GRID_W
                val prevBase = (y + dy) * GRID_W
                for (x in 0 until GRID_W) {
                    sum += abs(current[curBase + x] - previous[prevBase + x])
                }
                count += GRID_W
                y++
            }
            if (count > 0) {
                val avg = sum / count
                if (avg < best) best = avg
            }
            dy += 2
        }
        return if (best == Float.MAX_VALUE) STATIC_DIFF_SCALE else best
    }

    private fun neutral() = Result(
        score = 0f,
        darkness = 0f,
        textRatio = 0f,
        staticScore = NEUTRAL_STATIC,
        hit = false,
        triggered = false
    )

    companion object {
        private const val TAG = "CreditsDetector"

        /** Risoluzione di analisi: più bassa = più economica, firma del testo ancora leggibile. */
        const val GRID_W = 96
        const val GRID_H = 54

        /** Intervallo tra due campioni di frame. */
        const val SAMPLE_INTERVAL_MS = 2_000L

        /** Finestra di analisi: si campiona solo negli ultimi minuti dell'episodio. */
        const val WINDOW_MS = 8 * 60 * 1000L

        /** Non si analizza prima di questo punto (esclude intro/recap). */
        const val MIN_POSITION_MS = 120_000L

        private const val SCORE_THRESHOLD = 0.67f
        private const val MIN_CONSECUTIVE_HITS = 3
        private const val MIN_TEXT_RATIO = 0.06f
        private const val MIN_DARKNESS = 0.35f

        private const val EDGE_THRESHOLD = 55f
        private const val TEXT_RATIO_REFERENCE = 0.20f
        private const val TEXT_BAND_TOP = 0.12f
        private const val TEXT_BAND_BOTTOM = 0.88f
        private const val MAX_SHIFT = 10
        private const val STATIC_DIFF_SCALE = 60f
        private const val NEUTRAL_STATIC = 0.5f

        private const val W_DARKNESS = 0.45f
        private const val W_TEXT = 0.35f
        private const val W_STATIC = 0.20f
    }
}

/**
 * Cattura un frame dalla SurfaceView del player tramite PixelCopy.
 * Restituisce true solo se la copia è andata a buon fine (fallisce su surface protette
 * o quando il frame non è ancora disponibile: in quel caso si ritenta al campione dopo).
 */
internal object ScreenFrameCapture {

    suspend fun capture(surfaceView: SurfaceView, dest: Bitmap): Boolean {
        if (!surfaceView.isAttachedToWindow) return false
        return try {
            suspendCancellableCoroutine { continuation ->
                try {
                    PixelCopy.request(
                        surfaceView,
                        dest,
                        { result ->
                            if (continuation.isActive) {
                                continuation.resume(result == PixelCopy.SUCCESS)
                            }
                        },
                        Handler(Looper.getMainLooper())
                    )
                } catch (e: Exception) {
                    Log.w("CreditsDetector", "PixelCopy non disponibile: ${e.message}")
                    if (continuation.isActive) continuation.resume(false)
                }
            }
        } catch (e: Exception) {
            Log.w("CreditsDetector", "Capture fallita: ${e.message}")
            false
        }
    }
}
