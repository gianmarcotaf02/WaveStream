package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class InitializationChunk extends androidx.media3.exoplayer.source.chunk.Chunk {
    private final androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor;
    private androidx.media3.extractor.ChunkIndex chunkIndex;
    private volatile boolean loadCanceled;
    private long nextLoadPosition;
    private androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public InitializationChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i3, java.lang.Object obj, androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, 2, format, i3, obj, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        this.chunkExtractor = chunkExtractor;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public androidx.media3.extractor.ChunkIndex getChunkIndex() {
        return this.chunkIndex;
    }

    public void init(androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider) {
        this.trackOutputProvider = trackOutputProvider;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        if (this.nextLoadPosition == 0) {
            this.chunkExtractor.init(this.trackOutputProvider, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        }
        try {
            androidx.media3.datasource.DataSpec dataSpecSubrange = this.dataSpec.subrange(this.nextLoadPosition);
            androidx.media3.datasource.StatsDataSource statsDataSource = this.dataSource;
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(statsDataSource, dataSpecSubrange.position, statsDataSource.open(dataSpecSubrange));
            while (!this.loadCanceled && this.chunkExtractor.read(defaultExtractorInput)) {
                try {
                } catch (java.lang.Throwable th) {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    this.chunkIndex = this.chunkExtractor.getChunkIndex();
                    throw th;
                }
            }
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            this.chunkIndex = this.chunkExtractor.getChunkIndex();
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
        } catch (java.lang.Throwable th2) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }
}
