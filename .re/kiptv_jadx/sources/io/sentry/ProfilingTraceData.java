package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfilingTraceData implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private static final java.lang.String DEFAULT_ENVIRONMENT = "production";
    public static final java.lang.String TRUNCATION_REASON_BACKGROUNDED = "backgrounded";
    public static final java.lang.String TRUNCATION_REASON_NORMAL = "normal";
    public static final java.lang.String TRUNCATION_REASON_TIMEOUT = "timeout";
    private int androidApiLevel;
    private java.lang.String buildId;
    private java.lang.String cpuArchitecture;
    private java.util.List<java.lang.Integer> deviceCpuFrequencies;
    private final java.util.concurrent.Callable<java.util.List<java.lang.Integer>> deviceCpuFrequenciesReader;
    private boolean deviceIsEmulator;
    private java.lang.String deviceLocale;
    private java.lang.String deviceManufacturer;
    private java.lang.String deviceModel;
    private java.lang.String deviceOsBuildNumber;
    private java.lang.String deviceOsName;
    private java.lang.String deviceOsVersion;
    private java.lang.String devicePhysicalMemoryBytes;
    private java.lang.String durationNs;
    private java.lang.String environment;
    private final java.util.Map<java.lang.String, io.sentry.profilemeasurements.ProfileMeasurement> measurementsMap;
    private java.lang.String platform;
    private java.lang.String profileId;
    private java.lang.String release;
    private java.lang.String sampledProfile;
    private java.util.Date timestamp;
    private final java.io.File traceFile;
    private java.lang.String traceId;
    private java.lang.String transactionId;
    private java.lang.String transactionName;
    private java.util.List<io.sentry.ProfilingTransactionData> transactions;
    private java.lang.String truncationReason;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String versionCode;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.ProfilingTraceData> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.ProfilingTraceData deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            io.sentry.ProfilingTraceData profilingTraceData = new io.sentry.ProfilingTraceData();
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "device_manufacturer":
                        java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.deviceManufacturer = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "android_api_level":
                        java.lang.Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        if (numNextIntegerOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.androidApiLevel = numNextIntegerOrNull.intValue();
                            break;
                        }
                        break;
                    case "build_id":
                        java.lang.String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull2 == null) {
                            break;
                        } else {
                            profilingTraceData.buildId = strNextStringOrNull2;
                            break;
                        }
                        break;
                    case "device_locale":
                        java.lang.String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull3 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceLocale = strNextStringOrNull3;
                            break;
                        }
                        break;
                    case "profile_id":
                        java.lang.String strNextStringOrNull4 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull4 == null) {
                            break;
                        } else {
                            profilingTraceData.profileId = strNextStringOrNull4;
                            break;
                        }
                        break;
                    case "device_os_build_number":
                        java.lang.String strNextStringOrNull5 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull5 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceOsBuildNumber = strNextStringOrNull5;
                            break;
                        }
                        break;
                    case "device_model":
                        java.lang.String strNextStringOrNull6 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull6 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceModel = strNextStringOrNull6;
                            break;
                        }
                        break;
                    case "device_is_emulator":
                        java.lang.Boolean boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.deviceIsEmulator = boolNextBooleanOrNull.booleanValue();
                            break;
                        }
                        break;
                    case "duration_ns":
                        java.lang.String strNextStringOrNull7 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull7 == null) {
                            break;
                        } else {
                            profilingTraceData.durationNs = strNextStringOrNull7;
                            break;
                        }
                        break;
                    case "measurements":
                        java.util.Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new io.sentry.profilemeasurements.ProfileMeasurement.Deserializer());
                        if (mapNextMapOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.measurementsMap.putAll(mapNextMapOrNull);
                            break;
                        }
                        break;
                    case "device_physical_memory_bytes":
                        java.lang.String strNextStringOrNull8 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull8 == null) {
                            break;
                        } else {
                            profilingTraceData.devicePhysicalMemoryBytes = strNextStringOrNull8;
                            break;
                        }
                        break;
                    case "device_cpu_frequencies":
                        java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            profilingTraceData.deviceCpuFrequencies = list;
                            break;
                        }
                        break;
                    case "version_code":
                        java.lang.String strNextStringOrNull9 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull9 == null) {
                            break;
                        } else {
                            profilingTraceData.versionCode = strNextStringOrNull9;
                            break;
                        }
                        break;
                    case "version_name":
                        java.lang.String strNextStringOrNull10 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull10 == null) {
                            break;
                        } else {
                            profilingTraceData.release = strNextStringOrNull10;
                            break;
                        }
                        break;
                    case "environment":
                        java.lang.String strNextStringOrNull11 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull11 == null) {
                            break;
                        } else {
                            profilingTraceData.environment = strNextStringOrNull11;
                            break;
                        }
                        break;
                    case "timestamp":
                        java.util.Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.timestamp = dateNextDateOrNull;
                            break;
                        }
                        break;
                    case "transaction_name":
                        java.lang.String strNextStringOrNull12 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull12 == null) {
                            break;
                        } else {
                            profilingTraceData.transactionName = strNextStringOrNull12;
                            break;
                        }
                        break;
                    case "device_os_name":
                        java.lang.String strNextStringOrNull13 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull13 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceOsName = strNextStringOrNull13;
                            break;
                        }
                        break;
                    case "architecture":
                        java.lang.String strNextStringOrNull14 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull14 == null) {
                            break;
                        } else {
                            profilingTraceData.cpuArchitecture = strNextStringOrNull14;
                            break;
                        }
                        break;
                    case "transaction_id":
                        java.lang.String strNextStringOrNull15 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull15 == null) {
                            break;
                        } else {
                            profilingTraceData.transactionId = strNextStringOrNull15;
                            break;
                        }
                        break;
                    case "device_os_version":
                        java.lang.String strNextStringOrNull16 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull16 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceOsVersion = strNextStringOrNull16;
                            break;
                        }
                        break;
                    case "truncation_reason":
                        java.lang.String strNextStringOrNull17 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull17 == null) {
                            break;
                        } else {
                            profilingTraceData.truncationReason = strNextStringOrNull17;
                            break;
                        }
                        break;
                    case "trace_id":
                        java.lang.String strNextStringOrNull18 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull18 == null) {
                            break;
                        } else {
                            profilingTraceData.traceId = strNextStringOrNull18;
                            break;
                        }
                        break;
                    case "platform":
                        java.lang.String strNextStringOrNull19 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull19 == null) {
                            break;
                        } else {
                            profilingTraceData.platform = strNextStringOrNull19;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        java.lang.String strNextStringOrNull20 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull20 == null) {
                            break;
                        } else {
                            profilingTraceData.sampledProfile = strNextStringOrNull20;
                            break;
                        }
                        break;
                    case "transactions":
                        java.util.List listNextListOrNull = objectReader.nextListOrNull(iLogger, new io.sentry.ProfilingTransactionData.Deserializer());
                        if (listNextListOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.transactions.addAll(listNextListOrNull);
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            profilingTraceData.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profilingTraceData;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ANDROID_API_LEVEL = "android_api_level";
        public static final java.lang.String ARCHITECTURE = "architecture";
        public static final java.lang.String BUILD_ID = "build_id";
        public static final java.lang.String DEVICE_CPU_FREQUENCIES = "device_cpu_frequencies";
        public static final java.lang.String DEVICE_IS_EMULATOR = "device_is_emulator";
        public static final java.lang.String DEVICE_LOCALE = "device_locale";
        public static final java.lang.String DEVICE_MANUFACTURER = "device_manufacturer";
        public static final java.lang.String DEVICE_MODEL = "device_model";
        public static final java.lang.String DEVICE_OS_BUILD_NUMBER = "device_os_build_number";
        public static final java.lang.String DEVICE_OS_NAME = "device_os_name";
        public static final java.lang.String DEVICE_OS_VERSION = "device_os_version";
        public static final java.lang.String DEVICE_PHYSICAL_MEMORY_BYTES = "device_physical_memory_bytes";
        public static final java.lang.String DURATION_NS = "duration_ns";
        public static final java.lang.String ENVIRONMENT = "environment";
        public static final java.lang.String MEASUREMENTS = "measurements";
        public static final java.lang.String PLATFORM = "platform";
        public static final java.lang.String PROFILE_ID = "profile_id";
        public static final java.lang.String RELEASE = "version_name";
        public static final java.lang.String SAMPLED_PROFILE = "sampled_profile";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TRACE_ID = "trace_id";
        public static final java.lang.String TRANSACTION_ID = "transaction_id";
        public static final java.lang.String TRANSACTION_LIST = "transactions";
        public static final java.lang.String TRANSACTION_NAME = "transaction_name";
        public static final java.lang.String TRUNCATION_REASON = "truncation_reason";
        public static final java.lang.String VERSION_CODE = "version_code";
    }

    private boolean isTruncationReasonValid() {
        return this.truncationReason.equals(TRUNCATION_REASON_NORMAL) || this.truncationReason.equals(TRUNCATION_REASON_TIMEOUT) || this.truncationReason.equals(TRUNCATION_REASON_BACKGROUNDED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$new$0() {
        return new java.util.ArrayList();
    }

    public int getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    public java.lang.String getBuildId() {
        return this.buildId;
    }

    public java.lang.String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    public java.util.List<java.lang.Integer> getDeviceCpuFrequencies() {
        return this.deviceCpuFrequencies;
    }

    public java.lang.String getDeviceLocale() {
        return this.deviceLocale;
    }

    public java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    public java.lang.String getDeviceOsBuildNumber() {
        return this.deviceOsBuildNumber;
    }

    public java.lang.String getDeviceOsName() {
        return this.deviceOsName;
    }

    public java.lang.String getDeviceOsVersion() {
        return this.deviceOsVersion;
    }

    public java.lang.String getDevicePhysicalMemoryBytes() {
        return this.devicePhysicalMemoryBytes;
    }

    public java.lang.String getDurationNs() {
        return this.durationNs;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public java.util.Map<java.lang.String, io.sentry.profilemeasurements.ProfileMeasurement> getMeasurementsMap() {
        return this.measurementsMap;
    }

    public java.lang.String getPlatform() {
        return this.platform;
    }

    public java.lang.String getProfileId() {
        return this.profileId;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public java.lang.String getSampledProfile() {
        return this.sampledProfile;
    }

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    public java.io.File getTraceFile() {
        return this.traceFile;
    }

    public java.lang.String getTraceId() {
        return this.traceId;
    }

    public java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public java.lang.String getTransactionName() {
        return this.transactionName;
    }

    public java.util.List<io.sentry.ProfilingTransactionData> getTransactions() {
        return this.transactions;
    }

    public java.lang.String getTruncationReason() {
        return this.truncationReason;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public boolean isDeviceIsEmulator() {
        return this.deviceIsEmulator;
    }

    public void readDeviceCpuFrequencies() {
        try {
            this.deviceCpuFrequencies = this.deviceCpuFrequenciesReader.call();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.ANDROID_API_LEVEL).value(iLogger, java.lang.Integer.valueOf(this.androidApiLevel));
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_LOCALE).value(iLogger, this.deviceLocale);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER).value(this.deviceManufacturer);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_MODEL).value(this.deviceModel);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_OS_BUILD_NUMBER).value(this.deviceOsBuildNumber);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_OS_NAME).value(this.deviceOsName);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_OS_VERSION).value(this.deviceOsVersion);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_IS_EMULATOR).value(this.deviceIsEmulator);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.ARCHITECTURE).value(iLogger, this.cpuArchitecture);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_CPU_FREQUENCIES).value(iLogger, this.deviceCpuFrequencies);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_PHYSICAL_MEMORY_BYTES).value(this.devicePhysicalMemoryBytes);
        objectWriter.name("platform").value(this.platform);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.BUILD_ID).value(this.buildId);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.TRANSACTION_NAME).value(this.transactionName);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.DURATION_NS).value(this.durationNs);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.RELEASE).value(this.release);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.VERSION_CODE).value(this.versionCode);
        if (!this.transactions.isEmpty()) {
            objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.TRANSACTION_LIST).value(iLogger, this.transactions);
        }
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.TRANSACTION_ID).value(this.transactionId);
        objectWriter.name("trace_id").value(this.traceId);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.PROFILE_ID).value(this.profileId);
        objectWriter.name("environment").value(this.environment);
        objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.TRUNCATION_REASON).value(this.truncationReason);
        if (this.sampledProfile != null) {
            objectWriter.name(io.sentry.ProfilingTraceData.JsonKeys.SAMPLED_PROFILE).value(this.sampledProfile);
        }
        objectWriter.name("measurements").value(iLogger, this.measurementsMap);
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setAndroidApiLevel(int i3) {
        this.androidApiLevel = i3;
    }

    public void setBuildId(java.lang.String str) {
        this.buildId = str;
    }

    public void setCpuArchitecture(java.lang.String str) {
        this.cpuArchitecture = str;
    }

    public void setDeviceCpuFrequencies(java.util.List<java.lang.Integer> list) {
        this.deviceCpuFrequencies = list;
    }

    public void setDeviceIsEmulator(boolean z6) {
        this.deviceIsEmulator = z6;
    }

    public void setDeviceLocale(java.lang.String str) {
        this.deviceLocale = str;
    }

    public void setDeviceManufacturer(java.lang.String str) {
        this.deviceManufacturer = str;
    }

    public void setDeviceModel(java.lang.String str) {
        this.deviceModel = str;
    }

    public void setDeviceOsBuildNumber(java.lang.String str) {
        this.deviceOsBuildNumber = str;
    }

    public void setDeviceOsVersion(java.lang.String str) {
        this.deviceOsVersion = str;
    }

    public void setDevicePhysicalMemoryBytes(java.lang.String str) {
        this.devicePhysicalMemoryBytes = str;
    }

    public void setDurationNs(java.lang.String str) {
        this.durationNs = str;
    }

    public void setEnvironment(java.lang.String str) {
        this.environment = str;
    }

    public void setProfileId(java.lang.String str) {
        this.profileId = str;
    }

    public void setRelease(java.lang.String str) {
        this.release = str;
    }

    public void setSampledProfile(java.lang.String str) {
        this.sampledProfile = str;
    }

    public void setTimestamp(java.util.Date date) {
        this.timestamp = date;
    }

    public void setTraceId(java.lang.String str) {
        this.traceId = str;
    }

    public void setTransactionId(java.lang.String str) {
        this.transactionId = str;
    }

    public void setTransactionName(java.lang.String str) {
        this.transactionName = str;
    }

    public void setTransactions(java.util.List<io.sentry.ProfilingTransactionData> list) {
        this.transactions = list;
    }

    public void setTruncationReason(java.lang.String str) {
        this.truncationReason = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    private ProfilingTraceData() {
        this(new java.io.File("dummy"), io.sentry.NoOpTransaction.getInstance());
    }

    public ProfilingTraceData(java.io.File file, io.sentry.ITransaction iTransaction) {
        this(file, io.sentry.DateUtils.getCurrentDateTime(), new java.util.ArrayList(), iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), "0", 0, "", new io.sentry.d(4), null, null, null, null, null, null, null, null, TRUNCATION_REASON_NORMAL, new java.util.HashMap());
    }

    public ProfilingTraceData(java.io.File file, java.util.Date date, java.util.List<io.sentry.ProfilingTransactionData> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i3, java.lang.String str5, java.util.concurrent.Callable<java.util.List<java.lang.Integer>> callable, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.util.Map<java.lang.String, io.sentry.profilemeasurements.ProfileMeasurement> map) {
        this.deviceCpuFrequencies = new java.util.ArrayList();
        this.sampledProfile = null;
        this.traceFile = file;
        this.timestamp = date;
        this.cpuArchitecture = str5;
        this.deviceCpuFrequenciesReader = callable;
        this.androidApiLevel = i3;
        this.deviceLocale = java.util.Locale.getDefault().toString();
        this.deviceManufacturer = str6 == null ? "" : str6;
        this.deviceModel = str7 == null ? "" : str7;
        this.deviceOsVersion = str8 == null ? "" : str8;
        this.deviceIsEmulator = bool != null ? bool.booleanValue() : false;
        this.devicePhysicalMemoryBytes = str9 != null ? str9 : "0";
        this.deviceOsBuildNumber = "";
        this.deviceOsName = com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM;
        this.platform = com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM;
        this.buildId = str10 != null ? str10 : "";
        this.transactions = list;
        this.transactionName = str.isEmpty() ? "unknown" : str;
        this.durationNs = str4;
        this.versionCode = "";
        this.release = str11 != null ? str11 : "";
        this.transactionId = str2;
        this.traceId = str3;
        this.profileId = io.sentry.SentryUUID.generateSentryId();
        this.environment = str12 != null ? str12 : DEFAULT_ENVIRONMENT;
        this.truncationReason = str13;
        if (!isTruncationReasonValid()) {
            this.truncationReason = TRUNCATION_REASON_NORMAL;
        }
        this.measurementsMap = map;
    }
}
