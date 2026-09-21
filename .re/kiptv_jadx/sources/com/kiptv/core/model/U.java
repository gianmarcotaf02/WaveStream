package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.E0 f20564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20569f;

    public U(com.kiptv.core.model.E0 episode, int i3, int i9, int i10, java.lang.String seriesName, java.lang.String str) {
        kotlin.jvm.internal.m.e(episode, "episode");
        kotlin.jvm.internal.m.e(seriesName, "seriesName");
        this.f20564a = episode;
        this.f20565b = i3;
        this.f20566c = i9;
        this.f20567d = i10;
        this.f20568e = seriesName;
        this.f20569f = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.U)) {
            return false;
        }
        com.kiptv.core.model.U u6 = (com.kiptv.core.model.U) obj;
        return kotlin.jvm.internal.m.a(this.f20564a, u6.f20564a) && this.f20565b == u6.f20565b && this.f20566c == u6.f20566c && this.f20567d == u6.f20567d && kotlin.jvm.internal.m.a(this.f20568e, u6.f20568e) && kotlin.jvm.internal.m.a(this.f20569f, u6.f20569f);
    }

    public final int hashCode() {
        int iA = B2.a.a(p121o0.p.d(this.f20567d, p121o0.p.d(this.f20566c, p121o0.p.d(this.f20565b, this.f20564a.hashCode() * 31, 31), 31), 31), 31, this.f20568e);
        java.lang.String str = this.f20569f;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NextEpisodeInfo(episode=");
        sb.append(this.f20564a);
        sb.append(", seasonNumber=");
        sb.append(this.f20565b);
        sb.append(", episodeNumber=");
        sb.append(this.f20566c);
        sb.append(", seriesId=");
        sb.append(this.f20567d);
        sb.append(", seriesName=");
        sb.append(this.f20568e);
        sb.append(", seriesPosterURL=");
        return Y6.f.m(sb, this.f20569f, ")");
    }
}
