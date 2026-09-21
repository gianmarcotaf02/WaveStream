package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class ListChunk implements androidx.media3.extractor.avi.AviChunk {
    public final p076i4.AbstractC2186b0 children;
    private final int type;

    private ListChunk(int i3, p076i4.AbstractC2186b0 abstractC2186b0) {
        this.type = i3;
        this.children = abstractC2186b0;
    }

    private static androidx.media3.extractor.avi.AviChunk createBox(int i3, int i9, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        switch (i3) {
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_strf /* 1718776947 */:
                return androidx.media3.extractor.avi.StreamFormatChunk.parseFrom(i9, parsableByteArray);
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_avih /* 1751742049 */:
                return androidx.media3.extractor.avi.AviMainHeaderChunk.parseFrom(parsableByteArray);
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_strh /* 1752331379 */:
                return androidx.media3.extractor.avi.AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_strn /* 1852994675 */:
                return androidx.media3.extractor.avi.StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static androidx.media3.extractor.avi.ListChunk parseFrom(int i3, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        p076i4.AbstractC2230y.d(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        int iLimit = parsableByteArray.limit();
        int i9 = 0;
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            androidx.media3.extractor.avi.AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((androidx.media3.extractor.avi.AviStreamHeaderChunk) from).getTrackType();
                }
                int i10 = i9 + 1;
                int iB = p076i4.V.b(objArrCopyOf.length, i10);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i9] = from;
                i9 = i10;
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new androidx.media3.extractor.avi.ListChunk(i3, p076i4.AbstractC2186b0.r(objArrCopyOf, i9));
    }

    public <T extends androidx.media3.extractor.avi.AviChunk> T getChild(java.lang.Class<T> cls) {
        p076i4.Z zListIterator = this.children.listIterator(0);
        while (zListIterator.hasNext()) {
            T t9 = (T) zListIterator.next();
            if (t9.getClass() == cls) {
                return t9;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }
}
