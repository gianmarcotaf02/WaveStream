package it.wavestream.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import it.wavestream.app.R

/**
 * AURORA — nuovo parco font.
 * Display (titoli, hero, sezioni): Sora — geometrico, netto, moderno.
 * Corpo (testi, label, dati): Manrope — compatto e leggibile a 3 metri.
 * Le weight mappe con gli stessi ruoli tipografici usati prima da Inter.
 */
val SoraFontFamily = FontFamily(
    Font(R.font.sora_500, FontWeight.Medium),
    Font(R.font.sora_600, FontWeight.SemiBold),
    Font(R.font.sora_700, FontWeight.Bold),
    Font(R.font.sora_800, FontWeight.ExtraBold)
)

val ManropeFontFamily = FontFamily(
    Font(R.font.manrope_400, FontWeight.Normal),
    Font(R.font.manrope_500, FontWeight.Medium),
    Font(R.font.manrope_600, FontWeight.SemiBold),
    Font(R.font.manrope_700, FontWeight.Bold)
)

/** Alias di compatibilità (il corpo ora usa Manrope). */
val InterFontFamily = ManropeFontFamily

enum class AccentColor(
    val id: String,
    val primary: Color,
    val light: Color,
    val dark: Color
) {
    Violet("violet", Color(0xFF8B5CF6), Color(0xFFA78BFA), Color(0xFF7C3AED)),
    Red("red", Color(0xFFE50914), Color(0xFFFF4F4F), Color(0xFFB20710)),
    Blue("blue", Color(0xFF0A84FF), Color(0xFF5AA9FF), Color(0xFF0062CC)),
    Green("green", Color(0xFF30D158), Color(0xFF66E085), Color(0xFF249642)),
    Fuchsia("fuchsia", Color(0xFFFF2D92), Color(0xFFFF6BB3), Color(0xFFCC005F));

    companion object {
        fun fromId(id: String): AccentColor = entries.find { it.id == id } ?: Violet
    }
}

/**
 * FASE 1 — "Aurora" Design Tokens 2.0.
 *
 * Scala di superfici "Obsidian": 5 livelli di elevazione che sostituiscono il
 * nero assoluto della v1. I nomi delle proprietà storiche (BackgroundDark,
 * CardBackground, SurfaceElevated, ...) sono INVARIATI — vengono solo
 * rimappati ai nuovi valori — così tutti i file che leggono i token
 * continuano a compilare senza modifiche.
 *
 * Mappa dei livelli:
 *   Surface 0 → sfondo schermo          (ex BackgroundDark)
 *   Surface 1 → card / righe            (ex BackgroundPrimary / CardBackground)
 *   Surface 2 → card hover / elevated   (ex BackgroundSecondary / SurfaceElevated)
 *   Surface 3 → card focused / rail     (ex BackgroundTertiary)
 *   Surface 4 → dialog / dropdown       (ex BackgroundElevated)
 */
object WaveStreamColors {
    val BrandPrimary = Color(0xFF000000)

    private val _accent = mutableStateOf(AccentColor.Violet.primary)
    val Accent: Color get() = _accent.value

    private val _accentLight = mutableStateOf(AccentColor.Violet.light)
    val AccentLight: Color get() = _accentLight.value

    private val _accentDark = mutableStateOf(AccentColor.Violet.dark)
    val AccentDark: Color get() = _accentDark.value

    val BrandSecondary: Color get() = Accent

    val AccentGold = Color(0xFFE8C49A)
    val AccentGoldLight = Color(0xFFF3DCC0)

    // ── Scala Obsidian (Surface 0 → 4) ──
    val BackgroundDark = Color(0xFF050608)
    val BackgroundPrimary = Color(0xFF0A0C10)
    val BackgroundSecondary = Color(0xFF101319)
    val BackgroundTertiary = Color(0xFF171B23)
    val BackgroundElevated = Color(0xFF1F2530)

    // Alias espliciti dei livelli, per il codice nuovo (Fase 2+)
    val Surface0 = BackgroundDark
    val Surface1 = BackgroundPrimary
    val Surface2 = BackgroundSecondary
    val Surface3 = BackgroundTertiary
    val Surface4 = BackgroundElevated

    // ── Gradiente ambientale "Aurora": tinta teal profonda, quasi impercettibile ──
    val GradientTop = Color(0xFF07141A)
    val GradientMiddle = Color(0xFF050608)
    val GradientBottom = Color(0xFF030305)

    val BackgroundGradient: Brush
        get() = Brush.verticalGradient(
            colorStops = arrayOf(
                0.0f to GradientTop,
                0.3f to GradientMiddle,
                0.6f to GradientBottom,
                1.0f to GradientBottom
            )
        )

    val CardBackground = Color(0xFF0A0C10)
    val CardBackgroundHover = Color(0xFF101319)
    val CardBackgroundFocused = Color(0xFF171B23)
    val SurfaceDark = Color(0xFF07080B)
    val SurfaceElevated = Color(0xFF12151C)

    // ── Bordo universale per superfici (1dp, bianco 8%) — dà stacco senza elevazione ──
    val SurfaceBorder = Color(0x14FFFFFF)
    val SurfaceBorderStrong = Color(0x22FFFFFF)

    val TextPrimary = Color(0xFFF2F4F8)
    val TextSecondary = Color(0xFF9AA3B2)
    val TextTertiary = Color(0xFF8B94A3)
    val TextHint = Color(0xFF4A525E)
    val TextDisabled = Color(0xFF2A2F38)
    val TextAccent: Color get() = AccentLight

