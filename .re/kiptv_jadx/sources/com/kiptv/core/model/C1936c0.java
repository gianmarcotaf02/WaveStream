package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1936c0 extends com.kiptv.core.model.AbstractC1938d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20743h;

    public C1936c0(int i3) {
        this.f20743h = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.C1936c0) && this.f20743h == ((com.kiptv.core.model.C1936c0) obj).f20743h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f20743h);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("ServerError(code="), this.f20743h, ")");
    }
}
