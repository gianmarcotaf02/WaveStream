package it.wavestream.app.ai

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

/**
 * Retrofit API per OpenRouter (chat completions).
 *
 * Usata dalla feature "Finale del film" per generare una spiegazione del finale
 * a partire da una fonte reale (testo Wikipedia) oppure, in mancanza di fonti,
 * dalla sola conoscenza del modello con vincoli anti-allucinazione.
 *
 * Il modello di default è un modello gratuito (`:free`): nessun costo, ma con
 * rate limit e prompt potenzialmente usati per il training da parte del provider.
 */
interface OpenRouterService {

    @POST("v1/chat/completions")
    suspend fun chatCompletions(
        @Header("Authorization") authorization: String,
        @Header("HTTP-Referer") referer: String? = null,
        @Header("X-Title") title: String? = null,
        @Body body: OpenRouterRequest
    ): OpenRouterResponse

    companion object {
        const val BASE_URL = "https://openrouter.ai/api/"

        /**
         * Modello OpenRouter usato per la spiegazione del finale.
         * `:free` = costo zero. Se cambia l'id, aggiornare solo questa costante.
         */
        const val DEFAULT_MODEL = "qwen/qwen3.8-27b:free"
    }
}

// ---------- Request ----------

@JsonClass(generateAdapter = true)
data class OpenRouterRequest(
    val model: String,
    val messages: List<OpenRouterMessage>,
    val temperature: Double? = null,
    @Json(name = "top_p") val topP: Double? = null,
    @Json(name = "max_tokens") val maxTokens: Int? = null,
    @Json(name = "response_format") val responseFormat: OpenRouterResponseFormat? = null,
    val stream: Boolean = false
)

@JsonClass(generateAdapter = true)
data class OpenRouterResponseFormat(
    /** "json_object" | "json_schema" | "text" */
    val type: String
)

@JsonClass(generateAdapter = true)
data class OpenRouterMessage(
    val role: String, // "system" | "user" | "assistant"
    val content: String
)

// ---------- Response ----------

@JsonClass(generateAdapter = true)
data class OpenRouterResponse(
    val id: String? = null,
    val model: String? = null,
    val choices: List<OpenRouterChoice>? = null,
    val error: OpenRouterError? = null
)

@JsonClass(generateAdapter = true)
data class OpenRouterChoice(
    val index: Int? = null,
    val message: OpenRouterMessage? = null,
    @Json(name = "finish_reason") val finishReason: String? = null
)

@JsonClass(generateAdapter = true)
data class OpenRouterError(
    val code: Int? = null,
    val message: String? = null
)
