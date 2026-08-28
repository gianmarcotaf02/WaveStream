# Add project specific ProGuard rules here.
-keepattributes Signature,InnerClasses,EnclosingMethod,Annotation

# Keep Moshi classes
-keep class com.squareup.moshi.** { *; }
-keep @com.squareup.moshi.JsonQualifier interface *
-keepclassmembers @com.squareup.moshi.JsonClass class * { <fields>; <init>(...); }

# Keep Room entities
-keep class it.wavestream.app.data.database.entity.** { *; }

# Keep Retrofit interfaces
-keep,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class * extends com.bumptech.glide.module.AppGlideModule { <init>(...); }

# Media3 ExoPlayer
-keep class androidx.media3.** { *; }

# Coroutines
-keepclassmembers class kotlinx.coroutines.** { volatile <fields>; }

# =================== NEW RULES ===================

# Jetpack Compose
-dontwarn androidx.compose.**
-keep class androidx.compose.** { *; }
-keep class kotlin.Metadata { *; }

# =================== MATERIAL ICONS EXTENDED ===================
# Material Icons Extended uses Kotlin lazy delegates compiled into *Kt static methods.
# R8 aggressively optimizes these, breaking icon initialization at runtime.
-keep class androidx.compose.material.icons.** { *; }
-keepclassmembers class androidx.compose.material.icons.** { *; }
# Keep all Kotlin file-level facades (*Kt classes) for icons
-keep class androidx.compose.material.icons.filled.**Kt { *; }
-keep class androidx.compose.material.icons.outlined.**Kt { *; }
-keep class androidx.compose.material.icons.rounded.**Kt { *; }
-keep class androidx.compose.material.icons.sharp.**Kt { *; }
-keep class androidx.compose.material.icons.twotone.**Kt { *; }
-keep class androidx.compose.material.icons.automirrored.**Kt { *; }
-keep class androidx.compose.material.icons.automirrored.filled.**Kt { *; }
-keep class androidx.compose.material.icons.automirrored.outlined.**Kt { *; }

# Hilt
-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }
-keep @dagger.hilt.android.lifecycle.HiltViewModel class * { *; }
-keep @dagger.hilt.InstallIn class * { *; }

# Coil (Image Loading)
-keep class coil.** { *; }

# Keep data classes for serialization
-keepclassmembers class * implements java.io.Serializable {
    private static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# Keep enum classes
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep R8 from removing lambdas
-keep class kotlin.jvm.functions.** { *; }

# =================== OMDB API ===================
# Keep OMDB API data classes (for Gson/Retrofit JSON parsing)
-keep class it.wavestream.app.data.api.OmdbResult { *; }
-keep class it.wavestream.app.data.api.OmdbRating { *; }
-keep class it.wavestream.app.data.api.OmdbSearchResponse { *; }
-keep class it.wavestream.app.data.api.OmdbSearchResult { *; }
-keep interface it.wavestream.app.data.api.OmdbService { *; }

# Keep all data classes (for JSON serialization)
-keep class it.wavestream.app.data.api.** { *; }
-keep class it.wavestream.app.data.tmdb.** { *; }

# OkHttp
-dontwarn okhttp3.**
-dontwarn okio.**
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }
-keep class okhttp3.logging.** { *; }
-dontwarn okhttp3.internal.platform.**

# Retrofit
-keep class retrofit2.** { *; }
-keepattributes RuntimeVisibleAnnotations, RuntimeInvisibleAnnotations, RuntimeVisibleParameterAnnotations, RuntimeInvisibleParameterAnnotations
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}
-dontwarn retrofit2.**
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.Continuation

# Gson
-keep class com.google.gson.** { *; }
-keepattributes Signature
-keepattributes *Annotation*
-keep class * implements com.google.gson.TypeAdapterFactory
-keep class * implements com.google.gson.JsonSerializer
-keep class * implements com.google.gson.JsonDeserializer
-keep class * extends com.google.gson.reflect.TypeToken
-keepclassmembers,allowobfuscation class * {
  @com.google.gson.annotations.SerializedName <fields>;
}

