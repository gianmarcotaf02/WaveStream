package it.wavestream.app.ui.player

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.KeyEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.lifecycle.lifecycleScope
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.session.MediaSession
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.cache.NetworkMonitor
import it.wavestream.app.data.database.dao.WatchProgressDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.WatchProgress
import it.wavestream.app.player.PlayNextManager
import it.wavestream.app.player.SubtitleManager
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.isActive
import javax.inject.Inject
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.exoplayer.source.MediaSource
import androidx.media3.common.util.UnstableApi
import it.wavestream.app.data.repository.DownloadContentManager
import it.wavestream.app.data.database.dao.DownloadedContentDao
import kotlinx.coroutines.withContext
import kotlinx.coroutines.Dispatchers

/**
 * Video Player Activity with Media3 ExoPlayer + Jetpack Compose
 * Supports VOD, Live TV, subtitles, and auto-play next
 */
@AndroidEntryPoint
class PlayerActivity : ComponentActivity() {
    
    @Inject lateinit var networkMonitor: NetworkMonitor
    @Inject lateinit var watchProgressDao: WatchProgressDao
    @Inject lateinit var playNextManager: PlayNextManager
    @Inject lateinit var subtitleManager: SubtitleManager
    @Inject lateinit var userPreferences: it.wavestream.app.data.preferences.UserPreferences
    @Inject lateinit var movieDao: it.wavestream.app.data.database.dao.MovieDao
    @Inject lateinit var seriesDao: it.wavestream.app.data.database.dao.SeriesDao
    @Inject lateinit var channelDao: it.wavestream.app.data.database.dao.ChannelDao
    @Inject lateinit var episodeDao: it.wavestream.app.data.database.dao.EpisodeDao
    @Inject lateinit var downloadContentManager: DownloadContentManager
    @Inject lateinit var downloadedContentDao: DownloadedContentDao
    
    private lateinit var player: ExoPlayer
    
    // Content data
    private var contentId: Long = 0
    private var contentType: ContentType = ContentType.MOVIE
    private var streamUrl: String = ""
    private var title: String = ""
    private var subtitle: String? = null
    private var profileId: Long = 1L
    private var seriesId: Long? = null
    private var season: Int? = null
    private var episode: Int? = null
    private var groupId: Long? = null
    
    // State for Compose
    private val _isLoading = mutableStateOf(true)
    private val _currentPosition = mutableLongStateOf(0L)
    private val _duration = mutableLongStateOf(0L)
    private val _isPlaying = mutableStateOf(false)
    private val _nextEpisode = mutableStateOf<NextEpisodeInfo?>(null)
    private val _playbackSpeed = mutableFloatStateOf(1.0f)
    private val _audioTracks = mutableStateOf<List<AudioTrackInfo>>(emptyList())
    private val _currentAudioTrack = mutableIntStateOf(0)
    private val _autoPlayNextEnabled = mutableStateOf(true)
    private val _hasNextEpisode = mutableStateOf(false)
    private val _hasPreviousEpisode = mutableStateOf(false)
    private val _controlsVisible = mutableStateOf(true)
    
    // Seek state management - prevents reset during hold-to-seek
    private var isSeekingForward = false
    private var isSeekingBackward = false
    private var seekForwardSeconds = 10  // Loaded from preferences in onCreate
    private var seekBackwardSeconds = 10 // Loaded from preferences in onCreate
    private val _cumulativeSeekSeconds = mutableIntStateOf(0)
    private val _seekIndicatorVisible = mutableStateOf(false)
    private var seekAccumulationJob: kotlinx.coroutines.Job? = null
    
    private val progressHandler = Handler(Looper.getMainLooper())
    private val nextEpisodeHandler = Handler(Looper.getMainLooper())
    private val bufferingHandler = Handler(Looper.getMainLooper())
    private var autoSaveCounter = 0
    private var nextEpisodeCountdown = 10
    private var nextEpisodeTriggered = false  // Prevent double trigger
    
    // Auto-retry for live channel buffering
    private var bufferingRetryCount = 0
    private val MAX_BUFFERING_RETRIES = 8
    private val FIRST_RETRY_DELAY_MS = 3000L
    private val MAX_RETRY_DELAY_MS = 30000L
    
    private fun calculateRetryDelay(attempt: Int): Long {
        return (FIRST_RETRY_DELAY_MS + (attempt.toLong() * attempt * 500L))
            .coerceAtMost(MAX_RETRY_DELAY_MS)
    }
    
    // Auto-retry runnable for buffering - must use explicit function to avoid recursive type inference
    private val bufferingTimeoutRunnable: Runnable = object : Runnable {
        override fun run() {
            handleBufferingTimeout()
        }
    }
    
