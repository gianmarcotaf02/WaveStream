package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Message implements JsonUnknown, JsonSerializable {
    private String formatted;
    private String message;
    private List<String> params;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<Message> {
        @Override
        public Message deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            Message message = new Message();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "params":
                        List list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            message.params = list;
                            break;
                        }
                        break;
                    case "message":
                        message.message = objectReader.nextStringOrNull();
                        break;
                    case "formatted":
                        message.formatted = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            message.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return message;
        }
    }

    public static final class JsonKeys {
        public static final String FORMATTED = "formatted";
        public static final String MESSAGE = "message";
        public static final String PARAMS = "params";
    }

    public String getFormatted() {
        return this.formatted;
    }

    public String getMessage() {
        return this.message;
    }

    public List<String> getParams() {
        return this.params;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.formatted != null) {
            objectWriter.name(JsonKeys.FORMATTED).value(this.formatted);
        }
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        List<String> list = this.params;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.PARAMS).value(iLogger, this.params);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setFormatted(String str) {
        this.formatted = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setParams(List<String> list) {
        this.params = CollectionUtils.newArrayList(list);
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
