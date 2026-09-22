package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Sorgente fisica (stream) di un contenuto unificato.
 *
 * Un film può essere pubblicato dal provider in più versioni/doppioni
 * ("Inception (2010) HD", "Inception 2010 4K", "Inception FHD ITA"): tutte
 * appartengono allo **stesso** [Movie] canonico e vengono salvate qui, una riga
 * per stream. La schermata di dettaglio/menu "Riproduci" le elenca in modo che
 * l'utente possa scegliere qualità/categoria/durata.
 *
 * Nota: la durata per sorgente non è disponibile in `get_vod_streams`; viene
 * popolata in modo lazy da `get_vod_info` (campo [durationSeconds]).
 */
@Entity(
    tableName = "stream_providers",
    foreignKeys = [
        ForeignKey(
            entity = Movie::class,
            parentColumns = ["id"],
            childColumns = ["movieId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Series::class,
            parentColumns = ["id"],
            childColumns = ["seriesId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Playlist::class,
            parentColumns = ["id"],
            childColumns = ["playlistId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index("movieId"),
        Index("seriesId"),
        Index("playlistId"),
        Index("tmdbId"),
        Index(value = ["playlistId", "xtreamStreamId"], unique = true)
    ]
)
data class StreamProvider(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    // Contenuto unificato a cui appartiene la sorgente (uno dei due valorizzato)
    val movieId: Long? = null,
    val seriesId: Long? = null,

    // TMDB ID per raggruppare lo stesso contenuto da fonti diverse
    val tmdbId: Int? = null,

    // Playlist/provider di origine
    val playlistId: Long,

    // Stream
    val streamUrl: String,
    val originalName: String,        // Nome grezzo dal provider (es. "Inception 2010 4K")
    val category: String? = null,    // Categoria di appartenenza della sorgente
    val categoryId: String? = null,
    val xtreamStreamId: Int? = null,
    val containerExtension: String? = null,
    val logoUrl: String? = null,
    val year: Int? = null,

    // Qualità rilevata dal VOD (nome/estensione)
    val quality: StreamQuality = StreamQuality.UNKNOWN,
    val resolution: String? = null,  // es. "1080p", "2160p"
    val language: String? = null,    // es. "ITA", "ENG"
    val isExtended: Boolean = false,
    val isHdr: Boolean = false,
    val is4K: Boolean = false,

    // Durata per sorgente (lazy da get_vod_info), in secondi
    val durationSeconds: Long? = null,

    // Provider / ordinamento
    val providerName: String? = null,
    val playlistOrder: Int = 0,
    val isPrimary: Boolean = false,  // Sorgente usata come streamUrl del Movie canonico

    // Metadata
    val addedAt: Long = System.currentTimeMillis(),
    val lastUsedAt: Long? = null
)
