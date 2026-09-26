/**
 * Card episodio del carosello orizzontale, in stile "episodi" da streaming TV:
 * copertina landscape 16:9 con numero episodio grande in alto a sinistra e
 * freccia di download in basso a destra; sotto, titolo e breve trama.
 *
 * Il titolo è pulito da "Episodio N"/SxxExx: se resta un titolo vero lo mostra,
 * altrimenti usa il fallback "Episodio N" ([TitleCleaner.resolveEpisodeDisplayTitle]).
 */
@OptIn(androidx.compose.foundation.ExperimentalFoundationApi::class)
@Composable
private fun EpisodeCarouselCard(
    episode: Episode,
    progress: EpisodeProgress?,
    downloadState: EpisodeDownloadState? = null,
    seriesName: String? = null,
    cardFocusRequester: FocusRequester? = null,
    upFocusRequester: FocusRequester? = null,
    onClick: () -> Unit,
    onLongClick: () -> Unit = {},
    onDownloadClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val cardInteraction = remember { MutableInteractionSource() }
    val isFocused by cardInteraction.collectIsFocusedAsState()

    val downloadInteraction = remember { MutableInteractionSource() }
    val isDownloadFocused by downloadInteraction.collectIsFocusedAsState()

    val fallbackCardFocus = remember { FocusRequester() }
    val effectiveCardFocus = cardFocusRequester ?: fallbackCardFocus
    val downloadFocusRequester = remember { FocusRequester() }

    var pressStartTime by remember { mutableStateOf(0L) }
    val longPressThreshold = 500L

    val isDownloaded = downloadState?.isDownloaded == true
    val isDownloading = downloadState?.isDownloading == true
    val downloadProgress = downloadState?.downloadProgress ?: 0

    val hasProgress = progress != null && progress.progress > 0.01f && !progress.isCompleted
    val isWatched = progress?.isCompleted == true ||
        (progress != null && progress.remainingMinutes <= 7 && progress.progress > 0.9f)
    val progressFraction: Float? =
        if (hasProgress) progress?.progress?.coerceIn(0f, 1f) else null

    val ring by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "episodeCardRing"
    )
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.03f else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "episodeCardScale"
    )

    // Titolo mostrato: titolo vero (provider, poi TMDB), altrimenti "Episodio N".
    val displayTitle = remember(episode.name, episode.tmdbName, episode.episodeNumber, seriesName) {
        TitleCleaner.resolveEpisodeDisplayTitle(
            providerName = episode.name,
            tmdbName = episode.tmdbName,
            episodeNumber = episode.episodeNumber,
            seriesName = seriesName
        )
    }
    val plot = remember(episode.tmdbOverview, episode.plot) {
        episode.tmdbOverview?.takeIf { it.isNotBlank() }
            ?: episode.plot?.takeIf { it.isNotBlank() }
    }

    Column(
        modifier = modifier
            .width(300.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
    ) {
        // Copertina landscape 16:9 — principale focus target della card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
                .clip(RoundedCornerShape(14.dp))
                .background(WaveStreamColors.BackgroundSecondary)
                .border(2.dp, ring, RoundedCornerShape(14.dp))
                .focusRequester(effectiveCardFocus)
                .then(
                    if (upFocusRequester != null) Modifier.focusProperties { up = upFocusRequester } else Modifier
                )
                .focusProperties { down = downloadFocusRequester }
                .focusable(interactionSource = cardInteraction)
                .onPreviewKeyEvent { keyEvent ->
                    when {
                        keyEvent.key == Key.DirectionCenter || keyEvent.key == Key.Enter -> {
                            if (keyEvent.type == KeyEventType.KeyDown) {
                                if (pressStartTime == 0L) pressStartTime = System.currentTimeMillis()
                                true
                            } else if (keyEvent.type == KeyEventType.KeyUp) {
                                val pressDuration = System.currentTimeMillis() - pressStartTime
                                pressStartTime = 0L
                                if (pressDuration >= longPressThreshold) onLongClick() else onClick()
                                true
                            } else false
                        }
                        else -> false
                    }
                }
                .combinedClickable(
                    interactionSource = cardInteraction,
                    indication = null,
                    onClick = onClick,
                    onLongClick = onLongClick
                )
        ) {
            AsyncImage(
                model = episode.posterUrl,
                contentDescription = episode.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Scrim in alto: dà contrasto al numero grande
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxWidth()
                    .height(72.dp)
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Black.copy(alpha = 0.55f), Color.Transparent)
                        )
                    )
            )

            // Numero episodio grande (1, 2, 3…) in alto a sinistra
            Text(
                text = "${episode.episodeNumber}",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 12.dp, top = 4.dp)
            )

            // Stato "visto": check in alto a destra
            if (isWatched) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(10.dp)
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(Color.Black.copy(alpha = 0.55f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Guardato",
                        tint = WaveStreamColors.Accent,
                        modifier = Modifier.size(15.dp)
                    )
                }
            }

            // Overlay play al focus / in ripresa
            if (isFocused || hasProgress) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.30f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.White,
                        modifier = Modifier.size(46.dp)
                    )
                }
            }

            // Barra di avanzamento in basso
            if (progressFraction != null) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .height(4.dp)
                        .background(Color.Black.copy(alpha = 0.6f))
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(progressFraction)
                            .background(WaveStreamColors.Accent)
                    )
                }
            }

            // Freccia di download in basso a destra (focus target separato)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(if (isDownloadFocused || isDownloaded) Color.Black.copy(alpha = 0.55f) else Color.Transparent)
                    .focusRequester(downloadFocusRequester)
                    .focusProperties { up = effectiveCardFocus }
                    .focusable(interactionSource = downloadInteraction)
                    .clickable(
                        interactionSource = downloadInteraction,
                        indication = null,
                        onClick = onDownloadClick
                    ),
                contentAlignment = Alignment.Center
            ) {
                when {
                    isDownloading -> {
                        if (downloadProgress > 0) {
                            CircularProgressIndicator(
                                progress = { downloadProgress / 100f },
                                modifier = Modifier.size(22.dp),
                                color = Color.White,
                                strokeWidth = 2.dp,
                                trackColor = Color.White.copy(alpha = 0.25f)
                            )
                        } else {
                            CircularProgressIndicator(
                                modifier = Modifier.size(22.dp),
                                color = Color.White,
                                strokeWidth = 2.dp,
                                trackColor = Color.White.copy(alpha = 0.25f)
                            )
                        }
                    }
                    isDownloaded -> Icon(
                        imageVector = Icons.Default.DownloadDone,
                        contentDescription = "Scaricato",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                    else -> Icon(
                        imageVector = Icons.Default.Download,
                        contentDescription = "Scarica episodio",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Titolo pulito (1 riga)
        Text(
            text = displayTitle,
            style = MaterialTheme.typography.bodyLarge,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        // Breve trama (TMDB, fallback provider), come nella reference
        if (plot != null) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = plot,
                style = MaterialTheme.typography.bodySmall,
                color = WaveStreamColors.TextTertiary,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 17.sp
            )
        }
    }
}
