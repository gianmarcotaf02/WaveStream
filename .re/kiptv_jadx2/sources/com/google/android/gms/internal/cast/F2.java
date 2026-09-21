package com.google.android.gms.internal.cast;

import androidx.media3.common.util.Log;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class F2 extends AbstractC1805v2 implements RandomAccess, G2 {

    public static final F2 f18771k = new F2(new int[0], 0, false);

    public int[] f18772i;
    public int j;

    public F2(int[] iArr, int i3, boolean z6) {
        super(z6);
        this.f18772i = iArr;
        this.j = i3;
    }

    @Override
    public final I2 a(int i3) {
        if (i3 >= this.j) {
            return new F2(Arrays.copyOf(this.f18772i, i3), this.j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        int[] iArr = this.f18772i;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i3, iArr, i10, i9 - i3);
        } else {
            int[] iArr2 = new int[Y6.f.c(i9, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.f18772i, i3, iArr2, i10, this.j - i3);
            this.f18772i = iArr2;
        }
        this.f18772i[i3] = iIntValue;
        this.j++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = J2.f18779a;
        collection.getClass();
        if (!(collection instanceof F2)) {
            return super.addAll(collection);
        }
        F2 f9 = (F2) collection;
        int i3 = f9.j;
        if (i3 == 0) {
            return false;
        }
        int i9 = this.j;
        if (Log.LOG_LEVEL_OFF - i9 < i3) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i3;
        int[] iArr = this.f18772i;
        if (i10 > iArr.length) {
            this.f18772i = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(f9.f18772i, 0, this.f18772i, this.j, f9.j);
        this.j = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i3) {
        n(i3);
        return this.f18772i[i3];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F2)) {
            return super.equals(obj);
        }
        F2 f9 = (F2) obj;
        if (this.j != f9.j) {
            return false;
        }
        int[] iArr = f9.f18772i;
        for (int i3 = 0; i3 < this.j; i3++) {
            if (this.f18772i[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        d();
        int i9 = this.j;
        int[] iArr = this.f18772i;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[Y6.f.c(i9, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f18772i = iArr2;
        }
        int[] iArr3 = this.f18772i;
        int i10 = this.j;
        this.j = i10 + 1;
        iArr3[i10] = i3;
    }

    @Override
    public final Object get(int i3) {
        n(i3);
        return Integer.valueOf(this.f18772i[i3]);
    }

    @Override
    public final int hashCode() {
        int i3 = 1;
        for (int i9 = 0; i9 < this.j; i9++) {
            i3 = (i3 * 31) + this.f18772i[i9];
        }
        return i3;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (this.f18772i[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void n(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override
    public final Object remove(int i3) {
        d();
        n(i3);
        int[] iArr = this.f18772i;
        int i9 = iArr[i3];
        int i10 = this.j;
        if (i3 < i10 - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (i10 - i3) - 1);
        }
        this.j--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override
    public final void removeRange(int i3, int i9) {
        d();
        if (i9 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18772i;
        System.arraycopy(iArr, i9, iArr, i3, this.j - i9);
        this.j -= i9 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i3, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        n(i3);
        int[] iArr = this.f18772i;
        int i9 = iArr[i3];
        iArr[i3] = iIntValue;
        return Integer.valueOf(i9);
    }

    @Override
    public final int size() {
        return this.j;
    }

    @Override
    public final boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
