package it.wavestream.app.data.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * football-data.org API Service — Serie A calendar & live status.
 * Free tier: 10 requests/minute, Serie A (competition code "SA") included.
 * Docs: https://www.football-data.org/documentation/quickstart
 */
interface FootballDataService {

    companion object {
        const val BASE_URL = "https://api.football-data.org/"
        const val API_TOKEN = "c12fda3e73124273ad64d4de71988012"

        // v4 match statuses
        const val STATUS_SCHEDULED = "SCHEDULED"
        const val STATUS_TIMED = "TIMED"
        const val STATUS_LIVE = "LIVE"
        const val STATUS_IN_PLAY = "IN_PLAY"
        const val STATUS_PAUSED = "PAUSED"
        const val STATUS_FINISHED = "FINISHED"
        const val STATUS_POSTPONED = "POSTPONED"
        const val STATUS_SUSPENDED = "SUSPENDED"
        const val STATUS_CANCELLED = "CANCELLED"
        const val STATUS_AWARDED = "AWARDED"
    }

    /**
     * Get Serie A matches in a date range (format: yyyy-MM-dd).
     */
    @GET("v4/competitions/SA/matches")
    suspend fun getSerieAMatches(
        @Header("X-Auth-Token") token: String = API_TOKEN,
        @Query("dateFrom") dateFrom: String,
        @Query("dateTo") dateTo: String
    ): Response<FootballMatchesResponse>
}

// ========== Response Models ==========

@JsonClass(generateAdapter = true)
data class FootballMatchesResponse(
    val matches: List<FootballMatchDto>? = null
)

@JsonClass(generateAdapter = true)
data class FootballMatchDto(
    val id: Long,
    @Json(name = "utcDate") val utcDate: String,     // ISO 8601 UTC, e.g. "2026-02-01T17:00:00Z"
    val status: String,                              // SCHEDULED / TIMED / LIVE / IN_PLAY / PAUSED / FINISHED / ...
    val matchday: Int? = null,
    @Json(name = "homeTeam") val homeTeam: FootballTeamDto,
    @Json(name = "awayTeam") val awayTeam: FootballTeamDto,
    val score: FootballScoreDto? = null
)

@JsonClass(generateAdapter = true)
data class FootballTeamDto(
    val id: Long? = null,
    val name: String? = null,        // e.g. "FC Internazionale Milano"
    @Json(name = "shortName") val shortName: String? = null, // e.g. "Inter"
    val tla: String? = null,         // e.g. "INT"
    val crest: String? = null        // e.g. "https://crests.football-data.org/108.png"
)

@JsonClass(generateAdapter = true)
data class FootballScoreDto(
    val winner: String? = null,      // "HOME_TEAM" / "AWAY_TEAM" / "DRAW"
    @Json(name = "fullTime") val fullTime: FootballScoreFullTimeDto? = null
)

@JsonClass(generateAdapter = true)
data class FootballScoreFullTimeDto(
    val home: Int? = null,
    val away: Int? = null
)
