package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Device implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "device";
    private java.lang.String[] archs;
    private java.lang.Float batteryLevel;
    private java.lang.Float batteryTemperature;
    private java.util.Date bootTime;
    private java.lang.String brand;
    private java.lang.Boolean charging;
    private java.lang.String connectionType;
    private java.lang.String cpuDescription;
    private java.lang.Long externalFreeStorage;
    private java.lang.Long externalStorageSize;
    private java.lang.String family;
    private java.lang.Long freeMemory;
    private java.lang.Long freeStorage;
    private java.lang.String id;
    private java.lang.String locale;
    private java.lang.Boolean lowMemory;
    private java.lang.String manufacturer;
    private java.lang.Long memorySize;
    private java.lang.String model;
    private java.lang.String modelId;
    private java.lang.String name;
    private java.lang.Boolean online;
    private io.sentry.protocol.Device.DeviceOrientation orientation;
    private java.lang.Integer processorCount;
    private java.lang.Double processorFrequency;
    private java.lang.Float screenDensity;
    private java.lang.Integer screenDpi;
    private java.lang.Integer screenHeightPixels;
    private java.lang.Integer screenWidthPixels;
    private java.lang.Boolean simulator;
    private java.lang.Long storageSize;
    private java.util.TimeZone timezone;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.Long usableMemory;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Device> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Device deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Device device = new io.sentry.protocol.Device();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "timezone":
                        device.timezone = objectReader.nextTimeZoneOrNull(iLogger);
                        break;
                    case "boot_time":
                        if (objectReader.peek() != io.sentry.vendor.gson.stream.JsonToken.STRING) {
                            break;
                        } else {
                            device.bootTime = objectReader.nextDateOrNull(iLogger);
                            break;
                        }
                        break;
                    case "simulator":
                        device.simulator = objectReader.nextBooleanOrNull();
                        break;
                    case "manufacturer":
                        device.manufacturer = objectReader.nextStringOrNull();
                        break;
                    case "processor_count":
                        device.processorCount = objectReader.nextIntegerOrNull();
                        break;
                    case "orientation":
                        device.orientation = (io.sentry.protocol.Device.DeviceOrientation) objectReader.nextOrNull(iLogger, new io.sentry.protocol.Device.DeviceOrientation.Deserializer());
                        break;
                    case "battery_temperature":
                        device.batteryTemperature = objectReader.nextFloatOrNull();
                        break;
                    case "family":
                        device.family = objectReader.nextStringOrNull();
                        break;
                    case "locale":
                        device.locale = objectReader.nextStringOrNull();
                        break;
                    case "online":
                        device.online = objectReader.nextBooleanOrNull();
                        break;
                    case "battery_level":
                        device.batteryLevel = objectReader.nextFloatOrNull();
                        break;
                    case "model_id":
                        device.modelId = objectReader.nextStringOrNull();
                        break;
                    case "screen_density":
                        device.screenDensity = objectReader.nextFloatOrNull();
                        break;
                    case "screen_dpi":
                        device.screenDpi = objectReader.nextIntegerOrNull();
                        break;
                    case "free_memory":
                        device.freeMemory = objectReader.nextLongOrNull();
                        break;
                    case "id":
                        device.id = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        device.name = objectReader.nextStringOrNull();
                        break;
                    case "low_memory":
                        device.lowMemory = objectReader.nextBooleanOrNull();
                        break;
                    case "archs":
                        java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            java.lang.String[] strArr = new java.lang.String[list.size()];
                            list.toArray(strArr);
                            device.archs = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        device.brand = objectReader.nextStringOrNull();
                        break;
                    case "model":
                        device.model = objectReader.nextStringOrNull();
                        break;
                    case "cpu_description":
                        device.cpuDescription = objectReader.nextStringOrNull();
                        break;
                    case "processor_frequency":
                        device.processorFrequency = objectReader.nextDoubleOrNull();
                        break;
                    case "connection_type":
                        device.connectionType = objectReader.nextStringOrNull();
                        break;
                    case "screen_width_pixels":
                        device.screenWidthPixels = objectReader.nextIntegerOrNull();
                        break;
                    case "external_storage_size":
                        device.externalStorageSize = objectReader.nextLongOrNull();
                        break;
                    case "storage_size":
                        device.storageSize = objectReader.nextLongOrNull();
                        break;
                    case "usable_memory":
                        device.usableMemory = objectReader.nextLongOrNull();
                        break;
                    case "memory_size":
                        device.memorySize = objectReader.nextLongOrNull();
                        break;
                    case "charging":
                        device.charging = objectReader.nextBooleanOrNull();
                        break;
                    case "external_free_storage":
                        device.externalFreeStorage = objectReader.nextLongOrNull();
                        break;
                    case "free_storage":
                        device.freeStorage = objectReader.nextLongOrNull();
                        break;
                    case "screen_height_pixels":
                        device.screenHeightPixels = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            device.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return device;
        }
    }

    public enum DeviceOrientation implements io.sentry.JsonSerializable {
        PORTRAIT,
        LANDSCAPE;

        public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Device.DeviceOrientation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public io.sentry.protocol.Device.DeviceOrientation deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
                return io.sentry.protocol.Device.DeviceOrientation.valueOf(objectReader.nextString().toUpperCase(java.util.Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.value(toString().toLowerCase(java.util.Locale.ROOT));
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ARCHS = "archs";
        public static final java.lang.String BATTERY_LEVEL = "battery_level";
        public static final java.lang.String BATTERY_TEMPERATURE = "battery_temperature";
        public static final java.lang.String BOOT_TIME = "boot_time";
        public static final java.lang.String BRAND = "brand";
        public static final java.lang.String CHARGING = "charging";
        public static final java.lang.String CONNECTION_TYPE = "connection_type";
        public static final java.lang.String CPU_DESCRIPTION = "cpu_description";
        public static final java.lang.String EXTERNAL_FREE_STORAGE = "external_free_storage";
        public static final java.lang.String EXTERNAL_STORAGE_SIZE = "external_storage_size";
        public static final java.lang.String FAMILY = "family";
        public static final java.lang.String FREE_MEMORY = "free_memory";
        public static final java.lang.String FREE_STORAGE = "free_storage";
        public static final java.lang.String ID = "id";
        public static final java.lang.String LOCALE = "locale";
        public static final java.lang.String LOW_MEMORY = "low_memory";
        public static final java.lang.String MANUFACTURER = "manufacturer";
        public static final java.lang.String MEMORY_SIZE = "memory_size";
        public static final java.lang.String MODEL = "model";
        public static final java.lang.String MODEL_ID = "model_id";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String ONLINE = "online";
        public static final java.lang.String ORIENTATION = "orientation";
        public static final java.lang.String PROCESSOR_COUNT = "processor_count";
        public static final java.lang.String PROCESSOR_FREQUENCY = "processor_frequency";
        public static final java.lang.String SCREEN_DENSITY = "screen_density";
        public static final java.lang.String SCREEN_DPI = "screen_dpi";
        public static final java.lang.String SCREEN_HEIGHT_PIXELS = "screen_height_pixels";
        public static final java.lang.String SCREEN_WIDTH_PIXELS = "screen_width_pixels";
        public static final java.lang.String SIMULATOR = "simulator";
        public static final java.lang.String STORAGE_SIZE = "storage_size";
        public static final java.lang.String TIMEZONE = "timezone";
        public static final java.lang.String USABLE_MEMORY = "usable_memory";
    }

    public Device() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.Device.class == obj.getClass()) {
            io.sentry.protocol.Device device = (io.sentry.protocol.Device) obj;
            if (io.sentry.util.Objects.equals(this.name, device.name) && io.sentry.util.Objects.equals(this.manufacturer, device.manufacturer) && io.sentry.util.Objects.equals(this.brand, device.brand) && io.sentry.util.Objects.equals(this.family, device.family) && io.sentry.util.Objects.equals(this.model, device.model) && io.sentry.util.Objects.equals(this.modelId, device.modelId) && java.util.Arrays.equals(this.archs, device.archs) && io.sentry.util.Objects.equals(this.batteryLevel, device.batteryLevel) && io.sentry.util.Objects.equals(this.charging, device.charging) && io.sentry.util.Objects.equals(this.online, device.online) && this.orientation == device.orientation && io.sentry.util.Objects.equals(this.simulator, device.simulator) && io.sentry.util.Objects.equals(this.memorySize, device.memorySize) && io.sentry.util.Objects.equals(this.freeMemory, device.freeMemory) && io.sentry.util.Objects.equals(this.usableMemory, device.usableMemory) && io.sentry.util.Objects.equals(this.lowMemory, device.lowMemory) && io.sentry.util.Objects.equals(this.storageSize, device.storageSize) && io.sentry.util.Objects.equals(this.freeStorage, device.freeStorage) && io.sentry.util.Objects.equals(this.externalStorageSize, device.externalStorageSize) && io.sentry.util.Objects.equals(this.externalFreeStorage, device.externalFreeStorage) && io.sentry.util.Objects.equals(this.screenWidthPixels, device.screenWidthPixels) && io.sentry.util.Objects.equals(this.screenHeightPixels, device.screenHeightPixels) && io.sentry.util.Objects.equals(this.screenDensity, device.screenDensity) && io.sentry.util.Objects.equals(this.screenDpi, device.screenDpi) && io.sentry.util.Objects.equals(this.bootTime, device.bootTime) && io.sentry.util.Objects.equals(this.id, device.id) && io.sentry.util.Objects.equals(this.locale, device.locale) && io.sentry.util.Objects.equals(this.connectionType, device.connectionType) && io.sentry.util.Objects.equals(this.batteryTemperature, device.batteryTemperature) && io.sentry.util.Objects.equals(this.processorCount, device.processorCount) && io.sentry.util.Objects.equals(this.processorFrequency, device.processorFrequency) && io.sentry.util.Objects.equals(this.cpuDescription, device.cpuDescription)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String[] getArchs() {
        return this.archs;
    }

    public java.lang.Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public java.lang.Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public java.util.Date getBootTime() {
        java.util.Date date = this.bootTime;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public java.lang.String getBrand() {
        return this.brand;
    }

    public java.lang.String getConnectionType() {
        return this.connectionType;
    }

    public java.lang.String getCpuDescription() {
        return this.cpuDescription;
    }

    public java.lang.Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    public java.lang.Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    public java.lang.String getFamily() {
        return this.family;
    }

    public java.lang.Long getFreeMemory() {
        return this.freeMemory;
    }

    public java.lang.Long getFreeStorage() {
        return this.freeStorage;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getLocale() {
        return this.locale;
    }

    public java.lang.String getManufacturer() {
        return this.manufacturer;
    }

    public java.lang.Long getMemorySize() {
        return this.memorySize;
    }

    public java.lang.String getModel() {
        return this.model;
    }

    public java.lang.String getModelId() {
        return this.modelId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public io.sentry.protocol.Device.DeviceOrientation getOrientation() {
        return this.orientation;
    }

    public java.lang.Integer getProcessorCount() {
        return this.processorCount;
    }

    public java.lang.Double getProcessorFrequency() {
        return this.processorFrequency;
    }

    public java.lang.Float getScreenDensity() {
        return this.screenDensity;
    }

    public java.lang.Integer getScreenDpi() {
        return this.screenDpi;
    }

    public java.lang.Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public java.lang.Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public java.lang.Long getStorageSize() {
        return this.storageSize;
    }

    public java.util.TimeZone getTimezone() {
        return this.timezone;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.Long getUsableMemory() {
        return this.usableMemory;
    }

    public int hashCode() {
        return (io.sentry.util.Objects.hash(this.name, this.manufacturer, this.brand, this.family, this.model, this.modelId, this.batteryLevel, this.charging, this.online, this.orientation, this.simulator, this.memorySize, this.freeMemory, this.usableMemory, this.lowMemory, this.storageSize, this.freeStorage, this.externalStorageSize, this.externalFreeStorage, this.screenWidthPixels, this.screenHeightPixels, this.screenDensity, this.screenDpi, this.bootTime, this.timezone, this.id, this.locale, this.connectionType, this.batteryTemperature, this.processorCount, this.processorFrequency, this.cpuDescription) * 31) + java.util.Arrays.hashCode(this.archs);
    }

    public java.lang.Boolean isCharging() {
        return this.charging;
    }

    public java.lang.Boolean isLowMemory() {
        return this.lowMemory;
    }

    public java.lang.Boolean isOnline() {
        return this.online;
    }

    public java.lang.Boolean isSimulator() {
        return this.simulator;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.manufacturer != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.MANUFACTURER).value(this.manufacturer);
        }
        if (this.brand != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.BRAND).value(this.brand);
        }
        if (this.family != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.FAMILY).value(this.family);
        }
        if (this.model != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.MODEL).value(this.model);
        }
        if (this.modelId != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.MODEL_ID).value(this.modelId);
        }
        if (this.archs != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.ARCHS).value(iLogger, this.archs);
        }
        if (this.batteryLevel != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.BATTERY_LEVEL).value(this.batteryLevel);
        }
        if (this.charging != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.CHARGING).value(this.charging);
        }
        if (this.online != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.ONLINE).value(this.online);
        }
        if (this.orientation != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.ORIENTATION).value(iLogger, this.orientation);
        }
        if (this.simulator != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.SIMULATOR).value(this.simulator);
        }
        if (this.memorySize != null) {
            objectWriter.name("memory_size").value(this.memorySize);
        }
        if (this.freeMemory != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.FREE_MEMORY).value(this.freeMemory);
        }
        if (this.usableMemory != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.USABLE_MEMORY).value(this.usableMemory);
        }
        if (this.lowMemory != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.LOW_MEMORY).value(this.lowMemory);
        }
        if (this.storageSize != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.STORAGE_SIZE).value(this.storageSize);
        }
        if (this.freeStorage != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.FREE_STORAGE).value(this.freeStorage);
        }
        if (this.externalStorageSize != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.EXTERNAL_STORAGE_SIZE).value(this.externalStorageSize);
        }
        if (this.externalFreeStorage != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.EXTERNAL_FREE_STORAGE).value(this.externalFreeStorage);
        }
        if (this.screenWidthPixels != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.SCREEN_WIDTH_PIXELS).value(this.screenWidthPixels);
        }
        if (this.screenHeightPixels != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.SCREEN_HEIGHT_PIXELS).value(this.screenHeightPixels);
        }
        if (this.screenDensity != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.SCREEN_DENSITY).value(this.screenDensity);
        }
        if (this.screenDpi != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.SCREEN_DPI).value(this.screenDpi);
        }
        if (this.bootTime != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.BOOT_TIME).value(iLogger, this.bootTime);
        }
        if (this.timezone != null) {
            objectWriter.name("timezone").value(iLogger, this.timezone);
        }
        if (this.id != null) {
            objectWriter.name("id").value(this.id);
        }
        if (this.connectionType != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.CONNECTION_TYPE).value(this.connectionType);
        }
        if (this.batteryTemperature != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.BATTERY_TEMPERATURE).value(this.batteryTemperature);
        }
        if (this.locale != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.LOCALE).value(this.locale);
        }
        if (this.processorCount != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.PROCESSOR_COUNT).value(this.processorCount);
        }
        if (this.processorFrequency != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.PROCESSOR_FREQUENCY).value(this.processorFrequency);
        }
        if (this.cpuDescription != null) {
            objectWriter.name(io.sentry.protocol.Device.JsonKeys.CPU_DESCRIPTION).value(this.cpuDescription);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setArchs(java.lang.String[] strArr) {
        this.archs = strArr;
    }

    public void setBatteryLevel(java.lang.Float f9) {
        this.batteryLevel = f9;
    }

    public void setBatteryTemperature(java.lang.Float f9) {
        this.batteryTemperature = f9;
    }

    public void setBootTime(java.util.Date date) {
        this.bootTime = date;
    }

    public void setBrand(java.lang.String str) {
        this.brand = str;
    }

    public void setCharging(java.lang.Boolean bool) {
        this.charging = bool;
    }

    public void setConnectionType(java.lang.String str) {
        this.connectionType = str;
    }

    public void setCpuDescription(java.lang.String str) {
        this.cpuDescription = str;
    }

    public void setExternalFreeStorage(java.lang.Long l2) {
        this.externalFreeStorage = l2;
    }

    public void setExternalStorageSize(java.lang.Long l2) {
        this.externalStorageSize = l2;
    }

    public void setFamily(java.lang.String str) {
        this.family = str;
    }

    public void setFreeMemory(java.lang.Long l2) {
        this.freeMemory = l2;
    }

    public void setFreeStorage(java.lang.Long l2) {
        this.freeStorage = l2;
    }

    public void setId(java.lang.String str) {
        this.id = str;
    }

    public void setLocale(java.lang.String str) {
        this.locale = str;
    }

    public void setLowMemory(java.lang.Boolean bool) {
        this.lowMemory = bool;
    }

    public void setManufacturer(java.lang.String str) {
        this.manufacturer = str;
    }

    public void setMemorySize(java.lang.Long l2) {
        this.memorySize = l2;
    }

    public void setModel(java.lang.String str) {
        this.model = str;
    }

    public void setModelId(java.lang.String str) {
        this.modelId = str;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setOnline(java.lang.Boolean bool) {
        this.online = bool;
    }

    public void setOrientation(io.sentry.protocol.Device.DeviceOrientation deviceOrientation) {
        this.orientation = deviceOrientation;
    }

    public void setProcessorCount(java.lang.Integer num) {
        this.processorCount = num;
    }

    public void setProcessorFrequency(java.lang.Double d4) {
        this.processorFrequency = d4;
    }

    public void setScreenDensity(java.lang.Float f9) {
        this.screenDensity = f9;
    }

    public void setScreenDpi(java.lang.Integer num) {
        this.screenDpi = num;
    }

    public void setScreenHeightPixels(java.lang.Integer num) {
        this.screenHeightPixels = num;
    }

    public void setScreenWidthPixels(java.lang.Integer num) {
        this.screenWidthPixels = num;
    }

    public void setSimulator(java.lang.Boolean bool) {
        this.simulator = bool;
    }

    public void setStorageSize(java.lang.Long l2) {
        this.storageSize = l2;
    }

    public void setTimezone(java.util.TimeZone timeZone) {
        this.timezone = timeZone;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setUsableMemory(java.lang.Long l2) {
        this.usableMemory = l2;
    }

    public Device(io.sentry.protocol.Device device) {
        this.name = device.name;
        this.manufacturer = device.manufacturer;
        this.brand = device.brand;
        this.family = device.family;
        this.model = device.model;
        this.modelId = device.modelId;
        this.charging = device.charging;
        this.online = device.online;
        this.orientation = device.orientation;
        this.simulator = device.simulator;
        this.memorySize = device.memorySize;
        this.freeMemory = device.freeMemory;
        this.usableMemory = device.usableMemory;
        this.lowMemory = device.lowMemory;
        this.storageSize = device.storageSize;
        this.freeStorage = device.freeStorage;
        this.externalStorageSize = device.externalStorageSize;
        this.externalFreeStorage = device.externalFreeStorage;
        this.screenWidthPixels = device.screenWidthPixels;
        this.screenHeightPixels = device.screenHeightPixels;
        this.screenDensity = device.screenDensity;
        this.screenDpi = device.screenDpi;
        this.bootTime = device.bootTime;
        this.id = device.id;
        this.connectionType = device.connectionType;
        this.batteryTemperature = device.batteryTemperature;
        this.batteryLevel = device.batteryLevel;
        java.lang.String[] strArr = device.archs;
        this.archs = strArr != null ? (java.lang.String[]) strArr.clone() : null;
        this.locale = device.locale;
        java.util.TimeZone timeZone = device.timezone;
        this.timezone = timeZone != null ? (java.util.TimeZone) timeZone.clone() : null;
        this.processorCount = device.processorCount;
        this.processorFrequency = device.processorFrequency;
        this.cpuDescription = device.cpuDescription;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(device.unknown);
    }
}