    private fun handleBufferingTimeout() {
        if (contentType == ContentType.CHANNEL && ::player.isInitialized) {
            bufferingRetryCount++
            android.util.Log.w("PlayerActivity", "Buffering timeout - retry attempt $bufferingRetryCount of $MAX_BUFFERING_RETRIES")
            
            if (bufferingRetryCount >= MAX_BUFFERING_RETRIES) {
                // All retries failed - close player
                android.util.Log.e("PlayerActivity", "All $MAX_BUFFERING_RETRIES retry attempts failed - closing player")
                android.widget.Toast.makeText(this, "Impossibile riprodurre il canale. Riprova più tardi.", android.widget.Toast.LENGTH_LONG).show()
                finish()
                return
            }
            
            // Show retry feedback
            if (bufferingRetryCount > 1) {
                android.widget.Toast.makeText(
                    this,
                    "Riconnessione... (tentativo $bufferingRetryCount/$MAX_BUFFERING_RETRIES)",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }
            
            // Aggressive retry: completely recreate media item
            forceReloadStream()
        }
    }
    
    /**
     * Force reload the stream completely - recreates the media item
     * More aggressive than just calling prepare()
     */
    private fun forceReloadStream() {
        if (!::player.isInitialized) return
        
        try {
            android.util.Log.d("PlayerActivity", "Force reloading stream: $streamUrl")
            
            player.stop()
            player.clearMediaItems()
            
            val mediaItem = androidx.media3.common.MediaItem.Builder()
                .setUri(android.net.Uri.parse(streamUrl))
                .build()
            
            player.setMediaItem(mediaItem)
            player.prepare()
            player.play()
            
            val nextDelay = calculateRetryDelay(bufferingRetryCount)
            android.util.Log.d("PlayerActivity", "Next retry in ${nextDelay}ms (attempt $bufferingRetryCount)")
            bufferingHandler.postDelayed(bufferingTimeoutRunnable, nextDelay)
        } catch (e: Exception) {
            android.util.Log.e("PlayerActivity", "Force reload failed: ${e.message}", e)
            if (bufferingRetryCount >= MAX_BUFFERING_RETRIES) {
                finish()
            } else {
                bufferingRetryCount++
                val retryDelay = calculateRetryDelay(bufferingRetryCount)
                bufferingHandler.postDelayed({ forceReloadStream() }, retryDelay)
            }
        }
    }
    
    // MediaSession for headphone/Bluetooth button controls
    private var mediaSession: MediaSession? = null
    
    // Receiver for when headphones are unplugged
    private val audioNoisyReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent?.action == AudioManager.ACTION_AUDIO_BECOMING_NOISY) {
                // Pause playback when headphones are unplugged
                if (::player.isInitialized && player.isPlaying) {
                    player.pause()
                }
            }
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Get intent data
        contentId = intent.getLongExtra("content_id", 0)
        contentType = ContentType.valueOf(intent.getStringExtra("content_type") ?: "MOVIE")
        streamUrl = intent.getStringExtra("stream_url") ?: ""
        title = intent.getStringExtra("title") ?: ""
        subtitle = intent.getStringExtra("subtitle")
        profileId = intent.getLongExtra("profile_id", 1L)
        seriesId = intent.getLongExtra("series_id", -1).takeIf { it > 0 }
        season = intent.getIntExtra("season", -1).takeIf { it > 0 }
        episode = intent.getIntExtra("episode", -1).takeIf { it > 0 }
        groupId = intent.getLongExtra("group_id", -1).takeIf { it > 0 }
        
        android.util.Log.d("PlayerActivity", "Intent: contentId=$contentId, type=$contentType, streamUrl=$streamUrl, title=$title")
        
        // Register receiver for headphone unplugged events
        val intentFilter = IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(audioNoisyReceiver, intentFilter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(audioNoisyReceiver, intentFilter)
        }
        
        // Keep screen on during playback to prevent standby
        window.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        
        try {
            initPlayer()
            setupMediaSession()
            
            // START PLAYBACK IMMEDIATELY if URL is already available
            if (streamUrl.isNotEmpty()) {
                android.util.Log.d("PlayerActivity", "Stream URL available from intent - starting playback immediately")
                startPlayback()
            }
        } catch (e: Exception) {
            android.util.Log.e("PlayerActivity", "Player init failed: ${e.message}", e)
            android.util.Log.e("PlayerActivity", "Stacktrace: ${android.util.Log.getStackTraceString(e)}")
            android.widget.Toast.makeText(
                this, 
                "Errore player: ${e.message?.take(80) ?: "sconosciuto"}", 
                android.widget.Toast.LENGTH_LONG
            ).show()
            // Release resources if player was partially initialized
            try { if (::player.isInitialized) player.release() } catch (_: Exception) {}
            finish()
            return
        }
        
