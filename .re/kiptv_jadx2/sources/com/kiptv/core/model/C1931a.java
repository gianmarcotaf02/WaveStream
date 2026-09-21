package com.kiptv.core.model;

public final class C1931a {

    public final k0 f20736a;

    public final double f20737b;

    public C1931a(k0 k0Var, double d4) {
        this.f20736a = k0Var;
        this.f20737b = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1931a)) {
            return false;
        }
        C1931a c1931a = (C1931a) obj;
        return this.f20736a == c1931a.f20736a && Double.compare(this.f20737b, c1931a.f20737b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f20737b) + (this.f20736a.hashCode() * 31);
    }

    public final String toString() {
        return "ActiveSkip(kind=" + this.f20736a + ", targetSec=" + this.f20737b + ")";
    }
}
