package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16695i;
    public final /* synthetic */ androidx.media3.common.Format j;

    public /* synthetic */ f(android.content.Context context, androidx.media3.common.Format format, int i3) {
        this.f16694h = i3;
        this.f16695i = context;
        this.j = format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(java.lang.Object obj) {
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj;
        switch (this.f16694h) {
            case 0:
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$getDecoderInfosSortedByFullFormatSupport$1(this.f16695i, this.j, mediaCodecInfo);
            default:
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(this.f16695i, this.j, mediaCodecInfo);
        }
    }
}
