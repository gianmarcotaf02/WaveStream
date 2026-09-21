package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class OperatingSystem implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "os";
    private java.lang.String build;
    private java.lang.String kernelVersion;
    private java.lang.String name;
    private java.lang.String rawDescription;
    private java.lang.Boolean rooted;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String version;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.OperatingSystem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.OperatingSystem deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.OperatingSystem operatingSystem = new io.sentry.protocol.OperatingSystem();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rooted":
                        operatingSystem.rooted = objectReader.nextBooleanOrNull();
                        break;
                    case "raw_description":
                        operatingSystem.rawDescription = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        operatingSystem.name = objectReader.nextStringOrNull();
                        break;
                    case "build":
                        operatingSystem.build = objectReader.nextStringOrNull();
                        break;
                    case "version":
                        operatingSystem.version = objectReader.nextStringOrNull();
                        break;
                    case "kernel_version":
                        operatingSystem.kernelVersion = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            operatingSystem.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return operatingSystem;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String BUILD = "build";
        public static final java.lang.String KERNEL_VERSION = "kernel_version";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String RAW_DESCRIPTION = "raw_description";
        public static final java.lang.String ROOTED = "rooted";
        public static final java.lang.String VERSION = "version";
    }

    public OperatingSystem() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.OperatingSystem.class == obj.getClass()) {
            io.sentry.protocol.OperatingSystem operatingSystem = (io.sentry.protocol.OperatingSystem) obj;
            if (io.sentry.util.Objects.equals(this.name, operatingSystem.name) && io.sentry.util.Objects.equals(this.version, operatingSystem.version) && io.sentry.util.Objects.equals(this.rawDescription, operatingSystem.rawDescription) && io.sentry.util.Objects.equals(this.build, operatingSystem.build) && io.sentry.util.Objects.equals(this.kernelVersion, operatingSystem.kernelVersion) && io.sentry.util.Objects.equals(this.rooted, operatingSystem.rooted)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getBuild() {
        return this.build;
    }

    public java.lang.String getKernelVersion() {
        return this.kernelVersion;
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

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.name, this.version, this.rawDescription, this.build, this.kernelVersion, this.rooted);
    }

    public java.lang.Boolean isRooted() {
        return this.rooted;
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
        if (this.build != null) {
            objectWriter.name(io.sentry.protocol.OperatingSystem.JsonKeys.BUILD).value(this.build);
        }
        if (this.kernelVersion != null) {
            objectWriter.name(io.sentry.protocol.OperatingSystem.JsonKeys.KERNEL_VERSION).value(this.kernelVersion);
        }
        if (this.rooted != null) {
            objectWriter.name(io.sentry.protocol.OperatingSystem.JsonKeys.ROOTED).value(this.rooted);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBuild(java.lang.String str) {
        this.build = str;
    }

    public void setKernelVersion(java.lang.String str) {
        this.kernelVersion = str;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setRawDescription(java.lang.String str) {
        this.rawDescription = str;
    }

    public void setRooted(java.lang.Boolean bool) {
        this.rooted = bool;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVersion(java.lang.String str) {
        this.version = str;
    }

    public OperatingSystem(io.sentry.protocol.OperatingSystem operatingSystem) {
        this.name = operatingSystem.name;
        this.version = operatingSystem.version;
        this.rawDescription = operatingSystem.rawDescription;
        this.build = operatingSystem.build;
        this.kernelVersion = operatingSystem.kernelVersion;
        this.rooted = operatingSystem.rooted;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(operatingSystem.unknown);
    }
}
