package it.wavestream.app

import it.wavestream.app.data.parser.ContentNameParser
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Verifica che `cleanTitle` (che ora rimuove i tag in UNA sola passata con
 * `tagStripRegex`) sia equivalente all'implementazione originale, che toglieva
 * qualità/lingua/edizioni/HDR/codec con regex separate applicate in sequenza.
 *
 * Il rischio concreto della fusione è l'ordine di rimozione: se la rimozione di
 * un tag ne "espone" un altro, la versione sequenziale lo vedrebbe mentre la
 * versione a passata singola no. Il test confronta le due implementazioni su un
 * corpus di nomi VOD realistici + casi volutamente scomodi.
 */
class CleanTitleEquivalenceTest {

    private val parser = ContentNameParser()

    // ------------------------------------------------------------------
    // Replica dell'IMPLEMENTAZIONE ORIGINALE (sequenziale)
    // ------------------------------------------------------------------

    private fun wb(s: String) = Regex("""\b${Regex.escape(s)}\b""", RegexOption.IGNORE_CASE)

    private val qualityPatterns = mapOf(
        "UHD" to listOf("4k", "uhd", "2160p", "2160", "8k"),
        "FHD" to listOf("1080p", "1080", "fhd", "fullhd", "full hd"),
        "HD" to listOf("720p", "720", "hd", "hdtv"),
        "SD" to listOf("sd", "480p", "480", "360p", "dvdrip")
    )
    private val languagePatterns = mapOf(
        "ITA" to listOf("ita", "italian", "italiano"),
        "ENG" to listOf("eng", "english"),
        "GER" to listOf("ger", "german", "deutsch", "germania"),
        "FRA" to listOf("fra", "french", "francese"),
        "SPA" to listOf("spa", "spanish", "spagnolo"),
        "SUB" to listOf("sub", "subbed", "sottotitoli")
    )
    private val extendedPatterns = listOf(
        "extended", "director", "uncut", "unrated",
        "versione integrale", "vers. integrale", "integrale",
        "edizione speciale", "special edition"
    )
    private val hdrPatterns = listOf("hdr", "hdr10", "dolby vision", "dv")
    private val codecTags = listOf(
        "HEVC", "H264", "H265", "H.264", "H.265", "x264", "x265", "AAC", "AC3", "DTS", "ATMOS",
        "WEB-DL", "WEBDL", "WEBRIP", "BLURAY", "BLU-RAY", "BDRIP", "BRRIP", "DVDRIP", "CAM", "TS", "TC",
        "BDMUX", "REMUX", "MUX", "WEB", "HDTS", "HQ", "VIP", "MULTI", "DUAL", "DUAL AUDIO",
        "10BIT", "8BIT", "SDR", "HDR10+", "HDR10", "DOLBY VISION", "EAC3", "DD5.1"
    )
    private val removePatterns = listOf(
        Regex("""\[.*?\]"""),
        Regex("""\(.*?(?:hd|sd|4k|720|1080|ita|eng).*?\)""", RegexOption.IGNORE_CASE),
        Regex("""\s*[-|]\s*$"""),
        Regex("""\s{2,}""")
    )

    /** cleanTitle come era PRIMA della fusione in passata singola. */
    private fun legacyCleanTitle(name: String): String {
        var result = name
        result = result.replace(Regex("""^[\-\#\*\|\[\]:\s]+"""), "")
        result = result.replace(Regex("""[\-\#\*\|\[\]:\s]+$"""), "")
        result = result.replace(Regex("""\[[^\]]*\]"""), " ")
        result = result.replace(Regex("""\s*\(\d{4}\)\s*"""), " ")
        // --- i 5 loop che ora sono una singola passata ---
        for (pats in qualityPatterns.values) for (p in pats) result = wb(p).replace(result, "")
        for (pats in languagePatterns.values) for (p in pats) result = wb(p).replace(result, "")
        for (p in extendedPatterns) result = wb(p).replace(result, "")
        for (p in hdrPatterns) result = wb(p).replace(result, "")
        for (p in codecTags) result = wb(p).replace(result, "")
        // ------------------------------------------------
        for (pattern in removePatterns) result = pattern.replace(result, " ")
        result = result.replace(Regex("""^\s*[-|:•]+\s*"""), "")
        result = result.replace(Regex("""\s*[-|:•]+\s*$"""), "")
        // Regola corretta: si rimuove solo un ANNO accodato dal provider
        // ("Inception 2010"), non un numero qualsiasi. La versione precedente
        // ("\s+\d+\s*$") mangiava il numero dei seguiti ("Iron Man 2" → "Iron Man",
        // che poi si univa al primo film) e i titoli che finiscono con un numero
        // ("Blade Runner 2049" → "Blade Runner").
        result = result.replace(Regex("""\s+(19\d{2}|20[0-2]\d)\s*$"""), "")
        result = result.replace(Regex("""#\w+"""), "")
        result = result.trim().replace(Regex("""\s+"""), " ")
        return result
    }

    // ------------------------------------------------------------------
    // Corpus
    // ------------------------------------------------------------------

