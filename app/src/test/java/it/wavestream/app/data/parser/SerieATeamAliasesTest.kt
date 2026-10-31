package it.wavestream.app.data.parser

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Il matching per alias alimenta la ricerca dei canali della partita
 * (`SerieAMatchRepository.scanTeams`). `channelMatchesTeams` è la
 * variante a due squadre usata nella scansione della playlist: deve dare
 * esattamente lo stesso risultato di due chiamate a `channelMatchesTeam`,
 * altrimenti l'ottimizzazione (una sola normalizzazione per canale) cambia i
 * canali trovati.
 */
class SerieATeamAliasesTest {

    private val genoa = SerieATeamAliases.teamAliases("GEN", "Genoa")
    private val fiorentina = SerieATeamAliases.teamAliases("FIO", "Fiorentina")

    @Test
    fun `due squadre insieme equivalgono a due chiamate separate`() {
        val names = listOf(
            "DAZN SERIE A 10 FHD GENOA",
            "DAZN SERIE A 11 HD FIORENTINA",
            "Genoa FHD",
            "Fiorentina SD",
            "GEN-FIO",
            "DAZN 1 FHD",
            "Sky Sport Calcio Inter-Milan",
            "GENOVA 24",
            ""
        )
        names.forEach { name ->
            val (home, away) = SerieATeamAliases.channelMatchesTeams(name, genoa, fiorentina)
            assertEquals("casa: $name", SerieATeamAliases.channelMatchesTeam(name, genoa), home)
            assertEquals("ospite: $name", SerieATeamAliases.channelMatchesTeam(name, fiorentina), away)
        }
    }

    @Test
    fun `i feed di squadra matchano la squadra giusta`() {
        val (home, away) = SerieATeamAliases.channelMatchesTeams("DAZN SERIE A 10 FHD GENOA", genoa, fiorentina)
        assertTrue(home)
        assertFalse(away)

        val (home2, away2) = SerieATeamAliases.channelMatchesTeams("Fiorentina FHD", genoa, fiorentina)
        assertFalse(home2)
        assertTrue(away2)
    }

    @Test
    fun `la sigla matcha solo in maiuscolo e come parola intera`() {
        assertTrue(SerieATeamAliases.channelMatchesTeam("GEN-FIO", genoa))
        assertFalse(SerieATeamAliases.channelMatchesTeam("Mon 21:00 Inter", SerieATeamAliases.teamAliases("MON", "Monza")))
        // "internazionale" è un alias esplicito di INT, ma "interhd" non deve matchare "inter".
        assertTrue(SerieATeamAliases.channelMatchesTeam("DAZN FC Internazionale", SerieATeamAliases.teamAliases("INT", "Inter")))
        assertFalse(SerieATeamAliases.channelMatchesTeam("interhd", SerieATeamAliases.teamAliases("INT", "Inter")))
    }

    @Test
    fun `normalize toglie accenti e maiuscole`() {
        assertEquals("como 1907", SerieATeamAliases.normalize("Còmo 1907"))
        assertEquals("venezia", SerieATeamAliases.normalize("VENEZIA"))
    }
}
