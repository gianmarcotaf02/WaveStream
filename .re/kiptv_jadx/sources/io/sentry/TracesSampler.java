package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class TracesSampler {
    private final io.sentry.SentryOptions options;

    public TracesSampler(io.sentry.SentryOptions sentryOptions) {
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "options are required");
    }

    public io.sentry.TracesSamplingDecision sample(io.sentry.SamplingContext samplingContext) {
        java.lang.Double dSample;
        java.lang.Double dSample2;
        java.lang.Double sampleRand = samplingContext.getSampleRand();
        io.sentry.TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return io.sentry.util.SampleRateUtils.backfilledSampleRand(samplingDecision);
        }
        if (this.options.getProfilesSampler() != null) {
            try {
                dSample = this.options.getProfilesSampler().sample(samplingContext);
            } catch (java.lang.Throwable th) {
                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th);
                dSample = null;
            }
        } else {
            dSample = null;
        }
        if (dSample == null) {
            dSample = this.options.getProfilesSampleRate();
        }
        java.lang.Double d4 = dSample;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(d4 != null && sample(d4, sampleRand));
        if (this.options.getTracesSampler() != null) {
            try {
                dSample2 = this.options.getTracesSampler().sample(samplingContext);
            } catch (java.lang.Throwable th2) {
                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                dSample2 = null;
            }
            if (dSample2 != null) {
                return new io.sentry.TracesSamplingDecision(java.lang.Boolean.valueOf(sample(dSample2, sampleRand)), dSample2, sampleRand, boolValueOf, d4);
            }
        }
        io.sentry.TracesSamplingDecision parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision != null) {
            return io.sentry.util.SampleRateUtils.backfilledSampleRand(parentSamplingDecision);
        }
        java.lang.Double tracesSampleRate = this.options.getTracesSampleRate();
        java.lang.Double dValueOf = tracesSampleRate != null ? java.lang.Double.valueOf(tracesSampleRate.doubleValue() / java.lang.Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor())) : null;
        if (dValueOf != null) {
            return new io.sentry.TracesSamplingDecision(java.lang.Boolean.valueOf(sample(dValueOf, sampleRand)), dValueOf, sampleRand, boolValueOf, d4);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new io.sentry.TracesSamplingDecision(bool, null, sampleRand, bool, null);
    }

    private boolean sample(java.lang.Double d4, java.lang.Double d6) {
        return d4.doubleValue() >= d6.doubleValue();
    }
}
