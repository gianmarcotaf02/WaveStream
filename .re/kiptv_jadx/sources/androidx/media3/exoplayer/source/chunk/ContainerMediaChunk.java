package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public class ContainerMediaChunk extends androidx.media3.exoplayer.source.chunk.BaseMediaChunk {
    private final int chunkCount;
    private final androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j9, long j10, long j11, long j12, int i9, long j13, androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i3, obj, j, j9, j10, j11, j12);
        this.chunkCount = i9;
        this.sampleOffsetUs = j13;
        this.chunkExtractor = chunkExtractor;
    }

    private void maybeWriteEmptySamples(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        if (androidx.media3.common.MimeTypes.isImage(this.trackFormat.containerMimeType)) {
            androidx.media3.common.Format format = this.trackFormat;
            int i3 = format.tileCountHorizontal;
            if ((i3 <= 1 && format.tileCountVertical <= 1) || i3 == -1 || format.tileCountVertical == -1) {
                return;
            }
            androidx.media3.extractor.TrackOutput trackOutputTrack = baseMediaChunkOutput.track(0, 4);
            androidx.media3.common.Format format2 = this.trackFormat;
            int i9 = format2.tileCountHorizontal * format2.tileCountVertical;
            long j = (this.endTimeUs - this.startTimeUs) / ((long) i9);
            for (int i10 = 1; i10 < i9; i10++) {
                trackOutputTrack.sampleData(new androidx.media3.common.util.ParsableByteArray(), 0);
                trackOutputTrack.sampleMetadata(((long) i10) * j, 0, 0, 0, null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + ((long) this.chunkCount);
    }

    public final long getNextLoadPosition() {
        return this.nextLoadPosition;
    }

    public androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider getTrackOutputProvider(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    public final boolean isLoadCanceled() {
        return this.loadCanceled;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor = this.chunkExtractor;
            androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j = this.clippedStartTimeUs;
            long j9 = androidx.media3.common.C.TIME_UNSET;
            long j10 = j == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : j - this.sampleOffsetUs;
            long j11 = this.clippedEndTimeUs;
            if (j11 != androidx.media3.common.C.TIME_UNSET) {
                j9 = j11 - this.sampleOffsetUs;
            }
            chunkExtractor.init(trackOutputProvider, j10, j9);
        }
        try {
            androidx.media3.datasource.DataSpec dataSpecSubrange = this.dataSpec.subrange(this.nextLoadPosition);
            androidx.media3.datasource.StatsDataSource statsDataSource = this.dataSource;
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(statsDataSource, dataSpecSubrange.position, statsDataSource.open(dataSpecSubrange));
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    throw th;
                }
            } while (this.chunkExtractor.read(defaultExtractorInput));
            maybeWriteEmptySamples(output);
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            onLoadEnded();
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (java.lang.Throwable th2) {
            onLoadEnded();
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }

    public void onLoadEnded() {
    }
}
