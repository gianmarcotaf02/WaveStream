package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener f16502i;
    public final /* synthetic */ android.util.Pair j;

    public /* synthetic */ L(androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener forwardingEventListener, android.util.Pair pair, int i3) {
        this.f16501h = i3;
        this.f16502i = forwardingEventListener;
        this.j = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16501h) {
            case 0:
                this.f16502i.lambda$onDrmKeysRemoved$10(this.j);
                break;
            case 1:
                this.f16502i.lambda$onDrmKeysRestored$9(this.j);
                break;
            default:
                this.f16502i.lambda$onDrmSessionReleased$11(this.j);
                break;
        }
    }
}
