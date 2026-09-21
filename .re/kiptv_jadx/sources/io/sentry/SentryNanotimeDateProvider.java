package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryNanotimeDateProvider implements io.sentry.SentryDateProvider {
    @Override // io.sentry.SentryDateProvider
    public io.sentry.SentryDate now() {
        return new io.sentry.SentryNanotimeDate();
    }
}
