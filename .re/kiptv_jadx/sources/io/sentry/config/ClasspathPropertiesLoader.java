package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
final class ClasspathPropertiesLoader implements io.sentry.config.PropertiesLoader {
    private final java.lang.ClassLoader classLoader;
    private final java.lang.String fileName;
    private final io.sentry.ILogger logger;

    public ClasspathPropertiesLoader(java.lang.String str, java.lang.ClassLoader classLoader, io.sentry.ILogger iLogger) {
        this.fileName = str;
        this.classLoader = io.sentry.util.ClassLoaderUtils.classLoaderOrDefault(classLoader);
        this.logger = iLogger;
    }

    @Override // io.sentry.config.PropertiesLoader
    public java.util.Properties load() {
        try {
            java.io.InputStream resourceAsStream = this.classLoader.getResourceAsStream(this.fileName);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(resourceAsStream);
                try {
                    java.util.Properties properties = new java.util.Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    resourceAsStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException e6) {
            this.logger.log(io.sentry.SentryLevel.ERROR, e6, "Failed to load Sentry configuration from classpath resource: %s", this.fileName);
            return null;
        }
    }

    public ClasspathPropertiesLoader(io.sentry.ILogger iLogger) {
        this("sentry.properties", io.sentry.config.ClasspathPropertiesLoader.class.getClassLoader(), iLogger);
    }
}
