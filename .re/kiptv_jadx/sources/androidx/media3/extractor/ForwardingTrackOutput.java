package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingTrackOutput implements androidx.media3.extractor.TrackOutput {
    private final androidx.media3.extractor.TrackOutput trackOutput;

    public ForwardingTrackOutput(androidx.media3.extractor.TrackOutput trackOutput) {
        this.trackOutput = trackOutput;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void durationUs(long j) {
        this.trackOutput.durationUs(j);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(androidx.media3.common.Format format) {
        this.trackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6) {
        return this.trackOutput.sampleData(dataReader, i3, z6);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        this.trackOutput.sampleMetadata(j, i3, i9, i10, cryptoData);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        this.trackOutput.sampleData(parsableByteArray, i3);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6, int i9) {
        return this.trackOutput.sampleData(dataReader, i3, z6, i9);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
        this.trackOutput.sampleData(parsableByteArray, i3, i9);
    }
}
