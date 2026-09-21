package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

public final class K implements Runnable {

    public final int f16497h;

    public final MediaSourceList.ForwardingEventListener f16498i;
    public final Pair j;

    public final LoadEventInfo f16499k;

    public final MediaLoadData f16500l;

    public K(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3) {
        this.f16497h = i3;
        this.f16498i = forwardingEventListener;
        this.j = pair;
        this.f16499k = loadEventInfo;
        this.f16500l = mediaLoadData;
    }

    @Override
    public final void run() {
        switch (this.f16497h) {
            case 0:
                this.f16498i.lambda$onLoadCanceled$2(this.j, this.f16499k, this.f16500l);
                break;
            default:
                this.f16498i.lambda$onLoadCompleted$1(this.j, this.f16499k, this.f16500l);
                break;
        }
    }
}
