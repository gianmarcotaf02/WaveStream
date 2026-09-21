package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1552g implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16644b;

    public /* synthetic */ C1552g(int i3, java.lang.Object obj) {
        this.f16643a = i3;
        this.f16644b = obj;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16643a) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setAnalyticsCollector$21((androidx.media3.exoplayer.analytics.AnalyticsCollector) this.f16644b, (androidx.media3.common.util.Clock) obj);
            case 1:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$13((androidx.media3.exoplayer.analytics.AnalyticsCollector) this.f16644b, (androidx.media3.common.util.Clock) obj);
            default:
                return ((androidx.media3.exoplayer.StreamVolumeManager) this.f16644b).lambda$release$12((androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
