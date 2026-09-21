package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1931a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.k0 f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20737b;

    public C1931a(com.kiptv.core.model.k0 k0Var, double d4) {
        this.f20736a = k0Var;
        this.f20737b = d4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.C1931a)) {
            return false;
        }
        com.kiptv.core.model.C1931a c1931a = (com.kiptv.core.model.C1931a) obj;
        return this.f20736a == c1931a.f20736a && java.lang.Double.compare(this.f20737b, c1931a.f20737b) == 0;
    }

    public final int hashCode() {
        return java.lang.Double.hashCode(this.f20737b) + (this.f20736a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ActiveSkip(kind=" + this.f20736a + ", targetSec=" + this.f20737b + ")";
    }
}
