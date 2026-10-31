package it.wavestream.app.data.repository

import it.wavestream.app.data.api.FootballDataService
import it.wavestream.app.data.api.EspnEvent
import it.wavestream.app.data.api.EspnKeyEvent
import it.wavestream.app.data.api.EspnRosterPlayer
import it.wavestream.app.data.api.EspnStatusType
import it.wavestream.app.data.api.FootballMatchDto
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.dao.SerieAMatchDao
import it.wavestream.app.data.database.dao.SerieATeamScanDao
import it.wavestream.app.data.database.dao.SerieATeamChannelDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.data.database.entity.SerieATeamChannelEntity
import it.wavestream.app.data.database.entity.SerieATeamScanEntity
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
 * - `getSavedChannelsForMatch()` / `refreshChannelsForMatch()` risolvono i canali
 *   della partita da una cache **per squadra** persistente (`serie_a_team_channels`
 *   + `serie_a_team_scan`): la ricerca per alias si esegue una volta per squadra e
 *   resta valida per le partite successive, finché la playlist non cambia.
 */
@Singleton
class SerieAMatchRepository @Inject constructor(
    private val footballDataService: FootballDataService,
    private val espnSoccerService: it.wavestream.app.data.api.EspnSoccerService,
    private val serieAMatchDao: SerieAMatchDao,
    private val serieATeamChannelDao: SerieATeamChannelDao,
    private val serieATeamScanDao: SerieATeamScanDao,
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

    private fun EspnRosterPlayer.toLineupPlayer() = MatchLineupPlayer(
        player = athlete?.displayName?.let { MatchPerson(name = it) },
        shirtNumber = jersey?.toIntOrNull(),
        substitute = starter != true
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
     * Canali da proporre per una partita: cache persistente "squadra → canali"
     * più i canali evento DAZN 1 (sempre presenti).
     *
     * [teamChannels] distingue il caso "ho solo il fallback DAZN 1" (0) dal caso
     * "ho i canali della partita" (>0).
     * [teamsToScan] conta le squadre la cui ricerca va (ri)fatta: cache assente,
     * playlist cambiata o TTL di sicurezza scaduto.
     */
    data class SavedMatchChannels(
        val channels: List<Channel>,
        /** Canali arrivati dalla cache squadra→canale (esclusi gli eventi DAZN 1). */
        val teamChannels: Int,
        /** Squadre da (ri)cercare: 0 = cache completamente utilizzabile. */
        val teamsToScan: Int
    ) {
        val needsScan: Boolean get() = teamsToScan > 0
    }

    /** Squadra da cercare nella playlist (TLA + nome breve per gli alias). */
    private data class TeamKey(val tla: String, val shortName: String)

    /**
     * Canali già in cache per la partita (lettura istantanea dal DB) e numero di
     * squadre che andrebbero ricercate. Non esegue mai la scansione della
     * playlist: la UI mostra subito questi e decide se/come aggiornare.
     */
    suspend fun getSavedChannelsForMatch(match: SerieAMatchEntity): SavedMatchChannels =
        resolveChannels(match, allowScan = false)

    /**
     * Riallinea la cache delle squadre da ricercare (una sola passata sulla
     * playlist) e restituisce i canali aggiornati.
     *
     * Una squadra già cercata NON viene ricercata di nuovo: la cache resta
     * valida finché la playlist non cambia (impronta diversa), non si apre una
     * partita dopo [SERIE_A_TEAM_SCAN_TTL_MS] o il refresh esplicito della
     * playlist non svuota lo stato di ricognizione.
     */
    suspend fun refreshChannelsForMatch(match: SerieAMatchEntity): SavedMatchChannels =
        resolveChannels(match, allowScan = true).copy(teamsToScan = 0)

    private suspend fun resolveChannels(
        match: SerieAMatchEntity,
        allowScan: Boolean
    ): SavedMatchChannels = withContext(Dispatchers.IO) {
        // Canali evento DAZN 1 (DAZN HERMES/KALI): non contengono il nome della
        // squadra, quindi il matching per alias non li trova mai. Vanno proposti
        // sempre, altrimenti una partita senza feed per squadra risulterebbe
        // "senza canali".
        val daznEvent = channelDao.getDaznEventChannels().filter { !it.isExcludedCategory() }
        val daznEventIds = daznEvent.map { it.id }.toSet()
        val homeTla = match.homeTla
        val awayTla = match.awayTla
        val teams = buildList {
            if (homeTla.isNotBlank()) add(TeamKey(homeTla, match.homeShortName))
            if (awayTla.isNotBlank()) add(TeamKey(awayTla, match.awayShortName))
        }

        val links = if (teams.isEmpty()) emptyList() else
            serieATeamChannelDao.getByTeams(teams.map { it.tla })
        val homeUrls = links.filter { it.teamTla == homeTla }.map { it.channelStreamUrl }.toSet()
        val awayUrls = links.filter { it.teamTla == awayTla }.map { it.channelStreamUrl }.toSet()
        val bothTeamUrls = homeUrls intersect awayUrls
        // UNIONE (non intersezione): i feed di una sola squadra sono spesso l'unico
        // modo in cui il provider espone la partita.
        val allUrls = (homeUrls + awayUrls).toList()
        val saved = getChannelsByUrlsChunked(allUrls).filter { !it.isExcludedCategory() }
        val resolvedUrls = saved.map { it.streamUrl }.toSet()

        val pending = pendingTeams(
            teams = teams,
            urlsByTeam = mapOf(homeTla to homeUrls, awayTla to awayUrls),
            resolvedUrls = resolvedUrls
        )

        if (allowScan && pending.isNotEmpty()) {
            scanTeams(pending)
            // Rilegge la cache appena aggiornata: una sola ricorsione, così la
            // lista restituita è quella effettiva e non un'unione a mano.
            return@withContext resolveChannels(match, allowScan = false)
        }

        val (bothTeams, oneTeam) = saved.partition { it.streamUrl in bothTeamUrls }
        val channels = (bothTeams.sortedBy { it.name.lowercase() } +
            oneTeam.sortedBy { it.name.lowercase() } +
            daznEvent)
            .distinctBy { it.streamUrl }
        SavedMatchChannels(
            channels = channels,
            teamChannels = channels.count { it.id !in daznEventIds },
            teamsToScan = pending.size
        )
    }

    /**
     * Squadre la cui ricerca va (ri)fatta:
     *  - mai cercata (nessuna riga in `serie_a_team_scan`);
     *  - playlist cambiata (impronta diversa da quella salvata);
     *  - TTL di sicurezza scaduto;
     *  - cache che dichiara canali trovati ma nessuno di quegli URL esiste più
     *    (canali sostituiti da un nuovo server/credenziali).
     */
    private suspend fun pendingTeams(
        teams: List<TeamKey>,
        urlsByTeam: Map<String, Set<String>>,
        resolvedUrls: Set<String>
    ): List<TeamKey> {
        if (teams.isEmpty()) return emptyList()
        val fingerprint = channelDao.fingerprint().token()
        val known = serieATeamScanDao.getByTeams(teams.map { it.tla })
            .associateBy { it.teamTla }
        val now = System.currentTimeMillis()
        return teams.filter { team ->
            val row = known[team.tla]
            when {
                row == null -> true
                row.playlistFingerprint != fingerprint -> true
                now - row.scannedAt > SERIE_A_TEAM_SCAN_TTL_MS -> true
                row.channelsCount > 0 &&
                    urlsByTeam[team.tla].orEmpty().none { it in resolvedUrls } -> true
                else -> false
            }
        }
    }

    /**
     * Ricerca per alias delle sole squadre [teams] indicate, con UNA sola lettura
     * della playlist (decine di migliaia di canali) e UNA sola normalizzazione
     * del nome per canale. Salva il mapping squadra→canali e lo stato della
     * ricognizione, così le partite successive delle stesse squadre non devono
     * ricercare nulla.
     */
    private suspend fun scanTeams(teams: List<TeamKey>) {
        val fingerprint = channelDao.fingerprint().token()
        val allChannels = channelDao.getAllChannelsList()
        val now = System.currentTimeMillis()
        val scanRows = ArrayList<SerieATeamScanEntity>(teams.size)
        teams.forEach { team ->
            val aliases = SerieATeamAliases.teamAliases(team.tla, team.shortName)
            val matched = if (aliases.isEmpty()) emptyList() else
                allChannels
                    .filter {
                        !it.isExcludedCategory() &&
                            SerieATeamAliases.channelMatchesTeam(it.name, aliases)
                    }
                    .distinctBy { it.streamUrl }
            persistTeamMapping(team.tla, team.shortName, matched)
            scanRows += SerieATeamScanEntity(
                teamTla = team.tla,
                scannedAt = now,
                channelsCount = matched.size,
                playlistFingerprint = fingerprint
            )
        }
        serieATeamScanDao.upsertAll(scanRows)
        Log.d(
            "SerieA",
            "scanTeams: ${scanRows.joinToString { "${it.teamTla}=${it.channelsCount}" }} (fp=$fingerprint)"
        )
    }

    /** Lookup per URL a blocchi: SQLite ha un limite di variabili per query e una
     *  squadra può avere decine di feed — senza blocchi la query falliva (errore
     *  inghiottito dal chiamante) e il picker restava senza canali. */
    private suspend fun getChannelsByUrlsChunked(urls: List<String>): List<Channel> {
        if (urls.isEmpty()) return emptyList()
        return urls.chunked(500).flatMap { chunk -> channelDao.getChannelsByStreamUrls(chunk) }
    }

    /** Categorie escluse dalla ricerca canali dei match (campionati minori con
     *  squadre omonime, es. canali "Serie B" che matchano gli alias delle squadre Serie A). */
    private val EXCLUDED_CATEGORY_KEYWORDS = listOf("serie b")

    private fun Channel.isExcludedCategory(): Boolean {
        val cat = category?.lowercase()?.replace('-', ' ') ?: return false
        return EXCLUDED_CATEGORY_KEYWORDS.any { cat.contains(it) }
    }

    /**
     * Aggiorna il mapping persistente squadra→canali: upsert dei correnti e
     * rimozione di quelli spariti con l'aggiornamento della playlist.
     *
     * La rimozione avviene anche quando [matched] è vuoto (squadra senza più
     * canali), altrimenti la cache continuerebbe a proporre canali cancellati.
     */
    private suspend fun persistTeamMapping(
        teamTla: String,
        teamShortName: String,
        matched: List<Channel>
    ) {
        if (teamTla.isBlank()) return
        val byUrl = matched.distinctBy { it.streamUrl }
        if (byUrl.isEmpty()) {
            // Squadra senza più canali: la cache non deve continuare a proporli.
            serieATeamChannelDao.clearTeam(teamTla)
            return
        }
        serieATeamChannelDao.upsertAll(
            byUrl.map {
                SerieATeamChannelEntity(
                    teamTla = teamTla,
                    channelStreamUrl = it.streamUrl,
                    teamShortName = teamShortName,
                    channelName = it.name
                )
            }
        )
        serieATeamChannelDao.deleteStaleForTeam(teamTla, byUrl.map { it.streamUrl })
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

        /** TTL di sicurezza della ricognizione per squadra: passati questi giorni la
         *  cache si riallinea anche se l'impronta della playlist non è cambiata. */
        private const val SERIE_A_TEAM_SCAN_TTL_MS = 30L * 24 * 60 * 60 * 1000
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
