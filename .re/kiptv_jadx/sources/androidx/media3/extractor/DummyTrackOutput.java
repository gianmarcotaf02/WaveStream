package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class DummyTrackOutput implements androidx.media3.extractor.TrackOutput {
    private final androidx.media3.extractor.DiscardingTrackOutput discardingTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();

    @Override // androidx.media3.extractor.TrackOutput
    public void format(androidx.media3.common.Format format) {
        this.discardingTrackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6) {
        return this.discardingTrackOutput.sampleData(dataReader, i3, z6);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        this.discardingTrackOutput.sampleMetadata(j, i3, i9, i10, cryptoData);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i3);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6, int i9) {
        return this.discardingTrackOutput.sampleData(dataReader, i3, z6, i9);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i3, i9);
    }
}
