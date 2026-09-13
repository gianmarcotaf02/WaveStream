package it.wavestream.app.ui.player

import android.graphics.Bitmap
import android.os.Build
import android.view.SurfaceView
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import it.wavestream.app.R
import androidx.compose.ui.input.key.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import it.wavestream.app.player.CreditsDetector
import it.wavestream.app.player.ScreenFrameCapture
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive

/**
 * Modern TV Player Screen with clean, fluid design
 * Netflix/Prime Video inspired UI
 */
@Composable
fun TvPlayerScreen(
    player: ExoPlayer,
    title: String,
    subtitle: String? = null,
    isLoading: Boolean,
    currentPosition: Long,
    duration: Long,
    isPlaying: Boolean,
    controlsVisible: Boolean,
    onControlsVisibilityChanged: (Boolean) -> Unit,
    onPlayPause: () -> Unit,
    onSeek: (Int) -> Unit,
    onSeekConfirm: () -> Unit,
    onSeekCancel: () -> Unit,
    onSeekBack: () -> Unit = {},
    onSeekForward: () -> Unit = {},
    onSubtitles: () -> Unit,
    onBack: () -> Unit,
    isLiveChannel: Boolean = false,
    isAtLiveEdge: Boolean = true,
    isLiveSeekable: Boolean = false,
    onReturnToLive: () -> Unit = {},
    isMiniPlayer: Boolean = false,
    onToggleMiniPlayer: () -> Unit = {},
    liveCategories: List<String> = emptyList(),
    liveCategoryIndex: Int = 0,
    onCategoryChange: (Int) -> Unit = {},
    liveChannels: List<MiniChannelInfo> = emptyList(),
    currentChannelId: Long = 0L,
    onChannelSelect: (Long) -> Unit = {},
    onRestart: () -> Unit = {},
    nextEpisode: NextEpisodeInfo? = null,
    onPlayNext: () -> Unit = {},
    onCancelNext: () -> Unit = {},
    playbackSpeed: Float = 1.0f,
    onSpeedChange: () -> Unit = {},
    audioTracks: List<AudioTrackInfo> = emptyList(),
    currentAudioTrack: Int = 0,
    onAudioTrackChange: (AudioTrackInfo) -> Unit = {},
    @Suppress("UNUSED_PARAMETER")
    autoPlayEnabled: Boolean = true,
    hasNextEpisode: Boolean = false,
    hasPreviousEpisode: Boolean = false,
    onPlayPrevious: () -> Unit = {},
    creditsDetectionEnabled: Boolean = true,
    onCreditsDetected: () -> Unit = {},
    creditsDetectionDebug: Boolean = false,
    cumulativeSeekSeconds: Int = 0,
    seekIndicatorVisible: Boolean = false,
    showStillWatching: Boolean = false,
    onStillWatchingContinue: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val centerFocusRequester = remember { FocusRequester() }
    val bottomFirstFocusRequester = remember { FocusRequester() }

    // Riferimento alla view del player: serve per leggere i frame (rilevamento titoli di coda)
    val playerViewState = remember { mutableStateOf<PlayerView?>(null) }
    val creditsDebugText = remember { mutableStateOf("") }

    CreditsWatchdog(
        playerView = playerViewState.value,
        enabled = creditsDetectionEnabled,
        isLiveChannel = isLiveChannel,
        positionMs = currentPosition,
        durationMs = duration,
        debugText = if (creditsDetectionDebug) creditsDebugText else null,
        onCreditsDetected = onCreditsDetected
    )
    
    // Show controls when seeking
    LaunchedEffect(seekIndicatorVisible) {
        if (seekIndicatorVisible) {
            onControlsVisibilityChanged(true)
        }
    }
    
    // Auto-hide controls after 3 seconds (only at start or when paused)
    // Don't hide while user is actively seeking
    LaunchedEffect(controlsVisible, isPlaying, seekIndicatorVisible, cumulativeSeekSeconds) {
        if (controlsVisible) {
            delay(3000)
            if (isPlaying && !seekIndicatorVisible && cumulativeSeekSeconds == 0) {
                onControlsVisibilityChanged(false)
            }
        }
    }
    
    // Show controls when paused
    LaunchedEffect(isPlaying) {
        if (!isPlaying) {
            onControlsVisibilityChanged(true)
        }
    }
    
    // Autofocus sul bottone Play/Pausa.
    // Il focus va richiesto quando i controlli compaiono E quando il player ha
    // finito il caricamento: all'avvio i controlli sono già visibili ma il player
    // è in buffering, quindi il bottone Play non esiste ancora. Un semplice
    // LaunchedEffect(controlsVisible) non bastava (isLoading non era una chiave)
    // e il telecomando partiva "nel vuoto", cadendo poi sul tasto Indietro.
    var focusPending by remember { mutableStateOf(true) }
    LaunchedEffect(controlsVisible) {
        // Nuova comparsa dei controlli (0->1): richiedi di nuovo il focus.
        // Non lo facciamo a ogni cambio di isLoading, altrimenti un rebuffering
        // durante la navigazione dei controlli riporterebbe il focus sul Play.
        if (controlsVisible) focusPending = true
    }
    LaunchedEffect(controlsVisible, isLoading, focusPending) {
        if (controlsVisible && !isLoading && focusPending) {
            // Piccolo retry: al primo frame il bottone potrebbe non essere ancora
            // agganciato al FocusRequester.
            repeat(5) {
                delay(80)
                val focused = runCatching { centerFocusRequester.requestFocus() }.isSuccess
                if (focused) {
                    focusPending = false
                    return@LaunchedEffect
                }
            }
        }
    }
    
    BoxWithConstraints(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            // Removed global OK/ENTER handler - each button handles its own click
            // This prevents play/pause when focus is on other buttons like Subtitles
            .focusable()
    ) {
        // Larghezza video animata: full screen oppure mini player (a sinistra)
        val videoWidth by animateDpAsState(
            targetValue = if (isMiniPlayer) maxWidth * 0.42f else maxWidth,
            animationSpec = tween(250),
            label = "videoWidth"
        )
        
        // Video Player
        AndroidView(
            factory = { context ->
                PlayerView(context).apply {
                    this.player = player
                    useController = false
                    setShowBuffering(PlayerView.SHOW_BUFFERING_NEVER)
                    playerViewState.value = this
                }
            },
            update = { it.player = player },
            modifier = Modifier
                .align(Alignment.CenterStart)
                .width(videoWidth)
                .then(
                    if (isMiniPlayer) {
                        Modifier
                            .padding(start = 40.dp)
                            .aspectRatio(16f / 9f)
                            .clip(RoundedCornerShape(12.dp))
                            .border(1.dp, Color.White.copy(alpha = 0.15f), RoundedCornerShape(12.dp))
                    } else {
                        Modifier.height(maxHeight)
                    }
                )
        )
        
        // Debug overlay: rilevamento titoli di coda (attivabile dalle impostazioni)
        if (creditsDetectionDebug) {
            Text(
                text = creditsDebugText.value,
                color = Color.Yellow,
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 24.dp, end = 24.dp)
                    .background(Color.Black.copy(alpha = 0.65f), RoundedCornerShape(6.dp))
                    .padding(horizontal = 10.dp, vertical = 6.dp)
            )
        }

        // Loading indicator (minimal design) - centrato sul video anche in mini mode
        AnimatedVisibility(
            visible = isLoading,
            enter = fadeIn(),
            exit = fadeOut(),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(
                    x = if (isMiniPlayer) (videoWidth - maxWidth) / 2f + 40.dp else 0.dp
                )
        ) {
            ModernLoadingIndicator()
        }
        
        // Mini player: pannello canali/categorie a destra
        if (isMiniPlayer) {
            LiveMiniPanel(
                categories = liveCategories,
                categoryIndex = liveCategoryIndex,
                channels = liveChannels,
                currentChannelId = currentChannelId,
                onCategoryChange = onCategoryChange,
                onChannelSelect = onChannelSelect,
                onExpand = onToggleMiniPlayer,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .fillMaxHeight()
                    .width((maxWidth - videoWidth).coerceAtLeast(0.dp))
            )
        }
        
        // Controls overlay
        AnimatedVisibility(
            visible = controlsVisible && !isMiniPlayer,
            enter = fadeIn(tween(200)),
            exit = fadeOut(tween(300))
        ) {
            ModernPlayerControls(
                title = title,
                subtitle = subtitle,
                currentPosition = currentPosition,
                duration = duration,
                isPlaying = isPlaying,
                isLoading = isLoading,
                onPlayPause = onPlayPause,
                onBack = onBack,
                isLiveChannel = isLiveChannel,
                isAtLiveEdge = isAtLiveEdge,
                isLiveSeekable = isLiveSeekable,
                onReturnToLive = onReturnToLive,
                onToggleMiniPlayer = onToggleMiniPlayer,
                onRestart = onRestart,
                onSubtitles = onSubtitles,
                cumulativeSeekSeconds = cumulativeSeekSeconds, // Pass cumulative seconds
                onSeek = onSeek,
                onSeekConfirm = onSeekConfirm,
                onSeekCancel = onSeekCancel,
                onSeekBack = onSeekBack,
                onSeekForward = onSeekForward,
                playbackSpeed = playbackSpeed,
                onSpeedChange = onSpeedChange,
                audioTracks = audioTracks,
                currentAudioTrack = currentAudioTrack,
                onAudioTrackChange = onAudioTrackChange,
                hasNextEpisode = hasNextEpisode,
                hasPreviousEpisode = hasPreviousEpisode,
                onPlayNext = onPlayNext,
                onPlayPrevious = onPlayPrevious,
                centerFocusRequester = centerFocusRequester,
                bottomFirstFocusRequester = bottomFirstFocusRequester
            )
        }
        
        // Seek indicator (always visible when seeking)
        AnimatedVisibility(
            visible = seekIndicatorVisible && cumulativeSeekSeconds != 0 && !isMiniPlayer,
            enter = fadeIn(tween(100)) + scaleIn(initialScale = 0.9f),
            exit = fadeOut(tween(200)),
            modifier = Modifier.align(Alignment.Center)
        ) {
            ModernSeekIndicator(seconds = cumulativeSeekSeconds)
        }
        
        // Next episode overlay
        nextEpisode?.let { next ->
            ModernNextEpisodeOverlay(
                title = next.title,
                subtitle = next.subtitle,
                countdown = next.countdown,
                totalCountdown = next.totalCountdown,
                autoPlay = next.autoPlay,
                onPlayNext = onPlayNext,
                onCancel = onCancelNext,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(32.dp)
            )
        }
        
        // Fixed clock overlay (always visible, semi-transparent)
        if (!isMiniPlayer) {
            PlayerClockOverlay(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp)
            )
        }
        
        // Still Watching Overlay
        if (showStillWatching) {
            StillWatchingOverlay(
                onContinue = onStillWatchingContinue,
                onExit = onBack
            )
        }
    }
}

