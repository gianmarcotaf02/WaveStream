package it.wavestream.app.ui.welcome

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PlaylistAdd
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.components.FocusedButton
import it.wavestream.app.ui.components.OnboardingBackground
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import it.wavestream.app.ui.terms.TermsActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.WaveStreamTheme
import javax.inject.Inject

private data class Slide(
    val title: String,
    val description: String,
    val icon: ImageVector? = null,
    val showLogo: Boolean = false
)

private val slides = listOf(
    Slide(
        title = "Benvenuto su WaveStream",
        description = "Il tuo cinema personale, sempre con te.\nGuarda film, serie TV e canali live in un'unica app.",
        showLogo = true
    ),
    Slide(
        title = "Aggiungi le tue Playlist",
        description = "Inserisci una playlist M3U, Xtream Codes o scansiona il QR code\nper importare i tuoi contenuti preferiti.",
        icon = Icons.Default.PlaylistAdd
    ),
    Slide(
        title = "Contenuti Preferiti",
        description = "Scegli i tuoi generi preferiti e i contenuti già visti\nper ricevere raccomandazioni personalizzate.",
        icon = Icons.Default.Favorite
    ),
    Slide(
        title = "Tutto pronto!",
        description = "WaveStream è pronto per offrirti\nun'esperienza di streaming su misura per te.",
        showLogo = true
    )
)

@AndroidEntryPoint
class WelcomeActivity : ComponentActivity() {

    @Inject lateinit var userPreferences: UserPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WaveStreamTheme {
                WelcomeScreen(
                    onContinue = {
                        lifecycleScope.launch(Dispatchers.IO) {
                            userPreferences.setWelcomeShown(true)
                        }
                        goToTerms()
                    }
                )
            }
        }
    }

    private fun goToTerms() {
        val intent = Intent(this, TermsActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun WelcomeScreen(onContinue: () -> Unit) {
    val pagerState = rememberPagerState(pageCount = { slides.size })
    val coroutineScope = rememberCoroutineScope()
    var lastPage by remember { mutableStateOf(false) }

    LaunchedEffect(pagerState.currentPage) {
        lastPage = pagerState.currentPage == slides.size - 1
    }

    OnboardingBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 120.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) { page ->
                val slide = slides[page]
                var emojiVisible by remember(page) { mutableStateOf(false) }
                var titleVisible by remember(page) { mutableStateOf(false) }
                var descVisible by remember(page) { mutableStateOf(false) }

                LaunchedEffect(page, pagerState.currentPage) {
                    if (page == pagerState.currentPage) {
                        emojiVisible = false
                        titleVisible = false
                        descVisible = false
                        delay(80)
                        emojiVisible = true
                        titleVisible = true
                        descVisible = true
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(48.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    AnimatedVisibility(
                        visible = titleVisible,
                        enter = fadeIn(animationSpec = tween(500)) +
                                slideInHorizontally(animationSpec = tween(500)) { it }
                    ) {
                        Text(
                            text = slide.title,
                            style = MaterialTheme.typography.headlineMedium,
                            color = WaveStreamColors.TextPrimary,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                    }

                    AnimatedVisibility(
                        visible = emojiVisible,
                        enter = fadeIn(animationSpec = tween(500)) +
                                slideInHorizontally(animationSpec = tween(500)) { it }
                    ) {
                        if (slide.showLogo) {
                            Image(
                                painter = painterResource(id = it.wavestream.app.R.drawable.logo),
                                contentDescription = "WaveStream Logo",
                                modifier = Modifier
                                    .widthIn(max = 240.dp)
                                    .heightIn(max = 120.dp)
                                    .padding(bottom = 32.dp)
                            )
                        } else {
                            slide.icon?.let { icon ->
                                Icon(
                                    imageVector = icon,
                                    contentDescription = slide.title,
                                    modifier = Modifier
                                        .size(72.dp)
                                        .padding(bottom = 32.dp),
                                    tint = WaveStreamColors.Accent
                                )
                            }
                        }
                    }

                    AnimatedVisibility(
                        visible = descVisible,
                        enter = fadeIn(animationSpec = tween(500)) +
                                slideInHorizontally(animationSpec = tween(500)) { it }
                    ) {
                        Text(
                            text = slide.description,
                            style = MaterialTheme.typography.bodyLarge,
                            color = WaveStreamColors.TextSecondary,
                            textAlign = TextAlign.Center,
                            lineHeight = 24.sp
                        )
                    }
                }
            }
        }

        // Bottom area: dots + button
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Page indicators
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 32.dp)
            ) {
                slides.indices.forEach { index ->
                    Box(
                        modifier = Modifier
                            .size(if (index == pagerState.currentPage) 12.dp else 8.dp)
                            .clip(CircleShape)
                            .background(
                                if (index <= pagerState.currentPage) WaveStreamColors.Accent
                                else Color.Gray.copy(alpha = 0.4f)
                            )
                    )
                }
            }

            // Continue / Avanti button
            FocusedButton(
                onClick = {
                    if (lastPage) {
                        onContinue()
                    } else {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }
                },
                width = 280.dp,
                height = 52.dp,
                borderRadius = 12.dp
            ) {
                Text(
                    text = if (lastPage) "Continua" else "Avanti",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            // Skip button (always present, transparent on last page)
            FocusedButton(
                onClick = onContinue,
                enabled = !lastPage,
                modifier = Modifier
                    .padding(top = 12.dp)
                    .alpha(if (lastPage) 0f else 1f),
                width = 200.dp,
                height = 44.dp,
                containerColor = Color.Transparent,
                contentColor = WaveStreamColors.TextSecondary,
                borderRadius = 12.dp
            ) {
                Text(
                    text = "Salta",
                    fontSize = 14.sp
                )
            }
        }
    }
}
