package io.sentry.android.core.internal.util;

import R0.RunnableC0835m;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.protocol.SentryThread;
import io.sentry.util.thread.IThreadChecker;

public final class AndroidThreadChecker implements IThreadChecker {
    private static final AndroidThreadChecker instance = new AndroidThreadChecker();
    public static volatile long mainThreadSystemId = Process.myTid();

    private AndroidThreadChecker() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0835m(1));
    }

    public static AndroidThreadChecker getInstance() {
        return instance;
    }

    public static void lambda$new$0() {
        mainThreadSystemId = Process.myTid();
    }

    @Override
    public long currentThreadSystemId() {
        return Process.myTid();
    }

    @Override
    public boolean isMainThread(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
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
