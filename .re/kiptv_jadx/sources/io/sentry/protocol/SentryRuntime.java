package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryRuntime implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "runtime";
    private java.lang.String name;
    private java.lang.String rawDescription;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String version;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryRuntime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryRuntime deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.SentryRuntime sentryRuntime = new io.sentry.protocol.SentryRuntime();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "raw_description":
                        sentryRuntime.rawDescription = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        sentryRuntime.name = objectReader.nextStringOrNull();
                        break;
                    case "version":
                        sentryRuntime.version = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryRuntime.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryRuntime;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String NAME = "name";
        public static final java.lang.String RAW_DESCRIPTION = "raw_description";
        public static final java.lang.String VERSION = "version";
    }

    public SentryRuntime() {
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getRawDescription() {
        return this.rawDescription;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.version != null) {
            objectWriter.name("version").value(this.version);
        }
        if (this.rawDescription != null) {
            objectWriter.name("raw_description").value(this.rawDescription);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setRawDescription(java.lang.String str) {
        this.rawDescription = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVersion(java.lang.String str) {
        this.version = str;
    }

    public SentryRuntime(io.sentry.protocol.SentryRuntime sentryRuntime) {
        this.name = sentryRuntime.name;
        this.version = sentryRuntime.version;
        this.rawDescription = sentryRuntime.rawDescription;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(sentryRuntime.unknown);
    }
}
