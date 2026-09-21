package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SpanFactoryFactory {
    private static final java.lang.String OTEL_SPAN_FACTORY = "io.sentry.opentelemetry.OtelSpanFactory";

    public static io.sentry.ISpanFactory create(io.sentry.util.LoadClass loadClass, io.sentry.ILogger iLogger) {
        java.lang.Class<?> clsLoadClass;
        if (io.sentry.util.Platform.isJvm() && loadClass.isClassAvailable(OTEL_SPAN_FACTORY, iLogger) && (clsLoadClass = loadClass.loadClass(OTEL_SPAN_FACTORY, iLogger)) != null) {
            try {
                java.lang.Object objNewInstance = clsLoadClass.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof io.sentry.ISpanFactory)) {
                    return (io.sentry.ISpanFactory) objNewInstance;
                }
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        return new io.sentry.DefaultSpanFactory();
    }
}
