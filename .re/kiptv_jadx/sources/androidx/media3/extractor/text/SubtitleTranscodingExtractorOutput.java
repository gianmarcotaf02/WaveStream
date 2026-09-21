package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleTranscodingExtractorOutput implements androidx.media3.extractor.ExtractorOutput {
    private final androidx.media3.extractor.ExtractorOutput delegate;
    private boolean hasTracksOtherThanTextAndMetadata;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final android.util.SparseArray<androidx.media3.extractor.text.SubtitleTranscodingTrackOutput> textTrackOutputs = new android.util.SparseArray<>();

    public SubtitleTranscodingExtractorOutput(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.delegate = extractorOutput;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.delegate.endTracks();
        if (this.hasTracksOtherThanTextAndMetadata) {
            for (int i3 = 0; i3 < this.textTrackOutputs.size(); i3++) {
                this.textTrackOutputs.valueAt(i3).shouldSuppressParsingErrors(true);
            }
        }
    }

    public void resetSubtitleParsers() {
        for (int i3 = 0; i3 < this.textTrackOutputs.size(); i3++) {
            this.textTrackOutputs.valueAt(i3).resetSubtitleParser();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
        this.delegate.seekMap(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i3, int i9) {
        if (i9 != 3 && i9 != 5) {
            this.hasTracksOtherThanTextAndMetadata = true;
        }
        if (i9 != 3) {
            return this.delegate.track(i3, i9);
        }
        androidx.media3.extractor.text.SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.textTrackOutputs.get(i3);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        androidx.media3.extractor.text.SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new androidx.media3.extractor.text.SubtitleTranscodingTrackOutput(this.delegate.track(i3, i9), this.subtitleParserFactory);
        this.textTrackOutputs.put(i3, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }
}
