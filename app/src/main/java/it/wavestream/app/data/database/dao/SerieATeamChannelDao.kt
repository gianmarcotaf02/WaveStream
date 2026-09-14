package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import it.wavestream.app.data.database.entity.SerieATeamChannelEntity

@Dao
interface SerieATeamChannelDao {

    @Query("SELECT * FROM serie_a_team_channels WHERE teamTla IN (:teamTlas)")
    suspend fun getByTeams(teamTlas: List<String>): List<SerieATeamChannelEntity>

    /** Timestamp dell'ultimo salvataggio per le squadre indicate: serve a capire
     *  se la cache squadra→canali è ancora fresca e si può evitare la scansione
     *  completa della playlist. */
    @Query("SELECT MAX(savedAt) FROM serie_a_team_channels WHERE teamTla IN (:teamTlas)")
    suspend fun lastSavedAt(teamTlas: List<String>): Long?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(links: List<SerieATeamChannelEntity>)

    /** Rimuove i link della squadra i cui URL non sono più tra quelli correnti. */
    @Query("DELETE FROM serie_a_team_channels WHERE teamTla = :teamTla AND channelStreamUrl NOT IN (:urls)")
    suspend fun deleteStaleForTeam(teamTla: String, urls: List<String>)

    @Query("DELETE FROM serie_a_team_channels WHERE teamTla = :teamTla")
    suspend fun clearTeam(teamTla: String)
}
