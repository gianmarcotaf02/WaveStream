package it.wavestream.app.ai

import it.wavestream.app.ai.GeminiApiService.Companion.DEFAULT_MODEL
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.voice.WavEncoder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Servizio di conversazione dell'assistente WaveStream.
 *
 * Gestisce:
 * - invio audio del microfono direttamente a Gemini (input vocale nativo, niente STT locale)
 * - function calling verso AiTools (ricerca, consigli, canali live)
 * - storico conversazione multi-turno
 */
@Singleton
class AiAssistantService @Inject constructor(
    private val geminiApi: GeminiApiService,
    private val aiTools: AiTools,
    private val userPreferences: UserPreferences
) {

    companion object {
        private const val MAX_TOOL_ROUNDS = 3

        private const val SYSTEM_PROMPT = """Sei Nova, l'assistente vocale di WaveStream, un'app IPTV per Android TV.
Parli ITALIANO, in modo breve, naturale e cordiale come un assistente TV.

Regole:
- Se è utile, presentati come Nova.
- L'utente ti parla con la voce; le sue domande possono contenere errori di trascrizione: interpreta il senso.
- Hai accesso a tool per cercare film, serie TV e canali live nella libreria dell'utente: usali SEMPRE prima di rispondere quando la richiesta riguarda contenuti.
- Dopo un tool, rispondi con UNA o DUE frasi brevi (verranno lette ad alta voce) e invita l'utente a scegliere dal carosello a schermo.
- Se non trovi nulla, dillo gentilmente e suggerisci alternative.
- Per domande generiche (saluti, meteo, curiosità) rispondi brevemente. Non hai accesso a internet: se chiedi informazioni in tempo reale che non puoi sapere, dillo.
- Non usare emoji, elenchi puntati o markdown: la risposta viene pronunciata."""
    }

    // Storico conversazione (multi-turno)
    private val history = mutableListOf<GeminiContent>()

    private val tools = listOf(
        GeminiTool(functionDeclarations = AiTools.declarations())
    )

    /** Resetta la conversazione (nuova sessione) */
    fun resetConversation() {
        history.clear()
    }

    /**
     * Invia l'audio del microfono a Gemini e processa la risposta.
     * Gestisce autonomamente i round di function calling (max 3).
     */
    suspend fun sendVoiceMessage(pcmAudio: FloatArray): AiTurn = withContext(Dispatchers.IO) {
        val apiKey = userPreferences.getGeminiApiKey()
            ?: throw IllegalStateException("API key Gemini non configurata. Impostala nelle Impostazioni.")

        val wavBase64 = android.util.Base64.encodeToString(
            WavEncoder.encodeToWav(pcmAudio),
            android.util.Base64.NO_WRAP
        )

        val userContent = GeminiContent(
            role = "user",
            parts = listOf(
                GeminiPart.ofAudio(wavBase64)
            )
        )
        history.add(userContent)

        processConversation(apiKey)
    }

    /**
     * Invia un messaggio di testo (es. per test o fallback).
     */
    suspend fun sendTextMessage(text: String): AiTurn = withContext(Dispatchers.IO) {
        val apiKey = userPreferences.getGeminiApiKey()
            ?: throw IllegalStateException("API key Gemini non configurata. Impostala nelle Impostazioni.")

        history.add(
            GeminiContent(role = "user", parts = listOf(GeminiPart.ofText(text)))
        )

        processConversation(apiKey)
    }

    /**
     * Loop principale: chiama Gemini, esegue eventuali function call e ripete
     * finché il modello non produce una risposta testuale finale.
     */
    private suspend fun processConversation(apiKey: String): AiTurn {
        val collectedItems = mutableListOf<AiResultItem>()
        var replyText = ""

        repeat(MAX_TOOL_ROUNDS) {
            val request = GeminiRequest(
                contents = history.toList(),
                systemInstruction = GeminiContent(
                    role = null,
                    parts = listOf(GeminiPart.ofText(SYSTEM_PROMPT))
                ),
                tools = tools
            )

            val response = geminiApi.generateContent(DEFAULT_MODEL, apiKey, request)
            val parts = response.firstParts()

            if (parts.isEmpty()) {
                replyText = "Non ho capito, potresti ripetere?"
                return@repeat
            }

            // Separiamo testo e function calls
            val texts = parts.mapNotNull { it.text }
            val calls = parts.mapNotNull { it.functionCall }

            if (texts.isNotEmpty()) {
                replyText = texts.joinToString(" ").trim()
            }

            if (calls.isEmpty()) {
                // Risposta finale: aggiungila allo storico ed esci
                history.add(GeminiContent(role = "model", parts = parts))
                return AiTurn(replyText.ifEmpty { "Ecco cosa ho trovato!" }, collectedItems)
            }

            // C'è almeno una function call: registra il modello nello storico,
            // esegui i tool e costruisci la risposta functionResponse
            history.add(GeminiContent(role = "model", parts = parts))

            val responseParts = calls.map { call ->
                val result = aiTools.execute(call.name, call.args)
                collectedItems.addAll(result.items)
                GeminiPart.ofResponse(
                    call.name,
                    result.response.mapValues { (_, v) -> v.toString() }
                )
            }
            history.add(GeminiContent(role = "user", parts = responseParts))
        }

        // Troppi round: restituisci quello che abbiamo
        return AiTurn(
            replyText.ifEmpty { "Ecco i risultati!" },
            collectedItems
        )
    }
}
