package it.wavestream.app.util

/**
 * Visto censura (certification) TMDB: normalizzazione per la UI.
 *
 * TMDB espone il dato per paese — `release_dates` per i film (`certification`) e
 * `content_ratings` per le serie (`rating`) — e la scelta del paese è già fatta a
 * monte in `TMDBService` (Italia, poi USA, poi primo valore disponibile).
 *
 * Qui resta solo la presentazione: l'etichetta compatta del badge e la fascia
 * d'età che ne determina il colore. Nessuna interpretazione creativa: un formato
 * extra-UE (es. "PG-13") resta quello, viene solo reso leggibile.
 */
object AgeRating {

    /** Fascia a cui appartiene il visto: guida il colore del badge. */
    enum class Level { ALL, TEEN, MATURE }

    /** Primo numero presente nell'etichetta: "VM14" → 14, "PG-13" → 13. */
    private val AGE_IN_LABEL = Regex("\\d+")

    /** Etichette "per tutti", senza età: Italia (T/TP) e anglosassoni (G, TV-Y, TV-G). */
    private val ALL_AGES = setOf("T", "TP", "G", "TV-Y", "TV-Y7", "TV-G", "0")

    /**
     * Etichetta compatta da mostrare nel badge, o `null` se non c'è un visto.
     *
     * - `"T"` / `"TP"` (tutti) → `"T"`
     * - numero nudo (`"12"`) → `"12+"`: i certificati italiani arrivano a volte
     *   senza il `+`, e il `+` è la forma che l'utente riconosce
     * - il resto resta invariato ma in maiuscolo (`"vm14"` → `"VM14"`)
     */
    fun label(raw: String?): String? {
        val value = raw?.trim()?.takeIf { it.isNotEmpty() } ?: return null
        val normalized = value.uppercase()
        if (normalized == "T" || normalized == "TP") return "T"
        if (normalized.all { it.isDigit() }) return "$normalized+"
        return normalized
    }

    /**
     * Fascia d'età a partire dall'etichetta normalizzata.
     *
     * Si estrae il primo numero presente (`"VM14"` → 14, `"PG-13"` → 13): la soglia
     * 16 separa i contenuti per adulti (VM18 / R / 18+) da quelli per ragazzi, che
     * restano ambra. Un'etichetta senza numeri e diversa da "T" è trattata come
     * restrittiva, così non finisce verde per errore.
     */
    fun level(label: String): Level {
        val upper = label.uppercase()
        if (upper in ALL_AGES) return Level.ALL
        val age = AGE_IN_LABEL.find(upper)?.value?.toIntOrNull()
        if (age != null) return if (age < 16) Level.TEEN else Level.MATURE
        // Etichette senza età numerica: le più permissive restano ambra, il resto rosso.
        if (upper == "PG" || upper == "TV-PG") return Level.TEEN
        return Level.MATURE
    }
}
