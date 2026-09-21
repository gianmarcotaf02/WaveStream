package io.sentry.profilemeasurements;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileMeasurementValue implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String relativeStartNs;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private double value;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.profilemeasurements.ProfileMeasurementValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.profilemeasurements.ProfileMeasurementValue deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.profilemeasurements.ProfileMeasurementValue profileMeasurementValue = new io.sentry.profilemeasurements.ProfileMeasurementValue();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(io.sentry.profilemeasurements.ProfileMeasurementValue.JsonKeys.START_NS)) {
                    java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull != null) {
                        profileMeasurementValue.relativeStartNs = strNextStringOrNull;
                    }
                } else if (strNextName.equals("value")) {
                    java.lang.Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                    if (dNextDoubleOrNull != null) {
                        profileMeasurementValue.value = dNextDoubleOrNull.doubleValue();
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            profileMeasurementValue.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileMeasurementValue;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String START_NS = "elapsed_since_start_ns";
        public static final java.lang.String VALUE = "value";
    }

    public ProfileMeasurementValue() {
        this(0L, 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.profilemeasurements.ProfileMeasurementValue.class == obj.getClass()) {
            io.sentry.profilemeasurements.ProfileMeasurementValue profileMeasurementValue = (io.sentry.profilemeasurements.ProfileMeasurementValue) obj;
            if (io.sentry.util.Objects.equals(this.unknown, profileMeasurementValue.unknown) && this.relativeStartNs.equals(profileMeasurementValue.relativeStartNs) && this.value == profileMeasurementValue.value) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getRelativeStartNs() {
        return this.relativeStartNs;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public double getValue() {
        return this.value;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.unknown, this.relativeStartNs, java.lang.Double.valueOf(this.value));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(iLogger, java.lang.Double.valueOf(this.value));
        objectWriter.name(io.sentry.profilemeasurements.ProfileMeasurementValue.JsonKeys.START_NS).value(iLogger, this.relativeStartNs);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public ProfileMeasurementValue(java.lang.Long l2, java.lang.Number number) {
        this.relativeStartNs = l2.toString();
        this.value = number.doubleValue();
    }
}
