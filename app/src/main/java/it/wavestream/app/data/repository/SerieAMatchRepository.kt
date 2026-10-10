package it.wavestream.app.data.repository

import it.wavestream.app.data.api.FootballDataService
import it.wavestream.app.data.api.EspnEvent
import it.wavestream.app.data.api.EspnKeyEvent
import it.wavestream.app.data.api.EspnRosterPlayer
import it.wavestream.app.data.api.EspnStatusType
import it.wavestream.app.data.api.FootballMatchDto
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.SerieAMatchDao
import it.wavestream.app.data.database.dao.SerieATeamChannelDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.data.database.entity.SerieATeamChannelEntity
import it.wavestream.app.data.parser.SerieATeamAliases
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
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
 *   an alias of BOTH teams (home AND away): solo i canali che nominano
 *   entrambe le squadre trasmettono la partita.
 */
@Singleton
class SerieAMatchRepository @Inject constructor(
    private val footballDataService: FootballDataService,
    private val espnSoccerService: it.wavestream.app.data.api.EspnSoccerService,
    private val serieAMatchDao: SerieAMatchDao,
    private val serieATeamChannelDao: SerieATeamChannelDao,
    private val channelDao: ChannelDao
) {

    /** Tempo corretto col server (ServerClock, alimentato da tutti i client HTTP). */
    fun adjustedNow(): Long = it.wavestream.app.util.ServerClock.now()

    // =================== ESPN (punteggi live, cronaca, formazioni) ===================

    /** football-data match id → ESPN event id (risolto per data, tenuto in memoria). */
    private val espnEventIds = java.util.concurrent.ConcurrentHashMap<Long, Long>()

    /**
     * Aggiorna score e stato delle partite in DB con gli eventi ESPN di ieri e oggi.
     * Il free tier di football-data.org per la Serie A non copre le partite in
     * corso (arriva a fine gara): qui si aggiornano SOLO score, stato e lastUpdated
     * delle partite già presenti, con matching per alias delle due squadre.
     * @return true se ESPN ha risposto (anche con 0 modifiche), false altrimenti.
     */
    suspend fun refreshLiveScores(): Boolean = runCatching {
        val now = adjustedNow()
        val days = listOf(now - DAY_MILLIS, now).map { espnDate(it) }.distinct()
        val events = days.flatMap { day ->
            runCatching { espnSoccerService.getScoreboard(dates = day).events }
                .getOrDefault(emptyList())
        }
        if (events.isEmpty()) return@runCatching false

        val rows = serieAMatchDao.getWindowList(
            from = now - 12L * 60 * 60 * 1000,
            to = now + 5L * 24 * 60 * 60 * 1000
        )
        var updated = 0

        rows.forEach { match ->
            val event = findEspnEvent(events, match) ?: return@forEach
            val eventId = event.id ?: return@forEach
            espnEventIds[match.id] = eventId

            val competition = event.competitions.firstOrNull()
            val newStatus = mapEspnStatus(competition?.status?.type ?: event.status?.type)
            val newHome = competition?.competitors
                ?.firstOrNull { it.homeAway == "home" }?.score?.toIntOrNull()
            val newAway = competition?.competitors
                ?.firstOrNull { it.homeAway == "away" }?.score?.toIntOrNull()
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
        Log.d("SerieA", "ESPN: ${events.size} events, $updated rows updated")
        true
    }.getOrDefault(false)

    /**
     * Evento ESPN corrispondente alla partita: entrambe le squadre devono
     * combaciare per alias e la data deve distare meno di 36h dal calcio d'inizio
     * (evita di agganciare l'andata/ritorno o un'altra giornata).
     */
    private fun findEspnEvent(events: List<EspnEvent>, match: SerieAMatchEntity): EspnEvent? {
        val homeAliases = SerieATeamAliases.teamAliases(match.homeTla, match.homeShortName)
        val awayAliases = SerieATeamAliases.teamAliases(match.awayTla, match.awayShortName)
        return events.firstOrNull { event ->
            val competition = event.competitions.firstOrNull() ?: return@firstOrNull false
            val home = competition.competitors.firstOrNull { it.homeAway == "home" }
                ?.team?.displayName.orEmpty()
            val away = competition.competitors.firstOrNull { it.homeAway == "away" }
                ?.team?.displayName.orEmpty()
            if (!SerieATeamAliases.channelMatchesTeam(home, homeAliases) ||
                !SerieATeamAliases.channelMatchesTeam(away, awayAliases)
            ) {
                return@firstOrNull false
            }
            val kickoff = parseEspnInstant(event.date) ?: return@firstOrNull true
            kotlin.math.abs(kickoff - match.utcDateMillis) < 36L * 60 * 60 * 1000
        }
    }

    /**
     * Id evento ESPN di una partita: dalla cache, altrimenti cercato nei giorni
     * intorno al calcio d'inizio (±1 per i fusi orari). Non dipende dal round
     * corrente come i poll live: funziona anche aprendo una partita di domani.
     */
    private suspend fun resolveEspnEventId(match: SerieAMatchEntity): Long? {
        espnEventIds[match.id]?.let { return it }
        val events = (-1..1).flatMap { offset ->
            val day = espnDate(match.utcDateMillis + offset * DAY_MILLIS)
            runCatching { espnSoccerService.getScoreboard(dates = day).events }
                .getOrDefault(emptyList())
        }
        val eventId = findEspnEvent(events, match)?.id ?: return null
        espnEventIds[match.id] = eventId
        return eventId
    }

    /** `type.state`: "pre" → TIMED, "in" → IN_PLAY (PAUSED all'intervallo), "post" → FINISHED. */
    private fun mapEspnStatus(type: EspnStatusType?): String? {
        val name = type?.name.orEmpty()
        val description = type?.description.orEmpty()
        return when {
            name.contains("POSTPONED", true) -> "POSTPONED"
            name.contains("CANCELED", true) || name.contains("CANCELLED", true) -> "CANCELLED"
            name.contains("SUSPENDED", true) || name.contains("DELAYED", true) -> "SUSPENDED"
            type?.state == "pre" -> "TIMED"
            type?.state == "in" -> if (description.contains("Halftime", true)) "PAUSED" else "IN_PLAY"
            type?.state == "post" -> "FINISHED"
            else -> null
        }
    }

    /** Data ESPN (`yyyyMMdd`) del giorno italiano che contiene [millis]. */
    private fun espnDate(millis: Long): String = Instant.ofEpochMilli(millis)
        .atZone(ITALY_ZONE)
        .toLocalDate()
        .format(ESPN_DATE_FORMAT)

    private fun parseEspnInstant(date: String?): Long? =
        date?.let { runCatching { Instant.parse(it).toEpochMilli() }.getOrNull() }

    // =================== TABELLINO (cronaca + formazioni) ===================

    /**
     * Tabellino della partita da ESPN: cronaca (gol, cartellini, sostituzioni) +
     * formazioni ufficiali. L'event id si risolve per data, quindi il tabellino
     * funziona anche per una partita che non è della giornata corrente.
     */
    suspend fun getMatchTabellino(match: SerieAMatchEntity): Result<SerieATabellino> = runCatching {
        val eventId = resolveEspnEventId(match)
            ?: throw IllegalStateException("Nessun evento ESPN per il match ${match.id}")

        val summary = espnSoccerService.getSummary(eventId = eventId)
        val competition = summary.header?.competitions?.firstOrNull()
        val statusType = competition?.status?.type
        val homeTeamId = competition?.competitors?.firstOrNull { it.homeAway == "home" }?.team?.id
        val started = statusType?.state == "in" || statusType?.state == "post"

        val homeRoster = summary.rosters.firstOrNull { it.homeAway == "home" }
        val awayRoster = summary.rosters.firstOrNull { it.homeAway == "away" }

        SerieATabellino(
            incidents = summary.keyEvents.mapNotNull { toMatchIncident(it, homeTeamId) },
            homeFormation = homeRoster?.formation,
            awayFormation = awayRoster?.formation,
            homePlayers = homeRoster?.roster.orEmpty().map { it.toLineupPlayer() },
            awayPlayers = awayRoster?.roster.orEmpty().map { it.toLineupPlayer() },
            // ESPN pubblica la formazione anche prima del fischio d'inizio (è una
            // probabile): la si considera ufficiale solo a partita iniziata.
            lineupsConfirmed = started &&
                homeRoster?.roster.orEmpty().count { it.starter == true } >= 11 &&
                awayRoster?.roster.orEmpty().count { it.starter == true } >= 11
        )
    }

    private fun toLineupPlayer(player: EspnRosterPlayer) = MatchLineupPlayer(
        player = player.athlete?.displayName?.let { MatchPerson(name = it) },
        shirtNumber = player.jersey?.toIntOrNull(),
        substitute = player.starter != true
    )

    /**
     * Converte un evento della cronaca ESPN nel modello del match center.
     * `participants` cambia significato per tipo: gol [marcatore, assist],
     * sostituzione [entra, esce]. Il resto (rigori, autogol, cartellini) si
     * ricava da `type.type` e dal testo.
     */
    private fun toMatchIncident(event: EspnKeyEvent, homeTeamId: String?): MatchIncident? {
        val raw = event.type?.type ?: event.type?.text.orEmpty()
        val text = event.text.orEmpty()
        val type = when {
            raw.contains("goal", true) -> "goal"
            raw.contains("card", true) -> "card"
            raw.contains("substitution", true) -> "substitution"
            raw.contains("kickoff", true) || raw.contains("half", true) ||
                raw.contains("full-time", true) || raw.contains("end-regular", true) -> "period"
            else -> return null
        }
        val names = event.participants.mapNotNull { it.athlete?.displayName }
        return MatchIncident(
            incidentType = type,
            time = parseEspnMinute(event.clock),
            isHome = homeTeamId != null && event.team?.id == homeTeamId,
            player = names.getOrNull(0)?.let { MatchPerson(name = it) },
            playerIn = if (type == "substitution") names.getOrNull(0)?.let { MatchPerson(name = it) } else null,
            playerOut = if (type == "substitution") names.getOrNull(1)?.let { MatchPerson(name = it) } else null,
            assist1 = if (type == "goal") names.getOrNull(1)?.let { MatchPerson(name = it) } else null,
            cardType = if (type == "card") {
                if (raw.contains("red", true) || text.contains("red card", true)) "red" else "yellow"
            } else null,
            incidentClass = when {
                type != "goal" -> null
                raw.contains("penalty", true) || text.contains("Penalty", true) -> "penalty"
                raw.contains("own", true) || text.contains("own goal", true) -> "ownGoal"
                else -> "regular"
            },
            text = if (type == "period") espnPeriodLabel(raw) else event.text
        )
    }

    /** Intestazione di periodo in italiano (il match center la mostra così com'è). */
    private fun espnPeriodLabel(raw: String): String = when {
        raw.contains("halftime", true) -> "INTERVALLO"
        raw.contains("kickoff", true) -> "1° TEMPO"
        raw.contains("start-2nd-half", true) || raw.contains("second-half", true) -> "2° TEMPO"
        raw.contains("full-time", true) || raw.contains("end-regular", true) ||
            raw.contains("end-2nd", true) -> "FINE PARTITA"
        else -> ""
    }

    /** "45'+3'" → 45, "7'" → 7; fallback sui secondi del clock ESPN. */
    private fun parseEspnMinute(clock: it.wavestream.app.data.api.EspnClock?): Int? {
        clock?.displayValue?.takeWhile { it.isDigit() }?.toIntOrNull()?.let { return it }
        return clock?.value?.let { (it / 60).toInt() }
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
     * Playlist channels (all playlists) whose name contains an alias of BOTH
     * teams of [match] (casa E ospite), deduplicated by stream URL, sorted by
     * name.
     *
     * Nota: un canale tipo "Inter TV" contiene una sola squadra e NON trasmette
     * la partita, quindi va escluso. Fanno eccezione i canali evento DAZN 1, che
     * per nome non contengono le squadre ma sono il canale che manda il match:
     * vengono aggiunti sempre.
     */
    suspend fun findChannelsForMatch(match: SerieAMatchEntity): List<Channel> = withContext(Dispatchers.IO) {
        val homeAliases = SerieATeamAliases.teamAliases(match.homeTla, match.homeShortName)
        val awayAliases = SerieATeamAliases.teamAliases(match.awayTla, match.awayShortName)
        // Canali evento DAZN 1 (DAZN HERMES/KALI): non contengono il nome della
        // squadra nel nome, quindi il matching per alias non li trova. Vanno
        // aggiunti per forza, altrimenti la partita risulta "senza canali".
        val daznEvent = channelDao.getDaznEventChannels()
        if (homeAliases.isEmpty() || awayAliases.isEmpty()) {
            return@withContext daznEvent
                .distinctBy { it.streamUrl }
                .sortedBy { it.name.lowercase() }
        }

        val allChannels = channelDao.getAllChannelsList()
        // Scansione per squadra (aggiorna anche il mapping persistente squadra→canale).
        val matchedHome = matchChannelsForTeam(allChannels, match.homeTla, match.homeShortName)
        val matchedAway = matchChannelsForTeam(allChannels, match.awayTla, match.awayShortName)

        // Intersezione per streamUrl: solo i canali che matchano ENTRAMBE le squadre.
        val homeUrls = matchedHome.map { it.streamUrl }.toSet()
        val bothTeams = matchedAway.filter { it.streamUrl in homeUrls }.distinctBy { it.streamUrl }

        return@withContext (bothTeams + daznEvent)
            .distinctBy { it.streamUrl }
            .sortedBy { it.name.lowercase() }
    }

    /**
     * Età (ms) della cache squadra→canali per il match. Long.MAX_VALUE se non
     * esiste alcun salvataggio. Serve a decidere se rifare la scansione completa
     * della playlist: se la cache è fresca la si salta, così le partite
     * successive della stessa squadra si aprono istantaneamente.
     */
    suspend fun savedChannelsAge(match: SerieAMatchEntity): Long = withContext(Dispatchers.IO) {
        val tlas = listOf(match.homeTla, match.awayTla).filter { it.isNotBlank() }
        if (tlas.isEmpty()) return@withContext Long.MAX_VALUE
        val last = serieATeamChannelDao.lastSavedAt(tlas) ?: return@withContext Long.MAX_VALUE
        System.currentTimeMillis() - last
    }

    /**
     * Canali salvati localmente per le due squadre (lettura istantanea dal DB).
     * Usata per mostrare subito i canali prima della ricerca di aggiornamento.
     * Vengono restituiti solo i canali presenti per ENTRAMBE le squadre
     * (intersezione casa ∩ ospite), perché solo quelli nominano il match.
     */
    suspend fun getSavedChannelsForMatch(match: SerieAMatchEntity): List<Channel> = withContext(Dispatchers.IO) {
        // I canali evento DAZN 1 non sono mappati a una squadra (il nome non la
        // contiene): vengono sempre aggiunti per le partite di Serie A.
        val daznEvent = channelDao.getDaznEventChannels()
        val homeTla = match.homeTla
        val awayTla = match.awayTla
        if (homeTla.isBlank() || awayTla.isBlank()) {
            return@withContext daznEvent
                .filter { !it.isExcludedCategory() }
                .distinctBy { it.streamUrl }
                .sortedBy { it.name.lowercase() }
        }
        val links = serieATeamChannelDao.getByTeams(listOf(homeTla, awayTla))
        val homeUrls = links.filter { it.teamTla == homeTla }.map { it.channelStreamUrl }.toSet()
        val awayUrls = links.filter { it.teamTla == awayTla }.map { it.channelStreamUrl }.toSet()
        // Intersezione: canali salvati per casa E per ospite.
        val bothUrls = homeUrls intersect awayUrls
        // Query mirata per streamUrl: NON si carica l'intera playlist (decine di
        // migliaia di canali) solo per filtrare i pochi salvati. È il collo di
        // bottiglia che rende lenta l'apertura del picker canali.
        val saved = if (bothUrls.isEmpty()) emptyList()
            else channelDao.getChannelsByStreamUrls(bothUrls.toList())
        return@withContext (saved + daznEvent)
            .filter { !it.isExcludedCategory() }
            .distinctBy { it.streamUrl }
            .sortedBy { it.name.lowercase() }
    }

    /** Categorie escluse dalla ricerca canali dei match (campionati minori con
     *  squadre omonime, es. canali "Serie B" che matchano gli alias delle squadre Serie A). */
    private val EXCLUDED_CATEGORY_KEYWORDS = listOf("serie b")

    private fun Channel.isExcludedCategory(): Boolean {
        val cat = category?.lowercase()?.replace('-', ' ') ?: return false
        return EXCLUDED_CATEGORY_KEYWORDS.any { cat.contains(it) }
    }

    /** Matching per una squadra + aggiornamento del mapping persistente. */
    private suspend fun matchChannelsForTeam(
        allChannels: List<Channel>,
        teamTla: String,
        teamShortName: String
    ): List<Channel> {
        if (teamTla.isBlank()) return emptyList()
        val aliases = SerieATeamAliases.teamAliases(teamTla, teamShortName)
        if (aliases.isEmpty()) return emptyList()

        val matched = allChannels
            .filter { !it.isExcludedCategory() && SerieATeamAliases.channelMatchesTeam(it.name, aliases) }
            .distinctBy { it.streamUrl }

        // Aggiorna il mapping persistente: upsert dei correnti, rimozione dei
        // canali spariti con l'aggiornamento playlist
        if (matched.isNotEmpty()) {
            serieATeamChannelDao.upsertAll(
                matched.map {
                    SerieATeamChannelEntity(
                        teamTla = teamTla,
                        channelStreamUrl = it.streamUrl,
                        teamShortName = teamShortName,
                        channelName = it.name
                    )
                }
            )
            serieATeamChannelDao.deleteStaleForTeam(teamTla, matched.map { it.streamUrl })
        }
        return matched
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
        private val ESPN_DATE_FORMAT: DateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE
        private const val DAY_MILLIS = 24L * 60 * 60 * 1000
        private const val DEFAULT_SYNC_INTERVAL_MILLIS = 4L * 60 * 60 * 1000 // 4 hours
    }
}

/**
 * Tabellino della partita per il match center dell'hero: incidenti (gol,
 * cartellini, sostituzioni) + formazioni ufficiali.
 */
data class SerieATabellino(
    val incidents: List<MatchIncident>,
    val homeFormation: String?,
    val awayFormation: String?,
    val homePlayers: List<MatchLineupPlayer>,
    val awayPlayers: List<MatchLineupPlayer>,
    val lineupsConfirmed: Boolean
)

/** Persona citata nella cronaca (marcatore, assist, chi entra/esce). */
data class MatchPerson(val name: String? = null)

/**
 * Evento della cronaca, indipendente dalla sorgente dati.
 * `incidentType`: "goal" / "card" / "substitution" / "period".
 * `incidentClass` (solo gol): "regular" / "penalty" / "ownGoal".
 */
data class MatchIncident(
    val incidentType: String? = null,
    val time: Int? = null,
    val isHome: Boolean? = null,
    val player: MatchPerson? = null,
    val playerIn: MatchPerson? = null,
    val playerOut: MatchPerson? = null,
    val cardType: String? = null,
    val incidentClass: String? = null,
    val assist1: MatchPerson? = null,
    val text: String? = null
)

/** Giocatore delle formazioni (titolare o panchina). */
data class MatchLineupPlayer(
    val player: MatchPerson? = null,
    val shirtNumber: Int? = null,
    val substitute: Boolean? = null
)
