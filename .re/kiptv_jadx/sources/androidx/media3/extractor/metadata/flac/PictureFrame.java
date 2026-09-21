package androidx.media3.extractor.metadata.flac;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements androidx.media3.common.Metadata.Entry {
    public final int colors;
    public final int depth;
    public final java.lang.String description;
    public final int height;
    public final java.lang.String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public PictureFrame(int i3, java.lang.String str, java.lang.String str2, int i9, int i10, int i11, int i12, byte[] bArr) {
        this.pictureType = i3;
        this.mimeType = str;
        this.description = str2;
        this.width = i9;
        this.height = i10;
        this.depth = i11;
        this.colors = i12;
        this.pictureData = bArr;
    }

    public static androidx.media3.extractor.metadata.flac.PictureFrame fromPictureBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(parsableByteArray.readString(parsableByteArray.readInt(), java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.String string = parsableByteArray.readString(parsableByteArray.readInt());
        int i9 = parsableByteArray.readInt();
        int i10 = parsableByteArray.readInt();
        int i11 = parsableByteArray.readInt();
        int i12 = parsableByteArray.readInt();
        int i13 = parsableByteArray.readInt();
        byte[] bArr = new byte[i13];
        parsableByteArray.readBytes(bArr, 0, i13);
        return new androidx.media3.extractor.metadata.flac.PictureFrame(i3, strNormalizeMimeType, string, i9, i10, i11, i12, bArr);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.flac.PictureFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.flac.PictureFrame pictureFrame = (androidx.media3.extractor.metadata.flac.PictureFrame) obj;
            if (this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && java.util.Arrays.equals(this.pictureData, pictureFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.pictureData) + ((((((((B2.a.a(B2.a.a((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    public java.lang.String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }
}
