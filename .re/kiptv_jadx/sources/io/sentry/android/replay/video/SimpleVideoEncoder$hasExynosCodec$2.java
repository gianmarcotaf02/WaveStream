package io.sentry.android.replay.video;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SimpleVideoEncoder$hasExynosCodec$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2 INSTANCE = new io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2();

    public SimpleVideoEncoder$hasExynosCodec$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Boolean invoke() {
        boolean z6 = false;
        android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(0).getCodecInfos();
        kotlin.jvm.internal.m.d(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
        for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
            java.lang.String name = mediaCodecInfo.getName();
            kotlin.jvm.internal.m.d(name, "it.name");
            if (O7.q.B0(name, "c2.exynos", false)) {
                z6 = true;
                break;
            }
        }
        return java.lang.Boolean.valueOf(z6);
    }
}
