package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class ScopesStorageFactory {
    private static final java.lang.String OTEL_SCOPES_STORAGE = "io.sentry.opentelemetry.OtelContextScopesStorage";

    public static io.sentry.IScopesStorage create(io.sentry.util.LoadClass loadClass, io.sentry.ILogger iLogger) {
        io.sentry.IScopesStorage iScopesStorageCreateInternal = createInternal(loadClass, iLogger);
        iScopesStorageCreateInternal.init();
        return iScopesStorageCreateInternal;
    }

    private static io.sentry.IScopesStorage createInternal(io.sentry.util.LoadClass loadClass, io.sentry.ILogger iLogger) {
        java.lang.Class<?> clsLoadClass;
        if (io.sentry.util.Platform.isJvm() && loadClass.isClassAvailable(OTEL_SCOPES_STORAGE, iLogger) && (clsLoadClass = loadClass.loadClass(OTEL_SCOPES_STORAGE, iLogger)) != null) {
            try {
                java.lang.Object objNewInstance = clsLoadClass.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof io.sentry.IScopesStorage)) {
                    return (io.sentry.IScopesStorage) objNewInstance;
                }
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        return new io.sentry.DefaultScopesStorage();
    }
}
