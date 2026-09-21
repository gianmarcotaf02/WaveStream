package io.sentry.hints;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BlockingFlushHint implements io.sentry.hints.DiskFlushNotification, io.sentry.hints.Flushable {
    private final long flushTimeoutMillis;
    private final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);
    private final io.sentry.ILogger logger;

    public BlockingFlushHint(long j, io.sentry.ILogger iLogger) {
        this.flushTimeoutMillis = j;
        this.logger = iLogger;
    }

    @Override // io.sentry.hints.DiskFlushNotification
    public void markFlushed() {
        this.latch.countDown();
    }

    @Override // io.sentry.hints.Flushable
    public boolean waitFlush() {
        try {
            return this.latch.await(this.flushTimeoutMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e6) {
            java.lang.Thread.currentThread().interrupt();
            this.logger.log(io.sentry.SentryLevel.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e6);
            return false;
        }
    }
}
