package it.wavestream.app.data.api

import it.wavestream.app.data.model.EventsResponse
import it.wavestream.app.data.model.StandingsResponse
import it.wavestream.app.data.model.IncidentsResponse
import it.wavestream.app.data.model.LineupsResponse
import it.wavestream.app.data.model.StatisticsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface SofascoreApi {

    @GET("unique-tournament/{tournamentId}/season/{seasonId}/standings/total")
    suspend fun getStandings(
        @Path("tournamentId") tournamentId: Int, // Serie A = 23 (usually, need to verify unique ID)
        @Path("seasonId") seasonId: Int // Need current season ID
    ): StandingsResponse

    // Fetch matches for a specific date or round.
    // Ideally we want the "next" or "last" matches, but searching by round or date is common.
    // unique-tournament/23/season/{seasonId}/events/last/{page}
    // unique-tournament/23/season/{seasonId}/events/next/{page}
    
    @GET("unique-tournament/{tournamentId}/season/{seasonId}/events/next/{page}")
    suspend fun getNextEvents(
        @Path("tournamentId") tournamentId: Int,
        @Path("seasonId") seasonId: Int,
        @Path("page") page: Int = 0
    ): EventsResponse
    
    @GET("unique-tournament/{tournamentId}/season/{seasonId}/events/last/{page}")
    suspend fun getLastEvents(
        @Path("tournamentId") tournamentId: Int,
        @Path("seasonId") seasonId: Int,
        @Path("page") page: Int = 0
    ): EventsResponse

    @GET("unique-tournament/{tournamentId}/season/{seasonId}/events/round/{round}")
    suspend fun getEventsByRound(
        @Path("tournamentId") tournamentId: Int,
        @Path("seasonId") seasonId: Int,
        @Path("round") round: Int
    ): EventsResponse
    
    @GET("event/{eventId}/incidents")
    suspend fun getIncidents(
        @Path("eventId") eventId: Long
    ): IncidentsResponse

    @GET("event/{eventId}")
    suspend fun getEvent(
        @Path("eventId") eventId: Long
    ): it.wavestream.app.data.model.SingleEventResponse

    @GET("event/{eventId}/lineups")
    suspend fun getLineups(
        @Path("eventId") eventId: Long
    ): LineupsResponse

    @GET("event/{eventId}/statistics")
    suspend fun getStatistics(
        @Path("eventId") eventId: Long
    ): StatisticsResponse
    
    // --- Team Endpoints ---
    
    @GET("team/{teamId}")
    suspend fun getTeamDetails(
        @Path("teamId") teamId: Long
    ): it.wavestream.app.data.model.TeamDetailsResponse
    
    @GET("team/{teamId}/events/next/{page}")
    suspend fun getTeamNextEvents(
        @Path("teamId") teamId: Long,
        @Path("page") page: Int = 0
    ): EventsResponse
    
    @GET("team/{teamId}/events/last/{page}")
    suspend fun getTeamLastEvents(
        @Path("teamId") teamId: Long,
        @Path("page") page: Int = 0
    ): EventsResponse
}
