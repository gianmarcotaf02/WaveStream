package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeHeader implements io.sentry.JsonSerializable, io.sentry.JsonUnknown {
    private final io.sentry.protocol.SentryId eventId;
    private final io.sentry.protocol.SdkVersion sdkVersion;
    private java.util.Date sentAt;
    private final io.sentry.TraceContext traceContext;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryEnvelopeHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryEnvelopeHeader deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.SentryId sentryId = null;
            io.sentry.protocol.SdkVersion sdkVersion = null;
            io.sentry.TraceContext traceContext = null;
            java.util.Date dateNextDateOrNull = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk":
                        sdkVersion = (io.sentry.protocol.SdkVersion) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SdkVersion.Deserializer());
                        break;
                    case "trace":
                        traceContext = (io.sentry.TraceContext) objectReader.nextOrNull(iLogger, new io.sentry.TraceContext.Deserializer());
                        break;
                    case "event_id":
                        sentryId = (io.sentry.protocol.SentryId) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SentryId.Deserializer());
                        break;
                    case "sent_at":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new java.util.HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            io.sentry.SentryEnvelopeHeader sentryEnvelopeHeader = new io.sentry.SentryEnvelopeHeader(sentryId, sdkVersion, traceContext);
            sentryEnvelopeHeader.setSentAt(dateNextDateOrNull);
            sentryEnvelopeHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeHeader;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String SDK = "sdk";
        public static final java.lang.String SENT_AT = "sent_at";
        public static final java.lang.String TRACE = "trace";
    }

    public SentryEnvelopeHeader(io.sentry.protocol.SentryId sentryId, io.sentry.protocol.SdkVersion sdkVersion) {
        this(sentryId, sdkVersion, null);
    }

    public io.sentry.protocol.SentryId getEventId() {
        return this.eventId;
    }

    public io.sentry.protocol.SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public java.util.Date getSentAt() {
        return this.sentAt;
    }

    public io.sentry.TraceContext getTraceContext() {
        return this.traceContext;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.eventId != null) {
            objectWriter.name("event_id").value(iLogger, this.eventId);
        }
        if (this.sdkVersion != null) {
            objectWriter.name("sdk").value(iLogger, this.sdkVersion);
        }
        if (this.traceContext != null) {
            objectWriter.name("trace").value(iLogger, this.traceContext);
        }
        if (this.sentAt != null) {
            objectWriter.name(io.sentry.SentryEnvelopeHeader.JsonKeys.SENT_AT).value(iLogger, io.sentry.DateUtils.getTimestamp(this.sentAt));
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setSentAt(java.util.Date date) {
        this.sentAt = date;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeHeader(io.sentry.protocol.SentryId sentryId, io.sentry.protocol.SdkVersion sdkVersion, io.sentry.TraceContext traceContext) {
        this.eventId = sentryId;
        this.sdkVersion = sdkVersion;
        this.traceContext = traceContext;
    }

    public SentryEnvelopeHeader(io.sentry.protocol.SentryId sentryId) {
        this(sentryId, null);
    }

    public SentryEnvelopeHeader() {
        this(new io.sentry.protocol.SentryId());
    }
}
