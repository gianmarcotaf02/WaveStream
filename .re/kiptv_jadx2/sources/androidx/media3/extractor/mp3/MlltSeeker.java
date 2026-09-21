package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.metadata.id3.MlltFrame;

final class MlltSeeker implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j == C.TIME_UNSET ? Util.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    public static MlltSeeker create(long j, MlltFrame mlltFrame, long j9) {
        int length = mlltFrame.bytesDeviations.length;
        int i3 = length + 1;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        jArr[0] = j;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i9 = 1; i9 <= length; i9++) {
            int i10 = i9 - 1;
            j += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i10]);
            j10 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i10]);
            jArr[i9] = j;
            jArr2[i9] = j10;
        }
        return new MlltSeeker(jArr, jArr2, j9);
    }

    private static Pair<Long, Long> linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, j, true, true);
        long j9 = jArr[iBinarySearchFloor];
        long j10 = jArr2[iBinarySearchFloor];
        int i3 = iBinarySearchFloor + 1;
        if (i3 == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        long j11 = jArr[i3];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j11 == j9 ? 0.0d : (j - j9) / (j11 - j9)) * (jArr2[i3] - j10))) + j10));
    }

    @Override
    public int getAverageBitrate() {
        return C.RATE_UNSET_INT;
    }

    @Override
    public long getDataEndPosition() {
        return -1L;
    }

    @Override
    public long getDataStartPosition() {
        return 0L;
    }

    @Override
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        Pair<Long, Long> pairLinearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) pairLinearlyInterpolate.first).longValue()), ((Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override
    public long getTimeUs(long j) {
        return Util.msToUs(((Long) linearlyInterpolate(j, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override
    public boolean isSeekable() {
        return true;
    }
}
