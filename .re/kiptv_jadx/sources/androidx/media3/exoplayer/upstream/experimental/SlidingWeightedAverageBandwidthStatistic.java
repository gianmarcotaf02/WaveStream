package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public class SlidingWeightedAverageBandwidthStatistic implements androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction sampleEvictionFunction;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample> samples;
    private double weightSum;

    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j, double d4, long j9) {
            this.bitrate = j;
            this.weight = d4;
            this.timeAddedMs = j9;
        }
    }

    public interface SampleEvictionFunction {
        boolean shouldEvictSample(java.util.Deque<androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction getAgeBasedEvictionFunction(long j) {
        return getAgeBasedEvictionFunction(j, androidx.media3.common.util.Clock.DEFAULT);
    }

    public static androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction getMaxCountEvictionFunction(long j) {
        return new androidx.media3.common.t(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j, androidx.media3.common.util.Clock clock, java.util.Deque deque) {
        return !deque.isEmpty() && ((androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample) androidx.media3.common.util.Util.castNonNull((androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample) deque.peek())).timeAddedMs + j < clock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, java.util.Deque deque) {
        return ((long) deque.size()) >= j;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j9) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample sampleRemove = this.samples.remove();
            double d4 = this.bitrateWeightProductSum;
            double d6 = sampleRemove.bitrate;
            double d9 = sampleRemove.weight;
            this.bitrateWeightProductSum = d4 - (d6 * d9);
            this.weightSum -= d9;
        }
        androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample sample = new androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample((j * 8000000) / j9, java.lang.Math.sqrt(j), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d10 = this.bitrateWeightProductSum;
        double d11 = sample.bitrate;
        double d12 = sample.weight;
        this.bitrateWeightProductSum = (d11 * d12) + d10;
        this.weightSum += d12;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }

    public SlidingWeightedAverageBandwidthStatistic(androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, androidx.media3.common.util.Clock.DEFAULT);
    }

    public static androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction getAgeBasedEvictionFunction(long j, androidx.media3.common.util.Clock clock) {
        return new androidx.media3.exoplayer.upstream.experimental.a(j, clock);
    }

    public SlidingWeightedAverageBandwidthStatistic(androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction sampleEvictionFunction, androidx.media3.common.util.Clock clock) {
        this.samples = new java.util.ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }
}
