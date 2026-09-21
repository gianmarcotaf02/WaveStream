package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16820i;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f16819h = i3;
        this.f16820i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16819h) {
            case 0:
                ((androidx.media3.exoplayer.video.DefaultVideoSink) this.f16820i).lambda$handleInputFrame$2();
                break;
            case 1:
                ((androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSamplerV33) this.f16820i).lambda$onVsync$0();
                break;
            default:
                ((androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper) this.f16820i).lambda$flush$1();
                break;
        }
    }
}
