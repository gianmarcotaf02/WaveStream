package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
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
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z6, List<Download> list, Exception exc) {
            this.download = download;
            this.isRemove = z6;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    public interface Listener {
        default void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z6) {
        }

        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i3) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z6) {
        }
    }

    public static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;
        private Exception finalException;
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        private static int getRetryDelayMillis(int i3) {
            return Math.min((i3 - 1) * 1000, 5000);
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

        @Override
        public void onProgress(long j, long j9, float f9) {
            this.downloadProgress.bytesDownloaded = j9;
            this.downloadProgress.percentDownloaded = f9;
            if (j != this.contentLength) {
                this.contentLength = j;
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        @Override
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
                        } catch (IOException e6) {
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
                                Thread.sleep(getRetryDelayMillis(i3));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e9) {
                this.finalException = e9;
            }
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(10, this).sendToTarget();
            }
        }

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z6, int i3, InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z6;
            this.minRetryCount = i3;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    public boolean handleMainMessage(Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            onInitialized((List) message.obj);
        } else if (i3 == 2) {
            onMessageProcessed(message.arg1, message.arg2);
        } else {
            if (i3 != 3) {
                throw new IllegalStateException();
            }
            onDownloadUpdate((DownloadUpdate) message.obj);
        }
        return true;
    }

    public static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i3, long j) {
        int i9 = download.state;
        long j9 = (i9 == 5 || download.isTerminalState()) ? j : download.startTimeMs;
        int i10 = 7;
        if (i9 != 5 && i9 != 7) {
            i10 = i3 != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i10, j9, j, -1L, i3, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(DownloadUpdate downloadUpdate) {
        this.downloads = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
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
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i3) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i3) {
            this.notMetRequirements = i3;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(3, i3, 0).sendToTarget();
        }
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
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
        Iterator<Listener> it = this.listeners.iterator();
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

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(Listener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public DownloadIndex getDownloadIndex() {
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

    public Requirements getRequirements() {
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
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler.released) {
                    return;
                }
                internalHandler.sendEmptyMessage(13);
                boolean z6 = false;
                while (true) {
                    InternalHandler internalHandler2 = this.internalHandler;
                    if (internalHandler2.released) {
                        break;
                    }
                    try {
                        internalHandler2.wait();
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                }
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.requirementsWatcher.stop();
                this.downloads = Collections.EMPTY_LIST;
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(9).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(int i3) {
        AbstractC1864o0.L(i3 > 0);
        if (this.maxParallelDownloads == i3) {
            return;
        }
        this.maxParallelDownloads = i3;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i3, 0).sendToTarget();
    }

    public void setMinRetryCount(int i3) {
        AbstractC1864o0.L(i3 >= 0);
        if (this.minRetryCount == i3) {
            return;
        }
        this.minRetryCount = i3;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i3, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(String str, int i3) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i3, 0, str).sendToTarget();
    }

    public void addDownload(DownloadRequest downloadRequest, int i3) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, i3, 0, downloadRequest).sendToTarget();
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.EMPTY_LIST;
        this.listeners = new CopyOnWriteArraySet<>();
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new c(1, this));
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        a aVar = new a(this);
        this.requirementsListener = aVar;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, aVar, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.notMetRequirements = iStart;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(1, iStart, 0).sendToTarget();
    }

    public static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i3, int i9, boolean z6) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i3;
            this.minRetryCount = i9;
            this.downloadsPaused = z6;
            this.downloads = new ArrayList<>();
            this.activeTasks = new HashMap<>();
        }

        private void addDownload(DownloadRequest downloadRequest, int i3) {
            Download download = getDownload(downloadRequest.id, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (download != null) {
                putDownload(DownloadManager.mergeRequest(download, downloadRequest, i3, jCurrentTimeMillis));
            } else {
                putDownload(new Download(downloadRequest, i3 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i3, 0));
            }
            syncTasks();
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        public static int compareStartTimes(Download download, Download download2) {
            return Long.compare(download.startTimeMs, download2.startTimeMs);
        }

        private static Download copyDownloadWithState(Download download, int i3, int i9) {
            return new Download(download.request, i3, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i9, 0, download.progress);
        }

        private Download getDownload(String str, boolean z6) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z6) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (IOException e6) {
                Log.e(DownloadManager.TAG, "Failed to load download: " + str, e6);
                return null;
            }
        }

        private int getDownloadIndex(String str) {
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                if (this.downloads.get(i3).request.id.equals(str)) {
                    return i3;
                }
            }
            return -1;
        }

        private void initialize(int i3) {
            this.notMetRequirements = i3;
            DownloadCursor downloads = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloads = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.downloads.add(downloads.getDownload());
                    }
                } catch (IOException e6) {
                    Log.e(DownloadManager.TAG, "Failed to load index.", e6);
                    this.downloads.clear();
                }
                Util.closeQuietly(downloads);
                this.mainHandler.obtainMessage(1, new ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } catch (Throwable th) {
                Util.closeQuietly(downloads);
                throw th;
            }
        }

        private void onContentLengthChanged(Task task, long j) {
            Download download = getDownload(task.request.id, false);
            download.getClass();
            if (j == download.contentLength || j == -1) {
                return;
            }
            putDownload(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j, download.stopReason, download.failureReason, download.progress));
        }

        private void onDownloadTaskStopped(Download download, Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (IOException e6) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e6);
            }
            this.mainHandler.obtainMessage(3, new DownloadUpdate(download2, false, new ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(Download download) {
            if (download.state == 7) {
                int i3 = download.stopReason;
                putDownloadWithState(download, i3 == 0 ? 0 : 1, i3);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.id));
                try {
                    this.downloadIndex.removeDownload(download.request.id);
                } catch (IOException unused) {
                    Log.e(DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(3, new DownloadUpdate(download, true, new ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        private void onTaskStopped(Task task) {
            String str = task.request.id;
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
            Exception exc = task.finalException;
            if (exc != null) {
                Log.e(DownloadManager.TAG, "Task failed: " + task.request + ", " + z6, exc);
            }
            Download download = getDownload(str, false);
            download.getClass();
            int i9 = download.state;
            if (i9 == 2) {
                AbstractC1864o0.Y(!z6);
                onDownloadTaskStopped(download, exc);
            } else {
                if (i9 != 5 && i9 != 7) {
                    throw new IllegalStateException();
                }
                AbstractC1864o0.Y(z6);
                onRemoveTaskStopped(download);
            }
            syncTasks();
        }

        private Download putDownload(Download download) {
            int i3 = download.state;
            AbstractC1864o0.Y((i3 == 3 || i3 == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                Collections.sort(this.downloads, new d());
            } else {
                boolean z6 = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z6) {
                    Collections.sort(this.downloads, new d());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (IOException e6) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e6);
            }
            this.mainHandler.obtainMessage(3, new DownloadUpdate(download, false, new ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private Download putDownloadWithState(Download download, int i3, int i9) {
            AbstractC1864o0.Y((i3 == 3 || i3 == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i3, i9));
        }

        private void release() {
            Iterator<Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (IOException e6) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e6);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void removeAllDownloads() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } catch (Throwable th) {
                        if (downloads != null) {
                            try {
                                downloads.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                downloads.close();
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                ArrayList<Download> arrayList2 = this.downloads;
                arrayList2.set(i3, copyDownloadWithState(arrayList2.get(i3), 5, 0));
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                this.downloads.add(copyDownloadWithState((Download) arrayList.get(i9), 5, 0));
            }
            Collections.sort(this.downloads, new d());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (IOException e6) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e6);
            }
            ArrayList arrayList3 = new ArrayList(this.downloads);
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                this.mainHandler.obtainMessage(3, new DownloadUpdate(this.downloads.get(i10), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        private void removeDownload(String str) {
            Download download = getDownload(str, true);
            if (download != null) {
                putDownloadWithState(download, 5, 0);
                syncTasks();
            } else {
                Log.e(DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
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

        private void setStopReason(String str, int i3) {
            if (str == null) {
                for (int i9 = 0; i9 < this.downloads.size(); i9++) {
                    setStopReason(this.downloads.get(i9), i3);
                }
                try {
                    this.downloadIndex.setStopReason(i3);
                } catch (IOException e6) {
                    Log.e(DownloadManager.TAG, "Failed to set manual stop reason", e6);
                }
            } else {
                Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i3);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i3);
                    } catch (IOException e9) {
                        Log.e(DownloadManager.TAG, "Failed to set manual stop reason: ".concat(str), e9);
                    }
                }
            }
            syncTasks();
        }

        private void syncDownloadingDownload(Task task, Download download, int i3) {
            AbstractC1864o0.Y(!task.isRemove);
            if (!canDownloadsRun() || i3 >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        private Task syncQueuedDownload(Task task, Download download) {
            if (task != null) {
                AbstractC1864o0.Y(!task.isRemove);
                task.cancel(false);
                return task;
            }
            if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                return null;
            }
            Download downloadPutDownloadWithState = putDownloadWithState(download, 2, 0);
            Task task2 = new Task(downloadPutDownloadWithState.request, this.downloaderFactory.createDownloader(downloadPutDownloadWithState.request), downloadPutDownloadWithState.progress, false, this.minRetryCount, this);
            this.activeTasks.put(downloadPutDownloadWithState.request.id, task2);
            int i3 = this.activeDownloadTaskCount;
            this.activeDownloadTaskCount = i3 + 1;
            if (i3 == 0) {
                sendEmptyMessageDelayed(12, 5000L);
            }
            task2.start();
            return task2;
        }

        private void syncRemovingDownload(Task task, Download download) {
            if (task != null) {
                if (task.isRemove) {
                    return;
                }
                task.cancel(false);
            } else {
                if (this.hasActiveRemoveTask) {
                    return;
                }
                Task task2 = new Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.id, task2);
                this.hasActiveRemoveTask = true;
                task2.start();
            }
        }

        private void syncStoppedDownload(Task task) {
            if (task != null) {
                AbstractC1864o0.Y(!task.isRemove);
                task.cancel(false);
            }
        }

        private void syncTasks() {
            int i3 = 0;
            for (int i9 = 0; i9 < this.downloads.size(); i9++) {
                Download download = this.downloads.get(i9);
                Task taskSyncQueuedDownload = this.activeTasks.get(download.request.id);
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
                        throw new IllegalStateException();
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
                Download download = this.downloads.get(i3);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (IOException e6) {
                        Log.e(DownloadManager.TAG, "Failed to update index.", e6);
                    }
                }
            }
            sendEmptyMessageDelayed(12, 5000L);
        }

        @Override
        public void handleMessage(Message message) {
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
                    setStopReason((String) message.obj, message.arg1);
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
                    addDownload((DownloadRequest) message.obj, message.arg1);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 8:
                    removeDownload((String) message.obj);
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 9:
                    removeAllDownloads();
                    i3 = 1;
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 10:
                    onTaskStopped((Task) message.obj);
                    this.mainHandler.obtainMessage(2, i3, this.activeTasks.size()).sendToTarget();
                    return;
                case 11:
                    onContentLengthChanged((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 12:
                    updateProgress();
                    return;
                case 13:
                    release();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private void setStopReason(Download download, int i3) {
            if (i3 == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i3 != download.stopReason) {
                int i9 = download.state;
                if (i9 == 0 || i9 == 2) {
                    i9 = 1;
                }
                putDownload(new Download(download.request, i9, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i3, 0, download.progress));
            }
        }
    }
}
