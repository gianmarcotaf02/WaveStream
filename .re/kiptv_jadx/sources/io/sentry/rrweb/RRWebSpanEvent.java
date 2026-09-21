package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public final class RRWebSpanEvent extends io.sentry.rrweb.RRWebEvent implements io.sentry.JsonSerializable, io.sentry.JsonUnknown {
    public static final java.lang.String EVENT_TAG = "performanceSpan";
    private java.util.Map<java.lang.String, java.lang.Object> data;
    private java.util.Map<java.lang.String, java.lang.Object> dataUnknown;
    private java.lang.String description;
    private double endTimestamp;
    private java.lang.String op;
    private java.util.Map<java.lang.String, java.lang.Object> payloadUnknown;
    private double startTimestamp;
    private java.lang.String tag;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebSpanEvent> {
        private void deserializeData(io.sentry.rrweb.RRWebSpanEvent rRWebSpanEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebSpanEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebSpanEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebSpanEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(io.sentry.rrweb.RRWebSpanEvent rRWebSpanEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "description":
                        rRWebSpanEvent.description = objectReader.nextStringOrNull();
                        break;
                    case "endTimestamp":
                        rRWebSpanEvent.endTimestamp = objectReader.nextDouble();
                        break;
                    case "startTimestamp":
                        rRWebSpanEvent.startTimestamp = objectReader.nextDouble();
                        break;
                    case "op":
                        rRWebSpanEvent.op = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        java.util.Map mapNewConcurrentHashMap = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        if (mapNewConcurrentHashMap == null) {
                            break;
                        } else {
                            rRWebSpanEvent.data = mapNewConcurrentHashMap;
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
            rRWebSpanEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebSpanEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.rrweb.RRWebSpanEvent rRWebSpanEvent = new io.sentry.rrweb.RRWebSpanEvent();
            io.sentry.rrweb.RRWebEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebEvent.Deserializer();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebSpanEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebSpanEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebSpanEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebSpanEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String DESCRIPTION = "description";
        public static final java.lang.String END_TIMESTAMP = "endTimestamp";
        public static final java.lang.String OP = "op";
        public static final java.lang.String PAYLOAD = "payload";
        public static final java.lang.String START_TIMESTAMP = "startTimestamp";
    }

    public RRWebSpanEvent() {
        super(io.sentry.rrweb.RRWebEventType.Custom);
        this.tag = EVENT_TAG;
    }

    private void serializeData(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("tag").value(this.tag);
        objectWriter.name("payload");
        serializePayload(objectWriter, iLogger);
        java.util.Map<java.lang.String, java.lang.Object> map = this.dataUnknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    private void serializePayload(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.op != null) {
            objectWriter.name("op").value(this.op);
        }
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        objectWriter.name(io.sentry.rrweb.RRWebSpanEvent.JsonKeys.START_TIMESTAMP).value(iLogger, java.math.BigDecimal.valueOf(this.startTimestamp));
        objectWriter.name(io.sentry.rrweb.RRWebSpanEvent.JsonKeys.END_TIMESTAMP).value(iLogger, java.math.BigDecimal.valueOf(this.endTimestamp));
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.payloadUnknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.payloadUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public double getEndTimestamp() {
        return this.endTimestamp;
    }

    public java.lang.String getOp() {
        return this.op;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getPayloadUnknown() {
        return this.payloadUnknown;
    }

    public double getStartTimestamp() {
        return this.startTimestamp;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        new io.sentry.rrweb.RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setData(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.data = map == null ? null : new java.util.concurrent.ConcurrentHashMap(map);
    }

    public void setDataUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.dataUnknown = map;
    }

    public void setDescription(java.lang.String str) {
        this.description = str;
    }

    public void setEndTimestamp(double d4) {
        this.endTimestamp = d4;
    }

    public void setOp(java.lang.String str) {
        this.op = str;
    }

    public void setPayloadUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.payloadUnknown = map;
    }

    public void setStartTimestamp(double d4) {
        this.startTimestamp = d4;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
