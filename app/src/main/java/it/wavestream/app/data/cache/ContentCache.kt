package it.wavestream.app.data.cache

import android.util.LruCache
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.wavestream.app.data.database.dao.HomeSessionCacheDao
import it.wavestream.app.data.database.entity.HomeSessionCacheEntity
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.Series
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * In-memory cache for frequently accessed content
 * Reduces database queries and improves UI responsiveness
 *
 * Session cache uses a write-through pattern:
 * - L1: ConcurrentHashMap (fast, in-memory)
 * - L2: Room HomeSessionCacheDao (persistent, survives app restarts)
 * Default TTL: 30 minutes, but callers can override per-key (e.g. trending = 7 days)
 */
@Singleton
class ContentCache @Inject constructor(
    private val homeSessionCacheDao: HomeSessionCacheDao
) {
    
    companion object {
        private const val CHANNEL_CACHE_SIZE = 500
        private const val MOVIE_CACHE_SIZE = 300
        private const val SERIES_CACHE_SIZE = 200
        private const val CATEGORY_CACHE_SIZE = 50
        private const val SESSION_CACHE_TTL_MS = 30 * 60 * 1000L // 30 minutes default
        private const val SESSION_CACHE_MAX_TTL_MS = 7 * 24 * 60 * 60 * 1000L // 7 days max for pruning
    }
    
    private val gson = Gson()
    private val scope = CoroutineScope(Dispatchers.IO)
    
    // LRU Caches for fast access
    private val channelCache = LruCache<Long, Channel>(CHANNEL_CACHE_SIZE)
    private val movieCache = LruCache<Long, Movie>(MOVIE_CACHE_SIZE)
    private val seriesCache = LruCache<Long, Series>(SERIES_CACHE_SIZE)
    
    // Category lists cache
    private val channelsByCategoryCache = LruCache<String, List<Channel>>(CATEGORY_CACHE_SIZE)
    private val moviesByCategoryCache = LruCache<String, List<Movie>>(CATEGORY_CACHE_SIZE)
    private val seriesByCategoryCache = LruCache<String, List<Series>>(CATEGORY_CACHE_SIZE)
    
    // Popular content caches (10 days)
    // Store only IDs to keep ordering stable while always re-fetching fresh objects from DB
    // (so poster/backdrop updates from detail enrichment are reflected in the home carousels)
    var popularMoviesCache: List<Long>? = null
    var popularMoviesCacheTime: Long = 0
    
    var popularSeriesCache: List<Long>? = null
    var popularSeriesCacheTime: Long = 0
    
    // Cooldown for failed trending populate attempts (prevents redundant TMDB calls)
    var lastTrendingMoviesPopulateAttempt: Long = 0
    var lastTrendingSeriesPopulateAttempt: Long = 0
    
    // Hero caches (30 min)
    var cachedMovieHeroes: List<it.wavestream.app.ui.home.HeroItem>? = null
    var lastMovieHeroFetchTime: Long = 0
    
    var cachedSeriesHeroes: List<it.wavestream.app.ui.home.HeroItem>? = null
    var lastSeriesHeroFetchTime: Long = 0
    
    // Shuffled categories (cached once per session)
    var cachedShuffledMovieCategories: List<String>? = null
    var cachedShuffledSeriesCategories: List<String>? = null
    
    // Timestamp for cache invalidation
    private var lastInvalidation = System.currentTimeMillis()
    
    // Channels
    fun getChannel(id: Long): Channel? = channelCache.get(id)
    
    fun putChannel(channel: Channel) {
        channelCache.put(channel.id, channel)
    }
    
    fun putChannels(channels: List<Channel>) {
        channels.forEach { channelCache.put(it.id, it) }
    }
    
    fun getChannelsByCategory(category: String): List<Channel>? = channelsByCategoryCache.get(category)
    
    fun putChannelsByCategory(category: String, channels: List<Channel>) {
        channelsByCategoryCache.put(category, channels)
        channels.forEach { channelCache.put(it.id, it) }
    }
    
    // Movies
    fun getMovie(id: Long): Movie? = movieCache.get(id)
    
    fun putMovie(movie: Movie) {
        movieCache.put(movie.id, movie)
    }
    
    fun putMovies(movies: List<Movie>) {
        movies.forEach { movieCache.put(it.id, it) }
    }
    
    fun getMoviesByCategory(category: String): List<Movie>? = moviesByCategoryCache.get(category)
    
    fun putMoviesByCategory(category: String, movies: List<Movie>) {
        moviesByCategoryCache.put(category, movies)
        movies.forEach { movieCache.put(it.id, it) }
    }
    
    // Series
    fun getSeries(id: Long): Series? = seriesCache.get(id)
    
    fun putSeries(series: Series) {
        seriesCache.put(series.id, series)
    }
    
    fun putSeriesList(seriesList: List<Series>) {
        seriesList.forEach { seriesCache.put(it.id, it) }
    }
    
    fun getSeriesByCategory(category: String): List<Series>? = seriesByCategoryCache.get(category)
    
    fun putSeriesByCategory(category: String, seriesList: List<Series>) {
        seriesByCategoryCache.put(category, seriesList)
        seriesList.forEach { seriesCache.put(it.id, it) }
    }
    
    // Invalidation
    fun invalidateAll() {
        channelCache.evictAll()
        movieCache.evictAll()
        seriesCache.evictAll()
        channelsByCategoryCache.evictAll()
        moviesByCategoryCache.evictAll()
        seriesByCategoryCache.evictAll()
        lastInvalidation = System.currentTimeMillis()
    }
    
    fun invalidateChannels() {
        channelCache.evictAll()
        channelsByCategoryCache.evictAll()
    }
    
    fun invalidateMovies() {
        movieCache.evictAll()
        moviesByCategoryCache.evictAll()
    }
    
    fun invalidateSeries() {
        seriesCache.evictAll()
        seriesByCategoryCache.evictAll()
    }
    
    fun isStale(maxAgeMs: Long = 5 * 60 * 1000): Boolean {
        return System.currentTimeMillis() - lastInvalidation > maxAgeMs
    }
    
    // =====================================================
    // Session cache: write-through (L1: ConcurrentHashMap, L2: Room DAO)
    // =====================================================
    private val homeSessionL1Cache = java.util.concurrent.ConcurrentHashMap<String, Any>()
    private val homeSessionTimestamps = java.util.concurrent.ConcurrentHashMap<String, Long>()
    
    /**
     * Get session data from L1 cache (fast, synchronous).
     * For L2 persistence, call loadSessionDataFromDB() first at app startup.
     */
    fun getHomeSessionData(key: String): Any? = homeSessionL1Cache[key]
    
    /**
     * Get the timestamp when a session data key was last written.
     */
    fun getHomeSessionDataTimestamp(key: String): Long? = homeSessionTimestamps[key]
    
    /**
     * Check if session data for a given key is stale (older than ttlMs).
     */
    fun isSessionDataStale(key: String, ttlMs: Long): Boolean {
        val ts = homeSessionTimestamps[key] ?: return true
        return System.currentTimeMillis() - ts > ttlMs
    }
    
    /**
     * Load all session data from L2 (Room) into L1 at app startup.
     * Should be called once from Application.onCreate or first ViewModel init.
     * Prunes entries older than 7 days max.
     */
    suspend fun loadSessionDataFromDB() {
        try {
            // Prune entries older than 7 days max
            val threshold = System.currentTimeMillis() - SESSION_CACHE_MAX_TTL_MS
            homeSessionCacheDao.pruneOlderThan(threshold)
            
            val allEntries = homeSessionCacheDao.getAll()
            for (entity in allEntries) {
                val value: Any? = when {
                    // CarouselRow list — deserialize with proper TypeToken
                    entity.key.startsWith("rows_") && !entity.key.startsWith("rows_time_") -> {
                        try { gson.fromJson<List<it.wavestream.app.ui.home.CarouselRow>>(entity.valueJson, carouselRowsType) } catch (_: Exception) { null }
                    }
                    // HeroItem pair — validate JSON format to discard old Pair data
                    entity.key.startsWith("hero_") -> {
                        try {
                            // Old format: {"first":[...],"second":true}
                            // New format: {"heroes":[...],"isContinueWatching":true}
                            if (!entity.valueJson.contains("\"heroes\"")) {
                                // Old Pair format — discard, will be rebuilt
                                null
                            } else {
                                gson.fromJson<it.wavestream.app.ui.home.HeroPairData>(entity.valueJson, heroPairType)
                            }
                        } catch (_: Exception) { null }
                    }
                    // Timestamps — Gson deserializes as Double
                    entity.key.startsWith("rows_time_") -> {
                        try { (gson.fromJson<Number>(entity.valueJson, Number::class.java))?.toLong() } catch (_: Exception) { null }
                    }
                    // Simple types
                    else -> deserializeValue(entity.valueJson)
                }
                if (value != null) {
                    homeSessionL1Cache[entity.key] = value
                    homeSessionTimestamps[entity.key] = entity.updatedAt
                } else {
                    // Remove broken entries
                    homeSessionCacheDao.remove(entity.key)
                }
            }
        } catch (e: Exception) {
            // Silently fail — L1 cache is still valid
        }
    }
    
    /**
     * Load a specific session data key from L2 (Room) into L1.
     * Returns the value if found and not expired, null otherwise.
     */
    suspend fun loadSessionDataFromDB(key: String, ttlMs: Long = SESSION_CACHE_TTL_MS): Any? {
        return try {
            val entity = homeSessionCacheDao.get(key) ?: return null
            // Check TTL
            if (System.currentTimeMillis() - entity.updatedAt > ttlMs) {
                homeSessionCacheDao.remove(key)
                return null
            }
            // Deserialize and populate L1
            val value = deserializeValue(entity.valueJson)
            if (value != null) {
                homeSessionL1Cache[key] = value
                homeSessionTimestamps[key] = entity.updatedAt
            }
            value
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * Put session data. Writes to both L1 (immediate) and L2 (async background).
     * Default TTL is 30 minutes. Use ttlMs override for trending/hero content (7 days).
     */
    fun putHomeSessionData(key: String, value: Any, ttlMs: Long = SESSION_CACHE_TTL_MS) {
        // L1 write (immediate)
        homeSessionL1Cache[key] = value
        homeSessionTimestamps[key] = System.currentTimeMillis()
        // L2 write (async background) — complex types use dedicated put methods instead
        if (key.startsWith("rows_") || key.startsWith("hero_") || key.startsWith("rows_time_")) return
        scope.launch {
            try {
                val json = serializeValue(value) ?: return@launch
                homeSessionCacheDao.put(HomeSessionCacheEntity(
                    key = key,
                    valueJson = json,
                    updatedAt = System.currentTimeMillis()
                ))
            } catch (e: Exception) {
                // Silently fail — L1 cache is still valid
            }
        }
    }
    
    /**
     * Remove session data from both L1 and L2.
     */
    fun removeHomeSessionData(key: String) {
        homeSessionL1Cache.remove(key)
        homeSessionTimestamps.remove(key)
        scope.launch {
            try { homeSessionCacheDao.remove(key) } catch (_: Exception) {}
        }
    }
    
    /**
     * Clear all session data from both L1 and L2.
     */
    fun clearHomeSessionData() {
        homeSessionL1Cache.clear()
        homeSessionTimestamps.clear()
        scope.launch {
            try { homeSessionCacheDao.clear() } catch (_: Exception) {}
        }
    }
    
    /**
     * Prune expired session data from L2 (Room).
     * Can be called periodically or at app startup.
     */
    suspend fun pruneExpiredSessionData() {
        try {
            val threshold = System.currentTimeMillis() - SESSION_CACHE_MAX_TTL_MS
            homeSessionCacheDao.pruneOlderThan(threshold)
        } catch (_: Exception) {}
    }
    
    // =====================================================
    // Dedicated cache for complex types (CarouselRow, HeroItem)
    // These need TypeToken-based serialization, not generic Gson
    // =====================================================
    private val carouselRowsType = object : TypeToken<List<it.wavestream.app.ui.home.CarouselRow>>() {}.type
    private val heroPairType = object : TypeToken<it.wavestream.app.ui.home.HeroPairData>() {}.type
    
    fun putCarouselRows(key: String, rows: List<it.wavestream.app.ui.home.CarouselRow>) {
        homeSessionL1Cache[key] = rows
        homeSessionTimestamps[key] = System.currentTimeMillis()
        scope.launch {
            try {
                val json = gson.toJson(rows, carouselRowsType)
                homeSessionCacheDao.put(HomeSessionCacheEntity(key = key, valueJson = json, updatedAt = System.currentTimeMillis()))
            } catch (_: Exception) {}
        }
    }
    
    fun getCarouselRows(key: String): List<it.wavestream.app.ui.home.CarouselRow>? {
        // L1 first
        val cached = homeSessionL1Cache[key]
        if (cached is List<*> && cached.isNotEmpty() && cached[0] is it.wavestream.app.ui.home.CarouselRow) {
            @Suppress("UNCHECKED_CAST")
            return cached as List<it.wavestream.app.ui.home.CarouselRow>
        }
        return null
    }
    
    fun putHeroPair(key: String, hero: it.wavestream.app.ui.home.HeroPairData) {
        homeSessionL1Cache[key] = hero
        homeSessionTimestamps[key] = System.currentTimeMillis()
        scope.launch {
            try {
                val json = gson.toJson(hero, heroPairType)
                homeSessionCacheDao.put(HomeSessionCacheEntity(key = key, valueJson = json, updatedAt = System.currentTimeMillis()))
            } catch (_: Exception) {}
        }
    }
    
    fun getHeroPair(key: String): it.wavestream.app.ui.home.HeroPairData? {
        val cached = homeSessionL1Cache[key]
        if (cached is it.wavestream.app.ui.home.HeroPairData) {
            // Safety: Gson's Unsafe.allocateInstance can create instances with null fields
            // when deserializing old Pair format as HeroPairData
            return try {
                if (cached.heroes != null) cached else null
            } catch (_: Exception) {
                // heroes field is null at JVM level — broken old cache entry
                homeSessionL1Cache.remove(key)
                null
            }
        }
        return null
    }
    
    fun putTimestamp(key: String, value: Long) {
        homeSessionL1Cache[key] = value
        homeSessionTimestamps[key] = System.currentTimeMillis()
        scope.launch {
            try {
                val json = gson.toJson(value, Long::class.java)
                homeSessionCacheDao.put(HomeSessionCacheEntity(key = key, valueJson = json, updatedAt = System.currentTimeMillis()))
            } catch (_: Exception) {}
        }
    }
    
    fun getTimestamp(key: String): Long? {
        val cached = homeSessionL1Cache[key]
        if (cached is Long) return cached
        if (cached is Number) return cached.toLong()
        return null
    }
    
    // =====================================================
    // Serialization helpers (using Gson)
    // =====================================================
    private fun serializeValue(value: Any): String? {
        return try {
            when (value) {
                is String -> gson.toJson(mapOf("type" to "string", "value" to value))
                is Number -> gson.toJson(mapOf("type" to "number", "value" to value))
                is Boolean -> gson.toJson(mapOf("type" to "boolean", "value" to value))
                is List<*> -> gson.toJson(mapOf("type" to "list", "value" to value))
                is Pair<*, *> -> gson.toJson(mapOf("type" to "pair", "first" to value.first, "second" to value.second))
                else -> null
            }
        } catch (e: Exception) {
            null
        }
    }
    
    private fun deserializeValue(json: String): Any? {
        return try {
            val map = gson.fromJson<Map<String, Any>>(json, object : TypeToken<Map<String, Any>>() {}.type)
            when (map["type"]) {
                "string" -> map["value"] as? String
                "number" -> (map["value"] as? Number)?.toDouble()
                "boolean" -> map["value"] as? Boolean
                "list" -> {
                    val rawType = object : TypeToken<List<Map<String, Any>>>() {}.type
                    val rawList = gson.fromJson<List<Map<String, Any>>>(gson.toJson(map["value"]), rawType)
                    // Return as raw list — caller will cast appropriately
                    rawList
                }
                "pair" -> {
                    val first = map["first"]
                    val second = map["second"]
                    Pair(first, second)
                }
                else -> null
            }
        } catch (e: Exception) {
            null
        }
    }
}

