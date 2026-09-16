package it.wavestream.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.FormatListBulleted
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Tv
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.R
import it.wavestream.app.ui.MainTab
import it.wavestream.app.ui.theme.WaveStreamColors

private val CollapsedRailWidth = 64.dp
private val ExpandedRailWidth = 200.dp
private const val RailAnimationMs = 180

/**
 * Applica la larghezza animata leggendo il progresso nella fase di LAYOUT.
 *
 * Prima la larghezza veniva letta in composizione (`Modifier.width(railWidth)`),
 * il che ricomponeva l'intero rail (e i suoi 8 NavRailItem con 5 animazioni
 * ciascuno) a ogni frame. Qui la lettura resta confinata al layout: durante
 * l'animazione la composizione non viene mai invalidata.
 */
private fun Modifier.animatedRailWidth(expansion: Animatable<Float, AnimationVector1D>): Modifier =
    this.layout { measurable, constraints ->
        val progress = expansion.value
        val target = CollapsedRailWidth.toPx() + (ExpandedRailWidth - CollapsedRailWidth).toPx() * progress
        val width = target.toInt().coerceIn(constraints.minWidth, constraints.maxWidth)
        val placeable = measurable.measure(constraints.copy(minWidth = width, maxWidth = width))
        layout(width, placeable.height) { placeable.place(0, 0) }
    }

