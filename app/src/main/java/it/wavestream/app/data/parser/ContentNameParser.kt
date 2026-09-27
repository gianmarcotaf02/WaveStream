package it.wavestream.app.data.parser

import it.wavestream.app.data.database.entity.StreamQuality
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Intelligent content name parser
 * Extracts clean title, year, quality, language from IPTV stream names
 * 
 * Examples:
 * - "C'era una volta in America (1984) - Vers. Integrale HD ITA" 
 *   → title: "C'era una volta in America", year: 1984, quality: HD, lang: ITA
 * - "Breaking Bad S01E01 720p"
 *   → title: "Breaking Bad", season: 1, episode: 1, quality: HD
 * - "Rai 1 HD"
 *   → title: "Rai 1", quality: HD, isLive: true
 */
@Singleton
class ContentNameParser @Inject constructor() {
    
    data class ParsedContent(
        val cleanTitle: String,          // For TMDB search
        val originalName: String,        // Keep original
        val year: Int? = null,
        val season: Int? = null,
        val episode: Int? = null,
        val quality: StreamQuality = StreamQuality.UNKNOWN,
        val language: String? = null,
        val isExtended: Boolean = false,
        val isHdr: Boolean = false,
        val is4K: Boolean = false,
        val isLive: Boolean = false,
        val contentType: ContentType = ContentType.UNKNOWN
    )
    
    enum class ContentType {
        MOVIE, SERIES, LIVE_TV, UNKNOWN
    }
    
    // Patterns for cleaning
    // Anno tra parentesi/quadre — convenzione standard delle playlist: "Titolo (2019)".
    // NON marchiamo mai un titolo numerico ("1917", "Blade Runner 2049") come anno.
    private val parenthesizedYearPattern = """[\(\[](19|20)\d{2}[\)\]]""".toRegex()
    private val seasonEpisodePatterns = listOf(
        """[Ss](\d{1,2})[Ee](\d{1,2})""".toRegex(),           // S01E01
        """[Ss](\d{1,2})\s*-?\s*[Ee][Pp]?\.?\s*(\d{1,2})""".toRegex(), // S01 E01, S01 Ep01
        """[Ss]tagione\s*(\d{1,2})\s*[Ee]pisodio\s*(\d{1,2})""".toRegex(), // Italian
        """(\d{1,2})x(\d{1,2})""".toRegex()                    // 1x01
    )
    
    // Quality patterns
    private val qualityPatterns = mapOf(
        StreamQuality.UHD to listOf("4k", "uhd", "2160p", "2160", "8k"),
        StreamQuality.FHD to listOf("1080p", "1080", "fhd", "fullhd", "full hd"),
        StreamQuality.HD to listOf("720p", "720", "hd", "hdtv"),
        StreamQuality.SD to listOf("sd", "480p", "480", "360p", "dvdrip")
    )

    /**
     * Qualità rilevata dal nome della sorgente VOD (word-boundary, così "hd"
     * non viene trovato dentro parole come "childhood").
     */
    fun detectQuality(name: String): StreamQuality {
        for ((quality, regexes) in qualityRegexes) {
            if (regexes.any { it.containsMatchIn(name) }) {
                return quality
            }
        }
        return StreamQuality.UNKNOWN
    }

    /** Risoluzione normalizzata rilevata dal nome, es. "1080p"/"2160p" (null se ignota). */
    fun detectResolution(name: String): String? {
        val lower = name.lowercase()
        return when {
            resolutionUhdRegex.containsMatchIn(lower) -> "2160p"
            resolutionFhdRegex.containsMatchIn(lower) -> "1080p"
            resolutionHdRegex.containsMatchIn(lower) -> "720p"
            resolutionSdRegex.containsMatchIn(lower) -> "480p"
            else -> null
        }
    }

    /** Rank numerico della qualità per l'ordinamento SQL (più alto = migliore). */
    fun qualityRank(quality: StreamQuality): Int = when (quality) {
        StreamQuality.UNKNOWN -> 0
        StreamQuality.AUTO -> 1
        StreamQuality.SD -> 2
        StreamQuality.HD -> 3
        StreamQuality.FHD -> 4
        StreamQuality.UHD -> 5
        StreamQuality.UHD_4K -> 6
    }
    
    // Language patterns
    private val languagePatterns = mapOf(
        "ITA" to listOf("ita", "italian", "italiano"),
        "ENG" to listOf("eng", "english"),
        "GER" to listOf("ger", "german", "deutsch", "germania"),
        "FRA" to listOf("fra", "french", "francese"),
        "SPA" to listOf("spa", "spanish", "spagnolo"),
        "SUB" to listOf("sub", "subbed", "sottotitoli")
    )
    
