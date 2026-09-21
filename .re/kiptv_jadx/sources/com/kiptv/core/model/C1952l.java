package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1952l extends com.kiptv.core.model.AbstractC1954n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBMovieDetail f20793a;

    public C1952l(com.kiptv.core.model.TMDBMovieDetail detail) {
        kotlin.jvm.internal.m.e(detail, "detail");
        this.f20793a = detail;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.C1952l) && kotlin.jvm.internal.m.a(this.f20793a, ((com.kiptv.core.model.C1952l) obj).f20793a);
    }

    public final int hashCode() {
        return this.f20793a.hashCode();
    }

    public final java.lang.String toString() {
        return "Movie(detail=" + this.f20793a + ")";
    }
}
