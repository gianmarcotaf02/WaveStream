package R4;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f9054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Long f9055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9059f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9061i;
    public final int j;

    public d(java.util.List operations, java.lang.Long l2, java.lang.String str, java.lang.String str2, int i3, int i9, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.m.e(operations, "operations");
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

    public static R4.d a(R4.d dVar, java.util.List list, java.lang.Long l2, java.lang.String str, java.lang.String str2, int i3, int i9, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            list = dVar.f9054a;
        }
        java.util.List operations = list;
        dVar.getClass();
        if ((i14 & 4) != 0) {
            l2 = dVar.f9055b;
        }
        java.lang.Long l9 = l2;
        if ((i14 & 8) != 0) {
            str = dVar.f9056c;
        }
        java.lang.String cacheStatus = str;
        if ((i14 & 16) != 0) {
            str2 = dVar.f9057d;
        }
        java.lang.String str3 = str2;
        int i15 = (i14 & 32) != 0 ? dVar.f9058e : i3;
        int i16 = (i14 & 64) != 0 ? dVar.f9059f : i9;
        int i17 = (i14 & 128) != 0 ? dVar.g : i10;
        int i18 = (i14 & 256) != 0 ? dVar.f9060h : i11;
        int i19 = (i14 & 512) != 0 ? dVar.f9061i : i12;
        int i20 = (i14 & 1024) != 0 ? dVar.j : i13;
        dVar.getClass();
        kotlin.jvm.internal.m.e(operations, "operations");
        kotlin.jvm.internal.m.e(cacheStatus, "cacheStatus");
        return new R4.d(operations, l9, cacheStatus, str3, i15, i16, i17, i18, i19, i20);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R4.d)) {
            return false;
        }
        R4.d dVar = (R4.d) obj;
        return kotlin.jvm.internal.m.a(this.f9054a, dVar.f9054a) && kotlin.jvm.internal.m.a(this.f9055b, dVar.f9055b) && this.f9056c.equals(dVar.f9056c) && this.f9057d.equals(dVar.f9057d) && this.f9058e == dVar.f9058e && this.f9059f == dVar.f9059f && this.g == dVar.g && this.f9060h == dVar.f9060h && this.f9061i == dVar.f9061i && this.j == dVar.j;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(this.f9054a.hashCode() * 31, 31, false);
        java.lang.Long l2 = this.f9055b;
        return java.lang.Integer.hashCode(this.j) + p121o0.p.d(this.f9061i, p121o0.p.d(this.f9060h, p121o0.p.d(this.g, p121o0.p.d(this.f9059f, p121o0.p.d(this.f9058e, B2.a.a(B2.a.a((iF + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f9056c), 31, this.f9057d), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingDebugInfoState(operations=");
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
