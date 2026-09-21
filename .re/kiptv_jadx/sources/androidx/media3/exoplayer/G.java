package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16486i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16487k;

    public /* synthetic */ G(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f16485h = i3;
        this.f16486i = obj;
        this.j = obj2;
        this.f16487k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16485h) {
            case 0:
                ((androidx.media3.exoplayer.MediaPeriodQueue) this.f16486i).lambda$notifyQueueUpdate$0((p076i4.Y) this.j, (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) this.f16487k);
                break;
            case 1:
                ((androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener) this.f16486i).lambda$onDrmKeysLoaded$7((android.util.Pair) this.j, (androidx.media3.exoplayer.drm.KeyRequestInfo) this.f16487k);
                break;
            default:
                ((androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener) this.f16486i).lambda$onDrmSessionManagerError$8((android.util.Pair) this.j, (java.lang.Exception) this.f16487k);
                break;
        }
    }
}
