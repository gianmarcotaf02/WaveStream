package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingExtractorOutput implements androidx.media3.extractor.ExtractorOutput {
    private final androidx.media3.extractor.ExtractorOutput output;

    public ForwardingExtractorOutput(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.output.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
        this.output.seekMap(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i3, int i9) {
        return this.output.track(i3, i9);
    }
}
