package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SerieAMatchDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(matches: List<SerieAMatchEntity>)

    @Query("SELECT * FROM serie_a_matches WHERE utcDateMillis >= :from AND utcDateMillis <= :to ORDER BY utcDateMillis")
    fun observeWindow(from: Long, to: Long): Flow<List<SerieAMatchEntity>>

    @Query("SELECT * FROM serie_a_matches WHERE utcDateMillis >= :from AND utcDateMillis <= :to ORDER BY utcDateMillis")
    suspend fun getWindowList(from: Long, to: Long): List<SerieAMatchEntity>>

    @Query("SELECT * FROM serie_a_matches WHERE id = :id")
    suspend fun getById(id: Long): SerieAMatchEntity?

    @Query("DELETE FROM serie_a_matches WHERE utcDateMillis < :before")
    suspend fun deleteBefore(before: Long)

    @Query("DELETE FROM serie_a_matches")
    suspend fun deleteAll()

    @Query("SELECT COUNT(*) FROM serie_a_matches")
    suspend fun count(): Int

    @Query("SELECT MAX(lastUpdated) FROM serie_a_matches")
    suspend fun getLastSyncMillis(): Long?
}
