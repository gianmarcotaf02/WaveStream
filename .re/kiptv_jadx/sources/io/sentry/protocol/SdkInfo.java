package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SdkInfo implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String sdkName;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.Integer versionMajor;
    private java.lang.Integer versionMinor;
    private java.lang.Integer versionPatchlevel;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SdkInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SdkInfo deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.SdkInfo sdkInfo = new io.sentry.protocol.SdkInfo();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk_name":
                        sdkInfo.sdkName = objectReader.nextStringOrNull();
                        break;
                    case "version_patchlevel":
                        sdkInfo.versionPatchlevel = objectReader.nextIntegerOrNull();
                        break;
                    case "version_major":
                        sdkInfo.versionMajor = objectReader.nextIntegerOrNull();
                        break;
                    case "version_minor":
                        sdkInfo.versionMinor = objectReader.nextIntegerOrNull();
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
            sdkInfo.setUnknown(map);
            return sdkInfo;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String SDK_NAME = "sdk_name";
        public static final java.lang.String VERSION_MAJOR = "version_major";
        public static final java.lang.String VERSION_MINOR = "version_minor";
        public static final java.lang.String VERSION_PATCHLEVEL = "version_patchlevel";
    }

    public java.lang.String getSdkName() {
        return this.sdkName;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.Integer getVersionMajor() {
        return this.versionMajor;
    }

    public java.lang.Integer getVersionMinor() {
        return this.versionMinor;
    }

    public java.lang.Integer getVersionPatchlevel() {
        return this.versionPatchlevel;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sdkName != null) {
            objectWriter.name(io.sentry.protocol.SdkInfo.JsonKeys.SDK_NAME).value(this.sdkName);
        }
        if (this.versionMajor != null) {
            objectWriter.name(io.sentry.protocol.SdkInfo.JsonKeys.VERSION_MAJOR).value(this.versionMajor);
        }
        if (this.versionMinor != null) {
            objectWriter.name(io.sentry.protocol.SdkInfo.JsonKeys.VERSION_MINOR).value(this.versionMinor);
        }
        if (this.versionPatchlevel != null) {
            objectWriter.name(io.sentry.protocol.SdkInfo.JsonKeys.VERSION_PATCHLEVEL).value(this.versionPatchlevel);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setSdkName(java.lang.String str) {
        this.sdkName = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVersionMajor(java.lang.Integer num) {
        this.versionMajor = num;
    }

    public void setVersionMinor(java.lang.Integer num) {
        this.versionMinor = num;
    }

    public void setVersionPatchlevel(java.lang.Integer num) {
        this.versionPatchlevel = num;
    }
}
