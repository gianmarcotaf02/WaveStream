package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.media3.common.util.NetworkTypeObserver.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16808b;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f16807a = i3;
        this.f16808b = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i3) throws java.lang.Throwable {
        switch (this.f16807a) {
            case 0:
                ((androidx.media3.exoplayer.upstream.DefaultBandwidthMeter) this.f16808b).onNetworkTypeChanged(i3);
                break;
            default:
                ((androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter) this.f16808b).onNetworkTypeChanged(i3);
                break;
        }
    }
}
