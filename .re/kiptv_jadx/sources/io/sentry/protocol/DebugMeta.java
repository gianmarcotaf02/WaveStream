package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugMeta implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.List<io.sentry.protocol.DebugImage> images;
    private io.sentry.protocol.SdkInfo sdkInfo;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.DebugMeta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.DebugMeta deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.DebugMeta debugMeta = new io.sentry.protocol.DebugMeta();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(io.sentry.protocol.DebugMeta.JsonKeys.IMAGES)) {
                    debugMeta.images = objectReader.nextListOrNull(iLogger, new io.sentry.protocol.DebugImage.Deserializer());
                } else if (strNextName.equals(io.sentry.protocol.DebugMeta.JsonKeys.SDK_INFO)) {
                    debugMeta.sdkInfo = (io.sentry.protocol.SdkInfo) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SdkInfo.Deserializer());
                } else {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            debugMeta.setUnknown(map);
            return debugMeta;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String IMAGES = "images";
        public static final java.lang.String SDK_INFO = "sdk_info";
    }

    public java.util.List<io.sentry.protocol.DebugImage> getImages() {
        return this.images;
    }

    public io.sentry.protocol.SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sdkInfo != null) {
            objectWriter.name(io.sentry.protocol.DebugMeta.JsonKeys.SDK_INFO).value(iLogger, this.sdkInfo);
        }
        if (this.images != null) {
            objectWriter.name(io.sentry.protocol.DebugMeta.JsonKeys.IMAGES).value(iLogger, this.images);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setImages(java.util.List<io.sentry.protocol.DebugImage> list) {
        this.images = list != null ? new java.util.ArrayList(list) : null;
    }

    public void setSdkInfo(io.sentry.protocol.SdkInfo sdkInfo) {
        this.sdkInfo = sdkInfo;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
