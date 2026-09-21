package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.ListenerSet;

public final class c implements ListenerSet.Event, RankingDataComparator.InvalidationListener {

    public final int f16758h;

    public final Object f16759i;

    public c(int i3, Object obj) {
        this.f16758h = i3;
        this.f16759i = obj;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f16758h) {
            case 0:
                ((PreloadManagerListener) obj).onError((PreloadException) this.f16759i);
                break;
            default:
                ((PreloadManagerListener) obj).onError((PreloadException) this.f16759i);
                break;
        }
    }

    @Override
    public void onRankingDataComparatorInvalidated() {
        ((BasePreloadManager) this.f16759i).invalidate();
    }
}
