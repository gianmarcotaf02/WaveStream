package it.wavestream.app.data.repository

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.util.concurrent.TimeUnit

/**
 * HTML scraper for the Metacritic score (Metascore, critic), used as a
 * fallback when OMDB returns N/A for its "Metascore" field.
 *
 * Metacritic has no public API. This is pure HTML scraping:
 *  - the detail page URL is built directly from the title slug (like the RT
 *    scraper) to keep it to a single request, avoiding the search page which
 *    is the most Cloudflare-protected.
 *  - the Metascore is read from the single embedded JSON-LD block
 *    (`<script type="application/ld+json">`), whose `aggregateRating` is the
 *    Metascore on a /100 scale — the same scale OMDB uses. Example:
 *    {"name":"Metascore","bestRating":100,"worstRating":0,"ratingValue":88,...}
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

    // In-memory cache
    private val scoresCache = mutableMapOf<String, CachedScore>()

    data class CachedScore(
        val metacriticScore: Int?,
        val timestamp: Long
    )

    /**
     * Get the Metacritic score (Metascore, /100) for a movie.
     */
    suspend fun getScoreForMovie(
        title: String,
        year: Int? = null
    ): Int? = getScore(title, year, isMovie = true)

    /**
     * Get the Metacritic score (Metascore, /100) for a TV series.
     */
    suspend fun getScoreForSeries(
        title: String,
        year: Int? = null
    ): Int? = getScore(title, year, isMovie = false)

    private suspend fun getScore(
        title: String,
        year: Int?,
        isMovie: Boolean
    ): Int? = withContext(Dispatchers.IO) {
        val cacheTag = if (isMovie) "movie" else "tv"
        val cacheKey = "$title:$year:$cacheTag"

        // Check cache
        scoresCache[cacheKey]?.let { cached ->
            if (System.currentTimeMillis() - cached.timestamp < CACHE_DURATION_MS) {
                Log.d(TAG, "Cache hit for $cacheTag: $title -> $cached")
                return@withContext cached.metacriticScore
            }
        }

        val score = try {
            fetchFromDetailPage(title, year, isMovie)
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching Metacritic for $cacheTag '$title'", e)
            null
        }

        scoresCache[cacheKey] = CachedScore(score, System.currentTimeMillis())
        Log.d(TAG, "Metacritic score for '$title': $score")
        score
    }

    /**
     * Fetches the Metacritic detail page for the title and extracts the Metascore.
     * Builds candidate slugs and stops at the first page that yields a score.
     */
    private fun fetchFromDetailPage(title: String, year: Int?, isMovie: Boolean): Int? {
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

        var score: Int? = null
        for (url in candidates) {
            Log.d(TAG, "Fetching: $url")
            score = fetchPage(url)
            if (score != null) break
        }
        return score
    }

    /**
     * Fetches a single page and extracts the Metascore from its JSON-LD.
     * Returns null on Cloudflare block, HTTP error, or no parseable score.
     */
    private fun fetchPage(url: String): Int? {
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

        val score = extractMetascore(html)
        if (score == null) {
            Log.w(TAG, "✗ No Metascore found in HTML for $url")
        }
        return score
    }

    /**
     * Extracts the Metascore from the page's JSON-LD.
     * On Metacritic the embedded `aggregateRating` is the Metascore itself
     * (scale /100), NOT the user score:
     *   {"name":"Metascore","bestRating":100,"worstRating":0,"ratingValue":88,...}
     */
    private fun extractMetascore(html: String): Int? {
        val ldJsonMatch = Regex("""<script[^>]*type="application/ld\+json"[^>]*>(.*?)</script>""")
            .find(html) ?: run {
            Log.d(TAG, "✗ No JSON-LD block found")
            return null
        }

        val value = try {
            val root = JSONObject(ldJsonMatch.groupValues[1])
            val aggregate = root.optJSONObject("aggregateRating")
            aggregate?.optInt("ratingValue", -1)?.takeIf { it >= 0 }
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing JSON-LD", e)
            null
        }

        if (value != null) {
            Log.d(TAG, "✓ Found Metascore via JSON-LD: $value")
        } else {
            Log.d(TAG, "✗ Metascore not found in JSON-LD")
        }
        return value
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
