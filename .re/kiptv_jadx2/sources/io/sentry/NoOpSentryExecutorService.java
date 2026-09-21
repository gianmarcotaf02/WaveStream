package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class NoOpSentryExecutorService implements ISentryExecutorService {
    private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

    private NoOpSentryExecutorService() {
    }

    public static ISentryExecutorService getInstance() {
        return instance;
    }

    public static Object lambda$schedule$2() {
        return null;
    }

    public static Object lambda$submit$0() {
        return null;
    }

    public static Object lambda$submit$1() {
        return null;
    }

    @Override
    public void close(long j) {
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public Future<?> schedule(Runnable runnable, long j) {
        return new FutureTask(new d(1));
    }

    @Override
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new d(3));
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return new FutureTask(new d(2));
    }
}
