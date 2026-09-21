package D1;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends D1.t0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p182w1.b f2068n;

    public u0(D1.E0 e6, android.view.WindowInsets windowInsets) {
        super(e6, windowInsets);
        this.f2068n = null;
    }

    @Override // D1.z0
    public D1.E0 b() {
        return D1.E0.c(null, this.f2061c.consumeStableInsets());
    }

    @Override // D1.z0
    public D1.E0 c() {
        return D1.E0.c(null, this.f2061c.consumeSystemWindowInsets());
    }

    @Override // D1.z0
    public final p182w1.b j() {
        if (this.f2068n == null) {
            android.view.WindowInsets windowInsets = this.f2061c;
            this.f2068n = p182w1.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2068n;
    }

    @Override // D1.z0
    public boolean o() {
        return this.f2061c.isConsumed();
    }

    @Override // D1.z0
    public void u(p182w1.b bVar) {
        this.f2068n = bVar;
    }

    public u0(D1.E0 e6, D1.u0 u0Var) {
        super(e6, u0Var);
        this.f2068n = null;
        this.f2068n = u0Var.f2068n;
    }
}
