package io.sentry.util;

import io.sentry.ISentryLifecycleToken;

public final class LifecycleHelper {
    public static void close(Object obj) {
        if (obj == null || !(obj instanceof ISentryLifecycleToken)) {
            return;
        }
        ((ISentryLifecycleToken) obj).close();
    }
}
