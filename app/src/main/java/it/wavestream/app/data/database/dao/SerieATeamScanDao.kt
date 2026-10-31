package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import it.wavestream.app.data.database.entity.SerieATeamScanEntity

@Dao
interface SerieATeamScanDao {

    @Query("SELECT * FROM serie_a_team_scan WHERE teamTla IN (:teamTlas)")
    suspend fun getByTeams(teamTlas: List<String>): List<SerieATeamScanEntity>

    @Query("SELECT * FROM serie_a_team_scan WHERE teamTla = :teamTla")
    suspend fun get(teamTla: String): SerieATeamScanEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(rows: List<SerieATeamScanEntity>)

    /** Invalida tutte le ricognizioni: chiamata dopo un refresh della playlist,
     *  così la prossima apertura di una partita riallinea la cache ai canali
     *  attuali. */
    @Query("DELETE FROM serie_a_team_scan")
    suspend fun clearAll()

    @Query("DELETE FROM serie_a_team_scan WHERE teamTla = :teamTla")
    suspend fun clear(teamTla: String)
}
