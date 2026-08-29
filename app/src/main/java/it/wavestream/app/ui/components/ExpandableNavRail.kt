package it.wavestream.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.automirrored.filled.FormatListBulleted
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.key.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.ui.MainTab
import it.wavestream.app.R
import it.wavestream.app.ui.theme.WaveStreamColors

@Composable
fun ExpandableNavRail(
    selectedTab: MainTab,
    onTabSelected: (MainTab) -> Unit,
    isExpanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    onSettingsClick: () -> Unit,
    onContentFocusRequest: () -> Unit,
    onCollapseRequest: () -> Unit = {},
    onExploreCategoriesClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    // Single expansion progress 0..1 — railWidth, backgroundAlpha, textAlpha derived from it.
    // Replaces 3 separate animate*AsState calls that ran in parallel.
    val expansionProgress by animateFloatAsState(
        targetValue = if (isExpanded) 1f else 0f,
        animationSpec = spring(dampingRatio = 0.7f, stiffness = 400f),
        label = "railExpansion"
    )

    val railWidth = (64.dp + 136.dp * expansionProgress)
    val backgroundAlpha = 0.94f + 0.04f * expansionProgress
    val textAlpha = expansionProgress

    val railFocusRequester = remember { FocusRequester() }
    val homeFocusRequester = remember { FocusRequester() }
    val moviesFocusRequester = remember { FocusRequester() }
    val seriesFocusRequester = remember { FocusRequester() }
    val favoritesFocusRequester = remember { FocusRequester() }
    val listsFocusRequester = remember { FocusRequester() }
    val historyFocusRequester = remember { FocusRequester() }

    // Merged two duplicate LaunchedEffect into one
    LaunchedEffect(isExpanded, selectedTab) {
        if (isExpanded) {
            when (selectedTab) {
                MainTab.HOME -> homeFocusRequester.requestFocus()
                MainTab.MOVIES -> moviesFocusRequester.requestFocus()
                MainTab.SERIES -> seriesFocusRequester.requestFocus()
                MainTab.LIVE -> homeFocusRequester.requestFocus()
                MainTab.FAVORITES -> favoritesFocusRequester.requestFocus()
                MainTab.LISTS -> listsFocusRequester.requestFocus()
                MainTab.HISTORY -> historyFocusRequester.requestFocus()
            }
        }
    }
    
    Box(
        modifier = modifier
            .width(railWidth)
            .fillMaxHeight()
            .focusRequester(railFocusRequester)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        WaveStreamColors.BackgroundSecondary.copy(alpha = backgroundAlpha),
                        Color.Black
                    )
                )
            )
            .onPreviewKeyEvent { keyEvent ->
                if (keyEvent.type == KeyEventType.KeyDown && 
                    keyEvent.key == Key.DirectionRight && isExpanded) {
                    onCollapseRequest()
                    onContentFocusRequest()
                    true
                } else if (keyEvent.type == KeyEventType.KeyDown && 
                           keyEvent.key == Key.DirectionLeft && !isExpanded) {
                    onExpandedChange(true)
                    true
                } else {
                    false
                }
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 12.dp)
        ) {
            // Logo area
            if (isExpanded) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "WaveStream",
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = "WaveStream",
                        style = androidx.compose.material3.MaterialTheme.typography.titleMedium,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier.alpha(textAlpha)
                    )
                }
                
                Spacer(modifier = Modifier.height(12.dp))
                
                HorizontalDivider(
                    color = WaveStreamColors.TextTertiary.copy(alpha = 0.25f),
                    thickness = 1.dp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                
                Spacer(modifier = Modifier.height(12.dp))
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(44.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "WaveStream",
                        modifier = Modifier.size(28.dp)
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))
            }
            
            // Navigation items
            Column(
                modifier = Modifier.weight(1f, fill = false)
            ) {
                NavRailItem(
                    icon = Icons.Default.Home,
                    label = "Home",
                    isSelected = selectedTab == MainTab.HOME,
                    isExpanded = isExpanded,
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
                    onClick = { 
                        onTabSelected(MainTab.MOVIES)
                        if (isExpanded) onCollapseRequest()
                    },
                    modifier = Modifier.focusRequester(moviesFocusRequester)
                )
                
                if (isExpanded && selectedTab == MainTab.MOVIES) {
                    ExploreCategoriesItem(
                        isMovies = true,
                        onClick = { onExploreCategoriesClick(true) }
                    )
                }
                
                Spacer(modifier = Modifier.height(1.dp))
                
                NavRailItem(
                    icon = Icons.Default.Tv,
                    label = "Serie TV",
                    isSelected = selectedTab == MainTab.SERIES,
                    isExpanded = isExpanded,
                    onClick = { onTabSelected(MainTab.SERIES) },
                    modifier = Modifier.focusRequester(seriesFocusRequester)
                )
                
                if (isExpanded && selectedTab == MainTab.SERIES) {
                    ExploreCategoriesItem(
                        isMovies = false,
                        onClick = { onExploreCategoriesClick(false) }
                    )
                }
                
                Spacer(modifier = Modifier.height(1.dp))
                
                NavRailItem(
                    icon = Icons.Default.LiveTv,
                    label = "Live",
                    isSelected = selectedTab == MainTab.LIVE,
                    isExpanded = isExpanded,
                    onClick = { onTabSelected(MainTab.LIVE) }
                )
                
                Spacer(modifier = Modifier.height(1.dp))
                
                NavRailItem(
                    icon = if (selectedTab == MainTab.FAVORITES) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    label = "Preferiti",
                    isSelected = selectedTab == MainTab.FAVORITES,
                    isExpanded = isExpanded,
                    onClick = { onTabSelected(MainTab.FAVORITES) },
                    modifier = Modifier.focusRequester(favoritesFocusRequester)
                )
                
                Spacer(modifier = Modifier.height(1.dp))
                
                NavRailItem(
                    icon = Icons.AutoMirrored.Filled.FormatListBulleted,
                    label = "Liste",
                    isSelected = selectedTab == MainTab.LISTS,
                    isExpanded = isExpanded,
                    onClick = { onTabSelected(MainTab.LISTS) },
                    modifier = Modifier.focusRequester(listsFocusRequester)
                )
                
                Spacer(modifier = Modifier.height(1.dp))
                
                NavRailItem(
                    icon = Icons.Default.History,
                    label = "Cronologia",
                    isSelected = selectedTab == MainTab.HISTORY,
                    isExpanded = isExpanded,
                    onClick = { onTabSelected(MainTab.HISTORY) },
                    modifier = Modifier.focusRequester(historyFocusRequester)
                )
            }
            
            // Settings at bottom
            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                
                HorizontalDivider(
                    color = WaveStreamColors.TextTertiary.copy(alpha = 0.25f),
                    thickness = 1.dp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                
                Spacer(modifier = Modifier.height(8.dp))
            } else {
                Spacer(modifier = Modifier.height(4.dp))
            }
            
            NavRailItem(
                icon = Icons.Default.Settings,
                label = "Impostazioni",
                isSelected = false,
                isExpanded = isExpanded,
                onClick = onSettingsClick
            )
        }
    }
}

