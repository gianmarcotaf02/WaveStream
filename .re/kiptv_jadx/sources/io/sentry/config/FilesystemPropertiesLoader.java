package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
final class FilesystemPropertiesLoader implements io.sentry.config.PropertiesLoader {
    private final java.lang.String filePath;
    private final io.sentry.ILogger logger;

    public FilesystemPropertiesLoader(java.lang.String str, io.sentry.ILogger iLogger) {
        this.filePath = str;
        this.logger = iLogger;
    }

    @Override // io.sentry.config.PropertiesLoader
    public java.util.Properties load() {
        try {
            java.io.File file = new java.io.File(this.filePath);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            this.logger.log(io.sentry.SentryLevel.ERROR, e6, "Failed to load Sentry configuration from file: %s", this.filePath);
            return null;
        }
    }
}
