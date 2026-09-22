package it.wavestream.app.data.parser

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ContentKeyTest {

    @Test
    fun `normalizeTitle rimuove accenti e punteggiatura`() {
        assertEquals("ca va", ContentKey.normalizeTitle("Cà  Va!"))
        assertEquals("l eta dell oro", ContentKey.normalizeTitle("L'età  dell'oro"))
    }

    @Test
    fun `groupKey distingue anni diversi`() {
        assertNotEquals(
            ContentKey.groupKey("The Thing", 1982),
            ContentKey.groupKey("The Thing", 2011)
        )
    }

    @Test
    fun `stesso titolo senza anno viene raggruppato`() {
        val groups = ContentKey.groupByTitleAndYear(
            items = listOf("Inception" to 2010, "Inception" to null, "Inception" to null),
            titleOf = { it.first },
            yearOf = { it.second }
        )
        assertEquals(1, groups.size)
        assertEquals(3, groups[0].size)
    }

    @Test
    fun `stesso titolo con anni diversi resta separato`() {
        val groups = ContentKey.groupByTitleAndYear(
            items = listOf("The Thing 1982", "The Thing 2011"),
            titleOf = { it },
            yearOf = { it.substringAfterLast(' ').toInt() }
        )
        assertEquals(2, groups.size)
    }

    @Test
    fun `titoli diversi restano separati`() {
        val groups = ContentKey.groupByTitleAndYear(
            items = listOf("Inception", "Interstellar"),
            titleOf = { it },
            yearOf = { null }
        )
        assertEquals(2, groups.size)
        assertTrue(groups.all { it.size == 1 })
    }
}
