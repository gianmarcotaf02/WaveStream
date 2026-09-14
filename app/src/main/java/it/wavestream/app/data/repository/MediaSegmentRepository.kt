package it.wavestream.app.data.repository

import it.wavestream.app.data.database.dao.MediaSegmentDao
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.MediaSegment
import it.wavestream.app.data.database.entity.SegmentSource
import it.wavestream.app.data.database.entity.SegmentType
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository dei segmenti temporali (sigla/recap/credits/anteprima).
 *
 * Fase 1: risoluzione cache-first + marker manuale dell'utente.
 * I provider remoti (database community di marker) si aggiungeranno qui in seguito,
 * dietro la stessa API, senza toccare i chiamanti.
 */
@Singleton
class MediaSegmentRepository @Inject constructor(
    private val dao: MediaSegmentDao
) {

    /**
     * Risolve un segmento esatto per il contenuto corrente provando, in ordine,
     * tutte le chiavi disponibili (id locale, serie+stagione+episodio, tmdb, imdb).
     */
    suspend fun getExact(
        contentType: ContentType,
        contentId: Long,
        seriesId: Long? = null,
        season: Int? = null,
        episode: Int? = null,
        tmdbId: Int? = null,
        imdbId: String? = null,
        type: SegmentType
    ): MediaSegment? {
        // 1) id locale (match più diretto)
        dao.getForContent(contentId, contentType, type)?.let { return it }
        // 2) serie + stagione + episodio
        if (seriesId != null && season != null && episode != null) {
            dao.getForEpisode(seriesId, season, episode, type)?.let { return it }
        }
        // 3) tmdb id
        if (tmdbId != null) {
            dao.getByTmdb(contentType, tmdbId, type)?.let { return it }
        }
        // 4) imdb id
        if (!imdbId.isNullOrBlank()) {
            dao.getByImdb(imdbId, type)?.let { return it }
        }
        return null
    }

    /**
     * Salva il marker manuale dell'utente (affidabilità massima) per il contenuto corrente.
     */
    suspend fun setUserMarker(
        contentType: ContentType,
        contentId: Long,
        type: SegmentType,
        startMs: Long,
        endMs: Long? = null,
        durationMs: Long,
        seriesId: Long? = null,
        season: Int? = null,
        episode: Int? = null,
        tmdbId: Int? = null,
        imdbId: String? = null
    ): MediaSegment {
        val now = System.currentTimeMillis()
        val segment = MediaSegment(
            contentType = contentType,
            type = type,
            contentId = contentId,
            seriesId = seriesId,
            seasonNumber = season,
            episodeNumber = episode,
            tmdbId = tmdbId,
            imdbId = imdbId,
            startMs = startMs.coerceAtLeast(0),
            endMs = endMs,
            durationMs = durationMs.coerceAtLeast(0),
            source = SegmentSource.USER_MARK,
            confidence = 1f,
            createdAt = now,
            updatedAt = now
        )
        dao.upsert(segment)
        return segment
    }

    suspend fun clearMarker(
        contentType: ContentType,
        contentId: Long,
        type: SegmentType
    ) = dao.deleteForContent(contentId, contentType, type)

    /**
     * Marker CREDITS manuale più recente della serie (riferimento per stimare
     * la posizione nei prossimi episodi). Usato dalla stima di Fase 4.
     */
    suspend fun getSeriesCreditsReference(seriesId: Long): MediaSegment? =
        dao.getForSeries(seriesId, SegmentType.CREDITS)
            .firstOrNull { it.source == SegmentSource.USER_MARK || it.source == SegmentSource.EXTERNAL_DB }
            ?: dao.getForSeries(seriesId, SegmentType.CREDITS).firstOrNull()

    /**
     * Stima i credits per un episodio basandosi sulla "coda" del riferimento di serie:
     * tail = durationRef - startRef; stima = durationCorrente - tail.
     * Non è un marker esatto: va usata come hint/inviluppo, non come trigger diretto.
     */
    fun estimateCreditsStart(reference: MediaSegment, currentDurationMs: Long): Long? {
        if (reference.durationMs <= 0 || currentDurationMs <= 0) return null
        val tail = reference.durationMs - reference.startMs
        if (tail <= 0) return null
        return (currentDurationMs - tail).coerceAtLeast(0)
    }

    /**
     * Riferimento INTRO (con inizio E fine) di un episodio della stessa serie, usato per
     * stimare la sigla nei prossimi episodi. Le sigle sono molto stabili all'interno di
     * una stagione, quindi una stima per posizione relativa è affidabile e, in ogni caso,
     * produce solo un pulsante "Salta sigla" opzionale (mai un seek forzato).
     */
    /**
     * Salva/aggiorna il fingerprint audio della sigla marcata, sul segmento INTRO del contenuto.
     */
    suspend fun saveIntroFingerprint(
        contentType: ContentType,
        contentId: Long,
        seriesId: Long?,
        season: Int?,
        episode: Int?,
        tmdbId: Int?,
        imdbId: String?,
        startMs: Long,
        endMs: Long,
        durationMs: Long,
        fingerprint: ByteArray
    ) {
        val existing = getExact(
            contentType = contentType,
            contentId = contentId,
            seriesId = seriesId,
            season = season,
            episode = episode,
            tmdbId = tmdbId,
            imdbId = imdbId,
            type = SegmentType.INTRO
        )
        val now = System.currentTimeMillis()
        val updated = MediaSegment(
            id = existing?.id ?: 0,
            contentType = contentType,
            type = SegmentType.INTRO,
            contentId = contentId,
            seriesId = seriesId,
            seasonNumber = season,
            episodeNumber = episode,
            tmdbId = tmdbId,
            imdbId = imdbId,
            startMs = startMs.coerceAtLeast(0),
            endMs = endMs,
            durationMs = durationMs.coerceAtLeast(0),
            source = existing?.source ?: SegmentSource.USER_MARK,
            confidence = existing?.confidence ?: 1f,
            fingerprint = fingerprint,
            createdAt = existing?.createdAt ?: now,
            updatedAt = now
        )
        if (existing != null) dao.update(updated) else dao.insert(updated)
    }

    /** Primo segmento INTRO della serie che ha un fingerprint audio salvato. */
    suspend fun getSeriesIntroFingerprint(seriesId: Long): MediaSegment? =
        dao.getForSeries(seriesId, SegmentType.INTRO).firstOrNull { it.fingerprint != null }

    suspend fun getSeriesIntroReference(seriesId: Long): MediaSegment? {
        val all = dao.getForSeries(seriesId, SegmentType.INTRO)
        return all.firstOrNull {
            it.endMs != null && (it.source == SegmentSource.USER_MARK || it.source == SegmentSource.EXTERNAL_DB)
        } ?: all.firstOrNull { it.endMs != null }
    }

    /**
     * Stima inizio/fine sigla per un episodio di durata [currentDurationMs] a partire da un
     * riferimento della stessa serie, usando le posizioni relative.
     */
    fun estimateIntro(reference: MediaSegment, currentDurationMs: Long): Pair<Long, Long>? {
        val endRef = reference.endMs ?: return null
        if (reference.durationMs <= 0 || currentDurationMs <= 0) return null
        val start = (reference.startMs.toDouble() / reference.durationMs * currentDurationMs).toLong()
        val end = (endRef.toDouble() / reference.durationMs * currentDurationMs).toLong()
        if (end <= start) return null
        return start.coerceAtLeast(0) to end.coerceAtMost(currentDurationMs)
    }
}
