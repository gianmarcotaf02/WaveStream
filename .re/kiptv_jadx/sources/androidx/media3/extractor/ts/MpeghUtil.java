package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class MpeghUtil {
    private static final int MHAS_SYNC_WORD = 12583333;

    public static class MhasPacketHeader {
        public static final int PACTYPE_EARCON = 19;
        public static final int PACTYPE_PCMCONFIG = 20;
        public static final int PACTYPE_PCMDATA = 21;
        public static final int PACTYP_AUDIOSCENEINFO = 3;
        public static final int PACTYP_AUDIOTRUNCATION = 17;
        public static final int PACTYP_BUFFERINFO = 14;
        public static final int PACTYP_CRC16 = 9;
        public static final int PACTYP_CRC32 = 10;
        public static final int PACTYP_DESCRIPTOR = 11;
        public static final int PACTYP_FILLDATA = 0;
        public static final int PACTYP_GENDATA = 18;
        public static final int PACTYP_GLOBAL_CRC16 = 15;
        public static final int PACTYP_GLOBAL_CRC32 = 16;
        public static final int PACTYP_LOUDNESS = 22;
        public static final int PACTYP_LOUDNESS_DRC = 13;
        public static final int PACTYP_MARKER = 8;
        public static final int PACTYP_MPEGH3DACFG = 1;
        public static final int PACTYP_MPEGH3DAFRAME = 2;
        public static final int PACTYP_SYNC = 6;
        public static final int PACTYP_SYNCGAP = 7;
        public static final int PACTYP_USERINTERACTION = 12;
        public long packetLabel;
        public int packetLength;
        public int packetType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

    public static class Mpegh3daConfig {
        public final byte[] compatibleProfileLevelSet;
        public final int profileLevelIndication;
        public final int samplingFrequency;
        public final int standardFrameLength;

        private Mpegh3daConfig(int i3, int i9, int i10, byte[] bArr) {
            this.profileLevelIndication = i3;
            this.samplingFrequency = i9;
            this.standardFrameLength = i10;
            this.compatibleProfileLevelSet = bArr;
        }
    }

    private MpeghUtil() {
    }

    private static int getOutputFrameLength(int i3) throws androidx.media3.common.ParserException {
        if (i3 == 0) {
            return 768;
        }
        if (i3 == 1) {
            return 1024;
        }
        if (i3 == 2 || i3 == 3) {
            return 2048;
        }
        if (i3 == 4) {
            return 4096;
        }
        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i3);
    }

    private static double getResamplingRatio(int i3) throws androidx.media3.common.ParserException {
        switch (i3) {
            case 14700:
            case androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case androidx.media3.container.OpusUtil.SAMPLE_RATE /* 48000 */:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate " + i3);
        }
    }

    private static int getSamplingFrequency(int i3) throws androidx.media3.common.ParserException {
        switch (i3) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return androidx.media3.container.OpusUtil.SAMPLE_RATE;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate index " + i3);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int getSbrRatioIndex(int i3) throws androidx.media3.common.ParserException {
        if (i3 == 0 || i3 == 1) {
            return 0;
        }
        int i9 = 2;
        if (i3 != 2) {
            i9 = 3;
            if (i3 != 3) {
                if (i3 == 4) {
                    return 1;
                }
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i3);
            }
        }
        return i9;
    }

    public static boolean isSyncWord(int i3) {
        return (i3 & 16777215) == MHAS_SYNC_WORD;
    }

    public static int parseAudioTruncationInfo(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        if (!parsableBitArray.readBit()) {
            return 0;
        }
        parsableBitArray.skipBits(2);
        return parsableBitArray.readBits(13);
    }

    public static boolean parseMhasPacketHeader(androidx.media3.common.util.ParsableBitArray parsableBitArray, androidx.media3.extractor.ts.MpeghUtil.MhasPacketHeader mhasPacketHeader) throws androidx.media3.common.ParserException {
        parsableBitArray.getBytePosition();
        int escapedIntValue = readEscapedIntValue(parsableBitArray, 3, 8, 8);
        mhasPacketHeader.packetType = escapedIntValue;
        if (escapedIntValue == -1) {
            return false;
        }
        long escapedLongValue = readEscapedLongValue(parsableBitArray, 2, 8, 32);
        mhasPacketHeader.packetLabel = escapedLongValue;
        if (escapedLongValue == -1) {
            return false;
        }
        if (escapedLongValue > 16) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + mhasPacketHeader.packetLabel);
        }
        if (escapedLongValue == 0) {
            int i3 = mhasPacketHeader.packetType;
            if (i3 == 1) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i3 == 2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i3 == 17) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int escapedIntValue2 = readEscapedIntValue(parsableBitArray, 11, 24, 24);
        mhasPacketHeader.packetLength = escapedIntValue2;
        return escapedIntValue2 != -1;
    }

    public static androidx.media3.extractor.ts.MpeghUtil.Mpegh3daConfig parseMpegh3daConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(5);
        int bits3 = bits2 == 31 ? parsableBitArray.readBits(24) : getSamplingFrequency(bits2);
        int bits4 = parsableBitArray.readBits(3);
        int outputFrameLength = getOutputFrameLength(bits4);
        int sbrRatioIndex = getSbrRatioIndex(bits4);
        parsableBitArray.skipBits(2);
        skipSpeakerConfig3d(parsableBitArray);
        skipMpegh3daDecoderConfig(parsableBitArray, parseSignals3d(parsableBitArray), sbrRatioIndex);
        byte[] bArr = null;
        if (parsableBitArray.readBit()) {
            int escapedIntValue = readEscapedIntValue(parsableBitArray, 2, 4, 8) + 1;
            for (int i3 = 0; i3 < escapedIntValue; i3++) {
                int escapedIntValue2 = readEscapedIntValue(parsableBitArray, 4, 8, 16);
                int escapedIntValue3 = readEscapedIntValue(parsableBitArray, 4, 8, 16);
                if (escapedIntValue2 == 7) {
                    int bits5 = parsableBitArray.readBits(4) + 1;
                    parsableBitArray.skipBits(4);
                    byte[] bArr2 = new byte[bits5];
                    for (int i9 = 0; i9 < bits5; i9++) {
                        bArr2[i9] = (byte) parsableBitArray.readBits(8);
                    }
                    bArr = bArr2;
                } else {
                    parsableBitArray.skipBits(escapedIntValue3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double resamplingRatio = getResamplingRatio(bits3);
        return new androidx.media3.extractor.ts.MpeghUtil.Mpegh3daConfig(bits, (int) (((double) bits3) * resamplingRatio), (int) (((double) outputFrameLength) * resamplingRatio), bArr3);
    }

    private static boolean parseMpegh3daCoreConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        parsableBitArray.skipBits(3);
        boolean bit = parsableBitArray.readBit();
        if (bit) {
            parsableBitArray.skipBits(13);
        }
        return bit;
    }

    private static int parseSignals3d(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(5);
        int escapedIntValue = 0;
        for (int i3 = 0; i3 < bits + 1; i3++) {
            int bits2 = parsableBitArray.readBits(3);
            escapedIntValue += readEscapedIntValue(parsableBitArray, 5, 8, 16) + 1;
            if ((bits2 == 0 || bits2 == 2) && parsableBitArray.readBit()) {
                skipSpeakerConfig3d(parsableBitArray);
            }
        }
        return escapedIntValue;
    }

    private static int readEscapedIntValue(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3, int i9, int i10) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(java.lang.Math.max(java.lang.Math.max(i3, i9), i10) <= 31);
        int i11 = (1 << i3) - 1;
        int i12 = (1 << i9) - 1;
        com.google.crypto.tink.shaded.protobuf.AbstractC1911f.l(com.google.crypto.tink.shaded.protobuf.AbstractC1911f.l(i11, i12), 1 << i10);
        if (parsableBitArray.bitsLeft() < i3) {
            return -1;
        }
        int bits = parsableBitArray.readBits(i3);
        if (bits == i11) {
            if (parsableBitArray.bitsLeft() < i9) {
                return -1;
            }
            int bits2 = parsableBitArray.readBits(i9);
            bits += bits2;
            if (bits2 == i12) {
                if (parsableBitArray.bitsLeft() < i10) {
                    return -1;
                }
                return parsableBitArray.readBits(i10) + bits;
            }
        }
        return bits;
    }

    private static long readEscapedLongValue(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3, int i9, int i10) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(java.lang.Math.max(java.lang.Math.max(i3, i9), i10) <= 63);
        long j = (1 << i3) - 1;
        long j9 = (1 << i9) - 1;
        com.google.android.gms.internal.play_billing.AbstractC1853k0.f(com.google.android.gms.internal.play_billing.AbstractC1853k0.f(j, j9), 1 << i10);
        if (parsableBitArray.bitsLeft() < i3) {
            return -1L;
        }
        long bitsToLong = parsableBitArray.readBitsToLong(i3);
        if (bitsToLong == j) {
            if (parsableBitArray.bitsLeft() < i9) {
                return -1L;
            }
            long bitsToLong2 = parsableBitArray.readBitsToLong(i9);
            bitsToLong += bitsToLong2;
            if (bitsToLong2 == j9) {
                if (parsableBitArray.bitsLeft() < i10) {
                    return -1L;
                }
                return parsableBitArray.readBitsToLong(i10) + bitsToLong;
            }
        }
        return bitsToLong;
    }

    private static void skipMpegh3daDecoderConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3, int i9) {
        int bits;
        int escapedIntValue = readEscapedIntValue(parsableBitArray, 4, 8, 16) + 1;
        parsableBitArray.skipBit();
        for (int i10 = 0; i10 < escapedIntValue; i10++) {
            int bits2 = parsableBitArray.readBits(2);
            if (bits2 == 0) {
                parseMpegh3daCoreConfig(parsableBitArray);
                if (i9 > 0) {
                    skipSbrConfig(parsableBitArray);
                }
            } else if (bits2 == 1) {
                if (parseMpegh3daCoreConfig(parsableBitArray)) {
                    parsableBitArray.skipBit();
                }
                if (i9 > 0) {
                    skipSbrConfig(parsableBitArray);
                    bits = parsableBitArray.readBits(2);
                } else {
                    bits = 0;
                }
                if (bits > 0) {
                    parsableBitArray.skipBits(6);
                    int bits3 = parsableBitArray.readBits(2);
                    parsableBitArray.skipBits(4);
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(5);
                    }
                    if (bits == 2 || bits == 3) {
                        parsableBitArray.skipBits(6);
                    }
                    if (bits3 == 2) {
                        parsableBitArray.skipBit();
                    }
                }
                int iFloor = ((int) java.lang.Math.floor(java.lang.Math.log(i3 - 1) / java.lang.Math.log(2.0d))) + 1;
                int bits4 = parsableBitArray.readBits(2);
                if (bits4 > 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(iFloor);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(iFloor);
                }
                if (i9 == 0 && bits4 == 0) {
                    parsableBitArray.skipBit();
                }
            } else if (bits2 == 3) {
                readEscapedIntValue(parsableBitArray, 4, 8, 16);
                int escapedIntValue2 = readEscapedIntValue(parsableBitArray, 4, 8, 16);
                if (parsableBitArray.readBit()) {
                    readEscapedIntValue(parsableBitArray, 8, 16, 0);
                }
                parsableBitArray.skipBit();
                if (escapedIntValue2 > 0) {
                    parsableBitArray.skipBits(escapedIntValue2 * 8);
                }
            }
        }
    }

    private static void skipMpegh3daFlexibleSpeakerConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3) {
        int bits;
        boolean bit = parsableBitArray.readBit();
        int i9 = bit ? 1 : 5;
        int i10 = bit ? 7 : 5;
        int i11 = bit ? 8 : 6;
        int i12 = 0;
        while (i12 < i3) {
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(7);
                bits = 0;
            } else {
                if (parsableBitArray.readBits(2) == 3 && parsableBitArray.readBits(i10) * i9 != 0) {
                    parsableBitArray.skipBit();
                }
                bits = parsableBitArray.readBits(i11) * i9;
                if (bits != 0 && bits != 180) {
                    parsableBitArray.skipBit();
                }
                parsableBitArray.skipBit();
            }
            if (bits != 0 && bits != 180 && parsableBitArray.readBit()) {
                i12++;
            }
            i12++;
        }
    }

    private static void skipSbrConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        parsableBitArray.skipBits(3);
        parsableBitArray.skipBits(8);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bit) {
            parsableBitArray.skipBits(5);
        }
        if (bit2) {
            parsableBitArray.skipBits(6);
        }
    }

    private static void skipSpeakerConfig3d(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(2);
        if (bits == 0) {
            parsableBitArray.skipBits(6);
            return;
        }
        int escapedIntValue = readEscapedIntValue(parsableBitArray, 5, 8, 16) + 1;
        if (bits == 1) {
            parsableBitArray.skipBits(escapedIntValue * 7);
        } else if (bits == 2) {
            skipMpegh3daFlexibleSpeakerConfig(parsableBitArray, escapedIntValue);
        }
    }
}
