package io.sentry.util;

import io.sentry.TracesSamplingDecision;

public final class SampleRateUtils {
    public static Double backfilledSampleRand(Double d4, Double d6, Boolean bool) {
        if (d4 != null) {
            return d4;
        }
        double dNextDouble = SentryRandom.current().nextDouble();
        if (d6 == null || bool == null) {
            return Double.valueOf(dNextDouble);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d6.doubleValue() * dNextDouble);
        }
        return Double.valueOf(((1.0d - d6.doubleValue()) * dNextDouble) + d6.doubleValue());
    }

    public static boolean isValidProfilesSampleRate(Double d4) {
        return isValidRate(d4, true);
    }

    private static boolean isValidRate(Double d4, boolean z6) {
        if (d4 == null) {
            return z6;
        }
        return !d4.isNaN() && d4.doubleValue() >= 0.0d && d4.doubleValue() <= 1.0d;
    }

    public static boolean isValidSampleRate(Double d4) {
        return isValidRate(d4, true);
    }

    public static boolean isValidTracesSampleRate(Double d4) {
        return isValidTracesSampleRate(d4, true);
    }

    public static boolean isValidTracesSampleRate(Double d4, boolean z6) {
        return isValidRate(d4, z6);
    }

    public static TracesSamplingDecision backfilledSampleRand(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision.getSampleRand() != null) {
            return tracesSamplingDecision;
        }
        return new TracesSamplingDecision(tracesSamplingDecision.getSampled(), tracesSamplingDecision.getSampleRate(), backfilledSampleRand(null, tracesSamplingDecision.getSampleRate(), tracesSamplingDecision.getSampled()), tracesSamplingDecision.getProfileSampled(), tracesSamplingDecision.getProfileSampleRate());
    }
}
