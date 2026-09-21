package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Geo implements JsonUnknown, JsonSerializable {
    private String city;
    private String countryCode;
    private String region;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<Geo> {
        @Override
        public Geo deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            Geo geo = new Geo();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "region":
                        geo.region = objectReader.nextStringOrNull();
                        break;
                    case "city":
                        geo.city = objectReader.nextStringOrNull();
                        break;
                    case "country_code":
                        geo.countryCode = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            geo.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return geo;
        }
    }

    public static final class JsonKeys {
        public static final String CITY = "city";
        public static final String COUNTRY_CODE = "country_code";
        public static final String REGION = "region";
    }

    public Geo() {
    }

    public static Geo fromMap(Map<String, Object> map) {
        Geo geo = new Geo();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "region":
                    geo.region = value instanceof String ? (String) value : null;
                    break;
                case "city":
                    geo.city = value instanceof String ? (String) value : null;
                    break;
                case "country_code":
                    geo.countryCode = value instanceof String ? (String) value : null;
                    break;
            }
        }
        return geo;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.city != null) {
            objectWriter.name(JsonKeys.CITY).value(this.city);
        }
        if (this.countryCode != null) {
            objectWriter.name(JsonKeys.COUNTRY_CODE).value(this.countryCode);
        }
        if (this.region != null) {
            objectWriter.name("region").value(this.region);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public Geo(Geo geo) {
        this.city = geo.city;
        this.countryCode = geo.countryCode;
        this.region = geo.region;
    }
}