/**
 * Overlay "Stai ancora guardando?"
 */
@Composable
private fun StillWatchingOverlay(
    onContinue: () -> Unit,
    onExit: () -> Unit
) {
    val focusRequester = remember { FocusRequester() }
    
    LaunchedEffect(Unit) {
        delay(100)
        focusRequester.requestFocus()
    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.85f))
            .clickable(enabled = false) {}, // Block clicks
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Text(
                text = "Stai ancora guardando?",
                style = MaterialTheme.typography.displaySmall,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            
            Text(
                text = "Hai guardato 3 episodi di fila.",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White.copy(alpha = 0.7f)
            )
            
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Primary Button: Continue
                Button(
                    onClick = onContinue,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = WaveStreamColors.Accent,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.focusRequester(focusRequester)
                ) {
                    Text("Continua a guardare")
                }
                
                // Secondary Button: Exit
                OutlinedButton(
                    onClick = onExit,
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color.White.copy(alpha = 0.5f))
                ) {
                    Text("Esci")
                }
            }
        }
    }
}

/**
 * Netflix-style player controls
 * - Title at top left with back button
 * - Play/pause at bottom left next to progress bar
 * - Additional controls at bottom right below progress bar
 */
@Composable
private fun ModernPlayerControls(
    title: String,
    subtitle: String?,
    currentPosition: Long,
    duration: Long,
    isPlaying: Boolean,
    isLoading: Boolean,
    onPlayPause: () -> Unit,
    onBack: () -> Unit,
    isLiveChannel: Boolean,
    isAtLiveEdge: Boolean,
    isLiveSeekable: Boolean,
    onReturnToLive: () -> Unit,
    onToggleMiniPlayer: () -> Unit,
    onRestart: () -> Unit,
    onSubtitles: () -> Unit,
    cumulativeSeekSeconds: Int,
    onSeek: (Int) -> Unit,
    onSeekConfirm: () -> Unit,
    onSeekCancel: () -> Unit,
    onSeekBack: () -> Unit,
    onSeekForward: () -> Unit,
    playbackSpeed: Float,
    onSpeedChange: () -> Unit,
    audioTracks: List<AudioTrackInfo>,
    currentAudioTrack: Int,
    onAudioTrackChange: (AudioTrackInfo) -> Unit,
    hasNextEpisode: Boolean,
    hasPreviousEpisode: Boolean,
    onPlayNext: () -> Unit,
    onPlayPrevious: () -> Unit,
    centerFocusRequester: FocusRequester,
    bottomFirstFocusRequester: FocusRequester
) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Top area with floating title (no opaque bar - modern floating style)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = 0.7f),
                            Color.Black.copy(alpha = 0.3f),
                            Color.Transparent
                        )
                    )
                )
                .padding(horizontal = 32.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // Back button
            ModernIconButton(
                icon = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Indietro",
                onClick = onBack,
                size = 44.dp
            )
            
            // Title and subtitle - floating text with shadow
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        shadow = androidx.compose.ui.graphics.Shadow(
                            color = Color.Black.copy(alpha = 0.8f),
                            offset = androidx.compose.ui.geometry.Offset(1f, 1f),
                            blurRadius = 6f
                        )
                    ),
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
                subtitle?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            shadow = androidx.compose.ui.graphics.Shadow(
                                color = Color.Black.copy(alpha = 0.8f),
                                offset = androidx.compose.ui.geometry.Offset(1f, 1f),
                                blurRadius = 4f
                            )
                        ),
                        color = Color.White.copy(alpha = 0.7f)
                    )
                }
            }
        }
        
        // Bottom controls - Netflix style layout
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.5f),
                            Color.Black.copy(alpha = 0.9f)
                        )
                    )
                )
                .padding(horizontal = 40.dp, vertical = 24.dp)
        ) {
            // Main row: Restart + Play/Pause button + Time + Progress bar + Duration
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Live: bottone "Torna al live" con icona LIVE lampeggiante.
                // VOD: Restart Button (Bottom Left) - Expands on focus
                if (isLiveChannel) {
                    LiveButton(
                        isAtLiveEdge = isAtLiveEdge,
                        onClick = onReturnToLive
                    )
                } else {
                    RestartButton(onClick = onRestart)
                }

                // Timeshift live: indietro di 10s (solo se lo stream ha una
                // finestra DVR/seekable; i .ts progressivi non lo supportano).
                if (isLiveChannel && isLiveSeekable) {
                    LiveSkipButton(
                        icon = Icons.Default.Replay10,
                        contentDescription = "Indietro di 10 secondi",
                        onClick = onSeekBack
                    )
                }

                // Play/Pause button (LEFT - Netflix style)
                if (!isLoading) {
                    NetflixPlayPauseButton(
                        isPlaying = isPlaying,
                        onClick = onPlayPause,
                        focusRequester = centerFocusRequester
                    )
                }

                // Timeshift live: avanti di 10s (fino al bordo del diretto)
                if (isLiveChannel && isLiveSeekable) {
                    LiveSkipButton(
                        icon = Icons.Default.Forward10,
                        contentDescription = "Avanti di 10 secondi",
                        onClick = onSeekForward
                    )
                }
                
                // Current time (updates during seek to show preview position)
                val displayPosition = if (cumulativeSeekSeconds != 0) {
                    (currentPosition + cumulativeSeekSeconds * 1000L).coerceIn(0, duration)
                } else {
                    currentPosition
                }
                Text(
                    text = formatTime(displayPosition),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.9f),
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.width(60.dp)
                )
                
                // Progress bar (takes remaining space)
                ModernProgressBar(
                    currentPosition = currentPosition,
                    duration = duration,
                    cumulativeSeekSeconds = cumulativeSeekSeconds,
                    onSeek = onSeek,
                    onSeekConfirm = onSeekConfirm,
                    onSeekCancel = onSeekCancel,
                    modifier = Modifier.weight(1f)
                )
                
                // Duration / Remaining time (per i live: badge LIVE o offset dal diretto)
                if (isLiveChannel) {
                    if (isAtLiveEdge) {
                        LiveEdgeBadge()
                    } else {
                        val remaining = duration - displayPosition
                        Text(
                            text = "-${formatTime(remaining.coerceAtLeast(0))}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.White.copy(alpha = 0.9f),
                            fontWeight = FontWeight.Medium
                        )
                    }
                } else {
                    val remaining = duration - displayPosition
                    Text(
                        text = "${formatTime(duration)} / -${formatTime(remaining.coerceAtLeast(0))}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.White.copy(alpha = 0.9f),
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            // Secondary row: Additional controls at RIGHT (below progress bar)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Speed button
                    ModernPillButton(
                        text = "${playbackSpeed}x",
                        onClick = onSpeedChange,
                        focusRequester = bottomFirstFocusRequester
                    )
                    
                    // Audio tracks (if multiple)
                    if (audioTracks.size > 1) {
                        ModernAudioButton(
                            audioTracks = audioTracks,
                            currentTrack = currentAudioTrack,
                            onTrackChange = onAudioTrackChange
                        )
                    }
                    
                    // Subtitles
                    ModernIconButton(
                        icon = Icons.Default.Subtitles,
                        contentDescription = "Sottotitoli",
                        onClick = onSubtitles,
                        size = 36.dp
                    )
                    
                    // Mini player con lista canali (solo live)
                    if (isLiveChannel) {
                        ModernIconButton(
                            icon = Icons.Default.Apps,
                            contentDescription = "Lista canali",
                            onClick = onToggleMiniPlayer,
                            size = 36.dp
                        )
                    }
                    
                    // Previous episode button (for series)
                    if (hasPreviousEpisode) {
                        ModernPreviousButton(onClick = onPlayPrevious)
                    }
                    
                    // Next episode button (for series)
                    if (hasNextEpisode) {
                        ModernNextButton(onClick = onPlayNext)
                    }
                }
            }
        }
    }
}

