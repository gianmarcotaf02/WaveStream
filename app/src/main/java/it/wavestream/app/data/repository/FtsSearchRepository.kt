package it.wavestream.app.data.repository

import androidx.sqlite.db.SimpleSQLiteQuery
import it.wavestream.app.data.database.dao.FtsSearchDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.Series
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * FASE 4 — Ricerca Full-Text (FTS5) con fallback automatico a LIKE.
 *
 * FTS5 NON è compilato in tutti i device (alcuni OEM/emulatori non lo includono
 * nel SQLite di sistema). Questo repository:
 *  - rileva la disponibilità di FTS5 una sola volta (cached);
 *  - se disponibile, cerca sulle tabelle virtuali `fts_*` (JOIN con la sorgente);
 *  - se non disponibile (o l'indice non esiste / errore), ritorna `null` e il
 *    chiamante usa il normale fallback `LIKE`.
 */
@Singleton
class FtsSearchRepository @Inject constructor(
    private val ftsSearchDao: FtsSearchDao
) {

    private var ftsAvailable: Boolean? = null

    /** Rileva (una volta) se il modulo FTS5 è disponibile a runtime. */
    suspend fun isFts5Available(): Boolean {
        ftsAvailable?.let { return it }
        val available = withContext(Dispatchers.IO) {
            try {
                ftsSearchDao.isFts5Available(
                    SimpleSQLiteQuery(
                        "SELECT count(*) FROM pragma_compile_options WHERE compile_options = 'ENABLE_FTS5'"
                    )
                ) > 0
            } catch (e: Exception) {
                false
            }
        }
        ftsAvailable = available
        return available
    }

    /**
     * Costruisce la query MATCH per FTS5 dai termini digitati.
     * Ogni token diventa un prefix match (`term*`), i token sono uniti con AND.
     * Ritorna null se non ci sono termini validi (il chiamante userà LIKE).
     */
    private fun buildMatchQuery(raw: String): String? {
        val cleaned = raw.filter { it.isLetterOrDigit() || it == ' ' }
        val tokens = cleaned.split(' ').filter { it.isNotBlank() }
        if (tokens.isEmpty()) return null
        return tokens.joinToString(" ") { "${it}*" }
    }

    /** Ricerca canali: ritorna List<Channel> se FTS disponibile, altrimenti null. */
    suspend fun searchChannels(raw: String): List<Channel>? {
        if (!isFts5Available()) return null
        val match = buildMatchQuery(raw) ?: return null
        return withContext(Dispatchers.IO) {
            try {
                ftsSearchDao.searchChannelsFts(
                    SimpleSQLiteQuery(
                        "SELECT c.* FROM channels c JOIN fts_channel f ON f.rowid = c.id " +
                            "WHERE fts_channel MATCH ? ORDER BY f.rank LIMIT 50",
                        arrayOf(match)
                    )
                )
            } catch (e: Exception) {
                null
            }
        }
    }

    /** Ricerca film: ritorna List<Movie> se FTS disponibile, altrimenti null. */
    suspend fun searchMovies(raw: String): List<Movie>? {
        if (!isFts5Available()) return null
        val match = buildMatchQuery(raw) ?: return null
        return withContext(Dispatchers.IO) {
            try {
                ftsSearchDao.searchMoviesFts(
                    SimpleSQLiteQuery(
                        "SELECT m.* FROM movies m JOIN fts_movie f ON f.rowid = m.id " +
                            "WHERE fts_movie MATCH ? ORDER BY f.rank LIMIT 50",
                        arrayOf(match)
                    )
                )
            } catch (e: Exception) {
                null
            }
        }
    }

    /** Ricerca serie: ritorna List<Series> se FTS disponibile, altrimenti null. */
    suspend fun searchSeries(raw: String): List<Series>? {
        if (!isFts5Available()) return null
        val match = buildMatchQuery(raw) ?: return null
        return withContext(Dispatchers.IO) {
            try {
                ftsSearchDao.searchSeriesFts(
                    SimpleSQLiteQuery(
                        "SELECT s.* FROM series s JOIN fts_series f ON f.rowid = s.id " +
                            "WHERE fts_series MATCH ? ORDER BY f.rank LIMIT 50",
                        arrayOf(match)
                    )
                )
            } catch (e: Exception) {
                null
            }
        }
    }
}
