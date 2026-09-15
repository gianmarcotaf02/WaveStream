package it.wavestream.app.vpn

/**
 * Interruttore globale della VPN in-app (WireGuard).
 *
 * MOMENTANEAMENTE DISATTIVATA: si usa una VPN esterna (es. app Proton VPN) sempre attiva.
 *
 * Con [ENABLED] = false:
 *  - la voce "VPN in-app" non compare in Impostazioni;
 *  - l'avvio automatico della VPN al boot viene saltato;
 *  - il codice (VpnManager, config, backend) resta invariato e pronto.
 *
 * Per riattivarla basta rimettere `true`: nessun'altra modifica necessaria.
 */
object VpnFeature {
    const val ENABLED = false
}
