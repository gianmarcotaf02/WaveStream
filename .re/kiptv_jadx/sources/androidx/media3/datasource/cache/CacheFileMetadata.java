package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
final class CacheFileMetadata {
    public final long lastTouchTimestamp;
    public final long length;

    public CacheFileMetadata(long j, long j9) {
        this.length = j;
        this.lastTouchTimestamp = j9;
    }
}
