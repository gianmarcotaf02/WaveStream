package it.wavestream.app.data.api

import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * IntroDB Service — database comunitario e gratuito di marker temporali
 * (sigla / recap / titoli di coda / scena post-credits).
 *
 * Le LETTURE sono anonime e non richiedono API key: la chiave serve solo per
 * `POST /submit` (contributi), che WaveStream non usa. Vedi `api-1.json` per lo spec.
 *
 * Endpoint usati:
 *   /segments?imdb_id=<tt...>&season=<n>&episode=<n>   -> TV (intro/recap/outro/post_credits)
 *   /segments?imdb_id=<tt...>&is_movie=true            -> film (outro/post_credits)
 *
 * I segmenti mancanti tornano `null` con HTTP 200: nessuna eccezione da gestire,
 * il chiamante degrada semplicemente al fallback locale.
 */
interface IntroDbService {

    companion object {
        const val BASE_URL = "https://api.introdb.app/"
    }

    @GET("segments")
    suspend fun getSegments(
        @Query("imdb_id") imdbId: String,
        @Query("season") season: Int? = null,
        @Query("episode") episode: Int? = null,
        @Query("is_movie") isMovie: Boolean? = null
    ): Response<IntroDbSegmentsResponse>
}

// ========== Response Models ==========

@JsonClass(generateAdapter = true)
data class IntroDbSegmentsResponse(
    val imdb_id: String? = null,
    val media_type: String? = null,      // "tv" | "movie"
    val is_movie: Boolean = false,
    val season: Int? = null,
    val episode: Int? = null,
    val intro: IntroDbSegment? = null,
    val recap: IntroDbSegment? = null,
    val outro: IntroDbSegment? = null,   // titoli di coda (TV e film)
    val post_credits: IntroDbSegment? = null
)

@JsonClass(generateAdapter = true)
data class IntroDbSegment(
    val start_ms: Long? = null,
    val end_ms: Long? = null,
    val start_sec: Double? = null,
    val end_sec: Double? = null,
    val confidence: Float? = null,
    val submission_count: Int? = null,
    val updated_at: String? = null
) {
    /** Inizio in ms, con fallback sui secondi se `start_ms` non è presente. */
    val resolvedStartMs: Long?
        get() = start_ms ?: start_sec?.let { (it * 1000.0).toLong() }

    /** Fine in ms, con fallback sui secondi se `end_ms` non è presente. */
    val resolvedEndMs: Long?
        get() = end_ms ?: end_sec?.let { (it * 1000.0).toLong() }
}
