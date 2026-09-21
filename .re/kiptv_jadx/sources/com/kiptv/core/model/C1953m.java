package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1953m extends com.kiptv.core.model.AbstractC1954n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBSeriesDetail f20798a;

    public C1953m(com.kiptv.core.model.TMDBSeriesDetail detail) {
        kotlin.jvm.internal.m.e(detail, "detail");
        this.f20798a = detail;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.C1953m) && kotlin.jvm.internal.m.a(this.f20798a, ((com.kiptv.core.model.C1953m) obj).f20798a);
    }

    public final int hashCode() {
        return this.f20798a.hashCode();
    }

    public final java.lang.String toString() {
        return "Series(detail=" + this.f20798a + ")";
    }
}
