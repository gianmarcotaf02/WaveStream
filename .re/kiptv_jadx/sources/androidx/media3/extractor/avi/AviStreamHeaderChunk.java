package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class AviStreamHeaderChunk implements androidx.media3.extractor.avi.AviChunk {
    private static final java.lang.String TAG = "AviStreamHeaderChunk";
    public final int initialFrames;
    public final int length;
    public final int rate;
    public final int sampleSize;
    public final int scale;
    public final int streamType;
    public final int suggestedBufferSize;

    private AviStreamHeaderChunk(int i3, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.streamType = i3;
        this.initialFrames = i9;
        this.scale = i10;
        this.rate = i11;
        this.length = i12;
        this.suggestedBufferSize = i13;
        this.sampleSize = i14;
    }

    public static androidx.media3.extractor.avi.AviStreamHeaderChunk parseFrom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt5 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt6 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        return new androidx.media3.extractor.avi.AviStreamHeaderChunk(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5, littleEndianInt6, parsableByteArray.readLittleEndianInt());
    }

    public long getDurationUs() {
        return androidx.media3.common.util.Util.scaleLargeTimestamp(this.length, ((long) this.scale) * 1000000, this.rate);
    }

    public float getFrameRate() {
        return this.rate / this.scale;
    }

    public int getTrackType() {
        int i3 = this.streamType;
        if (i3 == 1935960438) {
            return 2;
        }
        if (i3 == 1935963489) {
            return 1;
        }
        if (i3 == 1937012852) {
            return 3;
        }
        androidx.media3.common.util.Log.w(TAG, "Found unsupported streamType fourCC: " + java.lang.Integer.toHexString(this.streamType));
        return -1;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return androidx.media3.extractor.avi.AviExtractor.FOURCC_strh;
    }
}
