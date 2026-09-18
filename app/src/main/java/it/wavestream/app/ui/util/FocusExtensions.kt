package it.wavestream.app.ui.util

import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.focus.FocusRequester

/**
 * Requests focus, retrying across the following frames.
 *
 * [FocusRequester.requestFocus] throws an [IllegalStateException] when the node
 * it points at has not been composed/attached yet. That happens whenever the
 * call is made from a `LaunchedEffect` which runs before the composition that
 * installs `Modifier.focusRequester()` has completed: on fast hardware the
 * composition wins the race, on slow TV boxes (and under memory pressure) the
 * coroutine runs first and the uncaught exception kills the process.
 *
 * Retrying on subsequent frames keeps the behaviour deterministic: focus is
 * granted as soon as the node exists, and the race disappears on every device.
 */
suspend fun FocusRequester.requestFocusWhenReady(attempts: Int = 10) {
    repeat(attempts.coerceAtLeast(1)) {
        if (runCatching { requestFocus() }.isSuccess) return
        withFrameNanos { /* wait one frame, then retry */ }
    }
}

/**
 * Non-suspending variant for use inside callbacks (`onDone = { ... }`) where the
 * focus node is normally already attached. Returns whether focus was granted
 * instead of throwing, so a slow frame can never take the process down.
 */
fun FocusRequester.requestFocusSafely(): Boolean =
    runCatching { requestFocus() }.isSuccess
