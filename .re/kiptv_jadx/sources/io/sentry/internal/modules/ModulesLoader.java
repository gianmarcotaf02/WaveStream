package io.sentry.internal.modules;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ModulesLoader implements io.sentry.internal.modules.IModulesLoader {
    public static final java.lang.String EXTERNAL_MODULES_FILENAME = "sentry-external-modules.txt";
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private java.util.Map<java.lang.String, java.lang.String> cachedModules = null;
    protected final io.sentry.ILogger logger;

    public ModulesLoader(io.sentry.ILogger iLogger) {
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    public java.util.Map<java.lang.String, java.lang.String> getOrLoadModules() {
        java.util.Map<java.lang.String, java.lang.String> map = this.cachedModules;
        if (map != null) {
            return map;
        }
        java.util.Map<java.lang.String, java.lang.String> mapLoadModules = loadModules();
        this.cachedModules = mapLoadModules;
        return mapLoadModules;
    }

    public abstract java.util.Map<java.lang.String, java.lang.String> loadModules();

    public java.util.Map<java.lang.String, java.lang.String> parseStream(java.io.InputStream inputStream) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, UTF_8));
            try {
                for (java.lang.String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.logger.log(io.sentry.SentryLevel.DEBUG, "Extracted %d modules from resources.", java.lang.Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Error extracting modules.", e6);
            return treeMap;
        } catch (java.lang.RuntimeException e9) {
            this.logger.log(io.sentry.SentryLevel.ERROR, e9, "%s file is malformed.", EXTERNAL_MODULES_FILENAME);
            return treeMap;
        }
    }
}
