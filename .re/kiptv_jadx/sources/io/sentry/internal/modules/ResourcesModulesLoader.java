package io.sentry.internal.modules;

/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesModulesLoader extends io.sentry.internal.modules.ModulesLoader {
    private final java.lang.ClassLoader classLoader;

    public ResourcesModulesLoader(io.sentry.ILogger iLogger) {
        this(iLogger, io.sentry.internal.modules.ResourcesModulesLoader.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public java.util.Map<java.lang.String, java.lang.String> loadModules() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        try {
            java.io.InputStream resourceAsStream = this.classLoader.getResourceAsStream(io.sentry.internal.modules.ModulesLoader.EXTERNAL_MODULES_FILENAME);
            try {
                if (resourceAsStream != null) {
                    java.util.Map<java.lang.String, java.lang.String> stream = parseStream(resourceAsStream);
                    resourceAsStream.close();
                    return stream;
                }
                this.logger.log(io.sentry.SentryLevel.INFO, "%s file was not found.", io.sentry.internal.modules.ModulesLoader.EXTERNAL_MODULES_FILENAME);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (java.lang.Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            this.logger.log(io.sentry.SentryLevel.INFO, "Access to resources failed.", e6);
        } catch (java.lang.SecurityException e9) {
            this.logger.log(io.sentry.SentryLevel.INFO, "Access to resources denied.", e9);
        }
    }

    public ResourcesModulesLoader(io.sentry.ILogger iLogger, java.lang.ClassLoader classLoader) {
        super(iLogger);
        this.classLoader = io.sentry.util.ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
