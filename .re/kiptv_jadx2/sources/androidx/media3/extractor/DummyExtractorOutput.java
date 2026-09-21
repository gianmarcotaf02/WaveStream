package androidx.media3.extractor;

@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
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
