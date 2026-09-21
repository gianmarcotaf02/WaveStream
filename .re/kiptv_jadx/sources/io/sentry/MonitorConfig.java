package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class MonitorConfig implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.Long checkinMargin;
    private java.lang.Long failureIssueThreshold;
    private java.lang.Long maxRuntime;
    private java.lang.Long recoveryThreshold;
    private io.sentry.MonitorSchedule schedule;
    private java.lang.String timezone;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.MonitorConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.MonitorConfig deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.MonitorSchedule monitorScheduleDeserialize = null;
            java.lang.Long lNextLongOrNull = null;
            java.lang.Long lNextLongOrNull2 = null;
            java.lang.String strNextStringOrNull = null;
            java.lang.Long lNextLongOrNull3 = null;
            java.lang.Long lNextLongOrNull4 = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "timezone":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "checkin_margin":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        break;
                    case "schedule":
                        monitorScheduleDeserialize = new io.sentry.MonitorSchedule.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "recovery_threshold":
                        lNextLongOrNull4 = objectReader.nextLongOrNull();
                        break;
                    case "max_runtime":
                        lNextLongOrNull2 = objectReader.nextLongOrNull();
                        break;
                    case "failure_issue_threshold":
                        lNextLongOrNull3 = objectReader.nextLongOrNull();
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
            if (monitorScheduleDeserialize == null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"schedule\"");
                iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"schedule\"", illegalStateException);
                throw illegalStateException;
            }
            io.sentry.MonitorConfig monitorConfig = new io.sentry.MonitorConfig(monitorScheduleDeserialize);
            monitorConfig.setCheckinMargin(lNextLongOrNull);
            monitorConfig.setMaxRuntime(lNextLongOrNull2);
            monitorConfig.setTimezone(strNextStringOrNull);
            monitorConfig.setFailureIssueThreshold(lNextLongOrNull3);
            monitorConfig.setRecoveryThreshold(lNextLongOrNull4);
            monitorConfig.setUnknown(map);
            return monitorConfig;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CHECKIN_MARGIN = "checkin_margin";
        public static final java.lang.String FAILURE_ISSUE_THRESHOLD = "failure_issue_threshold";
        public static final java.lang.String MAX_RUNTIME = "max_runtime";
        public static final java.lang.String RECOVERY_THRESHOLD = "recovery_threshold";
        public static final java.lang.String SCHEDULE = "schedule";
        public static final java.lang.String TIMEZONE = "timezone";
    }

    public MonitorConfig(io.sentry.MonitorSchedule monitorSchedule) {
        this.schedule = monitorSchedule;
        io.sentry.SentryOptions.Cron cron = io.sentry.ScopesAdapter.getInstance().getOptions().getCron();
        if (cron != null) {
            this.checkinMargin = cron.getDefaultCheckinMargin();
            this.maxRuntime = cron.getDefaultMaxRuntime();
            this.timezone = cron.getDefaultTimezone();
            this.failureIssueThreshold = cron.getDefaultFailureIssueThreshold();
            this.recoveryThreshold = cron.getDefaultRecoveryThreshold();
        }
    }

    public java.lang.Long getCheckinMargin() {
        return this.checkinMargin;
    }

    public java.lang.Long getFailureIssueThreshold() {
        return this.failureIssueThreshold;
    }

    public java.lang.Long getMaxRuntime() {
        return this.maxRuntime;
    }

    public java.lang.Long getRecoveryThreshold() {
        return this.recoveryThreshold;
    }

    public io.sentry.MonitorSchedule getSchedule() {
        return this.schedule;
    }

    public java.lang.String getTimezone() {
        return this.timezone;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(io.sentry.MonitorConfig.JsonKeys.SCHEDULE);
        this.schedule.serialize(objectWriter, iLogger);
        if (this.checkinMargin != null) {
            objectWriter.name(io.sentry.MonitorConfig.JsonKeys.CHECKIN_MARGIN).value(this.checkinMargin);
        }
        if (this.maxRuntime != null) {
            objectWriter.name(io.sentry.MonitorConfig.JsonKeys.MAX_RUNTIME).value(this.maxRuntime);
        }
        if (this.timezone != null) {
            objectWriter.name("timezone").value(this.timezone);
        }
        if (this.failureIssueThreshold != null) {
            objectWriter.name(io.sentry.MonitorConfig.JsonKeys.FAILURE_ISSUE_THRESHOLD).value(this.failureIssueThreshold);
        }
        if (this.recoveryThreshold != null) {
            objectWriter.name(io.sentry.MonitorConfig.JsonKeys.RECOVERY_THRESHOLD).value(this.recoveryThreshold);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setCheckinMargin(java.lang.Long l2) {
        this.checkinMargin = l2;
    }

    public void setFailureIssueThreshold(java.lang.Long l2) {
        this.failureIssueThreshold = l2;
    }

    public void setMaxRuntime(java.lang.Long l2) {
        this.maxRuntime = l2;
    }

    public void setRecoveryThreshold(java.lang.Long l2) {
        this.recoveryThreshold = l2;
    }

    public void setSchedule(io.sentry.MonitorSchedule monitorSchedule) {
        this.schedule = monitorSchedule;
    }

    public void setTimezone(java.lang.String str) {
        this.timezone = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
