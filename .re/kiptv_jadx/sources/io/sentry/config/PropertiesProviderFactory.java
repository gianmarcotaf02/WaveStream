package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
public final class PropertiesProviderFactory {
    public static io.sentry.config.PropertiesProvider create() {
        java.util.Properties propertiesLoad;
        java.util.Properties propertiesLoad2;
        io.sentry.SystemOutLogger systemOutLogger = new io.sentry.SystemOutLogger();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new io.sentry.config.SystemPropertyPropertiesProvider());
        arrayList.add(new io.sentry.config.EnvironmentVariablePropertiesProvider());
        java.lang.String property = java.lang.System.getProperty("sentry.properties.file");
        if (property != null && (propertiesLoad2 = new io.sentry.config.FilesystemPropertiesLoader(property, systemOutLogger).load()) != null) {
            arrayList.add(new io.sentry.config.SimplePropertiesProvider(propertiesLoad2));
        }
        java.lang.String str = java.lang.System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesLoad = new io.sentry.config.FilesystemPropertiesLoader(str, systemOutLogger).load()) != null) {
            arrayList.add(new io.sentry.config.SimplePropertiesProvider(propertiesLoad));
        }
        java.util.Properties propertiesLoad3 = new io.sentry.config.ClasspathPropertiesLoader(systemOutLogger).load();
        if (propertiesLoad3 != null) {
            arrayList.add(new io.sentry.config.SimplePropertiesProvider(propertiesLoad3));
        }
        java.util.Properties propertiesLoad4 = new io.sentry.config.FilesystemPropertiesLoader("sentry.properties", systemOutLogger).load();
        if (propertiesLoad4 != null) {
            arrayList.add(new io.sentry.config.SimplePropertiesProvider(propertiesLoad4));
        }
        return new io.sentry.config.CompositePropertiesProvider(arrayList);
    }
}
