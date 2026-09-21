package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class PassthroughSectionPayloadReader implements androidx.media3.extractor.ts.SectionPayloadReader {
    private androidx.media3.common.Format format;
    private androidx.media3.extractor.TrackOutput output;
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(java.lang.String str, java.lang.String str2) {
        this.format = new androidx.media3.common.Format.Builder().setContainerMimeType(str2).setSampleMimeType(str).build();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"timestampAdjuster", "output"})
    private void assertInitialized() {
        this.timestampAdjuster.getClass();
        androidx.media3.common.util.Util.castNonNull(this.output);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.timestampAdjuster.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.timestampAdjuster.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == androidx.media3.common.C.TIME_UNSET || timestampOffsetUs == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        androidx.media3.common.Format format = this.format;
        if (timestampOffsetUs != format.subsampleOffsetUs) {
            androidx.media3.common.Format formatBuild = format.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, iBytesLeft);
        this.output.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = trackOutputTrack;
        trackOutputTrack.format(this.format);
    }
}
