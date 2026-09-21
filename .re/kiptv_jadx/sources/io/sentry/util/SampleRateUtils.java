package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class SampleRateUtils {
    public static java.lang.Double backfilledSampleRand(java.lang.Double d4, java.lang.Double d6, java.lang.Boolean bool) {
        if (d4 != null) {
            return d4;
        }
        double dNextDouble = io.sentry.util.SentryRandom.current().nextDouble();
        if (d6 == null || bool == null) {
            return java.lang.Double.valueOf(dNextDouble);
        }
        if (bool.booleanValue()) {
            return java.lang.Double.valueOf(d6.doubleValue() * dNextDouble);
        }
        return java.lang.Double.valueOf(((1.0d - d6.doubleValue()) * dNextDouble) + d6.doubleValue());
    }

    public static boolean isValidProfilesSampleRate(java.lang.Double d4) {
        return isValidRate(d4, true);
    }

    private static boolean isValidRate(java.lang.Double d4, boolean z6) {
        if (d4 == null) {
            return z6;
        }
        return !d4.isNaN() && d4.doubleValue() >= 0.0d && d4.doubleValue() <= 1.0d;
    }

    public static boolean isValidSampleRate(java.lang.Double d4) {
        return isValidRate(d4, true);
    }

    public static boolean isValidTracesSampleRate(java.lang.Double d4) {
        return isValidTracesSampleRate(d4, true);
    }

    public static boolean isValidTracesSampleRate(java.lang.Double d4, boolean z6) {
        return isValidRate(d4, z6);
    }

    public static io.sentry.TracesSamplingDecision backfilledSampleRand(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision.getSampleRand() != null) {
            return tracesSamplingDecision;
        }
        return new io.sentry.TracesSamplingDecision(tracesSamplingDecision.getSampled(), tracesSamplingDecision.getSampleRate(), backfilledSampleRand(null, tracesSamplingDecision.getSampleRate(), tracesSamplingDecision.getSampled()), tracesSamplingDecision.getProfileSampled(), tracesSamplingDecision.getProfileSampleRate());
    }
}
