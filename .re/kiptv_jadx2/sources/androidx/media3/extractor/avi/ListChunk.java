package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;
import java.util.Arrays;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.V;
import p076i4.Z;

final class ListChunk implements AviChunk {
    public final AbstractC2186b0 children;
    private final int type;

    private ListChunk(int i3, AbstractC2186b0 abstractC2186b0) {
        this.type = i3;
        this.children = abstractC2186b0;
    }

    private static AviChunk createBox(int i3, int i9, ParsableByteArray parsableByteArray) {
        switch (i3) {
            case AviExtractor.FOURCC_strf:
                return StreamFormatChunk.parseFrom(i9, parsableByteArray);
            case AviExtractor.FOURCC_avih:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i3, ParsableByteArray parsableByteArray) {
        AbstractC2230y.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iLimit = parsableByteArray.limit();
        int i9 = 0;
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) from).getTrackType();
                }
                int i10 = i9 + 1;
                int iB = V.b(objArrCopyOf.length, i10);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i9] = from;
                i9 = i10;
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i3, AbstractC2186b0.r(objArrCopyOf, i9));
    }

    public <T extends AviChunk> T getChild(Class<T> cls) {
        Z zListIterator = this.children.listIterator(0);
        while (zListIterator.hasNext()) {
            T t9 = (T) zListIterator.next();
            if (t9.getClass() == cls) {
                return t9;
            }
        }
        return null;
    }

    @Override
    public int getType() {
        return this.type;
    }
}
