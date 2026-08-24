package it.wavestream.app.ui.profile

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import it.wavestream.app.R
import it.wavestream.app.data.database.entity.Profile
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme

/**
 * Profile Selection Screen - Netflix/Prime Video style
 * Shows profiles in a horizontal carousel with glow effects
 */
@Composable
fun ProfileSelectionScreen(
    profiles: List<Profile>,
    onProfileSelected: (Profile) -> Unit,
    onProfileLongClick: (Profile) -> Unit,
    onAddProfile: () -> Unit,
    preSelectedProfileId: Long? = null,
    modifier: Modifier = Modifier
) {
    var focusedProfile by remember { mutableStateOf<Profile?>(null) }
    
    // Focus requester for pre-selected profile
    val focusRequesters = remember(profiles) { 
        profiles.associate { it.id to FocusRequester() }
    }
    
    // Auto-focus pre-selected profile
    LaunchedEffect(profiles, preSelectedProfileId) {
        if (profiles.isNotEmpty()) {
            val targetId = preSelectedProfileId ?: profiles.first().id
            focusRequesters[targetId]?.requestFocus()
        }
    }
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(WaveStreamColors.BackgroundDark)
    ) {
        // Background (static subtle glow)
        ProfileSelectionBackground()
        
        // Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 48.dp, vertical = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo
            AppLogo()
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Title
            Text(
                text = stringResource(R.string.who_is_watching),
                style = MaterialTheme.typography.headlineLarge,
                color = WaveStreamColors.TextPrimary
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // Subtitle
            Text(
                text = "Seleziona il tuo profilo",
                style = MaterialTheme.typography.bodyLarge,
                color = WaveStreamColors.TextTertiary
            )
            
            Spacer(modifier = Modifier.height(40.dp))
            
            // Profiles Row
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterHorizontally),
                contentPadding = PaddingValues(horizontal = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                items(profiles, key = { it.id }) { profile ->
                    ProfileCard(
                        profile = profile,
                        onClick = { onProfileSelected(profile) },
                        onLongClick = { onProfileLongClick(profile) },
                        onFocus = { focusedProfile = profile },
                        focusRequester = focusRequesters[profile.id]
                    )
                }
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Add Profile Button
            AddProfileButton(onClick = onAddProfile)
            
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

/**
 * Background with subtle glow matching Loading/Splash screen
 */
@Composable
private fun ProfileSelectionBackground() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Background glow effect - matching SplashScreen
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
    }
}

@Composable
private fun AppLogo() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(20.dp))
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

@Composable
fun ProfileCard(
    profile: Profile,
    onClick: () -> Unit,
    onLongClick: () -> Unit,
    onFocus: () -> Unit,
    focusRequester: FocusRequester? = null,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    // Notify parent of focus
    LaunchedEffect(isFocused) {
        if (isFocused) {
            onFocus()
        }
    }
    
    // Animate scale on focus
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.15f else 1f,
        label = "profileCardScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "borderColor"
    )
    
    // Glow inside the card (subtle)
    val cardGlowAlpha by animateFloatAsState(
        targetValue = if (isFocused) 0.15f else 0f,
        label = "cardGlow"
    )

    val columnModifier = modifier
        .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
        .let { mod -> 
            if (focusRequester != null) mod.focusRequester(focusRequester) else mod 
        }
        .focusable(interactionSource = interactionSource)
        .clickable(
            interactionSource = interactionSource,
            indication = null,
            onClick = onClick
        )
        .padding(12.dp)
    
    Column(
        modifier = columnModifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(16.dp))
                .border(3.dp, borderColor, RoundedCornerShape(16.dp))
                .background(WaveStreamColors.CardBackground)
        ) {
            // Inner glow behind avatar
            if (isFocused) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.radialGradient(
                                colors = listOf(
                                    WaveStreamColors.Accent.copy(alpha = cardGlowAlpha.coerceIn(0f, 1f)),
                                    Color.Transparent
                                )
                            )
                        )
                )
            }
            
            Icon(
                imageVector = getAvatarIcon(profile.avatarIndex),
                contentDescription = profile.name,
                modifier = Modifier.fillMaxSize().padding(16.dp),
                tint = Color.Unspecified
            )
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Text(
            text = profile.name,
            style = MaterialTheme.typography.titleMedium,
            color = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .widthIn(max = 140.dp)
                .padding(bottom = 8.dp)
        )
    }
}

/**
 * Circular add profile button
 */
@Composable
private fun AddProfileButton(
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.1f else 1f,
        label = "addButtonScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
        label = "addButtonBorder"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(64.dp)
            .clip(CircleShape)
            .border(1.dp, borderColor, CircleShape)
            .background(WaveStreamColors.BackgroundSecondary)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = stringResource(R.string.add_profile),
            tint = if (isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            modifier = Modifier.size(32.dp)
        )
    }
}

/**
 * Get avatar drawable resource based on index (legacy, for indices 0-1 only)
 */
