package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1556k implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.upstream.BandwidthMeter f16682i;

    public /* synthetic */ C1556k(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, int i3) {
        this.f16681h = i3;
        this.f16682i = bandwidthMeter;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16681h) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.f16682i);
            default:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$12(this.f16682i);
        }
    }
}
