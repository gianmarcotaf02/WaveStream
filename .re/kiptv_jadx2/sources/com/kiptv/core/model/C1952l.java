package com.kiptv.core.model;

public final class C1952l extends AbstractC1954n {

    public final TMDBMovieDetail f20793a;

    public C1952l(TMDBMovieDetail detail) {
        kotlin.jvm.internal.m.e(detail, "detail");
        this.f20793a = detail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1952l) && kotlin.jvm.internal.m.a(this.f20793a, ((C1952l) obj).f20793a);
    }

    public final int hashCode() {
        return this.f20793a.hashCode();
    }

    public final String toString() {
        return "Movie(detail=" + this.f20793a + ")";
    }
}
