package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisUtil {
    private static final java.lang.String TAG = "VorbisUtil";

    public static final class CommentHeader {
        public final java.lang.String[] comments;
        public final int length;
        public final java.lang.String vendor;

        public CommentHeader(java.lang.String str, java.lang.String[] strArr, int i3) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i3;
        }
    }

    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z6, int i3, int i9, int i10) {
            this.blockFlag = z6;
            this.windowType = i3;
            this.transformType = i9;
            this.mapping = i10;
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z6, byte[] bArr) {
            this.version = i3;
            this.channels = i9;
            this.sampleRate = i10;
            this.bitrateMaximum = i11;
            this.bitrateNominal = i12;
            this.bitrateMinimum = i13;
            this.blockSize0 = i14;
            this.blockSize1 = i15;
            this.framingFlag = z6;
            this.data = bArr;
        }
    }

    private VorbisUtil() {
    }

    public static int[] getVorbisToAndroidChannelLayoutMapping(int i3) {
        if (i3 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i3 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i3 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i3 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i3 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int iLog(int i3) {
        int i9 = 0;
        while (i3 > 0) {
            i9++;
            i3 >>>= 1;
        }
        return i9;
    }

    private static long mapType1QuantValues(long j, long j9) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j9));
    }

    public static androidx.media3.common.Metadata parseVorbisComments(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            java.lang.String str = list.get(i3);
            java.lang.String[] strArrSplitAtFirst = androidx.media3.common.util.Util.splitAtFirst(str, "=");
            if (strArrSplitAtFirst.length != 2) {
                Y6.f.v("Failed to parse Vorbis comment: ", str, TAG);
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(androidx.media3.extractor.metadata.flac.PictureFrame.fromPictureBlock(new androidx.media3.common.util.ParsableByteArray(android.util.Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (java.lang.RuntimeException e6) {
                    androidx.media3.common.util.Log.w(TAG, "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new androidx.media3.extractor.metadata.vorbis.VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    public static p076i4.AbstractC2186b0 parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        parsableByteArray.skipBytes(1);
        int i3 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i3 += 255;
            parsableByteArray.skipBytes(1);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte() + i3;
        int i9 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i9 += 255;
            parsableByteArray.skipBytes(1);
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte() + i9;
        byte[] bArr2 = new byte[unsignedByte];
        int position = parsableByteArray.getPosition();
        java.lang.System.arraycopy(bArr, position, bArr2, 0, unsignedByte);
        int i10 = position + unsignedByte + unsignedByte2;
        int length = bArr.length - i10;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr, i10, bArr3, 0, length);
        return p076i4.AbstractC2186b0.z(bArr2, bArr3);
    }

    private static void readFloors(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i3 = 0; i3 < bits; i3++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 == 0) {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int bits3 = vorbisBitArray.readBits(4) + 1;
                for (int i9 = 0; i9 < bits3; i9++) {
                    vorbisBitArray.skipBits(8);
                }
            } else {
                if (bits2 != 1) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + bits2, null);
                }
                int bits4 = vorbisBitArray.readBits(5);
                int[] iArr = new int[bits4];
                int i10 = -1;
                for (int i11 = 0; i11 < bits4; i11++) {
                    int bits5 = vorbisBitArray.readBits(4);
                    iArr[i11] = bits5;
                    if (bits5 > i10) {
                        i10 = bits5;
                    }
                }
                int i12 = i10 + 1;
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = vorbisBitArray.readBits(3) + 1;
                    int bits6 = vorbisBitArray.readBits(2);
                    if (bits6 > 0) {
                        vorbisBitArray.skipBits(8);
                    }
                    for (int i14 = 0; i14 < (1 << bits6); i14++) {
                        vorbisBitArray.skipBits(8);
                    }
                }
                vorbisBitArray.skipBits(2);
                int bits7 = vorbisBitArray.readBits(4);
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < bits4; i17++) {
                    i15 += iArr2[iArr[i17]];
                    while (i16 < i15) {
                        vorbisBitArray.skipBits(bits7);
                        i16++;
                    }
                }
            }
        }
    }

    private static void readMappings(int i3, androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i9 = 0; i9 < bits; i9++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 != 0) {
                androidx.media3.common.util.Log.e(TAG, "mapping type other than 0 not supported: " + bits2);
            } else {
                int bits3 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                if (vorbisBitArray.readBit()) {
                    int bits4 = vorbisBitArray.readBits(8) + 1;
                    for (int i10 = 0; i10 < bits4; i10++) {
                        int i11 = i3 - 1;
                        vorbisBitArray.skipBits(iLog(i11));
                        vorbisBitArray.skipBits(iLog(i11));
                    }
                }
                if (vorbisBitArray.readBits(2) != 0) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (bits3 > 1) {
                    for (int i12 = 0; i12 < i3; i12++) {
                        vorbisBitArray.skipBits(4);
                    }
                }
                for (int i13 = 0; i13 < bits3; i13++) {
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static androidx.media3.extractor.VorbisUtil.Mode[] readModes(androidx.media3.extractor.VorbisBitArray vorbisBitArray) {
        int bits = vorbisBitArray.readBits(6) + 1;
        androidx.media3.extractor.VorbisUtil.Mode[] modeArr = new androidx.media3.extractor.VorbisUtil.Mode[bits];
        for (int i3 = 0; i3 < bits; i3++) {
            modeArr[i3] = new androidx.media3.extractor.VorbisUtil.Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readResidues(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i3 = 0; i3 < bits; i3++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            int bits2 = vorbisBitArray.readBits(6) + 1;
            vorbisBitArray.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i9 = 0; i9 < bits2; i9++) {
                iArr[i9] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) * 8) + vorbisBitArray.readBits(3);
            }
            for (int i10 = 0; i10 < bits2; i10++) {
                for (int i11 = 0; i11 < 8; i11++) {
                    if ((iArr[i10] & (1 << i11)) != 0) {
                        vorbisBitArray.skipBits(8);
                    }
                }
            }
        }
    }

    public static androidx.media3.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }

    public static androidx.media3.extractor.VorbisUtil.VorbisIdHeader readVorbisIdentificationHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        return new androidx.media3.extractor.VorbisUtil.VorbisIdHeader(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) java.lang.Math.pow(2.0d, unsignedByte2 & 15), (int) java.lang.Math.pow(2.0d, (unsignedByte2 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static androidx.media3.extractor.VorbisUtil.Mode[] readVorbisModes(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) throws androidx.media3.common.ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int unsignedByte = parsableByteArray.readUnsignedByte() + 1;
        androidx.media3.extractor.VorbisBitArray vorbisBitArray = new androidx.media3.extractor.VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i9 = 0; i9 < unsignedByte; i9++) {
            skipBook(vorbisBitArray);
        }
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i10 = 0; i10 < bits; i10++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i3, vorbisBitArray);
        androidx.media3.extractor.VorbisUtil.Mode[] modes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return modes;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static void skipBook(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        long jMapType1QuantValues;
        if (vorbisBitArray.readBits(24) != 5653314) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition(), null);
        }
        int bits = vorbisBitArray.readBits(16);
        int bits2 = vorbisBitArray.readBits(24);
        int bits3 = 0;
        if (vorbisBitArray.readBit()) {
            vorbisBitArray.skipBits(5);
            while (bits3 < bits2) {
                bits3 += vorbisBitArray.readBits(iLog(bits2 - bits3));
            }
        } else {
            boolean bit = vorbisBitArray.readBit();
            while (bits3 < bits2) {
                if (!bit) {
                    vorbisBitArray.skipBits(5);
                } else if (vorbisBitArray.readBit()) {
                    vorbisBitArray.skipBits(5);
                }
                bits3++;
            }
        }
        int bits4 = vorbisBitArray.readBits(4);
        if (bits4 > 2) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits4, null);
        }
        if (bits4 == 1 || bits4 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int bits5 = vorbisBitArray.readBits(4) + 1;
            vorbisBitArray.skipBits(1);
            if (bits4 == 1) {
                jMapType1QuantValues = bits != 0 ? mapType1QuantValues(bits2, bits) : 0L;
            } else {
                jMapType1QuantValues = ((long) bits) * ((long) bits2);
            }
            vorbisBitArray.skipBits((int) (jMapType1QuantValues * ((long) bits5)));
        }
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i3, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z6) throws androidx.media3.common.ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z6) {
                return false;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("too short header: " + parsableByteArray.bytesLeft(), null);
        }
        if (parsableByteArray.readUnsignedByte() != i3) {
            if (z6) {
                return false;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("expected header type " + java.lang.Integer.toHexString(i3), null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static androidx.media3.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z6, boolean z9) throws androidx.media3.common.ParserException {
        if (z6) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        java.lang.String string = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        java.lang.String[] strArr = new java.lang.String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i3 = 0; i3 < littleEndianUnsignedInt; i3++) {
            java.lang.String string2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i3] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z9 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new androidx.media3.extractor.VorbisUtil.CommentHeader(string, strArr, length2 + 1);
    }
}
