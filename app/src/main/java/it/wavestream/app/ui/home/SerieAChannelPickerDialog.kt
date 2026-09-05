package it.wavestream.app.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImage
import it.wavestream.app.R
import it.wavestream.app.data.api.SofascoreIncident
import it.wavestream.app.data.api.SofascoreLineupPlayer
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.data.repository.SerieATabellino
import it.wavestream.app.ui.theme.WaveStreamColors

data class SerieAChannelPickerState(
    val match: SerieAMatchEntity,
    val channels: List<Channel>,
    val isLoading: Boolean = false
)

/** Stato del tabellino (incidents + formazioni) mostrato nel match center. */
data class SerieATabellinoState(
    val loading: Boolean = false,
    val tabellino: SerieATabellino? = null,
    val error: Boolean = false
)

/** Categorie canali da escludere (canali DAZN di altri paesi). */
private val COUNTRY_WORDS = listOf(
    "germania", "spagna", "francia", "inghilterra", "england", "portogallo",
    "olanda", "belgio", "turchia", "grecia", "svizzera", "austria",
    "danimarca", "svezia", "norvegia", "finlandia", "polonia", "croazia",
    "serbia", "romania", "bulgaria", "ungheria", "usa", "argentina",
    "brasile", "giappone", "cina", "india", "marocco", "algeria", "tunisia",
    "egitto", "world", "mundial"
)

/** true se la categoria è un canale DAZN italiano (esclude DAZN di altri paesi). */
private fun isItalianDaznCategory(category: String): Boolean {
    val c = category.lowercase()
    return c.contains("dazn") && COUNTRY_WORDS.none { c.contains(it) }
}

private enum class SerieAMatchTab(val label: String) {
    CANALI("Canali"),
    TABELLINO("Tabellino"),
    FORMAZIONI("Formazioni")
}

/**
 * Match center a schermo pieno: header con il backdrop dell'hero (split
 * diagonale + score), poi tab Canali / Tabellino (gol, cartellini,
 * sostituzioni) / Formazioni ufficiali — dati live da Sofascore.
 */
@Composable
fun SerieAChannelPickerDialog(
    match: SerieAMatchEntity,
    channels: List<Channel>,
    isLoading: Boolean,
    tabellinoState: SerieATabellinoState,
    onDismiss: () -> Unit,
    onChannelClick: (Channel) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableIntStateOf(0) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(WaveStreamColors.BackgroundDark)
                .padding(24.dp)
        ) {
            // ===== Header: backdrop hero + close (compatto) =====
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(24.dp))
            ) {
                SerieAMatchHeroBackdrop(
                    match = match,
                    modifier = Modifier.fillMaxSize()
                )
                // Fade in basso verso lo sfondo del dialog
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .align(Alignment.BottomStart)
                        .background(
                            Brush.verticalGradient(
                                listOf(Color.Transparent, WaveStreamColors.BackgroundDark)
                            )
                        )
                )
                // Titolo partita in basso a sx: logo Serie A + testo
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 28.dp, bottom = 10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_serie_a_logo),
                        contentDescription = "Serie A",
                        modifier = Modifier
                            .height(58.dp)
                            .align(Alignment.Bottom)
                    )
                    Column {
                        if (match.isLive) {
                            SerieAMatchLiveBadge()
                            Spacer(Modifier.height(2.dp))
                        }
                        Text(
                            text = "Serie A • Giornata ${match.matchday ?: "-"}",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White.copy(alpha = 0.85f),
                            fontWeight = FontWeight.SemiBold,
                            letterSpacing = 2.sp
                        )
                        Text(
                            text = "${match.homeShortName.uppercase()} - ${match.awayShortName.uppercase()}",
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.White,
                            fontWeight = FontWeight.Black
                        )
                    }
                }
                CloseButton(onDismiss, modifier = Modifier.align(Alignment.TopEnd))
            }

            Spacer(Modifier.height(16.dp))

            // ===== Tab bar =====
            val tabs = SerieAMatchTab.entries
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                tabs.forEachIndexed { index, tab ->
                    MatchTabButton(
                        label = tab.label,
                        selected = selectedTab == index,
                        onClick = { selectedTab = index }
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            // ===== Content =====
            when (tabs[selectedTab]) {
                SerieAMatchTab.CANALI -> ChannelsTab(
                    match = match,
                    channels = channels,
                    isLoading = isLoading,
                    onChannelClick = onChannelClick
                )
                SerieAMatchTab.TABELLINO -> TabellinoTab(
                    match = match,
                    state = tabellinoState
                )
                SerieAMatchTab.FORMAZIONI -> FormazioniTab(
                    match = match,
                    state = tabellinoState
                )
            }
        }
    }
}

