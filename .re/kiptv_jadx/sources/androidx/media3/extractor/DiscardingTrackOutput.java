package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DiscardingTrackOutput implements androidx.media3.extractor.TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public void format(androidx.media3.common.Format format) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6, int i9) throws java.io.EOFException {
        int i10 = dataReader.read(this.readBuffer, 0, java.lang.Math.min(this.readBuffer.length, i3));
        if (i10 != -1) {
            return i10;
        }
        if (z6) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
        parsableByteArray.skipBytes(i3);
    }
}
