package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder f16761i;

    public /* synthetic */ d(androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder mediaSourceHolder, int i3) {
        this.f16760h = i3;
        this.f16761i = mediaSourceHolder;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16760h) {
            case 0:
                androidx.media3.exoplayer.source.preload.BasePreloadManager.lambda$onCompleted$0(this.f16761i, (androidx.media3.exoplayer.source.preload.PreloadManagerListener) obj);
                break;
            default:
                androidx.media3.exoplayer.source.preload.BasePreloadManager.lambda$onCompleted$2(this.f16761i, (androidx.media3.exoplayer.source.preload.PreloadManagerListener) obj);
                break;
        }
    }
}
