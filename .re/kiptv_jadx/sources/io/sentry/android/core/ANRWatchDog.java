package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class ANRWatchDog extends java.lang.Thread {
    private final io.sentry.android.core.ANRWatchDog.ANRListener anrListener;
    private final android.content.Context context;
    private volatile long lastKnownActiveUiTimestampMs;
    private final io.sentry.ILogger logger;
    private long pollingIntervalMs;
    private final boolean reportInDebug;
    private final java.util.concurrent.atomic.AtomicBoolean reported;
    private final java.lang.Runnable ticker;
    private final io.sentry.transport.ICurrentDateProvider timeProvider;
    private final long timeoutIntervalMillis;
    private final io.sentry.android.core.MainLooperHandler uiHandler;

    public interface ANRListener {
        void onAppNotResponding(io.sentry.android.core.ApplicationNotResponding applicationNotResponding);
    }

    public ANRWatchDog(long j, boolean z6, io.sentry.android.core.ANRWatchDog.ANRListener aNRListener, io.sentry.ILogger iLogger, android.content.Context context) {
        this(new io.sentry.android.core.a(0), j, 500L, z6, aNRListener, iLogger, new io.sentry.android.core.MainLooperHandler(), context);
    }

    private boolean isProcessNotResponding() {
        java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) this.context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (java.lang.Throwable th) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        java.util.Iterator<android.app.ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(io.sentry.transport.ICurrentDateProvider iCurrentDateProvider) {
        this.lastKnownActiveUiTimestampMs = iCurrentDateProvider.getCurrentTimeMillis();
        this.reported.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.ticker.run();
        while (!isInterrupted()) {
            this.uiHandler.post(this.ticker);
            try {
                java.lang.Thread.sleep(this.pollingIntervalMs);
                if (this.timeProvider.getCurrentTimeMillis() - this.lastKnownActiveUiTimestampMs > this.timeoutIntervalMillis) {
                    if (!this.reportInDebug && (android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger())) {
                        this.logger.log(io.sentry.SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new java.lang.Object[0]);
                        this.reported.set(true);
                    } else if (isProcessNotResponding() && this.reported.compareAndSet(false, true)) {
                        this.anrListener.onAppNotResponding(new io.sentry.android.core.ApplicationNotResponding(Y6.f.g(this.timeoutIntervalMillis, " ms.", new java.lang.StringBuilder("Application Not Responding for at least ")), this.uiHandler.getThread()));
                    }
                }
            } catch (java.lang.InterruptedException e6) {
                try {
                    java.lang.Thread.currentThread().interrupt();
                    this.logger.log(io.sentry.SentryLevel.WARNING, "Interrupted: %s", e6.getMessage());
                    return;
                } catch (java.lang.SecurityException unused) {
                    this.logger.log(io.sentry.SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e6.getMessage());
                    return;
                }
            }
        }
    }

    public ANRWatchDog(io.sentry.transport.ICurrentDateProvider iCurrentDateProvider, long j, long j9, boolean z6, io.sentry.android.core.ANRWatchDog.ANRListener aNRListener, io.sentry.ILogger iLogger, io.sentry.android.core.MainLooperHandler mainLooperHandler, android.content.Context context) {
        super("|ANR-WatchDog|");
        this.lastKnownActiveUiTimestampMs = 0L;
        this.reported = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.timeProvider = iCurrentDateProvider;
        this.timeoutIntervalMillis = j;
        this.pollingIntervalMs = j9;
        this.reportInDebug = z6;
        this.anrListener = aNRListener;
        this.logger = iLogger;
        this.uiHandler = mainLooperHandler;
        this.context = context;
        this.ticker = new io.sentry.android.core.b(this, iCurrentDateProvider, 0);
        if (j < j9 * 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", java.lang.Long.valueOf(this.pollingIntervalMs * 2)));
        }
    }
}
