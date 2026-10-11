package it.wavestream.app.ui.home

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import it.wavestream.app.R
import it.wavestream.app.data.database.entity.SerieAMatchEntity
import it.wavestream.app.ui.theme.GlassSurface
import it.wavestream.app.ui.theme.GlassTokens
import it.wavestream.app.ui.theme.WaveStreamColors
import it.wavestream.app.ui.theme.rememberReducedMotion

/**
 * Rosso "live" dedicato all'hero partita: leggermente desaturato per non
 * stonare con la palette "Aurora" fredda del resto dell'app.
 */
private val SerieALiveRed = Color(0xFFFF3B30)

/**
 * Punti di arrivo della slash bianca (frazioni della larghezza): in basso e in alto.
 */
private const val SLASH_BOTTOM_FRACTION = 0.62f
private const val SLASH_TOP_FRACTION = 0.80f

/**
 * Posizione della slash all'altezza degli stemmi (centro verticale dell'hero).
 * La slash è un segmento rettilineo, quindi al centro passa esattamente a metà
 * fra i due estremi: da qui si derivano le posizioni degli stemmi, così resto e
 * disegno non possono disallinearsi se un giorno si sposta la diagonale.
 */
private const val SLASH_MID_FRACTION = (SLASH_BOTTOM_FRACTION + SLASH_TOP_FRACTION) / 2f

/** Dimensione nominale degli stemmi. */
private val CrestSize = 150.dp

/**
 * Backdrop dell'hero "partita Serie A": split diagonale da basso-sx ad alto-dx,
 * gradienti squadre (casa alto-sx, ospite basso-dx) e slash bianco al centro.
 * Viene renderizzato nella HeroBanner della home e mascherato come i backdrop
 * dei film/serie (nero verso sinistra, feathering ai quattro bordi): i crest
 * stanno quindi sulla metà destra visibile.
 *
 * Gli stemmi sono ancorati **alla slash**, non al bordo destro: la distanza fra
 * la slash e lo stemma di casa è identica a quella fra la slash e lo stemma
 * ospite. Con l'ancoraggio al bordo (com'era prima) su schermi 1080p (960dp di
 * larghezza) la slash cadeva addosso allo stemma di casa e la coppia risultava
 * asimmetrica.
 *
 * FASE REDESIGN — il backdrop resta volutamente "brand": i colori delle due
 * squadre sono dati (non token di tema). L'allineamento al nuovo tema avviene
 * sulle sovrastrutture (badge LIVE, chip competizione/punteggio), che usano
 * [GlassSurface] e i token Aurora.
 */
@Composable
fun SerieAMatchHeroBackdrop(
    match: SerieAMatchEntity,
    modifier: Modifier = Modifier,
    /** Distanza fra la slash e CIASCUNO dei due stemmi (speculare). */
    crestSlashGap: Dp = 56.dp,
    /** Margine minimo a destra: la coppia non invade il bordo dello schermo. */
    crestEndPadding: Dp = 72.dp
) {
    BoxWithConstraints(modifier) {
        val slashMidX = maxWidth * SLASH_MID_FRACTION
        // Il gap richiesto è un massimo: se la coppia non entrasse (schermi
        // stretti, o gap richiesto molto largo) si stringe il gap invece di
        // tagliare gli stemmi. La specularità resta intatta.
        val slashGap = minOf(
            crestSlashGap,
            maxWidth - crestEndPadding - slashMidX - CrestSize
        ).coerceAtLeast(0.dp)

        // Split diagonale + slash. La diagonale è più inclinata (verticale) rispetto
        // alla piena larghezza: passa fra i due crest sulla metà destra dell'hero.
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height
            val slashBottomX = w * SLASH_BOTTOM_FRACTION   // punto di arrivo in basso
            val slashTopX = w * SLASH_TOP_FRACTION         // punto di arrivo in alto

            // Quadrilatero casa (a sinistra della slash) e ospite (a destra)
            val homePath = Path().apply {
                moveTo(0f, 0f); lineTo(slashTopX, 0f); lineTo(slashBottomX, h); lineTo(0f, h); close()
            }
            val awayPath = Path().apply {
                moveTo(slashTopX, 0f); lineTo(w, 0f); lineTo(w, h); lineTo(slashBottomX, h); close()
            }

            val (homeTop, homeBottom) = SerieATeamColors.forTla(match.homeTla)
            val (awayTop, awayBottom) = SerieATeamColors.forTla(match.awayTla)

            drawPath(homePath, Brush.verticalGradient(listOf(homeTop, homeBottom)))
            drawPath(awayPath, Brush.verticalGradient(listOf(awayTop, awayBottom)))

            // Gradiente Serie A da sinistra verso il centro: bilancia la composizione
            // (blu Serie A → colore squadra di casa), così nessuna zona resta scura
            drawRect(
                brush = Brush.horizontalGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF04184A),
                        0.28f to Color(0xFF0B54B4).copy(alpha = 0.85f),
                        0.45f to Color.Transparent
                    ),
                    startX = 0f,
                    endX = w * 0.45f
                ),
                topLeft = Offset.Zero,
                size = androidx.compose.ui.geometry.Size(w * 0.45f, h)
            )

            // Slash bianco, sfumato con tratti sovrapposti
            val a = Offset(slashBottomX, h)
            val b = Offset(slashTopX, 0f)
            drawLine(Color.White.copy(alpha = 0.10f), a, b, strokeWidth = h * 0.085f, cap = StrokeCap.Butt)
            drawLine(Color.White.copy(alpha = 0.22f), a, b, strokeWidth = h * 0.045f, cap = StrokeCap.Butt)
            drawLine(Color.White.copy(alpha = 0.95f), a, b, strokeWidth = h * 0.016f, cap = StrokeCap.Butt)
        }

        // Crest delle due squadre sulla zona visibile (destra), speculari alla slash.
        AsyncImage(
            model = match.homeCrest,
            contentDescription = match.homeName,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(x = slashMidX - slashGap - CrestSize)
                .size(CrestSize)
        )
        AsyncImage(
            model = match.awayCrest,
            contentDescription = match.awayName,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(x = slashMidX + slashGap)
                .size(CrestSize)
        )
    }
}

