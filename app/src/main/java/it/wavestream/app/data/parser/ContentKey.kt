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
    fun groupKey(title: String, year: Int?): String {
        val t = normalizeTitle(title)
        return if (year != null) "$t|$year" else "$t|"
    }

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
    ): List<List<T>> {
        val byTitle = items.groupBy { normalizeTitle(titleOf(it)) }
        val result = ArrayList<List<T>>(byTitle.size)
        for ((_, sameTitle) in byTitle) {
            val years = sameTitle.mapNotNull(yearOf).distinct()
            if (years.size <= 1) {
                result.add(sameTitle)
            } else {
                sameTitle.groupBy { yearOf(it) ?: -1 }.values.forEach { result.add(it) }
            }
        }
        return result
    }
}
