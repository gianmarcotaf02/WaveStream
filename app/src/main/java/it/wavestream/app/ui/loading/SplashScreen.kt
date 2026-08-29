package it.wavestream.app.ui.loading

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.R
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.SoraFontFamily
import kotlinx.coroutines.delay

/**
 * Animated Splash Screen with dynamic logo and text reveal
 * 
 * Animation sequence:
 * 1. Logo appears centered with scale-in
 * 2. Logo slides left with smooth spring animation
 * 3. "WaveStream" text slides in from the right
 * 4. Motto fades in below
 * 5. onComplete is called after animation finishes
 */
@Composable
fun SplashScreen(
    onComplete: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Animation states
    var animationPhase by remember { mutableStateOf(0) }
    
    // Initial logo scale animation (entrance)
    val logoScale by animateFloatAsState(
        targetValue = if (animationPhase >= 0) 1f else 0.8f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "logoScale"
    )
    
    // Logo horizontal offset - using spring for natural motion
    val logoOffset by animateIntOffsetAsState(
        targetValue = when {
            animationPhase >= 1 -> IntOffset(-80, 0) // Move left slightly (centered with motto)
            else -> IntOffset(0, 0) // Centered
        },
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioLowBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "logoOffset"
    )
    
    // Text visibility
    val textVisible = animationPhase >= 1
    
    // Animation sequence controller
    LaunchedEffect(Unit) {
        delay(800) // Show centered logo briefly
        animationPhase = 1 // Start logo slide + text reveal
        delay(1000) // Wait for spring animation to settle
        animationPhase = 2
        onComplete()
    }
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark),
        contentAlignment = Alignment.Center
    ) {
        // Background glow effect
        Box(
            modifier = Modifier
                .size(500.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            WaveStreamColors.Accent.copy(alpha = 0.15f),
                            Color.Transparent
                        )
                    )
                )
        )
        
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo + Text Row
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.offset { logoOffset }
            ) {
                // Logo with scale animation
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .graphicsLayer {
                scaleX = logoScale
                scaleY = logoScale
            }
                        .clip(RoundedCornerShape(20.dp))
                        .background(WaveStreamColors.BackgroundSecondary)
                ) {
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = "WaveStream Logo",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                
                // "WaveStream" text - slides in with spring animation
                AnimatedVisibility(
                    visible = textVisible,
                    enter = slideInHorizontally(
                        initialOffsetX = { -80 },
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessMedium
                        )
                    ) + fadeIn(
                        animationSpec = tween(
                            durationMillis = 400,
                            easing = FastOutSlowInEasing
                        )
                    )
                ) {
                    Text(
                        text = "WaveStream",
                        // Aurora: wordmark in Sora, tracking stretto (v1: 56sp Inter-style)
                        fontFamily = SoraFontFamily,
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                        color = WaveStreamColors.TextPrimary,
                        modifier = Modifier.padding(start = 16.dp),
                        letterSpacing = (-0.5).sp
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}


