package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaChunk extends androidx.media3.exoplayer.source.chunk.Chunk {
    public final long chunkIndex;

    public MediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j9, long j10) {
        super(dataSource, dataSpec, 1, format, i3, obj, j, j9);
        format.getClass();
        this.chunkIndex = j10;
    }

    public long getNextChunkIndex() {
        long j = this.chunkIndex;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
