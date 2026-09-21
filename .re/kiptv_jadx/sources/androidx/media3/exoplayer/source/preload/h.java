package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16767i;

    public /* synthetic */ h(android.content.Context context, int i3) {
        this.f16766h = i3;
        this.f16767i = context;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16766h) {
            case 0:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.DefaultMediaSourceFactorySupplier.lambda$new$0(this.f16767i);
            case 1:
                return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(this.f16767i);
            default:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.lambda$new$1(this.f16767i);
        }
    }
}
