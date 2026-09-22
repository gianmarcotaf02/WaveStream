package it.wavestream.app.data.parser

import it.wavestream.app.data.database.entity.StreamQuality
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ContentNameParserTest {

    private val parser = ContentNameParser()

    @Test
    fun `cleanTitle rimuove tag di qualita`() {
        assertEquals("Inception", parser.cleanTitle("Inception 2010 4K"))
        assertEquals("Inception", parser.cleanTitle("Inception FHD ITA"))
        assertEquals("Inception", parser.cleanTitle("Inception 1080p"))
        assertEquals("Inception", parser.cleanTitle("Inception 720p"))
        assertEquals("Inception", parser.cleanTitle("Inception (2010) ITA"))
    }

    @Test
    fun `cleanTitle preserva titoli numerici`() {
        assertEquals("1917", parser.cleanTitle("1917 (2019) FHD"))
        assertEquals("2012", parser.cleanTitle("2012 (2009) HD"))
    }

    @Test
    fun `extractReleaseYear legge solo l'anno tra parentesi`() {
        assertEquals(2019, parser.extractReleaseYear("1917 (2019) FHD"))
        assertEquals(2009, parser.extractReleaseYear("2012 (2009) HD"))
        assertEquals(null, parser.extractReleaseYear("Blade Runner 2049"))
    }

    @Test
    fun `detectQuality riconosce le risoluzioni`() {
        assertEquals(StreamQuality.UHD, parser.detectQuality("Movie 4K"))
        assertEquals(StreamQuality.UHD, parser.detectQuality("Movie 2160p"))
        assertEquals(StreamQuality.FHD, parser.detectQuality("Movie 1080p"))
        assertEquals(StreamQuality.FHD, parser.detectQuality("Movie FHD"))
        assertEquals(StreamQuality.HD, parser.detectQuality("Movie 720p"))
        assertEquals(StreamQuality.HD, parser.detectQuality("Movie HD"))
        assertEquals(StreamQuality.SD, parser.detectQuality("Movie SD"))
        assertEquals(StreamQuality.UNKNOWN, parser.detectQuality("Movie"))
    }

    @Test
    fun `detectResolution normalizza la risoluzione`() {
        assertEquals("2160p", parser.detectResolution("Movie 4K"))
        assertEquals("1080p", parser.detectResolution("Movie FHD"))
        assertEquals("720p", parser.detectResolution("Movie 720p"))
        assertEquals("480p", parser.detectResolution("Movie DVDrip"))
        assertEquals(null, parser.detectResolution("Movie"))
    }

    @Test
    fun `qualityRank ordina dalla qualita peggiore alla migliore`() {
        val ranks = listOf(
            StreamQuality.UNKNOWN,
            StreamQuality.SD,
            StreamQuality.HD,
            StreamQuality.FHD,
            StreamQuality.UHD,
            StreamQuality.UHD_4K
        ).map { parser.qualityRank(it) }
        assertTrue(ranks == ranks.sorted())
        assertTrue(ranks.distinct().size == ranks.size)
    }
}
