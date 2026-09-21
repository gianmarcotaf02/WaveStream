package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16759i;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f16758h = i3;
        this.f16759i = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f16758h) {
            case 0:
                ((androidx.media3.exoplayer.source.preload.PreloadManagerListener) obj).onError((androidx.media3.exoplayer.source.preload.PreloadException) this.f16759i);
                break;
            default:
                ((androidx.media3.exoplayer.source.preload.PreloadManagerListener) obj).onError((androidx.media3.exoplayer.source.preload.PreloadException) this.f16759i);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener
    public void onRankingDataComparatorInvalidated() {
        ((androidx.media3.exoplayer.source.preload.BasePreloadManager) this.f16759i).invalidate();
    }
}
