package it.wavestream.app.vpn

import android.content.Context
import android.util.Log
import it.wavestream.app.data.preferences.UserPreferences
import java.security.MessageDigest

/**
 * Configurazioni WireGuard "integrato" (Proton VPN Plus).
 *
 * I file `.conf` vivono negli asset dell'APK (`assets/vpn/`): sono quindi
 * identici per TUTTI gli utenti che installano l'app e non richiedono alcun
 * import manuale da parte dell'utente finale. Questo è il meccanismo con cui
 * l'account Proton condiviso viene distribuito ai dispositivi.
 *
 * All'occorrenza un singolo file può contenere più config: vengono separate
 * con [VpnManager.splitConfigs].
 */
object VpnBuiltInConfigs {

    private const val TAG = "VpnBuiltInConfigs"
    private const val ASSET_DIR = "vpn"

    /** Legge tutte le config valide dagli asset `assets/vpn/*.conf`. */
    fun load(context: Context): List<String> {
        return try {
            val files = context.assets.list(ASSET_DIR)?.filter { it.endsWith(".conf", ignoreCase = true) }?.sorted()
                ?: return emptyList()
            files.flatMap { name ->
                val text = context.assets.open("$ASSET_DIR/$name")
                    .bufferedReader()
                    .use { it.readText() }
                VpnManager.splitConfigs(text)
            }
                .filter { isValid(it) }
                .distinct()
        } catch (t: Throwable) {
            Log.e(TAG, "Errore durante la lettura delle config integrate: ${t.message}")
            emptyList()
        }
    }

    /**
     * Scarta i file segnaposto / incompleti, così l'app non tenta di avviare
     * un tunnel non valido e la sezione non compare finché non viene inserita
     * una config reale.
     */
    fun isValid(config: String): Boolean {
        if (config.isBlank()) return false
        val lowered = config.lowercase()
        if (lowered.contains("replace_me") ||
            lowered.contains("<inserisci") ||
            lowered.contains("<private_key>") ||
            lowered.contains("incolla qui")
        ) return false

        val hasPrivateKey = config.lines().any { line ->
            val t = line.trim()
            t.startsWith("PrivateKey", ignoreCase = true) &&
                t.substringAfter('=').trim().length >= 20
        }
        val hasEndpoint = config.lines().any {
            it.trim().startsWith("Endpoint", ignoreCase = true)
        }
        return hasPrivateKey && hasEndpoint
    }

    /**
     * Importa le config integrate nel pool dell'utente, una sola volta per
     * versione (fingerprint degli asset). Se l'utente le elimina restano
     * eliminate finché non viene pubblicata una nuova config nell'APK.
     *
     * @return le config integrate valide trovate negli asset.
     */
    suspend fun importIfNeeded(context: Context, prefs: UserPreferences): List<String> {
        val builtIn = load(context)
        if (builtIn.isEmpty()) return emptyList()

        val fingerprint = fingerprint(builtIn)
        val previous = prefs.getVpnBuiltinFingerprint()
        if (previous != fingerprint) {
            builtIn.forEach { prefs.addVpnConfig(it) }
            prefs.setVpnBuiltinFingerprint(fingerprint)
            // Al primo import assoluto attiva l'avvio automatico: l'obiettivo è che
            // ogni dispositivo abbia la VPN pronta senza configurazione manuale.
            // L'utente può comunque disattivarla dalle impostazioni.
            if (previous.isEmpty()) {
                prefs.setVpnAutoStart(true)
            }
        }
        return builtIn
    }

    /** Hash corto e stabile delle config integrate, per rilevare aggiornamenti. */
    fun fingerprint(configs: List<String>): String {
        if (configs.isEmpty()) return "0"
        return try {
            val digest = MessageDigest.getInstance("SHA-256")
                .digest(configs.sorted().joinToString("\n").toByteArray())
            digest.take(8).joinToString("") { "%02x".format(it) }
        } catch (t: Throwable) {
            configs.size.toString()
        }
    }
}
