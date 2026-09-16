package it.wavestream.app.assistant

/**
 * Interruttore globale della sezione Nova (assistente AI: voce, microfono, Gemini).
 *
 * MOMENTANEAMENTE IN PAUSA: la funzione è disattivata e nascosta.
 *
 * Con [ENABLED] = false:
 *  - la voce "Nova" non compare nella sidebar;
 *  - la voce "Nova · Assistente AI" non compare in Impostazioni;
 *  - il codice (AssistantActivity, TtsManager, SherpaTtsManager, AiTools, ecc.)
 *    resta invariato e pronto.
 *
 * Per riattivarla basta rimettere `true`: nessun'altra modifica necessaria.
 */
object NovaFeature {
    const val ENABLED = false
}
