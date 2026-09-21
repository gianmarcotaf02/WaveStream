package androidx.media3.datasource.cache;

import Y6.f;
import androidx.media3.common.C;
import java.io.File;

public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j9) {
        this(str, j, j9, C.TIME_UNSET, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.position);
        sb.append(", ");
        return f.g(this.length, "]", sb);
    }

    public CacheSpan(String str, long j, long j9, long j10, File file) {
        this.key = str;
        this.position = j;
        this.length = j9;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j10;
    }

    @Override
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j = this.position - cacheSpan.position;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
