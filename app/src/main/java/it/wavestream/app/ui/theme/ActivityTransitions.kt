package it.wavestream.app.ui.theme

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import it.wavestream.app.R

/** Coppia di animazioni di window (enter = Activity in arrivo, exit = Activity in uscita). */
data class WindowAnimation(val enterRes: Int, val exitRes: Int)

/**
 * Utility centralizzata per le transizioni tra Activity (Step 6 del piano motion).
 *
 * - Inferisce la [MotionCategory] dalla destinazione dell'[Intent] (nome classe),
 *   così i chiamanti non devono specificarla.
 * - Applica la scala animazioni tramite [MotionResolver]: se l'utente ha ridotto
 *   le animazioni, nessuna animazione di window.
 *
 * Le animazioni sono deliberate a livello di window (transform+alpha), quindi
 * economiche per la GPU delle TV.
 */
object ActivityTransitions {

    /** Inferisce la categoria dalla classe di destinazione. */
    fun categoryFor(intent: Intent): MotionCategory =
        categoryForClassName(intent.component?.className?.substringAfterLast('.'))

    /**
     * Classificazione pura (testabile su JVM) dal nome semplice della classe di
     * destinazione. `null`/vuoto → [MotionCategory.FADE].
     */
    fun categoryForClassName(simpleName: String?): MotionCategory = when (simpleName) {
        "DetailsActivity" -> MotionCategory.EXPAND
        "PlayerActivity" -> MotionCategory.ZOOM
        "SetupActivity", "WelcomeActivity", "TasteSetupActivity", "TermsActivity", "LoadingActivity" ->
            MotionCategory.AXIS_Y
        else -> MotionCategory.FADE
    }

    /** Animazioni di window per categoria. `null` = nessuna animazione custom. */
    fun windowAnimationFor(category: MotionCategory): WindowAnimation? = when (category) {
        MotionCategory.EXPAND -> WindowAnimation(R.anim.fade_in, R.anim.fade_out)
        MotionCategory.ZOOM -> WindowAnimation(R.anim.zoom_in_enter, R.anim.zoom_in_exit)
        MotionCategory.FADE -> WindowAnimation(R.anim.fade_in, R.anim.fade_out)
        MotionCategory.AXIS_Y -> WindowAnimation(R.anim.slide_in_bottom, R.anim.slide_out_up)
        MotionCategory.OVERLAY, MotionCategory.LIST_ITEM ->
            WindowAnimation(R.anim.fade_in, R.anim.fade_out)
    }

    /** Bundle di opzioni animazione, o `null` se non applicabile / motion ridotto. */
    fun options(context: Context, category: MotionCategory = MotionCategory.FADE): Bundle? {
        if (MotionResolver.isReducedMotion(context)) return null
        val anim = windowAnimationFor(category) ?: return null
        return ActivityOptionsCompat
            .makeCustomAnimation(context, anim.enterRes, anim.exitRes)
            .toBundle()
    }

    /**
     * Avvia un'Activity con l'animazione della categoria inferita da [intent]
     * (o esplicita). Con motion ridotto, avvia senza animazione.
     */
    fun start(context: Context, intent: Intent, category: MotionCategory = categoryFor(intent)) {
        val opts = options(context, category)
        if (opts != null) {
            context.startActivity(intent, opts)
            return
        }
        context.startActivity(intent)
        // Nessuna animazione di window richiesta (motion ridotto).
        // Va disattivata ESPLICITAMENTE: il tema DeviceDefault applica la sua
        // transizione di default (fade/scale) che si sommerebbe a quella interna
        // della schermata di destinazione, rendendo l'apertura "a scatti".
        // Va chiamato subito dopo lo start, dall'Activity che avvia.
        findActivity(context)?.let { activity ->
            @Suppress("DEPRECATION")
            activity.overridePendingTransition(0, 0)
            // API 34: la vecchia overridePendingTransition è deprecata; quella nuova
            // copre anche le transizioni aperte/chiuse a livello di Activity.
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                activity.overrideActivityTransition(Activity.OVERRIDE_TRANSITION_OPEN, 0, 0)
                activity.overrideActivityTransition(Activity.OVERRIDE_TRANSITION_CLOSE, 0, 0)
            }
        }
    }

    /** Risale la catena dei ContextWrapper per trovare l'Activity che ha avviato. */
    private fun findActivity(context: Context): Activity? {
        var current: Context? = context
        while (current is ContextWrapper) {
            if (current is Activity) return current
            current = current.baseContext
        }
        return null
    }

    /**
     * Applica l'animazione di uscita quando un'Activity chiama `finish()`.
     * Va invocata subito dopo `finish()`.
     */
    fun overridePending(activity: Activity, category: MotionCategory) {
        val anim = if (MotionResolver.isReducedMotion(activity)) null else windowAnimationFor(category)
        if (anim == null) activity.overridePendingTransition(0, 0)
        else activity.overridePendingTransition(anim.enterRes, anim.exitRes)
    }
}