@Composable
private fun ExploreCategoriesItem(
    isMovies: Boolean,
    isExpanded: Boolean = true,
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
            style = androidx.compose.material3.MaterialTheme.typography.bodySmall,
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
    androidx.compose.foundation.Canvas(modifier = modifier) {
        val squareSize = size.minDimension / 2.5f
        val gap = size.minDimension / 10f
        val cornerRadius = androidx.compose.ui.geometry.CornerRadius(squareSize / 4, squareSize / 4)
        
        drawRoundRect(
            color = color,
            topLeft = androidx.compose.ui.geometry.Offset(0f, 0f),
            size = androidx.compose.ui.geometry.Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
        
        drawRoundRect(
            color = color.copy(alpha = 0.7f),
            topLeft = androidx.compose.ui.geometry.Offset(squareSize + gap, 0f),
            size = androidx.compose.ui.geometry.Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
        
        drawRoundRect(
            color = color.copy(alpha = 0.7f),
            topLeft = androidx.compose.ui.geometry.Offset(0f, squareSize + gap),
            size = androidx.compose.ui.geometry.Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
        
        drawRoundRect(
            color = color.copy(alpha = 0.5f),
            topLeft = androidx.compose.ui.geometry.Offset(squareSize + gap, squareSize + gap),
            size = androidx.compose.ui.geometry.Size(squareSize, squareSize),
            cornerRadius = cornerRadius
        )
    }
}


