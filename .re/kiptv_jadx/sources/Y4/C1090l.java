package Y4;

/* JADX INFO: renamed from: Y4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1090l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f11972e;

    public C1090l(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f11968a = i3;
        this.f11969b = i9;
        this.f11970c = str;
        this.f11971d = str2;
        this.f11972e = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.C1090l)) {
            return false;
        }
        Y4.C1090l c1090l = (Y4.C1090l) obj;
        return this.f11968a == c1090l.f11968a && this.f11969b == c1090l.f11969b && kotlin.jvm.internal.m.a(this.f11970c, c1090l.f11970c) && kotlin.jvm.internal.m.a(this.f11971d, c1090l.f11971d) && kotlin.jvm.internal.m.a(this.f11972e, c1090l.f11972e);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(p121o0.p.d(this.f11969b, java.lang.Integer.hashCode(this.f11968a) * 31, 31), 31, this.f11970c), 31, this.f11971d);
        java.lang.String str = this.f11972e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EpisodeEntry(season=");
        sb.append(this.f11968a);
        sb.append(", episode=");
        sb.append(this.f11969b);
        sb.append(", title=");
        sb.append(this.f11970c);
        sb.append(", url=");
        sb.append(this.f11971d);
        sb.append(", ext=");
        return Y6.f.m(sb, this.f11972e, ")");
    }
}
