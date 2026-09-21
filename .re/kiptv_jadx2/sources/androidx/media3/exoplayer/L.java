package androidx.media3.exoplayer;

import android.util.Pair;

public final class L implements Runnable {

    public final int f16501h;

    public final MediaSourceList.ForwardingEventListener f16502i;
    public final Pair j;

    public L(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i3) {
        this.f16501h = i3;
        this.f16502i = forwardingEventListener;
        this.j = pair;
    }

    @Override
    public final void run() {
        switch (this.f16501h) {
            case 0:
                this.f16502i.lambda$onDrmKeysRemoved$10(this.j);
                break;
            case 1:
                this.f16502i.lambda$onDrmKeysRestored$9(this.j);
                break;
            default:
                this.f16502i.lambda$onDrmSessionReleased$11(this.j);
                break;
        }
    }
}
