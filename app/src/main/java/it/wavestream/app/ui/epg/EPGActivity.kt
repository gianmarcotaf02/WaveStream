package it.wavestream.app.ui.epg

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.items as tvListItems
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.dao.ChannelDao
import it.wavestream.app.data.database.entity.Channel
import it.wavestream.app.data.repository.EpgRepository
import it.wavestream.app.ui.player.PlayerActivity
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.AppAnimations
import it.wavestream.app.ui.theme.WaveStreamTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

/**
 * EPG Program data class
 */
data class EpgProgram(
    val channelId: String,
    val title: String,
    val description: String?,
    val start: Long,
    val end: Long,
    val category: String? = null
)

// Timeline EPG: la larghezza di un blocco è durata(min) * EPG_PIXELS_PER_MINUTE.
// La riglia oraria e la linea dell'ora corrente usano la STESSA scala, così restano
// allineate tra loro.
private const val EPG_PIXELS_PER_MINUTE = 3
private const val EPG_TIMELINE_HOURS = 6

// Inizio della colonna programmi: padding orizzontale della riga (8dp) + colonna canale (200dp).
private val EPG_TIMELINE_START = 208.dp

/**
 * EPG Activity - Electronic Program Guide
 * Now using Jetpack Compose for UI
 */
@AndroidEntryPoint
class EPGActivity : ComponentActivity() {
    
    @Inject lateinit var channelDao: ChannelDao
    @Inject lateinit var epgRepository: EpgRepository
    
    private val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
    private val dateFormat = SimpleDateFormat("EEEE, d MMMM", Locale.ITALIAN)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            WaveStreamTheme {
                EPGScreenContent()
            }
        }
    }
    
    @Composable
    private fun EPGScreenContent() {
        var channels by remember { mutableStateOf<List<Channel>>(emptyList()) }
        var channelPrograms by remember { mutableStateOf<Map<Long, List<EpgProgram>>>(emptyMap()) }
        var currentTime by remember { mutableStateOf(System.currentTimeMillis()) }
        var isLoading by remember { mutableStateOf(true) }
        
        // Load channels and EPG
        LaunchedEffect(Unit) {
            channels = channelDao.getAllChannels().first()
            
            // Load programs for each channel
            val programs = mutableMapOf<Long, List<EpgProgram>>()
            channels.forEach { channel ->
                val epgId = channel.xtreamEpgChannelId ?: channel.name
                programs[channel.id] = epgRepository.getProgramsForChannel(epgId)
            }
            channelPrograms = programs
            isLoading = false
        }
        
        // Update time every minute
        LaunchedEffect(Unit) {
            while (true) {
                delay(60_000)
                currentTime = System.currentTimeMillis()
            }
        }
        
        EPGScreen(
            channels = channels,
            channelPrograms = channelPrograms,
            currentTime = currentTime,
            isLoading = isLoading,
            onChannelClick = { channel -> playChannel(channel) },
            onProgramClick = { channel, _ -> playChannel(channel) }
        )
    }
    
    private fun playChannel(channel: Channel) {
        val intent = Intent(this, PlayerActivity::class.java).apply {
            putExtra("content_id", channel.id)
            putExtra("content_type", "CHANNEL")
            putExtra("stream_url", channel.streamUrl)
            putExtra("title", channel.name)
        }
        it.wavestream.app.ui.theme.ActivityTransitions.start(this, intent)
    }
}

/**
 * EPG Screen Composable
 */
