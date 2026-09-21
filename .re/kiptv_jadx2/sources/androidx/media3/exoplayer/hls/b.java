package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.PlayerMessage;

public final class b implements Consumer, PlayerMessage.Target {

    public final int f16651h;

    public final Object f16652i;

    public b(int i3, Object obj) {
        this.f16651h = i3;
        this.f16652i = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16651h) {
            case 0:
                HlsInterstitialsAdsLoader.lambda$startLoadingAssetList$5((HlsInterstitialsAdsLoader.AssetListData) this.f16652i, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((HlsInterstitialsAdsLoader.LoaderCallback) this.f16652i).lambda$onLoadCompleted$0((HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }

    @Override
    public void handleMessage(int i3, Object obj) {
        ((HlsInterstitialsAdsLoader.RunnableAtPosition) this.f16652i).run();
    }
}
