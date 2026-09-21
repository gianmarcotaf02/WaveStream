package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

public final class ThreadChecker implements IThreadChecker {
    private static final long mainThreadId = Thread.currentThread().getId();
    private static final ThreadChecker instance = new ThreadChecker();

    private ThreadChecker() {
    }

    public static ThreadChecker getInstance() {
        return instance;
    }

    @Override
    public long currentThreadSystemId() {
        return Thread.currentThread().getId();
    }

    @Override
    public boolean isMainThread(long j) {
        return mainThreadId == j;
    }

    @Override
    public boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    @Override
    public boolean isMainThread(SentryThread sentryThread) {
        Long id = sentryThread.getId();
        return id != null && isMainThread(id.longValue());
    }
}
