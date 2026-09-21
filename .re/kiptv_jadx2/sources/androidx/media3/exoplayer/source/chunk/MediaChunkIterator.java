package androidx.media3.exoplayer.source.chunk;

import androidx.media3.datasource.DataSpec;
import java.util.NoSuchElementException;

public interface MediaChunkIterator {
    public static final MediaChunkIterator EMPTY = new MediaChunkIterator() {
        @Override
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override
        public DataSpec getDataSpec() {
            throw new NoSuchElementException();
        }

        @Override
        public boolean isEnded() {
            return true;
        }

        @Override
        public boolean next() {
            return false;
        }

        @Override
        public void reset() {
        }
    };

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    DataSpec getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();
}