/**
 * Expanding Restart Button
 * Shows text "Dall'inizio" when focused
 */
@Composable
private fun RestartButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.2f),
        label = "bg"
    )
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "scale"
    )

    Row(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .height(48.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .animateContentSize(), // Animate width change
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.SkipPrevious,
            contentDescription = "Ricomincia",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        
        if (isFocused) {
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Dall'inizio",
                style = MaterialTheme.typography.labelLarge,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1
            )
        }
    }
}

/**
 * Colore rosso "broadcast" usato per l'identità LIVE (come Sky/DAZN)
 */
private val LiveRed = Color(0xFFE8112D)

/**
 * Bottone "Torna al live" (solo canali live):
 * - icona LIVE che lampeggia SEMPRE (anche sul diretto)
 * - sempre focusabile: premuto riporta al bordo del diretto
 * - dietro al diretto si accende in rosso ed espande "Torna al live"
 */
@Composable
private fun LiveButton(
    isAtLiveEdge: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val backgroundColor by animateColorAsState(
        targetValue = when {
            isFocused && !isAtLiveEdge -> LiveRed
            isFocused -> Color.White.copy(alpha = 0.25f)
            isAtLiveEdge -> Color.Transparent
            else -> Color.White.copy(alpha = 0.2f)
        },
        label = "liveBg"
    )

    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "scale"
    )

    Row(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .height(48.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .animateContentSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        LiveIcon(
            tint = LiveRed,
            pulsing = true,
            modifier = Modifier.size(24.dp)
        )

        val label = when {
            !isAtLiveEdge -> "Torna al live"
            isFocused -> "In diretta"
            else -> null
        }
        if (label != null) {
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1
            )
        }
    }
}

