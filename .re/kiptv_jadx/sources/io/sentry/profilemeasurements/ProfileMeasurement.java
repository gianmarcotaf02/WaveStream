package io.sentry.profilemeasurements;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileMeasurement implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String ID_CPU_USAGE = "cpu_usage";
    public static final java.lang.String ID_FROZEN_FRAME_RENDERS = "frozen_frame_renders";
    public static final java.lang.String ID_MEMORY_FOOTPRINT = "memory_footprint";
    public static final java.lang.String ID_MEMORY_NATIVE_FOOTPRINT = "memory_native_footprint";
    public static final java.lang.String ID_SCREEN_FRAME_RATES = "screen_frame_rates";
    public static final java.lang.String ID_SLOW_FRAME_RENDERS = "slow_frame_renders";
    public static final java.lang.String ID_UNKNOWN = "unknown";
    public static final java.lang.String UNIT_BYTES = "byte";
    public static final java.lang.String UNIT_HZ = "hz";
    public static final java.lang.String UNIT_NANOSECONDS = "nanosecond";
    public static final java.lang.String UNIT_PERCENT = "percent";
    public static final java.lang.String UNIT_UNKNOWN = "unknown";
    private java.lang.String unit;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.util.Collection<io.sentry.profilemeasurements.ProfileMeasurementValue> values;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.profilemeasurements.ProfileMeasurement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.profilemeasurements.ProfileMeasurement deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.profilemeasurements.ProfileMeasurement profileMeasurement = new io.sentry.profilemeasurements.ProfileMeasurement();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    java.util.List listNextListOrNull = objectReader.nextListOrNull(iLogger, new io.sentry.profilemeasurements.ProfileMeasurementValue.Deserializer());
                    if (listNextListOrNull != null) {
                        profileMeasurement.values = listNextListOrNull;
                    }
                } else if (strNextName.equals("unit")) {
                    java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull != null) {
                        profileMeasurement.unit = strNextStringOrNull;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            profileMeasurement.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileMeasurement;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String UNIT = "unit";
        public static final java.lang.String VALUES = "values";
    }

    public ProfileMeasurement() {
        this("unknown", new java.util.ArrayList());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.profilemeasurements.ProfileMeasurement.class == obj.getClass()) {
            io.sentry.profilemeasurements.ProfileMeasurement profileMeasurement = (io.sentry.profilemeasurements.ProfileMeasurement) obj;
            if (io.sentry.util.Objects.equals(this.unknown, profileMeasurement.unknown) && this.unit.equals(profileMeasurement.unit) && new java.util.ArrayList(this.values).equals(new java.util.ArrayList(profileMeasurement.values))) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getUnit() {
        return this.unit;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.util.Collection<io.sentry.profilemeasurements.ProfileMeasurementValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.unknown, this.unit, this.values);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("unit").value(iLogger, this.unit);
        objectWriter.name("values").value(iLogger, this.values);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setUnit(java.lang.String str) {
        this.unit = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setValues(java.util.Collection<io.sentry.profilemeasurements.ProfileMeasurementValue> collection) {
        this.values = collection;
    }

    public ProfileMeasurement(java.lang.String str, java.util.Collection<io.sentry.profilemeasurements.ProfileMeasurementValue> collection) {
        this.unit = str;
        this.values = collection;
    }
}
