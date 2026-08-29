package it.wavestream.app.ui.theme

import androidx.compose.ui.unit.dp

/**
 * FASE 1 — "Aurora" dimension tokens.
 *
 * Scala di spaziatura base 8dp (half-step 4dp) e raggi corner coerenti con
 * [GlassTokens]. Da usare nel codice nuovo; quello esistente continua a
 * funzionare con i valori letterali finché non viene migrato (Fase 2+).
 */
object WaveStreamDimens {

    // ── Spaziatura ──
    val SpaceXs = 4.dp
    val SpaceS = 8.dp
    val SpaceM = 16.dp
    val SpaceL = 24.dp
    val SpaceXl = 32.dp

    /** Gutter orizzontale tra le righe di carosello. */
    val RowGutter = 32.dp

    /** Padding interno standard delle card. */
    val CardPadding = 12.dp

    // ── Corner radius (allineati a GlassTokens.Radius*) ──
    val RadiusSmall = 10.dp
    val RadiusMedium = 18.dp
    val RadiusLarge = 28.dp

    // ── Card TV ──
    /** Larghezza card poster verticale (2:3). */
    val PosterCardWidth = 130.dp

    /** Larghezza card landscape 16:9 (canali live, continue watching). */
    val LandscapeCardWidth = 220.dp

    /** Spessore bordo superfici e ring focus. */
    val BorderThin = 1.dp
    val FocusRingWidth = 2.dp
}
