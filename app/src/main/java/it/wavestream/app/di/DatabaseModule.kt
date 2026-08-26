package it.wavestream.app.di

import android.content.Context
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.wavestream.app.data.database.AppDatabase
import it.wavestream.app.data.database.DatabaseCheckpointManager
import it.wavestream.app.data.database.dao.*
import javax.inject.Singleton

/**
 * Hilt module for database dependencies
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    
    /**
     * Migration from version 5 to 6:
     * - Add omdbAudienceScore column to movies table
     * - Add omdbAudienceScore column to series table
     */
    private val MIGRATION_5_6 = object : Migration(5, 6) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // Add omdbAudienceScore to movies table
            db.execSQL("ALTER TABLE movies ADD COLUMN omdbAudienceScore INTEGER DEFAULT NULL")
            // Add omdbAudienceScore to series table
            db.execSQL("ALTER TABLE series ADD COLUMN omdbAudienceScore INTEGER DEFAULT NULL")
        }
    }
    
    /**
     * Migration from version 6 to 7:
     * - Add favorite_categories table
     */
    private val MIGRATION_6_7 = object : Migration(6, 7) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("""
                CREATE TABLE IF NOT EXISTS favorite_categories (
                    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                    profileId INTEGER NOT NULL,
                    categoryType TEXT NOT NULL,
                    categoryName TEXT NOT NULL,
                    addedAt INTEGER NOT NULL,
                    FOREIGN KEY (profileId) REFERENCES profiles(id) ON DELETE CASCADE
                )
            """)
            db.execSQL("CREATE INDEX IF NOT EXISTS index_favorite_categories_profileId ON favorite_categories(profileId)")
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_favorite_categories_profileId_categoryType_categoryName ON favorite_categories(profileId, categoryType, categoryName)")
        }
    }
    
    /**
     * Migration from version 7 to 8:
     * - Schema compatibility (no structural changes)
     */
    private val MIGRATION_7_8 = object : Migration(7, 8) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // No structural changes needed
        }
    }
    
    /**
     * Migration from version 8 to 9:
     * - Add tmdbTrailerKey column to movies table
     * - Add tmdbTrailerKey column to series table
     */
    private val MIGRATION_8_9 = object : Migration(8, 9) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // Add tmdbTrailerKey to movies table
            db.execSQL("ALTER TABLE movies ADD COLUMN tmdbTrailerKey TEXT DEFAULT NULL")
            // Add tmdbTrailerKey to series table
            db.execSQL("ALTER TABLE series ADD COLUMN tmdbTrailerKey TEXT DEFAULT NULL")
        }
    }
    
    /**
     * Migration from version 10 to 11:
     * - Add trendingCategory column to movies table
     * - Add trendingCategory column to series table
     */
    private val MIGRATION_10_11 = object : Migration(10, 11) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // Add trendingCategory to movies table
            db.execSQL("ALTER TABLE movies ADD COLUMN trendingCategory TEXT DEFAULT NULL")
            // Add trendingCategory to series table
            db.execSQL("ALTER TABLE series ADD COLUMN trendingCategory TEXT DEFAULT NULL")
        }
    }
    
    /**
     * Migration from version 11 to 12:
     * - Add downloaded_content table for offline playback
     */
    private val MIGRATION_11_12 = object : Migration(11, 12) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("""
                CREATE TABLE IF NOT EXISTS downloaded_content (
                    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                    contentType TEXT NOT NULL,
                    contentId INTEGER NOT NULL,
                    title TEXT NOT NULL,
                    posterUrl TEXT,
                    downloadedAt INTEGER NOT NULL,
                    downloadSize INTEGER NOT NULL DEFAULT 0,
                    cacheKey TEXT NOT NULL,
                    streamUrl TEXT NOT NULL,
                    seriesId INTEGER,
                    seriesName TEXT,
                    seasonNumber INTEGER,
                    episodeNumber INTEGER,
                    downloadProgress INTEGER NOT NULL DEFAULT 0,
                    isComplete INTEGER NOT NULL DEFAULT 0
                )
            """)
            db.execSQL("CREATE INDEX IF NOT EXISTS index_downloaded_content_contentType_contentId ON downloaded_content(contentType, contentId)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_downloaded_content_seriesId ON downloaded_content(seriesId)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_downloaded_content_cacheKey ON downloaded_content(cacheKey)")
        }
    }
    
    /**
     * Migration from version 13 to 14:
     * - Add latestEpisodeAddedAt, latestEpisodeSeason, latestEpisodeNumber columns to series table
     *   (for tracking new episodes in Hero banner)
     */
    private val MIGRATION_13_14 = object : Migration(13, 14) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("ALTER TABLE series ADD COLUMN latestEpisodeAddedAt INTEGER DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN latestEpisodeSeason INTEGER DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN latestEpisodeNumber INTEGER DEFAULT NULL")
        }
    }
    
    /**
     * Migration from version 14 to 15:
     * - Add Xtream detail columns to movies table (xtreamPlot, xtreamBackdropUrl, xtreamCast, xtreamDirector, xtreamGenre)
     * - Add Xtream detail columns to series table (xtreamPlot, xtreamBackdropUrl, xtreamCast, xtreamDirector, xtreamGenre)
     */
    private val MIGRATION_14_15 = object : Migration(14, 15) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // Movies: add Xtream detail columns
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamPlot TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamBackdropUrl TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamCast TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamDirector TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamGenre TEXT DEFAULT NULL")
            
            // Series: add Xtream detail columns
            db.execSQL("ALTER TABLE series ADD COLUMN xtreamPlot TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN xtreamBackdropUrl TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN xtreamCast TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN xtreamDirector TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN xtreamGenre TEXT DEFAULT NULL")
        }
    }
    
    /**
     * Migration from version 15 to 16:
     * - Add xtreamRating and xtreamYoutubeTrailer columns to movies table
     * - Add xtreamRating column to series table
     */
    private val MIGRATION_15_16 = object : Migration(15, 16) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // Movies: add xtreamRating and xtreamYoutubeTrailer columns
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamRating TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE movies ADD COLUMN xtreamYoutubeTrailer TEXT DEFAULT NULL")
            // Series: add xtreamRating column
            db.execSQL("ALTER TABLE series ADD COLUMN xtreamRating TEXT DEFAULT NULL")
        }
    }

    /**
     * Migration from version 16 to 17:
     * - Add year column to series table
     */
    private val MIGRATION_16_17 = object : Migration(16, 17) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("ALTER TABLE series ADD COLUMN year INTEGER DEFAULT NULL")
        }
    }

    /**
     * Migration from version 17 to 18:
     * - Remove team_channel_map table (Serie A section removed)
     */
    private val MIGRATION_17_18 = object : Migration(17, 18) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("DROP TABLE IF EXISTS team_channel_map")
        }
    }

    /**
     * Migration from version 18 to 19:
     * - Add user_taste table for storing user's movie/series preferences
     * - Add selectedGenres column to profiles table
     */
    private val MIGRATION_18_19 = object : Migration(18, 19) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("""
                CREATE TABLE IF NOT EXISTS user_taste (
                    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                    profileId INTEGER NOT NULL,
                    contentType TEXT NOT NULL,
                    tmdbId INTEGER NOT NULL,
                    title TEXT NOT NULL,
                    posterPath TEXT,
                    year INTEGER,
                    status TEXT NOT NULL,
                    addedAt INTEGER NOT NULL,
                    FOREIGN KEY (profileId) REFERENCES profiles(id) ON DELETE CASCADE
                )
            """)
            db.execSQL("CREATE INDEX IF NOT EXISTS index_user_taste_profileId ON user_taste(profileId)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_user_taste_profileId_contentType_status ON user_taste(profileId, contentType, status)")
            db.execSQL("ALTER TABLE profiles ADD COLUMN selectedGenres TEXT DEFAULT NULL")
        }
    }

    /**
     * Migration from version 19 to 20:
     * - Add tmdbImdbId column to series table
     */
    private val MIGRATION_19_20 = object : Migration(19, 20) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("ALTER TABLE series ADD COLUMN tmdbImdbId TEXT DEFAULT NULL")
        }
    }

    /**
     * Migration from version 20 to 21:
     * - Add tmdbCastJson and tmdbCrewJson columns to movies table
     * - Add tmdbCastJson and tmdbCrewJson columns to series table
     */
    private val MIGRATION_20_21 = object : Migration(20, 21) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("ALTER TABLE movies ADD COLUMN tmdbCastJson TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE movies ADD COLUMN tmdbCrewJson TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN tmdbCastJson TEXT DEFAULT NULL")
            db.execSQL("ALTER TABLE series ADD COLUMN tmdbCrewJson TEXT DEFAULT NULL")
        }
    }

    /**
     * Migration from version 21 to 22:
     * - Add performance indices to movies, series, and watch_progress tables
     * - These indices dramatically speed up queries used by HomeViewModel
     *   (getByTrendingCategory, isHidden filtering, continue watching, etc.)
     */
    private val MIGRATION_21_22 = object : Migration(21, 22) {
        override fun migrate(db: SupportSQLiteDatabase) {
            // Movies: add performance indices
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_trendingCategory ON movies(trendingCategory)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_isHidden ON movies(isHidden)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_addedAt ON movies(addedAt)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_playlistOrder ON movies(playlistOrder)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_playlistId_category_isHidden ON movies(playlistId, category, isHidden)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_trendingCategory_isHidden ON movies(trendingCategory, isHidden)")

            // Series: add performance indices
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_trendingCategory ON series(trendingCategory)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_isHidden ON series(isHidden)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_addedAt ON series(addedAt)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_playlistOrder ON series(playlistOrder)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_playlistId_category_isHidden ON series(playlistId, category, isHidden)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_trendingCategory_isHidden ON series(trendingCategory, isHidden)")

            // Watch progress: add indices for continue watching and episode lookups
            db.execSQL("CREATE INDEX IF NOT EXISTS index_watch_progress_profileId_lastWatchedAt ON watch_progress(profileId, lastWatchedAt)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_watch_progress_seriesId ON watch_progress(seriesId)")

            // Favorites: add composite index for ordered queries
            db.execSQL("CREATE INDEX IF NOT EXISTS index_favorites_profileId_addedAt ON favorites(profileId, addedAt)")
        }
    }

    /**
     * Migration from version 22 to 23:
     * - Add composite index (category, isHidden, name) to movies table
     * - Add composite index (category, isHidden, name) to series table
     * These indices fully cover the WHERE category = ? AND isHidden = 0 ORDER BY name
     * queries used by FilmActivity and SeriesActivity, eliminating the filesort
     * that caused slow initial loading on every app start.
     */
    private val MIGRATION_22_23 = object : Migration(22, 23) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_category_isHidden_name ON movies(category, isHidden, name)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_category_isHidden_name ON series(category, isHidden, name)")
        }
    }

    /**
     * Migration from version 23 to 24:
     * - Add composite index (isHidden, name) to movies table
     * - Add composite index (isHidden, name) to series table
     * These indices cover the getAllMoviesList / getAllSeriesList queries:
     * WHERE isHidden = 0 ORDER BY name
     * Without this index SQLite filters via isHidden but then has to do a full
     * filesort on the entire result set for ORDER BY name. With thousands of
     * series entries this is the root cause of SeriesActivity being slow even
     * after the previous optimizations.
     */
    private val MIGRATION_23_24 = object : Migration(23, 24) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("CREATE INDEX IF NOT EXISTS index_movies_isHidden_name ON movies(isHidden, name)")
            db.execSQL("CREATE INDEX IF NOT EXISTS index_series_isHidden_name ON series(isHidden, name)")
        }
    }

    /**
     * Migration from version 24 to 25:
     * - Add home_session_cache table for persistent tab content caching
     * Replaces in-memory ConcurrentHashMap in ContentCache
     */
    private val MIGRATION_24_25 = object : Migration(24, 25) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("""
                CREATE TABLE IF NOT EXISTS home_session_cache (
                    key TEXT NOT NULL PRIMARY KEY,
                    valueJson TEXT NOT NULL,
                    updatedAt INTEGER NOT NULL
                )
            """)
        }
    }

    /**
     * Migration from version 25 to 26 (FASE 4 — FTS5 search):
     * - Creates FTS5 virtual index tables for channels/movies/series
     * - Adds triggers to keep them in sync with the source tables
     * The FTS tables are NOT declared as Room entities (extra tables) and are
     * queried via @RawQuery (FtsSearchDao). Existing rows are re-indexed by
     * calling FtsSearchDao.reindexAll on first use.
     */
    private val MIGRATION_25_26 = object : Migration(25, 26) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS fts_channel USING fts5(name, category, logoUrl UNINDEXED)")
            db.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS fts_movie USING fts5(name, category, logoUrl UNINDEXED)")
            db.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS fts_series USING fts5(name, category, logoUrl UNINDEXED)")

            // channels triggers
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_channel_insert AFTER INSERT ON channels BEGIN INSERT INTO fts_channel(rowid, name, category, logoUrl) VALUES (new.id, new.name, COALESCE(new.category,''), COALESCE(new.logoUrl,'')); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_channel_update AFTER UPDATE ON channels BEGIN INSERT INTO fts_channel(fts_channel, rowid) VALUES('delete', old.rowid); INSERT INTO fts_channel(rowid, name, category, logoUrl) VALUES (new.id, new.name, COALESCE(new.category,''), COALESCE(new.logoUrl,'')); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_channel_delete AFTER DELETE ON channels BEGIN INSERT INTO fts_channel(fts_channel, rowid) VALUES('delete', old.rowid); END")

            // movies triggers
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_movie_insert AFTER INSERT ON movies BEGIN INSERT INTO fts_movie(rowid, name, category, logoUrl) VALUES (new.id, new.name, COALESCE(new.category,''), COALESCE(new.logoUrl,'')); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_movie_update AFTER UPDATE ON movies BEGIN INSERT INTO fts_movie(fts_movie, rowid) VALUES('delete', old.rowid); INSERT INTO fts_movie(rowid, name, category, logoUrl) VALUES (new.id, new.name, COALESCE(new.category,''), COALESCE(new.logoUrl,'')); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_movie_delete AFTER DELETE ON movies BEGIN INSERT INTO fts_movie(fts_movie, rowid) VALUES('delete', old.rowid); END")

            // series triggers
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_series_insert AFTER INSERT ON series BEGIN INSERT INTO fts_series(rowid, name, category, logoUrl) VALUES (new.id, new.name, COALESCE(new.category,''), COALESCE(new.logoUrl,'')); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_series_update AFTER UPDATE ON series BEGIN INSERT INTO fts_series(fts_series, rowid) VALUES('delete', old.rowid); INSERT INTO fts_series(rowid, name, category, logoUrl) VALUES (new.id, new.name, COALESCE(new.category,''), COALESCE(new.logoUrl,'')); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS fts_series_delete AFTER DELETE ON series BEGIN INSERT INTO fts_series(fts_series, rowid) VALUES('delete', old.rowid); END")
        }
    }


    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        )
            .addMigrations(MIGRATION_5_6, MIGRATION_6_7, MIGRATION_7_8, MIGRATION_8_9, MIGRATION_10_11, MIGRATION_11_12, MIGRATION_13_14, MIGRATION_14_15, MIGRATION_15_16, MIGRATION_16_17, MIGRATION_17_18, MIGRATION_18_19, MIGRATION_19_20, MIGRATION_20_21, MIGRATION_21_22, MIGRATION_22_23, MIGRATION_23_24, MIGRATION_24_25, MIGRATION_25_26)
            .fallbackToDestructiveMigration()
            .build()
    }
    
    @Provides
    fun provideProfileDao(db: AppDatabase): ProfileDao = db.profileDao()
    
    @Provides
    fun providePlaylistDao(db: AppDatabase): PlaylistDao = db.playlistDao()
    
    @Provides
    fun provideChannelDao(db: AppDatabase): ChannelDao = db.channelDao()
    
    @Provides
    fun provideMovieDao(db: AppDatabase): MovieDao = db.movieDao()
    
    @Provides
    fun provideSeriesDao(db: AppDatabase): SeriesDao = db.seriesDao()
    
    @Provides
    fun provideEpisodeDao(db: AppDatabase): EpisodeDao = db.episodeDao()
    
    @Provides
    fun provideCategoryDao(db: AppDatabase): CategoryDao = db.categoryDao()
    
    @Provides
    fun provideFavoriteDao(db: AppDatabase): FavoriteDao = db.favoriteDao()
    
    @Provides
    fun provideWatchProgressDao(db: AppDatabase): WatchProgressDao = db.watchProgressDao()
    
    @Provides
    fun provideCustomGroupDao(db: AppDatabase): CustomGroupDao = db.customGroupDao()
    
    @Provides
    fun provideWatchStateDao(db: AppDatabase): WatchStateDao = db.watchStateDao()
    
    @Provides
    fun provideTMDBCacheDao(db: AppDatabase): TMDBCacheDao = db.tmdbCacheDao()
    
    @Provides
    fun provideRecentlyWatchedDao(db: AppDatabase): RecentlyWatchedDao = db.recentlyWatchedDao()
    
    @Provides
    fun provideFavoriteCategoryDao(db: AppDatabase): FavoriteCategoryDao = db.favoriteCategoryDao()
    
    @Provides
    fun provideDownloadedContentDao(db: AppDatabase): DownloadedContentDao = db.downloadedContentDao()
    
    @Provides
    fun provideUserTasteDao(db: AppDatabase): UserTasteDao = db.userTasteDao()
    
    @Provides
    fun provideHomeSessionCacheDao(db: AppDatabase): HomeSessionCacheDao = db.homeSessionCacheDao()

    @Provides
    fun provideFtsSearchDao(db: AppDatabase): FtsSearchDao = db.ftsSearchDao()
    
    @Provides
    @Singleton
    fun provideDatabaseCheckpointManager(db: AppDatabase): DatabaseCheckpointManager =
        DatabaseCheckpointManager(db)
}
