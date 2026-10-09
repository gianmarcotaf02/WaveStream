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

    /**
     * Esito della validazione di un marker temporale remoto contro la durata reale
     * dello stream in riproduzione.
     */
    sealed interface MarkerFit {
        /** Il marker è già coerente con la durata (o la durata non è nota): usalo così com'è. */
        data class InRange(val startMs: Long, val endMs: Long?) : MarkerFit

        /** Il marker cadeva oltre la fine del file ed è stato ri-ancorato alla coda. */
        data class Reanchored(val startMs: Long, val endMs: Long) : MarkerFit

        /** Marker inutilizzabile: fuori dalla durata e non ri-ancorabile. Va scartato. */
        data object Unusable : MarkerFit
    }

    /**
     * Valida un marker temporale (IntroDB/comunitario, utente, detector) contro la durata
     * reale dello stream e lo ri-ancora alla coda se cade oltre la fine del file.
     *
     * Perché serve: i marker di IntroDB/SkipDB sono misurati su una release che può non
     * essere la nostra (e la durata non viene passata al provider), quindi `startMs` può
     * finire oltre l'EOF. Osservato su Dexter 2006 via CherryTV: outro `3088s -> 3190s`
     * con file lungo `3050s` (marker irraggiungibile, nessun pulsante "Salta titoli di coda").
     *
     * Il ri-ancoraggio usa la lunghezza del segmento (`endMs - startMs`), che il provider
     * dichiara sempre, e la sposta a partire dalla coda: `duration - length`.
     *
     * @param durationMs durata reale dello stream; se `<= 0` la validazione è saltata
     *   (lo stream non è ancora pronto) e il marker viene restituito come [MarkerFit.InRange].
     */
    fun fitToDuration(startMs: Long, endMs: Long?, durationMs: Long): MarkerFit {
        if (durationMs <= 0 || startMs < durationMs) return MarkerFit.InRange(startMs, endMs)
        val length = endMs?.takeIf { it > startMs }?.minus(startMs)
        if (length == null || length >= durationMs) return MarkerFit.Unusable
        val shifted = (durationMs - length).coerceAtLeast(0)
        return MarkerFit.Reanchored(shifted, shifted + length)
    }
}
