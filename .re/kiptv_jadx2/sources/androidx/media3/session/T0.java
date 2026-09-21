package androidx.media3.session;

public final class T0 implements Runnable {

    public final int f16949h;

    public final MediaSessionService f16950i;
    public final MediaSession j;

    public T0(MediaSessionService mediaSessionService, MediaSession mediaSession, int i3) {
        this.f16949h = i3;
        this.f16950i = mediaSessionService;
        this.j = mediaSession;
    }

    @Override
    public final void run() {
        switch (this.f16949h) {
            case 0:
                this.f16950i.lambda$removeSession$1(this.j);
                break;
            default:
                this.f16950i.lambda$addSession$0(this.j);
                break;
        }
    }
}
