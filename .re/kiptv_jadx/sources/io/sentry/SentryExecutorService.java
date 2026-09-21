package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryExecutorService implements io.sentry.ISentryExecutorService {
    private final java.util.concurrent.ScheduledExecutorService executorService;
    private final io.sentry.util.AutoClosableReentrantLock lock;

    public static final class SentryExecutorServiceThreadFactory implements java.util.concurrent.ThreadFactory {
        private int cnt;

        private SentryExecutorServiceThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryExecutorServiceThreadFactory-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            java.lang.Thread thread = new java.lang.Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public SentryExecutorService(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.lock = new io.sentry.util.AutoClosableReentrantLock();
        this.executorService = scheduledExecutorService;
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.executorService.isShutdown()) {
                this.executorService.shutdown();
                try {
                    if (!this.executorService.awaitTermination(j, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        this.executorService.shutdownNow();
                    }
                } catch (java.lang.InterruptedException unused) {
                    this.executorService.shutdownNow();
                    java.lang.Thread.currentThread().interrupt();
                }
            }
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

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            boolean zIsShutdown = this.executorService.isShutdown();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return zIsShutdown;
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

    @Override // io.sentry.ISentryExecutorService
    public java.util.concurrent.Future<?> schedule(java.lang.Runnable runnable, long j) {
        return this.executorService.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.ISentryExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        return this.executorService.submit(runnable);
    }

    @Override // io.sentry.ISentryExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        return this.executorService.submit(callable);
    }

    public SentryExecutorService() {
        this(java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new io.sentry.SentryExecutorService.SentryExecutorServiceThreadFactory()));
    }
}
