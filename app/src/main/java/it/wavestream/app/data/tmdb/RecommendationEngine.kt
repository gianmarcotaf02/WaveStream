package it.wavestream.app.data.tmdb

import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.ProfileDao
import it.wavestream.app.data.database.dao.SeriesDao
import it.wavestream.app.data.database.dao.UserTasteDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.TasteStatus
import it.wavestream.app.data.database.entity.UserTaste
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.Series
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

data class RecommendedItem(
    val tmdbId: Int,
    val title: String,
    val posterPath: String?,
    val backdropPath: String?,
    val overview: String?,
    val voteAverage: Float,
    val year: Int?,
    val mediaType: String, // "movie" or "tv"
    val score: Float,      // aggregate recommendation score
    val localMovie: Movie?,
    val localSeries: Series?
)

@Singleton
class RecommendationEngine @Inject constructor(
    private val tmdbService: TMDBService,
    private val userTasteDao: UserTasteDao,
    private val profileDao: ProfileDao,
    private val movieDao: MovieDao,
    private val seriesDao: SeriesDao
) {
    companion object {
        private const val MAX_RECOMMENDATIONS = 30
        private const val MAX_PER_SOURCE = 5
        private const val MAX_SEED_ITEMS = 10
        private const val SOURCE_WEIGHT_RECOMMENDATION = 2.0f
        private const val SOURCE_WEIGHT_SIMILAR = 1.0f
        private const val SOURCE_WEIGHT_GENRE_DISCOVER = 1.5f
        private const val SOURCE_WEIGHT_TRENDING = 0.8f
    }

    data class ScoredItem(
        val tmdbId: Int,
        val mediaType: String,
        var score: Float,
        val title: String,
        val posterPath: String?,
        val backdropPath: String?,
        val overview: String?,
        val voteAverage: Float,
        val year: Int?
    )

    suspend fun generateRecommendations(profileId: Long): List<RecommendedItem> = withContext(Dispatchers.IO) {
        try {
            val profile = profileDao.getProfileById(profileId)
            val watched = userTasteDao.getByProfileAndStatus(profileId, TasteStatus.WATCHED)
            val seedItems = watched.take(MAX_SEED_ITEMS)

            val alreadyKnownTmdbIds = watched.map { it.tmdbId }.toSet()

            val aggregated = mutableMapOf<Pair<Int, String>, ScoredItem>()

            // Step 1: Seed-based recommendations + similar
            if (seedItems.isNotEmpty()) {
                val recResults = seedItems.map { item ->
                    async {
                        val mediaType = if (item.contentType == ContentType.MOVIE) "movie" else "tv"
                        val recs = tmdbService.getRecommendations(item.tmdbId, mediaType)
                        val similar = tmdbService.getSimilar(item.tmdbId, mediaType)
                        recs to similar
                    }
                }.awaitAll()

                for ((recs, similar) in recResults) {
                    recs.take(MAX_PER_SOURCE).forEach { tmdbItem ->
                        addOrScore(aggregated, tmdbItem, SOURCE_WEIGHT_RECOMMENDATION)
                    }
                    similar.take(MAX_PER_SOURCE).forEach { tmdbItem ->
                        addOrScore(aggregated, tmdbItem, SOURCE_WEIGHT_SIMILAR)
                    }
                }
            }

            // Step 2: Genre-based discover from profile preferences
            val genreIds = profile?.selectedGenres
                ?.split(",")
                ?.mapNotNull { it.trim().toIntOrNull() }
                ?: emptyList()

            if (genreIds.isNotEmpty()) {
                val movieDiscover = async {
                    tmdbService.getDiscoverByGenre(genreIds, "movie", page = 1)
                        .take(MAX_PER_SOURCE * 2)
                }
                val seriesDiscover = async {
                    tmdbService.getDiscoverByGenre(genreIds, "tv", page = 1)
                        .take(MAX_PER_SOURCE * 2)
                }

                val (movieResults, seriesResults) = movieDiscover.await() to seriesDiscover.await()

                movieResults.forEach { item ->
                    addOrScore(aggregated, item, SOURCE_WEIGHT_GENRE_DISCOVER)
                }
                seriesResults.forEach { item ->
                    addOrScore(aggregated, item, SOURCE_WEIGHT_GENRE_DISCOVER)
                }
            }

            // Step 3: Trending as fallback to fill gaps
            if (aggregated.size < 10) {
                val trendingMovies = async { tmdbService.getTrendingMovies(5) }
                val trendingSeries = async { tmdbService.getTrendingSeries(5) }
                val (tm, ts) = trendingMovies.await() to trendingSeries.await()

                tm.map { it.tmdbItem }.forEach { item ->
                    addOrScore(aggregated, item, SOURCE_WEIGHT_TRENDING)
                }
                ts.map { it.tmdbItem }.forEach { item ->
                    addOrScore(aggregated, item, SOURCE_WEIGHT_TRENDING)
                }
            }

            // Sort by score descending
            val sorted = aggregated.values
                .filter { it.tmdbId !in alreadyKnownTmdbIds }
                .sortedByDescending { it.score }

            // Match against local content
            val results = sorted.take(MAX_RECOMMENDATIONS).map { scored ->
                val localMovie = if (scored.mediaType == "movie") {
                    movieDao.getMovieByTmdbId(scored.tmdbId)
                } else null
                val localSeries = if (scored.mediaType == "tv") {
                    seriesDao.getSeriesByTmdbId(scored.tmdbId)
                } else null

                RecommendedItem(
                    tmdbId = scored.tmdbId,
                    title = scored.title,
                    posterPath = scored.posterPath,
                    backdropPath = scored.backdropPath,
                    overview = scored.overview,
                    voteAverage = scored.voteAverage,
                    year = scored.year,
                    mediaType = scored.mediaType,
                    score = scored.score,
                    localMovie = localMovie,
                    localSeries = localSeries
                )
            }

            results
        } catch (e: Exception) {
            android.util.Log.e("RecommendationEngine", "Error generating recommendations", e)
            emptyList()
        }
    }

    private fun addOrScore(
        map: MutableMap<Pair<Int, String>, ScoredItem>,
        item: TMDBService.TMDBItem,
        weight: Float
    ) {
        val key = item.id to item.mediaType
        val existing = map[key]
        if (existing != null) {
            existing.score += weight
        } else {
            map[key] = ScoredItem(
                tmdbId = item.id,
                mediaType = item.mediaType,
                score = weight,
                title = item.title,
                posterPath = item.posterPath,
                backdropPath = item.backdropPath,
                overview = item.overview,
                voteAverage = item.voteAverage,
                year = extractYearInt(item.releaseDate)
            )
        }
    }

    /**
     * Generate genre-specific carousels for the HOME tab
     * Returns a map of genreId -> list of RecommendedItem (mixed movies + series)
     */
    suspend fun generateGenreCarousels(profileId: Long): Map<Int, List<RecommendedItem>> = withContext(Dispatchers.IO) {
        try {
            val profile = profileDao.getProfileById(profileId)
            val genreIds = profile?.selectedGenres
                ?.split(",")
                ?.mapNotNull { it.trim().toIntOrNull() }
                ?: return@withContext emptyMap()

            val result = mutableMapOf<Int, List<RecommendedItem>>()

            for (genreId in genreIds) {
                val movieDiscover = async {
                    tmdbService.getDiscoverByGenre(listOf(genreId), "movie", page = 1)
                        .take(8)
                }
                val seriesDiscover = async {
                    tmdbService.getDiscoverByGenre(listOf(genreId), "tv", page = 1)
                        .take(8)
                }

                val movies = movieDiscover.await()
                val series = seriesDiscover.await()

                val items = (movies + series).mapNotNull { item ->
                    val localMovie = movieDao.getMovieByTmdbId(item.id)
                    val localSeries = if (localMovie == null) seriesDao.getSeriesByTmdbId(item.id) else null

                    if (localMovie != null || localSeries != null) {
                        RecommendedItem(
                            tmdbId = item.id,
                            title = item.title,
                            posterPath = item.posterPath,
                            backdropPath = item.backdropPath,
                            overview = item.overview,
                            voteAverage = item.voteAverage,
                            year = extractYearInt(item.releaseDate),
                            mediaType = item.mediaType,
                            score = 1.0f,
                            localMovie = localMovie,
                            localSeries = localSeries
                        )
                    } else null
                }

                if (items.isNotEmpty()) {
                    result[genreId] = items
                }
            }

            result
        } catch (e: Exception) {
            android.util.Log.e("RecommendationEngine", "Error generating genre carousels", e)
            emptyMap()
        }
    }

    private fun extractYearInt(dateStr: String?): Int? {
        if (dateStr.isNullOrEmpty()) return null
        return dateStr.take(4).toIntOrNull()
    }
}
