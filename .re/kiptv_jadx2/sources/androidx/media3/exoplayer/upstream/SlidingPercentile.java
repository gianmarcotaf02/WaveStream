package androidx.media3.exoplayer.upstream;

import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SlidingPercentile {
    private static final Comparator<Sample> INDEX_COMPARATOR;
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private static final Comparator<Sample> VALUE_COMPARATOR;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    static {
        final int i3 = 0;
        INDEX_COMPARATOR = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i3) {
                    case 0:
                        return SlidingPercentile.lambda$static$0(sample, sample2);
                    default:
                        return SlidingPercentile.lambda$static$1(sample, sample2);
                }
            }
        };
        final int i9 = 1;
        VALUE_COMPARATOR = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i9) {
                    case 0:
                        return SlidingPercentile.lambda$static$0(sample, sample2);
                    default:
                        return SlidingPercentile.lambda$static$1(sample, sample2);
                }
            }
        };
    }

    public SlidingPercentile(int i3) {
        this.maxWeight = i3;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    public static int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    public static int lambda$static$1(Sample sample, Sample sample2) {
        return Float.compare(sample.value, sample2.value);
    }

    public void addSample(int i3, float f9) {
        Sample sample;
        ensureSortedByIndex();
        int i9 = this.recycledSampleCount;
        if (i9 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i10 = i9 - 1;
            this.recycledSampleCount = i10;
            sample = sampleArr[i10];
        } else {
            sample = new Sample();
        }
        int i11 = this.nextSampleIndex;
        this.nextSampleIndex = i11 + 1;
        sample.index = i11;
        sample.weight = i3;
        sample.value = f9;
        this.samples.add(sample);
        this.totalWeight += i3;
        while (true) {
            int i12 = this.totalWeight;
            int i13 = this.maxWeight;
            if (i12 <= i13) {
                return;
            }
            int i14 = i12 - i13;
            Sample sample2 = this.samples.get(0);
            int i15 = sample2.weight;
            if (i15 <= i14) {
                this.totalWeight -= i15;
                this.samples.remove(0);
                int i16 = this.recycledSampleCount;
                if (i16 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i16 + 1;
                    sampleArr2[i16] = sample2;
                }
            } else {
                sample2.weight = i15 - i14;
                this.totalWeight -= i14;
            }
        }
    }

    public float getPercentile(float f9) {
        ensureSortedByValue();
        float f10 = f9 * this.totalWeight;
        int i3 = 0;
        for (int i9 = 0; i9 < this.samples.size(); i9++) {
            Sample sample = this.samples.get(i9);
            i3 += sample.weight;
            if (i3 >= f10) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return ((Sample) M0.j(1, this.samples)).value;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