@Composable
fun EPGScreen(
    channels: List<Channel>,
    channelPrograms: Map<Long, List<EpgProgram>>,
    currentTime: Long,
    isLoading: Boolean,
    onChannelClick: (Channel) -> Unit,
    onProgramClick: (Channel, EpgProgram) -> Unit
) {
    val timeFormat = remember { SimpleDateFormat("HH:mm", Locale.getDefault()) }
    val dateFormat = remember { SimpleDateFormat("EEEE, d MMMM", Locale.ITALIAN) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        WaveStreamColors.Accent.copy(alpha = 0.045f),
                        WaveStreamColors.GradientMiddle,
                        WaveStreamColors.GradientBottom
                    )
                )
            )
    ) {
        // Header with time
        EPGHeader(
            currentTime = currentTime,
            timeFormat = timeFormat,
            dateFormat = dateFormat
        )
        
        if (isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = WaveStreamColors.Accent)
            }
        } else {
            // Riglia oraria sopra i canali + linea dell'ora corrente che li taglia
            // tutti (stessa timeline della modalità EPG della Live).
            EPGTimeHeader(
                currentTime = currentTime,
                timeFormat = timeFormat
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
            // Channel list with programs using TvLazyColumn for proper D-pad navigation
            TvLazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                tvListItems(channels, key = { it.id }) { channel ->
                    val programs = channelPrograms[channel.id] ?: emptyList()
                    EPGChannelRow(
                        channel = channel,
                        programs = programs,
                        currentTime = currentTime,
                        timeFormat = timeFormat,
                        onChannelClick = { onChannelClick(channel) },
                        onProgramClick = { program -> onProgramClick(channel, program) }
                    )
                }
            }

            // Linea dell'ora corrente: attraversa tutte le righe canale.
            EPGCurrentTimeLine(currentTime = currentTime)
            }
        }
    }
}

/**
 * Riglia oraria (00:00, 01:00, ...) allineata all'inizio della colonna programmi,
 * cioè dopo la colonna del canale (200dp) più il padding orizzontale della riga (8dp).
 */
@Composable
private fun EPGTimeHeader(
    currentTime: Long,
    timeFormat: SimpleDateFormat
) {
    val calendar = remember(currentTime) {
        Calendar.getInstance().apply {
            timeInMillis = currentTime
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
        }
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(36.dp)
            .background(Color.White.copy(alpha = 0.04f))
            .padding(start = EPG_TIMELINE_START, end = 12.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        for (i in 0 until EPG_TIMELINE_HOURS) {
            val slotCalendar = calendar.clone() as Calendar
            slotCalendar.add(Calendar.HOUR_OF_DAY, i)

            Box(
                modifier = Modifier
                    .width((EPG_PIXELS_PER_MINUTE * 60).dp)
                    .fillMaxHeight()
                    .background(
                        if (i == 0) WaveStreamColors.Accent.copy(alpha = 0.15f)
                        else Color.Transparent
                    )
                    .border(
                        width = 1.dp,
                        color = if (i == 0) WaveStreamColors.Accent.copy(alpha = 0.5f)
                        else Color.White.copy(alpha = 0.06f)
                    ),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = timeFormat.format(slotCalendar.time),
                    color = if (i == 0) WaveStreamColors.Accent else WaveStreamColors.TextPrimary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

/**
 * Linea verticale dell'ora corrente: alone a gradiente + filo pieno, zero blur.
 */
@Composable
private fun EPGCurrentTimeLine(currentTime: Long) {
    val calendar = remember(currentTime) {
        Calendar.getInstance().apply { timeInMillis = currentTime }
    }
    val minuteOffset = calendar.get(Calendar.MINUTE) * EPG_PIXELS_PER_MINUTE

    Box(
        modifier = Modifier
            .offset(x = EPG_TIMELINE_START + minuteOffset.dp - 3.dp)
            .width(6.dp)
            .fillMaxHeight()
    ) {
        // Alone (gradiente orizzontale, zero blur)
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(6.dp)
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            Color.Transparent,
                            WaveStreamColors.Error.copy(alpha = 0.4f),
                            Color.Transparent
                        )
                    )
                )
        )
        // Filo pieno
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(2.dp)
                .align(Alignment.CenterStart)
                .offset(x = 2.dp)
                .background(WaveStreamColors.Error)
        )
    }
}

/**
 * EPG Header with current time
 */
