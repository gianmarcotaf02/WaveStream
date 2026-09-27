package it.wavestream.app.ui.theme

import android.app.Activity
import android.content.Context
import android.content.Intent
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
 * - La categoria [MotionCategory.EXPAND] **non** applica animazioni di window:
 *   l'apertura dei dettagli è gestita internamente da `DetailsScreen` (regola R2
 *   del Motion Contract) per evitare la doppia animazione.
 *
 * Le animazioni sono deliberate a livello di window (transform+alpha), quindi
 * economiche per la GPU delle TV.
 */
object ActivityTransitions {

    /** Inferisce la categoria dalla classe di destinazione. */
    fun categoryFor(intent: Intent): MotionCategory {
        val simple = intent.component?.className?.substringAfterLast('.') ?: return MotionCategory.FADE
        return when (simple) {
            "DetailsActivity" -> MotionCategory.EXPAND
            "PlayerActivity" -> MotionCategory.ZOOM
            "SetupActivity", "WelcomeActivity", "TasteSetupActivity", "TermsActivity", "LoadingActivity" ->
                MotionCategory.AXIS_Y
            else -> MotionCategory.FADE
        }
    }

    /** Animazioni di window per categoria. `null` = nessuna animazione custom. */
    fun windowAnimationFor(category: MotionCategory): WindowAnimation? = when (category) {
        // R2: l'apertura dettagli è animata in DetailsScreen (EXPAND), non a livello window.
        MotionCategory.EXPAND -> null
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
     * (o esplicita). Con motion ridotto o categoria EXPAND, avvia senza animazione.
     */
    fun start(context: Context, intent: Intent, category: MotionCategory = categoryFor(intent)) {
        val opts = options(context, category)
        if (opts != null) context.startActivity(intent, opts) else context.startActivity(intent)
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
