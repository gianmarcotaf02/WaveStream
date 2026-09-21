package androidx.media3.session;

import androidx.media3.common.util.Consumer;

public final class S implements Consumer {

    public final int f16940h;

    public final MediaControllerImplBase f16941i;
    public final boolean j;

    public final boolean f16942k;

    public final int f16943l;

    public S(MediaControllerImplBase mediaControllerImplBase, boolean z6, boolean z9, int i3, int i9) {
        this.f16940h = i9;
        this.f16941i = mediaControllerImplBase;
        this.j = z6;
        this.f16942k = z9;
        this.f16943l = i3;
    }

    @Override
    public final void accept(Object obj) {
        MediaController.Listener listener = (MediaController.Listener) obj;
        switch (this.f16940h) {
            case 0:
                this.f16941i.lambda$onSetMediaButtonPreferences$124(this.j, this.f16942k, this.f16943l, listener);
                break;
            default:
                this.f16941i.lambda$onSetCustomLayout$123(this.j, this.f16942k, this.f16943l, listener);
                break;
        }
    }
}
