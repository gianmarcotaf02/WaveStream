package it.wavestream.app.ai

import it.wavestream.app.data.database.entity.ContentType

/**
 * Modelli condivisi dell'assistente AI.
 */

/** Contenuto da mostrare nel carosello dei risultati dell'assistente */
data class AiResultItem(
    val type: ContentType,   // MOVIE, SERIES o CHANNEL
    val id: Long,
    val title: String,
    val imageUrl: String?,
    val subtitle: String?,
    val streamUrl: String? = null // solo per i canali live (riproduzione diretta)
)

/** Esito dell'esecuzione di un tool */
data class AiToolResult(
    val response: Map<String, Any?>,   // payload functionResponse per il modello
    val items: List<AiResultItem> = emptyList() // risultati per il carosello UI
)

/** Un turno di conversazione dell'assistente */
data class AiTurn(
    val replyText: String,
    val results: List<AiResultItem>,
    val transcript: String? = null // cosa Nova ha capito dalla voce dell'utente
)
