package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Series entity representing a TV series
 */
@Entity(
    tableName = "series",
    foreignKeys = [
        ForeignKey(
            entity = Playlist::class,
            parentColumns = ["id"],
            childColumns = ["playlistId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index("playlistId"),
        Index("category"),
        Index("name"),
        Index("tmdbId"),
        Index("trendingCategory"),
        Index("isHidden"),
        Index("addedAt"),
        Index("playlistOrder"),
        Index(value = ["playlistId", "category", "isHidden"]),
        Index(value = ["trendingCategory", "isHidden"]),
        // Composite index for SeriesActivity: WHERE category = ? AND isHidden = 0 ORDER BY name
        Index(value = ["category", "isHidden", "name"]),
        // Composite index for getAllSeriesList: WHERE isHidden = 0 ORDER BY name (covers filter + sort)
        Index(value = ["isHidden", "name"])
    ]
)
data class Series(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val playlistId: Long,
    
    // Basic info from playlist
    val name: String,
    val logoUrl: String? = null,
    val category: String? = null,
    val categoryId: String? = null,
    val trendingCategory: String? = null,  // "Serie Popolari" for trending series, updated weekly
    
    // Xtream specific
    val xtreamSeriesId: Int? = null,
    val xtreamPlot: String? = null,
    val xtreamBackdropUrl: String? = null,
    val xtreamCast: String? = null,
    val xtreamDirector: String? = null,
    val xtreamGenre: String? = null,
    val xtreamRating: String? = null,
    
    // TMDB enriched data
    val tmdbId: Int? = null,
    val tmdbImdbId: String? = null, // IMDB ID from TMDB external_ids
    val tmdbPosterPath: String? = null,
    val tmdbBackdropPath: String? = null,
    val tmdbName: String? = null,
    val tmdbOriginalName: String? = null,
    val tmdbOverview: String? = null,
    val tmdbFirstAirDate: String? = null,
    val tmdbVoteAverage: Float? = null,
    val tmdbVoteCount: Int? = null,
    val tmdbPopularity: Float? = null,
    val tmdbGenres: String? = null, // JSON array of genre names
    val tmdbNumberOfSeasons: Int? = null,
    val tmdbNumberOfEpisodes: Int? = null,
    val tmdbCast: String? = null, // JSON array of cast names
    val tmdbCastJson: String? = null,    // JSON array of {id, name, character, profile_path, order}
    val tmdbCrewJson: String? = null,    // JSON array of {id, name, job, department, profile_path}
    val tmdbStatus: String? = null, // "Returning Series", "Ended", etc.
    val tmdbTrailerKey: String? = null, // YouTube video key
    
    // Metadata
    val seasonCount: Int = 0,
    val episodeCount: Int = 0,
    val isHidden: Boolean = false,
    val addedAt: Long = System.currentTimeMillis(),
    val tmdbLastFetchAt: Long? = null,
    val playlistOrder: Int = 0,  // Position in M3U file (higher = added later by provider)
    val year: Int? = null,
    
    // New episode tracking
    val latestEpisodeAddedAt: Long? = null,
    val latestEpisodeSeason: Int? = null,
    val latestEpisodeNumber: Int? = null,

    // OMDB cached ratings
    val omdbImdbRating: String? = null,
    val omdbRottenTomatoesScore: Int? = null,
    val omdbMetacriticScore: Int? = null,
    val omdbAudienceScore: Int? = null,  // Popcornmeter (tomatoUserMeter)
    val omdbLastFetchAt: Long? = null
) {
    // Convenience properties for UI (Waterfall Logic)
    // Prefer the TMDB poster/backdrop (authoritative) over the provider's logo/backdrop,
    // since IPTV providers often supply incorrect covers (e.g. a different movie with same title).
    val posterUrl: String? get() = tmdbPosterPath?.let { "https://image.tmdb.org/t/p/w500$it" } ?: logoUrl
    val backdropUrl: String? get() = tmdbBackdropPath?.let { "https://image.tmdb.org/t/p/w1280$it" } ?: xtreamBackdropUrl
    val rating: Float? get() = xtreamRating?.toFloatOrNull() ?: tmdbVoteAverage ?: omdbImdbRating?.toFloatOrNull()
    // Blank-safe fallbacks: providers often return empty/placeholder strings ("", "00:00:00")
    // which must NOT block the TMDB data.
    val plot: String? get() = xtreamPlot?.takeIf { it.isNotBlank() } ?: tmdbOverview
    val genre: String? get() = xtreamGenre?.takeIf { it.isNotBlank() } ?: tmdbGenres
    val cast: String? get() = xtreamCast?.takeIf { it.isNotBlank() } ?: tmdbCast
    val director: String? get() = xtreamDirector // No tmdbDirector for series
    val imdbId: String? get() = tmdbImdbId
    val title: String get() = tmdbName?.takeIf { it.isNotEmpty() } ?: name
}


