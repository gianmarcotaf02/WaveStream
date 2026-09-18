package it.wavestream.app.ai

import android.util.Log
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import it.wavestream.app.data.cache.DiskCache
import it.wavestream.app.data.preferences.UserPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URLEncoder
import java.text.Normalizer
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Recupera e spiega il finale di un film.
 *
 * Strategia anti-allucinazione (in ordine di priorità):
 *  1. **Wikipedia + AI**: si cerca la voce Wikipedia del film, si estrae la sezione
 *     "Trama" e la si passa all'LLM come UNICA fonte consentita. Alta affidabilità,
 *     fonte verificabile.
 *  2. **Solo Wikipedia**: se l'LLM non è disponibile (nessuna chiave o errore) si
 *     mostra direttamente il testo di Wikipedia. Zero allucinazioni.
 *  3. **Solo AI**: se non esiste una voce Wikipedia, il modello risponde a memoria
 *     con vincoli anti-allucinazione molto stretti (deve ammettere di non sapere).
 *
 * Il risultato viene salvato in DiskCache (chiave = titolo+anno) per non consumare
 * il rate limit dei modelli gratuiti.
 */
@Singleton
class MovieEndingRepository @Inject constructor(
    private val openRouterService: OpenRouterService,
    private val wikipediaService: WikipediaService,
    private val userPreferences: UserPreferences,
    private val diskCache: DiskCache,
    private val moshi: Moshi
) {

    companion object {
        private const val TAG = "MovieEndingRepo"

        private const val CACHE_PREFIX = "movie_ending_v2_"
        private const val CACHE_TTL: Long = 60L * 24 * 60 * 60 * 1000 // 60 giorni

        /** Lunghezza massima dell'estratto di trama passato all'LLM. */
        private const val MAX_PLOT_CHARS = 9_000
        /** Se la trama è più lunga, si tengono inizio e (soprattutto) fine. */
        private const val PLOT_HEAD_CHARS = 2_500
        /** Limite di sicurezza sulla sezione Trama letta dalla pagina. */
        private const val MAX_SECTION_CHARS = 40_000
        /** Testo massimo mostrato all'utente quando la fonte è Wikipedia grezza. */
        private const val MAX_DISPLAY_CHARS = 6_000
        private const val MAX_TOKENS = 1_200

        private val HEADING_REGEX = Regex("^={2,}\\s*(.+?)\\s*={2,}$")
        private val PLOT_HEADINGS = listOf("trama", "sinossi", "plot", "synopsis", "story")
        private val HTML_TAG_REGEX = Regex("<[^>]+>")
        private val THINK_REGEX = Regex("(?s)(?:<think.*?</think>|<｜.*?｜>)")

        private val SYSTEM_GROUNDED = """
            Sei un assistente di WaveStream che spiega agli utenti COME FINISCE un film.
            Ricevi il testo di Wikipedia sulla trama: è l'UNICA fonte che puoi usare.

            REGOLE ASSOLUTE:
            1. Usa esclusivamente le informazioni presenti nel testo fornito. Non aggiungere nulla che non ci sia.
            2. Non inventare scene, dialoghi o dettagli. Non usare la tua memoria su questo film.
            3. Se il testo non descrive chiaramente il finale, imposta "trovato" a false e "testo" a stringa vuota.
            4. Rispondi in ITALIANO, in prosa continua, massimo 170 parole, spiegando il finale vero.
            5. Il campo "testo" deve essere TESTO SEMPLICE: niente markdown, niente asterischi, cancelletti, trattini di elenco, slash, backslash o emoji.
            6. Restituisci SOLO un oggetto JSON valido, senza markdown e senza testo fuori dal JSON, con questa forma:
            {"trovato": true, "testo": "spiegazione del finale", "confidenza": "alta|media|bassa"}
        """.trimIndent()

        private val SYSTEM_MEMORY = """
            Sei un assistente di WaveStream che spiega agli utenti COME FINISCE un film.
            Non hai accesso a internet e non hai il testo di Wikipedia: usi SOLO la tua conoscenza.

            REGOLE ASSOLUTE (anti-allucinazione):
            1. NON INVENTARE MAI. Se non conosci il film con certezza, o se è uscito dopo la tua data di addestramento, imposta "trovato" a false e "testo" a stringa vuota.
            2. Non dedurre il finale dalla trama: se non lo ricordi con sicurezza, dì che non lo sai.
            3. Non confondere il film con remake, omonimi o adattamenti: se hai dubbi su quale film sia, imposta "trovato" a false.
            4. Rispondi in ITALIANO, in prosa continua, massimo 170 parole.
            5. Il campo "testo" deve essere TESTO SEMPLICE: niente markdown, niente asterischi, cancelletti, trattini di elenco, slash, backslash o emoji.
            6. Restituisci SOLO un oggetto JSON valido, senza markdown e senza testo fuori dal JSON, con questa forma:
            {"trovato": true|false, "testo": "spiegazione del finale oppure stringa vuota", "confidenza": "alta|media|bassa", "motivo": "breve motivo se non lo conosci"}
        """.trimIndent()

        private const val UNKNOWN_ANSWER =
            "Non ho informazioni sufficienti e affidabili su questo film per spiegarne il finale senza rischiare di inventare."
    }

    /** Recupera (o genera) la spiegazione del finale. */
    suspend fun getEnding(request: MovieEndingRequest): MovieEnding = withContext(Dispatchers.IO) {
        val cacheKey = CACHE_PREFIX + cacheKeyOf(request)

        diskCache.get(cacheKey, MovieEnding::class.java)?.let {
            Log.d(TAG, "Cache hit per $cacheKey")
            return@withContext it
        }

        val wiki = fetchWikipediaPlot(request)
        val result: MovieEnding = if (wiki != null) {
            Log.d(TAG, "Wikipedia trovata: ${wiki.url}")
            val apiKey = userPreferences.getOpenRouterApiKey()
            val summary = if (!apiKey.isNullOrBlank()) {
                runCatching { summarizeFromWikipedia(request, wiki.plot, apiKey) }
                    .onFailure { Log.w(TAG, "Sintesi Wikipedia+AI fallita", it) }
                    .getOrNull()
            } else null

            val cleanedSummary = summary?.let { sanitizeForDisplay(it) }?.takeIf { it.isNotBlank() }
            if (cleanedSummary != null) {
                MovieEnding(
                    explanation = cleanedSummary,
                    source = EndingSource.WIKIPEDIA_AND_AI,
                    wikipediaUrl = wiki.url,
                    wikipediaTitle = wiki.title,
                    confidence = "alta",
                    warning = null
                )
            } else {
                MovieEnding(
                    explanation = sanitizeForDisplay(truncateForDisplay(wiki.plot)),
                    source = EndingSource.WIKIPEDIA,
                    wikipediaUrl = wiki.url,
                    wikipediaTitle = wiki.title,
                    confidence = "alta",
                    warning = if (apiKey.isNullOrBlank())
                        "Chiave OpenRouter non configurata: mostro il testo di Wikipedia."
                    else
                        "Sintesi AI non disponibile: mostro il testo di Wikipedia."
                )
            }
        } else {
            Log.d(TAG, "Nessuna voce Wikipedia per: ${request.title} (${request.year})")
            val apiKey = userPreferences.getOpenRouterApiKey()
            if (apiKey.isNullOrBlank()) {
                throw MovieEndingUnavailableException(
                    "Nessuna voce Wikipedia trovata e chiave OpenRouter non configurata. " +
                        "Aggiungi la chiave in Impostazioni → Finale dei film."
                )
            }
            val memory = askModelFromMemory(request, apiKey)
            MovieEnding(
                explanation = sanitizeForDisplay(memory.explanation),
                source = EndingSource.AI,
                wikipediaUrl = null,
                wikipediaTitle = null,
                confidence = memory.confidence,
                warning = "Nessuna fonte Wikipedia trovata: spiegazione basata sulla conoscenza del modello, " +
                    "può contenere imprecisioni."
            )
        }

        diskCache.put(cacheKey, result, MovieEnding::class.java, CACHE_TTL)
        result
    }

    // ------------------------------------------------------------------
    // Wikipedia
    // ------------------------------------------------------------------

    private data class WikiSource(val title: String, val plot: String, val url: String)

    private suspend fun fetchWikipediaPlot(request: MovieEndingRequest): WikiSource? {
        return runCatching { searchOnWiki(WikipediaService.API_IT, request, "it") }
            .getOrNull()
            ?: runCatching { searchOnWiki(WikipediaService.API_EN, request, "en") }.getOrNull()
    }

    private suspend fun searchOnWiki(
        apiUrl: String,
        request: MovieEndingRequest,
        lang: String
    ): WikiSource? {
        val query = buildString {
            append('"').append(request.title).append('"')
            if (request.year.isNotBlank()) append(' ').append(request.year)
            append(" film")
        }

        val searchResponse = wikipediaService.search(
            url = apiUrl,
            action = "query",
            format = "json",
            list = "search",
            srNamespace = 0,
            srLimit = 5,
            srSearch = query
        )
        val results = searchResponse.query?.search.orEmpty()
        val best = pickBest(results, request) ?: return null

        val extractResponse = wikipediaService.extract(
            url = apiUrl,
            action = "query",
            format = "json",
            prop = "extracts",
            explainText = 1,
            exSectionFormat = "wiki",
            redirects = 1,
            titles = best.title ?: return null
        )
        val page = extractResponse.query?.pages?.values
            ?.firstOrNull { !it.extract.isNullOrBlank() }
            ?: return null

        val fullText = page.extract ?: return null
        val plot = (extractPlotSection(fullText) ?: fullText).take(MAX_SECTION_CHARS)
        if (plot.isBlank()) return null

        val pageTitle = page.title ?: best.title ?: return null
        val encoded = URLEncoder.encode(pageTitle, "UTF-8").replace("+", "%20")
        val pageUrl = "https://$lang.wikipedia.org/wiki/$encoded"

        return WikiSource(
            title = pageTitle,
            plot = plot,
            url = pageUrl
        )
    }

    /** Sceglie il risultato di ricerca più plausibile per il film richiesto. */
    private fun pickBest(
        results: List<WikipediaSearchResult>,
        request: MovieEndingRequest
    ): WikipediaSearchResult? {
        if (results.isEmpty()) return null
        val wanted = normalize(request.title)
        val year = request.year.trim()

        val scored = results.map { result ->
            val title = normalize(result.title.orEmpty())
            val snippet = (result.snippet.orEmpty()).replace(HTML_TAG_REGEX, " ")
            var score = 0
            if (wanted.isNotBlank() && (title.contains(wanted) || wanted.contains(title))) score += 3
            if (year.isNotEmpty() && (title.contains(year) || snippet.contains(year))) score += 2
            if (title.contains("film")) score += 1
            result to score
        }

        val best = scored.maxByOrNull { it.second } ?: return null
        // Rifiuta i match troppo deboli: meglio nessuna fonte che la fonte sbagliata.
        return if (best.second >= 3) best.first else null
    }

    /**
     * Estrae la sezione "Trama"/"Plot" dal testo in chiaro della voce.
     * Con `exsectionformat=wiki` le intestazioni sono del tipo `== Trama ==`.
     */
    private fun extractPlotSection(fullText: String): String? {
        val lines = fullText.lines()
        var start = -1
        for (i in lines.indices) {
            val match = HEADING_REGEX.find(lines[i].trim()) ?: continue
            val heading = match.groupValues[1].lowercase()
            if (PLOT_HEADINGS.any { heading == it || heading.startsWith(it) }) {
                start = i + 1
                break
            }
        }
        if (start == -1) return null

        val builder = StringBuilder()
        for (i in start until lines.size) {
            if (HEADING_REGEX.matches(lines[i].trim())) break
            if (builder.length + lines[i].length > MAX_SECTION_CHARS) break
            if (lines[i].isNotBlank() || builder.isNotEmpty()) {
                builder.append(lines[i]).append('\n')
            }
        }
        return builder.toString().trim().ifBlank { null }
    }

    /**
     * Costruisce il testo passato all'LLM: se la trama è lunga si conservano
     * l'inizio (contesto) e soprattutto la parte finale (dove sta il finale).
     */
    private fun buildGroundedExcerpt(plot: String): String {
        if (plot.length <= MAX_PLOT_CHARS) return plot
        val head = plot.take(PLOT_HEAD_CHARS)
        val tail = plot.takeLast(MAX_PLOT_CHARS - PLOT_HEAD_CHARS)
        return "$head\n\n[…] parte centrale della trama omessa per brevità […]\n\n$tail"
    }

    /** Per la visualizzazione grezza di Wikipedia mostra la parte finale (il finale). */
    private fun truncateForDisplay(text: String): String =
        if (text.length <= MAX_DISPLAY_CHARS) text
        else "… " + text.takeLast(MAX_DISPLAY_CHARS)

    // ------------------------------------------------------------------
    // LLM
    // ------------------------------------------------------------------

    private data class MemoryAnswer(val explanation: String, val confidence: String)

    private suspend fun summarizeFromWikipedia(
        request: MovieEndingRequest,
        plot: String,
        apiKey: String
    ): String? {
        val userPrompt = buildString {
            append("FILM: ").append(request.title)
            if (request.year.isNotBlank()) append(" (").append(request.year).append(')')
            append('\n')
            request.director?.takeIf { it.isNotBlank() }?.let { append("REGISTA: ").append(it).append('\n') }
            request.cast?.takeIf { it.isNotBlank() }?.let { append("CAST: ").append(it).append('\n') }
            append("\nTESTO DI WIKIPEDIA (unica fonte consentita):\n\"\"\"\n")
            append(buildGroundedExcerpt(plot))
            append("\n\"\"\"")
        }

        val content = callModel(SYSTEM_GROUNDED, userPrompt, apiKey)
        val payload = parsePayload(content)
        val text = payload?.testo?.takeIf { it.isNotBlank() }
        return if (payload?.trovato == false) null else text
    }

    private suspend fun askModelFromMemory(
        request: MovieEndingRequest,
        apiKey: String
    ): MemoryAnswer {
        val userPrompt = buildString {
            append("FILM: ").append(request.title)
            if (request.year.isNotBlank()) append(" (").append(request.year).append(')')
            append('\n')
            request.director?.takeIf { it.isNotBlank() }?.let { append("REGISTA: ").append(it).append('\n') }
            request.cast?.takeIf { it.isNotBlank() }?.let { append("CAST: ").append(it).append('\n') }
            request.genres?.takeIf { it.isNotBlank() }?.let { append("GENERI: ").append(it).append('\n') }
            request.overview?.takeIf { it.isNotBlank() }?.let {
                append("\nTRAMA NOTA (può essere incompleta):\n").append(it)
            }
        }

        val content = callModel(SYSTEM_MEMORY, userPrompt, apiKey)
        val payload = parsePayload(content)

        if (payload == null) {
            // JSON non valido: usa il testo grezzo solo se non è vuoto, con bassa confidenza.
            val raw = cleanUp(content)
            if (raw.isBlank() || raw.contains("NON_NOTO", ignoreCase = true)) {
                throw MovieEndingUnavailableException(UNKNOWN_ANSWER)
            }
            return MemoryAnswer(raw, "bassa")
        }

        if (payload.trovato != true || payload.testo.isNullOrBlank()) {
            throw MovieEndingUnavailableException(UNKNOWN_ANSWER)
        }
        return MemoryAnswer(payload.testo, payload.confidenza ?: "media")
    }

    private suspend fun callModel(systemPrompt: String, userPrompt: String, apiKey: String): String {
        val models = buildList {
            add(OpenRouterService.DEFAULT_MODEL)
            addAll(OpenRouterService.FALLBACK_MODELS)
        }
        var lastMessage = "Servizio AI non disponibile. Riprova più tardi."

        models.forEach { model ->
            try {
                return callModelOnce(model, systemPrompt, userPrompt, apiKey)
            } catch (e: retrofit2.HttpException) {
                // Chiave non valida: inutile provare altri modelli con la stessa chiave.
                if (e.code() == 401 || e.code() == 403) {
                    throw MovieEndingUnavailableException(
                        "Chiave OpenRouter non valida o non autorizzata. Controlla la chiave nelle impostazioni."
                    )
                }
                lastMessage = when (e.code()) {
                    404 -> "Modello OpenRouter non disponibile. Riprova più tardi."
                    429 -> "Troppe richieste al modello gratuito (pool condiviso). Riprova tra qualche minuto."
                    else -> "Servizio AI non disponibile (HTTP ${e.code()}). Riprova più tardi."
                }
                Log.w(TAG, "Modello $model fallito (HTTP ${e.code()}), provo il successivo")
            } catch (e: MovieEndingUnavailableException) {
                lastMessage = e.message ?: lastMessage
                Log.w(TAG, "Modello $model fallito (${e.message}), provo il successivo")
            }
        }
        throw MovieEndingUnavailableException(lastMessage)
    }

    private suspend fun callModelOnce(
        model: String,
        systemPrompt: String,
        userPrompt: String,
        apiKey: String
    ): String {
        val response = openRouterService.chatCompletions(
            authorization = "Bearer ${apiKey.trim()}",
            referer = "https://wavestream.app",
            title = "WaveStream",
            body = OpenRouterRequest(
                model = model,
                messages = listOf(
                    OpenRouterMessage(role = "system", content = systemPrompt),
                    OpenRouterMessage(role = "user", content = userPrompt)
                ),
                temperature = 0.2,
                topP = 0.9,
                maxTokens = MAX_TOKENS,
                responseFormat = OpenRouterResponseFormat(type = "json_object"),
                // Disattiva il "thinking": i modelli reasoning altrimenti consumano
                // i token nel campo `reasoning` e lasciano `content` null.
                reasoning = OpenRouterReasoning(enabled = false)
            )
        )

        response.error?.message?.let { message ->
            throw MovieEndingUnavailableException("Errore OpenRouter: $message")
        }

        val content = response.choices?.firstOrNull()?.message?.content
        if (content.isNullOrBlank()) {
            throw MovieEndingUnavailableException(
                "Il modello non ha restituito alcuna risposta."
            )
        }
        return content
    }

    /** Ripulisce il testo del modello: rimuove blocchi di ragionamento e markdown. */
    private fun cleanUp(raw: String): String {
        return THINK_REGEX.replace(raw, "")
            .replace("```json", "")
            .replace("```", "")
            .trim()
    }

    /**
     * Normalizza la spiegazione per una visualizzazione pulita:
     * converte il markdown in testo semplice e rimuove simboli di formattazione
     * (asterischi, cancelletti, backtick, backslash, elenchi) e spazi anomali.
     */
    private fun sanitizeForDisplay(raw: String): String {
        var text = raw.trim()

        // Fence e backtick
        text = text.replace("```", "").replace("`", "")

        // Grassetto/corsivo markdown
        text = text.replace(Regex("\\*\\*(.+?)\\*\\*"), "$1")
        text = text.replace(Regex("__(.+?)__"), "$1")
        text = text.replace(Regex("(?<![\\w*])\\*(?![\\s*])(.+?)(?<![\\s*])\\*(?![\\w*])"), "$1")
        text = text.replace(Regex("(?<![\\w_])_(?![\\s_])(.+?)(?<![\\s_])_(?![\\w_])"), "$1")

        // Titoli e citazioni markdown a inizio riga
        text = text.replace(Regex("(?m)^\\s{0,3}#{1,6}\\s*"), "")
        text = text.replace(Regex("(?m)^\\s{0,3}>\\s?"), "")

        // Marker di elenco a inizio riga ("- ", "* ", "+ ", "1. ")
        text = text.replace(Regex("(?m)^\\s*(?:[-*+]|\\d+\\.)\\s+"), "")

        // Escape letterali e backslash residui
        text = text.replace("\\n", "\n")
            .replace("\\r", "")
            .replace("\\t", " ")
            .replace("\\\"", "\"")
            .replace("\\'", "'")
            .replace("\\", "")

        // Slash/barre usate come separatori o formattazione
        text = text.replace("/", " ")

        // Spazi e righe multiple anomali
        text = text.replace(Regex("[ \\t]{2,}"), " ")
        text = text.replace(Regex(" *\\n *"), "\n")
        text = text.replace(Regex("\n{3,}"), "\n\n")

        // Virgolette/asterischi/parentesi spuri ai bordi
        return text.trim().trim('"', '\'').trim().trim('*').trim()
    }

    /** Estrae e parsa il primo oggetto JSON presente nella risposta. */
    private fun parsePayload(raw: String): LlmPayload? {
        val cleaned = cleanUp(raw)
        val json = extractJsonObject(cleaned) ?: return null
        return runCatching { moshi.adapter(LlmPayload::class.java).fromJson(json) }.getOrNull()
    }

    private fun extractJsonObject(text: String): String? {
        val start = text.indexOf('{')
        if (start == -1) return null
        var depth = 0
        var inString = false
        var escaped = false
        for (i in start until text.length) {
            val c = text[i]
            when {
                escaped -> escaped = false
                c == '\\' && inString -> escaped = true
                c == '"' -> inString = !inString
                !inString && c == '{' -> depth++
                !inString && c == '}' -> {
                    depth--
                    if (depth == 0) return text.substring(start, i + 1)
                }
            }
        }
        return null
    }

    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    private fun cacheKeyOf(request: MovieEndingRequest): String {
        val base = (normalize(request.title) + "_" + request.year.trim()).ifBlank { request.title }
        return base.take(120).ifBlank { "unknown" }
    }

    private fun normalize(value: String): String {
        val decomposed = Normalizer.normalize(value, Normalizer.Form.NFD)
        return decomposed
            .replace(Regex("\\p{Mn}+"), "")
            .lowercase()
            .replace(Regex("[^a-z0-9 ]"), " ")
            .replace(Regex("\\s+"), " ")
            .trim()
    }
}

/** Payload JSON restituito dal modello (parsing tollerante). */
@JsonClass(generateAdapter = true)
internal data class LlmPayload(
    val trovato: Boolean? = null,
    val testo: String? = null,
    val confidenza: String? = null,
    val motivo: String? = null
)
