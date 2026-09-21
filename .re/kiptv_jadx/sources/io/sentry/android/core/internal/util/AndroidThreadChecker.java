package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidThreadChecker implements io.sentry.util.thread.IThreadChecker {
    private static final io.sentry.android.core.internal.util.AndroidThreadChecker instance = new io.sentry.android.core.internal.util.AndroidThreadChecker();
    public static volatile long mainThreadSystemId = android.os.Process.myTid();

    private AndroidThreadChecker() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new R0.RunnableC0835m(1));
    }

    public static io.sentry.android.core.internal.util.AndroidThreadChecker getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
        mainThreadSystemId = android.os.Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return android.os.Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j) {
        return android.os.Looper.getMainLooper().getThread().getId() == j;
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
