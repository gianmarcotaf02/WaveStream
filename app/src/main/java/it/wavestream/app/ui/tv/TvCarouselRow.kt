package it.wavestream.app.ui.tv

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.focusRestorer
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.key.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.foundation.lazy.list.TvLazyListScope
import androidx.tv.foundation.lazy.list.items
import androidx.tv.foundation.lazy.list.itemsIndexed
import androidx.tv.foundation.lazy.list.rememberTvLazyListState
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import it.wavestream.app.ui.home.CarouselItem
import it.wavestream.app.ui.home.CarouselRow
import it.wavestream.app.ui.home.LocalHomeFocusMemory
import it.wavestream.app.ui.components.CategoryCard
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import kotlinx.coroutines.delay

/**
 * Numero massimo di posizioni classificate nelle righe "Top 10".
 * Oltre questo indice la riga prosegue senza numero.
 */
private const val RANK_MAX = 10

/** Fascia a sinistra della card riservata al numero di classifica. */
private val RANK_GUTTER = 68.dp

/**
 * TV-optimized carousel row using TvLazyRow
 * Replaces ListRowPresenter with proper focus handling for D-pad navigation
 * 
 * Features:
 * - Uses TvLazyRow for horizontal scrolling
 * - FocusRestorer to remember last focused item when returning to row
 * - Proper focus traversal between rows
 * - onUpPressed callback for scrolling to hero when UP pressed
 */
@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun TvCarouselRow(
    row: CarouselRow,
    onItemClick: (CarouselItem) -> Unit,
    onSeeAllClick: () -> Unit,
    modifier: Modifier = Modifier,
    focusRequester: FocusRequester = remember { FocusRequester() },
    onUpPressed: (() -> Unit)? = null,
    onFocusChanged: ((Boolean) -> Unit)? = null,
    onLeftOnFirstItem: (() -> Unit)? = null
) {
    val listState = rememberTvLazyListState()
    // Registro di focus: consente di riprendere sull'elemento da cui si è entrati
    // in un'altra schermata (detail view, "Vedi tutto").
    val focusMemory = LocalHomeFocusMemory.current
    
    // Aurora: chiavi già entrate in scena — l'animazione di cascata scatta una
    // sola volta per item (non ad ogni rientro nello viewport durante lo scroll)
    val appearedKeys = remember { mutableSetOf<String>() }
    
    var isRowFocused by remember { mutableStateOf(false) }
    var isFirstItemFocused by remember { mutableStateOf(false) }
    
    LaunchedEffect(isRowFocused) {
        onFocusChanged?.invoke(isRowFocused)
    }
    
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 18.dp)
            .onFocusChanged { focusState ->
                isRowFocused = focusState.hasFocus
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = row.title,
                style = MaterialTheme.typography.titleMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold
            )
            
            if (row.showSeeAll) {
                val headerKey = "${row.title}|seeall_header"
                val headerRequester = remember { FocusRequester() }
                DisposableEffect(headerKey) {
                    focusMemory?.register(headerKey, headerRequester)
                    onDispose { focusMemory?.unregister(headerKey) }
                }
                TvSeeAllButton(
                    onClick = onSeeAllClick,
                    modifier = Modifier.focusRequester(headerRequester),
                    onFocused = { focusMemory?.onFocused(headerKey) }
                )
            }
        }
        
        Spacer(modifier = Modifier.height(10.dp))

        if (row.items.isEmpty()) {
            // Lista personalizzata appena creata (o svuotata): senza questo placeholder
            // la riga non comparirebbe affatto e l'utente resterebbe sulla schermata vuota.
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.dp, WaveStreamColors.SurfaceBorderStrong, RoundedCornerShape(12.dp))
                    .background(WaveStreamColors.BackgroundSecondary.copy(alpha = 0.6f))
                    .padding(horizontal = 20.dp, vertical = 22.dp)
            ) {
                Text(
                    text = "Lista vuota — aggiungi film o serie dalla loro scheda",
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary
                )
            }
        } else {
        TvLazyRow(
            state = listState,
            contentPadding = PaddingValues(start = 40.dp, end = 40.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            pivotOffsets = androidx.tv.foundation.PivotOffsets(parentFraction = 0.1f),
            modifier = Modifier
                .focusRequester(focusRequester)
        ) {
            itemsIndexed(
                items = row.items,
                key = { index, item -> "${item.contentType}_${item.id}" },
                // contentType abilita il RIUSO delle composition durante lo scroll:
                // senza, Compose ricrea i nodi di ogni item che entra ed esce dal
                // viewport. Card di contenuto e card di categoria hanno layout
                // diversi, quindi due tipi distinti.
                contentType = { _, item ->
                    if (item.contentType.startsWith("CATEGORY_")) "category" else "content"
                }
            ) { index, item ->
                val isFocused = remember { mutableStateOf(false) }
                val isFirst = index == 0
                val focusKey = "${row.title}|${item.contentType}_${item.id}"
                val itemFocusRequester = remember { FocusRequester() }
                DisposableEffect(focusKey) {
                    focusMemory?.register(focusKey, itemFocusRequester)
                    onDispose { focusMemory?.unregister(focusKey) }
                }
                
                // Aurora: ingresso a cascata (stagger 35ms/item, max 8 step)
                val itemKey = "${item.contentType}_${item.id}"
                val hasAppeared = remember { mutableStateOf(itemKey in appearedKeys) }
                val entranceAlpha = remember { Animatable(if (hasAppeared.value) 1f else 0f) }
                LaunchedEffect(itemKey) {
                    if (!hasAppeared.value) {
                        delay(index.coerceAtMost(8) * AppAnimations.CascadeStaggerMs.toLong())
                        entranceAlpha.animateTo(1f, tween(350, easing = FastOutSlowInEasing))
                        appearedKeys.add(itemKey)
                        hasAppeared.value = true
                    }
                }
                
                Box(
                    modifier = Modifier.graphicsLayer {
                        alpha = entranceAlpha.value
                        translationY = (1f - entranceAlpha.value) * 40f
                    }
                ) {
                // Top classifica (righe popolari): numero in outline nella fascia a
                // sinistra della card, fino a RANK_MAX. Decorativo, non focusable:
                // non intercetta il D-pad.
                if (row.isRanked && index < RANK_MAX) {
                    TvRankNumber(
                        rank = index + 1,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(start = if (row.isRanked && index < RANK_MAX) RANK_GUTTER else 0.dp)
                        .focusRequester(itemFocusRequester)
                        .onFocusChanged { focusState ->
                            isFocused.value = focusState.isFocused
                            if (focusState.hasFocus) focusMemory?.onFocused(focusKey)
                            if (isFirst) {
                                isFirstItemFocused = focusState.isFocused
                            }
                        }
                        .onPreviewKeyEvent { keyEvent ->
                            if (keyEvent.type == KeyEventType.KeyDown && 
                                keyEvent.key == Key.DirectionLeft && 
                                isFirst && isFirstItemFocused) {
                                onLeftOnFirstItem?.invoke()
                                true
                            } else {
                                false
                            }
                        }
                ) {
                    when {
                        item.contentType.startsWith("CATEGORY_") -> {
                            CategoryCard(
                                item = item,
                                isFavorite = item.isFavorite,
                                onClick = { onItemClick(item) }
                            )
                        }
                        else -> {
                            TvContentCard(
                                item = item,
                                onClick = { onItemClick(item) }
                            )
                        }
                    }
                }
                }
            }
            
            if (row.showSeeAll) {
                item(key = "see_all_${row.title}") {
                    val seeAllKey = "${row.title}|seeall"
                    val seeAllRequester = remember { FocusRequester() }
                    DisposableEffect(seeAllKey) {
                        focusMemory?.register(seeAllKey, seeAllRequester)
                        onDispose { focusMemory?.unregister(seeAllKey) }
                    }
                    TvSeeAllCard(
                        onClick = onSeeAllClick,
                        modifier = Modifier.focusRequester(seeAllRequester),
                        onFocused = { focusMemory?.onFocused(seeAllKey) }
                    )
                }
            }
        }
        }
    }
}

