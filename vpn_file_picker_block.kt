
@Composable
private fun VpnFilePickerDialog(
    context: Context,
    onDismiss: () -> Unit,
    onSelected: (String) -> Unit
) {
    val scope = rememberCoroutineScope()
    var files by remember { mutableStateOf<List<FoundConfig>?>(null) }
    var error by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        files = withContext(Dispatchers.IO) { VpnConfigFinder.findConfigFiles(context) }
        if (files?.isEmpty() == true) {
            error = "Nessun file .conf trovato nella memoria della TV."
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = WaveStreamColors.BackgroundElevated,
        title = {
            Text("File .conf sulla TV", color = WaveStreamColors.TextPrimary)
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                when {
                    files == null -> {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(18.dp),
                                strokeWidth = 2.dp,
                                color = WaveStreamColors.Accent
                            )
                            Text("Ricerca in corso...", color = WaveStreamColors.TextSecondary)
                        }
                    }
                    files?.isEmpty() == true -> {
                        Text(
                            text = "Nessun file .conf trovato. Verifica che l'app di trasferimento " +
                                "salvi i file nella cartella Download, oppure usa \"Importa da file (USB)\" " +
                                "o \"Importa dal telefono (QR)\".",
                            style = MaterialTheme.typography.bodyMedium,
                            color = WaveStreamColors.TextSecondary
                        )
                    }
                    else -> {
                        LazyColumn(
                            modifier = Modifier.height(300.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(files ?: emptyList()) { found ->
                                VpnFileRow(
                                    found = found,
                                    onClick = {
                                        scope.launch {
                                            error = null
                                            val text = withContext(Dispatchers.IO) {
                                                VpnConfigFinder.readConfig(context, found)
                                            }
                                            if (text.isNullOrBlank()) {
                                                error = "Impossibile leggere il file selezionato."
                                            } else {
                                                onSelected(text)
                                            }
                                        }
                                    }
                                )
                            }
                        }
                    }
                }
                error?.let {
                    Text(text = it, style = MaterialTheme.typography.bodySmall, color = WaveStreamColors.Error)
                }
            }
        },
        confirmButton = {
            TextButton(
                onClick = onDismiss,
                colors = ButtonDefaults.textButtonColors(contentColor = WaveStreamColors.TextSecondary)
            ) {
                Text("Annulla")
            }
        }
    )
}

@Composable
private fun VpnFileRow(
    found: FoundConfig,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val borderColor by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        animationSpec = tween(150),
        label = "fileRowBorder"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(if (isFocused) WaveStreamColors.BackgroundTertiary else WaveStreamColors.SurfaceDark)
            .border(2.dp, borderColor, RoundedCornerShape(10.dp))
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Description,
            contentDescription = null,
            tint = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
            modifier = Modifier.size(24.dp)
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = found.displayName,
                style = MaterialTheme.typography.bodyLarge,
                color = WaveStreamColors.TextPrimary,
                fontWeight = if (isFocused) FontWeight.SemiBold else FontWeight.Medium
            )
            Text(
                text = found.source,
                style = MaterialTheme.typography.bodySmall,
                color = WaveStreamColors.TextTertiary
            )
        }
        Icon(
            imageVector = Icons.Default.ChevronRight,
            contentDescription = null,
            tint = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary.copy(alpha = 0.5f),
            modifier = Modifier.size(18.dp)
        )
    }
}
