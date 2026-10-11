package it.wavestream.app.util

/**
 * Età consigliata **in scala italiana**.
 *
 * TMDB espone il visto per paese — `release_dates` per i film (`certification`) e
 * `content_ratings` per le serie (`rating`) — e la preferenza di paese (Italia →
 * USA → primo disponibile) è già applicata a monte in `TMDBService`.
 *
 * Qui il visto viene **portato nella classificazione italiana**, che è l'unica
 * scala mostrata all'utente: `T`, `6+`, `12+`, `14+`, `18+` (AGCOM / Ministero
 * della Cultura, in vigore dal 2021). Serve perché per le serie TMDB non ha quasi
 * mai visti italiani — gli `TV-MA` / `TV-14` arrivano tutti dal ripiego USA — e
 * perché le sigle vecchie (`VM14`, `VM18`) non sono più quelle che l'utente
 * incontra. Senza la conversione il badge sarebbe assente su oltre metà catalogo
 * o mescolerebbe scale diverse (`PG-13` accanto a `14+`).
 *
 * La conversione **arrotonda sempre per eccesso**: si sceglie la classe italiana
 * più bassa che copre l'età dichiarata dal visto di partenza. Mai "a meno" —
 * l'app non deve risultare più permissiva della fonte.
 */
object AgeRating {

    /** Fascia del badge: determina il colore. */
    enum class Level { ALL, TEEN, MATURE }

    /** Classi italiane oltre a "T" (che vale "per tutti"), in ordine crescente. */
    private val IT_CLASSES = listOf(6, 12, 14, 18)

    /**
     * Visti che valgono "per tutti" — Italia (`T`, `TP`) e anglosassoni
     * (`G`, `TV-Y`, `TV-Y7`, `TV-G`). `0` è il grado tedesco/FSK "nessuna restrizione".
     */
    private val ALL_AGES = setOf("T", "TP", "G", "TV-Y", "TV-Y7", "TV-G", "0")

    /** Visti senza età numerica equivalenti a "vietato ai minori". */
    private val MATURE_ONLY = setOf("R", "NC-17", "X", "TV-MA")

    /** Visti senza età numerica equivalenti a "visione con la guida di un adulto". */
    private val WITH_GUIDANCE = setOf("PG", "TV-PG")

    /** Primo numero presente nell'etichetta: `"VM14"` → 14, `"PG-13"` → 13. */
    private val AGE_IN_LABEL = Regex("\\d+")

    /**
     * Classe italiana da mostrare nel badge, o `null` se il visto non è
     * interpretabile (in quel caso il badge non viene disegnato affatto).
     *
     * Tabella di conversione completa, dal visto sorgente alla classe italiana:
     *
     * | visto | → | motivo |
     * |---|---|---|
     * | `T`, `TP`, `G`, `TV-G`, `TV-Y`, `TV-Y7`, `0` | **`T`** | nessuna restrizione |
     * | `PG`, `TV-PG` | **`6+`** | guida genitoriale, non una restrizione |
     * | `7+`, `10+`, `12+`, `VM12` | **`12+`** | classe più bassa che copre il numero |
     * | `PG-13` (13) | **`14+`** | classe successiva a 13 |
     * | `14+`, `VM14`, `TV-14` | **`14+`** | coincidono |
     * | `R`, `NC-17`, `X`, `TV-MA` | **`18+`** | vietato ai minori (`R` = under 17) |
     * | `16+`, `18+`, `VM18`, oltre 18 | **`18+`** | cap alla classe più restrittiva |
     * | non numerico sconosciuto (es. `BA`) | *nessun badge* | non si inventa un'età |
     */
    fun label(raw: String?): String? {
        val value = raw?.trim()?.uppercase()?.takeIf { it.isNotEmpty() } ?: return null
        if (value in ALL_AGES) return "T"
        if (value in MATURE_ONLY) return "18+"
        if (value in WITH_GUIDANCE) return "6+"

        val age = AGE_IN_LABEL.find(value)?.value?.toIntOrNull() ?: return null
        if (age <= 0) return "T"
        // Arrotondamento per eccesso; se supera l'ultima classe si resta su 18+.
        val itClass = IT_CLASSES.firstOrNull { it >= age } ?: IT_CLASSES.last()
        return "$itClass+"
    }

    /**
     * Fascia del badge per una classe italiana: `T` e `6+` condividono il verde
     * (fascia "famiglia"), `12+` e `14+` l'ambra, `18+` il rosso.
     *
     * L'`else` copre le classi non previste e si tiene la più restrittiva: un
     * colore sbagliato in eccesso di prudenza è preferibile al contrario.
     */
    fun level(label: String): Level = when (label.uppercase()) {
        "T", "6+" -> Level.ALL
        "12+", "14+" -> Level.TEEN
        else -> Level.MATURE
    }
}
