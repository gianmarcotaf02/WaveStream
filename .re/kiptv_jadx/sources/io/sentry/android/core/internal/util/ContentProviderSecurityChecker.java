package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentProviderSecurityChecker {
    private final io.sentry.android.core.BuildInfoProvider buildInfoProvider;

    public ContentProviderSecurityChecker() {
        this(new io.sentry.android.core.BuildInfoProvider(io.sentry.NoOpLogger.getInstance()));
    }

    public void checkPrivilegeEscalation(android.content.ContentProvider contentProvider) {
        int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
        if (sdkInfoVersion < 26 || sdkInfoVersion > 28) {
            return;
        }
        java.lang.String callingPackage = contentProvider.getCallingPackage();
        java.lang.String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new java.lang.SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public ContentProviderSecurityChecker(io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        this.buildInfoProvider = buildInfoProvider;
    }
}
