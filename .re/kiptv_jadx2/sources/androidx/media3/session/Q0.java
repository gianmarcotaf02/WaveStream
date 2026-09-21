package androidx.media3.session;

public final class Q0 implements MediaSessionLegacyStub.SessionTask {

    public final int f16934h;

    public final MediaSessionLegacyStub f16935i;
    public final int j;

    public Q0(MediaSessionLegacyStub mediaSessionLegacyStub, int i3, int i9) {
        this.f16934h = i9;
        this.f16935i = mediaSessionLegacyStub;
        this.j = i3;
    }

    @Override
    public final void run(MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16934h) {
            case 0:
                this.f16935i.lambda$onSetRepeatMode$15(this.j, controllerInfo);
                break;
            default:
                this.f16935i.lambda$onSetShuffleMode$16(this.j, controllerInfo);
                break;
        }
    }
}
