package it.wavestream.app.player

import android.content.Context
import android.net.Uri
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.exoplayer.ExoPlayer
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.data.repository.OpenSubtitlesRepository
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manages subtitles for the player
 * Handles local and OpenSubtitles remote subtitles
 */
@Singleton
class SubtitleManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val openSubtitlesRepo: OpenSubtitlesRepository
) {
    
    data class SubtitleTrack(
        val id: String,
        val name: String,
        val language: String,
        val filePath: String?,
        val isLocal: Boolean,
        val isRemote: Boolean = false,
        val remoteFileId: Int? = null
    )
    
    private var currentSubtitles = mutableListOf<SubtitleTrack>()
    private var activeSubtitlePath: String? = null
    
    /**
     * Get available local subtitles for content
     */
    fun getLocalSubtitles(contentTitle: String, streamUrl: String?): List<SubtitleTrack> {
        val subtitles = mutableListOf<SubtitleTrack>()
        
        // Check cache for previously downloaded
        openSubtitlesRepo.getCachedSubtitle(contentTitle)?.let { file ->
            subtitles.add(
                SubtitleTrack(
                    id = "cached_${file.name}",
                    name = "Scaricato: ${file.nameWithoutExtension}",
                    language = detectLanguage(file.name),
                    filePath = file.absolutePath,
                    isLocal = true
                )
            )
        }
        
        // Check for sidecar subtitles (same name as video)
        streamUrl?.let { url ->
            @Suppress("UNUSED_VARIABLE") // Kept for future sidecar subtitle implementation
            val videoName = Uri.parse(url).lastPathSegment?.substringBeforeLast(".") ?: return@let
            listOf(".srt", ".vtt", ".ass", ".ssa").forEach { ext ->
                @Suppress("UNUSED_VARIABLE") // Placeholder for sidecar file check
                val sidecarPath = url.substringBeforeLast(".") + ext
                // This would need actual file check for local files
            }
        }
        
        currentSubtitles.clear()
        currentSubtitles.addAll(subtitles)
        
        return subtitles
    }
    
    /**
     * Search OpenSubtitles for remote subtitles
     */
    suspend fun searchRemoteSubtitles(
        query: String,
        tmdbId: Int? = null,
        imdbId: String? = null,
        type: String? = null,
        season: Int? = null,
        episode: Int? = null,
        languages: String = "it,en"
    ): RemoteSearchResult {
        if (!openSubtitlesRepo.isAuthenticated()) {
            return RemoteSearchResult.Error("Login OpenSubtitles richiesto")
        }
        
        val result = openSubtitlesRepo.searchSubtitles(
            query = query,
            tmdbId = tmdbId,
            imdbId = imdbId,
            type = type,
            season = season,
            episode = episode,
            language = languages
        )
        
        return when (result) {
            is OpenSubtitlesRepository.SearchResult.Success -> {
                RemoteSearchResult.Success(
                    result.subtitles.map { sub ->
                        SubtitleTrack(
                            id = sub.id,
                            name = buildSubtitleName(sub),
                            language = sub.language,
                            filePath = null,
                            isLocal = false,
                            isRemote = true,
                            remoteFileId = sub.fileId
                        )
                    }
                )
            }
            is OpenSubtitlesRepository.SearchResult.Error ->
                RemoteSearchResult.Error(result.message)
        }
    }
    
    /**
     * Download and prepare remote subtitle
     */
    suspend fun downloadAndPrepare(
        track: SubtitleTrack,
        contentTitle: String
    ): DownloadState {
        if (!track.isRemote || track.remoteFileId == null) {
            return DownloadState.Error("Sottotitolo non valido")
        }
        
        return when (val result = openSubtitlesRepo.downloadSubtitle(track.remoteFileId, contentTitle)) {
            is OpenSubtitlesRepository.DownloadResult.Success -> {
                activeSubtitlePath = result.filePath
                DownloadState.Success(result.filePath)
            }
            is OpenSubtitlesRepository.DownloadResult.Error -> {
                DownloadState.Error(result.message)
            }
            is OpenSubtitlesRepository.DownloadResult.LimitReached -> {
                val remaining = openSubtitlesRepo.getRemainingDownloads()
                DownloadState.LimitReached(remaining)
            }
        }
    }
    
    /**
     * Apply subtitle to ExoPlayer
     */
    fun applySubtitle(player: ExoPlayer, subtitlePath: String, mediaItem: MediaItem): MediaItem {
        val subtitleFile = File(subtitlePath)
        if (!subtitleFile.exists() || subtitleFile.length() == 0L) {
            // Un file vuoto o mancante rende invisibile il sottotitolo senza errori: meglio
            // dirlo forte nel log che far indovinare.
            android.util.Log.e(
                "SubtitleManager",
                "Sottotitolo mancante o vuoto: $subtitlePath " +
                    "(exists=${subtitleFile.exists()}, size=${subtitleFile.length()})"
            )
        } else {
            android.util.Log.d(
                "SubtitleManager",
                "applySubtitle: ${subtitleFile.name} (${subtitleFile.length()} byte)"
            )
        }

        val subtitleUri = Uri.fromFile(subtitleFile)
        val mimeType = when {
            subtitlePath.endsWith(".srt") -> MimeTypes.APPLICATION_SUBRIP
            subtitlePath.endsWith(".vtt") -> MimeTypes.TEXT_VTT
            subtitlePath.endsWith(".ass") -> MimeTypes.TEXT_SSA
            subtitlePath.endsWith(".ssa") -> MimeTypes.TEXT_SSA
            else -> MimeTypes.APPLICATION_SUBRIP
        }
        
        val subtitleConfig = MediaItem.SubtitleConfiguration.Builder(subtitleUri)
            .setMimeType(mimeType)
            .setLanguage(detectLanguageCode(subtitlePath))
            .setSelectionFlags(C.SELECTION_FLAG_DEFAULT)
            .build()
        
        val newMediaItem = mediaItem.buildUpon()
            .setSubtitleConfigurations(listOf(subtitleConfig))
            .build()

        android.util.Log.d(
            "SubtitleManager",
            "MediaItem aggiornato: subtitleConfigs=" +
                "${newMediaItem.localConfiguration?.subtitleConfigurations?.size} mime=$mimeType " +
                "uri=${newMediaItem.localConfiguration?.uri}"
        )
        
        // ATTENZIONE: non usare `replaceMediaItem` qui. Verificato sul campo: dopo la chiamata
        // non arriva alcun `onTracksChanged`, quindi il MediaSource non viene ricreato (l'URI è
        // lo stesso) e la traccia del sottotitolo non nasce mai — il player resta senza tracce
        // testuali e nulla compare a schermo.
        //
        // Si ri-imposta invece la playlist sostituendo solo questo item: la coda
        // (Prossimo/Precedente) resta intatta, posizione e stato di riproduzione vengono
        // ripristinati, e il MediaSource viene ricreato con la subtitleConfiguration.
        val itemIndex = player.currentMediaItemIndex
        val positionMs = player.currentPosition
        val wasPlaying = player.playWhenReady

        val items = (0 until player.mediaItemCount).map { index ->
            if (index == itemIndex) newMediaItem else player.getMediaItemAt(index)
        }
        player.setMediaItems(items, itemIndex, positionMs)
        player.prepare()
        player.playWhenReady = wasPlaying

        android.util.Log.d(
            "SubtitleManager",
            "Playlist aggiornata: item=$itemIndex/${items.size} pos=${positionMs}ms " +
                "playWhenReady=$wasPlaying"
        )

        // Media3 non seleziona da sola una traccia testuale appena aggiunta quando la sua
        // lingua non è tra quelle preferite: i file scaricati si chiamano
        // "<titolo>_<fileId>.srt", quindi la traccia risulta language="und" e il
        // sottotitolo resterebbe caricato ma invisibile. Forziamo la selezione.
        player.trackSelectionParameters = player.trackSelectionParameters
            .buildUpon()
            .setTrackTypeDisabled(C.TRACK_TYPE_TEXT, false)
            .setSelectUndeterminedTextLanguage(true)
            .setPreferredTextLanguage(detectLanguageCode(subtitlePath))
            .build()

        return newMediaItem
    }
    
    /**
     * Clear active subtitle
     */
    fun clearSubtitle(player: ExoPlayer) {
        activeSubtitlePath = null
        // Remove subtitle config from current item
        val current = player.currentMediaItem
        if (current != null) {
            player.replaceMediaItem(player.currentMediaItemIndex,
                current.buildUpon().setSubtitleConfigurations(emptyList()).build())
        }
    }
    
    fun isAuthenticated(): Boolean = openSubtitlesRepo.isAuthenticated()
    
    fun getRemainingDownloads(): Int = openSubtitlesRepo.getRemainingDownloads()
    
    fun getUsername(): String? = openSubtitlesRepo.getUsername()
    
    private fun buildSubtitleName(sub: OpenSubtitlesRepository.SubtitleInfo): String {
        val parts = mutableListOf<String>()
        parts.add(sub.language)
        // fps e nome della release sono le due informazioni che permettono di scegliere il
        // sottotitolo allineato al video: release diverse hanno timing diversi, e con fps
        // diversi (es. 23.976 vs 25) la deriva cresce col tempo.
        sub.fps?.takeIf { it > 0.0 }?.let { parts.add(String.format("%.2f fps", it)) }
        if (sub.isHD) parts.add("HD")
        if (sub.isHearingImpaired) parts.add("CC")
        parts.add("⬇${formatDownloads(sub.downloadCount)}")
        if (sub.rating > 0) parts.add("★${String.format("%.1f", sub.rating)}")
        sub.release?.takeIf { it.isNotBlank() }?.let { parts.add(it.take(60)) }
        return parts.joinToString(" • ")
    }
    
    private fun formatDownloads(count: Int): String {
        return when {
            count >= 1_000_000 -> "${count / 1_000_000}M"
            count >= 1_000 -> "${count / 1_000}K"
            else -> count.toString()
        }
    }
    
    private fun detectLanguage(fileName: String): String {
        val lower = fileName.lowercase()
        return when {
            lower.contains(".it.") || lower.contains("_it.") || lower.contains("italian") -> "Italiano"
            lower.contains(".en.") || lower.contains("_en.") || lower.contains("english") -> "English"
            lower.contains(".es.") || lower.contains("spanish") -> "Español"
            lower.contains(".fr.") || lower.contains("french") -> "Français"
            lower.contains(".de.") || lower.contains("german") -> "Deutsch"
            else -> "Sottotitolo"
        }
    }
    
    private fun detectLanguageCode(fileName: String): String {
        val lower = fileName.lowercase()
        return when {
            lower.contains(".it.") || lower.contains("_it.") || lower.contains("italian") -> "it"
            lower.contains(".en.") || lower.contains("_en.") || lower.contains("english") -> "en"
            lower.contains(".es.") || lower.contains("spanish") -> "es"
            lower.contains(".fr.") || lower.contains("french") -> "fr"
            lower.contains(".de.") || lower.contains("german") -> "de"
            else -> "und"
        }
    }
    
    /**
     * Esito della ricerca remota. Distinguere Success vuoto da Error è essenziale:
     * convertire l'errore in lista vuota faceva apparire "Nessun sottotitolo trovato"
     * anche quando la chiamata falliva (es. HTTP 400 per una query non valida).
     */
    sealed class RemoteSearchResult {
        data class Success(val tracks: List<SubtitleTrack>) : RemoteSearchResult()
        data class Error(val message: String) : RemoteSearchResult()
    }

    sealed class DownloadState {
        data class Success(val filePath: String) : DownloadState()
        data class Error(val message: String) : DownloadState()
        data class LimitReached(val remaining: Int) : DownloadState()
    }
}
