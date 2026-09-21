package com.kiptv.core.model;

public final class p0 {

    public final int f20815a;

    public final String f20816b;

    public final String f20817c;

    public final Integer f20818d;

    public final double f20819e;

    public final o0 f20820f;
    public final String g;

    public final String f20821h;

    public p0(int i3, String str, String str2, Integer num, double d4, o0 o0Var, String str3, String str4) {
        this.f20815a = i3;
        this.f20816b = str;
        this.f20817c = str2;
        this.f20818d = num;
        this.f20819e = d4;
        this.f20820f = o0Var;
        this.g = str3;
        this.f20821h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f20815a == p0Var.f20815a && kotlin.jvm.internal.m.a(this.f20816b, p0Var.f20816b) && kotlin.jvm.internal.m.a(this.f20817c, p0Var.f20817c) && kotlin.jvm.internal.m.a(this.f20818d, p0Var.f20818d) && Double.compare(this.f20819e, p0Var.f20819e) == 0 && this.f20820f == p0Var.f20820f && kotlin.jvm.internal.m.a(this.g, p0Var.g) && kotlin.jvm.internal.m.a(this.f20821h, p0Var.f20821h);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20815a) * 31, 31, this.f20816b);
        String str = this.f20817c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20818d;
        int iHashCode2 = (this.f20820f.hashCode() + ((Double.hashCode(this.f20819e) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20821h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBMatchResult(tmdbId=");
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
