package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16831i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16832k;

    public /* synthetic */ i(int i3, long j, androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher eventDispatcher) {
        this.f16830h = 0;
        this.f16831i = eventDispatcher;
        this.f16832k = i3;
        this.j = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16830h) {
            case 0:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.f16831i).lambda$droppedFrames$3(this.f16832k, this.j);
                break;
            case 1:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.f16831i).lambda$reportVideoFrameProcessingOffset$4(this.j, this.f16832k);
                break;
            default:
                ((io.sentry.android.core.AppComponentsBreadcrumbsIntegration) this.f16831i).lambda$onTrimMemory$2(this.j, this.f16832k);
                break;
        }
    }

    public /* synthetic */ i(java.lang.Object obj, int i3, int i9, long j) {
        this.f16830h = i9;
        this.f16831i = obj;
        this.j = j;
        this.f16832k = i3;
    }
}
