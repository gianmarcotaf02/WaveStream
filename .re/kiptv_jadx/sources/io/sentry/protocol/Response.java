package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Response implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "response";
    private java.lang.Long bodySize;
    private java.lang.String cookies;
    private java.lang.Object data;
    private java.util.Map<java.lang.String, java.lang.String> headers;
    private java.lang.Integer statusCode;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Response deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Response response = new io.sentry.protocol.Response();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "status_code":
                        response.statusCode = objectReader.nextIntegerOrNull();
                        break;
                    case "data":
                        response.data = objectReader.nextObjectOrNull();
                        break;
                    case "headers":
                        java.util.Map map = (java.util.Map) objectReader.nextObjectOrNull();
                        if (map == null) {
                            break;
                        } else {
                            response.headers = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
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
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
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
        public static final java.lang.String BODY_SIZE = "body_size";
        public static final java.lang.String COOKIES = "cookies";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String HEADERS = "headers";
        public static final java.lang.String STATUS_CODE = "status_code";
    }

    public Response() {
    }

    public java.lang.Long getBodySize() {
        return this.bodySize;
    }

    public java.lang.String getCookies() {
        return this.cookies;
    }

    public java.lang.Object getData() {
        return this.data;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public java.lang.Integer getStatusCode() {
        return this.statusCode;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.cookies != null) {
            objectWriter.name("cookies").value(this.cookies);
        }
        if (this.headers != null) {
            objectWriter.name("headers").value(iLogger, this.headers);
        }
        if (this.statusCode != null) {
            objectWriter.name(io.sentry.protocol.Response.JsonKeys.STATUS_CODE).value(iLogger, this.statusCode);
        }
        if (this.bodySize != null) {
            objectWriter.name("body_size").value(iLogger, this.bodySize);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBodySize(java.lang.Long l2) {
        this.bodySize = l2;
    }

    public void setCookies(java.lang.String str) {
        this.cookies = str;
    }

    public void setData(java.lang.Object obj) {
        this.data = obj;
    }

    public void setHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.headers = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
    }

    public void setStatusCode(java.lang.Integer num) {
        this.statusCode = num;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public Response(io.sentry.protocol.Response response) {
        this.cookies = response.cookies;
        this.headers = io.sentry.util.CollectionUtils.newConcurrentHashMap(response.headers);
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(response.unknown);
        this.statusCode = response.statusCode;
        this.bodySize = response.bodySize;
        this.data = response.data;
    }
}
