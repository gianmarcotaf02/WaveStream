package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.z0 f20864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f20867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f20868f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20870i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f20871k;

    public x0(java.lang.String contentId, com.kiptv.core.model.z0 z0Var, java.lang.String contentTitle, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str2, int i3, int i9, long j) {
        kotlin.jvm.internal.m.e(contentId, "contentId");
        kotlin.jvm.internal.m.e(contentTitle, "contentTitle");
        this.f20863a = contentId;
        this.f20864b = z0Var;
        this.f20865c = contentTitle;
        this.f20866d = str;
        this.f20867e = num;
        this.f20868f = num2;
        this.g = num3;
        this.f20869h = str2;
        this.f20870i = i3;
        this.j = i9;
        this.f20871k = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.x0)) {
            return false;
        }
        com.kiptv.core.model.x0 x0Var = (com.kiptv.core.model.x0) obj;
        return kotlin.jvm.internal.m.a(this.f20863a, x0Var.f20863a) && this.f20864b == x0Var.f20864b && kotlin.jvm.internal.m.a(this.f20865c, x0Var.f20865c) && kotlin.jvm.internal.m.a(this.f20866d, x0Var.f20866d) && kotlin.jvm.internal.m.a(this.f20867e, x0Var.f20867e) && kotlin.jvm.internal.m.a(this.f20868f, x0Var.f20868f) && kotlin.jvm.internal.m.a(this.g, x0Var.g) && kotlin.jvm.internal.m.a(this.f20869h, x0Var.f20869h) && this.f20870i == x0Var.f20870i && this.j == x0Var.j && this.f20871k == x0Var.f20871k;
    }

    public final int hashCode() {
        int iA = B2.a.a((this.f20864b.hashCode() + (this.f20863a.hashCode() * 31)) * 31, 31, this.f20865c);
        java.lang.String str = this.f20866d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f20867e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f20868f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.g;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str2 = this.f20869h;
        return java.lang.Long.hashCode(this.f20871k) + p121o0.p.d(this.j, p121o0.p.d(this.f20870i, (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktPlaybackRow(contentId=");
        sb.append(this.f20863a);
        sb.append(", contentType=");
        sb.append(this.f20864b);
        sb.append(", contentTitle=");
        sb.append(this.f20865c);
        sb.append(", seriesId=");
        sb.append(this.f20866d);
        sb.append(", seasonNumber=");
        sb.append(this.f20867e);
        sb.append(", episodeNumber=");
        sb.append(this.f20868f);
        sb.append(", tmdbId=");
        sb.append(this.g);
        sb.append(", posterUrl=");
        sb.append(this.f20869h);
        sb.append(", progressSeconds=");
        sb.append(this.f20870i);
        sb.append(", totalDuration=");
        sb.append(this.j);
        sb.append(", pausedAtMs=");
        return Y6.f.g(this.f20871k, ")", sb);
    }
}
