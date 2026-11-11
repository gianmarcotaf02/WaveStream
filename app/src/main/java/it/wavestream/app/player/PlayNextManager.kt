package it.wavestream.app.player

import it.wavestream.app.data.database.dao.CustomGroupDao
import it.wavestream.app.data.database.dao.EpisodeDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.Episode
import it.wavestream.app.data.database.entity.GroupItem
import it.wavestream.app.util.TitleCleaner
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manages auto-play next episode/movie logic
 * Supports both series episodes and custom groups (e.g., Harry Potter saga)
 */
@Singleton
class PlayNextManager @Inject constructor(
    private val episodeDao: EpisodeDao,
    private val customGroupDao: CustomGroupDao,
    private val seriesDao: SeriesDao
) {
    
    data class NextContent(
        val contentType: ContentType,
        val contentId: Long,
        val streamUrl: String,
        val title: String,
        val subtitle: String? = null, // e.g., "Stagione 1 Episodio 2"
        /**
         * Solo il titolo della puntata (senza nome serie): è quello che mostra il
         * badge "Prossimo episodio" dell'overlay del player. `null` per i contenuti
         * che non sono episodi (es. gruppo custom): in quel caso si usa [title].
         */
        val episodeTitle: String? = null,
        /** Copertina mostrata nell'overlay "prossimo episodio" (bordo = countdown). */
        val imageUrl: String? = null,
        val season: Int? = null,
        val episode: Int? = null,
        val fromGroup: Boolean = false,
        val groupId: Long? = null
    )
    
    /** Titoli di una puntata: `full` per il resto dell'app, `badge` per l'overlay. */
    private data class EpisodeTitles(val full: String, val badge: String)
    
    /**
     * Titoli uniformi per gli episodi:
     *  - [EpisodeTitles.full] = "Nome serie • Titolo episodio" (fallback "Episodio X");
     *  - [EpisodeTitles.badge] = **solo** il titolo della puntata, perché nell'overlay
     *    il nome della serie è già il contesto e ripeterlo allunga la riga.
     *    Quando il provider/TMDB non hanno un titolo reale il fallback sarebbe
     *    "Episodio N", già presente nel sottotitolo "Stagione X Episodio N": in quel
     *    caso il badge mostra il nome della serie, che aggiunge informazione.
     */
    private fun episodeTitles(episode: Episode, seriesName: String): EpisodeTitles {
        val fallback = "Episodio ${episode.episodeNumber}"
        val epTitle = TitleCleaner.resolveEpisodeDisplayTitle(
            providerName = episode.name,
            tmdbName = episode.tmdbName,
            episodeNumber = episode.episodeNumber,
            seriesName = seriesName
        )
        val full = if (seriesName.isBlank()) epTitle else "$seriesName • $epTitle"
        val badge = when {
            epTitle != fallback -> epTitle
            seriesName.isNotBlank() -> seriesName
            else -> epTitle
        }
        return EpisodeTitles(full = full, badge = badge)
    }

    /**
     * Get next episode in a series
     */
    suspend fun getNextEpisode(seriesId: Long, currentSeason: Int, currentEpisode: Int): NextContent? {
        val series = seriesDao.getSeriesById(seriesId)
        val seriesName = series?.name ?: ""
        
        // Try next episode in same season
        val nextInSeason = episodeDao.getEpisode(seriesId, currentSeason, currentEpisode + 1)
        if (nextInSeason != null) {
            val titles = episodeTitles(nextInSeason, seriesName)
            return NextContent(
                contentType = ContentType.EPISODE,
                contentId = nextInSeason.id,
                streamUrl = nextInSeason.streamUrl,
                title = titles.full,
                subtitle = "Stagione $currentSeason Episodio ${currentEpisode + 1}",
                episodeTitle = titles.badge,
                imageUrl = nextInSeason.posterUrl,
                season = currentSeason,
                episode = currentEpisode + 1
            )
        }
        
        // Try first episode of next season
        val firstOfNextSeason = episodeDao.getEpisode(seriesId, currentSeason + 1, 1)
        if (firstOfNextSeason != null) {
            val titles = episodeTitles(firstOfNextSeason, seriesName)
            return NextContent(
                contentType = ContentType.EPISODE,
                contentId = firstOfNextSeason.id,
                streamUrl = firstOfNextSeason.streamUrl,
                title = titles.full,
                subtitle = "Stagione ${currentSeason + 1} Episodio 1",
                episodeTitle = titles.badge,
                season = currentSeason + 1,
                imageUrl = firstOfNextSeason.posterUrl,
                episode = 1
            )
        }
        
        return null
    }
    
    /**
     * Get previous episode in a series
     */
    suspend fun getPreviousEpisode(seriesId: Long, currentSeason: Int, currentEpisode: Int): NextContent? {
        val series = seriesDao.getSeriesById(seriesId)
        val seriesName = series?.name ?: ""
        
        if (currentEpisode > 1) {
            // Try previous episode in same season
            val prevInSeason = episodeDao.getEpisode(seriesId, currentSeason, currentEpisode - 1)
            if (prevInSeason != null) {
                val titles = episodeTitles(prevInSeason, seriesName)
                return NextContent(
                    contentType = ContentType.EPISODE,
                    contentId = prevInSeason.id,
                    streamUrl = prevInSeason.streamUrl,
                    title = titles.full,
                    subtitle = "Stagione $currentSeason Episodio ${currentEpisode - 1}",
                    episodeTitle = titles.badge,
                    season = currentSeason,
                    episode = currentEpisode - 1
                )
            }
        }
        
        if (currentSeason > 1) {
            // Try last episode of previous season
            val lastOfPrevSeason = episodeDao.getLastEpisodeOfSeason(seriesId, currentSeason - 1)
            if (lastOfPrevSeason != null) {
                val titles = episodeTitles(lastOfPrevSeason, seriesName)
                return NextContent(
                    contentType = ContentType.EPISODE,
                    contentId = lastOfPrevSeason.id,
                    streamUrl = lastOfPrevSeason.streamUrl,
                    title = titles.full,
                    subtitle = "Stagione ${currentSeason - 1} Episodio ${lastOfPrevSeason.episodeNumber}",
                    episodeTitle = titles.badge,
                    season = currentSeason - 1,
                    episode = lastOfPrevSeason.episodeNumber
                )
            }
        }
        
        return null
    }
    
    /**
     * Get next item in a custom group (e.g., Harry Potter 2 after Harry Potter 1)
     */
    suspend fun getNextInGroup(groupId: Long, currentContentId: Long): NextContent? {
        val group = customGroupDao.getGroupById(groupId) ?: return null
        
        // Get current item to find its order
        val currentItem = customGroupDao.getItemPosition(groupId, currentContentId) ?: return null
        
        // Get next item
        var nextItem = customGroupDao.getNextItem(groupId, currentItem.displayOrder)
        
        // If no next and loop is enabled, get first
        if (nextItem == null && group.loopPlayback) {
            nextItem = customGroupDao.getFirstItem(groupId)
            // Don't loop to self
            if (nextItem?.contentId == currentContentId) {
                nextItem = null
            }
        }
        
        return nextItem?.toNextContent(groupId)
    }
    
    /**
     * Get previous item in a custom group
     */
    suspend fun getPreviousInGroup(groupId: Long, currentContentId: Long): NextContent? {
        val currentItem = customGroupDao.getItemPosition(groupId, currentContentId) ?: return null
        val prevItem = customGroupDao.getPreviousItem(groupId, currentItem.displayOrder)
        return prevItem?.toNextContent(groupId)
    }
    
    /**
     * Check if content has a next item available
     */
    suspend fun hasNext(
        contentType: ContentType,
        contentId: Long,
        seriesId: Long? = null,
        season: Int? = null,
        episode: Int? = null,
        groupId: Long? = null
    ): Boolean {
        // Check custom group first
        if (groupId != null) {
            return getNextInGroup(groupId, contentId) != null
        }
        
        // Check series
        if (contentType == ContentType.EPISODE && seriesId != null && season != null && episode != null) {
            return getNextEpisode(seriesId, season, episode) != null
        }
        
        return false
    }
    
    /**
     * Get the appropriate next content based on context
     */
    suspend fun getNext(
        contentType: ContentType,
        contentId: Long,
        seriesId: Long? = null,
        season: Int? = null,
        episode: Int? = null,
        groupId: Long? = null
    ): NextContent? {
        // Priority: Custom group > Series
        if (groupId != null) {
            val nextInGroup = getNextInGroup(groupId, contentId)
            if (nextInGroup != null) return nextInGroup
        }
        
        if (contentType == ContentType.EPISODE && seriesId != null && season != null && episode != null) {
            return getNextEpisode(seriesId, season, episode)
        }
        
        return null
    }
    
    /**
     * Get the appropriate previous content based on context
     */
    suspend fun getPrevious(
        contentType: ContentType,
        contentId: Long,
        seriesId: Long? = null,
        season: Int? = null,
        episode: Int? = null,
        groupId: Long? = null
    ): NextContent? {
        // Priority: Custom group > Series
        if (groupId != null) {
            val prevInGroup = getPreviousInGroup(groupId, contentId)
            if (prevInGroup != null) return prevInGroup
        }
        
        if (contentType == ContentType.EPISODE && seriesId != null && season != null && episode != null) {
            return getPreviousEpisode(seriesId, season, episode)
        }
        
        return null
    }
    
    private fun GroupItem.toNextContent(groupId: Long) = NextContent(
        contentType = contentType,
        contentId = contentId,
        streamUrl = streamUrl ?: "",
        title = title,
        subtitle = subtitle,
        fromGroup = true,
        groupId = groupId
    )
}
