package it.wavestream.app.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.wavestream.app.data.preferences.UserPreferences
import it.wavestream.app.data.parser.ContentNameParser
import it.wavestream.app.data.parser.M3UParser
import it.wavestream.app.data.repository.DownloadContentManager
import it.wavestream.app.data.database.dao.DownloadedContentDao
import it.wavestream.app.data.database.dao.MovieDao
import it.wavestream.app.data.database.dao.EpisodeDao
import it.wavestream.app.data.database.dao.SeriesDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApplicationScope

/**
 * Hilt module for app-level dependencies
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    
    @Provides
    @Singleton
    @ApplicationScope
    fun provideApplicationScope(): CoroutineScope {
        return CoroutineScope(SupervisorJob() + Dispatchers.IO)
    }
    
    @Provides
    @Singleton
    fun provideUserPreferences(
        @ApplicationContext context: Context
    ): UserPreferences {
        return UserPreferences(context)
    }
    
    @Provides
    @Singleton
    fun provideContentNameParser(): ContentNameParser {
        return ContentNameParser()
    }
    
    @Provides
    @Singleton
    fun provideM3UParser(contentNameParser: ContentNameParser): M3UParser {
        return M3UParser(contentNameParser)
    }
    
    @androidx.media3.common.util.UnstableApi
    @Provides
    @Singleton
    fun provideDownloadContentManager(
        @ApplicationContext context: Context,
        downloadedContentDao: DownloadedContentDao,
        movieDao: MovieDao,
        episodeDao: EpisodeDao,
        seriesDao: SeriesDao
    ): DownloadContentManager {
        return DownloadContentManager(context, downloadedContentDao, movieDao, episodeDao, seriesDao)
    }
}
