package androidx.media3.session;

public final class C1568a0 implements MediaControllerImplBase.RemoteSessionTask {

    public final int f16977h;

    public final MediaControllerImplBase.SurfaceCallback f16978i;
    public final int j;

    public final int f16979k;

    public C1568a0(MediaControllerImplBase.SurfaceCallback surfaceCallback, int i3, int i9, int i10) {
        this.f16977h = i10;
        this.f16978i = surfaceCallback;
        this.j = i3;
        this.f16979k = i9;
    }

    @Override
    public final void run(IMediaSession iMediaSession, int i3) {
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
