package androidx.media3.exoplayer.hls;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

public final class g implements Consumer {

    public final int f16662h;

    public final Object f16663i;
    public final int j;

    public final int f16664k;

    public final Object f16665l;

    public g(int i3, int i9, int i10, Object obj, Object obj2) {
        this.f16662h = i10;
        this.f16665l = obj;
        this.f16663i = obj2;
        this.j = i3;
        this.f16664k = i9;
    }

    @Override
    public final void accept(Object obj) {
        HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj;
        switch (this.f16662h) {
            case 0:
                listener.onAdCompleted((MediaItem) this.f16665l, this.f16663i, this.j, this.f16664k);
                break;
            default:
                HlsInterstitialsAdsLoader.lambda$handlePrepareComplete$2((AdsMediaSource) this.f16665l, this.f16663i, this.j, this.f16664k, listener);
                break;
        }
    }
}
