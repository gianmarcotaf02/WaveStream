package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import androidx.media3.common.C;
import io.sentry.CpuCollectionData;
import io.sentry.ILogger;
import io.sentry.IPerformanceSnapshotCollector;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.util.FileUtils;
import io.sentry.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public final class AndroidCpuCollector implements IPerformanceSnapshotCollector {
    private final ILogger logger;
    private long lastRealtimeNanos = 0;
    private long lastCpuNanos = 0;
    private long clockSpeedHz = 1;
    private long numCores = 1;
    private final long NANOSECOND_PER_SECOND = C.NANOS_PER_SECOND;
    private double nanosecondsPerClockTick = 1.0E9d / 1;
    private final File selfStat = new File("/proc/self/stat");
    private boolean isEnabled = false;
    private final Pattern newLinePattern = Pattern.compile("[\n\t\r ]");

    public AndroidCpuCollector(ILogger iLogger) {
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    private long readTotalCpuNanos() {
        String text;
        try {
            text = FileUtils.readText(this.selfStat);
        } catch (IOException e6) {
            this.isEnabled = false;
            this.logger.log(SentryLevel.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e6);
            text = null;
        }
        if (text != null) {
            String[] strArrSplit = this.newLinePattern.split(text.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.nanosecondsPerClockTick);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e9) {
                this.logger.log(SentryLevel.ERROR, "Error parsing /proc/self/stat file.", e9);
            }
        }
        return 0L;
    }

    @Override
    public void collect(PerformanceCollectionData performanceCollectionData) {
        if (this.isEnabled) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.lastRealtimeNanos;
            this.lastRealtimeNanos = jElapsedRealtimeNanos;
            long totalCpuNanos = readTotalCpuNanos();
            long j9 = totalCpuNanos - this.lastCpuNanos;
            this.lastCpuNanos = totalCpuNanos;
            performanceCollectionData.addCpuData(new CpuCollectionData(System.currentTimeMillis(), ((j9 / j) / this.numCores) * 100.0d));
        }
    }

    @Override
    public void setup() {
        this.isEnabled = true;
        this.clockSpeedHz = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.numCores = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.nanosecondsPerClockTick = 1.0E9d / this.clockSpeedHz;
        this.lastCpuNanos = readTotalCpuNanos();
    }
}
