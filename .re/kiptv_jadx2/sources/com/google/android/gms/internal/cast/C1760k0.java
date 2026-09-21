package com.google.android.gms.internal.cast;

import java.util.Iterator;

public final class C1760k0 extends AbstractC1728c0 {

    public static final Object[] f18939p;

    public static final C1760k0 f18940q;

    public final transient Object[] f18941k;

    public final transient int f18942l;

    public final transient Object[] f18943m;

    public final transient int f18944n;

    public final transient int f18945o;

    static {
        Object[] objArr = new Object[0];
        f18939p = objArr;
        f18940q = new C1760k0(0, 0, 0, objArr, objArr);
    }

    public C1760k0(int i3, int i9, int i10, Object[] objArr, Object[] objArr2) {
        this.f18941k = objArr;
        this.f18942l = i3;
        this.f18943m = objArr2;
        this.f18944n = i9;
        this.f18945o = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f18943m;
            if (objArr.length != 0) {
                int iB = H.b(obj.hashCode());
                while (true) {
                    int i3 = iB & this.f18944n;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f18941k;
        int i3 = this.f18945o;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int e() {
        return this.f18945o;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return this.f18942l;
    }

    @Override
    public final Iterator iterator() {
        AbstractC1720a0 abstractC1720a0P = this.f18880i;
        if (abstractC1720a0P == null) {
            abstractC1720a0P = AbstractC1720a0.p(this.f18941k, this.f18945o);
            this.f18880i = abstractC1720a0P;
        }
        return abstractC1720a0P.listIterator(0);
    }

    @Override
    public final Object[] n() {
        return this.f18941k;
    }

    @Override
    public final int size() {
        return this.f18945o;
    }
}