fun getAvatarResource(index: Int): Int {
    return R.drawable.avatar_male  // Fallback, rarely used now
}

/**
 * Get avatar Material Icon based on index (0-11)
 * Maps directly to SetupActivity's avatarIcons list
 */
fun getAvatarIcon(index: Int): androidx.compose.ui.graphics.vector.ImageVector {
    val icons = listOf(
        Icons.Default.Person,
        Icons.Default.Star,
        Icons.Default.Favorite,
        Icons.Default.QueueMusic,
        Icons.Default.Palette,
        Icons.Default.Image,
        Icons.Default.PhoneAndroid,
        Icons.Default.Tv,
        Icons.Default.Bolt,
        Icons.Default.Shield,
        Icons.Default.AutoFixHigh,
        Icons.Default.Flight
    )
    return icons.getOrElse(index) { icons[0] }
}

// ============ Dialogs ============

/**
 * Add Profile Dialog with avatar selection
 */
@Composable
fun AddProfileDialog(
    isVisible: Boolean,
    onDismiss: () -> Unit,
    onConfirm: (name: String, avatarIndex: Int) -> Unit
) {
    if (!isVisible) return
    
    var profileName by remember { mutableStateOf("") }
    var selectedAvatarIndex by remember { mutableIntStateOf(0) }
    val confirmFocusRequester = remember { FocusRequester() }
    
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = WaveStreamColors.BackgroundElevated,
        titleContentColor = WaveStreamColors.TextPrimary,
        textContentColor = WaveStreamColors.TextSecondary,
        title = {
            Text(stringResource(R.string.add_profile))
        },
        text = {
            Column {
                // Avatar selection
                Text(
                    text = "Scegli avatar",
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                // Avatar grid (4 columns, 3 rows = 12 icons)
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    for (row in 0 until 3) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            for (col in 0 until 4) {
                                val index = row * 4 + col
                                AvatarIconOption(
                                    avatarIndex = index,
                                    isSelected = selectedAvatarIndex == index,
                                    onClick = { selectedAvatarIndex = index },
                                    modifier = Modifier.weight(1f)
                                )
                            }
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(20.dp))
                
                // Name input
                OutlinedTextField(
                    value = profileName,
                    onValueChange = { profileName = it },
                    label = { Text(stringResource(R.string.profile_name_hint)) },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = { confirmFocusRequester.requestFocus() }
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = WaveStreamColors.Accent,
                        unfocusedBorderColor = WaveStreamColors.TextTertiary,
                        cursorColor = WaveStreamColors.Accent,
                        focusedLabelColor = WaveStreamColors.Accent,
                        unfocusedLabelColor = WaveStreamColors.TextSecondary,
                        focusedTextColor = WaveStreamColors.TextPrimary,
                        unfocusedTextColor = WaveStreamColors.TextPrimary
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    if (profileName.isNotBlank()) {
                        onConfirm(profileName.trim(), selectedAvatarIndex)
                        profileName = ""
                    }
                },
                modifier = Modifier.focusRequester(confirmFocusRequester),
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.Accent
                )
            ) {
                Text(stringResource(R.string.create))
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.TextSecondary
                )
            ) {
                Text(stringResource(R.string.cancel))
            }
        }
    )
}

/**
 * Avatar selection option
 */
@Composable
private fun AvatarOption(
    avatarRes: Int,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isSelected || isFocused) 1.15f else 1f,
        label = "avatarScale"
    )
    
    val borderColor by animateColorAsState(
        targetValue = when {
            isSelected -> WaveStreamColors.Accent
            isFocused -> WaveStreamColors.Accent
            else -> Color.Transparent
        },
        label = "avatarBorder"
    )
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .size(80.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(3.dp, borderColor, RoundedCornerShape(16.dp))
            .background(WaveStreamColors.CardBackground)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
    ) {
        Image(
            painter = painterResource(avatarRes),
            contentDescription = if (avatarRes == R.drawable.avatar_male) "Maschio" else "Femmina",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun AvatarIconOption(
    avatarIndex: Int,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val scale by animateFloatAsState(
        targetValue = if (isSelected || isFocused) 1.1f else 1f,
        label = "avatarIconScale"
    )
    
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(CircleShape)
            .background(
                if (isSelected) WaveStreamColors.Accent else WaveStreamColors.BackgroundTertiary
            )
            .border(
                if (isSelected) 3.dp else 2.dp,
                if (isSelected) Color.White else Color.Transparent,
                CircleShape
            )
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = getAvatarIcon(avatarIndex),
            contentDescription = "Avatar ${avatarIndex + 1}",
            tint = if (isSelected) Color.White else WaveStreamColors.TextSecondary,
            modifier = Modifier.size(28.dp)
        )
    }
}

/**
 * Edit Profile Dialog with avatar selection
 */
