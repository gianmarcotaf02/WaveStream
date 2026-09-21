package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import p121o0.p;

final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j, int i3, long j9, int i9, long j10, long[] jArr) {
        this.dataStartPosition = j;
        this.xingFrameSize = i3;
        this.durationUs = j9;
        this.bitrate = i9;
        this.dataSize = j10;
        this.tableOfContents = jArr;
        this.dataEndPosition = j10 != -1 ? j + j10 : -1L;
    }

    public static XingSeeker create(XingFrame xingFrame, long j, long j9) {
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long jMin = xingFrame.dataSize;
        if (jMin != -1 && j9 != -1 && j + jMin != j9) {
            long j10 = j9 - j;
            StringBuilder sbU = p.u(j10, "Data size mismatch between stream (", ") and Xing frame (");
            sbU.append(xingFrame.dataSize);
            sbU.append("), using smaller value.");
            Log.i(TAG, sbU.toString());
            jMin = Math.min(xingFrame.dataSize, j10);
        }
        MpegAudioUtil.Header header = xingFrame.header;
        return new XingSeeker(j, header.frameSize, jComputeDurationUs, header.bitrate, jMin, xingFrame.tableOfContents);
    }

    private long getTimeUsForTableIndex(int i3) {
        return (this.durationUs * ((long) i3)) / 100;
    }

    @Override
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override
    public long getDataStartPosition() {
        return this.dataStartPosition + ((long) this.xingFrameSize);
    }

    @Override
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j, 0L, this.durationUs);
        double d4 = (jConstrainValue * 100.0d) / this.durationUs;
        double d6 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d6 = 256.0d;
            } else {
                int i3 = (int) d4;
                long[] jArr = this.tableOfContents;
                jArr.getClass();
                double d9 = jArr[i3];
                d6 = d9 + (((i3 == 99 ? 256.0d : jArr[i3 + 1]) - d9) * (d4 - ((double) i3)));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d6 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override
    public long getTimeUs(long j) {
        long j9 = j - this.dataStartPosition;
        if (!isSeekable() || j9 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = this.tableOfContents;
        jArr.getClass();
        double d4 = (j9 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d4, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j10 = jArr[iBinarySearchFloor];
        int i3 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i3);
        long j11 = iBinarySearchFloor == 99 ? 256L : jArr[i3];
        return Math.round((j10 == j11 ? 0.0d : (d4 - j10) / (j11 - j10)) * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
    }

    @Override
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }
}
