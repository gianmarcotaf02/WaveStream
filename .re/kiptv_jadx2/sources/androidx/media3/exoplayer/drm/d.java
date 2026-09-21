package androidx.media3.exoplayer.drm;

public final class d implements Runnable {

    public final int f16622h;

    public final Object f16623i;

    public d(int i3, Object obj) {
        this.f16622h = i3;
        this.f16623i = obj;
    }

    @Override
    public final void run() {
        switch (this.f16622h) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f16623i).lambda$release$1();
                break;
            default:
                ((DefaultDrmSession) this.f16623i).release(null);
                break;
        }
    }
}
