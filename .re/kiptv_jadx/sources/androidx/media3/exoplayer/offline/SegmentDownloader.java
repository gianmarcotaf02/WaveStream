package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public abstract class SegmentDownloader<M extends androidx.media3.exoplayer.offline.FilterableManifest<M>> implements androidx.media3.exoplayer.offline.Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final java.util.ArrayList<androidx.media3.common.util.RunnableFutureTask<?, ?>> activeRunnables;
    private final androidx.media3.datasource.cache.Cache cache;
    private final androidx.media3.datasource.cache.CacheDataSource.Factory cacheDataSourceFactory;
    private final androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory;
    public final long durationUs;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final androidx.media3.datasource.DataSpec manifestDataSpec;
    private final androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    public final long startPositionUs;
    private final java.util.ArrayList<androidx.media3.common.StreamKey> streamKeys;

    public static abstract class BaseFactory<M extends androidx.media3.exoplayer.offline.FilterableManifest<M>> implements androidx.media3.exoplayer.offline.SegmentDownloaderFactory {
        protected final androidx.media3.datasource.cache.CacheDataSource.Factory cacheDataSourceFactory;
        protected androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> manifestParser;
        protected long startPositionUs;
        protected java.util.concurrent.Executor executor = new androidx.media3.exoplayer.dash.offline.a();
        protected long maxMergedSegmentStartTimeDiffMs = 20000;
        protected long durationUs = androidx.media3.common.C.TIME_UNSET;

        public BaseFactory(androidx.media3.datasource.cache.CacheDataSource.Factory factory, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> parser) {
            this.cacheDataSourceFactory = factory;
            this.manifestParser = parser;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory<M> setDurationUs(long j) {
            this.durationUs = j;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory<M> setExecutor(java.util.concurrent.Executor executor) {
            this.executor = executor;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory<M> setMaxMergedSegmentStartTimeDiffMs(long j) {
            this.maxMergedSegmentStartTimeDiffMs = j;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory<M> setStartPositionUs(long j) {
            this.startPositionUs = j;
            return this;
        }
    }

    public static final class ProgressNotifier implements androidx.media3.datasource.cache.CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener, long j, int i3, long j9, int i9) {
            this.progressListener = progressListener;
            this.contentLength = j;
            this.totalSegments = i3;
            this.bytesDownloaded = j9;
            this.segmentsDownloaded = i9;
        }

        private float getPercentDownloaded() {
            long j = this.contentLength;
            if (j != -1 && j != 0) {
                return androidx.media3.common.util.Util.percentFloat(this.bytesDownloaded, j);
            }
            int i3 = this.totalSegments;
            if (i3 != 0) {
                return androidx.media3.common.util.Util.percentFloat(this.segmentsDownloaded, i3);
            }
            return -1.0f;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j, long j9, long j10) {
            long j11 = this.bytesDownloaded + j10;
            this.bytesDownloaded = j11;
            this.progressListener.onProgress(this.contentLength, j11, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    public static class Segment implements java.lang.Comparable<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> {
        public final androidx.media3.datasource.DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, androidx.media3.datasource.DataSpec dataSpec) {
            this.startTimeUs = j;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment) {
            return java.lang.Long.compare(this.startTimeUs, segment.startTimeUs);
        }
    }

    public static final class SegmentDownloadRunnable extends androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> {
        private final androidx.media3.datasource.cache.CacheWriter cacheWriter;
        public final androidx.media3.datasource.cache.CacheDataSource dataSource;
        private final androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier;
        public final androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment, androidx.media3.datasource.cache.CacheDataSource cacheDataSource, androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new androidx.media3.datasource.cache.CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public java.lang.Void doWork() {
            this.cacheWriter.cache();
            androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }
    }

    public SegmentDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j) {
        this(mediaItem, parser, factory, executor, j, 0L, androidx.media3.common.C.TIME_UNSET);
    }

    private <T> void addActiveRunnable(androidx.media3.common.util.RunnableFutureTask<T, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new java.lang.InterruptedException();
                }
                this.activeRunnables.add(runnableFutureTask);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static boolean canMergeSegments(androidx.media3.datasource.DataSpec dataSpec, androidx.media3.datasource.DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j = dataSpec.length;
        return j != -1 && dataSpec.position + j == dataSpec2.position && java.util.Objects.equals(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    public static androidx.media3.datasource.DataSpec getCompressibleDataSpec(android.net.Uri uri) {
        return new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.media3.common.util.RunnableFutureTask lambda$getManifest$0(final androidx.media3.datasource.DataSource dataSource, final androidx.media3.datasource.DataSpec dataSpec) {
        return new androidx.media3.common.util.RunnableFutureTask<M, java.io.IOException>() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            @Override // androidx.media3.common.util.RunnableFutureTask
            public M doWork() {
                return (M) androidx.media3.exoplayer.upstream.ParsingLoadable.load(dataSource, androidx.media3.exoplayer.offline.SegmentDownloader.this.manifestParser, dataSpec, 4);
            }
        };
    }

    private static void mergeSegments(java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> list, androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory, long j) {
        java.util.HashMap map = new java.util.HashMap();
        int i3 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment = list.get(i9);
            java.lang.String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            java.lang.Integer num = (java.lang.Integer) map.get(strBuildCacheKey);
            androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, java.lang.Integer.valueOf(i3));
                list.set(i3, segment);
                i3++;
            } else {
                long j9 = segment.dataSpec.length;
                androidx.media3.datasource.DataSpec dataSpecSubrange = segment2.dataSpec.subrange(0L, j9 != -1 ? segment2.dataSpec.length + j9 : -1L);
                num.getClass();
                list.set(num.intValue(), new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(segment2.startTimeUs, dataSpecSubrange));
            }
        }
        androidx.media3.common.util.Util.removeRange(list, i3, list.size());
    }

    private void removeActiveRunnable(androidx.media3.common.util.RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i3 = 0; i3 < this.activeRunnables.size(); i3++) {
                    this.activeRunnables.get(i3).cancel(true);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0034 */
    @Override // androidx.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener) {
        androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
        androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
        androidx.media3.exoplayer.offline.FilterableManifest manifest = getManifest(cacheDataSourceCreateDataSourceForDownloading2, this.manifestDataSpec, false);
        if (!this.streamKeys.isEmpty()) {
            manifest = (androidx.media3.exoplayer.offline.FilterableManifest) manifest.copy(this.streamKeys);
        }
        java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> segments = getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
        java.util.Collections.sort(segments);
        mergeSegments(segments, this.cacheKeyFactory, this.maxMergedSegmentStartTimeDiffUs);
        int size = segments.size();
        int i3 = 0;
        long j = 0;
        long j9 = 0;
        for (int size2 = segments.size() - 1; size2 >= 0; size2--) {
            androidx.media3.datasource.DataSpec dataSpec = segments.get(size2).dataSpec;
            java.lang.String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            long j10 = dataSpec.length;
            if (j10 == -1) {
                long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                if (contentLength != -1) {
                    j10 = contentLength - dataSpec.position;
                }
            }
            long j11 = j10;
            long cachedBytes = this.cache.getCachedBytes(strBuildCacheKey, dataSpec.position, j11);
            j9 += cachedBytes;
            if (j11 != -1) {
                if (j11 == cachedBytes) {
                    i3++;
                    segments.remove(size2);
                }
                if (j != -1) {
                    j += j11;
                }
            } else {
                j = -1;
            }
        }
        androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier = progressListener != null ? new androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier(progressListener, j, size, j9, i3) : null;
        arrayDeque.addAll(segments);
        while (!this.isCanceled && !arrayDeque.isEmpty()) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
            if (priorityTaskManager2 != null) {
                priorityTaskManager2.proceed(-4000);
            }
            if (arrayDeque2.isEmpty()) {
                cacheDataSourceCreateDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                bArr = new byte[131072];
            } else {
                androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable = (androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable) arrayDeque2.removeFirst();
                cacheDataSourceCreateDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                bArr = segmentDownloadRunnable.temporaryBuffer;
            }
            androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable2 = new androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable((androidx.media3.exoplayer.offline.SegmentDownloader.Segment) arrayDeque.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, progressNotifier, bArr);
            addActiveRunnable(segmentDownloadRunnable2);
            this.executor.execute(segmentDownloadRunnable2);
            for (int size3 = this.activeRunnables.size() - 1; size3 >= 0; size3--) {
                androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable3 = (androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable) this.activeRunnables.get(size3);
                if (arrayDeque.isEmpty() || segmentDownloadRunnable3.isDone()) {
                    try {
                        segmentDownloadRunnable3.get();
                        removeActiveRunnable(size3);
                        arrayDeque2.addLast(segmentDownloadRunnable3);
                    } catch (java.util.concurrent.ExecutionException e6) {
                        java.lang.Throwable cause = e6.getCause();
                        cause.getClass();
                        if (cause instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException) {
                            arrayDeque.addFirst(segmentDownloadRunnable3.segment);
                            removeActiveRunnable(size3);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        } else {
                            if (cause instanceof java.io.IOException) {
                                throw ((java.io.IOException) cause);
                            }
                            androidx.media3.common.util.Util.sneakyThrow(cause);
                        }
                    }
                }
            }
            segmentDownloadRunnable2.blockUntilStarted();
        }
        for (int i9 = 0; i9 < this.activeRunnables.size(); i9++) {
            this.activeRunnables.get(i9).cancel(true);
        }
        for (int size4 = this.activeRunnables.size() - 1; size4 >= 0; size4--) {
            this.activeRunnables.get(size4).blockUntilFinished();
            removeActiveRunnable(size4);
        }
        androidx.media3.common.PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
        if (priorityTaskManager3 != null) {
            priorityTaskManager3.remove(-4000);
        }
    }

    public final <T> T execute(p068h4.v vVar, boolean z6) throws java.lang.Throwable {
        if (z6) {
            androidx.media3.common.util.RunnableFutureTask runnableFutureTask = (androidx.media3.common.util.RunnableFutureTask) vVar.get();
            runnableFutureTask.run();
            try {
                return (T) runnableFutureTask.get();
            } catch (java.util.concurrent.ExecutionException e6) {
                java.lang.Throwable cause = e6.getCause();
                cause.getClass();
                if (cause instanceof java.io.IOException) {
                    throw ((java.io.IOException) cause);
                }
                androidx.media3.common.util.Util.sneakyThrow(e6);
            }
        }
        while (!this.isCanceled) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-4000);
            }
            androidx.media3.common.util.RunnableFutureTask<T, ?> runnableFutureTask2 = (androidx.media3.common.util.RunnableFutureTask) vVar.get();
            addActiveRunnable(runnableFutureTask2);
            this.executor.execute(runnableFutureTask2);
            try {
                try {
                    T t9 = runnableFutureTask2.get();
                    runnableFutureTask2.blockUntilFinished();
                    removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) runnableFutureTask2);
                    return t9;
                } catch (java.util.concurrent.ExecutionException e9) {
                    java.lang.Throwable cause2 = e9.getCause();
                    cause2.getClass();
                    if (!(cause2 instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException)) {
                        if (cause2 instanceof java.io.IOException) {
                            throw ((java.io.IOException) cause2);
                        }
                        androidx.media3.common.util.Util.sneakyThrow(e9);
                    }
                    runnableFutureTask2.blockUntilFinished();
                    removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) runnableFutureTask2);
                }
            } catch (java.lang.Throwable th) {
                runnableFutureTask2.blockUntilFinished();
                removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) runnableFutureTask2);
                throw th;
            }
        }
        throw new java.lang.InterruptedException();
    }

    public final M getManifest(final androidx.media3.datasource.DataSource dataSource, final androidx.media3.datasource.DataSpec dataSpec, boolean z6) {
        return (M) execute(new p068h4.v() { // from class: androidx.media3.exoplayer.offline.g
            @Override // p068h4.v
            public final java.lang.Object get() {
                return this.f16707h.lambda$getManifest$0(dataSource, dataSpec);
            }
        }, z6);
    }

    public abstract java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> getSegments(androidx.media3.datasource.DataSource dataSource, M m8, boolean z6);

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
            for (int i3 = 0; i3 < segments.size(); i3++) {
                this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i3).dataSpec));
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        } catch (java.lang.Exception unused2) {
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    public SegmentDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j, long j9, long j10) {
        mediaItem.localConfiguration.getClass();
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new java.util.ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.startPositionUs = j9;
        this.durationUs = j10;
        androidx.media3.datasource.cache.Cache cache = factory.getCache();
        cache.getClass();
        this.cache = cache;
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new java.util.ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = androidx.media3.common.util.Util.msToUs(j);
    }

    private void removeActiveRunnable(int i3) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i3);
        }
    }
}
