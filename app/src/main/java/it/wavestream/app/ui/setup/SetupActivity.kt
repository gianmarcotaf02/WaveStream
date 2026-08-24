package it.wavestream.app.ui.setup

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Label
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalConfiguration
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.dao.ProfileDao
import it.wavestream.app.data.database.entity.Profile
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.data.repository.PlaylistRepository
import it.wavestream.app.ui.taste.TasteSetupActivity
import it.wavestream.app.R
import it.wavestream.app.ui.components.FocusedButton
import it.wavestream.app.ui.components.OnboardingBackground
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.util.QRCodeGenerator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

// Setup tab modes
private enum class SetupTab { M3U, XTREAM, QR_CODE }

// Fun loading phrases - cinema themed
private val setupLoadingPhrases = listOf(
    "Stiamo preparando i popcorn... 🍿",
    "Accendiamo il proiettore... 🎬",
    "Controlliamo le frequenze... 📡",
    "Sintonizzazione canali... 📺",
    "Prepariamo il tuo cinema... 🎥",
    "Un momento, quasi pronti... ⏳",
    "Connessione in corso... 🔗",
    "Verifica credenziali... 🔐",
    "Caricamento contenuti... 📦",
    "Accendiamo le luci... 💡"
)

private val avatarIcons = listOf(
    Icons.Filled.Person, Icons.Filled.Star, Icons.Filled.Favorite,
    Icons.Filled.QueueMusic, Icons.Filled.Palette, Icons.Filled.Image,
    Icons.Filled.PhoneAndroid, Icons.Filled.Tv, Icons.Filled.Bolt,
    Icons.Filled.Shield, Icons.Filled.AutoFixHigh, Icons.Filled.Flight
)

/**
 * Profile config screen shown after playlist setup
 */
