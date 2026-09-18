package it.wavestream.app.ai

import com.squareup.moshi.JsonClass

/**
 * Richiesta di spiegazione del finale. Non contiene l'id del contenuto: la cache
 * è basata su titolo+anno, così la stessa spiegazione vale per lo stesso film
 * indipendentemente dall'id interno della playlist.
 */
data class MovieEndingRequest(
    val title: String,
    val year: String = "",
    val director: String? = null,
    val cast: String? = null,
    val genres: String? = null,
    val overview: String? = null
)

/** Da quale fonte proviene la spiegazione mostrata. */
enum class EndingSource {
    /** Sintesi LLM ancorata al testo di Wikipedia (affidabile). */
    WIKIPEDIA_AND_AI,

    /** Testo Wikipedia mostrato così com'è (fallback, nessuna sintesi AI). */
    WIKIPEDIA,

    /** Solo conoscenza del modello: nessuna fonte verificabile (può essere imprecisa). */
    AI
}

/**
 * Risultato finale mostrato nel popup. Serializzabile: viene salvato nella DiskCache.
 */
@JsonClass(generateAdapter = true)
data class MovieEnding(
    val explanation: String,
    val source: EndingSource,
    val wikipediaUrl: String? = null,
    val wikipediaTitle: String? = null,
    /** "alta" | "media" | "bassa" */
    val confidence: String? = null,
    /** Avviso da mostrare all'utente (es. "nessuna fonte trovata"). */
    val warning: String? = null
)

/** Il modello/fonte non ha informazioni affidabili su questo film. */
class MovieEndingUnavailableException(message: String) : Exception(message)

/** Stato UI del popup "finale del film". */
sealed interface MovieEndingUiState {
    data object Idle : MovieEndingUiState
    data object Loading : MovieEndingUiState
    data class Success(val ending: MovieEnding) : MovieEndingUiState
    data class Error(val message: String) : MovieEndingUiState
}
