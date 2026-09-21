package com.kiptv.core.model;

public final class C1936c0 extends AbstractC1938d0 {

    public final int f20743h;

    public C1936c0(int i3) {
        this.f20743h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1936c0) && this.f20743h == ((C1936c0) obj).f20743h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20743h);
    }

    @Override
    public final String toString() {
        return Y6.f.k(new StringBuilder("ServerError(code="), this.f20743h, ")");
    }
}
