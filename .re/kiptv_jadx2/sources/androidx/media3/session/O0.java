package androidx.media3.session;

public final class O0 implements Runnable {

    public final int f16925h;

    public final MediaSessionLegacyStub f16926i;
    public final PlayerWrapper j;

    public O0(MediaSessionLegacyStub mediaSessionLegacyStub, PlayerWrapper playerWrapper, int i3) {
        this.f16925h = i3;
        this.f16926i = mediaSessionLegacyStub;
        this.j = playerWrapper;
    }

    @Override
    public final void run() {
        switch (this.f16925h) {
            case 0:
                this.f16926i.lambda$updateLegacySessionPlaybackStateAndQueue$25(this.j);
                break;
            default:
                this.f16926i.lambda$updateLegacySessionPlaybackState$24(this.j);
                break;
        }
    }
}
