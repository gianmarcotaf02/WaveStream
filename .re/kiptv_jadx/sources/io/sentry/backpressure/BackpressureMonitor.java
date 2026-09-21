package io.sentry.backpressure;

/* JADX INFO: loaded from: classes4.dex */
public final class BackpressureMonitor implements io.sentry.backpressure.IBackpressureMonitor, java.lang.Runnable {
    private static final int CHECK_INTERVAL_IN_MS = 10000;
    private static final int INITIAL_CHECK_DELAY_IN_MS = 500;
    static final int MAX_DOWNSAMPLE_FACTOR = 10;
    private int downsampleFactor = 0;
    private volatile java.util.concurrent.Future<?> latestScheduledRun = null;
    private final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();
    private final io.sentry.IScopes scopes;
    private final io.sentry.SentryOptions sentryOptions;

    public BackpressureMonitor(io.sentry.SentryOptions sentryOptions, io.sentry.IScopes iScopes) {
        this.sentryOptions = sentryOptions;
        this.scopes = iScopes;
    }

    private boolean isHealthy() {
        return this.scopes.isHealthy();
    }

    private void reschedule(int i3) {
        io.sentry.ISentryExecutorService executorService = this.sentryOptions.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.latestScheduledRun = executorService.schedule(this, i3);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void checkHealth() {
        if (isHealthy()) {
            if (this.downsampleFactor > 0) {
                this.sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.", new java.lang.Object[0]);
            }
            this.downsampleFactor = 0;
        } else {
            int i3 = this.downsampleFactor;
            if (i3 < 10) {
                this.downsampleFactor = i3 + 1;
                this.sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", java.lang.Integer.valueOf(this.downsampleFactor));
            }
        }
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void close() {
        java.util.concurrent.Future<?> future = this.latestScheduledRun;
        if (future != null) {
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                future.cancel(true);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (java.lang.Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public int getDownsampleFactor() {
        return this.downsampleFactor;
    }

    @Override // java.lang.Runnable
    public void run() {
        checkHealth();
        reschedule(10000);
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void start() {
        reschedule(500);
    }
}
