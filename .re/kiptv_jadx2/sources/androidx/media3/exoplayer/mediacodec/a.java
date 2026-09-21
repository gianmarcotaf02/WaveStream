package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.FormatHolder;

public final class a implements Runnable {

    public final int f16685h;

    public final Object f16686i;
    public final Object j;

    public a(Object obj, Object obj2, int i3) {
        this.f16685h = i3;
        this.f16686i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16685h) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f16686i).lambda$useInputBuffer$0((Runnable) this.j);
                break;
            default:
                ((MediaCodecRenderer) this.f16686i).lambda$feedInputBuffer$0((FormatHolder) this.j);
                break;
        }
    }
}
