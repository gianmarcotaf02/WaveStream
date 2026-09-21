package io.sentry.internal.debugmeta;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpDebugMetaLoader implements io.sentry.internal.debugmeta.IDebugMetaLoader {
    private static final io.sentry.internal.debugmeta.NoOpDebugMetaLoader instance = new io.sentry.internal.debugmeta.NoOpDebugMetaLoader();

    private NoOpDebugMetaLoader() {
    }

    public static io.sentry.internal.debugmeta.NoOpDebugMetaLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public java.util.List<java.util.Properties> loadDebugMeta() {
        return null;
    }
}
