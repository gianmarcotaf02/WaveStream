package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.SeekMap;

public final class k implements Runnable {

    public final int f16745h;

    public final Object f16746i;
    public final Object j;

    public k(Object obj, Object obj2, int i3) {
        this.f16745h = i3;
        this.f16746i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16745h) {
            case 0:
                ((ProgressiveMediaPeriod) this.f16746i).lambda$seekMap$1((SeekMap) this.j);
                break;
            default:
                ((Consumer) this.f16746i).accept((MediaSourceEventListener) this.j);
                break;
        }
    }
}
