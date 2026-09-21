package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j, byte[] bArr, long j9) {
        this.ptsAdjustment = j9;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    public static androidx.media3.extractor.metadata.scte35.PrivateCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, long j) {
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i9 = i3 - 4;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new androidx.media3.extractor.metadata.scte35.PrivateCommand(unsignedInt, bArr, j);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.ptsAdjustment);
        sb.append(", identifier= ");
        return Y6.f.g(this.identifier, " }", sb);
    }
}
