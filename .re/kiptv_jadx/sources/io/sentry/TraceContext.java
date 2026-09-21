package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class TraceContext implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private final java.lang.String environment;
    private final java.lang.String publicKey;
    private final java.lang.String release;
    private final io.sentry.protocol.SentryId replayId;
    private final java.lang.String sampleRand;
    private final java.lang.String sampleRate;
    private final java.lang.String sampled;
    private final io.sentry.protocol.SentryId traceId;
    private final java.lang.String transaction;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private final java.lang.String userId;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.TraceContext> {
        private java.lang.Exception missingRequiredFieldException(java.lang.String str, io.sentry.ILogger iLogger) {
            java.lang.String strH = Y6.f.h("Missing required field \"", str, "\"");
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(strH);
            iLogger.log(io.sentry.SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:7:0x0031  */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.TraceContext deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) throws java.lang.Exception {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.SentryId sentryIdDeserialize = null;
            java.lang.String strNextString = null;
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.String strNextStringOrNull3 = null;
            java.lang.String strNextStringOrNull4 = null;
            java.lang.String strNextStringOrNull5 = null;
            java.lang.String strNextStringOrNull6 = null;
            io.sentry.protocol.SentryId sentryIdDeserialize2 = null;
            java.lang.String strNextStringOrNull7 = null;
            while (true) {
                io.sentry.protocol.SentryId sentryId = sentryIdDeserialize;
                if (objectReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NAME) {
                    if (sentryId == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (strNextString == null) {
                        throw missingRequiredFieldException(io.sentry.TraceContext.JsonKeys.PUBLIC_KEY, iLogger);
                    }
                    io.sentry.TraceContext traceContext = new io.sentry.TraceContext(sentryId, strNextString, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6, sentryIdDeserialize2, strNextStringOrNull7);
                    traceContext.setUnknown(concurrentHashMap);
                    objectReader.endObject();
                    return traceContext;
                }
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "replay_id":
                        sentryIdDeserialize2 = new io.sentry.protocol.SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "user_id":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "environment":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "sample_rand":
                        strNextStringOrNull7 = objectReader.nextStringOrNull();
                        break;
                    case "sample_rate":
                        strNextStringOrNull5 = objectReader.nextStringOrNull();
                        break;
                    case "release":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new io.sentry.protocol.SentryId.Deserializer().deserialize(objectReader, iLogger);
                        continue;
                        break;
                    case "sampled":
                        strNextStringOrNull6 = objectReader.nextStringOrNull();
                        break;
                    case "public_key":
                        strNextString = objectReader.nextString();
                        break;
                    case "transaction":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
                sentryIdDeserialize = sentryId;
            }
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ENVIRONMENT = "environment";
        public static final java.lang.String PUBLIC_KEY = "public_key";
        public static final java.lang.String RELEASE = "release";
        public static final java.lang.String REPLAY_ID = "replay_id";
        public static final java.lang.String SAMPLED = "sampled";
        public static final java.lang.String SAMPLE_RAND = "sample_rand";
        public static final java.lang.String SAMPLE_RATE = "sample_rate";
        public static final java.lang.String TRACE_ID = "trace_id";
        public static final java.lang.String TRANSACTION = "transaction";
        public static final java.lang.String USER_ID = "user_id";
    }

    public TraceContext(io.sentry.protocol.SentryId sentryId, java.lang.String str) {
        this(sentryId, str, null, null, null, null, null, null, null);
    }

    private static java.lang.String getUserId(io.sentry.SentryOptions sentryOptions, io.sentry.protocol.User user) {
        if (!sentryOptions.isSendDefaultPii() || user == null) {
            return null;
        }
        return user.getId();
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public java.lang.String getPublicKey() {
        return this.publicKey;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public io.sentry.protocol.SentryId getReplayId() {
        return this.replayId;
    }

    public java.lang.String getSampleRand() {
        return this.sampleRand;
    }

    public java.lang.String getSampleRate() {
        return this.sampleRate;
    }

    public java.lang.String getSampled() {
        return this.sampled;
    }

    public io.sentry.protocol.SentryId getTraceId() {
        return this.traceId;
    }

    public java.lang.String getTransaction() {
        return this.transaction;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name(io.sentry.TraceContext.JsonKeys.PUBLIC_KEY).value(this.publicKey);
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.userId != null) {
            objectWriter.name(io.sentry.TraceContext.JsonKeys.USER_ID).value(this.userId);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.sampleRate != null) {
            objectWriter.name(io.sentry.TraceContext.JsonKeys.SAMPLE_RATE).value(this.sampleRate);
        }
        if (this.sampleRand != null) {
            objectWriter.name(io.sentry.TraceContext.JsonKeys.SAMPLE_RAND).value(this.sampleRand);
        }
        if (this.sampled != null) {
            objectWriter.name(io.sentry.TraceContext.JsonKeys.SAMPLED).value(this.sampled);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    @java.lang.Deprecated
    public TraceContext(io.sentry.protocol.SentryId sentryId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, io.sentry.protocol.SentryId sentryId2) {
        this(sentryId, str, str2, str3, str4, str5, str6, str7, sentryId2, null);
    }

    public TraceContext(io.sentry.protocol.SentryId sentryId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, io.sentry.protocol.SentryId sentryId2, java.lang.String str8) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.userId = str4;
        this.transaction = str5;
        this.sampleRate = str6;
        this.sampled = str7;
        this.replayId = sentryId2;
        this.sampleRand = str8;
    }

    public java.lang.String getUserId() {
        return this.userId;
    }
}
