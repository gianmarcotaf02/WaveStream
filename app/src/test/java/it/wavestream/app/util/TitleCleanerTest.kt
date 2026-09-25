package it.wavestream.app.util

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class TitleCleanerTest {

    @Test
    fun `getCleanEpisodeTitle rimuove pattern SxxExx e prefisso serie`() {
        assertEquals(
            "Il risveglio",
            TitleCleaner.getCleanEpisodeTitle(
                originalName = "Breaking Bad - S01E03 - Il risveglio",
                episodeNumber = 3,
                seriesName = "Breaking Bad"
            )
        )
    }

    @Test
    fun `getCleanEpisodeTitle restituisce null per titolo generico`() {
        assertNull(TitleCleaner.getCleanEpisodeTitle("Episodio 2", 2))
        assertNull(TitleCleaner.getCleanEpisodeTitle("Episode 02", 2))
        assertNull(TitleCleaner.getCleanEpisodeTitle("S01E02", 2))
        assertNull(TitleCleaner.getCleanEpisodeTitle("2", 2))
        assertNull(TitleCleaner.getCleanEpisodeTitle("", 2))
        assertNull(TitleCleaner.getCleanEpisodeTitle(null, 2))
    }

    @Test
    fun `getCleanEpisodeTitle restituisce null se il titolo coincide con la serie`() {
        assertNull(
            TitleCleaner.getCleanEpisodeTitle(
                originalName = "Breaking Bad",
                episodeNumber = 1,
                seriesName = "Breaking Bad"
            )
        )
    }

    @Test
    fun `resolveEpisodeDisplayTitle preferisce il titolo del provider`() {
        assertEquals(
            "Il risveglio",
            TitleCleaner.resolveEpisodeDisplayTitle(
                providerName = "S01E03 - Il risveglio",
                tmdbName = "Nome TMDB diverso",
                episodeNumber = 3
            )
        )
    }

    @Test
    fun `resolveEpisodeDisplayTitle usa il fallback TMDB quando il provider e generico`() {
        assertEquals(
            "Pilota",
            TitleCleaner.resolveEpisodeDisplayTitle(
                providerName = "Episodio 1",
                tmdbName = "Pilota",
                episodeNumber = 1
            )
        )
    }

    @Test
    fun `resolveEpisodeDisplayTitle usa Episodio N come ultimo fallback`() {
        assertEquals(
            "Episodio 5",
            TitleCleaner.resolveEpisodeDisplayTitle(
                providerName = "S01E05",
                tmdbName = null,
                episodeNumber = 5
            )
        )
    }
}
