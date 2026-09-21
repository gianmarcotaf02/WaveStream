package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum MonitorScheduleUnit {
    MINUTE,
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR;

    public java.lang.String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }
}