// ========== Tab: Canali ==========

@Composable
private fun ChannelsTab(
    match: SerieAMatchEntity,
    channels: List<Channel>,
    isLoading: Boolean,
    onChannelClick: (Channel) -> Unit
) {
    val grouped: List<Pair<String, List<Channel>>> = remember(channels) {
        channels
            .groupBy { it.category?.trim()?.takeUnless { c -> c.isEmpty() } ?: "Altri canali" }
            .map { (category, chans) -> category to chans.sortedBy { it.name.lowercase() } }
            .filter { (category, _) -> isItalianDaznCategory(category) }
            .sortedBy { it.first.lowercase() }
    }

    when {
        isLoading -> {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text("Ricerca canali in corso…", color = WaveStreamColors.TextSecondary)
            }
        }
        grouped.isEmpty() -> {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    "Nessun canale trovato per questa partita nella tua playlist",
                    color = WaveStreamColors.TextSecondary,
                    textAlign = TextAlign.Center
                )
            }
        }
        else -> {
            val firstFocusRequester = remember { FocusRequester() }
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                grouped.forEach { (category, chans) ->
                    item(key = "header_$category") {
                        Column {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Text(
                                    text = category.uppercase(),
                                    style = MaterialTheme.typography.titleSmall,
                                    color = WaveStreamColors.Accent,
                                    fontWeight = FontWeight.Bold,
                                    letterSpacing = 2.sp
                                )
                                Text(
                                    text = "(${chans.size})",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = WaveStreamColors.TextSecondary
                                )
                            }
                            Spacer(Modifier.height(4.dp))
                            Box(
                                Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(Color.White.copy(alpha = 0.08f))
                            )
                        }
                    }
                    item(key = "grid_$category") {
                        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                            chans.chunked(2).forEach { rowChans ->
                                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                                    rowChans.forEach { channel ->
                                        Box(Modifier.weight(1f)) {
                                            ChannelPickCard(channel = channel) {
                                                onChannelClick(channel)
                                            }
                                        }
                                    }
                                    repeat(2 - rowChans.size) {
                                        Spacer(Modifier.weight(1f))
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Box(
                Modifier
                    .size(1.dp)
                    .onGloballyPositioned {
                        runCatching { firstFocusRequester.requestFocus() }
                    }
            )
        }
    }
}

// ========== Tab: Tabellino ==========

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
        else -> {
            val t = state.tabellino
            val home = t.incidents.filter { it.isHome == true }
            val away = t.incidents.filter { it.isHome != true }
            if (t.incidents.isEmpty()) {
                CenterMessage("Nessun evento registrato per questa partita")
            } else {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    IncidentColumn(
                        teamName = match.homeShortName,
                        incidents = home,
                        modifier = Modifier.weight(1f)
                    )
                    IncidentColumn(
                        teamName = match.awayShortName,
                        incidents = away,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
private fun IncidentColumn(
    teamName: String,
    incidents: List<SofascoreIncident>,
    modifier: Modifier = Modifier
) {
    // Column non-lazy compatta: tutto visibile senza scroll (D-pad non scorre
    // i LazyColumn di questo dialog)
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = modifier
    ) {
        Text(
            text = teamName.uppercase(),
            style = MaterialTheme.typography.titleSmall,
            color = WaveStreamColors.Accent,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
        )
        val sorted = incidents.sortedBy { it.time ?: 999 }
        if (sorted.isEmpty()) {
            Text("—", color = WaveStreamColors.TextSecondary, fontSize = 13.sp)
        }
        sorted.forEach { incident ->
            when (incident.incidentType) {
                "goal" -> GoalRow(incident)
                "card" -> CardRow(incident)
                "substitution" -> SubstitutionRow(incident)
            }
        }
    }
}

@Composable
private fun GoalRow(incident: SofascoreIncident) {
    val suffix = when (incident.incidentClass) {
        "penalty" -> " (R)"
        "ownGoal" -> " (AG)"
        else -> ""
    }
    EventRow {
        Icon(
            painter = painterResource(id = R.drawable.ic_goal),
            contentDescription = "Gol",
            tint = Color.White,
            modifier = Modifier.size(22.dp)
        )
        EventText("${incident.player?.name.orEmpty()} ${incident.time ?: ""}'$suffix")
        incident.homeScore?.let { h ->
            incident.awayScore?.let { a ->
                Text(
                    text = "$h - $a",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Composable
private fun CardRow(incident: SofascoreIncident) {
    val cardColor = when (incident.cardType) {
        "red" -> Color(0xFFE01B2C)
        "yellowRed" -> Color(0xFFFF8C00)
        else -> Color(0xFFF2C500)
    }
    EventRow {
        Box(
            modifier = Modifier
                .size(12.dp, 17.dp)
                .background(cardColor, RoundedCornerShape(2.dp))
        )
        EventText("${incident.player?.name.orEmpty()} ${incident.time ?: ""}'")
    }
}

@Composable
private fun SubstitutionRow(incident: SofascoreIncident) {
    Column(modifier = Modifier.padding(start = 2.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowUpward,
                contentDescription = "Entra",
                tint = Color(0xFF3FC46B),
                modifier = Modifier.size(16.dp)
            )
            EventText("${incident.playerIn?.name.orEmpty()} ${incident.time ?: ""}'")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(start = 0.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowDownward,
                contentDescription = "Esce",
                tint = Color(0xFFE05A5A),
                modifier = Modifier.size(16.dp)
            )
            Text(
                text = incident.playerOut?.name.orEmpty(),
                color = WaveStreamColors.TextSecondary,
                fontSize = 13.sp
            )
        }
    }
}

@Composable
private fun EventRow(content: @Composable androidx.compose.foundation.layout.RowScope.() -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        content()
    }
}

@Composable
private fun androidx.compose.foundation.layout.RowScope.EventText(text: String) {
    Text(
        text = text,
        color = Color.White,
        fontSize = 14.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.weight(1f, fill = false)
    )
}

// ========== Tab: Formazioni ==========

@Composable
private fun FormazioniTab(
    match: SerieAMatchEntity,
    state: SerieATabellinoState
) {
    when {
        state.loading -> CenterMessage("Caricamento formazioni…")
        state.error || state.tabellino == null -> CenterMessage("Formazioni non disponibili")
        state.tabellino.lineupsConfirmed.not() -> CenterMessage(
            "Formazioni ufficiali non ancora pubblicate"
        )
        else -> {
            val t = state.tabellino
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                LineupColumn(
                    teamName = match.homeShortName,
                    formation = t.homeFormation,
                    players = t.homePlayers,
                    modifier = Modifier.weight(1f)
                )
                LineupColumn(
                    teamName = match.awayShortName,
                    formation = t.awayFormation,
                    players = t.awayPlayers,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun LineupColumn(
    teamName: String,
    formation: String?,
    players: List<SofascoreLineupPlayer>,
    modifier: Modifier = Modifier
) {
    val starters = players.filter { it.substitute != true }
    val subs = players.filter { it.substitute == true }

    // Column non-lazy compatta: titolari su 2 sotto-colonne, panchina come testo
    // riunito — tutta la formazione visibile senza scroll (D-pad non scorre
    // i LazyColumn di questo dialog)
    Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = modifier) {
        Text(
            text = teamName.uppercase(),
            style = MaterialTheme.typography.titleSmall,
            color = WaveStreamColors.Accent,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
        )
        formation?.let {
            Text(
                text = "Modulo $it",
                color = WaveStreamColors.TextSecondary,
                fontSize = 12.sp
            )
        }
        Spacer(Modifier.height(2.dp))
        SectionLabel("TITOLARI")
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            starters.chunked((starters.size + 1) / 2).forEach { chunk ->
                Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                    chunk.forEach { p ->
                        PlayerRow(shirt = p.shirtNumber, name = p.player?.name.orEmpty())
                    }
                }
            }
        }
        if (subs.isNotEmpty()) {
            Spacer(Modifier.height(4.dp))
            SectionLabel("PANCHINA")
            Text(
                text = subs.mapNotNull { p ->
                    p.player?.name?.let { name -> p.shirtNumber?.let { "$it. $name" } ?: name }
                }.joinToString(" • "),
                color = WaveStreamColors.TextSecondary,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun PlayerRow(shirt: Int?, name: String, dimmed: Boolean = false) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = shirt?.toString() ?: "·",
            color = WaveStreamColors.AccentGold,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(20.dp)
        )
        Text(
            text = name,
            color = Color.White,
            fontSize = 13.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun SectionLabel(label: String) {
    Text(
        text = label,
        style = MaterialTheme.typography.labelSmall,
        color = WaveStreamColors.TextSecondary,
        fontWeight = FontWeight.Bold,
        letterSpacing = 2.sp,
        modifier = Modifier.padding(top = 6.dp)
    )
}

// ========== Shared components ==========

@Composable
private fun MatchTabButton(
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(
                when {
                    selected -> WaveStreamColors.Accent.copy(alpha = 0.25f)
                    isFocused -> Color.White.copy(alpha = 0.12f)
                    else -> WaveStreamColors.BackgroundTertiary
                }
            )
            .border(
                width = if (isFocused) 2.dp else 0.dp,
                color = if (isFocused) Color.White else Color.Transparent,
                shape = RoundedCornerShape(10.dp)
            )
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .focusable(interactionSource = interactionSource)
            .padding(horizontal = 22.dp, vertical = 10.dp)
    ) {
        Text(
            text = label,
            color = if (selected || isFocused) Color.White else WaveStreamColors.TextSecondary,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
        )
    }
}

@Composable
private fun CenterMessage(message: String) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = message,
            color = WaveStreamColors.TextSecondary,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun CloseButton(
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(16.dp)
            .size(44.dp)
            .graphicsLayer {
                val s = if (isFocused) 1.1f else 1f
                scaleX = s
                scaleY = s
            }
            .background(
                color = if (isFocused) WaveStreamColors.Accent else Color.Black.copy(alpha = 0.55f),
                shape = CircleShape
            )
            .border(
                width = if (isFocused) 2.dp else 0.dp,
                color = if (isFocused) Color.White else Color.Transparent,
                shape = CircleShape
            )
            .clip(CircleShape)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onDismiss)
            .focusable(interactionSource = interactionSource)
    ) {
        Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = "Chiudi",
            tint = Color.White
        )
    }
}

@Composable
private fun ChannelPickCard(
    channel: Channel,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .graphicsLayer {
                val s = if (isFocused) 1.05f else 1f
                scaleX = s
                scaleY = s
            }
            .fillMaxWidth()
            .background(
                color = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.BackgroundTertiary,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = if (isFocused) 2.dp else 0.dp,
                color = if (isFocused) Color.White else Color.Transparent,
                shape = RoundedCornerShape(12.dp)
            )
            .clip(RoundedCornerShape(12.dp))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .focusable(interactionSource = interactionSource)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        AsyncImage(
            model = channel.logoUrl,
            contentDescription = null,
            modifier = Modifier.size(44.dp)
        )
        Text(
            text = channel.name,
            color = Color.White,
            fontWeight = if (isFocused) FontWeight.Bold else FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Filled.PlayArrow,
            contentDescription = null,
            tint = Color.White.copy(alpha = 0.9f)
        )
    }
}
