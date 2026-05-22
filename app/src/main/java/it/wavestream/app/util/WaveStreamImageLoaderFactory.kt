package it.wavestream.app.util

import android.content.Context
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.disk.DiskCache
import coil.memory.MemoryCache
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WaveStreamImageLoaderFactory @Inject constructor(
    @ApplicationContext private val context: Context
) : ImageLoaderFactory {

    override fun newImageLoader(): ImageLoader {
        val memoryPercent = 0.25
        val diskCacheSize = 150L * 1024 * 1024

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
