package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class IndexSeekMap implements androidx.media3.extractor.SeekMap {
    private long durationUs;
    private final androidx.media3.common.util.LongArray positions;
    private final androidx.media3.common.util.LongArray timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.positions = new androidx.media3.common.util.LongArray(length);
            this.timesUs = new androidx.media3.common.util.LongArray(length);
        } else {
            int i3 = length + 1;
            androidx.media3.common.util.LongArray longArray = new androidx.media3.common.util.LongArray(i3);
            this.positions = longArray;
            androidx.media3.common.util.LongArray longArray2 = new androidx.media3.common.util.LongArray(i3);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        }
        this.positions.addAll(jArr);
        this.timesUs.addAll(jArr2);
        this.durationUs = j;
    }

    public void addSeekPoint(long j, long j9) {
        if (this.timesUs.size() == 0 && j > 0) {
            this.positions.add(0L);
            this.timesUs.add(0L);
        }
        this.positions.add(j9);
        this.timesUs.add(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.timesUs.size() == 0) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(androidx.media3.extractor.SeekPoint.START);
        }
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.timesUs, j, true, true);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i3 = iBinarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(this.timesUs.get(i3), this.positions.get(i3)));
    }

    public long getTimeUs(long j) {
        if (this.timesUs.size() == 0) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        return this.timesUs.get(androidx.media3.common.util.Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j, long j9) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        androidx.media3.common.util.LongArray longArray = this.timesUs;
        return j - longArray.get(longArray.size() - 1) < j9;
    }

    public void setDurationUs(long j) {
        this.durationUs = j;
    }
}
