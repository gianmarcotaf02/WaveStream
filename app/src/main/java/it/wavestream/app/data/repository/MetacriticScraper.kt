package it.wavestream.app.data.repository

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.util.concurrent.TimeUnit

/**
 * Service for scraping Metacritic scores as a fallback when OMDB
 * returns N/A for the Metascore field.
 *
 * Primary source: Metacritic's public backend finder API, which returns the
 * critic score (Metascore, scale /100 — same as OMDB's "Metascore").
 * Secondary source: the Metacritic detail page, whose embedded JSON-LD exposes
 * the user score (scale /10).
 *
 * Note: For personal use only. Scraping may violate Metacritic's ToS.
 */
class MetacriticScraper {

    companion object {
        private const val TAG = "MetacriticScraper"
        private const val FINDER_API = "https://backend.metacritic.com/v1/xapi/finder"
        private const val WEB_BASE = "https://www.metacritic.com"
        private const val CACHE_DURATION_MS = 7 * 24 * 60 * 60 * 1000L // 7 days
    }

    private val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .build()

    /**
     * Scores extracted from Metacritic.
     * criticScore is out of 100 (Metascore), userScore out of 10.
     */
    data class McScores(
        val criticScore: Int?,
        val userScore: Int?
    )

    // In-memory cache
    private val scoresCache = mutableMapOf<String, CachedScore>()

    data class CachedScore(
        val scores: McScores?,
        val timestamp: Long
    )

    /**
     * Get Metacritic scores for a movie.
     */
    suspend fun getScoresForMovie(
        title: String,
        year: Int? = null
    ): McScores? = getScores(title, year, isMovie = true, cacheTag = "movie")

    /**
     * Get Metacritic scores for a TV series.
     */
    suspend fun getScoresForSeries(
        title: String,
        year: Int? = null
    ): McScores? = getScores(title, year, isMovie = false, cacheTag = "tv")

    private suspend fun getScores(
        title: String,
        year: Int?,
        isMovie: Boolean,
        cacheTag: String
    ): McScores? = withContext(Dispatchers.IO) {
        val cacheKey = "$title:$year:$cacheTag"

        // Check cache
        scoresCache[cacheKey]?.let { cached ->
            if (System.currentTimeMillis() - cached.timestamp < CACHE_DURATION_MS) {
                Log.d(TAG, "Cache hit for $cacheTag: $title -> Critic: ${cached.scores?.criticScore}")
                return@withContext cached.scores
            }
        }

        val scores = try {
            // Pass 1: backend finder API (fast, structured, gives critic score)
            queryFinder(title, year, isMovie)
                // Pass 2: fallback to detail-page scraping for the user score
                ?.let { found -> enrichWithUserScore(found, isMovie) }
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching Metacritic for $cacheTag '$title'", e)
            null
        }

        scoresCache[cacheKey] = CachedScore(scores, System.currentTimeMillis())
        Log.d(TAG, "Metacritic scores for '$title': Critic: ${scores?.criticScore}, User: ${scores?.userScore}")
        scores
    }

    /**
     * Internal result carrying the detail-page slug so the user score
     * can be scraped as a fallback.
     */
    private class FinderHit(
        val scores: McScores,
        val slug: String
    )

