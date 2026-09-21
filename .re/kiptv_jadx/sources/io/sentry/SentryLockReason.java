package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryLockReason implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final int ANY = 15;
    public static final int BLOCKED = 8;
    public static final int LOCKED = 1;
    public static final int SLEEPING = 4;
    public static final int WAITING = 2;
    private java.lang.String address;
    private java.lang.String className;
    private java.lang.String packageName;
    private java.lang.Long threadId;
    private int type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryLockReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryLockReason deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.SentryLockReason sentryLockReason = new io.sentry.SentryLockReason();
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "package_name":
                        sentryLockReason.packageName = objectReader.nextStringOrNull();
                        break;
                    case "thread_id":
                        sentryLockReason.threadId = objectReader.nextLongOrNull();
                        break;
                    case "address":
                        sentryLockReason.address = objectReader.nextStringOrNull();
                        break;
                    case "class_name":
                        sentryLockReason.className = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        sentryLockReason.type = objectReader.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryLockReason.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryLockReason;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ADDRESS = "address";
        public static final java.lang.String CLASS_NAME = "class_name";
        public static final java.lang.String PACKAGE_NAME = "package_name";
        public static final java.lang.String THREAD_ID = "thread_id";
        public static final java.lang.String TYPE = "type";
    }

    public SentryLockReason() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.sentry.SentryLockReason.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.Objects.equals(this.address, ((io.sentry.SentryLockReason) obj).address);
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public java.lang.String getClassName() {
        return this.className;
    }

    public java.lang.String getPackageName() {
        return this.packageName;
    }

    public java.lang.Long getThreadId() {
        return this.threadId;
    }

    public int getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.address);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(this.type);
        if (this.address != null) {
            objectWriter.name(io.sentry.SentryLockReason.JsonKeys.ADDRESS).value(this.address);
        }
        if (this.packageName != null) {
            objectWriter.name(io.sentry.SentryLockReason.JsonKeys.PACKAGE_NAME).value(this.packageName);
        }
        if (this.className != null) {
            objectWriter.name(io.sentry.SentryLockReason.JsonKeys.CLASS_NAME).value(this.className);
        }
        if (this.threadId != null) {
            objectWriter.name("thread_id").value(this.threadId);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setAddress(java.lang.String str) {
        this.address = str;
    }

    public void setClassName(java.lang.String str) {
        this.className = str;
    }

    public void setPackageName(java.lang.String str) {
        this.packageName = str;
    }

    public void setThreadId(java.lang.Long l2) {
        this.threadId = l2;
    }

    public void setType(int i3) {
        this.type = i3;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryLockReason(io.sentry.SentryLockReason sentryLockReason) {
        this.type = sentryLockReason.type;
        this.address = sentryLockReason.address;
        this.packageName = sentryLockReason.packageName;
        this.className = sentryLockReason.className;
        this.threadId = sentryLockReason.threadId;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(sentryLockReason.unknown);
    }
}
