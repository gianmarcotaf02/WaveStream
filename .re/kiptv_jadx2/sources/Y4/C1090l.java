package Y4;

public final class C1090l {

    public final int f11968a;

    public final int f11969b;

    public final String f11970c;

    public final String f11971d;

    public final String f11972e;

    public C1090l(int i3, int i9, String str, String str2, String str3) {
        this.f11968a = i3;
        this.f11969b = i9;
        this.f11970c = str;
        this.f11971d = str2;
        this.f11972e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1090l)) {
            return false;
        }
        C1090l c1090l = (C1090l) obj;
        return this.f11968a == c1090l.f11968a && this.f11969b == c1090l.f11969b && kotlin.jvm.internal.m.a(this.f11970c, c1090l.f11970c) && kotlin.jvm.internal.m.a(this.f11971d, c1090l.f11971d) && kotlin.jvm.internal.m.a(this.f11972e, c1090l.f11972e);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(p121o0.p.d(this.f11969b, Integer.hashCode(this.f11968a) * 31, 31), 31, this.f11970c), 31, this.f11971d);
        String str = this.f11972e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeEntry(season=");
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