    /**
     * Queries the Metacritic backend finder API and returns the best match's critic score.
     */
    private fun queryFinder(title: String, year: Int?, isMovie: Boolean): FinderHit? {
        val endpoint = if (isMovie) "$FINDER_API/movies" else "$FINDER_API/tv"
        val url = "$endpoint?title=${slugForQuery(title)}&limit=10&offset=0&searchType=all"

        Log.d(TAG, "Finder query: $url")

        val request = Request.Builder()
            .url(url)
            .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
            .header("Accept", "application/json")
            .build()

        val response = try {
            client.newCall(request).execute()
        } catch (e: Exception) {
            Log.e(TAG, "Network error on finder query: ${e.message}")
            return null
        }

        if (!response.isSuccessful) {
            Log.w(TAG, "Finder HTTP ${response.code} for $url")
            return null
        }

        val body = response.body?.string() ?: return null

        return try {
            val root = JSONObject(body)
            val items = root.optJSONObject("data")?.optJSONArray("items") ?: return null

            // Collect candidates that have a critic score, prefer exact/near year match.
            var best: JSONObject? = null
            var bestYearDiff = Int.MAX_VALUE

            for (i in 0 until items.length()) {
                val item = items.optJSONObject(i) ?: continue
                val score = item.optJSONObject("criticScoreSummary")?.optInt("score", -1)
                    ?: continue
                if (score < 0) continue

                val itemYear = parseYear(item.optString("releaseDate"))
                val diff = when {
                    year == null -> 0
                    itemYear == null -> 10 // no year info: deprioritize
                    else -> kotlin.math.abs(itemYear - year)
                }

                if (diff < bestYearDiff) {
                    bestYearDiff = diff
                    best = item
                }
            }

            val chosen = best ?: return null
            val criticScore = chosen.optJSONObject("criticScoreSummary")?.optInt("score", -1)
                ?.takeIf { it >= 0 }

            // User score from the finder item (scale /10) if present, else resolved later.
            val userScore = chosen.optDouble("userScore", Double.NaN)
                .takeIf { !it.isNaN() }?.let { (it * 10).toInt() }

            Log.d(TAG, "Finder match: ${chosen.optString("title")} (${chosen.optString("releaseDate")}) -> Critic: $criticScore")
            FinderHit(
                scores = McScores(criticScore = criticScore, userScore = userScore),
                slug = chosen.optString("slug")
            )
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing finder response", e)
            null
        }
    }

    /**
     * If the finder result lacks a user score, try scraping the detail page
     * for the JSON-LD aggregateRating (user score, /10) and merge it in.
     */
    private fun enrichWithUserScore(hit: FinderHit, isMovie: Boolean): McScores {
        if (hit.scores.userScore != null || hit.slug.isBlank()) return hit.scores

        val section = if (isMovie) "movie" else "tv"
        val url = "$WEB_BASE/$section/${hit.slug}/"
        val userScore = scrapeUserScore(url)

        return McScores(
            criticScore = hit.scores.criticScore,
            userScore = userScore ?: hit.scores.userScore
        )
    }

    /**
     * Extracts the user score from a Metacritic detail page's embedded JSON-LD.
     * Metacritic exposes the user score as aggregateRating.ratingValue (scale /10).
     */
    private fun scrapeUserScore(url: String): Int? {
        Log.d(TAG, "Scraping user score: $url")

        val request = Request.Builder()
            .url(url)
            .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
            .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
            .build()

        val response = try {
            client.newCall(request).execute()
        } catch (e: Exception) {
            Log.e(TAG, "Network error scraping user score: ${e.message}")
            return null
        }

        if (!response.isSuccessful) {
            Log.w(TAG, "Detail HTTP ${response.code} for $url")
            return null
        }

        val html = response.body?.string() ?: return null

        // JSON-LD aggregateRating: "ratingValue":"7.9" (user score, /10)
        val jsonLd = Regex(""""aggregateRating"\s*:\s*\{[^}]*?"ratingValue"\s*:\s*"?([0-9.]+)"""")
            .find(html)
        jsonLd?.groupValues?.get(1)?.toDoubleOrNull()?.let {
            val userScore = (it * 10).toInt()
            if (userScore in 0..100) {
                Log.d(TAG, "✓ Found user score via JSON-LD: $userScore (/100)")
                return userScore
            }
        }

        // Fallback: inline c-siteReviews aggregateRating pattern
        val altPattern = Regex(""""userScore"\s*:\s*"?([0-9.]+)"""")
        altPattern.find(html)?.groupValues?.get(1)?.toDoubleOrNull()?.let {
            val userScore = (it * 10).toInt()
            if (userScore in 0..100) {
                Log.d(TAG, "✓ Found user score via alt pattern: $userScore (/100)")
                return userScore
            }
        }

        Log.d(TAG, "✗ Could not find user score on detail page")
        return null
    }

    /**
     * Parses a release date (e.g. "2008-07-18") into a year Int.
     */
    private fun parseYear(date: String?): Int? {
        if (date.isNullOrBlank()) return null
        val yearPart = date.take(4)
        return yearPart.toIntOrNull()
    }

    /**
     * Normalize a title for the finder query parameter (URL-encoded in Request.Builder).
     */
    private fun slugForQuery(title: String): String = title.trim()

    /**
     * Clear the cache.
     */
    fun clearCache() {
        scoresCache.clear()
    }
}
