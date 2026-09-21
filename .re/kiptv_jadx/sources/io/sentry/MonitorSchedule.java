package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class MonitorSchedule implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String type;
    private java.lang.String unit;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String value;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.MonitorSchedule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.MonitorSchedule deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.String strNextStringOrNull3 = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "unit":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "value":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new java.util.HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            if (strNextStringOrNull == null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"type\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextStringOrNull2 != null) {
                io.sentry.MonitorSchedule monitorSchedule = new io.sentry.MonitorSchedule(strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3);
                monitorSchedule.setUnknown(map);
                return monitorSchedule;
            }
            java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Missing required field \"value\"");
            iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String UNIT = "unit";
        public static final java.lang.String VALUE = "value";
    }

    public MonitorSchedule(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.type = str;
        this.value = str2;
        this.unit = str3;
    }

    public static io.sentry.MonitorSchedule crontab(java.lang.String str) {
        return new io.sentry.MonitorSchedule(io.sentry.MonitorScheduleType.CRONTAB.apiName(), str, null);
    }

    public static io.sentry.MonitorSchedule interval(java.lang.Integer num, io.sentry.MonitorScheduleUnit monitorScheduleUnit) {
        return new io.sentry.MonitorSchedule(io.sentry.MonitorScheduleType.INTERVAL.apiName(), num.toString(), monitorScheduleUnit.apiName());
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getUnit() {
        return this.unit;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(this.type);
        if (io.sentry.MonitorScheduleType.INTERVAL.apiName().equalsIgnoreCase(this.type)) {
            try {
                objectWriter.name("value").value(java.lang.Integer.valueOf(this.value));
            } catch (java.lang.Throwable unused) {
                iLogger.log(io.sentry.SentryLevel.ERROR, "Unable to serialize monitor schedule value: %s", this.value);
            }
        } else {
            objectWriter.name("value").value(this.value);
        }
        if (this.unit != null) {
            objectWriter.name("unit").value(this.unit);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    public void setUnit(java.lang.String str) {
        this.unit = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setValue(java.lang.String str) {
        this.value = str;
    }

    public void setUnit(io.sentry.MonitorScheduleUnit monitorScheduleUnit) {
        this.unit = monitorScheduleUnit == null ? null : monitorScheduleUnit.apiName();
    }

    public void setValue(java.lang.Integer num) {
        this.value = num.toString();
    }
}
