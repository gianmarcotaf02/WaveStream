package com.kiptv.core.model;

public final class y0 {

    public final t0 f20872a;

    public final int f20873b;

    public final String f20874c;

    public final Integer f20875d;

    public final String f20876e;

    public final String f20877f;
    public final String g;

    public y0(t0 t0Var, int i3, String str, Integer num, String str2, String str3, String str4) {
        this.f20872a = t0Var;
        this.f20873b = i3;
        this.f20874c = str;
        this.f20875d = num;
        this.f20876e = str2;
        this.f20877f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f20872a == y0Var.f20872a && this.f20873b == y0Var.f20873b && kotlin.jvm.internal.m.a(this.f20874c, y0Var.f20874c) && kotlin.jvm.internal.m.a(this.f20875d, y0Var.f20875d) && kotlin.jvm.internal.m.a(this.f20876e, y0Var.f20876e) && kotlin.jvm.internal.m.a(this.f20877f, y0Var.f20877f) && kotlin.jvm.internal.m.a(this.g, y0Var.g);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f20873b, this.f20872a.hashCode() * 31, 31);
        String str = this.f20874c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20875d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        String str2 = this.f20876e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20877f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktWatchlistEntry(kind=");
        sb.append(this.f20872a);
        sb.append(", tmdbId=");
        sb.append(this.f20873b);
        sb.append(", title=");
        sb.append(this.f20874c);
        sb.append(", year=");
        sb.append(this.f20875d);
        sb.append(", posterUrl=null, matchedContentId=");
        sb.append(this.f20876e);
        sb.append(", matchedTitle=");
        sb.append(this.f20877f);
        sb.append(", matchedPosterUrl=");
        return Y6.f.m(sb, this.g, ")");
    }
}
