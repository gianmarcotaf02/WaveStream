package com.kiptv.core.model;

public final class C1953m extends AbstractC1954n {

    public final TMDBSeriesDetail f20798a;

    public C1953m(TMDBSeriesDetail detail) {
        kotlin.jvm.internal.m.e(detail, "detail");
        this.f20798a = detail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1953m) && kotlin.jvm.internal.m.a(this.f20798a, ((C1953m) obj).f20798a);
    }

    public final int hashCode() {
        return this.f20798a.hashCode();
    }

    public final String toString() {
        return "Series(detail=" + this.f20798a + ")";
    }
}