# Keep all model/data classes with their field names
-keepclassmembers class it.wavestream.app.data.api.** {
  <fields>;
}

# =================== FIREBASE ===================
# Firebase Realtime Database
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }
-keepclassmembers class com.google.firebase.** { *; }
-keepclassmembers class com.google.android.gms.** { *; }
-dontwarn com.google.firebase.**
-dontwarn com.google.android.gms.**

# Explicitly keep all Firebase Database internal classes (connection, WebSocket, etc.)
-keep class com.google.firebase.database.** { *; }
-keepclassmembers class com.google.firebase.database.** { *; }

# Legacy Firebase connection / WebSocket packages (Tubesock, etc.)
-keep class com.firebase.** { *; }
-dontwarn com.firebase.**

# Jackson parser classes used by Firebase internally
-keep class com.fasterxml.jackson.** { *; }
-dontwarn com.fasterxml.jackson.**

# =================== ZXING QR CODE ===================
-keep class com.google.zxing.** { *; }
-keep interface com.google.zxing.** { *; }
-keep enum com.google.zxing.** { *; }
-keepclassmembers class com.google.zxing.** { *; }
-keepclassmembers enum com.google.zxing.** { *; }
-dontwarn com.google.zxing.**

# =================== WaveStream UI Classes ===================
# Keep UI data classes (CarouselItem, HeroItem, etc.)
-keep class it.wavestream.app.ui.home.** { *; }
-keep class it.wavestream.app.ui.details.** { *; }

# Keep ViewModels
-keep class * extends androidx.lifecycle.ViewModel { *; }
-keep class * extends androidx.lifecycle.AndroidViewModel { *; }

# Keep data classes with constructors
-keepclassmembers class it.wavestream.app.ui.home.CarouselItem { *; }
-keepclassmembers class it.wavestream.app.ui.home.HeroItem { *; }
-keepclassmembers class it.wavestream.app.ui.home.CarouselRow { *; }
-keepclassmembers class it.wavestream.app.ui.home.HomeScreenState { *; }

# Keep DAO interfaces
-keep interface it.wavestream.app.data.database.dao.** { *; }
-keep class it.wavestream.app.data.database.dao.** { *; }

# =================== WATCH HISTORY / PROGRESS ===================
# Keep WatchProgress and related entities (cause of history crash)
-keep class it.wavestream.app.data.database.entity.WatchProgress { *; }
-keepclassmembers class it.wavestream.app.data.database.entity.WatchProgress {
    public float getProgressPercent();
    <fields>;
}
-keep class it.wavestream.app.data.database.entity.WatchState { *; }
-keep class it.wavestream.app.data.database.entity.ContinueWatchingItem { *; }
-keep class it.wavestream.app.data.database.entity.RecentlyWatchedChannel { *; }

# Keep DAO methods to prevent R8 from stripping them if they look unused
-keepclassmembers interface it.wavestream.app.data.database.dao.WatchProgressDao {
    public *;
}
-keepclassmembers interface it.wavestream.app.data.database.dao.MovieDao {
    public *;
}
-keepclassmembers interface it.wavestream.app.data.database.dao.SeriesDao {
    public *;
}

# Keep HomeContentType enum (used for tab switching including HISTORY)
-keep enum it.wavestream.app.ui.home.HomeContentType { *; }
-keep enum it.wavestream.app.data.database.entity.ContentType { *; }

# Keep HomeScreenState and related data classes
-keep class it.wavestream.app.ui.home.HomeScreenState { *; }
-keepclassmembers class it.wavestream.app.ui.home.HomeScreenState { *; }

# =================== PLAYER ===================
# Keep player-related classes
-keep class it.wavestream.app.ui.player.** { *; }
-keep class it.wavestream.app.player.** { *; }

