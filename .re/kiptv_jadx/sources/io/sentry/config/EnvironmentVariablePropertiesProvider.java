package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
final class EnvironmentVariablePropertiesProvider implements io.sentry.config.PropertiesProvider {
    private static final java.lang.String PREFIX = "SENTRY";

    private java.lang.String propertyToEnvironmentVariableName(java.lang.String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(java.util.Locale.ROOT);
    }

    @Override // io.sentry.config.PropertiesProvider
    public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String str) {
        java.lang.String strRemoveSurrounding;
        java.lang.String strM = Y6.f.m(new java.lang.StringBuilder(), propertyToEnvironmentVariableName(str), "_");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : java.lang.System.getenv().entrySet()) {
            java.lang.String key = entry.getKey();
            if (key.startsWith(strM) && (strRemoveSurrounding = io.sentry.util.StringUtils.removeSurrounding(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(strM.length()).toLowerCase(java.util.Locale.ROOT), strRemoveSurrounding);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    public java.lang.String getProperty(java.lang.String str) {
        return io.sentry.util.StringUtils.removeSurrounding(java.lang.System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }
}
