package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
final class SystemPropertyPropertiesProvider extends io.sentry.config.AbstractPropertiesProvider {
    private static final java.lang.String PREFIX = "sentry.";

    public SystemPropertyPropertiesProvider() {
        super(PREFIX, java.lang.System.getProperties());
    }
}
