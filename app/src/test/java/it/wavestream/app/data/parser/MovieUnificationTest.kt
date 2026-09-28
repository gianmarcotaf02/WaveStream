package it.wavestream.app.data.parser

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Regressione: il raggruppamento dei film (fusione doppioni/versioni) deve usare
 * il titolo **ripulito**, altrimenti lo stesso film finisce in gruppi diversi e
 * resta una scheda separata per ogni variante pubblicata dal provider.
 *
 * Casi reali osservati: su una libreria costruita dalle versioni precedenti
 * (righe legacy, `cleanName` nullo) il titolo grezzo conserva anno e formato,
 * quindi le chiavi diventavano `matrix 1999` / `matrix 3d` invece di `matrix`.
 */
class MovieUnificationTest {

    private val parser = ContentNameParser()

    /** Chiave di gruppo come la calcola MovieUnificationService (`groupTitleOf`). */
    private fun keyOf(rawName: String, year: Int?): String {
        val clean = parser.cleanTitle(rawName).ifBlank { rawName.trim() }
        return ContentKey.groupKeyNormalized(ContentKey.normalizeTitle(clean), year)
    }

    private fun groupsOf(rows: List<Pair<String, Int?>>): List<Pair<String, List<Pair<String, Int?>>>> =
        ContentKey.groupByTitleAndYearWithKeys(
            items = rows,
            titleOf = { parser.cleanTitle(it.first).ifBlank { it.first.trim() } },
            yearOf = { it.second }
        )

    @Test
    fun `le varianti dello stesso film producono la stessa chiave`() {
        val matrix = keyOf("Matrix", 1999)
        assertEquals("matrix|1999", matrix)
        assertEquals(matrix, keyOf("Matrix (1999)", 1999))
        assertEquals(matrix, keyOf("Matrix 3D", 1999))
        assertEquals(matrix, keyOf("Matrix 3D (1999)", 1999))
        assertEquals(matrix, keyOf("Matrix FHD ITA 1080p", 1999))
        assertEquals(matrix, keyOf("Matrix 1999 4K HEVC ITA", 1999))
    }

    @Test
    fun `Matrix e le sue varianti finiscono in un solo gruppo`() {
        val groups = groupsOf(
            listOf(
                "Matrix" to 1999,
                "Matrix (1999)" to 1999,
                "Matrix 3D" to null,
                "Matrix FHD ITA" to null,
                "Matrix Reloaded" to 2003
            )
        )
        assertEquals(2, groups.size)
        val matrixGroup = groups.first { it.first == "matrix" }.second
        assertEquals(4, matrixGroup.size)
    }

    @Test
    fun `il nome mostrato perde qualita lingua formato e anno`() {
        assertEquals("Iron Man 2", parser.cleanTitle("Iron Man 2 (2010) FHD ITA"))
        assertEquals("Matrix", parser.cleanTitle("Matrix (1999) 4K HDR ITA"))
        assertEquals("The Matrix", parser.cleanTitle("The Matrix 1999 1080p"))
        assertEquals("Inception", parser.cleanTitle("Inception 2010 4K"))
        assertEquals("Matrix", parser.cleanTitle("Matrix 3D"))
        assertEquals("Matrix", parser.cleanTitle("Matrix FHD"))
    }

    @Test
    fun `i seguiti e i titoli con numero finale non vengono mutilati`() {
        assertEquals("Iron Man 2", parser.cleanTitle("Iron Man 2"))
        assertEquals("Terminator 2", parser.cleanTitle("Terminator 2 FHD ITA"))
        assertEquals("Blade Runner 2049", parser.cleanTitle("Blade Runner 2049"))
        assertEquals("1917", parser.cleanTitle("1917 (2019) FHD"))
        assertEquals("2012", parser.cleanTitle("2012 (2009) HD"))
    }

    @Test
    fun `l'anno senza parentesi viene recuperato prima di ripulire il nome`() {
        assertEquals(2010, parser.extractBareYear("Inception 2010 4K"))
        assertEquals(1999, parser.extractBareYear("The Matrix 1999 FHD ITA"))
        assertEquals(null, parser.extractBareYear("Blade Runner 2049"))
        assertEquals(null, parser.extractBareYear("Iron Man 2"))
    }

    @Test
    fun `i remake con anno diverso restano schede separate`() {
        assertNotEquals(keyOf("Matrix", 1999), keyOf("Matrix", 2021))
        val groups = groupsOf(listOf("Matrix" to 1999, "Matrix" to 2021))
        assertEquals(2, groups.size)
    }

    @Test
    fun `i film diversi restano separati`() {
        val groups = groupsOf(
            listOf(
                "Matrix" to 1999,
                "Matrix Reloaded" to 2003,
                "Matrix Revolutions" to 2003
            )
        )
        assertEquals(3, groups.size)
    }

    @Test
    fun `le varianti senza anno seguono quella con anno`() {
        val groups = groupsOf(listOf("Matrix" to null, "Matrix (1999)" to 1999))
        assertEquals(1, groups.size)
        assertEquals(2, groups.first().second.size)
    }
}