/**
 * Pill LIVE in vetro: fill rosso translucido pulsante + bordo a gradiente, così
 * "si accende" sul backdrop senza il vecchio rettangolo rosso pieno opaco.
 * Il pulse viene disattivato con il motion ridotto di sistema.
 */
@Composable
fun SerieAMatchLiveBadge() {
    val reducedMotion = rememberReducedMotion()
    val transition = rememberInfiniteTransition(label = "serieAlivePulse")
    val pulse by transition.animateFloat(
        initialValue = 1f,
        targetValue = if (reducedMotion) 1f else 0.55f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse
        ),
        label = "serieAlivePulseAlpha"
    )
    GlassSurface(
        shape = RoundedCornerShape(50),
        fill = SerieALiveRed.copy(alpha = 0.30f + 0.35f * pulse),
        stroke = Brush.linearGradient(
            listOf(
                SerieALiveRed.copy(alpha = 0.90f),
                Color.White.copy(alpha = 0.16f)
            )
        ),
        strokeWidth = 1.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(Color.White, CircleShape)
            )
            Text(
                text = "LIVE",
                color = Color.White,
                fontWeight = FontWeight.Black,
                fontSize = 14.sp,
                letterSpacing = 2.sp
            )
        }
    }
}

/**
 * Chip "SERIE A • GIORNATA N" in vetro, con il logo della competizione.
 * Usato sia nel foreground dell'hero sia nell'header del match center: identità
 * coerente fra le due superfici.
 */
@Composable
fun SerieACompetitionChip(
    match: SerieAMatchEntity,
    modifier: Modifier = Modifier
) {
    GlassSurface(
        shape = GlassTokens.RadiusSmall,
        fill = GlassTokens.SurfaceFill,
        stroke = GlassTokens.StrokeGradient,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_serie_a_logo),
                contentDescription = null,
                modifier = Modifier.height(18.dp)
            )
            Text(
                text = "SERIE A • GIORNATA ${match.matchday ?: "-"}",
                style = MaterialTheme.typography.labelMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.5.sp
            )
        }
    }
}

/**
 * Chip del punteggio in vetro. Quando la partita è live il vetro si accende
 * con il fill/bordo accent, così il risultato "stona" il meno possibile con lo
 * stato LIVE del badge.
 */
@Composable
fun SerieAScoreChip(
    homeScore: Int,
    awayScore: Int,
    isLive: Boolean = false,
    modifier: Modifier = Modifier
) {
    val accent = WaveStreamColors.Accent
    GlassSurface(
        shape = GlassTokens.RadiusSmall,
        fill = if (isLive) GlassTokens.accentFill(accent) else GlassTokens.SurfaceFill,
        stroke = if (isLive) GlassTokens.accentStroke(accent) else GlassTokens.StrokeGradient,
        strokeWidth = if (isLive) 1.5.dp else 1.dp,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 3.dp)
        ) {
            Text(
                text = homeScore.toString(),
                style = MaterialTheme.typography.headlineMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Black
            )
            Text(
                text = "-",
                style = MaterialTheme.typography.titleMedium,
                color = WaveStreamColors.TextSecondary,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = awayScore.toString(),
                style = MaterialTheme.typography.headlineMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Black
            )
        }
    }
}

/**
 * Chip del countdown pre-partita ("INIZIA TRA X MIN") in vetro color oro,
 * coerente con la palette serale/serale dell'app.
 */
@Composable
fun SerieAKickoffChip(
    label: String,
    modifier: Modifier = Modifier
) {
    GlassSurface(
        shape = GlassTokens.RadiusSmall,
        fill = GlassTokens.accentFill(WaveStreamColors.AccentGold),
        stroke = GlassTokens.accentStroke(WaveStreamColors.AccentGold),
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = WaveStreamColors.AccentGoldLight,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
        )
    }
}

/** "INIZIA TRA X MIN" se il kickoff è imminente, altrimenti null (data e ora
 *  di inizio sono già mostrate nella riga meta dell'hero).
 *  Il default usa il tempo corretto server ([ServerClock]). */
fun serieAKickoffLabel(
    match: SerieAMatchEntity,
    nowMillis: Long = it.wavestream.app.util.ServerClock.now()
): String? {
    val now = nowMillis
    val diffMin = (match.utcDateMillis - now) / 60_000L
    return when {
        diffMin in 0..59 -> "INIZIA TRA $diffMin MIN"
        else -> null
    }
}
