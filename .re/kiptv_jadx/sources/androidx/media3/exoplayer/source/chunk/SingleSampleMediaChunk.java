package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class SingleSampleMediaChunk extends androidx.media3.exoplayer.source.chunk.BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final androidx.media3.common.Format sampleFormat;
    private final int trackType;

    public SingleSampleMediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j9, long j10, int i9, androidx.media3.common.Format format2) {
        super(dataSource, dataSpec, format, i3, obj, j, j9, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j10);
        this.trackType = i9;
        this.sampleFormat = format2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput output = getOutput();
        output.setSampleOffsetUs(0L);
        androidx.media3.extractor.TrackOutput trackOutputTrack = output.track(0, this.trackType);
        trackOutputTrack.format(this.sampleFormat);
        try {
            long jOpen = this.dataSource.open(this.dataSpec.subrange(this.nextLoadPosition));
            if (jOpen != -1) {
                jOpen += this.nextLoadPosition;
            }
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(this.dataSource, this.nextLoadPosition, jOpen);
            for (int iSampleData = 0; iSampleData != -1; iSampleData = trackOutputTrack.sampleData((androidx.media3.common.DataReader) defaultExtractorInput, androidx.media3.common.util.Log.LOG_LEVEL_OFF, true)) {
                this.nextLoadPosition += (long) iSampleData;
            }
            trackOutputTrack.sampleMetadata(this.startTimeUs, 1, (int) this.nextLoadPosition, 0, null);
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = true;
        } catch (java.lang.Throwable th) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            throw th;
        }
    }
}
