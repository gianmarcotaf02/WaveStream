package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class IndexSeekMap implements SeekMap {
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        AbstractC1864o0.L(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.positions = new LongArray(length);
            this.timesUs = new LongArray(length);
        } else {
            int i3 = length + 1;
            LongArray longArray = new LongArray(i3);
            this.positions = longArray;
            LongArray longArray2 = new LongArray(i3);
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

    @Override
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.timesUs.size() == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i3 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i3), this.positions.get(i3)));
    }

    public long getTimeUs(long j) {
        if (this.timesUs.size() == 0) {
            return C.TIME_UNSET;
        }
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j, long j9) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        LongArray longArray = this.timesUs;
        return j - longArray.get(longArray.size() - 1) < j9;
    }

    public void setDurationUs(long j) {
        this.durationUs = j;
    }
}