@Composable
private fun EPGHeader(
    currentTime: Long,
    timeFormat: SimpleDateFormat,
    dateFormat: SimpleDateFormat
) {
    // Fase L6 — header flottante in vetro: capsula traslucida, non barra a tinta piena.
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        GlassSurface(
            shape = RoundedCornerShape(20.dp),
            fill = GlassTokens.SurfaceFill
        ) {
            Text(
                text = "Guida TV",
                style = MaterialTheme.typography.headlineSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 18.dp, vertical = 10.dp)
            )
        }
        
        GlassSurface(
            shape = RoundedCornerShape(20.dp),
            fill = GlassTokens.SurfaceFill
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 18.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = dateFormat.format(Date(currentTime)),
                    style = MaterialTheme.typography.bodyMedium,
                    color = WaveStreamColors.TextSecondary
                )
                
                Text(
                    text = timeFormat.format(Date(currentTime)),
                    style = MaterialTheme.typography.headlineSmall,
                    color = WaveStreamColors.Accent,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

/**
 * EPG Channel Row with programs timeline
 */
@Composable
private fun EPGChannelRow(
    channel: Channel,
    programs: List<EpgProgram>,
    currentTime: Long,
    timeFormat: SimpleDateFormat,
    onChannelClick: () -> Unit,
    onProgramClick: (EpgProgram) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    
    val backgroundColor by animateColorAsState(
        targetValue = if (isFocused) Color.White.copy(alpha = 0.16f) else GlassTokens.SurfaceFill,
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "rowBg"
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(horizontal = 8.dp, vertical = 2.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onChannelClick
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Channel info (fixed width)
        Row(
            modifier = Modifier
                .width(200.dp)
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Channel logo
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.Black.copy(alpha = 0.35f)),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = channel.logoUrl,
                    contentDescription = channel.name,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(4.dp)
                )
            }
            
            // Channel name
            Text(
                text = channel.name,
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextPrimary,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Medium
            )
        }
        
        // Programs timeline (scrollable)
        Row(
            modifier = Modifier
                .weight(1f)
                .horizontalScroll(rememberScrollState())
                .padding(end = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (programs.isEmpty()) {
                // No programs available
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(200.dp)
                        .padding(vertical = 8.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color.White.copy(alpha = 0.03f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Nessun programma",
                        style = MaterialTheme.typography.bodySmall,
                        color = WaveStreamColors.TextTertiary
                    )
                }
            } else {
                programs.forEach { program ->
                    EPGProgramBlock(
                        program = program,
                        currentTime = currentTime,
                        timeFormat = timeFormat,
                        onClick = { onProgramClick(program) }
                    )
                }
            }
        }
    }
}

/**
 * EPG Program Block
 */
@Composable
private fun EPGProgramBlock(
    program: EpgProgram,
    currentTime: Long,
    timeFormat: SimpleDateFormat,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isCurrent = program.start <= currentTime && program.end > currentTime
    
    val scale by animateFloatAsState(
        targetValue = if (isFocused) 1.02f else 1f,  // timeline densa: scala minima
        animationSpec = AppAnimations.SpringCardFocus,
        label = "programScale"
    )
    
    // Fase L6 — in onda = accent SOFT, futuro = velatura minima, focus = alone.
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isFocused -> Color.White.copy(alpha = 0.16f)
            isCurrent -> WaveStreamColors.Accent.copy(alpha = 0.22f)
            else -> Color.White.copy(alpha = 0.07f)
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "programBg"
    )
    
    val borderColor by animateColorAsState(
        targetValue = when {
            isFocused -> Color.White.copy(alpha = 0.30f)
            isCurrent -> WaveStreamColors.Accent.copy(alpha = 0.6f)
            else -> Color.White.copy(alpha = 0.06f)
        },
        animationSpec = AppAnimations.SpringCardFocusColor,
        label = "programBorder"
    )
    
    // Width based on duration (min 60dp, max 540dp). Tenere il clamp largo permette
    // a riglia oraria e linea dell'ora corrente (scala lineare) di restare allineate
    // ai blocchi per la quasi totalità dei programmi reali (20 min - 3 h).
    val durationMinutes = ((program.end - program.start) / 60_000).toInt()
    val width = (durationMinutes * EPG_PIXELS_PER_MINUTE).coerceIn(60, 540).dp
    
    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .width(width)
            .fillMaxHeight()
            .padding(vertical = 8.dp)
            .clip(RoundedCornerShape(6.dp))
            .border(1.dp, borderColor, RoundedCornerShape(6.dp))
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = program.title,
                style = MaterialTheme.typography.bodySmall,
                color = if (isCurrent || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Normal
            )
            
            Text(
                text = "${timeFormat.format(Date(program.start))} - ${timeFormat.format(Date(program.end))}",
                style = MaterialTheme.typography.labelSmall,
                color = WaveStreamColors.TextTertiary
            )
        }
        
        // Live indicator
        if (isCurrent) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color.Red)
                    .padding(horizontal = 4.dp, vertical = 2.dp)
            ) {
                Text(
                    text = "LIVE",
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 8.sp),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


