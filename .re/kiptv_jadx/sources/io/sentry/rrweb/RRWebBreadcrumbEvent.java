package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public final class RRWebBreadcrumbEvent extends io.sentry.rrweb.RRWebEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String EVENT_TAG = "breadcrumb";
    private double breadcrumbTimestamp;
    private java.lang.String breadcrumbType;
    private java.lang.String category;
    private java.util.Map<java.lang.String, java.lang.Object> data;
    private java.util.Map<java.lang.String, java.lang.Object> dataUnknown;
    private io.sentry.SentryLevel level;
    private java.lang.String message;
    private java.util.Map<java.lang.String, java.lang.Object> payloadUnknown;
    private java.lang.String tag;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebBreadcrumbEvent> {
        private void deserializeData(io.sentry.rrweb.RRWebBreadcrumbEvent rRWebBreadcrumbEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebBreadcrumbEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebBreadcrumbEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebBreadcrumbEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(io.sentry.rrweb.RRWebBreadcrumbEvent rRWebBreadcrumbEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "data":
                        java.util.Map mapNewConcurrentHashMap = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        if (mapNewConcurrentHashMap == null) {
                            break;
                        } else {
                            rRWebBreadcrumbEvent.data = mapNewConcurrentHashMap;
                            break;
                        }
                        break;
                    case "type":
                        rRWebBreadcrumbEvent.breadcrumbType = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        rRWebBreadcrumbEvent.category = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        rRWebBreadcrumbEvent.breadcrumbTimestamp = objectReader.nextDouble();
                        break;
                    case "level":
                        try {
                            rRWebBreadcrumbEvent.level = new io.sentry.SentryLevel.Deserializer().deserialize(objectReader, iLogger);
                            break;
                        } catch (java.lang.Exception e6) {
                            iLogger.log(io.sentry.SentryLevel.DEBUG, e6, "Error when deserializing SentryLevel", new java.lang.Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        rRWebBreadcrumbEvent.message = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebBreadcrumbEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebBreadcrumbEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.rrweb.RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new io.sentry.rrweb.RRWebBreadcrumbEvent();
            io.sentry.rrweb.RRWebEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebEvent.Deserializer();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebBreadcrumbEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebBreadcrumbEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebBreadcrumbEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebBreadcrumbEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CATEGORY = "category";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String LEVEL = "level";
        public static final java.lang.String MESSAGE = "message";
        public static final java.lang.String PAYLOAD = "payload";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TYPE = "type";
    }

    public RRWebBreadcrumbEvent() {
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
        if (this.breadcrumbType != null) {
            objectWriter.name("type").value(this.breadcrumbType);
        }
        objectWriter.name("timestamp").value(iLogger, java.math.BigDecimal.valueOf(this.breadcrumbTimestamp));
        if (this.category != null) {
            objectWriter.name("category").value(this.category);
        }
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
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

    public double getBreadcrumbTimestamp() {
        return this.breadcrumbTimestamp;
    }

    public java.lang.String getBreadcrumbType() {
        return this.breadcrumbType;
    }

    public java.lang.String getCategory() {
        return this.category;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public io.sentry.SentryLevel getLevel() {
        return this.level;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getPayloadUnknown() {
        return this.payloadUnknown;
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

    public void setBreadcrumbTimestamp(double d4) {
        this.breadcrumbTimestamp = d4;
    }

    public void setBreadcrumbType(java.lang.String str) {
        this.breadcrumbType = str;
    }

    public void setCategory(java.lang.String str) {
        this.category = str;
    }

    public void setData(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.data = map == null ? null : new java.util.concurrent.ConcurrentHashMap(map);
    }

    public void setDataUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.dataUnknown = map;
    }

    public void setLevel(io.sentry.SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public void setPayloadUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.payloadUnknown = map;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
