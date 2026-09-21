package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Request implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String apiTarget;
    private java.lang.Long bodySize;
    private java.lang.String cookies;
    private java.lang.Object data;
    private java.util.Map<java.lang.String, java.lang.String> env;
    private java.lang.String fragment;
    private java.util.Map<java.lang.String, java.lang.String> headers;
    private java.lang.String method;
    private java.util.Map<java.lang.String, java.lang.String> other;
    private java.lang.String queryString;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String url;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Request> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Request deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Request request = new io.sentry.protocol.Request();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fragment":
                        request.fragment = objectReader.nextStringOrNull();
                        break;
                    case "method":
                        request.method = objectReader.nextStringOrNull();
                        break;
                    case "env":
                        java.util.Map map = (java.util.Map) objectReader.nextObjectOrNull();
                        if (map == null) {
                            break;
                        } else {
                            request.env = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
                            break;
                        }
                        break;
                    case "url":
                        request.url = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        request.data = objectReader.nextObjectOrNull();
                        break;
                    case "other":
                        java.util.Map map2 = (java.util.Map) objectReader.nextObjectOrNull();
                        if (map2 == null) {
                            break;
                        } else {
                            request.other = io.sentry.util.CollectionUtils.newConcurrentHashMap(map2);
                            break;
                        }
                        break;
                    case "headers":
                        java.util.Map map3 = (java.util.Map) objectReader.nextObjectOrNull();
                        if (map3 == null) {
                            break;
                        } else {
                            request.headers = io.sentry.util.CollectionUtils.newConcurrentHashMap(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        request.cookies = objectReader.nextStringOrNull();
                        break;
                    case "body_size":
                        request.bodySize = objectReader.nextLongOrNull();
                        break;
                    case "query_string":
                        request.queryString = objectReader.nextStringOrNull();
                        break;
                    case "api_target":
                        request.apiTarget = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            request.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return request;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String API_TARGET = "api_target";
        public static final java.lang.String BODY_SIZE = "body_size";
        public static final java.lang.String COOKIES = "cookies";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String ENV = "env";
        public static final java.lang.String FRAGMENT = "fragment";
        public static final java.lang.String HEADERS = "headers";
        public static final java.lang.String METHOD = "method";
        public static final java.lang.String OTHER = "other";
        public static final java.lang.String QUERY_STRING = "query_string";
        public static final java.lang.String URL = "url";
    }

    public Request() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.Request.class == obj.getClass()) {
            io.sentry.protocol.Request request = (io.sentry.protocol.Request) obj;
            if (io.sentry.util.Objects.equals(this.url, request.url) && io.sentry.util.Objects.equals(this.method, request.method) && io.sentry.util.Objects.equals(this.queryString, request.queryString) && io.sentry.util.Objects.equals(this.cookies, request.cookies) && io.sentry.util.Objects.equals(this.headers, request.headers) && io.sentry.util.Objects.equals(this.env, request.env) && io.sentry.util.Objects.equals(this.bodySize, request.bodySize) && io.sentry.util.Objects.equals(this.fragment, request.fragment) && io.sentry.util.Objects.equals(this.apiTarget, request.apiTarget)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getApiTarget() {
        return this.apiTarget;
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

    public java.util.Map<java.lang.String, java.lang.String> getEnvs() {
        return this.env;
    }

    public java.lang.String getFragment() {
        return this.fragment;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public java.lang.String getMethod() {
        return this.method;
    }

    public java.util.Map<java.lang.String, java.lang.String> getOthers() {
        return this.other;
    }

    public java.lang.String getQueryString() {
        return this.queryString;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.url, this.method, this.queryString, this.cookies, this.headers, this.env, this.bodySize, this.fragment, this.apiTarget);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.url != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.URL).value(this.url);
        }
        if (this.method != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.METHOD).value(this.method);
        }
        if (this.queryString != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.QUERY_STRING).value(this.queryString);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (this.cookies != null) {
            objectWriter.name("cookies").value(this.cookies);
        }
        if (this.headers != null) {
            objectWriter.name("headers").value(iLogger, this.headers);
        }
        if (this.env != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.ENV).value(iLogger, this.env);
        }
        if (this.other != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.OTHER).value(iLogger, this.other);
        }
        if (this.fragment != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.FRAGMENT).value(iLogger, this.fragment);
        }
        if (this.bodySize != null) {
            objectWriter.name("body_size").value(iLogger, this.bodySize);
        }
        if (this.apiTarget != null) {
            objectWriter.name(io.sentry.protocol.Request.JsonKeys.API_TARGET).value(iLogger, this.apiTarget);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setApiTarget(java.lang.String str) {
        this.apiTarget = str;
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

    public void setEnvs(java.util.Map<java.lang.String, java.lang.String> map) {
        this.env = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
    }

    public void setFragment(java.lang.String str) {
        this.fragment = str;
    }

    public void setHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.headers = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
    }

    public void setMethod(java.lang.String str) {
        this.method = str;
    }

    public void setOthers(java.util.Map<java.lang.String, java.lang.String> map) {
        this.other = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
    }

    public void setQueryString(java.lang.String str) {
        this.queryString = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }

    public Request(io.sentry.protocol.Request request) {
        this.url = request.url;
        this.cookies = request.cookies;
        this.method = request.method;
        this.queryString = request.queryString;
        this.headers = io.sentry.util.CollectionUtils.newConcurrentHashMap(request.headers);
        this.env = io.sentry.util.CollectionUtils.newConcurrentHashMap(request.env);
        this.other = io.sentry.util.CollectionUtils.newConcurrentHashMap(request.other);
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(request.unknown);
        this.data = request.data;
        this.fragment = request.fragment;
        this.bodySize = request.bodySize;
        this.apiTarget = request.apiTarget;
    }
}
