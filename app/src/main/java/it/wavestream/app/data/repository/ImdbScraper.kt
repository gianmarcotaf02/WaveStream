package it.wavestream.app.data.repository

import android.util.Log
import com.google.gson.JsonParser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.concurrent.TimeUnit

/**
 * Recupera il voto IMDb (e il numero di voti) direttamente dalla GraphQL di IMDb,
 * indicizzata per ID (tt...).
 *
 * Perché serve: OMDb e Cinemeta sono spesso **disallineati** sui titoli recenti
 * (OMDb restituisce `imdbRating: "N/A"`, Cinemeta `imdbRating: ""`), quindi il voto
 * risultava mancante pur essendo presente sul sito. La GraphQL del sito è invece
 * aggiornata in tempo reale.
 *
 * Endpoint pubblico usato dalla stessa web app di IMDb. Non richiede API key.
 * Cache in memoria 24h. Uso personale/non commerciale.
 */
class ImdbScraper {

    companion object {
        private const val TAG = "ImdbScraper"
        private const val ENDPOINT = "https://api.graphql.imdb.com/"
        private const val CACHE_DURATION_MS = 24 * 60 * 60 * 1000L
        private const val UA =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
    }

    data class ImdbScores(
        val rating: Float?,
        val votes: Long?
    )

    private data class Cached(
        val scores: ImdbScores?,
        val timestamp: Long
    )

    private val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .build()

    private val cache = mutableMapOf<String, Cached>()

    /**
     * @param imdbId ID IMDb (formato `tt1234567`).
     * @return voto (0..10) e voti, oppure null se non disponibile.
     */
    suspend fun getRating(imdbId: String): ImdbScores? = withContext(Dispatchers.IO) {
        val id = imdbId.trim()
        if (!id.startsWith("tt")) return@withContext null

        cache[id]?.let { cached ->
            if (System.currentTimeMillis() - cached.timestamp < CACHE_DURATION_MS) {
                return@withContext cached.scores
            }
        }

        val query =
            """{"query":"query { title(id: \"$id\") { ratingsSummary { aggregateRating voteCount } } }"}"""

        val request = Request.Builder()
            .url(ENDPOINT)
            .post(query.toRequestBody("application/json".toMediaType()))
            .header("Content-Type", "application/json")
            .header("x-imdb-client-name", "imdb-web-next")
            .header("x-imdb-user-country", "US")
            .header("x-imdb-user-language", "en-US")
            .header("User-Agent", UA)
            .build()

        val scores = try {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    Log.w(TAG, "HTTP ${response.code} for $id")
                    null
                } else {
                    parse(response.body?.string())
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching IMDb rating for $id", e)
            null
        }

        cache[id] = Cached(scores, System.currentTimeMillis())
        scores
    }

    private fun parse(json: String?): ImdbScores? {
        if (json.isNullOrBlank()) return null
        return try {
            val root = JsonParser.parseString(json).asJsonObject
            val summary = root
                .getAsJsonObject("data")
                ?.getAsJsonObject("title")
                ?.getAsJsonObject("ratingsSummary")
                ?: return null

            val ratingEl = summary.get("aggregateRating")
                ?.takeIf { !it.isJsonNull }
            val votesEl = summary.get("voteCount")
                ?.takeIf { !it.isJsonNull }

            val rating = ratingEl?.asFloat
            val votes = votesEl?.asLong
            if (rating == null || rating <= 0f) null else ImdbScores(rating, votes)
        } catch (e: Exception) {
            Log.e(TAG, "Parse error: ${e.message}")
            null
        }
    }

    fun clearCache() {
        cache.clear()
    }
}
