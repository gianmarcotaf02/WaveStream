package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes4.dex */
final class SentryNdkUtil {
    private SentryNdkUtil() {
    }

    public static void addPackage(io.sentry.protocol.SdkVersion sdkVersion) {
        if (sdkVersion == null) {
            return;
        }
        sdkVersion.addPackage("maven:io.sentry:sentry-android-ndk", "8.4.0");
    }
}
