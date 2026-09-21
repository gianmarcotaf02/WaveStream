package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

public final class C1732d0 extends AbstractC1768m0 {

    public final Object f18887h;

    public boolean f18888i;

    public C1732d0(Object obj) {
        this.f18887h = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f18888i;
    }

    @Override
    public final Object next() {
        if (this.f18888i) {
            throw new NoSuchElementException();
        }
        this.f18888i = true;
        return this.f18887h;
    }
}
