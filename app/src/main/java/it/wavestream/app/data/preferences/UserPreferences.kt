package it.wavestream.app.data.preferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "wavestream_preferences")

// SharedPreferences key per l'accent color (caricamento sincrono all'avvio)
private const val SYNC_PREFS_NAME = "wavestream_sync_prefs"
private const val SYNC_ACCENT_COLOR_KEY = "accent_color"
private const val ENCRYPTED_PREFS_NAME = "wavestream_encrypted_prefs"
private const val ENCRYPTED_TMDB_KEY = "tmdb_api_key"
private const val ENCRYPTED_OMDB_KEY = "omdb_api_key"

/**
 * User preferences manager using DataStore
 */
@Singleton
class UserPreferences @Inject constructor(
    @ApplicationContext private val context: Context
) {
    
    // SharedPreferences sincrone per dati critici all'avvio (accent color)
    private val syncPrefs = context.getSharedPreferences(SYNC_PREFS_NAME, Context.MODE_PRIVATE)

    private val encryptedPrefs by lazy {
        EncryptedSharedPreferences.create(
            context,
            ENCRYPTED_PREFS_NAME,
            MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(),
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }
    
    companion object {
        // TMDB
        private val TMDB_API_KEY = stringPreferencesKey("tmdb_api_key")
        
        // Profile
        private val CURRENT_PROFILE_ID = longPreferencesKey("current_profile_id")
        
        // Theme
        private val THEME_MODE = stringPreferencesKey("theme_mode") // "light", "dark", "system"
        private val ACCENT_COLOR = stringPreferencesKey("accent_color")
        
        // Player
        private val DEFAULT_AUDIO_LANGUAGE = stringPreferencesKey("default_audio_language")
        private val DEFAULT_SUBTITLE_LANGUAGE = stringPreferencesKey("default_subtitle_language")
        private val SUBTITLES_ENABLED = booleanPreferencesKey("subtitles_enabled")
        private val SKIP_INTRO_ENABLED = booleanPreferencesKey("skip_intro_enabled")
        private val AUTO_PLAY_NEXT = booleanPreferencesKey("auto_play_next")
        private val YOUTUBE_PLAYER_PACKAGE = stringPreferencesKey("youtube_player_package")
        
        // Playback
        private val SEEK_FORWARD_SECONDS = intPreferencesKey("seek_forward_seconds")
        private val SEEK_BACKWARD_SECONDS = intPreferencesKey("seek_backward_seconds")
        private val RESUME_THRESHOLD_PERCENT = intPreferencesKey("resume_threshold_percent")
        private val PLAYER_VOLUME_LEVEL = intPreferencesKey("player_volume_level") // 0-100, default 70 (reduces loud streams)
        
        // EPG
        private val EPG_AUTO_UPDATE = booleanPreferencesKey("epg_auto_update")
        private val EPG_UPDATE_INTERVAL_HOURS = intPreferencesKey("epg_update_interval_hours")
        
        // Playlist Sync
        private val PLAYLIST_AUTO_UPDATE = booleanPreferencesKey("playlist_auto_update")
        private val PLAYLIST_UPDATE_INTERVAL_HOURS = intPreferencesKey("playlist_update_interval_hours")
        
        // Downloads
        private val DOWNLOAD_WIFI_ONLY = booleanPreferencesKey("download_wifi_only")
        private val MAX_CONCURRENT_DOWNLOADS = intPreferencesKey("max_concurrent_downloads")
        
        // Profile Auto-Start
        private val AUTO_START_MODE = stringPreferencesKey("auto_start_mode") // "none", "default", "last"
        private val AUTO_START_PROFILE_ID = longPreferencesKey("auto_start_profile_id")
        
        // Setup
        private val SETUP_COMPLETE = booleanPreferencesKey("setup_complete")
        
        // OMDb (IMDB ratings)
        private val OMDB_API_KEY = stringPreferencesKey("omdb_api_key")
        
        // Startup Screen
        private val STARTUP_SCREEN = stringPreferencesKey("startup_screen") // "movies", "series", "live"
        
        // In-app VPN (WireGuard)
        private val VPN_CONFIG = stringPreferencesKey("vpn_wireguard_config")
        private val VPN_CONFIGS = stringSetPreferencesKey("vpn_wireguard_configs_set")
        private val VPN_STRATEGY = stringPreferencesKey("vpn_strategy")
        private val VPN_AUTO_ROTATE = booleanPreferencesKey("vpn_auto_rotate")
        private val VPN_ROTATE_INTERVAL = stringPreferencesKey("vpn_rotate_interval")
        
        // TMDB Cache Update
        private val TMDB_LAST_UPDATE = longPreferencesKey("tmdb_last_update")
        private val TMDB_POPULAR_LAST_UPDATE = longPreferencesKey("tmdb_popular_last_update")

        
        // Live TV Layout Mode ("grid" or "timeline")
        private val LIVE_LAYOUT_MODE = stringPreferencesKey("live_layout_mode")
        
        // EPG Update Settings
        private val EPG_UPDATE_MODE = stringPreferencesKey("epg_update_mode") // "manual" or "automatic"
        private val EPG_UPDATE_INTERVAL = stringPreferencesKey("epg_update_interval") // startup, 3h, 6h, 12h, 24h, 3d, weekly
        private val EPG_LAST_UPDATE = longPreferencesKey("epg_last_update")
        private val EPG_TIMEZONE = stringPreferencesKey("epg_timezone") // auto, UTC, Europe/Rome, etc.
        
        // One-time migrations
        private val TEAM_CHANNEL_CACHE_CLEARED = booleanPreferencesKey("team_channel_cache_cleared_v3")

        // Onboarding
        private val WELCOME_SHOWN = booleanPreferencesKey("welcome_shown")
        private val TERMS_ACCEPTED = booleanPreferencesKey("terms_accepted")
    }
    
    private val dataStore = context.dataStore
    
    // TMDB API Key (cifrata)
    suspend fun setTmdbApiKey(apiKey: String) {
        encryptedPrefs.edit().putString(ENCRYPTED_TMDB_KEY, apiKey).apply()
    }

    suspend fun getTmdbApiKey(): String? {
        return encryptedPrefs.getString(ENCRYPTED_TMDB_KEY, null)
    }

    fun getTmdbApiKeyFlow(): Flow<String?> {
        return kotlinx.coroutines.flow.flowOf(encryptedPrefs.getString(ENCRYPTED_TMDB_KEY, null))
    }
    
    // Current Profile
    suspend fun setCurrentProfileId(profileId: Long) {
        dataStore.edit { it[CURRENT_PROFILE_ID] = profileId }
    }
    
    suspend fun getCurrentProfileId(): Long? {
        val start = System.currentTimeMillis()
        val id = dataStore.data.first()[CURRENT_PROFILE_ID]
        android.util.Log.d("WaveStreamDebug", "getCurrentProfileId took ${System.currentTimeMillis() - start}ms (DataStore)")
        return id
    }
    
    fun getCurrentProfileIdFlow(): Flow<Long?> {
        return dataStore.data.map { it[CURRENT_PROFILE_ID] }
    }
    
    // Theme
    suspend fun setThemeMode(mode: String) {
        dataStore.edit { it[THEME_MODE] = mode }
    }
    
    fun getThemeModeFlow(): Flow<String> {
        return dataStore.data.map { it[THEME_MODE] ?: "dark" }
    }
    
    suspend fun setAccentColor(color: String) {
        // Salva in DataStore (asincrono, per il Flow)
        dataStore.edit { it[ACCENT_COLOR] = color }
        // Salva anche in SharedPreferences (sincrono, per il caricamento immediato all'avvio)
        syncPrefs.edit().putString(SYNC_ACCENT_COLOR_KEY, color).apply()
    }
    
    /**
     * Carica l'accent color in modo SINCRONO da SharedPreferences.
     * Da usare in Application.onCreate() per applicare il colore immediatamente all'avvio.
     */
    fun getAccentColorSync(): String {
        val start = System.currentTimeMillis()
        val color = syncPrefs.getString(SYNC_ACCENT_COLOR_KEY, "violet") ?: "violet"
        android.util.Log.d("WaveStreamDebug", "getAccentColorSync took ${System.currentTimeMillis() - start}ms (SharedPreferences)")
        return color
    }
    
    suspend fun getAccentColor(): String {
        return dataStore.data.first()[ACCENT_COLOR] ?: "violet"
    }
    
    fun getAccentColorFlow(): Flow<String> {
        return dataStore.data.map { it[ACCENT_COLOR] ?: "violet" }
    }
    
    // Audio/Subtitle
    suspend fun setDefaultAudioLanguage(language: String) {
        dataStore.edit { it[DEFAULT_AUDIO_LANGUAGE] = language }
    }
    
    fun getDefaultAudioLanguageFlow(): Flow<String> {
        return dataStore.data.map { it[DEFAULT_AUDIO_LANGUAGE] ?: "ita" }
    }
    
    suspend fun setDefaultSubtitleLanguage(language: String) {
        dataStore.edit { it[DEFAULT_SUBTITLE_LANGUAGE] = language }
    }
    
    fun getDefaultSubtitleLanguageFlow(): Flow<String> {
        return dataStore.data.map { it[DEFAULT_SUBTITLE_LANGUAGE] ?: "it" }
    }
    
    suspend fun setSubtitlesEnabled(enabled: Boolean) {
        dataStore.edit { it[SUBTITLES_ENABLED] = enabled }
    }
    
    fun getSubtitlesEnabledFlow(): Flow<Boolean> {
        return dataStore.data.map { it[SUBTITLES_ENABLED] ?: false }
    }
    

    
    suspend fun setAutoPlayNext(enabled: Boolean) {
        dataStore.edit { it[AUTO_PLAY_NEXT] = enabled }
    }
    
    fun getAutoPlayNextFlow(): Flow<Boolean> {
        return dataStore.data.map { it[AUTO_PLAY_NEXT] ?: true }
    }
    
    suspend fun setYoutubePlayerPackage(packageName: String?) {
        dataStore.edit { preferences ->
            if (packageName != null) {
                preferences[YOUTUBE_PLAYER_PACKAGE] = packageName
            } else {
                preferences.remove(YOUTUBE_PLAYER_PACKAGE)
            }
        }
    }
    
    suspend fun getYoutubePlayerPackage(): String? {
        return dataStore.data.first()[YOUTUBE_PLAYER_PACKAGE]
    }
    
    fun getYoutubePlayerPackageFlow(): Flow<String?> {
        return dataStore.data.map { it[YOUTUBE_PLAYER_PACKAGE] }
    }
    
    suspend fun setResumeThresholdPercent(percent: Int) {
        dataStore.edit { it[RESUME_THRESHOLD_PERCENT] = percent }
    }
    
    fun getResumeThresholdPercentFlow(): Flow<Int> {
        return dataStore.data.map { it[RESUME_THRESHOLD_PERCENT] ?: 5 } // 5% from start
    }
    
    // Seek amounts (in seconds)
    suspend fun setSeekForwardSeconds(seconds: Int) {
        dataStore.edit { it[SEEK_FORWARD_SECONDS] = seconds.coerceIn(5, 60) }
    }
    
    suspend fun getSeekForwardSeconds(): Int {
        return dataStore.data.first()[SEEK_FORWARD_SECONDS] ?: 10 // Default 10s
    }
    
    fun getSeekForwardSecondsFlow(): Flow<Int> {
        return dataStore.data.map { it[SEEK_FORWARD_SECONDS] ?: 10 }
    }
    
    suspend fun setSeekBackwardSeconds(seconds: Int) {
        dataStore.edit { it[SEEK_BACKWARD_SECONDS] = seconds.coerceIn(5, 60) }
    }
    
    suspend fun getSeekBackwardSeconds(): Int {
        return dataStore.data.first()[SEEK_BACKWARD_SECONDS] ?: 10 // Default 10s
    }
    
    fun getSeekBackwardSecondsFlow(): Flow<Int> {
        return dataStore.data.map { it[SEEK_BACKWARD_SECONDS] ?: 10 }
    }
    
    // Player Volume Level (0-100, default 70 = 70% to reduce loud streams)
    suspend fun setPlayerVolumeLevel(level: Int) {
        dataStore.edit { it[PLAYER_VOLUME_LEVEL] = level.coerceIn(0, 100) }
    }
    
    suspend fun getPlayerVolumeLevel(): Int {
        return dataStore.data.first()[PLAYER_VOLUME_LEVEL] ?: 70 // Default 70%
    }
    
    fun getPlayerVolumeLevelFlow(): Flow<Int> {
        return dataStore.data.map { it[PLAYER_VOLUME_LEVEL] ?: 70 }
    }
    
    // EPG settings
    suspend fun setEpgAutoUpdate(enabled: Boolean) {
        dataStore.edit { it[EPG_AUTO_UPDATE] = enabled }
    }
    
    fun getEpgAutoUpdateFlow(): Flow<Boolean> {
        return dataStore.data.map { it[EPG_AUTO_UPDATE] ?: true }
    }
    
    suspend fun setEpgUpdateIntervalHours(hours: Int) {
        dataStore.edit { it[EPG_UPDATE_INTERVAL_HOURS] = hours }
    }
    
    fun getEpgUpdateIntervalHoursFlow(): Flow<Int> {
        return dataStore.data.map { it[EPG_UPDATE_INTERVAL_HOURS] ?: 12 }
    }
    
    // Download settings
    suspend fun setDownloadWifiOnly(wifiOnly: Boolean) {
        dataStore.edit { it[DOWNLOAD_WIFI_ONLY] = wifiOnly }
    }
    
    fun getDownloadWifiOnlyFlow(): Flow<Boolean> {
        return dataStore.data.map { it[DOWNLOAD_WIFI_ONLY] ?: true }
    }
    
    suspend fun setMaxConcurrentDownloads(max: Int) {
        dataStore.edit { it[MAX_CONCURRENT_DOWNLOADS] = max }
    }
    
    fun getMaxConcurrentDownloadsFlow(): Flow<Int> {
        return dataStore.data.map { it[MAX_CONCURRENT_DOWNLOADS] ?: 2 }
    }
    
    // Playlist sync settings
    suspend fun setPlaylistAutoUpdate(enabled: Boolean) {
        dataStore.edit { it[PLAYLIST_AUTO_UPDATE] = enabled }
    }
    
    fun getPlaylistAutoUpdateFlow(): Flow<Boolean> {
        return dataStore.data.map { it[PLAYLIST_AUTO_UPDATE] ?: true }
    }
    
    suspend fun getPlaylistAutoUpdate(): Boolean {
        return dataStore.data.first()[PLAYLIST_AUTO_UPDATE] ?: true
    }
    
    suspend fun setPlaylistUpdateIntervalHours(hours: Int) {
        dataStore.edit { it[PLAYLIST_UPDATE_INTERVAL_HOURS] = hours }
    }
    
    fun getPlaylistUpdateIntervalHoursFlow(): Flow<Int> {
        return dataStore.data.map { it[PLAYLIST_UPDATE_INTERVAL_HOURS] ?: 24 }  // Default: 24 hours
    }
    
    suspend fun getPlaylistUpdateIntervalHours(): Int {
        return dataStore.data.first()[PLAYLIST_UPDATE_INTERVAL_HOURS] ?: 24  // Default: 24 hours
    }
    
    suspend fun getEpgUpdateIntervalHours(): Int {
        return dataStore.data.first()[EPG_UPDATE_INTERVAL_HOURS] ?: 12
    }
    
    // Auto-start profile settings
    suspend fun setAutoStartMode(mode: String) {
        dataStore.edit { it[AUTO_START_MODE] = mode }
    }
    
    suspend fun getAutoStartMode(): String {
        return dataStore.data.first()[AUTO_START_MODE] ?: "none"
    }
    
    fun getAutoStartModeFlow(): Flow<String> {
        return dataStore.data.map { it[AUTO_START_MODE] ?: "none" }
    }
    
    suspend fun setAutoStartProfileId(profileId: Long) {
        dataStore.edit { it[AUTO_START_PROFILE_ID] = profileId }
    }
    
    suspend fun getAutoStartProfileId(): Long? {
        return dataStore.data.first()[AUTO_START_PROFILE_ID]
    }
    
    // Setup
    suspend fun setSetupComplete(complete: Boolean) {
        dataStore.edit { it[SETUP_COMPLETE] = complete }
    }
    
    suspend fun isSetupComplete(): Boolean {
        return dataStore.data.first()[SETUP_COMPLETE] ?: false
    }
    
    // OMDb API Key (for IMDB ratings) (cifrata)
    suspend fun setOmdbApiKey(apiKey: String) {
        encryptedPrefs.edit().putString(ENCRYPTED_OMDB_KEY, apiKey).apply()
    }

    suspend fun getOmdbApiKey(): String? {
        return encryptedPrefs.getString(ENCRYPTED_OMDB_KEY, null)
    }
    
    // Clear all preferences
    suspend fun clearAll() {
        dataStore.edit { it.clear() }
    }
    
    // Additional getters for BackupRepository
    suspend fun getAutoPlayNext(): Boolean {
        return dataStore.data.first()[AUTO_PLAY_NEXT] ?: true
    }
    
    suspend fun getSubtitleLanguage(): String {
        return dataStore.data.first()[DEFAULT_SUBTITLE_LANGUAGE] ?: "it"
    }
    
    suspend fun setSubtitleLanguage(language: String) {
        dataStore.edit { it[DEFAULT_SUBTITLE_LANGUAGE] = language }
    }
    
    // Startup Screen
    suspend fun setStartupScreen(screen: String) {
        dataStore.edit { it[STARTUP_SCREEN] = screen }
    }
    
    suspend fun getStartupScreen(): String {
        return dataStore.data.first()[STARTUP_SCREEN] ?: "movies"
    }
    
    fun getStartupScreenFlow(): Flow<String> {
        return dataStore.data.map { it[STARTUP_SCREEN] ?: "movies" }
    }
    
    // TMDB Cache
    suspend fun setTmdbLastUpdate(timestamp: Long) {
        dataStore.edit { it[TMDB_LAST_UPDATE] = timestamp }
    }
    
    suspend fun getTmdbLastUpdate(): Long {
        return dataStore.data.first()[TMDB_LAST_UPDATE] ?: 0L
    }
    
    suspend fun setTmdbPopularLastUpdate(timestamp: Long) {
        dataStore.edit { it[TMDB_POPULAR_LAST_UPDATE] = timestamp }
    }

    suspend fun getTmdbPopularLastUpdate(): Long {
        return dataStore.data.first()[TMDB_POPULAR_LAST_UPDATE] ?: 0L
    }
    

    
    // Skip Intro
    suspend fun setSkipIntroEnabled(enabled: Boolean) {
        dataStore.edit { it[SKIP_INTRO_ENABLED] = enabled }
    }
    
    suspend fun getSkipIntroEnabled(): Boolean {
        return dataStore.data.first()[SKIP_INTRO_ENABLED] ?: false
    }
    
    fun getSkipIntroEnabledFlow(): Flow<Boolean> {
        return dataStore.data.map { it[SKIP_INTRO_ENABLED] ?: false }
    }
    
    // Live Layout Mode (Grid or Timeline)
    suspend fun setLiveLayoutMode(mode: String) {
        dataStore.edit { it[LIVE_LAYOUT_MODE] = mode }
    }
    
    suspend fun getLiveLayoutMode(): String {
        return dataStore.data.first()[LIVE_LAYOUT_MODE] ?: "grid"
    }
    
    fun getLiveLayoutModeFlow(): Flow<String> {
        return dataStore.data.map { it[LIVE_LAYOUT_MODE] ?: "grid" }
    }
    
    // EPG Update Mode (manual or automatic)
    suspend fun setEpgUpdateMode(mode: String) {
        dataStore.edit { it[EPG_UPDATE_MODE] = mode }
    }
    
    suspend fun getEpgUpdateMode(): String {
        return dataStore.data.first()[EPG_UPDATE_MODE] ?: "manual"
    }
    
    // EPG Update Interval (startup, 3h, 6h, 12h, 24h, 3d, weekly)
    suspend fun setEpgUpdateInterval(interval: String) {
        // Save the string value
        dataStore.edit { it[EPG_UPDATE_INTERVAL] = interval }
        
        // Also save as hours for SyncWorker compatibility
        val hours = when (interval) {
            "startup" -> 0
            "3h" -> 3
            "6h" -> 6
            "12h" -> 12
            "24h" -> 24
            "3d" -> 72
            "weekly" -> 168
            else -> 24  // Default to 24 hours
        }
        dataStore.edit { it[EPG_UPDATE_INTERVAL_HOURS] = hours }
    }
    
    suspend fun getEpgUpdateInterval(): String {
        return dataStore.data.first()[EPG_UPDATE_INTERVAL] ?: "startup"
    }
    
    // EPG Last Update timestamp
    suspend fun setEpgLastUpdate(timestamp: Long) {
        dataStore.edit { it[EPG_LAST_UPDATE] = timestamp }
    }
    
    suspend fun getEpgLastUpdate(): Long {
        return dataStore.data.first()[EPG_LAST_UPDATE] ?: 0L
    }
    
    fun getEpgLastUpdateFlow(): Flow<Long> {
        return dataStore.data.map { it[EPG_LAST_UPDATE] ?: 0L }
    }
    
    // EPG Timezone
    suspend fun setEpgTimezone(timezone: String) {
        dataStore.edit { it[EPG_TIMEZONE] = timezone }
    }
    
    suspend fun getEpgTimezone(): String {
        return dataStore.data.first()[EPG_TIMEZONE] ?: "auto"
    }
    
    // Playlist Update Mode (manual or auto)
    suspend fun setPlaylistUpdateMode(mode: String) {
        dataStore.edit { 
            it[PLAYLIST_AUTO_UPDATE] = (mode == "auto")
        }
    }
    
    suspend fun getPlaylistUpdateMode(): String {
        val auto = dataStore.data.first()[PLAYLIST_AUTO_UPDATE] ?: false
        return if (auto) "auto" else "manual"
    }
    
    // Playlist Update Interval (startup, 6h, 12h, 24h, 3d, weekly)
    suspend fun setPlaylistUpdateInterval(interval: String) {
        val hours = when (interval) {
            "startup" -> 0
            "6h" -> 6
            "12h" -> 12
            "24h" -> 24
            "3d" -> 72
            "weekly" -> 168
            else -> 24
        }
        dataStore.edit { it[PLAYLIST_UPDATE_INTERVAL_HOURS] = hours }
    }
    
    suspend fun getPlaylistUpdateInterval(): String {
        val hours = dataStore.data.first()[PLAYLIST_UPDATE_INTERVAL_HOURS] ?: 24
        return when (hours) {
            0 -> "startup"
            6 -> "6h"
            12 -> "12h"
            24 -> "24h"
            72 -> "3d"
            168 -> "weekly"
            else -> "24h"
        }
    }

    // Onboarding flags
    suspend fun setWelcomeShown(shown: Boolean) {
        dataStore.edit { it[WELCOME_SHOWN] = shown }
    }

    suspend fun isWelcomeShown(): Boolean {
        return dataStore.data.first()[WELCOME_SHOWN] ?: false
    }

    suspend fun setTermsAccepted(accepted: Boolean) {
        dataStore.edit { it[TERMS_ACCEPTED] = accepted }
    }

    suspend fun isTermsAccepted(): Boolean {
        return dataStore.data.first()[TERMS_ACCEPTED] ?: false
    }

    // In-app VPN (WireGuard)
    suspend fun setVpnConfig(config: String) {
        dataStore.edit { it[VPN_CONFIG] = config }
    }

    suspend fun getVpnConfig(): String {
        return dataStore.data.first()[VPN_CONFIG] ?: ""
    }

    /** Aggiunge una config al pool (ogni config = un server). */
    suspend fun addVpnConfig(config: String) {
        dataStore.edit {
            val current = it[VPN_CONFIGS] ?: emptySet()
            it[VPN_CONFIGS] = current + config
        }
    }

    /** Rimuove una config dal pool. */
    suspend fun removeVpnConfig(config: String) {
        dataStore.edit {
            val current = it[VPN_CONFIGS] ?: emptySet()
            it[VPN_CONFIGS] = current - config
        }
    }

    /** Pool di config; migra una sola volta dalla vecchia singola config. */
    suspend fun getVpnConfigs(): List<String> {
        val set = dataStore.data.first()[VPN_CONFIGS]
        if (!set.isNullOrEmpty()) return set.toList()
        val legacy = dataStore.data.first()[VPN_CONFIG]
        if (legacy.isNullOrBlank()) return emptyList()
        // migrazione una tantum: la legacy finisce nel pool così, se poi il pool
        // viene svuotato dalle eliminazioni, non ricompare più.
        dataStore.edit { it[VPN_CONFIGS] = setOf(legacy) }
        return listOf(legacy)
    }

    suspend fun setVpnStrategy(strategy: String) {
        dataStore.edit { it[VPN_STRATEGY] = strategy }
    }

    suspend fun getVpnStrategy(): String {
        return dataStore.data.first()[VPN_STRATEGY] ?: "random"
    }

    suspend fun setVpnAutoRotate(enabled: Boolean) {
        dataStore.edit { it[VPN_AUTO_ROTATE] = enabled }
    }

    suspend fun getVpnAutoRotate(): Boolean {
        return dataStore.data.first()[VPN_AUTO_ROTATE] ?: false
    }

    suspend fun setVpnRotateInterval(minutes: String) {
        dataStore.edit { it[VPN_ROTATE_INTERVAL] = minutes }
    }

    suspend fun getVpnRotateInterval(): String {
        return dataStore.data.first()[VPN_ROTATE_INTERVAL] ?: "60"
    }
    
} // end of UserPreferences

