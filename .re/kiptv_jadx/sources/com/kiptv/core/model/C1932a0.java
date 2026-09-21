package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1932a0 extends com.kiptv.core.model.AbstractC1938d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20739i;

    public C1932a0(java.lang.String str, java.lang.String str2) {
        this.f20738h = str;
        this.f20739i = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.C1932a0)) {
            return false;
        }
        com.kiptv.core.model.C1932a0 c1932a0 = (com.kiptv.core.model.C1932a0) obj;
        return kotlin.jvm.internal.m.a(this.f20738h, c1932a0.f20738h) && kotlin.jvm.internal.m.a(this.f20739i, c1932a0.f20739i);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.f20738h;
    }

    public final int hashCode() {
        int iHashCode = this.f20738h.hashCode() * 31;
        java.lang.String str = this.f20739i;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QuotaExceeded(message=");
        sb.append(this.f20738h);
        sb.append(", resetTime=");
        return Y6.f.m(sb, this.f20739i, ")");
    }
}
