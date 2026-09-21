package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryAppStartProfilingOptions implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    boolean isProfilingEnabled;
    java.lang.Double profileSampleRate;
    boolean profileSampled;
    java.lang.String profilingTracesDirPath;
    int profilingTracesHz;
    java.lang.Double traceSampleRate;
    boolean traceSampled;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryAppStartProfilingOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryAppStartProfilingOptions deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.SentryAppStartProfilingOptions sentryAppStartProfilingOptions = new io.sentry.SentryAppStartProfilingOptions();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "trace_sampled":
                        java.lang.Boolean boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.traceSampled = boolNextBooleanOrNull.booleanValue();
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.profilingTracesDirPath = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        java.lang.Boolean boolNextBooleanOrNull2 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull2 == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.isProfilingEnabled = boolNextBooleanOrNull2.booleanValue();
                            break;
                        }
                        break;
                    case "profile_sampled":
                        java.lang.Boolean boolNextBooleanOrNull3 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull3 == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.profileSampled = boolNextBooleanOrNull3.booleanValue();
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        java.lang.Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        if (numNextIntegerOrNull == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.profilingTracesHz = numNextIntegerOrNull.intValue();
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        java.lang.Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        if (dNextDoubleOrNull == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.traceSampleRate = dNextDoubleOrNull;
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        java.lang.Double dNextDoubleOrNull2 = objectReader.nextDoubleOrNull();
                        if (dNextDoubleOrNull2 == null) {
                            break;
                        } else {
                            sentryAppStartProfilingOptions.profileSampleRate = dNextDoubleOrNull2;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryAppStartProfilingOptions.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryAppStartProfilingOptions;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String IS_PROFILING_ENABLED = "is_profiling_enabled";
        public static final java.lang.String PROFILE_SAMPLED = "profile_sampled";
        public static final java.lang.String PROFILE_SAMPLE_RATE = "profile_sample_rate";
        public static final java.lang.String PROFILING_TRACES_DIR_PATH = "profiling_traces_dir_path";
        public static final java.lang.String PROFILING_TRACES_HZ = "profiling_traces_hz";
        public static final java.lang.String TRACE_SAMPLED = "trace_sampled";
        public static final java.lang.String TRACE_SAMPLE_RATE = "trace_sample_rate";
    }

    public SentryAppStartProfilingOptions() {
        this.traceSampled = false;
        this.traceSampleRate = null;
        this.profileSampled = false;
        this.profileSampleRate = null;
        this.profilingTracesDirPath = null;
        this.isProfilingEnabled = false;
        this.profilingTracesHz = 0;
    }

    public java.lang.Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public java.lang.String getProfilingTracesDirPath() {
        return this.profilingTracesDirPath;
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public java.lang.Double getTraceSampleRate() {
        return this.traceSampleRate;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public boolean isProfileSampled() {
        return this.profileSampled;
    }

    public boolean isProfilingEnabled() {
        return this.isProfilingEnabled;
    }

    public boolean isTraceSampled() {
        return this.traceSampled;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.PROFILE_SAMPLED).value(iLogger, java.lang.Boolean.valueOf(this.profileSampled));
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.PROFILE_SAMPLE_RATE).value(iLogger, this.profileSampleRate);
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.TRACE_SAMPLED).value(iLogger, java.lang.Boolean.valueOf(this.traceSampled));
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.TRACE_SAMPLE_RATE).value(iLogger, this.traceSampleRate);
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.PROFILING_TRACES_DIR_PATH).value(iLogger, this.profilingTracesDirPath);
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.IS_PROFILING_ENABLED).value(iLogger, java.lang.Boolean.valueOf(this.isProfilingEnabled));
        objectWriter.name(io.sentry.SentryAppStartProfilingOptions.JsonKeys.PROFILING_TRACES_HZ).value(iLogger, java.lang.Integer.valueOf(this.profilingTracesHz));
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setProfileSampleRate(java.lang.Double d4) {
        this.profileSampleRate = d4;
    }

    public void setProfileSampled(boolean z6) {
        this.profileSampled = z6;
    }

    public void setProfilingEnabled(boolean z6) {
        this.isProfilingEnabled = z6;
    }

    public void setProfilingTracesDirPath(java.lang.String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i3) {
        this.profilingTracesHz = i3;
    }

    public void setTraceSampleRate(java.lang.Double d4) {
        this.traceSampleRate = d4;
    }

    public void setTraceSampled(boolean z6) {
        this.traceSampled = z6;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryAppStartProfilingOptions(io.sentry.SentryOptions sentryOptions, io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        this.traceSampled = tracesSamplingDecision.getSampled().booleanValue();
        this.traceSampleRate = tracesSamplingDecision.getSampleRate();
        this.profileSampled = tracesSamplingDecision.getProfileSampled().booleanValue();
        this.profileSampleRate = tracesSamplingDecision.getProfileSampleRate();
        this.profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        this.isProfilingEnabled = sentryOptions.isProfilingEnabled();
        this.profilingTracesHz = sentryOptions.getProfilingTracesHz();
    }
}
