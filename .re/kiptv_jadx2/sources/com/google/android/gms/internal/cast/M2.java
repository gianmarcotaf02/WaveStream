package com.google.android.gms.internal.cast;

import androidx.media3.common.util.Log;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class M2 extends AbstractC1805v2 implements RandomAccess, H2 {

    public static final M2 f18795k = new M2(new long[0], 0, false);

    public long[] f18796i;
    public int j;

    public M2(long[] jArr, int i3, boolean z6) {
        super(z6);
        this.f18796i = jArr;
        this.j = i3;
    }

    @Override
    public final I2 a(int i3) {
        if (i3 >= this.j) {
            return new M2(Arrays.copyOf(this.f18796i, i3), this.j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        long[] jArr = this.f18796i;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i3, jArr, i10, i9 - i3);
        } else {
            long[] jArr2 = new long[Y6.f.c(i9, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            System.arraycopy(this.f18796i, i3, jArr2, i10, this.j - i3);
            this.f18796i = jArr2;
        }
        this.f18796i[i3] = jLongValue;
        this.j++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = J2.f18779a;
        collection.getClass();
        if (!(collection instanceof M2)) {
            return super.addAll(collection);
        }
        M2 m8 = (M2) collection;
        int i3 = m8.j;
        if (i3 == 0) {
            return false;
        }
        int i9 = this.j;
        if (Log.LOG_LEVEL_OFF - i9 < i3) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i3;
        long[] jArr = this.f18796i;
        if (i10 > jArr.length) {
            this.f18796i = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(m8.f18796i, 0, this.f18796i, this.j, m8.j);
        this.j = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i3) {
        f(i3);
        return this.f18796i[i3];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return super.equals(obj);
        }
        M2 m8 = (M2) obj;
        if (this.j != m8.j) {
            return false;
        }
        long[] jArr = m8.f18796i;
        for (int i3 = 0; i3 < this.j; i3++) {
            if (this.f18796i[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override
    public final Object get(int i3) {
        f(i3);
        return Long.valueOf(this.f18796i[i3]);
    }

    @Override
    public final int hashCode() {
        int i3 = 1;
        for (int i9 = 0; i9 < this.j; i9++) {
            long j = this.f18796i[i9];
            Charset charset = J2.f18779a;
            i3 = (i3 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i3;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (this.f18796i[i9] == jLongValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i3) {
        d();
        f(i3);
        long[] jArr = this.f18796i;
        long j = jArr[i3];
        int i9 = this.j;
        if (i3 < i9 - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (i9 - i3) - 1);
        }
        this.j--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override
    public final void removeRange(int i3, int i9) {
        d();
        if (i9 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f18796i;
        System.arraycopy(jArr, i9, jArr, i3, this.j - i9);
        this.j -= i9 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i3, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        f(i3);
        long[] jArr = this.f18796i;
        long j = jArr[i3];
        jArr[i3] = jLongValue;
        return Long.valueOf(j);
    }

    @Override
    public final int size() {
        return this.j;
    }

    @Override
    public final boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        int i3 = this.j;
        long[] jArr = this.f18796i;
        if (i3 == jArr.length) {
            long[] jArr2 = new long[Y6.f.c(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            this.f18796i = jArr2;
        }
        long[] jArr3 = this.f18796i;
        int i9 = this.j;
        this.j = i9 + 1;
        jArr3[i9] = jLongValue;
        return true;
    }
}