        // Load remaining data in background (preferences, DB fetches, next/prev episodes)
        lifecycleScope.launch {
            // Load seek preferences
            seekForwardSeconds = userPreferences.getSeekForwardSeconds()
            seekBackwardSeconds = userPreferences.getSeekBackwardSeconds()
            android.util.Log.d("PlayerActivity", "Seek settings loaded: forward=${seekForwardSeconds}s, backward=${seekBackwardSeconds}s")
            
            if (streamUrl.isEmpty() && contentId > 0) {
                android.util.Log.d("PlayerActivity", "Stream URL empty, fetching from database...")
                streamUrl = fetchStreamUrlFromDatabase() ?: ""
                android.util.Log.d("PlayerActivity", "Fetched streamUrl: $streamUrl")
                
                if (streamUrl.isEmpty()) {
                    android.util.Log.e("PlayerActivity", "Stream URL is empty!")
                    android.widget.Toast.makeText(this@PlayerActivity, "Errore: URL streaming mancante", android.widget.Toast.LENGTH_LONG).show()
                    finish()
                    return@launch
                }
                
                // Start playback now that we have the URL
                startPlayback()
            }
            
            // Check for downloaded content (only for VOD) and switch to cache if found
            if (contentType != ContentType.CHANNEL) {
                val isDownloaded = withContext(Dispatchers.IO) {
                    downloadedContentDao.getByContent(contentType, contentId)?.isComplete == true
                }
                if (isDownloaded) {
                    android.util.Log.d("PlayerActivity", "Switching to offline cache: $title")
                    player.stop()
                    player.clearMediaItems()
                    val cacheFactory = downloadContentManager.cacheDataSourceFactory
                    val cacheMediaSourceFactory = DefaultMediaSourceFactory(cacheFactory)
                    val cacheMediaSource = cacheMediaSourceFactory.createMediaSource(
                        MediaItem.fromUri(Uri.parse(streamUrl))
                    )
                    player.setMediaSource(cacheMediaSource)
                    player.prepare()
                    player.play()
                }
            }
            
            // Apply volume normalization (async, doesn't block playback start)
            val volumeLevel = userPreferences.getPlayerVolumeLevel()
            player.volume = volumeLevel / 100f
            android.util.Log.d("PlayerActivity", "Applied volume normalization: $volumeLevel%")
            
            // Restore watch progress for VOD
            if (contentType != ContentType.CHANNEL) {
                val progress = withContext(Dispatchers.IO) {
                    watchProgressDao.getProgress(profileId, contentType, contentId)
                }
                progress?.let {
                    if (it.position > 0 && it.position < it.duration - 30_000) {
                        player.seekTo(it.position)
                    }
                }
            }
            
            // Check auto-play preferences
            _autoPlayNextEnabled.value = userPreferences.getAutoPlayNext()
            
            // Check if next episode exists
            val next = playNextManager.getNext(
                contentType = contentType,
                contentId = contentId,
                seriesId = seriesId,
                season = season,
                episode = episode,
                groupId = groupId
            )
            _hasNextEpisode.value = next != null
            
            // Check if previous episode exists
            val prev = playNextManager.getPrevious(
                contentType = contentType,
                contentId = contentId,
                seriesId = seriesId,
                season = season,
                episode = episode,
                groupId = groupId
            )
            _hasPreviousEpisode.value = prev != null
        }
        
