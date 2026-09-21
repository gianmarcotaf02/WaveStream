package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class IntegrationUtils {
    public static void addIntegrationToSdkVersion(java.lang.String str) {
        io.sentry.SentryIntegrationPackageStorage.getInstance().addIntegration(str);
    }
}
