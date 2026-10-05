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
suspend fun loadWatchedKeys(
    profileId: Long,
    watchProgressDao: WatchProgressDao,
    needMovies: Boolean = true,
    needSeries: Boolean = true
): WatchedKeys {
    val movies = if (needMovies) {
        runCatching { watchProgressDao.getWatchedMovieIds(profileId) }
            .getOrDefault(emptyList())
            .toHashSet()
    } else emptySet()
    val series = if (needSeries) {
        runCatching { watchProgressDao.getFullyWatchedSeriesIds(profileId) }
            .getOrDefault(emptyList())
            .toHashSet()
    } else emptySet()
    return WatchedKeys(movies, series)
}

/**
 * True se il contenuto indicato è "visto" per il profilo corrente.
 * Il contentType è la stringa usata da [CarouselItem]/`HeroItem` ("MOVIE"/"SERIES").
 */
fun WatchedKeys.contains(contentId: Long, contentType: String): Boolean = when (contentType) {
    "MOVIE" -> contentId in movieIds
    "SERIES" -> contentId in seriesIds
    else -> false
}

/** True se la card rappresenta un contenuto già visto (flag già presente o chiave). */
fun WatchedKeys.contains(item: CarouselItem): Boolean =
    item.isWatched || contains(item.id, item.contentType)

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
