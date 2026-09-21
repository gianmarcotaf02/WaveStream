package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Gpu implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "gpu";
    private java.lang.String apiType;
    private java.lang.Integer id;
    private java.lang.Integer memorySize;
    private java.lang.Boolean multiThreadedRendering;
    private java.lang.String name;
    private java.lang.String npotSupport;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String vendorId;
    private java.lang.String vendorName;
    private java.lang.String version;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Gpu> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Gpu deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Gpu gpu = new io.sentry.protocol.Gpu();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "npot_support":
                        gpu.npotSupport = objectReader.nextStringOrNull();
                        break;
                    case "vendor_id":
                        gpu.vendorId = objectReader.nextStringOrNull();
                        break;
                    case "multi_threaded_rendering":
                        gpu.multiThreadedRendering = objectReader.nextBooleanOrNull();
                        break;
                    case "id":
                        gpu.id = objectReader.nextIntegerOrNull();
                        break;
                    case "name":
                        gpu.name = objectReader.nextStringOrNull();
                        break;
                    case "vendor_name":
                        gpu.vendorName = objectReader.nextStringOrNull();
                        break;
                    case "version":
                        gpu.version = objectReader.nextStringOrNull();
                        break;
                    case "api_type":
                        gpu.apiType = objectReader.nextStringOrNull();
                        break;
                    case "memory_size":
                        gpu.memorySize = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            gpu.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return gpu;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String API_TYPE = "api_type";
        public static final java.lang.String ID = "id";
        public static final java.lang.String MEMORY_SIZE = "memory_size";
        public static final java.lang.String MULTI_THREADED_RENDERING = "multi_threaded_rendering";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String NPOT_SUPPORT = "npot_support";
        public static final java.lang.String VENDOR_ID = "vendor_id";
        public static final java.lang.String VENDOR_NAME = "vendor_name";
        public static final java.lang.String VERSION = "version";
    }

    public Gpu() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.Gpu.class == obj.getClass()) {
            io.sentry.protocol.Gpu gpu = (io.sentry.protocol.Gpu) obj;
            if (io.sentry.util.Objects.equals(this.name, gpu.name) && io.sentry.util.Objects.equals(this.id, gpu.id) && io.sentry.util.Objects.equals(this.vendorId, gpu.vendorId) && io.sentry.util.Objects.equals(this.vendorName, gpu.vendorName) && io.sentry.util.Objects.equals(this.memorySize, gpu.memorySize) && io.sentry.util.Objects.equals(this.apiType, gpu.apiType) && io.sentry.util.Objects.equals(this.multiThreadedRendering, gpu.multiThreadedRendering) && io.sentry.util.Objects.equals(this.version, gpu.version) && io.sentry.util.Objects.equals(this.npotSupport, gpu.npotSupport)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getApiType() {
        return this.apiType;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.Integer getMemorySize() {
        return this.memorySize;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getNpotSupport() {
        return this.npotSupport;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getVendorId() {
        return this.vendorId;
    }

    public java.lang.String getVendorName() {
        return this.vendorName;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.name, this.id, this.vendorId, this.vendorName, this.memorySize, this.apiType, this.multiThreadedRendering, this.version, this.npotSupport);
    }

    public java.lang.Boolean isMultiThreadedRendering() {
        return this.multiThreadedRendering;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.id != null) {
            objectWriter.name("id").value(this.id);
        }
        if (this.vendorId != null) {
            objectWriter.name(io.sentry.protocol.Gpu.JsonKeys.VENDOR_ID).value(this.vendorId);
        }
        if (this.vendorName != null) {
            objectWriter.name(io.sentry.protocol.Gpu.JsonKeys.VENDOR_NAME).value(this.vendorName);
        }
        if (this.memorySize != null) {
            objectWriter.name("memory_size").value(this.memorySize);
        }
        if (this.apiType != null) {
            objectWriter.name(io.sentry.protocol.Gpu.JsonKeys.API_TYPE).value(this.apiType);
        }
        if (this.multiThreadedRendering != null) {
            objectWriter.name(io.sentry.protocol.Gpu.JsonKeys.MULTI_THREADED_RENDERING).value(this.multiThreadedRendering);
        }
        if (this.version != null) {
            objectWriter.name("version").value(this.version);
        }
        if (this.npotSupport != null) {
            objectWriter.name(io.sentry.protocol.Gpu.JsonKeys.NPOT_SUPPORT).value(this.npotSupport);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setApiType(java.lang.String str) {
        this.apiType = str;
    }

    public void setId(java.lang.Integer num) {
        this.id = num;
    }

    public void setMemorySize(java.lang.Integer num) {
        this.memorySize = num;
    }

    public void setMultiThreadedRendering(java.lang.Boolean bool) {
        this.multiThreadedRendering = bool;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setNpotSupport(java.lang.String str) {
        this.npotSupport = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVendorId(java.lang.String str) {
        this.vendorId = str;
    }

    public void setVendorName(java.lang.String str) {
        this.vendorName = str;
    }

    public void setVersion(java.lang.String str) {
        this.version = str;
    }

    public Gpu(io.sentry.protocol.Gpu gpu) {
        this.name = gpu.name;
        this.id = gpu.id;
        this.vendorId = gpu.vendorId;
        this.vendorName = gpu.vendorName;
        this.memorySize = gpu.memorySize;
        this.apiType = gpu.apiType;
        this.multiThreadedRendering = gpu.multiThreadedRendering;
        this.version = gpu.version;
        this.npotSupport = gpu.npotSupport;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(gpu.unknown);
    }
}
