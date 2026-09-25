package it.wavestream.app.data.repository

import android.util.Log
import androidx.room.withTransaction
import it.wavestream.app.data.cache.ContentCache
import it.wavestream.app.data.database.AppDatabase
import it.wavestream.app.data.database.dao.MergeDao
import it.wavestream.app.data.database.dao.MovieCategoryDao
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.ProviderPreserve
import it.wavestream.app.data.database.dao.StreamProviderDao
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.MovieCategory
import it.wavestream.app.data.database.entity.StreamProvider
import it.wavestream.app.data.database.entity.StreamQuality
import it.wavestream.app.data.parser.ContentKey
import it.wavestream.app.data.parser.ContentNameParser
import it.wavestream.app.data.preferences.UserPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Unifica i doppioni/versioni di uno stesso film pubblicati dal provider in una
 * sola riga [Movie] canonica, mantenendo ogni stream fisico come [StreamProvider]
 * e **tutte** le categorie di appartenenza come [MovieCategory].
 *
 * - Fase A ([persistGroupedMovies]): al momento del parsing/sync, i VOD con lo
 *   stesso titolo+anno vengono raggruppati senza alcuna chiamata di rete.
 * - Fase B ([unifyPlaylist]): dopo l'arricchimento TMDB, unisce anche le righe
 *   con stesso `tmdbId`/`imdbId` o leftover storici.
 * - Tutti i riferimenti (progressi, preferiti, download, liste, segmenti) vengono
 *   rimappati sul canonico prima di eliminare il duplicato: nessun dato utente
 *   viene perso.
 */
