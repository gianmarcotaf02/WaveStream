package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaChunk extends androidx.media3.exoplayer.source.chunk.MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput output;

    public BaseMediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j9, long j10, long j11, long j12) {
        super(dataSource, dataSpec, format, i3, obj, j, j9, j12);
        this.clippedStartTimeUs = j10;
        this.clippedEndTimeUs = j11;
    }

    public final int getFirstSampleIndex(int i3) {
        int[] iArr = this.firstSampleIndices;
        iArr.getClass();
        return iArr[i3];
    }

    public final androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput getOutput() {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput = this.output;
        baseMediaChunkOutput.getClass();
        return baseMediaChunkOutput;
    }

    public void init(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
