package it.wavestream.app.util

import android.content.Context
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.disk.DiskCache
import coil.memory.MemoryCache
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
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
            // OkHttp dedicato alle immagini: i server IPTV sono lenti e mandano burst
            // di centinaia di richieste logo in parallelo. Default OkHttp (10s, pool
            // piccolo) fa fallire molte copertine, specialmente a cache fredda.
            .okHttpClient {
                OkHttpClient.Builder()
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .retryOnConnectionFailure(true)
                    .connectionPool(ConnectionPool(12, 5, TimeUnit.MINUTES))
                    .build()
            }
            // Molti server IPTV mandano Cache-Control: no-cache/max-age=0: senza questo
            // flag Coil non usa il disk cache e ri-scarica ogni logo ad ogni apertura
            // (e se il server e' lento, fallisce). Con false il disco fa da cache.
            .respectCacheHeaders(false)
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