/**
 * Bottone timeshift per i canali live (indietro/avanti).
 * Stile circolare, si accende sull'accent quando è a fuoco.
 */
@Composable
private fun LiveSkipButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.2f),
        label = "skipBg"
    )
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        label = "skipScale"
    )

    Box(
        modifier = Modifier
            .size(48.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(CircleShape)
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = Color.White,
            modifier = Modifier.size(26.dp)
        )
    }
}

/**
 * Badge "LIVE" mostrato accanto alla barra quando si è sul diretto
 */
@Composable
private fun LiveEdgeBadge() {
    val pulse = rememberInfiniteTransition(label = "liveBadge")
    val alpha by pulse.animateFloat(
        initialValue = 0.55f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(900, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "alpha"
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        LiveIcon(
            tint = LiveRed,
            pulsing = true,
            modifier = Modifier
                .size(18.dp)
                .graphicsLayer { this.alpha = alpha }
        )
        Text(
            text = "LIVE",
            style = MaterialTheme.typography.labelLarge,
            color = LiveRed,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )
    }
}

/**
 * Icona "live" (pallino con archi di diffusione, stile broadcast)
 * disegnata via Canvas per non dipendere da drawable
 */
@Composable
private fun LiveIcon(
    tint: Color,
    pulsing: Boolean,
    modifier: Modifier = Modifier
) {
    val pulse = rememberInfiniteTransition(label = "liveIcon")
    val arcAlpha by pulse.animateFloat(
        initialValue = 0.5f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(900, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "arcAlpha"
    )

    Canvas(modifier = modifier) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val stroke = Stroke(width = size.width * 0.11f, cap = StrokeCap.Round)

        // Pallino centrale
        drawCircle(
            color = tint,
            radius = size.width * 0.15f,
            center = center
        )

        // Due archi per lato (destra e sinistra)
        listOf(0.30f, 0.46f).forEach { radiusFactor ->
            val radius = size.width * radiusFactor
            val topLeft = Offset(center.x - radius, center.y - radius)
            val arcSize = Size(radius * 2f, radius * 2f)
            val alpha = if (pulsing) arcAlpha else 1f

            // Arco destro
            drawArc(
                color = tint.copy(alpha = alpha),
                startAngle = -55f,
                sweepAngle = 110f,
                useCenter = false,
                topLeft = topLeft,
                size = arcSize,
                style = stroke
            )
            // Arco sinistro
            drawArc(
                color = tint.copy(alpha = alpha),
                startAngle = 125f,
                sweepAngle = 110f,
                useCenter = false,
                topLeft = topLeft,
                size = arcSize,
                style = stroke
            )
        }
    }
}

/**
 * Info ridotta di un canale per la lista del mini player
 */
data class MiniChannelInfo(
    val id: Long,
    val name: String,
    val logoUrl: String? = null
)

/**
 * Pannello laterale del mini player live:
 * - in alto: tasto espandi + selettore categoria con frecce ‹ ›
 * - sotto: lista dei canali della categoria corrente
 */
@Composable
private fun LiveMiniPanel(
    categories: List<String>,
    categoryIndex: Int,
    channels: List<MiniChannelInfo>,
    currentChannelId: Long,
    onCategoryChange: (Int) -> Unit,
    onChannelSelect: (Long) -> Unit,
    onExpand: () -> Unit,
    modifier: Modifier = Modifier
) {
    val listFocusRequester = remember { FocusRequester() }
    val focusIndex = channels.indexOfFirst { it.id == currentChannelId }.let { if (it >= 0) it else 0 }
    
    // Focus sulla lista quando si apre il mini player o cambia categoria
    LaunchedEffect(channels) {
        if (channels.isNotEmpty()) {
            delay(120)
            try {
                listFocusRequester.requestFocus()
            } catch (_: Exception) {
            }
        }
    }
    
    Column(
        modifier = modifier
            .background(Color.Black.copy(alpha = 0.92f))
            .padding(horizontal = 28.dp, vertical = 24.dp)
    ) {
        // Header: espandi + switch categoria con frecce
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ModernIconButton(
                icon = Icons.Default.Fullscreen,
                contentDescription = "Espandi player",
                onClick = onExpand,
                size = 44.dp
            )
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Freccia categoria precedente
            ModernIconButton(
                icon = Icons.Default.ChevronLeft,
                contentDescription = "Categoria precedente",
                onClick = { onCategoryChange(categoryIndex - 1) },
                size = 40.dp
            )
            
            // Nome categoria corrente
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.widthIn(max = 220.dp)
            ) {
                Text(
                    text = "CATEGORIA ${categoryIndex + 1}/${categories.size}",
                    style = MaterialTheme.typography.labelSmall,
                    color = WaveStreamColors.Accent,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                    maxLines = 1
                )
                Text(
                    text = categories.getOrNull(categoryIndex) ?: "",
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            
            // Freccia categoria successiva
            ModernIconButton(
                icon = Icons.Default.ChevronRight,
                contentDescription = "Categoria successiva",
                onClick = { onCategoryChange(categoryIndex + 1) },
                size = 40.dp
            )
            
            Spacer(modifier = Modifier.weight(1f))
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Text(
            text = "${channels.size} canali",
            style = MaterialTheme.typography.bodySmall,
            color = Color.White.copy(alpha = 0.5f)
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // Lista canali della categoria
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            itemsIndexed(channels, key = { _, ch -> ch.id }) { index, channel ->
                MiniChannelRow(
                    channel = channel,
                    selected = channel.id == currentChannelId,
                    onClick = { onChannelSelect(channel.id) },
                    modifier = if (index == focusIndex) {
                        Modifier.focusRequester(listFocusRequester)
                    } else {
                        Modifier
                    }
                )
            }
        }
    }
}

/**
 * Riga canale della lista mini player
 */
@Composable
private fun MiniChannelRow(
    channel: MiniChannelInfo,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isFocused -> WaveStreamColors.Accent
            selected -> Color.White.copy(alpha = 0.14f)
            else -> Color.Transparent
        },
        label = "channelRowBg"
    )
    
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Logo canale
        if (channel.logoUrl != null) {
            AsyncImage(
                model = channel.logoUrl,
                contentDescription = null,
                contentScale = androidx.compose.ui.layout.ContentScale.Fit,
                modifier = Modifier
                    .size(width = 72.dp, height = 40.dp)
                    .clip(RoundedCornerShape(6.dp))
            )
        } else {
            Box(
                modifier = Modifier
                    .size(width = 72.dp, height = 40.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(Color.White.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Tv,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.6f),
                    modifier = Modifier.size(22.dp)
                )
            }
        }
        
        Text(
            text = channel.name,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        
        if (selected) {
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = "In riproduzione",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}

/**
 * Netflix-style play/pause button (smaller, inline with progress bar)
 */
@Composable
private fun NetflixPlayPauseButton(
    isPlaying: Boolean,
    onClick: () -> Unit,
    focusRequester: FocusRequester
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.15f else 1f,
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "scale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White,
        animationSpec = tween(150),
        label = "bg"
    )
    
    Box(
        modifier = Modifier
            .size(48.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(CircleShape)
            .background(backgroundColor)
            .focusRequester(focusRequester)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
            contentDescription = if (isPlaying) "Pausa" else "Play",
            tint = Color.Black,
            modifier = Modifier.size(28.dp)
        )
    }
}

/**
 * Modern progress bar with sleek thumb
 */
@Composable
private fun ModernProgressBar(
    currentPosition: Long,
    duration: Long,
    cumulativeSeekSeconds: Int,
    onSeek: (Int) -> Unit,
    onSeekConfirm: () -> Unit,
    onSeekCancel: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Calculate preview position if seeking
    val effectivePosition = if (cumulativeSeekSeconds != 0) {
        (currentPosition + cumulativeSeekSeconds * 1000L).coerceIn(0, duration)
    } else {
        currentPosition
    }

    val progress = if (duration > 0) effectivePosition.toFloat() / duration.toFloat() else 0f
    
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Seek Mode State
    var isSeekModeActive by remember { mutableStateOf(false) }
    
    // Reset seek mode if focus is lost
    LaunchedEffect(isFocused) {
        if (!isFocused && isSeekModeActive) {
            isSeekModeActive = false
            onSeekCancel()
        }
    }
    
    val barHeight by animateDpAsState(
        targetValue = if (isFocused) 12.dp else 4.dp, // Thicker when focused
        animationSpec = tween(150),
        label = "barHeight"
    )
    
    val thumbScale by animateFloatAsState(
        targetValue = if (isSeekModeActive) 1.5f else if (isFocused) 1.2f else 0.7f,
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "thumbScale"
    )
    
    val thumbColor by animateColorAsState(
        targetValue = if (isSeekModeActive || isFocused) WaveStreamColors.Accent else Color.White,
        label = "thumbColor"
    )
    
    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .height(30.dp) // Incresed hit area
            .onKeyEvent { keyEvent ->
                if (!isFocused) return@onKeyEvent false
                
                if (keyEvent.type == KeyEventType.KeyDown) {
                    when (keyEvent.key) {
                        // Key.DirectionCenter and Key.Enter are handled by clickable modifier
                        Key.DirectionLeft -> {
                            if (isSeekModeActive) {
                                onSeek(-10) // Seek backward 10s
                                return@onKeyEvent true
                            }
                        }
                        Key.DirectionRight -> {
                            if (isSeekModeActive) {
                                onSeek(10) // Seek forward 10s
                                return@onKeyEvent true
                            }
                        }
                        Key.Back -> {
                             if (isSeekModeActive) {
                                 isSeekModeActive = false
                                 onSeekCancel()
                                 return@onKeyEvent true
                             }
                        }
                    }
                }
                false
            }
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null, 
                onClick = { 
                    // Click handling duplicated here just in case, but onKeyEvent usually handles D-pad center
                    isSeekModeActive = !isSeekModeActive
                    if (!isSeekModeActive) {
                         onSeekConfirm()
                    }
                }
            ),
        contentAlignment = Alignment.CenterStart
    ) {
        // Background track — Aurora: più discreta, la luce sta sul fill
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(barHeight)
                .clip(RoundedCornerShape(4.dp))
                .background(Color.White.copy(alpha = 0.16f))
        )
        
        // Progress fill with gradient
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f))
                .height(barHeight)
                .clip(RoundedCornerShape(4.dp))
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            WaveStreamColors.Accent.copy(alpha = 0.8f),
                            WaveStreamColors.Accent
                        )
                    )
                )
        )
        
    // Thumb indicator (Pallino) - centered exactly at progress point
    val thumbOffset = (maxWidth * progress.coerceIn(0f, 1f) - 10.dp).coerceAtLeast(0.dp)
    Box(
        modifier = Modifier
            .offset(x = thumbOffset)
            .size(20.dp)
            .align(Alignment.CenterStart)
            .graphicsLayer {
                scaleX = thumbScale
                scaleY = thumbScale
            }
            .background(thumbColor, CircleShape)
            .then(
                if (isFocused || isSeekModeActive) {
                    Modifier.border(2.dp, if (isSeekModeActive) Color.White else WaveStreamColors.Accent, CircleShape)
                } else Modifier
            )
            .then(
                if (isSeekModeActive) {
                    Modifier.shadow(8.dp, CircleShape, spotColor = WaveStreamColors.Accent)
                } else Modifier
            )
    )
}
}

