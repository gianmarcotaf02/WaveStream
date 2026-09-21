package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCpuCollector implements io.sentry.IPerformanceSnapshotCollector {
    private final io.sentry.ILogger logger;
    private long lastRealtimeNanos = 0;
    private long lastCpuNanos = 0;
    private long clockSpeedHz = 1;
    private long numCores = 1;
    private final long NANOSECOND_PER_SECOND = androidx.media3.common.C.NANOS_PER_SECOND;
    private double nanosecondsPerClockTick = 1.0E9d / 1;
    private final java.io.File selfStat = new java.io.File("/proc/self/stat");
    private boolean isEnabled = false;
    private final java.util.regex.Pattern newLinePattern = java.util.regex.Pattern.compile("[\n\t\r ]");

    public AndroidCpuCollector(io.sentry.ILogger iLogger) {
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "Logger is required.");
    }

    private long readTotalCpuNanos() {
        java.lang.String text;
        try {
            text = io.sentry.util.FileUtils.readText(this.selfStat);
        } catch (java.io.IOException e6) {
            this.isEnabled = false;
            this.logger.log(io.sentry.SentryLevel.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e6);
            text = null;
        }
        if (text != null) {
            java.lang.String[] strArrSplit = this.newLinePattern.split(text.trim());
            try {
                return (long) ((java.lang.Long.parseLong(strArrSplit[13]) + java.lang.Long.parseLong(strArrSplit[14]) + java.lang.Long.parseLong(strArrSplit[15]) + java.lang.Long.parseLong(strArrSplit[16])) * this.nanosecondsPerClockTick);
            } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e9) {
                this.logger.log(io.sentry.SentryLevel.ERROR, "Error parsing /proc/self/stat file.", e9);
            }
        }
        return 0L;
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(io.sentry.PerformanceCollectionData performanceCollectionData) {
        if (this.isEnabled) {
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.lastRealtimeNanos;
            this.lastRealtimeNanos = jElapsedRealtimeNanos;
            long totalCpuNanos = readTotalCpuNanos();
            long j9 = totalCpuNanos - this.lastCpuNanos;
            this.lastCpuNanos = totalCpuNanos;
            performanceCollectionData.addCpuData(new io.sentry.CpuCollectionData(java.lang.System.currentTimeMillis(), ((j9 / j) / this.numCores) * 100.0d));
        }
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
        this.isEnabled = true;
        this.clockSpeedHz = android.system.Os.sysconf(android.system.OsConstants._SC_CLK_TCK);
        this.numCores = android.system.Os.sysconf(android.system.OsConstants._SC_NPROCESSORS_CONF);
        this.nanosecondsPerClockTick = 1.0E9d / this.clockSpeedHz;
        this.lastCpuNanos = readTotalCpuNanos();
    }
}
