package it.wavestream.app.ai

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * API MediaWiki (Wikipedia) usata per recuperare la trama reale di un film.
 *
 * Il testo recuperato (sezione "Trama"/"Plot") viene passato all'LLM come UNICA
 * fonte consentita: in questo modo la spiegazione del finale è ancorata a una
 * fonte verificabile e il rischio di allucinazione crolla.
 *
 * Si usa l'Action API su it.wikipedia.org (fallback en.wikipedia.org). Il baseUrl
 * di Retrofit è solo un segnaposto: ogni chiamata passa l'URL completo via [Url].
 */
interface WikipediaService {

    /** Ricerca full-text limitata alle voci (namespace 0). */
    @GET
    suspend fun search(
        @Url url: String,
        @Query("action") action: String,
        @Query("format") format: String,
        @Query("list") list: String,
        @Query("srnamespace") srNamespace: Int,
        @Query("srlimit") srLimit: Int,
        @Query("srsearch") srSearch: String
    ): WikipediaQueryResponse

    /** Testo in chiaro dell'intera voce, con intestazioni di sezione `== Trama ==`. */
    @GET
    suspend fun extract(
        @Url url: String,
        @Query("action") action: String,
        @Query("format") format: String,
        @Query("prop") prop: String,
        @Query("explaintext") explainText: Int,
        @Query("exsectionformat") exSectionFormat: String,
        @Query("redirects") redirects: Int,
        @Query("titles") titles: String
    ): WikipediaQueryResponse

    companion object {
        const val BASE_URL = "https://it.wikipedia.org/"
        const val API_IT = "https://it.wikipedia.org/w/api.php"
        const val API_EN = "https://en.wikipedia.org/w/api.php"
    }
}

// ---------- DTO ----------

@JsonClass(generateAdapter = true)
data class WikipediaQueryResponse(
    val query: WikipediaQuery? = null,
    val error: WikipediaError? = null
)

@JsonClass(generateAdapter = true)
data class WikipediaQuery(
    /** Mappa pageid -> pagina (gli id sono chiavi JSON dinamiche, "-1" se assente). */
    val pages: Map<String, WikipediaPage>? = null,
    val search: List<WikipediaSearchResult>? = null
)

@JsonClass(generateAdapter = true)
data class WikipediaPage(
    @Json(name = "pageid") val pageId: Long? = null,
    val title: String? = null,
    val extract: String? = null,
    val missing: String? = null
)

@JsonClass(generateAdapter = true)
data class WikipediaSearchResult(
    @Json(name = "pageid") val pageId: Long? = null,
    val title: String? = null,
    val snippet: String? = null
)

@JsonClass(generateAdapter = true)
data class WikipediaError(
    val code: String? = null,
    val info: String? = null
)
