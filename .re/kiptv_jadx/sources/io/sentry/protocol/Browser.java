package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Browser implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "browser";
    private java.lang.String name;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String version;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Browser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Browser deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Browser browser = new io.sentry.protocol.Browser();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("name")) {
                    browser.name = objectReader.nextStringOrNull();
                } else if (strNextName.equals("version")) {
                    browser.version = objectReader.nextStringOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            browser.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return browser;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String NAME = "name";
        public static final java.lang.String VERSION = "version";
    }

    public Browser() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.Browser.class == obj.getClass()) {
            io.sentry.protocol.Browser browser = (io.sentry.protocol.Browser) obj;
            if (io.sentry.util.Objects.equals(this.name, browser.name) && io.sentry.util.Objects.equals(this.version, browser.version)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.name, this.version);
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

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVersion(java.lang.String str) {
        this.version = str;
    }

    public Browser(io.sentry.protocol.Browser browser) {
        this.name = browser.name;
        this.version = browser.version;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(browser.unknown);
    }
}
