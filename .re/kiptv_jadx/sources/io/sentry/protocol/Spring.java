package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Spring implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "spring";
    private java.lang.String[] activeProfiles;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Spring> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Spring deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Spring spring = new io.sentry.protocol.Spring();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(io.sentry.protocol.Spring.JsonKeys.ACTIVE_PROFILES)) {
                    java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
                    if (list != null) {
                        java.lang.String[] strArr = new java.lang.String[list.size()];
                        list.toArray(strArr);
                        spring.activeProfiles = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            spring.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return spring;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ACTIVE_PROFILES = "active_profiles";
    }

    public Spring() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.sentry.protocol.Spring.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.activeProfiles, ((io.sentry.protocol.Spring) obj).activeProfiles);
    }

    public java.lang.String[] getActiveProfiles() {
        return this.activeProfiles;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.activeProfiles);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.activeProfiles != null) {
            objectWriter.name(io.sentry.protocol.Spring.JsonKeys.ACTIVE_PROFILES).value(iLogger, this.activeProfiles);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setActiveProfiles(java.lang.String[] strArr) {
        this.activeProfiles = strArr;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public Spring(io.sentry.protocol.Spring spring) {
        this.activeProfiles = spring.activeProfiles;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(spring.unknown);
    }
}