    // Extended/Special editions
    private val extendedPatterns = listOf(
        "extended", "director", "uncut", "unrated", 
        "versione integrale", "vers. integrale", "integrale",
        "edizione speciale", "special edition"
    )
    
    // HDR patterns
    private val hdrPatterns = listOf("hdr", "hdr10", "dolby vision", "dv")
    
    // Common suffixes to remove
    private val removePatterns = listOf(
        """\[.*?\]""".toRegex(),      // [anything]
        """\(.*?(?:hd|sd|4k|720|1080|ita|eng).*?\)""".toRegex(RegexOption.IGNORE_CASE),
        """\s*[-|]\s*$""".toRegex(),  // Trailing separators
        """\s{2,}""".toRegex()        // Multiple spaces
    )

    // --- Regex precompilate -------------------------------------------------
    // Evita di ricompilare le regex ad ogni chiamata (enorme risparmio durante
    // l'unificazione e la ricerca su librerie grandi).
    private fun wb(s: String) = Regex("""\b${Regex.escape(s)}\b""", RegexOption.IGNORE_CASE)

    private val qualityRegexes: List<Pair<StreamQuality, List<Regex>>> =
        qualityPatterns.map { (q, pats) -> q to pats.map { wb(it) } }
    private val qualityRegexesFlat: List<Regex> = qualityRegexes.flatMap { it.second }

    private val languageRegexes: Map<String, List<Regex>> =
        languagePatterns.mapValues { (_, pats) -> pats.map { wb(it) } }

    private val extendedRegexes: List<Regex> = extendedPatterns.map { wb(it) }
    private val hdrRegexes: List<Regex> = hdrPatterns.map { wb(it) }

    private val resolutionUhdRegex = Regex("""\b(2160p|2160|4k|uhd|8k)\b""")
    private val resolutionFhdRegex = Regex("""\b(1080p|1080|fhd|full ?hd)\b""")
    private val resolutionHdRegex = Regex("""\b(720p|720|hdtv)\b""")
    private val resolutionSdRegex = Regex("""\b(480p|480|360p|dvdrip)\b""")

    private val codecTags = listOf("HEVC", "H264", "H265", "H.264", "H.265", "x264", "x265", "AAC", "AC3", "DTS", "ATMOS",
        "WEB-DL", "WEBDL", "WEBRIP", "BLURAY", "BLU-RAY", "BDRIP", "BRRIP", "DVDRIP", "CAM", "TS", "TC",
        "BDMUX", "REMUX", "MUX", "WEB", "HDTS", "HQ", "VIP", "MULTI", "DUAL", "DUAL AUDIO",
        "10BIT", "8BIT", "SDR", "HDR10+", "HDR10", "DOLBY VISION", "EAC3", "DD5.1")
    private val codecRegexes: List<Regex> = codecTags.map { wb(it) }

