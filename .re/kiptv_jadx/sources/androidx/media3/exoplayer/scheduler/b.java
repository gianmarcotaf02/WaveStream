package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback f16717i;

    public /* synthetic */ b(androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback networkCallback, int i3) {
        this.f16716h = i3;
        this.f16717i = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16716h) {
            case 0:
                this.f16717i.lambda$postCheckRequirements$0();
                break;
            default:
                this.f16717i.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
