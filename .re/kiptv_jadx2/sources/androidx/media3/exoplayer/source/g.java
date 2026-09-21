package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;

public final class g implements Consumer {

    public final int f16736h;

    public final MediaSourceEventListener.EventDispatcher f16737i;
    public final LoadEventInfo j;

    public final MediaLoadData f16738k;

    public g(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3) {
        this.f16736h = i3;
        this.f16737i = eventDispatcher;
        this.j = loadEventInfo;
        this.f16738k = mediaLoadData;
    }

    @Override
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        switch (this.f16736h) {
            case 0:
                this.f16737i.lambda$loadCompleted$1(this.j, this.f16738k, mediaSourceEventListener);
                break;
            default:
                this.f16737i.lambda$loadCanceled$2(this.j, this.f16738k, mediaSourceEventListener);
                break;
        }
    }
}
