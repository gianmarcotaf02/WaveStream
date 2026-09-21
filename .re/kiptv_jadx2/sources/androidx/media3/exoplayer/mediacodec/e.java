package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import java.util.List;

public final class e implements MediaCodecUtil.ScoreProvider, LoudnessCodecController.LoudnessParameterUpdateListener, MediaCodecSelector {

    public final int f16693h;

    public e(int i3) {
        this.f16693h = i3;
    }

    @Override
    public List getDecoderInfos(String str, boolean z6, boolean z9) {
        switch (this.f16693h) {
            case 3:
                return MediaCodecUtil.getDecoderInfos(str, z6, z9);
            default:
                return MediaCodecSelector.lambda$static$0(str, z6, z9);
        }
    }

    @Override
    public int getScore(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.f16693h) {
            case 0:
                return MediaCodecUtil.lambda$getDecoderInfosSortedBySoftwareOnly$2(mediaCodecInfo);
            default:
                return MediaCodecUtil.lambda$applyWorkarounds$3(mediaCodecInfo);
        }
    }

    @Override
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return LoudnessCodecController.LoudnessParameterUpdateListener.lambda$static$0(bundle);
    }
}
