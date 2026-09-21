package androidx.media3.extractor.flac;

/* JADX INFO: loaded from: classes.dex */
final class FlacBinarySearchSeeker extends androidx.media3.extractor.BinarySearchSeeker {

    public static final class FlacTimestampSeeker implements androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker {
        private final androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        private long findNextFrame(androidx.media3.extractor.ExtractorInput extractorInput) {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !androidx.media3.extractor.FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() < extractorInput.getLength() - 6) {
                return this.sampleNumberHolder.sampleNumber;
            }
            extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
            return this.flacStreamMetadata.totalSamples;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) {
            long position = extractorInput.getPosition();
            long jFindNextFrame = findNextFrame(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(java.lang.Math.max(6, this.flacStreamMetadata.minFrameSize));
            long jFindNextFrame2 = findNextFrame(extractorInput);
            long peekPosition2 = extractorInput.getPeekPosition();
            if (jFindNextFrame > j || jFindNextFrame2 <= j) {
                return jFindNextFrame2 <= j ? androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jFindNextFrame2, peekPosition2) : androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jFindNextFrame, position);
            }
            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
        }

        private FlacTimestampSeeker(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i3) {
            this.flacStreamMetadata = flacStreamMetadata;
            this.frameStartMarker = i3;
            this.sampleNumberHolder = new androidx.media3.extractor.FlacFrameReader.SampleNumberHolder();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlacBinarySearchSeeker(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i3, long j, long j9) {
        super(new F1.e(10, flacStreamMetadata), new androidx.media3.extractor.flac.FlacBinarySearchSeeker.FlacTimestampSeeker(flacStreamMetadata, i3), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j9, flacStreamMetadata.getApproxBytesPerFrame(), java.lang.Math.max(6, flacStreamMetadata.minFrameSize));
        java.util.Objects.requireNonNull(flacStreamMetadata);
    }
}