    // Rimozione di TUTTI i tag (qualità, lingua, edizioni, HDR, codec) in una sola
    // passata. Prima erano ~90 regex separate, ognuna con uno scan completo della
    // stringa: ~0.6ms per titolo, e con ~69k VOD il solo raggruppamento occupava
    // decine di secondi. L'ordine degli alternativi riproduce esattamente quello
    // dei loop originali (qualità → lingua → edizioni → HDR → codec).
    private val tagStripRegex: Regex = Regex(
        "\\b(?:${(qualityPatterns.values.flatten() +
            languagePatterns.values.flatten() +
            extendedPatterns +
            hdrPatterns +
            codecTags).joinToString("|") { Regex.escape(it) }})\\b",
        RegexOption.IGNORE_CASE
    )

    // Regex di cleanTitle precompilate: la funzione viene invocata per migliaia di
    // titoli durante sync/unificazione, ricompilare le regex a ogni chiamata era
    // un costo misurabile.
    private val cleanLeadingJunk = Regex("""^[\-\#\*\|\[\]:\s]+""")
    private val cleanTrailingJunk = Regex("""[\-\#\*\|\[\]:\s]+$""")
    private val cleanBrackets = Regex("""\[[^\]]*\]""")
    private val cleanYear = Regex("""\s*\(\d{4}\)\s*""")
    private val cleanLeadingSeparator = Regex("""^\s*[-|:•]+\s*""")
    private val cleanTrailingSeparator = Regex("""\s*[-|:•]+\s*$""")
    private val cleanTrailingDigits = Regex("""\s+\d+\s*$""")
    private val cleanHashtag = Regex("""#\w+""")
    private val cleanWhitespace = Regex("""\s+""")
    private val parenthesizedYearOnly = Regex("""\(\d{4}\)""")
    
    // Live TV indicators in category names
    private val liveTvCategories = listOf(
        "live", "diretta", "canali", "channels", "tv", "sport live",
        "rai", "mediaset", "sky", "dazn", "news", "eventi"
    )
    
    // Movie indicators in category names
    private val movieCategories = listOf(
        "film", "movie", "cinema", "vod", "pellicol"
    )
    
    // Series indicators
    private val seriesCategories = listOf(
        "serie", "programmi", "show", "series", "tv show", "episod"
    )
    
    /**
     * Parse content name and extract metadata
     */
    fun parse(name: String, category: String? = null, tvgType: String? = null, duration: Int = -1, skipTitle: Boolean = false): ParsedContent {
        val originalName = name.trim()
        var workingName = originalName
        
        // Detect content type from category first
        val contentType = detectContentType(category, originalName, tvgType, duration)
        
        // Extract year (preferendo quello tra parentesi, così un titolo numerico
        // tipo "1917" / "2012" non viene scambiato per l'anno di uscita).
        val year = extractYear(workingName)
        workingName = removeYearMarker(workingName)
        
        // Extract season/episode for series
        var season: Int? = null
        var episode: Int? = null
        if (contentType == ContentType.SERIES || contentType == ContentType.UNKNOWN) {
            val seResult = extractSeasonEpisode(workingName)
            season = seResult.first
            episode = seResult.second
            // Remove S01E01 pattern from name
            for (pattern in seasonEpisodePatterns) {
                workingName = pattern.replace(workingName, "")
            }
        }
        
        // Extract quality
        val quality = extractQuality(workingName)
        val is4K = quality == StreamQuality.UHD
        
        // Extract language
        val language = extractLanguage(workingName)
        
        // Check for HDR
        val isHdr = hdrPatterns.any { workingName.lowercase().contains(it) }
        
        // Check for extended edition
        val isExtended = extendedPatterns.any { workingName.lowercase().contains(it) }
        
        // Clean the title for TMDB search
        var cleanTitle = if (skipTitle) "" else cleanTitle(workingName)
        
        // Fix for movies named with a year (e.g. "2012", "1917")
        // If parsing stripped everything because it looked like a year/quality,
        // and we have a valid year, restore it as the title
        if (cleanTitle.isBlank() && year != null) {
            cleanTitle = year.toString()
        }
        
        // Determine if live
        val isLive = contentType == ContentType.LIVE_TV
        
        return ParsedContent(
            cleanTitle = cleanTitle,
            originalName = originalName,
            year = year,
            season = season,
            episode = episode,
            quality = quality,
            language = language,
            isExtended = isExtended,
            isHdr = isHdr,
            is4K = is4K,
            isLive = isLive,
            contentType = if (season != null || episode != null) ContentType.SERIES 
                          else contentType
        )
    }
    
    /**
     * Detect content type from category name
     */
    fun detectContentType(category: String?, name: String, tvgType: String? = null, duration: Int = -1): ContentType {
        val categoryLower = category?.lowercase() ?: ""
        @Suppress("UNUSED_VARIABLE")
        val nameLower = name.lowercase()
        
        // Check tvg-type attribute first (most reliable)
        if (tvgType != null) {
            when (tvgType.lowercase()) {
                "live" -> return ContentType.LIVE_TV
                "movie", "vod", "film" -> return ContentType.MOVIE
                "series", "tvshow", "episode" -> return ContentType.SERIES
            }
        }
        
        // Check category first (most reliable)
        if (liveTvCategories.any { categoryLower.contains(it) }) {
            return ContentType.LIVE_TV
        }
        if (movieCategories.any { categoryLower.contains(it) }) {
            return ContentType.MOVIE
        }
        if (seriesCategories.any { categoryLower.contains(it) }) {
            return ContentType.SERIES
        }
        
        // Check name patterns
        if (seasonEpisodePatterns.any { it.containsMatchIn(nameLower) }) {
            return ContentType.SERIES
        }
        
        // Check for year in parentheses (common for movies)
        if (parenthesizedYearOnly.containsMatchIn(name)) {
            return ContentType.MOVIE
        }
        
        // If duration <= 0 (live stream indicator, both -1 and 0 are common) and no VOD patterns matched, assume live TV
        if (duration <= 0) {
            return ContentType.LIVE_TV
        }
        
        return ContentType.UNKNOWN
    }
    
    private fun extractYear(name: String): Int? =
        parenthesizedYearPattern.find(name)?.value
            ?.filter { it.isDigit() }?.toIntOrNull()
            ?.takeIf { it in 1900..2030 }

    /**
     * Estrae solo l'anno di uscita dal nome grezzo della playlist.
     * Considera **solo** l'anno tra parentesi/quadre ("2012 (2009) FHD" -> 2009),
     * così un titolo numerico ("1917", "2046", "Blade Runner 2049") non viene
     * mai confuso con l'anno di uscita.
     */
    fun extractReleaseYear(name: String): Int? = extractYear(name)

    /** Rimuove dal titolo il marcatore dell'anno tra parentesi (se presente). */
    private fun removeYearMarker(name: String): String =
        parenthesizedYearPattern.replace(name, " ")
    
    private fun extractSeasonEpisode(name: String): Pair<Int?, Int?> {
        for (pattern in seasonEpisodePatterns) {
            val match = pattern.find(name)
            if (match != null && match.groupValues.size >= 3) {
                val season = match.groupValues[1].toIntOrNull()
                val episode = match.groupValues[2].toIntOrNull()
                return Pair(season, episode)
            }
        }
        return Pair(null, null)
    }
    
    private fun extractQuality(name: String): StreamQuality = detectQuality(name)
    
    private fun extractLanguage(name: String): String? {
        for ((lang, regexes) in languageRegexes) {
            if (regexes.any { it.containsMatchIn(name) }) {
                return lang
            }
        }
        return null
    }
    
    /**
     * Clean title for TMDB search
     * Removes quality tags, years, special editions, etc.
     */
    fun cleanTitle(name: String): String {
        var result = name
        
        // Remove leading special characters (-, #, *, |, etc.)
        result = result.replace(cleanLeadingJunk, "")
        
        // Remove trailing special characters
        result = result.replace(cleanTrailingJunk, "")
        
        // Remove ALL square bracket content like [2020], [SUB ITA], [HD], etc.
        result = result.replace(cleanBrackets, " ")
        
        // Remove year in parentheses: (2024), (2025), etc.
        result = result.replace(cleanYear, " ")
        
        // Remove quality/language/edition/HDR/codec indicators in a SINGLE pass
        // (era un loop per lista: ~90 regex, uno scan ciascuna).
        result = tagStripRegex.replace(result, "")
        
        // Apply generic cleanup patterns
        for (pattern in removePatterns) {
            result = pattern.replace(result, " ")
        }
        
        // Remove common separators at start and end
        result = result.replace(cleanLeadingSeparator, "")
        result = result.replace(cleanTrailingSeparator, "")
        
        // Remove trailing numbers that look like IDs (e.g., "0 Ql", "123")
        result = result.replace(cleanTrailingDigits, "")

        // Remove provider duplicate markers, e.g. "Iron Man 2 (4)" -> "Iron Man 2".
        // Senza questo il titolo resta sporco (numero tra parentesi), la ricerca TMDB
        // fallisce e i doppioni non si unificano (chiavi di gruppo diverse).
        result = ContentKey.stripDuplicateMarker(result)
        
        // Remove hashtags anywhere
        result = result.replace(cleanHashtag, "")
        
        // Clean up whitespace
        result = result.trim().replace(cleanWhitespace, " ")
        
        return result
    }
    
    /**
     * Normalize category name for consistent grouping
     * Removes ALL symbols and special characters, keeping only alphanumeric and spaces
     */
    fun normalizeCategory(category: String?): String {
        if (category.isNullOrBlank()) return "Altro"
        
        // Keep only letters (including accented), numbers, and spaces
        // Remove ALL other characters (symbols, emoji, decorations, etc.)
        var cleaned = category
            .filter { it.isLetterOrDigit() || it.isWhitespace() }
            .replace(Regex("""\s+"""), " ") // Multiple spaces to single
            .trim()
        
        return cleaned.ifEmpty { "Altro" }
    }
    
    /**
     * Normalize movie category - removes "Film" word and cleans symbols
     */
    fun normalizeMovieCategory(category: String?): String {
        var cleaned = normalizeCategory(category)
        
        // Remove the word "Film" (case insensitive, with word boundaries)
        cleaned = cleaned.replace(Regex("""\b[Ff]ilm\b"""), "").trim()
        
        // Clean up any remaining artifacts
        cleaned = cleaned
            .replace(Regex("""^\s*[-:]\s*"""), "") // Leading separator
            .replace(Regex("""\s*[-:]\s*$"""), "") // Trailing separator
            .replace(Regex("""\s+"""), " ")
            .trim()
        
        return cleaned.ifEmpty { "Altro" }
    }
    
    /**
     * Normalize series category - removes "Programmi" word and cleans symbols
     */
    fun normalizeSeriesCategory(category: String?): String {
        var cleaned = normalizeCategory(category)
        
        // Remove the word "Programmi" (case insensitive, with word boundaries)
        cleaned = cleaned.replace(Regex("""\b[Pp]rogrammi\b"""), "").trim()
        
        // Clean up any remaining artifacts
        cleaned = cleaned
            .replace(Regex("""^\s*[-:]\s*"""), "") // Leading separator
            .replace(Regex("""\s*[-:]\s*$"""), "") // Trailing separator
            .replace(Regex("""\s+"""), " ")
            .trim()
        
        return cleaned.ifEmpty { "Altro" }
    }
    
    /**
     * Clean live TV channel name
     * Removes common prefixes/suffixes and quality indicators
     * 
     * Examples:
     * - "IT: Rai 1 HD" → "Rai 1"
     * - "|IT| SKY SPORT UNO FHD" → "Sky Sport Uno"
     * - "24/7: FILM AZIONE HD" → "Film Azione"
     */
    fun cleanChannelName(name: String): String {
        var result = name.trim()
        
        // Remove common prefixes
        val prefixPatterns = listOf(
            """^\|?\s*[A-Z]{2}\s*\|?\s*:\s*""",  // IT:, |IT|:, etc.
            """^\|+\s*[A-Z]{2}\s*\|+\s*""",       // |IT|
            """^[A-Z]{2}:\s*""",                   // IT:
            """^[A-Z]{2}\s*-\s*""",                // IT -
            """^\d+/\d+:\s*""",                    // 24/7:
            """^VIP:\s*""",                        // VIP:
            """^HEVC:\s*""",                       // HEVC:
            """^H265:\s*""",                       // H265:
            """^\[.*?\]\s*"""                      // [anything]
        )
        
        for (pattern in prefixPatterns) {
            result = result.replace(Regex(pattern, RegexOption.IGNORE_CASE), "")
        }
        
        // Remove quality suffixes
        val qualitySuffixes = listOf(
            """[\s\-_]*(FHD|UHD|4K|HD|SD|720p?|1080p?|2160p?)[\s\-_]*$""",
            """[\s\-_]*(H\.?264|H\.?265|HEVC)[\s\-_]*$""",
            """[\s\-_]*\+$"""  // Trailing +
        )
        
        for (pattern in qualitySuffixes) {
            result = result.replace(Regex(pattern, RegexOption.IGNORE_CASE), "")
        }
        
        // Remove common channel prefixes if still present
        result = result.replace(Regex("""^(IT|UK|US|DE|FR|ES)\s*[-:|]\s*""", RegexOption.IGNORE_CASE), "")
        
        // Remove brackets and their content at end
        result = result.replace(Regex("""\s*\[.*?\]\s*$"""), "")
        result = result.replace(Regex("""\s*\(.*?(hd|sd|fhd).*?\)\s*$""", RegexOption.IGNORE_CASE), "")
        
        // Title case normalization for ALL CAPS names
        if (result == result.uppercase() && result.length > 4) {
            result = result.lowercase().split(" ").joinToString(" ") { word ->
                // Keep short words like RAI, SKY as-is or capitalize
                if (word.length <= 3 && knownChannelAcronyms.contains(word.uppercase())) {
                    word.uppercase()
                } else {
                    word.replaceFirstChar { it.uppercase() }
                }
            }
        }
        
        // Clean up whitespace
        result = result.trim().replace(Regex("""\s+"""), " ")
        
        return result.ifEmpty { name.trim() }
    }
    
    // Known channel acronyms to keep uppercase
    private val knownChannelAcronyms = setOf(
        "RAI", "SKY", "MTV", "BBC", "CNN", "HBO", "TNT", "TBS", "AMC", "FOX",
        "NBC", "CBS", "ABC", "ESPN", "NFL", "NBA", "NHL", "MLB", "UFC",
        "TV8", "LA7", "TV2", "TV3", "RTL", "TF1", "M6", "ARD", "ZDF"
    )
}
