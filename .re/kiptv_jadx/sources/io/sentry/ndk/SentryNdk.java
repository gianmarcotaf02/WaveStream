package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(io.sentry.ndk.NdkOptions ndkOptions) {
        loadNativeLibraries();
        initSentryNative(ndkOptions);
    }

    private static native void initSentryNative(io.sentry.ndk.NdkOptions ndkOptions);

    public static synchronized void loadNativeLibraries() {
        if (!nativeLibrariesLoaded) {
            java.lang.System.loadLibrary("log");
            java.lang.System.loadLibrary("sentry");
            java.lang.System.loadLibrary("sentry-android");
            nativeLibrariesLoaded = true;
        }
    }

    private static native void shutdown();
}
