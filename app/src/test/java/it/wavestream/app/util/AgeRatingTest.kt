package it.wavestream.app.util

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

/**
 * La conversione del visto TMDB nella scala italiana è una tabella: se cambia di
 * nascosto, il badge mente sul contenuto. Questi test coprono l'intera tabella,
 * compresi i casi che hanno generato etichette strane in passato (`VM14`, `BA`).
 */
class AgeRatingTest {

    // ===== Visti "per tutti" =====

    @Test
    fun `visti senza restrizione diventano T`() {
        listOf("T", "TP", "G", "TV-Y", "TV-Y7", "TV-G", "0").forEach {
            assertEquals("per '$it'", "T", AgeRating.label(it))
        }
    }

    @Test
    fun `T e 6 piu condividono la fascia verde`() {
        assertEquals(AgeRating.Level.ALL, AgeRating.level("T"))
        assertEquals(AgeRating.Level.ALL, AgeRating.level("6+"))
    }

    // ===== Guida genitoriale =====

    @Test
    fun `PG e TV-PG diventano 6 piu`() {
        assertEquals("6+", AgeRating.label("PG"))
        assertEquals("6+", AgeRating.label("TV-PG"))
    }

    // ===== 12+: si arrotonda per eccesso =====

    @Test
    fun `eta sotto 12 sale a 12 piu`() {
        // "7+"/"10+" non sono classi italiane: si prende la più bassa che le copre
        listOf("7", "7+", "10", "10+", "12", "12+", "VM12").forEach {
            assertEquals("per '$it'", "12+", AgeRating.label(it))
        }
    }

    // ===== 14+ =====

    @Test
    fun `PG-13 e i visti da 13-14 anni diventano 14 piu`() {
        // PG-13 = 13 anni: la classe italiana successiva è 14+ (mai 12+, che
        // sarebbe più permissivo della fonte)
        listOf("PG-13", "14", "14+", "VM14", "TV-14").forEach {
            assertEquals("per '$it'", "14+", AgeRating.label(it))
        }
    }

    // ===== 18+ =====

    @Test
    fun `vietato ai minori diventa 18 piu`() {
        listOf("R", "NC-17", "X", "TV-MA").forEach {
            assertEquals("per '$it'", "18+", AgeRating.label(it))
        }
    }

    @Test
    fun `eta uguale o superiore a 18 resta su 18 piu`() {
        listOf("16+", "18", "18+", "VM18", "21+").forEach {
            assertEquals("per '$it'", "18+", AgeRating.label(it))
        }
    }

    @Test
    fun `12 e 14 piu sono ambra, 18 piu rosso`() {
        listOf("12+", "14+").forEach {
            assertEquals("per '$it'", AgeRating.Level.TEEN, AgeRating.level(it))
        }
        assertEquals(AgeRating.Level.MATURE, AgeRating.level("18+"))
    }

    // ===== Nessun badge =====

    @Test
    fun `visto assente o non interpretabile non produce badge`() {
        listOf(null, "", "   ", "BA", "N/A", "abc").forEach {
            assertNull("per '$it'", AgeRating.label(it))
        }
    }

    @Test
    fun `etichetta non prevista resta prudente`() {
        // level() è pubblica: qualunque valore inatteso deve dare il colore più
        // restrittivo, non il verde
        assertEquals(AgeRating.Level.MATURE, AgeRating.level("qualcosa"))
    }

    // ===== Normalizzazione dell'input =====

    @Test
    fun `input sporco viene normalizzato`() {
        assertEquals("14+", AgeRating.label("  vm14 "))
        assertEquals("T", AgeRating.label(" t "))
        assertEquals("18+", AgeRating.label("r"))
        assertEquals("6+", AgeRating.label("tv-pg"))
    }
}
