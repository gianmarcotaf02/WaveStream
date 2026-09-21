package io.sentry.profilemeasurements;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ProfileMeasurementValue implements JsonUnknown, JsonSerializable {
    private String relativeStartNs;
    private Map<String, Object> unknown;
    private double value;

    public static final class Deserializer implements JsonDeserializer<ProfileMeasurementValue> {
        @Override
        public ProfileMeasurementValue deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ProfileMeasurementValue profileMeasurementValue = new ProfileMeasurementValue();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(JsonKeys.START_NS)) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull != null) {
                        profileMeasurementValue.relativeStartNs = strNextStringOrNull;
                    }
                } else if (strNextName.equals("value")) {
                    Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                    if (dNextDoubleOrNull != null) {
                        profileMeasurementValue.value = dNextDoubleOrNull.doubleValue();
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
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
        public static final String START_NS = "elapsed_since_start_ns";
        public static final String VALUE = "value";
    }

    public ProfileMeasurementValue() {
        this(0L, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProfileMeasurementValue.class == obj.getClass()) {
            ProfileMeasurementValue profileMeasurementValue = (ProfileMeasurementValue) obj;
            if (Objects.equals(this.unknown, profileMeasurementValue.unknown) && this.relativeStartNs.equals(profileMeasurementValue.relativeStartNs) && this.value == profileMeasurementValue.value) {
                return true;
            }
        }
        return false;
    }

    public String getRelativeStartNs() {
        return this.relativeStartNs;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.unknown, this.relativeStartNs, Double.valueOf(this.value));
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(iLogger, Double.valueOf(this.value));
        objectWriter.name(JsonKeys.START_NS).value(iLogger, this.relativeStartNs);
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

    public ProfileMeasurementValue(Long l2, Number number) {
        this.relativeStartNs = l2.toString();
        this.value = number.doubleValue();
    }
}
