package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
final class CompositePropertiesProvider implements io.sentry.config.PropertiesProvider {
    private final java.util.List<io.sentry.config.PropertiesProvider> providers;

    public CompositePropertiesProvider(java.util.List<io.sentry.config.PropertiesProvider> list) {
        this.providers = list;
    }

    @Override // io.sentry.config.PropertiesProvider
    public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.util.Iterator<io.sentry.config.PropertiesProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    public java.lang.String getProperty(java.lang.String str) {
        java.util.Iterator<io.sentry.config.PropertiesProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            java.lang.String property = it.next().getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
