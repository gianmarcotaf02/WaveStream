package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.DecoderCounters;

public final class d implements Runnable {

    public final int f16586h;

    public final AudioRendererEventListener.EventDispatcher f16587i;
    public final DecoderCounters j;

    public d(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i3) {
        this.f16586h = i3;
        this.f16587i = eventDispatcher;
        this.j = decoderCounters;
    }

    @Override
    public final void run() {
        switch (this.f16586h) {
            case 0:
                this.f16587i.lambda$enabled$0(this.j);
                break;
            default:
                this.f16587i.lambda$disabled$6(this.j);
                break;
        }
    }
}
