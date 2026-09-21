package io.sentry.android.core.internal.modules;

/* JADX INFO: loaded from: classes4.dex */
public final class AssetsModulesLoader extends io.sentry.internal.modules.ModulesLoader {
    private final android.content.Context context;

    public AssetsModulesLoader(android.content.Context context, io.sentry.ILogger iLogger) {
        super(iLogger);
        this.context = io.sentry.android.core.ContextUtils.getApplicationContext(context);
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public java.util.Map<java.lang.String, java.lang.String> loadModules() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        try {
            java.io.InputStream inputStreamOpen = this.context.getAssets().open(io.sentry.internal.modules.ModulesLoader.EXTERNAL_MODULES_FILENAME);
            try {
                java.util.Map<java.lang.String, java.lang.String> stream = parseStream(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return stream;
                }
                inputStreamOpen.close();
                return stream;
            } catch (java.lang.Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException unused) {
            this.logger.log(io.sentry.SentryLevel.INFO, "%s file was not found.", io.sentry.internal.modules.ModulesLoader.EXTERNAL_MODULES_FILENAME);
            return treeMap;
        } catch (java.io.IOException e6) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Error extracting modules.", e6);
            return treeMap;
        }
    }
}
