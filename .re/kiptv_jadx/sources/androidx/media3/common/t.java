package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements androidx.media3.common.SimpleBasePlayer.PositionSupplier, androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f16448h;

    public /* synthetic */ t(long j) {
        this.f16448h = j;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return androidx.media3.common.SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(this.f16448h);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(java.util.Deque deque) {
        return androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.f16448h, deque);
    }
}
