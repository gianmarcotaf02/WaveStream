package io.sentry.hints;

/* JADX INFO: loaded from: classes4.dex */
public interface DiskFlushNotification {
    boolean isFlushable(io.sentry.protocol.SentryId sentryId);

    void markFlushed();

    void setFlushable(io.sentry.protocol.SentryId sentryId);
}
