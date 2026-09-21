package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public final byte[] data;

    public BinaryFrame(java.lang.String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.BinaryFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.BinaryFrame binaryFrame = (androidx.media3.extractor.metadata.id3.BinaryFrame) obj;
            if (this.id.equals(binaryFrame.id) && java.util.Arrays.equals(this.data, binaryFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.data) + B2.a.a(527, 31, this.id);
    }
}
