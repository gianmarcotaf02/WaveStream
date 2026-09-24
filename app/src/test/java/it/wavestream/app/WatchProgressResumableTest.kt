package it.wavestream.app

import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.data.database.entity.WatchProgress
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Regola di riprendibilità di un progresso.
 *
 * Bug che ha motivato la soglia: aprendo e chiudendo il player prima che la
 * riproduzione parta si creava una riga con `position = 0` e `isCompleted = false`;
 * l'hero la presentava come "Riprendi" con i minuti rimasti pari alla durata
 * totale ("2h 24m rimasti" su un film mai visto).
 */
class WatchProgressResumableTest {

    private fun progress(position: Long, duration: Long, completed: Boolean = false) = WatchProgress(
        profileId = 1L,
        contentType = ContentType.MOVIE,
        contentId = 42L,
        position = position,
        duration = duration,
        isCompleted = completed
    )

    @Test
    fun `position zero is not resumable`() {
        // Il caso del bug: durata totale con position 0
        assertFalse("riga fantasma position=0 non deve essere riprendibile",
            progress(position = 0, duration = 2 * 60 * 60 * 60_000L).isResumable)
    }

    @Test
    fun `real progress below threshold is not resumable`() {
        assertFalse("progresso sotto i 15s", progress(position = 10_000, duration = 8_640_000).isResumable)
    }

    @Test
    fun `progress at or above threshold is resumable`() {
        assertTrue("15s su un lungometraggio", progress(position = 15_000, duration = 8_640_000).isResumable)
        assertTrue("metà film", progress(position = 4_320_000, duration = 8_640_000).isResumable)
    }

    @Test
    fun `completed progress is not resumable`() {
        assertFalse("completato", progress(position = 8_600_000, duration = 8_640_000, completed = true).isResumable)
        assertFalse("completato anche sotto soglia",
            progress(position = 1_000, duration = 8_640_000, completed = true).isResumable)
    }

    @Test
    fun `missing duration is not resumable`() {
        assertFalse("duration 0", progress(position = 500_000, duration = 0).isResumable)
    }

    @Test
    fun `short content only needs a positive position`() {
        // Contenuti di 1 minuto o meno: basta qualsiasi posizione > 0
        assertTrue("clip da 30s con 1s visto", progress(position = 1_000, duration = 30_000).isResumable)
        assertFalse("clip da 30s con 0s visto", progress(position = 0, duration = 30_000).isResumable)
    }
}
