package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

public final class j implements Runnable {

    public final int f16599h;

    public final String f16600i;
    public final long j;

    public final long f16601k;

    public final Object f16602l;

    public j(Object obj, String str, long j, long j9, int i3) {
        this.f16599h = i3;
        this.f16602l = obj;
        this.f16600i = str;
        this.j = j;
        this.f16601k = j9;
    }

    @Override
    public final void run() {
        switch (this.f16599h) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.f16602l).lambda$decoderInitialized$1(this.f16600i, this.j, this.f16601k);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f16602l).lambda$decoderInitialized$1(this.f16600i, this.j, this.f16601k);
                break;
        }
    }
}
