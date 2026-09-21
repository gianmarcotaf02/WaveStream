package U;

/* JADX INFO: renamed from: U.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0951y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U.C0950x f10095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U.C0950x f10096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10097c;

    public C0951y(U.C0950x c0950x, U.C0950x c0950x2, boolean z6) {
        this.f10095a = c0950x;
        this.f10096b = c0950x2;
        this.f10097c = z6;
    }

    public static U.C0951y a(U.C0951y c0951y, U.C0950x c0950x, U.C0950x c0950x2, boolean z6, int i3) {
        if ((i3 & 1) != 0) {
            c0950x = c0951y.f10095a;
        }
        if ((i3 & 2) != 0) {
            c0950x2 = c0951y.f10096b;
        }
        c0951y.getClass();
        return new U.C0951y(c0950x, c0950x2, z6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U.C0951y)) {
            return false;
        }
        U.C0951y c0951y = (U.C0951y) obj;
        return kotlin.jvm.internal.m.a(this.f10095a, c0951y.f10095a) && kotlin.jvm.internal.m.a(this.f10096b, c0951y.f10096b) && this.f10097c == c0951y.f10097c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f10097c) + ((this.f10096b.hashCode() + (this.f10095a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Selection(start=");
        sb.append(this.f10095a);
        sb.append(", end=");
        sb.append(this.f10096b);
        sb.append(", handlesCrossed=");
        return v5.L.a(sb, this.f10097c, ')');
    }
}
