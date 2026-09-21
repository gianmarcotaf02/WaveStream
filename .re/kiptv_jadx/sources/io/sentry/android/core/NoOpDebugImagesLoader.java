package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class NoOpDebugImagesLoader implements io.sentry.android.core.IDebugImagesLoader {
    private static final io.sentry.android.core.NoOpDebugImagesLoader instance = new io.sentry.android.core.NoOpDebugImagesLoader();

    private NoOpDebugImagesLoader() {
    }

    public static io.sentry.android.core.NoOpDebugImagesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public java.util.List<io.sentry.protocol.DebugImage> loadDebugImages() {
        return null;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public java.util.Set<io.sentry.protocol.DebugImage> loadDebugImagesForAddresses(java.util.Set<java.lang.String> set) {
        return null;
    }
}
