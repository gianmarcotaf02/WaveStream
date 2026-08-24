package it.wavestream.app.vpn

import fi.iki.elonen.NanoHTTPD
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.net.Inet4Address
import java.net.NetworkInterface
import java.security.SecureRandom

/**
 * Mini server HTTP locale per trasferire la configurazione WireGuard dal telefono alla TV.
 *
 * La TV mostra un QR con l'URL (es. http://192.168.1.10:36412/a1b2c3d4e5f6); il telefono,
 * sulla stessa rete, apre la pagina, incolla il contenuto del file .conf e lo invia con POST.
 * La configurazione (che contiene la PrivateKey) non esce mai dalla rete di casa.
 *
 * Sicurezza: l'URL contiene un token casuale non indovinabile, il server accetta il POST
 * solo su quel path e viene fermato automaticamente dopo la ricezione o dal chiamante.
 */
class VpnImportServer(
    private val validate: (String) -> Boolean
) : NanoHTTPD(findLanIp() ?: "0.0.0.0", 0) {

    enum class State { IDLE, LISTENING, RECEIVED, ERROR }

    private val token: String = run {
        val bytes = ByteArray(8)
        SecureRandom().nextBytes(bytes)
        bytes.joinToString("") { "%02x".format(it) }
    }

    private val lanIp: String = findLanIp() ?: "0.0.0.0"

    private val _state = MutableStateFlow(State.IDLE)
    val state: StateFlow<State> = _state.asStateFlow()

    private val _receivedConfig = MutableStateFlow<String?>(null)
    val receivedConfig: StateFlow<String?> = _receivedConfig.asStateFlow()

    /** URL da codificare nel QR. Valido solo dopo [startServer]. */
    fun url(): String = "http://$lanIp:${getListeningPort()}/$token"

    fun startServer(): Boolean {
        return try {
            start(NanoHTTPD.SOCKET_READ_TIMEOUT, false)
            _state.value = State.LISTENING
            true
        } catch (e: Exception) {
            _state.value = State.ERROR
            false
        }
    }

    fun stopServer() {
        try {
            stop()
        } catch (_: Exception) {
        }
        _state.value = State.IDLE
    }

    override fun serve(session: IHTTPSession): Response {
        val isTarget = session.uri == "/$token"
        return when {
            session.method == Method.GET && isTarget -> newFixedLengthResponse(
                Response.Status.OK, "text/html; charset=utf-8", pageHtml()
            )
            session.method == Method.POST && isTarget -> handlePost(session)
            else -> newFixedLengthResponse(Response.Status.NOT_FOUND, "text/plain", "404")
        }
    }

    private fun handlePost(session: IHTTPSession): Response {
        val config = try {
            val files = HashMap<String, String>()
            session.parseBody(files)
            session.parms["config"] ?: files[POST_DATA]
        } catch (e: Exception) {
            null
        }
        if (config.isNullOrBlank()) {
            return newFixedLengthResponse(
                Response.Status.BAD_REQUEST,
                "text/html; charset=utf-8",
                resultPage(
                    "Configurazione vuota",
                    "Il campo è vuoto. Torna indietro e incolla il contenuto del file .conf."
                )
            )
        }
        return if (validate(config)) {
            _receivedConfig.value = config
            _state.value = State.RECEIVED
            newFixedLengthResponse(
                Response.Status.OK,
                "text/html; charset=utf-8",
                resultPage("Configurazione ricevuta!", "Puoi chiudere questa pagina e tornare alla TV.")
            )
        } else {
            newFixedLengthResponse(
                Response.Status.OK,
                "text/html; charset=utf-8",
                resultPage(
                    "Configurazione non valida",
                    "Il testo non è una config WireGuard valida. Torna indietro, controlla e riprova."
                )
            )
        }
    }

    private fun pageHtml(): String = """
        <!DOCTYPE html>
        <html lang="it">
        <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>WaveStream — Import VPN</title>
        <style>
        body { background:#0e0e12; color:#eee; font-family:system-ui,Roboto,sans-serif; max-width:640px; margin:0 auto; padding:20px; }
        h1 { font-size:20px; color:#fff; }
        p { color:#aaa; font-size:14px; line-height:1.5; }
        textarea { width:100%; box-sizing:border-box; height:280px; background:#1a1a20; color:#eee;
                   border:1px solid #333; border-radius:8px; padding:12px; font-family:monospace; font-size:13px; }
        button { width:100%; padding:14px; margin-top:12px; background:#5b8cff; color:#fff;
                 border:none; border-radius:8px; font-size:16px; font-weight:bold; }
        </style>
        </head>
        <body>
        <h1>WaveStream — Configurazione WireGuard</h1>
        <p>Incolla qui il contenuto del file <b>.conf</b> scaricato da Proton VPN (o da un altro provider)
        e premi <b>Invia alla TV</b>.</p>
        <form method="POST" action="/$token">
        <textarea name="config" placeholder="[Interface]&#10;PrivateKey = ...&#10;Address = ...&#10;DNS = ...&#10;&#10;[Peer]&#10;PublicKey = ...&#10;AllowedIPs = 0.0.0.0/0&#10;Endpoint = ..." required></textarea>
        <button type="submit">Invia alla TV</button>
        </form>
        </body>
        </html>
    """.trimIndent()

    private fun resultPage(title: String, message: String): String = """
        <!DOCTYPE html>
        <html lang="it">
        <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>WaveStream — $title</title>
        <style>
        body { background:#0e0e12; color:#eee; font-family:system-ui,Roboto,sans-serif; max-width:640px; margin:0 auto; padding:20px; text-align:center; }
        h1 { font-size:22px; color:#fff; }
        p { color:#aaa; font-size:15px; line-height:1.5; }
        </style>
        </head>
        <body>
        <h1>$title</h1>
        <p>$message</p>
        </body>
        </html>
    """.trimIndent()

    companion object {
        /** Trova l'indirizzo IPv4 di rete locale (Wi-Fi o Ethernet). */
        fun findLanIp(): String? {
            try {
                NetworkInterface.getNetworkInterfaces()?.toList()?.forEach { nif ->
                    if (!nif.isUp || nif.isLoopback) return@forEach
                    nif.inetAddresses.toList().forEach { addr ->
                        if (addr is Inet4Address && !addr.isLoopbackAddress && !addr.isLinkLocalAddress) {
                            return addr.hostAddress
                        }
                    }
                }
            } catch (_: Exception) {
            }
            return null
        }
    }
}
