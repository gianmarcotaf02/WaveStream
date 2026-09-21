package io.sentry.android.core.internal.debugmeta;

/* JADX INFO: loaded from: classes4.dex */
public final class AssetsDebugMetaLoader implements io.sentry.internal.debugmeta.IDebugMetaLoader {
    private final android.content.Context context;
    private final io.sentry.ILogger logger;

    public AssetsDebugMetaLoader(android.content.Context context, io.sentry.ILogger iLogger) {
        this.context = io.sentry.android.core.ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public java.util.List<java.util.Properties> loadDebugMeta() {
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(this.context.getAssets().open(io.sentry.util.DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME));
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.load(bufferedInputStream);
                java.util.List<java.util.Properties> listSingletonList = java.util.Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e6) {
            this.logger.log(io.sentry.SentryLevel.INFO, e6, "%s file was not found.", io.sentry.util.DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        } catch (java.io.IOException e9) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Error getting Proguard UUIDs.", e9);
            return null;
        } catch (java.lang.RuntimeException e10) {
            this.logger.log(io.sentry.SentryLevel.ERROR, e10, "%s file is malformed.", io.sentry.util.DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        }
    }
}
