package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.MediaLoadData;

public final class I implements Runnable {

    public final int f16489h;

    public final MediaSourceList.ForwardingEventListener f16490i;
    public final Pair j;

    public final MediaLoadData f16491k;

    public I(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData, int i3) {
        this.f16489h = i3;
        this.f16490i = forwardingEventListener;
        this.j = pair;
        this.f16491k = mediaLoadData;
    }

    @Override
    public final void run() {
        switch (this.f16489h) {
            case 0:
                this.f16490i.lambda$onUpstreamDiscarded$4(this.j, this.f16491k);
                break;
            default:
                this.f16490i.lambda$onDownstreamFormatChanged$5(this.j, this.f16491k);
                break;
        }
    }
}
