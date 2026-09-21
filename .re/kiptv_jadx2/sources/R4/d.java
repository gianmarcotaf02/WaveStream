package R4;

import java.util.List;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class d {

    public final List f9054a;

    public final Long f9055b;

    public final String f9056c;

    public final String f9057d;

    public final int f9058e;

    public final int f9059f;
    public final int g;

    public final int f9060h;

    public final int f9061i;
    public final int j;

    public d(List operations, Long l2, String str, String str2, int i3, int i9, int i10, int i11, int i12, int i13) {
        m.e(operations, "operations");
        this.f9054a = operations;
        this.f9055b = l2;
        this.f9056c = str;
        this.f9057d = str2;
        this.f9058e = i3;
        this.f9059f = i9;
        this.g = i10;
        this.f9060h = i11;
        this.f9061i = i12;
        this.j = i13;
    }

    public static d a(d dVar, List list, Long l2, String str, String str2, int i3, int i9, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            list = dVar.f9054a;
        }
        List operations = list;
        dVar.getClass();
        if ((i14 & 4) != 0) {
            l2 = dVar.f9055b;
        }
        Long l9 = l2;
        if ((i14 & 8) != 0) {
            str = dVar.f9056c;
        }
        String cacheStatus = str;
        if ((i14 & 16) != 0) {
            str2 = dVar.f9057d;
        }
        String str3 = str2;
        int i15 = (i14 & 32) != 0 ? dVar.f9058e : i3;
        int i16 = (i14 & 64) != 0 ? dVar.f9059f : i9;
        int i17 = (i14 & 128) != 0 ? dVar.g : i10;
        int i18 = (i14 & 256) != 0 ? dVar.f9060h : i11;
        int i19 = (i14 & 512) != 0 ? dVar.f9061i : i12;
        int i20 = (i14 & 1024) != 0 ? dVar.j : i13;
        dVar.getClass();
        m.e(operations, "operations");
        m.e(cacheStatus, "cacheStatus");
        return new d(operations, l9, cacheStatus, str3, i15, i16, i17, i18, i19, i20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f9054a, dVar.f9054a) && m.a(this.f9055b, dVar.f9055b) && this.f9056c.equals(dVar.f9056c) && this.f9057d.equals(dVar.f9057d) && this.f9058e == dVar.f9058e && this.f9059f == dVar.f9059f && this.g == dVar.g && this.f9060h == dVar.f9060h && this.f9061i == dVar.f9061i && this.j == dVar.j;
    }

    public final int hashCode() {
        int iF = p.f(this.f9054a.hashCode() * 31, 31, false);
        Long l2 = this.f9055b;
        return Integer.hashCode(this.j) + p.d(this.f9061i, p.d(this.f9060h, p.d(this.g, p.d(this.f9059f, p.d(this.f9058e, B2.a.a(B2.a.a((iF + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f9056c), 31, this.f9057d), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingDebugInfoState(operations=");
        sb.append(this.f9054a);
        sb.append(", isDebugEnabled=false, totalStartTime=");
        sb.append(this.f9055b);
        sb.append(", cacheStatus=");
        sb.append(this.f9056c);
        sb.append(", m3uClassification=");
        sb.append(this.f9057d);
        sb.append(", totalMovies=");
        sb.append(this.f9058e);
        sb.append(", totalSeries=");
        sb.append(this.f9059f);
        sb.append(", totalLiveChannels=");
        sb.append(this.g);
        sb.append(", totalCategories=");
        sb.append(this.f9060h);
        sb.append(", totalChannelsWithEPG=");
        sb.append(this.f9061i);
        sb.append(", totalMyListItems=");
        return Y6.f.k(sb, this.j, ")");
    }
}
