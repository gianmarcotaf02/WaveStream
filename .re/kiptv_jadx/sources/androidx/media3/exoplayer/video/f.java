package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16826i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16827k;

    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f16825h = i3;
        this.f16826i = obj;
        this.j = obj2;
        this.f16827k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16825h) {
            case 0:
                ((androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink) this.f16826i).lambda$onError$1((androidx.media3.exoplayer.video.VideoSink.Listener) this.j, (androidx.media3.common.VideoFrameProcessingException) this.f16827k);
                break;
            default:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.f16826i).lambda$inputFormatChanged$2((androidx.media3.common.Format) this.j, (androidx.media3.exoplayer.DecoderReuseEvaluation) this.f16827k);
                break;
        }
    }
}
