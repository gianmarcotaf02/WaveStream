package io.sentry.internal.debugmeta;

/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesDebugMetaLoader implements io.sentry.internal.debugmeta.IDebugMetaLoader {
    private final java.lang.ClassLoader classLoader;
    private final io.sentry.ILogger logger;

    public ResourcesDebugMetaLoader(io.sentry.ILogger iLogger) {
        this(iLogger, io.sentry.internal.debugmeta.ResourcesDebugMetaLoader.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public java.util.List<java.util.Properties> loadDebugMeta() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Enumeration<java.net.URL> resources = this.classLoader.getResources(io.sentry.util.DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            while (resources.hasMoreElements()) {
                java.net.URL urlNextElement = resources.nextElement();
                try {
                    java.io.InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        java.util.Properties properties = new java.util.Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.logger.log(io.sentry.SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (java.lang.Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.RuntimeException e6) {
                    this.logger.log(io.sentry.SentryLevel.ERROR, e6, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (java.io.IOException e9) {
            this.logger.log(io.sentry.SentryLevel.ERROR, e9, "Failed to load %s", io.sentry.util.DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.logger.log(io.sentry.SentryLevel.INFO, "No %s file was found.", io.sentry.util.DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
        return null;
    }

    public ResourcesDebugMetaLoader(io.sentry.ILogger iLogger, java.lang.ClassLoader classLoader) {
        this.logger = iLogger;
        this.classLoader = io.sentry.util.ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
