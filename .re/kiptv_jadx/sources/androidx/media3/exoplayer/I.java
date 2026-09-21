package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener f16490i;
    public final /* synthetic */ android.util.Pair j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaLoadData f16491k;

    public /* synthetic */ I(androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener forwardingEventListener, android.util.Pair pair, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3) {
        this.f16489h = i3;
        this.f16490i = forwardingEventListener;
        this.j = pair;
        this.f16491k = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16489h) {
            case 0:
                this.f16490i.lambda$onUpstreamDiscarded$4(this.j, this.f16491k);
                break;
            default:
                this.f16490i.lambda$onDownstreamFormatChanged$5(this.j, this.f16491k);
                break;
        }
    }
}
