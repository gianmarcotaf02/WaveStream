package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1568a0 implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase.SurfaceCallback f16978i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16979k;

    public /* synthetic */ C1568a0(androidx.media3.session.MediaControllerImplBase.SurfaceCallback surfaceCallback, int i3, int i9, int i10) {
        this.f16977h = i10;
        this.f16978i = surfaceCallback;
        this.j = i3;
        this.f16979k = i9;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f16977h) {
            case 0:
                this.f16978i.lambda$surfaceChanged$0(this.j, this.f16979k, iMediaSession, i3);
                break;
            default:
                this.f16978i.lambda$onSurfaceTextureSizeChanged$1(this.j, this.f16979k, iMediaSession, i3);
                break;
        }
    }
}
