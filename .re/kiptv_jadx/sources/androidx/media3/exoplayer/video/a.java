package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16818h;

    public /* synthetic */ a(int i3) {
        this.f16818h = i3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f16818h) {
            case 0:
                androidx.media3.exoplayer.video.DefaultVideoSink.lambda$new$0(runnable);
                break;
            default:
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
        }
    }
}
