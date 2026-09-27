package it.wavestream.app.data.parser

import java.text.Normalizer
import java.util.Locale

/**
 * Chiave canonica usata per unificare i doppioni di uno stesso film all'interno
 * di una playlist.
 *
 * La chiave è il titolo normalizzato (minuscolo, senza accenti/punteggiatura,
 * spazi collassati) più l'anno di uscita quando noto. Il raggruppamento vero e
 * proprio è più tollerante dell'uguaglianza secca della chiave: vedi
 * [groupByTitleAndYear], che gestisce il caso in cui alcune versioni non hanno
 * l'anno nel nome.
 */
object ContentKey {

    private val whitespace = Regex("""\s+""")
    private val nonAlnum = Regex("""[^\p{L}\p{N}\s]""")
    private val combiningMarks = Regex("""\p{Mn}+""")

    /**
     * Marcatori di doppione/versione che molti provider IPTV accodano al titolo,
     * es. "Iron Man 2 (4)" o "Guardians of the Galaxy Vol. 2 (11)". Il numero tra
     * parentesi NON fa parte del titolo: è il conteggio delle versioni pubblicate.
     *
     * Va rimosso in fase di parsing/ricerca, altrimenti:
     *  - il titolo mostrato contiene il numero ("Iron Man 2 (4)");
     *  - la ricerca TMDB fallisce (nessun match per "Iron Man 2 (4)") → scheda vuota;
     *  - i doppioni di uno stesso film non si unificano (chiavi diverse:
     *    "iron man 2 4" vs "iron man 2"), restando due righe separate.
     */
    private val duplicateMarker = Regex("""(?:\s*\(\d{1,2}\))++\s*$""")

    /**
     * Rimuove dal titolo i marcatori di doppione finali accodati dal provider:
     * `"Iron Man 2 (4)"` → `"Iron Man 2"`, `"Titolo (2) (3)"` → `"Titolo"`.
     * Non tocca titoli legittimi come `"1917"` o `"Iron Man 2"` (nessuna parentesi).
     */
    fun stripDuplicateMarker(raw: String): String = raw.replace(duplicateMarker, "").trim()

    /** Normalizza un titolo per il confronto (non per la visualizzazione). */
    fun normalizeTitle(raw: String): String {
        val noAccents = Normalizer.normalize(raw, Normalizer.Form.NFD)
            .replace(combiningMarks, "")
        return noAccents
            .lowercase(Locale.ROOT)
            .replace(nonAlnum, " ")
            .replace(whitespace, " ")
            .trim()
    }

    /** Chiave completa (titolo|anno). Anno null → solo titolo. */
    fun groupKey(title: String, year: Int?): String = groupKeyNormalized(normalizeTitle(title), year)

    /** Chiave completa a partire da un titolo **già normalizzato** con [normalizeTitle]. */
    fun groupKeyNormalized(normalizedTitle: String, year: Int?): String =
        if (year != null) "$normalizedTitle|$year" else "$normalizedTitle|"

    /**
     * Raggruppa elementi per titolo normalizzato, gestendo l'anno in modo
     * conservativo:
     * - stesso titolo, al più un anno distinto noto → un unico gruppo
     *   (le versioni senza anno si uniscono a quella con anno);
     * - stesso titolo con **più anni distinti** (remake/omonimi) → gruppi separati
     *   per anno; le versioni senza anno restano in un gruppo a parte per non
     *   rischiare di fondere film diversi.
     *
     * @param titleOf estrae il titolo grezzo
     * @param yearOf estrae l'anno (null se ignoto)
     */
    fun <T> groupByTitleAndYear(
        items: List<T>,
        titleOf: (T) -> String,
        yearOf: (T) -> Int?
    ): List<List<T>> = groupByTitleAndYearWithKeys(items, titleOf, yearOf).map { it.second }

    /**
     * Come [groupByTitleAndYear] ma restituisce anche il titolo **normalizzato**
     * di ogni gruppo: evita di ricalcolare [normalizeTitle] una seconda volta a
     * valle (su ~70k VOD era una delle voci più care del sync/refresh).
     */
    fun <T> groupByTitleAndYearWithKeys(
        items: List<T>,
        titleOf: (T) -> String,
        yearOf: (T) -> Int?
    ): List<Pair<String, List<T>>> {
        val byTitle = items.groupBy { normalizeTitle(titleOf(it)) }
        val result = ArrayList<Pair<String, List<T>>>(byTitle.size)
        for ((title, sameTitle) in byTitle) {
            val years = sameTitle.mapNotNull(yearOf).distinct()
            if (years.size <= 1) {
                result.add(title to sameTitle)
            } else {
                sameTitle.groupBy { yearOf(it) ?: -1 }.values.forEach { result.add(title to it) }
            }
        }
        return result
    }
}
