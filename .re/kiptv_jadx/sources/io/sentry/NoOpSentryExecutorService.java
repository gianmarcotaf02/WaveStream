package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class NoOpSentryExecutorService implements io.sentry.ISentryExecutorService {
    private static final io.sentry.NoOpSentryExecutorService instance = new io.sentry.NoOpSentryExecutorService();

    private NoOpSentryExecutorService() {
    }

    public static io.sentry.ISentryExecutorService getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$schedule$2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$submit$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$submit$1() {
        return null;
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j) {
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.ISentryExecutorService
    public java.util.concurrent.Future<?> schedule(java.lang.Runnable runnable, long j) {
        return new java.util.concurrent.FutureTask(new io.sentry.d(1));
    }

    @Override // io.sentry.ISentryExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        return new java.util.concurrent.FutureTask(new io.sentry.d(3));
    }

    @Override // io.sentry.ISentryExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        return new java.util.concurrent.FutureTask(new io.sentry.d(2));
    }
}
