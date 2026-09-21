package S7;

public final class m0 extends k0 {

    public final p0 f9598l;

    public final n0 f9599m;

    public final C0899o f9600n;

    public final Object f9601o;

    public m0(p0 p0Var, n0 n0Var, C0899o c0899o, Object obj) {
        this.f9598l = p0Var;
        this.f9599m = n0Var;
        this.f9600n = c0899o;
        this.f9601o = obj;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(Throwable th) {
        C0899o c0899o = this.f9600n;
        p0 p0Var = this.f9598l;
        p0Var.getClass();
        C0899o c0899oM = p0.M(c0899o);
        n0 n0Var = this.f9599m;
        Object obj = this.f9601o;
        if (c0899oM == null || !p0Var.Y(n0Var, c0899oM, obj)) {
            n0Var.f9604h.c(new X7.h(2), 2);
            C0899o c0899oM2 = p0.M(c0899o);
            if (c0899oM2 == null || !p0Var.Y(n0Var, c0899oM2, obj)) {
                p0Var.f(p0Var.x(n0Var, obj));
            }
        }
    }
}
