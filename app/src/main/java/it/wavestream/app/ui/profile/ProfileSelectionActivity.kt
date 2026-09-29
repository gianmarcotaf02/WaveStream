package it.wavestream.app.ui.profile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.R
import it.wavestream.app.data.database.dao.ProfileDao
import it.wavestream.app.data.database.entity.Profile
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.service.NotificationHelper
import it.wavestream.app.ui.loading.SplashCoveredMs
import it.wavestream.app.ui.loading.SplashDrainMs
import it.wavestream.app.ui.loading.SplashScreen
import it.wavestream.app.ui.setup.SetupActivity
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Profile Selection Activity - App entry point
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class ProfileSelectionActivity : ComponentActivity() {

    /**
     * Esito della fase di avvio.
     *
     * [AutoStart] non naviga da sé: restituisce l'azione da eseguire, e il chiamante
     * la invoca quando la splash ha coperto lo schermo (evita ANR e tagli a metà).
     */
    private sealed interface Startup {
        /** Auto-start sull'ultimo profilo, oppure onboarding obbligatorio. */
        data class AutoStart(val navigate: () -> Unit) : Startup

        /** C'è da mostrare la selezione profili. */
        data class ShowProfiles(val profiles: List<Profile>, val lastId: Long?) : Startup
    }
    
    @Inject lateinit var profileDao: ProfileDao
    @Inject lateinit var userPreferences: UserPreferences
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        android.util.Log.d("WaveStreamDebug", "ProfileSelectionActivity onCreate STARTED")

        setContent {
            WaveStreamTheme {
                // La decisione di avvio (auto-start vs mostra profili) si risolve subito:
                // è solo IO. La NAVIGAZIONE invece attende che l'ondata abbia coperto lo
                // schermo: così non si taglia l'animazione a metà e la window ha
                // certamente il focus (startActivity prima del focus causa un ANR).
                var startup by remember { mutableStateOf<Startup?>(null) }
                var splashVisible by remember { mutableStateOf(true) }
                val entrance = remember { Animatable(0f) }
                val scope = rememberCoroutineScope()

                LaunchedEffect(Unit) {
                    val resolved = withContext(Dispatchers.IO) { resolveStartup() }
                    android.util.Log.d("WaveStreamDebug", "Startup resolved: $resolved")
                    startup = resolved
                    if (resolved is Startup.AutoStart) {
                        delay((SplashCoveredMs + 120).toLong())
                        resolved.navigate()
                    }
                }

                val showProfiles = startup as? Startup.ShowProfiles

                // Box esplicito: garantisce che la splash stia SOPRA la destinazione
                // (l'ordine dei figli è l'ordine di disegno).
                Box(modifier = Modifier.fillMaxSize()) {
                    // La destinazione è composta SOTTO la splash: non c'è dissolvenza tra
                    // le due schermate, è la cresta dell'ondata a rivelarla ritirandosi.
                    if (showProfiles != null) {
                        ProfileSelectionContent(
                            initialProfiles = showProfiles.profiles,
                            initialLastProfileId = showProfiles.lastId,
                            entrance = { entrance.value },
                        )
                    }

                    if (splashVisible) {
                        SplashScreen(
                            ready = showProfiles != null,
                            onRevealStart = {
                                scope.launch {
                                    entrance.animateTo(
                                        targetValue = 1f,
                                        animationSpec = tween(SplashDrainMs, easing = LinearEasing),
                                    )
                                }
                            },
                            onComplete = { splashVisible = false },
                        )
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        android.util.Log.d("WaveStreamDebug", "ProfileSelectionActivity onResume")

        // Se stiamo tornando qui dopo un self-update la notifica ha esaurito il suo
        // scopo (l'app è di nuovo in primo piano) e mostriamo la conferma una tantum.
        NotificationHelper.cancelUpdateInstalledNotification(this)
        showUpdateCompletedNotice()
    }

    /**
     * Conferma "aggiornamento completato" mostrata al primo rientro nell'app dopo
     * un self-update. Il flag è scritto da
     * [it.wavestream.app.update.PackageReplacedReceiver]: serve perché su Android 10+
     * la notifica è l'unico feedback possibile e può facilmente non essere vista.
     */
    private fun showUpdateCompletedNotice() {
        val prefs = getSharedPreferences(
            it.wavestream.app.update.PackageReplacedReceiver.PREFS,
            Context.MODE_PRIVATE
        )
        val version = prefs.getString(
            it.wavestream.app.update.PackageReplacedReceiver.KEY_PENDING_VERSION,
            null
        ) ?: return

        prefs.edit()
            .remove(it.wavestream.app.update.PackageReplacedReceiver.KEY_PENDING_VERSION)
            .apply()
        Toast.makeText(this, getString(R.string.update_completed_toast, version), Toast.LENGTH_LONG).show()
    }
    
    @Composable
    private fun ProfileSelectionContent(
        initialProfiles: List<Profile>,
        initialLastProfileId: Long?,
        entrance: () -> Float = { 1f },
    ) {
        // Profiles are pre-loaded during splash; no extra IO call needed here
        var profiles by remember { mutableStateOf(initialProfiles) }
        var lastUsedProfileId by remember { mutableStateOf(initialLastProfileId) }
        var showAddDialog by remember { mutableStateOf(false) }
        var showEditDialog by remember { mutableStateOf(false) }
        var showDeleteDialog by remember { mutableStateOf(false) }
        var showOptionsDialog by remember { mutableStateOf(false) }
        var selectedProfile by remember { mutableStateOf<Profile?>(null) }
        
        // Main Screen
        ProfileSelectionScreen(
            profiles = profiles,
            onProfileSelected = { profile ->
                selectProfile(profile)
            },
            onProfileLongClick = { profile ->
                selectedProfile = profile
                showOptionsDialog = true
            },
            onAddProfile = {
                showAddDialog = true
            },
            preSelectedProfileId = lastUsedProfileId,  // Pre-focus last used profile
            entrance = entrance
        )
        
        // Dialogs
        AddProfileDialog(
            isVisible = showAddDialog,
            onDismiss = { showAddDialog = false },
            onConfirm = { name, avatarIndex ->
                showAddDialog = false
                createProfile(name, avatarIndex) { profiles = it }
            }
        )
        
        EditProfileDialog(
            isVisible = showEditDialog,
            profile = selectedProfile,
            onDismiss = { 
                showEditDialog = false
                selectedProfile = null
            },
            onConfirm = { updatedProfile ->
                showEditDialog = false
                updateProfile(updatedProfile) { profiles = it }
                selectedProfile = null
            }
        )
        
        DeleteProfileDialog(
            isVisible = showDeleteDialog,
            profile = selectedProfile,
            onDismiss = {
                showDeleteDialog = false
                selectedProfile = null
            },
            onConfirm = { profileToDelete ->
                showDeleteDialog = false
                deleteProfile(profileToDelete) { profiles = it }
                selectedProfile = null
            }
        )
        
        ProfileOptionsDialog(
            isVisible = showOptionsDialog,
            profile = selectedProfile,
            onDismiss = {
                showOptionsDialog = false
                selectedProfile = null
            },
            onEdit = { profile ->
                showOptionsDialog = false
                selectedProfile = profile
                showEditDialog = true
            },
            onDelete = { profile ->
                showOptionsDialog = false
                selectedProfile = profile
                showDeleteDialog = true
            }
        )
    }
    
    /**
     * Risolve la fase di avvio SENZA navigare: la navigazione la esegue il chiamante
     * quando la splash ha coperto lo schermo. Eseguire `startActivity` prima che la
     * window abbia il focus causa un ANR.
     */
    private suspend fun resolveStartup(): Startup {
        var profiles = profileDao.getAllProfiles().first()
        val lastProfileId = userPreferences.getCurrentProfileId()

        if (profiles.isEmpty()) {
            // Create default profile first
            profileDao.insert(
                Profile(name = "Principale", avatarIndex = 0, isDefault = true)
            )
            profiles = profileDao.getAllProfiles().first()
        }

        // Auto-start with last profile if enabled
        val autoStartMode = userPreferences.getAutoStartMode()
        if (autoStartMode == "last" && lastProfileId != null && lastProfileId > 0) {
            val profile = profileDao.getProfileById(lastProfileId)
            if (profile != null) {
                return Startup.AutoStart { goToMain(profile) }
            }
        }

        // If only one profile (default "Principale") and onboarding not done,
        // skip profile selection screen and go directly to onboarding
        if (profiles.size == 1) {
            val welcomeShown = userPreferences.isWelcomeShown()
            val termsAccepted = userPreferences.isTermsAccepted()
            if (!welcomeShown || !termsAccepted) {
                userPreferences.setCurrentProfileId(profiles.first().id)
                return Startup.AutoStart {
                    if (!welcomeShown) goToWelcome() else goToTerms()
                }
            }
        }

        return Startup.ShowProfiles(profiles, lastProfileId)
    }
    
    private fun selectProfile(profile: Profile) {
        // Fire-and-forget save of last used profile to prevent blocking UI
        lifecycleScope.launch(Dispatchers.IO) {
            android.util.Log.d("WaveStreamDebug", "Saving profile ID ${profile.id} in background...")
            userPreferences.setCurrentProfileId(profile.id)
        }

        // Check onboarding state in background, then navigate
        lifecycleScope.launch(Dispatchers.IO) {
            val welcomeShown = userPreferences.isWelcomeShown()
            val termsAccepted = userPreferences.isTermsAccepted()

            withContext(Dispatchers.Main) {
                if (!welcomeShown) {
                    goToWelcome()
                } else if (!termsAccepted) {
                    goToTerms()
                } else {
                    goToMain(profile)
                }
            }
        }
    }

    private fun goToWelcome() {
        val intent = Intent(this, it.wavestream.app.ui.welcome.WelcomeActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
        overridePendingTransition(0, 0)
    }

    private fun goToTerms() {
        val intent = Intent(this, it.wavestream.app.ui.terms.TermsActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
        overridePendingTransition(0, 0)
    }
    
    private fun goToMain(profile: Profile) {
        android.util.Log.d("WaveStreamDebug", "Navigating to LoadingActivity immediately. Setup check delegated.")
        
        // Always go to LoadingActivity first - it handles redirection to Setup if needed
        val intent = Intent(this, it.wavestream.app.ui.loading.LoadingActivity::class.java).apply {
            putExtra("profile_id", profile.id)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        
        startActivity(intent)
        finish()
        // Remove transition animation to feel faster
        overridePendingTransition(0, 0)
    }
    
    private fun createProfile(name: String, avatarIndex: Int, onComplete: (List<Profile>) -> Unit) {
        lifecycleScope.launch(Dispatchers.IO) {
            val profile = Profile(
                name = name,
                avatarIndex = avatarIndex
            )
            profileDao.insert(profile)
            val profiles = profileDao.getAllProfiles().first()
            withContext(Dispatchers.Main) {
                onComplete(profiles)
            }
        }
    }
    
    private fun updateProfile(profile: Profile, onComplete: (List<Profile>) -> Unit) {
        lifecycleScope.launch(Dispatchers.IO) {
            profileDao.update(profile)
            val profiles = profileDao.getAllProfiles().first()
            withContext(Dispatchers.Main) {
                onComplete(profiles)
            }
        }
    }
    
    private fun deleteProfile(profile: Profile, onComplete: (List<Profile>) -> Unit) {
        lifecycleScope.launch(Dispatchers.IO) {
            profileDao.delete(profile)
            val profiles = profileDao.getAllProfiles().first()
            withContext(Dispatchers.Main) {
                onComplete(profiles)
            }
        }
    }
}

