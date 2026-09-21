package androidx.media3.exoplayer.source.chunk;

import java.util.NoSuchElementException;

public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long j, long j9) {
        this.fromIndex = j;
        this.toIndex = j9;
        reset();
    }

    public final void checkInBounds() {
        long j = this.currentIndex;
        if (j < this.fromIndex || j > this.toIndex) {
            throw new NoSuchElementException();
        }
    }

    public final long getCurrentIndex() {
        return this.currentIndex;
    }

    @Override
    public boolean isEnded() {
        return this.currentIndex > this.toIndex;
    }

    @Override
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }
}