/**
 * Modern play/pause button with clean design
 */
@Composable
private fun ModernPlayPauseButton(
    isPlaying: Boolean,
    onClick: () -> Unit,
    focusRequester: FocusRequester
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.15f else 1f,
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "scale"
    )
    
    // Transparent by default, accent only on focus
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        animationSpec = tween(150),
        label = "bg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.4f),
        animationSpec = tween(150),
        label = "border"
    )
    
    Box(
        modifier = Modifier
            .size(80.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(CircleShape)
            .background(backgroundColor)
            .border(
                width = 2.dp,
                color = borderColor,
                shape = CircleShape
            )
            .focusRequester(focusRequester)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
            contentDescription = if (isPlaying) "Pausa" else "Play",
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}

/**
 * Modern icon button
 */
@Composable
private fun ModernIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    size: Dp = 44.dp,
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        label = "scale"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "bg"
    )
    
    Box(
        modifier = Modifier
            .size(size)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(CircleShape)
            .background(backgroundColor)
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = Color.White,
            modifier = Modifier.size(size * 0.55f)
        )
    }
}

/**
 * Modern pill button for speed etc.
 */
@Composable
private fun ModernPillButton(
    text: String,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "scale"
    )

    GlassSurface(
        shape = RoundedCornerShape(20.dp),
        fill = if (isFocused) GlassTokens.SurfaceFillStrong else GlassTokens.SurfaceFill,
        stroke = if (isFocused) GlassTokens.accentStroke(WaveStreamColors.Accent) else GlassTokens.StrokeGradient,
        strokeWidth = if (isFocused) 2.dp else 1.dp,
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .then(if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

/**
 * Modern audio track button with dropdown
 */
@Composable
private fun ModernAudioButton(
    audioTracks: List<AudioTrackInfo>,
    currentTrack: Int,
    onTrackChange: (AudioTrackInfo) -> Unit
) {
    var showMenu by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.15f),
        label = "bg"
    )
    
    Box {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(backgroundColor)
                .focusable(interactionSource = interactionSource)
                .clickable(
                    interactionSource = interactionSource,
                    indication = null,
                    onClick = { showMenu = true }
                )
                .padding(horizontal = 14.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
            Text(
                text = audioTracks.getOrNull(currentTrack)?.label ?: "Audio",
                style = MaterialTheme.typography.labelLarge,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )
        }
        
        DropdownMenu(
            expanded = showMenu,
            onDismissRequest = { showMenu = false }
        ) {
            audioTracks.forEach { track ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = track.label,
                            fontWeight = if (track.index == currentTrack) FontWeight.Bold else FontWeight.Normal
                        )
                    },
                    onClick = {
                        onTrackChange(track)
                        showMenu = false
                    },
                    leadingIcon = {
                        if (track.index == currentTrack) {
                            Icon(Icons.Default.Check, null)
                        }
                    }
                )
            }
        }
    }
}

