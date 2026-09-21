package androidx.media3.exoplayer.dash;

import androidx.media3.common.C;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.extractor.ChunkIndex;

public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j) {
        this.chunkIndex = chunkIndex;
        this.timeOffsetUs = j;
    }

    @Override
    public long getAvailableSegmentCount(long j, long j9) {
        return this.chunkIndex.length;
    }

    @Override
    public long getDurationUs(long j, long j9) {
        return this.chunkIndex.durationsUs[(int) j];
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
        return this.chunkIndex.length;
    }

    @Override
    public long getSegmentNum(long j, long j9) {
        return this.chunkIndex.getChunkIndex(j + this.timeOffsetUs);
    }

    @Override
    public RangedUri getSegmentUrl(long j) {
        ChunkIndex chunkIndex = this.chunkIndex;
        int i3 = (int) j;
        return new RangedUri(null, chunkIndex.offsets[i3], chunkIndex.sizes[i3]);
    }

    @Override
    public long getTimeUs(long j) {
        return this.chunkIndex.timesUs[(int) j] - this.timeOffsetUs;
    }

    @Override
    public boolean isExplicit() {
        return true;
    }
}
