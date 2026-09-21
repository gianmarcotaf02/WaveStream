package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16510a;

    public /* synthetic */ P(int i3) {
        this.f16510a = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16510a) {
            case 0:
                return androidx.media3.exoplayer.StreamVolumeManager.lambda$release$11((androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return androidx.media3.exoplayer.StreamVolumeManager.lambda$increaseVolume$5((androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return androidx.media3.exoplayer.StreamVolumeManager.lambda$decreaseVolume$7((androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            default:
                return new androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector((androidx.media3.common.util.Clock) obj);
        }
    }
}
