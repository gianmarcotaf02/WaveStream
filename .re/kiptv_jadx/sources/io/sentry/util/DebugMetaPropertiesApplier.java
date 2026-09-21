package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugMetaPropertiesApplier {
    public static java.lang.String DEBUG_META_PROPERTIES_FILENAME = "sentry-debug-meta.properties";

    private static void applyBundleIds(io.sentry.SentryOptions sentryOptions, java.util.List<java.util.Properties> list) {
        if (sentryOptions.getBundleIds().isEmpty()) {
            java.util.Iterator<java.util.Properties> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String property = it.next().getProperty("io.sentry.bundle-ids");
                sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (java.lang.String str : property.split(",", -1)) {
                        sentryOptions.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void applyProguardUuid(io.sentry.SentryOptions sentryOptions, java.util.List<java.util.Properties> list) {
        if (sentryOptions.getProguardUuid() == null) {
            java.util.Iterator<java.util.Properties> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String proguardUuid = getProguardUuid(it.next());
                if (proguardUuid != null) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Proguard UUID found: %s", proguardUuid);
                    sentryOptions.setProguardUuid(proguardUuid);
                    return;
                }
            }
        }
    }

    public static void applyToOptions(io.sentry.SentryOptions sentryOptions, java.util.List<java.util.Properties> list) {
        if (list != null) {
            applyBundleIds(sentryOptions, list);
            applyProguardUuid(sentryOptions, list);
        }
    }

    public static java.lang.String getProguardUuid(java.util.Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
