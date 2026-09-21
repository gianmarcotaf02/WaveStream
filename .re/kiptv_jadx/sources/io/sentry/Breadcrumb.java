package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Breadcrumb implements io.sentry.JsonUnknown, io.sentry.JsonSerializable, java.lang.Comparable<io.sentry.Breadcrumb> {
    private java.lang.String category;
    private java.util.Map<java.lang.String, java.lang.Object> data;
    private io.sentry.SentryLevel level;
    private java.lang.String message;
    private final java.lang.Long nanos;
    private java.lang.String origin;
    private java.util.Date timestamp;
    private final java.lang.Long timestampMs;
    private java.lang.String type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.Breadcrumb> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.Breadcrumb deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.Date currentDateTime = io.sentry.DateUtils.getCurrentDateTime();
            java.util.Map concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.String strNextStringOrNull3 = null;
            java.lang.String strNextStringOrNull4 = null;
            io.sentry.SentryLevel sentryLevelDeserialize = null;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "origin":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        java.util.Map mapNewConcurrentHashMap = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        if (mapNewConcurrentHashMap == null) {
                            break;
                        } else {
                            concurrentHashMap = mapNewConcurrentHashMap;
                            break;
                        }
                        break;
                    case "type":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        java.util.Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            currentDateTime = dateNextDateOrNull;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            sentryLevelDeserialize = new io.sentry.SentryLevel.Deserializer().deserialize(objectReader, iLogger);
                            break;
                        } catch (java.lang.Exception e6) {
                            iLogger.log(io.sentry.SentryLevel.ERROR, e6, "Error when deserializing SentryLevel", new java.lang.Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap2, strNextName);
                        break;
                }
            }
            io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb(currentDateTime);
            breadcrumb.message = strNextStringOrNull;
            breadcrumb.type = strNextStringOrNull2;
            breadcrumb.data = concurrentHashMap;
            breadcrumb.category = strNextStringOrNull3;
            breadcrumb.origin = strNextStringOrNull4;
            breadcrumb.level = sentryLevelDeserialize;
            breadcrumb.setUnknown(concurrentHashMap2);
            objectReader.endObject();
            return breadcrumb;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CATEGORY = "category";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String LEVEL = "level";
        public static final java.lang.String MESSAGE = "message";
        public static final java.lang.String ORIGIN = "origin";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TYPE = "type";
    }

    public Breadcrumb(java.util.Date date) {
        this.data = new java.util.concurrent.ConcurrentHashMap();
        this.nanos = java.lang.Long.valueOf(java.lang.System.nanoTime());
        this.timestamp = date;
        this.timestampMs = null;
    }

    public static io.sentry.Breadcrumb debug(java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("debug");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(io.sentry.SentryLevel.DEBUG);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb error(java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("error");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(io.sentry.SentryLevel.ERROR);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb fromMap(java.util.Map<java.lang.String, java.lang.Object> map, io.sentry.SentryOptions sentryOptions) {
        java.util.Date dateDateOrNull;
        java.util.Date currentDateTime = io.sentry.DateUtils.getCurrentDateTime();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        io.sentry.SentryLevel sentryLevelValueOf = null;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = null;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "origin":
                    if (!(value instanceof java.lang.String)) {
                        str4 = null;
                        break;
                    } else {
                        str4 = (java.lang.String) value;
                        break;
                    }
                    break;
                case "data":
                    java.util.Map map2 = value instanceof java.util.Map ? (java.util.Map) value : null;
                    if (map2 == null) {
                        break;
                    } else {
                        for (java.util.Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof java.lang.String) || entry2.getValue() == null) {
                                sentryOptions.getLogger().log(io.sentry.SentryLevel.WARNING, "Invalid key or null value in data map.", new java.lang.Object[0]);
                            } else {
                                concurrentHashMap.put((java.lang.String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        break;
                    }
                    break;
                case "type":
                    if (!(value instanceof java.lang.String)) {
                        str2 = null;
                        break;
                    } else {
                        str2 = (java.lang.String) value;
                        break;
                    }
                    break;
                case "category":
                    if (!(value instanceof java.lang.String)) {
                        str3 = null;
                        break;
                    } else {
                        str3 = (java.lang.String) value;
                        break;
                    }
                    break;
                case "timestamp":
                    if ((value instanceof java.lang.String) && (dateDateOrNull = io.sentry.ObjectReader.dateOrNull((java.lang.String) value, sentryOptions.getLogger())) != null) {
                        currentDateTime = dateDateOrNull;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "level":
                    java.lang.String str5 = value instanceof java.lang.String ? (java.lang.String) value : null;
                    if (str5 == null) {
                        break;
                    } else {
                        try {
                            sentryLevelValueOf = io.sentry.SentryLevel.valueOf(str5.toUpperCase(java.util.Locale.ROOT));
                        } catch (java.lang.Exception unused) {
                        }
                        break;
                    }
                    break;
                case "message":
                    if (!(value instanceof java.lang.String)) {
                        str = null;
                        break;
                    } else {
                        str = (java.lang.String) value;
                        break;
                    }
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                    }
                    concurrentHashMap2.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb(currentDateTime);
        breadcrumb.message = str;
        breadcrumb.type = str2;
        breadcrumb.data = concurrentHashMap;
        breadcrumb.category = str3;
        breadcrumb.origin = str4;
        breadcrumb.level = sentryLevelValueOf;
        breadcrumb.setUnknown(concurrentHashMap2);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb graphqlDataFetcher(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("graphql");
        breadcrumb.setCategory("graphql.fetcher");
        if (str != null) {
            breadcrumb.setData("path", str);
        }
        if (str2 != null) {
            breadcrumb.setData("field", str2);
        }
        if (str3 != null) {
            breadcrumb.setData("type", str3);
        }
        if (str4 != null) {
            breadcrumb.setData("object_type", str4);
        }
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb graphqlDataLoader(java.lang.Iterable<?> iterable, java.lang.Class<?> cls, java.lang.Class<?> cls2, java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("graphql");
        breadcrumb.setCategory("graphql.data_loader");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        breadcrumb.setData("keys", arrayList);
        if (cls != null) {
            breadcrumb.setData("key_type", cls.getName());
        }
        if (cls2 != null) {
            breadcrumb.setData("value_type", cls2.getName());
        }
        if (str != null) {
            breadcrumb.setData("name", str);
        }
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb graphqlOperation(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("graphql");
        if (str != null) {
            breadcrumb.setData("operation_name", str);
        }
        if (str2 != null) {
            breadcrumb.setData("operation_type", str2);
            breadcrumb.setCategory(str2);
        } else {
            breadcrumb.setCategory("graphql.operation");
        }
        if (str3 != null) {
            breadcrumb.setData("operation_id", str3);
        }
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb http(java.lang.String str, java.lang.String str2) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        io.sentry.util.UrlUtils.UrlDetails urlDetails = io.sentry.util.UrlUtils.parse(str);
        breadcrumb.setType("http");
        breadcrumb.setCategory("http");
        if (urlDetails.getUrl() != null) {
            breadcrumb.setData(io.sentry.protocol.Request.JsonKeys.URL, urlDetails.getUrl());
        }
        breadcrumb.setData(io.sentry.protocol.Request.JsonKeys.METHOD, str2.toUpperCase(java.util.Locale.ROOT));
        if (urlDetails.getQuery() != null) {
            breadcrumb.setData(io.sentry.SpanDataConvention.HTTP_QUERY_KEY, urlDetails.getQuery());
        }
        if (urlDetails.getFragment() != null) {
            breadcrumb.setData(io.sentry.SpanDataConvention.HTTP_FRAGMENT_KEY, urlDetails.getFragment());
        }
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb info(java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("info");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(io.sentry.SentryLevel.INFO);
        return breadcrumb;
    }

    private static io.sentry.SentryLevel levelFromHttpStatusCode(java.lang.Integer num) {
        if (io.sentry.util.HttpUtils.isHttpClientError(num.intValue())) {
            return io.sentry.SentryLevel.WARNING;
        }
        if (io.sentry.util.HttpUtils.isHttpServerError(num.intValue())) {
            return io.sentry.SentryLevel.ERROR;
        }
        return null;
    }

    public static io.sentry.Breadcrumb navigation(java.lang.String str, java.lang.String str2) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setCategory("navigation");
        breadcrumb.setType("navigation");
        breadcrumb.setData("from", str);
        breadcrumb.setData("to", str2);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb query(java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("query");
        breadcrumb.setMessage(str);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb transaction(java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("default");
        breadcrumb.setCategory("sentry.transaction");
        breadcrumb.setMessage(str);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb ui(java.lang.String str, java.lang.String str2) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("default");
        breadcrumb.setCategory("ui." + str);
        breadcrumb.setMessage(str2);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb user(java.lang.String str, java.lang.String str2) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType(io.sentry.SentryBaseEvent.JsonKeys.USER);
        breadcrumb.setCategory(str);
        breadcrumb.setMessage(str2);
        return breadcrumb;
    }

    public static io.sentry.Breadcrumb userInteraction(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return userInteraction(str, str2, str3, java.util.Collections.EMPTY_MAP);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.Breadcrumb.class == obj.getClass()) {
            io.sentry.Breadcrumb breadcrumb = (io.sentry.Breadcrumb) obj;
            if (getTimestamp().getTime() == breadcrumb.getTimestamp().getTime() && io.sentry.util.Objects.equals(this.message, breadcrumb.message) && io.sentry.util.Objects.equals(this.type, breadcrumb.type) && io.sentry.util.Objects.equals(this.category, breadcrumb.category) && io.sentry.util.Objects.equals(this.origin, breadcrumb.origin) && this.level == breadcrumb.level) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getCategory() {
        return this.category;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public io.sentry.SentryLevel getLevel() {
        return this.level;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.lang.String getOrigin() {
        return this.origin;
    }

    public java.util.Date getTimestamp() {
        java.util.Date date = this.timestamp;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        java.lang.Long l2 = this.timestampMs;
        if (l2 == null) {
            throw new java.lang.IllegalStateException("No timestamp set for breadcrumb");
        }
        java.util.Date dateTime = io.sentry.DateUtils.getDateTime(l2.longValue());
        this.timestamp = dateTime;
        return dateTime;
    }

    public java.lang.String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.timestamp, this.message, this.type, this.category, this.origin, this.level);
    }

    public void removeData(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.data.remove(str);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, getTimestamp());
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        objectWriter.name("data").value(iLogger, this.data);
        if (this.category != null) {
            objectWriter.name("category").value(this.category);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(this.origin);
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setCategory(java.lang.String str) {
        this.category = str;
    }

    public void setData(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            removeData(str);
        } else {
            this.data.put(str, obj);
        }
    }

    public void setLevel(io.sentry.SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public void setOrigin(java.lang.String str) {
        this.origin = str;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public static io.sentry.Breadcrumb userInteraction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.Object> map) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType(io.sentry.SentryBaseEvent.JsonKeys.USER);
        breadcrumb.setCategory("ui." + str);
        if (str2 != null) {
            breadcrumb.setData("view.id", str2);
        }
        if (str3 != null) {
            breadcrumb.setData("view.class", str3);
        }
        if (str4 != null) {
            breadcrumb.setData("view.tag", str4);
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            breadcrumb.getData().put(entry.getKey(), entry.getValue());
        }
        breadcrumb.setLevel(io.sentry.SentryLevel.INFO);
        return breadcrumb;
    }

    @Override // java.lang.Comparable
    public int compareTo(io.sentry.Breadcrumb breadcrumb) {
        return this.nanos.compareTo(breadcrumb.nanos);
    }

    public java.lang.Object getData(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.data.get(str);
    }

    public Breadcrumb(long j) {
        this.data = new java.util.concurrent.ConcurrentHashMap();
        this.nanos = java.lang.Long.valueOf(java.lang.System.nanoTime());
        this.timestampMs = java.lang.Long.valueOf(j);
        this.timestamp = null;
    }

    public Breadcrumb(io.sentry.Breadcrumb breadcrumb) {
        this.data = new java.util.concurrent.ConcurrentHashMap();
        this.nanos = java.lang.Long.valueOf(java.lang.System.nanoTime());
        this.timestamp = breadcrumb.timestamp;
        this.timestampMs = breadcrumb.timestampMs;
        this.message = breadcrumb.message;
        this.type = breadcrumb.type;
        this.category = breadcrumb.category;
        this.origin = breadcrumb.origin;
        java.util.Map<java.lang.String, java.lang.Object> mapNewConcurrentHashMap = io.sentry.util.CollectionUtils.newConcurrentHashMap(breadcrumb.data);
        if (mapNewConcurrentHashMap != null) {
            this.data = mapNewConcurrentHashMap;
        }
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(breadcrumb.unknown);
        this.level = breadcrumb.level;
    }

    public static io.sentry.Breadcrumb userInteraction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.Object> map) {
        return userInteraction(str, str2, str3, null, map);
    }

    public static io.sentry.Breadcrumb http(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        io.sentry.Breadcrumb breadcrumbHttp = http(str, str2);
        if (num != null) {
            breadcrumbHttp.setData(io.sentry.protocol.Response.JsonKeys.STATUS_CODE, num);
            breadcrumbHttp.setLevel(levelFromHttpStatusCode(num));
        }
        return breadcrumbHttp;
    }

    public Breadcrumb() {
        this(java.lang.System.currentTimeMillis());
    }

    public Breadcrumb(java.lang.String str) {
        this();
        this.message = str;
    }
}
