package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class LoadEventInfo {
    private static final java.util.concurrent.atomic.AtomicLong idSource = new java.util.concurrent.atomic.AtomicLong();
    public final long bytesLoaded;
    public final androidx.media3.datasource.DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders;
    public final android.net.Uri uri;

    public LoadEventInfo(long j, androidx.media3.datasource.DataSpec dataSpec, long j9) {
        this(j, dataSpec, dataSpec.uri, java.util.Collections.EMPTY_MAP, j9, 0L, 0L);
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public androidx.media3.exoplayer.source.LoadEventInfo copyWithTaskIdAndDurationMs(long j, long j9) {
        return new androidx.media3.exoplayer.source.LoadEventInfo(j, this.dataSpec, this.uri, this.responseHeaders, this.elapsedRealtimeMs, j9, this.bytesLoaded);
    }

    public LoadEventInfo(long j, androidx.media3.datasource.DataSpec dataSpec, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j9, long j10, long j11) {
        this.loadTaskId = j;
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j9;
        this.loadDurationMs = j10;
        this.bytesLoaded = j11;
    }
}
