package it.wavestream.app.ui.terms

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebResourceRequest
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.key.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.components.FocusedButton
import it.wavestream.app.ui.components.OnboardingBackground
import it.wavestream.app.ui.setup.SetupActivity
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.WaveStreamTheme
import javax.inject.Inject
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TermsActivity : ComponentActivity() {

    @Inject lateinit var userPreferences: UserPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaveStreamTheme {
                TermsScreen(
                    onAccept = {
                        lifecycleScope.launch(Dispatchers.IO) {
                            userPreferences.setTermsAccepted(true)
                            userPreferences.setWelcomeShown(true)
                        }
                        goToSetup()
                    }
                )
            }
        }
    }

    private fun goToSetup() {
        val intent = Intent(this, SetupActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
    }
}

@Composable
private fun TermsScreen(onAccept: () -> Unit) {
    var termsChecked by remember { mutableStateOf(false) }
    var privacyChecked by remember { mutableStateOf(false) }
    var showTerms by remember { mutableStateOf(true) }
    var scrollMode by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    var webViewRef by remember { mutableStateOf<WebView?>(null) }
    val checkboxFocusRequester = remember { FocusRequester() }
    val termsCheckboxInteractionSource = remember { MutableInteractionSource() }
    val isTermsCheckboxFocused by termsCheckboxInteractionSource.collectIsFocusedAsState()
    val privacyCheckboxInteractionSource = remember { MutableInteractionSource() }
    val isPrivacyCheckboxFocused by privacyCheckboxInteractionSource.collectIsFocusedAsState()
    val allChecked = termsChecked && privacyChecked

    val accentHex = remember {
        String.format("#%06X", 0xFFFFFF and WaveStreamColors.Accent.toArgb())
    }

    LaunchedEffect(scrollMode) {
        delay(50)
        webViewRef?.let { webView ->
            if (scrollMode) {
                webView.scrollBarDefaultDelayBeforeFade = Int.MAX_VALUE
            } else {
                webView.scrollBarDefaultDelayBeforeFade = 300
            }
            val css = if (scrollMode) {
                "var s=document.getElementById('ws-scrollbar');" +
                "if(!s){s=document.createElement('style');s.id='ws-scrollbar';document.head.appendChild(s);}" +
                "s.textContent='::-webkit-scrollbar{width:10px;}' +" +
                "'::-webkit-scrollbar-track{background:transparent;}' +" +
                "'::-webkit-scrollbar-thumb{background:$accentHex;border-radius:5px;}';"
            } else {
                "var s=document.getElementById('ws-scrollbar');" +
                "if(!s){s=document.createElement('style');s.id='ws-scrollbar';document.head.appendChild(s);}" +
                "s.textContent='::-webkit-scrollbar{width:4px;}' +" +
                "'::-webkit-scrollbar-track{background:transparent;}' +" +
                "'::-webkit-scrollbar-thumb{background:#555555;border-radius:2px;}';"
            }
            webView.evaluateJavascript(css, null)
        }
    }

    OnboardingBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 48.dp, end = 48.dp, top = 48.dp, bottom = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1. HEADER
            Text(
                text = "Termini e Privacy",
                style = MaterialTheme.typography.headlineMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = "Leggi attentamente i termini d'uso e l'informativa sulla privacy.",
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextSecondary,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                TabButton(
                    title = "Termini e Condizioni",
                    selected = showTerms,
                    onClick = { showTerms = true }
                )
                TabButton(
                    title = "Informativa Privacy",
                    selected = !showTerms,
                    onClick = { showTerms = false }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // 2. BOX TESTO (prende spazio rimanente)
            val borderMod = if (scrollMode || isFocused) {
                Modifier.border(3.dp, WaveStreamColors.Accent, RoundedCornerShape(8.dp))
            } else {
                Modifier
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .focusable(interactionSource = interactionSource)
                    .onKeyEvent { event ->
                        if (event.type != KeyEventType.KeyDown) return@onKeyEvent false
                        when (event.key) {
                            Key.DirectionCenter, Key.Enter -> {
                                if (scrollMode) {
                                    scrollMode = false
                                    checkboxFocusRequester.requestFocus()
                                } else {
                                    scrollMode = true
                                    webViewRef?.scrollBy(0, (webViewRef?.height ?: 800) / 2)
                                }
                                true
                            }
                            Key.Back -> {
                                if (scrollMode) {
                                    scrollMode = false
                                    true
                                } else false
                            }
                            Key.DirectionDown -> {
                                if (scrollMode) {
                                    webViewRef?.scrollBy(0, 80)
                                    true
                                } else false
                            }
                            Key.DirectionUp -> {
                                if (scrollMode) {
                                    webViewRef?.scrollBy(0, -80)
                                    true
                                } else false
                            }
                            else -> false
                        }
                    }
                    .then(borderMod)
            ) {
                Card(
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = WaveStreamColors.BackgroundTertiary
                    )
                ) {
                    AndroidView(
                        factory = { context ->
                            WebView(context).apply {
                                isFocusable = false
                                isFocusableInTouchMode = false
                                setVerticalScrollBarEnabled(true)
                                settings.apply {
                                    javaScriptEnabled = false
                                    loadWithOverviewMode = true
                                    useWideViewPort = true
                                    builtInZoomControls = false
                                    displayZoomControls = false
                                }
                                webViewClient = object : WebViewClient() {
                                    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                                        return false
                                    }
                                }
                                setBackgroundColor(android.graphics.Color.TRANSPARENT)
                                loadUrl("file:///android_asset/terms.html")
                                webViewRef = this
                            }
                        },
                        update = { webView ->
                            val url = if (showTerms) {
                                "file:///android_asset/terms.html"
                            } else {
                                "file:///android_asset/privacy.html"
                            }
                            if (webView.url != url) {
                                webView.loadUrl(url)
                            }
                            webViewRef = webView
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // 3. BOX CHECKBOX (indipendente, fluttuante)
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = WaveStreamColors.BackgroundTertiary
                )
            ) {
                Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Checkbox(
                            checked = termsChecked,
                            onCheckedChange = { termsChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = WaveStreamColors.Accent
                            ),
                            modifier = Modifier
                                .focusRequester(checkboxFocusRequester)
                                .focusable(interactionSource = termsCheckboxInteractionSource)
                                .then(
                                    if (isTermsCheckboxFocused) {
                                        Modifier.border(2.dp, WaveStreamColors.Accent, RoundedCornerShape(4.dp))
                                    } else {
                                        Modifier
                                    }
                                )
                                .size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Accetto i Termini e Condizioni d'Uso",
                            style = MaterialTheme.typography.bodySmall,
                            color = WaveStreamColors.TextPrimary
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Checkbox(
                            checked = privacyChecked,
                            onCheckedChange = { privacyChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = WaveStreamColors.Accent
                            ),
                            modifier = Modifier
                                .focusable(interactionSource = privacyCheckboxInteractionSource)
                                .then(
                                    if (isPrivacyCheckboxFocused) {
                                        Modifier.border(2.dp, WaveStreamColors.Accent, RoundedCornerShape(4.dp))
                                    } else {
                                        Modifier
                                    }
                                )
                                .size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Accetto l'Informativa sulla Privacy e il Trattamento dei Dati",
                            style = MaterialTheme.typography.bodySmall,
                            color = WaveStreamColors.TextPrimary
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 4. BOTTONE CONTINUA
            FocusedButton(
                onClick = onAccept,
                enabled = allChecked,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 8.dp),
                width = 240.dp,
                height = 56.dp,
                borderRadius = 10.dp
            ) {
                Text(
                    text = "Continua",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Composable
private fun RowScope.TabButton(title: String, selected: Boolean, onClick: () -> Unit) {
    val borderColor = if (selected) WaveStreamColors.Accent else Color.Transparent
    val bgColor = if (selected) WaveStreamColors.Accent.copy(alpha = 0.15f) else WaveStreamColors.BackgroundTertiary

    Button(
        onClick = onClick,
        modifier = Modifier
            .weight(1f)
            .height(44.dp)
            .border(
                width = if (selected) 2.dp else 1.dp,
                color = borderColor,
                shape = RoundedCornerShape(10.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
            color = if (selected) WaveStreamColors.Accent else WaveStreamColors.TextSecondary
        )
    }
}
