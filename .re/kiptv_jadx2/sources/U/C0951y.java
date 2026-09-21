package U;

public final class C0951y {

    public final C0950x f10095a;

    public final C0950x f10096b;

    public final boolean f10097c;

    public C0951y(C0950x c0950x, C0950x c0950x2, boolean z6) {
        this.f10095a = c0950x;
        this.f10096b = c0950x2;
        this.f10097c = z6;
    }

    public static C0951y a(C0951y c0951y, C0950x c0950x, C0950x c0950x2, boolean z6, int i3) {
        if ((i3 & 1) != 0) {
            c0950x = c0951y.f10095a;
        }
        if ((i3 & 2) != 0) {
            c0950x2 = c0951y.f10096b;
        }
        c0951y.getClass();
        return new C0951y(c0950x, c0950x2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951y)) {
            return false;
        }
        C0951y c0951y = (C0951y) obj;
        return kotlin.jvm.internal.m.a(this.f10095a, c0951y.f10095a) && kotlin.jvm.internal.m.a(this.f10096b, c0951y.f10096b) && this.f10097c == c0951y.f10097c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10097c) + ((this.f10096b.hashCode() + (this.f10095a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f10095a);
        sb.append(", end=");
        sb.append(this.f10096b);
        sb.append(", handlesCrossed=");
        return v5.L.a(sb, this.f10097c, ')');
    }
}
