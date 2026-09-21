package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final androidx.media3.datasource.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final androidx.media3.datasource.cache.CacheDataSource dataSource;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
        void onProgress(long j, long j9, long j10);
    }

    public CacheWriter(androidx.media3.datasource.cache.CacheDataSource cacheDataSource, androidx.media3.datasource.DataSpec dataSpec, byte[] bArr, androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener) {
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
        androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private long readBlockToCache(long j, long j9) throws java.lang.Exception {
        long jOpen;
        boolean z6 = true;
        boolean z9 = j + j9 == this.endPosition || j9 == -1;
        if (j9 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(j9).build());
            } catch (java.lang.Exception unused) {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
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
            } catch (java.lang.Exception e6) {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                throw e6;
            }
        }
        if (z9 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (java.lang.Exception e9) {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                throw e9;
            }
        }
        int i3 = 0;
        int i9 = 0;
        while (i3 != -1) {
            throwIfCanceled();
            androidx.media3.datasource.cache.CacheDataSource cacheDataSource = this.dataSource;
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

    private void throwIfCanceled() throws java.io.InterruptedIOException {
        if (this.isCanceled) {
            throw new java.io.InterruptedIOException();
        }
    }

    public void cache() {
        throwIfCanceled();
        androidx.media3.datasource.cache.Cache cache = this.cache;
        java.lang.String str = this.cacheKey;
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        androidx.media3.datasource.DataSpec dataSpec2 = this.dataSpec;
        long j = dataSpec2.length;
        if (j != -1) {
            this.endPosition = dataSpec2.position + j;
        } else {
            long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener = this.progressListener;
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
