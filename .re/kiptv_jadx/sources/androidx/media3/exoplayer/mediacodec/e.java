package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider, androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener, androidx.media3.exoplayer.mediacodec.MediaCodecSelector {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16693h;

    public /* synthetic */ e(int i3) {
        this.f16693h = i3;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public java.util.List getDecoderInfos(java.lang.String str, boolean z6, boolean z9) {
        switch (this.f16693h) {
            case 3:
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfos(str, z6, z9);
            default:
                return androidx.media3.exoplayer.mediacodec.MediaCodecSelector.lambda$static$0(str, z6, z9);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int getScore(java.lang.Object obj) {
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj;
        switch (this.f16693h) {
            case 0:
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$getDecoderInfosSortedBySoftwareOnly$2(mediaCodecInfo);
            default:
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$applyWorkarounds$3(mediaCodecInfo);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public android.os.Bundle onLoudnessParameterUpdate(android.os.Bundle bundle) {
        return androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener.lambda$static$0(bundle);
    }
}
