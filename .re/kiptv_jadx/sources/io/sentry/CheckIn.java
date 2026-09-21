package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class CheckIn implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private final io.sentry.protocol.SentryId checkInId;
    private final io.sentry.MonitorContexts contexts;
    private java.lang.Double duration;
    private java.lang.String environment;
    private io.sentry.MonitorConfig monitorConfig;
    private java.lang.String monitorSlug;
    private java.lang.String release;
    private java.lang.String status;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.CheckIn> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.CheckIn deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.SentryId sentryIdDeserialize = null;
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.util.HashMap map = null;
            java.lang.Double dNextDoubleOrNull = null;
            java.lang.String strNextStringOrNull3 = null;
            java.lang.String strNextStringOrNull4 = null;
            io.sentry.MonitorConfig monitorConfigDeserialize = null;
            io.sentry.MonitorContexts monitorContextsDeserialize = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "monitor_config":
                        monitorConfigDeserialize = new io.sentry.MonitorConfig.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "duration":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "status":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "contexts":
                        monitorContextsDeserialize = new io.sentry.MonitorContexts.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "environment":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    case "release":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "check_in_id":
                        sentryIdDeserialize = new io.sentry.protocol.SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "monitor_slug":
                        strNextStringOrNull = objectReader.nextStringOrNull();
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
            if (sentryIdDeserialize == null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"check_in_id\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"check_in_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextStringOrNull == null) {
                java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Missing required field \"monitor_slug\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"monitor_slug\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strNextStringOrNull2 == null) {
                java.lang.IllegalStateException illegalStateException3 = new java.lang.IllegalStateException("Missing required field \"status\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"status\"", illegalStateException3);
                throw illegalStateException3;
            }
            io.sentry.CheckIn checkIn = new io.sentry.CheckIn(sentryIdDeserialize, strNextStringOrNull, strNextStringOrNull2);
            checkIn.setDuration(dNextDoubleOrNull);
            checkIn.setRelease(strNextStringOrNull3);
            checkIn.setEnvironment(strNextStringOrNull4);
            checkIn.setMonitorConfig(monitorConfigDeserialize);
            checkIn.getContexts().putAll(monitorContextsDeserialize);
            checkIn.setUnknown(map);
            return checkIn;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CHECK_IN_ID = "check_in_id";
        public static final java.lang.String CONTEXTS = "contexts";
        public static final java.lang.String DURATION = "duration";
        public static final java.lang.String ENVIRONMENT = "environment";
        public static final java.lang.String MONITOR_CONFIG = "monitor_config";
        public static final java.lang.String MONITOR_SLUG = "monitor_slug";
        public static final java.lang.String RELEASE = "release";
        public static final java.lang.String STATUS = "status";
    }

    public CheckIn(java.lang.String str, io.sentry.CheckInStatus checkInStatus) {
        this((io.sentry.protocol.SentryId) null, str, checkInStatus.apiName());
    }

    public io.sentry.protocol.SentryId getCheckInId() {
        return this.checkInId;
    }

    public io.sentry.MonitorContexts getContexts() {
        return this.contexts;
    }

    public java.lang.Double getDuration() {
        return this.duration;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public io.sentry.MonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    public java.lang.String getMonitorSlug() {
        return this.monitorSlug;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public java.lang.String getStatus() {
        return this.status;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(io.sentry.CheckIn.JsonKeys.CHECK_IN_ID);
        this.checkInId.serialize(objectWriter, iLogger);
        objectWriter.name(io.sentry.CheckIn.JsonKeys.MONITOR_SLUG).value(this.monitorSlug);
        objectWriter.name("status").value(this.status);
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.monitorConfig != null) {
            objectWriter.name(io.sentry.CheckIn.JsonKeys.MONITOR_CONFIG);
            this.monitorConfig.serialize(objectWriter, iLogger);
        }
        if (this.contexts != null) {
            objectWriter.name("contexts");
            this.contexts.serialize(objectWriter, iLogger);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setDuration(java.lang.Double d4) {
        this.duration = d4;
    }

    public void setEnvironment(java.lang.String str) {
        this.environment = str;
    }

    public void setMonitorConfig(io.sentry.MonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
    }

    public void setMonitorSlug(java.lang.String str) {
        this.monitorSlug = str;
    }

    public void setRelease(java.lang.String str) {
        this.release = str;
    }

    public void setStatus(java.lang.String str) {
        this.status = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public CheckIn(io.sentry.protocol.SentryId sentryId, java.lang.String str, io.sentry.CheckInStatus checkInStatus) {
        this(sentryId, str, checkInStatus.apiName());
    }

    public void setStatus(io.sentry.CheckInStatus checkInStatus) {
        this.status = checkInStatus.apiName();
    }

    public CheckIn(io.sentry.protocol.SentryId sentryId, java.lang.String str, java.lang.String str2) {
        this.contexts = new io.sentry.MonitorContexts();
        this.checkInId = sentryId == null ? new io.sentry.protocol.SentryId() : sentryId;
        this.monitorSlug = str;
        this.status = str2;
    }
}
