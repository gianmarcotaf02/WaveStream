package io.sentry.util.thread;

/* JADX INFO: loaded from: classes4.dex */
public interface IThreadChecker {
    long currentThreadSystemId();

    boolean isMainThread();

    boolean isMainThread(long j);

    boolean isMainThread(io.sentry.protocol.SentryThread sentryThread);

    boolean isMainThread(java.lang.Thread thread);
}
