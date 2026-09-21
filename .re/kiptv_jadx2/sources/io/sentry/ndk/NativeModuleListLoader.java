package io.sentry.ndk;

public final class NativeModuleListLoader {
    public static native void nativeClearModuleList();

    public static native DebugImage[] nativeLoadModuleList();

    public void clearModuleList() {
        nativeClearModuleList();
    }

    public DebugImage[] loadModuleList() {
        return nativeLoadModuleList();
    }
}
