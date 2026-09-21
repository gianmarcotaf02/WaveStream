package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class MeasurementValue implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String KEY_APP_START_COLD = "app_start_cold";
    public static final java.lang.String KEY_APP_START_WARM = "app_start_warm";
    public static final java.lang.String KEY_FRAMES_DELAY = "frames_delay";
    public static final java.lang.String KEY_FRAMES_FROZEN = "frames_frozen";
    public static final java.lang.String KEY_FRAMES_SLOW = "frames_slow";
    public static final java.lang.String KEY_FRAMES_TOTAL = "frames_total";
    public static final java.lang.String KEY_TIME_TO_FULL_DISPLAY = "time_to_full_display";
    public static final java.lang.String KEY_TIME_TO_INITIAL_DISPLAY = "time_to_initial_display";
    private final java.lang.String unit;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private final java.lang.Number value;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.MeasurementValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.MeasurementValue deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.lang.Number number = null;
            java.lang.String strNextStringOrNull = null;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("unit")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else if (strNextName.equals("value")) {
                    number = (java.lang.Number) objectReader.nextObjectOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            objectReader.endObject();
            if (number != null) {
                io.sentry.protocol.MeasurementValue measurementValue = new io.sentry.protocol.MeasurementValue(number, strNextStringOrNull);
                measurementValue.setUnknown(concurrentHashMap);
                return measurementValue;
            }
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"value\"");
            iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String UNIT = "unit";
        public static final java.lang.String VALUE = "value";
    }

    public MeasurementValue(java.lang.Number number, java.lang.String str) {
        this.value = number;
        this.unit = str;
    }

    public java.lang.String getUnit() {
        return this.unit;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.Number getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(this.value);
        if (this.unit != null) {
            objectWriter.name("unit").value(this.unit);
        }
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

    public MeasurementValue(java.lang.Number number, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.value = number;
        this.unit = str;
        this.unknown = map;
    }
}
