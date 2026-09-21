package androidx.media3.common.util;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Arrays;

public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
        this(10);
    }

    private void addUnchecked(long j, V v6) {
        int i3 = this.first;
        int i9 = this.size;
        V[] vArr = this.values;
        int length = (i3 + i9) % vArr.length;
        this.timestamps[length] = j;
        vArr[length] = v6;
        this.size = i9 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
        int i3 = this.size;
        if (i3 > 0) {
            if (j <= this.timestamps[((this.first + i3) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i3 = length * 2;
        long[] jArr = new long[i3];
        V[] vArr = (V[]) newArray(i3);
        int i9 = this.first;
        int i10 = length - i9;
        System.arraycopy(this.timestamps, i9, jArr, 0, i10);
        System.arraycopy(this.values, this.first, vArr, 0, i10);
        int i11 = this.first;
        if (i11 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i10, i11);
            System.arraycopy(this.values, 0, vArr, i10, this.first);
        }
        this.timestamps = jArr;
        this.values = vArr;
        this.first = 0;
    }

    private static <V> V[] newArray(int i3) {
        return (V[]) new Object[i3];
    }

    private V popFirst() {
        AbstractC1864o0.Y(this.size > 0);
        V[] vArr = this.values;
        int i3 = this.first;
        V v6 = vArr[i3];
        vArr[i3] = null;
        this.first = (i3 + 1) % vArr.length;
        this.size--;
        return v6;
    }

    public synchronized void add(long j, V v6) {
        clearBufferOnTimeDiscontinuity(j);
        doubleCapacityIfFull();
        addUnchecked(j, v6);
    }

    public synchronized void clear() {
        this.first = 0;
        this.size = 0;
        Arrays.fill(this.values, (Object) null);
    }

    public synchronized V poll(long j) {
        return poll(j, false);
    }

    public synchronized V pollFirst() {
        return this.size == 0 ? null : popFirst();
    }

    public synchronized V pollFloor(long j) {
        return poll(j, true);
    }

    public synchronized int size() {
        return this.size;
    }

    public TimedValueQueue(int i3) {
        this.timestamps = new long[i3];
        this.values = (V[]) newArray(i3);
    }

    private V poll(long j, boolean z6) {
        V vPopFirst = null;
        long j9 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j10 = j - this.timestamps[this.first];
            if (j10 < 0 && (z6 || (-j10) >= j9)) {
                break;
            }
            vPopFirst = popFirst();
            j9 = j10;
        }
        return vPopFirst;
    }
}
