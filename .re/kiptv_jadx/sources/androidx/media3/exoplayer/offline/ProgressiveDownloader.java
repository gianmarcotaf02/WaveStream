package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressiveDownloader implements androidx.media3.exoplayer.offline.Downloader {
    private final androidx.media3.datasource.cache.CacheWriter cacheWriter;
    private final androidx.media3.datasource.cache.CacheDataSource dataSource;
    final androidx.media3.datasource.DataSpec dataSpec;
    private volatile androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> downloadRunnable;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.dash.offline.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j, long j9, long j10) {
        if (this.progressListener == null) {
            return;
        }
        float fPercentFloat = (j == -1 || j == 0) ? -1.0f : androidx.media3.common.util.Util.percentFloat(j9, j);
        androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener = this.progressListener;
        progressListener.getClass();
        progressListener.onProgress(j, j9, fPercentFloat);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0021 */
    @Override // androidx.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener) {
        this.progressListener = progressListener;
        androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        boolean z6 = false;
        while (!z6) {
            if (this.isCanceled) {
                break;
            }
            this.downloadRunnable = new androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException>() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader.1
                @Override // androidx.media3.common.util.RunnableFutureTask
                public void cancelWork() {
                    androidx.media3.exoplayer.offline.ProgressiveDownloader.this.cacheWriter.cancel();
                }

                @Override // androidx.media3.common.util.RunnableFutureTask
                public java.lang.Void doWork() {
                    androidx.media3.exoplayer.offline.ProgressiveDownloader.this.cacheWriter.cache();
                    return null;
                }
            };
            androidx.media3.common.PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
            if (priorityTaskManager2 != null) {
                priorityTaskManager2.proceed(-4000);
            }
            this.executor.execute(this.downloadRunnable);
            try {
                this.downloadRunnable.get();
                z6 = true;
            } catch (java.util.concurrent.ExecutionException e6) {
                java.lang.Throwable cause = e6.getCause();
                cause.getClass();
                if (!(cause instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException)) {
                    if (cause instanceof java.io.IOException) {
                        throw ((java.io.IOException) cause);
                    }
                    androidx.media3.common.util.Util.sneakyThrow(cause);
                }
            }
        }
        androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> runnableFutureTask = this.downloadRunnable;
        runnableFutureTask.getClass();
        runnableFutureTask.blockUntilFinished();
        androidx.media3.common.PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
        if (priorityTaskManager3 != null) {
            priorityTaskManager3.remove(-4000);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    public ProgressiveDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, long j, long j9) {
        this(mediaItem, factory, new androidx.media3.exoplayer.dash.offline.a(), j, j9);
    }

    public ProgressiveDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, factory, executor, 0L, -1L);
    }

    public ProgressiveDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j, long j9) {
        executor.getClass();
        this.executor = executor;
        mediaItem.localConfiguration.getClass();
        androidx.media3.datasource.DataSpec dataSpecBuild = new androidx.media3.datasource.DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).setPosition(j).setLength(j9).build();
        this.dataSpec = dataSpecBuild;
        androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = cacheDataSourceCreateDataSourceForDownloading;
        this.cacheWriter = new androidx.media3.datasource.cache.CacheWriter(cacheDataSourceCreateDataSourceForDownloading, dataSpecBuild, null, new androidx.media3.exoplayer.offline.a(this));
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }
}
