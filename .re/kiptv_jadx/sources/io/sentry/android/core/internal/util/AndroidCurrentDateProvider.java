package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCurrentDateProvider implements io.sentry.transport.ICurrentDateProvider {
    private static final io.sentry.transport.ICurrentDateProvider instance = new io.sentry.android.core.internal.util.AndroidCurrentDateProvider();

    private AndroidCurrentDateProvider() {
    }

    public static io.sentry.transport.ICurrentDateProvider getInstance() {
        return instance;
    }

    @Override // io.sentry.transport.ICurrentDateProvider
    public long getCurrentTimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
