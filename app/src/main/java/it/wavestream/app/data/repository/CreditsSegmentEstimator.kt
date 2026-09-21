package it.wavestream.app.data.repository

import it.wavestream.app.data.database.entity.MediaSegment

/**
 * Stime pure sui segmenti temporali, senza dipendenze Android/Room.
 * Estratte qui per essere testabili con unit test JVM.
 */
object CreditsSegmentEstimator {

    /**
     * Stima l'inizio dei credits per un episodio basandosi sulla "coda" del riferimento
     * di serie: tail = durationRef - startRef; stima = durationCorrente - tail.
     * Non è un marker esatto: va usata come hint/fallback, non come verità assoluta.
     */
    fun estimateCreditsStart(reference: MediaSegment, currentDurationMs: Long): Long? {
        if (reference.durationMs <= 0 || currentDurationMs <= 0) return null
        val tail = reference.durationMs - reference.startMs
        if (tail <= 0) return null
        return (currentDurationMs - tail).coerceAtLeast(0)
    }
}
