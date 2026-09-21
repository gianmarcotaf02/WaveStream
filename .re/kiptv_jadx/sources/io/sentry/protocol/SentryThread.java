package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryThread implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.Boolean crashed;
    private java.lang.Boolean current;
    private java.lang.Boolean daemon;
    private java.util.Map<java.lang.String, io.sentry.SentryLockReason> heldLocks;
    private java.lang.Long id;
    private java.lang.Boolean main;
    private java.lang.String name;
    private java.lang.Integer priority;
    private io.sentry.protocol.SentryStackTrace stacktrace;
    private java.lang.String state;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryThread> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryThread deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.SentryThread sentryThread = new io.sentry.protocol.SentryThread();
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "daemon":
                        sentryThread.daemon = objectReader.nextBooleanOrNull();
                        break;
                    case "priority":
                        sentryThread.priority = objectReader.nextIntegerOrNull();
                        break;
                    case "held_locks":
                        java.util.Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new io.sentry.SentryLockReason.Deserializer());
                        if (mapNextMapOrNull == null) {
                            break;
                        } else {
                            sentryThread.heldLocks = new java.util.HashMap(mapNextMapOrNull);
                            break;
                        }
                        break;
                    case "id":
                        sentryThread.id = objectReader.nextLongOrNull();
                        break;
                    case "main":
                        sentryThread.main = objectReader.nextBooleanOrNull();
                        break;
                    case "name":
                        sentryThread.name = objectReader.nextStringOrNull();
                        break;
                    case "state":
                        sentryThread.state = objectReader.nextStringOrNull();
                        break;
                    case "crashed":
                        sentryThread.crashed = objectReader.nextBooleanOrNull();
                        break;
                    case "current":
                        sentryThread.current = objectReader.nextBooleanOrNull();
                        break;
                    case "stacktrace":
                        sentryThread.stacktrace = (io.sentry.protocol.SentryStackTrace) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SentryStackTrace.Deserializer());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryThread.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryThread;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CRASHED = "crashed";
        public static final java.lang.String CURRENT = "current";
        public static final java.lang.String DAEMON = "daemon";
        public static final java.lang.String HELD_LOCKS = "held_locks";
        public static final java.lang.String ID = "id";
        public static final java.lang.String MAIN = "main";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String PRIORITY = "priority";
        public static final java.lang.String STACKTRACE = "stacktrace";
        public static final java.lang.String STATE = "state";
    }

    public java.util.Map<java.lang.String, io.sentry.SentryLockReason> getHeldLocks() {
        return this.heldLocks;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.Integer getPriority() {
        return this.priority;
    }

    public io.sentry.protocol.SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public java.lang.String getState() {
        return this.state;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.Boolean isCrashed() {
        return this.crashed;
    }

    public java.lang.Boolean isCurrent() {
        return this.current;
    }

    public java.lang.Boolean isDaemon() {
        return this.daemon;
    }

    public java.lang.Boolean isMain() {
        return this.main;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.id != null) {
            objectWriter.name("id").value(this.id);
        }
        if (this.priority != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.PRIORITY).value(this.priority);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.state != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.STATE).value(this.state);
        }
        if (this.crashed != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.CRASHED).value(this.crashed);
        }
        if (this.current != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.CURRENT).value(this.current);
        }
        if (this.daemon != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.DAEMON).value(this.daemon);
        }
        if (this.main != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.MAIN).value(this.main);
        }
        if (this.stacktrace != null) {
            objectWriter.name("stacktrace").value(iLogger, this.stacktrace);
        }
        if (this.heldLocks != null) {
            objectWriter.name(io.sentry.protocol.SentryThread.JsonKeys.HELD_LOCKS).value(iLogger, this.heldLocks);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setCrashed(java.lang.Boolean bool) {
        this.crashed = bool;
    }

    public void setCurrent(java.lang.Boolean bool) {
        this.current = bool;
    }

    public void setDaemon(java.lang.Boolean bool) {
        this.daemon = bool;
    }

    public void setHeldLocks(java.util.Map<java.lang.String, io.sentry.SentryLockReason> map) {
        this.heldLocks = map;
    }

    public void setId(java.lang.Long l2) {
        this.id = l2;
    }

    public void setMain(java.lang.Boolean bool) {
        this.main = bool;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setPriority(java.lang.Integer num) {
        this.priority = num;
    }

    public void setStacktrace(io.sentry.protocol.SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setState(java.lang.String str) {
        this.state = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
