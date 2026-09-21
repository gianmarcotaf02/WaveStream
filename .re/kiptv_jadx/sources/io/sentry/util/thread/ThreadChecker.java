package io.sentry.util.thread;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadChecker implements io.sentry.util.thread.IThreadChecker {
    private static final long mainThreadId = java.lang.Thread.currentThread().getId();
    private static final io.sentry.util.thread.ThreadChecker instance = new io.sentry.util.thread.ThreadChecker();

    private ThreadChecker() {
    }

    public static io.sentry.util.thread.ThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return java.lang.Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j) {
        return mainThreadId == j;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(java.lang.Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return isMainThread(java.lang.Thread.currentThread());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(io.sentry.protocol.SentryThread sentryThread) {
        java.lang.Long id = sentryThread.getId();
        return id != null && isMainThread(id.longValue());
    }
}
