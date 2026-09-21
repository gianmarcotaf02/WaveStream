package androidx.media3.extractor.metadata.flac;

import B2.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class PictureFrame implements Metadata.Entry {
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public PictureFrame(int i3, String str, String str2, int i9, int i10, int i11, int i12, byte[] bArr) {
        this.pictureType = i3;
        this.mimeType = str;
        this.description = str2;
        this.width = i9;
        this.height = i10;
        this.depth = i11;
        this.colors = i12;
        this.pictureData = bArr;
    }

    public static PictureFrame fromPictureBlock(ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(parsableByteArray.readString(parsableByteArray.readInt(), StandardCharsets.US_ASCII));
        String string = parsableByteArray.readString(parsableByteArray.readInt());
        int i9 = parsableByteArray.readInt();
        int i10 = parsableByteArray.readInt();
        int i11 = parsableByteArray.readInt();
        int i12 = parsableByteArray.readInt();
        int i13 = parsableByteArray.readInt();
        byte[] bArr = new byte[i13];
        parsableByteArray.readBytes(bArr, 0, i13);
        return new PictureFrame(i3, strNormalizeMimeType, string, i9, i10, i11, i12, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictureData) + ((((((((a.a(a.a((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }
}
