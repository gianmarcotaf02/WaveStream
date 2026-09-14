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
        val meanLuma: Float,
        val darkness: Float,
        val textDensity: Float,
        val textRowCount: Int,
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
    private val hitHistory = ArrayDeque<Boolean>()
    private var sampleCount = 0

    /** Diventa true quando i titoli di coda sono stati confermati. */
    var isTriggered: Boolean = false
        private set

    /** Da chiamare ad ogni nuovo episodio / seek verso l'inizio. */
    fun reset() {
        previousGrid = null
        hitHistory.clear()
        sampleCount = 0
        isTriggered = false
    }

    /** Azzera solo l'accumulo dei campioni, senza perdere la storia dei frame (debug). */
    fun clearAccumulator() {
        hitHistory.clear()
        sampleCount = 0
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
        // La luminanza media è globale; le metriche di testo si calcolano solo nella
        // fascia centrale (esclude la zona sottotitoli in basso, che altrimenti
        // produrrebbe falsi positivi su scene scure con sottotitoli attivi).
        val yTop = (GRID_H * BAND_TOP).toInt().coerceAtLeast(0)
        val yBottom = (GRID_H * BAND_BOTTOM).toInt().coerceAtMost(GRID_H)

        var lumaSum = 0f
        var textCells = 0
        var bandCells = 0
        for (i in gridLuma.indices) lumaSum += gridLuma[i]

        var peakRowDensity = 0f
        var textRowCount = 0
        for (y in yTop until yBottom) {
            val base = y * GRID_W
            var c = 0
            for (x in 0 until GRID_W) {
                val l = gridLuma[base + x]
                bandCells++
                if (l >= TEXT_LOW && l <= TEXT_HIGH) {
                    c++
                    textCells++
                }
            }
            val density = c.toFloat() / GRID_W
            if (density > peakRowDensity) peakRowDensity = density
            if (density >= TEXT_ROW_THRESHOLD) textRowCount++
        }

        val cellTotal = gridLuma.size
        val meanLuma = lumaSum / cellTotal
        val darkness = (1f - meanLuma / 255f).coerceIn(0f, 1f)
        val textDensity = if (bandCells > 0) textCells.toFloat() / bandCells else 0f

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
        // MIN_TEXT_ROWS evita il falso trigger sul nero di coda puro (poca/nessuna riga
        // di testo reale) che dai log faceva scattare l'overlay solo alla fine dei credits.
        val hit = darkness >= MIN_DARKNESS &&
                textDensity in MIN_TEXT_DENSITY..MAX_TEXT_DENSITY &&
                peakRowDensity >= MIN_PEAK_ROW_DENSITY &&
                textRowCount >= MIN_TEXT_ROWS

        // Punteggio solo informativo (log / debug overlay)
        val score = (
                0.45f * darkness +
                        0.35f * (textDensity / TEXT_DENSITY_REFERENCE).coerceAtMost(1f) +
                        0.20f * staticScore
                ).coerceIn(0f, 1f)

        if (hit) {
            hitHistory.addLast(true)
        } else {
            hitHistory.addLast(false)
        }
        while (hitHistory.size > HIT_WINDOW) hitHistory.removeFirst()
        val windowHits = hitHistory.count { it }

        sampleCount++
        var triggered = false
        if (!isTriggered && windowHits >= MIN_HITS_IN_WINDOW) {
            isTriggered = true
            triggered = true
            Log.d(TAG, "Titoli di coda rilevati dopo $sampleCount campioni ($windowHits/$HIT_WINDOW)")
        }

        return Result(
            score = score,
            meanLuma = meanLuma,
            darkness = darkness,
            textDensity = textDensity,
            textRowCount = textRowCount,
            peakRowDensity = peakRowDensity,
            staticScore = staticScore,
            hit = hit,
            triggered = triggered
        )
    }

    /** Righe di log+debug da mostrare a video quando il debug è attivo. */
    fun describe(result: Result): String {
        val windowHits = hitHistory.count { it }
        return "luma=%.0f d=%.2f t=%.3f p=%.2f rows=%d s=%.2f | score=%.2f hits=%d/%d%s".format(
            result.meanLuma,
            result.darkness,
            result.textDensity,
            result.peakRowDensity,
            result.textRowCount,
            result.staticScore,
            result.score,
            windowHits,
            MIN_HITS_IN_WINDOW,
            if (result.hit) "  HIT" else ""
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
        meanLuma = 0f,
        darkness = 0f,
        textDensity = 0f,
        textRowCount = 0,
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
        private const val MIN_TEXT_DENSITY = 0.006f
        // Alzato da 0.32: i credits con testo fitto/media densità superavano il tetto
        // e venivano scartati (falso negativo osservato nel log: textDensity 0.95-1.0).
        private const val MAX_TEXT_DENSITY = 0.96f
        private const val MIN_PEAK_ROW_DENSITY = 0.16f
        // Almeno N righe con testo allineato: distingue i credits veri dal nero di coda.
        private const val MIN_TEXT_ROWS = 8
        private const val TEXT_ROW_THRESHOLD = 0.12f

        // Fascia di analisi verticale (esclude l'alto estremo e la zona sottotitoli)
        private const val BAND_TOP = 0.05f
        private const val BAND_BOTTOM = 0.85f

        // Persistenza a finestra scorrevole: 4 campioni positivi su 6 (~8s su 12s).
        // Più tollerante dei positivi consecutivi, perché i credits che cambiano
        // schermata possono produrre campioni "vuoti" isolati.
        private const val HIT_WINDOW = 6
        private const val MIN_HITS_IN_WINDOW = 4
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

    /** Esito di [PixelCopy.request] quando tutto è andato bene. */
    const val SUCCESS = PixelCopy.SUCCESS

    /**
     * Codice di esito restituito quando la cattura non è nemmeno partita
     * (surface non attached o eccezione). Distinto dai codici negativi di PixelCopy.
     */
    const val RESULT_EXCEPTION = -100

    /**
     * Cattura un frame e restituisce il codice di esito di PixelCopy
     * ([SUCCESS], [RESULT_EXCEPTION] oppure uno degli `ERROR_*` negativi).
     * Il chiamante decide se è un successo confrontando con [SUCCESS].
     */
    suspend fun capture(surfaceView: SurfaceView, dest: Bitmap): Int {
        if (!surfaceView.isAttachedToWindow) return RESULT_EXCEPTION
        return try {
            suspendCancellableCoroutine { continuation ->
                try {
                    PixelCopy.request(
                        surfaceView,
                        dest,
                        { result ->
                            if (continuation.isActive) {
                                continuation.resume(result)
                            }
                        },
                        Handler(Looper.getMainLooper())
                    )
                } catch (e: Exception) {
                    Log.w("CreditsDetector", "PixelCopy non disponibile: ${e.message}")
                    if (continuation.isActive) continuation.resume(RESULT_EXCEPTION)
                }
            }
        } catch (e: Exception) {
            Log.w("CreditsDetector", "Capture fallita: ${e.message}")
            RESULT_EXCEPTION
        }
    }
}
