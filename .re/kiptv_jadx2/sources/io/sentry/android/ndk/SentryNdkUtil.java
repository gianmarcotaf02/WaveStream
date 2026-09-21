package io.sentry.android.ndk;

import io.sentry.protocol.SdkVersion;

final class SentryNdkUtil {
    private SentryNdkUtil() {
    }

    public static void addPackage(SdkVersion sdkVersion) {
        if (sdkVersion == null) {
            return;
        }
        sdkVersion.addPackage("maven:io.sentry:sentry-android-ndk", "8.4.0");
    }
}
