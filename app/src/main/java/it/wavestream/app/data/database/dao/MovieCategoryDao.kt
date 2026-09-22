package it.wavestream.app.data.database.dao

import androidx.room.*
import it.wavestream.app.data.database.entity.MovieCategory

/**
 * DAO delle appartenenze film→categoria (molti-a-molti).
 * Vedi [MovieCategory]: consente a un film unificato di comparire in **tutte**
 * le categorie in cui il provider lo pubblica.
 */
@Dao
interface MovieCategoryDao {

    @Query("SELECT * FROM movie_categories WHERE movieId = :movieId")
    suspend fun getForMovie(movieId: Long): List<MovieCategory>

    @Query("SELECT category FROM movie_categories WHERE movieId = :movieId ORDER BY category")
    suspend fun getCategoryNamesForMovie(movieId: Long): List<String>

    @Query("SELECT movieId FROM movie_categories WHERE category = :category")
    suspend fun getMovieIdsInCategory(category: String): List<Long>

    @Query("SELECT DISTINCT category FROM movie_categories WHERE category IS NOT NULL AND category != ''")
    suspend fun getAllCategoryNames(): List<String>

    @Query("SELECT COUNT(*) FROM movie_categories WHERE movieId = :movieId")
    suspend fun countForMovie(movieId: Long): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<MovieCategory>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: MovieCategory): Long

    @Query("DELETE FROM movie_categories WHERE movieId = :movieId")
    suspend fun deleteByMovie(movieId: Long)

    @Query("DELETE FROM movie_categories WHERE movieId = :movieId AND category NOT IN (:categories)")
    suspend fun deleteByMovieExcept(movieId: Long, categories: List<String>)

    @Query("DELETE FROM movie_categories WHERE playlistId = :playlistId")
    suspend fun deleteByPlaylist(playlistId: Long)
}
