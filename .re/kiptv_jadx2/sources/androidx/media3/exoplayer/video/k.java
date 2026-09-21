package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.DecoderCounters;

public final class k implements Runnable {

    public final int f16836h;

    public final VideoRendererEventListener.EventDispatcher f16837i;
    public final DecoderCounters j;

    public k(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i3) {
        this.f16836h = i3;
        this.f16837i = eventDispatcher;
        this.j = decoderCounters;
    }

    @Override
    public final void run() {
        switch (this.f16836h) {
            case 0:
                this.f16837i.lambda$enabled$0(this.j);
                break;
            default:
                this.f16837i.lambda$disabled$8(this.j);
                break;
        }
    }
}
