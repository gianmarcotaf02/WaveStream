package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.C;
import androidx.media3.exoplayer.dash.DashSegmentIndex;

final class SingleSegmentIndex implements DashSegmentIndex {
    private final RangedUri uri;

    public SingleSegmentIndex(RangedUri rangedUri) {
        this.uri = rangedUri;
    }

    @Override
    public long getAvailableSegmentCount(long j, long j9) {
        return 1L;
    }

    @Override
    public long getDurationUs(long j, long j9) {
        return j9;
    }

    @Override
    public long getFirstAvailableSegmentNum(long j, long j9) {
        return 0L;
    }

    @Override
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override
    public long getNextSegmentAvailableTimeUs(long j, long j9) {
        return C.TIME_UNSET;
    }

    @Override
    public long getSegmentCount(long j) {
        return 1L;
    }

    @Override
    public long getSegmentNum(long j, long j9) {
        return 0L;
    }

    @Override
    public RangedUri getSegmentUrl(long j) {
        return this.uri;
    }

    @Override
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override
    public boolean isExplicit() {
        return true;
    }
}
