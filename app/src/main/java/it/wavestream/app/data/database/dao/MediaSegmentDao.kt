package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.MediaSegment
import it.wavestream.app.data.database.entity.SegmentType

@Dao
interface MediaSegmentDao {

    @Query(
        "SELECT * FROM media_segments WHERE contentType = :contentType AND contentId = :contentId " +
            "AND type = :type ORDER BY confidence DESC, updatedAt DESC LIMIT 1"
    )
    suspend fun getForContent(contentId: Long, contentType: ContentType, type: SegmentType): MediaSegment?

    @Query(
        "SELECT * FROM media_segments WHERE seriesId = :seriesId AND type = :type " +
            "AND seasonNumber = :seasonNumber AND episodeNumber = :episodeNumber LIMIT 1"
    )
    suspend fun getForEpisode(
        seriesId: Long,
        seasonNumber: Int,
        episodeNumber: Int,
        type: SegmentType
    ): MediaSegment?

    @Query("SELECT * FROM media_segments WHERE seriesId = :seriesId AND type = :type ORDER BY updatedAt DESC")
    suspend fun getForSeries(seriesId: Long, type: SegmentType): List<MediaSegment>

    @Query(
        "SELECT * FROM media_segments WHERE contentType = :contentType AND tmdbId = :tmdbId " +
            "AND type = :type LIMIT 1"
    )
    suspend fun getByTmdb(contentType: ContentType, tmdbId: Int, type: SegmentType): MediaSegment?

    @Query("SELECT * FROM media_segments WHERE imdbId = :imdbId AND type = :type LIMIT 1")
    suspend fun getByImdb(imdbId: String, type: SegmentType): MediaSegment?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(segment: MediaSegment): Long

    @Update
    suspend fun update(segment: MediaSegment)

    @Delete
    suspend fun delete(segment: MediaSegment)

    @Query("DELETE FROM media_segments WHERE contentType = :contentType AND contentId = :contentId AND type = :type")
    suspend fun deleteForContent(contentId: Long, contentType: ContentType, type: SegmentType)

    @Query("DELETE FROM media_segments")
    suspend fun deleteAll()

    /**
     * Upsert per (contenuto, tipo): sostituisce il marker esistente dello stesso
     * contenuto invece di accumulare duplicati.
     */
    @Transaction
    suspend fun upsert(segment: MediaSegment) {
        val existing = segment.contentId?.let {
            getForContent(it, segment.contentType, segment.type)
        }
        if (existing != null) {
            update(segment.copy(id = existing.id, createdAt = existing.createdAt))
        } else {
            insert(segment)
        }
    }
}
