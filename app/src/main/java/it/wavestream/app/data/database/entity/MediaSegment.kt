package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Tipo di segmento temporale di un contenuto.
 * Pensato per essere esteso (intro/recap/credits) senza nuove migrazioni.
 */
enum class SegmentType {
    INTRO,    // sigla di apertura
    RECAP,    // riassunto "previously on..."
    CREDITS,  // titoli di coda
    PREVIEW   // anteprima prossimo episodio
}

/**
 * Da dove arriva il segmento. Determina l'affidabilità (confidence).
 */
enum class SegmentSource {
    USER_MARK,        // marcato manualmente dall'utente (affidabilità 1.0)
    EXTERNAL_DB,      // database community di marker (affidabilità 1.0)
    SERIES_ESTIMATE,  // stimato dagli episodi precedenti della stessa serie
    DETECTOR          // rilevato automaticamente (audio/vision)
}

/**
 * Segmento temporale (sigla, recap, titoli di coda, anteprima) di un contenuto.
 *
 * La chiave forte è l'identità del contenuto:
 *  - per i film: contentType = MOVIE + contentId (oppure tmdbId/imdbId come fallback stabile);
 *  - per gli episodi: seriesId + seasonNumber + episodeNumber (oppure tmdbId + stagione + episodio).
 *
 * contentId locale NON è una chiave affidabile (cambia quando si re-importa la playlist),
 * per questo non c'è ForeignKey: il segmento resta valido anche dopo un re-sync.
 */
@Entity(
    tableName = "media_segments",
    indices = [
        Index(value = ["contentType", "contentId", "type"]),
        Index(value = ["contentType", "tmdbId", "type"]),
        Index(value = ["imdbId", "type"]),
        Index(value = ["seriesId", "seasonNumber", "episodeNumber", "type"])
    ]
)
data class MediaSegment(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val contentType: ContentType,
    val type: SegmentType,

    val contentId: Long? = null,      // id locale del contenuto (Movie id o Episode id)
    val seriesId: Long? = null,       // valorizzato per gli episodi
    val seasonNumber: Int? = null,
    val episodeNumber: Int? = null,

    // Identità stabile (dal TMDB enrichment), usata quando gli id locali cambiano
    val tmdbId: Int? = null,
    val imdbId: String? = null,

    val startMs: Long,                // inizio del segmento (ms dall'inizio del contenuto)
    val endMs: Long? = null,          // fine del segmento, se nota
    val durationMs: Long,             // durata totale del contenuto al momento della scrittura

    val source: SegmentSource,
    val confidence: Float,            // 1.0 per USER_MARK / EXTERNAL_DB

    /**
     * Fingerprint audio del segmento (solo INTRO per ora). Formato codificato da
     * AudioFingerprintCodec: header (bands, frames, intervalMs) + FloatArray delle bande
     * spettrali normalizzate. Serve a riconoscere la sigla negli episodi successivi.
     */
    val fingerprint: ByteArray? = null,

    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
) {
    val relativeStart: Float
        get() = if (durationMs > 0) (startMs.toFloat() / durationMs).coerceIn(0f, 1f) else 0f
}
