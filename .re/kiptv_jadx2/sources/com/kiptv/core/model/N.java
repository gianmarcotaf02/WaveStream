package com.kiptv.core.model;

public final class N {

    public final String f19896a;

    public N(String str) {
        this.f19896a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && kotlin.jvm.internal.m.a(this.f19896a, ((N) obj).f19896a);
    }

    public final int hashCode() {
        String str = this.f19896a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return Y6.f.m(new StringBuilder("M3UHeader(epgUrl="), this.f19896a, ")");
    }
}
