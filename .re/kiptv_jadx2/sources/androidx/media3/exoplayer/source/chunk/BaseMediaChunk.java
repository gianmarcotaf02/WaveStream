package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;

public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i3, Object obj, long j, long j9, long j10, long j11, long j12) {
        super(dataSource, dataSpec, format, i3, obj, j, j9, j12);
        this.clippedStartTimeUs = j10;
        this.clippedEndTimeUs = j11;
    }

    public final int getFirstSampleIndex(int i3) {
        int[] iArr = this.firstSampleIndices;
        iArr.getClass();
        return iArr[i3];
    }

    public final BaseMediaChunkOutput getOutput() {
        BaseMediaChunkOutput baseMediaChunkOutput = this.output;
        baseMediaChunkOutput.getClass();
        return baseMediaChunkOutput;
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
