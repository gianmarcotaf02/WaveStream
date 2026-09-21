package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ConstantBitrateSeekMap implements androidx.media3.extractor.SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;
    private final boolean isEstimated;

    public ConstantBitrateSeekMap(long j, long j9, int i3, int i9) {
        this(j, j9, i3, i9, false);
    }

    private long getFramePositionForTimeUs(long j) {
        long j9 = (j * ((long) this.bitrate)) / 8000000;
        int i3 = this.frameSize;
        long jMin = (j9 / ((long) i3)) * ((long) i3);
        long j10 = this.dataSize;
        if (j10 != -1) {
            jMin = java.lang.Math.min(jMin, j10 - ((long) i3));
        }
        return this.firstFrameBytePosition + java.lang.Math.max(jMin, 0L);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j) {
            int i3 = this.frameSize;
            if (((long) i3) + framePositionForTimeUs < this.inputLength) {
                long j9 = framePositionForTimeUs + ((long) i3);
                return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(getTimeUsAtPosition(j9), j9));
            }
        }
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.firstFrameBytePosition, this.bitrate);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isEstimated() {
        return this.isEstimated;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    public ConstantBitrateSeekMap(long j, long j9, int i3, int i9, boolean z6) {
        this(j, j9, i3, i9, z6, true);
    }

    private static long getTimeUsAtPosition(long j, long j9, int i3) {
        return (java.lang.Math.max(0L, j - j9) * 8000000) / ((long) i3);
    }

    public ConstantBitrateSeekMap(long j, long j9, int i3, int i9, boolean z6, boolean z9) {
        this.inputLength = j;
        this.firstFrameBytePosition = j9;
        this.frameSize = i9 == -1 ? 1 : i9;
        this.bitrate = i3;
        this.allowSeeksIfLengthUnknown = z6;
        this.isEstimated = z9;
        if (j == -1) {
            this.dataSize = -1L;
            this.durationUs = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.dataSize = j - j9;
            this.durationUs = getTimeUsAtPosition(j, j9, i3);
        }
    }
}
