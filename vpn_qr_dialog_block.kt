
@Composable
private fun VpnQrImportDialog(
    vpnManager: VpnManager,
    userPreferences: UserPreferences,
    onDismiss: () -> Unit,
    onImported: (String) -> Unit
) {
    val server = remember {
        VpnImportServer { configText ->
            try {
                vpnManager.validateConfig(configText)
                true
            } catch (e: Exception) {
                false
            }
        }
    }
    val serverState by server.state.collectAsState()
    val receivedConfig by server.receivedConfig.collectAsState()

    // Il server va SEMPRE fermato quando il dialog si chiude
    DisposableEffect(Unit) {
        onDispose { server.stopServer() }
    }

    // Avvio + timeout di sicurezza (5 minuti)
    LaunchedEffect(Unit) {
        server.startServer()
        delay(5 * 60_000L)
        if (server.state.value != VpnImportServer.State.RECEIVED) {
            server.stopServer()
            onDismiss()
        }
    }

    // Salva la config appena il telefono la invia
    LaunchedEffect(serverState) {
        if (serverState == VpnImportServer.State.RECEIVED) {
            val cfg = receivedConfig
            if (cfg != null) {
                userPreferences.setVpnConfig(cfg)
                server.stopServer()
                onImported(cfg)
            }
        }
    }

    AlertDialog(
        onDismissRequest = {
            server.stopServer()
            onDismiss()
        },
        containerColor = WaveStreamColors.BackgroundElevated,
        title = {
            Text("Importa dal telefono", color = WaveStreamColors.TextPrimary)
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                when (serverState) {
                    VpnImportServer.State.LISTENING -> {
                        val url = remember(server) { server.url() }
                        val qrBitmap = remember(url) { QRCodeGenerator.generate(url, 600).asImageBitmap() }
                        Image(
                            bitmap = qrBitmap,
                            contentDescription = "QR code di importazione",
                            modifier = Modifier.size(280.dp)
                        )
                        Text(
                            text = "Inquadra il QR con la fotocamera del telefono",
                            style = MaterialTheme.typography.bodyLarge,
                            color = WaveStreamColors.TextPrimary,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = url,
                            style = MaterialTheme.typography.bodySmall,
                            color = WaveStreamColors.TextTertiary
                        )
                        Text(
                            text = "Si aprirà una pagina: incolla il contenuto del file .conf " +
                                "e premi \"Invia alla TV\". Telefono e TV devono essere sulla stessa rete.",
                            style = MaterialTheme.typography.bodySmall,
                            color = WaveStreamColors.TextSecondary
                        )
                    }
                    VpnImportServer.State.RECEIVED -> {
                        Text(
                            text = "Configurazione ricevuta e salvata!",
                            style = MaterialTheme.typography.bodyLarge,
                            color = WaveStreamColors.Success,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    VpnImportServer.State.ERROR -> {
                        Text(
                            text = "Impossibile avviare il server locale. Controlla la connessione di rete.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = WaveStreamColors.Error
                        )
                    }
                    else -> {
                        Text(
                            text = "Avvio...",
                            style = MaterialTheme.typography.bodyMedium,
                            color = WaveStreamColors.TextTertiary
                        )
                    }
                }
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    server.stopServer()
                    onDismiss()
                },
                colors = ButtonDefaults.buttonColors(containerColor = WaveStreamColors.Accent)
            ) {
                Text("Chiudi")
            }
        }
    )
}
