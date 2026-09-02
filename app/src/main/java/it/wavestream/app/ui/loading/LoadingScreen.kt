package it.wavestream.app.ui.loading

import android.content.Context
import android.content.res.Configuration
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.*
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.wavestream.app.R
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.ui.profile.getAvatarResource
import it.wavestream.app.ui.profile.getAvatarIcon
import kotlinx.coroutines.delay

@Immutable
data class TriviaItem(
    val title: String,
    val category: String,
    val text: String
)

// Default fallback trivia phrases in Italian
private val fallbackCuriosities = listOf(
    "\"GTO - Great Teacher Onizuka\" rese popolare il genere scolastico con protagonista adulto: il manga di Tōru Fujisawa vendette oltre 50 milioni di copie.",
    "\"Digimon Adventure\" nacque nel 1999 come rivale di Pokémon ma sviluppò trame più mature: i fan lo considerano superiore nella narrazione a lungo termine.",
    "Il primo anime trasmesso in televisione è stato Astro Boy nel 1963, creato dal leggendario Osamu Tezuka.",
    "L'anime film Akira (1988) è stato realizzato quasi interamente a mano, con oltre 160.000 fogli di celluloide disegnati singolarmente.",
    "L'app IPTV Player WaveStream è progettata specificamente per Android TV con un'interfaccia ultra-veloce e fluida.",
    "Puoi salvare i tuoi film e serie preferiti nei Preferiti o creare Liste personalizzate premendo a lungo su un contenuto.",
    "Nel lettore video puoi premere la freccia GIÙ per cambiare traccia audio o sottotitoli in tempo reale.",
    "WaveStream sincronizza automaticamente la guida TV (EPG) per permetterti di non perdere nessun programma in diretta."
)

// Fun phrases that rotate during loading if profileName is empty (e.g. initial setup)
private val loadingPhrases = listOf(
    "Prepariamo il popcorn... 🍿",
    "Scopriamo cosa c'è in onda...",
    "Sintonizzazione in corso...",
    "Accendiamo le luci del cinema...",
    "Controlliamo la programmazione...",
    "Un momento, quasi pronti...",
    "Carichiamo i contenuti migliori...",
    "Sistema di intrattenimento attivo...",
    "Prepariamo il tuo cinema personale...",
    "Connettiamo ai canali..."
)

/**
 * Loads curiosities array from assets/curiosities.json
 */
private fun loadCuriositiesFromAssets(context: Context): List<TriviaItem> {
    return try {
        val jsonString = context.assets.open("curiosities.json").bufferedReader().use { it.readText() }
        val jsonArray = org.json.JSONArray(jsonString)
        val list = mutableListOf<TriviaItem>()
        for (i in 0 until jsonArray.length()) {
            val item = jsonArray.get(i)
            if (item is org.json.JSONObject) {
                list.add(
                    TriviaItem(
                        title = item.optString("titolo", ""),
                        category = item.optString("categoria", ""),
                        text = item.optString("curiosita", "")
                    )
                )
            }
        }
        list
    } catch (e: Exception) {
        android.util.Log.e("LoadingScreen", "Error loading curiosities from assets", e)
        emptyList()
    }
}

/**
 * Loading Screen - Modern design with fluid animations
 * Premium streaming app style with rotating phrases or profile curiosities
 */
