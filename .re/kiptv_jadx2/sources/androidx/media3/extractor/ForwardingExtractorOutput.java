package androidx.media3.extractor;

public class ForwardingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput output;

    public ForwardingExtractorOutput(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override
    public void endTracks() {
        this.output.endTracks();
    }

    @Override
    public void seekMap(SeekMap seekMap) {
        this.output.seekMap(seekMap);
    }

    @Override
    public TrackOutput track(int i3, int i9) {
        return this.output.track(i3, i9);
    }
}
