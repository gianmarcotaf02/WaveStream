package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.z0 f20832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f20835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f20836f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20838i;

    public s0(java.lang.String contentId, com.kiptv.core.model.z0 z0Var, java.lang.String contentTitle, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str2, long j) {
        kotlin.jvm.internal.m.e(contentId, "contentId");
        kotlin.jvm.internal.m.e(contentTitle, "contentTitle");
        this.f20831a = contentId;
        this.f20832b = z0Var;
        this.f20833c = contentTitle;
        this.f20834d = str;
        this.f20835e = num;
        this.f20836f = num2;
        this.g = num3;
        this.f20837h = str2;
        this.f20838i = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.s0)) {
            return false;
        }
        com.kiptv.core.model.s0 s0Var = (com.kiptv.core.model.s0) obj;
        return kotlin.jvm.internal.m.a(this.f20831a, s0Var.f20831a) && this.f20832b == s0Var.f20832b && kotlin.jvm.internal.m.a(this.f20833c, s0Var.f20833c) && kotlin.jvm.internal.m.a(this.f20834d, s0Var.f20834d) && kotlin.jvm.internal.m.a(this.f20835e, s0Var.f20835e) && kotlin.jvm.internal.m.a(this.f20836f, s0Var.f20836f) && kotlin.jvm.internal.m.a(this.g, s0Var.g) && kotlin.jvm.internal.m.a(this.f20837h, s0Var.f20837h) && this.f20838i == s0Var.f20838i;
    }

    public final int hashCode() {
        int iA = B2.a.a((this.f20832b.hashCode() + (this.f20831a.hashCode() * 31)) * 31, 31, this.f20833c);
        java.lang.String str = this.f20834d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f20835e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f20836f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.g;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str2 = this.f20837h;
        return java.lang.Long.hashCode(this.f20838i) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktImportRow(contentId=");
        sb.append(this.f20831a);
        sb.append(", contentType=");
        sb.append(this.f20832b);
        sb.append(", contentTitle=");
        sb.append(this.f20833c);
        sb.append(", seriesId=");
        sb.append(this.f20834d);
        sb.append(", seasonNumber=");
        sb.append(this.f20835e);
        sb.append(", episodeNumber=");
        sb.append(this.f20836f);
        sb.append(", tmdbId=");
        sb.append(this.g);
        sb.append(", posterUrl=");
        sb.append(this.f20837h);
        sb.append(", watchedAtMs=");
        return Y6.f.g(this.f20838i, ")", sb);
    }
}
