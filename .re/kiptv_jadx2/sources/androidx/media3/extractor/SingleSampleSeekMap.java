package androidx.media3.extractor;

public final class SingleSampleSeekMap implements SeekMap {
    private final long durationUs;
    private final long startPosition;

    public SingleSampleSeekMap(long j) {
        this(j, 0L);
    }

    @Override
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return new SeekMap.SeekPoints(new SeekPoint(j, this.startPosition));
    }

    @Override
    public boolean isSeekable() {
        return true;
    }

    public SingleSampleSeekMap(long j, long j9) {
        this.durationUs = j;
        this.startPosition = j9;
    }
}
