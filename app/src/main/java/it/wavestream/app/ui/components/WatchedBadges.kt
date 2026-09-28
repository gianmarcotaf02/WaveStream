package it.wavestream.app.ui.components

import it.wavestream.app.data.database.dao.WatchProgressDao
import it.wavestream.app.ui.home.CarouselItem

/**
 * Insiemi di contenuti già visti per il profilo corrente:
 *  - [movieIds]  → film completati (o a ≤ 6 minuti dalla fine)
 *  - [seriesIds] → serie con TUTTI gli episodi completati
 *
 * Calcolati con una sola query per tipo e poi applicati in memoria a tutte le
 * card, così il badge "visto" è disponibile su ogni carosello/griglia.
 */
data class WatchedKeys(
    val movieIds: Set<Long> = emptySet(),
    val seriesIds: Set<Long> = emptySet()
) {
    val isEmpty: Boolean get() = movieIds.isEmpty() && seriesIds.isEmpty()
}

/**
 * Carica gli insiemi di contenuti visti per il profilo. Le query sono dentro
 * [runCatching] così un eventuale errore non fa fallire il caricamento della home.
 */
suspend fun loadWatchedKeys(profileId: Long, watchProgressDao: WatchProgressDao): WatchedKeys {
    val movies = runCatching { watchProgressDao.getWatchedMovieIds(profileId) }
        .getOrDefault(emptyList())
        .toHashSet()
    val series = runCatching { watchProgressDao.getFullyWatchedSeriesIds(profileId) }
        .getOrDefault(emptyList())
        .toHashSet()
    return WatchedKeys(movies, series)
}

/**
 * Marca come "visti" i [CarouselItem] già completati. Non tocca gli item che
 * hanno già `isWatched` (es. la riga "Visti di recente").
 */
fun List<CarouselItem>.applyWatchedKeys(keys: WatchedKeys): List<CarouselItem> {
    if (isEmpty() || keys.isEmpty) return this
    return map { item ->
        when {
            item.isWatched -> item
            item.contentType == "MOVIE" && item.id in keys.movieIds -> item.copy(isWatched = true)
            item.contentType == "SERIES" && item.id in keys.seriesIds -> item.copy(isWatched = true)
            else -> item
        }
    }
}
