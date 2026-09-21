package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public class TimeSpan implements java.lang.Comparable<io.sentry.android.core.performance.TimeSpan> {
    private java.lang.String description;
    private long startUnixTimeMs;
    private long startUptimeMs;
    private long stopUptimeMs;

    public java.lang.String getDescription() {
        return this.description;
    }

    public long getDurationMs() {
        if (hasStopped()) {
            return this.stopUptimeMs - this.startUptimeMs;
        }
        return 0L;
    }

    public io.sentry.SentryDate getProjectedStopTimestamp() {
        if (hasStopped()) {
            return new io.sentry.SentryLongDate(io.sentry.DateUtils.millisToNanos(getProjectedStopTimestampMs()));
        }
        return null;
    }

    public long getProjectedStopTimestampMs() {
        if (!hasStarted()) {
            return 0L;
        }
        return getDurationMs() + this.startUnixTimeMs;
    }

    public double getProjectedStopTimestampSecs() {
        return io.sentry.DateUtils.millisToSeconds(getProjectedStopTimestampMs());
    }

    public io.sentry.SentryDate getStartTimestamp() {
        if (hasStarted()) {
            return new io.sentry.SentryLongDate(io.sentry.DateUtils.millisToNanos(getStartTimestampMs()));
        }
        return null;
    }

    public long getStartTimestampMs() {
        return this.startUnixTimeMs;
    }

    public double getStartTimestampSecs() {
        return io.sentry.DateUtils.millisToSeconds(this.startUnixTimeMs);
    }

    public long getStartUptimeMs() {
        return this.startUptimeMs;
    }

    public boolean hasNotStarted() {
        return this.startUptimeMs == 0;
    }

    public boolean hasNotStopped() {
        return this.stopUptimeMs == 0;
    }

    public boolean hasStarted() {
        return this.startUptimeMs != 0;
    }

    public boolean hasStopped() {
        return this.stopUptimeMs != 0;
    }

    public void reset() {
        this.description = null;
        this.startUptimeMs = 0L;
        this.stopUptimeMs = 0L;
        this.startUnixTimeMs = 0L;
    }

    public void setDescription(java.lang.String str) {
        this.description = str;
    }

    public void setStartUnixTimeMs(long j) {
        this.startUnixTimeMs = j;
    }

    public void setStartedAt(long j) {
        this.startUptimeMs = j;
        this.startUnixTimeMs = java.lang.System.currentTimeMillis() - (android.os.SystemClock.uptimeMillis() - this.startUptimeMs);
    }

    public void setStoppedAt(long j) {
        this.stopUptimeMs = j;
    }

    public void setup(java.lang.String str, long j, long j9, long j10) {
        this.description = str;
        this.startUnixTimeMs = j;
        this.startUptimeMs = j9;
        this.stopUptimeMs = j10;
    }

    public void start() {
        this.startUptimeMs = android.os.SystemClock.uptimeMillis();
        this.startUnixTimeMs = java.lang.System.currentTimeMillis();
    }

    public void stop() {
        this.stopUptimeMs = android.os.SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    public int compareTo(io.sentry.android.core.performance.TimeSpan timeSpan) {
        return java.lang.Long.compare(this.startUnixTimeMs, timeSpan.startUnixTimeMs);
    }
}
