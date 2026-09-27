package it.wavestream.app.ui.theme

import android.content.Context
import android.provider.Settings
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

/**
 * Categorie della FASE MOTION CONTRACT (vedi `03-motion-contract.md`).
 * Ogni transizione di schermata deve risolversi tramite una di queste.
 */
enum class MotionCategory {
    EXPAND,   // poster/backdrop -> hero (dettagli)
    ZOOM,     // player/backdrop
    FADE,     // pari livello tra schermate
    AXIS_Y,   // modali / wizard
    OVERLAY,  // controlli / menu / pill
    LIST_ITEM // add/remove dinamico in liste
}

/**
 * Risolutore "motion sicuro".
 *
 * Legge la scala delle animazioni di sistema (`ANIMATOR_DURATION_SCALE` e
 * `TRANSITION_ANIMATION_SCALE`). Se l'utente ha disattivato le animazioni
 * (scala == 0, es. "Riduci animazioni" o Opzioni sviluppatore), ogni categoria
 * viene degradata a un crossfade breve; se anche quello non è desiderato, la
 * spec restituita è comunque compatibile (il sistema la renderà istantanea).
 *
 * Nota: Compose rispetta già la `MotionDurationScale` di sistema nelle
 * animazioni interne; questo resolver rende il comportamento ESPLICITO e
 * permette alle Activity di scegliere animazioni adeguate (Step 6).
 */
object MotionResolver {

    private const val KEY_ANIMATOR = Settings.Global.ANIMATOR_DURATION_SCALE
    private const val KEY_TRANSITION = Settings.Global.TRANSITION_ANIMATION_SCALE

    /** Scala corrente delle animazioni (1 = normale, 0 = disattivate). */
    fun durationScale(context: Context): Float = readScale(context, KEY_ANIMATOR)

    /** Scala corrente delle transizioni di window. */
    fun transitionScale(context: Context): Float = readScale(context, KEY_TRANSITION)

    /** True se l'utente ha ridotto/disattivato le animazioni. */
    fun isReducedMotion(context: Context): Boolean =
        durationScale(context) == 0f || transitionScale(context) == 0f

    /** Durata effettiva dopo l'applicazione della scala di sistema. */
    fun effectiveDurationMs(context: Context, baseMs: Int): Int =
        (baseMs * durationScale(context)).toInt().coerceAtLeast(0)

    private fun readScale(context: Context, key: String): Float =
        runCatching { Settings.Global.getFloat(context.contentResolver, key, 1f) }
            .getOrDefault(1f)

    // ---------- Spec Compose risolte per categoria ----------

    /** Enter/Exit risolti per una categoria, con degrado a crossfade. */
    fun enterFor(category: MotionCategory): EnterTransition =
        if (category == MotionCategory.FADE) AppAnimations.fadeThroughIn
        else when (category) {
            MotionCategory.EXPAND -> AppAnimations.expandIn
            MotionCategory.ZOOM -> AppAnimations.zoomIn
            MotionCategory.AXIS_Y -> AppAnimations.sharedAxisYEnter()
            MotionCategory.OVERLAY -> AppAnimations.overlayIn
            MotionCategory.LIST_ITEM -> AppAnimations.listItemIn
            MotionCategory.FADE -> AppAnimations.fadeThroughIn
        }

    fun exitFor(category: MotionCategory): ExitTransition =
        if (category == MotionCategory.FADE) AppAnimations.fadeThroughOut
        else when (category) {
            MotionCategory.EXPAND -> AppAnimations.expandOut
            MotionCategory.ZOOM -> AppAnimations.zoomOut
            MotionCategory.AXIS_Y -> AppAnimations.sharedAxisYExit()
            MotionCategory.OVERLAY -> AppAnimations.overlayOut
            MotionCategory.LIST_ITEM -> AppAnimations.listItemOut
            MotionCategory.FADE -> AppAnimations.fadeThroughOut
        }
}

/**
 * Ricorda se l'utente ha ridotto le animazioni, per la composizione corrente.
 * Ricalcolato solo se cambia il Context (cambio configurazione).
 */
@Composable
fun rememberReducedMotion(): Boolean {
    val context = LocalContext.current
    return remember(context) { MotionResolver.isReducedMotion(context) }
}

/**
 * Restituisce le spec Enter/Exit per [category], degradate a crossfade breve se
 * l'utente ha ridotto le animazioni. Da preferire rispetto all'uso diretto di
 * `AppAnimations` nelle schermate.
 */
@Composable
fun rememberMotionSpecs(category: MotionCategory): Pair<EnterTransition, ExitTransition> {
    val reduced = rememberReducedMotion()
    return remember(reduced, category) {
        if (reduced) {
            AppAnimations.fadeThroughIn to AppAnimations.fadeThroughOut
        } else {
            MotionResolver.enterFor(category) to MotionResolver.exitFor(category)
        }
    }
}
