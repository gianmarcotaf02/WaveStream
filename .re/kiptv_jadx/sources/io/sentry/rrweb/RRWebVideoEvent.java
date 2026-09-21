package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public final class RRWebVideoEvent extends io.sentry.rrweb.RRWebEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String EVENT_TAG = "video";
    public static final java.lang.String REPLAY_CONTAINER = "mp4";
    public static final java.lang.String REPLAY_ENCODING = "h264";
    public static final java.lang.String REPLAY_FRAME_RATE_TYPE_CONSTANT = "constant";
    public static final java.lang.String REPLAY_FRAME_RATE_TYPE_VARIABLE = "variable";
    private java.lang.String container;
    private java.util.Map<java.lang.String, java.lang.Object> dataUnknown;
    private long durationMs;
    private java.lang.String encoding;
    private int frameCount;
    private int frameRate;
    private java.lang.String frameRateType;
    private int height;
    private int left;
    private java.util.Map<java.lang.String, java.lang.Object> payloadUnknown;
    private int segmentId;
    private long size;
    private java.lang.String tag;
    private int top;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private int width;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebVideoEvent> {
        private void deserializeData(io.sentry.rrweb.RRWebVideoEvent rRWebVideoEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebVideoEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebVideoEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebVideoEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(io.sentry.rrweb.RRWebVideoEvent rRWebVideoEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "duration":
                        rRWebVideoEvent.durationMs = objectReader.nextLong();
                        break;
                    case "segmentId":
                        rRWebVideoEvent.segmentId = objectReader.nextInt();
                        break;
                    case "height":
                        java.lang.Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.height = numNextIntegerOrNull == null ? 0 : numNextIntegerOrNull.intValue();
                        break;
                    case "container":
                        java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                        rRWebVideoEvent.container = strNextStringOrNull != null ? strNextStringOrNull : "";
                        break;
                    case "frameCount":
                        java.lang.Integer numNextIntegerOrNull2 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.frameCount = numNextIntegerOrNull2 == null ? 0 : numNextIntegerOrNull2.intValue();
                        break;
                    case "top":
                        java.lang.Integer numNextIntegerOrNull3 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.top = numNextIntegerOrNull3 == null ? 0 : numNextIntegerOrNull3.intValue();
                        break;
                    case "left":
                        java.lang.Integer numNextIntegerOrNull4 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.left = numNextIntegerOrNull4 == null ? 0 : numNextIntegerOrNull4.intValue();
                        break;
                    case "size":
                        java.lang.Long lNextLongOrNull = objectReader.nextLongOrNull();
                        rRWebVideoEvent.size = lNextLongOrNull == null ? 0L : lNextLongOrNull.longValue();
                        break;
                    case "width":
                        java.lang.Integer numNextIntegerOrNull5 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.width = numNextIntegerOrNull5 == null ? 0 : numNextIntegerOrNull5.intValue();
                        break;
                    case "frameRate":
                        java.lang.Integer numNextIntegerOrNull6 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.frameRate = numNextIntegerOrNull6 == null ? 0 : numNextIntegerOrNull6.intValue();
                        break;
                    case "encoding":
                        java.lang.String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        rRWebVideoEvent.encoding = strNextStringOrNull2 != null ? strNextStringOrNull2 : "";
                        break;
                    case "frameRateType":
                        java.lang.String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        rRWebVideoEvent.frameRateType = strNextStringOrNull3 != null ? strNextStringOrNull3 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebVideoEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebVideoEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.rrweb.RRWebVideoEvent rRWebVideoEvent = new io.sentry.rrweb.RRWebVideoEvent();
            io.sentry.rrweb.RRWebEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebEvent.Deserializer();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebVideoEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebVideoEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebVideoEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebVideoEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CONTAINER = "container";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String DURATION = "duration";
        public static final java.lang.String ENCODING = "encoding";
        public static final java.lang.String FRAME_COUNT = "frameCount";
        public static final java.lang.String FRAME_RATE = "frameRate";
        public static final java.lang.String FRAME_RATE_TYPE = "frameRateType";
        public static final java.lang.String HEIGHT = "height";
        public static final java.lang.String LEFT = "left";
        public static final java.lang.String PAYLOAD = "payload";
        public static final java.lang.String SEGMENT_ID = "segmentId";
        public static final java.lang.String SIZE = "size";
        public static final java.lang.String TOP = "top";
        public static final java.lang.String WIDTH = "width";
    }

    public RRWebVideoEvent() {
        super(io.sentry.rrweb.RRWebEventType.Custom);
        this.encoding = REPLAY_ENCODING;
        this.container = REPLAY_CONTAINER;
        this.frameRateType = REPLAY_FRAME_RATE_TYPE_CONSTANT;
        this.tag = "video";
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
        objectWriter.name(io.sentry.rrweb.RRWebVideoEvent.JsonKeys.SEGMENT_ID).value(this.segmentId);
        objectWriter.name("size").value(this.size);
        objectWriter.name("duration").value(this.durationMs);
        objectWriter.name(io.sentry.rrweb.RRWebVideoEvent.JsonKeys.ENCODING).value(this.encoding);
        objectWriter.name("container").value(this.container);
        objectWriter.name("height").value(this.height);
        objectWriter.name("width").value(this.width);
        objectWriter.name(io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_COUNT).value(this.frameCount);
        objectWriter.name(io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_RATE).value(this.frameRate);
        objectWriter.name(io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_RATE_TYPE).value(this.frameRateType);
        objectWriter.name("left").value(this.left);
        objectWriter.name(io.sentry.rrweb.RRWebVideoEvent.JsonKeys.TOP).value(this.top);
        java.util.Map<java.lang.String, java.lang.Object> map = this.payloadUnknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.payloadUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.rrweb.RRWebEvent
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.sentry.rrweb.RRWebVideoEvent.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        io.sentry.rrweb.RRWebVideoEvent rRWebVideoEvent = (io.sentry.rrweb.RRWebVideoEvent) obj;
        return this.segmentId == rRWebVideoEvent.segmentId && this.size == rRWebVideoEvent.size && this.durationMs == rRWebVideoEvent.durationMs && this.height == rRWebVideoEvent.height && this.width == rRWebVideoEvent.width && this.frameCount == rRWebVideoEvent.frameCount && this.frameRate == rRWebVideoEvent.frameRate && this.left == rRWebVideoEvent.left && this.top == rRWebVideoEvent.top && io.sentry.util.Objects.equals(this.tag, rRWebVideoEvent.tag) && io.sentry.util.Objects.equals(this.encoding, rRWebVideoEvent.encoding) && io.sentry.util.Objects.equals(this.container, rRWebVideoEvent.container) && io.sentry.util.Objects.equals(this.frameRateType, rRWebVideoEvent.frameRateType);
    }

    public java.lang.String getContainer() {
        return this.container;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public java.lang.String getEncoding() {
        return this.encoding;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public java.lang.String getFrameRateType() {
        return this.frameRateType;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLeft() {
        return this.left;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getPayloadUnknown() {
        return this.payloadUnknown;
    }

    public int getSegmentId() {
        return this.segmentId;
    }

    public long getSize() {
        return this.size;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public int getTop() {
        return this.top;
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
        return io.sentry.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.tag, java.lang.Integer.valueOf(this.segmentId), java.lang.Long.valueOf(this.size), java.lang.Long.valueOf(this.durationMs), this.encoding, this.container, java.lang.Integer.valueOf(this.height), java.lang.Integer.valueOf(this.width), java.lang.Integer.valueOf(this.frameCount), this.frameRateType, java.lang.Integer.valueOf(this.frameRate), java.lang.Integer.valueOf(this.left), java.lang.Integer.valueOf(this.top));
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

    public void setContainer(java.lang.String str) {
        this.container = str;
    }

    public void setDataUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.dataUnknown = map;
    }

    public void setDurationMs(long j) {
        this.durationMs = j;
    }

    public void setEncoding(java.lang.String str) {
        this.encoding = str;
    }

    public void setFrameCount(int i3) {
        this.frameCount = i3;
    }

    public void setFrameRate(int i3) {
        this.frameRate = i3;
    }

    public void setFrameRateType(java.lang.String str) {
        this.frameRateType = str;
    }

    public void setHeight(int i3) {
        this.height = i3;
    }

    public void setLeft(int i3) {
        this.left = i3;
    }

    public void setPayloadUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.payloadUnknown = map;
    }

    public void setSegmentId(int i3) {
        this.segmentId = i3;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    public void setTop(int i3) {
        this.top = i3;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setWidth(int i3) {
        this.width = i3;
    }
}