@Singleton
class MovieUnificationService @Inject constructor(
    private val appDatabase: AppDatabase,
    private val movieDao: MovieDao,
    private val movieCategoryDao: MovieCategoryDao,
    private val streamProviderDao: StreamProviderDao,
    private val mergeDao: MergeDao,
    private val contentNameParser: ContentNameParser,
    private val contentCache: ContentCache,
    private val userPreferences: UserPreferences
) {
    companion object {
        private const val TAG = "MovieUnify"

        /** Dimensione dei batch di scrittura (movie/provider/categorie). */
        private const val FLUSH_BATCH = 2000
    }

    /** Sorgente risolta pronta per essere persistita (Xtream o M3U). */
    data class MovieSourceInput(
        val rawName: String,
        val streamUrl: String,
        val poster: String? = null,
        val backdrop: String? = null,
        val category: String? = null,
        val categoryId: String? = null,
        val xtreamStreamId: Int? = null,
        val containerExtension: String? = null,
        val rating: String? = null,
        val year: Int? = null,
        val playlistOrder: Int = 0,
        val providerName: String? = null
    )

    // ---------------------------------------------------------------------
    // Fase A — persistenza raggruppata (parsing-time, nessuna rete)
    // ---------------------------------------------------------------------

    /**
     * Persiste un set di sorgenti raggruppandole per titolo+anno in un unico
     * [Movie] canonico. Riusa gli id esistenti quando possibile (per non perdere
     * progressi/preferiti), unisce gli eventuali duplicati storici e ritorna il
     * numero di film canonici.
     */
    suspend fun persistGroupedMovies(
        playlistId: Long,
        inputs: List<MovieSourceInput>
    ): Int = withContext(Dispatchers.IO) {
        if (inputs.isEmpty()) return@withContext 0

        // Tutta la persistenza gira in UNA sola transazione Room: prima ogni
        // update/insert/delete era una transazione a sé (con decine di migliaia di
        // VOD si traducevano in centinaia di migliaia di commit → minuti di sync).
        appDatabase.withTransaction {
        val startedAt = System.currentTimeMillis()
        val existing = movieDao.getAllByPlaylistIncludingHidden(playlistId)
        Log.i(TAG, "persist: ${inputs.size} sorgenti, ${existing.size} film in DB (+${System.currentTimeMillis() - startedAt}ms)")
        // Titolo normalizzato calcolato UNA sola volta per film esistente e riusato
        // per la mappa a chiave esatta e per quella di fallback per titolo (prima
        // normalizeTitle girava due volte su ogni riga esistente).
        val existingNormTitle = HashMap<Long, String>(existing.size * 2)
        existing.forEach { m ->
            existingNormTitle[m.id] = ContentKey.normalizeTitle(
                m.cleanName?.takeIf { it.isNotBlank() } ?: titleFor(m.name)
            )
        }
        val existingByKey = existing.groupBy { ContentKey.groupKeyNormalized(existingNormTitle.getValue(it.id), it.year) }
        Log.i(TAG, "persist: existingByKey +${System.currentTimeMillis() - startedAt}ms")
        val existingByTitle = existing.groupBy { existingNormTitle.getValue(it.id) }
        Log.i(TAG, "persist: existingByTitle +${System.currentTimeMillis() - startedAt}ms")
        val consumed = mutableSetOf<Long>()
        val active = mutableSetOf<Long>()

        // Prefetch proiettato (solo i campi da conservare) di una query invece di
        // una per VOD: serve a preservare durata/data di aggiunta/data d'uso.
        val existingProvidersByXtreamId = streamProviderDao.getPreservableByPlaylist(playlistId)
            .associateBy { it.xtreamStreamId }
        Log.i(TAG, "persist: providers prefetch=${existingProvidersByXtreamId.size} +${System.currentTimeMillis() - startedAt}ms")

        // Sorgenti e appartenenze di categoria vengono azzerate UNA volta e
        // riscritte in batch a fine sync. Prima erano N insert/delete per film: su
        // ~70k VOD significavano centinaia di migliaia di chiamate Room (minuti di
        // sync, con il pool DB saturato per i lettori concorrenti).
        streamProviderDao.deleteByPlaylist(playlistId)
        Log.i(TAG, "persist: delete providers +${System.currentTimeMillis() - startedAt}ms")
        movieCategoryDao.deleteByPlaylist(playlistId)
        Log.i(TAG, "persist: delete categories +${System.currentTimeMillis() - startedAt}ms")

        val groups = ContentKey.groupByTitleAndYearWithKeys(
            items = inputs,
            titleOf = { titleFor(it.rawName) },
            yearOf = { it.year }
        )
        Log.i(TAG, "persist: ${groups.size} gruppi (+${System.currentTimeMillis() - startedAt}ms)")
        var flushMs = 0L

        val moviesToWrite = ArrayList<Movie>(FLUSH_BATCH)
        val providersToWrite = ArrayList<StreamProvider>(FLUSH_BATCH)
        val categoriesToWrite = ArrayList<MovieCategory>(FLUSH_BATCH)
        var processed = 0

        // Flush incrementale: mantiene basso il picco di memoria e sfrutta le
        // insert/update batch (una sola acquisizione di connessione per batch).
        suspend fun flushIfNeeded() {
            if (moviesToWrite.size >= FLUSH_BATCH) {
                val t = System.currentTimeMillis(); movieDao.updateList(moviesToWrite); moviesToWrite.clear(); flushMs += System.currentTimeMillis() - t
            }
            if (providersToWrite.size >= FLUSH_BATCH) {
                val t = System.currentTimeMillis(); streamProviderDao.insertAll(providersToWrite); providersToWrite.clear(); flushMs += System.currentTimeMillis() - t
            }
            if (categoriesToWrite.size >= FLUSH_BATCH) {
                val t = System.currentTimeMillis(); movieCategoryDao.insertAll(categoriesToWrite); categoriesToWrite.clear(); flushMs += System.currentTimeMillis() - t
            }
        }

        for ((groupNormTitle, rawGroup) in groups) {
            // Ordina per qualità decrescente: la prima è la sorgente "primaria".
            val group = rawGroup.sortedByDescending { qualityRankOf(it.rawName) }
            val primary = group.first()
            val cleanTitle = titleFor(primary.rawName).ifBlank { primary.rawName.trim() }
            val year = group.firstNotNullOfOrNull { it.year }

            // Il titolo normalizzato arriva già calcolato dal raggruppamento: niente
            // seconda normalizeTitle per gruppo (~70k in meno a ogni refresh).
            val normTitle = groupNormTitle
            val groupKey = ContentKey.groupKeyNormalized(normTitle, year)

            // Righe esistenti corrispondenti: prima per chiave esatta, altrimenti
            // stesso titolo normalizzato e stesso anno (evita merge tra remake).
            val exact = existingByKey[groupKey]
                ?.filter { it.id !in consumed }
                .orEmpty()
            val candidates = if (exact.isNotEmpty()) exact else existingByTitle[normTitle]
                ?.filter { it.id !in consumed && it.year == year }
                .orEmpty()
            candidates.forEach { consumed.add(it.id) }

            val canonicalExisting = candidates.minByOrNull { it.id }
            var movie = buildCanonicalMovie(playlistId, cleanTitle, year, primary, group.size, canonicalExisting)
            val movieId: Long
            if (canonicalExisting != null) {
                // Il merge può unire campi (tmdbId/poster/...) dei duplicati: usiamo
                // il risultato per non sovrascriverli al momento del flush.
                val duplicates = candidates.filter { it.id != canonicalExisting.id }
                if (duplicates.isNotEmpty()) {
                    mergeDuplicatesInto(canonicalExisting.id, duplicates)
                        ?.let { movie = it.copy(streamCount = group.size) }
                }
                // Se buildCanonicalMovie ha riusato la riga invariata, nessuna scrittura.
                if (movie !== canonicalExisting) moviesToWrite.add(movie)
                movieId = movie.id
            } else {
                // L'id serve subito per collegare sorgenti/categorie: solo i film
                // nuovi (primo import) passano da un insert singolo.
                movieId = movieDao.insert(movie)
            }
            active.add(movieId)

            providersToWrite += buildProviders(playlistId, movieId, group, primary, existingProvidersByXtreamId)
            categoriesToWrite += buildCategories(playlistId, movieId, group)
            flushIfNeeded()
            if (++processed % 1000 == 0) {
                Log.i(TAG, "persist: $processed/${groups.size} gruppi in ${System.currentTimeMillis() - startedAt}ms (flush=$flushMs)")
            }
        }

        // Flush finale
        if (moviesToWrite.isNotEmpty()) movieDao.updateList(moviesToWrite)
        if (providersToWrite.isNotEmpty()) streamProviderDao.insertAll(providersToWrite)
        if (categoriesToWrite.isNotEmpty()) movieCategoryDao.insertAll(categoriesToWrite)
        Log.i(TAG, "persist: FINE ${inputs.size} sorgenti → ${active.size} film in ${System.currentTimeMillis() - startedAt}ms (flush=$flushMs)")

        // Elimina i film della playlist scomparsi dal provider (i duplicati sono
        // già stati fusi sopra). La cancellazione a cascata rimuove sorgenti e
        // categorie; i riferimenti utente a contenuti rimossi decadono.
        val removed = existing.filter { it.id !in active && it.id !in consumed }
        for (m in removed) {
            try {
                movieDao.delete(m)
            } catch (e: Exception) {
                Log.w(TAG, "Failed to delete removed movie ${m.id}", e)
            }
        }

        active.size
        }
    }

    // ---------------------------------------------------------------------
    // Refresh incrementale (Xtream) — solo sorgenti nuove/cambiate/rimosse
    // ---------------------------------------------------------------------

    /**
     * Refresh incrementale di una playlist Xtream.
     *
     * A differenza di [persistGroupedMovies] (che ricostruisce TUTTO il catalogo
     * a ogni chiamata), qui i film già unificati e le loro sorgenti **restano in
     * DB senza essere riletti né riscritti**: vengono toccate solo le sorgenti
     * nuove, quelle il cui nome grezzo è cambiato e quelle scomparse dal provider.
     *
     * Nei refresh quotidiani, dove l'utente aggiunge/rimuove pochi titoli, il
     * lavoro è quindi proporzionale ai nuovi arrivi e non alle decine di migliaia
     * di VOD dell'intero catalogo. La ricerca dei doppioni viene fatta una volta
     * sola (import/primo refresh); ai successivi si limita ai nuovi contenuti.
     *
     * Ritorna il numero di film canonici della playlist.
     */
    suspend fun refreshGroupedMoviesIncremental(
        playlistId: Long,
        inputs: List<MovieSourceInput>
    ): Int = withContext(Dispatchers.IO) {
        if (inputs.isEmpty()) return@withContext movieDao.countByPlaylist(playlistId)

        appDatabase.withTransaction {
            val startedAt = System.currentTimeMillis()

            // Proiezione leggera (id stream → film + nome grezzo): niente caricamento
            // di decine di migliaia di Movie con tutti i campi TMDB.
            val existingProviders = streamProviderDao.getPreservableByPlaylist(playlistId)
            val existingByXtream = existingProviders.associateBy { it.xtreamStreamId }
            Log.i(TAG, "refresh incr: ${inputs.size} sorgenti, ${existingByXtream.size} già presenti (+${System.currentTimeMillis() - startedAt}ms)")

            val incomingIds = HashSet<Int>(inputs.size * 2)
            val toPlace = ArrayList<MovieSourceInput>()
            for (src in inputs) {
                val xtreamId = src.xtreamStreamId ?: continue
                incomingIds.add(xtreamId)
                val prev = existingByXtream[xtreamId]
                // Nuova, oppure nome/qualità/edizione/lingua cambiati: da (ri)posizionare.
                // Tutto il resto resta esattamente com'è: nessuna riscrittura.
                if (prev == null || prev.originalName != src.rawName) toPlace.add(src)
            }
            val removedIds = existingByXtream.keys.filter { it !in incomingIds }
            Log.i(TAG, "refresh incr: ${toPlace.size} nuove/cambiate, ${removedIds.size} rimosse (+${System.currentTimeMillis() - startedAt}ms)")

            // Film canonici effettivamente toccati: solo questi vanno riallineati.
            val touched = HashSet<Long>()

            if (removedIds.isNotEmpty()) {
                removedIds.mapNotNullTo(touched) { existingByXtream[it]?.movieId }
                streamProviderDao.deleteByXtreamIds(playlistId, removedIds)
            }

            if (toPlace.isNotEmpty()) {
                // Le sorgenti cambiate vanno rimosse dal film attuale prima di essere
                // ricollocate: l'indice unico (playlistId, xtreamStreamId) impedirebbe
                // altrimenti il re-insert.
                val changedIds = toPlace.mapNotNull { it.xtreamStreamId }.filter { it in existingByXtream }
                if (changedIds.isNotEmpty()) {
                    changedIds.mapNotNullTo(touched) { existingByXtream[it]?.movieId }
                    streamProviderDao.deleteByXtreamIds(playlistId, changedIds)
                }

                // Raggruppa SOLO le sorgenti da posizionare (di norma poche unità).
                val groups = ContentKey.groupByTitleAndYearWithKeys(
                    items = toPlace,
                    titleOf = { titleFor(it.rawName) },
                    yearOf = { it.year }
                )
                for ((normTitle, rawGroup) in groups) {
                    val group = rawGroup.sortedByDescending { qualityRankOf(it.rawName) }
                    val primary = group.first()
                    val cleanTitle = titleFor(primary.rawName).ifBlank { primary.rawName.trim() }
                    val year = group.firstNotNullOfOrNull { it.year }
                    val groupKey = ContentKey.groupKeyNormalized(normTitle, year)

                    val canonical = movieDao.getByPlaylistAndGroupKey(playlistId, groupKey).minByOrNull { it.id }
                    val movieId = canonical?.id ?: movieDao.insert(
                        buildCanonicalMovie(playlistId, cleanTitle, year, primary, group.size, null)
                    )
                    touched.add(movieId)
                    streamProviderDao.insertAll(
                        buildProviders(playlistId, movieId, group, primary, existingByXtream)
                    )
                    movieCategoryDao.insertAll(buildCategories(playlistId, movieId, group))
                }
            }

            // Riallinea streamCount/categorie solo per i film toccati ed elimina
            // quelli rimasti senza alcuna sorgente.
            if (touched.isNotEmpty()) {
                val counts = streamProviderDao.getProviderCountsForMovies(touched.toList())
                    .associate { it.movieId to it.count }
                val empty = touched.filter { (counts[it] ?: 0) == 0 }
                if (empty.isNotEmpty()) movieDao.deleteByIds(empty)
                val alive = touched - empty.toSet()
                if (alive.isNotEmpty()) movieDao.getByIds(alive.toList()).forEach { ensureMovieIntegrity(it) }
            }

            Log.i(TAG, "refresh incr: FINE toccati=${touched.size} (+${System.currentTimeMillis() - startedAt}ms)")
            movieDao.countByPlaylist(playlistId)
        }
    }

    // ---------------------------------------------------------------------
    // Fase B — unificazione post-enrichment / pulizia
    // ---------------------------------------------------------------------

    /** Unisce i duplicati di una playlist (per titolo+anno e per tmdbId) e
     *  ripristina l'integrità di sorgenti/categorie/streamCount. */
    suspend fun unifyPlaylist(playlistId: Long) = withContext(Dispatchers.IO) {
        appDatabase.withTransaction {
            unifyPlaylistLocked(playlistId, movieDao.getAllByPlaylistIncludingHidden(playlistId))
        }
    }

    /** Corpo di [unifyPlaylist] su una lista di film già in memoria: evita una
     *  scansione completa della playlist quando i film sono già stati caricati. */
    private suspend fun unifyPlaylistLocked(playlistId: Long, movies: List<Movie>) {
        mergeByTitleAndYear(movies)
        unifyByTmdbIdLocked(movies)
        // Integrità: solo per i film senza sorgente o senza cleanName (economico).
        val counts = streamProviderDao.getProviderCountsByPlaylist(playlistId).associate { it.movieId to it.count }
        movies.forEach { m ->
            if (m.cleanName.isNullOrBlank() || (counts[m.id] ?: 0) == 0) ensureMovieIntegrity(m)
        }
    }

    /** Unisce solo le righe che condividono lo stesso `tmdbId` (leggero, adatto
     *  a girare dopo l'arricchimento TMDB). */
    suspend fun unifyByTmdbId(playlistId: Long) = withContext(Dispatchers.IO) {
        appDatabase.withTransaction {
            unifyByTmdbIdLocked(movieDao.getAllByPlaylistIncludingHidden(playlistId))
        }
    }

    private suspend fun unifyByTmdbIdLocked(movies: List<Movie>) {
        // Filtro prima del groupBy: i film senza tmdbId (la maggioranza) non
        // entrano nelle mappe temporanee.
        for ((_, group) in movies.filter { it.tmdbId != null }.groupBy { it.tmdbId!! }) {
            if (group.size > 1) {
                val canonical = group.minByOrNull { it.id } ?: continue
                mergeDuplicatesInto(canonical.id, group.filter { it.id != canonical.id })
            }
        }
    }

    private suspend fun mergeByTitleAndYear(movies: List<Movie>) {
        for (group in ContentKey.groupByTitleAndYear(movies, { it.cleanName ?: it.name }, { it.year })) {
            if (group.size > 1) {
                val canonical = group.minByOrNull { it.id } ?: continue
                mergeDuplicatesInto(canonical.id, group.filter { it.id != canonical.id })
            }
        }
    }

    /** Unifica tutte le playlist (usato dopo un refresh completo). */
    suspend fun unifyAllPlaylists() = withContext(Dispatchers.IO) {
        // Una sola lettura dell'intera tabella: prima era una scansione per playlist.
        movieDao.getAllMoviesIncludingHidden().groupBy { it.playlistId }
            .forEach { (playlistId, movies) ->
                appDatabase.withTransaction { unifyPlaylistLocked(playlistId, movies) }
            }
    }

    /** Unifica per `tmdbId` tutte le playlist (leggero, post-arricchimento). */
    suspend fun unifyByTmdbIdAllPlaylists() = withContext(Dispatchers.IO) {
        // Una sola lettura dell'intera tabella: prima era una scansione per playlist.
        movieDao.getAllMoviesIncludingHidden().groupBy { it.playlistId }
            .forEach { (_, movies) ->
                appDatabase.withTransaction { unifyByTmdbIdLocked(movies) }
            }
    }

    // ---------------------------------------------------------------------
    // Migrazione una-tantum sui dati esistenti
    // ---------------------------------------------------------------------

    /**
     * Migrazione dei dati pre-esistenti: crea una sorgente per ogni film che non
     * ne ha, popola `cleanName`/`groupKey`/`streamCount` e le appartenenze
     * multi-categoria, poi unifica i duplicati. Idempotente e guardata da flag.
     */
    suspend fun runFirstTimeIfNeeded() {
        if (userPreferences.isMoviesUnifiedV1()) return
        withContext(Dispatchers.IO) {
            try {
                appDatabase.withTransaction {
                val all = movieDao.getAllMoviesIncludingHidden()
                Log.i(TAG, "First-time movie unification: ${all.size} movies, ${all.map { it.playlistId }.distinct().size} playlists")

                // Backfill incrementale/resumabile: processa solo i film che non hanno
                // ancora una sorgente o il titolo pulito. Se l'app viene chiusa a metà,
                // al riavvio riparte solo da quelli mancanti.
                val counts = streamProviderDao.getAllProviderCounts().associate { it.movieId to it.count }
                val needsWork = all.filter { it.cleanName.isNullOrBlank() || (counts[it.id] ?: 0) == 0 }
                Log.i(TAG, "First-time movie unification: ${needsWork.size} movies need providers/cleanName")
                needsWork.forEach { ensureMovieIntegrity(it) }

                // Unificazione per playlist (dai film già in memoria: nessuna
                // scansione aggiuntiva della tabella)
                all.groupBy { it.playlistId }.forEach { (playlistId, movies) ->
                    unifyPlaylistLocked(playlistId, movies)
                }
                }

                contentCache.clearHomeSessionData()
                userPreferences.setMoviesUnifiedV1(true)
                Log.i(TAG, "First-time movie unification completed")
            } catch (e: Exception) {
                Log.e(TAG, "First-time movie unification failed", e)
            }
        }
    }

    // ---------------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------------

    private fun titleFor(rawName: String): String =
        contentNameParser.cleanTitle(rawName).ifBlank { rawName.trim() }

    private fun qualityRankOf(rawName: String): Int =
        contentNameParser.qualityRank(contentNameParser.detectQuality(rawName))

    private fun buildCanonicalMovie(
        playlistId: Long,
        cleanTitle: String,
        year: Int?,
        primary: MovieSourceInput,
        streamCount: Int,
        existing: Movie?
    ): Movie {
        val base = existing ?: Movie(
            playlistId = playlistId,
            name = cleanTitle,
            streamUrl = primary.streamUrl
        )
        val resolvedYear = year ?: existing?.year
        val targetGroupKey = ContentKey.groupKey(cleanTitle, resolvedYear)

        // Catalogo immutato → nessuna variazione: riusa la riga esistente senza
        // nemmeno allocare il copy, così la caller può saltare l'update
        // (su un refresh senza cambiamenti evita ~55k riscritture).
        if (existing != null) {
            val unchanged =
                existing.name == cleanTitle &&
                existing.cleanName == cleanTitle &&
                existing.groupKey == targetGroupKey &&
                existing.streamCount == streamCount &&
                existing.streamUrl == primary.streamUrl &&
                existing.logoUrl == (primary.poster ?: existing.logoUrl) &&
                existing.xtreamBackdropUrl == (primary.backdrop ?: existing.xtreamBackdropUrl) &&
                existing.category == (primary.category ?: existing.category) &&
                existing.categoryId == (primary.categoryId ?: existing.categoryId) &&
                existing.xtreamStreamId == (primary.xtreamStreamId ?: existing.xtreamStreamId) &&
                existing.containerExtension == (primary.containerExtension ?: existing.containerExtension) &&
                existing.xtreamRating == (primary.rating ?: existing.xtreamRating) &&
                existing.year == resolvedYear &&
                existing.playlistOrder == primary.playlistOrder
            if (unchanged) return existing
        }

        return base.copy(
            name = cleanTitle,
            cleanName = cleanTitle,
            groupKey = targetGroupKey,
            streamCount = streamCount,
            streamUrl = primary.streamUrl,
            logoUrl = primary.poster ?: base.logoUrl,
            xtreamBackdropUrl = primary.backdrop ?: base.xtreamBackdropUrl,
            category = primary.category ?: base.category,
            categoryId = primary.categoryId ?: base.categoryId,
            xtreamStreamId = primary.xtreamStreamId ?: base.xtreamStreamId,
            containerExtension = primary.containerExtension ?: base.containerExtension,
            xtreamRating = primary.rating ?: base.xtreamRating,
            year = resolvedYear,
            playlistOrder = primary.playlistOrder
        )
    }

    private fun buildProviders(
        playlistId: Long,
        movieId: Long,
        group: List<MovieSourceInput>,
        primary: MovieSourceInput,
        existingProvidersByXtreamId: Map<Int, ProviderPreserve>
    ): List<StreamProvider> {
        val result = ArrayList<StreamProvider>(group.size)
        for (src in group) {
            // skipTitle: qui servono solo lingua/HDR/edizione, il titolo pulito no
            // (ricostruirlo per ogni sorgente era ~69k cleanTitle inutili).
            val parsed = contentNameParser.parse(src.rawName, skipTitle = true)
            val quality = contentNameParser.detectQuality(src.rawName)
            val existing = src.xtreamStreamId?.let { existingProvidersByXtreamId[it] }
            result.add(
                StreamProvider(
                    id = 0,
                    movieId = movieId,
                    seriesId = null,
                    tmdbId = existing?.tmdbId,
                    playlistId = playlistId,
                    streamUrl = src.streamUrl,
                    originalName = src.rawName,
                    category = src.category,
                    categoryId = src.categoryId,
                    xtreamStreamId = src.xtreamStreamId,
                    containerExtension = src.containerExtension,
                    logoUrl = src.poster,
                    year = src.year,
                    quality = quality,
                    qualityRank = contentNameParser.qualityRank(quality),
                    resolution = contentNameParser.detectResolution(src.rawName),
                    language = parsed.language,
                    isExtended = parsed.isExtended,
                    isHdr = parsed.isHdr,
                    is4K = quality == StreamQuality.UHD || quality == StreamQuality.UHD_4K,
                    durationSeconds = existing?.durationSeconds,
                    providerName = src.providerName,
                    playlistOrder = src.playlistOrder,
                    isPrimary = src === primary || src.xtreamStreamId == primary.xtreamStreamId && src.streamUrl == primary.streamUrl,
                    addedAt = existing?.addedAt ?: System.currentTimeMillis(),
                    lastUsedAt = existing?.lastUsedAt,
                    detectedHeight = existing?.detectedHeight,
                    detectedAt = existing?.detectedAt
                )
            )
        }
        return result
    }

    private fun buildCategories(
        playlistId: Long,
        movieId: Long,
        group: List<MovieSourceInput>
    ): List<MovieCategory> =
        group.mapNotNull { it.category?.takeIf { c -> c.isNotBlank() } }
            .distinct()
            .map { MovieCategory(movieId = movieId, playlistId = playlistId, category = it) }

    /**
     * Fonde [duplicates] nel movie [canonicalId]: rimappa tutti i riferimenti
     * utente, sposta le sorgenti, unisce le categorie e i metadati, elimina i
     * duplicati.
     */
    private suspend fun mergeDuplicatesInto(canonicalId: Long, duplicates: List<Movie>): Movie? {
        var canonical = movieDao.getMovieById(canonicalId) ?: return null
        for (dup in duplicates) {
            if (dup.id == canonicalId) continue
            try {
                mergeDao.remapAllMovieReferences(dup.id, canonicalId)
            } catch (e: Exception) {
                Log.w(TAG, "Remap references ${dup.id} -> $canonicalId failed", e)
            }

            // Sposta le sorgenti (se collide l'indice unico, elimina quelle del dup)
            try {
                streamProviderDao.reassignToMovie(dup.id, canonicalId)
            } catch (e: Exception) {
                Log.w(TAG, "Reassign providers ${dup.id} -> $canonicalId failed, deleting dup providers", e)
                streamProviderDao.deleteByMovie(dup.id)
            }

            // Unione categorie
            runCatching {
                val dupCats = movieCategoryDao.getForMovie(dup.id)
                if (dupCats.isNotEmpty()) {
                    movieCategoryDao.insertAll(dupCats.map { it.copy(id = 0, movieId = canonicalId) })
                }
                movieCategoryDao.deleteByMovie(dup.id)
            }

            canonical = mergeMovieFields(canonical, dup)
            movieDao.delete(dup)
        }

        // Riallinea streamCount e categorie dalle sorgenti effettive
        val providerCats = streamProviderDao.getProvidersForMovieList(canonicalId)
            .mapNotNull { it.category?.takeIf { c -> c.isNotBlank() } }
        if (providerCats.isNotEmpty()) {
            movieCategoryDao.insertAll(providerCats.distinct().map {
                MovieCategory(movieId = canonicalId, playlistId = canonical.playlistId, category = it)
            })
        }
        val count = streamProviderDao.countProvidersForMovie(canonicalId)
        val updated = canonical.copy(streamCount = maxOf(count, 1))
        movieDao.update(updated)
        return updated
    }

    /** Garantisce che un movie abbia una sorgente, cleanName/groupKey/streamCount
     *  e le appartenenze di categoria coerenti. */
    private suspend fun ensureMovieIntegrity(m: Movie) {
        if (streamProviderDao.countProvidersForMovie(m.id) == 0) {
            val parsed = contentNameParser.parse(m.name)
            val quality = contentNameParser.detectQuality(m.name)
            streamProviderDao.insert(
                StreamProvider(
                    movieId = m.id,
                    playlistId = m.playlistId,
                    streamUrl = m.streamUrl,
                    originalName = m.name,
                    category = m.category,
                    categoryId = m.categoryId,
                    xtreamStreamId = m.xtreamStreamId,
                    containerExtension = m.containerExtension,
                    logoUrl = m.logoUrl,
                    year = m.year,
                    quality = quality,
                    qualityRank = contentNameParser.qualityRank(quality),
                    resolution = contentNameParser.detectResolution(m.name),
                    language = parsed.language,
                    isExtended = parsed.isExtended,
                    isHdr = parsed.isHdr,
                    is4K = quality == StreamQuality.UHD || quality == StreamQuality.UHD_4K,
                    durationSeconds = m.duration,
                    playlistOrder = m.playlistOrder,
                    isPrimary = true,
                    addedAt = m.addedAt
                )
            )
        }

        val cleanName = m.cleanName?.takeIf { it.isNotBlank() } ?: titleFor(m.name)
        val groupKey = ContentKey.groupKey(cleanName, m.year)
        val count = maxOf(streamProviderDao.countProvidersForMovie(m.id), 1)
        if (m.cleanName != cleanName || m.groupKey != groupKey || m.streamCount != count) {
            movieDao.update(m.copy(cleanName = cleanName, groupKey = groupKey, streamCount = count))
        }

        val providerCats = streamProviderDao.getProvidersForMovieList(m.id)
            .mapNotNull { it.category?.takeIf { c -> c.isNotBlank() } }
        val cats = (providerCats + listOfNotNull(m.category?.takeIf { it.isNotBlank() })).distinct()
        if (cats.isNotEmpty()) {
            movieCategoryDao.deleteByMovieExcept(m.id, cats)
            movieCategoryDao.insertAll(cats.map {
                MovieCategory(movieId = m.id, playlistId = m.playlistId, category = it)
            })
        } else {
            movieCategoryDao.deleteByMovie(m.id)
        }
    }

    private fun mergeMovieFields(a: Movie, b: Movie): Movie = a.copy(
        cleanName = a.cleanName ?: b.cleanName,
        groupKey = a.groupKey ?: b.groupKey,
        logoUrl = a.logoUrl ?: b.logoUrl,
        xtreamPlot = a.xtreamPlot ?: b.xtreamPlot,
        xtreamBackdropUrl = a.xtreamBackdropUrl ?: b.xtreamBackdropUrl,
        xtreamCast = a.xtreamCast ?: b.xtreamCast,
        xtreamDirector = a.xtreamDirector ?: b.xtreamDirector,
        xtreamGenre = a.xtreamGenre ?: b.xtreamGenre,
        xtreamRating = a.xtreamRating ?: b.xtreamRating,
        xtreamYoutubeTrailer = a.xtreamYoutubeTrailer ?: b.xtreamYoutubeTrailer,
        containerExtension = a.containerExtension ?: b.containerExtension,
        tmdbId = a.tmdbId ?: b.tmdbId,
        tmdbPosterPath = a.tmdbPosterPath ?: b.tmdbPosterPath,
        tmdbBackdropPath = a.tmdbBackdropPath ?: b.tmdbBackdropPath,
        tmdbTitle = a.tmdbTitle ?: b.tmdbTitle,
        tmdbOriginalTitle = a.tmdbOriginalTitle ?: b.tmdbOriginalTitle,
        tmdbOverview = a.tmdbOverview ?: b.tmdbOverview,
        tmdbReleaseDate = a.tmdbReleaseDate ?: b.tmdbReleaseDate,
        tmdbVoteAverage = a.tmdbVoteAverage ?: b.tmdbVoteAverage,
        tmdbVoteCount = a.tmdbVoteCount ?: b.tmdbVoteCount,
        tmdbPopularity = maxOfNullable(a.tmdbPopularity, b.tmdbPopularity),
        tmdbGenres = a.tmdbGenres ?: b.tmdbGenres,
        tmdbRuntime = a.tmdbRuntime ?: b.tmdbRuntime,
        tmdbCast = a.tmdbCast ?: b.tmdbCast,
        tmdbDirector = a.tmdbDirector ?: b.tmdbDirector,
        tmdbCastJson = a.tmdbCastJson ?: b.tmdbCastJson,
        tmdbCrewJson = a.tmdbCrewJson ?: b.tmdbCrewJson,
        tmdbImdbId = a.tmdbImdbId ?: b.tmdbImdbId,
        tmdbTrailerKey = a.tmdbTrailerKey ?: b.tmdbTrailerKey,
        duration = a.duration ?: b.duration,
        videoCodec = a.videoCodec ?: b.videoCodec,
        audioCodec = a.audioCodec ?: b.audioCodec,
        resolution = a.resolution ?: b.resolution,
        year = a.year ?: b.year,
        addedAt = minOf(a.addedAt, b.addedAt),
        tmdbLastFetchAt = maxOfNullable(a.tmdbLastFetchAt, b.tmdbLastFetchAt),
        playlistOrder = maxOf(a.playlistOrder, b.playlistOrder),
        omdbImdbRating = a.omdbImdbRating ?: b.omdbImdbRating,
        omdbRottenTomatoesScore = a.omdbRottenTomatoesScore ?: b.omdbRottenTomatoesScore,
        omdbMetacriticScore = a.omdbMetacriticScore ?: b.omdbMetacriticScore,
        omdbAudienceScore = a.omdbAudienceScore ?: b.omdbAudienceScore,
        omdbLastFetchAt = maxOfNullable(a.omdbLastFetchAt, b.omdbLastFetchAt)
    )

    private fun maxOfNullable(a: Float?, b: Float?): Float? = when {
        a == null -> b
        b == null -> a
        else -> maxOf(a, b)
    }

    private fun maxOfNullable(a: Long?, b: Long?): Long? = when {
        a == null -> b
        b == null -> a
        else -> maxOf(a, b)
    }
}
