package it.wavestream.app.data.repository

import android.util.Log
import androidx.room.withTransaction
import androidx.sqlite.db.SimpleSQLiteQuery
import it.wavestream.app.data.database.AppDatabase
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
    private val ftsSearchDao: FtsSearchDao,
    private val appDatabase: AppDatabase
) {

    companion object {
        private const val TAG = "FtsSearch"
    }

    private var ftsAvailable: Boolean? = null

    /** Rileva (una volta) se il modulo FTS5 è disponibile a runtime. */
    suspend fun isFts5Available(): Boolean {
        ftsAvailable?.let { return it }
        val available = withContext(Dispatchers.IO) {
            try {
                ftsSearchDao.isFts5Available(
                    SimpleSQLiteQuery(
                        "SELECT count(*) FROM sqlite_master WHERE type='table' AND name='fts_channel'"
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
        }.orEmptyOrNull()
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
        }.orEmptyOrNull()
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
        }.orEmptyOrNull()
    }

    /**
     * Un risultato VUOTO dell'indice non significa "nessun contenuto": può voler
     * dire che l'indice è disallineato (vedi [misalignedRows]). In quel caso
     * ritorniamo `null`, così il chiamante ricade sulla query `LIKE` che legge la
     * tabella sorgente (verità assoluta) invece di mostrare zero risultati.
     */
    private fun <T> List<T>?.orEmptyOrNull(): List<T>? =
        if (this.isNullOrEmpty()) null else this

    /**
     * Quante righe sono fuori posto nell'indice full-text:
     *  - contenuti presenti in tabella ma assenti dall'indice (non più cercabili);
     *  - voci in più nell'indice (duplicati/stantie, es. residui di `INSERT OR REPLACE`,
     *    che non fa scattare il trigger di DELETE).
     *
     * Il vecchio controllo confrontava solo i CONTEGGI totali: un duplicato poteva
     * compensare una riga mancante e l'indice restava rotto senza che nessuno se ne
     * accorgesse (film visibile in categoria ma introvabile nella ricerca).
     */
    suspend fun misalignedRows(): Int {
        if (!isFts5Available()) return 0
        return withContext(Dispatchers.IO) {
            try {
                val missing = ftsSearchDao.reindexAll(
                    SimpleSQLiteQuery(
                        "SELECT " +
                            "(SELECT COUNT(*) FROM movies m WHERE NOT EXISTS (SELECT 1 FROM fts_movie f WHERE f.rowid = m.id)) + " +
                            "(SELECT COUNT(*) FROM channels c WHERE NOT EXISTS (SELECT 1 FROM fts_channel f WHERE f.rowid = c.id)) + " +
                            "(SELECT COUNT(*) FROM series s WHERE NOT EXISTS (SELECT 1 FROM fts_series f WHERE f.rowid = s.id))"
                    )
                )
                val extra = ftsSearchDao.reindexAll(
                    SimpleSQLiteQuery(
                        "SELECT ABS((SELECT COUNT(*) FROM fts_movie) - (SELECT COUNT(*) FROM movies)) + " +
                            "ABS((SELECT COUNT(*) FROM fts_channel) - (SELECT COUNT(*) FROM channels)) + " +
                            "ABS((SELECT COUNT(*) FROM fts_series) - (SELECT COUNT(*) FROM series))"
                    )
                )
                missing + extra
            } catch (e: Exception) {
                Log.w(TAG, "misalignedRows failed", e)
                0
            }
        }
    }

    /**
     * Ripopola l'indice FTS5 dalle tabelle sorgente (DELETE + INSERT completo).
     * Gira in UNA transazione: prima ogni statement era a sé e un sync concorrente
     * poteva infilarsi tra il DELETE e gli INSERT, lasciando l'indice incoerente.
     */
    suspend fun rebuildIndex() = withContext(Dispatchers.IO) {
        if (!isFts5Available()) return@withContext
        try {
            appDatabase.withTransaction {
                listOf(
                    "DELETE FROM fts_channel",
                    "INSERT INTO fts_channel(rowid, name, category, logoUrl) " +
                        "SELECT id, name, COALESCE(category,''), COALESCE(logoUrl,'') FROM channels",
                    "DELETE FROM fts_movie",
                    "INSERT INTO fts_movie(rowid, name, category, logoUrl) " +
                        "SELECT id, name, COALESCE(category,''), COALESCE(logoUrl,'') FROM movies",
                    "DELETE FROM fts_series",
                    "INSERT INTO fts_series(rowid, name, category, logoUrl) " +
                        "SELECT id, name, COALESCE(category,''), COALESCE(logoUrl,'') FROM series"
                ).forEach { sql ->
                    ftsSearchDao.reindexAll(SimpleSQLiteQuery(sql))
                }
            }
            Log.i(TAG, "FTS index rebuilt")
        } catch (e: Exception) {
            Log.e(TAG, "FTS rebuild failed", e)
        }
    }

    /** Riallinea l'indice solo se ci sono righe fuori posto. Ritorna true se ha ricostruito. */
    suspend fun rebuildIfNeeded(): Boolean {
        if (!isFts5Available()) return false
        val misaligned = misalignedRows()
        if (misaligned <= 0) return false
        Log.w(TAG, "FTS index misaligned ($misaligned rows) -> rebuilding")
        rebuildIndex()
        return true
    }
}
