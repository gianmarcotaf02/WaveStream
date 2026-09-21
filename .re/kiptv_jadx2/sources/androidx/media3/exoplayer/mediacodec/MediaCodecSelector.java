package androidx.media3.exoplayer.mediacodec;

import java.util.List;

public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new e(3);
    public static final MediaCodecSelector PREFER_SOFTWARE = new e(4);

    static List lambda$static$0(String str, boolean z6, boolean z9) {
        return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(DEFAULT.getDecoderInfos(str, z6, z9));
    }

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z6, boolean z9);
}
