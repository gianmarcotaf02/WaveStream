package androidx.media3.extractor;

import androidx.media3.common.C;

public class ConstantBitrateSeekMap implements SeekMap {
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
            jMin = Math.min(jMin, j10 - ((long) i3));
        }
        return this.firstFrameBytePosition + Math.max(jMin, 0L);
    }

    @Override
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j) {
            int i3 = this.frameSize;
            if (((long) i3) + framePositionForTimeUs < this.inputLength) {
                long j9 = framePositionForTimeUs + ((long) i3);
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j9), j9));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.firstFrameBytePosition, this.bitrate);
    }

    @Override
    public boolean isEstimated() {
        return this.isEstimated;
    }

    @Override
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    public ConstantBitrateSeekMap(long j, long j9, int i3, int i9, boolean z6) {
        this(j, j9, i3, i9, z6, true);
    }

    private static long getTimeUsAtPosition(long j, long j9, int i3) {
        return (Math.max(0L, j - j9) * 8000000) / ((long) i3);
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
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j - j9;
            this.durationUs = getTimeUsAtPosition(j, j9, i3);
        }
    }
}
