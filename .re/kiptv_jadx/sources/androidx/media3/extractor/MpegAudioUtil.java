package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final java.lang.String[] MIME_TYPE_BY_LAYER = {androidx.media3.common.MimeTypes.AUDIO_MPEG_L1, androidx.media3.common.MimeTypes.AUDIO_MPEG_L2, androidx.media3.common.MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, androidx.media3.container.OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, androidx.media3.container.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {32000, androidx.media3.container.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int[] BITRATE_V1_L3 = {32000, MAX_RATE_BYTES_PER_SECOND, androidx.media3.container.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MAX_RATE_BYTES_PER_SECOND, androidx.media3.container.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public java.lang.String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header() {
        }

        public boolean setForHeaderData(int i3) {
            int i9;
            int i10;
            int i11;
            int i12;
            if (!androidx.media3.extractor.MpegAudioUtil.isMagicPresent(i3) || (i9 = (i3 >>> 19) & 3) == 1 || (i10 = (i3 >>> 17) & 3) == 0 || (i11 = (i3 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i3 >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i9;
            this.mimeType = androidx.media3.extractor.MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i10];
            int i13 = androidx.media3.extractor.MpegAudioUtil.SAMPLING_RATE_V1[i12];
            this.sampleRate = i13;
            if (i9 == 2) {
                this.sampleRate = i13 / 2;
            } else if (i9 == 0) {
                this.sampleRate = i13 / 4;
            }
            int i14 = (i3 >>> 9) & 1;
            this.samplesPerFrame = androidx.media3.extractor.MpegAudioUtil.getFrameSizeInSamples(i9, i10);
            if (i10 == 3) {
                int i15 = i9 == 3 ? androidx.media3.extractor.MpegAudioUtil.BITRATE_V1_L1[i11 - 1] : androidx.media3.extractor.MpegAudioUtil.BITRATE_V2_L1[i11 - 1];
                this.bitrate = i15;
                this.frameSize = (((i15 * 12) / this.sampleRate) + i14) * 4;
            } else {
                if (i9 == 3) {
                    int i16 = i10 == 2 ? androidx.media3.extractor.MpegAudioUtil.BITRATE_V1_L2[i11 - 1] : androidx.media3.extractor.MpegAudioUtil.BITRATE_V1_L3[i11 - 1];
                    this.bitrate = i16;
                    this.frameSize = ((i16 * 144) / this.sampleRate) + i14;
                } else {
                    int i17 = androidx.media3.extractor.MpegAudioUtil.BITRATE_V2[i11 - 1];
                    this.bitrate = i17;
                    this.frameSize = (((i10 == 1 ? 72 : 144) * i17) / this.sampleRate) + i14;
                }
            }
            this.channels = ((i3 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public Header(androidx.media3.extractor.MpegAudioUtil.Header header) {
            this.version = header.version;
            this.mimeType = header.mimeType;
            this.frameSize = header.frameSize;
            this.sampleRate = header.sampleRate;
            this.channels = header.channels;
            this.bitrate = header.bitrate;
            this.samplesPerFrame = header.samplesPerFrame;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i3) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (!isMagicPresent(i3) || (i9 = (i3 >>> 19) & 3) == 1 || (i10 = (i3 >>> 17) & 3) == 0 || (i11 = (i3 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i3 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = SAMPLING_RATE_V1[i12];
        if (i9 == 2) {
            i14 /= 2;
        } else if (i9 == 0) {
            i14 /= 4;
        }
        int i15 = (i3 >>> 9) & 1;
        if (i10 == 3) {
            return ((((i9 == 3 ? BITRATE_V1_L1[i11 - 1] : BITRATE_V2_L1[i11 - 1]) * 12) / i14) + i15) * 4;
        }
        if (i9 == 3) {
            i13 = i10 == 2 ? BITRATE_V1_L2[i11 - 1] : BITRATE_V1_L3[i11 - 1];
        } else {
            i13 = BITRATE_V2[i11 - 1];
        }
        if (i9 == 3) {
            return Y6.f.c(i13, 144, i14, i15);
        }
        return Y6.f.c(i10 == 1 ? 72 : 144, i13, i14, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i3, int i9) {
        if (i9 == 1) {
            if (i3 == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (i9 == 2) {
            return 1152;
        }
        if (i9 == 3) {
            return 384;
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i3) {
        return (i3 & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i3) {
        int i9;
        int i10;
        if (!isMagicPresent(i3) || (i9 = (i3 >>> 19) & 3) == 1 || (i10 = (i3 >>> 17) & 3) == 0) {
            return -1;
        }
        int i11 = (i3 >>> 12) & 15;
        int i12 = (i3 >>> 10) & 3;
        if (i11 == 0 || i11 == 15 || i12 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i9, i10);
    }
}
