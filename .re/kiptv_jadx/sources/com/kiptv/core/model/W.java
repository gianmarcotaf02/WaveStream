package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class W extends com.kiptv.core.model.AbstractC1938d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20608h;

    public W(java.lang.String str) {
        this.f20608h = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.W) && kotlin.jvm.internal.m.a(this.f20608h, ((com.kiptv.core.model.W) obj).f20608h);
    }

    public final int hashCode() {
        return this.f20608h.hashCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Forbidden(msg="), this.f20608h, ")");
    }
}