# =================== ALL VIEWMODELS ===================
# Keep all ViewModel classes to prevent reflection issues
-keep class * extends androidx.lifecycle.ViewModel {
    <init>(...);
    *;
}

# Keep Hilt-injected constructors
-keepclassmembers class * {
    @javax.inject.Inject <init>(...);
}

# =================== COMPOSE ===================
# Keep Compose runtime classes
-keep class androidx.compose.runtime.** { *; }
-keep class androidx.tv.** { *; }

# Keep Material Icons (Extended) — R8 strips individual icon classes as "unused"
-keep class androidx.compose.material.icons.** { *; }
-keepclassmembers class androidx.compose.material.icons.** { *; }

# =================== HISTORY TAB FIX ===================
# Keep HomeViewModel internal methods used by History tab
# R8 may strip these as "unused" because they're called via reflection-like patterns
-keepclassmembers class it.wavestream.app.ui.home.HomeViewModel {
    private ** loadHistoryContent(...);
    private ** buildHeroItem(...);
    private ** toCarouselItem(...);
    private ** *(...);
}

# Keep extension functions on data classes
-keepclassmembers class it.wavestream.app.data.database.entity.Movie { *; }
-keepclassmembers class it.wavestream.app.data.database.entity.Series { *; }
-keepclassmembers class it.wavestream.app.data.database.entity.Channel { *; }

# Keep Kotlin extension functions (they are compiled as static methods)
-keepclassmembers class **Kt {
    public static *;
}

# Prevent R8 from over-optimizing methods
-keep class it.wavestream.app.ui.home.HomeViewModel { *; }

# =================== SERIE A ===================
# Keep Serie A model classes (for Gson/Retrofit JSON parsing)
-keep class it.wavestream.app.data.model.** { *; }
-keepclassmembers class it.wavestream.app.data.model.** {
    <fields>;
}

# Keep Serie A repository
-keep class it.wavestream.app.data.repository.SerieARepository { *; }

# Keep Serie A UI classes
-keep class it.wavestream.app.ui.seriea.** { *; }

# =================== OPENSUBTITLES ===================
# Keep OpenSubtitles API models (for Gson JSON parsing)
-keep class it.wavestream.app.data.api.LoginRequest { *; }
-keep class it.wavestream.app.data.api.LoginResponse { *; }
-keep class it.wavestream.app.data.api.User { *; }
-keep class it.wavestream.app.data.api.DownloadRequest { *; }
-keep class it.wavestream.app.data.api.DownloadResponse { *; }
-keep class it.wavestream.app.data.api.SubtitleSearchResponse { *; }
-keep class it.wavestream.app.data.api.SubtitleResult { *; }
-keep class it.wavestream.app.data.api.SubtitleAttributes { *; }
-keep class it.wavestream.app.data.api.SubtitleFile { *; }
-keep class it.wavestream.app.data.api.SubtitleDetailsResponse { *; }
-keep class it.wavestream.app.data.api.UserInfoResponse { *; }
-keep class it.wavestream.app.data.api.UserData { *; }
-keep class it.wavestream.app.data.api.Uploader { *; }
-keep class it.wavestream.app.data.api.FeatureDetails { *; }
-keep class it.wavestream.app.data.api.RelatedLink { *; }

# Keep OpenSubtitles Service interface
-keep interface it.wavestream.app.data.api.OpenSubtitlesService { *; }

# Keep OpenSubtitles Repository
-keep class it.wavestream.app.data.repository.OpenSubtitlesRepository { *; }

# Keep SubtitleManager
-keep class it.wavestream.app.player.SubtitleManager { *; }
-keep class it.wavestream.app.player.SubtitleManager$* { *; }

# Keep Settings UI classes
-keep class it.wavestream.app.ui.settings.** { *; }