@Composable
fun LoadingScreen(
    statusText: String,
    detailText: String,
    progress: Int,
    showProgressBar: Boolean = false,
    profileName: String = "",
    avatarIndex: Int = 0,
    avatarColorHex: String = "#8B5CF6",
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    
    // Load curiosities list
    val curiosities = remember(context) {
        loadCuriositiesFromAssets(context)
    }
    
    val activeTriviaList = remember(curiosities) {
        val baseList = if (curiosities.isNotEmpty()) {
            curiosities
        } else {
            fallbackCuriosities.map { TriviaItem(title = "", category = "", text = it) }
        }
        baseList.shuffled().take(20)
    }
    
    // Rotating trivia index state
    var currentTriviaIndex by remember { mutableIntStateOf(0) }
    
    // Cycle through trivia every 8 seconds (5s base + 3s) if profile name is present
    if (profileName.isNotEmpty()) {
        LaunchedEffect(activeTriviaList) {
            if (activeTriviaList.isNotEmpty()) {
                while (true) {
                    delay(8000)
                    currentTriviaIndex = (currentTriviaIndex + 1) % activeTriviaList.size
                }
            }
        }
    }
    
    // Rotating phrase state (for standard loading phase without profile selection)
    var currentPhraseIndex by remember { mutableIntStateOf(0) }
    if (profileName.isEmpty()) {
        LaunchedEffect(Unit) {
            while (true) {
                delay(3000)
                currentPhraseIndex = (currentPhraseIndex + 1) % loadingPhrases.size
            }
        }
    }
    
    // Phrase/trivia fade animation
    val textAlpha by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(500),
        label = "textAlpha"
    )
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Animated background with moving gradient
        AnimatedGradientBackground()
        
        // Center Content Area
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = if (profileName.isNotEmpty()) 200.dp else 120.dp), // make space for trivia card in the lower third
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (profileName.isNotEmpty()) {
                // Show custom profile avatar and rotating loading ring
                ProfileAvatarLoader(
                    name = profileName,
                    avatarIndex = avatarIndex,
                    avatarColorHex = avatarColorHex
                )
                
                Spacer(modifier = Modifier.height(20.dp))
                
                Text(
                    text = profileName,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        letterSpacing = 0.sp
                    ),
                    color = WaveStreamColors.TextPrimary,
                    textAlign = TextAlign.Center
                )
            } else {
                // Animated Logo with glow
                AnimatedLogo()
                
                Spacer(modifier = Modifier.height(48.dp))
                
                // Bouncing dots loader
                BouncingDotsLoader()
                
                Spacer(modifier = Modifier.height(32.dp))
                
                // Rotating fun phrase
                Text(
                    text = loadingPhrases[currentPhraseIndex],
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.Medium
                    ),
                    color = WaveStreamColors.TextPrimary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.alpha(textAlpha)
                )
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Status/detail text (actual progress info)
            if (statusText.isNotEmpty()) {
                Text(
                    text = statusText,
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary,
                    textAlign = TextAlign.Center
                )
            }
            
            if (detailText.isNotEmpty()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = detailText,
                    style = MaterialTheme.typography.bodySmall,
                    color = WaveStreamColors.TextTertiary,
                    textAlign = TextAlign.Center
                )
            }
        }
        

        
        // Bottom Trivia Card Area (only shown when profile details are available)
        if (profileName.isNotEmpty()) {
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "LO SAPEVI?",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 2.sp
                    ),
                    color = WaveStreamColors.TextTertiary.copy(alpha = 0.8f)
                )
                
                Spacer(modifier = Modifier.height(8.dp))
                
                AnimatedContent(
                    targetState = activeTriviaList.getOrNull(currentTriviaIndex),
                    transitionSpec = {
                        (androidx.compose.animation.fadeIn(animationSpec = tween(600)) +
                                androidx.compose.animation.slideInVertically(animationSpec = tween(600), initialOffsetY = { it / 3 })) togetherWith
                                (androidx.compose.animation.fadeOut(animationSpec = tween(600)) +
                                        androidx.compose.animation.slideOutVertically(animationSpec = tween(600), targetOffsetY = { -it / 3 }))
                    },
                    label = "triviaTransition"
                ) { triviaItem ->
                    if (triviaItem != null) {
                        TriviaCard(item = triviaItem)
                    }
                }
            }
        }
    }
}

/**
 * Premium glassmorphic trivia card with overlapping background card effect (double sheet)
 */
