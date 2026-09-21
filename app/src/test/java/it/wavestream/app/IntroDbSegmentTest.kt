package it.wavestream.app

import it.wavestream.app.data.api.IntroDbSegment
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.MediaSegment
import it.wavestream.app.data.database.entity.SegmentSource
import it.wavestream.app.data.database.entity.SegmentType
import it.wavestream.app.data.repository.CreditsSegmentEstimator
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

/**
 * Test della logica pura dell'integrazione IntroDB e della stima dei credits.
 * Non richiedono Android: nessuna dipendenza da Room/Rete.
 */
class IntroDbSegmentTest {

    @Test
    fun `resolvedStartMs prefers millis`() {
        val segment = IntroDbSegment(start_ms = 3431000, end_ms = 3500000, start_sec = 10.0, end_sec = 20.0)
        assertEquals(3431000L, segment.resolvedStartMs)
        assertEquals(3500000L, segment.resolvedEndMs)
    }

    @Test
    fun `resolvedStartMs falls back to seconds`() {
        val segment = IntroDbSegment(start_sec = 3631.5, end_sec = 3699.5)
        assertEquals(3631500L, segment.resolvedStartMs)
        assertEquals(3699500L, segment.resolvedEndMs)
    }

    @Test
    fun `resolved times are null when both fields are missing`() {
        val segment = IntroDbSegment(confidence = 1f, submission_count = 2)
        assertNull(segment.resolvedStartMs)
        assertNull(segment.resolvedEndMs)
    }

    @Test
    fun `estimateCreditsStart keeps the same tail as the reference`() {
        // Riferimento: durata 40 min, credits a 38 min -> coda di 2 min.
        val reference = mediaSegment(
            startMs = 38 * 60_000L,
            durationMs = 40 * 60_000L
        )
        // Episodio corrente di 45 min -> credits stimati a 43 min.
        val estimated = CreditsSegmentEstimator.estimateCreditsStart(reference, 45 * 60_000L)
        assertEquals(43 * 60_000L, estimated)
    }

    @Test
    fun `estimateCreditsStart returns null with invalid durations`() {
        val reference = mediaSegment(startMs = 1000L, durationMs = 0L)
        assertNull(CreditsSegmentEstimator.estimateCreditsStart(reference, 60_000L))
        assertNull(CreditsSegmentEstimator.estimateCreditsStart(reference, 0L))
    }

    private fun mediaSegment(startMs: Long, durationMs: Long) = MediaSegment(
        contentType = ContentType.EPISODE,
        type = SegmentType.CREDITS,
        contentId = 1L,
        seriesId = 1L,
        seasonNumber = 1,
        episodeNumber = 1,
        startMs = startMs,
        durationMs = durationMs,
        source = SegmentSource.USER_MARK,
        confidence = 1f
    )
}
