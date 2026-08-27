package it.wavestream.app.util

import android.content.Context
import coil3.Coil
import coil3.ImageLoader
import coil3.request.ImageRequest
import coil3.size.Size
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

import coil3.size.Precision

/**
 * Image preloader using Coil (same cache as UI rendering)
 *
 * Enqueues non-blocking preload requests so images are already
 * in Coil's memory/disk cache when the UI needs them.
 */
@Singleton
class CoilImagePreloader @Inject constructor(
    @ApplicationContext private val context: Context
) {
    // IMPORTANT: use the SAME app-wide ImageLoader (WaveStreamImageLoaderFactory,
    // registered via Coil.setImageLoader in WaveStreamApplication). A separate
    // ImageLoader(context) instance would populate a different cache than the UI
    // reads from, making preloading useless.
    private val imageLoader: ImageLoader by lazy {
        Coil.imageLoader(context)
    }

    /**
     * Preload a list of image URLs into Coil's cache.
     * enqueue() returns immediately — OkHttp (max 5 concurrent requests per host)
     * already throttles the network, so no manual batching is needed here.
     */
    fun preloadImages(urls: List<String?>, targetSize: Size = Size.ORIGINAL) {
        val filtered = urls.filterNotNull().filter { it.isNotBlank() }
        filtered.forEach { url ->
            val request = ImageRequest.Builder(context)
                .data(url)
                .size(targetSize)
                .precision(Precision.INEXACT)
                .memoryCachePolicy(coil.request.CachePolicy.ENABLED)
                .diskCachePolicy(coil.request.CachePolicy.ENABLED)
                .build()
            imageLoader.enqueue(request)
        }
    }

    /**
     * Preload poster images from a carousel (first N items)
     */
    fun preloadCarouselPosters(posterUrls: List<String?>, count: Int = 20) {
        preloadImages(
            urls = posterUrls.take(count),
            targetSize = Size(390, 585)  // 3x of 130x195 card size for sharp rendering
        )
    }

    /**
     * Preload a single backdrop image (for detail view anticipation)
     */
    fun preloadBackdrop(backdropUrl: String?) {
        if (backdropUrl != null) {
            preloadImages(
                urls = listOf(backdropUrl),
                targetSize = Size(1280, 720)
            )
        }
    }

    /**
     * Preload poster + backdrop for a specific item (before detail view navigation)
     */
    fun preloadDetailImages(posterUrl: String?, backdropUrl: String?) {
        preloadBackdrop(backdropUrl)
        if (posterUrl != null) {
            preloadImages(
                urls = listOf(posterUrl),
                targetSize = Size(450, 675) // Detail poster size (150x225 @ 3x)
            )
        }
    }
}
