package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final androidx.media3.exoplayer.scheduler.Requirements DEFAULT_REQUIREMENTS = new androidx.media3.exoplayer.scheduler.Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 7;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 11;
    private static final int MSG_DOWNLOAD_UPDATE = 3;
    private static final int MSG_INITIALIZE = 1;
    private static final int MSG_INITIALIZED = 1;
    private static final int MSG_PROCESSED = 2;
    private static final int MSG_RELEASE = 13;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 9;
    private static final int MSG_REMOVE_DOWNLOAD = 8;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 2;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 5;
    private static final int MSG_SET_MIN_RETRY_COUNT = 6;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 3;
    private static final int MSG_SET_STOP_REASON = 4;
    private static final int MSG_TASK_STOPPED = 10;
    private static final int MSG_UPDATE_PROGRESS = 12;
    private static final java.lang.String TAG = "DownloadManager";
    private int activeTaskCount;
    private final android.os.Handler applicationHandler;
    private final android.content.Context context;
    private final androidx.media3.exoplayer.offline.WritableDownloadIndex downloadIndex;
    private java.util.List<androidx.media3.exoplayer.offline.Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.exoplayer.offline.DownloadManager.Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener requirementsListener;
    private androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    public static final class DownloadUpdate {
        public final androidx.media3.exoplayer.offline.Download download;
        public final java.util.List<androidx.media3.exoplayer.offline.Download> downloads;
        public final java.lang.Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(androidx.media3.exoplayer.offline.Download download, boolean z6, java.util.List<androidx.media3.exoplayer.offline.Download> list, java.lang.Exception exc) {
            this.download = download;
            this.isRemove = z6;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    public interface Listener {
        default void onDownloadChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.offline.Download download, java.lang.Exception exc) {
        }

        default void onDownloadRemoved(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.offline.Download download) {
        }

        default void onDownloadsPausedChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, boolean z6) {
        }

        default void onIdle(androidx.media3.exoplayer.offline.DownloadManager downloadManager) {
        }

        default void onInitialized(androidx.media3.exoplayer.offline.DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.scheduler.Requirements requirements, int i3) {
        }

        default void onWaitingForRequirementsChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, boolean z6) {
        }
    }

    public static class Task extends java.lang.Thread implements androidx.media3.exoplayer.offline.Downloader.ProgressListener {
        private long contentLength;
        private final androidx.media3.exoplayer.offline.DownloadProgress downloadProgress;
        private final androidx.media3.exoplayer.offline.Downloader downloader;
        private java.lang.Exception finalException;
        private volatile androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final androidx.media3.exoplayer.offline.DownloadRequest request;

        private static int getRetryDelayMillis(int i3) {
            return java.lang.Math.min((i3 - 1) * 1000, 5000);
        }

        public void cancel(boolean z6) {
            if (z6) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // androidx.media3.exoplayer.offline.Downloader.ProgressListener
        public void onProgress(long j, long j9, float f9) {
            this.downloadProgress.bytesDownloaded = j9;
            this.downloadProgress.percentDownloaded = f9;
            if (j != this.contentLength) {
                this.contentLength = j;
                androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j = -1;
                    int i3 = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (java.io.IOException e6) {
                            if (!this.isCanceled) {
                                long j9 = this.downloadProgress.bytesDownloaded;
                                if (j9 != j) {
                                    i3 = 0;
                                    j = j9;
                                }
                                i3++;
                                if (i3 > this.minRetryCount) {
                                    throw e6;
                                }
                                java.lang.Thread.sleep(getRetryDelayMillis(i3));
                            }
                        }
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.lang.Exception e9) {
                this.finalException = e9;
            }
            androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(10, this).sendToTarget();
            }
        }

        private Task(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, androidx.media3.exoplayer.offline.Downloader downloader, androidx.media3.exoplayer.offline.DownloadProgress downloadProgress, boolean z6, int i3, androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z6;
            this.minRetryCount = i3;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }
    }

    public DownloadManager(android.content.Context context, androidx.media3.database.DatabaseProvider databaseProvider, androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(context, new androidx.media3.exoplayer.offline.DefaultDownloadIndex(databaseProvider), new androidx.media3.exoplayer.offline.DefaultDownloaderFactory(new androidx.media3.datasource.cache.CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(android.os.Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            onInitialized((java.util.List) message.obj);
        } else if (i3 == 2) {
            onMessageProcessed(message.arg1, message.arg2);
        } else {
            if (i3 != 3) {
                throw new java.lang.IllegalStateException();
            }
            onDownloadUpdate((androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate) message.obj);
        }
        return true;
    }

    public static androidx.media3.exoplayer.offline.Download mergeRequest(androidx.media3.exoplayer.offline.Download download, androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i3, long j) {
        int i9 = download.state;
        long j9 = (i9 == 5 || download.isTerminalState()) ? j : download.startTimeMs;
        int i10 = 7;
        if (i9 != 5 && i9 != 7) {
            i10 = i3 != 0 ? 1 : 0;
        }
        return new androidx.media3.exoplayer.offline.Download(download.request.copyWithMergedRequest(downloadRequest), i10, j9, j, -1L, i3, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate downloadUpdate) {
        this.downloads = java.util.Collections.unmodifiableList(downloadUpdate.downloads);
        androidx.media3.exoplayer.offline.Download download = downloadUpdate.download;
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onInitialized(java.util.List<androidx.media3.exoplayer.offline.Download> list) {
        this.initialized = true;
        this.downloads = java.util.Collections.unmodifiableList(list);
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i3, int i9) {
        this.pendingMessages -= i3;
        this.activeTaskCount = i9;
        if (isIdle()) {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher, int i3) {
        androidx.media3.exoplayer.scheduler.Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i3) {
            this.notMetRequirements = i3;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(3, i3, 0).sendToTarget();
        }
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i3);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void setDownloadsPaused(boolean z6) {
        if (this.downloadsPaused == z6) {
            return;
        }
        this.downloadsPaused = z6;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(2, z6 ? 1 : 0, 0).sendToTarget();
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z6);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z6;
        if (!this.downloadsPaused && this.notMetRequirements != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.downloads.size()) {
                    z6 = false;
                    break;
                }
                if (this.downloads.get(i3).state == 0) {
                    z6 = true;
                    break;
                }
                i3++;
            }
        } else {
            z6 = false;
            break;
        }
        boolean z9 = this.waitingForRequirements != z6;
        this.waitingForRequirements = z6;
        return z9;
    }

    public void addDownload(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(androidx.media3.exoplayer.offline.DownloadManager.Listener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    public android.os.Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public java.util.List<androidx.media3.exoplayer.offline.Download> getCurrentDownloads() {
        return this.downloads;
    }

    public androidx.media3.exoplayer.offline.DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public androidx.media3.exoplayer.scheduler.Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void release() {
        synchronized (this.internalHandler) {
            try {
                androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = this.internalHandler;
                if (internalHandler.released) {
                    return;
                }
                internalHandler.sendEmptyMessage(13);
                boolean z6 = false;
                while (true) {
                    androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler2 = this.internalHandler;
                    if (internalHandler2.released) {
                        break;
                    }
                    try {
                        internalHandler2.wait();
                    } catch (java.lang.InterruptedException unused) {
                        z6 = true;
                    }
                }
                if (z6) {
                    java.lang.Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.requirementsWatcher.stop();
                this.downloads = java.util.Collections.EMPTY_LIST;
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(9).sendToTarget();
    }

    public void removeDownload(java.lang.String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8, str).sendToTarget();
    }

    public void removeListener(androidx.media3.exoplayer.offline.DownloadManager.Listener listener) {
        this.listeners.remove(listener);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > 0);
        if (this.maxParallelDownloads == i3) {
            return;
        }
        this.maxParallelDownloads = i3;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i3, 0).sendToTarget();
    }

    public void setMinRetryCount(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
        if (this.minRetryCount == i3) {
            return;
        }
        this.minRetryCount = i3;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i3, 0).sendToTarget();
    }

    public void setRequirements(androidx.media3.exoplayer.scheduler.Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher = new androidx.media3.exoplayer.scheduler.RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(java.lang.String str, int i3) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i3, 0, str).sendToTarget();
    }

    public void addDownload(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i3) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, i3, 0, downloadRequest).sendToTarget();
    }

    public DownloadManager(android.content.Context context, androidx.media3.exoplayer.offline.WritableDownloadIndex writableDownloadIndex, androidx.media3.exoplayer.offline.DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = java.util.Collections.EMPTY_LIST;
        this.listeners = new java.util.concurrent.CopyOnWriteArraySet<>();
        android.os.Handler handlerCreateHandlerForCurrentOrMainLooper = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(new androidx.media3.exoplayer.offline.c(1, this));
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = new androidx.media3.exoplayer.offline.DownloadManager.InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        androidx.media3.exoplayer.offline.a aVar = new androidx.media3.exoplayer.offline.a(this);
        this.requirementsListener = aVar;
        androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher = new androidx.media3.exoplayer.scheduler.RequirementsWatcher(context, aVar, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.notMetRequirements = iStart;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(1, iStart, 0).sendToTarget();
    }

    public static final class InternalHandler extends android.os.Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final java.util.HashMap<java.lang.String, androidx.media3.exoplayer.offline.DownloadManager.Task> activeTasks;
        private final androidx.media3.exoplayer.offline.WritableDownloadIndex downloadIndex;
        private final androidx.media3.exoplayer.offline.DownloaderFactory downloaderFactory;
        private final java.util.ArrayList<androidx.media3.exoplayer.offline.Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final android.os.Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final android.os.HandlerThread thread;

        public InternalHandler(android.os.HandlerThread handlerThread, androidx.media3.exoplayer.offline.WritableDownloadIndex writableDownloadIndex, androidx.media3.exoplayer.offline.DownloaderFactory downloaderFactory, android.os.Handler handler, int i3, int i9, boolean z6) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i3;
            this.minRetryCount = i9;
            this.downloadsPaused = z6;
            this.downloads = new java.util.ArrayList<>();
            this.activeTasks = new java.util.HashMap<>();
        }

        private void addDownload(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i3) {
            androidx.media3.exoplayer.offline.Download download = getDownload(downloadRequest.id, true);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (download != null) {
                putDownload(androidx.media3.exoplayer.offline.DownloadManager.mergeRequest(download, downloadRequest, i3, jCurrentTimeMillis));
            } else {
                putDownload(new androidx.media3.exoplayer.offline.Download(downloadRequest, i3 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i3, 0));
            }
            syncTasks();
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareStartTimes(androidx.media3.exoplayer.offline.Download download, androidx.media3.exoplayer.offline.Download download2) {
            return java.lang.Long.compare(download.startTimeMs, download2.startTimeMs);
        }

        private static androidx.media3.exoplayer.offline.Download copyDownloadWithState(androidx.media3.exoplayer.offline.Download download, int i3, int i9) {
            return new androidx.media3.exoplayer.offline.Download(download.request, i3, download.startTimeMs, java.lang.System.currentTimeMillis(), download.contentLength, i9, 0, download.progress);
        }

        private androidx.media3.exoplayer.offline.Download getDownload(java.lang.String str, boolean z6) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z6) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (java.io.IOException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to load download: " + str, e6);
                return null;
            }
        }

        private int getDownloadIndex(java.lang.String str) {
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                if (this.downloads.get(i3).request.id.equals(str)) {
                    return i3;
                }
            }
            return -1;
        }

        private void initialize(int i3) {
            this.notMetRequirements = i3;
            androidx.media3.exoplayer.offline.DownloadCursor downloads = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloads = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.downloads.add(downloads.getDownload());
                    }
                } catch (java.io.IOException e6) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to load index.", e6);
                    this.downloads.clear();
                }
                androidx.media3.common.util.Util.closeQuietly(downloads);
                this.mainHandler.obtainMessage(1, new java.util.ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } catch (java.lang.Throwable th) {
                androidx.media3.common.util.Util.closeQuietly(downloads);
                throw th;
            }
        }

        private void onContentLengthChanged(androidx.media3.exoplayer.offline.DownloadManager.Task task, long j) {
            androidx.media3.exoplayer.offline.Download download = getDownload(task.request.id, false);
            download.getClass();
            if (j == download.contentLength || j == -1) {
                return;
            }
            putDownload(new androidx.media3.exoplayer.offline.Download(download.request, download.state, download.startTimeMs, java.lang.System.currentTimeMillis(), j, download.stopReason, download.failureReason, download.progress));
        }

        private void onDownloadTaskStopped(androidx.media3.exoplayer.offline.Download download, java.lang.Exception exc) {
            androidx.media3.exoplayer.offline.Download download2 = new androidx.media3.exoplayer.offline.Download(download.request, exc == null ? 3 : 4, download.startTimeMs, java.lang.System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (java.io.IOException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e6);
            }
            this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(download2, false, new java.util.ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(androidx.media3.exoplayer.offline.Download download) {
            if (download.state == 7) {
                int i3 = download.stopReason;
                putDownloadWithState(download, i3 == 0 ? 0 : 1, i3);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.id));
                try {
                    this.downloadIndex.removeDownload(download.request.id);
                } catch (java.io.IOException unused) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(download, true, new java.util.ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        private void onTaskStopped(androidx.media3.exoplayer.offline.DownloadManager.Task task) {
            java.lang.String str = task.request.id;
            this.activeTasks.remove(str);
            boolean z6 = task.isRemove;
            if (z6) {
                this.hasActiveRemoveTask = false;
            } else {
                int i3 = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i3;
                if (i3 == 0) {
                    removeMessages(12);
                }
            }
            if (task.isCanceled) {
                syncTasks();
                return;
            }
            java.lang.Exception exc = task.finalException;
            if (exc != null) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Task failed: " + task.request + ", " + z6, exc);
            }
            androidx.media3.exoplayer.offline.Download download = getDownload(str, false);
            download.getClass();
            int i9 = download.state;
            if (i9 == 2) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!z6);
                onDownloadTaskStopped(download, exc);
            } else {
                if (i9 != 5 && i9 != 7) {
                    throw new java.lang.IllegalStateException();
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z6);
                onRemoveTaskStopped(download);
            }
            syncTasks();
        }

        private androidx.media3.exoplayer.offline.Download putDownload(androidx.media3.exoplayer.offline.Download download) {
            int i3 = download.state;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((i3 == 3 || i3 == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                java.util.Collections.sort(this.downloads, new androidx.media3.exoplayer.offline.d());
            } else {
                boolean z6 = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z6) {
                    java.util.Collections.sort(this.downloads, new androidx.media3.exoplayer.offline.d());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (java.io.IOException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e6);
            }
            this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(download, false, new java.util.ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private androidx.media3.exoplayer.offline.Download putDownloadWithState(androidx.media3.exoplayer.offline.Download download, int i3, int i9) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((i3 == 3 || i3 == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i3, i9));
        }

        private void release() {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (java.io.IOException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e6);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void removeAllDownloads() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                androidx.media3.exoplayer.offline.DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } catch (java.lang.Throwable th) {
                        if (downloads != null) {
                            try {
                                downloads.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                downloads.close();
            } catch (java.io.IOException unused) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                java.util.ArrayList<androidx.media3.exoplayer.offline.Download> arrayList2 = this.downloads;
                arrayList2.set(i3, copyDownloadWithState(arrayList2.get(i3), 5, 0));
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                this.downloads.add(copyDownloadWithState((androidx.media3.exoplayer.offline.Download) arrayList.get(i9), 5, 0));
            }
            java.util.Collections.sort(this.downloads, new androidx.media3.exoplayer.offline.d());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (java.io.IOException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e6);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(this.downloads);
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(this.downloads.get(i10), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        private void removeDownload(java.lang.String str) {
            androidx.media3.exoplayer.offline.Download download = getDownload(str, true);
            if (download != null) {
                putDownloadWithState(download, 5, 0);
                syncTasks();
            } else {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
            }
        }

        private void setDownloadsPaused(boolean z6) {
            this.downloadsPaused = z6;
            syncTasks();
        }

        private void setMaxParallelDownloads(int i3) {
            this.maxParallelDownloads = i3;
            syncTasks();
        }

        private void setMinRetryCount(int i3) {
            this.minRetryCount = i3;
        }

        private void setNotMetRequirements(int i3) {
            this.notMetRequirements = i3;
            syncTasks();
        }

        private void setStopReason(java.lang.String str, int i3) {
            if (str == null) {
                for (int i9 = 0; i9 < this.downloads.size(); i9++) {
                    setStopReason(this.downloads.get(i9), i3);
                }
                try {
                    this.downloadIndex.setStopReason(i3);
                } catch (java.io.IOException e6) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to set manual stop reason", e6);
                }
            } else {
                androidx.media3.exoplayer.offline.Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i3);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i3);
                    } catch (java.io.IOException e9) {
                        androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to set manual stop reason: ".concat(str), e9);
                    }
                }
            }
            syncTasks();
        }

        private void syncDownloadingDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task, androidx.media3.exoplayer.offline.Download download, int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!task.isRemove);
            if (!canDownloadsRun() || i3 >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        private androidx.media3.exoplayer.offline.DownloadManager.Task syncQueuedDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task, androidx.media3.exoplayer.offline.Download download) {
            if (task != null) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!task.isRemove);
                task.cancel(false);
                return task;
            }
            if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                return null;
            }
            androidx.media3.exoplayer.offline.Download downloadPutDownloadWithState = putDownloadWithState(download, 2, 0);
            androidx.media3.exoplayer.offline.DownloadManager.Task task2 = new androidx.media3.exoplayer.offline.DownloadManager.Task(downloadPutDownloadWithState.request, this.downloaderFactory.createDownloader(downloadPutDownloadWithState.request), downloadPutDownloadWithState.progress, false, this.minRetryCount, this);
            this.activeTasks.put(downloadPutDownloadWithState.request.id, task2);
            int i3 = this.activeDownloadTaskCount;
            this.activeDownloadTaskCount = i3 + 1;
            if (i3 == 0) {
                sendEmptyMessageDelayed(12, 5000L);
            }
            task2.start();
            return task2;
        }

        private void syncRemovingDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task, androidx.media3.exoplayer.offline.Download download) {
            if (task != null) {
                if (task.isRemove) {
                    return;
                }
                task.cancel(false);
            } else {
                if (this.hasActiveRemoveTask) {
                    return;
                }
                androidx.media3.exoplayer.offline.DownloadManager.Task task2 = new androidx.media3.exoplayer.offline.DownloadManager.Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.id, task2);
                this.hasActiveRemoveTask = true;
                task2.start();
            }
        }

        private void syncStoppedDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task) {
            if (task != null) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!task.isRemove);
                task.cancel(false);
            }
        }

        private void syncTasks() {
            int i3 = 0;
            for (int i9 = 0; i9 < this.downloads.size(); i9++) {
                androidx.media3.exoplayer.offline.Download download = this.downloads.get(i9);
                androidx.media3.exoplayer.offline.DownloadManager.Task taskSyncQueuedDownload = this.activeTasks.get(download.request.id);
                int i10 = download.state;
                if (i10 == 0) {
                    taskSyncQueuedDownload = syncQueuedDownload(taskSyncQueuedDownload, download);
                } else if (i10 == 1) {
                    syncStoppedDownload(taskSyncQueuedDownload);
                } else if (i10 == 2) {
                    taskSyncQueuedDownload.getClass();
                    syncDownloadingDownload(taskSyncQueuedDownload, download, i3);
                } else {
                    if (i10 != 5 && i10 != 7) {
                        throw new java.lang.IllegalStateException();
                    }
                    syncRemovingDownload(taskSyncQueuedDownload, download);
                }
                if (taskSyncQueuedDownload != null && !taskSyncQueuedDownload.isRemove) {
                    i3++;
                }
            }
        }

        private void updateProgress() {
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                androidx.media3.exoplayer.offline.Download download = this.downloads.get(i3);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (java.io.IOException e6) {
                        androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e6);
                    }
                }
            }
            sendEmptyMessageDelayed(12, 5000L);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i3 = 0;
            switch (message.what) {
                case 1:
                    initialize(message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 2:
                    setDownloadsPaused(message.arg1 != 0);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 3:
                    setNotMetRequirements(message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 4:
                    setStopReason((java.lang.String) message.obj, message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 5:
                    setMaxParallelDownloads(message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 6:
                    setMinRetryCount(message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 7:
                    addDownload((androidx.media3.exoplayer.offline.DownloadRequest) message.obj, message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 8:
                    removeDownload((java.lang.String) message.obj);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 9:
                    removeAllDownloads();
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 10:
                    onTaskStopped((androidx.media3.exoplayer.offline.DownloadManager.Task) message.obj);
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 11:
                    onContentLengthChanged((androidx.media3.exoplayer.offline.DownloadManager.Task) message.obj, androidx.media3.common.util.Util.toLong(message.arg1, message.arg2));
                    return;
                case 12:
                    updateProgress();
                    return;
                case 13:
                    release();
                    return;
                default:
                    throw new java.lang.IllegalStateException();
            }
        }

        private void setStopReason(androidx.media3.exoplayer.offline.Download download, int i3) {
            if (i3 == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i3 != download.stopReason) {
                int i9 = download.state;
                if (i9 == 0 || i9 == 2) {
                    i9 = 1;
                }
                putDownload(new androidx.media3.exoplayer.offline.Download(download.request, i9, download.startTimeMs, java.lang.System.currentTimeMillis(), download.contentLength, i3, 0, download.progress));
            }
        }
    }
}
