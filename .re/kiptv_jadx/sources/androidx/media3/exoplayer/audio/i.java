package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16598i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ i(int i3, java.lang.Object obj, boolean z6) {
        this.f16597h = i3;
        this.j = obj;
        this.f16598i = z6;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        switch (this.f16597h) {
            case 0:
                ((androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher) this.j).lambda$skipSilenceEnabledChanged$7(this.f16598i);
                break;
            case 1:
                ((androidx.media3.exoplayer.offline.DownloadHelper) this.j).lambda$onMediaPrepared$2(this.f16598i);
                break;
            default:
                ((androidx.media3.exoplayer.source.preload.PreCacheHelper) this.j).lambda$release$2(this.f16598i);
                break;
        }
    }
}
