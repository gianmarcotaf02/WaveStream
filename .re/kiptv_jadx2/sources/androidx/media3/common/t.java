package androidx.media3.common;

import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

public final class t implements SimpleBasePlayer.PositionSupplier, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {

    public final long f16448h;

    public t(long j) {
        this.f16448h = j;
    }

    @Override
    public long get() {
        return SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(this.f16448h);
    }

    @Override
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.f16448h, deque);
    }
}
