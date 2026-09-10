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
 * NESSUNA intelligenza artificiale: statistiche su un frame ridotto a bassa risoluzione.
 *
 * Come funziona (pipeline per campione):
 *  1. il frame viene portato (se serve) a max 1280px di larghezza con filtro bilineare
 *  2. viene costruita una griglia 96x54 con un VERO box filter (media dei pixel di ogni cella,
 *     con passo di campionamento STRIDE): questo elimina la grana pellicola e rende il testo
 *     una macchia grigia coerente invece di rumore casuale
 *  3. si misurano:
 *     - darkness      = 1 - luminanza media (credits = sfondo nero/scuro)
 *     - textDensity   = frazione di celle con luminanza "da testo" (grigio su nero)
 *     - peakRowDensity= densità della riga più "piena" di celle testuali (testo allineato)
 *     - staticScore   = stabilità rispetto al campione precedente, con compensazione scroll
 *  4. il campione è positivo se lo sfondo è scuro, c'è una quantità di testo plausibile
 *     (né troppo poco né troppo) e almeno una riga è chiaramente allineata
 *  5. servono [MIN_CONSECUTIVE_HITS] campioni consecutivi positivi (persistenza ~6s)
 *
 * Le soglie sono pensate per i titoli di coda: schermo nero + testo bianco, statico o
 * con lento scroll verticale. Sono volutamente in un OR di condizioni semplici, così da
 * essere leggibili e tarabili con l'overlay di debug.
 */
class CreditsDetector {

    data class Result(
        val score: Float,
        val darkness: Float,
        val textDensity: Float,
        val peakRowDensity: Float,
        val staticScore: Float,
        val hit: Boolean,
        val triggered: Boolean
    )

    private val gridLuma = FloatArray(GRID_W * GRID_H)
    private val acc = FloatArray(GRID_W * GRID_H)
    private val cellCount = IntArray(GRID_W * GRID_H)

    private var pixels: IntArray? = null
    private var gxTable: IntArray? = null
    private var gyTable: IntArray? = null

    private var workBitmap: Bitmap? = null
    private var workCanvas: Canvas? = null
    private val workPaint = Paint().apply {
        isFilterBitmap = true
        isAntiAlias = false
        isDither = false
    }

    private var previousGrid: FloatArray? = null
    private var consecutiveHits = 0
    private var sampleCount = 0

    /** Diventa true quando i titoli di coda sono stati confermati. */
    var isTriggered: Boolean = false
        private set

    /** Da chiamare ad ogni nuovo episodio / seek verso l'inizio. */
    fun reset() {
        previousGrid = null
        consecutiveHits = 0
        sampleCount = 0
        isTriggered = false
    }

    /**
     * Analizza un frame di playback (bitmap a piena risoluzione).
     * Non lancia eccezioni: in caso di problema restituisce un risultato neutro.
     */
    fun analyze(source: Bitmap): Result {
        if (source.width <= 0 || source.height <= 0) return neutral()

        val work = prepareWork(source) ?: return neutral()
        val w = work.width
        val h = work.height

        var pix = pixels
        if (pix == null || pix.size != w * h) {
            pix = IntArray(w * h)
            pixels = pix
        }
        work.getPixels(pix, 0, w, 0, 0, w, h)

        buildGrid(pix, w, h)

        // ---- metriche di luminanza / testo ----
        var lumaSum = 0f
        var textCells = 0
        for (i in gridLuma.indices) {
            val l = gridLuma[i]
            lumaSum += l
            if (l >= TEXT_LOW && l <= TEXT_HIGH) textCells++
        }
        val cellTotal = gridLuma.size
        val meanLuma = lumaSum / cellTotal
        val darkness = (1f - meanLuma / 255f).coerceIn(0f, 1f)
        val textDensity = textCells.toFloat() / cellTotal

        // Riga più densa di celle "testuali": nei credits il testo è allineato orizzontalmente
        var peakRowDensity = 0f
        val yStart = (GRID_H * 0.08f).toInt()
        val yEnd = (GRID_H * 0.92f).toInt()
        for (y in yStart until yEnd) {
            val base = y * GRID_W
            var c = 0
            for (x in 0 until GRID_W) {
                val l = gridLuma[base + x]
                if (l >= TEXT_LOW && l <= TEXT_HIGH) c++
            }
            val density = c.toFloat() / GRID_W
            if (density > peakRowDensity) peakRowDensity = density
        }

        // ---- stabilità temporale (con compensazione dello scroll verticale) ----
        val previous = previousGrid
        val staticScore = if (previous == null) {
            NEUTRAL_STATIC
        } else {
            val bestDiff = bestShiftedDiff(gridLuma, previous)
            (1f - bestDiff / STATIC_DIFF_SCALE).coerceIn(0f, 1f)
        }
        previousGrid = gridLuma.copyOf()

        // ---- classificazione: condizioni semplici e leggibili ----
        val hit = darkness >= MIN_DARKNESS &&
                textDensity in MIN_TEXT_DENSITY..MAX_TEXT_DENSITY &&
                peakRowDensity >= MIN_PEAK_ROW_DENSITY

        // Punteggio solo informativo (log / debug overlay)
        val score = (
                0.45f * darkness +
                        0.35f * (textDensity / TEXT_DENSITY_REFERENCE).coerceAtMost(1f) +
                        0.20f * staticScore
                ).coerceIn(0f, 1f)

        if (hit) consecutiveHits++ else consecutiveHits = 0

        sampleCount++
        var triggered = false
        if (!isTriggered && consecutiveHits >= MIN_CONSECUTIVE_HITS) {
            isTriggered = true
            triggered = true
            Log.d(TAG, "Titoli di coda rilevati dopo $sampleCount campioni")
        }

        return Result(
            score = score,
            darkness = darkness,
            textDensity = textDensity,
            peakRowDensity = peakRowDensity,
            staticScore = staticScore,
            hit = hit,
            triggered = triggered
        )
    }

