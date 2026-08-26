package it.wavestream.app.util

import android.content.Context
import coil3.ImageLoader
import coil3.ImageLoaderFactory
import coil3.disk.DiskCache
import coil3.memory.MemoryCache
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WaveStreamImageLoaderFactory @Inject constructor(
    @ApplicationContext private val context: Context
) : ImageLoaderFactory {

    override fun newImageLoader(): ImageLoader {
        // 30% memory — TV has more RAM than phone, and hero backdrops are large
        val memoryPercent = 0.30
        // 300MB disk cache — enough for ~1000 HD poster images
        val diskCacheSize = 300L * 1024 * 1024

        return ImageLoader.Builder(context)
            .memoryCache {
                MemoryCache.Builder(context)
                    .maxSizePercent(memoryPercent)
                    .build()
            }
            .diskCache {
                DiskCache.Builder()
                    .directory(context.cacheDir.resolve("coil_cache"))
                    .maxSizeBytes(diskCacheSize)
                    .build()
            }
            .crossfade(true)
            .build()
    }
}
