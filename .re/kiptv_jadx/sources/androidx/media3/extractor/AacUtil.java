package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class AacUtil {
    public static final int AAC_ELD_MAX_RATE_BYTES_PER_SECOND = 8000;
    public static final int AAC_HE_AUDIO_SAMPLE_COUNT = 2048;
    public static final int AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND = 7000;
    public static final int AAC_LC_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_LC_MAX_RATE_BYTES_PER_SECOND = 100000;
    public static final int AAC_LD_AUDIO_SAMPLE_COUNT = 512;
    public static final int AAC_XHE_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_XHE_MAX_RATE_BYTES_PER_SECOND = 256000;
    public static final int AUDIO_OBJECT_TYPE_AAC_ELD = 23;
    public static final int AUDIO_OBJECT_TYPE_AAC_ER_BSAC = 22;
    public static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    public static final int AUDIO_OBJECT_TYPE_AAC_PS = 29;
    public static final int AUDIO_OBJECT_TYPE_AAC_SBR = 5;
    public static final int AUDIO_OBJECT_TYPE_AAC_XHE = 42;
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final java.lang.String CODECS_STRING_PREFIX = "mp4a.40.";
    private static final java.lang.String TAG = "AacUtil";
    public static final int AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND = 16000;
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, androidx.media3.container.OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static final class Config {
        public final int channelCount;
        public final java.lang.String codecs;
        public final int sampleRateHz;

        private Config(int i3, int i9, java.lang.String str) {
            this.sampleRateHz = i3;
            this.channelCount = i9;
            this.codecs = str;
        }
    }

    private AacUtil() {
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i3, int i9) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i12 >= iArr.length) {
                break;
            }
            if (i3 == iArr[i12]) {
                i11 = i12;
            }
            i12++;
        }
        int i13 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i10 >= iArr2.length) {
                break;
            }
            if (i9 == iArr2[i10]) {
                i13 = i10;
            }
            i10++;
        }
        if (i3 == -1 || i13 == -1) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Invalid sample rate or number of channels: ", ", "));
        }
        return buildAudioSpecificConfig(2, i11, i13);
    }

    public static byte[] buildAudioSpecificConfig(int i3, int i9, int i10) {
        return new byte[]{(byte) (((i3 << 3) & 248) | ((i9 >> 1) & 7)), (byte) (((i9 << 7) & 128) | ((i10 << 3) & 120))};
    }

    private static int getAudioObjectType(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(5);
        return bits == 31 ? parsableBitArray.readBits(6) + 32 : bits;
    }

    private static int getSamplingFrequency(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        int bits = parsableBitArray.readBits(4);
        if (bits == 15) {
            if (parsableBitArray.bitsLeft() >= 24) {
                return parsableBitArray.readBits(24);
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (bits < 13) {
            return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[bits];
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    public static androidx.media3.extractor.AacUtil.Config parseAudioSpecificConfig(byte[] bArr) {
        return parseAudioSpecificConfig(new androidx.media3.common.util.ParsableBitArray(bArr), false);
    }

    private static void parseGaSpecificConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3, int i9) {
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Log.w(TAG, "Unexpected frameLengthFlag = 1");
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(14);
        }
        boolean bit = parsableBitArray.readBit();
        if (i9 == 0) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i3 == 6 || i3 == 20) {
            parsableBitArray.skipBits(3);
        }
        if (bit) {
            if (i3 == 22) {
                parsableBitArray.skipBits(16);
            }
            if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(1);
        }
    }

    public static androidx.media3.extractor.AacUtil.Config parseAudioSpecificConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray, boolean z6) throws androidx.media3.common.ParserException {
        int audioObjectType = getAudioObjectType(parsableBitArray);
        int samplingFrequency = getSamplingFrequency(parsableBitArray);
        int bits = parsableBitArray.readBits(4);
        java.lang.String strL = com.google.android.gms.internal.play_billing.M0.l(audioObjectType, CODECS_STRING_PREFIX);
        if (audioObjectType == 5 || audioObjectType == 29) {
            samplingFrequency = getSamplingFrequency(parsableBitArray);
            audioObjectType = getAudioObjectType(parsableBitArray);
            if (audioObjectType == 22) {
                bits = parsableBitArray.readBits(4);
            }
        }
        if (z6) {
            if (audioObjectType != 1 && audioObjectType != 2 && audioObjectType != 3 && audioObjectType != 4 && audioObjectType != 6 && audioObjectType != 7 && audioObjectType != 17) {
                switch (audioObjectType) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + audioObjectType);
                }
            }
            parseGaSpecificConfig(parsableBitArray, audioObjectType, bits);
            switch (audioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = parsableBitArray.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + bits2);
                    }
                    break;
            }
        }
        int i3 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[bits];
        if (i3 != -1) {
            return new androidx.media3.extractor.AacUtil.Config(samplingFrequency, i3, strL);
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
    }
}
