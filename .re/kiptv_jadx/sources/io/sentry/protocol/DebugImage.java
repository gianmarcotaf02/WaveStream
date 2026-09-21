package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugImage implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String JVM = "jvm";
    public static final java.lang.String PROGUARD = "proguard";
    private java.lang.String arch;
    private java.lang.String codeFile;
    private java.lang.String codeId;
    private java.lang.String debugFile;
    private java.lang.String debugId;
    private java.lang.String imageAddr;
    private java.lang.Long imageSize;
    private java.lang.String type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String uuid;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.DebugImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.DebugImage deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.DebugImage debugImage = new io.sentry.protocol.DebugImage();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "debug_file":
                        debugImage.debugFile = objectReader.nextStringOrNull();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = objectReader.nextStringOrNull();
                        break;
                    case "image_size":
                        debugImage.imageSize = objectReader.nextLongOrNull();
                        break;
                    case "code_file":
                        debugImage.codeFile = objectReader.nextStringOrNull();
                        break;
                    case "arch":
                        debugImage.arch = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        debugImage.type = objectReader.nextStringOrNull();
                        break;
                    case "uuid":
                        debugImage.uuid = objectReader.nextStringOrNull();
                        break;
                    case "debug_id":
                        debugImage.debugId = objectReader.nextStringOrNull();
                        break;
                    case "code_id":
                        debugImage.codeId = objectReader.nextStringOrNull();
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
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ARCH = "arch";
        public static final java.lang.String CODE_FILE = "code_file";
        public static final java.lang.String CODE_ID = "code_id";
        public static final java.lang.String DEBUG_FILE = "debug_file";
        public static final java.lang.String DEBUG_ID = "debug_id";
        public static final java.lang.String IMAGE_ADDR = "image_addr";
        public static final java.lang.String IMAGE_SIZE = "image_size";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String UUID = "uuid";
    }

    public java.lang.String getArch() {
        return this.arch;
    }

    public java.lang.String getCodeFile() {
        return this.codeFile;
    }

    public java.lang.String getCodeId() {
        return this.codeId;
    }

    public java.lang.String getDebugFile() {
        return this.debugFile;
    }

    public java.lang.String getDebugId() {
        return this.debugId;
    }

    public java.lang.String getImageAddr() {
        return this.imageAddr;
    }

    public java.lang.Long getImageSize() {
        return this.imageSize;
    }

    public java.lang.String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.uuid != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.UUID).value(this.uuid);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.debugId != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.DEBUG_ID).value(this.debugId);
        }
        if (this.debugFile != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.DEBUG_FILE).value(this.debugFile);
        }
        if (this.codeId != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.CODE_ID).value(this.codeId);
        }
        if (this.codeFile != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.CODE_FILE).value(this.codeFile);
        }
        if (this.imageAddr != null) {
            objectWriter.name("image_addr").value(this.imageAddr);
        }
        if (this.imageSize != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.IMAGE_SIZE).value(this.imageSize);
        }
        if (this.arch != null) {
            objectWriter.name(io.sentry.protocol.DebugImage.JsonKeys.ARCH).value(this.arch);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setArch(java.lang.String str) {
        this.arch = str;
    }

    public void setCodeFile(java.lang.String str) {
        this.codeFile = str;
    }

    public void setCodeId(java.lang.String str) {
        this.codeId = str;
    }

    public void setDebugFile(java.lang.String str) {
        this.debugFile = str;
    }

    public void setDebugId(java.lang.String str) {
        this.debugId = str;
    }

    public void setImageAddr(java.lang.String str) {
        this.imageAddr = str;
    }

    public void setImageSize(java.lang.Long l2) {
        this.imageSize = l2;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setUuid(java.lang.String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = java.lang.Long.valueOf(j);
    }
}
