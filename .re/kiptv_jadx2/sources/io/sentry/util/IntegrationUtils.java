package io.sentry.util;

import io.sentry.SentryIntegrationPackageStorage;

public final class IntegrationUtils {
    public static void addIntegrationToSdkVersion(String str) {
        SentryIntegrationPackageStorage.getInstance().addIntegration(str);
    }
}