    /** Righe di log+debug da mostrare a video quando il debug è attivo. */
    fun describe(result: Result): String {
        return "d=%.2f t=%.3f p=%.2f s=%.2f | score=%.2f hits=%d/%d%s".format(
            result.darkness,
            result.textDensity,
            result.peakRowDensity,
            result.staticScore,
            result.score,
            consecutiveHits,
            MIN_CONSECUTIVE_HITS,
            if (consecutiveHits > 0 || result.hit) "  HIT" else ""
        )
    }

    /**
     * Porta il frame a una dimensione di lavoro ragionevole (max 1280px di larghezza)
     * usando un filtro bilineare: su 4K evita di processare milioni di pixel.
     */
    private fun prepareWork(source: Bitmap): Bitmap? {
        if (source.width <= MAX_ANALYSIS_WIDTH) return source

        val targetW = MAX_ANALYSIS_WIDTH
        val targetH = (source.height.toLong() * targetW / source.width).toInt().coerceAtLeast(1)

        var bitmap = workBitmap
        var canvas = workCanvas
        if (bitmap == null || bitmap.width != targetW || bitmap.height != targetH || canvas == null) {
            bitmap = Bitmap.createBitmap(targetW, targetH, Bitmap.Config.ARGB_8888)
            canvas = Canvas(bitmap)
            workBitmap = bitmap
            workCanvas = canvas
        }
        canvas.drawBitmap(source, null, Rect(0, 0, targetW, targetH), workPaint)
        return bitmap
    }

    /**
     * Box filter: ogni cella della griglia è la MEDIA dei pixel reali che ricadono in essa
     * (campionati con passo STRIDE). Media vera = la grana video sparisce e il testo
     * diventa una macchia grigia stabile, riconoscibile anche con scorrimento.
     */
    private fun buildGrid(pix: IntArray, w: Int, h: Int) {
        ensureTables(w, h)
        val gx = gxTable ?: return
        val gy = gyTable ?: return

        java.util.Arrays.fill(acc, 0f)
        java.util.Arrays.fill(cellCount, 0)

        var y = 0
        while (y < h) {
            val rowBase = y * w
            val gRowBase = gy[y] * GRID_W
            var x = 0
            while (x < w) {
                val c = pix[rowBase + x]
                val l = 0.299f * ((c shr 16) and 0xFF) +
                        0.587f * ((c shr 8) and 0xFF) +
                        0.114f * (c and 0xFF)
                val idx = gRowBase + gx[x]
                acc[idx] += l
                cellCount[idx]++
                x += STRIDE
            }
            y += STRIDE
        }

        for (i in gridLuma.indices) {
            val n = cellCount[i]
            gridLuma[i] = if (n > 0) acc[i] / n else 0f
        }
    }

    private fun ensureTables(w: Int, h: Int) {
        if (gxTable?.size != w) {
            gxTable = IntArray(w) { (it.toLong() * GRID_W / w).toInt().coerceIn(0, GRID_W - 1) }
        }
        if (gyTable?.size != h) {
            gyTable = IntArray(h) { (it.toLong() * GRID_H / h).toInt().coerceIn(0, GRID_H - 1) }
        }
    }

    /**
     * Differenza media minima tra frame corrente e precedente su diversi offset verticali.
     * Compensare lo scroll permette di riconoscere anche titoli di coda che scorrono.
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
            dy++
        }
        return if (best == Float.MAX_VALUE) STATIC_DIFF_SCALE else best
    }

    private fun neutral() = Result(
        score = 0f,
        darkness = 0f,
        textDensity = 0f,
        peakRowDensity = 0f,
        staticScore = NEUTRAL_STATIC,
        hit = false,
        triggered = false
    )

    companion object {
        private const val TAG = "CreditsDetector"

        /** Risoluzione di analisi: alta abbastanza da distinguere le righe di testo. */
        const val GRID_W = 96
        const val GRID_H = 54

        /** Intervallo tra due campioni di frame. */
        const val SAMPLE_INTERVAL_MS = 2_000L

        /** Finestra di analisi: si campiona solo negli ultimi minuti dell'episodio. */
        const val WINDOW_MS = 8 * 60 * 1000L

        /** Non si analizza prima di questo punto (esclude intro/recap). */
        const val MIN_POSITION_MS = 90_000L

        private const val MAX_ANALYSIS_WIDTH = 1280
        private const val STRIDE = 2

        // Banda di luminanza che identifica una cella "di testo" (grigio su nero)
        private const val TEXT_LOW = 22f
        private const val TEXT_HIGH = 185f

        // Soglie di classificazione
        private const val MIN_DARKNESS = 0.62f
        private const val MIN_TEXT_DENSITY = 0.010f
        private const val MAX_TEXT_DENSITY = 0.32f
        private const val MIN_PEAK_ROW_DENSITY = 0.20f

        private const val MIN_CONSECUTIVE_HITS = 3
        private const val TEXT_DENSITY_REFERENCE = 0.08f
        private const val MAX_SHIFT = 8
        private const val STATIC_DIFF_SCALE = 60f
        private const val NEUTRAL_STATIC = 0.5f
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
