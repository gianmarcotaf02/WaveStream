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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Response implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "response";
    private Long bodySize;
    private String cookies;
    private Object data;
    private Map<String, String> headers;
    private Integer statusCode;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<Response> {
        @Override
        public Response deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            Response response = new Response();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "status_code":
                        response.statusCode = objectReader.nextIntegerOrNull();
                        break;
                    case "data":
                        response.data = objectReader.nextObjectOrNull();
                        break;
                    case "headers":
                        Map map = (Map) objectReader.nextObjectOrNull();
                        if (map == null) {
                            break;
                        } else {
                            response.headers = CollectionUtils.newConcurrentHashMap(map);
                            break;
                        }
                        break;
                    case "cookies":
                        response.cookies = objectReader.nextStringOrNull();
                        break;
                    case "body_size":
                        response.bodySize = objectReader.nextLongOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            response.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return response;
        }
    }

    public static final class JsonKeys {
        public static final String BODY_SIZE = "body_size";
        public static final String COOKIES = "cookies";
        public static final String DATA = "data";
        public static final String HEADERS = "headers";
        public static final String STATUS_CODE = "status_code";
    }

    public Response() {
    }

    public Long getBodySize() {
        return this.bodySize;
    }

    public String getCookies() {
        return this.cookies;
    }

    public Object getData() {
        return this.data;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.cookies != null) {
            objectWriter.name("cookies").value(this.cookies);
        }
        if (this.headers != null) {
            objectWriter.name("headers").value(iLogger, this.headers);
        }
        if (this.statusCode != null) {
            objectWriter.name(JsonKeys.STATUS_CODE).value(iLogger, this.statusCode);
        }
        if (this.bodySize != null) {
            objectWriter.name("body_size").value(iLogger, this.bodySize);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBodySize(Long l2) {
        this.bodySize = l2;
    }

    public void setCookies(String str) {
        this.cookies = str;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public Response(Response response) {
        this.cookies = response.cookies;
        this.headers = CollectionUtils.newConcurrentHashMap(response.headers);
        this.unknown = CollectionUtils.newConcurrentHashMap(response.unknown);
        this.statusCode = response.statusCode;
        this.bodySize = response.bodySize;
        this.data = response.data;
    }
}
