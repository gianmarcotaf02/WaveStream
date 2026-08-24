package it.wavestream.app.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.dao.ProfileDao
import it.wavestream.app.data.database.entity.Profile
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.ui.loading.SplashScreen
import it.wavestream.app.ui.setup.SetupActivity
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Profile Selection Activity - App entry point
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class ProfileSelectionActivity : ComponentActivity() {
    
    @Inject lateinit var profileDao: ProfileDao
    @Inject lateinit var userPreferences: UserPreferences
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        android.util.Log.d("WaveStreamDebug", "ProfileSelectionActivity onCreate STARTED")

        setContent {
            WaveStreamTheme {
                var showSplash by remember { mutableStateOf(true) }
                // Profiles are loaded once during splash; passed directly to avoid a second IO call
                var loadedProfiles by remember { mutableStateOf<List<Profile>>(emptyList()) }
                var loadedLastProfileId by remember { mutableStateOf<Long?>(null) }

                if (showSplash) {
                    SplashScreen(
                        onComplete = {
                            android.util.Log.d("WaveStreamDebug", "Splash complete - checking auto-start")
                            // Navigation happens here, AFTER the window is already visible & focused.
                            // Calling startActivity before the window has focus causes an ANR.
                            checkAutoStartAndLoadProfiles { profiles, lastId ->
                                android.util.Log.d("WaveStreamDebug", "No auto-start, profiles=${profiles.size}")
                                loadedProfiles = profiles
                                loadedLastProfileId = lastId
                                showSplash = false
                            }
                        }
                    )
                } else {
                    ProfileSelectionContent(
                        initialProfiles = loadedProfiles,
                        initialLastProfileId = loadedLastProfileId
                    )
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        android.util.Log.d("WaveStreamDebug", "ProfileSelectionActivity onResume")
    }
    
    @Composable
    private fun ProfileSelectionContent(
        initialProfiles: List<Profile>,
        initialLastProfileId: Long?
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
            preSelectedProfileId = lastUsedProfileId  // Pre-focus last used profile
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
    
    private fun checkAutoStartAndLoadProfiles(onProfilesLoaded: (List<Profile>, Long?) -> Unit) {
        lifecycleScope.launch(Dispatchers.IO) {
            var profiles = profileDao.getAllProfiles().first()
            
            // Fetch last used profile ID on IO
            val lastProfileId = userPreferences.getCurrentProfileId()
            
            if (profiles.isEmpty()) {
                // Create default profile first
                val defaultProfile = Profile(
                    name = "Principale",
                    avatarIndex = 0,
                    isDefault = true
                )
                profileDao.insert(defaultProfile)
                profiles = profileDao.getAllProfiles().first()
            }
            
            // Auto-start with last profile if enabled
            val autoStartMode = userPreferences.getAutoStartMode()
            if (autoStartMode == "last") {
                if (lastProfileId != null && lastProfileId > 0) {
                    val profile = profileDao.getProfileById(lastProfileId)
                    if (profile != null) {
                        withContext(Dispatchers.Main) {
                            goToMain(profile)
                        }
                        return@launch
                    }
                }
            }
            
            // If only one profile (default "Principale") and onboarding not done,
            // skip profile selection screen and go directly to onboarding
            if (profiles.size == 1) {
                val welcomeShown = userPreferences.isWelcomeShown()
                val termsAccepted = userPreferences.isTermsAccepted()
                
                if (!welcomeShown || !termsAccepted) {
                    // Save as last used before navigating
                    userPreferences.setCurrentProfileId(profiles.first().id)
                    withContext(Dispatchers.Main) {
                        if (!welcomeShown) {
                            goToWelcome()
                        } else {
                            goToTerms()
                        }
                    }
                    return@launch
                }
            }
            
            // Show profile selection
            withContext(Dispatchers.Main) {
                onProfilesLoaded(profiles, lastProfileId)
            }
        }
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