@Composable
private fun TriviaCard(
    item: TriviaItem,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .width(580.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        // Shadow/Offset card behind (background sheet)
        Box(
            modifier = Modifier
                .matchParentSize()
                .offset(y = 6.dp, x = 3.dp)
                .graphicsLayer {
                    rotationZ = -2f
                }
                .clip(RoundedCornerShape(20.dp))
                // Aurora: ombra foglio su Obsidian, niente tinta calda legacy
                .background(WaveStreamColors.SurfaceDark.copy(alpha = 0.6f))
                .border(
                    width = 1.dp,
                    color = Color.White.copy(alpha = 0.05f),
                    shape = RoundedCornerShape(20.dp)
                )
        )
        
        // Main foreground card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .graphicsLayer {
                    rotationZ = -0.5f
                }
                .shadow(
                    elevation = 12.dp,
                    shape = RoundedCornerShape(20.dp),
                    spotColor = Color.Black.copy(alpha = 0.6f)
                )
                .clip(RoundedCornerShape(20.dp))
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            WaveStreamColors.BackgroundTertiary.copy(alpha = 0.85f),
                            WaveStreamColors.BackgroundSecondary.copy(alpha = 0.9f)
                        )
                    )
                )
                .border(
                    width = 1.2.dp,
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.12f),
                            Color.White.copy(alpha = 0.02f)
                        )
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(horizontal = 32.dp, vertical = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                if (item.title.isNotEmpty()) {
                    Text(
                        text = if (item.category.isNotEmpty()) "${item.category.uppercase()} • ${item.title}" else item.title,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            letterSpacing = 0.3.sp
                        ),
                        color = WaveStreamColors.AccentLight,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
                Text(
                    text = item.text,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        lineHeight = 20.sp,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    ),
                    color = Color.White.copy(alpha = 0.9f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

/**
 * Animated profile loader with rotating accent rings and breathing pulse avatar
 */
@Composable
private fun ProfileAvatarLoader(
    name: String,
    avatarIndex: Int,
    avatarColorHex: String,
    modifier: Modifier = Modifier
) {
    val initial = name.firstOrNull()?.uppercase() ?: "?"
    val parsedColor = remember(avatarColorHex) {
        try {
            Color(android.graphics.Color.parseColor(avatarColorHex))
        } catch (e: Exception) {
            WaveStreamColors.Accent // Aurora: fallback sull'accent dinamico
        }
    }
    
    // Rotating loading ring animations
    val infiniteTransition = rememberInfiniteTransition(label = "profileLoaderRing")
    val rotationAngle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "ringRotation"
    )
    
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = EaseInOutSine),
            repeatMode = RepeatMode.Reverse
        ),
        label = "avatarPulse"
    )
    
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        // Glowing background orb matching avatar color
        Box(
            modifier = Modifier
                .size(160.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            parsedColor.copy(alpha = 0.2f),
                            Color.Transparent
                        )
                    ),
                    shape = CircleShape
                )
        )
        
        // Rotating Ring (Outer dashed/segmented ring)
        androidx.compose.foundation.Canvas(
            modifier = Modifier
                .size(144.dp)
                .graphicsLayer {
                    rotationZ = rotationAngle
                }
        ) {
            drawArc(
                color = parsedColor,
                startAngle = 0f,
                sweepAngle = 90f,
                useCenter = false,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 4.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round
                )
            )
            drawArc(
                color = parsedColor.copy(alpha = 0.25f),
                startAngle = 90f,
                sweepAngle = 90f,
                useCenter = false,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 2.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round
                )
            )
            drawArc(
                color = parsedColor,
                startAngle = 180f,
                sweepAngle = 90f,
                useCenter = false,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 4.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round
                )
            )
            drawArc(
                color = parsedColor.copy(alpha = 0.25f),
                startAngle = 270f,
                sweepAngle = 90f,
                useCenter = false,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 2.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round
                )
            )
        }
        
        // Inner pulsing rotating ring (counter-clockwise)
        androidx.compose.foundation.Canvas(
            modifier = Modifier
                .size(130.dp)
                .graphicsLayer {
                    rotationZ = -rotationAngle * 1.5f
                }
        ) {
            drawArc(
                color = Color.White.copy(alpha = 0.4f),
                startAngle = 45f,
                sweepAngle = 45f,
                useCenter = false,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 2.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round
                )
            )
            drawArc(
                color = Color.White.copy(alpha = 0.4f),
                startAngle = 225f,
                sweepAngle = 45f,
                useCenter = false,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 2.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round
                )
            )
        }
        
        // The Profile Avatar Circle
        Box(
            modifier = Modifier
                .size(112.dp)
                .graphicsLayer {
                    scaleX = pulseScale
                    scaleY = pulseScale
                }
                .shadow(
                    elevation = 16.dp,
                    shape = CircleShape,
                    spotColor = parsedColor.copy(alpha = 0.5f)
                )
                .clip(CircleShape)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            parsedColor.copy(alpha = 0.85f),
                            parsedColor
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = getAvatarIcon(avatarIndex),
                contentDescription = name,
                modifier = Modifier.fillMaxSize().padding(24.dp),
                tint = Color.Unspecified
            )
        }
    }
}

/**
 * Animated gradient background with subtle movement
 */
@Composable
private fun AnimatedGradientBackground() {
    val infiniteTransition = rememberInfiniteTransition(label = "bgGradient")
    
    val offsetX by infiniteTransition.animateFloat(
        initialValue = -200f,
        targetValue = 200f,
        animationSpec = infiniteRepeatable(
            animation = tween(8000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "gradientOffsetX"
    )
    
    val offsetY by infiniteTransition.animateFloat(
        initialValue = -100f,
        targetValue = 100f,
        animationSpec = infiniteRepeatable(
            animation = tween(6000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "gradientOffsetY"
    )
    
    Box(modifier = Modifier.fillMaxSize()) {
        // Main glow orb - moves subtly
        Box(
            modifier = Modifier
                .size(700.dp)
                .offset(x = offsetX.dp, y = offsetY.dp)
                .align(Alignment.Center)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            WaveStreamColors.Accent.copy(alpha = 0.15f),
                            WaveStreamColors.Accent.copy(alpha = 0.05f),
                            Color.Transparent
                        )
                    ),
                    shape = CircleShape
                )
        )
        
        // Secondary accent orb
        Box(
            modifier = Modifier
                .size(400.dp)
                .offset(x = (-offsetX * 0.5f).dp, y = (-offsetY * 0.7f).dp)
                .align(Alignment.TopEnd)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            // Aurora: secondo orbe in teal, duotone con l'accent
                            Color(0xFF5EEAD4).copy(alpha = 0.07f),
                            Color.Transparent
                        )
                    ),
                    shape = CircleShape
                )
        )
    }
}

