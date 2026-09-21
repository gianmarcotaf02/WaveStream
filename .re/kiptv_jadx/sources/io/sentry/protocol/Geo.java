package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Geo implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String city;
    private java.lang.String countryCode;
    private java.lang.String region;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Geo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Geo deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Geo geo = new io.sentry.protocol.Geo();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
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
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
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
        public static final java.lang.String CITY = "city";
        public static final java.lang.String COUNTRY_CODE = "country_code";
        public static final java.lang.String REGION = "region";
    }

    public Geo() {
    }

    public static io.sentry.protocol.Geo fromMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        io.sentry.protocol.Geo geo = new io.sentry.protocol.Geo();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "region":
                    geo.region = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                case "city":
                    geo.city = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
                case "country_code":
                    geo.countryCode = value instanceof java.lang.String ? (java.lang.String) value : null;
                    break;
            }
        }
        return geo;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public java.lang.String getRegion() {
        return this.region;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.city != null) {
            objectWriter.name(io.sentry.protocol.Geo.JsonKeys.CITY).value(this.city);
        }
        if (this.countryCode != null) {
            objectWriter.name(io.sentry.protocol.Geo.JsonKeys.COUNTRY_CODE).value(this.countryCode);
        }
        if (this.region != null) {
            objectWriter.name("region").value(this.region);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setCity(java.lang.String str) {
        this.city = str;
    }

    public void setCountryCode(java.lang.String str) {
        this.countryCode = str;
    }

    public void setRegion(java.lang.String str) {
        this.region = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public Geo(io.sentry.protocol.Geo geo) {
        this.city = geo.city;
        this.countryCode = geo.countryCode;
        this.region = geo.region;
    }
}
