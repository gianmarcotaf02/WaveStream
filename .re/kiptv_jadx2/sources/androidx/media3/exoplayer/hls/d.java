package androidx.media3.exoplayer.hls;

import android.util.Pair;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

public final class d implements Consumer {

    public final int f16655h;

    public final Object f16656i;
    public final Object j;

    public final Object f16657k;

    public d(Object obj, Object obj2, Object obj3, int i3) {
        this.f16655h = i3;
        this.f16656i = obj;
        this.j = obj2;
        this.f16657k = obj3;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16655h) {
            case 0:
                ((HlsInterstitialsAdsLoader.LoaderCallback) this.f16656i).lambda$onLoadCompleted$1((HlsInterstitialsAdsLoader.AssetList) this.j, (Pair) this.f16657k, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 1:
                HlsInterstitialsAdsLoader.lambda$handleContentTimelineChanged$1((AdsMediaSource) this.f16656i, this.j, (Timeline) this.f16657k, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((HlsInterstitialsAdsLoader.Listener) obj).onStart((MediaItem) this.f16656i, this.j, (AdViewProvider) this.f16657k);
                break;
        }
    }
}
