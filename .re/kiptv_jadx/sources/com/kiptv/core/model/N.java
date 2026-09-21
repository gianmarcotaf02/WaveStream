package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19896a;

    public N(java.lang.String str) {
        this.f19896a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.N) && kotlin.jvm.internal.m.a(this.f19896a, ((com.kiptv.core.model.N) obj).f19896a);
    }

    public final int hashCode() {
        java.lang.String str = this.f19896a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("M3UHeader(epgUrl="), this.f19896a, ")");
    }
}
