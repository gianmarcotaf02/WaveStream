package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import p068h4.v;

public final class g implements v {

    public final int f16764h;

    public final Object f16765i;

    public g(int i3, Object obj) {
        this.f16764h = i3;
        this.f16765i = obj;
    }

    @Override
    public final Object get() {
        switch (this.f16764h) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setLoadControl$3((LoadControl) this.f16765i);
            case 1:
                return DefaultPreloadManager.Builder.lambda$setRenderersFactory$2((RenderersFactory) this.f16765i);
            default:
                return DefaultPreloadManager.Builder.lambda$setBandwidthMeter$4((BandwidthMeter) this.f16765i);
        }
    }
}
