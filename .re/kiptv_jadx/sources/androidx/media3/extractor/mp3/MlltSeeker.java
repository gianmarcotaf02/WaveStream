package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class MlltSeeker implements androidx.media3.extractor.mp3.Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.util.Util.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    public static androidx.media3.extractor.mp3.MlltSeeker create(long j, androidx.media3.extractor.metadata.id3.MlltFrame mlltFrame, long j9) {
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
        return new androidx.media3.extractor.mp3.MlltSeeker(jArr, jArr2, j9);
    }

    private static android.util.Pair<java.lang.Long, java.lang.Long> linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, j, true, true);
        long j9 = jArr[iBinarySearchFloor];
        long j10 = jArr2[iBinarySearchFloor];
        int i3 = iBinarySearchFloor + 1;
        if (i3 == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j9), java.lang.Long.valueOf(j10));
        }
        long j11 = jArr[i3];
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((j11 == j9 ? 0.0d : (j - j9) / (j11 - j9)) * (jArr2[i3] - j10))) + j10));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return androidx.media3.common.C.RATE_UNSET_INT;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return 0L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        android.util.Pair<java.lang.Long, java.lang.Long> pairLinearlyInterpolate = linearlyInterpolate(androidx.media3.common.util.Util.usToMs(androidx.media3.common.util.Util.constrainValue(j, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(androidx.media3.common.util.Util.msToUs(((java.lang.Long) pairLinearlyInterpolate.first).longValue()), ((java.lang.Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return androidx.media3.common.util.Util.msToUs(((java.lang.Long) linearlyInterpolate(j, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