        setContent {
            WaveStreamTheme {
                val isLoading by remember { _isLoading }
                val currentPosition by remember { _currentPosition }
                val duration by remember { _duration }
                val isPlaying by remember { _isPlaying }
                val nextEpisode by remember { _nextEpisode }
                val playbackSpeed by remember { _playbackSpeed }
                val audioTracks by remember { _audioTracks }
                val currentAudioTrack by remember { _currentAudioTrack }
                val hasNextEpisode by remember { _hasNextEpisode }
                val hasPreviousEpisode by remember { _hasPreviousEpisode }
                val cumulativeSeekSeconds by remember { _cumulativeSeekSeconds }
                val seekIndicatorVisible by remember { _seekIndicatorVisible }
                
                val controlsVisible by remember { _controlsVisible }
                
                TvPlayerScreen(
                    player = player,
                    title = title,
                    subtitle = subtitle,
                    isLoading = isLoading,
                    currentPosition = currentPosition,
                    duration = duration,
                    isPlaying = isPlaying,
                    controlsVisible = controlsVisible,
                    onControlsVisibilityChanged = { visible -> _controlsVisible.value = visible },
                    onPlayPause = { togglePlayPause() },
                    onSeek = { updateSeekOffset(it) },
                    onSeekConfirm = { confirmSeek() },
                    onSeekCancel = { cancelSeek() },
                    onRestart = { 
                        resetAutoPlayCounter()
                        player.seekTo(0) 
                    },
                    onSubtitles = { showSubtitlePicker() },
                    onBack = { finish() },
                    nextEpisode = nextEpisode,
                    onPlayNext = { playNextEpisode() },
                    onCancelNext = { hideNextEpisodeOverlay() },
                    playbackSpeed = playbackSpeed,
                    onSpeedChange = { 
                        resetAutoPlayCounter()
                        cyclePlaybackSpeed() 
                    },
                    audioTracks = audioTracks,
                    currentAudioTrack = currentAudioTrack,
                    onAudioTrackChange = { 
                        resetAutoPlayCounter()
                        selectAudioTrack(it) 
                    },
                    autoPlayEnabled = _autoPlayNextEnabled.value,
                    hasNextEpisode = hasNextEpisode,
                    hasPreviousEpisode = hasPreviousEpisode,
                    onPlayPrevious = { playPreviousEpisode() },
                    cumulativeSeekSeconds = cumulativeSeekSeconds,
                    seekIndicatorVisible = seekIndicatorVisible,
                    showStillWatching = remember { _showStillWatching }.value,
                    onStillWatchingContinue = { 
                        resetAutoPlayCounter()
                        player.play()
                    }
                )
            }
        }
    }
    
    @Suppress("DEPRECATION")
    override fun finish() {
        super.finish()
        overridePendingTransition(it.wavestream.app.R.anim.zoom_out_enter, it.wavestream.app.R.anim.zoom_out_exit)
    }
    
    private fun initPlayer() {
        val isLive = contentType == ContentType.CHANNEL

        // Optimized buffer: reduce VOD buffer to 30s (from 90s) to save RAM on TV devices
        // Live TV keeps minimal buffers for low latency
        val loadControl = DefaultLoadControl.Builder()
            .setBufferDurationsMs(
                if (isLive) 5_000 else 15_000,      // minBuffer
                if (isLive) 15_000 else 30_000,     // maxBuffer (was 90s, too much RAM on TV)
                if (isLive) 2_500 else 2_500,       // bufferForPlayback (rebuffer → playback)
                if (isLive) 5_000 else 5_000        // bufferForPlaybackAfterRebuffer
            )
            .setPrioritizeTimeOverSizeThresholds(true)
            .setBackBuffer(10_000, true) // Keep last 10s for back-skip without re-downloading
            .build()

        // Custom HTTP DataSource with optimized timeouts and keep-alive
        val httpDataSourceFactory = DefaultHttpDataSource.Factory()
            .setConnectTimeoutMs(if (isLive) 10_000 else 15_000)
            .setReadTimeoutMs(if (isLive) 15_000 else 20_000)
            .setUserAgent("WaveStream/1.0")

        val dataSourceFactory = DefaultDataSource.Factory(this, httpDataSourceFactory)
        val mediaSourceFactory = DefaultMediaSourceFactory(dataSourceFactory)

        // Explicit HW decoder configuration for better TV compatibility
        val renderersFactory = DefaultRenderersFactory(this)
            .setEnableDecoderFallback(true)
            .setExtensionRendererMode(DefaultRenderersFactory.EXTENSION_RENDERER_MODE_ON)

        player = ExoPlayer.Builder(this, renderersFactory)
            .setLoadControl(loadControl)
            .setMediaSourceFactory(mediaSourceFactory)
            .setHandleAudioBecomingNoisy(true)
            .build()
        
        player.addListener(object : Player.Listener {
            override fun onPlaybackStateChanged(state: Int) {
                when (state) {
                    Player.STATE_BUFFERING -> {
                        _isLoading.value = true
                        
                        // Start buffering timeout for Live TV
                        if (contentType == ContentType.CHANNEL) {
                            bufferingHandler.removeCallbacks(bufferingTimeoutRunnable)
                            bufferingHandler.postDelayed(bufferingTimeoutRunnable, 3000) // 3 seconds
                        }
                    }
                    Player.STATE_READY -> {
                        _isLoading.value = false
                        bufferingHandler.removeCallbacks(bufferingTimeoutRunnable) // Cancel timeout
                        bufferingRetryCount = 0  // Reset retry counter on successful playback
                        updateAudioTracks()  // Populate audio tracks when ready
                    }
                    Player.STATE_ENDED, Player.STATE_IDLE -> {
                         bufferingHandler.removeCallbacks(bufferingTimeoutRunnable) // Cancel timeout
                         if (state == Player.STATE_ENDED) onPlaybackEnded()
                    }
                    else -> {}
                }
            }
            
            override fun onIsPlayingChanged(isPlaying: Boolean) {
                _isPlaying.value = isPlaying
                if (isPlaying) {
                    startProgressUpdates()
                } else {
                    stopProgressUpdates()
                }
            }
            
            override fun onPlayerError(error: PlaybackException) {
                android.util.Log.e("PlayerActivity", "Playback error: ${error.message}")
                
                // Auto-retry on error for live channels
                if (contentType == ContentType.CHANNEL) {
                    bufferingRetryCount++
                    
                    if (bufferingRetryCount < MAX_BUFFERING_RETRIES) {
                        android.util.Log.w("PlayerActivity", "Error recovery - retry attempt $bufferingRetryCount")
                        if (bufferingRetryCount > 1) {
                            android.widget.Toast.makeText(
                                this@PlayerActivity,
                                "Errore stream, riconnessione... (tentativo $bufferingRetryCount/$MAX_BUFFERING_RETRIES)",
                                android.widget.Toast.LENGTH_SHORT
                            ).show()
                        }
                        
                        // Exponential backoff for retry delay
                        val retryDelay = calculateRetryDelay(bufferingRetryCount)
                        bufferingHandler.postDelayed({ forceReloadStream() }, retryDelay)
                    } else {
                        android.util.Log.e("PlayerActivity", "All error recovery attempts failed")
                        android.widget.Toast.makeText(
                            this@PlayerActivity,
                            "Impossibile riprodurre il canale. Riprova più tardi.",
                            android.widget.Toast.LENGTH_LONG
                        ).show()
                        finish()
                    }
                }
            }
        })
    }
    
    /**
     * Fetch stream URL from database when not passed via intent
     */
    private suspend fun fetchStreamUrlFromDatabase(): String? {
        return when (contentType) {
            ContentType.MOVIE -> {
                movieDao.getMovieById(contentId)?.streamUrl
            }
            ContentType.SERIES -> {
                // For series, find the most recent episode being watched
                val progress = watchProgressDao.getSeriesProgress(profileId, contentId)
                if (progress != null) {
                    // Get episode stream URL from episodeDao
                    val episode = episodeDao.getEpisodeById(progress.contentId)
                    if (episode != null) {
                        // Update local state for proper progress tracking
                        this.seriesId = contentId
                        this.contentId = episode.id
                        this.contentType = ContentType.EPISODE
                        this.season = episode.seasonNumber
                        this.episode = episode.episodeNumber
                        this.subtitle = "Stagione ${episode.seasonNumber} Episodio ${episode.episodeNumber}"
                        episode.streamUrl
                    } else {
                        null
                    }
                } else {
                    // No progress - try to get first episode
                    val firstEpisode = episodeDao.getFirstEpisodeForSeries(contentId)
                    if (firstEpisode != null) {
                        this.seriesId = contentId
                        this.contentId = firstEpisode.id
                        this.contentType = ContentType.EPISODE
                        this.season = firstEpisode.seasonNumber
                        this.episode = firstEpisode.episodeNumber
                        this.subtitle = "Stagione ${firstEpisode.seasonNumber} Episodio ${firstEpisode.episodeNumber}"
                        firstEpisode.streamUrl
                    } else {
                        null
                    }
                }
            }
            ContentType.CHANNEL -> {
                channelDao.getChannelById(contentId)?.streamUrl
            }
            ContentType.EPISODE -> {
                // Episode playback with episode ID
                val episode = episodeDao.getEpisodeById(contentId)
                episode?.streamUrl
            }
        }
    }
    
    @androidx.annotation.OptIn(UnstableApi::class)
    private fun startPlayback() {
        try {
            val mediaItem = MediaItem.fromUri(Uri.parse(streamUrl))
            player.setMediaItem(mediaItem)
            player.prepare()
            player.play()
        } catch (e: Exception) {
            android.util.Log.e("PlayerActivity", "startPlayback failed: ${e.message}", e)
            android.widget.Toast.makeText(this, "Errore nell'avvio dello stream", android.widget.Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    
    /**
     * Simple seek by milliseconds (for media keys)
     */
    private fun seekBy(ms: Long) {
        resetAutoPlayCounter()
        val newPosition = (player.currentPosition + ms).coerceIn(0, player.duration.coerceAtLeast(0))
        player.seekTo(newPosition)
    }
    
    /**
     * Update the cumulative seek offset manually
     */
    private fun updateSeekOffset(seconds: Int) {
        resetAutoPlayCounter()
        
        // Show indicator if not visible
        if (!_seekIndicatorVisible.value) {
            _seekIndicatorVisible.value = true
        }
        
        _cumulativeSeekSeconds.intValue += seconds
        
        // Ensure we don't seek beyond bounds (optional visual clamp)
        val currentMs = player.currentPosition
        val durationMs = player.duration
        val targetMs = currentMs + (_cumulativeSeekSeconds.intValue * 1000L)
        
        if (targetMs < 0) {
            _cumulativeSeekSeconds.intValue = ((-currentMs) / 1000).toInt()
        } else if (durationMs > 0 && targetMs > durationMs) {
             _cumulativeSeekSeconds.intValue = ((durationMs - currentMs) / 1000).toInt()
        }
    }
    
    /**
     * Apply the accumulated seek offset to the player
     */
    private fun confirmSeek() {
        resetAutoPlayCounter()
        if (_cumulativeSeekSeconds.intValue != 0) {
            val offsetMs = _cumulativeSeekSeconds.intValue * 1000L
            val currentPos = player.currentPosition // Use fresh position
            
            // Calculate new position
            val duration = player.duration
            val newPosition = if (duration > 0) {
                (currentPos + offsetMs).coerceIn(0, duration)
            } else {
                // If duration is unknown/live, just add offset but ensure not negative
                (currentPos + offsetMs).coerceAtLeast(0)
            }
            
            android.util.Log.d("PlayerActivity", "Confirming seek: current=$currentPos, offset=$offsetMs, new=$newPosition")
            
            // Optimistic UI update for instant feedback
            _currentPosition.longValue = newPosition
            
            player.seekTo(newPosition)
        }
        
        // Reset state
        cancelSeek()
    }
    
    private fun cancelSeek() {
        _cumulativeSeekSeconds.intValue = 0
        _seekIndicatorVisible.value = false
        // Ensure seek mode is reset in UI via other means if needed, 
        // but simple state reset + optimistic update should be enough
    }
    
    /**
     * Stop accumulating and apply the total seek
     */

    
    private fun startProgressUpdates() {
        progressHandler.post(object : Runnable {
            override fun run() {
                if (player.duration > 0) {
                    _currentPosition.longValue = player.currentPosition
                    _duration.longValue = player.duration
                    
                    // Auto-save progress every 30 seconds for data safety
                    // This ensures minimal progress loss on unexpected TV shutdown
                    autoSaveCounter++
                    if (autoSaveCounter >= 30) {
                        autoSaveCounter = 0
                        saveProgress()
                    }
                    
                    // Show next episode overlay 10 seconds before end
                    if (!nextEpisodeTriggered && contentType == ContentType.EPISODE) {
                        val remainingMs = player.duration - player.currentPosition
                        if (remainingMs in 1..10_000) {
                            nextEpisodeTriggered = true
                            triggerNextEpisodeOverlay()
                        }
                    }
                }
                progressHandler.postDelayed(this, 1000)
            }
        })
    }
    
    private fun triggerNextEpisodeOverlay() {
        lifecycleScope.launch {
            val next = playNextManager.getNext(
                contentType = contentType,
                contentId = contentId,
                seriesId = seriesId,
                season = season,
                episode = episode,
                groupId = groupId
            )
            if (next != null) {
                showNextEpisodeOverlay(next)
            }
        }
    }
    
    private fun stopProgressUpdates() {
        progressHandler.removeCallbacksAndMessages(null)
    }
    
    private fun onPlaybackEnded() {
        if (nextEpisodeTriggered && _nextEpisode.value != null) {
            // Overlay already showing from 10s-before-end trigger
            // If autoplay is on and countdown already reached 0, play next
            if (_autoPlayNextEnabled.value && nextEpisodeCountdown <= 0) {
                playNextEpisode()
            }
            // Otherwise let the existing countdown continue
            return
        }
        
        // Fallback: if overlay wasn't triggered early (e.g., short content)
        lifecycleScope.launch {
            val next = playNextManager.getNext(
                contentType = contentType,
                contentId = contentId,
                seriesId = seriesId,
                season = season,
                episode = episode,
                groupId = groupId
            )
            
            if (next != null) {
                nextEpisodeTriggered = true
                showNextEpisodeOverlay(next)
            } else {
                finish()
            }
        }
    }
    
    private fun showNextEpisodeOverlay(next: PlayNextManager.NextContent) {
        nextEpisodeCountdown = 10  // 10 second countdown
        _nextEpisode.value = NextEpisodeInfo(
            title = next.title,
            subtitle = next.subtitle,
            countdown = nextEpisodeCountdown,
            autoPlay = _autoPlayNextEnabled.value
        )
        
        // Countdown
        nextEpisodeHandler.post(object : Runnable {
            override fun run() {
                nextEpisodeCountdown--
                if (nextEpisodeCountdown > 0) {
                    _nextEpisode.value = NextEpisodeInfo(
                        title = next.title,
                        subtitle = next.subtitle,
                        countdown = nextEpisodeCountdown,
                        autoPlay = _autoPlayNextEnabled.value
                    )
                    nextEpisodeHandler.postDelayed(this, 1000)
                } else {
                    if (_autoPlayNextEnabled.value) {
                         playNextEpisode()
                    }
                }
            }
        })
    }
    
    private fun hideNextEpisodeOverlay() {
        _nextEpisode.value = null
        nextEpisodeHandler.removeCallbacksAndMessages(null)
        nextEpisodeTriggered = false
    }
    
    // Still Watching Check
    private var consecutiveAutoPlays = 0
    private val MAX_AUTO_PLAYS = 3
    private val _showStillWatching = mutableStateOf(false)
    
    // ... existing code ...

    private fun togglePlayPause() {
        resetAutoPlayCounter() // specific interaction reset
        if (player.isPlaying) {
            player.pause()
        } else {
            player.play()
        }
        // Show controls on pause/play
        _controlsVisible.value = true
    }

    private fun stopSeekAccumulation() {
        // Legacy method removed
    }
    
    private fun playNextEpisode(isAutoPlay: Boolean = false) {
        lifecycleScope.launch {
            // Check Still Watching limit only for auto-plays
            if (isAutoPlay) {
                consecutiveAutoPlays++
                if (consecutiveAutoPlays >= MAX_AUTO_PLAYS) {
                    android.util.Log.d("PlayerActivity", "Still Watching limit reached ($consecutiveAutoPlays/$MAX_AUTO_PLAYS)")
                    player.pause()
                    _showStillWatching.value = true
                    hideNextEpisodeOverlay()
                    return@launch
                }
            } else {
                // Manual next resets counter
                resetAutoPlayCounter()
            }
            
            // ... existing playNext logic ...
            val next = playNextManager.getNext(
                contentType = contentType,
                contentId = contentId,
                seriesId = seriesId,
                season = season,
                episode = episode,
                groupId = groupId
            )
            
            next?.let {
                // Update current content
                streamUrl = it.streamUrl
                title = it.title
                subtitle = it.subtitle
                contentId = it.contentId
                contentType = it.contentType
                
                // Update season and episode from NextContent fields
                season = it.season
                episode = it.episode
                android.util.Log.d("PlayerActivity", "Updated season=$season, episode=$episode")
                
                hideNextEpisodeOverlay()
                
                // Play new content
                val mediaItem = MediaItem.fromUri(Uri.parse(it.streamUrl))
                player.setMediaItem(mediaItem)
                player.prepare()
                player.play()
            }
        }
    }

    private fun playPreviousEpisode() {
        lifecycleScope.launch {
            resetAutoPlayCounter()  // Manual navigation resets counter
            
            val prev = playNextManager.getPrevious(
                contentType = contentType,
                contentId = contentId,
                seriesId = seriesId,
                season = season,
                episode = episode,
                groupId = groupId
            )
            
            prev?.let {
                // Update current content
                streamUrl = it.streamUrl
                title = it.title
                subtitle = it.subtitle
                contentId = it.contentId
                contentType = it.contentType
                
                // Update season and episode from NextContent fields
                season = it.season
                episode = it.episode
                android.util.Log.d("PlayerActivity", "Updated season=$season, episode=$episode")
                
                // Play previous content
                val mediaItem = MediaItem.fromUri(Uri.parse(it.streamUrl))
                player.setMediaItem(mediaItem)
                player.prepare()
                player.play()
                
                // Re-check if there's still a previous episode
                val stillHasPrev = playNextManager.getPrevious(
                    contentType = contentType,
                    contentId = contentId,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    groupId = groupId
                )
                _hasPreviousEpisode.value = stillHasPrev != null
                
                // Also update hasNext in case we're no longer at the end
                val hasNext = playNextManager.getNext(
                    contentType = contentType,
                    contentId = contentId,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    groupId = groupId
                )
                _hasNextEpisode.value = hasNext != null
            }
        }
    }

    private fun resetAutoPlayCounter() {
        if (consecutiveAutoPlays > 0) {
            android.util.Log.d("PlayerActivity", "User presence detected - resetting auto-play counter")
            consecutiveAutoPlays = 0
        }
        _showStillWatching.value = false
    }
    
    // ... existing code ...
    
    private fun showSubtitlePicker() {
        android.util.Log.d("PlayerActivity", "Subtitle picker requested - searching OpenSubtitles...")
        android.widget.Toast.makeText(this, "Ricerca sottotitoli...", android.widget.Toast.LENGTH_SHORT).show()
        
        lifecycleScope.launch {
            try {
                if (!subtitleManager.isAuthenticated()) {
                    android.widget.Toast.makeText(
                        this@PlayerActivity,
                        "Login OpenSubtitles richiesto (vai in Impostazioni)",
                        android.widget.Toast.LENGTH_LONG
                    ).show()
                    return@launch
                }
                
                val imdbId = when (contentType) {
                    ContentType.MOVIE -> movieDao.getMovieById(contentId)?.imdbId
                    ContentType.SERIES, ContentType.EPISODE -> {
                        val sId = seriesId ?: contentId
                        seriesDao.getSeriesById(sId)?.imdbId
                    }
                    else -> null
                }
                
                // Use user's preferred subtitle language
                val subtitleLanguage = try {
                    userPreferences.getSubtitleLanguage()
                } catch (e: Exception) {
                    "it"
                }
                
                android.util.Log.d("PlayerActivity", "Searching subtitles: title=$title, imdbId=$imdbId, lang=$subtitleLanguage, season=$season, episode=$episode")
                
                val subtitles = subtitleManager.searchRemoteSubtitles(
                    query = title,
                    imdbId = imdbId,
                    type = if (contentType == ContentType.MOVIE) "movie" else "episode",
                    season = season,
                    episode = episode,
                    languages = subtitleLanguage
                )
                
                if (subtitles.isEmpty()) {
                    android.widget.Toast.makeText(
                        this@PlayerActivity,
                        "Nessun sottotitolo trovato",
                        android.widget.Toast.LENGTH_SHORT
                    ).show()
                } else {
                    // Show subtitle selection dialog
                    showSubtitleSelectionDialog(subtitles)
                }
            } catch (e: Exception) {
                android.util.Log.e("PlayerActivity", "Error searching subtitles: ${e.message}", e)
                android.widget.Toast.makeText(
                    this@PlayerActivity,
                    "Errore ricerca sottotitoli",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
    
    private fun showSubtitleSelectionDialog(subtitles: List<SubtitleManager.SubtitleTrack>) {
        val items = subtitles.map { sub ->
            "${sub.language} - ${sub.name}"
        }.toTypedArray()
        
        android.app.AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Dialog_Alert)
            .setTitle("Seleziona sottotitoli")
            .setItems(items) { _, which ->
                val selected = subtitles[which]
                downloadAndApplySubtitle(selected)
            }
            .setNegativeButton("Annulla", null)
            .show()
    }
    
    private fun downloadAndApplySubtitle(track: SubtitleManager.SubtitleTrack) {
        android.widget.Toast.makeText(this, "Scaricamento sottotitoli...", android.widget.Toast.LENGTH_SHORT).show()
        
        lifecycleScope.launch {
            val result = subtitleManager.downloadAndPrepare(track, title)
            
            when (result) {
                is SubtitleManager.DownloadState.Success -> {
                    val subtitlePath = result.filePath
                    val currentMediaItem = player.currentMediaItem
                    if (currentMediaItem != null) {
                        subtitleManager.applySubtitle(player, subtitlePath, currentMediaItem)
                        android.widget.Toast.makeText(
                            this@PlayerActivity,
                            "Sottotitoli applicati: ${track.language}",
                            android.widget.Toast.LENGTH_SHORT
                        ).show()
                    }
                }
                is SubtitleManager.DownloadState.Error -> {
                    android.widget.Toast.makeText(
                        this@PlayerActivity,
                        "Errore download: ${result.message}",
                        android.widget.Toast.LENGTH_SHORT
                    ).show()
                }
                is SubtitleManager.DownloadState.LimitReached -> {
                    android.widget.Toast.makeText(
                        this@PlayerActivity,
                        "Limite download raggiunto. Riprova domani.",
                        android.widget.Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
    
    private fun saveProgress() {
        if (player.duration > 0) {
            val currentPos = player.currentPosition
            val totalDur = player.duration
            val remainingMs = totalDur - currentPos
            // Completed if watched > 95% OR if remaining time <= 6 minutes (credits threshold)
            val isCompleted = currentPos > (totalDur * 0.95) || remainingMs <= 6 * 60 * 1000
            
            lifecycleScope.launch {
                val progress = WatchProgress(
                    profileId = profileId,
                    contentType = contentType,
                    contentId = contentId,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    position = currentPos,
                    duration = totalDur,
                    isCompleted = isCompleted,
                    lastWatchedAt = System.currentTimeMillis()
                )
                watchProgressDao.upsert(progress)
            }
        }
    }
    
    // Keep D-pad handling for better responsiveness
    // D-Pad seek is now handled by the UI components (progress bar) via Compose
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE -> {
                togglePlayPause()
                return true
            }
            KeyEvent.KEYCODE_MEDIA_PLAY -> {
                player.play()
                return true
            }
            KeyEvent.KEYCODE_MEDIA_PAUSE -> {
                player.pause()
                return true
            }
            KeyEvent.KEYCODE_MEDIA_FAST_FORWARD -> {
                seekBy(30_000)
                return true
            }
            KeyEvent.KEYCODE_MEDIA_REWIND -> {
                seekBy(-10_000)
                return true
            }
            // D-pad handling removed to avoid accidental seeking
            // Seek is now only allowed when Progress Bar is focused and activated
            
            // D-pad center/enter to toggle play/pause
            // When controls are visible, let Compose handle button clicks
            // Only intercept when controls are hidden to show them
            KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                if (!_controlsVisible.value) {
                    // Controls hidden: show controls and toggle play/pause
                    togglePlayPause()
                    _controlsVisible.value = true
                    return true
                }
                // Controls visible: let Compose handle the button click
                return false
            }
            // D-pad up/down to show controls
            KeyEvent.KEYCODE_DPAD_UP, KeyEvent.KEYCODE_DPAD_DOWN -> {
                _controlsVisible.value = true
                return false  // Let Compose handle focus navigation
            }
            // Back key - hide controls if visible, otherwise finish
            KeyEvent.KEYCODE_BACK -> {
                if (_controlsVisible.value) {
                    _controlsVisible.value = false
                    return true
                }
                // Let it fall through to finish()
            }
        }
        return super.onKeyDown(keyCode, event)
    }
    
    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyUp(keyCode, event)
    }
    
    override fun onPause() {
        super.onPause()
        player.pause()
        saveProgress()
    }
    
    override fun onStop() {
        super.onStop()
        // Double-save on stop for extra safety when app goes to background
        saveProgress()
    }
    
    /**
     * Setup Media3 MediaSession for headphone/Bluetooth button controls
     * The MediaSession automatically handles play/pause/seek from external controllers
     */
    private fun setupMediaSession() {
        mediaSession = MediaSession.Builder(this, player)
            .setId("WaveStreamPlayer")
            .build()
    }
    
    override fun onDestroy() {
        super.onDestroy()
        
        // Release MediaSession
        mediaSession?.release()
        mediaSession = null
        
        // Unregister audio noisy receiver
        try {
            unregisterReceiver(audioNoisyReceiver)
        } catch (e: Exception) {
            // Already unregistered
        }
        
        progressHandler.removeCallbacksAndMessages(null)
        nextEpisodeHandler.removeCallbacksAndMessages(null)
        bufferingHandler.removeCallbacksAndMessages(null)
        if (::player.isInitialized) player.release()
    }
    
    /**
     * Cycle through available playback speeds
     */
    private fun cyclePlaybackSpeed() {
        val speeds = listOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f)
        val currentIndex = speeds.indexOf(_playbackSpeed.floatValue)
        val nextIndex = (currentIndex + 1) % speeds.size
        val newSpeed = speeds[nextIndex]
        
        _playbackSpeed.floatValue = newSpeed
        player.setPlaybackSpeed(newSpeed)
    }
    
    /**
     * Set specific playback speed
     */
    private fun setPlaybackSpeed(speed: Float) {
        _playbackSpeed.floatValue = speed
        player.setPlaybackSpeed(speed)
    }
    
    /**
     * Update available audio tracks from player
     */
    private fun updateAudioTracks() {
        val tracks = mutableListOf<AudioTrackInfo>()
        
        for (i in 0 until player.currentTracks.groups.size) {
            val group = player.currentTracks.groups[i]
            if (group.type == androidx.media3.common.C.TRACK_TYPE_AUDIO) {
                for (j in 0 until group.length) {
                    val format = group.getTrackFormat(j)
                    val language = format.language ?: "und"
                    val label = format.label ?: getLanguageName(language)
                    val isSelected = group.isTrackSelected(j)
                    
                    tracks.add(AudioTrackInfo(
                        index = tracks.size,
                        groupIndex = i,
                        trackIndex = j,
                        language = language,
                        label = label,
                        isSelected = isSelected
                    ))
                    
                    if (isSelected) {
                        _currentAudioTrack.intValue = tracks.size - 1
                    }
                }
            }
        }
        
        _audioTracks.value = tracks
    }
    
    /**
     * Select audio track by index
     */
    private fun selectAudioTrack(trackInfo: AudioTrackInfo) {
        val trackSelector = player.trackSelector as? androidx.media3.exoplayer.trackselection.DefaultTrackSelector
        trackSelector?.let { selector ->
            val override = androidx.media3.common.TrackSelectionOverride(
                player.currentTracks.groups[trackInfo.groupIndex].mediaTrackGroup,
                trackInfo.trackIndex
            )
            selector.setParameters(
                selector.buildUponParameters()
                    .setOverrideForType(override)
            )
            _currentAudioTrack.intValue = trackInfo.index
        }
    }
    
    /**
     * Get human-readable language name from ISO 639 code
     */
    private fun getLanguageName(code: String): String {
        return when (code.lowercase()) {
            "ita", "it" -> "Italiano"
            "eng", "en" -> "English"
            "deu", "de" -> "Deutsch"
            "fra", "fr" -> "Français"
            "spa", "es" -> "Español"
            "por", "pt" -> "Português"
            "rus", "ru" -> "Русский"
            "jpn", "ja" -> "日本語"
            "kor", "ko" -> "한국어"
            "chi", "zh" -> "中文"
            "und" -> "Sconosciuto"
            else -> code.uppercase()
        }
    }
}

/**
 * Audio track information
 */
@Immutable
data class AudioTrackInfo(
    val index: Int,
    val groupIndex: Int,
    val trackIndex: Int,
    val language: String,
    val label: String,
    val isSelected: Boolean
)

