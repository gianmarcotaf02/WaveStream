package androidx.media3.datasource.cache;

import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.InterruptedIOException;

public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
        void onProgress(long j, long j9, long j10);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, byte[] bArr, ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private long readBlockToCache(long j, long j9) throws Exception {
        long jOpen;
        boolean z6 = true;
        boolean z9 = j + j9 == this.endPosition || j9 == -1;
        if (j9 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(j9).build());
            } catch (Exception unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
                z6 = false;
                jOpen = -1;
            }
        } else {
            z6 = false;
            jOpen = -1;
        }
        if (!z6) {
            throwIfCanceled();
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(-1L).build());
            } catch (Exception e6) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e6;
            }
        }
        if (z9 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (Exception e9) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e9;
            }
        }
        int i3 = 0;
        int i9 = 0;
        while (i3 != -1) {
            throwIfCanceled();
            CacheDataSource cacheDataSource = this.dataSource;
            byte[] bArr = this.temporaryBuffer;
            i3 = cacheDataSource.read(bArr, 0, bArr.length);
            if (i3 != -1) {
                onNewBytesCached(i3);
                i9 += i3;
            }
        }
        if (z9) {
            onRequestEndPosition(j + ((long) i9));
        }
        this.dataSource.close();
        return i9;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }

    public void cache() {
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j = dataSpec2.length;
        if (j != -1) {
            this.endPosition = dataSpec2.position + j;
        } else {
            long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j9 = this.endPosition;
            if (j9 != -1 && this.nextPosition >= j9) {
                return;
            }
            throwIfCanceled();
            long j10 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j10 == -1 ? Long.MAX_VALUE : j10 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j11 = -cachedLength;
                if (j11 == Long.MAX_VALUE) {
                    j11 = -1;
                }
                long j12 = this.nextPosition;
                this.nextPosition = j12 + readBlockToCache(j12, j11);
            }
        }
    }

    public void cancel() {
        this.isCanceled = true;
    }
}
