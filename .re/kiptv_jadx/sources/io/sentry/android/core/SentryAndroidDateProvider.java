package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryAndroidDateProvider implements io.sentry.SentryDateProvider {
    private io.sentry.SentryDateProvider dateProvider = new io.sentry.SentryNanotimeDateProvider();

    @Override // io.sentry.SentryDateProvider
    public io.sentry.SentryDate now() {
        return this.dateProvider.now();
    }
}
