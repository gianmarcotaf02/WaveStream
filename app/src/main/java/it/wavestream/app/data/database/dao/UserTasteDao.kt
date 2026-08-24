package it.wavestream.app.data.database.dao

import androidx.room.*
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.TasteStatus
import it.wavestream.app.data.database.entity.UserTaste

@Dao
interface UserTasteDao {

    @Query("SELECT * FROM user_taste WHERE profileId = :profileId ORDER BY addedAt DESC")
    suspend fun getByProfile(profileId: Long): List<UserTaste>

    @Query("SELECT * FROM user_taste WHERE profileId = :profileId AND status = :status ORDER BY addedAt DESC")
    suspend fun getByProfileAndStatus(profileId: Long, status: TasteStatus): List<UserTaste>

    @Query("SELECT * FROM user_taste WHERE profileId = :profileId AND contentType = :contentType ORDER BY addedAt DESC")
    suspend fun getByProfileAndType(profileId: Long, contentType: ContentType): List<UserTaste>

    @Query("SELECT * FROM user_taste WHERE profileId = :profileId AND tmdbId = :tmdbId LIMIT 1")
    suspend fun getByTmdbId(profileId: Long, tmdbId: Int): UserTaste?

    @Query("SELECT * FROM user_taste WHERE profileId = :profileId AND status = :status AND contentType = :contentType ORDER BY addedAt DESC")
    suspend fun getByProfileStatusAndType(profileId: Long, status: TasteStatus, contentType: ContentType): List<UserTaste>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: UserTaste): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<UserTaste>)

    @Delete
    suspend fun delete(item: UserTaste)

    @Query("DELETE FROM user_taste WHERE profileId = :profileId AND tmdbId = :tmdbId AND contentType = :contentType")
    suspend fun deleteByTmdbId(profileId: Long, tmdbId: Int, contentType: ContentType)

    @Query("DELETE FROM user_taste WHERE profileId = :profileId")
    suspend fun deleteByProfile(profileId: Long)

    @Query("SELECT COUNT(*) FROM user_taste WHERE profileId = :profileId")
    suspend fun getCount(profileId: Long): Int

    @Query("SELECT DISTINCT tmdbId FROM user_taste WHERE profileId = :profileId AND status = :status")
    suspend fun getTmdbIdsByStatus(profileId: Long, status: TasteStatus): List<Int>
}
