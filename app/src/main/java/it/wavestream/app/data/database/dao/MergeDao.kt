package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

/**
 * Operazioni di remap dei riferimenti a un contenuto quando due righe `movies`
 * vengono unificate in una sola (film doppioni).
 *
 * Per le tabelle con vincolo UNIQUE (progress, watch state, preferiti, liste
 * personalizzate) si copiano le righe del duplicato sul canonico con
 * `INSERT OR IGNORE` (le collisioni mantengono il canonico, che è scelto come la
 * riga che possiede i dati quando possibile) e poi si cancellano gli originali.
 * Per le tabelle senza vincolo si fa un semplice UPDATE.
 *
 * `type` è il nome dell'enum [it.wavestream.app.data.database.entity.ContentType]
 * (per i film: 'MOVIE').
 */
@Dao
interface MergeDao {

    // ---- watch_progress ----
    @Query(
        "INSERT OR IGNORE INTO watch_progress " +
        "(profileId, contentType, contentId, seriesId, season, episode, position, duration, isCompleted, lastWatchedAt, createdAt) " +
        "SELECT profileId, contentType, :to, seriesId, season, episode, position, duration, isCompleted, lastWatchedAt, createdAt " +
        "FROM watch_progress WHERE contentType = :type AND contentId = :from"
    )
    suspend fun copyWatchProgress(from: Long, to: Long, type: String)

    @Query("DELETE FROM watch_progress WHERE contentType = :type AND contentId = :from")
    suspend fun deleteWatchProgress(from: Long, type: String)

    // ---- watch_states ----
    @Query(
        "INSERT OR IGNORE INTO watch_states " +
        "(profileId, contentType, contentId, position, duration, progress, isCompleted, seriesId, seasonNumber, episodeNumber, title, thumbnailUrl, lastWatchedAt, createdAt) " +
        "SELECT profileId, contentType, :to, position, duration, progress, isCompleted, seriesId, seasonNumber, episodeNumber, title, thumbnailUrl, lastWatchedAt, createdAt " +
        "FROM watch_states WHERE contentType = :type AND contentId = :from"
    )
    suspend fun copyWatchStates(from: Long, to: Long, type: String)

    @Query("DELETE FROM watch_states WHERE contentType = :type AND contentId = :from")
    suspend fun deleteWatchStates(from: Long, type: String)

    // ---- favorites ----
    @Query(
        "INSERT OR IGNORE INTO favorites " +
        "(profileId, contentType, contentId, title, posterUrl, category, addedAt) " +
        "SELECT profileId, contentType, :to, title, posterUrl, category, addedAt " +
        "FROM favorites WHERE contentType = :type AND contentId = :from"
    )
    suspend fun copyFavorites(from: Long, to: Long, type: String)

    @Query("DELETE FROM favorites WHERE contentType = :type AND contentId = :from")
    suspend fun deleteFavorites(from: Long, type: String)

    // ---- group_items (liste personalizzate) ----
    @Query(
        "INSERT OR IGNORE INTO group_items " +
        "(groupId, contentType, contentId, displayOrder, title, subtitle, posterUrl, streamUrl, isWatched, addedAt) " +
        "SELECT groupId, contentType, :to, displayOrder, title, subtitle, posterUrl, streamUrl, isWatched, addedAt " +
        "FROM group_items WHERE contentType = :type AND contentId = :from"
    )
    suspend fun copyGroupItems(from: Long, to: Long, type: String)

    @Query("DELETE FROM group_items WHERE contentType = :type AND contentId = :from")
    suspend fun deleteGroupItems(from: Long, type: String)

    // ---- downloaded_content (nessun vincolo UNIQUE) ----
    @Query("UPDATE downloaded_content SET contentId = :to WHERE contentType = :type AND contentId = :from")
    suspend fun remapDownloadedContent(from: Long, to: Long, type: String)

    // ---- media_segments (nessun vincolo UNIQUE, ma identità stabile tmdbId/imdbId) ----
    @Query("UPDATE media_segments SET contentId = :to WHERE contentType = :type AND contentId = :from")
    suspend fun remapMediaSegments(from: Long, to: Long, type: String)

    /**
     * Remap completo di tutti i riferimenti da [from] a [to]. Da eseguire in una
     * transazione insieme all'eliminazione del movie duplicato.
     */
    @Transaction
    suspend fun remapAllMovieReferences(from: Long, to: Long, type: String = "MOVIE") {
        copyWatchProgress(from, to, type)
        deleteWatchProgress(from, type)
        copyWatchStates(from, to, type)
        deleteWatchStates(from, type)
        copyFavorites(from, to, type)
        deleteFavorites(from, type)
        copyGroupItems(from, to, type)
        deleteGroupItems(from, type)
        remapDownloadedContent(from, to, type)
        remapMediaSegments(from, to, type)
    }
}