/**
 * Modern previous episode button
 */
@Composable
private fun ModernPreviousButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.15f),
        label = "bg"
    )
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "scale"
    )
    
    Row(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(20.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 14.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.SkipPrevious,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = "Precedente",
            style = MaterialTheme.typography.labelLarge,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

/**
 * Modern next episode button
 */
@Composable
private fun ModernNextButton(onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.15f),
        label = "bg"
    )
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.05f else 1f,
        label = "scale"
    )
    
    Row(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(20.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 14.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.SkipNext,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = "Prossimo",
            style = MaterialTheme.typography.labelLarge,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

/**
 * Modern seek indicator
 */
@Composable
private fun ModernSeekIndicator(seconds: Int) {
    val isForward = seconds > 0
    val absSeconds = kotlin.math.abs(seconds)
    val minutes = absSeconds / 60
    val secs = absSeconds % 60
    val timeText = if (minutes > 0) {
        "${minutes}:${secs.toString().padStart(2, '0')}"
    } else {
        "${absSeconds}s"
    }
    val text = if (isForward) "+$timeText" else "-$timeText"
    
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Black.copy(alpha = 0.75f))
            .padding(horizontal = 28.dp, vertical = 18.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (isForward) Icons.Default.FastForward else Icons.Default.FastRewind,
                contentDescription = null,
                tint = WaveStreamColors.Accent,
                modifier = Modifier.size(36.dp)
            )
            Text(
                text = text,
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

/**
 * Modern loading indicator
 */
/**
 * Aurora: loading "a brand" — il logo WaveStream pulsa con alone accent al
 * posto dello spinner generico. Il buffering diventa un momento di branding.
 */
@Composable
private fun ModernLoadingIndicator() {
    val infiniteTransition = rememberInfiniteTransition(label = "loading")
    
    val logoScale by infiniteTransition.animateFloat(
        initialValue = 0.92f,
        targetValue = 1.08f,
        animationSpec = infiniteRepeatable(
            animation = tween(700, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "logoScale"
    )
    
    val logoAlpha by infiniteTransition.animateFloat(
        initialValue = 0.55f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(700, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "logoAlpha"
    )
    
    Box(
        modifier = Modifier
            .size(96.dp)
            .graphicsLayer {
                scaleX = logoScale
                scaleY = logoScale
                this.alpha = logoAlpha
            },
        contentAlignment = Alignment.Center
    ) {
        // Alone accent dietro il logo (gradiente radiale, zero blur)
        Box(
            modifier = Modifier
                .size(96.dp)
                .background(
                    Brush.radialGradient(
                        listOf(
                            WaveStreamColors.Accent.copy(alpha = 0.18f),
                            Color.Transparent
                        )
                    ),
                    CircleShape
                )
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(52.dp)
        )
    }
}

/**
 * Modern next episode overlay
 */
@Composable
private fun ModernNextEpisodeOverlay(
    title: String,
    subtitle: String?,
    countdown: Int,
    totalCountdown: Int = 10,
    autoPlay: Boolean,
    onPlayNext: () -> Unit,
    onCancel: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.02f else 1f,
        label = "scale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.White.copy(alpha = 0.2f),
        label = "border"
    )
    
    // Smooth progress animation - fills from 0 to 1 as countdown goes from totalCountdown to 0
    // This makes the ring fill up clockwise from 12 o'clock
    val animatedProgress by animateFloatAsState(
        targetValue = (1f - (countdown / totalCountdown.toFloat())).coerceIn(0f, 1f),
        animationSpec = tween(
            durationMillis = 1000,  // 1 second smooth transition
            easing = LinearEasing    // Constant speed
        ),
        label = "countdownProgress"
    )
    
    GlassSurface(
        shape = RoundedCornerShape(16.dp),
        fill = GlassTokens.SurfaceFillStrong,
        stroke = SolidColor(borderColor),
        strokeWidth = 2.dp,
        modifier = modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(340.dp)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onPlayNext
            )
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Countdown circle
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(56.dp)
            ) {
                if (autoPlay && countdown > 0) {
                    CircularProgressIndicator(
                        progress = { animatedProgress },  // Smooth animated progress
                        modifier = Modifier.fillMaxSize(),
                        color = WaveStreamColors.Accent,
                        trackColor = Color.White.copy(alpha = 0.2f),
                        strokeWidth = 3.dp
                    )
                    Text(
                        text = "$countdown",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                }
            }
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "PROSSIMO EPISODIO",
                    style = MaterialTheme.typography.labelSmall,
                    color = WaveStreamColors.Accent,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1
                )
                subtitle?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.6f),
                        maxLines = 1
                    )
                }
            }
        }
    }
}

