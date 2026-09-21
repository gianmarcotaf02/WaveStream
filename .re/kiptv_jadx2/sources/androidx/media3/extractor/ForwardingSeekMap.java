package androidx.media3.extractor;

public class ForwardingSeekMap implements SeekMap {
    private final SeekMap seekMap;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return this.seekMap.getSeekPoints(j);
    }

    @Override
    public boolean isEstimated() {
        return this.seekMap.isEstimated();
    }

    @Override
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
