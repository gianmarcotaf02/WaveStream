package io.sentry;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class SentryEnvelopeHeader implements JsonSerializable, JsonUnknown {
    private final SentryId eventId;
    private final SdkVersion sdkVersion;
    private Date sentAt;
    private final TraceContext traceContext;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<SentryEnvelopeHeader> {
        @Override
        public SentryEnvelopeHeader deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            SentryId sentryId = null;
            SdkVersion sdkVersion = null;
            TraceContext traceContext = null;
            Date dateNextDateOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk":
                        sdkVersion = (SdkVersion) objectReader.nextOrNull(iLogger, new SdkVersion.Deserializer());
                        break;
                    case "trace":
                        traceContext = (TraceContext) objectReader.nextOrNull(iLogger, new TraceContext.Deserializer());
                        break;
                    case "event_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    case "sent_at":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            SentryEnvelopeHeader sentryEnvelopeHeader = new SentryEnvelopeHeader(sentryId, sdkVersion, traceContext);
            sentryEnvelopeHeader.setSentAt(dateNextDateOrNull);
            sentryEnvelopeHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeHeader;
        }
    }

    public static final class JsonKeys {
        public static final String EVENT_ID = "event_id";
        public static final String SDK = "sdk";
        public static final String SENT_AT = "sent_at";
        public static final String TRACE = "trace";
    }

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion) {
        this(sentryId, sdkVersion, null);
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public Date getSentAt() {
        return this.sentAt;
    }

    public TraceContext getTraceContext() {
        return this.traceContext;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
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
            objectWriter.name(JsonKeys.SENT_AT).value(iLogger, DateUtils.getTimestamp(this.sentAt));
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setSentAt(Date date) {
        this.sentAt = date;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion, TraceContext traceContext) {
        this.eventId = sentryId;
        this.sdkVersion = sdkVersion;
        this.traceContext = traceContext;
    }

    public SentryEnvelopeHeader(SentryId sentryId) {
        this(sentryId, null);
    }

    public SentryEnvelopeHeader() {
        this(new SentryId());
    }
}
