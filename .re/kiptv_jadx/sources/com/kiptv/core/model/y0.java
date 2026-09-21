package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.t0 f20872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f20875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20877f;
    public final java.lang.String g;

    public y0(com.kiptv.core.model.t0 t0Var, int i3, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f20872a = t0Var;
        this.f20873b = i3;
        this.f20874c = str;
        this.f20875d = num;
        this.f20876e = str2;
        this.f20877f = str3;
        this.g = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.y0)) {
            return false;
        }
        com.kiptv.core.model.y0 y0Var = (com.kiptv.core.model.y0) obj;
        return this.f20872a == y0Var.f20872a && this.f20873b == y0Var.f20873b && kotlin.jvm.internal.m.a(this.f20874c, y0Var.f20874c) && kotlin.jvm.internal.m.a(this.f20875d, y0Var.f20875d) && kotlin.jvm.internal.m.a(this.f20876e, y0Var.f20876e) && kotlin.jvm.internal.m.a(this.f20877f, y0Var.f20877f) && kotlin.jvm.internal.m.a(this.g, y0Var.g);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f20873b, this.f20872a.hashCode() * 31, 31);
        java.lang.String str = this.f20874c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f20875d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        java.lang.String str2 = this.f20876e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20877f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktWatchlistEntry(kind=");
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