/**
 * See all button for row header
 */
@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
private fun TvSeeAllButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onFocused: (() -> Unit)? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val textColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
        label = "seeAllColor"
    )
    
    Text(
        text = "Vedi tutto →",
        style = MaterialTheme.typography.labelLarge,
        color = textColor,
        modifier = modifier
            .onFocusChanged { if (it.isFocused) onFocused?.invoke() }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .focusable(interactionSource = interactionSource)
            .padding(8.dp)
    )
}

/**
 * See all card - displayed as last item in carousel for D-pad accessibility
 */
@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
private fun TvSeeAllCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onFocused: (() -> Unit)? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by androidx.compose.animation.core.animateFloatAsState(
        targetValue = if (isFocused) AppAnimations.CardFocusScale else 1f,
        animationSpec = AppAnimations.SpringCardFocus,
        label = "seeAllCardScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.SurfaceBorderStrong,
        label = "seeAllCardBorder"
    )
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent.copy(alpha = 0.15f) else WaveStreamColors.BackgroundTertiary,
        label = "seeAllCardBg"
    )
    
    Box(
        modifier = modifier
            .graphicsLayer { 
                scaleX = scale
                scaleY = scale 
            }
            .width(122.dp)
            .height(183.dp)
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, borderColor, RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .onFocusChanged { if (it.isFocused) onFocused?.invoke() }
            .onKeyEvent { event ->
                if (event.type == KeyEventType.KeyUp && 
                    (event.key == Key.DirectionCenter || event.key == Key.Enter)) {
                    onClick()
                    true
                } else {
                    false
                }
            }
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Arrow symbol as text - simpler and always works
            Text(
                text = "→",
                style = MaterialTheme.typography.headlineLarge,
                color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Vedi tutto",
                style = MaterialTheme.typography.bodyMedium,
                color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

/**
 * Numero di classifica in stile "Top 10": solo outline, alto quanto la card,
 * a sinistra del poster (idea ripresa da KIPTV, vedi
 * wavestream_kiptv_teardown.md §4.4).
 *
 * Puramente decorativo: non è focusable e non intercetta il D-pad, quindi non
 * entra nel percorso di navigazione delle righe.
 */
@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
private fun TvRankNumber(rank: Int, modifier: Modifier = Modifier) {
    Text(
        text = rank.toString(),
        style = MaterialTheme.typography.displayLarge.copy(
            // "10" ha due cifre: rimpicciolito per non uscire dalla fascia.
            fontSize = if (rank >= 10) 52.sp else 76.sp,
            fontWeight = FontWeight.Black,
            drawStyle = Stroke(width = 3f, join = StrokeJoin.Round)
        ),
        color = WaveStreamColors.TextPrimary.copy(alpha = 0.9f),
        textAlign = TextAlign.End,
        maxLines = 1,
        softWrap = false,
        modifier = modifier
            .width(RANK_GUTTER)
            .padding(end = 8.dp)
    )
}

