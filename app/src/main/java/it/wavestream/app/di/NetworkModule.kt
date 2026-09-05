package it.wavestream.app.di

import android.content.Context
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.wavestream.app.data.api.FootballDataService
import it.wavestream.app.data.api.SofascoreService
import it.wavestream.app.data.api.TMDBApiService
import okhttp3.Cache
import okhttp3.CacheControl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Hilt module for network dependencies
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    
    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        // KSP generates adapters at compile time from @JsonClass annotations
        // No need for KotlinJsonAdapterFactory (reflection-based)
        return Moshi.Builder()
            .build()
    }
    
    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC
        }
        
        // Cache for TMDB API responses (10 MB, 5 min max-age)
        val cache = Cache(File(context.cacheDir, "http_tmdb_cache"), 10L * 1024 * 1024)
        
        // Interceptor: set Cache-Control for TMDB endpoints
        val tmdbCacheInterceptor = Interceptor { chain ->
            val response = chain.proceed(chain.request())
            val url = chain.request().url.toString()
            if (url.contains("api.themoviedb.org")) {
                val cacheControl = CacheControl.Builder()
                    .maxAge(5, TimeUnit.MINUTES) // 5 minutes
                    .build()
                response.newBuilder()
                    .header("Cache-Control", cacheControl.toString())
                    .build()
            } else {
                response
            }
        }
        
        return OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(loggingInterceptor)
            .addNetworkInterceptor(tmdbCacheInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }
    
    @Provides
    @Singleton
    fun provideTMDBApiService(okHttpClient: OkHttpClient, moshi: Moshi): TMDBApiService {
        return Retrofit.Builder()
            .baseUrl(TMDBApiService.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(TMDBApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideFootballDataService(okHttpClient: OkHttpClient, moshi: Moshi): FootballDataService {
        return Retrofit.Builder()
            .baseUrl(FootballDataService.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(FootballDataService::class.java)
    }

    /** OkHttp dedicato a Sofascore: Cloudflare richiede gli header browser. */
    @Provides
    @Singleton
    @javax.inject.Named("sofascore")
    fun provideSofascoreOkHttpClient(): OkHttpClient {
        val browserInterceptor = Interceptor { chain ->
            chain.proceed(
                chain.request().newBuilder()
                    .header(
                        "User-Agent",
                        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
                    )
                    .header("Referer", "https://www.sofascore.com/")
                    .header("Accept", "application/json")
                    .build()
            )
        }
        return OkHttpClient.Builder()
            .addInterceptor(browserInterceptor)
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideSofascoreService(moshi: Moshi, @javax.inject.Named("sofascore") client: OkHttpClient): SofascoreService {
        return Retrofit.Builder()
            .baseUrl(SofascoreService.BASE_URL)
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(SofascoreService::class.java)
    }
}