/**
 * Data class for next episode info
 */
data class NextEpisodeInfo(
    val title: String,
    val subtitle: String? = null,
    val countdown: Int,
    val totalCountdown: Int = 10,
    val autoPlay: Boolean = true
)

/**
 * Format time from milliseconds to HH:MM:SS or MM:SS
 */
private fun formatTime(ms: Long): String {
    val seconds = (ms / 1000) % 60
    val minutes = (ms / 60_000) % 60
    val hours = ms / 3600_000
    return if (hours > 0) {
        String.format("%d:%02d:%02d", hours, minutes, seconds)
    } else {
        String.format("%02d:%02d", minutes, seconds)
    }
}

/**
 * Fixed clock overlay for player - always visible, subtle semi-transparent text (no box)
 */
@Composable
private fun PlayerClockOverlay(modifier: Modifier = Modifier) {
    var currentTime by remember { mutableStateOf(getPlayerCurrentTime()) }
    
    LaunchedEffect(Unit) {
        while (true) {
            currentTime = getPlayerCurrentTime()
            delay(1000L)
        }
    }
    
    Text(
        text = currentTime,
        color = Color.White.copy(alpha = 0.45f),
        style = MaterialTheme.typography.bodySmall,
        fontWeight = FontWeight.Normal,
        modifier = modifier
    )
}

private fun getPlayerCurrentTime(): String {
    val formatter = java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault())
    return formatter.format(java.util.Date())
}


// ============================================================================
// Rilevamento titoli di coda (lettura frame, nessuna IA)
// ============================================================================

private const val CREDITS_TAG = "CreditsWatchdog"

/** Tag dedicato alla diagnostica Passo 0: log machine-readable da raccogliere via adb. */
private const val CREDITS_DIAG_TAG = "CreditsDiag"

/** Sotto questa luminanza media (0-255) un frame è considerato "nero". */
private const val CREDITS_BLACK_FRAME_LUMA = 18f

private const val CREDITS_MAX_CAPTURE_FAILURES = 6

/**
 * Campiona periodicamente un frame del video e chiede a [CreditsDetector] se sono
 * iniziati i titoli di coda. Quando il rilevamento è confermato chiama
 * [onCreditsDetected] una sola volta per episodio.
 *
 * Il campionamento avviene solo negli ultimi minuti del contenuto (vedi
 * [CreditsDetector.WINDOW_MS]) e mai su canali live o in mini player.
 * In caso di catture non disponibili (surface protette, box problematici) il
 * watchdog si spegne silenziosamente e resta attivo il trigger temporale del player.
 *
 * Con [debugText] non nullo scrive a video lo stato corrente (overlay di debug).
 */
