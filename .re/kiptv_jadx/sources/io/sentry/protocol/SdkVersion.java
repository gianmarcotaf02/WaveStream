package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SdkVersion implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.Set<java.lang.String> deserializedIntegrations;
    private java.util.Set<io.sentry.protocol.SentryPackage> deserializedPackages;
    private java.lang.String name;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String version;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SdkVersion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SdkVersion deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            objectReader.beginObject();
            java.lang.String strNextString = null;
            java.lang.String strNextString2 = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "name":
                        strNextString = objectReader.nextString();
                        break;
                    case "version":
                        strNextString2 = objectReader.nextString();
                        break;
                    case "packages":
                        java.util.List listNextListOrNull = objectReader.nextListOrNull(iLogger, new io.sentry.protocol.SentryPackage.Deserializer());
                        if (listNextListOrNull == null) {
                            break;
                        } else {
                            arrayList.addAll(listNextListOrNull);
                            break;
                        }
                        break;
                    case "integrations":
                        java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
            if (strNextString == null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"name\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextString2 == null) {
                java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Missing required field \"version\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            io.sentry.protocol.SdkVersion sdkVersion = new io.sentry.protocol.SdkVersion(strNextString, strNextString2);
            sdkVersion.deserializedPackages = new java.util.concurrent.CopyOnWriteArraySet(arrayList);
            sdkVersion.deserializedIntegrations = new java.util.concurrent.CopyOnWriteArraySet(arrayList2);
            sdkVersion.setUnknown(map);
            return sdkVersion;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String INTEGRATIONS = "integrations";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String PACKAGES = "packages";
        public static final java.lang.String VERSION = "version";
    }

    public SdkVersion(java.lang.String str, java.lang.String str2) {
        this.name = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "name is required.");
        this.version = (java.lang.String) io.sentry.util.Objects.requireNonNull(str2, "version is required.");
    }

    public static io.sentry.protocol.SdkVersion updateSdkVersion(io.sentry.protocol.SdkVersion sdkVersion, java.lang.String str, java.lang.String str2) {
        io.sentry.util.Objects.requireNonNull(str, "name is required.");
        io.sentry.util.Objects.requireNonNull(str2, "version is required.");
        if (sdkVersion == null) {
            return new io.sentry.protocol.SdkVersion(str, str2);
        }
        sdkVersion.setName(str);
        sdkVersion.setVersion(str2);
        return sdkVersion;
    }

    public void addIntegration(java.lang.String str) {
        io.sentry.SentryIntegrationPackageStorage.getInstance().addIntegration(str);
    }

    public void addPackage(java.lang.String str, java.lang.String str2) {
        io.sentry.SentryIntegrationPackageStorage.getInstance().addPackage(str, str2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.SdkVersion.class == obj.getClass()) {
            io.sentry.protocol.SdkVersion sdkVersion = (io.sentry.protocol.SdkVersion) obj;
            if (this.name.equals(sdkVersion.name) && this.version.equals(sdkVersion.version)) {
                return true;
            }
        }
        return false;
    }

    public java.util.Set<java.lang.String> getIntegrationSet() {
        java.util.Set<java.lang.String> set = this.deserializedIntegrations;
        return set != null ? set : io.sentry.SentryIntegrationPackageStorage.getInstance().getIntegrations();
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.util.Set<io.sentry.protocol.SentryPackage> getPackageSet() {
        java.util.Set<io.sentry.protocol.SentryPackage> set = this.deserializedPackages;
        return set != null ? set : io.sentry.SentryIntegrationPackageStorage.getInstance().getPackages();
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
        objectWriter.name("name").value(this.name);
        objectWriter.name("version").value(this.version);
        java.util.Set<io.sentry.protocol.SentryPackage> packageSet = getPackageSet();
        java.util.Set<java.lang.String> integrationSet = getIntegrationSet();
        if (!packageSet.isEmpty()) {
            objectWriter.name(io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES).value(iLogger, packageSet);
        }
        if (!integrationSet.isEmpty()) {
            objectWriter.name(io.sentry.protocol.SdkVersion.JsonKeys.INTEGRATIONS).value(iLogger, integrationSet);
        }
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
