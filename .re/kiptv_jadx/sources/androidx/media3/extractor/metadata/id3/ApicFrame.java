package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "APIC";
    public final java.lang.String description;
    public final java.lang.String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    public ApicFrame(java.lang.String str, java.lang.String str2, int i3, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i3;
        this.pictureData = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.ApicFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.ApicFrame apicFrame = (androidx.media3.extractor.metadata.id3.ApicFrame) obj;
            if (this.pictureType == apicFrame.pictureType && java.util.Objects.equals(this.mimeType, apicFrame.mimeType) && java.util.Objects.equals(this.description, apicFrame.description) && java.util.Arrays.equals(this.pictureData, apicFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i3 = (527 + this.pictureType) * 31;
        java.lang.String str = this.mimeType;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.description;
        return java.util.Arrays.hashCode(this.pictureData) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", description=" + this.description;
    }
}
