package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
final class QueuedThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor implements java.lang.AutoCloseable {
    private static final long RECENT_THRESHOLD = io.sentry.DateUtils.millisToNanos(2000);
    private final io.sentry.SentryDateProvider dateProvider;
    private io.sentry.SentryDate lastRejectTimestamp;
    private final io.sentry.ILogger logger;
    private final int maxQueueSize;
    private final io.sentry.transport.ReusableCountLatch unfinishedTasksCount;

    public static final class CancelledFuture<T> implements java.util.concurrent.Future<T> {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new java.util.concurrent.CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, java.util.concurrent.TimeUnit timeUnit) {
            throw new java.util.concurrent.CancellationException();
        }
    }

    public QueuedThreadPoolExecutor(int i3, int i9, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler, io.sentry.ILogger iLogger, io.sentry.SentryDateProvider sentryDateProvider) {
        super(i3, i3, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.lastRejectTimestamp = null;
        this.unfinishedTasksCount = new io.sentry.transport.ReusableCountLatch();
        this.maxQueueSize = i9;
        this.logger = iLogger;
        this.dateProvider = sentryDateProvider;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.unfinishedTasksCount.decrement();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == java.util.concurrent.ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z6) {
                    shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public boolean didRejectRecently() {
        io.sentry.SentryDate sentryDate = this.lastRejectTimestamp;
        return sentryDate != null && this.dateProvider.now().diff(sentryDate) < RECENT_THRESHOLD;
    }

    public boolean isSchedulingAllowed() {
        return this.unfinishedTasksCount.getCount() < this.maxQueueSize;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        if (isSchedulingAllowed()) {
            this.unfinishedTasksCount.increment();
            return super.submit(runnable);
        }
        this.lastRejectTimestamp = this.dateProvider.now();
        this.logger.log(io.sentry.SentryLevel.WARNING, "Submit cancelled", new java.lang.Object[0]);
        return new io.sentry.transport.QueuedThreadPoolExecutor.CancelledFuture();
    }

    public void waitTillIdle(long j) {
        try {
            this.unfinishedTasksCount.waitTillZero(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e6) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Failed to wait till idle", e6);
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
