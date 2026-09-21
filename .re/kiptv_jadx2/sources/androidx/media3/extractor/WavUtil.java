package androidx.media3.extractor;

import androidx.media3.common.util.Util;

public final class WavUtil {
    public static final int DATA_FOURCC = 1684108385;
    public static final int DS64_FOURCC = 1685272116;
    public static final int FMT_FOURCC = 1718449184;
    public static final int RF64_FOURCC = 1380333108;
    public static final int RIFF_FOURCC = 1380533830;
    public static final int TYPE_ALAW = 6;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_IMA_ADPCM = 17;
    public static final int TYPE_MLAW = 7;
    public static final int TYPE_PCM = 1;
    public static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
    public static final int WAVE_FOURCC = 1463899717;

    private WavUtil() {
    }

    public static int getPcmEncodingForType(int i3, int i9) {
        if (i3 != 1) {
            if (i3 == 3) {
                return i9 == 32 ? 4 : 0;
            }
            if (i3 != 65534) {
                return 0;
            }
        }
        return Util.getPcmEncoding(i9);
    }

    public static int getTypeForPcmEncoding(int i3) {
        if (i3 == 2 || i3 == 3) {
            return 1;
        }
        if (i3 == 4) {
            return 3;
        }
        if (i3 == 21 || i3 == 22) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
