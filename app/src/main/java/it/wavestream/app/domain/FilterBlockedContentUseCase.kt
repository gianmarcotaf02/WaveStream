package it.wavestream.app.domain

import javax.inject.Inject

/**
 * FASE 5 — Domain use case: filtra i contenuti "bloccati" dalla ricerca.
 *
 * Incapsula la logica (estratta da SearchActivity) che esclude dalla ricerca
 * i contenuti adulti/XXX e i contenuti di altri paesi (tutto tranne IT), così
 * da essere riusabile e testabile in isolamento.
 */
class FilterBlockedContentUseCase @Inject constructor() {

    /** true = il contenuto è da escludere dalla ricerca. */
    fun isBlocked(name: String, category: String?): Boolean {
        val nameLower = name.lowercase().trim()
        val catLower = category?.lowercase()?.trim() ?: ""

        // 1. Blocca contenuti XXX/adulti (nome o categoria)
        val adultKeywords = listOf("xxx", "18+", "adult", "porno", "erotic", "porn")
        if (adultKeywords.any { nameLower.contains(it) || catLower.contains(it) }) return true

        // 2. Prefissi di paese all'inizio del nome (pattern IPTV: "XX - ...", "XX: ...", "XX TOP - ...")
        val blockedCountryCodes = listOf(
            "de", "uk", "fr", "al", "es", "pt", "tr", "ro", "nl", "pl",
            "gr", "ar", "ru", "bg", "hr", "rs", "cz", "sk", "hu", "se",
            "no", "dk", "fi", "be", "ch", "at", "us", "ca", "br", "mx",
            "in", "pk", "bd", "ph", "th", "vn", "id", "my", "kr", "jp",
            "cn", "tw", "hk", "il", "eg", "ma", "dz", "tn", "sa", "ae",
            "qa", "kw", "ir", "iq", "af", "ex-yu", "ex yu"
        )
        for (code in blockedCountryCodes) {
            if (nameLower.startsWith("$code ") ||
                nameLower.startsWith("$code-") ||
                nameLower.startsWith("$code:") ||
                nameLower.startsWith("$code|") ||
                nameLower.startsWith("($code)") ||
                nameLower.startsWith("[$code]")) return true
            if (catLower.startsWith("$code ") ||
                catLower.startsWith("$code-") ||
                catLower.startsWith("$code:") ||
                catLower.startsWith("$code|") ||
                catLower.startsWith("($code)") ||
                catLower.startsWith("[$code]")) return true
        }

        // 3. Keyword di lingua/paese nel nome o nella categoria
        val blockedLangKeywords = listOf(
            "deutsch", "german", "germany", "germania",
            "french", "france", "francia",
            "spanish", "spain", "españa",
            "portuguese", "portugal",
            "turkish", "turkey", "turchia",
            "albanian", "albania",
            "arabic", "arab",
            "polish", "poland", "polonia",
            "romanian", "romania",
            "russian", "russia",
            "greek", "greece", "grecia",
            "bulgarian", "bulgaria",
            "croatian", "croatia", "croazia",
            "serbian", "serbia",
            "hungarian", "hungary",
            "dutch", "netherlands", "olanda",
            "swedish", "sweden", "svezia",
            "norwegian", "norway", "norvegia",
            "danish", "denmark", "danimarca",
            "finnish", "finland", "finlandia",
            "english", "england", "inghilterra", "british", "uk channel", "gb", "gb-"
        )
        if (blockedLangKeywords.any { nameLower.contains(it) || catLower.contains(it) }) return true

        // 4. UPPERCASE country code patterns
        val upperCodes = listOf("UK|", "UK ", "UK-", "UK:", "DE|", "DE ", "DE-", "DE:", "FR|", "FR ", "FR-", "FR:")
        val nameUpper = name.trim().uppercase()
        val catUpper = category?.uppercase()?.trim() ?: ""
        if (upperCodes.any { nameUpper.startsWith(it) || catUpper.startsWith(it) || nameUpper.contains("| $it") || catUpper.contains("| $it") }) return true

        // 5. Pattern "| XX" o "| XX |" nel nome
        val pipePattern = Regex("\\|\\s*(${blockedCountryCodes.joinToString("|")})\\s*(\\||$)")
        if (pipePattern.containsMatchIn(nameLower) || pipePattern.containsMatchIn(catLower)) return true

        return false
    }
}
