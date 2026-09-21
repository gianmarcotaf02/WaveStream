package androidx.media3.exoplayer.upstream.experimental;

public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    @Override
    public void addSample(long j, long j9) {
        long j10 = (8000000 * j) / j9;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j10;
            return;
        }
        double dPow = Math.pow(this.smoothingFactor, Math.sqrt(j));
        this.bitrateEstimate = (long) (((1.0d - dPow) * j10) + (this.bitrateEstimate * dPow));
    }

    @Override
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public ExponentialWeightedAverageStatistic(double d4) {
        this.smoothingFactor = d4;
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
