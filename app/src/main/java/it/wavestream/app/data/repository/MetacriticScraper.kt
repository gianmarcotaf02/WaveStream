package it.wavestream.app.data.repository

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit

/**
 * HTML scraper for Metacritic scores, used as a fallback when OMDB returns
 * N/A for the Metascore field.
 *
 * This is pure HTML scraping (Metacritic has no public API):
 *  - the detail page URL is built directly from the title slug (like the RT
 *    scraper) to keep it to a single request, avoiding the search page which
 *    is the most Cloudflare-protected.
 *  - the Metascore (critic, /100) and the user score (via JSON-LD, /10) are
 *    extracted from the same page.
 *
 * CLOUDFLARE: Metacritic is behind Cloudflare and may answer with a JS
 * challenge that a plain OkHttp client cannot solve. We do NOT try to bypass
 * it: we detect the block and gracefully return null (plus a clear log).
 *
 * Note: For personal use only. Web scraping may violate Metacritic's ToS.
 */
class MetacriticScraper {

    companion object {
        private const val TAG = "MetacriticScraper"
        private const val WEB_BASE = "https://www.metacritic.com"
        private const val CACHE_DURATION_MS = 7 * 24 * 60 * 60 * 1000L // 7 days
        private const val USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
    }

    private val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .followRedirects(true)
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
    ): McScores? = getScores(title, year, isMovie = true)

    /**
     * Get Metacritic scores for a TV series.
     */
    suspend fun getScoresForSeries(
        title: String,
        year: Int? = null
    ): McScores? = getScores(title, year, isMovie = false)

    private suspend fun getScores(
        title: String,
        year: Int?,
        isMovie: Boolean
    ): McScores? = withContext(Dispatchers.IO) {
        val cacheTag = if (isMovie) "movie" else "tv"
        val cacheKey = "$title:$year:$cacheTag"

        // Check cache
        scoresCache[cacheKey]?.let { cached ->
            if (System.currentTimeMillis() - cached.timestamp < CACHE_DURATION_MS) {
                Log.d(TAG, "Cache hit for $cacheTag: $title -> Critic: ${cached.scores?.criticScore}")
                return@withContext cached.scores
            }
        }

        val scores = try {
            fetchFromDetailPage(title, year, isMovie)
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching Metacritic for $cacheTag '$title'", e)
            null
        }

        scoresCache[cacheKey] = CachedScore(scores, System.currentTimeMillis())
        Log.d(TAG, "Metacritic scores for '$title': Critic: ${scores?.criticScore}, User: ${scores?.userScore}")
        scores
    }

    /**
     * Fetches the Metacritic detail page for the title and extracts both scores.
     * Builds candidate slugs and stops at the first page that yields a critic score.
     */
    private fun fetchFromDetailPage(title: String, year: Int?, isMovie: Boolean): McScores? {
        val section = if (isMovie) "movie" else "tv"
        val baseSlug = createSlug(title)

        // Metacritic slugs keep a leading "the" and recent titles append the year.
        val candidates = buildList {
            add("$WEB_BASE/$section/$baseSlug/")
            if (year != null) {
                add("$WEB_BASE/$section/${baseSlug}-$year/")
                add("$WEB_BASE/$section/${baseSlug}_$year/")
            }
        }.distinct()

        var scores: McScores? = null
        for (url in candidates) {
            Log.d(TAG, "Fetching: $url")
            scores = fetchPage(url)
            if (scores != null) break
        }
        return scores
    }

    /**
     * Fetches a single page and parses scores from its HTML.
     * Returns null on Cloudflare block, HTTP error, or no parseable score.
     */
    private fun fetchPage(url: String): McScores? {
        val request = Request.Builder()
            .url(url)
            .header("User-Agent", USER_AGENT)
            .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
            .header("Accept-Language", "en-US,en;q=0.9")
            .header("Referer", WEB_BASE)
            .header("Upgrade-Insecure-Requests", "1")
            .build()

        val response = try {
            client.newCall(request).execute()
        } catch (e: Exception) {
            Log.e(TAG, "Network error fetching $url: ${e.message}")
            return null
        }

        if (response.code == 403 || response.code == 429) {
            Log.w(TAG, "HTTP ${response.code} for $url — likely Cloudflare blocking plain scraping")
            return null
        }

        if (!response.isSuccessful) {
            Log.w(TAG, "HTTP ${response.code} for $url")
            return null
        }

        val html = response.body?.string() ?: return null

        // Detect a Cloudflare JS challenge page even when served as 200.
        if (isCloudflareChallenge(html)) {
            Log.w(TAG, "Cloudflare challenge detected on $url — cannot solve without a browser")
            return null
        }

        val criticScore = extractCriticScore(html)
        val userScore = extractUserScore(html)

        if (criticScore == null && userScore == null) {
            Log.w(TAG, "✗ No scores found in HTML for $url")
            return null
        }

        return McScores(criticScore = criticScore, userScore = userScore)
    }

    /**
     * Extracts the Metascore (critic score, /100) from the detail page HTML.
     */
    private fun extractCriticScore(html: String): Int? {
        // Pattern 1: c-siteReviewScore value element (current markup)
        val scoreValue = Regex("""class="[^"]*c-siteReviewScore__value[^"]*"[^>]*>\s*(\d{1,3})\s*<""")
            .find(html)
        scoreValue?.groupValues?.get(1)?.toIntOrNull()?.let {
            if (it in 0..100) {
                Log.d(TAG, "✓ Found critic score via c-siteReviewScore__value: $it")
                return it
            }
        }

        // Pattern 2: embedded JSON "metascore":74
        Regex(""""metascore"\s*:\s*"?(\d{1,3})""").find(html)
            ?.groupValues?.get(1)?.toIntOrNull()?.let {
                if (it in 0..100) {
                    Log.d(TAG, "✓ Found critic score via metascore JSON: $it")
                    return it
                }
            }

        // Pattern 3: generic score panel wrapper
        Regex("""class="[^"]*c-siteReviewScore[^"]*"[^>]*>\s*(\d{1,3})\s*<""")
            .find(html)?.groupValues?.get(1)?.toIntOrNull()?.let {
                if (it in 0..100) {
                    Log.d(TAG, "✓ Found critic score via c-siteReviewScore: $it")
                    return it
                }
            }

        Log.d(TAG, "✗ Could not find critic score")
        return null
    }

    /**
     * Extracts the user score (converted to /100) from JSON-LD aggregateRating.
     */
    private fun extractUserScore(html: String): Int? {
        // JSON-LD aggregateRating.ratingValue is the user score on a /10 scale.
        Regex(""""aggregateRating"\s*:\s*\{[^}]*?"ratingValue"\s*:\s*"?([0-9.]+)""")
            .find(html)?.groupValues?.get(1)?.toDoubleOrNull()?.let {
                val userScore = (it * 10).toInt()
                if (userScore in 0..100) {
                    Log.d(TAG, "✓ Found user score via JSON-LD: $userScore (/100)")
                    return userScore
                }
            }

        // Fallback: inline "userScore" JSON field (also /10 scale)
        Regex(""""userScore"\s*:\s*"?([0-9.]+)""").find(html)
            ?.groupValues?.get(1)?.toDoubleOrNull()?.let {
                val userScore = (it * 10).toInt()
                if (userScore in 0..100) {
                    Log.d(TAG, "✓ Found user score via userScore JSON: $userScore (/100)")
                    return userScore
                }
            }

        Log.d(TAG, "✗ Could not find user score")
        return null
    }

    /**
     * Heuristic to detect a Cloudflare challenge/interstitial page.
     */
    private fun isCloudflareChallenge(html: String): Boolean {
        val markers = listOf(
            "cf-mitigated", "challenge-platform", "__cf_chl", "cf_chl_opt",
            "Just a moment", "Attention Required", "cf-error-details",
            "Checking your browser before accessing"
        )
        return markers.any { html.contains(it, ignoreCase = true) }
    }

    /**
     * Create a Metacritic slug from the title.
     * Metacritic keeps leading articles and lowercases + hyphenates.
     * Example: "The Dark Knight" -> "the-dark-knight"
     */
    private fun createSlug(title: String): String {
        return title
            .lowercase()
            .replace(Regex("\\s*\\(\\d{4}\\)"), "")
            .let { java.text.Normalizer.normalize(it, java.text.Normalizer.Form.NFD) }
            .replace(Regex("[\\u0300-\\u036f]"), "")
            .replace(Regex("[^a-z0-9\\s]"), " ")
            .trim()
            .replace(Regex("\\s+"), "-")
            .trim('-')
    }

    /**
     * Clear the cache.
     */
    fun clearCache() {
        scoresCache.clear()
    }
}
