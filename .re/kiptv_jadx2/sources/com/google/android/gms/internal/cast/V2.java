package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class V2 extends AbstractC1805v2 implements RandomAccess {

    public static final V2 f18829k = new V2(new Object[0], 0, false);

    public Object[] f18830i;
    public int j;

    public V2(Object[] objArr, int i3, boolean z6) {
        super(z6);
        this.f18830i = objArr;
        this.j = i3;
    }

    @Override
    public final I2 a(int i3) {
        if (i3 >= this.j) {
            return new V2(Arrays.copyOf(this.f18830i, i3), this.j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        Object[] objArr = this.f18830i;
        if (i9 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i10, i9 - i3);
        } else {
            Object[] objArr2 = new Object[Y6.f.c(i9, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            System.arraycopy(this.f18830i, i3, objArr2, i10, this.j - i3);
            this.f18830i = objArr2;
        }
        this.f18830i[i3] = obj;
        this.j++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override
    public final Object get(int i3) {
        e(i3);
        return this.f18830i[i3];
    }

    @Override
    public final Object remove(int i3) {
        d();
        e(i3);
        Object[] objArr = this.f18830i;
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
        Object[] objArr = this.f18830i;
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
        Object[] objArr = this.f18830i;
        if (i3 == objArr.length) {
            this.f18830i = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18830i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
