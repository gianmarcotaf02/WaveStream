package D1;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends D1.x0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D1.E0 f2077s = D1.E0.c(null, android.view.WindowInsets.CONSUMED);

    public y0(D1.E0 e6, android.view.WindowInsets windowInsets) {
        super(e6, windowInsets);
    }

    @Override // D1.x0, D1.t0, D1.z0
    public p182w1.b g(int i3) {
        return p182w1.b.c(this.f2061c.getInsets(D1.D0.a(i3)));
    }

    @Override // D1.x0, D1.t0, D1.z0
    public p182w1.b h(int i3) {
        return p182w1.b.c(this.f2061c.getInsetsIgnoringVisibility(D1.D0.a(i3)));
    }

    @Override // D1.x0, D1.t0, D1.z0
    public boolean q(int i3) {
        return this.f2061c.isVisible(D1.D0.a(i3));
    }

    public y0(D1.E0 e6, D1.y0 y0Var) {
        super(e6, y0Var);
    }
}
