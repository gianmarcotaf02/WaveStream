package it.wavestream.app.vpn

import android.content.Context
import android.content.Intent
import android.net.VpnService
import android.os.SystemClock
import com.wireguard.android.backend.BackendException
import com.wireguard.android.backend.GoBackend
import com.wireguard.android.backend.Tunnel
import com.wireguard.config.Config
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket
import javax.inject.Inject
import javax.inject.Singleton

/** Strategia di scelta del server tra le config del pool. */
enum class VpnStrategy { RANDOM, ROUND_ROBIN, FASTEST }

/**
 * Gestisce la VPN in-app basata su WireGuard.
 *
 * La VPN copre SOLO il traffico di WaveStream (attributo `IncludedApplications` nel
 * [Interface] della config), ovvero una "VPN attiva solo in-app" a livello di sistema:
 * il tunnel è trasparente per ExoPlayer, OkHttp e tutto il resto dell'app.
 *
 * Compatibile con qualsiasi provider WireGuard, incluso Proton VPN:
 * le config si scaricano da account.protonvpn.com → Downloads → WireGuard configuration.
 */
@Singleton
class VpnManager @Inject constructor(
    @ApplicationContext private val context: Context
) {

    companion object {
        const val APP_PACKAGE = "it.wavestream.app"
        const val TUNNEL_NAME = "WaveStream VPN"
        private const val ALLOWED_KEY = "IncludedApplications"
        private const val EXCLUDED_KEY = "ExcludedApplications"

        /**
         * Divide testo che contiene più config wg-quick (ognuna inizia con [Interface]).
         * Utile per incollare più server in un'unica volta.
         */
        fun splitConfigs(text: String): List<String> {
            if (text.isBlank()) return emptyList()
            val parts = mutableListOf<String>()
            val current = StringBuilder()
            for (line in text.lines()) {
                if (line.trim().equals("[Interface]", ignoreCase = true) && current.isNotBlank()) {
                    parts.add(current.toString().trim())
                    current.setLength(0)
                }
                current.append(line).append('\n')
            }
            if (current.isNotBlank()) parts.add(current.toString().trim())
            return parts
        }
    }

    private val backend = GoBackend(context)

    private val _state = MutableStateFlow(Tunnel.State.DOWN)
    val state: StateFlow<Tunnel.State> = _state.asStateFlow()

    private val _currentConfig = MutableStateFlow<String?>(null)
    val currentConfig: StateFlow<String?> = _currentConfig.asStateFlow()

    private val _autoRotate = MutableStateFlow(false)
    val autoRotate: StateFlow<Boolean> = _autoRotate.asStateFlow()

    private var roundRobinIndex = 0
    private var autoRotationJob: Job? = null

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    private val tunnel = object : Tunnel {
        override fun getName(): String = TUNNEL_NAME
        override fun onStateChange(newState: Tunnel.State) {
            _state.value = newState
            if (newState == Tunnel.State.DOWN) {
                _error.value = null
                _currentConfig.value = null
            }
        }
    }

    fun isRunning(): Boolean = _state.value == Tunnel.State.UP

    /** Restituisce l'Intent di consenso da lanciare in una Activity, oppure null se già autorizzato. */
    fun getConsentIntent(): Intent? = VpnService.prepare(context)

    /** Endpoint del server della config (per mostrarlo nella UI). */
    fun endpointOf(configText: String): String? =
        parseEndpoint(configText)?.let { "${it.host}:${it.port}" }

    /**
     * Sceglie una config dal pool secondo la strategia.
     * FASTEST misura DNS + handshake TCP verso ogni endpoint (euristico di "migliore" server).
     */
    suspend fun selectConfig(configs: List<String>, strategy: VpnStrategy): String? =
        withContext(Dispatchers.IO) {
            if (configs.isEmpty()) return@withContext null
            when (strategy) {
                VpnStrategy.RANDOM -> configs.random()
                VpnStrategy.ROUND_ROBIN -> {
                    val idx = roundRobinIndex % configs.size
                    roundRobinIndex = (roundRobinIndex + 1) % configs.size
                    configs[idx]
                }
                VpnStrategy.FASTEST -> {
                    val measured = configs.map { it to measureLatency(it) }
                    measured.sortedBy { it.second ?: Long.MAX_VALUE }.first().first
                }
            }
        }

    /**
     * Euristico di latenza: tempo di risoluzione DNS + latenza di rete verso l'host
     * dell'endpoint.
     *
     * WireGuard parla UDP, quindi un TCP connect sulla porta dell'endpoint fallirebbe
     * quasi sempre (la porta UDP non accetta connessioni TCP) e la misura risulterebbe
     * falsata. Usiamo la porta 443 (HTTPS) come proxy della latenza di rete verso quel
     * nodo; se l'host non espone HTTPS ricadiamo sul solo tempo di risoluzione DNS.
     * Restituisce null solo se nemmeno il nome dell'host è risolvibile.
     */
    fun measureLatency(configText: String): Long? {
        val endpoint = parseEndpoint(configText) ?: return null
        return try {
            val start = SystemClock.elapsedRealtime()
            val address = InetAddress.getByName(endpoint.host)
            val dnsTime = SystemClock.elapsedRealtime() - start
            val tcpTime = try {
                val s = SystemClock.elapsedRealtime()
                Socket().use { it.connect(InetSocketAddress(address, 443), 1500) }
                SystemClock.elapsedRealtime() - s
            } catch (e: Exception) {
                null
            }
            if (tcpTime != null) dnsTime + tcpTime else dnsTime
        } catch (e: Exception) {
            null
        }
    }

    data class WireGuardEndpoint(val host: String, val port: Int)

    /** Estrae host e porta dalla riga `Endpoint = host:port` della config. */
    fun parseEndpoint(configText: String): WireGuardEndpoint? {
        for (line in configText.lines()) {
            val t = line.trim()
            if (t.startsWith("Endpoint", ignoreCase = true)) {
                val value = t.substringAfter('=').trim()
                val parts = value.split(":")
                if (parts.size >= 2) {
                    val host = parts[0].trim()
                    val port = parts[1].trim().toIntOrNull() ?: 51820
                    return WireGuardEndpoint(host, port)
                }
            }
        }
        return null
    }

    /**
     * Rotazione automatica: ogni [intervalMinutes] la VPN si riavvia su un altro server
     * del pool secondo la strategia. Da chiamare DOPO una [start] riuscita.
     */
    fun startAutoRotation(configs: List<String>, strategy: VpnStrategy, intervalMinutes: Long) {
        stopAutoRotation()
        _autoRotate.value = true
        autoRotationJob = CoroutineScope(SupervisorJob() + Dispatchers.IO).launch {
            while (isActive && _autoRotate.value) {
                delay(intervalMinutes * 60_000L)
                if (!isActive || !_autoRotate.value) break
                stop()
                val next = selectConfig(configs, strategy)
                if (next != null) start(next)
            }
        }
    }

    fun stopAutoRotation() {
        _autoRotate.value = false
        autoRotationJob?.cancel()
        autoRotationJob = null
    }

    /**
     * Inietta `IncludedApplications = it.wavestream.app` nella sezione [Interface]
     * così che solo il traffico di WaveStream passi dalla VPN.
     * Se la config contiene già un filtro applicazioni, la lascia invariata.
     */
    fun ensureAppOnly(configText: String): String {
        if (configText.isBlank()) return configText
        val lines = configText.lines().toMutableList()
        val alreadyFiltered = lines.any {
            it.trimStart().startsWith(ALLOWED_KEY, ignoreCase = true) ||
                it.trimStart().startsWith(EXCLUDED_KEY, ignoreCase = true)
        }
        if (alreadyFiltered) return configText
        val interfaceIdx = lines.indexOfFirst { it.trim() == "[Interface]" }
        if (interfaceIdx >= 0) {
            lines.add(interfaceIdx + 1, "$ALLOWED_KEY = $APP_PACKAGE")
        } else {
            lines.add(0, "$ALLOWED_KEY = $APP_PACKAGE")
        }
        return lines.joinToString("\n")
    }

    /** Valida la config (wg-quick format). Lancia eccezione se non valida. */
    fun validateConfig(configText: String): Config =
        Config.parse(ensureAppOnly(configText).reader().buffered())

    /** Avvia il tunnel. Da chiamare dopo aver ottenuto il consenso (se necessario). */
    suspend fun start(configText: String): Result<Unit> = withContext(Dispatchers.IO) {
        _error.value = null
        try {
            val config = Config.parse(ensureAppOnly(configText).reader().buffered())
            backend.setState(tunnel, Tunnel.State.UP, config)
            _currentConfig.value = configText
            Result.success(Unit)
        } catch (e: BackendException) {
            val msg = when (e.reason) {
                BackendException.Reason.VPN_NOT_AUTHORIZED ->
                    "Consenso VPN non concesso. Riapri le impostazioni e autorizza."
                BackendException.Reason.DNS_RESOLUTION_FAILURE ->
                    "Impossibile risolvere l'indirizzo del server WireGuard."
                BackendException.Reason.TUNNEL_MISSING_CONFIG ->
                    "Configurazione WireGuard mancante o non valida."
                BackendException.Reason.UNABLE_TO_START_VPN ->
                    "Impossibile avviare il servizio VPN sul dispositivo."
                BackendException.Reason.TUN_CREATION_ERROR ->
                    "Errore di creazione del tunnel (potrebbe non essere supportato su questa TV)."
                BackendException.Reason.GO_ACTIVATION_ERROR_CODE ->
                    "Errore di attivazione del tunnel WireGuard."
                else -> "Errore VPN: ${e.reason}"
            }
            _error.value = msg
            Result.failure(e)
        } catch (e: Exception) {
            val msg = "Config WireGuard non valida: ${e.message ?: "errore sconosciuto"}"
            _error.value = msg
            Result.failure(e)
        }
    }

    /** Ferma il tunnel. */
    suspend fun stop(): Result<Unit> = withContext(Dispatchers.IO) {
        _error.value = null
        try {
            backend.setState(tunnel, Tunnel.State.DOWN, null)
            Result.success(Unit)
        } catch (e: Exception) {
            _error.value = e.message ?: "Errore durante l'arresto della VPN"
            Result.failure(e)
        }
    }
}
