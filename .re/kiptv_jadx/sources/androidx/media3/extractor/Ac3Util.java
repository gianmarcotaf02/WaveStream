package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {androidx.media3.container.OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, 224, 256, 320, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, org.videolan.libvlc.MediaPlayer.Event.ESSelected, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int bitrate;
        public final int channelCount;
        public final int frameSize;
        public final java.lang.String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(java.lang.String str, int i3, int i9, int i10, int i11, int i12, int i13) {
            this.mimeType = str;
            this.streamType = i3;
            this.channelCount = i9;
            this.sampleRate = i10;
            this.frameSize = i11;
            this.sampleCount = i12;
            this.bitrate = i13;
        }
    }

    private Ac3Util() {
    }

    private static int calculateEac3Bitrate(int i3, int i9, int i10) {
        return (i3 * i9) / (i10 * 32);
    }

    public static int findTrueHdSyncframeOffset(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i3 = iPosition; i3 <= iLimit; i3++) {
            if ((androidx.media3.common.util.Util.getBigEndianInt(byteBuffer, i3 + 4) & (-2)) == -126718022) {
                return i3 - iPosition;
            }
        }
        return -1;
    }

    private static int getAc3SyncframeSize(int i3, int i9) {
        int i10 = i9 / 2;
        if (i3 < 0) {
            return -1;
        }
        int[] iArr = SAMPLE_RATE_BY_FSCOD;
        if (i3 >= iArr.length || i9 < 0) {
            return -1;
        }
        int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
        if (i10 >= iArr2.length) {
            return -1;
        }
        int i11 = iArr[i3];
        if (i11 == 44100) {
            return ((i9 % 2) + iArr2[i10]) * 2;
        }
        int i12 = BITRATE_BY_HALF_FRMSIZECOD[i10];
        return i11 == 32000 ? i12 * 6 : i12 * 4;
    }

    public static androidx.media3.common.Format parseAc3AnnexFFormat(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) {
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i3 = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(8);
        int i9 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i9++;
        }
        int i10 = BITRATE_BY_HALF_FRMSIZECOD[parsableBitArray.readBits(5)] * 1000;
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AC3).setChannelCount(i9).setSampleRate(i3).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i10).setPeakBitrate(i10).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(java.nio.ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    public static androidx.media3.extractor.Ac3Util.SyncFrameInfo parseAc3SyncframeInfo(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int ac3SyncframeSize;
        int i3;
        int i9;
        int i10;
        java.lang.String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        boolean z6 = parsableBitArray.readBits(5) > 10;
        parsableBitArray.setPosition(position);
        int i17 = -1;
        if (z6) {
            parsableBitArray.skipBits(16);
            int bits = parsableBitArray.readBits(2);
            if (bits == 0) {
                i17 = 0;
            } else if (bits == 1) {
                i17 = 1;
            } else if (bits == 2) {
                i17 = 2;
            }
            parsableBitArray.skipBits(3);
            ac3SyncframeSize = (parsableBitArray.readBits(11) + 1) * 2;
            int bits2 = parsableBitArray.readBits(2);
            if (bits2 == 3) {
                i3 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                i12 = 3;
                i13 = 6;
            } else {
                int bits3 = parsableBitArray.readBits(2);
                int i18 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[bits3];
                i12 = bits3;
                i3 = SAMPLE_RATE_BY_FSCOD[bits2];
                i13 = i18;
            }
            i10 = i13 * 256;
            int iCalculateEac3Bitrate = calculateEac3Bitrate(ac3SyncframeSize, i3, i13);
            int bits4 = parsableBitArray.readBits(3);
            boolean bit = parsableBitArray.readBit();
            i9 = CHANNEL_COUNT_BY_ACMOD[bits4] + (bit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (bits4 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i17 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (bits4 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((bits4 & 1) == 0 || bits4 <= 2) {
                    i15 = 6;
                } else {
                    i15 = 6;
                    parsableBitArray.skipBits(6);
                }
                if ((bits4 & 4) != 0) {
                    parsableBitArray.skipBits(i15);
                }
                if (bit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i17 == 0) {
                    if (parsableBitArray.readBit()) {
                        i16 = 6;
                        parsableBitArray.skipBits(6);
                    } else {
                        i16 = 6;
                    }
                    if (bits4 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i16);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i16);
                    }
                    int bits5 = parsableBitArray.readBits(2);
                    if (bits5 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (bits5 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (bits5 == 3) {
                        int bits6 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((bits6 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (bits4 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (bits4 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (i12 == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i19 = 0; i19 < i13; i19++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (bits4 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (bits4 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits4 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits2 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i17 == 0 && i12 != 3) {
                parsableBitArray.skipBit();
            }
            if (i17 == 2 && (i12 == 3 || parsableBitArray.readBit())) {
                i14 = 6;
                parsableBitArray.skipBits(6);
            } else {
                i14 = 6;
            }
            str = (parsableBitArray.readBit() && parsableBitArray.readBits(i14) == 1 && parsableBitArray.readBits(8) == 1) ? androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC : androidx.media3.common.MimeTypes.AUDIO_E_AC3;
            i11 = iCalculateEac3Bitrate;
        } else {
            parsableBitArray.skipBits(32);
            int bits7 = parsableBitArray.readBits(2);
            java.lang.String str2 = bits7 == 3 ? null : androidx.media3.common.MimeTypes.AUDIO_AC3;
            int bits8 = parsableBitArray.readBits(6);
            int i20 = BITRATE_BY_HALF_FRMSIZECOD[bits8 / 2] * 1000;
            ac3SyncframeSize = getAc3SyncframeSize(bits7, bits8);
            parsableBitArray.skipBits(8);
            int bits9 = parsableBitArray.readBits(3);
            if ((bits9 & 1) != 0 && bits9 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((bits9 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (bits9 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            i3 = bits7 < iArr.length ? iArr[bits7] : -1;
            i9 = CHANNEL_COUNT_BY_ACMOD[bits9] + (parsableBitArray.readBit() ? 1 : 0);
            i10 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
            str = str2;
            i11 = i20;
        }
        return new androidx.media3.extractor.Ac3Util.SyncFrameInfo(str, i17, i9, i3, ac3SyncframeSize, i10, i11);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b9 = bArr[4];
        return getAc3SyncframeSize((b9 & 192) >> 6, b9 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static androidx.media3.common.Format parseEAc3AnnexFFormat(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) {
        java.lang.String str3;
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int bits = parsableBitArray.readBits(13) * 1000;
        parsableBitArray.skipBits(3);
        int i3 = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(10);
        int i9 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i9++;
        }
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(1);
        if (bits2 > 0) {
            parsableBitArray.skipBits(6);
            if (parsableBitArray.readBits(1) != 0) {
                i9 += 2;
            }
            parsableBitArray.skipBits(1);
        }
        if (parsableBitArray.bitsLeft() > 7) {
            parsableBitArray.skipBits(7);
            if (parsableBitArray.readBits(1) != 0) {
                str3 = androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
            }
        } else {
            str3 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(str3).setChannelCount(i9).setSampleRate(i3).setDrmInitData(drmInitData).setLanguage(str2).setPeakBitrate(bits).build();
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b9 = bArr[7];
            if ((b9 & 254) == 186) {
                return 40 << ((bArr[(b9 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(java.nio.ByteBuffer byteBuffer, int i3) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i3) + ((byteBuffer.get((byteBuffer.position() + i3) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
