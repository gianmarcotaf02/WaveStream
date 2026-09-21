package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DebugMeta implements JsonUnknown, JsonSerializable {
    private List<DebugImage> images;
    private SdkInfo sdkInfo;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<DebugMeta> {
        @Override
        public DebugMeta deserialize(ObjectReader objectReader, ILogger iLogger) {
            DebugMeta debugMeta = new DebugMeta();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(JsonKeys.IMAGES)) {
                    debugMeta.images = objectReader.nextListOrNull(iLogger, new DebugImage.Deserializer());
                } else if (strNextName.equals(JsonKeys.SDK_INFO)) {
                    debugMeta.sdkInfo = (SdkInfo) objectReader.nextOrNull(iLogger, new SdkInfo.Deserializer());
                } else {
                    if (map == null) {
                        map = new HashMap();
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
        public static final String IMAGES = "images";
        public static final String SDK_INFO = "sdk_info";
    }

    public List<DebugImage> getImages() {
        return this.images;
    }

    public SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sdkInfo != null) {
            objectWriter.name(JsonKeys.SDK_INFO).value(iLogger, this.sdkInfo);
        }
        if (this.images != null) {
            objectWriter.name(JsonKeys.IMAGES).value(iLogger, this.images);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setImages(List<DebugImage> list) {
        this.images = list != null ? new ArrayList(list) : null;
    }

    public void setSdkInfo(SdkInfo sdkInfo) {
        this.sdkInfo = sdkInfo;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
