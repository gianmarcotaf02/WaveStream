package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "PRIV";
    public final java.lang.String owner;
    public final byte[] privateData;

    public PrivFrame(java.lang.String str, byte[] bArr) {
        super(ID);
        this.owner = str;
        this.privateData = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.PrivFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.PrivFrame privFrame = (androidx.media3.extractor.metadata.id3.PrivFrame) obj;
            if (java.util.Objects.equals(this.owner, privFrame.owner) && java.util.Arrays.equals(this.privateData, privFrame.privateData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.owner;
        return java.util.Arrays.hashCode(this.privateData) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": owner=" + this.owner;
    }
}
