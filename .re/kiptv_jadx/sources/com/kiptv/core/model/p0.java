package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f20818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f20819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.o0 f20820f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20821h;

    public p0(int i3, java.lang.String str, java.lang.String str2, java.lang.Integer num, double d4, com.kiptv.core.model.o0 o0Var, java.lang.String str3, java.lang.String str4) {
        this.f20815a = i3;
        this.f20816b = str;
        this.f20817c = str2;
        this.f20818d = num;
        this.f20819e = d4;
        this.f20820f = o0Var;
        this.g = str3;
        this.f20821h = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.p0)) {
            return false;
        }
        com.kiptv.core.model.p0 p0Var = (com.kiptv.core.model.p0) obj;
        return this.f20815a == p0Var.f20815a && kotlin.jvm.internal.m.a(this.f20816b, p0Var.f20816b) && kotlin.jvm.internal.m.a(this.f20817c, p0Var.f20817c) && kotlin.jvm.internal.m.a(this.f20818d, p0Var.f20818d) && java.lang.Double.compare(this.f20819e, p0Var.f20819e) == 0 && this.f20820f == p0Var.f20820f && kotlin.jvm.internal.m.a(this.g, p0Var.g) && kotlin.jvm.internal.m.a(this.f20821h, p0Var.f20821h);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20815a) * 31, 31, this.f20816b);
        java.lang.String str = this.f20817c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f20818d;
        int iHashCode2 = (this.f20820f.hashCode() + ((java.lang.Double.hashCode(this.f20819e) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        java.lang.String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20821h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBMatchResult(tmdbId=");
        sb.append(this.f20815a);
        sb.append(", title=");
        sb.append(this.f20816b);
        sb.append(", originalTitle=");
        sb.append(this.f20817c);
        sb.append(", year=");
        sb.append(this.f20818d);
        sb.append(", confidence=");
        sb.append(this.f20819e);
        sb.append(", matchType=");
        sb.append(this.f20820f);
        sb.append(", posterPath=");
        sb.append(this.g);
        sb.append(", backdropPath=");
        return Y6.f.m(sb, this.f20821h, ")");
    }
}
