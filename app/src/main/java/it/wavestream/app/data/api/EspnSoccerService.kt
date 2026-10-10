package it.wavestream.app.data.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * ESPN "site" API (pubblica, senza chiave) per i dati partita della Serie A:
 * punteggio e stato live, cronaca (gol, cartellini, sostituzioni) e formazioni.
 *
 * Sostituisce Sofascore, che ora risponde 403 alle chiamate da dispositivo
 * (`{"error":{"reason":"challenge"}}`): ESPN non applica quella protezione.
 *
 * Endpoint usati:
 * - `ita.1/scoreboard?dates=YYYYMMDD` → eventi di una giornata (id, stato, punteggio)
 * - `ita.1/summary?event=<id>`        → `keyEvents` (cronaca) + `rosters` (formazioni)
 *
 * I DTO sono volutamente permissivi (tutti i campi opzionali): l'API non è
 * documentata e la forma delle risposte cambia nel tempo — un campo mancante
 * non deve far fallire il parsing.
 */
interface EspnSoccerService {

    companion object {
        const val BASE_URL = "https://site.api.espn.com/apis/site/v2/sports/soccer/"
        const val SERIE_A_LEAGUE = "ita.1"
    }

    /** Partite di un giorno (`dates` = `yyyyMMdd`). */
    @GET("{league}/scoreboard")
    suspend fun getScoreboard(
        @Path("league") league: String = SERIE_A_LEAGUE,
        @Query("dates") dates: String
    ): EspnScoreboardResponse

    /** Dettaglio partita: cronaca (`keyEvents`) e formazioni (`rosters`). */
    @GET("{league}/summary")
    suspend fun getSummary(
        @Path("league") league: String = SERIE_A_LEAGUE,
        @Query("event") eventId: Long
    ): EspnSummaryResponse
}

// ========== Scoreboard ==========

@JsonClass(generateAdapter = true)
data class EspnScoreboardResponse(
    val events: List<EspnEvent> = emptyList()
)

@JsonClass(generateAdapter = true)
data class EspnEvent(
    val id: Long? = null,
    val date: String? = null,               // ISO-8601 UTC, es. "2026-10-10T13:00Z"
    val name: String? = null,               // "Fiorentina at Genoa"
    val shortName: String? = null,          // "FIO @ GEN"
    val status: EspnStatus? = null,
    val competitions: List<EspnCompetition> = emptyList()
)

@JsonClass(generateAdapter = true)
data class EspnCompetition(
    val date: String? = null,
    val status: EspnStatus? = null,
    val competitors: List<EspnCompetitor> = emptyList(),
    val venue: EspnVenue? = null
)

/**
 * `type.state`: "pre" (non iniziata), "in" (in corso), "post" (finita).
 * `type.description`: "Scheduled" / "First Half" / "Halftime" / "Full Time" …
 */
@JsonClass(generateAdapter = true)
data class EspnStatus(
    val clock: Double? = null,
    val displayClock: String? = null,
    val period: Int? = null,
    val type: EspnStatusType? = null
)

@JsonClass(generateAdapter = true)
data class EspnStatusType(
    val id: String? = null,
    val name: String? = null,               // STATUS_FIRST_HALF / STATUS_FULL_TIME / …
    val state: String? = null,              // pre / in / post
    val completed: Boolean? = null,
    val description: String? = null,
    val detail: String? = null,
    val shortDetail: String? = null
)

@JsonClass(generateAdapter = true)
data class EspnCompetitor(
    val id: String? = null,
    val homeAway: String? = null,           // "home" / "away"
    val winner: Boolean? = null,
    val score: String? = null,
    val team: EspnTeamRef? = null
)

@JsonClass(generateAdapter = true)
data class EspnTeamRef(
    val id: String? = null,
    val displayName: String? = null,
    val shortDisplayName: String? = null,
    val name: String? = null,
    val abbreviation: String? = null,
    val logo: String? = null
)

@JsonClass(generateAdapter = true)
data class EspnVenue(
    val fullName: String? = null
)

// ========== Summary: cronaca + formazioni ==========

@JsonClass(generateAdapter = true)
data class EspnSummaryResponse(
    val header: EspnHeader? = null,
    @Json(name = "keyEvents") val keyEvents: List<EspnKeyEvent> = emptyList(),
    val rosters: List<EspnRoster> = emptyList()
)

@JsonClass(generateAdapter = true)
data class EspnHeader(
    val competitions: List<EspnCompetition> = emptyList()
)

/**
 * Un evento della cronaca. `type.type` è la chiave stabile da usare per il
 * mapping: "goal", "yellow-card", "red-card", "substitution", "kickoff",
 * "halftime", "start-2nd-half", "end-regular-time", "full-time".
 * `participants`: per i gol [marcatore, assist], per i cambi [entra, esce].
 */
@JsonClass(generateAdapter = true)
data class EspnKeyEvent(
    val id: String? = null,
    val type: EspnEventType? = null,
    val text: String? = null,
    val shortText: String? = null,
    val period: EspnPeriod? = null,
    val clock: EspnClock? = null,
    val team: EspnTeamRef? = null,
    val participants: List<EspnParticipant> = emptyList(),
    @Json(name = "scoringPlay") val scoringPlay: Boolean? = null
)

@JsonClass(generateAdapter = true)
data class EspnEventType(
    val id: String? = null,
    val text: String? = null,               // "Goal" / "Yellow Card" / "Substitution"
    val type: String? = null                // "goal" / "yellow-card" / "substitution"
)

@JsonClass(generateAdapter = true)
data class EspnPeriod(
    val number: Int? = null
)

@JsonClass(generateAdapter = true)
data class EspnClock(
    val value: Double? = null,              // secondi
    val displayValue: String? = null        // "7'" / "45'+3'"
)

@JsonClass(generateAdapter = true)
data class EspnParticipant(
    val athlete: EspnAthleteRef? = null
)

@JsonClass(generateAdapter = true)
data class EspnAthleteRef(
    val id: String? = null,
    val displayName: String? = null,
    @Json(name = "shortName") val shortName: String? = null,
    @Json(name = "fullName") val fullName: String? = null
)

@JsonClass(generateAdapter = true)
data class EspnRoster(
    val homeAway: String? = null,
    val formation: String? = null,
    val team: EspnTeamRef? = null,
    val roster: List<EspnRosterPlayer> = emptyList()
)

@JsonClass(generateAdapter = true)
data class EspnRosterPlayer(
    val active: Boolean? = null,
    val starter: Boolean? = null,
    val jersey: String? = null,
    val position: EspnPositionRef? = null,
    val athlete: EspnAthleteRef? = null
)

@JsonClass(generateAdapter = true)
data class EspnPositionRef(
    val id: String? = null,
    val name: String? = null,
    val abbreviation: String? = null
)
