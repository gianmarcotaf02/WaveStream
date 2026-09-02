package it.wavestream.app.ai

import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.entity.ContentType
import javax.inject.Inject
import javax.inject.Singleton

/**
 * "Tools" (function calling) esposti al modello Gemini.
 * Il modello decide quale chiamare in base alla richiesta vocale dell'utente;
 * l'esecuzione interroga il database locale (film, serie, canali) e produce
 * sia la risposta testuale sia gli item per il carosello.
 */
@Singleton
class AiTools @Inject constructor(
    private val movieDao: MovieDao,
    private val seriesDao: SeriesDao,
    private val channelDao: ChannelDao
) {

    companion object {
        private const val MAX_RESULTS = 12

        fun declarations(): List<it.wavestream.app.ai.GeminiFunctionDeclaration> = listOf(
            GeminiFunctionDeclaration(
                name = "search_content",
                description = "Cerca film, serie TV o canali live nella libreria dell'utente. " +
                    "Usalo quando l'utente chiede di trovare/guardare un contenuto specifico.",
                parameters = GeminiFunctionParameters(
                    type = "OBJECT",
                    properties = mapOf(
                        "query" to GeminiFunctionProperty(
                            type = "STRING",
                            description = "Titolo o parte del titolo da cercare"
                        ),
                        "content_type" to GeminiFunctionProperty(
                            type = "STRING",
                            description = "Tipo di contenuto da cercare",
                            enum = listOf("ALL", "MOVIES", "SERIES", "CHANNELS")
                        )
                    ),
                    required = listOf("query")
                )
            ),
            GeminiFunctionDeclaration(
                name = "recommend_content",
                description = "Suggerisce contenuti dalla libreria dell'utente, eventualmente filtrati per genere/categoria. " +
                    "Usalo per domande tipo 'cosa posso vedere stasera?', 'consigliami un film comico'.",
                parameters = GeminiFunctionParameters(
                    type = "OBJECT",
                    properties = mapOf(
                        "genre" to GeminiFunctionProperty(
                            type = "STRING",
                            description = "Genere o categoria desiderata (opzionale). Es: azione, comico, thriller"
                        ),
                        "content_type" to GeminiFunctionProperty(
                            type = "STRING",
                            description = "Tipo di contenuto",
                            enum = listOf("ALL", "MOVIES", "SERIES")
                        )
                    )
                )
            ),
            GeminiFunctionDeclaration(
                name = "watch_live_channel",
                description = "Trova un canale TV live per nome (es. 'Rai 1', 'Sky Sport'). " +
                    "Usalo quando l'utente vuole guardare una diretta.",
                parameters = GeminiFunctionParameters(
                    type = "OBJECT",
                    properties = mapOf(
                        "channel_name" to GeminiFunctionProperty(
                            type = "STRING",
                            description = "Nome del canale"
                        )
                    ),
                    required = listOf("channel_name")
                )
            ),
            GeminiFunctionDeclaration(
                name = "list_categories",
                description = "Elenca le categorie disponibili nella libreria (film, serie o canali).",
                parameters = GeminiFunctionParameters(
                    type = "OBJECT",
                    properties = mapOf(
                        "content_type" to GeminiFunctionProperty(
                            type = "STRING",
                            description = "Tipo di contenuto",
                            enum = listOf("MOVIES", "SERIES", "CHANNELS")
                        )
                    ),
                    required = listOf("content_type")
                )
            )
        )
    }

    /**
     * Esegue il tool richiesto dal modello. Pubblico per il fallback DB locale
     * di AiAssistantService (finalizeTurn).
     */
    suspend fun execute(name: String, args: Map<String, Any?>): AiToolResult = try {
        when (name) {
            "search_content" -> searchContent(
                query = args.string("query") ?: "",
                contentType = args.string("content_type") ?: "ALL"
            )
            "recommend_content" -> recommendContent(
                genre = args.string("genre"),
                contentType = args.string("content_type") ?: "ALL"
            )
            "watch_live_channel" -> watchLiveChannel(args.string("channel_name") ?: "")
            "list_categories" -> listCategories(args.string("content_type") ?: "MOVIES")
            else -> AiToolResult(mapOf("error" to "Tool sconosciuto: $name"))
        }
    } catch (e: Exception) {
        AiToolResult(mapOf("error" to "Errore esecuzione: ${e.message}"))
    }

    // ---------- Tool implementations ----------

    suspend fun searchContent(query: String, contentType: String): AiToolResult {
        if (query.isBlank()) return AiToolResult(mapOf("found" to 0, "note" to "Query vuota"))

        val items = mutableListOf<AiResultItem>()

        // 1. ricerca con la frase intera
        items.addAll(doSearch(query, contentType))

        // 2. se la frase intera non trova nulla, prova le singole parole significative:
        //    "metti un film d'azione" → prova "azione", "metti", "film"...
        if (items.isEmpty() && query.contains(" ")) {
            query.split(" ", "'", "’")
                .map { it.trim() }
                .filter { it.length >= 4 }
                .forEach { word ->
                    if (items.size < MAX_RESULTS) {
                        doSearch(word, contentType).forEach { found ->
                            if (items.none { it.id == found.id && it.type == found.type }) {
                                items.add(found)
                            }
                        }
                    }
                }
        }

        val limited = items.take(MAX_RESULTS)
        android.util.Log.d("NovaAI", "search_content('$query', $contentType) → ${limited.size} risultati")

        return if (limited.isEmpty()) {
            AiToolResult(mapOf("found" to 0, "note" to "Nessun risultato per '$query'. Suggerisci all'utente di provare un altro titolo."))
        } else {
            AiToolResult(
                response = mapOf(
                    "found" to limited.size,
                    "titles" to limited.take(6).map { "${it.title} (${typeName(it.type)})" }
                ),
                items = limited
            )
        }
    }

    private suspend fun doSearch(query: String, contentType: String): List<AiResultItem> {
        val items = mutableListOf<AiResultItem>()
        try {
            if (contentType == "ALL" || contentType == "MOVIES") {
                movieDao.searchMovies(query).take(MAX_RESULTS).forEach { m ->
                    items.add(AiResultItem(ContentType.MOVIE, m.id, m.name, m.posterUrl, m.category))
                }
            }
            if (contentType == "ALL" || contentType == "SERIES") {
                seriesDao.searchSeries(query).take(MAX_RESULTS).forEach { s ->
                    items.add(AiResultItem(ContentType.SERIES, s.id, s.name, s.posterUrl, s.category))
                }
            }
            if (contentType == "ALL" || contentType == "CHANNELS") {
                channelDao.searchChannels(query).take(MAX_RESULTS).forEach { c ->
                    items.add(AiResultItem(ContentType.CHANNEL, c.id, c.name, c.logoUrl, c.category, c.streamUrl))
                }
            }
        } catch (e: Exception) {
            android.util.Log.e("NovaAI", "doSearch error: ${e.message}")
        }
        return items
    }

    private suspend fun recommendContent(genre: String?, contentType: String): AiToolResult {
        val items = mutableListOf<AiResultItem>()

        val movies = if (contentType == "ALL" || contentType == "MOVIES") {
            if (genre != null) {
                movieDao.getMoviesByCategoryList(genre).ifEmpty {
                    // fallback: ricerca parziale sulla categoria
                    movieDao.getCategoriesList()
                        .filter { it.contains(genre, ignoreCase = true) }
                        .firstOrNull()
                        ?.let { movieDao.getMoviesByCategoryList(it) }
                        .orEmpty()
                }
            } else movieDao.getAllMoviesList()
        } else emptyList()

        val series = if (contentType == "ALL" || contentType == "SERIES") {
            if (genre != null) {
                seriesDao.getSeriesByCategoryList(genre).ifEmpty {
                    seriesDao.getCategoriesList()
                        .filter { it.contains(genre, ignoreCase = true) }
                        .firstOrNull()
                        ?.let { seriesDao.getSeriesByCategoryList(it) }
                        .orEmpty()
                }
            } else seriesDao.getAllSeriesList()
        } else emptyList()

        // mescola film e serie per varietà
        val pool = mutableListOf<AiResultItem>()
        movies.forEach { pool.add(AiResultItem(ContentType.MOVIE, it.id, it.name, it.posterUrl, it.category)) }
        series.forEach { pool.add(AiResultItem(ContentType.SERIES, it.id, it.name, it.posterUrl, it.category)) }
        pool.shuffle()

        items.addAll(pool.take(MAX_RESULTS))

        return if (items.isEmpty()) {
            AiToolResult(mapOf("found" to 0, "note" to "Nessun contenuto disponibile${
                if (genre != null) " per il genere '$genre'" else ""
            }. Suggerisci di esplorare altre categorie."))
        } else {
            AiToolResult(
                response = mapOf(
                    "found" to items.size,
                    "titles" to items.take(6).map { "${it.title} (${typeName(it.type)})" }
                ),
                items = items
            )
        }
    }

    private suspend fun watchLiveChannel(channelName: String): AiToolResult {
        if (channelName.isBlank()) return AiToolResult(mapOf("found" to 0))

        // prima match esatto/parziale, poi ricerca LIKE
        val all = channelDao.getAllChannelsList()
        val norm = channelName.trim().lowercase()
        val matches = all.filter { it.name.lowercase().contains(norm) }
            .ifEmpty { channelDao.searchChannels(channelName) }

        val items = matches.take(MAX_RESULTS).map {
            AiResultItem(ContentType.CHANNEL, it.id, it.name, it.logoUrl, it.category, it.streamUrl)
        }

        return if (items.isEmpty()) {
            AiToolResult(mapOf("found" to 0, "note" to "Canale '$channelName' non presente nella playlist dell'utente."))
        } else {
            AiToolResult(
                response = mapOf(
                    "found" to items.size,
                    "titles" to items.take(6).map { it.title },
                    "note" to "Dì all'utente di selezionare il canale dal carosello per guardarlo."
                ),
                items = items
            )
        }
    }

    private suspend fun listCategories(contentType: String): AiToolResult {
        val categories = when (contentType) {
            "MOVIES" -> movieDao.getCategoriesList()
            "SERIES" -> seriesDao.getCategoriesList()
            "CHANNELS" -> channelDao.getCategoriesList()
            else -> emptyList()
        }
        return AiToolResult(
            mapOf(
                "categories" to categories.take(30),
                "count" to categories.size
            )
        )
    }

    // ---------- Utils ----------

    private fun Map<String, Any?>.string(key: String): String? {
        val v = this[key] ?: return null
        return when (v) {
            is String -> v
            is Double -> if (v == v.toLong().toDouble()) v.toLong().toString() else v.toString()
            is Boolean -> v.toString()
            else -> v.toString()
        }
    }

    private fun typeName(type: ContentType) = when (type) {
        ContentType.MOVIE -> "film"
        ContentType.SERIES -> "serie"
        ContentType.CHANNEL -> "canale"
        else -> "contenuto"
    }
}
