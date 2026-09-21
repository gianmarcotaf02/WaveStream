package androidx.media3.extractor.metadata.scte35;

import Y6.f;
import androidx.media3.common.util.ParsableByteArray;

public final class PrivateCommand extends SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j, byte[] bArr, long j9) {
        this.ptsAdjustment = j9;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    public static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i3, long j) {
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i9 = i3 - 4;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new PrivateCommand(unsignedInt, bArr, j);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.ptsAdjustment);
        sb.append(", identifier= ");
        return f.g(this.identifier, " }", sb);
    }
}