    private val corpus = listOf(
        // Nomi VOD realistici
        "Inception (2010) FHD ITA",
        "Dolemite Is My Name (2019)",
        "Untold: The Testimony of Vince Young (2026)",
        "El último gigante (2026)",
        "Avengers Endgame 4K HDR Dual Audio",
        "The Matrix 1080p WEB-DL x264",
        "Parasite [2019] [SUB ITA] [1080p]",
        "Interstellar (2014) BluRay DTS",
        "La La Land 720p HDTV",
        "Gladiator Extended Edition 4K",
        "Blade Runner 2049 (2017) UHD",
        "1917 (2019) FHD",
        "2012 (2009) HD",
        "Mission Impossible - Fallout 2018 4K",
        "Star Wars - Episodio IV (1977) Remux",
        "Il Padrino Parte I (1972) ITA 4K HDR10+",
        "Titanic Director's Cut unrated 1080p",
        "Spider-Man - No Way Home (2021) CAM TS",
        "Joker (2019) WEBRIP x265 HEVC",
        "Dune (2021) 2160p Dolby Vision Atmos",
        "Film 4K UHD Dual Audio ITA ENG",
        "Documentario - Versione Integrale 720p",
        "Serie? No: Top Gun Maverick 2022 FHD",
        "Il Re Leone (1994) #1 BluRay",
        "Matrix Reloaded 480p DVDRip",
        "Concerto Live 2023 Multi Audio 360p",
        "Filmino 8bit 10bit SDR 720p",
        "Trailer BDMUX REMUX MUX 1080p",
        "Weird WEBDL WEBRIP HQ VIP 720p",
        "TC CAM TS TC HDTS 480p",
        // Casi volutamente scomodi (tag sovrapposti / possibili divergenze)
        "SDR vs HDR comparison 720p",
        "WEB-DL vs WEBDL",
        "WEB-TS special",
        "CAM-TS rip",
        "H.264 x264 DD5.1 EAC3",
        "HDR10+ vs HDR10",
        "hd sdr",
        "Childhood Memories 1080p",
        "SD-ITA 480p",
        "fullhd fhd full hd",
        "Multi Dual Audio Atmos AC3",
        "Atmos ATMOS DTS",
        "vers. integrale edizione speciale",
        "sottotitoli subbed eng english",
        "germania deutsch ger",
        "Blu-ray BDRIP BRRIP",
        "",
        "   ",
        "SoloTitolo",
        "Titolo (2020) (2019)",
        "x#hash 2019 - 2020"
    )

    @Test
    fun `cleanTitle matches legacy sequential implementation`() {
        val mismatches = corpus.filter { parser.cleanTitle(it) != legacyCleanTitle(it) }
        for (m in mismatches) {
            println("MISMATCH input=[$m] new=[${parser.cleanTitle(m)}] legacy=[${legacyCleanTitle(m)}]")
        }
        assertTrue(
            "Trovate ${mismatches.size} divergenze rispetto all'implementazione sequenziale",
            mismatches.isEmpty()
        )
    }

    @Test
    fun `cleanTitle strips tags and stays consistent with legacy`() {
        // Proprietà semantiche (non valori esatti guadati) + equivalenza legacy.
        val r = parser.cleanTitle("Inception (2010) FHD ITA")
        assertTrue("non vuoto: [$r]", r.isNotBlank())
        assertTrue("anno rimossa: [$r]", !r.contains("2010"))
        assertTrue("tag qualità/lingua rimossi: [$r]", !r.contains("FHD") && !r.contains("ITA"))
        // Titolo semplice invariato
        assertEquals("SoloTitolo", parser.cleanTitle("SoloTitolo"))
        // Ogni elemento del corpus deve restituire lo stesso risultato della versione legacy
        corpus.forEach { assertEquals("cleanTitle($it)", legacyCleanTitle(it), parser.cleanTitle(it)) }
    }

    @Test
    fun `generated combinations match legacy`() {
        val fragments = listOf(
            "Inception", "Matrix", "2019", "4K", "FHD", "HD", "SD", "ITA", "ENG",
            "WEB-DL", "BluRay", "HDR10+", "H.264", "x264", "TS", "CAM", "WEB", "TS",
            "Multi Audio", "Dolby Vision", "Extended", "Director's Cut", "Sub ITA",
            "720p", "1080p", "2160p", "HDTV", "REMUX", "AAC", "Atmos", "8bit"
        )
        val seps = listOf(" ", " - ", " | ", "  ", " (", ") ", "[", "]")
        var cases = 0
        val sb = StringBuilder()
        // Combinazioni deterministiche: tutte le coppie + una finestra scorrevole di 4
        for (a in fragments) for (b in fragments) {
            val name = "$a$b"
            assertEquals("cleanTitle($name)", legacyCleanTitle(name), parser.cleanTitle(name))
            cases++
            val spaced = "$a $b"
            assertEquals("cleanTitle($spaced)", legacyCleanTitle(spaced), parser.cleanTitle(spaced))
            cases++
        }
        for (i in fragments.indices) {
            val name = fragments.drop(i).take(4).joinToString(seps[i % seps.size])
            assertEquals("cleanTitle($name)", legacyCleanTitle(name), parser.cleanTitle(name))
            cases++
            sb.append(name).append('\n')
        }
        assertTrue("almeno qualche centinaio di casi ($cases)", cases >= 1000)
    }

    @Test
    fun `skipTitle does not affect other parse fields`() {
        val full = parser.parse("Inception (2010) FHD ITA ENG")
        val light = parser.parse("Inception (2010) FHD ITA ENG", skipTitle = true)
        assertEquals(full.language, light.language)
        assertEquals(full.isHdr, light.isHdr)
        assertEquals(full.isExtended, light.isExtended)
        assertEquals(full.is4K, light.is4K)
        assertEquals(full.year, light.year)
        // Il titolo pulito deve essere costruito SOLO nella variante completa:
        // skipTitle serve proprio a evitare la pipeline regex di cleanTitle.
        assertTrue("full deve avere il titolo: [${full.cleanTitle}]", full.cleanTitle.contains("Inception"))
        assertTrue("skipTitle non deve costruire il titolo: [${light.cleanTitle}]",
            !light.cleanTitle.contains("Inception"))
    }
}
