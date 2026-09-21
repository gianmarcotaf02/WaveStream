package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f16589i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ e(java.lang.Object obj, long j, int i3) {
        this.f16588h = i3;
        this.j = obj;
        this.f16589i = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16588h) {
            case 0:
                ((androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher) this.j).lambda$positionAdvancing$3(this.f16589i);
                break;
            case 1:
                ((androidx.media3.exoplayer.source.preload.PreloadMediaSource) this.j).lambda$preload$0(this.f16589i);
                break;
            default:
                ((io.sentry.android.core.AppComponentsBreadcrumbsIntegration) this.j).lambda$onLowMemory$1(this.f16589i);
                break;
        }
    }
}
