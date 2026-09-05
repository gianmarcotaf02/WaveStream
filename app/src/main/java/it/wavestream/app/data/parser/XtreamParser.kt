package it.wavestream.app.data.parser

import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Parser for Xtream Codes API responses
 * Uses Android's built-in JSON parsing to avoid KAPT conflicts
 */
@Singleton
class XtreamParser @Inject constructor() {
    
    companion object {
        private const val TAG = "XtreamParser"
    }
    
    /**
     * Parse live categories JSON
     */
    fun parseLiveCategories(json: String): List<XtreamCategory> {
        return try {
            val array = try {
                JSONArray(json)
            } catch (e: Exception) {
                Log.w(TAG, "parseLiveCategories: JSON truncated (${json.length} chars), attempting repair...")
                val repaired = repairTruncatedJsonArray(json)
                if (repaired != null) {
                    Log.d(TAG, "parseLiveCategories: repaired JSON -> ${repaired.length} chars")
                    JSONArray(repaired)
                } else {
                    throw e
                }
            }
            Log.d(TAG, "parseLiveCategories: JSON array length=${array.length()}")
            (0 until array.length()).map { i ->
                val obj = array.getJSONObject(i)
                XtreamCategory(
                    id = obj.optString("category_id", ""),
                    name = obj.optString("category_name", ""),
                    parentId = obj.optInt("parent_id", 0).takeIf { it != 0 }
                )
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing live categories: ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            emptyList()
        }
    }
    
    /**
     * Parse live streams JSON
     */
    fun parseLiveStreams(json: String): List<XtreamStream> {
        return try {
            val array = try {
                JSONArray(json)
            } catch (e: Exception) {
                Log.w(TAG, "parseLiveStreams: JSON truncated (${json.length} chars), attempting repair...")
                val repaired = repairTruncatedJsonArray(json)
                if (repaired != null) {
                    Log.d(TAG, "parseLiveStreams: repaired JSON -> ${repaired.length} chars")
                    JSONArray(repaired)
                } else {
                    throw e
                }
            }
            Log.d(TAG, "parseLiveStreams: JSON array length=${array.length()}, jsonSize=${json.length}")
            var sampled = 0
            val result = (0 until array.length()).mapNotNull { i ->
                val obj = array.getJSONObject(i)
                val name = obj.optString("name", "")

                // Filter out category delimiters (e.g. "=== SPORT ===", "- - - - - -"),
                // fake "streams" inserted as separators. They never carry a logo and only
                // inflate the "channel without cover" count.
                if (isCategoryDelimiter(name)) return@mapNotNull null

                // Debug: log raw logo-ish fields for the first few real streams so we can
                // see exactly which field (and format) the provider actually sends.
                if (sampled < 3) {
                    sampled++
                    Log.d(TAG, "LIVE[$i] raw fields: stream_icon='${obj.optString("stream_icon", "")}' logo='${obj.optString("logo", "")}' icon='${obj.optString("icon", "")}' cover='${obj.optString("cover", "")}' stream_image='${obj.optString("stream_image", "")}' image='${obj.optString("image", "")}' name='$name'")
                }

                // Try multiple fields for the logo (different panels use different names).
                // stream_icon is the Xtream standard, the rest are common aliases.
                val logoUrl = obj.optString("stream_icon", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("logo", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("icon", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("stream_image", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("image", "").takeIf { it.isNotEmpty() }

                XtreamStream(
                    id = obj.optInt("stream_id", 0),
                    name = name,
                    logo = logoUrl,
                    epgId = obj.optString("epg_channel_id", "").takeIf { it.isNotEmpty() },
                    categoryId = obj.optString("category_id", "").takeIf { it.isNotEmpty() },
                    hasArchive = obj.optInt("tv_archive", 0)
                )
            }
            val withLogo = result.count { it.logo != null }
            Log.d(TAG, "parseLiveStreams: result=${result.size} streams (filtered ${array.length() - result.size} delimiters), withLogo=$withLogo, withoutLogo=${result.size - withLogo}")
            result
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing live streams: ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            emptyList()
        }
    }
    
    /**
     * Parse VOD categories JSON
     */
    fun parseVodCategories(json: String): List<XtreamCategory> = parseLiveCategories(json)
    
    /**
     * Parse VOD streams (movies) JSON
     */
    fun parseVodStreams(json: String): List<XtreamVod> {
        return try {
            val array = try {
                JSONArray(json)
            } catch (e: Exception) {
                Log.w(TAG, "parseVodStreams: JSON truncated (${json.length} chars), attempting repair...")
                val repaired = repairTruncatedJsonArray(json)
                if (repaired != null) {
                    Log.d(TAG, "parseVodStreams: repaired JSON -> ${repaired.length} chars")
                    JSONArray(repaired)
                } else {
                    throw e
                }
            }
            Log.d(TAG, "parseVodStreams: JSON array length=${array.length()}, jsonSize=${json.length}")
            (0 until array.length()).mapNotNull { i ->
                val obj = array.getJSONObject(i)
                val name = obj.optString("name", "")
                
                // Filter out category delimiters
                if (isCategoryDelimiter(name)) return@mapNotNull null
                // Debug: log raw poster fields for first 3 items
                if (i < 3) {
                    Log.d(TAG, "VOD[$i] raw fields: cover='${obj.optString("cover", "")}' cover_big='${obj.optString("cover_big", "")}' stream_icon='${obj.optString("stream_icon", "")}' movie_image='${obj.optString("movie_image", "")}' icon='${obj.optString("icon", "")}' name='${obj.optString("name", "")}'")
                }
                // Try multiple fields for poster URL (different providers use different fields)
                // Prioritize 'cover' like series since it works for them
                val posterUrl = obj.optString("cover", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("cover_big", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("stream_icon", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("movie_image", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("icon", "").takeIf { it.isNotEmpty() }
                
                val backdropUrl = obj.optString("backdrop", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("cover_big", "").takeIf { it.isNotEmpty() }
                
                // Parse added timestamp (can be string or long)
                val addedTimestamp = obj.optLong("added", 0).takeIf { it != 0L }
                    ?: obj.optString("added", "").toLongOrNull()
                    
                XtreamVod(
                    id = obj.optInt("stream_id", 0),
                    name = name,
                    poster = posterUrl,
                    backdrop = backdropUrl,
                    categoryId = obj.optString("category_id", "").takeIf { it.isNotEmpty() },
                    extension = obj.optString("container_extension", "").takeIf { it.isNotEmpty() },
                    rating = obj.optString("rating", "").takeIf { it.isNotEmpty() },
                    year = obj.optString("year", "").takeIf { it.isNotEmpty() },
                    added = addedTimestamp
                )
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing VOD streams: ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            emptyList()
        }
    }
    
    /**
     * Parse series categories JSON
     */
    fun parseSeriesCategories(json: String): List<XtreamCategory> {
        val result = parseLiveCategories(json)
        Log.d(TAG, "parseSeriesCategories: result=${result.size} categories")
        if (result.isNotEmpty()) {
            Log.d(TAG, "parseSeriesCategories: first 3: ${result.take(3).map { "${it.name} (id=${it.id})" }}")
        }
        return result
    }
    
    /**
     * Parse series list JSON
     */
    fun parseSeries(json: String): List<XtreamSeries> {
        return try {
            val array = try {
                JSONArray(json)
            } catch (e: Exception) {
                Log.w(TAG, "parseSeries: JSON truncated (${json.length} chars), attempting repair...")
                val repaired = repairTruncatedJsonArray(json)
                if (repaired != null) {
                    Log.d(TAG, "parseSeries: repaired JSON -> ${repaired.length} chars")
                    JSONArray(repaired)
                } else {
                    throw e
                }
            }
            Log.d(TAG, "parseSeries: JSON array length=${array.length()}")
            val result = (0 until array.length()).mapNotNull { i ->
                val obj = array.getJSONObject(i)
                val name = obj.optString("name", "")
                
                // Filter out category delimiters
                if (isCategoryDelimiter(name)) return@mapNotNull null
                // Try multiple fields for poster URL
                val posterUrl = obj.optString("cover", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("stream_icon", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("cover_big", "").takeIf { it.isNotEmpty() }
                
                val backdropUrl = obj.optString("backdrop", "").takeIf { it.isNotEmpty() }
                    ?: obj.optString("cover_big", "").takeIf { it.isNotEmpty() }
                
                // Parse added timestamp (can be string or long)
                val addedTimestamp = obj.optLong("added", 0).takeIf { it != 0L }
                    ?: obj.optString("added", "").toLongOrNull()
                    
                XtreamSeries(
                    id = obj.optInt("series_id", 0),
                    name = name,
                    poster = posterUrl,
                    backdrop = backdropUrl,
                    categoryId = obj.optString("category_id", "").takeIf { it.isNotEmpty() },
                    rating = obj.optString("rating", "").takeIf { it.isNotEmpty() },
                    year = obj.optString("year", "").takeIf { it.isNotEmpty() },
                    plot = obj.optString("plot", "").takeIf { it.isNotEmpty() },
                    cast = obj.optString("cast", "").takeIf { it.isNotEmpty() },
                    director = obj.optString("director", "").takeIf { it.isNotEmpty() },
                    genre = obj.optString("genre", "").takeIf { it.isNotEmpty() },
                    added = addedTimestamp,
                    tmdbId = obj.optInt("tmdb_id", 0).takeIf { it != 0 }
                )
            }
            Log.d(TAG, "parseSeries: result=${result.size} series (filtered ${array.length() - result.size} delimiters)")
            if (array.length() > 0 && result.isEmpty()) {
                Log.w(TAG, "parseSeries: WARNING - array had ${array.length()} items but ALL were filtered! First item: ${array.getJSONObject(0).optString("name", "?")} series_id=${array.getJSONObject(0).optInt("series_id", -1)}")
            }
            result
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing series: ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            emptyList()
        }
    }
    
    /**
     * Parse series info (episodes) JSON
     */
    fun parseSeriesInfo(json: String): XtreamSeriesInfo? {
        return try {
            val obj = JSONObject(json)
            val infoObj = obj.optJSONObject("info")
            val episodesObj = obj.optJSONObject("episodes")
            
            val info = infoObj?.let {
                XtreamSeriesDetails(
                    name = it.optString("name", "").takeIf { s -> s.isNotEmpty() },
                    poster = it.optString("cover", "").takeIf { s -> s.isNotEmpty() },
                    plot = it.optString("plot", "").takeIf { s -> s.isNotEmpty() },
                    cast = it.optString("cast", "").takeIf { s -> s.isNotEmpty() },
                    director = it.optString("director", "").takeIf { s -> s.isNotEmpty() },
                    genre = it.optString("genre", "").takeIf { s -> s.isNotEmpty() },
                    releaseDate = it.optString("releaseDate", "").takeIf { s -> s.isNotEmpty() },
                    rating = it.optString("rating", "").takeIf { s -> s.isNotEmpty() }
                )
            }
            
            val episodes = mutableMapOf<String, List<XtreamEpisode>>()
            episodesObj?.keys()?.forEach { season ->
                val seasonArray = episodesObj.getJSONArray(season)
                episodes[season] = (0 until seasonArray.length()).map { i ->
                    val ep = seasonArray.getJSONObject(i)
                    val epInfoObj = ep.optJSONObject("info")
                    val epInfo = epInfoObj?.let {
                        XtreamEpisodeInfo(
                            image = it.optString("movie_image", "").takeIf { s -> s.isNotEmpty() }
                                ?: it.optString("image", "").takeIf { s -> s.isNotEmpty() },
                            plot = it.optString("plot", "").takeIf { s -> s.isNotEmpty() },
                            durationSecs = it.optInt("duration_secs", 0).takeIf { d -> d > 0 }
                                ?: it.optInt("duration", 0).takeIf { d -> d > 0 },
                            releaseDate = it.optString("releasedate", "").takeIf { s -> s.isNotEmpty() }
                                ?: it.optString("release_date", "").takeIf { s -> s.isNotEmpty() }
                        )
                    }
                    XtreamEpisode(
                        id = ep.optString("id", ""),
                        episodeNum = ep.optInt("episode_num", 0),
                        title = ep.optString("title", "").takeIf { s -> s.isNotEmpty() },
                        extension = ep.optString("container_extension", "").takeIf { s -> s.isNotEmpty() },
                        info = epInfo
                    )
                }
            }
            
            XtreamSeriesInfo(info, episodes.takeIf { it.isNotEmpty() })
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing series info: ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            null
        }
    }
    
    /**
     * Parse VOD info (movie details) JSON
     * This comes from the /get_vod_info endpoint
     */
    fun parseVodInfo(json: String): XtreamVodInfo? {
        return try {
            val obj = JSONObject(json)
            val infoObj = obj.optJSONObject("info") ?: obj.optJSONObject("movie_data") ?: obj
            
            XtreamVodInfo(
                tmdbId = infoObj.optInt("tmdb_id", 0).takeIf { it != 0 },
                name = infoObj.optString("name", "").takeIf { it.isNotEmpty() } ?: infoObj.optString("title", "").takeIf { it.isNotEmpty() },
                plot = infoObj.optString("plot", "").takeIf { it.isNotEmpty() } ?: infoObj.optString("description", "").takeIf { it.isNotEmpty() },
                cast = infoObj.optString("cast", "").takeIf { it.isNotEmpty() } ?: infoObj.optString("actors", "").takeIf { it.isNotEmpty() },
                director = infoObj.optString("director", "").takeIf { it.isNotEmpty() },
                genre = infoObj.optString("genre", "").takeIf { it.isNotEmpty() },
                releaseDate = infoObj.optString("releasedate", "").takeIf { it.isNotEmpty() } ?: infoObj.optString("release_date", "").takeIf { it.isNotEmpty() },
                runtime = infoObj.optString("duration", "").takeIf { it.isNotEmpty() } ?: infoObj.optString("runtime", "").takeIf { it.isNotEmpty() },
                rating = infoObj.optString("rating", "").takeIf { it.isNotEmpty() },
                backdrop = infoObj.optString("backdrop_path", "").takeIf { it.isNotEmpty() } ?: infoObj.optString("cover_big", "").takeIf { it.isNotEmpty() },
                youtubeTrailer = infoObj.optString("youtube_trailer", "").takeIf { it.isNotEmpty() }
            )
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing VOD info: ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            null
        }
    }
    
    /**
     * Checks if an item name is actually a category delimiter 
     * (e.g. "- - - - Scary Movie - - - -", "=== ACTION ===", "*** Kids ***")
     */
    private fun isCategoryDelimiter(name: String): Boolean {
        val trimmed = name.trim()
        // Matches at least 3 occurrences of special characters (-, =, *, ~, |, <, >) with optional spaces
        // at the very beginning of the name.
        val delimiterPattern = Regex("^([_\\\\=*~|><-]\\s*){3,}.*")
        val isDelimiter = delimiterPattern.matches(trimmed)
        if (isDelimiter) Log.d(TAG, "isCategoryDelimiter: filtered '$trimmed'")
        return isDelimiter
    }

    /**
     * Repair a truncated JSON array (the Xtream server cuts large responses mid-string).
     * Scans FORWARD from the start, where the string state is always known and correct.
     * This matters because the server can cut the response in the middle of a string:
     * a backward scan loses track of escaped quotes and fails to find the last complete
     * object. We track string state (honouring backslash escapes) and object nesting, and
     * record the end of the last object that closes at depth 0 — i.e. the last complete
     * item in the array. O(n), single validation pass.
     */
    private fun repairTruncatedJsonArray(json: String): String? {
        if (!json.trimStart().startsWith("[")) return null
        var inString = false
        var depth = 0
        var lastCompleteEnd = -1
        var i = 0
        val n = json.length
        while (i < n) {
            val c = json[i]
            if (inString) {
                when {
                    c == '\\' -> i++ // skip the escaped character
                    c == '"' -> inString = false
                }
            } else {
                when (c) {
                    '"' -> inString = true
                    '{' -> depth++
                    '}' -> {
                        depth--
                        if (depth == 0) lastCompleteEnd = i + 1
                    }
                }
            }
            i++
        }
        if (lastCompleteEnd <= 1) return null
        val candidate = json.substring(0, lastCompleteEnd) + "]"
        return try {
            JSONArray(candidate)
            Log.d(TAG, "repairTruncatedJsonArray: repaired at char $lastCompleteEnd -> ${candidate.length} chars")
            candidate
        } catch (_: Exception) {
            null
        }
    }
}

// Simple data classes without annotations
data class XtreamCategory(
    val id: String,
    val name: String,
    val parentId: Int? = null
)

data class XtreamStream(
    val id: Int,
    val name: String,
    val logo: String?,
    val epgId: String?,
    val categoryId: String?,
    val hasArchive: Int = 0
)

data class XtreamVod(
    val id: Int,
    val name: String,
    val poster: String?,
    val backdrop: String? = null,
    val categoryId: String?,
    val extension: String?,
    val rating: String?,
    val year: String?,
    val added: Long? = null  // Unix timestamp when content was added by provider
)

data class XtreamSeries(
    val id: Int,
    val name: String,
    val poster: String?,
    val backdrop: String? = null,
    val categoryId: String?,
    val rating: String?,
    val year: String?,
    val plot: String? = null,
    val cast: String? = null,
    val director: String? = null,
    val genre: String? = null,
    val added: Long? = null,  // Unix timestamp when content was added by provider
    val tmdbId: Int? = null   // TMDB ID if provided by Xtream API
)

data class XtreamSeriesInfo(
    val info: XtreamSeriesDetails?,
    val episodes: Map<String, List<XtreamEpisode>>?
)

data class XtreamSeriesDetails(
    val name: String?,
    val poster: String?,
    val plot: String?,
    val cast: String?,
    val director: String?,
    val genre: String?,
    val releaseDate: String?,
    val rating: String?
)

data class XtreamEpisode(
    val id: String,
    val episodeNum: Int,
    val title: String?,
    val extension: String?,
    val info: XtreamEpisodeInfo?
)

data class XtreamEpisodeInfo(
    val image: String?,
    val plot: String?,
    val durationSecs: Int?,
    val releaseDate: String?
)

data class XtreamVodInfo(
    val tmdbId: Int?,
    val name: String?,
    val plot: String?,
    val cast: String?,
    val director: String?,
    val genre: String?,
    val releaseDate: String?,
    val runtime: String?,
    val rating: String?,
    val backdrop: String?,
    val youtubeTrailer: String?
)

