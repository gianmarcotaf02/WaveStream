package it.wavestream.app.data.database.dao

import androidx.room.*
import it.wavestream.app.data.database.entity.StreamProvider
import kotlinx.coroutines.flow.Flow

/**
 * DAO delle sorgenti/versioni di un contenuto unificato.
 *
 * L'ordinamento usa [StreamProvider.qualityRank] (decrescente) e non il nome
 * dell'enum, che essendo salvato come testo darebbe un ordine alfabetico errato
 * (es. "SD" prima di "HD").
 */
@Dao
interface StreamProviderDao {

    @Query("SELECT * FROM stream_providers WHERE movieId = :movieId ORDER BY qualityRank DESC, CASE WHEN lastUsedAt IS NULL THEN 1 ELSE 0 END, lastUsedAt DESC")
    fun getProvidersForMovie(movieId: Long): Flow<List<StreamProvider>>

    @Query("SELECT * FROM stream_providers WHERE movieId = :movieId ORDER BY qualityRank DESC, CASE WHEN lastUsedAt IS NULL THEN 1 ELSE 0 END, lastUsedAt DESC")
    suspend fun getProvidersForMovieList(movieId: Long): List<StreamProvider>

    @Query("SELECT * FROM stream_providers WHERE seriesId = :seriesId ORDER BY qualityRank DESC, lastUsedAt DESC")
    fun getProvidersForSeries(seriesId: Long): Flow<List<StreamProvider>>

    @Query("SELECT * FROM stream_providers WHERE seriesId = :seriesId ORDER BY qualityRank DESC, lastUsedAt DESC")
    suspend fun getProvidersForSeriesList(seriesId: Long): List<StreamProvider>

    @Query("SELECT * FROM stream_providers WHERE tmdbId = :tmdbId ORDER BY qualityRank DESC, lastUsedAt DESC")
    suspend fun getProvidersByTmdbId(tmdbId: Int): List<StreamProvider>

    @Query("SELECT * FROM stream_providers WHERE playlistId = :playlistId")
    suspend fun getAllByPlaylist(playlistId: Long): List<StreamProvider>

    /**
     * Solo i campi che l'unificazione deve conservare dalle sorgenti esistenti.
     * Proiettare le colonne invece di caricare le righe intere (~28 campi) riduce
     * molto memoria e tempo di prefetch su ~70k VOD.
     */
    @Query("SELECT xtreamStreamId AS xtreamStreamId, movieId AS movieId, originalName AS originalName, " +
        "tmdbId AS tmdbId, durationSeconds AS durationSeconds, " +
        "addedAt AS addedAt, lastUsedAt AS lastUsedAt, detectedHeight AS detectedHeight, detectedAt AS detectedAt " +
        "FROM stream_providers WHERE playlistId = :playlistId AND xtreamStreamId IS NOT NULL")
    suspend fun getPreservableByPlaylist(playlistId: Long): List<ProviderPreserve>

    @Query("SELECT * FROM stream_providers WHERE playlistId = :playlistId AND xtreamStreamId = :xtreamStreamId LIMIT 1")
    suspend fun getByXtreamId(playlistId: Long, xtreamStreamId: Int): StreamProvider?

    @Query("SELECT COUNT(*) FROM stream_providers WHERE movieId = :movieId")
    suspend fun countProvidersForMovie(movieId: Long): Int

    @Query("SELECT movieId AS movieId, COUNT(*) AS count FROM stream_providers WHERE playlistId = :playlistId GROUP BY movieId")
    suspend fun getProviderCountsByPlaylist(playlistId: Long): List<MovieProviderCount>

    @Query("SELECT movieId AS movieId, COUNT(*) AS count FROM stream_providers GROUP BY movieId")
    suspend fun getAllProviderCounts(): List<MovieProviderCount>

    @Query("SELECT movieId AS movieId, COUNT(*) AS count FROM stream_providers WHERE movieId IN (:movieIds) GROUP BY movieId")
    suspend fun getProviderCountsForMovies(movieIds: List<Long>): List<MovieProviderCount>

    @Query("DELETE FROM stream_providers WHERE playlistId = :playlistId AND xtreamStreamId IN (:xtreamStreamIds)")
    suspend fun deleteByXtreamIds(playlistId: Long, xtreamStreamIds: List<Int>): Int

    @Query("SELECT * FROM stream_providers WHERE movieId = :movieId ORDER BY qualityRank DESC, lastUsedAt DESC LIMIT 1")
    suspend fun getBestProviderForMovie(movieId: Long): StreamProvider?

    @Query("SELECT COUNT(*) FROM stream_providers WHERE movieId = :movieId AND durationSeconds IS NOT NULL")
    suspend fun countProvidersWithDuration(movieId: Long): Int

    @Query("UPDATE stream_providers SET lastUsedAt = :timestamp WHERE id = :id")
    suspend fun updateLastUsed(id: Long, timestamp: Long = System.currentTimeMillis())

    @Query("UPDATE stream_providers SET durationSeconds = :seconds WHERE id = :id")
    suspend fun updateDuration(id: Long, seconds: Long?)

    /** Salva la risoluzione REALE misurata dal player per quella sorgente. */
    @Query("UPDATE stream_providers SET detectedHeight = :height, detectedAt = :timestamp WHERE id = :id")
    suspend fun updateDetectedHeight(id: Long, height: Int, timestamp: Long = System.currentTimeMillis())

    @Query("UPDATE stream_providers SET movieId = :toMovieId WHERE movieId = :fromMovieId")
    suspend fun reassignToMovie(fromMovieId: Long, toMovieId: Long): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(provider: StreamProvider): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(providers: List<StreamProvider>)

    @Update
    suspend fun update(provider: StreamProvider)

    @Update
    suspend fun updateAll(providers: List<StreamProvider>): Int

    @Delete
    suspend fun delete(provider: StreamProvider)

    @Query("DELETE FROM stream_providers WHERE movieId = :movieId")
    suspend fun deleteByMovie(movieId: Long)

    @Query("DELETE FROM stream_providers WHERE playlistId = :playlistId")
    suspend fun deleteByPlaylist(playlistId: Long)

    @Query("DELETE FROM stream_providers WHERE movieId = :movieId AND id NOT IN (:keepIds)")
    suspend fun deleteByMovieExcept(movieId: Long, keepIds: List<Long>)
}

data class MovieProviderCount(
    val movieId: Long,
    val count: Int
)

/** Proiezione leggera delle sorgenti esistenti (vedi [getPreservableByPlaylist]). */
data class ProviderPreserve(
    val xtreamStreamId: Int,
    /** Film canonico a cui la sorgente è attualmente collegata. */
    val movieId: Long?,
    /** Nome grezzo salvato all'ultimo import: se cambia, la sorgente va riposizionata. */
    val originalName: String,
    val tmdbId: Int?,
    val durationSeconds: Long?,
    val addedAt: Long,
    val lastUsedAt: Long?,
    val detectedHeight: Int?,
    val detectedAt: Long?
)
