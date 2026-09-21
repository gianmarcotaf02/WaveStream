package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16824i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16823h = i3;
        this.j = obj;
        this.f16824i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16823h) {
            case 0:
                ((androidx.media3.exoplayer.video.DefaultVideoSink.FrameRendererImpl) this.j).lambda$onVideoSizeChanged$0((androidx.media3.common.VideoSize) this.f16824i);
                break;
            case 1:
                ((androidx.media3.exoplayer.video.VideoSink.Listener) this.j).onVideoSizeChanged((androidx.media3.common.VideoSize) this.f16824i);
                break;
            case 2:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.j).lambda$decoderReleased$7((java.lang.String) this.f16824i);
                break;
            case 3:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.j).lambda$videoSizeChanged$5((androidx.media3.common.VideoSize) this.f16824i);
                break;
            case 4:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.j).lambda$videoCodecError$9((java.lang.Exception) this.f16824i);
                break;
            default:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.j).lambda$videoCodecParametersChanged$10((androidx.media3.exoplayer.CodecParameters) this.f16824i);
                break;
        }
    }
}
