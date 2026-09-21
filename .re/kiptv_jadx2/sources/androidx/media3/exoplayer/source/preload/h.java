package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import p068h4.v;

public final class h implements v {

    public final int f16766h;

    public final Context f16767i;

    public h(Context context, int i3) {
        this.f16766h = i3;
        this.f16767i = context;
    }

    @Override
    public final Object get() {
        switch (this.f16766h) {
            case 0:
                return DefaultPreloadManager.DefaultMediaSourceFactorySupplier.lambda$new$0(this.f16767i);
            case 1:
                return DefaultBandwidthMeter.getSingletonInstance(this.f16767i);
            default:
                return DefaultPreloadManager.Builder.lambda$new$1(this.f16767i);
        }
    }
}
