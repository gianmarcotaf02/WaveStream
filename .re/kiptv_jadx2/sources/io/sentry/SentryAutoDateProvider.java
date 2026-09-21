package io.sentry;

import io.sentry.util.Platform;

public final class SentryAutoDateProvider implements SentryDateProvider {
    private final SentryDateProvider dateProvider;

    public SentryAutoDateProvider() {
        if (checkInstantAvailabilityAndPrecision()) {
            this.dateProvider = new SentryInstantDateProvider();
        } else {
            this.dateProvider = new SentryNanotimeDateProvider();
        }
    }

    private static boolean checkInstantAvailabilityAndPrecision() {
        return Platform.isJvm() && Platform.isJavaNinePlus();
    }

    @Override
    public SentryDate now() {
        return this.dateProvider.now();
    }
}
