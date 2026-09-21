package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeModuleListLoader {
    public static native void nativeClearModuleList();

    public static native io.sentry.ndk.DebugImage[] nativeLoadModuleList();

    public void clearModuleList() {
        nativeClearModuleList();
    }

    public io.sentry.ndk.DebugImage[] loadModuleList() {
        return nativeLoadModuleList();
    }
}
