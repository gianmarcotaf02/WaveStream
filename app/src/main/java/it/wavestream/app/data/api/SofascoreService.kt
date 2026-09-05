package it.wavestream.app.data.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Sofascore public API (come in SandTV) — fonte primaria per i punteggi live:
 * gli eventi riportano `homeScore.current` aggiornato quasi in tempo reale.
 * L'accesso da Android (fingerprint OkHttp) passa, mentre i client desktop
 * ricevono 403 da Cloudflare: richiede gli header browser nell'OkHttp client.
 */
interface SofascoreService {

    companion object {
        const val BASE_URL = "https://api.sofascore.com/api/v1/"
        const val SERIE_A_ID = 23 // unique-tournament id Serie A
    }

    /** Stagioni disponibili — la prima è quella corrente (es. 26/27 → id 95836). */
    @GET("unique-tournament/{tournamentId}/seasons")
    suspend fun getSeasons(
        @Path("tournamentId") tournamentId: Int = SERIE_A_ID
    ): SofascoreSeasonsResponse

    /** Eventi (partite) di un round/giornata della stagione corrente. */
    @GET("unique-tournament/{tournamentId}/season/{seasonId}/events/round/{round}")
    suspend fun getRoundEvents(
        @Path("tournamentId") tournamentId: Int = SERIE_A_ID,
        @Path("seasonId") seasonId: Long,
        @Path("round") round: Int
    ): SofascoreEventsResponse

    /** Tabellino: gol, cartellini, sostituzioni (per minuto). */
    @GET("event/{eventId}/incidents")
    suspend fun getIncidents(@Path("eventId") eventId: Long): SofascoreIncidentsResponse

    /** Formazioni ufficiali. */
    @GET("event/{eventId}/lineups")
    suspend fun getLineups(@Path("eventId") eventId: Long): SofascoreLineupsResponse
}

// ========== Response Models ==========

@JsonClass(generateAdapter = true)
data class SofascoreSeasonsResponse(
    val seasons: List<SofascoreSeason> = emptyList()
)

@JsonClass(generateAdapter = true)
data class SofascoreSeason(
    val id: Long,
    val year: String? = null,
    val name: String? = null
)

@JsonClass(generateAdapter = true)
data class SofascoreEventsResponse(
    val events: List<SofascoreEvent> = emptyList()
)

@JsonClass(generateAdapter = true)
data class SofascoreEvent(
    val id: Long,
    @Json(name = "startTimestamp") val startTimestamp: Long? = null, // epoch SECONDS
    @Json(name = "roundInfo") val roundInfo: SofascoreRoundInfo? = null,
    val status: SofascoreEventStatus? = null,
    @Json(name = "homeTeam") val homeTeam: SofascoreTeam? = null,
    @Json(name = "awayTeam") val awayTeam: SofascoreTeam? = null,
    @Json(name = "homeScore") val homeScore: SofascoreScore? = null,
    @Json(name = "awayScore") val awayScore: SofascoreScore? = null
)

@JsonClass(generateAdapter = true)
data class SofascoreRoundInfo(val round: Int? = null)

/** type: "notstarted" / "inprogress" / "finished" / "postponed" / "canceled" / "suspended" */
@JsonClass(generateAdapter = true)
data class SofascoreEventStatus(
    val code: Int? = null,
    val description: String? = null,
    val type: String? = null
)

@JsonClass(generateAdapter = true)
data class SofascoreTeam(
    val id: Long? = null,
    val name: String? = null,
    @Json(name = "shortName") val shortName: String? = null,
    @Json(name = "nameCode") val nameCode: String? = null
)

@JsonClass(generateAdapter = true)
data class SofascoreScore(
    val current: Int? = null,
    val display: Int? = null
)
