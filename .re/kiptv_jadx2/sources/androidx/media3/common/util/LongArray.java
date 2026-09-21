package androidx.media3.common.util;

import java.util.Arrays;
import p121o0.p;

public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public void add(long j) {
        int i3 = this.size;
        long[] jArr = this.values;
        if (i3 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i3 * 2);
        }
        long[] jArr2 = this.values;
        int i9 = this.size;
        this.size = i9 + 1;
        jArr2[i9] = j;
    }

    public void addAll(long[] jArr) {
        int length = this.size + jArr.length;
        long[] jArr2 = this.values;
        if (length > jArr2.length) {
            this.values = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.values, this.size, jArr.length);
        this.size = length;
    }

    public long get(int i3) {
        if (i3 >= 0 && i3 < this.size) {
            return this.values[i3];
        }
        StringBuilder sbT = p.t(i3, "Invalid index ", ", size is ");
        sbT.append(this.size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i3) {
        this.values = new long[i3];
    }
}
