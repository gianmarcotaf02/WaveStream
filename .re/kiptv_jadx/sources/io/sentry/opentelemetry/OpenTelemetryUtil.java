package io.sentry.opentelemetry;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenTelemetryUtil {
    public static void applyIgnoredSpanOrigins(io.sentry.SentryOptions sentryOptions) {
        if (io.sentry.util.Platform.isJvm()) {
            java.util.Iterator<java.lang.String> it = ignoredSpanOrigins(sentryOptions).iterator();
            while (it.hasNext()) {
                sentryOptions.addIgnoredSpanOrigin(it.next());
            }
        }
    }

    private static java.util.List<java.lang.String> ignoredSpanOrigins(io.sentry.SentryOptions sentryOptions) {
        io.sentry.SentryOpenTelemetryMode openTelemetryMode = sentryOptions.getOpenTelemetryMode();
        return io.sentry.SentryOpenTelemetryMode.OFF.equals(openTelemetryMode) ? java.util.Collections.EMPTY_LIST : io.sentry.util.SpanUtils.ignoredSpanOriginsForOpenTelemetry(openTelemetryMode);
    }

    public static void updateOpenTelemetryModeIfAuto(io.sentry.SentryOptions sentryOptions, io.sentry.util.LoadClass loadClass) {
        if (io.sentry.util.Platform.isJvm()) {
            if (io.sentry.SentryOpenTelemetryMode.AUTO.equals(sentryOptions.getOpenTelemetryMode())) {
                if (loadClass.isClassAvailable("io.sentry.opentelemetry.agent.AgentMarker", io.sentry.NoOpLogger.getInstance())) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new java.lang.Object[0]);
                    sentryOptions.setOpenTelemetryMode(io.sentry.SentryOpenTelemetryMode.AGENT);
                } else if (loadClass.isClassAvailable("io.sentry.opentelemetry.agent.AgentlessMarker", io.sentry.NoOpLogger.getInstance())) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new java.lang.Object[0]);
                    sentryOptions.setOpenTelemetryMode(io.sentry.SentryOpenTelemetryMode.AGENTLESS);
                } else if (loadClass.isClassAvailable("io.sentry.opentelemetry.agent.AgentlessSpringMarker", io.sentry.NoOpLogger.getInstance())) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new java.lang.Object[0]);
                    sentryOptions.setOpenTelemetryMode(io.sentry.SentryOpenTelemetryMode.AGENTLESS_SPRING);
                }
            }
        }
    }
}
