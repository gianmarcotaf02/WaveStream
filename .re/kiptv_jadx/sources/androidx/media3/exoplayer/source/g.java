package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher f16737i;
    public final /* synthetic */ androidx.media3.exoplayer.source.LoadEventInfo j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaLoadData f16738k;

    public /* synthetic */ g(androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3) {
        this.f16736h = i3;
        this.f16737i = eventDispatcher;
        this.j = loadEventInfo;
        this.f16738k = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = (androidx.media3.exoplayer.source.MediaSourceEventListener) obj;
        switch (this.f16736h) {
            case 0:
                this.f16737i.lambda$loadCompleted$1(this.j, this.f16738k, mediaSourceEventListener);
                break;
            default:
                this.f16737i.lambda$loadCanceled$2(this.j, this.f16738k, mediaSourceEventListener);
                break;
        }
    }
}