@Composable
fun EditProfileDialog(
    isVisible: Boolean,
    profile: Profile?,
    onDismiss: () -> Unit,
    onConfirm: (Profile) -> Unit
) {
    if (!isVisible || profile == null) return
    
    var profileName by remember(profile) { mutableStateOf(profile.name) }
    var selectedAvatarIndex by remember(profile) { mutableIntStateOf(profile.avatarIndex) }
    val editConfirmFocusRequester = remember { FocusRequester() }
    
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = WaveStreamColors.BackgroundElevated,
        titleContentColor = WaveStreamColors.TextPrimary,
        textContentColor = WaveStreamColors.TextSecondary,
        title = {
            Text(stringResource(R.string.edit_profile))
        },
        text = {
            Column {
                // Avatar selection
                Text(
                    text = "Scegli avatar",
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                // Avatar grid (4 columns, 3 rows = 12 icons)
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    for (row in 0 until 3) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            for (col in 0 until 4) {
                                val index = row * 4 + col
                                AvatarIconOption(
                                    avatarIndex = index,
                                    isSelected = selectedAvatarIndex == index,
                                    onClick = { selectedAvatarIndex = index },
                                    modifier = Modifier.weight(1f)
                                )
                            }
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(20.dp))
                
                // Name input
                OutlinedTextField(
                    value = profileName,
                    onValueChange = { profileName = it },
                    label = { Text(stringResource(R.string.profile_name_hint)) },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = { editConfirmFocusRequester.requestFocus() }
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = WaveStreamColors.Accent,
                        unfocusedBorderColor = WaveStreamColors.TextTertiary,
                        cursorColor = WaveStreamColors.Accent,
                        focusedLabelColor = WaveStreamColors.Accent,
                        unfocusedLabelColor = WaveStreamColors.TextSecondary,
                        focusedTextColor = WaveStreamColors.TextPrimary,
                        unfocusedTextColor = WaveStreamColors.TextPrimary
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    if (profileName.isNotBlank()) {
                        onConfirm(profile.copy(
                            name = profileName.trim(),
                            avatarIndex = selectedAvatarIndex
                        ))
                    }
                },
                modifier = Modifier.focusRequester(editConfirmFocusRequester),
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.Accent
                )
            ) {
                Text(stringResource(R.string.save))
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.TextSecondary
                )
            ) {
                Text(stringResource(R.string.cancel))
            }
        }
    )
}

/**
 * Delete Profile Confirmation Dialog
 */
@Composable
fun DeleteProfileDialog(
    isVisible: Boolean,
    profile: Profile?,
    onDismiss: () -> Unit,
    onConfirm: (Profile) -> Unit
) {
    if (!isVisible || profile == null) return
    
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = WaveStreamColors.BackgroundElevated,
        titleContentColor = WaveStreamColors.TextPrimary,
        textContentColor = WaveStreamColors.TextSecondary,
        title = {
            Text(stringResource(R.string.delete_profile))
        },
        text = {
            Text(
                text = "Sei sicuro di voler eliminare il profilo \"${profile.name}\"?",
                color = WaveStreamColors.TextSecondary
            )
        },
        confirmButton = {
            TextButton(
                onClick = { onConfirm(profile) },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.Error
                )
            ) {
                Text(stringResource(R.string.delete))
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.TextSecondary
                )
            ) {
                Text(stringResource(R.string.cancel))
            }
        }
    )
}

/**
 * Profile Options Bottom Sheet / Dialog
 */
@Composable
fun ProfileOptionsDialog(
    isVisible: Boolean,
    profile: Profile?,
    onDismiss: () -> Unit,
    onEdit: (Profile) -> Unit,
    onDelete: (Profile) -> Unit
) {
    if (!isVisible || profile == null) return
    
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = WaveStreamColors.BackgroundElevated,
        titleContentColor = WaveStreamColors.TextPrimary,
        title = {
            Text(profile.name)
        },
        text = {
            Column {
                // Edit option
                TextButton(
                    onClick = { onEdit(profile) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = WaveStreamColors.TextPrimary
                    )
                ) {
                    Text(
                        text = stringResource(R.string.edit),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                
                // Delete option (only if not default)
                if (!profile.isDefault) {
                    TextButton(
                        onClick = { onDelete(profile) },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = WaveStreamColors.Error
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.delete),
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = WaveStreamColors.TextSecondary
                )
            ) {
                Text(stringResource(R.string.cancel))
            }
        }
    )
}

// ============ Preview ============

@Preview(
    showBackground = true,
    widthDp = 1280,
    heightDp = 720,
    uiMode = Configuration.UI_MODE_TYPE_TELEVISION
)
@Composable
private fun ProfileSelectionScreenPreview() {
    val sampleProfiles = listOf(
        Profile(id = 1, name = "Principale", avatarIndex = 0, isDefault = true),  // Male
        Profile(id = 2, name = "Gianmarco", avatarIndex = 0),  // Male
        Profile(id = 3, name = "Ospite", avatarIndex = 1)  // Female
    )
    
    WaveStreamTheme {
        ProfileSelectionScreen(
            profiles = sampleProfiles,
            onProfileSelected = {},
            onProfileLongClick = {},
            onAddProfile = {}
        )
    }
}


