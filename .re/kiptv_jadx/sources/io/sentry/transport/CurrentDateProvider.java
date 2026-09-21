package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class CurrentDateProvider implements io.sentry.transport.ICurrentDateProvider {
    private static final io.sentry.transport.ICurrentDateProvider instance = new io.sentry.transport.CurrentDateProvider();

    private CurrentDateProvider() {
    }

    public static io.sentry.transport.ICurrentDateProvider getInstance() {
        return instance;
    }

    @Override // io.sentry.transport.ICurrentDateProvider
    public final long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
