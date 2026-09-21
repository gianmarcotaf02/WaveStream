package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "GEOB";
    public final byte[] data;
    public final java.lang.String description;
    public final java.lang.String filename;
    public final java.lang.String mimeType;

    public GeobFrame(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.GeobFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.GeobFrame geobFrame = (androidx.media3.extractor.metadata.id3.GeobFrame) obj;
            if (java.util.Objects.equals(this.mimeType, geobFrame.mimeType) && java.util.Objects.equals(this.filename, geobFrame.filename) && java.util.Objects.equals(this.description, geobFrame.description) && java.util.Arrays.equals(this.data, geobFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.mimeType;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.filename;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.description;
        return java.util.Arrays.hashCode(this.data) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", filename=" + this.filename + ", description=" + this.description;
    }
}
