package androidx.media3.exoplayer.upstream.contentsteering;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker f16811i;

    public /* synthetic */ b(androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker steeringManifestTracker, int i3) {
        this.f16810h = i3;
        this.f16811i = steeringManifestTracker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16810h) {
            case 0:
                androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker.access$1000(this.f16811i);
                break;
            default:
                androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker.access$1000(this.f16811i);
                break;
        }
    }
}
