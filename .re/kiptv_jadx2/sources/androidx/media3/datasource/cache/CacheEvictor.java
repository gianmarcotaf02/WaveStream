package androidx.media3.datasource.cache;

public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j, long j9);

    boolean requiresCacheSpanTouches();
}