    val Error = Color(0xFFFF453A)
    val Success = Color(0xFF30D158)
    val Warning = Color(0xFFFF9F0A)
    val Info = Color(0xFF0A84FF)

    val FocusRing: Color get() = Accent
    val FocusGlow: Color get() = Accent.copy(alpha = 0.25f)
    val FocusGlowStrong: Color get() = Accent.copy(alpha = 0.38f)
    val SelectionBackground: Color get() = Accent.copy(alpha = 0.15f)

    /** Alpha delle superfici NON focalizzate quando un elemento ha il focus (dimming ambiente). */
    const val DimmingAlpha = 0.6f

    val RatingIMDb = Color(0xFFF5C518)
    val RatingTMDb = Color(0xFF01D277)
    val RatingMetacritic = Color(0xFF66CC33)

    val PlayerBackground = Color(0xFF000000)
    val PlayerControlsBg = Color(0x66050608)
    val PlayerSeekbarPlayed: Color get() = Accent

    val RailBackground = Color(0x99050608)
    val RailBackgroundExpanded = Color(0xE60A0C10)
    val RailItemFocused = BackgroundTertiary
    val RailItemSelected = Accent.copy(alpha = 0.15f)
    val RailDivider = Color(0x14FFFFFF)

    // ============== Glass / Liquid Glass (FASE 1) ==============
    // Token vetro esposti anche dal tema per coerenza. La fonte primaria dei
    // componenti è `GlassTokens` (ui/theme/Glass.kt); qui servono per i composable
    // che leggono i colori direttamente dal tema.
    val GlassSurfaceFill = Color(0x1FFFFFFF)
    val GlassSurfaceFillStrong = Color(0x2EFFFFFF)
    val GlassSurfaceFillDark = Color(0x40101418)
    val GlassBorderSubtle = Color(0x26FFFFFF)
    val GlassBorderAccent get() = Accent.copy(alpha = 0.55f)

    fun updateAccent(accentColor: AccentColor) {
        _accent.value = accentColor.primary
        _accentLight.value = accentColor.light
        _accentDark.value = accentColor.dark
    }
}

val WaveStreamTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 44.sp,
        lineHeight = 50.sp,
        letterSpacing = (-0.5).sp
    ),
    displayMedium = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 33.sp,
        lineHeight = 40.sp,
        letterSpacing = (-0.25).sp
    ),
    displaySmall = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        lineHeight = 33.sp,
        letterSpacing = (-0.25).sp
    ),
    headlineLarge = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = (-0.2).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 19.sp,
        lineHeight = 25.sp,
        letterSpacing = (-0.1).sp
    ),
    headlineSmall = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp,
        lineHeight = 23.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 25.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 21.sp,
        letterSpacing = 0.1.sp
    ),
    titleSmall = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.1.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = ManropeFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 21.sp,
        letterSpacing = 0.2.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = ManropeFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.1.sp
    ),
    bodySmall = TextStyle(
        fontFamily = ManropeFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.2.sp
    ),
    labelLarge = TextStyle(
        fontFamily = ManropeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.2.sp
    ),
    labelMedium = TextStyle(
        fontFamily = ManropeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.3.sp
    ),
    labelSmall = TextStyle(
        fontFamily = ManropeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.3.sp
    )
)

@Composable
fun WaveStreamTheme(
    content: @Composable () -> Unit
) {
    // Cache the color scheme so it isn't recreated on every recompose.
    // darkColorScheme() allocates a new ColorScheme each time — remember prevents that.
    val colorScheme = remember(WaveStreamColors.Accent) {
        darkColorScheme(
            primary = WaveStreamColors.Accent,
            onPrimary = WaveStreamColors.TextPrimary,
            primaryContainer = WaveStreamColors.AccentDark,
            onPrimaryContainer = WaveStreamColors.TextPrimary,

            secondary = WaveStreamColors.AccentGold,
            onSecondary = WaveStreamColors.TextPrimary,
            secondaryContainer = WaveStreamColors.AccentGoldLight,
            onSecondaryContainer = WaveStreamColors.BackgroundDark,

            tertiary = WaveStreamColors.AccentLight,
            onTertiary = WaveStreamColors.TextPrimary,

            background = WaveStreamColors.BackgroundDark,
            onBackground = WaveStreamColors.TextPrimary,

            surface = WaveStreamColors.BackgroundPrimary,
            onSurface = WaveStreamColors.TextPrimary,
            surfaceVariant = WaveStreamColors.BackgroundSecondary,
            onSurfaceVariant = WaveStreamColors.TextSecondary,
            // Contenitori di superficie M3 mappati sulla scala Obsidian
            surfaceContainerLowest = WaveStreamColors.SurfaceDark,
            surfaceContainerLow = WaveStreamColors.BackgroundPrimary,
            surfaceContainer = WaveStreamColors.BackgroundSecondary,
            surfaceContainerHigh = WaveStreamColors.BackgroundTertiary,
            surfaceContainerHighest = WaveStreamColors.BackgroundElevated,

            error = WaveStreamColors.Error,
            onError = WaveStreamColors.TextPrimary,

            outline = WaveStreamColors.TextTertiary,
            outlineVariant = WaveStreamColors.SurfaceBorder
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = WaveStreamTypography,
        content = content
    )
}
