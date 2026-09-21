package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.t;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
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
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j) {
        return getAgeBasedEvictionFunction(j, Clock.DEFAULT);
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(long j) {
        return new t(j);
    }

    public static boolean lambda$getAgeBasedEvictionFunction$1(long j, Clock clock, Deque deque) {
        return !deque.isEmpty() && ((Sample) Util.castNonNull((Sample) deque.peek())).timeAddedMs + j < clock.elapsedRealtime();
    }

    public static boolean lambda$getMaxCountEvictionFunction$0(long j, Deque deque) {
        return ((long) deque.size()) >= j;
    }

    @Override
    public void addSample(long j, long j9) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample sampleRemove = this.samples.remove();
            double d4 = this.bitrateWeightProductSum;
            double d6 = sampleRemove.bitrate;
            double d9 = sampleRemove.weight;
            this.bitrateWeightProductSum = d4 - (d6 * d9);
            this.weightSum -= d9;
        }
        Sample sample = new Sample((j * 8000000) / j9, Math.sqrt(j), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d10 = this.bitrateWeightProductSum;
        double d11 = sample.bitrate;
        double d12 = sample.weight;
        this.bitrateWeightProductSum = (d11 * d12) + d10;
        this.weightSum += d12;
    }

    @Override
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j, Clock clock) {
        return new a(j, clock);
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }
}
