package it.wavestream.app.ui.theme

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Verifica la classificazione delle transizioni di schermata (Motion Contract).
 * Logica pura: nessuna dipendenza Android.
 */
class ActivityTransitionsTest {

    @Test
    fun details_isExpand() {
        assertEquals(MotionCategory.EXPAND, ActivityTransitions.categoryForClassName("DetailsActivity"))
    }

    @Test
    fun player_isZoom() {
        assertEquals(MotionCategory.ZOOM, ActivityTransitions.categoryForClassName("PlayerActivity"))
    }

    @Test
    fun wizardScreens_areAxisY() {
        assertEquals(MotionCategory.AXIS_Y, ActivityTransitions.categoryForClassName("SetupActivity"))
        assertEquals(MotionCategory.AXIS_Y, ActivityTransitions.categoryForClassName("WelcomeActivity"))
        assertEquals(MotionCategory.AXIS_Y, ActivityTransitions.categoryForClassName("TasteSetupActivity"))
        assertEquals(MotionCategory.AXIS_Y, ActivityTransitions.categoryForClassName("TermsActivity"))
        assertEquals(MotionCategory.AXIS_Y, ActivityTransitions.categoryForClassName("LoadingActivity"))
    }

    @Test
    fun otherScreens_areFade() {
        assertEquals(MotionCategory.FADE, ActivityTransitions.categoryForClassName("SettingsActivity"))
        assertEquals(MotionCategory.FADE, ActivityTransitions.categoryForClassName("CategoryActivity"))
        assertEquals(MotionCategory.FADE, ActivityTransitions.categoryForClassName(null))
    }
}
