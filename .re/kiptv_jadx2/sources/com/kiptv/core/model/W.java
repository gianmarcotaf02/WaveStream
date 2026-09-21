package com.kiptv.core.model;

public final class W extends AbstractC1938d0 {

    public final String f20608h;

    public W(String str) {
        this.f20608h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W) && kotlin.jvm.internal.m.a(this.f20608h, ((W) obj).f20608h);
    }

    public final int hashCode() {
        return this.f20608h.hashCode();
    }

    @Override
    public final String toString() {
        return Y6.f.m(new StringBuilder("Forbidden(msg="), this.f20608h, ")");
    }
}
