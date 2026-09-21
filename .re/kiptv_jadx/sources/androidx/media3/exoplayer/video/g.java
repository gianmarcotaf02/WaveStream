package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.video.VideoSink.Listener f16829i;

    public /* synthetic */ g(androidx.media3.exoplayer.video.VideoSink.Listener listener, int i3) {
        this.f16828h = i3;
        this.f16829i = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16828h) {
            case 0:
                this.f16829i.onFrameDropped();
                break;
            case 1:
                this.f16829i.onFirstFrameRendered();
                break;
            default:
                this.f16829i.onFrameAvailableForRendering();
                break;
        }
    }
}
