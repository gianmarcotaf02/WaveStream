package io.sentry.util.thread;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpThreadChecker implements io.sentry.util.thread.IThreadChecker {
    private static final io.sentry.util.thread.NoOpThreadChecker instance = new io.sentry.util.thread.NoOpThreadChecker();

    public static io.sentry.util.thread.NoOpThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return 0L;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j) {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(io.sentry.protocol.SentryThread sentryThread) {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(java.lang.Thread thread) {
        return false;
    }
}
