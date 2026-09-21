package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DefaultExtractorInput;

public final class InitializationChunk extends Chunk {
    private final ChunkExtractor chunkExtractor;
    private ChunkIndex chunkIndex;
    private volatile boolean loadCanceled;
    private long nextLoadPosition;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i3, Object obj, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, 2, format, i3, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.chunkExtractor = chunkExtractor;
    }

    @Override
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public ChunkIndex getChunkIndex() {
        return this.chunkIndex;
    }

    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider) {
        this.trackOutputProvider = trackOutputProvider;
    }

    @Override
    public void load() {
        if (this.nextLoadPosition == 0) {
            this.chunkExtractor.init(this.trackOutputProvider, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            DataSpec dataSpecSubrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, dataSpecSubrange.position, statsDataSource.open(dataSpecSubrange));
            while (!this.loadCanceled && this.chunkExtractor.read(defaultExtractorInput)) {
                try {
                } catch (Throwable th) {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    this.chunkIndex = this.chunkExtractor.getChunkIndex();
                    throw th;
                }
            }
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            this.chunkIndex = this.chunkExtractor.getChunkIndex();
            DataSourceUtil.closeQuietly(this.dataSource);
        } catch (Throwable th2) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }
}
