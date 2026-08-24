package it.wavestream.app.vpn

import android.content.Context
import android.content.Intent
import android.net.VpnService
import com.wireguard.android.backend.BackendException
import com.wireguard.android.backend.GoBackend
import com.wireguard.android.backend.Tunnel
import com.wireguard.config.Config
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

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
    }

    private val backend = GoBackend(context)

    private val _state = MutableStateFlow(Tunnel.State.DOWN)
    val state: StateFlow<Tunnel.State> = _state.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    private val tunnel = object : Tunnel {
        override fun getName(): String = TUNNEL_NAME
        override fun onStateChange(newState: Tunnel.State) {
            _state.value = newState
            if (newState == Tunnel.State.DOWN) _error.value = null
        }
    }

    fun isRunning(): Boolean = _state.value == Tunnel.State.UP

    /** Restituisce l'Intent di consenso da lanciare in una Activity, oppure null se già autorizzato. */
    fun getConsentIntent(): Intent? = VpnService.prepare(context)

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
