package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class StartOffsetExtractorOutput implements androidx.media3.extractor.ExtractorOutput {
    private final androidx.media3.extractor.ExtractorOutput extractorOutput;
    private final long startOffset;

    public StartOffsetExtractorOutput(long j, androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.startOffset = j;
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final androidx.media3.extractor.SeekMap seekMap) {
        this.extractorOutput.seekMap(new androidx.media3.extractor.ForwardingSeekMap(seekMap) { // from class: androidx.media3.extractor.StartOffsetExtractorOutput.1
            @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
            public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
                androidx.media3.extractor.SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                androidx.media3.extractor.SeekPoint seekPoint = seekPoints.first;
                androidx.media3.extractor.SeekPoint seekPoint2 = new androidx.media3.extractor.SeekPoint(seekPoint.timeUs, androidx.media3.extractor.StartOffsetExtractorOutput.this.startOffset + seekPoint.position);
                androidx.media3.extractor.SeekPoint seekPoint3 = seekPoints.second;
                return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint2, new androidx.media3.extractor.SeekPoint(seekPoint3.timeUs, androidx.media3.extractor.StartOffsetExtractorOutput.this.startOffset + seekPoint3.position));
            }
        });
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i3, int i9) {
        return this.extractorOutput.track(i3, i9);
    }
}
