package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import androidx.media3.common.Format;

public final class f implements MediaCodecUtil.ScoreProvider {

    public final int f16694h;

    public final Context f16695i;
    public final Format j;

    public f(Context context, Format format, int i3) {
        this.f16694h = i3;
        this.f16695i = context;
        this.j = format;
    }

    @Override
    public final int getScore(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.f16694h) {
            case 0:
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFullFormatSupport$1(this.f16695i, this.j, mediaCodecInfo);
            default:
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(this.f16695i, this.j, mediaCodecInfo);
        }
    }
}
