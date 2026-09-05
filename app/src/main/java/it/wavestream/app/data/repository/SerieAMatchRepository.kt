package it.wavestream.app.data.repository

import it.wavestream.app.data.api.FootballDataService
import it.wavestream.app.data.api.FootballMatchDto
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.SerieAMatchDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.data.parser.SerieATeamAliases
import android.util.Log
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
 *   (kickoff - 30 min → kickoff + 2h), one hero per match — simultaneous
 *   matches produce multiple heroes.
 * - `findChannelsForMatch()` filters playlist channels whose name contains
 *   an alias of either team.
 */
@Singleton
class SerieAMatchRepository @Inject constructor(
    private val footballDataService: FootballDataService,
    private val sofascoreService: it.wavestream.app.data.api.SofascoreService,
    private val serieAMatchDao: SerieAMatchDao,
    private val channelDao: ChannelDao
) {

    /**
     * Differenza (server - dispositivo) in millisecondi, misurata dall'header HTTP
     * `Date` dell'ultima risposta di football-data.org. Molti TV box hanno l'orologio
     * o il timezone sballati: tutte le valutazioni di finestra usano il tempo corretto
     * [adjustedNow] invece di System.currentTimeMillis().
     */
    @Volatile
    private var clockOffsetMillis: Long = 0L

    /** Tempo corretto secondo il server API. */
    fun adjustedNow(): Long = System.currentTimeMillis() + clockOffsetMillis

    // =================== SOFASCORE (punteggi live rapidi) ===================

    private var sofascoreSeasonId: Long? = null

    /**
     * Aggiorna score e stato delle partite in DB con gli eventi Sofascore del round
     * corrente (goal quasi in tempo reale, molto più veloci del free tier di
     * football-data.org). Il calendario di base resta su football-data: qui si
     * aggiornano SOLO score, stato e lastUpdated delle partite già presenti.
     * @return true se Sofascore ha risposto (anche con 0 modifiche), false altrimenti.
     */
    suspend fun refreshLiveScoresFromSofascore(): Boolean = runCatching {
        val seasonId = sofascoreSeasonId ?: fetchSofascoreSeasonId()
        val now = adjustedNow()

        val rows = serieAMatchDao.getWindowList(
            from = now - 12L * 60 * 60 * 1000,
            to = now + 5L * 24 * 60 * 60 * 1000
        )
        // Round corrente: quello di una partita live, altrimenti la giornata più vicina
        val round = rows.filter { it.matchday != null }
            .let { list ->
                list.firstOrNull { it.isLive }?.matchday
                    ?: list.filter { it.utcDateMillis >= now - 12L * 60 * 60 * 1000 }
                        .minOfOrNull { it.matchday!! }
            } ?: return@runCatching false

        val events = sofascoreService.getRoundEvents(seasonId = seasonId, round = round).events
        var updated = 0

        rows.filter { it.matchday == round }.forEach { match ->
            val homeAliases = SerieATeamAliases.teamAliases(match.homeTla, match.homeShortName)
            val awayAliases = SerieATeamAliases.teamAliases(match.awayTla, match.awayShortName)
            val event = events.firstOrNull { e ->
                SerieATeamAliases.channelMatchesTeam(e.homeTeam?.name.orEmpty(), homeAliases) &&
                    SerieATeamAliases.channelMatchesTeam(e.awayTeam?.name.orEmpty(), awayAliases)
            } ?: return@forEach

            val newStatus = mapSofascoreStatus(event.status?.type)
            val newHome = event.homeScore?.current
            val newAway = event.awayScore?.current
            val changed = (newStatus != null && newStatus != match.status) ||
                (newHome != null && newHome != match.homeScore) ||
                (newAway != null && newAway != match.awayScore)
            if (changed) {
                serieAMatchDao.upsertAll(
                    listOf(
                        match.copy(
                            status = newStatus ?: match.status,
                            homeScore = newHome ?: match.homeScore,
                            awayScore = newAway ?: match.awayScore,
                            lastUpdated = System.currentTimeMillis()
                        )
                    )
                )
                updated++
            }
        }
        Log.d(
            "SerieA",
            "Sofascore: round $round, ${events.size} events, $updated rows updated"
        )
        true
    }.getOrDefault(false)

    private suspend fun fetchSofascoreSeasonId(): Long {
        val id = runCatching {
            sofascoreService.getSeasons().seasons.firstOrNull()?.id
        }.getOrNull() ?: 95836L // 2026/27
        sofascoreSeasonId = id
        Log.d("SerieA", "Sofascore season id: $id")
        return id
    }

    private fun mapSofascoreStatus(type: String?): String? = when (type) {
        "notstarted" -> "TIMED"
        "inprogress" -> "IN_PLAY"
        "finished" -> "FINISHED"
        "postponed" -> "POSTPONED"
        "canceled" -> "CANCELLED"
        "suspended" -> "SUSPENDED"
        else -> null
    }

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

        // Auto-correzione orologio dispositivo dal server (header HTTP Date)
        response.headers()["Date"]?.let { dateHeader ->
            runCatching {
                val serverMillis = java.time.ZonedDateTime
                    .parse(dateHeader, java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME)
                    .toInstant().toEpochMilli()
                clockOffsetMillis = serverMillis - System.currentTimeMillis()
                android.util.Log.d("SerieA", "Clock offset vs server: ${clockOffsetMillis / 1000}s")
            }
        }
        val dto = response.body()
            ?: throw IllegalStateException("football-data.org: empty response (code ${response.code()})")
        val matches = dto.matches.orEmpty().map { it.toEntity() }

        serieAMatchDao.upsertAll(matches)
        // Prune matches older than 2 days to keep the table small
        serieAMatchDao.deleteBefore(
            System.currentTimeMillis() - 2L * 24 * 60 * 60 * 1000
        )
        val liveScores = matches.filter { it.isLive }
            .joinToString { "${it.homeShortName} ${it.homeScore}-${it.awayScore} ${it.awayShortName}" }
        Log.d("SerieA", "sync: ${matches.size} matches" +
            if (liveScores.isNotEmpty()) " | LIVE: $liveScores" else "")
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
     * Tutte le partite delle prossime 24h (e delle 12h precedenti, margine di sicurezza),
     * ordinate per kickoff. Il filtro della finestra hero (kickoff - 30 min → + 2h)
     * lo fa il ViewModel con un ticker, così l'hero appare/scompare anche senza
     * nuove emissioni dal DB.
     */
    fun observeHeroMatches(): Flow<List<SerieAMatchEntity>> {
        val now = adjustedNow()
        return serieAMatchDao.observeWindow(
            from = now - 12L * 60 * 60 * 1000,
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
