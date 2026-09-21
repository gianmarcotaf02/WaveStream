package androidx.media3.common.util;

import androidx.media3.common.C;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.concurrent.TimeoutException;

public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return Util.scaleLargeTimestamp(j, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j) {
        return Util.scaleLargeTimestamp(j, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == MODE_SHARED) {
                    Long l2 = this.nextSampleTimestampUs.get();
                    l2.getClass();
                    jLongValue = l2.longValue();
                }
                this.timestampOffsetUs = jLongValue - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j9 = this.lastUnadjustedTimestampUs;
            if (j9 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j9);
                long j10 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j11 = ((j10 - 1) * MAX_PTS_PLUS_ONE) + j;
                long j12 = (j10 * MAX_PTS_PLUS_ONE) + j;
                j = Math.abs(j11 - jUsToNonWrappedPts) < Math.abs(j12 - jUsToNonWrappedPts) ? j11 : j12;
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j9 = this.lastUnadjustedTimestampUs;
            if (j9 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j9);
                long j10 = jUsToNonWrappedPts / MAX_PTS_PLUS_ONE;
                long j11 = (j10 * MAX_PTS_PLUS_ONE) + j;
                j = j11 >= jUsToNonWrappedPts ? j11 : ((j10 + 1) * MAX_PTS_PLUS_ONE) + j;
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.lastUnadjustedTimestampUs;
        } catch (Throwable th) {
            throw th;
        }
        return j != C.TIME_UNSET ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z6, long j, long j9) {
        try {
            AbstractC1864o0.Y(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z6) {
                this.nextSampleTimestampUs.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j10 = j9;
                while (!isInitialized()) {
                    if (j9 == 0) {
                        wait();
                    } else {
                        AbstractC1864o0.Y(j10 > 0);
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        wait(j10);
                        jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j9 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j9 + " milliseconds");
                        }
                        j10 = j9 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
