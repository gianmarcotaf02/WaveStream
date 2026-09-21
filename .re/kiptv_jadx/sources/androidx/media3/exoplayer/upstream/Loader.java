package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class Loader implements androidx.media3.exoplayer.upstream.LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction DONT_RETRY;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction DONT_RETRY_FATAL;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction RETRY;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction RETRY_RESET_ERROR_COUNT;
    private static final java.lang.String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> currentTask;
    private final androidx.media3.exoplayer.util.ReleasableExecutor downloadExecutor;
    private java.io.IOException fatalError;

    public interface Callback<T extends androidx.media3.exoplayer.upstream.Loader.Loadable> {
        void onLoadCanceled(T t9, long j, long j9, boolean z6);

        void onLoadCompleted(T t9, long j, long j9);

        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(T t9, long j, long j9, java.io.IOException iOException, int i3);

        default void onLoadStarted(T t9, long j, long j9, int i3) {
        }
    }

    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        public boolean isRetry() {
            int i3 = this.type;
            return i3 == 0 || i3 == 1;
        }

        private LoadErrorAction(int i3, long j) {
            this.type = i3;
            this.retryDelayMillis = j;
        }
    }

    public final class LoadTask<T extends androidx.media3.exoplayer.upstream.Loader.Loadable> extends android.os.Handler implements java.lang.Runnable {
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_FINISH = 2;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 1;
        private static final java.lang.String TAG = "LoadTask";
        private androidx.media3.exoplayer.upstream.Loader.Callback<T> callback;
        private boolean canceled;
        private java.io.IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private java.lang.Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(android.os.Looper looper, T t9, androidx.media3.exoplayer.upstream.Loader.Callback<T> callback, int i3, long j) {
            super(looper);
            this.loadable = t9;
            this.callback = callback;
            this.defaultMinRetryCount = i3;
            this.startTimeMs = j;
        }

        private void execute() {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.startTimeMs;
            androidx.media3.exoplayer.upstream.Loader.Callback<T> callback = this.callback;
            callback.getClass();
            callback.onLoadStarted(this.loadable, jElapsedRealtime, j, this.errorCount);
            this.currentError = null;
            androidx.media3.exoplayer.util.ReleasableExecutor releasableExecutor = androidx.media3.exoplayer.upstream.Loader.this.downloadExecutor;
            androidx.media3.exoplayer.upstream.Loader.LoadTask loadTask = androidx.media3.exoplayer.upstream.Loader.this.currentTask;
            loadTask.getClass();
            releasableExecutor.execute(loadTask);
        }

        private void finish() {
            androidx.media3.exoplayer.upstream.Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return java.lang.Math.min((this.errorCount - 1) * 1000, 5000);
        }

        public void cancel(boolean z6) {
            this.released = z6;
            this.currentError = null;
            if (hasMessages(1)) {
                this.canceled = true;
                removeMessages(1);
                if (!z6) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.canceled = true;
                        this.loadable.cancelLoad();
                        java.lang.Thread thread = this.executorThread;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            if (z6) {
                finish();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                androidx.media3.exoplayer.upstream.Loader.Callback<T> callback = this.callback;
                callback.getClass();
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, jElapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (this.released) {
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                execute();
                return;
            }
            if (i3 == 4) {
                throw ((java.lang.Error) message.obj);
            }
            finish();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.startTimeMs;
            androidx.media3.exoplayer.upstream.Loader.Callback<T> callback = this.callback;
            callback.getClass();
            if (this.canceled) {
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, j, false);
                return;
            }
            int i9 = message.what;
            if (i9 == 2) {
                try {
                    callback.onLoadCompleted(this.loadable, jElapsedRealtime, j);
                    return;
                } catch (java.lang.RuntimeException e6) {
                    androidx.media3.common.util.Log.e(TAG, "Unexpected exception handling load completed", e6);
                    androidx.media3.exoplayer.upstream.Loader.this.fatalError = new androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException(e6);
                    return;
                }
            }
            if (i9 != 3) {
                return;
            }
            java.io.IOException iOException = (java.io.IOException) message.obj;
            this.currentError = iOException;
            int i10 = this.errorCount + 1;
            this.errorCount = i10;
            androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.loadable, jElapsedRealtime, j, iOException, i10);
            if (loadErrorActionOnLoadError.type == 3) {
                androidx.media3.exoplayer.upstream.Loader.this.fatalError = this.currentError;
            } else if (loadErrorActionOnLoadError.type != 2) {
                if (loadErrorActionOnLoadError.type == 1) {
                    this.errorCount = 1;
                }
                start(loadErrorActionOnLoadError.retryDelayMillis != androidx.media3.common.C.TIME_UNSET ? loadErrorActionOnLoadError.retryDelayMillis : getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i3) throws java.io.IOException {
            java.io.IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i3) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            try {
                synchronized (this) {
                    z6 = this.canceled;
                    this.executorThread = java.lang.Thread.currentThread();
                }
                if (!z6) {
                    androidx.media3.common.util.TraceUtil.beginSection("load:".concat(this.loadable.getClass().getSimpleName()));
                    try {
                        this.loadable.load();
                        androidx.media3.common.util.TraceUtil.endSection();
                    } catch (java.lang.Throwable th) {
                        androidx.media3.common.util.TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    java.lang.Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (java.io.IOException e6) {
                if (this.released) {
                    return;
                }
                obtainMessage(3, e6).sendToTarget();
            } catch (java.lang.Exception e9) {
                if (this.released) {
                    return;
                }
                androidx.media3.common.util.Log.e(TAG, "Unexpected exception loading stream", e9);
                obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException(e9)).sendToTarget();
            } catch (java.lang.OutOfMemoryError e10) {
                if (this.released) {
                    return;
                }
                androidx.media3.common.util.Log.e(TAG, "OutOfMemory error loading stream", e10);
                obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException(e10)).sendToTarget();
            } catch (java.lang.Error e11) {
                if (!this.released) {
                    androidx.media3.common.util.Log.e(TAG, "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            }
        }

        public void start(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(androidx.media3.exoplayer.upstream.Loader.this.currentTask == null);
            androidx.media3.exoplayer.upstream.Loader.this.currentTask = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                execute();
            }
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load();
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class ReleaseTask implements java.lang.Runnable {
        private final androidx.media3.exoplayer.upstream.Loader.ReleaseCallback callback;

        public ReleaseTask(androidx.media3.exoplayer.upstream.Loader.ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }

    public static final class UnexpectedLoaderException extends java.io.IOException {
        public UnexpectedLoaderException(java.lang.Throwable th) {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    static {
        long j = androidx.media3.common.C.TIME_UNSET;
        RETRY = createRetryAction(false, androidx.media3.common.C.TIME_UNSET);
        RETRY_RESET_ERROR_COUNT = createRetryAction(true, androidx.media3.common.C.TIME_UNSET);
        DONT_RETRY = new androidx.media3.exoplayer.upstream.Loader.LoadErrorAction(2, j);
        DONT_RETRY_FATAL = new androidx.media3.exoplayer.upstream.Loader.LoadErrorAction(3, j);
    }

    public Loader(java.lang.String str) {
        this(androidx.media3.exoplayer.util.ReleasableExecutor.from(androidx.media3.common.util.Util.newSingleThreadExecutor(THREAD_NAME_PREFIX + str), new androidx.media3.exoplayer.upstream.b()));
    }

    public static androidx.media3.exoplayer.upstream.Loader.LoadErrorAction createRetryAction(boolean z6, long j) {
        return new androidx.media3.exoplayer.upstream.Loader.LoadErrorAction(z6 ? 1 : 0, j);
    }

    public void cancelLoading() {
        androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> loadTask = this.currentTask;
        loadTask.getClass();
        loadTask.cancel(false);
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void maybeThrowError() {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends androidx.media3.exoplayer.upstream.Loader.Loadable> long startLoading(T t9, androidx.media3.exoplayer.upstream.Loader.Callback<T> callback, int i3) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        looperMyLooper.getClass();
        this.fatalError = null;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new androidx.media3.exoplayer.upstream.Loader.LoadTask(looperMyLooper, t9, callback, i3, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void maybeThrowError(int i3) {
        java.io.IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i3);
        }
    }

    public void release(androidx.media3.exoplayer.upstream.Loader.ReleaseCallback releaseCallback) {
        androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutor.execute(new androidx.media3.exoplayer.upstream.Loader.ReleaseTask(releaseCallback));
        }
        this.downloadExecutor.release();
    }

    public Loader(androidx.media3.exoplayer.util.ReleasableExecutor releasableExecutor) {
        this.downloadExecutor = releasableExecutor;
    }
}
