package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.video.DefaultVideoSink.FrameRendererImpl f16822i;

    public /* synthetic */ d(androidx.media3.exoplayer.video.DefaultVideoSink.FrameRendererImpl frameRendererImpl, int i3) {
        this.f16821h = i3;
        this.f16822i = frameRendererImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16821h) {
            case 0:
                this.f16822i.lambda$renderFrame$1();
                break;
            default:
                this.f16822i.lambda$dropFrame$2();
                break;
        }
    }
}
