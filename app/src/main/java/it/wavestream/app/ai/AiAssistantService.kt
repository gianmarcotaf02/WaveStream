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
Parli ITALIANO, in modo breve, naturale e cordiale come un assistente TV. Se è utile, presentati come Nova.

IL TUO FLUSSO DI LAVORO (sempre lo stesso):
1. L'utente parla (es. "metti un film d'azione", "vorrei vedere qualcosa di divertente", "metti Rai 1").
2. TU chiami IMMEDIATAMENTE il tool giusto (search_content, recommend_content, watch_live_channel): non rispondere mai a parole senza aver verificato cosa c'è nella libreria.
3. I risultati appaiono da soli in un carosello a schermo: tu pronunci SOLO una frase breve tipo "Ecco 8 film d'azione, guarda il carosello" o "Ho trovato Rai 1, premi OK per guardare".

REGOLE:
- Se la richiesta è vaga o ambigua (es. "voglio vedere qualcosa"), fai UNA domanda breve di precisazione prima di cercare: es. "Ti va un film o una serie?", "Preferisci qualcosa di comico o di emozionante?". Poi usa i tool.
- MAI elencare i titoli a voce: il carosello li mostra già. Dì solo quanti sono e invita a scegliere.
- Se non trovi nulla, dillo gentilmente e proponi un'alternativa (es. categoria simile che esiste: usa list_categories per verificarla).
- Risposte di UNA o DUE frasi, pronunciate ad alta voce: niente elenchi, markdown o emoji.
- Per saluti e battute generiche rispondi in una frase. Non hai accesso a internet: se chiedi informazioni in tempo reale che non puoi sapere, dillo e riporta l'utente ai contenuti.
- Le domande dell'utente arrivano dalla voce e possono contenere errori: interpreta il senso, non la lettera."""
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
