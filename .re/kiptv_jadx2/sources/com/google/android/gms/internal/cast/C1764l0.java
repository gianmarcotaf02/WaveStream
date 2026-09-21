package com.google.android.gms.internal.cast;

import java.util.Iterator;

public final class C1764l0 extends AbstractC1728c0 {

    public final transient Object f18974k;

    public C1764l0(Object obj) {
        this.f18974k = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f18974k.equals(obj);
    }

    @Override
    public final int d(Object[] objArr) {
        objArr[0] = this.f18974k;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.f18974k.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new C1732d0(this.f18974k);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return Y6.f.h("[", this.f18974k.toString(), "]");
    }
}
