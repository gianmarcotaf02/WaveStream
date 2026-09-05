// ========== Tab: Tabellino (timeline stile SandTV) ==========

@Composable
private fun TabellinoTab(
    match: SerieAMatchEntity,
    state: SerieATabellinoState
) {
    when {
        state.loading -> CenterMessage("Caricamento tabellino…")
        state.error || state.tabellino == null -> CenterMessage(
            "Tabellino non disponibile (Sofascore non raggiungibile o evento non trovato)"
        )
        state.tabellino.incidents.none { it.incidentType != "period" } -> CenterMessage(
            "Nessun evento registrato per questa partita"
        )
        else -> {
            // Timeline centrale: evento casa (bolla a dx) | minuto | evento ospite
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(6.dp),
                contentPadding = androidx.compose.foundation.layout.PaddingValues(vertical = 8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                val incidents = state.tabellino.incidents
                items(incidents.size) { index ->
                    val incident = incidents[index]
                    if (incident.incidentType == "period") {
                        PeriodHeader(incident)
                    } else {
                        IncidentRow(incident)
                    }
                }
            }
        }
    }
}

/** Intestazione di periodo ("1° TEMPO", "2° TEMPO"…). */
@Composable
private fun PeriodHeader(incident: SofascoreIncident) {
    val lower = incident.text?.lowercase().orEmpty()
    val text = when {
        lower.contains("half") && lower.contains("1") -> "1° TEMPO"
        lower.contains("half") && lower.contains("2") -> "2° TEMPO"
        lower == "ht" -> "INTERVALLO"
        lower == "ft" -> "FINE PARTITA"
        else -> incident.text ?: ""
    }
    if (text.isNotBlank()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = WaveStreamColors.TextSecondary,
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp
            )
        }
    }
}

/**
 * Riga evento: bolla evento casa (allineata a dx) | minuto centrale | bolla evento
 * ospite (allineata a sx). Le righe sono focusabili (D-pad) e la bolla si evidenzia
 * al focus — come nel layout di SandTV.
 */
@Composable
private fun IncidentRow(incident: SofascoreIncident) {
    var isFocused by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .onFocusChanged { isFocused = it.isFocused }
            .focusable()
            .padding(horizontal = 24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Evento casa (45%)
        Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterEnd) {
            if (incident.isHome == true) {
                EventBubble(isFocused = isFocused) {
                    EventContent(incident, Alignment.End)
                }
            }
        }

        // Minuto (centro)
        Box(modifier = Modifier.width(64.dp), contentAlignment = Alignment.Center) {
            Text(
                text = "${incident.time ?: "-"}'",
                color = if (isFocused) Color.White else WaveStreamColors.Accent,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyMedium
            )
        }

        // Evento ospite (45%)
        Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
            if (incident.isHome == false) {
                EventBubble(isFocused = isFocused) {
                    EventContent(incident, Alignment.Start)
                }
            }
        }
    }
}

@Composable
private fun EventBubble(
    isFocused: Boolean,
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(if (isFocused) Color(0xFF444444) else Color(0x66000000))
            .padding(8.dp)
    ) {
        content()
    }
}

@Composable
private fun EventContent(incident: SofascoreIncident, alignment: Alignment.Horizontal) {
    Column(horizontalAlignment = alignment) {
        when (incident.incidentType) {
            "goal" -> {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (alignment == Alignment.End) {
                        // Home: nome → icona
                        Column(horizontalAlignment = Alignment.End) {
                            Text(
                                text = incident.player?.name ?: "Gol",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            incident.assist1?.let { assist ->
                                Text(
                                    text = assist.name.orEmpty(),
                                    color = WaveStreamColors.TextSecondary,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_goal),
                            contentDescription = "Gol",
                            modifier = Modifier.size(20.dp)
                        )
                    } else {
                        // Away: icona → nome
                        Icon(
                            painter = painterResource(id = R.drawable.ic_goal),
                            contentDescription = "Gol",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column(horizontalAlignment = Alignment.Start) {
                            Text(
                                text = incident.player?.name ?: "Gol",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            incident.assist1?.let { assist ->
                                Text(
                                    text = assist.name.orEmpty(),
                                    color = WaveStreamColors.TextSecondary,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                    }
                }
                if (incident.incidentClass == "penalty") {
                    Text(
                        text = "(Rigore)",
                        color = WaveStreamColors.TextSecondary,
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
            "card" -> {
                val isRed = incident.cardType?.contains("red", ignoreCase = true) == true ||
                    incident.incidentClass?.contains("red", ignoreCase = true) == true
                val iconRes = if (isRed) R.drawable.ic_card_red else R.drawable.ic_card_yellow
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (alignment == Alignment.End) {
                        Text(
                            text = incident.player?.name ?: "Cartellino",
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            painter = painterResource(id = iconRes),
                            contentDescription = "Cartellino",
                            modifier = Modifier.size(18.dp)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = iconRes),
                            contentDescription = "Cartellino",
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = incident.player?.name ?: "Cartellino",
                            color = Color.White
                        )
                    }
                }
            }
            "substitution" -> {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (alignment == Alignment.End) {
                        Column(horizontalAlignment = Alignment.End) {
                            Text(
                                text = incident.playerIn?.name ?: "?",
                                color = Color(0xFF3FC46B),
                                style = MaterialTheme.typography.bodySmall
                            )
                            Text(
                                text = incident.playerOut?.name ?: "?",
                                color = Color(0xFFE05A5A),
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_substitution),
                            contentDescription = "Cambio",
                            modifier = Modifier.size(20.dp)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_substitution),
                            contentDescription = "Cambio",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column(horizontalAlignment = Alignment.Start) {
                            Text(
                                text = incident.playerIn?.name ?: "?",
                                color = Color(0xFF3FC46B),
                                style = MaterialTheme.typography.bodySmall
                            )
                            Text(
                                text = incident.playerOut?.name ?: "?",
                                color = Color(0xFFE05A5A),
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                }
            }
            else -> {
                Text(
                    text = incident.player?.name ?: incident.text ?: "",
                    color = Color.White
                )
            }
        }
    }
}

