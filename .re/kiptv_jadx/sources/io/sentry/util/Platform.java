package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Platform {
    static boolean isAndroid;
    static boolean isJavaNinePlus;

    static {
        try {
            isAndroid = "The Android Project".equals(java.lang.System.getProperty("java.vendor"));
        } catch (java.lang.Throwable unused) {
            isAndroid = false;
        }
        try {
            java.lang.String property = java.lang.System.getProperty("java.specification.version");
            if (property != null) {
                isJavaNinePlus = java.lang.Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                isJavaNinePlus = false;
            }
        } catch (java.lang.Throwable unused2) {
            isJavaNinePlus = false;
        }
    }

    public static boolean isAndroid() {
        return isAndroid;
    }

    public static boolean isJavaNinePlus() {
        return isJavaNinePlus;
    }

    public static boolean isJvm() {
        return !isAndroid;
    }
}
