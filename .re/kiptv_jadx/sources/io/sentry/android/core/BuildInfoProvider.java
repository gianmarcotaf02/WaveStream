package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class BuildInfoProvider {
    final io.sentry.ILogger logger;

    public BuildInfoProvider(io.sentry.ILogger iLogger) {
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "The ILogger object is required.");
    }

    public java.lang.String getBuildTags() {
        return android.os.Build.TAGS;
    }

    public java.lang.String getManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    public java.lang.String getModel() {
        return android.os.Build.MODEL;
    }

    public int getSdkInfoVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public java.lang.String getVersionRelease() {
        return android.os.Build.VERSION.RELEASE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public java.lang.Boolean isEmulator() {
        boolean z6;
        try {
            if (android.os.Build.BRAND.startsWith("generic") && android.os.Build.DEVICE.startsWith("generic")) {
                z6 = true;
            } else {
                java.lang.String str = android.os.Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z6 = true;
                } else {
                    java.lang.String str2 = android.os.Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z6 = true;
                    } else {
                        java.lang.String str3 = android.os.Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || android.os.Build.MANUFACTURER.contains("Genymotion")) {
                            z6 = true;
                        } else {
                            java.lang.String str4 = android.os.Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains(io.sentry.protocol.Device.JsonKeys.SIMULATOR)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                    }
                }
            }
            return java.lang.Boolean.valueOf(z6);
        } catch (java.lang.Throwable th) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
