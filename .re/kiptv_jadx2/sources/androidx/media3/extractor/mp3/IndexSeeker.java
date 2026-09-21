package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;
import java.math.RoundingMode;

final class IndexSeeker implements Seeker {
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final IndexSeekMap indexSeekMap;

    public IndexSeeker(long j, long j9, long j10) {
        this.indexSeekMap = new IndexSeekMap(new long[]{j9}, new long[]{0}, j);
        this.dataStartPosition = j9;
        this.dataEndPosition = j10;
        int i3 = C.RATE_UNSET_INT;
        if (j == C.TIME_UNSET) {
            this.averageBitrate = C.RATE_UNSET_INT;
            return;
        }
        long jScaleLargeValue = Util.scaleLargeValue(j9 - j10, 8L, j, RoundingMode.HALF_UP);
        if (jScaleLargeValue > 0 && jScaleLargeValue <= 2147483647L) {
            i3 = (int) jScaleLargeValue;
        }
        this.averageBitrate = i3;
    }

    @Override
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override
    public long getDataStartPosition() {
        return this.dataStartPosition;
    }

    @Override
    public long getDurationUs() {
        return this.indexSeekMap.getDurationUs();
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return this.indexSeekMap.getSeekPoints(j);
    }

    @Override
    public long getTimeUs(long j) {
        return this.indexSeekMap.getTimeUs(j);
    }

    @Override
    public boolean isSeekable() {
        return this.indexSeekMap.isSeekable();
    }

    public boolean isTimeUsInIndex(long j) {
        return this.indexSeekMap.isTimeUsInIndex(j, 100000L);
    }

    public void maybeAddSeekPoint(long j, long j9) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.indexSeekMap.addSeekPoint(j, j9);
    }

    public void setDurationUs(long j) {
        this.indexSeekMap.setDurationUs(j);
    }
}
