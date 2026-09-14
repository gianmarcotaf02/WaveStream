package it.wavestream.app.vpn

import android.content.Context
import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import it.wavestream.app.data.preferences.UserPreferences
import kotlinx.coroutines.suspendCancellableCoroutine
import java.security.MessageDigest
import kotlin.coroutines.resume

/**
 * Un server Proton VPN disponibile nell'app.
 *
 * @param id        chiave stabile (usata per la selezione in UI)
 * @param name      nome leggibile (es. "IT #72")
 * @param country   Paese (es. "Italia"), opzionale
 * @param flag      emoji bandiera, opzionale
 * @param config    testo WireGuard completo
 */
data class ProtonServer(
    val id: String,
    val name: String,
    val country: String?,
    val flag: String?,
    val config: String
) {
    val displayName: String
        get() = buildString {
            if (!flag.isNullOrBlank()) append(flag).append(' ')
            append(name)
            if (!country.isNullOrBlank() && !name.contains(country!!, ignoreCase = true)) {
                append(" · ").append(country)
            }
        }
}

/**
 * Configurazioni WireGuard "integrato" (Proton VPN Plus).
 *
 * Fonte primaria: **Firebase Realtime Database** (nodo `vpn_configs/servers`).
 * In questo modo lo sviluppatore può aggiungere/cambiare server senza
 * ricompilare l'APK e gli utenti ricevono gli aggiornamenti automaticamente.
 *
 * Fonte di riserva (offline): file nella cartella asset `vpn` dell'APK.
 *
 * Le config vengono importate automaticamente nel pool VPN dell'utente al
 * primo avvio e ad ogni cambio della lista server.
 */
object VpnBuiltInConfigs {

    private const val TAG = "VpnBuiltInConfigs"
    private const val ASSET_DIR = "vpn"
    private const val DB_URL =
        "https://wavestream-d3972-default-rtdb.europe-west1.firebasedatabase.app"
    private const val REMOTE_NODE = "vpn_configs"

    // ---------- Sorgente remota (Firebase) ----------

    /** Legge i server da Firebase. Restituisce lista vuota in caso di errore/rete assente. */
    suspend fun loadRemoteServers(): List<ProtonServer> = suspendCancellableCoroutine { cont ->
        try {
            FirebaseDatabase.getInstance(DB_URL)
                .reference
                .child(REMOTE_NODE)
                .child("servers")
                .get()
                .addOnSuccessListener { snapshot ->
                    val servers = mutableListOf<ProtonServer>()
                    snapshot.children.forEach { child ->
                        val config = child.child("config").getValue(String::class.java)
                        if (config.isNullOrBlank()) return@forEach
                        if (!isValid(config)) {
                            Log.w(TAG, "Config remota ignorata (non valida): ${child.key}")
                            return@forEach
                        }
                        servers.add(
                            ProtonServer(
                                id = child.key ?: "remote_${config.hashCode()}",
                                name = child.child("name").getValue(String::class.java)
                                    ?: "Proton server",
                                country = child.child("country").getValue(String::class.java),
                                flag = child.child("flag").getValue(String::class.java),
                                config = config
                            )
                        )
                    }
                    if (cont.isActive) cont.resume(servers)
                }
                .addOnFailureListener { e ->
                    Log.e(TAG, "Errore lettura config remote: ${e.message}")
                    if (cont.isActive) cont.resume(emptyList())
                }
        } catch (t: Throwable) {
            Log.e(TAG, "Errore Firebase: ${t.message}")
            if (cont.isActive) cont.resume(emptyList())
        }
    }

    // ---------- Sorgente locale (asset) ----------

    /** Legge le config dagli asset `vpn` (fallback offline). */
    fun loadLocalConfigs(context: Context): List<String> {
        return try {
            val files = context.assets.list(ASSET_DIR)
                ?.filter { it.endsWith(".conf", ignoreCase = true) }
                ?.sorted()
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
            Log.e(TAG, "Errore durante la lettura delle config locali: ${t.message}")
            emptyList()
        }
    }

    fun loadLocalServers(context: Context): List<ProtonServer> =
        loadLocalConfigs(context).mapIndexed { index, config ->
            ProtonServer(
                id = "local_$index",
                name = localName(config) ?: "Server ${index + 1}",
                country = null,
                flag = null,
                config = config
            )
        }

    /** Nome leggibile ricavato dai commenti della config (es. "# IT#72"). */
    private fun localName(config: String): String? {
        val lines = config.lines().map { it.trim() }
        lines.firstOrNull { it.startsWith("# Key for ", ignoreCase = true) }
            ?.substringAfter("# Key for ", "")
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
            ?.let { return it }
        val peerIndex = lines.indexOfFirst { it.equals("[Peer]", ignoreCase = true) }
        if (peerIndex > 0) {
            for (i in peerIndex - 1 downTo 0) {
                val line = lines[i]
                if (line.startsWith("#")) {
                    val candidate = line.removePrefix("#").trim()
                    if (candidate.isNotEmpty()) return candidate
                }
            }
        }
        return null
    }

    // ---------- Unione / import ----------

    /** Server da usare: prima Firebase, in mancanza gli asset. */
    suspend fun loadServers(context: Context): List<ProtonServer> {
        val remote = loadRemoteServers()
        if (remote.isNotEmpty()) return remote
        return loadLocalServers(context)
    }

    /**
     * Importa i server nel pool dell'utente, una sola volta per versione
     * (fingerprint). Se l'utente elimina un server resta eliminato finché la
     * lista remota/locale non cambia.
     *
     * @return la lista server attualmente disponibile.
     */
    suspend fun importIfNeeded(context: Context, prefs: UserPreferences): List<ProtonServer> {
        val servers = loadServers(context)
        if (servers.isEmpty()) return emptyList()

        val configs = servers.map { it.config }
        val fingerprint = fingerprint(configs)
        val previous = prefs.getVpnBuiltinFingerprint()
        if (previous != fingerprint) {
            configs.forEach { prefs.addVpnConfig(it) }
            prefs.setVpnBuiltinFingerprint(fingerprint)
            // Al primo import assoluto attiva l'avvio automatico: l'obiettivo è che
            // ogni dispositivo abbia la VPN pronta senza configurazione manuale.
            if (previous.isEmpty()) {
                prefs.setVpnAutoStart(true)
            }
        }
        return servers
    }

    /** Hash corto e stabile delle config, per rilevare aggiornamenti. */
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

    /**
     * Scarta i file segnaposto / incompleti, così l'app non tenta di avviare
     * un tunnel non valido.
     */
    fun isValid(config: String): Boolean {
        if (config.isBlank()) return false
        val lowered = config.lowercase()
        if (lowered.contains("replace_me") ||
            lowered.contains("<inserisci") ||
            lowered.contains("inserisci_qui") ||
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
}
