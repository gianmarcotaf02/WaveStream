package it.wavestream.app.data.repository

import android.util.Log
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.dao.*
import it.wavestream.app.data.database.entity.*
import it.wavestream.app.data.parser.ContentNameParser
import it.wavestream.app.data.parser.M3UParser
import it.wavestream.app.data.parser.XtreamParser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.async
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.BufferedInputStream
import java.io.EOFException
import java.io.IOException
import java.net.InetSocketAddress
import java.net.ProtocolException
import java.net.Socket
import java.net.URL
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for playlist management
 */
@Singleton
class PlaylistRepository @Inject constructor(
    private val playlistDao: PlaylistDao,
    private val channelDao: ChannelDao,
    private val movieDao: MovieDao,
    private val seriesDao: SeriesDao,
    private val episodeDao: EpisodeDao,
    private val categoryDao: CategoryDao,
    private val m3uParser: M3UParser,
    private val xtreamParser: XtreamParser,
    private val contentNameParser: ContentNameParser,
    private val contentCache: ContentCache
) {
    companion object {
        private const val TAG = "PlaylistRepo"
    }
    
    private val httpClient = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(120, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        // Nota: NIENTE header Accept-Encoding: identity. Lasciando che OkHttp richieda
        // gzip, il server comprime le risposte (la lista VOD passa da ~27MB a ~2-3MB)
        // e non tronca più la connessione a metà. OkHttp decomprime in trasparenza.
        .build()
    
    /**
     * Add M3U playlist by URL
     */
    suspend fun addM3UPlaylist(name: String, url: String): Long = withContext(Dispatchers.IO) {
        Log.d(TAG, "Adding M3U playlist: $name from $url")
        
        val playlist = Playlist(
            name = name,
            url = url,
            type = "m3u",
            lastUpdated = System.currentTimeMillis()
        )
        
        val playlistId = playlistDao.insert(playlist)
        val content = downloadContent(url)
        val parseResult = m3uParser.parseContent(content, playlistId)
        
        saveCategories(playlistId, parseResult)
        saveChannels(playlistId, parseResult.channels)
        saveMovies(playlistId, parseResult.movies)
        saveSeries(playlistId, parseResult.series)
        
        playlistDao.updateCounts(
            playlistId, 
            parseResult.channels.size, 
            parseResult.movies.size, 
            parseResult.series.size
        )
        
        // Content changed: the home session cache holds item ids that may now be stale.
        contentCache.clearHomeSessionData()
        
        playlistId
    }
    
    /**
     * Add Xtream playlist by credentials
     */
    suspend fun addXtreamPlaylist(
        name: String,
        server: String,
        username: String,
        password: String
    ): Long = withContext(Dispatchers.IO) {
        val baseUrl = server.trimEnd('/')
        val playerApiUrl = "$baseUrl/player_api.php?username=$username&password=$password"
        val authResponse = downloadContent(playerApiUrl)
        if (authResponse.contains("\"auth\":0") || authResponse.contains("Unauthorized")) {
            throw Exception("Credenziali Xtream non valide")
        }
        
        val playlist = Playlist(
            name = name,
            url = baseUrl,
            type = "xtream",
            username = username,
            password = password,
            lastUpdated = System.currentTimeMillis()
        )
        
        val playlistId = playlistDao.insert(playlist)
        loadXtreamContent(playlistId, baseUrl, username, password)
        
        // Content changed: invalidate the home session cache (ids may have shifted).
        contentCache.clearHomeSessionData()
        
        playlistId
    }
    
    /**
     * Refresh playlist content - preserves movie/series IDs to keep WatchProgress valid
     */
    suspend fun refreshPlaylist(playlistId: Long) = withContext(Dispatchers.IO) {
        val playlist = playlistDao.getPlaylistById(playlistId) ?: return@withContext
        
        when (playlist.type) {
            "m3u" -> {
                val content = downloadContent(playlist.url)
                val result = m3uParser.parseContent(content, playlistId)
                
                // SAFETY GUARD: don't wipe content if the M3U parses to nothing
                // (dead URL, changed format, ...) while the DB still has content.
                if (result.channels.isEmpty() && result.movies.isEmpty() && result.series.isEmpty()) {
                    val hasExisting = movieDao.getAllMoviesList().any { it.playlistId == playlistId } ||
                        seriesDao.getAllSeriesList().any { it.playlistId == playlistId } ||
                        channelDao.getAllChannelsList().any { it.playlistId == playlistId }
                    if (hasExisting) {
                        Log.e(TAG, "refreshPlaylist M3U ABORTED: empty parse while DB has content — refusing to wipe")
                        throw Exception("M3U vuota o non valida: refresh annullato per non perdere i contenuti")
                    }
                }
                
                movieDao.deleteByPlaylist(playlistId)
                seriesDao.deleteByPlaylist(playlistId)
                channelDao.deleteByPlaylist(playlistId)
                categoryDao.deleteByPlaylist(playlistId)
                
                saveCategories(playlistId, result)
                saveChannels(playlistId, result.channels)
                saveMovies(playlistId, result.movies)
                saveSeries(playlistId, result.series)
                
                playlistDao.updateCounts(
                    playlistId,
                    result.channels.size,
                    result.movies.size,
                    result.series.size
                )
            }
            "xtream" -> {
                refreshXtreamContent(
                    playlistId,
                    playlist.url,
                    playlist.username ?: "",
                    playlist.password ?: ""
                )
            }
        }
        
        playlistDao.updateLastUpdated(playlistId, System.currentTimeMillis())
        
        // Content may have changed (M3U re-inserts with new ids, Xtream removes gone items):
        // the home session cache would keep showing stale ids for up to 10 days.
        contentCache.clearHomeSessionData()
    }
    
    /**
     * Delete playlist and all content
     */
    suspend fun deletePlaylist(playlistId: Long) = withContext(Dispatchers.IO) {
        val seriesInPlaylist = seriesDao.getAllSeriesList().filter { it.playlistId == playlistId }
        if (seriesInPlaylist.isNotEmpty()) {
            episodeDao.deleteBySeriesIds(seriesInPlaylist.map { it.id })
        }
        channelDao.deleteByPlaylist(playlistId)
        movieDao.deleteByPlaylist(playlistId)
        seriesDao.deleteByPlaylist(playlistId)
        categoryDao.deleteByPlaylist(playlistId)
        playlistDao.deleteById(playlistId)
        
        // Playlist gone: drop the cached home rows referencing its content.
        contentCache.clearHomeSessionData()
    }
    
    /**
     * Load episodes for a series on-demand from Xtream API
     */
    suspend fun loadSeriesEpisodes(seriesId: Long, forceRefresh: Boolean = false): Boolean = withContext(Dispatchers.IO) {
        val series = seriesDao.getSeriesById(seriesId) ?: return@withContext false
        val xtreamSeriesId = series.xtreamSeriesId ?: return@withContext false
        
        val existingCount = episodeDao.getCountBySeries(seriesId)
        if (existingCount > 0 && !forceRefresh) return@withContext true
        if (forceRefresh && existingCount > 0) episodeDao.deleteBySeries(seriesId)
        
        val playlist = playlistDao.getPlaylistById(series.playlistId) ?: return@withContext false
        if (playlist.type != "xtream") return@withContext false
        
        val baseUrl = playlist.url.trimEnd('/')
        val username = playlist.username ?: return@withContext false
        val password = playlist.password ?: return@withContext false
        
        try {
            val apiUrl = "$baseUrl/player_api.php?username=$username&password=$password&action=get_series_info&series_id=$xtreamSeriesId"
            val response = downloadContent(apiUrl)
            val seriesInfoResult = xtreamParser.parseSeriesInfo(response)
            if (seriesInfoResult == null) return@withContext false
            
            // Save info back to Series DB
            val info = seriesInfoResult.info
            if (info != null) {
                seriesDao.update(series.copy(
                    xtreamPlot = info.plot ?: series.xtreamPlot,
                    xtreamCast = info.cast ?: series.xtreamCast,
                    xtreamDirector = info.director ?: series.xtreamDirector,
                    xtreamGenre = info.genre ?: series.xtreamGenre,
                    xtreamRating = info.rating ?: series.xtreamRating
                ))
            }
            
            val episodeEntities = mutableListOf<Episode>()
            seriesInfoResult.episodes?.forEach { (seasonKey, episodeList) ->
                val seasonNum = seasonKey.toIntOrNull() ?: 1
                episodeList.forEach { ep ->
                    val episodeNum = ep.episodeNum.takeIf { it > 0 } ?: return@forEach
                    val episodeId = ep.id.toIntOrNull() ?: return@forEach
                    val extension = ep.extension ?: "mp4"
                    val streamUrl = "$baseUrl/series/$username/$password/$episodeId.$extension"
                    
                    episodeEntities.add(Episode(
                        seriesId = seriesId,
                        name = ep.title ?: "Episode $episodeNum",
                        streamUrl = streamUrl,
                        seasonNumber = seasonNum,
                        episodeNumber = episodeNum,
                        xtreamEpisodeId = episodeId,
                        containerExtension = extension,
                        thumbnailUrl = ep.info?.image,
                        plot = ep.info?.plot,
                        duration = ep.info?.durationSecs?.toLong()
                    ))
                }
            }
            
            if (episodeEntities.isNotEmpty()) {
                episodeDao.insertAll(episodeEntities)
                val latest = episodeEntities.maxByOrNull { it.episodeNumber * 100 + it.seasonNumber }
                if (latest != null) {
                    if (series.latestEpisodeSeason != latest.seasonNumber || 
                        series.latestEpisodeNumber != latest.episodeNumber) {
                        seriesDao.update(series.copy(
                            latestEpisodeSeason = latest.seasonNumber,
                            latestEpisodeNumber = latest.episodeNumber,
                            latestEpisodeAddedAt = System.currentTimeMillis()
                        ))
                    }
                }
            }
            return@withContext episodeEntities.isNotEmpty()
        } catch (e: Exception) {
            Log.e(TAG, "Error loading episodes for series ${series.name}", e)
            return@withContext false
        }
    }
    
    private suspend fun downloadContent(url: String): String = withContext(Dispatchers.IO) {
        val action = url.substringAfter("action=").substringBefore("&")
        val request = Request.Builder().url(url).build()
        try {
            httpClient.newCall(request).execute().use { response ->
                if (!response.isSuccessful) throw IOException("HTTP ${response.code}")
                val body = response.body?.string() ?: ""
                Log.d(TAG, "downloadContent OK via OkHttp: $action -> ${body.length} chars")
                body
            }
        } catch (e: EOFException) {
            Log.w(TAG, "OkHttp EOFException for $action, trying raw socket fallback")
            val result = downloadViaRawSocket(url)
            Log.d(TAG, "downloadContent OK via raw socket: $action -> ${result.length} chars")
            result
        } catch (e: ProtocolException) {
            Log.w(TAG, "OkHttp ProtocolException for $action, trying raw socket fallback")
            val result = downloadViaRawSocket(url)
            Log.d(TAG, "downloadContent OK via raw socket: $action -> ${result.length} chars")
            result
        } catch (e: IOException) {
            Log.w(TAG, "OkHttp failed for $action: ${e.message}, retrying...")
            try {
                httpClient.newCall(request).execute().use { response ->
                    if (!response.isSuccessful) throw IOException("HTTP ${response.code}")
                    val body = response.body?.string() ?: ""
                    Log.d(TAG, "downloadContent OK via retry: $action -> ${body.length} chars")
                    body
                }
            } catch (e2: EOFException) {
                Log.w(TAG, "Retry also EOFException for $action, trying raw socket fallback")
                val result = downloadViaRawSocket(url)
                Log.d(TAG, "downloadContent OK via raw socket: $action -> ${result.length} chars")
                result
            } catch (e2: ProtocolException) {
                Log.w(TAG, "Retry also ProtocolException for $action, trying raw socket fallback")
                val result = downloadViaRawSocket(url)
                Log.d(TAG, "downloadContent OK via raw socket: $action -> ${result.length} chars")
                result
            } catch (e2: IOException) {
                Log.w(TAG, "Retry also failed for $action: ${e2.message}, trying raw socket fallback")
                val result = downloadViaRawSocket(url)
                Log.d(TAG, "downloadContent OK via raw socket: $action -> ${result.length} chars")
                result
            }
        }
    }

    private fun downloadViaRawSocket(urlString: String): String {
        val url = URL(urlString)
        val host = url.host
        val port = if (url.port > 0) url.port else 80
        val path = url.file
        val action = urlString.substringAfter("action=").substringBefore("&")

        Socket().use { socket ->
            socket.connect(InetSocketAddress(host, port), 30000)
            socket.soTimeout = 120000

            val output = socket.getOutputStream()
            val requestBytes = buildString {
                append("GET $path HTTP/1.0\r\n")
                append("Host: $host${if (url.port > 0) ":${url.port}" else ""}\r\n")
                append("User-Agent: okhttp/4.12.0\r\n")
                append("Accept: application/json, */*\r\n")
                append("Accept-Encoding: identity\r\n")
                append("\r\n")
            }.toByteArray(Charsets.UTF_8)
            output.write(requestBytes)
            output.flush()

            val input = BufferedInputStream(socket.getInputStream())
            val responseBytes = input.readAllBytes()
            val responseStr = String(responseBytes, Charsets.UTF_8)

            val headerEnd = responseStr.indexOf("\r\n\r\n")
            if (headerEnd == -1) {
                Log.e(TAG, "downloadViaRawSocket: Invalid HTTP response for $action (${responseBytes.size} bytes)")
                throw IOException("Invalid HTTP response from raw socket")
            }

            val statusLine = responseStr.substringBefore("\r\n")
            if (!statusLine.contains(" 200 ")) {
                Log.e(TAG, "downloadViaRawSocket: HTTP status not OK for $action: $statusLine")
                throw IOException("HTTP status not OK: $statusLine")
            }

            val headers = responseStr.substring(0, headerEnd)
            var body = responseStr.substring(headerEnd + 4)

            if (headers.contains("Transfer-Encoding: chunked", ignoreCase = true)) {
                body = dechunkBody(body)
            }

            Log.d(TAG, "downloadViaRawSocket: OK for $action -> ${body.length} chars")
            return body
        }
    }

    private fun dechunkBody(body: String): String {
        var remaining = body
        val result = StringBuilder()
        while (remaining.isNotEmpty()) {
            val crlf = remaining.indexOf("\r\n")
            if (crlf == -1) return body
            val chunkSize = remaining.substring(0, crlf).toIntOrNull(16) ?: return body
            if (chunkSize == 0) return result.toString()
            val chunkStart = crlf + 2
            if (chunkStart + chunkSize > remaining.length) return body
            result.append(remaining.substring(chunkStart, chunkStart + chunkSize))
            remaining = remaining.substring(chunkStart + chunkSize + 2)
        }
        return result.toString()
    }

    private suspend fun safeDownload(url: String): String {
        return try {
            val result = downloadContent(url)
            Log.d(TAG, "safeDownload OK: ${url.substringAfter("action=")} -> ${result.length} chars, starts='${result.take(80)}'")
            result
        } catch (e: Exception) {
            Log.e(TAG, "safeDownload FAILED: ${url.substringAfter("action=")} -> ${e.javaClass.simpleName}: ${e.message?.take(200)}")
            "[]"
        }
    }
    
    private suspend fun loadXtreamContent(
        playlistId: Long,
        baseUrl: String,
        username: String,
        password: String
    ) = withContext(Dispatchers.IO) {
        val apiBase = "$baseUrl/player_api.php?username=$username&password=$password"
        try {
            val liveCatsDeferred = async { safeDownload("$apiBase&action=get_live_categories") }
            val liveStreamsDeferred = async { safeDownload("$apiBase&action=get_live_streams") }
            val vodCatsDeferred = async { safeDownload("$apiBase&action=get_vod_categories") }
            val vodStreamsDeferred = async { safeDownload("$apiBase&action=get_vod_streams") }
            val seriesCatsDeferred = async { safeDownload("$apiBase&action=get_series_categories") }
            val seriesListDeferred = async { safeDownload("$apiBase&action=get_series") }
            
            val liveCatsJson = liveCatsDeferred.await()
            val liveStreamsJson = liveStreamsDeferred.await()
            val vodCatsJson = vodCatsDeferred.await()
            val vodStreamsJson = vodStreamsDeferred.await()
            val seriesCatsJson = seriesCatsDeferred.await()
            val seriesListJson = seriesListDeferred.await()
            
            val liveCategories = xtreamParser.parseLiveCategories(liveCatsJson)
            val liveStreams = xtreamParser.parseLiveStreams(liveStreamsJson)
            val vodCategories = xtreamParser.parseVodCategories(vodCatsJson)
            val vodStreams = xtreamParser.parseVodStreams(vodStreamsJson)
            val seriesCategories = xtreamParser.parseSeriesCategories(seriesCatsJson)
            val seriesList = xtreamParser.parseSeries(seriesListJson)
            Log.d(TAG, "loadXtreamContent DIAGNOSTIC: seriesCatsJson=${seriesCatsJson.length} chars, seriesListJson=${seriesListJson.length} chars")
            Log.d(TAG, "loadXtreamContent DIAGNOSTIC: parsed seriesCategories=${seriesCategories.size}, parsed seriesList=${seriesList.size}")
            if (seriesList.isNotEmpty()) {
                Log.d(TAG, "loadXtreamContent DIAGNOSTIC: first 3 series: ${seriesList.take(3).map { "${it.name} (id=${it.id}, cat=${it.categoryId})" }}")
            }
            if (seriesCategories.isNotEmpty()) {
                Log.d(TAG, "loadXtreamContent DIAGNOSTIC: first 3 series categories: ${seriesCategories.take(3).map { "${it.name} (id=${it.id})" }}")
            }

            val liveCategoryMap = liveCategories.associate { it.id to it.name }
            categoryDao.insertAll(liveCategories.map { Category(playlistId = playlistId, name = it.name, type = CategoryType.LIVE_TV, externalId = it.id) })
            channelDao.insertAll(liveStreams.map { stream ->
                Channel(
                    playlistId = playlistId,
                    name = stream.name,
                    streamUrl = "$baseUrl/live/$username/$password/${stream.id}.ts",
                    logoUrl = stream.logo,
                    category = liveCategoryMap[stream.categoryId] ?: "Uncategorized",
                    categoryId = stream.categoryId,
                    xtreamStreamId = stream.id,
                    xtreamEpgChannelId = stream.epgId,
                    hasCatchup = stream.hasArchive > 0
                )
            })
            
            val vodCategoryMap = vodCategories.associate { it.id to contentNameParser.normalizeMovieCategory(it.name) }
            categoryDao.insertAll(vodCategories.map { Category(playlistId = playlistId, name = contentNameParser.normalizeMovieCategory(it.name), type = CategoryType.MOVIE, externalId = it.id) })
            movieDao.insertAll(vodStreams.mapIndexed { index, vod ->
                Movie(
                    playlistId = playlistId,
                    name = vod.name,
                    streamUrl = "$baseUrl/movie/$username/$password/${vod.id}.${vod.extension ?: "mp4"}",
                    logoUrl = vod.poster,
                    xtreamBackdropUrl = vod.backdrop,
                    category = vodCategoryMap[vod.categoryId] ?: "Uncategorized",
                    categoryId = vod.categoryId,
                    xtreamStreamId = vod.id,
                    containerExtension = vod.extension,
                    year = vod.year?.toIntOrNull(),
                    xtreamRating = vod.rating,
                    playlistOrder = (vod.added ?: index.toLong()).toInt()
                )
            })
            
            val seriesCategoryMap = seriesCategories.associate { it.id to contentNameParser.normalizeSeriesCategory(it.name) }
            categoryDao.insertAll(seriesCategories.map { Category(playlistId = playlistId, name = contentNameParser.normalizeSeriesCategory(it.name), type = CategoryType.SERIES, externalId = it.id) })
            val filteredSeries = seriesList.filter { !it.name.equals("Test Serie", true) && !it.name.equals("Test Series", true) }
            Log.d(TAG, "loadXtreamContent DIAGNOSTIC: filteredSeries=${filteredSeries.size} (removed ${seriesList.size - filteredSeries.size} test items)")
            seriesDao.insertAll(filteredSeries.mapIndexed { index, ser ->
                Series(
                    playlistId = playlistId,
                    name = ser.name,
                    logoUrl = ser.poster,
                    xtreamBackdropUrl = ser.backdrop,
                    category = seriesCategoryMap[ser.categoryId] ?: "Uncategorized",
                    categoryId = ser.categoryId,
                    xtreamSeriesId = ser.id,
                    xtreamRating = ser.rating,
                    xtreamPlot = ser.plot,
                    xtreamCast = ser.cast,
                    xtreamDirector = ser.director,
                    xtreamGenre = ser.genre,
                    playlistOrder = (ser.added ?: index.toLong()).toInt(),
                    tmdbId = ser.tmdbId
                )
            })
            
            playlistDao.updateCounts(playlistId, liveStreams.size, vodStreams.size, filteredSeries.size)
            Log.d(TAG, "loadXtreamContent FINAL: live=${liveStreams.size}, vod=${vodStreams.size}, series=${filteredSeries.size} inserted into DB")
        } catch (e: Exception) {
            Log.e(TAG, "Error loading Xtream content", e)
            throw Exception("Errore nel caricamento dei contenuti Xtream: ${e.message}")
        }
    }
    
    private suspend fun refreshXtreamContent(
        playlistId: Long,
        baseUrl: String,
        username: String,
        password: String
    ) = withContext(Dispatchers.IO) {
        val apiBase = "$baseUrl/player_api.php?username=$username&password=$password"
        try {
            val liveCatsDeferred = async { safeDownload("$apiBase&action=get_live_categories") }
            val liveStreamsDeferred = async { safeDownload("$apiBase&action=get_live_streams") }
            val vodCatsDeferred = async { safeDownload("$apiBase&action=get_vod_categories") }
            val vodStreamsDeferred = async { safeDownload("$apiBase&action=get_vod_streams") }
            val seriesCatsDeferred = async { safeDownload("$apiBase&action=get_series_categories") }
            val seriesListDeferred = async { safeDownload("$apiBase&action=get_series") }
            
            val liveCatsJson = liveCatsDeferred.await()
            val liveStreamsJson = liveStreamsDeferred.await()
            val vodCatsJson = vodCatsDeferred.await()
            val vodStreamsJson = vodStreamsDeferred.await()
            val seriesCatsJson = seriesCatsDeferred.await()
            val seriesListJson = seriesListDeferred.await()
            
            val liveCategories = xtreamParser.parseLiveCategories(liveCatsJson)
            val liveStreams = xtreamParser.parseLiveStreams(liveStreamsJson)
            val vodCategories = xtreamParser.parseVodCategories(vodCatsJson)
            val vodStreams = xtreamParser.parseVodStreams(vodStreamsJson)
            val seriesCategories = xtreamParser.parseSeriesCategories(seriesCatsJson)
            val seriesList = xtreamParser.parseSeries(seriesListJson)
            Log.d(TAG, "refreshXtreamContent DIAGNOSTIC: seriesCatsJson=${seriesCatsJson.length} chars, seriesListJson=${seriesListJson.length} chars")
            Log.d(TAG, "refreshXtreamContent DIAGNOSTIC: parsed seriesCategories=${seriesCategories.size}, parsed seriesList=${seriesList.size}")
            if (seriesList.isNotEmpty()) {
                Log.d(TAG, "refreshXtreamContent DIAGNOSTIC: first 3 series: ${seriesList.take(3).map { "${it.name} (id=${it.id}, cat=${it.categoryId})" }}")
            }

            // SAFETY GUARD: if the API returned empty lists everywhere while the DB
            // still has content for this playlist, abort instead of wiping everything
            // (e.g. expired credentials, empty response, server error).
            if (liveStreams.isEmpty() && vodStreams.isEmpty() && seriesList.isEmpty()) {
                val hasExistingContent = channelDao.getAllChannelsList().any { it.playlistId == playlistId } ||
                    movieDao.getAllMoviesList().any { it.playlistId == playlistId } ||
                    seriesDao.getAllSeriesList().any { it.playlistId == playlistId }
                if (hasExistingContent) {
                    Log.e(TAG, "refreshXtreamContent ABORTED: API empty (channels=${liveStreams.size}, vod=${vodStreams.size}, series=${seriesList.size}) but DB has content — refusing to wipe")
                    throw Exception("API Xtream ha risposto vuota: refresh annullato per non perdere i contenuti")
                }
            }
            
            categoryDao.deleteByPlaylistAndType(playlistId, CategoryType.LIVE_TV)
            channelDao.deleteByPlaylist(playlistId)
            val liveCategoryMap = liveCategories.associate { it.id to it.name }
            val liveCategoryEntities = liveCategories.map { Category(playlistId = playlistId, name = it.name, type = CategoryType.LIVE_TV, externalId = it.id) }
            val channelEntities = liveStreams.map { stream ->
                Channel(
                    playlistId = playlistId,
                    name = stream.name,
                    streamUrl = "$baseUrl/live/$username/$password/${stream.id}.ts",
                    logoUrl = stream.logo,
                    category = liveCategoryMap[stream.categoryId] ?: "Uncategorized",
                    categoryId = stream.categoryId,
                    xtreamStreamId = stream.id,
                    xtreamEpgChannelId = stream.epgId,
                    hasCatchup = stream.hasArchive > 0
                )
            }
            categoryDao.insertAll(liveCategoryEntities)
            channelDao.insertAll(channelEntities)

            val currentMovies = movieDao.getAllMoviesList().filter { it.playlistId == playlistId }
            val currentMovieMap = currentMovies.associateBy { it.xtreamStreamId }
            categoryDao.deleteByPlaylistAndType(playlistId, CategoryType.MOVIE)
            val vodCategoryMap = vodCategories.associate { it.id to contentNameParser.normalizeMovieCategory(it.name) }
            val movieCategoryEntities = vodCategories.map { Category(playlistId = playlistId, name = contentNameParser.normalizeMovieCategory(it.name), type = CategoryType.MOVIE, externalId = it.id) }
            categoryDao.insertAll(movieCategoryEntities)
            
            val moviesToInsert = mutableListOf<Movie>()
            val moviesToUpdate = mutableListOf<Movie>()
            val moviesToDelete = mutableListOf<Movie>()
            val seenXtreamIds = mutableSetOf<Int>()

            vodStreams.forEachIndexed { index, vod ->
                val xtreamId = vod.id
                if (xtreamId != null) {
                    seenXtreamIds.add(xtreamId)
                    val existing = currentMovieMap[xtreamId]
                    val categoryName = vodCategoryMap[vod.categoryId] ?: "Uncategorized"
                    val streamUrl = "$baseUrl/movie/$username/$password/${vod.id}.${vod.extension ?: "mp4"}"
                    val playlistOrder = (vod.added ?: index.toLong()).toInt()
                    
                    if (existing != null) {
                        if (existing.name != vod.name || existing.logoUrl != vod.poster || existing.category != categoryName || existing.streamUrl != streamUrl) {
                            moviesToUpdate.add(existing.copy(
                                name = vod.name, streamUrl = streamUrl, logoUrl = vod.poster, xtreamBackdropUrl = vod.backdrop,
                                category = categoryName, categoryId = vod.categoryId, containerExtension = vod.extension,
                                year = vod.year?.toIntOrNull(), xtreamRating = vod.rating, playlistOrder = playlistOrder
                            ))
                        }
                    } else {
                        moviesToInsert.add(Movie(
                            playlistId = playlistId, name = vod.name, streamUrl = streamUrl, logoUrl = vod.poster, xtreamBackdropUrl = vod.backdrop,
                            category = categoryName, categoryId = vod.categoryId, xtreamStreamId = vod.id,
                            containerExtension = vod.extension, year = vod.year?.toIntOrNull(), xtreamRating = vod.rating, playlistOrder = playlistOrder
                        ))
                    }
                }
            }
            currentMovies.forEach { if (it.xtreamStreamId != null && !seenXtreamIds.contains(it.xtreamStreamId)) moviesToDelete.add(it) }
            movieDao.deleteList(moviesToDelete)
            movieDao.updateList(moviesToUpdate)
            movieDao.insertAll(moviesToInsert)

            val currentSeries = seriesDao.getAllSeriesList().filter { it.playlistId == playlistId }
            val currentSeriesMap = currentSeries.associateBy { it.xtreamSeriesId }
            categoryDao.deleteByPlaylistAndType(playlistId, CategoryType.SERIES)
            val seriesCategoryMap = seriesCategories.associate { it.id to contentNameParser.normalizeSeriesCategory(it.name) }
            val seriesCategoryEntities = seriesCategories.map { Category(playlistId = playlistId, name = contentNameParser.normalizeSeriesCategory(it.name), type = CategoryType.SERIES, externalId = it.id) }
            categoryDao.insertAll(seriesCategoryEntities)
            
            val seriesToInsert = mutableListOf<Series>()
            val seriesToUpdate = mutableListOf<Series>()
            val seriesToDelete = mutableListOf<Series>()
            val seenSeriesIds = mutableSetOf<Int>()

            val filteredNewSeries = seriesList.filter { !it.name.equals("Test Serie", true) && !it.name.equals("Test Series", true) }
            Log.d(TAG, "refreshXtreamContent DIAGNOSTIC: currentSeries=${currentSeries.size}, filteredNewSeries=${filteredNewSeries.size}")
            filteredNewSeries.forEachIndexed { index, ser ->
                val xtreamId = ser.id
                if (xtreamId != null) {
                    seenSeriesIds.add(xtreamId)
                    val existing = currentSeriesMap[xtreamId]
                    val categoryName = seriesCategoryMap[ser.categoryId] ?: "Uncategorized"
                    val playlistOrder = (ser.added ?: index.toLong()).toInt()
                    
                    if (existing != null) {
                        if (existing.name != ser.name || existing.logoUrl != ser.poster || existing.category != categoryName) {
                            seriesToUpdate.add(existing.copy(
                                name = ser.name, logoUrl = ser.poster, xtreamBackdropUrl = ser.backdrop,
                                category = categoryName, categoryId = ser.categoryId, xtreamRating = ser.rating, 
                                xtreamPlot = ser.plot, xtreamCast = ser.cast, xtreamDirector = ser.director, xtreamGenre = ser.genre,
                                playlistOrder = playlistOrder, tmdbId = ser.tmdbId ?: existing.tmdbId
                            ))
                        } else {
                            seriesToUpdate.add(existing.copy(
                                xtreamRating = ser.rating, xtreamPlot = ser.plot, xtreamCast = ser.cast, 
                                xtreamDirector = ser.director, xtreamGenre = ser.genre, playlistOrder = playlistOrder,
                                tmdbId = ser.tmdbId ?: existing.tmdbId
                            ))
                        }
                    } else {
                        seriesToInsert.add(Series(
                            playlistId = playlistId, name = ser.name, logoUrl = ser.poster, xtreamBackdropUrl = ser.backdrop,
                            category = categoryName, categoryId = ser.categoryId, xtreamSeriesId = ser.id, 
                            xtreamRating = ser.rating, xtreamPlot = ser.plot, xtreamCast = ser.cast, 
                            xtreamDirector = ser.director, xtreamGenre = ser.genre, playlistOrder = playlistOrder,
                            tmdbId = ser.tmdbId
                        ))
                    }
                }
            }
            currentSeries.forEach { if (it.xtreamSeriesId != null && !seenSeriesIds.contains(it.xtreamSeriesId)) seriesToDelete.add(it) }
            seriesToDelete.forEach { episodeDao.deleteBySeries(it.id) }
            seriesDao.deleteList(seriesToDelete)
            seriesDao.updateList(seriesToUpdate)
            seriesDao.insertAll(seriesToInsert)
            Log.d(TAG, "refreshXtreamContent FINAL: series insert=${seriesToInsert.size}, update=${seriesToUpdate.size}, delete=${seriesToDelete.size}, total now=${currentSeries.size - seriesToDelete.size + seriesToInsert.size}")

            playlistDao.updateCounts(playlistId, liveStreams.size, currentMovies.size - moviesToDelete.size + moviesToInsert.size, currentSeries.size - seriesToDelete.size + seriesToInsert.size)
        } catch (e: Exception) {
            Log.e(TAG, "Error refreshing Xtream content", e)
            throw Exception("Errore nel refresh contenuti Xtream: ${e.message}")
        }
    }
    
    private suspend fun saveCategories(playlistId: Long, result: M3UParser.ParseResult) {
        val categories = mutableListOf<Category>()
        result.channels.map { it.category }.distinct().forEach { name ->
            categories.add(Category(playlistId = playlistId, name = name, type = CategoryType.LIVE_TV))
        }
        result.movies.map { it.category }.distinct().forEach { name ->
            categories.add(Category(playlistId = playlistId, name = name, type = CategoryType.MOVIE))
        }
        result.series.map { it.category }.distinct().forEach { name ->
            categories.add(Category(playlistId = playlistId, name = name, type = CategoryType.SERIES))
        }
        categoryDao.insertAll(categories)
    }
    
    private suspend fun saveChannels(playlistId: Long, channels: List<M3UParser.ParsedChannel>) {
        val entities = channels.map { entry ->
            Channel(
                playlistId = playlistId,
                name = entry.name,
                streamUrl = entry.streamUrl,
                logoUrl = entry.logoUrl,
                category = entry.category,
                xtreamEpgChannelId = entry.epgId
            )
        }
        channelDao.insertAll(entities)
    }
    
    private suspend fun saveMovies(playlistId: Long, movies: List<M3UParser.ParsedMovie>) {
        val entities = movies.map { entry ->
            Movie(
                playlistId = playlistId,
                name = entry.originalName,
                streamUrl = entry.streamUrl,
                logoUrl = entry.logoUrl,
                category = entry.category,
                year = entry.year,
                playlistOrder = entry.playlistOrder
            )
        }
        movieDao.insertAll(entities)
    }
    
    private suspend fun saveSeries(playlistId: Long, series: List<M3UParser.ParsedSeries>) {
        val groupedSeries = series.groupBy { it.cleanName }
        groupedSeries.forEach { (seriesName, episodes) ->
            val firstEp = episodes.first()
            val maxOrder = episodes.maxOf { it.playlistOrder }
            val seriesEntity = Series(
                playlistId = playlistId,
                name = seriesName,
                logoUrl = firstEp.logoUrl,
                category = firstEp.category,
                playlistOrder = maxOrder
            )
            val seriesId = seriesDao.insert(seriesEntity)
            val episodeEntities = episodes.mapNotNull { ep ->
                if (ep.season != null && ep.episode != null) {
                    Episode(
                        seriesId = seriesId,
                        name = ep.originalName,
                        streamUrl = ep.streamUrl,
                        seasonNumber = ep.season,
                        episodeNumber = ep.episode
                    )
                } else null
            }
            episodeDao.insertAll(episodeEntities)
        }
    }
}
