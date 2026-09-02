package it.wavestream.app.data.repository

import android.util.Log
import it.wavestream.app.data.api.CinemetaMeta
import it.wavestream.app.data.api.CinemetaService
import it.wavestream.app.data.api.OmdbResult
import it.wavestream.app.data.api.OmdbService
import it.wavestream.app.data.preferences.UserPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for fetching IMDB ratings via OMDb API
 * Falls back to Cinemeta (Stremio's catalog, free / no key) when OMDb is
 * missing or outdated — Cinemeta's IMDb ratings are refreshed continuously.
 */
@Singleton
class ImdbRatingsRepository @Inject constructor(
    private val userPreferences: UserPreferences
) {
    // Create scraper instances internally to avoid Hilt injection issues
    private val rtScraper = RottenTomatoesScraper()
    private val metacriticScraper = MetacriticScraper()
    private lateinit var cinemeta: CinemetaService
    companion object {
        private const val TAG = "ImdbRatings"
        private const val CACHE_DURATION_MS = 24 * 60 * 60 * 1000L // 24 hours
        private const val DEFAULT_API_KEY = "85ba6cc1" // Default OMDB API key
        
        // Release/quality/language tags found in playlist titles.
        // Matched ONLY as whole words (see cleanTitleForOmdb) so real title
        // words like "Cats" (TS), "Italian" (ITA), "English" (ENG), "Submarine" (SUB)
        // are never corrupted. Longest-first ordering matters for multi-word tags.
        private val RELEASE_TAGS = listOf(
            "4K", "UHD", "2160p", "FHD", "1080p", "1080i",
            "HD", "720p", "SD", "480p",
            "HDR10+", "HDR10", "HDR", "Dolby Vision", "DV",
            "HEVC", "H265", "H264", "x265", "x264",
            "WEB-DL REMUX", "WEB-DL", "WEBDL", "WEBRip", "WEBRIP", "REMUX", "HDTV", "PDTV",
            "BluRay", "BLU-RAY", "BLURAY", "BDRip", "BRRip",
            "DVDRip", "DVDR", "CAM", "TS", "HDTS", "REPACK", "PROPER",
            "ITA", "ENG", "MULTI", "SUB", "SUBBED", "AC3", "EAC3", "DTS", "AAC", "ATMOS",
            "EXTENDED CUT", "UNRATED CUT", "EXTENDED", "UNRATED",
            "DIRECTOR'S CUT", "DIRECTORS CUT", "REMASTERED"
        )
    }
    
    private val api: OmdbService
    
    // In-memory cache
    private val ratingsCache = mutableMapOf<String, CachedRating>()

    // In-memory cache for Cinemeta IMDb ratings (keyed by IMDb ID)
    private val cinemetaCache = mutableMapOf<String, CachedRating>()
    
    data class CachedRating(
        val rating: RatingInfo,
        val timestamp: Long
    )
    
    init {
        val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC
        }
        
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .protocols(listOf(Protocol.HTTP_1_1))
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .build()
        
        api = Retrofit.Builder()
            .baseUrl(OmdbService.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OmdbService::class.java)
        
        cinemeta = Retrofit.Builder()
            .baseUrl(CinemetaService.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CinemetaService::class.java)
    }
    
    /**
     * Rating information from multiple sources
     */
    data class RatingInfo(
        val imdbRating: Float?,         // 8.4
        val imdbVotes: String?,         // "1,234,567"
        val imdbId: String?,
        val rottenTomatoesScore: Int?,  // 91 (percentage) - Critics score (Tomatometer)
        val audienceScore: Int?,        // 87 (percentage) - Audience score (Popcornmeter)
        val metacriticScore: Int?,      // 74
        val rated: String?,             // "PG-13", "R"
        val awards: String?,
        val boxOffice: String?
    ) {
        val hasRatings: Boolean
            get() = imdbRating != null || rottenTomatoesScore != null || audienceScore != null || metacriticScore != null
        
        fun getFormattedImdbRating(): String? {
            return imdbRating?.let { String.format("%.1f", it) }
        }
    }
    
    /**
     * Get ratings by IMDB ID
     */
    suspend fun getRatingsByImdbId(imdbId: String): RatingInfo? = withContext(Dispatchers.IO) {
        // Check cache
        ratingsCache[imdbId]?.let { cached ->
            if (System.currentTimeMillis() - cached.timestamp < CACHE_DURATION_MS) {
                return@withContext cached.rating
            }
        }
        
        val apiKey = userPreferences.getOmdbApiKey() ?: DEFAULT_API_KEY
        if (apiKey.isEmpty()) {
            Log.w(TAG, "OMDb API key not configured")
            return@withContext null
        }
        
        try {
            val response = api.getByImdbId(apiKey, imdbId)
            
            if (response.isSuccessful && response.body()?.Response == "True") {
                val result = response.body()!!
                val rating = parseRatingInfo(result)
                
                // Cache result
                ratingsCache[imdbId] = CachedRating(rating, System.currentTimeMillis())
                
                return@withContext rating
            } else {
                Log.w(TAG, "OMDb error: ${response.body()?.Error}")
                return@withContext null
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching IMDB rating", e)
            return@withContext null
        }
    }
    
    /**
     * Get ratings by title (fallback if no IMDB ID)
     */
    suspend fun getRatingsByTitle(
        title: String,
        year: Int? = null,
        type: String? = null
    ): RatingInfo? = withContext(Dispatchers.IO) {
        val cacheKey = "$title:$year:$type"
        
        // Check cache
        ratingsCache[cacheKey]?.let { cached ->
            if (System.currentTimeMillis() - cached.timestamp < CACHE_DURATION_MS) {
                return@withContext cached.rating
            }
        }
        
        val apiKey = userPreferences.getOmdbApiKey() ?: DEFAULT_API_KEY
        if (apiKey.isEmpty()) {
            android.util.Log.d("ImdbRatings", "No API key available")
            return@withContext null
        }
        
        try {
            android.util.Log.d("ImdbRatings", "Calling OMDB for: title=$title, year=$year")
            val response = api.getByTitle(apiKey, title, year, type)
            
            android.util.Log.d("ImdbRatings", "OMDB response: success=${response.isSuccessful}, body.Response=${response.body()?.Response}, error=${response.body()?.Error}")
            
            if (response.isSuccessful && response.body()?.Response == "True") {
                val result = response.body()!!
                val rating = parseRatingInfo(result)
                android.util.Log.d("ImdbRatings", "Parsed: imdb=${rating.imdbRating}, rt=${rating.rottenTomatoesScore}, audience=${rating.audienceScore}, mc=${rating.metacriticScore}")
                
                // Cache by IMDB ID if available
                result.imdbID?.let { imdbId ->
                    ratingsCache[imdbId] = CachedRating(rating, System.currentTimeMillis())
                }
                ratingsCache[cacheKey] = CachedRating(rating, System.currentTimeMillis())
                
                return@withContext rating
            }
            return@withContext null
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching rating by title", e)
            return@withContext null
        }
    }
    
    /**
     * Smart search with multiple fallback strategies
     * This is the preferred method - it tries all possible ways to find ratings
     * 
     * @param imdbId IMDB ID from TMDB (most reliable if available)
     * @param originalTitle Original title from playlist (may be in any language)
     * @param englishTitle English title from TMDB (often works better with OMDB)
     * @param year Year of release
     * @param type "movie" or "series"
     */
    suspend fun getRatingsWithFallbacks(
        imdbId: String? = null,
        originalTitle: String,
        englishTitle: String? = null,
        year: Int? = null,
        type: String? = null
    ): RatingInfo? = withContext(Dispatchers.IO) {
        var ratings: RatingInfo?
        
        // Strategy 1: Try with IMDB ID (most reliable!)
        if (!imdbId.isNullOrEmpty()) {
            Log.d(TAG, "Strategy 1: IMDB ID = $imdbId")
            ratings = getRatingsByImdbId(imdbId)
            if (ratings?.hasRatings == true) {
                Log.d(TAG, "✓ Found via IMDB ID")
                return@withContext ratings
            }
        }
        
        // Clean up title
        val cleanedOriginal = cleanTitleForOmdb(originalTitle)
        
        // Strategy 2: Try with English title from TMDB (often works better)
        if (!englishTitle.isNullOrEmpty() && englishTitle.lowercase() != cleanedOriginal.lowercase()) {
            val cleanedEnglish = cleanTitleForOmdb(englishTitle)
            Log.d(TAG, "Strategy 2: English title = $cleanedEnglish, year = $year")
            ratings = getRatingsByTitle(cleanedEnglish, year, type)
            if (ratings?.hasRatings == true) {
                Log.d(TAG, "✓ Found via English title")
                return@withContext ratings
            }
            
            // Try English title without year
            if (year != null) {
                Log.d(TAG, "Strategy 2b: English title without year")
                ratings = getRatingsByTitle(cleanedEnglish, null, type)
                if (ratings?.hasRatings == true) {
                    Log.d(TAG, "✓ Found via English title (no year)")
                    return@withContext ratings
                }
            }
        }
        
        // Strategy 3: Try with original/cleaned title
        Log.d(TAG, "Strategy 3: Original title = $cleanedOriginal, year = $year")
        ratings = getRatingsByTitle(cleanedOriginal, year, type)
        if (ratings?.hasRatings == true) {
            Log.d(TAG, "✓ Found via original title")
            return@withContext ratings
        }
        
        // Strategy 4: Try original title without year
        if (year != null) {
            Log.d(TAG, "Strategy 4: Original title without year")
            ratings = getRatingsByTitle(cleanedOriginal, null, type)
            if (ratings?.hasRatings == true) {
                Log.d(TAG, "✓ Found via original title (no year)")
                return@withContext ratings
            }
        }
        
        // Strategy 5: Use OMDB Search API and take first result
        Log.d(TAG, "Strategy 5: Search API")
        ratings = searchAndGetRatings(cleanedOriginal, year, type)
            ?: englishTitle?.let { searchAndGetRatings(cleanTitleForOmdb(it), year, type) }
        if (ratings?.hasRatings == true) {
            Log.d(TAG, "✓ Found via Search API")
            return@withContext ratings
        }
        
        // Strategy 6: Try first part of title before common separators
        val titlePart = cleanedOriginal
            .split(" - ", " : ", " – ", " | ")
            .firstOrNull()
            ?.trim()
            ?.takeIf { it.length > 2 && it != cleanedOriginal }
        
        if (titlePart != null) {
            Log.d(TAG, "Strategy 6: Title part = $titlePart")
            ratings = getRatingsByTitle(titlePart, year, type)
                ?: getRatingsByTitle(titlePart, null, type)
            if (ratings?.hasRatings == true) {
                Log.d(TAG, "✓ Found via title part")
                return@withContext ratings
            }
        }

        // Strategy 7: Metacritic scraper fallback.
        // If OMDB couldn't provide a Metascore (N/A or no match), try scraping
        // the Metacritic detail page directly. This is the automatic fallback used
        // during hero enrichment (LoadingActivity) and the detail-view skeleton.
        // The English title maps best to Metacritic's slug, so prefer it.
        if (ratings?.metacriticScore == null) {
            val metacriticTitle = englishTitle ?: cleanedOriginal
            if (metacriticTitle.isNotBlank()) {
                Log.d(TAG, "Strategy 7: Metacritic scraper fallback for: $metacriticTitle")
                val mcScore = fetchMetacriticScore(
                    title = metacriticTitle,
                    year = year,
                    isMovie = type != "series"
                )
                if (mcScore != null) {
                    Log.d(TAG, "✓ Found Metacritic score via scraper: $mcScore")
                    val base = ratings ?: RatingInfo(
                        imdbRating = null,
                        imdbVotes = null,
                        imdbId = imdbId,
                        rottenTomatoesScore = null,
                        audienceScore = null,
                        metacriticScore = null,
                        rated = null,
                        awards = null,
                        boxOffice = null
                    )
                    val updated = base.copy(metacriticScore = mcScore)
                    // Cache by IMDB ID + title key so hero reloads hit memory.
                    imdbId?.let { ratingsCache[it] = CachedRating(updated, System.currentTimeMillis()) }
                    ratingsCache["$metacriticTitle:$year:$type"] = CachedRating(updated, System.currentTimeMillis())
                    return@withContext updated
                }
            }
        }

        Log.d(TAG, "✗ No ratings found for: $originalTitle")
        return@withContext ratings
    }
    
    /**
     * Fetch Rotten Tomatoes scores (critics + audience) via web scraping
     * Call this separately to add missing scores to existing ratings
     */
    suspend fun fetchRtScores(
        title: String,
        year: Int? = null,
        isMovie: Boolean = true
    ): RottenTomatoesScraper.RtScores? = withContext(Dispatchers.IO) {
        return@withContext if (isMovie) {
            rtScraper.getScoresForMovie(title = title, year = year)
        } else {
            rtScraper.getScoresForSeries(title = title, year = year)
        }
    }
    
    /**
     * Fetch the Metacritic score (Metascore, /100) via web scraping.
     * Call this as a fallback when OMDB returns N/A for the Metascore field.
     *
     * @param title Cleaned title (prefer the English title from TMDB)
     * @param year Release year
     * @param isMovie true for movies, false for TV series
     */
    suspend fun fetchMetacriticScore(
        title: String,
        year: Int? = null,
        isMovie: Boolean = true
    ): Int? = withContext(Dispatchers.IO) {
        if (isMovie) {
            metacriticScraper.getScoreForMovie(title = title, year = year)
        } else {
            metacriticScraper.getScoreForSeries(title = title, year = year)
        }
    }

    /**
     * Search using OMDB search endpoint, then get full details of the best match.
     * First tries with year + type (most precise), then falls back to a fuzzy
     * search without year (OMDB's search is loose and can still find the title).
     */
    private suspend fun searchAndGetRatings(
        query: String,
        year: Int?,
        type: String?
    ): RatingInfo? {
        val apiKey = userPreferences.getOmdbApiKey() ?: DEFAULT_API_KEY
        if (apiKey.isEmpty()) return null
        
        // Pass 1: with year + type. E.g. "Cats" + 2019 -> the right movie comes first.
        searchAndPick(apiKey, query, year, type)?.let { return it }
        // Pass 2: fuzzy search without year, when the title is still not found.
        return searchAndPick(apiKey, query, null, type)
    }
    
    /**
     * Runs one OMDB search and resolves the best candidate to full ratings.
     * Prefers exact year match, then near year match, then the first result.
     */
    private suspend fun searchAndPick(
        apiKey: String,
        query: String,
        year: Int?,
        type: String?
    ): RatingInfo? {
        try {
            val searchResponse = api.search(apiKey, query, year, type)
            if (searchResponse.isSuccessful && searchResponse.body()?.Response == "True") {
                val results = searchResponse.body()?.Search.orEmpty()
                    .filter { type == null || it.Type == null || it.Type.equals(type, ignoreCase = true) }
                
                val best = when {
                    results.isEmpty() -> null
                    year != null -> {
                        results.firstOrNull { it.Year?.toIntOrNull() == year }
                            ?: results.firstOrNull {
                                val rYear = it.Year?.toIntOrNull() ?: return@firstOrNull false
                                kotlin.math.abs(rYear - year) <= 1
                            }
                            ?: results.first()
                    }
                    else -> results.first()
                }
                
                if (best?.imdbID != null) {
                    Log.d(TAG, "Search found: ${best.Title} (${best.Year}) - ${best.imdbID}")
                    return getRatingsByImdbId(best.imdbID)
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Search error", e)
        }
        return null
    }
    
    /**
     * Clean title for OMDB search - removes years and release/quality tags
     * WITHOUT corrupting real words inside titles.
     *
     * Tags are matched only as whole words (surrounded by non-alphanumerics), so:
     *  "Cats (2019)"            -> "Cats"        (tag "TS" never touches "Cat-s")
     *  "The Italian Job (2003)" -> "The Italian Job" (tag "ITA" never touches "Ital-ian")
     *  "The English Patient"    -> "The English Patient" (tag "ENG" safe)
     *  "Submarine (2010)"       -> "Submarine"   (tag "SUB" safe)
     *  "Dune Part Two 2024 1080p WEB-DL H264 AC3" -> "Dune Part Two"
     *  "The.Irishman.2019.1080p.WEB-DL"           -> "The Irishman"
     */
    private fun cleanTitleForOmdb(title: String): String {
        var cleaned = title.trim()
        
        // Tag list, longest first so multi-word tags win over single-word ones.
        val tagPattern = RELEASE_TAGS
            .sortedByDescending { it.length }
            .joinToString("|") { tag ->
                tag.split(" ").joinToString("""\s*[.\s]\s*""") { Regex.escape(it) }
            }
        
        // 1) Parenthesized/bracketed years: (2019) [2019] {2019}
        cleaned = cleaned.replace(Regex("""[\[\(\(\{]\s*(?:19|20)\d{2}\s*[\]\)\}]"""), " ")
        
        // 2) Bracketed groups made ONLY of release info: [1080p] [WEB-DL.ITA] {HDR10+}
        cleaned = cleaned.replace(
            Regex("""[\[\(\(\{]\s*(?:$tagPattern(?:\s*[.\s'+-]\s*)?)+[\]\)\}]""", RegexOption.IGNORE_CASE),
            " "
        )
        
        // 3) Standalone release tags as whole words. Lookarounds guarantee the tag
        //    is not embedded in a real word ("Cats" -> "Ca" would break OMDB lookups).
        cleaned = cleaned.replace(
            Regex("""(?<![A-Za-z0-9])(?:$tagPattern)(?![A-Za-z0-9])""", RegexOption.IGNORE_CASE),
            " "
        )
        
        // 4) Dot-separated playlist titles: The.Irishman.2019.1080p -> The Irishman 2019 1080p
        cleaned = cleaned.replace(Regex("""(?<=[A-Za-z0-9])\.(?=[A-Za-z0-9])"""), " ")
        
        // 5) Trailing scene-release group: "x264-AMIABLE", "Webrip-GROUP" -> removed
        //    (done before the year strip so the year becomes truly trailing)
        cleaned = cleaned.replace(Regex("""\s*-\s*[A-Za-z0-9.]{2,15}$"""), " ")
        
        // 5b) Trailing bare year (not parenthesized): "Dune Part Two 2024" -> "Dune Part Two"
        //    The leading separator requirement keeps real titles like "1984" or "1917" intact.
        cleaned = cleaned.replace(Regex("""[\s.]+(?:19|20)\d{2}[\s.]*$"""), " ")
        
        // 6) Collapse whitespace and drop trailing separators
        cleaned = cleaned.replace(Regex("""\s*[-|:]+\s*$"""), "")
        cleaned = cleaned.trim().replace(Regex("""\s{2,}"""), " ")
        
        // Safety net: never return an empty/mangled title (e.g. movie literally named "Cam").
        return if (cleaned.length > 1) cleaned else title.trim()
    }

    
    /**
     * Parse OMDb result into RatingInfo
     */
    private fun parseRatingInfo(result: OmdbResult): RatingInfo {
        // Parse IMDB rating
        val imdbRating = result.imdbRating?.toFloatOrNull()
        
        // Parse Rotten Tomatoes Critics score (Tomatometer)
        // First try tomatoMeter field (from tomatoes=true), fallback to Ratings array
        val rtScore = result.tomatoMeter?.takeIf { it != "N/A" }?.toIntOrNull()
            ?: result.Ratings?.find { 
                it.Source == "Rotten Tomatoes" 
            }?.Value?.replace("%", "")?.toIntOrNull()
        
        // Parse Audience Score (Popcornmeter) from tomatoUserMeter
        val audienceScore = result.tomatoUserMeter?.takeIf { it != "N/A" }?.toIntOrNull()
        
        // Parse Metacritic
        val metacritic = result.Metascore?.toIntOrNull()
            ?: result.Ratings?.find { 
                it.Source == "Metacritic" 
            }?.Value?.replace("/100", "")?.toIntOrNull()
        
        return RatingInfo(
            imdbRating = imdbRating,
            imdbVotes = result.imdbVotes,
            imdbId = result.imdbID,
            rottenTomatoesScore = rtScore,
            audienceScore = audienceScore,
            metacriticScore = metacritic,
            rated = result.Rated,
            awards = result.Awards,
            boxOffice = result.BoxOffice
        )
    }
    
    /**
     * Clear ratings cache
     */
    fun clearCache() {
        ratingsCache.clear()
    }
}
