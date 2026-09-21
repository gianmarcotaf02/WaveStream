package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends S7.k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S7.p0 f9598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S7.n0 f9599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S7.C0899o f9600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f9601o;

    public m0(S7.p0 p0Var, S7.n0 n0Var, S7.C0899o c0899o, java.lang.Object obj) {
        this.f9598l = p0Var;
        this.f9599m = n0Var;
        this.f9600n = c0899o;
        this.f9601o = obj;
    }

    @Override // S7.k0
    public final boolean i() {
        return false;
    }

    @Override // S7.k0
    public final void j(java.lang.Throwable th) {
        S7.C0899o c0899o = this.f9600n;
        S7.p0 p0Var = this.f9598l;
        p0Var.getClass();
        S7.C0899o c0899oM = S7.p0.M(c0899o);
        S7.n0 n0Var = this.f9599m;
        java.lang.Object obj = this.f9601o;
        if (c0899oM == null || !p0Var.Y(n0Var, c0899oM, obj)) {
            n0Var.f9604h.c(new X7.h(2), 2);
            S7.C0899o c0899oM2 = S7.p0.M(c0899o);
            if (c0899oM2 == null || !p0Var.Y(n0Var, c0899oM2, obj)) {
                p0Var.f(p0Var.x(n0Var, obj));
            }
        }
    }
}
