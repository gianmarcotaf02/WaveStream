package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public interface IDebugImagesLoader {
    void clearDebugImages();

    java.util.List<io.sentry.protocol.DebugImage> loadDebugImages();

    java.util.Set<io.sentry.protocol.DebugImage> loadDebugImagesForAddresses(java.util.Set<java.lang.String> set);
}
