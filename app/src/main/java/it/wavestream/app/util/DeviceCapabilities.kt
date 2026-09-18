package it.wavestream.app.util

import android.app.ActivityManager
import android.content.Context

/**
 * Heap size (MB) below which the device is treated as low-RAM: TV sticks and
 * 1 GB set-top boxes.
 *
 * Note this is the *normal* memory class. The app declares
 * `android:largeHeap="true"`, so the real heap is larger - which is exactly why
 * percentage-based limits (Coil's memory cache) and expensive whole-screen
 * animations must not be sized against it: on a 1 GB device they behave as if
 * there were far more memory than the system actually has available.
 */
private const val LOW_RAM_MEMORY_CLASS_MB = 256

fun isLowRamDevice(context: Context): Boolean {
    val activityManager =
        context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    return activityManager.isLowRamDevice ||
        activityManager.memoryClass < LOW_RAM_MEMORY_CLASS_MB
}
