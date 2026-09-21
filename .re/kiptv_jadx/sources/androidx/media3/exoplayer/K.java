package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener f16498i;
    public final /* synthetic */ android.util.Pair j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.LoadEventInfo f16499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaLoadData f16500l;

    public /* synthetic */ K(androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener forwardingEventListener, android.util.Pair pair, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3) {
        this.f16497h = i3;
        this.f16498i = forwardingEventListener;
        this.j = pair;
        this.f16499k = loadEventInfo;
        this.f16500l = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16497h) {
            case 0:
                this.f16498i.lambda$onLoadCanceled$2(this.j, this.f16499k, this.f16500l);
                break;
            default:
                this.f16498i.lambda$onLoadCompleted$1(this.j, this.f16499k, this.f16500l);
                break;
        }
    }
}
