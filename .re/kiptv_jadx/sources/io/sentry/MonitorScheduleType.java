package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum MonitorScheduleType {
    CRONTAB,
    INTERVAL;

    public java.lang.String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }
}
