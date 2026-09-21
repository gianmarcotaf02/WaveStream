package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class User implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.Map<java.lang.String, java.lang.String> data;
    private java.lang.String email;
    private io.sentry.protocol.Geo geo;
    private java.lang.String id;
    private java.lang.String ipAddress;
    private java.lang.String name;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String username;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.User deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.User user = new io.sentry.protocol.User();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "username":
                        user.username = objectReader.nextStringOrNull();
                        break;
                    case "id":
                        user.id = objectReader.nextStringOrNull();
                        break;
                    case "geo":
                        user.geo = new io.sentry.protocol.Geo.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "data":
                        user.data = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "name":
                        user.name = objectReader.nextStringOrNull();
                        break;
                    case "email":
                        user.email = objectReader.nextStringOrNull();
                        break;
                    case "ip_address":
                        user.ipAddress = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            user.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return user;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String EMAIL = "email";
        public static final java.lang.String GEO = "geo";
        public static final java.lang.String ID = "id";
        public static final java.lang.String IP_ADDRESS = "ip_address";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String USERNAME = "username";
    }

    public User() {
    }

    public static io.sentry.protocol.User fromMap(java.util.Map<java.lang.String, java.lang.Object> map, io.sentry.SentryOptions sentryOptions) {
        io.sentry.protocol.User user = new io.sentry.protocol.User();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "username":
                    user.username = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                case "id":
                    user.id = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                case "geo":
                    java.util.Map map2 = value instanceof java.util.Map ? (java.util.Map) value : null;
                    if (map2 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                        for (java.util.Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof java.lang.String) || entry2.getValue() == null) {
                                sentryOptions.getLogger().log(io.sentry.SentryLevel.WARNING, "Invalid key type in gep map.", new java.lang.Object[0]);
                            } else {
                                concurrentHashMap2.put((java.lang.String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        user.geo = io.sentry.protocol.Geo.fromMap(concurrentHashMap2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "data":
                    java.util.Map map3 = value instanceof java.util.Map ? (java.util.Map) value : null;
                    if (map3 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = new java.util.concurrent.ConcurrentHashMap();
                        for (java.util.Map.Entry entry3 : map3.entrySet()) {
                            if (!(entry3.getKey() instanceof java.lang.String) || entry3.getValue() == null) {
                                sentryOptions.getLogger().log(io.sentry.SentryLevel.WARNING, "Invalid key or null value in data map.", new java.lang.Object[0]);
                            } else {
                                concurrentHashMap3.put((java.lang.String) entry3.getKey(), entry3.getValue().toString());
                            }
                        }
                        user.data = concurrentHashMap3;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "name":
                    user.name = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                case "email":
                    user.email = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                case "ip_address":
                    user.ipAddress = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        user.unknown = concurrentHashMap;
        return user;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.User.class == obj.getClass()) {
            io.sentry.protocol.User user = (io.sentry.protocol.User) obj;
            if (io.sentry.util.Objects.equals(this.email, user.email) && io.sentry.util.Objects.equals(this.id, user.id) && io.sentry.util.Objects.equals(this.username, user.username) && io.sentry.util.Objects.equals(this.ipAddress, user.ipAddress)) {
                return true;
            }
        }
        return false;
    }

    public java.util.Map<java.lang.String, java.lang.String> getData() {
        return this.data;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public io.sentry.protocol.Geo getGeo() {
        return this.geo;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getIpAddress() {
        return this.ipAddress;
    }

    public java.lang.String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.email, this.id, this.username, this.ipAddress);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.email != null) {
            objectWriter.name("email").value(this.email);
        }
        if (this.id != null) {
            objectWriter.name("id").value(this.id);
        }
        if (this.username != null) {
            objectWriter.name(io.sentry.protocol.User.JsonKeys.USERNAME).value(this.username);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(this.ipAddress);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.geo != null) {
            objectWriter.name(io.sentry.protocol.User.JsonKeys.GEO);
            this.geo.serialize(objectWriter, iLogger);
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

    public void setData(java.util.Map<java.lang.String, java.lang.String> map) {
        this.data = io.sentry.util.CollectionUtils.newConcurrentHashMap(map);
    }

    public void setEmail(java.lang.String str) {
        this.email = str;
    }

    public void setGeo(io.sentry.protocol.Geo geo) {
        this.geo = geo;
    }

    public void setId(java.lang.String str) {
        this.id = str;
    }

    public void setIpAddress(java.lang.String str) {
        this.ipAddress = str;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setUsername(java.lang.String str) {
        this.username = str;
    }

    public User(io.sentry.protocol.User user) {
        this.email = user.email;
        this.username = user.username;
        this.id = user.id;
        this.ipAddress = user.ipAddress;
        this.name = user.name;
        this.geo = user.geo;
        this.data = io.sentry.util.CollectionUtils.newConcurrentHashMap(user.data);
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(user.unknown);
    }
}
