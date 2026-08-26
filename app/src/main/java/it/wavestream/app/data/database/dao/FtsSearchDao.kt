package it.wavestream.app.data.database.dao

import androidx.room.Dao
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery

/**
 * FASE 4 — Indice Full-Text Search (FTS5).
 *
 * Le tabelle virtuali `fts_channel`, `fts_movie`, `fts_series` vengono create
 * dalla migrazione 25→26 e **non** sono entità Room (Room le ignora come tabelle
 * extra non dichiarate). Per questo tutte le query usano @RawQuery con
 * [SupportSQLiteQuery]: i nomi tabella non vengono validati a compile-time
 * (Room non li conosce) ed è possibile usare la sintassi MATCH di FTS5.
 *
 * L'indice viene mantenuto automaticamente dai trigger definiti nella migrazione
 * (INSERT/UPDATE/DELETE su channels/movies/series). I dati già presenti al momento
 * dell'upgrade vanno riindicizzati chiamando [reindexAll].
 */
data class FtsSearchHit(
    val id: Long,
    val title: String,
    val category: String?,
    val posterUrl: String?,
    val type: String
)

@Dao
interface FtsSearchDao {

    @RawQuery
    fun searchChannels(query: SupportSQLiteQuery): List<FtsSearchHit>

    @RawQuery
    fun searchMovies(query: SupportSQLiteQuery): List<FtsSearchHit>

    @RawQuery
    fun searchSeries(query: SupportSQLiteQuery): List<FtsSearchHit>

    /**
     * Backfill dell'indice FTS dai dati correnti (da chiamare all'avvio o dopo
     * un upgrade). Svuota e ripopola le tre tabelle virtuali.
     * Ritorna il numero di righe interessate (Room richiede un tipo non-void
     * per @RawQuery).
     */
    @RawQuery
    fun reindexAll(query: SupportSQLiteQuery): Int
}
