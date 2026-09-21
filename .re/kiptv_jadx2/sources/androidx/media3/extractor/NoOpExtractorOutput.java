package androidx.media3.extractor;

public final class NoOpExtractorOutput implements ExtractorOutput {
    @Override
    public void endTracks() {
    }

    @Override
    public void seekMap(SeekMap seekMap) {
    }

    @Override
    public TrackOutput track(int i3, int i9) {
        return new DiscardingTrackOutput();
    }
}
