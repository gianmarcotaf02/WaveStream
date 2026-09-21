package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryPackage implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String name;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String version;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryPackage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryPackage deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.lang.String strNextString = null;
            java.lang.String strNextString2 = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("name")) {
                    strNextString = objectReader.nextString();
                } else if (strNextName.equals("version")) {
                    strNextString2 = objectReader.nextString();
                } else {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (strNextString == null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"name\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextString2 != null) {
                io.sentry.protocol.SentryPackage sentryPackage = new io.sentry.protocol.SentryPackage(strNextString, strNextString2);
                sentryPackage.setUnknown(map);
                return sentryPackage;
            }
            java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Missing required field \"version\"");
            iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String NAME = "name";
        public static final java.lang.String VERSION = "version";
    }

    public SentryPackage(java.lang.String str, java.lang.String str2) {
        this.name = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "name is required.");
        this.version = (java.lang.String) io.sentry.util.Objects.requireNonNull(str2, "version is required.");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.SentryPackage.class == obj.getClass()) {
            io.sentry.protocol.SentryPackage sentryPackage = (io.sentry.protocol.SentryPackage) obj;
            if (java.util.Objects.equals(this.name, sentryPackage.name) && java.util.Objects.equals(this.version, sentryPackage.version)) {
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
        return java.util.Objects.hash(this.name, this.version);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("name").value(this.name);
        objectWriter.name("version").value(this.version);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setName(java.lang.String str) {
        this.name = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "name is required.");
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVersion(java.lang.String str) {
        this.version = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "version is required.");
    }
}
