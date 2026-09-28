package it.wavestream.app.ui.player

/**
 * Metadati mostrati nell'overlay "in pausa" del player (stile Netflix).
 *
 * Caricati una sola volta dal DB (già arricchito da TMDB) all'apertura del player:
 *  - FILM → logo TMDB, anno, durata, generi (+ minuti rimasti calcolati a runtime).
 *  - SERIE → tutte le info + stagione/episodio in corso e titolo/trama dell'episodio.
 *
 * Solo per il VOD: i canali live non lo mostrano.
 */
data class PlayerPauseInfo(
    /** Titolo grafico (clear logo TMDB) — null se non disponibile. */
    val logoUrl: String?,
    /** Titolo testuale di fallback (titolo TMDB o pulito). */
    val title: String,
    val year: Int? = null,
    /** Durata in minuti (film: runtime TMDB; serie: durata dell'episodio). */
    val durationMinutes: Int? = null,
    val genres: String? = null,
    val isSeries: Boolean = false,
    // Solo per le serie
    val seasonNumber: Int? = null,
    val episodeNumber: Int? = null,
    val episodeTitle: String? = null,
    /** Trama (serie: episodio se disponibile, altrimenti della serie). */
    val plot: String? = null
)
