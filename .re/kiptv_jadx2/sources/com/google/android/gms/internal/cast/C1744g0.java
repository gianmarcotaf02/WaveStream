package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

public final class C1744g0 extends AbstractC1728c0 {

    public final transient C1756j0 f18910k;

    public final transient Object[] f18911l;

    public final transient int f18912m;

    public C1744g0(C1756j0 c1756j0, Object[] objArr, int i3) {
        this.f18910k = c1756j0;
        this.f18911l = objArr;
        this.f18912m = i3;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f18910k.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int d(Object[] objArr) {
        AbstractC1720a0 abstractC1720a0Q = this.f18880i;
        if (abstractC1720a0Q == null) {
            abstractC1720a0Q = q();
            this.f18880i = abstractC1720a0Q;
        }
        return abstractC1720a0Q.d(objArr);
    }

    @Override
    public final Iterator iterator() {
        AbstractC1720a0 abstractC1720a0Q = this.f18880i;
        if (abstractC1720a0Q == null) {
            abstractC1720a0Q = q();
            this.f18880i = abstractC1720a0Q;
        }
        return abstractC1720a0Q.listIterator(0);
    }

    public final AbstractC1720a0 q() {
        return new C1740f0(this);
    }

    @Override
    public final int size() {
        return this.f18912m;
    }
}
