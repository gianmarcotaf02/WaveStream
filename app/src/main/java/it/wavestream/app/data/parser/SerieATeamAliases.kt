package it.wavestream.app.data.parser

import java.text.Normalizer

/**
 * Alias table for Serie A teams, used to match playlist channel names
 * against the two teams of a match.
 *
 * Example: channel "Sky Sport Calcio INTER-MILAN HD" matches a match Inter vs Milan
 * via alias "inter"; "Juve TV" matches Juventus via "juve".
 */
object SerieATeamAliases {

    /** football-data.org TLA → list of normalized aliases (lowercase, no accents). */
    private val TLA_ALIASES: Map<String, List<String>> = mapOf(
        "ATA" to listOf("atalanta"),
        "BOL" to listOf("bologna"),
        "CAG" to listOf("cagliari"),
        "COM" to listOf("como"),
        "CRE" to listOf("cremonese"),
        "FIO" to listOf("fiorentina"),
        "FRO" to listOf("frosinone"),
        "GEN" to listOf("genoa"),
        "MON" to listOf("monza"),
        "VEN" to listOf("venezia"),
        "USL" to listOf("lecce"),
        "VER" to listOf("hellas verona", "hellas", "verona"),
        "INT" to listOf("inter", "internazionale", "internazionale milano"),
        "JUV" to listOf("juventus", "juve"),
        "LAZ" to listOf("lazio"),
        "LEC" to listOf("lecce"),
        "MIL" to listOf("milan", "ac milan"),
        "NAP" to listOf("napoli"),
        "PAR" to listOf("parma"),
        "PIS" to listOf("pisa"),
        "ROM" to listOf("as roma", "roma"),
        "SAS" to listOf("sassuolo"),
        "TOR" to listOf("torino", "toro"),
        "UDI" to listOf("udinese")
    )

    /**
     * All aliases for the two teams of a match (home + away).
     * Falls back to the normalized shortName if the TLA is unknown.
     */
    fun aliasesForMatch(
        homeTla: String?,
        homeShortName: String,
        awayTla: String?,
        awayShortName: String
    ): List<String> {
        return aliasesForTeam(homeTla, homeShortName) +
            aliasesForTeam(awayTla, awayShortName)
    }

    /**
     * Alias di una singola squadra (pubblico, usato anche per il matching
     * degli eventi Sofascore con le partite football-data).
     */
    fun teamAliases(tla: String?, shortName: String): List<String> {
        val fromTla = tla?.let { TLA_ALIASES[it.trim().uppercase()] }
        val fromShortName = normalize(shortName).takeIf { it.isNotBlank() }
        return ((fromTla ?: emptyList()) + listOfNotNull(fromShortName)).distinct()
    }

    private fun aliasesForTeam(tla: String?, shortName: String): List<String> = teamAliases(tla, shortName)

    /**
     * True if the channel name contains at least one alias of the teams
     * (word-boundary match, so "inter" doesn't match "internazionale" channel names
     * wrongly and "roma" doesn't match "romagna").
     */
    fun channelMatchesTeam(channelName: String, aliases: List<String>): Boolean {
        val name = normalize(channelName)
        if (name.isBlank()) return false
        return aliases.any { alias ->
            alias.isNotBlank() && name.containsWord(alias)
        }
    }

    /**
     * Lowercase, accents stripped. Non alphanumeric chars (spaces, dashes,
     * underscores, dots) act as word separators.
     */
    fun normalize(text: String): String {
        val deaccented = Normalizer.normalize(text.lowercase(), Normalizer.Form.NFD)
            .replace(Regex("\\p{Mn}+"), "")
        return deaccented
    }

    /**
     * Whole-word containment using lookarounds on [a-z0-9], so that
     * "inter-milan", "inter_milan", "inter milan" and "interhd"... —
     * the last one does NOT match ("hd" glued to the word is handled by
     * the right lookahead). E.g. "interhd" does not match "inter".
     */
    /**
     * Cache delle regex per alias: la compilazione è costosa e viene ripetuta
     * per OGNI canale della playlist (decine di migliaia) — senza cache la ricerca
     * canali impiega secondi anche su TV prestanti. Le parole distinte sono poche
     * (~60 alias), quindi la cache è piccola e stabile. Regex è thread-safe.
     */
    private val regexCache = java.util.concurrent.ConcurrentHashMap<String, Regex>()

    private fun wordRegex(word: String): Regex =
        regexCache.getOrPut(word) {
            Regex("(?<![a-z0-9])${Regex.escape(word)}(?![a-z0-9])")
        }

    private fun String.containsWord(word: String): Boolean {
        return wordRegex(word).containsMatchIn(this)
    }
}
