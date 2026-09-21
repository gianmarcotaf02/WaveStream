package androidx.media3.session;

public final class N0 implements MediaSessionLegacyStub.SessionTask {

    public final int f16921h;

    public final MediaSessionLegacyStub f16922i;
    public final long j;

    public N0(MediaSessionLegacyStub mediaSessionLegacyStub, long j, int i3) {
        this.f16921h = i3;
        this.f16922i = mediaSessionLegacyStub;
        this.j = j;
    }

    @Override
    public final void run(MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16921h) {
            case 0:
                this.f16922i.lambda$onSkipToQueueItem$12(this.j, controllerInfo);
                break;
            default:
                this.f16922i.lambda$onSeekTo$6(this.j, controllerInfo);
                break;
        }
    }
}