@Composable
fun ProfileConfigScreen(
    profileName: String,
    onProfileNameChange: (String) -> Unit,
    avatarIndex: Int,
    onAvatarIndexChange: (Int) -> Unit,
    onConfirm: () -> Unit,
    onSkip: () -> Unit
) {
    OnboardingBackground {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            AnimatedGradientBackground()

        GlassCard(
            modifier = Modifier.width(520.dp)
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Configura il tuo profilo",
                    style = MaterialTheme.typography.headlineMedium,
                    color = WaveStreamColors.TextPrimary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "Scegli un nome e un avatar per personalizzare la tua esperienza",
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 24.dp)
                )

                // Avatar selection grid
                Text(
                    text = "Avatar",
                    style = MaterialTheme.typography.labelLarge,
                    color = WaveStreamColors.TextPrimary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(4),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    contentPadding = PaddingValues(4.dp)
                ) {
                    items(avatarIcons.size) { index ->
                        val isSelected = index == avatarIndex
                        val interactionSource = remember { MutableInteractionSource() }
                        val isFocused by interactionSource.collectIsFocusedAsState()

                        val avatarScale by animateFloatAsState(
                            targetValue = if (isFocused) 1.08f else 1f,
                            label = "avatarScale"
                        )
                        val borderColor by animateColorAsState(
                            targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
                            label = "avatarBorder"
                        )

                        Box(
                            modifier = Modifier
                                .size(76.dp)
                                .graphicsLayer {
                                    scaleX = avatarScale
                                    scaleY = avatarScale
                                }
                                .clip(CircleShape)
                                .border(2.dp, borderColor, CircleShape)
                                .focusable(interactionSource = interactionSource)
                                .clickable { onAvatarIndexChange(index) },
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(64.dp)
                                    .clip(CircleShape)
                                    .then(
                                        if (isSelected) {
                                            Modifier.background(
                                                Brush.linearGradient(
                                                    colors = listOf(WaveStreamColors.Accent, WaveStreamColors.AccentDark)
                                                ),
                                                CircleShape
                                            )
                                        } else {
                                            Modifier.background(WaveStreamColors.BackgroundTertiary, CircleShape)
                                        }
                                    )
                                    .then(
                                        if (isSelected) {
                                            Modifier.border(3.dp, Color.White, CircleShape)
                                        } else {
                                            Modifier
                                        }
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = avatarIcons[index],
                                    contentDescription = "Avatar ${index + 1}",
                                    tint = if (isSelected) Color.White else WaveStreamColors.TextSecondary,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Name input
                var nameValue by remember(profileName) { mutableStateOf(profileName) }
                val focusManager = LocalFocusManager.current
                val continueFocusRequester = remember { FocusRequester() }

                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Nome profilo",
                        style = MaterialTheme.typography.labelMedium,
                        color = WaveStreamColors.Accent,
                        modifier = Modifier.padding(bottom = 8.dp, start = 4.dp)
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()

                            .height(56.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(WaveStreamColors.BackgroundTertiary.copy(alpha = 0.5f))
                            .border(
                                width = 1.dp,
                                color = WaveStreamColors.Accent.copy(alpha = 0.3f),
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(horizontal = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = WaveStreamColors.Accent,
                            modifier = Modifier.size(20.dp)
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        BasicTextField(
                            value = nameValue,
                            onValueChange = {
                                nameValue = it
                                onProfileNameChange(it)
                            },
                            textStyle = MaterialTheme.typography.bodyLarge.copy(
                                color = WaveStreamColors.TextPrimary
                            ),
                            singleLine = true,
                            modifier = Modifier.weight(1f),
                            decorationBox = { innerTextField ->
                                Box {
                                    if (nameValue.isEmpty()) {
                                        Text(
                                            text = "Il tuo nome",
                                            color = WaveStreamColors.TextTertiary,
                                            style = MaterialTheme.typography.bodyLarge
                                        )
                                    }
                                    innerTextField()
                                }
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                imeAction = ImeAction.Done
                            ),
                            keyboardActions = KeyboardActions(
                                onDone = { continueFocusRequester.requestFocus() }
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                // Confirm button
                FocusedButton(
                    onClick = onConfirm,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .focusRequester(continueFocusRequester),
                    width = 240.dp,
                    height = 60.dp,
                    borderRadius = 18.dp,
                    focusBorderColor = WaveStreamColors.TextPrimary
                ) {
                    Text(
                        text = "Continua",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Skip button
                FocusedButton(
                    onClick = onSkip,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    width = 240.dp,
                    height = 60.dp,
                    borderRadius = 18.dp,
                    containerColor = Color.Transparent,
                    contentColor = WaveStreamColors.TextSecondary,
                    focusBorderColor = WaveStreamColors.TextPrimary
                ) {
                    Text(
                        text = "Salta",
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
        }
    }
}

/**
 * Setup Wizard - Modern Design with Glassmorphism
 * Premium streaming app style with QR Code remote setup
 */
@AndroidEntryPoint
class SetupActivity : ComponentActivity() {
    
    @Inject lateinit var userPreferences: UserPreferences
    @Inject lateinit var playlistRepository: PlaylistRepository
    @Inject lateinit var profileDao: ProfileDao
    
    // Firebase Database reference
    private val database by lazy {
        FirebaseDatabase.getInstance("https://wavestream-d3972-default-rtdb.europe-west1.firebasedatabase.app")
    }
    private var firebaseListener: ValueEventListener? = null
    private var currentSessionCode: String? = null
    
    // URL base per la pagina web di setup
    private val webSetupBaseUrl = "https://wavestream-d3972.web.app/setup/"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            WaveStreamTheme {
                SetupScreenContent()
            }
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        // Cleanup Firebase listener and session
        cleanupFirebaseSession()
    }
    
    private fun cleanupFirebaseSession() {
        currentSessionCode?.let { code ->
            firebaseListener?.let { listener ->
                database.getReference("sessions").child(code).removeEventListener(listener)
            }
            // Delete the session
            database.getReference("sessions").child(code).removeValue()
        }
        firebaseListener = null
        currentSessionCode = null
    }
    
    private fun generateSessionCode(): String {
        val chars = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789" // No confusing chars like 0/O, 1/I
        return (1..6).map { chars.random() }.joinToString("")
    }
    
    @Composable
    private fun SetupScreenContent() {
        // Diagnostic crash log reader
        var savedCrashLog by remember { mutableStateOf<String?>(null) }
        val context = androidx.compose.ui.platform.LocalContext.current
        LaunchedEffect(Unit) {
            try {
                val file = java.io.File(context.filesDir, "crash_log.txt")
                if (file.exists()) {
                    savedCrashLog = file.readText()
                }
            } catch (e: Exception) {
                // Ignore
            }
        }

        if (savedCrashLog != null) {
            CrashLogOverlay(
                logText = savedCrashLog!!,
                onDismiss = {
                    try {
                        val file = java.io.File(context.filesDir, "crash_log.txt")
                        if (file.exists()) {
                            file.delete()
                        }
                    } catch (e: Exception) {
                        // Ignore
                    }
                    savedCrashLog = null
                }
            )
            return
        }

        var currentTab by remember { mutableStateOf(SetupTab.M3U) }
        var isLoading by remember { mutableStateOf(false) }
        var loadingProgress by remember { mutableFloatStateOf(0f) }
        var errorMessage by remember { mutableStateOf<String?>(null) }
        var successMessage by remember { mutableStateOf<String?>(null) }
        
        // Profile config state
        var showProfileConfig by remember { mutableStateOf(false) }
        var profileName by remember { mutableStateOf("") }
        var profileAvatarIndex by remember { mutableIntStateOf(0) }
        
        // M3U fields
        var m3uName by remember { mutableStateOf("") }
        var m3uUrl by remember { mutableStateOf("") }
        
        // Xtream fields
        var xtreamName by remember { mutableStateOf("") }
        var xtreamServer by remember { mutableStateOf("") }
        var xtreamUsername by remember { mutableStateOf("") }
        var xtreamPassword by remember { mutableStateOf("") }
        
        // QR Code state
        var sessionCode by remember { mutableStateOf("") }
        var qrCodeBitmap by remember { mutableStateOf<Bitmap?>(null) }
        var isWaitingForData by remember { mutableStateOf(false) }
        
        // Generate session code and QR when switching to QR tab
        LaunchedEffect(currentTab) {
            if (currentTab == SetupTab.QR_CODE && sessionCode.isEmpty()) {
                sessionCode = generateSessionCode()
                currentSessionCode = sessionCode
                
                try {
                    val url = "$webSetupBaseUrl?session=$sessionCode"
                    qrCodeBitmap = QRCodeGenerator.generate(url, 400)
                } catch (e: Throwable) {
                    Log.e("SetupActivity", "Failed to generate QR Code", e)
                    errorMessage = "Errore QR [${e::class.java.name}]: ${e.message ?: e.toString()}"
                }
                
                // Start listening for data from Firebase
                isWaitingForData = true
                try {
                    startFirebaseListener(
                        sessionCode = sessionCode,
                        onDataReceived = { type, name, data ->
                            isWaitingForData = false
                            successMessage = "Dati ricevuti! Compilo il form..."
                            
                            when (type) {
                                "m3u" -> {
                                    m3uName = name
                                    m3uUrl = data["url"] ?: ""
                                    currentTab = SetupTab.M3U
                                }
                                "xtream" -> {
                                    xtreamName = name
                                    xtreamServer = data["server"] ?: ""
                                    xtreamUsername = data["username"] ?: ""
                                    xtreamPassword = data["password"] ?: ""
                                    currentTab = SetupTab.XTREAM
                                }
                            }
                            
                            // Clear success message after delay
                            lifecycleScope.launch {
                                delay(2000)
                                successMessage = null
                            }
                        },
                        onError = { error ->
                            errorMessage = error
                            isWaitingForData = false
                        }
                    )
                } catch (e: Throwable) {
                    Log.e("SetupActivity", "Failed to start Firebase listener", e)
                    errorMessage = "Errore DB [${e::class.java.name}]: ${e.message ?: e.toString()}"
                    isWaitingForData = false
                }
            } else if (currentTab != SetupTab.QR_CODE) {
                // Cleanup when leaving QR tab
                cleanupFirebaseSession()
                sessionCode = ""
                qrCodeBitmap = null
                isWaitingForData = false
            }
        }
        
        // Simulate progress while loading
        LaunchedEffect(isLoading) {
            if (isLoading) {
                loadingProgress = 0f
                while (loadingProgress < 0.9f) {
                    delay(100)
                    loadingProgress += (0.9f - loadingProgress) * 0.1f
                }
            } else {
                loadingProgress = 0f
            }
        }
        
        if (showProfileConfig) {
            ProfileConfigScreen(
                profileName = profileName,
                onProfileNameChange = { profileName = it },
                avatarIndex = profileAvatarIndex,
                onAvatarIndexChange = { profileAvatarIndex = it },
                onConfirm = {
                    lifecycleScope.launch(Dispatchers.IO) {
                        val profileId = userPreferences.getCurrentProfileId()
                        if (profileId != null) {
                            val existing = profileDao.getProfileById(profileId)
                            if (existing != null) {
                                val name = profileName.ifBlank { existing.name }
                                profileDao.update(
                                    existing.copy(
                                        name = name,
                                        avatarIndex = profileAvatarIndex
                                    )
                                )
                                userPreferences.setCurrentProfileId(profileId)
                            }
                        }
                        withContext(Dispatchers.Main) {
                            completeSetup()
                        }
                    }
                },
                onSkip = {
                    lifecycleScope.launch(Dispatchers.Main) {
                        completeSetup()
                    }
                }
            )
        } else {
            SetupScreen(
                currentTab = currentTab,
                onTabChange = { currentTab = it },
                m3uName = m3uName,
                onM3uNameChange = { m3uName = it },
                m3uUrl = m3uUrl,
                onM3uUrlChange = { m3uUrl = it },
                xtreamName = xtreamName,
                onXtreamNameChange = { xtreamName = it },
                xtreamServer = xtreamServer,
                onXtreamServerChange = { xtreamServer = it },
                xtreamUsername = xtreamUsername,
                onXtreamUsernameChange = { xtreamUsername = it },
                xtreamPassword = xtreamPassword,
                onXtreamPasswordChange = { xtreamPassword = it },
                isLoading = isLoading,
                loadingProgress = loadingProgress,
                errorMessage = errorMessage,
                successMessage = successMessage,
                sessionCode = sessionCode,
                qrCodeBitmap = qrCodeBitmap,
                isWaitingForData = isWaitingForData,
                onContinue = {
                    errorMessage = null
                    
                    when (currentTab) {
                        SetupTab.M3U -> {
                            if (m3uName.isBlank() || m3uUrl.isBlank()) {
                                errorMessage = "Compila tutti i campi"
                                return@SetupScreen
                            }
                            addM3UPlaylist(m3uName, m3uUrl,
                                onLoading = { isLoading = it },
                                onError = { errorMessage = it },
                                onSuccess = { showProfileConfig = true }
                            )
                        }
                        SetupTab.XTREAM -> {
                            if (xtreamName.isBlank() || xtreamServer.isBlank() || 
                                xtreamUsername.isBlank() || xtreamPassword.isBlank()) {
                                errorMessage = "Compila tutti i campi"
                                return@SetupScreen
                            }
                            addXtreamPlaylist(xtreamName, xtreamServer, xtreamUsername, xtreamPassword,
                                onLoading = { isLoading = it },
                                onError = { errorMessage = it },
                                onSuccess = { showProfileConfig = true }
                            )
                        }
                        SetupTab.QR_CODE -> {
                            // QR tab doesn't have a continue action
                        }
                    }
                }
            )
        }
    }
    
    private fun startFirebaseListener(
        sessionCode: String,
        onDataReceived: (type: String, name: String, data: Map<String, String>) -> Unit,
        onError: (String) -> Unit
    ) {
        val sessionRef = database.getReference("sessions").child(sessionCode)
        
        firebaseListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    try {
                        val type = snapshot.child("type").getValue(String::class.java) ?: return
                        val name = snapshot.child("name").getValue(String::class.java) ?: ""
                        
                        val data = mutableMapOf<String, String>()
                        when (type) {
                            "m3u" -> {
                                data["url"] = snapshot.child("url").getValue(String::class.java) ?: ""
                            }
                            "xtream" -> {
                                data["server"] = snapshot.child("server").getValue(String::class.java) ?: ""
                                data["username"] = snapshot.child("username").getValue(String::class.java) ?: ""
                                data["password"] = snapshot.child("password").getValue(String::class.java) ?: ""
                            }
                        }
                        
                        // Stop listening immediately to prevent multiple triggers
                        if (firebaseListener != null) {
                            sessionRef.removeEventListener(firebaseListener!!)
                        }
                        
                        // Delete the session data after receiving
                        sessionRef.removeValue()
                        
                        onDataReceived(type, name, data)
                        
                    } catch (e: Exception) {
                        Log.e("SetupActivity", "Error parsing Firebase data", e)
                        onError("Errore nella lettura dei dati")
                    }
                }
            }
            
            override fun onCancelled(error: DatabaseError) {
                Log.e("SetupActivity", "Firebase listener cancelled", error.toException())
                onError("Connessione interrotta")
            }
        }
        
        sessionRef.addValueEventListener(firebaseListener!!)
    }
    
    private fun addM3UPlaylist(
        name: String, 
        url: String,
        onLoading: (Boolean) -> Unit,
        onError: (String) -> Unit,
        onSuccess: () -> Unit = {}
    ) {
        onLoading(true)
        
        lifecycleScope.launch {
            try {
                playlistRepository.addM3UPlaylist(name, url)
                onLoading(false)
                onSuccess()
            } catch (e: Exception) {
                onLoading(false)
                onError(e.message ?: "Errore durante il caricamento della playlist")
            }
        }
    }
    
    private fun addXtreamPlaylist(
        name: String,
        server: String,
        username: String,
        password: String,
        onLoading: (Boolean) -> Unit,
        onError: (String) -> Unit,
        onSuccess: () -> Unit = {}
    ) {
        onLoading(true)
        
        lifecycleScope.launch {
            try {
                playlistRepository.addXtreamPlaylist(name, server, username, password)
                onLoading(false)
                onSuccess()
            } catch (e: Exception) {
                onLoading(false)
                onError(e.message ?: "Errore durante il caricamento della playlist")
            }
        }
    }
    
    private fun completeSetup() {
        if (isFinishing || isDestroyed) return
        
        val intent = Intent(this@SetupActivity, TasteSetupActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
        finish()
    }
}

/**
 * Setup Screen with Modern Glassmorphism Design
 */
@Composable
private fun SetupScreen(
    currentTab: SetupTab,
    onTabChange: (SetupTab) -> Unit,
    m3uName: String,
    onM3uNameChange: (String) -> Unit,
    m3uUrl: String,
    onM3uUrlChange: (String) -> Unit,
    xtreamName: String,
    onXtreamNameChange: (String) -> Unit,
    xtreamServer: String,
    onXtreamServerChange: (String) -> Unit,
    xtreamUsername: String,
    onXtreamUsernameChange: (String) -> Unit,
    xtreamPassword: String,
    onXtreamPasswordChange: (String) -> Unit,
    isLoading: Boolean,
    loadingProgress: Float,
    errorMessage: String?,
    successMessage: String?,
    sessionCode: String,
    qrCodeBitmap: Bitmap?,
    isWaitingForData: Boolean,
    onContinue: () -> Unit
) {
    // Each tab gets its own FocusRequester to avoid crashes during AnimatedContent transitions
    val m3uFocusRequester = remember { FocusRequester() }
    val xtreamFocusRequester = remember { FocusRequester() }
    
    // Request focus on first field (only for form tabs)
    // Use a longer delay to ensure AnimatedContent exit animation completes
    LaunchedEffect(currentTab) {
        if (currentTab != SetupTab.QR_CODE) {
            delay(400) // Wait for AnimatedContent crossfade to finish
            try {
                when (currentTab) {
                    SetupTab.M3U -> m3uFocusRequester.requestFocus()
                    SetupTab.XTREAM -> xtreamFocusRequester.requestFocus()
                    else -> {}
                }
            } catch (_: Exception) {}
        }
    }
    
    OnboardingBackground {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            AnimatedGradientBackground()
            
            val screenHeight = LocalConfiguration.current.screenHeightDp.dp
            
            Box(
                modifier = Modifier
                    .width(520.dp)
                    .heightIn(max = screenHeight * 0.85f)
                    .clip(RoundedCornerShape(24.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                WaveStreamColors.BackgroundSecondary.copy(alpha = 0.85f),
                                WaveStreamColors.BackgroundSecondary.copy(alpha = 0.75f)
                            )
                        )
                    )
                    .border(
                        width = 1.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.1f),
                                Color.White.copy(alpha = 0.05f),
                                Color.Transparent
                            )
                        ),
                        shape = RoundedCornerShape(24.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // HEADER — Logo, title, tabs
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "WaveStream",
                        modifier = Modifier.size(72.dp)
                    )
                    
                    Spacer(modifier = Modifier.height(14.dp))
                    
                    Text(
                        text = "Configurazione",
                        style = MaterialTheme.typography.headlineMedium,
                        color = WaveStreamColors.TextPrimary,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Spacer(modifier = Modifier.height(4.dp))
                    
                    Text(
                        text = "Aggiungi la tua playlist IPTV",
                        style = MaterialTheme.typography.bodyMedium,
                        color = WaveStreamColors.TextSecondary
                    )
                    
                    Spacer(modifier = Modifier.height(10.dp))
                    
                    ThreeTabSelector(
                        currentTab = currentTab,
                        onTabChange = onTabChange,
                        enabled = !isLoading
                    )
                    
                    // Success message
                    AnimatedVisibility(
                        visible = successMessage != null,
                        enter = fadeIn() + slideInVertically(),
                        exit = fadeOut() + slideOutVertically()
                    ) {
                        successMessage?.let { msg ->
                            Spacer(modifier = Modifier.height(10.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(Color(0xFF22C55E).copy(alpha = 0.15f))
                                    .padding(12.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.CheckCircle,
                                    contentDescription = null,
                                    tint = Color(0xFF22C55E),
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = msg,
                                    color = Color(0xFF22C55E),
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(10.dp))
                    
                    // CONTENT — Scrollable form area
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .verticalScroll(rememberScrollState()),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            AnimatedContent(
                                targetState = currentTab,
                                transitionSpec = {
                                    fadeIn(animationSpec = tween(300)) togetherWith
                                    fadeOut(animationSpec = tween(300))
                                },
                                label = "formContent"
                            ) { tab ->
                                Column {
                                    when (tab) {
                                        SetupTab.M3U -> {
                                            ModernTextField(
                                                value = m3uName,
                                                onValueChange = onM3uNameChange,
                                                label = "Nome playlist",
                                                icon = Icons.AutoMirrored.Outlined.Label,
                                                focusRequester = m3uFocusRequester,
                                                enabled = !isLoading
                                            )
                                            Spacer(modifier = Modifier.height(10.dp))
                                            ModernTextField(
                                                value = m3uUrl,
                                                onValueChange = onM3uUrlChange,
                                                label = "URL M3U",
                                                icon = Icons.Outlined.Link,
                                                enabled = !isLoading
                                            )
                                        }
                                        SetupTab.XTREAM -> {
                                            Row(modifier = Modifier.fillMaxWidth()) {
                                                ModernTextField(
                                                    value = xtreamName,
                                                    onValueChange = onXtreamNameChange,
                                                    label = "Nome playlist",
                                                    icon = Icons.AutoMirrored.Outlined.Label,
                                                    focusRequester = xtreamFocusRequester,
                                                    enabled = !isLoading,
                                                    modifier = Modifier.weight(1f)
                                                )
                                                Spacer(modifier = Modifier.width(8.dp))
                                                ModernTextField(
                                                    value = xtreamServer,
                                                    onValueChange = onXtreamServerChange,
                                                    label = "Server URL",
                                                    icon = Icons.Outlined.Dns,
                                                    enabled = !isLoading,
                                                    modifier = Modifier.weight(1f)
                                                )
                                            }
                                            Spacer(modifier = Modifier.height(8.dp))
                                            Row(modifier = Modifier.fillMaxWidth()) {
                                                ModernTextField(
                                                    value = xtreamUsername,
                                                    onValueChange = onXtreamUsernameChange,
                                                    label = "Username",
                                                    icon = Icons.Outlined.Person,
                                                    enabled = !isLoading,
                                                    modifier = Modifier.weight(1f)
                                                )
                                                Spacer(modifier = Modifier.width(8.dp))
                                                ModernTextField(
                                                    value = xtreamPassword,
                                                    onValueChange = onXtreamPasswordChange,
                                                    label = "Password",
                                                    icon = Icons.Outlined.Lock,
                                                    isPassword = true,
                                                    enabled = !isLoading,
                                                    modifier = Modifier.weight(1f)
                                                )
                                            }
                                        }
                                        SetupTab.QR_CODE -> {
                                            QRCodeSetupContent(
                                                sessionCode = sessionCode,
                                                qrCodeBitmap = qrCodeBitmap,
                                                isWaitingForData = isWaitingForData
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    // FOOTER — Error + button, fixed at bottom
                    AnimatedVisibility(
                        visible = errorMessage != null,
                        enter = fadeIn() + slideInVertically(),
                        exit = fadeOut() + slideOutVertically()
                    ) {
                        errorMessage?.let { error ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(WaveStreamColors.Error.copy(alpha = 0.15f))
                                    .padding(12.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.Error,
                                    contentDescription = null,
                                    tint = WaveStreamColors.Error,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = error,
                                    color = WaveStreamColors.Error,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(10.dp))
                    
                    if (currentTab != SetupTab.QR_CODE) {
                        AddPlaylistButton(
                            isLoading = isLoading,
                            loadingProgress = loadingProgress,
                            onClick = onContinue
                        )
                    }
                }
            }
        }
    }
}

/**
 * QR Code Setup Content
 */
@Composable
private fun QRCodeSetupContent(
    sessionCode: String,
    qrCodeBitmap: Bitmap?,
    isWaitingForData: Boolean
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        // Left: QR Code
        qrCodeBitmap?.let { bitmap ->
            Box(
                modifier = Modifier
                    .size(175.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    bitmap = bitmap.asImageBitmap(),
                    contentDescription = "QR Code",
                    modifier = Modifier.fillMaxSize()
                )
            }
        } ?: Box(
            modifier = Modifier
                .size(165.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(WaveStreamColors.BackgroundTertiary),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(
                color = WaveStreamColors.Accent,
                modifier = Modifier.size(36.dp)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        // Right: session code + instructions
        Column(
            modifier = Modifier.weight(1f)
        ) {
            // Session code display - prominent
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(WaveStreamColors.BackgroundTertiary.copy(alpha = 0.5f))
                    .padding(horizontal = 16.dp, vertical = 10.dp)
            ) {
                Text(
                    text = "Codice: ",
                    color = WaveStreamColors.TextSecondary,
                    fontSize = 14.sp
                )
                Text(
                    text = sessionCode.ifEmpty { "------" },
                    color = WaveStreamColors.Accent,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 2.sp
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Instructions
            Text(
                text = "Scansiona con il cellulare",
                style = MaterialTheme.typography.titleMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Compila i dati comodamente dal telefono",
                style = MaterialTheme.typography.bodySmall,
                color = WaveStreamColors.TextSecondary
            )

            // Waiting indicator
            if (isWaitingForData) {
                Spacer(modifier = Modifier.height(12.dp))

                val infiniteTransition = rememberInfiniteTransition(label = "pulse")
                val alpha by infiniteTransition.animateFloat(
                    initialValue = 0.4f,
                    targetValue = 1f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(1000),
                        repeatMode = RepeatMode.Reverse
                    ),
                    label = "pulseAlpha"
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.alpha(alpha)
                ) {
                    CircularProgressIndicator(
                        color = WaveStreamColors.Accent,
                        modifier = Modifier.size(16.dp),
                        strokeWidth = 2.dp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "In attesa di dati dal cellulare...",
                        color = WaveStreamColors.TextSecondary,
                        fontSize = 13.sp
                    )
                }
            }
        }
    }
}

/**
 * Three Tab Selector with sliding indicator
 */
@Composable
private fun ThreeTabSelector(
    currentTab: SetupTab,
    onTabChange: (SetupTab) -> Unit,
    enabled: Boolean
) {
    val indicatorPosition by animateFloatAsState(
        targetValue = when (currentTab) {
            SetupTab.M3U -> 0f
            SetupTab.XTREAM -> 1f
            SetupTab.QR_CODE -> 2f
        },
        animationSpec = spring(
            dampingRatio = 0.7f,
            stiffness = 300f
        ),
        label = "tabIndicator"
    )
    
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(WaveStreamColors.BackgroundDark.copy(alpha = 0.6f))
            .padding(4.dp)
            .clipToBounds()
    ) {
        // Calculate tab width based on available space (minus padding)
        val tabWidth = (maxWidth - 8.dp) / 3
        val indicatorOffset = tabWidth * indicatorPosition
        
        // Sliding indicator - properly clipped
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(tabWidth)
                .offset(x = indicatorOffset)
                .clip(RoundedCornerShape(10.dp))
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            WaveStreamColors.Accent,
                            WaveStreamColors.AccentDark
                        )
                    )
                )
        )
        
        // Tab buttons
        Row(modifier = Modifier.fillMaxSize()) {
            TabButton(
                text = "M3U",
                icon = Icons.Outlined.Link,
                isSelected = currentTab == SetupTab.M3U,
                onClick = { if (enabled) onTabChange(SetupTab.M3U) },
                modifier = Modifier.weight(1f)
            )
            TabButton(
                text = "Xtream",
                icon = Icons.Outlined.Cloud,
                isSelected = currentTab == SetupTab.XTREAM,
                onClick = { if (enabled) onTabChange(SetupTab.XTREAM) },
                modifier = Modifier.weight(1f)
            )
            TabButton(
                text = "QR",
                icon = Icons.Outlined.QrCode,
                isSelected = currentTab == SetupTab.QR_CODE,
                onClick = { if (enabled) onTabChange(SetupTab.QR_CODE) },
                modifier = Modifier.weight(1f)
            )
        }
    }
}


/**
 * Animated gradient background with floating orbs
 */
@Composable
private fun AnimatedGradientBackground() {
    val infiniteTransition = rememberInfiniteTransition(label = "bgAnim")
    
    val offsetX by infiniteTransition.animateFloat(
        initialValue = -300f,
        targetValue = 300f,
        animationSpec = infiniteRepeatable(
            animation = tween(12000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "offsetX"
    )
    
    val offsetY by infiniteTransition.animateFloat(
        initialValue = -150f,
        targetValue = 150f,
        animationSpec = infiniteRepeatable(
            animation = tween(10000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "offsetY"
    )
    
    Box(modifier = Modifier.fillMaxSize()) {
        // Primary glow orb
        Box(
            modifier = Modifier
                .size(800.dp)
                .offset(x = offsetX.dp, y = offsetY.dp)
                .align(Alignment.Center)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            WaveStreamColors.Accent.copy(alpha = 0.12f),
                            WaveStreamColors.Accent.copy(alpha = 0.04f),
                            Color.Transparent
                        )
                    ),
                    shape = CircleShape
                )
        )
        
        // Secondary orb
        Box(
            modifier = Modifier
                .size(500.dp)
                .offset(x = (-offsetX * 0.6f).dp, y = (-offsetY * 0.8f).dp)
                .align(Alignment.TopEnd)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color(0xFF6366F1).copy(alpha = 0.08f),
                            Color.Transparent
                        )
                    ),
                    shape = CircleShape
                )
        )
    }
}

/**
 * Glassmorphism Card
 */
@Composable
private fun GlassCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(24.dp))
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        WaveStreamColors.BackgroundSecondary.copy(alpha = 0.85f),
                        WaveStreamColors.BackgroundSecondary.copy(alpha = 0.75f)
                    )
                )
            )
            .border(
                width = 1.dp,
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.1f),
                        Color.White.copy(alpha = 0.05f),
                        Color.Transparent
                    )
                ),
                shape = RoundedCornerShape(24.dp)
            )
    ) {
        content()
    }
}

/**
 * Modern Tab Selector with sliding indicator
 */
@Composable
private fun ModernTabSelector(
    isM3UMode: Boolean,
    onTabChange: (Boolean) -> Unit,
    enabled: Boolean
) {
    val indicatorOffset by animateFloatAsState(
        targetValue = if (isM3UMode) 0f else 1f,
        animationSpec = spring(
            dampingRatio = 0.7f,
            stiffness = 300f
        ),
        label = "tabIndicator"
    )
    
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(WaveStreamColors.BackgroundDark.copy(alpha = 0.6f))
            .padding(4.dp)
    ) {
        // Sliding indicator
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.5f)
                .offset(x = (indicatorOffset * 220).dp)
                .clip(RoundedCornerShape(10.dp))
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            WaveStreamColors.Accent,
                            WaveStreamColors.AccentDark
                        )
                    )
                )
        )
        
        // Tab buttons
        Row(modifier = Modifier.fillMaxSize()) {
            TabButton(
                text = "M3U / URL",
                icon = Icons.Outlined.Link,
                isSelected = isM3UMode,
                onClick = { if (enabled) onTabChange(true) },
                modifier = Modifier.weight(1f)
            )
            TabButton(
                text = "Xtream",
                icon = Icons.Outlined.Cloud,
                isSelected = !isM3UMode,
                onClick = { if (enabled) onTabChange(false) },
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun TabButton(
    text: String,
    icon: ImageVector,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val borderAlpha by animateFloatAsState(
        targetValue = if (isFocused) 0.8f else 0f,
        animationSpec = spring(dampingRatio = 0.7f),
        label = "tabBorderAlpha"
    )

    Box(
        modifier = modifier
            .fillMaxHeight()
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .border(
                2.dp,
                WaveStreamColors.Accent.copy(alpha = borderAlpha.coerceIn(0f, 1f)),
                RoundedCornerShape(10.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (isSelected) Color.White else WaveStreamColors.TextSecondary,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = text,
                color = if (isSelected) Color.White else WaveStreamColors.TextSecondary,
                fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal,
                fontSize = 14.sp
            )
        }
    }
}

/**
 * Modern Text Field with icon and glow
 */
@Composable
private fun ModernTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    icon: ImageVector,
    isPassword: Boolean = false,
    focusRequester: FocusRequester? = null,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val localFocusManager = LocalFocusManager.current
    
    val borderColor by animateColorAsState(
        targetValue = when {
            isFocused -> WaveStreamColors.Accent
            value.isNotEmpty() -> WaveStreamColors.BackgroundTertiary.copy(alpha = 0.8f)
            else -> WaveStreamColors.BackgroundTertiary.copy(alpha = 0.5f)
        },
        animationSpec = tween(200),
        label = "borderColor"
    )
    
    val iconColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
        animationSpec = tween(200),
        label = "iconColor"
    )
    
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
            modifier = Modifier.padding(bottom = 8.dp, start = 4.dp)
        )
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .then(
                    if (focusRequester != null) Modifier.focusRequester(focusRequester) else Modifier
                )
                .focusable(interactionSource = interactionSource, enabled = enabled)
                .clip(RoundedCornerShape(12.dp))
                .border(
                    width = if (isFocused) 2.dp else 1.dp,
                    color = borderColor,
                    shape = RoundedCornerShape(12.dp)
                )
                .background(
                    if (isFocused) WaveStreamColors.BackgroundTertiary.copy(alpha = 0.4f)
                    else WaveStreamColors.BackgroundDark.copy(alpha = 0.6f)
                )
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconColor,
                modifier = Modifier.size(20.dp)
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                enabled = enabled,
                textStyle = TextStyle(
                    color = WaveStreamColors.TextPrimary,
                    fontSize = 15.sp
                ),
                cursorBrush = SolidColor(WaveStreamColors.Accent),
                visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
                singleLine = true,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(
                    onNext = { localFocusManager.moveFocus(FocusDirection.Down) }
                ),
                modifier = Modifier.weight(1f),
                decorationBox = { innerTextField ->
                    if (value.isEmpty()) {
                        Text(
                            text = label,
                            color = WaveStreamColors.TextHint,
                            fontSize = 15.sp
                        )
                    }
                    innerTextField()
                }
            )
        }
    }
}

