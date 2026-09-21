package com.kiptv.core.model;

public final class U {

    public final E0 f20564a;

    public final int f20565b;

    public final int f20566c;

    public final int f20567d;

    public final String f20568e;

    public final String f20569f;

    public U(E0 episode, int i3, int i9, int i10, String seriesName, String str) {
        kotlin.jvm.internal.m.e(episode, "episode");
        kotlin.jvm.internal.m.e(seriesName, "seriesName");
        this.f20564a = episode;
        this.f20565b = i3;
        this.f20566c = i9;
        this.f20567d = i10;
        this.f20568e = seriesName;
        this.f20569f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return kotlin.jvm.internal.m.a(this.f20564a, u6.f20564a) && this.f20565b == u6.f20565b && this.f20566c == u6.f20566c && this.f20567d == u6.f20567d && kotlin.jvm.internal.m.a(this.f20568e, u6.f20568e) && kotlin.jvm.internal.m.a(this.f20569f, u6.f20569f);
    }

    public final int hashCode() {
        int iA = B2.a.a(p121o0.p.d(this.f20567d, p121o0.p.d(this.f20566c, p121o0.p.d(this.f20565b, this.f20564a.hashCode() * 31, 31), 31), 31), 31, this.f20568e);
        String str = this.f20569f;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextEpisodeInfo(episode=");
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
