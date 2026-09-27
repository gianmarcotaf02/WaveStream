package it.wavestream.app.ui.theme

import androidx.compose.ui.geometry.Rect

/**
 * Holder dell'ultimo poster cliccato, usato per l'animazione EXPAND poster→hero
 * (Motion Contract · categoria EXPAND). Il click di una card registra il proprio
 * rect (coordinate di window) e l'URL immagine; `ActivityTransitions.start` li
 * allega come extra all'Intent verso `DetailsActivity`, che li consumerà una volta.
 */
object ExpandOrigin {
    @Volatile var rect: Rect? = null
    @Volatile var imageUrl: String? = null
    @Volatile var timestampMs: Long = 0L

    fun set(rect: Rect?, imageUrl: String?) {
        this.rect = rect
        this.imageUrl = imageUrl
        this.timestampMs = System.currentTimeMillis()
    }

    /** True se c'è un'origine recente (evita di animare su click "vecchi"). */
    fun isFresh(maxAgeMs: Long = 3000L): Boolean =
        rect != null && (System.currentTimeMillis() - timestampMs) <= maxAgeMs

    fun clear() {
        rect = null
        imageUrl = null
        timestampMs = 0L
    }
}

/** Chiavi degli extra Intent per l'EXPAND. */
object ExpandHeroExtras {
    const val KEY_ORIGIN = "expand_origin" // IntArray [left, top, right, bottom]
    const val KEY_IMAGE = "expand_image"   // String?
}
