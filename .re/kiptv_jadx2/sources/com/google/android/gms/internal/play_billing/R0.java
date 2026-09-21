package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class R0 extends AbstractC1844h0 implements RandomAccess {

    public static final Object[] f19279k;

    public static final R0 f19280l;

    public Object[] f19281i;
    public int j;

    static {
        Object[] objArr = new Object[0];
        f19279k = objArr;
        f19280l = new R0(objArr, 0, false);
    }

    public R0(Object[] objArr, int i3, boolean z6) {
        super(z6);
        this.f19281i = objArr;
        this.j = i3;
    }

    @Override
    public final InterfaceC1885z0 a(int i3) {
        if (i3 >= this.j) {
            return new R0(i3 == 0 ? f19279k : Arrays.copyOf(this.f19281i, i3), this.j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new IndexOutOfBoundsException(M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        Object[] objArr = this.f19281i;
        int length = objArr.length;
        if (i9 < length) {
            System.arraycopy(objArr, i3, objArr, i10, i9 - i3);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f19281i, 0, objArr2, 0, i3);
            System.arraycopy(this.f19281i, i3, objArr2, i10, this.j - i3);
            this.f19281i = objArr2;
        }
        this.f19281i[i3] = obj;
        this.j++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new IndexOutOfBoundsException(M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override
    public final Object get(int i3) {
        e(i3);
        return this.f19281i[i3];
    }

    @Override
    public final Object remove(int i3) {
        d();
        e(i3);
        Object[] objArr = this.f19281i;
        Object obj = objArr[i3];
        int i9 = this.j;
        if (i3 < i9 - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i9 - i3) - 1);
        }
        this.j--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i3, Object obj) {
        d();
        e(i3);
        Object[] objArr = this.f19281i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.j;
    }

    @Override
    public final boolean add(Object obj) {
        d();
        int i3 = this.j;
        int length = this.f19281i.length;
        if (i3 == length) {
            this.f19281i = Arrays.copyOf(this.f19281i, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f19281i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
