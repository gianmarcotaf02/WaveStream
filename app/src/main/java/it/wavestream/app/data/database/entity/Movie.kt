package it.wavestream.app.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Movie entity representing a VOD movie
 */
@Entity(
    tableName = "movies",
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
        Index("groupKey"),
        // Lookup del film canonico di un gruppo durante l'unificazione
        // (WHERE playlistId = ? AND groupKey = ?): con i due indici separati SQLite
        // scandiva tutti i film della playlist per ogni gruppo (~60k righe,
        // ~500 ms su una TV stick → ore di sync su un primo refresh).
        Index(value = ["playlistId", "groupKey"]),
        Index("tmdbImdbId"),
        Index(value = ["playlistId", "category", "isHidden"]),
        Index(value = ["trendingCategory", "isHidden"]),
        // Composite index for FilmActivity: WHERE category = ? AND isHidden = 0 ORDER BY name
        Index(value = ["category", "isHidden", "name"]),
        // Composite index for getAllMoviesList: WHERE isHidden = 0 ORDER BY name (covers filter + sort)
        Index(value = ["isHidden", "name"])
    ]
)
data class Movie(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val playlistId: Long,
    
    // Basic info from playlist
    val name: String,
    // Titolo pulito (senza tag HD/FHD/4K/720/1080/codice/lingua...), usato per
    // la visualizzazione e per la ricerca. `name` resta il titolo unificato ma
    // può conservare parte del testo originale del provider.
    val cleanName: String? = null,
    // Chiave canonica di unificazione (titolo normalizzato + anno) usata per
    // raggruppare i doppioni di uno stesso film all'interno della playlist.
    val groupKey: String? = null,
    // Numero di sorgenti/versioni unificate in questo film (badge "N versioni").
    @ColumnInfo(defaultValue = "1")
    val streamCount: Int = 1,
    val streamUrl: String,
    val logoUrl: String? = null,
    val category: String? = null,
    val categoryId: String? = null,
    val trendingCategory: String? = null,  // "Film Popolari" for trending movies, updated weekly
    
    // Xtream specific
    val xtreamStreamId: Int? = null,
    val xtreamPlot: String? = null,
    val xtreamBackdropUrl: String? = null,
    val xtreamCast: String? = null,
    val xtreamDirector: String? = null,
    val xtreamGenre: String? = null,
    val xtreamRating: String? = null,
    val xtreamYoutubeTrailer: String? = null,
    val containerExtension: String? = null,
    
    // TMDB enriched data
    val tmdbId: Int? = null,
    val tmdbPosterPath: String? = null,
    val tmdbBackdropPath: String? = null,
    val tmdbTitle: String? = null,
    val tmdbOriginalTitle: String? = null,
    val tmdbOverview: String? = null,
    val tmdbReleaseDate: String? = null,
    val tmdbVoteAverage: Float? = null,
    val tmdbVoteCount: Int? = null,
    val tmdbPopularity: Float? = null,
    val tmdbGenres: String? = null, // JSON array of genre names
    val tmdbRuntime: Int? = null, // in minutes
    val tmdbCast: String? = null, // JSON array of cast names
    val tmdbDirector: String? = null,
    val tmdbCastJson: String? = null,    // JSON array of {id, name, character, profile_path, order}
    val tmdbCrewJson: String? = null,    // JSON array of {id, name, job, department, profile_path}
    val tmdbImdbId: String? = null, // IMDB ID from TMDB external_ids
    val tmdbTrailerKey: String? = null, // YouTube video key
    // Clear logo / title treatment (TMDb, PNG trasparente) + lista candidati alternativi
    // in JSON ({path, lang, ar, vote}) per un eventuale selettore del titolo grafico.
    val tmdbLogoPath: String? = null,
    val tmdbLogoOptionsJson: String? = null,
    
    // Stream info
    val duration: Long? = null, // in seconds
    val videoCodec: String? = null,
    val audioCodec: String? = null,
    val resolution: String? = null,
    
    // Metadata
    @ColumnInfo(name = "year")
    val year: Int? = null,
    val isHidden: Boolean = false,
    val addedAt: Long = System.currentTimeMillis(),
    val tmdbLastFetchAt: Long? = null,
    val playlistOrder: Int = 0,  // Position in M3U file (higher = added later by provider)
    
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
    // Titolo grafico (clear logo). w500 basta e avanza: i loghi sono orizzontali e
    // pesanti in originale; il DiskCache Coil (300 MB) li tiene comunque offline.
    val titleLogoUrl: String? get() = tmdbLogoPath?.let { "https://image.tmdb.org/t/p/w500$it" }
    val rating: Float? get() = xtreamRating?.toFloatOrNull() ?: tmdbVoteAverage ?: omdbImdbRating?.toFloatOrNull()
    // Blank-safe fallbacks: providers often return empty/placeholder strings ("", "00:00:00")
    // which must NOT block the TMDB data.
    val plot: String? get() = xtreamPlot?.takeIf { it.isNotBlank() } ?: tmdbOverview
    val genre: String? get() = xtreamGenre?.takeIf { it.isNotBlank() } ?: tmdbGenres
    val cast: String? get() = xtreamCast?.takeIf { it.isNotBlank() } ?: tmdbCast
    val director: String? get() = xtreamDirector?.takeIf { it.isNotBlank() } ?: tmdbDirector
    val imdbId: String? get() = tmdbImdbId
    val title: String get() = tmdbTitle?.takeIf { it.isNotEmpty() }
        ?: cleanName?.takeIf { it.isNotBlank() }
        ?: name
}


