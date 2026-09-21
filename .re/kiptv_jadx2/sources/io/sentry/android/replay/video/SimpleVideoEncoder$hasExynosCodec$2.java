package io.sentry.android.replay.video;

import O7.q;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SimpleVideoEncoder$hasExynosCodec$2 extends o implements Function0 {
    public static final SimpleVideoEncoder$hasExynosCodec$2 INSTANCE = new SimpleVideoEncoder$hasExynosCodec$2();

    public SimpleVideoEncoder$hasExynosCodec$2() {
        super(0);
    }

    @Override
    public final Boolean invoke() {
        boolean z6 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        m.d(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            m.d(name, "it.name");
            if (q.B0(name, "c2.exynos", false)) {
                z6 = true;
                break;
            }
        }
        return Boolean.valueOf(z6);
    }
}
