package g1;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.C1650g f21847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p011b1.L f21849c;

    public x(p011b1.C1650g c1650g, long j, p011b1.L l2) {
        this.f21847a = c1650g;
        this.f21848b = p011b1.D.c(c1650g.f17809i.length(), j);
        this.f21849c = l2 != null ? new p011b1.L(p011b1.D.c(c1650g.f17809i.length(), l2.f17784a)) : null;
    }

    public static g1.x a(g1.x xVar, p011b1.C1650g c1650g, long j, int i3) {
        if ((i3 & 1) != 0) {
            c1650g = xVar.f21847a;
        }
        if ((i3 & 2) != 0) {
            j = xVar.f21848b;
        }
        p011b1.L l2 = (i3 & 4) != 0 ? xVar.f21849c : null;
        xVar.getClass();
        return new g1.x(c1650g, j, l2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.x)) {
            return false;
        }
        g1.x xVar = (g1.x) obj;
        return p011b1.L.b(this.f21848b, xVar.f21848b) && kotlin.jvm.internal.m.a(this.f21849c, xVar.f21849c) && kotlin.jvm.internal.m.a(this.f21847a, xVar.f21847a);
    }

    public final int hashCode() {
        int iHashCode = this.f21847a.hashCode() * 31;
        int i3 = p011b1.L.f17783c;
        int iE = p121o0.p.e(iHashCode, 31, this.f21848b);
        p011b1.L l2 = this.f21849c;
        return iE + (l2 != null ? java.lang.Long.hashCode(l2.f17784a) : 0);
    }

    public final java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.f21847a) + "', selection=" + ((java.lang.Object) p011b1.L.h(this.f21848b)) + ", composition=" + this.f21849c + ')';
    }

    public x(java.lang.String str, long j, int i3) {
        this(new p011b1.C1650g((i3 & 1) != 0 ? "" : str), (i3 & 2) != 0 ? p011b1.L.f17782b : j, (p011b1.L) null);
    }
}
