package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidDateUtils {
    private static final io.sentry.SentryDateProvider dateProvider = new io.sentry.android.core.SentryAndroidDateProvider();

    public static io.sentry.SentryDate getCurrentSentryDateTime() {
        return dateProvider.now();
    }
}
