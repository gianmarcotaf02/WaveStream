package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

public final class C1880x extends AbstractC1874u {
    public final transient A j;

    public final transient Object[] f19399k;

    public final transient int f19400l;

    public C1880x(A a2, Object[] objArr, int i3) {
        this.j = a2;
        this.f19399k = objArr;
        this.f19400l = i3;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.j.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int d(Object[] objArr) {
        return n().d(objArr);
    }

    @Override
    public final Iterator iterator() {
        return n().listIterator(0);
    }

    @Override
    public final r q() {
        return new C1878w(this);
    }

    @Override
    public final int size() {
        return this.f19400l;
    }
}
