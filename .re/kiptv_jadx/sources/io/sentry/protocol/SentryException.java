package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryException implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private io.sentry.protocol.Mechanism mechanism;
    private java.lang.String module;
    private io.sentry.protocol.SentryStackTrace stacktrace;
    private java.lang.Long threadId;
    private java.lang.String type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String value;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryException> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryException deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.SentryException sentryException = new io.sentry.protocol.SentryException();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "thread_id":
                        sentryException.threadId = objectReader.nextLongOrNull();
                        break;
                    case "module":
                        sentryException.module = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        sentryException.type = objectReader.nextStringOrNull();
                        break;
                    case "value":
                        sentryException.value = objectReader.nextStringOrNull();
                        break;
                    case "mechanism":
                        sentryException.mechanism = (io.sentry.protocol.Mechanism) objectReader.nextOrNull(iLogger, new io.sentry.protocol.Mechanism.Deserializer());
                        break;
                    case "stacktrace":
                        sentryException.stacktrace = (io.sentry.protocol.SentryStackTrace) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SentryStackTrace.Deserializer());
                        break;
                    default:
                        if (map == null) {
                            map = new java.util.HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            sentryException.setUnknown(map);
            return sentryException;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String MECHANISM = "mechanism";
        public static final java.lang.String MODULE = "module";
        public static final java.lang.String STACKTRACE = "stacktrace";
        public static final java.lang.String THREAD_ID = "thread_id";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String VALUE = "value";
    }

    public io.sentry.protocol.Mechanism getMechanism() {
        return this.mechanism;
    }

    public java.lang.String getModule() {
        return this.module;
    }

    public io.sentry.protocol.SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public java.lang.Long getThreadId() {
        return this.threadId;
    }

    public java.lang.String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.value != null) {
            objectWriter.name("value").value(this.value);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.threadId != null) {
            objectWriter.name("thread_id").value(this.threadId);
        }
        if (this.stacktrace != null) {
            objectWriter.name("stacktrace").value(iLogger, this.stacktrace);
        }
        if (this.mechanism != null) {
            objectWriter.name(io.sentry.protocol.SentryException.JsonKeys.MECHANISM).value(iLogger, this.mechanism);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setMechanism(io.sentry.protocol.Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    public void setModule(java.lang.String str) {
        this.module = str;
    }

    public void setStacktrace(io.sentry.protocol.SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setThreadId(java.lang.Long l2) {
        this.threadId = l2;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setValue(java.lang.String str) {
        this.value = str;
    }
}
