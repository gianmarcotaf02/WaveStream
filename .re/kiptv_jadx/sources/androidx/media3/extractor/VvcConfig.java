package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class VvcConfig {
    public final int bitdepthLuma;
    public final java.lang.String codecs;
    public final java.util.List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private VvcConfig(java.util.List<byte[]> list, int i3, java.lang.String str, int i9) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i3;
        this.codecs = str;
        this.bitdepthLuma = i9;
    }

    public static androidx.media3.extractor.VvcConfig parse(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        int unsignedByte;
        int unsignedByte2;
        int i3;
        int i9;
        int i10;
        try {
            if (parsableByteArray.readInt() != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Unsupported VVC version", null);
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            int i11 = 1;
            int i12 = ((unsignedByte3 >> 1) & 3) + 1;
            java.lang.String str = "L";
            if ((unsignedByte3 & 1) != 0) {
                parsableByteArray.skipBytes(1);
                int unsignedByte4 = (parsableByteArray.readUnsignedByte() >> 4) & 7;
                unsignedByte = (parsableByteArray.readUnsignedByte() >> 5) & 7;
                int unsignedByte5 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedByte6 = parsableByteArray.readUnsignedByte();
                i3 = (unsignedByte6 >> 1) & 127;
                str = (unsignedByte6 & 1) != 0 ? "H" : "L";
                unsignedByte2 = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(unsignedByte5);
                if (unsignedByte4 > 1) {
                    int unsignedByte7 = parsableByteArray.readUnsignedByte();
                    for (int i13 = 0; i13 < unsignedByte4 - 1; i13++) {
                        if (((unsignedByte7 >> (7 - i13)) & 1) != 0) {
                            parsableByteArray.skipBytes(1);
                        }
                    }
                }
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte() * 4);
                parsableByteArray.skipBytes(6);
            } else {
                unsignedByte = 0;
                unsignedByte2 = 0;
                i3 = 0;
            }
            int unsignedByte8 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i9 = 12;
                i10 = 13;
                if (i14 >= unsignedByte8) {
                    break;
                }
                int unsignedByte9 = parsableByteArray.readUnsignedByte() & 31;
                int unsignedShort = (unsignedByte9 == 13 || unsignedByte9 == 12) ? 1 : parsableByteArray.readUnsignedShort();
                for (int i16 = 0; i16 < unsignedShort; i16++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i15 = unsignedShort2 + 4 + i15;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i14++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i15];
            int i17 = 0;
            int i18 = 0;
            while (i17 < unsignedByte8) {
                int unsignedByte10 = parsableByteArray.readUnsignedByte() & 31;
                int unsignedShort3 = (unsignedByte10 == i10 || unsignedByte10 == i9) ? i11 : parsableByteArray.readUnsignedShort();
                for (int i19 = 0; i19 < unsignedShort3; i19++) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    java.lang.System.arraycopy(androidx.media3.container.NalUnitUtil.NAL_START_CODE, 0, bArr, i18, 4);
                    int i20 = i18 + 4;
                    parsableByteArray.readBytes(bArr, i20, unsignedShort4);
                    i18 = i20 + unsignedShort4;
                }
                i17++;
                i11 = 1;
                i9 = 12;
                i10 = 13;
            }
            java.util.Locale locale = java.util.Locale.US;
            return new androidx.media3.extractor.VvcConfig(p076i4.AbstractC2186b0.y(bArr), i12, "vvc1." + i3 + "." + str + unsignedByte2, unsignedByte + 8);
        } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing VVC configuration", e6);
        }
    }
}