# =================== HISTORY TAB COMPREHENSIVE FIX ===================
# Keep all home UI data classes with all members
-keep class it.wavestream.app.ui.home.CarouselItem { *; }
-keep class it.wavestream.app.ui.home.CarouselRow { *; }
-keep class it.wavestream.app.ui.home.HeroItem { *; }
-keep class it.wavestream.app.ui.home.HomeScreenState { *; }
-keep class it.wavestream.app.ui.home.HomeContentType { *; }
-keep class it.wavestream.app.ui.home.ContinueWatchingData { *; }

# Keep ALL members including data class generated methods
-keepclassmembers class it.wavestream.app.ui.home.CarouselItem {
    <init>(...);
    <fields>;
    *;
}
-keepclassmembers class it.wavestream.app.ui.home.CarouselRow {
    <init>(...);
    <fields>;
    *;
}
-keepclassmembers class it.wavestream.app.ui.home.HeroItem {
    <init>(...);
    <fields>;
    *;
}

# Keep ContinueWatchingData and its extension function
-keep class it.wavestream.app.ui.home.ContinueWatchingData { *; }
-keepclassmembers class it.wavestream.app.ui.home.ContinueWatchingData {
    <init>(...);
    <fields>;
    *;
}

# Keep extension functions (toCarouselItem, etc.) - they are in HomeViewModelKt
-keep class it.wavestream.app.ui.home.HomeViewModelKt { *; }
-keepclassmembers class it.wavestream.app.ui.home.HomeViewModelKt {
    public static *;
}

# Keep WatchProgress DAO methods for history
-keepclassmembers interface it.wavestream.app.data.database.dao.WatchProgressDao {
    public ** getRecentlyWatched(...);
    public *;
}

# Keep ALL database entities completely
-keep class it.wavestream.app.data.database.entity.** { *; }
-keepclassmembers class it.wavestream.app.data.database.entity.** {
    <init>(...);
    <fields>;
    *;
}

# Prevent R8 from stripping/optimizing Kotlin data class methods
-keepclassmembers class * {
    public ** component*();
    public ** copy(...);
}

# =================== HERO RATINGS / SCRAPING ===================
# Keep Rotten Tomatoes scraper and its inner data classes
-keep class it.wavestream.app.data.repository.RottenTomatoesScraper { *; }
-keep class it.wavestream.app.data.repository.RottenTomatoesScraper$* { *; }

# Keep IMDB ratings repository and its inner data classes
-keep class it.wavestream.app.data.repository.ImdbRatingsRepository { *; }
-keep class it.wavestream.app.data.repository.ImdbRatingsRepository$* { *; }

# Keep all repositories (for Hilt injection + reflection)
-keep class it.wavestream.app.data.repository.** { *; }

# Keep ContentCache and HeroPairData (Gson serialization)
-keep class it.wavestream.app.data.cache.ContentCache { *; }
-keep class it.wavestream.app.ui.home.HeroPairData { *; }
-keepclassmembers class it.wavestream.app.ui.home.HeroPairData {
    <init>(...);
    <fields>;
    *;
}


# WireGuard tunnel library (Go userspace backend via JNI)
-keep class com.wireguard.** { *; }
-keepclasseswithmembernames class com.wireguard.android.backend.GoBackend { native <methods>; }

# NanoHTTPD (local HTTP relay server for VPN config transfer)
-keep class fi.iki.elonen.** { *; }

# =================== SECURITY CRYPTO / TINK ===================
# EncryptedSharedPreferences + MasterKey rely on Tink, which uses reflection
# and shaded protobuf. Without these rules R8 strips/renames Tink classes and
# the OpenSubtitles settings screen crashes on release builds with
# VerifyError / NoClassDefFoundError (debug works because there is no shrinking).
-keep class androidx.security.crypto.** { *; }
-keep class com.google.crypto.tink.** { *; }
-dontwarn com.google.crypto.tink.**
-keepclassmembers class * extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite {
  <fields>;
}
-keepclassmembers class * extends com.google.crypto.tink.shaded.protobuf.MessageLite {
  <fields>;
}
