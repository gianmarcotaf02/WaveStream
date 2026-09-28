package it.wavestream.app.data.database.dao

import androidx.room.*
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.WatchProgress
import kotlinx.coroutines.flow.Flow

@Dao
interface WatchProgressDao {
    
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId ORDER BY lastWatchedAt DESC")
    fun getProgressByProfile(profileId: Long): Flow<List<WatchProgress>>
    
    // NOTA: la clausola su `position` è l'equivalente SQL di [WatchProgress.isResumable]:
    // esclude i progressi con position ~0 (righe create aprendo e chiudendo il player
    // prima che la riproduzione parta), che altrimenti comparivano nei caroselli
    // "Continua a guardare" con i minuti rimasti pari alla durata totale.

    // All items (Home continue-watching row)
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId AND isCompleted = 0 " +
        "AND duration > 0 AND position >= CASE WHEN duration <= 60000 THEN 1 ELSE 15000 END " +
        "ORDER BY lastWatchedAt DESC LIMIT :limit")
    suspend fun getContinueWatching(profileId: Long, limit: Int = 20): List<WatchProgress>

    // Movies only - for FilmActivity carousel
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId AND contentType = 'MOVIE' AND isCompleted = 0 " +
        "AND duration > 0 AND position >= CASE WHEN duration <= 60000 THEN 1 ELSE 15000 END " +
        "ORDER BY lastWatchedAt DESC LIMIT :limit")
    suspend fun getContinueWatchingMovies(profileId: Long, limit: Int = 20): List<WatchProgress>

    // Series/Episodes - for SeriesActivity carousel
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId AND contentType IN ('SERIES', 'EPISODE') AND isCompleted = 0 " +
        "AND duration > 0 AND position >= CASE WHEN duration <= 60000 THEN 1 ELSE 15000 END " +
        "ORDER BY lastWatchedAt DESC LIMIT :limit")
    suspend fun getContinueWatchingSeries(profileId: Long, limit: Int = 20): List<WatchProgress>
    
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId AND contentType = :contentType AND contentId = :contentId")
    suspend fun getProgress(profileId: Long, contentType: ContentType, contentId: Long): WatchProgress?
    
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId ORDER BY lastWatchedAt DESC LIMIT :limit")
    suspend fun getRecentlyWatched(profileId: Long, limit: Int = 50): List<WatchProgress>

    /**
     * Tutti i progressi episodio di una serie. Usato come fallback quando il
     * contentId non corrisponde più agli episodi in DB (playlist/URL cambiato),
     * così il resume può essere recuperato tramite stagione+episodio.
     */
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId AND contentType = 'EPISODE' AND seriesId = :seriesId")
    suspend fun getEpisodeProgressForSeries(profileId: Long, seriesId: Long): List<WatchProgress>

    /**
     * Id dei FILM già visti: completati (flag) oppure a ≤ 6 minuti dalla fine
     * (soglia titoli di coda, coerente con il player). Usato per il badge "visto"
     * sulle card.
     */
    @Query(
        "SELECT contentId FROM watch_progress WHERE profileId = :profileId AND contentType = 'MOVIE' " +
        "AND duration > 0 AND (isCompleted = 1 OR duration - position <= 360000)"
    )
    suspend fun getWatchedMovieIds(profileId: Long): List<Long>

    /**
     * Id delle SERIE finite: quelle in cui TUTTI gli episodi risultano completati
     * (flag o ≤ 6 minuti dalla fine). Usato per il badge "visto" sulle card serie.
     */
    @Query(
        "SELECT e.seriesId FROM episodes e " +
        "LEFT JOIN watch_progress wp ON wp.contentId = e.id AND wp.contentType = 'EPISODE' AND wp.profileId = :profileId " +
        "GROUP BY e.seriesId " +
        "HAVING COUNT(e.id) > 0 AND " +
        "SUM(CASE WHEN wp.isCompleted = 1 OR (wp.duration > 0 AND wp.duration - wp.position <= 360000) THEN 1 ELSE 0 END) = COUNT(e.id)"
    )
    suspend fun getFullyWatchedSeriesIds(profileId: Long): List<Long>
    
    @Query("SELECT * FROM watch_progress WHERE profileId = :profileId AND seriesId = :seriesId ORDER BY lastWatchedAt DESC LIMIT 1")
    suspend fun getSeriesProgress(profileId: Long, seriesId: Long): WatchProgress?

    /**
     * Fallback robusto: risolve il progresso di una serie passando dalla tabella
     * episodi. Copre i progressi con seriesId NULL (righe create da versioni
     * precedenti o da playback avviato direttamente su un episodio).
     */
    @Query(
        "SELECT wp.* FROM watch_progress wp " +
        "INNER JOIN episodes e ON e.id = wp.contentId " +
        "WHERE wp.profileId = :profileId AND wp.contentType = :contentType " +
        "AND e.seriesId = :seriesId ORDER BY wp.lastWatchedAt DESC LIMIT 1"
    )
    suspend fun getSeriesProgressByEpisodes(profileId: Long, contentType: ContentType, seriesId: Long): WatchProgress?
    
    @Query("SELECT * FROM watch_progress")
    suspend fun getAllProgress(): List<WatchProgress>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(progress: WatchProgress): Long
    
    @Update
    suspend fun update(progress: WatchProgress)
    
    @Delete
    suspend fun delete(progress: WatchProgress)
    
    @Query("DELETE FROM watch_progress WHERE profileId = :profileId AND contentType = :contentType AND contentId = :contentId")
    suspend fun deleteProgress(profileId: Long, contentType: ContentType, contentId: Long)
    
    @Query("DELETE FROM watch_progress WHERE profileId = :profileId AND seriesId = :seriesId")
    suspend fun deleteProgressBySeriesId(profileId: Long, seriesId: Long)
    
    @Query("DELETE FROM watch_progress WHERE profileId = :profileId")
    suspend fun deleteAllForProfile(profileId: Long)

    /** Elimina un sottoinsieme di voci per id (selezione multipla in cronologia). */
    @Query("DELETE FROM watch_progress WHERE profileId = :profileId AND id IN (:ids)")
    suspend fun deleteByIds(profileId: Long, ids: List<Long>)
    
    @Transaction
    suspend fun upsert(progress: WatchProgress) {
        val existing = getProgress(progress.profileId, progress.contentType, progress.contentId)
        if (existing != null) {
            update(progress.copy(id = existing.id, createdAt = existing.createdAt))
        } else {
            insert(progress)
        }
    }
}
