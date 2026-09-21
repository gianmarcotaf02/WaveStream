package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryStackTrace implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.List<io.sentry.protocol.SentryStackFrame> frames;
    private java.util.Map<java.lang.String, java.lang.String> registers;
    private java.lang.Boolean snapshot;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryStackTrace> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryStackTrace deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.SentryStackTrace sentryStackTrace = new io.sentry.protocol.SentryStackTrace();
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        sentryStackTrace.frames = objectReader.nextListOrNull(iLogger, new io.sentry.protocol.SentryStackFrame.Deserializer());
                        break;
                    case "registers":
                        sentryStackTrace.registers = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "snapshot":
                        sentryStackTrace.snapshot = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackTrace.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackTrace;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String FRAMES = "frames";
        public static final java.lang.String REGISTERS = "registers";
        public static final java.lang.String SNAPSHOT = "snapshot";
    }

    public SentryStackTrace() {
    }

    public java.util.List<io.sentry.protocol.SentryStackFrame> getFrames() {
        return this.frames;
    }

    public java.util.Map<java.lang.String, java.lang.String> getRegisters() {
        return this.registers;
    }

    public java.lang.Boolean getSnapshot() {
        return this.snapshot;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.frames != null) {
            objectWriter.name(io.sentry.protocol.SentryStackTrace.JsonKeys.FRAMES).value(iLogger, this.frames);
        }
        if (this.registers != null) {
            objectWriter.name(io.sentry.protocol.SentryStackTrace.JsonKeys.REGISTERS).value(iLogger, this.registers);
        }
        if (this.snapshot != null) {
            objectWriter.name(io.sentry.protocol.SentryStackTrace.JsonKeys.SNAPSHOT).value(this.snapshot);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setFrames(java.util.List<io.sentry.protocol.SentryStackFrame> list) {
        this.frames = list;
    }

    public void setRegisters(java.util.Map<java.lang.String, java.lang.String> map) {
        this.registers = map;
    }

    public void setSnapshot(java.lang.Boolean bool) {
        this.snapshot = bool;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryStackTrace(java.util.List<io.sentry.protocol.SentryStackFrame> list) {
        this.frames = list;
    }
}
