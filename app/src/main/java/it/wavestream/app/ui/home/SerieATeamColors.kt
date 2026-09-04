package it.wavestream.app.ui.home

import androidx.compose.ui.graphics.Color

/**
 * Team colors for the Serie A match hero backdrop.
 * Pair = (top color, bottom color) of the vertical gradient on the team's side
 * of the diagonal split (dark variant on top, primary on the bottom, cinematic look).
 * Keyed by football-data.org TLA code.
 */
object SerieATeamColors {

    private val COLORS: Map<String, Pair<Color, Color>> = mapOf(
        "ATA" to Pair(Color(0xFF0A1E45), Color(0xFF1E56A8)), // Atalanta — blu/nero
        "BOL" to Pair(Color(0xFF0F1E3D), Color(0xFFA3123A)), // Bologna — navy/rosso
        "CAG" to Pair(Color(0xFF2B0A1E), Color(0xFFA3195B)), // Cagliari — rosso/blu
        "COM" to Pair(Color(0xFF0A1C4D), Color(0xFF1330A0)), // Como — blu
        "CRE" to Pair(Color(0xFF1F1F23), Color(0xFFB3122E)), // Cremonese — grigio/rosso
        "FIO" to Pair(Color(0xFF241048), Color(0xFF6A3FD1)), // Fiorentina — viola
        "GEN" to Pair(Color(0xFF0D1B3D), Color(0xFFB01D2E)), // Genoa — rosso/blu
        "VER" to Pair(Color(0xFF0D1B3D), Color(0xFFD9B40F)), // Hellas Verona — giallo/blu
        "INT" to Pair(Color(0xFF060B18), Color(0xFF0B3D91)), // Inter — nero/blu
        "JUV" to Pair(Color(0xFF0A0A0A), Color(0xFF2B2B33)), // Juventus — bianco/nero
        "LAZ" to Pair(Color(0xFF0D2B5B), Color(0xFF6EC6E8)), // Lazio — celeste
        "LEC" to Pair(Color(0xFF5C0E20), Color(0xFFB3122E)), // Lecce — giallorosso
        "MIL" to Pair(Color(0xFF0A0A0A), Color(0xFFB0122E)), // Milan — rossonero
        "NAP" to Pair(Color(0xFF00284D), Color(0xFF0F8CD9)), // Napoli — azzurro
        "PAR" to Pair(Color(0xFF0A1C4D), Color(0xFFF2C500)), // Parma — giallo/blu
        "PIS" to Pair(Color(0xFF0A0A0A), Color(0xFF1E56A8)), // Pisa — azzurro/nero
        "ROM" to Pair(Color(0xFF3D2A0A), Color(0xFF8B0F2B)), // Roma — rosso/ocra
        "SAS" to Pair(Color(0xFF0A0A0A), Color(0xFF0F9C46)), // Sassuolo — verde/nero
        "TOR" to Pair(Color(0xFF1A0505), Color(0xFF6A0F1E)), // Torino — granata
        "UDI" to Pair(Color(0xFF0A0A0A), Color(0xFF2B2B33))  // Udinese — bianco/nero
    )

    private val DEFAULT_COLORS = Pair(Color(0xFF14171F), Color(0xFF2B3242))

    fun forTla(tla: String?): Pair<Color, Color> =
        tla?.let { COLORS[it.trim().uppercase()] } ?: DEFAULT_COLORS
}
