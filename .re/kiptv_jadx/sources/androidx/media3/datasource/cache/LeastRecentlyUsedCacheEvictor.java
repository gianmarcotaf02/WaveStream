package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class LeastRecentlyUsedCacheEvictor implements androidx.media3.datasource.cache.CacheEvictor {
    private long currentSize;
    private final java.util.TreeSet<androidx.media3.datasource.cache.CacheSpan> leastRecentlyUsed = new java.util.TreeSet<>(new A1.b(5));
    private final long maxBytes;

    public LeastRecentlyUsedCacheEvictor(long j) {
        this.maxBytes = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
        long j = cacheSpan.lastTouchTimestamp;
        long j9 = cacheSpan2.lastTouchTimestamp;
        if (j - j9 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j < j9 ? -1 : 1;
    }

    private void evictCache(androidx.media3.datasource.cache.Cache cache, long j) {
        while (this.currentSize + j > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(androidx.media3.datasource.cache.Cache cache, java.lang.String str, long j, long j9) {
        if (j9 != -1) {
            evictCache(cache, j9);
        }
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
