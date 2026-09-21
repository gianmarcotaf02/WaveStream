package O0;

public abstract class f0 implements p113n1.c {

    public boolean f7634h;

    public static final void a(f0 f0Var, g0 g0Var) {
        f0Var.getClass();
        if (g0Var instanceof Q0.Y) {
            ((Q0.Y) g0Var).I(f0Var.f7634h);
        }
    }

    public static void i(f0 f0Var, g0 g0Var, long j) {
        f0Var.getClass();
        a(f0Var, g0Var);
        g0Var.h0(p113n1.k.c(j, g0Var.f7642l), 0.0f, null);
    }

    public static void j(f0 f0Var, g0 g0Var, int i3, int i9) {
        long j = (((long) i3) << 32) | (((long) i9) & 4294967295L);
        if (f0Var.c() == p113n1.n.f25566h || f0Var.f() == 0) {
            a(f0Var, g0Var);
            g0Var.h0(p113n1.k.c(j, g0Var.f7642l), 0.0f, null);
        } else {
            int iF = (f0Var.f() - g0Var.f7639h) - ((int) (j >> 32));
            a(f0Var, g0Var);
            g0Var.h0(p113n1.k.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), g0Var.f7642l), 0.0f, null);
        }
    }

    public static void k(f0 f0Var, g0 g0Var, int i3, int i9) {
        int i10 = i0.f7649b;
        h0 h0Var = h0.f7643i;
        long j = (((long) i3) << 32) | (((long) i9) & 4294967295L);
        if (f0Var.c() == p113n1.n.f25566h || f0Var.f() == 0) {
            a(f0Var, g0Var);
            g0Var.h0(p113n1.k.c(j, g0Var.f7642l), 0.0f, h0Var);
        } else {
            int iF = (f0Var.f() - g0Var.f7639h) - ((int) (j >> 32));
            a(f0Var, g0Var);
            g0Var.h0(p113n1.k.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), g0Var.f7642l), 0.0f, h0Var);
        }
    }

    public static void n(f0 f0Var, g0 g0Var, int i3, int i9, p194x6.j jVar, int i10) {
        if ((i10 & 8) != 0) {
            int i11 = i0.f7649b;
            jVar = h0.f7643i;
        }
        f0Var.getClass();
        a(f0Var, g0Var);
        g0Var.h0(p113n1.k.c((((long) i9) & 4294967295L) | (((long) i3) << 32), g0Var.f7642l), 0.0f, jVar);
    }

    public static void o(f0 f0Var, g0 g0Var, long j) {
        int i3 = i0.f7649b;
        h0 h0Var = h0.f7643i;
        f0Var.getClass();
        a(f0Var, g0Var);
        g0Var.h0(p113n1.k.c(j, g0Var.f7642l), 0.0f, h0Var);
    }

    public float b(C0725n c0725n) {
        return Float.NaN;
    }

    public abstract p113n1.n c();

    public abstract int f();

    public final void g(g0 g0Var, int i3, int i9, float f9) {
        a(this, g0Var);
        g0Var.h0(p113n1.k.c((((long) i9) & 4294967295L) | (((long) i3) << 32), g0Var.f7642l), f9, null);
    }
}
