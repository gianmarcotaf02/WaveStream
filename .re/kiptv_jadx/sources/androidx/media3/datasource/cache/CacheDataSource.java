package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSource implements androidx.media3.datasource.DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private android.net.Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final androidx.media3.datasource.cache.Cache cache;
    private final androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory;
    private final androidx.media3.datasource.DataSource cacheReadDataSource;
    private final androidx.media3.datasource.DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private androidx.media3.datasource.DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    private androidx.media3.datasource.DataSpec currentDataSpec;
    private androidx.media3.datasource.cache.CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    private androidx.media3.datasource.DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final androidx.media3.datasource.DataSource upstreamDataSource;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i3);

        void onCachedBytesRead(long j, long j9);
    }

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private androidx.media3.datasource.cache.Cache cache;
        private boolean cacheIsReadOnly;
        private androidx.media3.datasource.DataSink.Factory cacheWriteDataSinkFactory;
        private androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener;
        private int flags;
        private androidx.media3.datasource.DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;
        private androidx.media3.common.PriorityTaskManager upstreamPriorityTaskManager;
        private androidx.media3.datasource.DataSource.Factory cacheReadDataSourceFactory = new androidx.media3.datasource.FileDataSource.Factory();
        private androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory = androidx.media3.datasource.cache.CacheKeyFactory.DEFAULT;

        private androidx.media3.datasource.cache.CacheDataSource createDataSourceInternal(androidx.media3.datasource.DataSource dataSource, int i3, int i9) {
            androidx.media3.datasource.DataSink dataSinkCreateDataSink;
            androidx.media3.datasource.cache.Cache cache = this.cache;
            cache.getClass();
            if (this.cacheIsReadOnly || dataSource == null) {
                dataSinkCreateDataSink = null;
            } else {
                androidx.media3.datasource.DataSink.Factory factory = this.cacheWriteDataSinkFactory;
                dataSinkCreateDataSink = factory != null ? factory.createDataSink() : new androidx.media3.datasource.cache.CacheDataSink.Factory().setCache(cache).createDataSink();
            }
            return new androidx.media3.datasource.cache.CacheDataSource(cache, dataSource, this.cacheReadDataSourceFactory.createDataSource(), dataSinkCreateDataSink, this.cacheKeyFactory, i3, this.upstreamPriorityTaskManager, i9, this.eventListener);
        }

        public androidx.media3.datasource.cache.CacheDataSource createDataSourceForDownloading() {
            androidx.media3.datasource.DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags | 1, -4000);
        }

        public androidx.media3.datasource.cache.CacheDataSource createDataSourceForRemovingDownload() {
            return createDataSourceInternal(null, this.flags | 1, -4000);
        }

        public androidx.media3.datasource.cache.Cache getCache() {
            return this.cache;
        }

        public androidx.media3.datasource.cache.CacheKeyFactory getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        public androidx.media3.common.PriorityTaskManager getUpstreamPriorityTaskManager() {
            return this.upstreamPriorityTaskManager;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCache(androidx.media3.datasource.cache.Cache cache) {
            this.cache = cache;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCacheKeyFactory(androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCacheReadDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.cacheReadDataSourceFactory = factory;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCacheWriteDataSinkFactory(androidx.media3.datasource.DataSink.Factory factory) {
            this.cacheWriteDataSinkFactory = factory;
            this.cacheIsReadOnly = factory == null;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setEventListener(androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setFlags(int i3) {
            this.flags = i3;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setUpstreamDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.upstreamDataSourceFactory = factory;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setUpstreamPriority(int i3) {
            this.upstreamPriority = i3;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setUpstreamPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
            this.upstreamPriorityTaskManager = priorityTaskManager;
            return this;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.cache.CacheDataSource createDataSource() {
            androidx.media3.datasource.DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags, this.upstreamPriority);
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void closeCurrentSource() {
        androidx.media3.datasource.DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSpec = null;
            this.currentDataSource = null;
            androidx.media3.datasource.cache.CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private static android.net.Uri getRedirectedUriOrDefault(androidx.media3.datasource.cache.Cache cache, java.lang.String str, android.net.Uri uri) {
        android.net.Uri redirectedUri = androidx.media3.datasource.cache.ContentMetadata.getRedirectedUri(cache.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private void handleBeforeThrow(java.lang.Throwable th) {
        if (isReadingFromCache() || (th instanceof androidx.media3.datasource.cache.Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void notifyBytesRead() {
        androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }

    private void notifyCacheIgnored(int i3) {
        androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i3);
        }
    }

    private void openNextSource(androidx.media3.datasource.DataSpec dataSpec, boolean z6) throws java.io.InterruptedIOException {
        androidx.media3.datasource.cache.CacheSpan cacheSpanStartReadWrite;
        long jMin;
        androidx.media3.datasource.DataSpec dataSpecBuild;
        androidx.media3.datasource.DataSource dataSource;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Util.castNonNull(dataSpec.key);
        if (this.currentRequestIgnoresCache) {
            cacheSpanStartReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                cacheSpanStartReadWrite = this.cache.startReadWrite(str, this.readPosition, this.bytesRemaining);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.io.InterruptedIOException();
            }
        } else {
            cacheSpanStartReadWrite = this.cache.startReadWriteNonBlocking(str, this.readPosition, this.bytesRemaining);
        }
        if (cacheSpanStartReadWrite == null) {
            dataSource = this.upstreamDataSource;
            dataSpecBuild = dataSpec.buildUpon().setPosition(this.readPosition).setLength(this.bytesRemaining).build();
        } else if (cacheSpanStartReadWrite.isCached) {
            android.net.Uri uriFromFile = android.net.Uri.fromFile((java.io.File) androidx.media3.common.util.Util.castNonNull(cacheSpanStartReadWrite.file));
            long j = cacheSpanStartReadWrite.position;
            long j9 = this.readPosition - j;
            long jMin2 = cacheSpanStartReadWrite.length - j9;
            long j10 = this.bytesRemaining;
            if (j10 != -1) {
                jMin2 = java.lang.Math.min(jMin2, j10);
            }
            dataSpecBuild = dataSpec.buildUpon().setUri(uriFromFile).setUriPositionOffset(j).setPosition(j9).setLength(jMin2).build();
            dataSource = this.cacheReadDataSource;
        } else {
            if (cacheSpanStartReadWrite.isOpenEnded()) {
                jMin = this.bytesRemaining;
            } else {
                jMin = cacheSpanStartReadWrite.length;
                long j11 = this.bytesRemaining;
                if (j11 != -1) {
                    jMin = java.lang.Math.min(jMin, j11);
                }
            }
            dataSpecBuild = dataSpec.buildUpon().setPosition(this.readPosition).setLength(jMin).build();
            dataSource = this.cacheWriteDataSource;
            if (dataSource == null) {
                dataSource = this.upstreamDataSource;
                this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                cacheSpanStartReadWrite = null;
            }
        }
        this.checkCachePosition = (this.currentRequestIgnoresCache || dataSource != this.upstreamDataSource) ? Long.MAX_VALUE : this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
        if (z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            }
            try {
                closeCurrentSource();
            } catch (java.lang.Throwable th) {
                if (((androidx.media3.datasource.cache.CacheSpan) androidx.media3.common.util.Util.castNonNull(cacheSpanStartReadWrite)).isHoleSpan()) {
                    this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                }
                throw th;
            }
        }
        if (cacheSpanStartReadWrite != null && cacheSpanStartReadWrite.isHoleSpan()) {
            this.currentHoleSpan = cacheSpanStartReadWrite;
        }
        this.currentDataSource = dataSource;
        this.currentDataSpec = dataSpecBuild;
        this.currentDataSourceBytesRead = 0L;
        long jOpen = dataSource.open(dataSpecBuild);
        androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations = new androidx.media3.datasource.cache.ContentMetadataMutations();
        if (dataSpecBuild.length == -1 && jOpen != -1) {
            this.bytesRemaining = jOpen;
            androidx.media3.datasource.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
        }
        if (isReadingFromUpstream()) {
            android.net.Uri uri = dataSource.getUri();
            this.actualUri = uri;
            androidx.media3.datasource.cache.ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, dataSpec.uri.equals(uri) ? null : this.actualUri);
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(java.lang.String str) {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations = new androidx.media3.datasource.cache.ContentMetadataMutations();
            androidx.media3.datasource.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition);
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private int shouldIgnoreCacheForRequest(androidx.media3.datasource.DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.requestDataSpec = null;
        this.actualUri = null;
        this.readPosition = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    public androidx.media3.datasource.cache.Cache getCache() {
        return this.cache;
    }

    public androidx.media3.datasource.cache.CacheKeyFactory getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return isReadingFromUpstream() ? this.upstreamDataSource.getResponseHeaders() : java.util.Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.actualUri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) {
        try {
            java.lang.String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            androidx.media3.datasource.DataSpec dataSpecBuild = dataSpec.buildUpon().setKey(strBuildCacheKey).build();
            this.requestDataSpec = dataSpecBuild;
            this.actualUri = getRedirectedUriOrDefault(this.cache, strBuildCacheKey, dataSpecBuild.uri);
            this.readPosition = dataSpec.position;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z6 = iShouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z6;
            if (z6) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            if (this.currentRequestIgnoresCache) {
                this.bytesRemaining = -1L;
            } else {
                long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - dataSpec.position;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new androidx.media3.datasource.DataSourceException(2008);
                    }
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j9 = this.bytesRemaining;
                if (j9 != -1) {
                    jMin = java.lang.Math.min(j9, jMin);
                }
                this.bytesRemaining = jMin;
            }
            long j10 = this.bytesRemaining;
            if (j10 > 0 || j10 == -1) {
                openNextSource(dataSpecBuild, false);
            }
            long j11 = dataSpec.length;
            return j11 != -1 ? j11 : this.bytesRemaining;
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        androidx.media3.datasource.DataSpec dataSpec = this.requestDataSpec;
        dataSpec.getClass();
        androidx.media3.datasource.DataSpec dataSpec2 = this.currentDataSpec;
        dataSpec2.getClass();
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(dataSpec, true);
            }
            androidx.media3.datasource.DataSource dataSource = this.currentDataSource;
            dataSource.getClass();
            int i10 = dataSource.read(bArr, i3, i9);
            if (i10 == -1) {
                if (isReadingFromUpstream()) {
                    long j = dataSpec2.length;
                    if (j == -1 || this.currentDataSourceBytesRead < j) {
                        setNoBytesRemainingAndMaybeStoreLength((java.lang.String) androidx.media3.common.util.Util.castNonNull(dataSpec.key));
                        return i10;
                    }
                }
                long j9 = this.bytesRemaining;
                if (j9 <= 0) {
                    if (j9 == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(dataSpec, false);
                return read(bArr, i3, i9);
            }
            if (isReadingFromCache()) {
                this.totalCachedBytesRead += (long) i10;
            }
            long j10 = i10;
            this.readPosition += j10;
            this.currentDataSourceBytesRead += j10;
            long j11 = this.bytesRemaining;
            if (j11 != -1) {
                this.bytesRemaining = j11 - j10;
                return i10;
            }
            return i10;
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, int i3) {
        this(cache, dataSource, new androidx.media3.datasource.FileDataSource(), new androidx.media3.datasource.cache.CacheDataSink(cache, androidx.media3.datasource.cache.CacheDataSink.DEFAULT_FRAGMENT_SIZE), i3, null);
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSink dataSink, int i3, androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i3, eventListener, null);
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSink dataSink, int i3, androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener, androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource, dataSource2, dataSink, cacheKeyFactory, i3, null, -1000, eventListener);
    }

    private CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSink dataSink, androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory, int i3, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i9, androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory == null ? androidx.media3.datasource.cache.CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.blockOnCache = (i3 & 1) != 0;
        this.ignoreCacheOnError = (i3 & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i3 & 4) != 0;
        if (dataSource != null) {
            dataSource = priorityTaskManager != null ? new androidx.media3.datasource.PriorityDataSource(dataSource, priorityTaskManager, i9) : dataSource;
            this.upstreamDataSource = dataSource;
            this.cacheWriteDataSource = dataSink != null ? new androidx.media3.datasource.TeeDataSource(dataSource, dataSink) : null;
        } else {
            this.upstreamDataSource = androidx.media3.datasource.PlaceholderDataSource.INSTANCE;
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener;
    }
}
