package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class MeasurementValue implements JsonUnknown, JsonSerializable {
    public static final String KEY_APP_START_COLD = "app_start_cold";
    public static final String KEY_APP_START_WARM = "app_start_warm";
    public static final String KEY_FRAMES_DELAY = "frames_delay";
    public static final String KEY_FRAMES_FROZEN = "frames_frozen";
    public static final String KEY_FRAMES_SLOW = "frames_slow";
    public static final String KEY_FRAMES_TOTAL = "frames_total";
    public static final String KEY_TIME_TO_FULL_DISPLAY = "time_to_full_display";
    public static final String KEY_TIME_TO_INITIAL_DISPLAY = "time_to_initial_display";
    private final String unit;
    private Map<String, Object> unknown;
    private final Number value;

    public static final class Deserializer implements JsonDeserializer<MeasurementValue> {
        @Override
        public MeasurementValue deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            Number number = null;
            String strNextStringOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("unit")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else if (strNextName.equals("value")) {
                    number = (Number) objectReader.nextObjectOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            objectReader.endObject();
            if (number != null) {
                MeasurementValue measurementValue = new MeasurementValue(number, strNextStringOrNull);
                measurementValue.setUnknown(concurrentHashMap);
                return measurementValue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class JsonKeys {
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public MeasurementValue(Number number, String str) {
        this.value = number;
        this.unit = str;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Number getValue() {
        return this.value;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(this.value);
        if (this.unit != null) {
            objectWriter.name("unit").value(this.unit);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public MeasurementValue(Number number, String str, Map<String, Object> map) {
        this.value = number;
        this.unit = str;
        this.unknown = map;
    }
}
