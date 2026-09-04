package it.wavestream.app.data.repository

import it.wavestream.app.data.api.FootballDataService
import it.wavestream.app.data.api.FootballMatchDto
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.SerieAMatchDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.data.parser.SerieATeamAliases
import kotlinx.coroutines.flow.Flow
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for the Serie A calendar (football-data.org) that powers
 * the live-match hero on the Home screen.
 *
 * - `syncMatches()` fetches the calendar around today and caches it in Room
 *   (kickoff times are fixed well in advance, a sync every few hours is enough).
 * - `observeHeroMatches()` exposes every match inside its hero window
 *   (kickoff - 30 min → kickoff + 3h), one hero per match — simultaneous
 *   matches produce multiple heroes.
 * - `findChannelsForMatch()` filters playlist channels whose name contains
 *   an alias of either team.
 */
@Singleton
class SerieAMatchRepository @Inject constructor(
    private val footballDataService: FootballDataService,
    private val serieAMatchDao: SerieAMatchDao,
    private val channelDao: ChannelDao
) {

    /**
     * Fetches Serie A matches from yesterday to +14 days and upserts them in Room.
     * Returns the number of matches stored, or a failure.
     */
    suspend fun syncMatches(): Result<Int> = runCatching {
        val dateFrom = LocalDate.now(ITALY_ZONE).minusDays(1)
            .format(API_DATE_FORMAT)
        val dateTo = LocalDate.now(ITALY_ZONE).plusDays(14)
            .format(API_DATE_FORMAT)

        val response = footballDataService.getSerieAMatches(
            dateFrom = dateFrom,
            dateTo = dateTo
        )
        val dto = response.body()
            ?: throw IllegalStateException("football-data.org: empty response (code ${response.code()})")
        val matches = dto.matches.orEmpty().map { it.toEntity() }

        serieAMatchDao.upsertAll(matches)
        // Prune matches older than 2 days to keep the table small
        serieAMatchDao.deleteBefore(
            System.currentTimeMillis() - 2L * 24 * 60 * 60 * 1000
        )
        matches.size
    }

    /** Runs a sync only if the cached calendar is older than [maxAgeMillis] (default 4h). */
    suspend fun syncIfStale(maxAgeMillis: Long = DEFAULT_SYNC_INTERVAL_MILLIS) {
        val lastSync = serieAMatchDao.getLastSyncMillis() ?: 0L
        if (serieAMatchDao.count() == 0 ||
            System.currentTimeMillis() - lastSync > maxAgeMillis
        ) {
            syncMatches()
        }
    }

    /**
     * Tutte le partite delle prossime 24h (e delle 3h precedenti), ordinate per kickoff.
     * Il filtro della finestra hero (kickoff - 30 min → + 3h) lo fa il ViewModel
     * con un ticker, così l'hero appare/scompare anche senza nuove emissioni dal DB.
     */
    fun observeHeroMatches(): Flow<List<SerieAMatchEntity>> {
        val now = System.currentTimeMillis()
        return serieAMatchDao.observeWindow(
            from = now - SerieAMatchEntity.HERO_WINDOW_AFTER_MILLIS,
            to = now + 24L * 60 * 60 * 1000
        )
    }

    /**
     * Playlist channels (all playlists) whose name contains an alias of either
     * team of [match], deduplicated by stream URL, sorted by name.
     */
    suspend fun findChannelsForMatch(match: SerieAMatchEntity): List<Channel> {
        val aliases = SerieATeamAliases.aliasesForMatch(
            homeTla = match.homeTla,
            homeShortName = match.homeShortName,
            awayTla = match.awayTla,
            awayShortName = match.awayShortName
        )
        if (aliases.isEmpty()) return emptyList()

        return channelDao.getAllChannelsList()
            .filter { SerieATeamAliases.channelMatchesTeam(it.name, aliases) }
            .distinctBy { it.streamUrl }
            .sortedBy { it.name.lowercase() }
    }

    // ========== Helpers ==========

    private fun FootballMatchDto.toEntity(): SerieAMatchEntity {
        val kickoffMillis = runCatching {
            Instant.parse(utcDate).toEpochMilli()
        }.getOrElse { 0L }
        return SerieAMatchEntity(
            id = id,
            utcDateMillis = kickoffMillis,
            status = status,
            matchday = matchday,
            homeName = homeTeam.name.orEmpty(),
            homeShortName = homeTeam.shortName ?: homeTeam.name.orEmpty(),
            homeTla = homeTeam.tla.orEmpty(),
            homeCrest = homeTeam.crest,
            awayName = awayTeam.name.orEmpty(),
            awayShortName = awayTeam.shortName ?: awayTeam.name.orEmpty(),
            awayTla = awayTeam.tla.orEmpty(),
            awayCrest = awayTeam.crest,
            homeScore = score?.fullTime?.home,
            awayScore = score?.fullTime?.away
        )
    }

    companion object {
        private val ITALY_ZONE: ZoneId = ZoneId.of("Europe/Rome")
        private val API_DATE_FORMAT: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE
        private const val DEFAULT_SYNC_INTERVAL_MILLIS = 4L * 60 * 60 * 1000 // 4 hours
    }
}
