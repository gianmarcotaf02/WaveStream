package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class AviMainHeaderChunk implements androidx.media3.extractor.avi.AviChunk {
    private static final int AVIF_HAS_INDEX = 16;
    public final int flags;
    public final int frameDurationUs;
    public final int streams;
    public final int totalFrames;

    private AviMainHeaderChunk(int i3, int i9, int i10, int i11) {
        this.frameDurationUs = i3;
        this.flags = i9;
        this.totalFrames = i10;
        this.streams = i11;
    }

    public static androidx.media3.extractor.avi.AviMainHeaderChunk parseFrom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(8);
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        return new androidx.media3.extractor.avi.AviMainHeaderChunk(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4);
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return androidx.media3.extractor.avi.AviExtractor.FOURCC_avih;
    }

    public boolean hasIndex() {
        return (this.flags & 16) == 16;
    }
}
