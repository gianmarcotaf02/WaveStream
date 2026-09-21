package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ISentryExecutorService {
    void close(long j);

    boolean isClosed();

    java.util.concurrent.Future<?> schedule(java.lang.Runnable runnable, long j);

    java.util.concurrent.Future<?> submit(java.lang.Runnable runnable);

    <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable);
}
