package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;

public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final LoadErrorAction DONT_RETRY;
    public static final LoadErrorAction DONT_RETRY_FATAL;
    public static final LoadErrorAction RETRY;
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT;
    private static final String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private LoadTask<? extends Loadable> currentTask;
    private final ReleasableExecutor downloadExecutor;
    private IOException fatalError;

    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t9, long j, long j9, boolean z6);

        void onLoadCompleted(T t9, long j, long j9);

        LoadErrorAction onLoadError(T t9, long j, long j9, IOException iOException, int i3);

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

    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_FINISH = 2;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 1;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(Looper looper, T t9, Callback<T> callback, int i3, long j) {
            super(looper);
            this.loadable = t9;
            this.callback = callback;
            this.defaultMinRetryCount = i3;
            this.startTimeMs = j;
        }

        private void execute() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.startTimeMs;
            Callback<T> callback = this.callback;
            callback.getClass();
            callback.onLoadStarted(this.loadable, jElapsedRealtime, j, this.errorCount);
            this.currentError = null;
            ReleasableExecutor releasableExecutor = Loader.this.downloadExecutor;
            LoadTask loadTask = Loader.this.currentTask;
            loadTask.getClass();
            releasableExecutor.execute(loadTask);
        }

        private void finish() {
            Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, 5000);
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
                        Thread thread = this.executorThread;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z6) {
                finish();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Callback<T> callback = this.callback;
                callback.getClass();
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, jElapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override
        public void handleMessage(Message message) {
            if (this.released) {
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                execute();
                return;
            }
            if (i3 == 4) {
                throw ((Error) message.obj);
            }
            finish();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.startTimeMs;
            Callback<T> callback = this.callback;
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
                } catch (RuntimeException e6) {
                    Log.e(TAG, "Unexpected exception handling load completed", e6);
                    Loader.this.fatalError = new UnexpectedLoaderException(e6);
                    return;
                }
            }
            if (i9 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.currentError = iOException;
            int i10 = this.errorCount + 1;
            this.errorCount = i10;
            LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.loadable, jElapsedRealtime, j, iOException, i10);
            if (loadErrorActionOnLoadError.type == 3) {
                Loader.this.fatalError = this.currentError;
            } else if (loadErrorActionOnLoadError.type != 2) {
                if (loadErrorActionOnLoadError.type == 1) {
                    this.errorCount = 1;
                }
                start(loadErrorActionOnLoadError.retryDelayMillis != C.TIME_UNSET ? loadErrorActionOnLoadError.retryDelayMillis : getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i3) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i3) {
                throw iOException;
            }
        }

        @Override
        public void run() {
            boolean z6;
            try {
                synchronized (this) {
                    z6 = this.canceled;
                    this.executorThread = Thread.currentThread();
                }
                if (!z6) {
                    TraceUtil.beginSection("load:".concat(this.loadable.getClass().getSimpleName()));
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th) {
                        TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e6) {
                if (this.released) {
                    return;
                }
                obtainMessage(3, e6).sendToTarget();
            } catch (Exception e9) {
                if (this.released) {
                    return;
                }
                Log.e(TAG, "Unexpected exception loading stream", e9);
                obtainMessage(3, new UnexpectedLoaderException(e9)).sendToTarget();
            } catch (OutOfMemoryError e10) {
                if (this.released) {
                    return;
                }
                Log.e(TAG, "OutOfMemory error loading stream", e10);
                obtainMessage(3, new UnexpectedLoaderException(e10)).sendToTarget();
            } catch (Error e11) {
                if (!this.released) {
                    Log.e(TAG, "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            }
        }

        public void start(long j) {
            AbstractC1864o0.Y(Loader.this.currentTask == null);
            Loader.this.currentTask = this;
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

    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override
        public void run() {
            this.callback.onLoaderReleased();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
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
        long j = C.TIME_UNSET;
        RETRY = createRetryAction(false, C.TIME_UNSET);
        RETRY_RESET_ERROR_COUNT = createRetryAction(true, C.TIME_UNSET);
        DONT_RETRY = new LoadErrorAction(2, j);
        DONT_RETRY_FATAL = new LoadErrorAction(3, j);
    }

    public Loader(String str) {
        this(ReleasableExecutor.from(Util.newSingleThreadExecutor(THREAD_NAME_PREFIX + str), new b()));
    }

    public static LoadErrorAction createRetryAction(boolean z6, long j) {
        return new LoadErrorAction(z6 ? 1 : 0, j);
    }

    public void cancelLoading() {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
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

    @Override
    public void maybeThrowError() {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends Loadable> long startLoading(T t9, Callback<T> callback, int i3) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.fatalError = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(looperMyLooper, t9, callback, i3, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override
    public void maybeThrowError(int i3) {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i3);
        }
    }

    public void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutor.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutor.release();
    }

    public Loader(ReleasableExecutor releasableExecutor) {
        this.downloadExecutor = releasableExecutor;
    }
}
