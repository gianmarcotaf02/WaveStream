package it.wavestream.app.ai

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * Retrofit API per Google Gemini (generateContent + function calling).
 * Free tier: nessun costo con API key generata su aistudio.google.com.
 */
interface GeminiApiService {

    @POST("v1beta/models/{model}:generateContent")
    suspend fun generateContent(
        @retrofit2.http.Path("model") model: String,
        @Query("key") apiKey: String,
        @Body request: GeminiRequest
    ): GeminiResponse

    companion object {
        const val BASE_URL = "https://generativelanguage.googleapis.com/"

        // Gemini 3.5 Flash Lite (audio input nativo, free tier)
        const val DEFAULT_MODEL = "gemini-3.5-flash-lite"
    }
}

// ---------- Request ----------

@JsonClass(generateAdapter = true)
data class GeminiRequest(
    val contents: List<GeminiContent>,
    @Json(name = "system_instruction") val systemInstruction: GeminiContent? = null,
    val tools: List<GeminiTool>? = null,
    @Json(name = "generation_config") val generationConfig: GeminiGenerationConfig? = null
)

@JsonClass(generateAdapter = true)
data class GeminiGenerationConfig(
    val temperature: Double = 0.6,
    @Json(name = "max_output_tokens") val maxOutputTokens: Int = 512
)

@JsonClass(generateAdapter = true)
data class GeminiContent(
    val role: String? = null, // "user" | "model"
    val parts: List<GeminiPart>
)

@JsonClass(generateAdapter = true)
data class GeminiPart(
    val text: String? = null,
    @Json(name = "function_call") val functionCall: GeminiFunctionCall? = null,
    @Json(name = "function_response") val functionResponse: GeminiFunctionResponse? = null,
    @Json(name = "inline_data") val inlineData: GeminiInlineData? = null,
    // Gemini 3.x: firma di pensiero da restituire nei turni successivi del function calling
    @Json(name = "thought_signature") val thoughtSignature: String? = null
) {
    companion object {
        fun ofText(text: String) = GeminiPart(text = text)
        fun ofCall(name: String, args: Map<String, Any?>) = GeminiPart(functionCall = GeminiFunctionCall(name, args))
        fun ofResponse(name: String, response: Map<String, Any?>) =
            GeminiPart(functionResponse = GeminiFunctionResponse(name, response))

        /** Audio WAV/MP3 encodato in base64 (input vocale nativo del modello) */
        fun ofAudio(base64Wav: String, mimeType: String = "audio/wav") =
            GeminiPart(inlineData = GeminiInlineData(mimeType, base64Wav))
    }
}

@JsonClass(generateAdapter = true)
data class GeminiInlineData(
    @Json(name = "mime_type") val mimeType: String,
    val data: String // base64
)

@JsonClass(generateAdapter = true)
data class GeminiFunctionCall(
    val name: String,
    val args: Map<String, Any?> = emptyMap()
)

@JsonClass(generateAdapter = true)
data class GeminiFunctionResponse(
    val name: String,
    val response: Map<String, Any?>
)

@JsonClass(generateAdapter = true)
data class GeminiTool(
    @Json(name = "function_declarations") val functionDeclarations: List<GeminiFunctionDeclaration>
)

@JsonClass(generateAdapter = true)
data class GeminiFunctionDeclaration(
    val name: String,
    val description: String,
    val parameters: GeminiFunctionParameters? = null
)

@JsonClass(generateAdapter = true)
data class GeminiFunctionParameters(
    val type: String, // "OBJECT"
    val properties: Map<String, GeminiFunctionProperty> = emptyMap(),
    val required: List<String> = emptyList()
)

@JsonClass(generateAdapter = true)
data class GeminiFunctionProperty(
    val type: String, // "STRING", "NUMBER", "BOOLEAN"
    val description: String,
    val enum: List<String>? = null
)

// ---------- Response ----------

@JsonClass(generateAdapter = true)
data class GeminiResponse(
    val candidates: List<GeminiCandidate>? = null
) {
    /**
     * Estrae le parti del primo candidato (testi + function calls).
     */
    fun firstParts(): List<GeminiPart> =
        candidates?.firstOrNull()?.content?.parts.orEmpty()
}

@JsonClass(generateAdapter = true)
data class GeminiCandidate(
    val content: GeminiContent? = null
)
