package io.sentry.util;

import io.sentry.SentryOptions;

public final class InitUtil {
    public static boolean shouldInit(SentryOptions sentryOptions, SentryOptions sentryOptions2, boolean z6) {
        return !z6 || sentryOptions == null || sentryOptions2.isForceInit() || sentryOptions.getInitPriority().ordinal() <= sentryOptions2.getInitPriority().ordinal();
    }
}
