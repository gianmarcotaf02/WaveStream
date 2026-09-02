package it.wavestream.app.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Cinemeta Service (Stremio's official catalog addon)
 * Provides IMDb ratings and metadata — FREE, no API key, no hard rate limit.
 * Data is updated frequently (fresh ratings for recent movies / ongoing series),
 * which makes it the ideal fallback when OMDb returns nothing or stale data.
 *
 * Endpoints:
 *   /meta/{type}/{imdbId}.json              -> metadata + imdbRating by IMDb ID
 *   /catalog/{type}/top/search/{query}.json -> search by title (returns metas with imdbRating)
 *
 * Notes:
 *  - "type" is "movie" or "series"
 *  - Some paths respond with HTTP 307 redirect to cinemeta-live.strem.io:
 *    OkHttp follows redirects automatically, so no special handling is needed.
 *  - Missing titles return HTTP 200 with an empty body or {"meta":{}} — treat
 *    those as "not found" (null), not as errors.
 */
interface CinemetaService {

    companion object {
        const val BASE_URL = "https://v3-cinemeta.strem.io/"
    }

    @GET("meta/{type}/{imdbId}.json")
    suspend fun getMeta(
        @Path("type") type: String,      // "movie" or "series"
        @Path("imdbId") imdbId: String   // "tt0137523"
    ): Response<CinemetaMetaResponse>

    @GET("catalog/{type}/top/search/{query}.json")
    suspend fun search(
        @Path("type") type: String,      // "movie" or "series"
        @Path("query") query: String     // URL-encoded title
    ): Response<CinemetaSearchResponse>
}

// ========== Response Models ==========

data class CinemetaMetaResponse(
    val meta: CinemetaMeta?
)

data class CinemetaSearchResponse(
    val metas: List<CinemetaMeta>?
)

data class CinemetaMeta(
    val imdb_id: String?,
    val name: String?,
    val imdbRating: String?,     // "7.4" (string, may be missing)
    val releaseInfo: String?,    // "2024" or "2023–"
    val year: String?,
    val type: String?,           // "movie" or "series"
    val runtime: String?,        // "139 min"
    val genre: List<String>?,
    val description: String?,
    val awards: String?,
    val cast: List<String>?,
    val director: List<String>?,
    val country: String?
) {
    val imdbRatingValue: Float?
        get() = imdbRating?.toFloatOrNull()
}
