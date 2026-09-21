package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleExtractor implements androidx.media3.extractor.Extractor {
    private static final int FIXED_READ_LENGTH = 1024;
    public static final int IMAGE_TRACK_ID = 1024;
    private static final int STATE_ENDED = 2;
    private static final int STATE_READING = 1;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private final int fileSignature;
    private final int fileSignatureLength;
    private final java.lang.String sampleMimeType;
    private int size;
    private int state;
    private androidx.media3.extractor.TrackOutput trackOutput;

    public SingleSampleExtractor(int i3, int i9, java.lang.String str) {
        this.fileSignature = i3;
        this.fileSignatureLength = i9;
        this.sampleMimeType = str;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.extractorOutput"})
    private void outputImageTrackAndSeekMap(java.lang.String str) {
        androidx.media3.extractor.TrackOutput trackOutputTrack = this.extractorOutput.track(1024, 4);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(new androidx.media3.common.Format.Builder().setContainerMimeType(str).setSampleMimeType(str).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new androidx.media3.extractor.SingleSampleSeekMap(androidx.media3.common.C.TIME_UNSET));
        this.state = 1;
    }

    private void readSegment(androidx.media3.extractor.ExtractorInput extractorInput) {
        androidx.media3.extractor.TrackOutput trackOutput = this.trackOutput;
        trackOutput.getClass();
        int iSampleData = trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, 1024, true);
        if (iSampleData != -1) {
            this.size += iSampleData;
            return;
        }
        this.state = 2;
        this.trackOutput.sampleMetadata(0L, 1, this.size, 0, null);
        this.size = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        outputImageTrackAndSeekMap(this.sampleMimeType);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        int i3 = this.state;
        if (i3 == 1) {
            readSegment(extractorInput);
            return 0;
        }
        if (i3 == 2) {
            return -1;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        if (j == 0 || this.state == 1) {
            this.state = 1;
            this.size = 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.fileSignature == -1 || this.fileSignatureLength == -1) ? false : true);
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(this.fileSignatureLength);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.fileSignatureLength);
        return parsableByteArray.readUnsignedShort() == this.fileSignature;
    }
}
