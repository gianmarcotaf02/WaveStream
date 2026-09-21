package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractPropertiesProvider implements io.sentry.config.PropertiesProvider {
    private final java.lang.String prefix;
    private final java.util.Properties properties;

    public AbstractPropertiesProvider(java.lang.String str, java.util.Properties properties) {
        this.prefix = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "prefix is required");
        this.properties = (java.util.Properties) io.sentry.util.Objects.requireNonNull(properties, "properties are required");
    }

    @Override // io.sentry.config.PropertiesProvider
    public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String str) {
        java.lang.String strO = B2.a.o(new java.lang.StringBuilder(), this.prefix, str, ".");
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.properties.entrySet()) {
            if ((entry.getKey() instanceof java.lang.String) && (entry.getValue() instanceof java.lang.String)) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                if (str2.startsWith(strO)) {
                    map.put(str2.substring(strO.length()), io.sentry.util.StringUtils.removeSurrounding((java.lang.String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.PropertiesProvider
    public java.lang.String getProperty(java.lang.String str) {
        return io.sentry.util.StringUtils.removeSurrounding(this.properties.getProperty(this.prefix + str), "\"");
    }

    public AbstractPropertiesProvider(java.util.Properties properties) {
        this("", properties);
    }
}
