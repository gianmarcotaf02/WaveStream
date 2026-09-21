package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.85d;
    private static final int MAX_DATA_SPECS = 10;
    private final androidx.media3.common.util.Clock clock;
    private long estimateUs;
    private final java.util.LinkedHashMap<androidx.media3.datasource.DataSpec, java.lang.Long> initializedDataSpecs;
    private final double smoothingFactor;

    public static class FixedSizeLinkedHashMap<K, V> extends java.util.LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i3) {
            this.maxSize = i3;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(java.util.Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85d, androidx.media3.common.util.Clock.DEFAULT);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return this.estimateUs;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(androidx.media3.datasource.DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, java.lang.Long.valueOf(androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(androidx.media3.datasource.DataSpec dataSpec) {
        java.lang.Long lRemove = this.initializedDataSpecs.remove(dataSpec);
        if (lRemove == null) {
            return;
        }
        long jMsToUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime()) - lRemove.longValue();
        long j = this.estimateUs;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            this.estimateUs = jMsToUs;
            return;
        }
        double d4 = this.smoothingFactor;
        this.estimateUs = (long) (((1.0d - d4) * jMsToUs) + (j * d4));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.estimateUs = androidx.media3.common.C.TIME_UNSET;
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d4) {
        this(d4, androidx.media3.common.util.Clock.DEFAULT);
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d4, androidx.media3.common.util.Clock clock) {
        this.smoothingFactor = d4;
        this.clock = clock;
        this.initializedDataSpecs = new androidx.media3.exoplayer.upstream.experimental.ExponentialWeightedAverageTimeToFirstByteEstimator.FixedSizeLinkedHashMap(10);
        this.estimateUs = androidx.media3.common.C.TIME_UNSET;
    }
}