@Composable
fun ExpandableNavRail(
    selectedTab: MainTab,
    onTabSelected: (MainTab) -> Unit,
    isExpanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    onSettingsClick: () -> Unit,
    onAssistantClick: () -> Unit,
    onContentFocusRequest: () -> Unit,
    onCollapseRequest: () -> Unit = {},
    onExploreCategoriesClick: (Boolean) -> Unit,
    onViewAllClick: (Boolean) -> Unit = {},
    modifier: Modifier = Modifier
) {
    // Unica sorgente dell'animazione. Vale 0..1 e viene letta SOLO in fase di
    // layout/draw (deferred read): nessuna ricomposizione per frame.
    val expansion = remember { Animatable(if (isExpanded) 1f else 0f) }

    // Alpha dei label: parte quando il rail è ormai aperto a metà, così il testo
    // appare in "wipe" mentre la larghezza cresce (prima c'erano due animazioni
    // disallineate: spring sulla larghezza + tween 150ms sull'alpha del testo).
    val labelAlpha: () -> Float = remember(expansion) {
        { ((expansion.value - 0.35f) / 0.65f).coerceIn(0f, 1f) }
    }

    // Se l'espansione arriva da un tasto premuto DENTRO il rail, il focus è già
    // sull'item giusto: non va rubato e spostato sul tab selezionato.
    var skipNextAutoFocus by remember { mutableStateOf(false) }

    val homeFocusRequester = remember { FocusRequester() }
    val moviesFocusRequester = remember { FocusRequester() }
    val seriesFocusRequester = remember { FocusRequester() }
    val favoritesFocusRequester = remember { FocusRequester() }
    val listsFocusRequester = remember { FocusRequester() }
    val historyFocusRequester = remember { FocusRequester() }

    LaunchedEffect(isExpanded, selectedTab) {
        if (!isExpanded) return@LaunchedEffect
        if (skipNextAutoFocus) {
            skipNextAutoFocus = false
            return@LaunchedEffect
        }

        val target = when (selectedTab) {
            MainTab.HOME -> homeFocusRequester
            MainTab.MOVIES -> moviesFocusRequester
            MainTab.SERIES -> seriesFocusRequester
            MainTab.LIVE -> homeFocusRequester
            MainTab.FAVORITES -> favoritesFocusRequester
            MainTab.LISTS -> listsFocusRequester
            MainTab.HISTORY -> historyFocusRequester
        }

        // Il contenuto espanso viene composto in questo frame: senza attendere il
        // layout la requestFocus verrebbe persa e il rail resterebbe aperto SENZA
        // focus (percepito come "freeze"). 2 tentativi su frame consecutivi.
        repeat(2) {
            withFrameNanos { }
            val requested = try {
                target.requestFocus()
                true
            } catch (_: IllegalStateException) {
                false
            }
            if (requested) return@LaunchedEffect
        }
    }

    LaunchedEffect(isExpanded) {
        expansion.animateTo(
            targetValue = if (isExpanded) 1f else 0f,
            animationSpec = tween(durationMillis = RailAnimationMs, easing = FastOutSlowInEasing)
        )
    }

    Box(
        modifier = modifier
            .animatedRailWidth(expansion)
            .fillMaxHeight()
            .background(
                Brush.horizontalGradient(
                    colors = listOf(WaveStreamColors.BackgroundSecondary, Color.Black)
                )
            )
            .onPreviewKeyEvent { keyEvent ->
                if (keyEvent.type != KeyEventType.KeyDown) {
                    false
                } else {
                    when (keyEvent.key) {
                        Key.DirectionRight -> if (isExpanded) {
                            // Il focus va al contenuto DOPO che il rail si è chiuso
                            // (gestito dal chiamante), altrimenti la ricerca spaziale
                            // lavora ancora sul layout vecchio.
                            onCollapseRequest()
                            onContentFocusRequest()
                            true
                        } else {
                            false
                        }
                        Key.DirectionLeft -> if (!isExpanded) {
                            skipNextAutoFocus = true
                            onExpandedChange(true)
                            true
                        } else {
                            false
                        }
                        else -> false
                    }
                }
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 12.dp)
        ) {
            // Header: sempre composto (logo + brand), l'alpha del testo è animata
            // in fase di draw con lo stesso progresso della larghezza.
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "WaveStream",
                    modifier = Modifier.size(28.dp)
                )
                Text(
                    text = "WaveStream",
                    style = MaterialTheme.typography.titleMedium,
                    color = WaveStreamColors.TextPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    maxLines = 1,
                    modifier = Modifier.graphicsLayer { alpha = expansion.value }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            HorizontalDivider(
                color = WaveStreamColors.TextTertiary.copy(alpha = 0.25f),
                thickness = 1.dp,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .graphicsLayer { alpha = expansion.value }
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Gruppo di navigazione: occupa lo spazio residuo e, se gli item non
            // entrano, diventa scrollabile con il D-pad.
            // Prima era `weight(1f, fill = false)`: la Column con peso veniva
            // misurata per ULTIMA e gli item subivano il `coerce` della maxHeight
            // residua, quindi a rail espanso "Cronologia" veniva schiacciata a
            // pochi dp (su TV 1080p/540dp) e spariva.
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                NavRailItem(
                    icon = Icons.Default.Home,
                    label = "Home",
                    isSelected = selectedTab == MainTab.HOME,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = {
                        onTabSelected(MainTab.HOME)
                        if (isExpanded) onCollapseRequest()
                    },
                    modifier = Modifier.focusRequester(homeFocusRequester)
                )

                NavRailItem(
                    icon = Icons.Default.Movie,
                    label = "Film",
                    isSelected = selectedTab == MainTab.MOVIES,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = {
                        onTabSelected(MainTab.MOVIES)
                        if (isExpanded) onCollapseRequest()
                    },
                    modifier = Modifier.focusRequester(moviesFocusRequester)
                )

                if (isExpanded && selectedTab == MainTab.MOVIES) {
                    ExploreCategoriesItem(
                        isMovies = true,
                        contentAlpha = labelAlpha,
                        onClick = { onExploreCategoriesClick(true) }
                    )
                    ViewAllRailItem(
                        label = "Tutti i film",
                        icon = Icons.Default.Movie,
                        contentAlpha = labelAlpha,
                        onClick = { onViewAllClick(true) }
                    )
                }

                NavRailItem(
                    icon = Icons.Default.Tv,
                    label = "Serie TV",
                    isSelected = selectedTab == MainTab.SERIES,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = { onTabSelected(MainTab.SERIES) },
                    modifier = Modifier.focusRequester(seriesFocusRequester)
                )

                if (isExpanded && selectedTab == MainTab.SERIES) {
                    ExploreCategoriesItem(
                        isMovies = false,
                        contentAlpha = labelAlpha,
                        onClick = { onExploreCategoriesClick(false) }
                    )
                    ViewAllRailItem(
                        label = "Tutte le serie TV",
                        icon = Icons.Default.Tv,
                        contentAlpha = labelAlpha,
                        onClick = { onViewAllClick(false) }
                    )
                }

                NavRailItem(
                    icon = Icons.Default.LiveTv,
                    label = "Live",
                    isSelected = selectedTab == MainTab.LIVE,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = { onTabSelected(MainTab.LIVE) }
                )

                NavRailItem(
                    icon = if (selectedTab == MainTab.FAVORITES) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    label = "Preferiti",
                    isSelected = selectedTab == MainTab.FAVORITES,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = { onTabSelected(MainTab.FAVORITES) },
                    modifier = Modifier.focusRequester(favoritesFocusRequester)
                )

                NavRailItem(
                    icon = Icons.AutoMirrored.Filled.FormatListBulleted,
                    label = "Liste",
                    isSelected = selectedTab == MainTab.LISTS,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = { onTabSelected(MainTab.LISTS) },
                    modifier = Modifier.focusRequester(listsFocusRequester)
                )

                NavRailItem(
                    icon = Icons.Default.History,
                    label = "Cronologia",
                    isSelected = selectedTab == MainTab.HISTORY,
                    isExpanded = isExpanded,
                    labelAlpha = labelAlpha,
                    onClick = { onTabSelected(MainTab.HISTORY) },
                    modifier = Modifier.focusRequester(historyFocusRequester)
                )
            }

            // Assistant AI + Settings in fondo (fuori dal gruppo con peso, così
            // restano realmente ancorati in basso).
            Spacer(modifier = Modifier.height(4.dp))

            NavRailItem(
                icon = Icons.Default.AutoAwesome,
                label = "Nova",
                isSelected = false,
                isExpanded = isExpanded,
                labelAlpha = labelAlpha,
                onClick = onAssistantClick
            )

            NavRailItem(
                icon = Icons.Default.Settings,
                label = "Impostazioni",
                isSelected = false,
                isExpanded = isExpanded,
                labelAlpha = labelAlpha,
                onClick = onSettingsClick
            )
        }
    }
}

