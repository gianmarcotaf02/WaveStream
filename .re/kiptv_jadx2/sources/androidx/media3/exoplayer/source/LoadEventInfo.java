package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class LoadEventInfo {
    private static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uri;

    public LoadEventInfo(long j, DataSpec dataSpec, long j9) {
        this(j, dataSpec, dataSpec.uri, Collections.EMPTY_MAP, j9, 0L, 0L);
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public LoadEventInfo copyWithTaskIdAndDurationMs(long j, long j9) {
        return new LoadEventInfo(j, this.dataSpec, this.uri, this.responseHeaders, this.elapsedRealtimeMs, j9, this.bytesLoaded);
    }

    public LoadEventInfo(long j, DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j9, long j10, long j11) {
        this.loadTaskId = j;
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j9;
        this.loadDurationMs = j10;
        this.bytesLoaded = j11;
    }
}