/**
 * Add Playlist Button with integrated progress bar
 */
@Composable
private fun AddPlaylistButton(
    isLoading: Boolean,
    loadingProgress: Float,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Rotating loading phrase
    var currentPhraseIndex by remember { mutableIntStateOf(0) }
    LaunchedEffect(isLoading) {
        if (isLoading) {
            while (true) {
                delay(2500)
                currentPhraseIndex = (currentPhraseIndex + 1) % setupLoadingPhrases.size
            }
        } else {
            currentPhraseIndex = 0
        }
    }
    
    val animatedProgress by animateFloatAsState(
        targetValue = loadingProgress,
        animationSpec = tween(200),
        label = "progressAnim"
    )
    
    val scale by animateFloatAsState(
        targetValue = when {
            isFocused && !isLoading -> 1.02f
            else -> 1f
        },
        animationSpec = spring(dampingRatio = 0.7f),
        label = "buttonScale"
    )
    
    val buttonHeight by animateDpAsState(
        targetValue = if (isLoading) 100.dp else 56.dp,
        animationSpec = spring(dampingRatio = 0.7f),
        label = "buttonHeight"
    )
    
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(buttonHeight)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(16.dp))
            .then(
                if (isLoading) {
                    Modifier.background(WaveStreamColors.BackgroundTertiary.copy(alpha = 0.6f))
                } else {
                    Modifier.background(
                        Brush.linearGradient(
                            colors = listOf(
                                WaveStreamColors.Accent,
                                WaveStreamColors.AccentDark
                            )
                        )
                    )
                }
            )
            .then(
                if (isFocused && !isLoading) Modifier.border(
                    2.dp,
                    WaveStreamColors.AccentLight,
                    RoundedCornerShape(16.dp)
                ) else Modifier
            )
            .focusable(interactionSource = interactionSource, enabled = !isLoading)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = !isLoading,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        AnimatedContent(
            targetState = isLoading,
            transitionSpec = {
                fadeIn(tween(300)) togetherWith fadeOut(tween(200))
            },
            label = "buttonContent"
        ) { loading ->
            if (loading) {
                // Loading state with progress
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(16.dp)
                ) {
                    // Fun phrase
                    Text(
                        text = setupLoadingPhrases[currentPhraseIndex],
                        color = WaveStreamColors.TextPrimary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Center
                    )
                    
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    // Progress bar
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(WaveStreamColors.BackgroundDark.copy(alpha = 0.5f))
                    ) {
                        // Shimmer effect
                        val shimmer = rememberInfiniteTransition(label = "shimmer")
                        val shimmerOffset by shimmer.animateFloat(
                            initialValue = -1f,
                            targetValue = 2f,
                            animationSpec = infiniteRepeatable(
                                animation = tween(1500, easing = LinearEasing),
                                repeatMode = RepeatMode.Restart
                            ),
                            label = "shimmerOffset"
                        )
                        
                        // Progress fill
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(animatedProgress.coerceIn(0.05f, 1f))
                                .background(
                                    Brush.horizontalGradient(
                                        colors = listOf(
                                            WaveStreamColors.Accent,
                                            WaveStreamColors.AccentLight,
                                            WaveStreamColors.Accent
                                        ),
                                        startX = shimmerOffset * 300f,
                                        endX = (shimmerOffset + 1f) * 300f
                                    ),
                                    shape = RoundedCornerShape(3.dp)
                                )
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // Percentage
                    Text(
                        text = "${(animatedProgress * 100).toInt()}%",
                        color = WaveStreamColors.Accent,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            } else {
                // Normal button state
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Aggiungi Playlist",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}





/**
 * Diagnostic overlay to display crash stacktraces in signed release builds
 */
@androidx.compose.runtime.Composable
fun CrashLogOverlay(
    logText: String,
    onDismiss: () -> Unit
) {
    androidx.compose.foundation.layout.Box(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color(0xFF1A1A1A))
            .padding(32.dp),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ) {
        androidx.compose.foundation.layout.Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.95f),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            androidx.compose.material3.Text(
                text = "⚠️ WaveStream: Rilevato Errore Critico (Release Crash)",
                color = androidx.compose.ui.graphics.Color(0xFFEF4444),
                fontSize = 22.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                modifier = androidx.compose.ui.Modifier.padding(bottom = 8.dp)
            )

            androidx.compose.material3.Text(
                text = "Riporta questa schermata o il log seguente per risolvere il problema:",
                color = androidx.compose.ui.graphics.Color.LightGray,
                fontSize = 14.sp,
                modifier = androidx.compose.ui.Modifier.padding(bottom = 16.dp)
            )
            
            androidx.compose.foundation.layout.Box(
                modifier = androidx.compose.ui.Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .clip(androidx.compose.foundation.shape.RoundedCornerShape(12.dp))
                    .background(androidx.compose.ui.graphics.Color.Black)
                    .border(1.dp, androidx.compose.ui.graphics.Color.DarkGray, androidx.compose.foundation.shape.RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                androidx.compose.foundation.layout.Column(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    androidx.compose.material3.Text(
                        text = logText,
                        color = androidx.compose.ui.graphics.Color(0xFF22C55E),
                        fontSize = 12.sp,
                        fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
                    )
                }
            }
            
            androidx.compose.foundation.layout.Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
            
            androidx.compose.material3.Button(
                onClick = onDismiss,
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = androidx.compose.ui.graphics.Color(0xFFEF4444)),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
                modifier = androidx.compose.ui.Modifier.height(50.dp).width(280.dp)
            ) {
                androidx.compose.material3.Text(
                    text = "Cancella Log e Riprova",
                    color = androidx.compose.ui.graphics.Color.White,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }
    }
}