@Composable
private fun CreditsWatchdog(
    playerView: PlayerView?,
    enabled: Boolean,
    isLiveChannel: Boolean,
    positionMs: Long,
    durationMs: Long,
    debugText: MutableState<String>?,
    onCreditsDetected: () -> Unit
) {
    val latestPosition by rememberUpdatedState(positionMs)
    val latestDuration by rememberUpdatedState(durationMs)
    val latestCallback by rememberUpdatedState(onCreditsDetected)

    LaunchedEffect(enabled, isLiveChannel, playerView) {
        debugText?.value = when {
            !enabled -> "credits: OFF (impostazione disattivata)"
            isLiveChannel -> "credits: OFF (canale live)"
            playerView == null -> "credits: in attesa della PlayerView..."
            else -> "credits: avvio watchdog..."
        }

        if (!enabled || isLiveChannel || playerView == null) return@LaunchedEffect

        val detector = CreditsDetector()
        var frame: Bitmap? = null
        var failedCaptures = 0

        // ===== Diagnostica Passo 0 (nessun cambio di comportamento) =====
        var sampleCount = 0
        var pcFailCount = 0
        var blackFrameCount = 0
        var blackStreak = 0
        var maxBlackStreak = 0
        var hitCount = 0

        android.util.Log.i(
            CREDITS_DIAG_TAG,
            "start contentType=${if (isLiveChannel) "CHANNEL" else "VOD"} " +
                "windowMs=${CreditsDetector.WINDOW_MS} minPosMs=${CreditsDetector.MIN_POSITION_MS} " +
                "sampleIntervalMs=${CreditsDetector.SAMPLE_INTERVAL_MS} " +
                "debug=${debugText != null} sdk=${Build.VERSION.SDK_INT}"
        )

        try {
            while (isActive && !detector.isTriggered) {
                delay(CreditsDetector.SAMPLE_INTERVAL_MS)

                val duration = latestDuration
                if (duration <= 0L) {
                    debugText?.value = "credits: durata non disponibile"
                    continue
                }

                val position = latestPosition
                val remaining = duration - position

                // Finestra utile: ultimi minuti dell'episodio, esclusa l'intro.
                val inWindow = position >= CreditsDetector.MIN_POSITION_MS &&
                        remaining <= CreditsDetector.WINDOW_MS

                // Fuori finestra: senza debug non si campiona affatto (risparmio CPU)
                if (!inWindow && debugText == null) {
                    detector.reset()
                    continue
                }
                if (inWindow && remaining < 1_000L) continue

                val surfaceView = playerView.videoSurfaceView as? SurfaceView
                if (surfaceView == null) {
                    android.util.Log.w(
                        CREDITS_TAG,
                        "videoSurfaceView non è una SurfaceView (${playerView.videoSurfaceView?.javaClass?.name}): watchdog interrotto"
                    )
                    debugText?.value = "credits: view non supportata"
                    break
                }

                val width = surfaceView.width
                val height = surfaceView.height
                if (width <= 0 || height <= 0) {
                    debugText?.value = "credits: view ${width}x${height}"
                    continue
                }

                var bitmap = frame
                if (bitmap == null || bitmap.width != width || bitmap.height != height) {
                    bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
                    frame = bitmap
                }

                val pcResult = ScreenFrameCapture.capture(surfaceView, bitmap)
                if (pcResult != ScreenFrameCapture.SUCCESS) {
                    failedCaptures++
                    pcFailCount++
                    android.util.Log.w(CREDITS_TAG, "Cattura frame fallita ($failedCaptures/$CREDITS_MAX_CAPTURE_FAILURES)")
                    android.util.Log.w(
                        CREDITS_DIAG_TAG,
                        "pcFail pcResult=$pcResult failStreak=$failedCaptures totalFails=$pcFailCount"
                    )
                    debugText?.value = "credits: cattura fallita x$failedCaptures"
                    if (failedCaptures >= CREDITS_MAX_CAPTURE_FAILURES) {
                        android.util.Log.w(
                            CREDITS_TAG,
                            "Frame non leggibili: rilevamento credits disattivato per questo episodio"
                        )
                        break
                    }
                    continue
                }
                failedCaptures = 0

                if (!inWindow) {
                    // Debug fuori finestra: si mostrano i valori ma non si accumulano hit
                    detector.clearAccumulator()
                }
                val result = detector.analyze(bitmap)
                val line = detector.describe(result)

                sampleCount++
                val isBlack = result.meanLuma < CREDITS_BLACK_FRAME_LUMA
                if (isBlack) {
                    blackFrameCount++
                    blackStreak++
                    if (blackStreak > maxBlackStreak) maxBlackStreak = blackStreak
                } else {
                    blackStreak = 0
                }
                if (result.hit) hitCount++

                android.util.Log.d(
                    CREDITS_DIAG_TAG,
                    ("sample n=%d inWindow=%s pos=%d rem=%d rel=%.3f pcResult=%d black=%s blackStreak=%d " +
                        "luma=%.1f dark=%.3f text=%.4f peak=%.3f rows=%d static=%.3f hit=%s triggered=%s")
                        .format(
                            sampleCount, inWindow, position, remaining,
                            if (duration > 0) position.toFloat() / duration else 0f,
                            pcResult, isBlack, blackStreak,
                            result.meanLuma, result.darkness, result.textDensity,
                            result.peakRowDensity, result.textRowCount, result.staticScore,
                            result.hit, result.triggered
                        )
                )

                debugText?.value = if (inWindow) {
                    "credits: $line pcFail=$pcFailCount  (mancano ${formatRemainingTime(remaining)})"
                } else {
                    "credits TEST fuori finestra: $line  (mancano ${formatRemainingTime(remaining)})"
                }

                if (inWindow && result.triggered) {
                    android.util.Log.i(
                        CREDITS_DIAG_TAG,
                        "trigger pos=$position rem=$remaining rel=%.3f samples=$sampleCount blackStreak=$blackStreak".format(
                            if (duration > 0) position.toFloat() / duration else 0f
                        )
                    )
                    latestCallback()
                }
            }
        } finally {
            android.util.Log.i(
                CREDITS_DIAG_TAG,
                "summary samples=$sampleCount pcFail=$pcFailCount blackFrames=$blackFrameCount " +
                    "maxBlackStreak=$maxBlackStreak hits=$hitCount triggered=${detector.isTriggered}"
            )
        }
    }
}

private fun formatRemainingTime(ms: Long): String {
    if (ms <= 0L) return "0:00"
    val totalSeconds = ms / 1000
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    return "%d:%02d".format(minutes, seconds)
}
