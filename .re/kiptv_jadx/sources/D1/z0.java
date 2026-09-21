package D1;

/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D1.E0 f2079b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1.E0 f2080a;

    static {
        D1.s0 p0Var;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            p0Var = new D1.r0();
        } else if (i3 >= 30) {
            p0Var = new D1.q0();
        } else {
            p0Var = i3 >= 29 ? new D1.p0() : new D1.n0();
        }
        f2079b = p0Var.b().f1967a.a().f1967a.b().f1967a.c();
    }

    public z0(D1.E0 e6) {
        this.f2080a = e6;
    }

    public D1.E0 a() {
        return this.f2080a;
    }

    public D1.E0 b() {
        return this.f2080a;
    }

    public D1.E0 c() {
        return this.f2080a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1.z0)) {
            return false;
        }
        D1.z0 z0Var = (D1.z0) obj;
        return p() == z0Var.p() && o() == z0Var.o() && java.util.Objects.equals(l(), z0Var.l()) && java.util.Objects.equals(j(), z0Var.j()) && java.util.Objects.equals(f(), z0Var.f());
    }

    public D1.C0227l f() {
        return null;
    }

    public p182w1.b g(int i3) {
        return p182w1.b.f29759e;
    }

    public p182w1.b h(int i3) {
        if ((i3 & 8) == 0) {
            return p182w1.b.f29759e;
        }
        throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(p()), java.lang.Boolean.valueOf(o()), l(), j(), f());
    }

    public p182w1.b i() {
        return l();
    }

    public p182w1.b j() {
        return p182w1.b.f29759e;
    }

    public p182w1.b k() {
        return l();
    }

    public p182w1.b l() {
        return p182w1.b.f29759e;
    }

    public p182w1.b m() {
        return l();
    }

    public D1.E0 n(int i3, int i9, int i10, int i11) {
        return f2079b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i3) {
        return true;
    }

    public void d(android.view.View view) {
    }

    public void e(D1.E0 e6) {
    }

    public void r(p182w1.b[] bVarArr) {
    }

    public void s(p182w1.b bVar) {
    }

    public void t(D1.E0 e6) {
    }

    public void u(p182w1.b bVar) {
    }

    public void v(int i3) {
    }
}
