package D1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

public class z0 {

    public static final E0 f2079b;

    public final E0 f2080a;

    static {
        s0 p0Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            p0Var = new r0();
        } else if (i3 >= 30) {
            p0Var = new q0();
        } else {
            p0Var = i3 >= 29 ? new p0() : new n0();
        }
        f2079b = p0Var.b().f1967a.a().f1967a.b().f1967a.c();
    }

    public z0(E0 e6) {
        this.f2080a = e6;
    }

    public E0 a() {
        return this.f2080a;
    }

    public E0 b() {
        return this.f2080a;
    }

    public E0 c() {
        return this.f2080a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return p() == z0Var.p() && o() == z0Var.o() && Objects.equals(l(), z0Var.l()) && Objects.equals(j(), z0Var.j()) && Objects.equals(f(), z0Var.f());
    }

    public C0227l f() {
        return null;
    }

    public p182w1.b g(int i3) {
        return p182w1.b.f29759e;
    }

    public p182w1.b h(int i3) {
        if ((i3 & 8) == 0) {
            return p182w1.b.f29759e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
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

    public E0 n(int i3, int i9, int i10, int i11) {
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

    public void d(View view) {
    }

    public void e(E0 e6) {
    }

    public void r(p182w1.b[] bVarArr) {
    }

    public void s(p182w1.b bVar) {
    }

    public void t(E0 e6) {
    }

    public void u(p182w1.b bVar) {
    }

    public void v(int i3) {
    }
}
