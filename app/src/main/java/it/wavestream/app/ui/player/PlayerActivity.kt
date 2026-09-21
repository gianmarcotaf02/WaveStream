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
import androidx.media3.datasource.okhttp.OkHttpDataSource
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.SeekParameters
import androidx.media3.exoplayer.hls.HlsMediaSource
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
import it.wavestream.app.data.repository.MediaSegmentRepository
import it.wavestream.app.data.database.entity.SegmentType
import it.wavestream.app.data.database.entity.MediaSegment
import it.wavestream.app.credits.CreditsAudioMonitor
import it.wavestream.app.credits.CreditsRenderersFactory
import it.wavestream.app.credits.AudioFingerprintCodec
import it.wavestream.app.player.CreditsDetector
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
    @Inject lateinit var playlistRepository: it.wavestream.app.data.repository.PlaylistRepository
    @Inject lateinit var downloadContentManager: DownloadContentManager
    @Inject lateinit var downloadedContentDao: DownloadedContentDao
    @Inject lateinit var mediaSegmentRepository: MediaSegmentRepository
    @Inject lateinit var creditsAudioMonitor: CreditsAudioMonitor
    
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

    // Fase 1 — marker esatti dei titoli di coda (Livello 0).
    private var creditsMarkerStartMs: Long? = null
    private var creditsMarkerEndMs: Long? = null
    private var creditsMarkerLoaded = false
    // Sigla (intro): marker manuale inizio/fine + visibilità del pulsante "Salta sigla"
    private var introStartMs: Long? = null
    private var introEndMs: Long? = null
    private var seriesIntroReference: MediaSegment? = null
    private var introFingerprintActive = false
    private val _showSkipIntro = mutableStateOf(false)
    // Fase 2: esito del monitor audio, passato al watchdog come corroborazione.
    private val _audioCandidate = mutableStateOf(false)
    // Generazione di sessione: si incrementa ad ogni salto indietro e fa ripartire/re-armare
    // il watchdog video, oltre a resettare lo stato del trigger.
    private val _creditsSeekGeneration = mutableIntStateOf(0)
    
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
    private val _creditsDetectionEnabled = mutableStateOf(true)
    private val _creditsAudioEnabled = mutableStateOf(true)
    private val _creditsDebugEnabled = mutableStateOf(false)
    private val _introDbEnabled = mutableStateOf(true)
    private val _controlsVisible = mutableStateOf(true)

    // Live/DVR state (solo canali live) - timeshift stile Sky/DAZN
    private val _isLive = mutableStateOf(false)
    private val _isAtLiveEdge = mutableStateOf(true)
    // True solo se lo stream live espone una finestra DVR (HLS sliding window /
    // playlist EVENT): il timeshift indietro è possibile solo in quel caso.
    // Un MPEG-TS live progressivo non è seekable e non permette di tornare indietro.
    private val _isLiveSeekable = mutableStateOf(false)

    // Mini player live: video ridotto + lista canali della categoria
    private val _isMiniPlayer = mutableStateOf(false)
    private val _liveCategories = mutableStateOf<List<String>>(emptyList())
    private val _liveCategoryIndex = mutableIntStateOf(0)
    private val _liveChannels = mutableStateOf<List<MiniChannelInfo>>(emptyList())
    private val _currentChannelId = mutableLongStateOf(0L)

    // Categoria del canale live corrente: mostrata come sottotitolo sotto il
    // titolo nel player dei canali (testo più chiaro).
    private val _liveCategory = mutableStateOf<String?>(null)

    // Qualità video reale del flusso in riproduzione (es. "1080p"). Mostrata
    // nell'overlay dei controlli, a destra del titolo. Null finché la traccia
    // video non è nota; segue automaticamente i cambi di risoluzione (HLS adattivo).
    private val _videoQuality = mutableStateOf<String?>(null)
    
    // Seek state management - prevents reset during hold-to-seek
    private var isSeekingForward = false
    private var isSeekingBackward = false
    private var seekForwardSeconds = 10  // Loaded from preferences in onCreate
    private var seekBackwardSeconds = 10 // Loaded from preferences in onCreate
    private val _cumulativeSeekSeconds = mutableIntStateOf(0)
    private val _seekIndicatorVisible = mutableStateOf(false)
    private var seekAccumulationJob: kotlinx.coroutines.Job? = null

    // Feedback del seek "a barra nascosta" (D-pad sinistra/destra con controlli
    // chiusi): mostra per ~1s l'indicatore +N s / -N s senza riaprire la barra.
    private val _hiddenSeekSeconds = mutableIntStateOf(0)
    private val hiddenSeekHandler = Handler(Looper.getMainLooper())
    private val hiddenSeekClearRunnable = Runnable { _hiddenSeekSeconds.intValue = 0 }
    
    // Countdown overlay "Prossimo episodio" (uniforme: 10s)
    private val DEFAULT_NEXT_COUNTDOWN_SECONDS = 10
    private val CREDITS_NEXT_COUNTDOWN_SECONDS = 10

    private val progressHandler = Handler(Looper.getMainLooper())
    private val nextEpisodeHandler = Handler(Looper.getMainLooper())
    private val bufferingHandler = Handler(Looper.getMainLooper())
    private var autoSaveCounter = 0
    private var nextEpisodeCountdown = DEFAULT_NEXT_COUNTDOWN_SECONDS
    private var nextEpisodeTriggered = false  // Prevent double trigger
    private var creditsDetected = false       // Titoli di coda rilevati dall'analisi frame
    private var creditsDismissed = false      // L'utente ha ignorato l'overlay: non riproporlo per questo contenuto
    private var creditsTunnelLogged = false   // Diagnostica Passo 0: log tunneling una volta per playback
    
    // Auto-retry for live channel buffering
    private var bufferingRetryCount = 0
    private val MAX_BUFFERING_RETRIES = 8
    private val FIRST_RETRY_DELAY_MS = 3000L
    private val MAX_RETRY_DELAY_MS = 30000L

    // Varianti di formato per i canali live: molti provider servono lo stesso canale
    // sia come MPEG-TS (.ts) sia come HLS (.m3u8). Se il formato scelto non parte
    // (caricamento infinito) si passa automaticamente all'altro. Indice corrente in
    // streamVariantIndex, 0 = URL originale memorizzato in DB.
    private var streamVariants: List<String> = emptyList()
    private var streamVariantIndex = 0

    // True dopo il primo STATE_READY del canale corrente: su un rebuffer a flusso già
    // avviato il cambio di formato è rimandato, per non penalizzare la stabilità con
    // uno switch inutile durante un singhiozzo transitorio.
    private var hasReachedReady = false

    // Memorizza per ogni canale quale formato (.m3u8/.ts) ha funzionato, così gli avvii
    // successivi partono direttamente con quello giusto: nessun tentativo a vuoto.
    private val streamFormatPrefs by lazy {
        getSharedPreferences("stream_format_prefs", Context.MODE_PRIVATE)
    }
    
    // Sotto questa soglia (ms) si considera il player "sul live"
    private val LIVE_EDGE_THRESHOLD_MS = 5_000L

    // Passo del timeshift live (tasti indietro/avanti nel player)
    private val LIVE_TIMESHIFT_STEP_MS = 10_000L

    // Passo del seek rapido con la barra dei controlli nascosta (D-pad L/R)
    private val HIDDEN_SEEK_STEP_SECONDS = 10

    // Sotto questa differenza (ms) un seek non è considerato un "salto indietro"
    // (evita reset inutili su micro-aggiustamenti del player).
    private val BACKWARD_SEEK_RESET_MS = 10_000L

    // Finestra iniziale in cui il monitor audio cerca la sigla (Fase 4).
    private val INTRO_SCAN_MS = 15 * 60 * 1000L

    /** Etichetta della qualità a partire dall'altezza della traccia video (0 = ignota). */
    private fun videoQualityLabel(height: Int): String? = when {
        height >= 2160 -> "4K"
        height >= 1440 -> "1440p"
        height >= 1080 -> "1080p"
        height >= 720 -> "720p"
        height >= 576 -> "576p"
        height >= 480 -> "480p"
        height >= 360 -> "360p"
        height > 0 -> "${height}p"
        else -> null
    }

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
            // Prima di ritentare lo stesso URL, prova il formato alternativo (es. .ts -> .m3u8).
            // È la causa tipica del "caricamento infinito" sui canali live serviti in HLS.
            if (trySwitchStreamVariant()) return

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
            val urlToLoad = currentVariantUrl()
            android.util.Log.d("PlayerActivity", "Force reloading stream: $urlToLoad")
            
            player.stop()
            player.clearMediaItems()
            
            val mediaItem = androidx.media3.common.MediaItem.Builder()
                .setUri(android.net.Uri.parse(urlToLoad))
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

    /**
     * Costruisce le varianti di URL per un canale live. Per un URL Xtream/M3U .ts
     * aggiunge la variante .m3u8 (e viceversa), preservando l'eventuale query string.
     *
     * Ordine: se per questo canale è già noto il formato che funziona, si parte da quello;
     * altrimenti si preferisce HLS (.m3u8), più resiliente ai singhiozzi del provider.
     * Il fallback automatico copre comunque i canali serviti solo in uno dei due formati.
     */
    private fun buildStreamVariants(url: String): List<String> {
        if (contentType != ContentType.CHANNEL || url.isBlank()) return listOf(url)
        val queryIndex = url.indexOf('?')
        val pathEnd = if (queryIndex >= 0) queryIndex else url.length
        val path = url.substring(0, pathEnd)
        val ext = when {
            path.endsWith(".ts", ignoreCase = true) -> ".ts"
            path.endsWith(".m3u8", ignoreCase = true) -> ".m3u8"
            else -> return listOf(url)
        }
        val hlsUrl = if (ext == ".m3u8") url else url.replaceRange(pathEnd - 3, pathEnd, ".m3u8")
        val tsUrl = if (ext == ".ts") url else url.replaceRange(pathEnd - 5, pathEnd, ".ts")
        return when (preferredFormatIsHls(url)) {
            true -> listOf(hlsUrl, tsUrl)
            false -> listOf(tsUrl, hlsUrl)
            null -> listOf(hlsUrl, tsUrl)
        }
    }

    /** Chiave stabile per canale: URL senza query string ed estensione. */
    private fun streamFormatKey(url: String): String =
        url.substringBefore('?').substringBeforeLast('.')

    /** Formato preferito memorizzato per il canale: true=HLS, false=TS, null=mai provato. */
    private fun preferredFormatIsHls(url: String): Boolean? {
        val key = streamFormatKey(url)
        if (key.isBlank()) return null
        return when (streamFormatPrefs.getString(key, null)) {
            "hls" -> true
            "ts" -> false
            else -> null
        }
    }

    /** Salva il formato attualmente in riproduzione come preferito per il canale. */
    private fun rememberCurrentStreamFormat() {
        if (streamUrl.isBlank()) return
        val key = streamFormatKey(streamUrl)
        if (key.isBlank()) return
        val activeIsHls = currentVariantUrl().substringBefore('?').endsWith(".m3u8", ignoreCase = true)
        val value = if (activeIsHls) "hls" else "ts"
        if (streamFormatPrefs.getString(key, null) != value) {
            streamFormatPrefs.edit().putString(key, value).apply()
        }
    }

    /** URL attualmente in uso (variante selezionata). */
    private fun currentVariantUrl(): String =
        streamVariants.getOrElse(streamVariantIndex) { streamUrl }

    /**
     * Se esiste una variante di formato non ancora provata, passa alla successiva e
     * ricarica. Ritorna true se il reload è stato avviato.
     */
    private fun trySwitchStreamVariant(): Boolean {
        if (contentType != ContentType.CHANNEL) return false
        if (streamVariantIndex >= streamVariants.lastIndex) return false
        streamVariantIndex++
        bufferingRetryCount = 0
        bufferingHandler.removeCallbacks(bufferingTimeoutRunnable)
        android.util.Log.w(
            "PlayerActivity",
            "Cambio formato stream -> ${currentVariantUrl()} (variante ${streamVariantIndex + 1}/${streamVariants.size})"
        )
        forceReloadStream()
        return true
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

            // Canali live: carica la categoria da mostrare come sottotitolo sotto il titolo
            if (contentType == ContentType.CHANNEL && contentId > 0) {
                withContext(Dispatchers.IO) { channelDao.getChannelById(contentId)?.category }
                    ?.takeIf { it.isNotBlank() }
                    ?.let { _liveCategory.value = it }
            }
            
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
            _creditsDetectionEnabled.value = userPreferences.getCreditsDetectionEnabled()
            _creditsDebugEnabled.value = userPreferences.getCreditsDebugEnabled()
            _creditsAudioEnabled.value = userPreferences.getCreditsAudioEnabled()
            _introDbEnabled.value = userPreferences.getIntroDbEnabled()
            creditsAudioMonitor.enabled = _creditsAudioEnabled.value
            
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
                val videoQuality by remember { _videoQuality }
                val hasNextEpisode by remember { _hasNextEpisode }
                val hasPreviousEpisode by remember { _hasPreviousEpisode }
                val cumulativeSeekSeconds by remember { _cumulativeSeekSeconds }
                val seekIndicatorVisible by remember { _seekIndicatorVisible }
                val hiddenSeekSeconds by remember { _hiddenSeekSeconds }
                
                val controlsVisible by remember { _controlsVisible }
                
                TvPlayerScreen(
                    player = player,
                    title = title,
                    subtitle = if (contentType == ContentType.CHANNEL) _liveCategory.value else subtitle,
                    videoQuality = videoQuality,
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
                    onSeekBack = { seekBy(-LIVE_TIMESHIFT_STEP_MS, fromLiveControls = true) },
                    onSeekForward = { seekBy(LIVE_TIMESHIFT_STEP_MS, fromLiveControls = true) },
                    onRestart = { 
                        resetAutoPlayCounter()
                        player.seekTo(0) 
                    },
                    onSubtitles = { showSubtitlePicker() },
                    onBack = { finish() },
                    nextEpisode = nextEpisode,
                    onPlayNext = { playNextEpisode() },
                    onCancelNext = { cancelNextEpisodeOverlay() },
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
                    creditsDetectionEnabled = _creditsDetectionEnabled.value,
                    onCreditsDetected = { onCreditsDetected() },
                    creditsDetectionDebug = _creditsDebugEnabled.value,
                    creditsSessionKey = _creditsSeekGeneration.intValue,
                    onMarkCredits = { markSegmentNow(SegmentType.CREDITS) },
                    onMarkIntro = { markIntroNow() },
                    showSkipIntro = _showSkipIntro.value,
                    onSkipIntro = { skipIntro() },
                    audioCandidate = _audioCandidate.value,
                    isLiveChannel = contentType == ContentType.CHANNEL,
                    isAtLiveEdge = _isAtLiveEdge.value,
                    isLiveSeekable = _isLiveSeekable.value,
                    onReturnToLive = { returnToLive() },
                    isMiniPlayer = _isMiniPlayer.value,
                    onToggleMiniPlayer = { toggleMiniPlayer() },
                    liveCategories = _liveCategories.value,
                    liveCategoryIndex = _liveCategoryIndex.intValue,
                    onCategoryChange = { loadChannelsForCategory(it) },
                    liveChannels = _liveChannels.value,
                    currentChannelId = _currentChannelId.longValue,
                    onChannelSelect = { onMiniChannelSelected(it) },
                    cumulativeSeekSeconds = cumulativeSeekSeconds,
                    seekIndicatorVisible = seekIndicatorVisible,
                    hiddenSeekSeconds = hiddenSeekSeconds,
                    showStillWatching = remember { _showStillWatching }.value,
                    onStillWatchingContinue = { 
                        resetAutoPlayCounter()
                        player.play()
                    },
                    onSleepTimerExpired = {
                        // Timer "dormire" scaduto: pausa immediata + uscita dal player,
                        // così la riproduzione non continua a vuoto.
                        resetAutoPlayCounter()
                        if (::player.isInitialized) player.pause()
                        finish()
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
    
    @androidx.annotation.OptIn(UnstableApi::class)
    private fun initPlayer() {
        val isLive = contentType == ContentType.CHANNEL

        // Optimized buffer: reduce VOD buffer to 30s (from 90s) to save RAM on TV devices
        // Live TV keeps minimal buffers for low latency
        val loadControl = DefaultLoadControl.Builder()
            .setBufferDurationsMs(
                // Live: avvio rapido (bufferForPlayback basso = parte subito) ma cuscinetto
                // massimo alto per assorbire il jitter nei giorni di rete instabile.
                // minBuffer deve essere >= bufferForPlaybackAfterRebuffer (vincolo ExoPlayer)
                if (isLive) 3_000 else 15_000,      // minBuffer
                if (isLive) 20_000 else 30_000,     // maxBuffer (non incide sull'avvio, solo sul margine)
                if (isLive) 1_000 else 2_500,       // bufferForPlayback (avvio rapido)
                if (isLive) 3_000 else 5_000        // bufferForPlaybackAfterRebuffer (stabilità post-buco)
            )
            .setPrioritizeTimeOverSizeThresholds(true)
            .setBackBuffer(10_000, true) // Keep last 10s for back-skip without re-downloading
            .build()

        // OkHttp DataSource: connection pooling + keep-alive RIUSATI tra segmenti HLS e
        // cambi canale (zapping più rapido: niente nuovo handshake DNS/TLS a ogni canale),
        // redirect cross-protocol (http↔https) gestiti nativamente — con
        // DefaultHttpDataSource i canali dietro redirect spesso non partivano
        val streamingHttpClient = okhttp3.OkHttpClient.Builder()
            .connectTimeout(if (isLive) 10_000 else 15_000, java.util.concurrent.TimeUnit.MILLISECONDS)
            .readTimeout(if (isLive) 15_000 else 20_000, java.util.concurrent.TimeUnit.MILLISECONDS)
            .retryOnConnectionFailure(true)
            .connectionPool(okhttp3.ConnectionPool(6, 5, java.util.concurrent.TimeUnit.MINUTES))
            .build()
        val httpDataSourceFactory = OkHttpDataSource.Factory(streamingHttpClient)
            .setUserAgent("WaveStream/1.0")

        val dataSourceFactory = DefaultDataSource.Factory(this, httpDataSourceFactory)

        // Factory "live-aware": sui canali HLS (.m3u8) usa chunkless preparation
        // (avvio senza scaricare prima l'intera playlist media), il resto invariato
        val hlsFactory = HlsMediaSource.Factory(dataSourceFactory)
            .setAllowChunklessPreparation(true)
        val delegateFactory = DefaultMediaSourceFactory(dataSourceFactory)
        val mediaSourceFactory = object : MediaSource.Factory {
            override fun setDrmSessionManagerProvider(
                drmSessionManagerProvider: androidx.media3.exoplayer.drm.DrmSessionManagerProvider
            ): MediaSource.Factory {
                hlsFactory.setDrmSessionManagerProvider(drmSessionManagerProvider)
                delegateFactory.setDrmSessionManagerProvider(drmSessionManagerProvider)
                return this
            }

            override fun setLoadErrorHandlingPolicy(
                loadErrorHandlingPolicy: androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
            ): MediaSource.Factory {
                hlsFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy)
                delegateFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy)
                return this
            }

            override fun createMediaSource(mediaItem: MediaItem): MediaSource {
                val url = mediaItem.localConfiguration?.uri?.toString().orEmpty()
                return if (isLive && url.contains(".m3u8")) {
                    hlsFactory.createMediaSource(mediaItem)
                } else {
                    delegateFactory.createMediaSource(mediaItem)
                }
            }

            override fun getSupportedTypes(): IntArray = intArrayOf(
                androidx.media3.common.C.CONTENT_TYPE_HLS,
                androidx.media3.common.C.CONTENT_TYPE_OTHER
            )
        }

        // Explicit HW decoder configuration for better TV compatibility
        // Fase 2: factory che aggancia il tee audio al monitor (pass-through, nessun costo
        // sul thread di playback). Se il dispositivo non supporta i custom AudioProcessor
        // il sink resta silenzioso e il video detector continua a funzionare da solo.
        val renderersFactory = CreditsRenderersFactory(this, creditsAudioMonitor.sink)
            .setEnableDecoderFallback(true)
            .setExtensionRendererMode(DefaultRenderersFactory.EXTENSION_RENDERER_MODE_ON)

        player = ExoPlayer.Builder(this, renderersFactory)
            .setLoadControl(loadControl)
            .setMediaSourceFactory(mediaSourceFactory)
            .setHandleAudioBecomingNoisy(true)
            // Live catch-up: dopo un buffering il player accelera leggermente (0.98-1.04x)
            // per tornare al bordo live invece di restare indietro per sempre
            .setLivePlaybackSpeedControl(
                DefaultLivePlaybackSpeedControl.Builder()
                    .setFallbackMinPlaybackSpeed(0.98f)
                    .setFallbackMaxPlaybackSpeed(1.04f)
                    .build()
            )
            // Seek su TS: salta direttamente al keyframe più vicino (istantaneo) invece
            // del seek esatto che richiede ri-decodifica — solo per i live
            .setSeekParameters(if (isLive) SeekParameters.CLOSEST_SYNC else SeekParameters.DEFAULT)
            .build()
        
        player.addListener(object : Player.Listener {
            override fun onPlaybackStateChanged(state: Int) {
                when (state) {
                    Player.STATE_BUFFERING -> {
                        _isLoading.value = true
                        
                        // Timeout per i canali live: corto all'avvio (zapping rapido, si
                        // passa subito al formato alternativo se non parte), più lungo dopo
                        // che il flusso era già partito (evita switch su singhiozzi brevi).
                        if (contentType == ContentType.CHANNEL) {
                            val timeoutMs = if (hasReachedReady) 6_000L else 3_000L
                            bufferingHandler.removeCallbacks(bufferingTimeoutRunnable)
                            bufferingHandler.postDelayed(bufferingTimeoutRunnable, timeoutMs)
                        }
                    }
                    Player.STATE_READY -> {
                        _isLoading.value = false
                        bufferingHandler.removeCallbacks(bufferingTimeoutRunnable) // Cancel timeout
                        bufferingRetryCount = 0  // Reset retry counter on successful playback
                        hasReachedReady = true
                        // Il formato corrente funziona: memorizzalo per gli avvii successivi
                        if (contentType == ContentType.CHANNEL) rememberCurrentStreamFormat()
                        updateAudioTracks()  // Populate audio tracks when ready
                        if (contentType == ContentType.CHANNEL) updateLiveState()

                        // ===== Diagnostica Passo 0: tunneling + formato video =====
                        if (!creditsTunnelLogged) {
                            creditsTunnelLogged = true
                            val tunneling = try {
                                if (::player.isInitialized) player.isTunnelingEnabled else false
                            } catch (_: Exception) { false }
                            val vFormat = player.videoFormat
                            val aFormat = player.audioFormat
                            android.util.Log.i(
                                "CreditsDiag",
                                "playback contentType=$contentType contentId=$contentId " +
                                    "tunneling=$tunneling video=${vFormat?.sampleMimeType ?: "-"}@${vFormat?.width ?: 0}x${vFormat?.height ?: 0} " +
                                    "audio=${aFormat?.sampleMimeType ?: "-"} durMs=${player.duration} " +
                                    "streamIsHls=${currentVariantUrl().substringBefore('?').endsWith(".m3u8", true)}"
                            )
                        }
                    }
                    Player.STATE_ENDED, Player.STATE_IDLE -> {
                         bufferingHandler.removeCallbacks(bufferingTimeoutRunnable) // Cancel timeout
                         if (state == Player.STATE_ENDED) onPlaybackEnded()
                    }
                    else -> {}
                }
            }
            
            override fun onVideoSizeChanged(videoSize: androidx.media3.common.VideoSize) {
                _videoQuality.value = videoQualityLabel(videoSize.height)
            }

            override fun onIsPlayingChanged(isPlaying: Boolean) {
                _isPlaying.value = isPlaying
                if (isPlaying) {
                    startProgressUpdates()
                } else {
                    stopProgressUpdates()
                }
            }

            override fun onPositionDiscontinuity(
                oldPosition: Player.PositionInfo,
                newPosition: Player.PositionInfo,
                reason: Int
            ) {
                // Salto indietro: annulla overlay/trigger e ri-arma la detection,
                // così il meccanismo non resta "acceso" mentre si riavvolge.
                if (reason == Player.DISCONTINUITY_REASON_SEEK) {
                    // Qualsiasi seek rompe la continuità dei frame: ri-arma il watchdog.
                    _creditsSeekGeneration.intValue++
                    if (newPosition.positionMs < oldPosition.positionMs - BACKWARD_SEEK_RESET_MS) {
                        onBackwardSeek()
                    }
                }
            }
            
            override fun onPlayerError(error: PlaybackException) {
                android.util.Log.e("PlayerActivity", "Playback error: ${error.message}")
                
                // Auto-retry on error for live channels
                if (contentType == ContentType.CHANNEL) {
                    // Prova prima il formato alternativo (.ts <-> .m3u8) invece di
                    // ritentare all'infinito lo stesso URL che non parte.
                    if (trySwitchStreamVariant()) return

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
                var episode: it.wavestream.app.data.database.entity.Episode? = null
                if (progress != null) {
                    episode = episodeDao.getEpisodeById(progress.contentId)
                    // Se l'ultimo episodio visto è completato, passa al successivo non ancora visto
                    // (coerente col detail view: "Riproduci SxEy" dopo aver finito un episodio)
                    if (episode != null && progress.isCompleted) {
                        findNextUnwatchedEpisode(episode)?.let { episode = it }
                    }
                    // Id orfano nei progressi: un re-sync rigenera le PK degli episodi
                    // (INSERT OR REPLACE) → il vecchio contentId può non esistere più.
                    // Rimappiamo via (stagione, numero episodio) salvati nel progresso.
                    if (episode == null && (progress.season ?: 0) > 0 && (progress.episode ?: 0) > 0) {
                        episode = episodeDao.getEpisode(contentId, progress.season!!, progress.episode!!)
                        if (episode != null && progress.isCompleted) {
                            findNextUnwatchedEpisode(episode)?.let { episode = it }
                        }
                    }
                }
                if (episode == null) {
                    // No progress (o progresso non rimappabile) — primo episodio disponibile
                    episode = episodeDao.getFirstEpisodeForSeries(contentId)
                }
                // Gli episodi vengono sincronizzati nel DB solo aprendo il dettaglio della
                // serie: se il play arriva direttamente dall'hero (senza passare dal
                // dettaglio) la tabella episodes può essere vuota e si finiva con
                // "URL streaming mancante" — sia col bottone "Riproduci" sia con
                // "Riprendi". Sincronizziamo ora dal provider e riproviamo.
                if (episode == null) {
                    android.util.Log.d("PlayerActivity", "Nessun episodio in DB per la serie $contentId — sync episodi dal provider…")
                    android.widget.Toast.makeText(this@PlayerActivity, "Caricamento episodi in corso…", android.widget.Toast.LENGTH_SHORT).show()
                    try {
                        playlistRepository.loadSeriesEpisodes(contentId)
                    } catch (e: Exception) {
                        android.util.Log.e("PlayerActivity", "Sync episodi fallita per serie $contentId: ${e.message}")
                    }
                    if (progress != null && (progress.season ?: 0) > 0 && (progress.episode ?: 0) > 0) {
                        // Riprendi: risale all'episodio del progresso via (stagione, episodio)
                        episode = episodeDao.getEpisode(contentId, progress.season!!, progress.episode!!)
                        if (episode != null && progress.isCompleted) {
                            findNextUnwatchedEpisode(episode)?.let { episode = it }
                        }
                    }
                    episode = episode ?: episodeDao.getFirstEpisodeForSeries(contentId)
                }
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
    
    /**
     * Trova il prossimo episodio non ancora completato nella sequenza della serie
     * (prossimo nella stessa stagione, altrimenti stagioni successive), o null se finiti.
     */
    private suspend fun findNextUnwatchedEpisode(current: it.wavestream.app.data.database.entity.Episode): it.wavestream.app.data.database.entity.Episode? {
        var season = current.seasonNumber
        var episodeNumber = current.episodeNumber
        var attempts = 0
        while (attempts < 500) {
            attempts++
            val next = episodeDao.getEpisode(current.seriesId, season, episodeNumber + 1)
                ?: episodeDao.getEpisodesBySeasonList(current.seriesId, season + 1).minByOrNull { it.episodeNumber }
                ?: return null
            val progress = watchProgressDao.getProgress(profileId, ContentType.EPISODE, next.id)
            if (progress == null || !progress.isCompleted) return next
            season = next.seasonNumber
            episodeNumber = next.episodeNumber
        }
        return null
    }

    @androidx.annotation.OptIn(UnstableApi::class)
    private fun startPlayback() {
        try {
            creditsTunnelLogged = false
            hasReachedReady = false
            onPlaybackContentChanged()
            streamVariants = buildStreamVariants(streamUrl)
            streamVariantIndex = 0
            val mediaItem = MediaItem.fromUri(Uri.parse(currentVariantUrl()))
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
     * Aggiorna lo stato live/DVR del canale (sul live o dietro al diretto)
     */
    private fun updateLiveState() {
        if (!::player.isInitialized) return
        _isLive.value = player.isCurrentMediaItemLive || player.duration == androidx.media3.common.C.TIME_UNSET
        val behindLiveMs = if (player.duration > 0) {
            player.duration - player.currentPosition
        } else {
            player.currentLiveOffset
        }
        _isAtLiveEdge.value = behindLiveMs < LIVE_EDGE_THRESHOLD_MS
        // Sui live il timeshift è possibile solo con una finestra DVR (HLS sliding
        // window / EVENT). I .ts progressivi non sono seekable: niente indietro.
        _isLiveSeekable.value = player.isCurrentMediaItemSeekable
    }

    /**
     * Torna al bordo del live (solo canali live) - stile Sky/DAZN
     */
    private fun returnToLive() {
        resetAutoPlayCounter()
        if (!::player.isInitialized) return
        android.util.Log.d("PlayerActivity", "Returning to live edge")
        player.seekToDefaultPosition()
        player.play()
        _isAtLiveEdge.value = true
        if (player.duration > 0) {
            _currentPosition.longValue = player.duration
        }
    }

    /**
     * Limite superiore del seek per i live: il bordo del diretto
     */
    private fun liveSeekMaxMs(): Long {
        return if (player.duration > 0) player.duration else player.currentPosition
    }

    // ===================== Mini Player Live =====================

    /**
     * Attiva/disattiva la modalità mini player (solo canali live):
     * video ridotto a sinistra + lista canali della categoria a destra
     */
    private fun toggleMiniPlayer() {
        if (contentType != ContentType.CHANNEL) return
        resetAutoPlayCounter()
        _isMiniPlayer.value = !_isMiniPlayer.value
        if (_isMiniPlayer.value) {
            _controlsVisible.value = false
            _currentChannelId.longValue = contentId
            loadMiniPlayerData()
        } else {
            _controlsVisible.value = true
        }
    }

    /**
     * Carica categorie e canali per il mini player
     */
    private fun loadMiniPlayerData() {
        lifecycleScope.launch {
            try {
                val cats = withContext(Dispatchers.IO) { channelDao.getCategoriesList() }
                if (cats.isEmpty()) return@launch
                _liveCategories.value = cats

                val current = withContext(Dispatchers.IO) { channelDao.getChannelById(contentId) }
                val currentCategory = current?.category
                val idx = cats.indexOf(currentCategory).takeIf { it >= 0 } ?: 0
                _liveCategoryIndex.intValue = idx
                loadChannelsForCategory(idx)
            } catch (e: Exception) {
                android.util.Log.e("PlayerActivity", "Mini player data load failed: ${e.message}", e)
            }
        }
    }

    /**
     * Cambia categoria nel mini player (chiamato dalle frecce ‹ ›)
     */
    private fun loadChannelsForCategory(index: Int) {
        val cats = _liveCategories.value
        if (cats.isEmpty()) return
        val clamped = index.coerceIn(0, cats.size - 1)
        _liveCategoryIndex.intValue = clamped
        lifecycleScope.launch {
            try {
                val channels = withContext(Dispatchers.IO) {
                    channelDao.getChannelsByCategoryList(cats[clamped])
                }
                _liveChannels.value = channels.map {
                    MiniChannelInfo(it.id, it.name, it.logoUrl)
                }
            } catch (e: Exception) {
                android.util.Log.e("PlayerActivity", "Mini channel list load failed: ${e.message}", e)
            }
        }
    }

    /**
     * Switch canale dal mini player: cambia stream senza uscire dal player
     */
    private fun onMiniChannelSelected(channelId: Long) {
        if (channelId == contentId) return
        lifecycleScope.launch {
            try {
                val channel = withContext(Dispatchers.IO) { channelDao.getChannelById(channelId) }
                    ?: return@launch

                contentId = channel.id
                streamUrl = channel.streamUrl
                title = channel.name
                subtitle = channel.category
                _liveCategory.value = channel.category
                _currentChannelId.longValue = channel.id
                _isAtLiveEdge.value = true
                bufferingRetryCount = 0
                resetAutoPlayCounter()

                android.util.Log.d("PlayerActivity", "Mini player switching to channel: ${channel.name}")
                player.setMediaItem(MediaItem.fromUri(Uri.parse(channel.streamUrl)))
                player.prepare()
                player.play()
            } catch (e: Exception) {
                android.util.Log.e("PlayerActivity", "Mini channel switch failed: ${e.message}", e)
                android.widget.Toast.makeText(
                    this@PlayerActivity,
                    "Errore nel cambio canale",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    /**
     * Simple seek by milliseconds (for media keys)
     */
    /**
     * Seek rapido con la barra dei controlli nascosta: D-pad sinistra/destra.
     * Applica subito lo spostamento e mostra per ~1s l'indicatore "+N s / -N s",
     * senza riaprire la barra (modalità di visione pulita).
     */
    private fun hiddenBarSeek(seconds: Int) {
        if (!::player.isInitialized) return
        if (contentType == ContentType.CHANNEL) {
            updateLiveState()
            if (!player.isCurrentMediaItemSeekable) {
                android.widget.Toast.makeText(
                    this,
                    "Questo canale non supporta il timeshift",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
                return
            }
        }
        seekBy(seconds * 1000L, fromLiveControls = true)

        // Feedback visivo transitorio (l'overlay appare solo a barra chiusa)
        _hiddenSeekSeconds.intValue = seconds
        hiddenSeekHandler.removeCallbacks(hiddenSeekClearRunnable)
        hiddenSeekHandler.postDelayed(hiddenSeekClearRunnable, 1_000L)
    }

    private fun seekBy(ms: Long, fromLiveControls: Boolean = false) {
        resetAutoPlayCounter()
        if (contentType == ContentType.CHANNEL) {
            updateLiveState()
            // Indietro/avanti esplicito sui live: se lo stream non è seekable il
            // telecomando non deve restare bloccato su un comando che non fa nulla.
            if (fromLiveControls && !player.isCurrentMediaItemSeekable) {
                android.widget.Toast.makeText(
                    this,
                    "Questo canale non supporta il timeshift",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
                return
            }
            val target = player.currentPosition + ms
            if (target >= liveSeekMaxMs() - 2_000) {
                // Oltre il bordo del live: torna al diretto
                returnToLive()
            } else {
                player.seekTo(target.coerceAtLeast(0))
                // Feedback immediato: siamo dietro al diretto (il tick da 1s riconferma)
                _isAtLiveEdge.value = false
            }
            return
        }
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
            
            // Live: non si può andare oltre il diretto (stile Sky/DAZN)
            if (contentType == ContentType.CHANNEL && newPosition >= liveSeekMaxMs() - 2_000) {
                returnToLive()
                cancelSeek()
                return
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
                if (contentType == ContentType.CHANNEL) {
                    updateLiveState()
                }
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
                    
                    // Show next episode overlay: ultimi 10s del file, oppure appena
                    // vengono rilevati i titoli di coda (marker esatto o analisi immagini).
                    // Il trigger anticipato è attivo solo con autoplay attivo: altrimenti
                    // l'overlay coprirebbe lo schermo per l'intera durata dei credits.
                    // Fase 4: il monitor audio aggiorna la posizione e resta attivo nella
                    // parte iniziale dell'episodio per riconoscere la sigla.
                    creditsAudioMonitor.enabled = _creditsAudioEnabled.value
                    creditsAudioMonitor.playerPositionMs = player.currentPosition
                    creditsAudioMonitor.introActive =
                        contentType == ContentType.EPISODE && player.currentPosition < INTRO_SCAN_MS

                    // Riconoscimento della sigla via fingerprint: appena la testa della
                    // sigla combacia, ricostruiamo inizio/fine e mostriamo "Salta sigla".
                    if (introStartMs == null && creditsAudioMonitor.introMatch && player.duration > 0) {
                        val refDur = creditsAudioMonitor.referenceDurationMs()
                        if (refDur > 0) {
                            val start = (player.currentPosition - creditsAudioMonitor.prefixDurationMs()).coerceAtLeast(0)
                            introStartMs = start
                            introEndMs = (start + refDur).coerceAtMost(player.duration)
                            android.util.Log.i(
                                "CreditsDiag",
                                "introDetectedByFingerprint start=$introStartMs end=$introEndMs"
                            )
                        }
                    }

                    // Sigla: se non c'è fingerprint né marker, stima dalla serie.
                    if (introStartMs == null && introEndMs == null && !introFingerprintActive &&
                        seriesIntroReference != null && player.duration > 0
                    ) {
                        mediaSegmentRepository.estimateIntro(seriesIntroReference!!, player.duration)?.let {
                            introStartMs = it.first
                            introEndMs = it.second
                            android.util.Log.i("CreditsDiag", "introEstimated start=${it.first} end=${it.second}")
                        }
                    }

                    // Sigla: mostra "Salta sigla" se esiste un segmento INTRO completo.
                    val iStart = introStartMs
                    val iEnd = introEndMs
                    if (iStart != null && iEnd != null && iEnd > iStart) {
                        val p = player.currentPosition
                        _showSkipIntro.value = p >= iStart && p < iEnd - 1_500
                    } else if (_showSkipIntro.value) {
                        _showSkipIntro.value = false
                    }

                    // Fase 2: arma il monitor audio solo nella finestra finale del VOD.
                    val inCreditsWindow = contentType != ContentType.CHANNEL &&
                        (player.duration - player.currentPosition) <= CreditsDetector.WINDOW_MS
                    creditsAudioMonitor.windowActive = inCreditsWindow
                    _audioCandidate.value = creditsAudioMonitor.candidate

                    if (!creditsDismissed && !nextEpisodeTriggered && contentType == ContentType.EPISODE) {
                        // Livello 0: marker esatto dell'utente (o futuro EXTERNAL_DB).
                        val markerStart = creditsMarkerStartMs
                        if (markerStart != null && !creditsDetected &&
                            player.currentPosition >= markerStart
                        ) {
                            android.util.Log.i(
                                "CreditsDiag",
                                "markerTrigger pos=${player.currentPosition} marker=$markerStart"
                            )
                            onCreditsDetected()
                        }
                        val remainingMs = player.duration - player.currentPosition
                        val creditsTrigger = creditsDetected && _autoPlayNextEnabled.value
                        if (remainingMs in 1..10_000 || creditsTrigger) {
                            nextEpisodeTriggered = true
                            triggerNextEpisodeOverlay(fromCredits = creditsTrigger)
                        }
                    }
                }
                progressHandler.postDelayed(this, 1000)
            }
        })
    }
    
    /**
     * Chiamato dal watchdog dei frame quando i titoli di coda vengono rilevati a video.
     */
    private fun onCreditsDetected() {
        if (creditsDetected) return
        creditsDetected = true
        android.util.Log.d("PlayerActivity", "Titoli di coda rilevati: overlay prossimo episodio anticipato")
    }

    /**
     * Token indietro rilevato: annulla overlay/countdown e ri-arma la detection.
     */
    private fun onBackwardSeek() {
        android.util.Log.i(
            "CreditsDiag",
            "backwardSeek reset pos=${if (::player.isInitialized) player.currentPosition else 0} " +
                "creditsDetected=$creditsDetected nextTriggered=$nextEpisodeTriggered overlay=${_nextEpisode.value != null}"
        )
        // Tornando indietro il meccanismo si ri-arma: l'eventuale "ignora" decade.
        creditsDismissed = false
        creditsAudioMonitor.reset()
        _audioCandidate.value = false
        hideNextEpisodeOverlay() // resetta nextEpisodeTriggered e creditsDetected
    }

    /**
     * L'utente ha ignorato l'overlay "Prossimo episodio": lo chiude e non lo ripropone
     * per questo contenuto (così il timer scaduto non fa partire l'episodio successivo).
     */
    private fun cancelNextEpisodeOverlay() {
        android.util.Log.i("CreditsDiag", "nextEpisodeOverlay dismissed by user")
        creditsDismissed = true
        hideNextEpisodeOverlay()
    }

    /**
     * Cambio di contenuto nello stesso PlayerActivity (start, prossimo/precedente episodio):
     * azzera lo stato del trigger e ricarica il marker del NUOVO contenuto.
     * Senza questo, il marker dell'episodio precedente resterebbe attivo (bug).
     */
    private fun onPlaybackContentChanged() {
        creditsDetected = false
        creditsDismissed = false
        nextEpisodeTriggered = false
        creditsMarkerStartMs = null
        creditsMarkerEndMs = null
        creditsMarkerLoaded = false
        introStartMs = null
        introEndMs = null
        seriesIntroReference = null
        introFingerprintActive = false
        creditsAudioMonitor.setIntroReference(null)
        _showSkipIntro.value = false
        creditsAudioMonitor.reset()
        creditsAudioMonitor.windowActive = false
        _audioCandidate.value = false
        hideNextEpisodeOverlay()
        _creditsSeekGeneration.intValue++
        loadCreditsMarker()
    }

    /**
     * Risolve `tmdbId`/`imdbId` del contenuto corrente tramite gli enrichment già presenti
     * nel DB, così i marker sopravvivono ai cambi di playlist (gli id locali cambiano).
     */
    private suspend fun resolveContentIdentity(): Pair<Int?, String?> = withContext(Dispatchers.IO) {
        try {
            when (contentType) {
                ContentType.MOVIE -> {
                    val m = movieDao.getMovieById(contentId)
                    (m?.tmdbId) to (m?.tmdbImdbId)
                }
                ContentType.EPISODE, ContentType.SERIES -> {
                    val sid = seriesId ?: contentId
                    val s = seriesDao.getSeriesById(sid)
                    (s?.tmdbId) to (s?.tmdbImdbId)
                }
                else -> null to null
            }
        } catch (e: Exception) {
            android.util.Log.w("CreditsDiag", "resolveContentIdentity failed: ${e.message}")
            null to null
        }
    }

    /**
     * Livello 0: carica il marker esatto dei titoli di coda (se esiste) per il contenuto corrente.
     */
    private fun loadCreditsMarker() {
        lifecycleScope.launch {
            try {
                val (tmdbId, imdbId) = resolveContentIdentity()
                val seg = mediaSegmentRepository.getExact(
                    contentType = contentType,
                    contentId = contentId,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    tmdbId = tmdbId,
                    imdbId = imdbId,
                    type = SegmentType.CREDITS
                )
                creditsMarkerStartMs = seg?.startMs
                creditsMarkerEndMs = seg?.endMs
                creditsMarkerLoaded = true

                val intro = mediaSegmentRepository.getExact(
                    contentType = contentType,
                    contentId = contentId,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    tmdbId = tmdbId,
                    imdbId = imdbId,
                    type = SegmentType.INTRO
                )
                introStartMs = intro?.startMs
                introEndMs = intro?.endMs
                // Fase 4: se esiste un fingerprint della sigla per la serie, ha la precedenza
                // sull'eventuale stima per posizione relativa.
                val fpSegment = if (seriesId != null && contentType == ContentType.EPISODE) {
                    mediaSegmentRepository.getSeriesIntroFingerprint(seriesId!!)
                } else null
                val fp = AudioFingerprintCodec.decode(fpSegment?.fingerprint)
                creditsAudioMonitor.setIntroReference(fp)
                introFingerprintActive = fp != null

                seriesIntroReference = if (intro == null && !introFingerprintActive && seriesId != null && contentType == ContentType.EPISODE) {
                    mediaSegmentRepository.getSeriesIntroReference(seriesId!!)
                } else null
                if (intro != null) {
                    android.util.Log.i(
                        "CreditsDiag",
                        "markerFound type=INTRO startMs=${intro.startMs} endMs=${intro.endMs} source=${intro.source}"
                    )
                } else if (seriesIntroReference != null) {
                    android.util.Log.i(
                        "CreditsDiag",
                        "markerFound type=INTRO_SERIES_REF startMs=${seriesIntroReference?.startMs} endMs=${seriesIntroReference?.endMs}"
                    )
                }
                if (seg != null) {
                    android.util.Log.i(
                        "CreditsDiag",
                        "markerFound type=CREDITS startMs=${seg.startMs} endMs=${seg.endMs} " +
                            "source=${seg.source} confidence=${seg.confidence} durationMs=${seg.durationMs}"
                    )
                } else {
                    android.util.Log.i(
                        "CreditsDiag",
                        "markerMissing type=CREDITS contentId=$contentId contentType=$contentType " +
                            "seriesId=$seriesId s=$season e=$episode tmdbId=$tmdbId imdbId=$imdbId"
                    )
                }
            } catch (e: Exception) {
                android.util.Log.w("CreditsDiag", "loadCreditsMarker failed: ${e.message}")
            }
        }
    }

    /**
     * Marker sigla con toggle: primo tocco = inizio, secondo tocco = fine.
     */
    private fun markIntroNow() {
        if (!::player.isInitialized) return
        val position = player.currentPosition
        val duration = player.duration
        if (duration <= 0L || position <= 0L) {
            android.widget.Toast.makeText(this, "Impossibile registrare il marker qui", android.widget.Toast.LENGTH_SHORT).show()
            return
        }
        lifecycleScope.launch {
            try {
                val (tmdbId, imdbId) = resolveContentIdentity()
                val existing = mediaSegmentRepository.getExact(
                    contentType = contentType,
                    contentId = contentId,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    tmdbId = tmdbId,
                    imdbId = imdbId,
                    type = SegmentType.INTRO
                )
                if (existing == null || existing.endMs != null) {
                    mediaSegmentRepository.setUserMarker(
                        contentType = contentType,
                        contentId = contentId,
                        type = SegmentType.INTRO,
                        startMs = position,
                        endMs = null,
                        durationMs = duration,
                        seriesId = seriesId,
                        season = season,
                        episode = episode,
                        tmdbId = tmdbId,
                        imdbId = imdbId
                    )
                    introStartMs = position
                    introEndMs = null
                    android.widget.Toast.makeText(this@PlayerActivity, "Inizio sigla salvato", android.widget.Toast.LENGTH_SHORT).show()
                } else {
                    mediaSegmentRepository.setUserMarker(
                        contentType = contentType,
                        contentId = contentId,
                        type = SegmentType.INTRO,
                        startMs = existing.startMs,
                        endMs = position,
                        durationMs = duration,
                        seriesId = seriesId,
                        season = season,
                        episode = episode,
                        tmdbId = tmdbId,
                        imdbId = imdbId
                    )
                    introStartMs = existing.startMs
                    introEndMs = position
                    // Fase 4: cattura il fingerprint audio della sigla per riconoscerla
                    // negli episodi successivi della stessa serie.
                    if (seriesId != null) {
                        val fp = creditsAudioMonitor.buildFingerprint(existing.startMs, position)
                        if (fp != null) {
                            mediaSegmentRepository.saveIntroFingerprint(
                                contentType = contentType,
                                contentId = contentId,
                                seriesId = seriesId,
                                season = season,
                                episode = episode,
                                tmdbId = tmdbId,
                                imdbId = imdbId,
                                startMs = existing.startMs,
                                endMs = position,
                                durationMs = duration,
                                fingerprint = AudioFingerprintCodec.encode(fp)
                            )
                            creditsAudioMonitor.setIntroReference(fp)
                            introFingerprintActive = true
                            android.util.Log.i(
                                "CreditsDiag",
                                "introFingerprintSaved frames=${fp.frames} bands=${fp.bands} durMs=${fp.durationMs}"
                            )
                        } else {
                            android.util.Log.i("CreditsDiag", "introFingerprintUnavailable (history insufficient)")
                        }
                    }
                    android.widget.Toast.makeText(this@PlayerActivity, "Fine sigla salvata", android.widget.Toast.LENGTH_SHORT).show()
                }
                android.util.Log.i(
                    "CreditsDiag",
                    "markerSaved type=INTRO start=$introStartMs end=$introEndMs contentId=$contentId"
                )
            } catch (e: Exception) {
                android.util.Log.e("CreditsDiag", "markIntroNow failed: ${e.message}", e)
            }
        }
    }

    private fun skipIntro() {
        val end = introEndMs ?: return
        resetAutoPlayCounter()
        if (::player.isInitialized) {
            android.util.Log.i("CreditsDiag", "skipIntro to=$end")
            player.seekTo(end)
        }
        _showSkipIntro.value = false
    }

    /**
     * Salva un segmento marcato manualmente dall'utente alla posizione corrente.
     */
    private fun markSegmentNow(type: SegmentType) {
        if (!::player.isInitialized) return
        val position = player.currentPosition
        val duration = player.duration
        if (duration <= 0L || position <= 0L) {
            android.widget.Toast.makeText(
                this,
                "Impossibile registrare il marker qui",
                android.widget.Toast.LENGTH_SHORT
            ).show()
            return
        }
        lifecycleScope.launch {
            try {
                val (tmdbId, imdbId) = resolveContentIdentity()
                mediaSegmentRepository.setUserMarker(
                    contentType = contentType,
                    contentId = contentId,
                    type = type,
                    startMs = position,
                    durationMs = duration,
                    seriesId = seriesId,
                    season = season,
                    episode = episode,
                    tmdbId = tmdbId,
                    imdbId = imdbId
                )
                if (type == SegmentType.CREDITS) {
                    creditsMarkerStartMs = position
                    creditsMarkerLoaded = true
                }
                android.util.Log.i(
                    "CreditsDiag",
                    "markerSaved type=$type pos=$position duration=$duration " +
                        "contentId=$contentId contentType=$contentType seriesId=$seriesId s=$season e=$episode"
                )
                val label = when (type) {
                    SegmentType.CREDITS -> "Inizio titoli di coda"
                    SegmentType.INTRO -> "Inizio sigla"
                    SegmentType.RECAP -> "Inizio recap"
                    SegmentType.PREVIEW -> "Inizio anteprima"
                }
                android.widget.Toast.makeText(
                    this@PlayerActivity,
                    "$label salvato",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            } catch (e: Exception) {
                android.util.Log.e("CreditsDiag", "markSegmentNow failed: ${e.message}", e)
                android.widget.Toast.makeText(
                    this@PlayerActivity,
                    "Errore nel salvataggio del marker",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun triggerNextEpisodeOverlay(fromCredits: Boolean = false) {
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
                showNextEpisodeOverlay(
                    next = next,
                    countdownSeconds = if (fromCredits) CREDITS_NEXT_COUNTDOWN_SECONDS else DEFAULT_NEXT_COUNTDOWN_SECONDS
                )
            }
        }
    }
    
    private fun stopProgressUpdates() {
        progressHandler.removeCallbacksAndMessages(null)
    }
    
    private fun onPlaybackEnded() {
        // L'utente ha ignorato l'overlay: alla fine del file NON si passa all'episodio
        // successivo, si chiude il player.
        if (creditsDismissed) {
            android.util.Log.i("CreditsDiag", "playbackEnded after dismiss -> finish")
            finish()
            return
        }
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
    
    private fun showNextEpisodeOverlay(
        next: PlayNextManager.NextContent,
        countdownSeconds: Int = DEFAULT_NEXT_COUNTDOWN_SECONDS
    ) {
        nextEpisodeCountdown = countdownSeconds
        _nextEpisode.value = NextEpisodeInfo(
            title = next.title,
            subtitle = next.subtitle,
            countdown = nextEpisodeCountdown,
            totalCountdown = countdownSeconds,
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
                        totalCountdown = countdownSeconds,
                        autoPlay = _autoPlayNextEnabled.value
                    )
                    nextEpisodeHandler.postDelayed(this, 1000)
                } else {
                    if (_autoPlayNextEnabled.value) {
                         playNextEpisode(isAutoPlay = true)
                    }
                }
            }
        })
    }
    
    private fun hideNextEpisodeOverlay() {
        _nextEpisode.value = null
        nextEpisodeHandler.removeCallbacksAndMessages(null)
        nextEpisodeTriggered = false
        creditsDetected = false
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

                onPlaybackContentChanged()

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

                onPlaybackContentChanged()

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
            // D-pad sinistra/destra con la barra dei controlli nascosta: seek
            // rapido avanti/indietro senza dover aprire la barra. Con i controlli
            // visibili l'evento non arriva qui (il focus Compose naviga i pulsanti).
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (!_controlsVisible.value && !_isMiniPlayer.value) {
                    hiddenBarSeek(-HIDDEN_SEEK_STEP_SECONDS)
                    return true
                }
                return false
            }
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (!_controlsVisible.value && !_isMiniPlayer.value) {
                    hiddenBarSeek(HIDDEN_SEEK_STEP_SECONDS)
                    return true
                }
                return false
            }

            // D-pad center/enter: quando i controlli sono nascosti li mostra
            // senza toccare la riproduzione. Il focus va automaticamente sul
            // pulsante Play/Pausa (TvPlayerScreen), così un secondo OK decide
            // l'azione: mai mettere in pausa "di sorpresa" premendo OK.
            // Quando i controlli sono visibili, gestisce Compose (click sui bottoni).
            KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                if (!_controlsVisible.value) {
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
            // Back key - ignore next-episode overlay, else hide controls, else finish
            KeyEvent.KEYCODE_BACK -> {
                if (_nextEpisode.value != null) {
                    cancelNextEpisodeOverlay()
                    return true
                }
                if (_isMiniPlayer.value) {
                    // Dal mini player: torna al player a schermo intero
                    toggleMiniPlayer()
                    return true
                }
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
        hiddenSeekHandler.removeCallbacksAndMessages(null)
        creditsAudioMonitor.windowActive = false
        creditsAudioMonitor.introActive = false
        creditsAudioMonitor.setIntroReference(null)
        creditsAudioMonitor.reset()
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

