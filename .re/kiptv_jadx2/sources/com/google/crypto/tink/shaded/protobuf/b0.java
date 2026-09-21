package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class b0 extends AbstractC1907b implements RandomAccess {

    public static final b0 f19515k;

    public Object[] f19516i;
    public int j;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f19515k = b0Var;
        b0Var.f19514h = false;
    }

    public b0(Object[] objArr, int i3) {
        this.f19516i = objArr;
        this.j = i3;
    }

    @Override
    public final boolean add(Object obj) {
        d();
        int i3 = this.j;
        Object[] objArr = this.f19516i;
        if (i3 == objArr.length) {
            this.f19516i = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f19516i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            StringBuilder sbT = p121o0.p.t(i3, "Index:", ", Size:");
            sbT.append(this.j);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override
    public final A g(int i3) {
        if (i3 >= this.j) {
            return new b0(Arrays.copyOf(this.f19516i, i3), this.j);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final Object get(int i3) {
        e(i3);
        return this.f19516i[i3];
    }

    @Override
    public final Object remove(int i3) {
        d();
        e(i3);
        Object[] objArr = this.f19516i;
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
        Object[] objArr = this.f19516i;
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
    public final void add(int i3, Object obj) {
        int i9;
        d();
        if (i3 >= 0 && i3 <= (i9 = this.j)) {
            Object[] objArr = this.f19516i;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i9 - i3);
            } else {
                Object[] objArr2 = new Object[Y6.f.c(i9, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f19516i, i3, objArr2, i3 + 1, this.j - i3);
                this.f19516i = objArr2;
            }
            this.f19516i[i3] = obj;
            this.j++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p121o0.p.t(i3, "Index:", ", Size:");
        sbT.append(this.j);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
