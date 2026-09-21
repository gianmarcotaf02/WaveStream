package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public class SpanContext implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String DEFAULT_ORIGIN = "manual";
    public static final java.lang.String TYPE = "trace";
    protected io.sentry.Baggage baggage;
    protected java.util.Map<java.lang.String, java.lang.Object> data;
    protected java.lang.String description;
    private io.sentry.Instrumenter instrumenter;
    protected java.lang.String op;
    protected java.lang.String origin;
    private io.sentry.SpanId parentSpanId;
    private transient io.sentry.TracesSamplingDecision samplingDecision;
    private final io.sentry.SpanId spanId;
    protected io.sentry.SpanStatus status;
    protected java.util.Map<java.lang.String, java.lang.String> tags;
    private final io.sentry.protocol.SentryId traceId;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SpanContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SpanContext deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.lang.String strNextString = null;
            io.sentry.protocol.SentryId sentryIdDeserialize = null;
            io.sentry.SpanId spanIdDeserialize = null;
            io.sentry.SpanId spanId = null;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            java.lang.String strNextString2 = null;
            io.sentry.SpanStatus spanStatus = null;
            java.lang.String strNextString3 = null;
            java.util.Map<java.lang.String, java.lang.String> mapNewConcurrentHashMap = null;
            java.util.Map<java.lang.String, java.lang.Object> map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanIdDeserialize = new io.sentry.SpanId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "parent_span_id":
                        spanId = (io.sentry.SpanId) objectReader.nextOrNull(iLogger, new io.sentry.SpanId.Deserializer());
                        break;
                    case "description":
                        strNextString2 = objectReader.nextString();
                        break;
                    case "origin":
                        strNextString3 = objectReader.nextString();
                        break;
                    case "status":
                        spanStatus = (io.sentry.SpanStatus) objectReader.nextOrNull(iLogger, new io.sentry.SpanStatus.Deserializer());
                        break;
                    case "op":
                        strNextString = objectReader.nextString();
                        break;
                    case "data":
                        map = (java.util.Map) objectReader.nextObjectOrNull();
                        break;
                    case "tags":
                        mapNewConcurrentHashMap = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new io.sentry.protocol.SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            if (sentryIdDeserialize == null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"trace_id\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (spanIdDeserialize == null) {
                java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Missing required field \"span_id\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strNextString == null) {
                strNextString = "";
            }
            io.sentry.SpanContext spanContext = new io.sentry.SpanContext(sentryIdDeserialize, spanIdDeserialize, strNextString, spanId, null);
            spanContext.setDescription(strNextString2);
            spanContext.setStatus(spanStatus);
            spanContext.setOrigin(strNextString3);
            if (mapNewConcurrentHashMap != null) {
                spanContext.tags = mapNewConcurrentHashMap;
            }
            if (map != null) {
                spanContext.data = map;
            }
            spanContext.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return spanContext;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String DESCRIPTION = "description";
        public static final java.lang.String OP = "op";
        public static final java.lang.String ORIGIN = "origin";
        public static final java.lang.String PARENT_SPAN_ID = "parent_span_id";
        public static final java.lang.String SPAN_ID = "span_id";
        public static final java.lang.String STATUS = "status";
        public static final java.lang.String TAGS = "tags";
        public static final java.lang.String TRACE_ID = "trace_id";
    }

    public SpanContext(java.lang.String str, io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        this(new io.sentry.protocol.SentryId(), new io.sentry.SpanId(), str, null, tracesSamplingDecision);
    }

    public io.sentry.SpanContext copyForChild(java.lang.String str, io.sentry.SpanId spanId, io.sentry.SpanId spanId2) {
        io.sentry.protocol.SentryId sentryId = this.traceId;
        if (spanId2 == null) {
            spanId2 = new io.sentry.SpanId();
        }
        return new io.sentry.SpanContext(sentryId, spanId2, spanId, str, null, this.samplingDecision, null, DEFAULT_ORIGIN);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.sentry.SpanContext)) {
            return false;
        }
        io.sentry.SpanContext spanContext = (io.sentry.SpanContext) obj;
        return this.traceId.equals(spanContext.traceId) && this.spanId.equals(spanContext.spanId) && io.sentry.util.Objects.equals(this.parentSpanId, spanContext.parentSpanId) && this.op.equals(spanContext.op) && io.sentry.util.Objects.equals(this.description, spanContext.description) && getStatus() == spanContext.getStatus();
    }

    public io.sentry.Baggage getBaggage() {
        return this.baggage;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public io.sentry.Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    public java.lang.String getOperation() {
        return this.op;
    }

    public java.lang.String getOrigin() {
        return this.origin;
    }

    public io.sentry.SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public java.lang.Boolean getProfileSampled() {
        io.sentry.TracesSamplingDecision tracesSamplingDecision = this.samplingDecision;
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getProfileSampled();
    }

    public java.lang.Boolean getSampled() {
        io.sentry.TracesSamplingDecision tracesSamplingDecision = this.samplingDecision;
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    public io.sentry.TracesSamplingDecision getSamplingDecision() {
        return this.samplingDecision;
    }

    public io.sentry.SpanId getSpanId() {
        return this.spanId;
    }

    public io.sentry.SpanStatus getStatus() {
        return this.status;
    }

    public java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.tags;
    }

    public io.sentry.protocol.SentryId getTraceId() {
        return this.traceId;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.traceId, this.spanId, this.parentSpanId, this.op, this.description, getStatus());
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("trace_id");
        this.traceId.serialize(objectWriter, iLogger);
        objectWriter.name("span_id");
        this.spanId.serialize(objectWriter, iLogger);
        if (this.parentSpanId != null) {
            objectWriter.name("parent_span_id");
            this.parentSpanId.serialize(objectWriter, iLogger);
        }
        objectWriter.name("op").value(this.op);
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (getStatus() != null) {
            objectWriter.name("status").value(iLogger, getStatus());
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(iLogger, this.origin);
        }
        if (!this.tags.isEmpty()) {
            objectWriter.name("tags").value(iLogger, this.tags);
        }
        if (!this.data.isEmpty()) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setData(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.data.remove(str);
        } else {
            this.data.put(str, obj);
        }
    }

    public void setDescription(java.lang.String str) {
        this.description = str;
    }

    public void setInstrumenter(io.sentry.Instrumenter instrumenter) {
        this.instrumenter = instrumenter;
    }

    public void setOperation(java.lang.String str) {
        this.op = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "operation is required");
    }

    public void setOrigin(java.lang.String str) {
        this.origin = str;
    }

    public void setSampled(java.lang.Boolean bool) {
        if (bool == null) {
            setSamplingDecision(null);
        } else {
            setSamplingDecision(new io.sentry.TracesSamplingDecision(bool));
        }
    }

    public void setSamplingDecision(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        this.samplingDecision = tracesSamplingDecision;
        io.sentry.Baggage baggage = this.baggage;
        if (baggage != null) {
            baggage.setValuesFromSamplingDecision(tracesSamplingDecision);
        }
    }

    public void setStatus(io.sentry.SpanStatus spanStatus) {
        this.status = spanStatus;
    }

    public void setTag(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SpanContext(java.lang.String str) {
        this(new io.sentry.protocol.SentryId(), new io.sentry.SpanId(), str, null, null);
    }

    public SpanContext(io.sentry.protocol.SentryId sentryId, io.sentry.SpanId spanId, java.lang.String str, io.sentry.SpanId spanId2, io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        this(sentryId, spanId, spanId2, str, null, tracesSamplingDecision, null, DEFAULT_ORIGIN);
    }

    public void setSampled(java.lang.Boolean bool, java.lang.Boolean bool2) {
        if (bool == null) {
            setSamplingDecision(null);
        } else if (bool2 == null) {
            setSamplingDecision(new io.sentry.TracesSamplingDecision(bool));
        } else {
            setSamplingDecision(new io.sentry.TracesSamplingDecision(bool, null, bool2, null));
        }
    }

    public SpanContext(io.sentry.protocol.SentryId sentryId, io.sentry.SpanId spanId, io.sentry.SpanId spanId2, java.lang.String str, java.lang.String str2, io.sentry.TracesSamplingDecision tracesSamplingDecision, io.sentry.SpanStatus spanStatus, java.lang.String str3) {
        this.tags = new java.util.concurrent.ConcurrentHashMap();
        this.origin = DEFAULT_ORIGIN;
        this.data = new java.util.concurrent.ConcurrentHashMap();
        this.instrumenter = io.sentry.Instrumenter.SENTRY;
        this.traceId = (io.sentry.protocol.SentryId) io.sentry.util.Objects.requireNonNull(sentryId, "traceId is required");
        this.spanId = (io.sentry.SpanId) io.sentry.util.Objects.requireNonNull(spanId, "spanId is required");
        this.op = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "operation is required");
        this.parentSpanId = spanId2;
        this.description = str2;
        this.status = spanStatus;
        this.origin = str3;
        setSamplingDecision(tracesSamplingDecision);
    }

    public SpanContext(io.sentry.SpanContext spanContext) {
        this.tags = new java.util.concurrent.ConcurrentHashMap();
        this.origin = DEFAULT_ORIGIN;
        this.data = new java.util.concurrent.ConcurrentHashMap();
        this.instrumenter = io.sentry.Instrumenter.SENTRY;
        this.traceId = spanContext.traceId;
        this.spanId = spanContext.spanId;
        this.parentSpanId = spanContext.parentSpanId;
        setSamplingDecision(spanContext.samplingDecision);
        this.op = spanContext.op;
        this.description = spanContext.description;
        this.status = spanContext.status;
        java.util.Map<java.lang.String, java.lang.String> mapNewConcurrentHashMap = io.sentry.util.CollectionUtils.newConcurrentHashMap(spanContext.tags);
        if (mapNewConcurrentHashMap != null) {
            this.tags = mapNewConcurrentHashMap;
        }
    }
}
