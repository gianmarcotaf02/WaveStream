package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    private static final int CHANNEL_MODE_22_2 = 15;
    private static final int CHANNEL_MODE_3_0 = 2;
    private static final int CHANNEL_MODE_5_0 = 3;
    private static final int CHANNEL_MODE_5_1 = 4;
    private static final int CHANNEL_MODE_7_0_322 = 9;
    private static final int CHANNEL_MODE_7_0_34 = 5;
    private static final int CHANNEL_MODE_7_0_4 = 11;
    private static final int CHANNEL_MODE_7_0_52 = 7;
    private static final int CHANNEL_MODE_7_1_322 = 10;
    private static final int CHANNEL_MODE_7_1_34 = 6;
    private static final int CHANNEL_MODE_7_1_4 = 12;
    private static final int CHANNEL_MODE_7_1_52 = 8;
    private static final int CHANNEL_MODE_9_0_4 = 13;
    private static final int CHANNEL_MODE_9_1_4 = 14;
    private static final int CHANNEL_MODE_MONO = 0;
    private static final int CHANNEL_MODE_STEREO = 1;
    private static final int CHANNEL_MODE_UNKNOWN = -1;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, 2000, 1920, 1601, 1600, 1001, 1000, 960, org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 480, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;
    private static final java.lang.String TAG = "Ac4Util";

    public static final class Ac4Presentation {
        public int channelMode;
        public boolean hasBackChannels;
        public boolean isChannelCoded;
        public int level;
        public int numOfUmxObjects;
        public int topChannelPairs;
        public int version;

        private Ac4Presentation() {
            this.isChannelCoded = true;
            this.channelMode = -1;
            this.numOfUmxObjects = -1;
            this.hasBackChannels = true;
            this.topChannelPairs = 2;
            this.version = 1;
            this.level = 0;
        }
    }

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i3, int i9, int i10, int i11, int i12) {
            this.bitstreamVersion = i3;
            this.channelCount = i9;
            this.sampleRate = i10;
            this.frameSize = i11;
            this.sampleCount = i12;
        }
    }

    private Ac4Util() {
    }

    private static java.lang.String createCodecsString(int i3, int i9, int i10) {
        return androidx.media3.common.util.Util.formatInvariant("ac-4.%02d.%02d.%02d", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10));
    }

    public static void getAc4SampleHeader(int i3, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i3 >> 16) & 255);
        data[5] = (byte) ((i3 >> 8) & 255);
        data[6] = (byte) (i3 & 255);
    }

    private static int getAdjustedChannelCount(int i3, boolean z6, int i9) {
        int channelCountFromChannelMode = getChannelCountFromChannelMode(i3);
        if (i3 != 11 && i3 != 12 && i3 != 13 && i3 != 14) {
            return channelCountFromChannelMode;
        }
        if (!z6) {
            channelCountFromChannelMode -= 2;
        }
        if (i9 != 0) {
            return i9 != 1 ? channelCountFromChannelMode : channelCountFromChannelMode - 2;
        }
        return channelCountFromChannelMode - 4;
    }

    private static int getChannelCountFromChannelMode(int i3) {
        switch (i3) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    public static androidx.media3.common.Format parseAc4AnnexEFormat(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) throws androidx.media3.common.ParserException {
        int i3;
        int i9;
        int adjustedChannelCount;
        boolean bit;
        int bits;
        int bits2;
        int bits3;
        int i10;
        boolean z6;
        boolean bit2;
        int i11;
        int bits4;
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int iBitsLeft = parsableBitArray.bitsLeft();
        int bits5 = parsableBitArray.readBits(3);
        if (bits5 > 1) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported AC-4 DSI version: " + bits5);
        }
        int bits6 = parsableBitArray.readBits(7);
        int i12 = parsableBitArray.readBit() ? androidx.media3.container.OpusUtil.SAMPLE_RATE : 44100;
        parsableBitArray.skipBits(4);
        int bits7 = parsableBitArray.readBits(9);
        if (bits6 > 1) {
            if (bits5 == 0) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI version: " + bits5);
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(128);
                }
            }
        }
        if (bits5 == 1) {
            if (!skipDsiBitrate(parsableBitArray)) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI bitrate.");
            }
            parsableBitArray.byteAlign();
        }
        androidx.media3.extractor.Ac4Util.Ac4Presentation ac4Presentation = new androidx.media3.extractor.Ac4Util.Ac4Presentation();
        int i13 = 0;
        while (true) {
            if (i13 < bits7) {
                if (bits5 == 0) {
                    bit = parsableBitArray.readBit();
                    bits = parsableBitArray.readBits(5);
                    bits2 = parsableBitArray.readBits(5);
                    bits3 = 0;
                    i10 = 0;
                    z6 = false;
                } else {
                    int bits8 = parsableBitArray.readBits(8);
                    bits3 = parsableBitArray.readBits(8);
                    if (bits3 == 255) {
                        bits3 += parsableBitArray.readBits(16);
                    }
                    if (bits8 > 2) {
                        parsableBitArray.skipBits(bits3 * 8);
                        i13++;
                    } else {
                        int iBitsLeft2 = (iBitsLeft - parsableBitArray.bitsLeft()) / 8;
                        int bits9 = parsableBitArray.readBits(5);
                        bits2 = bits8;
                        bits = bits9;
                        z6 = bits9 == 31;
                        i10 = iBitsLeft2;
                        bit = false;
                    }
                }
                ac4Presentation.version = bits2;
                if (bit || z6 || bits != 6) {
                    ac4Presentation.level = parsableBitArray.readBits(3);
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(5);
                    }
                    parsableBitArray.skipBits(2);
                    int i14 = 1;
                    if (bits5 == 1 && (bits2 == 1 || bits2 == 2)) {
                        parsableBitArray.skipBits(2);
                    }
                    parsableBitArray.skipBits(5);
                    parsableBitArray.skipBits(10);
                    if (bits5 == 1) {
                        if (bits2 > 0) {
                            ac4Presentation.isChannelCoded = parsableBitArray.readBit();
                        }
                        if (ac4Presentation.isChannelCoded) {
                            if (bits2 != 1) {
                                i11 = 2;
                                if (bits2 == 2) {
                                    bits4 = parsableBitArray.readBits(5);
                                    if (bits4 >= 0 && bits4 <= 15) {
                                        ac4Presentation.channelMode = bits4;
                                    }
                                    if (bits4 >= 11 || bits4 > 14) {
                                        i11 = 2;
                                    } else {
                                        ac4Presentation.hasBackChannels = parsableBitArray.readBit();
                                        i11 = 2;
                                        ac4Presentation.topChannelPairs = parsableBitArray.readBits(2);
                                    }
                                }
                            } else {
                                bits4 = parsableBitArray.readBits(5);
                                if (bits4 >= 0) {
                                    ac4Presentation.channelMode = bits4;
                                }
                                if (bits4 >= 11) {
                                    i11 = 2;
                                } else {
                                    i11 = 2;
                                }
                            }
                            parsableBitArray.skipBits(24);
                            i14 = 1;
                        } else {
                            i11 = 2;
                        }
                        if (bits2 == i14 || bits2 == i11) {
                            if (parsableBitArray.readBit() && parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(i11);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBit();
                                int i15 = 8;
                                int bits10 = parsableBitArray.readBits(8);
                                int i16 = 0;
                                while (i16 < bits10) {
                                    parsableBitArray.skipBits(i15);
                                    i16++;
                                    i15 = 8;
                                }
                            }
                        }
                    }
                    if (!bit && !z6) {
                        parsableBitArray.skipBit();
                        if (bits == 0 || bits == 1 || bits == 2) {
                            if (bits2 == 0) {
                                for (int i17 = 0; i17 < 2; i17++) {
                                    parseDsiSubstream(parsableBitArray, ac4Presentation);
                                }
                            } else {
                                for (int i18 = 0; i18 < 2; i18++) {
                                    parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                                }
                            }
                        } else if (bits == 3 || bits == 4) {
                            if (bits2 == 0) {
                                for (int i19 = 0; i19 < 3; i19++) {
                                    parseDsiSubstream(parsableBitArray, ac4Presentation);
                                }
                            } else {
                                for (int i20 = 0; i20 < 3; i20++) {
                                    parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                                }
                            }
                        } else if (bits != 5) {
                            int bits11 = parsableBitArray.readBits(7);
                            for (int i21 = 0; i21 < bits11; i21++) {
                                parsableBitArray.skipBits(8);
                            }
                        } else if (bits2 == 0) {
                            parseDsiSubstream(parsableBitArray, ac4Presentation);
                        } else {
                            int bits12 = parsableBitArray.readBits(3);
                            for (int i22 = 0; i22 < bits12 + 2; i22++) {
                                parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (bits2 == 0) {
                        parseDsiSubstream(parsableBitArray, ac4Presentation);
                    } else {
                        parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                    }
                    parsableBitArray.skipBit();
                    bit2 = parsableBitArray.readBit();
                } else {
                    bit2 = true;
                }
                if (bit2) {
                    int bits13 = parsableBitArray.readBits(7);
                    for (int i23 = 0; i23 < bits13; i23++) {
                        parsableBitArray.skipBits(15);
                    }
                }
                if (bits2 > 0) {
                    if (parsableBitArray.readBit() && !skipDsiBitrate(parsableBitArray)) {
                        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Can't parse bitrate DSI.");
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.byteAlign();
                        parsableBitArray.skipBytes(parsableBitArray.readBits(16));
                        int bits14 = parsableBitArray.readBits(5);
                        for (int i24 = 0; i24 < bits14; i24++) {
                            parsableBitArray.skipBits(3);
                            parsableBitArray.skipBits(8);
                        }
                    }
                }
                i3 = 8;
                parsableBitArray.byteAlign();
                if (bits5 == 1) {
                    int iBitsLeft3 = ((iBitsLeft - parsableBitArray.bitsLeft()) / 8) - i10;
                    if (bits3 < iBitsLeft3) {
                        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("pres_bytes is smaller than presentation bytes read.");
                    }
                    parsableBitArray.skipBytes(bits3 - iBitsLeft3);
                }
                if (ac4Presentation.isChannelCoded && ac4Presentation.channelMode == -1) {
                    throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Can't determine channel mode of presentation " + i13);
                }
            } else {
                i3 = 8;
            }
            if (ac4Presentation.isChannelCoded) {
                adjustedChannelCount = getAdjustedChannelCount(ac4Presentation.channelMode, ac4Presentation.hasBackChannels, ac4Presentation.topChannelPairs);
            } else {
                int i25 = ac4Presentation.numOfUmxObjects;
                if (i25 > 0) {
                    int i26 = i25 + 1;
                    if (ac4Presentation.level == 4 && i26 == 17) {
                        i26 = 21;
                    }
                    adjustedChannelCount = i26;
                } else {
                    int i27 = ac4Presentation.level;
                    if (i27 == 0) {
                        i9 = 2;
                    } else if (i27 != 1) {
                        i9 = 2;
                        if (i27 == 2) {
                            adjustedChannelCount = i3;
                        } else if (i27 == 3) {
                            adjustedChannelCount = 10;
                        } else if (i27 != 4) {
                            androidx.media3.common.util.Log.w(TAG, "AC-4 level " + ac4Presentation.level + " has not been defined.");
                        } else {
                            adjustedChannelCount = 12;
                        }
                    } else {
                        adjustedChannelCount = 6;
                    }
                    adjustedChannelCount = i9;
                }
            }
            if (adjustedChannelCount > 0) {
                return new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AC4).setChannelCount(adjustedChannelCount).setSampleRate(i12).setDrmInitData(drmInitData).setLanguage(str2).setCodecs(createCodecsString(bits6, ac4Presentation.version, ac4Presentation.level)).build();
            }
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Cannot determine channel count of presentation.");
        }
    }

    public static int parseAc4SyncframeAudioSampleCount(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new androidx.media3.common.util.ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static androidx.media3.extractor.Ac4Util.SyncFrameInfo parseAc4SyncframeInfo(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int i3;
        int i9;
        int i10;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i3 = 7;
        } else {
            i3 = 4;
        }
        int i11 = bits2 + i3;
        if (bits == 44097) {
            i11 += 2;
        }
        int i12 = i11;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i13 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        boolean bit = parsableBitArray.readBit();
        int i14 = androidx.media3.container.OpusUtil.SAMPLE_RATE;
        if (!bit) {
            i14 = 44100;
        }
        int bits5 = parsableBitArray.readBits(4);
        if (i14 != 44100 || bits5 != 13) {
            if (i14 == 48000) {
                int[] iArr = SAMPLE_COUNT;
                if (bits5 < iArr.length) {
                    int i15 = iArr[bits5];
                    int i16 = bits4 % 5;
                    if (i16 == 1) {
                        if (bits5 != 3 || bits5 == 8) {
                            i9 = i15 + 1;
                        } else {
                            i10 = i15;
                        }
                    } else if (i16 != 2) {
                        if (i16 == 3) {
                            if (bits5 != 3) {
                            }
                            i9 = i15 + 1;
                        } else if (i16 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                            i9 = i15 + 1;
                        } else {
                            i10 = i15;
                        }
                    } else if (bits5 == 8 || bits5 == 11) {
                        i9 = i15 + 1;
                    } else {
                        i10 = i15;
                    }
                } else {
                    i9 = 0;
                }
            } else {
                i9 = 0;
            }
            return new androidx.media3.extractor.Ac4Util.SyncFrameInfo(i13, 2, i14, i12, i10);
        }
        i9 = SAMPLE_COUNT[bits5];
        i10 = i9;
        return new androidx.media3.extractor.Ac4Util.SyncFrameInfo(i13, 2, i14, i12, i10);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i3) {
        int i9 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i10 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i10 == 65535) {
            i10 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i9 = 4;
        }
        if (i3 == 44097) {
            i9 += 2;
        }
        return i10 + i9;
    }

    private static void parseDsiSubstream(androidx.media3.common.util.ParsableBitArray parsableBitArray, androidx.media3.extractor.Ac4Util.Ac4Presentation ac4Presentation) throws androidx.media3.common.ParserException {
        int bits = parsableBitArray.readBits(5);
        parsableBitArray.skipBits(2);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (bits >= 7 && bits <= 10) {
            parsableBitArray.skipBit();
        }
        if (parsableBitArray.readBit()) {
            int bits2 = parsableBitArray.readBits(3);
            if (ac4Presentation.channelMode == -1 && bits >= 0 && bits <= 15 && (bits2 == 0 || bits2 == 1)) {
                ac4Presentation.channelMode = bits;
            }
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static void parseDsiSubstreamGroup(androidx.media3.common.util.ParsableBitArray parsableBitArray, androidx.media3.extractor.Ac4Util.Ac4Presentation ac4Presentation) throws androidx.media3.common.ParserException {
        parsableBitArray.skipBits(2);
        boolean bit = parsableBitArray.readBit();
        int bits = parsableBitArray.readBits(8);
        for (int i3 = 0; i3 < bits; i3++) {
            parsableBitArray.skipBits(2);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
            }
            if (bit) {
                parsableBitArray.skipBits(24);
            } else {
                if (parsableBitArray.readBit()) {
                    if (!parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(4);
                    }
                    ac4Presentation.numOfUmxObjects = parsableBitArray.readBits(6) + 1;
                }
                parsableBitArray.skipBits(4);
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(3);
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static int readVariableBits(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3) {
        int i9 = 0;
        while (true) {
            int bits = parsableBitArray.readBits(i3) + i9;
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i9 = (bits + 1) << i3;
        }
    }

    private static boolean skipDsiBitrate(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        if (parsableBitArray.bitsLeft() < 66) {
            return false;
        }
        parsableBitArray.skipBits(66);
        return true;
    }

    private static void skipDsiLanguage(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        int bits = parsableBitArray.readBits(6);
        if (bits < 2 || bits > 42) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature(java.lang.String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", java.lang.Integer.valueOf(bits)));
        }
        parsableBitArray.skipBits(bits * 8);
    }
}
