package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Entity for tracking watch progress
 */
@Entity(
    tableName = "watch_progress",
    foreignKeys = [
        ForeignKey(
            entity = Profile::class,
            parentColumns = ["id"],
            childColumns = ["profileId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["profileId"]),
        Index(value = ["profileId", "contentType", "contentId"], unique = true),
        Index(value = ["profileId", "lastWatchedAt"]),
        Index("seriesId")
    ]
)
data class WatchProgress(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val profileId: Long,
    val contentType: ContentType,
    val contentId: Long,
    val seriesId: Long? = null,
    val season: Int? = null,
    val episode: Int? = null,
    val position: Long = 0, // Current position in ms
    val duration: Long = 0, // Total duration in ms
    val isCompleted: Boolean = false,
    val lastWatchedAt: Long = System.currentTimeMillis(),
    val createdAt: Long = System.currentTimeMillis()
) {
    val progressPercent: Float
        get() = if (duration > 0) (position.toFloat() / duration.toFloat()) * 100 else 0f

    /**
     * Vero solo se c'è **davvero** qualcosa da riprendere: almeno 15s visionati
     * (o qualsiasi posizione su contenuti di 1 minuto o meno) e non completato.
     *
     * Senza questa soglia, una riga con `position = 0` — che si crea quando il
     * player viene aperto e chiuso prima che la riproduzione parta — veniva
     * presentata come "Riprendi" con i minuti rimasti pari alla durata totale
     * (es. "2h 24m rimasti" su un film mai visto).
     */
    val isResumable: Boolean
        get() = when {
            isCompleted || duration <= 0 -> false
            duration <= MIN_RESUME_MS -> position > 0
            else -> position >= MIN_RESUME_MS
        }

    companion object {
        /** Soglia minima di visione per parlare di "riprendi" (15 secondi). */
        const val MIN_RESUME_MS = 15_000L
    }
}
