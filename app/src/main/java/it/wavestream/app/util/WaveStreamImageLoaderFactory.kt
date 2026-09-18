package it.wavestream.app.util

import android.app.ActivityManager
import android.content.Context
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.disk.DiskCache
import coil.memory.MemoryCache
import coil.request.ImageRequest
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
        // The bitmap cache is sized as a percentage of the *app heap*, not of the
        // device RAM, and this app declares android:largeHeap="true". On a 1 GB TV
        // box that makes the heap far larger than the memory actually available,
        // so 30% became ~150 MB of decoded bitmaps while only ~100 MB were free:
        // the low-memory killer killed the process while the Home was loading its
        // first images. The cache is now scaled to what the device can really
        // hold - images still stay cached on disk (300 MB below).
        val activityManager =
            context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val isLowRamDevice = activityManager.isLowRamDevice ||
            activityManager.memoryClass < LOW_RAM_MEMORY_CLASS_MB
        val memoryPercent = if (isLowRamDevice) 0.08 else 0.25
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

    private companion object {
        /**
         * Heap size below which the device is treated as low-RAM (TV sticks,
         * 1 GB set-top boxes). Their heap is small even with largeHeap=true, and
         * a large bitmap cache there is exactly what triggers the OOM killer.
         */
        const val LOW_RAM_MEMORY_CLASS_MB = 256
    }
}

/**
 * Richiesta Coil dedicata ai loghi dei canali live.
 *
 * - `allowHardware(false)`: su alcuni TV stick / driver grafici le hardware
 *   bitmap di Coil non vengono renderizzate e il logo resta invisibile,
 *   nonostante il download sia riuscito. Forzando bitmap software il logo
 *   compare su tutti i dispositivi.
 * - `size(512)`: molti provider servono loghi enormi; il downscale evita
 *   decodifiche pesanti e OOM sulle TV stick con heap ridotto (che si
 *   manifestavano come copertine mancanti).
 */
fun channelLogoRequest(context: Context, url: String?): ImageRequest =
    ImageRequest.Builder(context)
        .data(url)
        .allowHardware(false)
        .size(512)
        .crossfade(true)
        .build()
