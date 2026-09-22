package it.wavestream.app.ui.home

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.focus.FocusRequester

/**
 * Memoria di focus della Home (MainActivity).
 *
 * Serve a ripristinare il focus sull'elemento da cui l'utente è entrato in
 * un'altra schermata (Detail view, "Vedi tutto" → CategoryActivity): al ritorno
 * l'ultima card/pulsante focalizzato riprende il focus, invece di saltare sulla
 * pillola di navigazione.
 *
 * Vive per composizione (una istanza per MainActivity) tramite
 * [LocalHomeFocusMemory], così non viene inquinata dalle altre Activity.
 */
class HomeFocusMemory {
    private val requesters = mutableMapOf<String, FocusRequester>()

    /** Chiave dell'ultimo elemento focalizzato nella Home. */
    var lastFocusedKey: String? = null
        private set

    fun onFocused(key: String) {
        lastFocusedKey = key
    }

    fun register(key: String, requester: FocusRequester) {
        requesters[key] = requester
    }

    fun unregister(key: String) {
        requesters.remove(key)
    }

    fun requesterFor(key: String?): FocusRequester? = key?.let { requesters[it] }
}

val LocalHomeFocusMemory = compositionLocalOf<HomeFocusMemory?> { null }
