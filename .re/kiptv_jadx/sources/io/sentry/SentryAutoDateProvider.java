package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryAutoDateProvider implements io.sentry.SentryDateProvider {
    private final io.sentry.SentryDateProvider dateProvider;

    public SentryAutoDateProvider() {
        if (checkInstantAvailabilityAndPrecision()) {
            this.dateProvider = new io.sentry.SentryInstantDateProvider();
        } else {
            this.dateProvider = new io.sentry.SentryNanotimeDateProvider();
        }
    }

    private static boolean checkInstantAvailabilityAndPrecision() {
        return io.sentry.util.Platform.isJvm() && io.sentry.util.Platform.isJavaNinePlus();
    }

    @Override // io.sentry.SentryDateProvider
    public io.sentry.SentryDate now() {
        return this.dateProvider.now();
    }
}
