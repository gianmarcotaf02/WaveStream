package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import it.wavestream.app.data.database.entity.HomeSessionCacheEntity

@Dao
interface HomeSessionCacheDao {
    @Query("SELECT * FROM home_session_cache WHERE key = :key")
    suspend fun get(key: String): HomeSessionCacheEntity?

    @Query("SELECT * FROM home_session_cache")
    suspend fun getAll(): List<HomeSessionCacheEntity>

    @Upsert
    suspend fun put(entity: HomeSessionCacheEntity)

    @Query("DELETE FROM home_session_cache WHERE key = :key")
    suspend fun remove(key: String)

    @Query("DELETE FROM home_session_cache")
    suspend fun clear()

    @Query("DELETE FROM home_session_cache WHERE updatedAt < :threshold")
    suspend fun pruneOlderThan(threshold: Long)
}
