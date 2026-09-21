package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, androidx.media3.container.OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, 224, 256, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, org.videolan.libvlc.MediaDiscoverer.Event.Started, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, androidx.media3.container.OpusUtil.SAMPLE_RATE, 96000, DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final java.lang.String mimeType;
        public final int sampleRate;

        private DtsHeader(java.lang.String str, int i3, int i9, int i10, long j, int i11) {
            this.mimeType = str;
            this.channelCount = i3;
            this.sampleRate = i9;
            this.frameSize = i10;
            this.frameDurationUs = j;
            this.bitrate = i11;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    private DtsUtil() {
    }

    private static void checkCrc(byte[] bArr, int i3) throws androidx.media3.common.ParserException {
        int i9 = i3 - 2;
        if (((bArr[i3 - 1] & FIRST_BYTE_14B_LE) | ((bArr[i9] << 8) & io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE)) != androidx.media3.common.util.Util.crc16(bArr, 0, i9, io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE)) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int getDtsFrameSize(byte[] bArr) {
        int i3;
        byte b9;
        int i9;
        int i10;
        byte b10;
        boolean z6 = false;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i10 = ((bArr[7] & 3) << 12) | ((bArr[6] & FIRST_BYTE_14B_LE) << 4);
                b10 = bArr[9];
            } else if (b11 != 31) {
                i3 = ((bArr[5] & 3) << 12) | ((bArr[6] & FIRST_BYTE_14B_LE) << 4);
                b9 = bArr[7];
            } else {
                i10 = ((bArr[6] & 3) << 12) | ((bArr[7] & FIRST_BYTE_14B_LE) << 4);
                b10 = bArr[8];
            }
            i9 = (((b10 & 60) >> 2) | i10) + 1;
            z6 = true;
            if (z6) {
                return (i9 * 16) / 14;
            }
            return i9;
        }
        i3 = ((bArr[4] & 3) << 12) | ((bArr[7] & FIRST_BYTE_14B_LE) << 4);
        b9 = bArr[6];
        i9 = (((b9 & 240) >> 4) | i3) + 1;
        if (z6) {
            return (i9 * 16) / 14;
        }
        return i9;
    }

    public static int getFrameType(int i3) {
        if (i3 == SYNC_VALUE_BE || i3 == SYNC_VALUE_LE || i3 == SYNC_VALUE_14B_BE || i3 == SYNC_VALUE_14B_LE) {
            return 1;
        }
        if (i3 == SYNC_VALUE_EXTSS_BE || i3 == SYNC_VALUE_EXTSS_LE) {
            return 2;
        }
        if (i3 == SYNC_VALUE_UHD_FTOC_SYNC_BE || i3 == SYNC_VALUE_UHD_FTOC_SYNC_LE) {
            return 3;
        }
        return (i3 == SYNC_VALUE_UHD_FTOC_NONSYNC_BE || i3 == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) ? 4 : 0;
    }

    private static androidx.media3.common.util.ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b9 = bArr[0];
        if (b9 == 127 || b9 == 100 || b9 == 64 || b9 == 113) {
            return new androidx.media3.common.util.ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i3 = 0; i3 < bArrCopyOf.length - 1; i3 += 2) {
                byte b10 = bArrCopyOf[i3];
                int i9 = i3 + 1;
                bArrCopyOf[i3] = bArrCopyOf[i9];
                bArrCopyOf[i9] = b10;
            }
        }
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            androidx.media3.common.util.ParsableBitArray parsableBitArray2 = new androidx.media3.common.util.ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b9 = bArr[0];
        return b9 == -2 || b9 == -1 || b9 == 37 || b9 == -14 || b9 == -24;
    }

    public static boolean isSampleDtsHd(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i3);
        if (!extractorInput.peekFully(parsableByteArray.getData(), 0, i3, true)) {
            return false;
        }
        extractorInput.resetPeekPosition();
        if (getFrameType(parsableByteArray.peekInt()) != 1 || parsableByteArray.bytesLeft() < 10) {
            return false;
        }
        byte[] bArr = new byte[10];
        parsableByteArray.readBytes(bArr, 0, 10);
        parsableByteArray.setPosition(0);
        int dtsFrameSize = getDtsFrameSize(bArr);
        if (dtsFrameSize > 0 && parsableByteArray.bytesLeft() >= dtsFrameSize + 4) {
            parsableByteArray.skipBytes(dtsFrameSize);
            if (getFrameType(parsableByteArray.readInt()) == 2) {
                return true;
            }
        }
        return false;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i3;
        byte b9;
        int i9;
        byte b10;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i3 = (bArr[4] & 7) << 4;
                b10 = bArr[7];
            } else if (b11 != 31) {
                i3 = (bArr[4] & 1) << 6;
                b9 = bArr[5];
            } else {
                i3 = (bArr[5] & 7) << 4;
                b10 = bArr[6];
            }
            i9 = b10 & 60;
            return (((i9 >> 2) | i3) + 1) * 32;
        }
        i3 = (bArr[5] & 1) << 6;
        b9 = bArr[4];
        i9 = b9 & 252;
        return (((i9 >> 2) | i3) + 1) * 32;
    }

    public static androidx.media3.common.Format parseDtsFormat(byte[] bArr, java.lang.String str, java.lang.String str2, int i3, java.lang.String str3, androidx.media3.common.DrmInitData drmInitData) {
        androidx.media3.common.util.ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i9 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i10 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i11 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrame.skipBits(10);
        return new androidx.media3.common.Format.Builder().setId(str).setContainerMimeType(str3).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_DTS).setAverageBitrate(i11).setChannelCount(i9 + (normalizedFrame.readBits(2) > 0 ? 1 : 0)).setSampleRate(i10).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i3).build();
    }

    public static androidx.media3.extractor.DtsUtil.DtsHeader parseDtsHdHeader(byte[] bArr) throws androidx.media3.common.ParserException {
        int i3;
        int i9;
        int bits;
        int i10;
        long jScaleLargeTimestamp;
        int i11;
        androidx.media3.common.util.ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits2 = normalizedFrame.readBits(2);
        if (normalizedFrame.readBit()) {
            i3 = 20;
            i9 = 12;
        } else {
            i3 = 16;
            i9 = 8;
        }
        normalizedFrame.skipBits(i9);
        int bits3 = normalizedFrame.readBits(i3) + 1;
        boolean bit = normalizedFrame.readBit();
        int bits4 = -1;
        int i12 = 0;
        if (bit) {
            bits = normalizedFrame.readBits(2);
            int bits5 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 != 1 || bits7 != 1) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i13 = bits2 + 1;
            int bits8 = normalizedFrame.readBits(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                if (((bits8 >> i14) & 1) == 1) {
                    normalizedFrame.skipBits(8);
                }
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(2);
                int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                int bits10 = normalizedFrame.readBits(2) + 1;
                while (i12 < bits10) {
                    normalizedFrame.skipBits(bits9);
                    i12++;
                }
            }
            i12 = bits5;
        } else {
            bits = -1;
        }
        normalizedFrame.skipBits(i3);
        normalizedFrame.skipBits(12);
        if (bit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            i10 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            bits4 = normalizedFrame.readBits(8) + 1;
        } else {
            i10 = androidx.media3.common.C.RATE_UNSET_INT;
        }
        int i15 = i10;
        if (bit) {
            if (bits == 0) {
                i11 = 32000;
            } else if (bits == 1) {
                i11 = 44100;
            } else {
                if (bits != 2) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                }
                i11 = androidx.media3.container.OpusUtil.SAMPLE_RATE;
            }
            jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(i12, 1000000L, i11);
        } else {
            jScaleLargeTimestamp = androidx.media3.common.C.TIME_UNSET;
        }
        return new androidx.media3.extractor.DtsUtil.DtsHeader(androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS, bits4, i15, bits3, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        androidx.media3.common.util.ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        return normalizedFrame.readBits(normalizedFrame.readBit() ? 12 : 8) + 1;
    }

    public static androidx.media3.extractor.DtsUtil.DtsHeader parseDtsUhdHeader(byte[] bArr, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws androidx.media3.common.ParserException {
        int bits;
        long jScaleLargeTimestamp;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        int i3;
        int i9;
        androidx.media3.common.util.ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int i10 = normalizedFrame.readBits(32) == SYNC_VALUE_UHD_FTOC_SYNC_BE ? 1 : 0;
        int unsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i10 == 0) {
            bits = androidx.media3.common.C.RATE_UNSET_INT;
            jScaleLargeTimestamp = androidx.media3.common.C.TIME_UNSET;
        } else {
            if (!normalizedFrame.readBit()) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            checkCrc(bArr, unsignedVarInt);
            int bits2 = normalizedFrame.readBits(2);
            if (bits2 == 0) {
                i3 = 512;
            } else if (bits2 == 1) {
                i3 = 480;
            } else {
                if (bits2 != 2) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                }
                i3 = androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
            }
            int bits3 = (normalizedFrame.readBits(3) + 1) * i3;
            int bits4 = normalizedFrame.readBits(2);
            if (bits4 == 0) {
                i9 = 32000;
            } else if (bits4 == 1) {
                i9 = 44100;
            } else {
                if (bits4 != 2) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                }
                i9 = androidx.media3.container.OpusUtil.SAMPLE_RATE;
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            bits = (1 << normalizedFrame.readBits(2)) * i9;
            jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(bits3, 1000000L, i9);
        }
        int i11 = bits;
        long j = jScaleLargeTimestamp;
        int unsignedVarInt2 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            unsignedVarInt2 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i10 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new androidx.media3.extractor.DtsUtil.DtsHeader(androidx.media3.common.MimeTypes.AUDIO_DTS_X, 2, i11, unsignedVarInt2 + (atomicInteger2.get() != 0 ? parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true) : 0) + unsignedVarInt, j, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        androidx.media3.common.util.ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    private static int parseUnsignedVarInt(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, boolean z6) {
        int i3 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < 3 && parsableBitArray.readBit(); i10++) {
            i9++;
        }
        if (z6) {
            int i11 = 0;
            while (i3 < i9) {
                i11 += 1 << iArr[i3];
                i3++;
            }
            i3 = i11;
        }
        return parsableBitArray.readBits(iArr[i9]) + i3;
    }

    public static int parseDtsAudioSampleCount(java.nio.ByteBuffer byteBuffer) {
        int i3;
        byte b9;
        int i9;
        byte b10;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b11 = byteBuffer.get(iPosition);
        if (b11 != -2) {
            if (b11 == -1) {
                i3 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b10 = byteBuffer.get(iPosition + 7);
            } else if (b11 != 31) {
                i3 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b9 = byteBuffer.get(iPosition + 5);
            } else {
                i3 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b10 = byteBuffer.get(iPosition + 6);
            }
            i9 = b10 & 60;
            return (((i9 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b9 = byteBuffer.get(iPosition + 4);
        i9 = b9 & 252;
        return (((i9 >> 2) | i3) + 1) * 32;
    }
}