@Composable
private fun ExploreCategoriesItem(
    isMovies: Boolean,
    contentAlpha: () -> Float = { 1f },
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "exploreCategoriesBg"
    )

    val textColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextTertiary,
        label = "exploreCategoriesText"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(36.dp)
            .graphicsLayer { alpha = contentAlpha() }
            .clip(RoundedCornerShape(8.dp))
            .background(color = backgroundColor)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource)
            .padding(start = 20.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        FourSquaresIcon(
            modifier = Modifier.size(16.dp),
            color = textColor
        )
        Text(
            text = "Categorie",
            style = MaterialTheme.typography.bodySmall,
            color = textColor,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            maxLines = 1
        )
    }
}

@Composable
private fun ViewAllRailItem(
    label: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    contentAlpha: () -> Float = { 1f },
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else Color.Transparent,
        label = "viewAllRailBg"
    )

    val textColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextTertiary,
        label = "viewAllRailText"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(36.dp)
            .graphicsLayer { alpha = contentAlpha() }
            .clip(RoundedCornerShape(8.dp))
            .background(color = backgroundColor)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource)
            .padding(start = 20.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = textColor,
            modifier = Modifier.size(16.dp)
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = textColor,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            maxLines = 1
        )
    }
}

@Composable
private fun FourSquaresIcon(
    modifier: Modifier = Modifier,
    color: Color = WaveStreamColors.Accent
) {
    Canvas(modifier = modifier) {
        val squareSize = size.minDimension / 2.5f
        val gap = size.minDimension / 10f
        val cornerRadius = CornerRadius(squareSize / 4, squareSize / 4)

        drawRoundRect(
            color = color,
            topLeft = Offset(0f, 0f),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )

        drawRoundRect(
            color = color.copy(alpha = 0.7f),
            topLeft = Offset(squareSize + gap, 0f),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )

        drawRoundRect(
            color = color.copy(alpha = 0.7f),
            topLeft = Offset(0f, squareSize + gap),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )

        drawRoundRect(
            color = color.copy(alpha = 0.5f),
            topLeft = Offset(squareSize + gap, squareSize + gap),
            size = Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
    }
}
