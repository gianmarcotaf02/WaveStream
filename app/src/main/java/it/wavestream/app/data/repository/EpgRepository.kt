package it.wavestream.app.data.repository

import android.util.Log
import it.wavestream.app.data.api.XtreamApiService
import it.wavestream.app.data.api.XtreamEpgListing
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.EPGDao
import it.wavestream.app.data.database.dao.PlaylistDao
import it.wavestream.app.data.database.entity.EPGProgram
import it.wavestream.app.ui.epg.EpgProgram
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.BufferedReader
import java.io.Reader
import java.io.StringReader
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for EPG (Electronic Program Guide) data
 * Supports both XMLTV format and Xtream Codes API
 */
@Singleton
class EpgRepository @Inject constructor(
    @dagger.hilt.android.qualifiers.ApplicationContext private val context: android.content.Context,
    private val playlistDao: PlaylistDao,
    private val channelDao: ChannelDao,
    private val epgDao: EPGDao
) {
    
    companion object {
        private const val TAG = "EpgRepository"
        private const val MAX_PROGRAMS_PER_CHANNEL = 24 // ~today + tomorrow
    }
    
    private val httpClient = OkHttpClient.Builder()
        .connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .readTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
        .writeTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .addNetworkInterceptor { chain ->
            val request = chain.request().newBuilder()
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
                .header("Connection", "close")
                .build()
            chain.proceed(request)
        }
        .build()
    private val epgCache = mutableMapOf<String, List<EpgProgram>>()
    private var lastUpdate: Long = 0
    private val cacheValidityMs = 6 * 60 * 60 * 1000L // 6 hours
    
    private val dateFormat = SimpleDateFormat("yyyyMMddHHmmss Z", Locale.getDefault())
    private val gson = com.google.gson.Gson()
    private val cacheFile = java.io.File(context.filesDir, "epg_cache.json")
    
    init {
        // Disk cache disabled - too large and causes OOM
        // loadCacheFromDisk()
    }
    
    /**
     * Check if cache is valid and not empty
     */
    fun isCacheValid(): Boolean {
        return epgCache.isNotEmpty() && (System.currentTimeMillis() - lastUpdate) < cacheValidityMs
    }

    /**
     * Check if we have programs
     */
    fun hasPrograms(): Boolean = epgCache.isNotEmpty()

    /**
     * Load EPG for all channels from Xtream API
     * Most Xtream servers provide EPG via xmltv.php endpoint
     */
    suspend fun loadEpgFromXtream(baseUrl: String, username: String, password: String, force: Boolean = false) = withContext(Dispatchers.IO) {
        if (!force && isCacheValid()) {
            Log.d(TAG, "EPG cache valid, skipping network load")
            return@withContext
        }
        try {
            // Try loading from XMLTV endpoint (most common method for Xtream servers)
            val xmltvUrl = buildXmltvUrl(baseUrl, username, password)
            Log.d(TAG, "Loading EPG from XMLTV endpoint: $xmltvUrl")
            
            val request = Request.Builder().url(xmltvUrl).build()
            val response = httpClient.newCall(request).execute()
            
            if (response.isSuccessful) {
                response.body?.use { body ->
                    val reader = BufferedReader(body.charStream())
                    reader.mark(2048)
                    val buffer = CharArray(2048)
                    val read = reader.read(buffer)
                    val preview = if (read > 0) String(buffer, 0, read) else ""
                    reader.reset()
                    
                    if (preview.contains("<tv")) {
                        Log.d(TAG, "Got XMLTV response, parsing stream...")
                        parseXmlTv(reader)
                        Log.d(TAG, "EPG loaded from XMLTV: ${epgCache.size} channels cached")
                        lastUpdate = System.currentTimeMillis()
                        persistEpgToRoom() // FASE 4: salva in Room (best-effort)
                        return@withContext
                    } else {
                        Log.w(TAG, "Response does not seem to be XMLTV format (preview: ${preview.take(100)})")
                    }
                }
            }
            
            Log.w(TAG, "XMLTV endpoint failed (HTTP ${response.code}), trying get_short_epg fallback...")
            
            // Fallback to per-channel API if XMLTV fails
            loadEpgViaShortEpgApi(baseUrl, username, password)
            
        } catch (e: Exception) {
            Log.e(TAG, "Error loading Xtream EPG from XMLTV", e)
            // Try fallback
            try {
                loadEpgViaShortEpgApi(baseUrl, username, password)
            } catch (e2: Exception) {
                Log.e(TAG, "Fallback EPG load also failed", e2)
            }
        }
    }
    
    /**
     * Build XMLTV URL for Xtream server
     */
    private fun buildXmltvUrl(baseUrl: String, username: String, password: String): String {
        val base = if (baseUrl.endsWith("/")) baseUrl.dropLast(1) else baseUrl
        return "$base/xmltv.php?username=$username&password=$password"
    }
    
    /**
     * Fallback: Load EPG via get_short_epg API (per channel)
     */
    private suspend fun loadEpgViaShortEpgApi(baseUrl: String, username: String, password: String) {
        Log.d(TAG, "Loading EPG via get_short_epg API...")
        
        val retrofit = Retrofit.Builder()
            .baseUrl(if (baseUrl.endsWith("/")) baseUrl else "$baseUrl/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(httpClient)
            .build()
        
        val api = retrofit.create(XtreamApiService::class.java)
        
        val channels = channelDao.getAllChannelsList()
        var loadedCount = 0
        
        for (channel in channels) {
            val streamId = channel.xtreamStreamId ?: continue
            
            try {
                val epgResponse = api.getShortEpg(
                    username = username,
                    password = password,
                    streamId = streamId,
                    limit = 10
                )
                
                epgResponse.epgListings?.takeIf { it.isNotEmpty() }?.let { listings ->
                    val programs = listings.mapNotNull { listing ->
                        convertXtreamListingToProgram(channel.xtreamEpgChannelId ?: channel.name, listing)
                    }
                    
                    if (programs.isNotEmpty()) {
                        epgCache[channel.xtreamEpgChannelId ?: channel.name] = programs.sortedBy { it.start }
                        epgCache[channel.name] = programs.sortedBy { it.start }
                        loadedCount++
                    }
                }
            } catch (e: Exception) {
                // Skip failed channels
            }
        }
        
        
        lastUpdate = System.currentTimeMillis()
        persistEpgToRoom() // FASE 4: salva in Room (best-effort)
        Log.d(TAG, "EPG via get_short_epg: $loadedCount channels loaded")
    }
    
    /**
     * Load EPG for a single channel from Xtream API
     */
    suspend fun loadEpgForChannel(
        baseUrl: String, 
        username: String, 
        password: String, 
        streamId: Int, 
        channelId: String
    ): List<EpgProgram> = withContext(Dispatchers.IO) {
        try {
            val retrofit = Retrofit.Builder()
                .baseUrl(if (baseUrl.endsWith("/")) baseUrl else "$baseUrl/")
                .addConverterFactory(MoshiConverterFactory.create())
                .client(httpClient)
                .build()
            
            val api = retrofit.create(XtreamApiService::class.java)
            
            val epgResponse = api.getShortEpg(
                username = username,
                password = password,
                streamId = streamId,
                limit = 10
            )
            
            val programs = epgResponse.epgListings?.mapNotNull { listing ->
                convertXtreamListingToProgram(channelId, listing)
            }?.sortedBy { it.start } ?: emptyList()
            
            // Cache it
            if (programs.isNotEmpty()) {
                epgCache[channelId] = programs
            }
            
            return@withContext programs
            
        } catch (e: Exception) {
            Log.e(TAG, "Error loading EPG for channel $channelId", e)
            return@withContext emptyList()
        }
    }
    
    private fun convertXtreamListingToProgram(channelId: String, listing: XtreamEpgListing): EpgProgram? {
        val startTime = listing.startTimestamp?.times(1000) ?: return null
        val endTime = listing.stopTimestamp?.times(1000) ?: return null
        val title = listing.title ?: return null
        
        return EpgProgram(
            channelId = channelId,
            title = title,
            description = listing.description,
            start = startTime,
            end = endTime,
            category = null
        )
    }
    
    /**
     * Load EPG from XMLTV URL
     */
    suspend fun loadEpgFromUrl(url: String, force: Boolean = false) = withContext(Dispatchers.IO) {
        if (!force && isCacheValid()) return@withContext

        try {
            Log.d(TAG, "Loading EPG from: $url")
            
            val request = Request.Builder().url(url).build()
            val response = httpClient.newCall(request).execute()
            
            if (!response.isSuccessful) {
                throw Exception("HTTP ${response.code}")
            }
            
            response.body?.use { body ->
                val reader = BufferedReader(body.charStream())
                parseXmlTv(reader)
            }
            
            lastUpdate = System.currentTimeMillis()
            persistEpgToRoom() // FASE 4: salva in Room (best-effort)
            Log.d(TAG, "EPG loaded: ${epgCache.size} channels")
            
        } catch (e: Exception) {
            Log.e(TAG, "Error loading EPG", e)
        }
    }
    
    /**
     * Get programs for a channel
     */
    suspend fun getProgramsForChannel(channelId: String): List<EpgProgram> {
        loadEpgFromRoomIfEmpty() // FASE 4: se la cache è vuota, prova da Room
        return epgCache[channelId] 
            ?: epgCache[channelId.lowercase()] 
            ?: epgCache[channelId.uppercase()]
            ?: emptyList()
    }
    
    /**
     * Batch lookup: get programs for multiple channels in one call
     * Returns a map of channel ID to programs
     */
    fun getProgramsForChannels(channelIds: Set<String>): Map<String, List<EpgProgram>> {
        return channelIds.associateWith { channelId ->
            epgCache[channelId] 
                ?: epgCache[channelId.lowercase()] 
                ?: epgCache[channelId.uppercase()]
                ?: emptyList()
        }
    }
    
    /**
     * Get programs for a single channel with multiple ID fallbacks
     * Tries each ID format until a match is found
     */
    fun getProgramsForChannelWithFallback(channelIds: List<String>): List<EpgProgram> {
        for (channelId in channelIds) {
            val programs = epgCache[channelId] 
                ?: epgCache[channelId.lowercase()] 
                ?: epgCache[channelId.uppercase()]
            if (programs != null && programs.isNotEmpty()) return programs
        }
        return emptyList()
    }
    
    /**
     * Get current program for a channel
     */
    suspend fun getCurrentProgram(channelId: String): EpgProgram? {
        val programs = getProgramsForChannel(channelId)
        val now = System.currentTimeMillis()
        return programs.find { it.start <= now && it.end > now }
    }
    
    /**
     * Get next program for a channel
     */
    suspend fun getNextProgram(channelId: String): EpgProgram? {
        val programs = getProgramsForChannel(channelId)
        val now = System.currentTimeMillis()
        return programs.find { it.start > now }
    }

    /**
     * FASE 4 — Salva la cache EPG in Room (best-effort).
     * Mappa la chiave della cache (epgChannelId) al channelId DB tramite la lista
     * dei canali; se un canale non è (più) presente, i suoi programmi vengono saltati.
     */
    private suspend fun persistEpgToRoom() {
        try {
            val channelIdMap = channelDao.getAllChannelsList()
                .associate { (it.xtreamEpgChannelId ?: it.name) to it.id }
            epgCache.forEach { (key, programs) ->
                val dbChannelId = channelIdMap[key] ?: return@forEach
                val entities = programs.map { p ->
                    EPGProgram(
                        channelId = dbChannelId,
                        epgChannelId = key,
                        title = p.title,
                        description = p.description,
                        startTime = p.start,
                        endTime = p.end,
                        category = p.category
                    )
                }
                if (entities.isNotEmpty()) {
                    epgDao.deleteByChannel(dbChannelId)
                    epgDao.insertAll(entities)
                }
            }
        } catch (e: Exception) {
            Log.w(TAG, "EPG persist to Room failed", e)
        }
    }

    /**
     * FASE 4 — Carica da Room nella cache in memoria se è vuota (best-effort).
     * Serve per ripristinare l'EPG dopo il riavvio senza rifare il fetch di rete.
     */
    private suspend fun loadEpgFromRoomIfEmpty() {
        if (epgCache.isNotEmpty()) return
        try {
            val all = epgDao.getAllPrograms()
            if (all.isNotEmpty()) {
                epgCache.clear()
                all.groupBy { it.epgChannelId }.forEach { (key, list) ->
                    epgCache[key] = list.map { e ->
                        EpgProgram(
                            channelId = e.epgChannelId,
                            title = e.title,
                            description = e.description,
                            start = e.startTime,
                            end = e.endTime,
                            category = e.category
                        )
                    }
                }
                lastUpdate = System.currentTimeMillis()
            }
        } catch (e: Exception) {
            Log.w(TAG, "EPG load from Room failed", e)
        }
    }
    
    /**
     * Parse XMLTV format
     */
    /**
     * Parse XMLTV format from a Reader stream
     */
    private fun parseXmlTv(reader: Reader) {
        val tempCache = mutableMapOf<String, MutableList<EpgProgram>>()
        try {
            val factory = XmlPullParserFactory.newInstance()
            val parser = factory.newPullParser()
            parser.setInput(reader)
            
            var eventType = parser.eventType
            var currentChannelId: String? = null
            var currentTitle: String? = null
            var currentDesc: String? = null
            var currentStart: Long? = null
            var currentEnd: Long? = null
            var currentCategory: String? = null
            var inTitle = false
            var inDesc = false
            var inCategory = false
            
            while (eventType != XmlPullParser.END_DOCUMENT) {
                when (eventType) {
                    XmlPullParser.START_TAG -> {
                        when (parser.name) {
                            "programme" -> {
                                currentChannelId = parser.getAttributeValue(null, "channel")
                                val startStr = parser.getAttributeValue(null, "start")
                                val stopStr = parser.getAttributeValue(null, "stop")
                                currentStart = parseEpgDate(startStr)
                                currentEnd = parseEpgDate(stopStr)
                            }
                            "title" -> inTitle = true
                            "desc" -> inDesc = true
                            "category" -> inCategory = true
                        }
                    }
                    XmlPullParser.TEXT -> {
                        val text = parser.text?.trim()
                        when {
                            inTitle -> currentTitle = text
                            inDesc -> currentDesc = text
                            inCategory -> currentCategory = text
                        }
                    }
                    XmlPullParser.END_TAG -> {
                        when (parser.name) {
                            "title" -> inTitle = false
                            "desc" -> inDesc = false
                            "category" -> inCategory = false
                            "programme" -> {
                                if (currentChannelId != null && currentTitle != null && 
                                    currentStart != null && currentEnd != null) {
                                    
                                    val now = System.currentTimeMillis()
                                    val cutoff24h = now + (24 * 60 * 60 * 1000L)
                                    
                                    if (currentEnd > now && currentStart < cutoff24h) {
                                        val program = EpgProgram(
                                            channelId = currentChannelId,
                                            title = currentTitle,
                                            description = currentDesc,
                                            start = currentStart,
                                            end = currentEnd,
                                            category = currentCategory
                                        )
                                        tempCache.getOrPut(currentChannelId) { mutableListOf() }.add(program)
                                    }
                                }
                                
                                // Reset
                                currentChannelId = null
                                currentTitle = null
                                currentDesc = null
                                currentStart = null
                                currentEnd = null
                                currentCategory = null
                            }
                        }
                    }
                }
                eventType = parser.next()
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing XMLTV (partial parsing may have succeeded)", e)
        } finally {
            var savedChannelsCount = 0
            for ((channelId, programs) in tempCache) {
                if (programs.isNotEmpty()) {
                    val existing = epgCache[channelId]?.toMutableList() ?: mutableListOf()
                    existing.addAll(programs)
                    epgCache[channelId] = existing.sortedBy { it.start }
                    savedChannelsCount++
                }
            }
            Log.d(TAG, "Streaming parser finished. Cached programs for $savedChannelsCount channels.")
        }
    }
    
    private fun parseEpgDate(dateStr: String?): Long? {
        if (dateStr.isNullOrEmpty()) return null
        
        return try {
            dateFormat.parse(dateStr)?.time
        } catch (e: Exception) {
            try {
                // Try without timezone
                SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault())
                    .parse(dateStr.take(14))?.time
            } catch (e2: Exception) {
                null
            }
        }
    }
    
    /**
     * Clear EPG cache
     */
    fun clearCache() {
        epgCache.clear()
        lastUpdate = 0
        if (cacheFile.exists()) {
            cacheFile.delete()
        }
    }
    
    private fun saveCacheToDisk() {
        try {
            // Use streaming JSON writer to avoid OOM
            java.io.FileWriter(cacheFile).use { fileWriter ->
                com.google.gson.stream.JsonWriter(fileWriter).use { writer ->
                    writer.beginObject()
                    for ((channelId, programs) in epgCache) {
                        writer.name(channelId)
                        writer.beginArray()
                        for (program in programs) {
                            writer.beginObject()
                            writer.name("channelId").value(program.channelId)
                            writer.name("title").value(program.title)
                            writer.name("description").value(program.description)
                            writer.name("start").value(program.start)
                            writer.name("end").value(program.end)
                            writer.name("category").value(program.category)
                            writer.endObject()
                        }
                        writer.endArray()
                    }
                    writer.endObject()
                }
            }
            
            // Also save timestamp
            val metaFile = java.io.File(context.filesDir, "epg_meta.json")
            metaFile.writeText("{\"lastUpdate\": $lastUpdate}")
            Log.d(TAG, "EPG saved to disk: ${epgCache.size} channels")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to save EPG to disk", e)
        }
    }
    
    private fun loadCacheFromDisk() {
        try {
            if (!cacheFile.exists()) return
            
            // If cache file is too large (> 50MB), delete it - it will cause OOM
            val fileSizeMB = cacheFile.length() / (1024 * 1024)
            if (fileSizeMB > 50) {
                Log.w(TAG, "EPG cache file too large (${fileSizeMB}MB), deleting...")
                cacheFile.delete()
                return
            }
            
            // Use streaming JsonReader to avoid OOM
            java.io.FileReader(cacheFile).use { fileReader ->
                com.google.gson.stream.JsonReader(fileReader).use { reader ->
                    reader.beginObject()
                    while (reader.hasNext()) {
                        val channelId = reader.nextName()
                        val programs = mutableListOf<EpgProgram>()
                        
                        reader.beginArray()
                        while (reader.hasNext()) {
                            var pChannelId = ""
                            var pTitle = ""
                            var pDescription: String? = null
                            var pStart = 0L
                            var pEnd = 0L
                            var pCategory: String? = null
                            
                            reader.beginObject()
                            while (reader.hasNext()) {
                                when (reader.nextName()) {
                                    "channelId" -> pChannelId = reader.nextString()
                                    "title" -> pTitle = reader.nextString()
                                    "description" -> pDescription = if (reader.peek() == com.google.gson.stream.JsonToken.NULL) { reader.nextNull(); null } else reader.nextString()
                                    "start" -> pStart = reader.nextLong()
                                    "end" -> pEnd = reader.nextLong()
                                    "category" -> pCategory = if (reader.peek() == com.google.gson.stream.JsonToken.NULL) { reader.nextNull(); null } else reader.nextString()
                                    else -> reader.skipValue()
                                }
                            }
                            reader.endObject()
                            
                            programs.add(EpgProgram(pChannelId, pTitle, pDescription, pStart, pEnd, pCategory))
                        }
                        reader.endArray()
                        
                        if (programs.isNotEmpty()) {
                            epgCache[channelId] = programs
                        }
                    }
                    reader.endObject()
                }
            }
            
            // Load timestamp
            val metaFile = java.io.File(context.filesDir, "epg_meta.json")
            if (metaFile.exists()) {
                val metaJson = metaFile.readText()
                val meta = gson.fromJson(metaJson, Map::class.java)
                @Suppress("UNCHECKED_CAST")
                lastUpdate = (meta as? Map<String, Double>)?.get("lastUpdate")?.toLong() ?: 0L
            }
            
            Log.d(TAG, "Loaded EPG from disk: ${epgCache.size} channels")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to load EPG from disk, clearing cache", e)
            // If parsing fails, delete the corrupted cache
            try { cacheFile.delete() } catch (ignored: Exception) {}
        }
    }
}
