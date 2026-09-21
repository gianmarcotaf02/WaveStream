package io.sentry.internal.modules;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpModulesLoader implements io.sentry.internal.modules.IModulesLoader {
    private static final io.sentry.internal.modules.NoOpModulesLoader instance = new io.sentry.internal.modules.NoOpModulesLoader();

    private NoOpModulesLoader() {
    }

    public static io.sentry.internal.modules.NoOpModulesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    public java.util.Map<java.lang.String, java.lang.String> getOrLoadModules() {
        return null;
    }
}
