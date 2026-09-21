package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

public final class NoOpThreadChecker implements IThreadChecker {
    private static final NoOpThreadChecker instance = new NoOpThreadChecker();

    public static NoOpThreadChecker getInstance() {
        return instance;
    }

    @Override
    public long currentThreadSystemId() {
        return 0L;
    }

    @Override
    public boolean isMainThread() {
        return false;
    }

    @Override
    public boolean isMainThread(long j) {
        return false;
    }

    @Override
    public boolean isMainThread(SentryThread sentryThread) {
        return false;
    }

    @Override
    public boolean isMainThread(Thread thread) {
        return false;
    }
}
