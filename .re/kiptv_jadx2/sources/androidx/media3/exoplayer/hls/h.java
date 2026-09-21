package androidx.media3.exoplayer.hls;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;

public final class h implements Consumer {

    public final int f16666h;

    public final Object f16667i;
    public final int j;

    public final int f16668k;

    public final Object f16669l;

    public final Object f16670m;

    public h(Object obj, Object obj2, int i3, int i9, Object obj3, int i10) {
        this.f16666h = i10;
        this.f16669l = obj;
        this.f16667i = obj2;
        this.j = i3;
        this.f16668k = i9;
        this.f16670m = obj3;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16666h) {
            case 0:
                ((HlsInterstitialsAdsLoader.Listener) obj).onMetadata((MediaItem) this.f16669l, this.f16667i, this.j, this.f16668k, (Metadata) this.f16670m);
                break;
            default:
                AdsMediaSource adsMediaSource = (AdsMediaSource) this.f16669l;
                int i3 = this.j;
                int i9 = this.f16668k;
                HlsInterstitialsAdsLoader.lambda$handlePrepareError$3(adsMediaSource, this.f16667i, i3, i9, (IOException) this.f16670m, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }
}
