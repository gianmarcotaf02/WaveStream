package com.google.android.gms.internal.play_billing;

import androidx.media3.common.util.Log;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class C1879w0 extends AbstractC1844h0 implements RandomAccess, InterfaceC1883y0 {

    public static final int[] f19396k;

    public static final C1879w0 f19397l;

    public int[] f19398i;
    public int j;

    static {
        int[] iArr = new int[0];
        f19396k = iArr;
        f19397l = new C1879w0(iArr, 0, false);
    }

    public C1879w0(int[] iArr, int i3, boolean z6) {
        super(z6);
        this.f19398i = iArr;
        this.j = i3;
    }

    @Override
    public final InterfaceC1885z0 a(int i3) {
        if (i3 >= this.j) {
            return new C1879w0(i3 == 0 ? f19396k : Arrays.copyOf(this.f19398i, i3), this.j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new IndexOutOfBoundsException(M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        int[] iArr = this.f19398i;
        int length = iArr.length;
        if (i9 < length) {
            System.arraycopy(iArr, i3, iArr, i10, i9 - i3);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f19398i, 0, iArr2, 0, i3);
            System.arraycopy(this.f19398i, i3, iArr2, i10, this.j - i3);
            this.f19398i = iArr2;
        }
        this.f19398i[i3] = iIntValue;
        this.j++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = B0.f19193a;
        collection.getClass();
        if (!(collection instanceof C1879w0)) {
            return super.addAll(collection);
        }
        C1879w0 c1879w0 = (C1879w0) collection;
        int i3 = c1879w0.j;
        if (i3 == 0) {
            return false;
        }
        int i9 = this.j;
        if (Log.LOG_LEVEL_OFF - i9 < i3) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i3;
        int[] iArr = this.f19398i;
        if (i10 > iArr.length) {
            this.f19398i = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c1879w0.f19398i, 0, this.f19398i, this.j, c1879w0.j);
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
        return this.f19398i[i3];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879w0)) {
            return super.equals(obj);
        }
        C1879w0 c1879w0 = (C1879w0) obj;
        if (this.j != c1879w0.j) {
            return false;
        }
        int[] iArr = c1879w0.f19398i;
        for (int i3 = 0; i3 < this.j; i3++) {
            if (this.f19398i[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        d();
        int i9 = this.j;
        int length = this.f19398i.length;
        if (i9 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f19398i, 0, iArr, 0, this.j);
            this.f19398i = iArr;
        }
        int[] iArr2 = this.f19398i;
        int i10 = this.j;
        this.j = i10 + 1;
        iArr2[i10] = i3;
    }

    @Override
    public final Object get(int i3) {
        n(i3);
        return Integer.valueOf(this.f19398i[i3]);
    }

    @Override
    public final int hashCode() {
        int i3 = 1;
        for (int i9 = 0; i9 < this.j; i9++) {
            i3 = (i3 * 31) + this.f19398i[i9];
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
            if (this.f19398i[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void n(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new IndexOutOfBoundsException(M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override
    public final Object remove(int i3) {
        d();
        n(i3);
        int[] iArr = this.f19398i;
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
        int[] iArr = this.f19398i;
        System.arraycopy(iArr, i9, iArr, i3, this.j - i9);
        this.j -= i9 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i3, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        n(i3);
        int[] iArr = this.f19398i;
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