/**
 * Animated logo with pulse and glow effect
 */
@Composable
private fun AnimatedLogo() {
    val infiniteTransition = rememberInfiniteTransition(label = "logoAnim")
    
    // Subtle scale pulse
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = EaseInOutCubic),
            repeatMode = RepeatMode.Reverse
        ),
        label = "logoScale"
    )
    
    // Glow intensity
    val glowAlpha by infiniteTransition.animateFloat(
        initialValue = 0.3f,
        targetValue = 0.6f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = EaseInOutSine),
            repeatMode = RepeatMode.Reverse
        ),
        label = "glowAlpha"
    )
    
    Box(contentAlignment = Alignment.Center) {
        // Glow behind logo
        Box(
            modifier = Modifier
                .size(200.dp)
                .graphicsLayer {
                val s = scale * 1.2f
                scaleX = s
                scaleY = s
            }
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            WaveStreamColors.Accent.copy(alpha = glowAlpha),
                            Color.Transparent
                        )
                    ),
                    shape = CircleShape
                )
        )
        
        // Logo container
        Box(
            modifier = Modifier
                .size(160.dp)
                .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
                .shadow(
                    elevation = 24.dp,
                    shape = RoundedCornerShape(24.dp),
                    spotColor = WaveStreamColors.Accent.copy(alpha = 0.4f)
                )
                .clip(RoundedCornerShape(24.dp))
                .background(WaveStreamColors.BackgroundSecondary)
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = stringResource(R.string.app_name),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

/**
 * Bouncing dots loader - modern streaming app style
 */
@Composable
private fun BouncingDotsLoader() {
    val dotCount = 3
    val dotSize = 12.dp
    val dotSpacing = 8.dp
    
    Row(
        horizontalArrangement = Arrangement.spacedBy(dotSpacing),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(dotCount) { index ->
            BouncingDot(
                delay = index * 150,
                size = dotSize
            )
        }
    }
}

@Composable
private fun BouncingDot(delay: Int, size: androidx.compose.ui.unit.Dp) {
    val infiniteTransition = rememberInfiniteTransition(label = "dot$delay")
    
    val offsetY by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = -12f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 600
                0f at 0 using EaseInOut
                -12f at 200 using EaseInOut
                0f at 400 using EaseInOut
                0f at 600
            },
            repeatMode = RepeatMode.Restart,
            initialStartOffset = StartOffset(delay)
        ),
        label = "dotOffset"
    )
    
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.2f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 600
                1f at 0 using EaseInOut
                1.2f at 200 using EaseInOut
                1f at 400 using EaseInOut
                1f at 600
            },
            repeatMode = RepeatMode.Restart,
            initialStartOffset = StartOffset(delay)
        ),
        label = "dotScale"
    )
    
    Box(
        modifier = Modifier
            .size(size)
            .graphicsLayer {
                translationY = offsetY
                scaleX = scale
                scaleY = scale
            }
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        WaveStreamColors.Accent,
                        WaveStreamColors.Accent.copy(alpha = 0.7f)
                    )
                ),
                shape = CircleShape
            )
    )
}



// ============ Loading State Data Class ============

/**
 * Loading state holder
 */
@Immutable
data class LoadingState(
    val status: String = "",
    val detail: String = "",
    val progress: Int = 0,
    val showProgress: Boolean = false,
    val isComplete: Boolean = false,
    val hasError: Boolean = false
)

// ============ Preview ============

@Preview(
    showBackground = true,
    widthDp = 1280,
    heightDp = 720,
    uiMode = Configuration.UI_MODE_TYPE_TELEVISION
)
@Composable
private fun LoadingScreenPreview() {
    WaveStreamTheme {
        LoadingScreen(
            statusText = "Sincronizzazione playlist...",
            detailText = "IPTV Italia",
            progress = 65,
            showProgressBar = true
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 1280,
    heightDp = 720,
    uiMode = Configuration.UI_MODE_TYPE_TELEVISION
)
@Composable
private fun LoadingScreenSimplePreview() {
    WaveStreamTheme {
        LoadingScreen(
            statusText = "",
            detailText = "",
            progress = 0,
            showProgressBar = false
        )
    }
}


