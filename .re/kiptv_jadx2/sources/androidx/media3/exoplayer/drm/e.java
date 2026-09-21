package androidx.media3.exoplayer.drm;

public final class e implements Runnable {

    public final int f16624h;

    public final DrmSessionEventListener.EventDispatcher f16625i;
    public final DrmSessionEventListener j;

    public e(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i3) {
        this.f16624h = i3;
        this.f16625i = eventDispatcher;
        this.j = drmSessionEventListener;
    }

    @Override
    public final void run() {
        switch (this.f16624h) {
            case 0:
                this.f16625i.lambda$drmKeysRemoved$4(this.j);
                break;
            case 1:
                this.f16625i.lambda$drmKeysRestored$3(this.j);
                break;
            default:
                this.f16625i.lambda$drmSessionReleased$5(this.j);
                break;
        }
    }
}
