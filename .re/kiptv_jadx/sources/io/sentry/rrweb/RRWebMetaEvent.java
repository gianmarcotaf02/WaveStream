package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public final class RRWebMetaEvent extends io.sentry.rrweb.RRWebEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.Map<java.lang.String, java.lang.Object> dataUnknown;
    private int height;
    private java.lang.String href;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private int width;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebMetaEvent> {
        private void deserializeData(io.sentry.rrweb.RRWebMetaEvent rRWebMetaEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "height":
                        java.lang.Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        rRWebMetaEvent.height = numNextIntegerOrNull == null ? 0 : numNextIntegerOrNull.intValue();
                        break;
                    case "href":
                        java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            strNextStringOrNull = "";
                        }
                        rRWebMetaEvent.href = strNextStringOrNull;
                        break;
                    case "width":
                        java.lang.Integer numNextIntegerOrNull2 = objectReader.nextIntegerOrNull();
                        rRWebMetaEvent.width = numNextIntegerOrNull2 == null ? 0 : numNextIntegerOrNull2.intValue();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebMetaEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebMetaEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.rrweb.RRWebMetaEvent rRWebMetaEvent = new io.sentry.rrweb.RRWebMetaEvent();
            io.sentry.rrweb.RRWebEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebEvent.Deserializer();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebMetaEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebMetaEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebMetaEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebMetaEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String HEIGHT = "height";
        public static final java.lang.String HREF = "href";
        public static final java.lang.String WIDTH = "width";
    }

    public RRWebMetaEvent() {
        super(io.sentry.rrweb.RRWebEventType.Meta);
        this.href = "";
    }

    private void serializeData(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(io.sentry.rrweb.RRWebMetaEvent.JsonKeys.HREF).value(this.href);
        objectWriter.name("height").value(this.height);
        objectWriter.name("width").value(this.width);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.rrweb.RRWebEvent
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.sentry.rrweb.RRWebMetaEvent.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        io.sentry.rrweb.RRWebMetaEvent rRWebMetaEvent = (io.sentry.rrweb.RRWebMetaEvent) obj;
        return this.height == rRWebMetaEvent.height && this.width == rRWebMetaEvent.width && io.sentry.util.Objects.equals(this.href, rRWebMetaEvent.href);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getHeight() {
        return this.height;
    }

    public java.lang.String getHref() {
        return this.href;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // io.sentry.rrweb.RRWebEvent
    public int hashCode() {
        return io.sentry.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.href, java.lang.Integer.valueOf(this.height), java.lang.Integer.valueOf(this.width));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        new io.sentry.rrweb.RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        objectWriter.endObject();
    }

    public void setDataUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.dataUnknown = map;
    }

    public void setHeight(int i3) {
        this.height = i3;
    }

    public void setHref(java.lang.String str) {
        this.href = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setWidth(int i3) {
        this.width = i3;
    }
}
