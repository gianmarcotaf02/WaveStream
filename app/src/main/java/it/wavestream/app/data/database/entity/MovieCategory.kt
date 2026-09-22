package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Associazione molti-a-molti tra un [Movie] unificato e le categorie in cui il
 * film compare nella playlist.
 *
 * Dopo l'unificazione dei doppioni un solo [Movie] rappresenta il contenuto, ma
 * lo stesso titolo può essere pubblicato dal provider in più categorie
 * ("Film Azione", "Novità", ...). Questa tabella conserva **tutte** le
 * appartenenze, così il film continua a comparire in ogni categoria di origine
 * mentre la scheda del contenuto resta unica.
 *
 * [Movie.category] resta valorizzato con la categoria primaria per compatibilità
 * (ordinamenti/etichette), ma la verità per i filtri è questa tabella.
 */
@Entity(
    tableName = "movie_categories",
    foreignKeys = [
        ForeignKey(
            entity = Movie::class,
            parentColumns = ["id"],
            childColumns = ["movieId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index("movieId"),
        Index("category"),
        Index(value = ["movieId", "category"], unique = true),
        Index(value = ["playlistId", "category"])
    ]
)
data class MovieCategory(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val movieId: Long,
    val playlistId: Long,
    val category: String,
    val categoryId: String? = null,
    val addedAt: Long = System.currentTimeMillis()
)
