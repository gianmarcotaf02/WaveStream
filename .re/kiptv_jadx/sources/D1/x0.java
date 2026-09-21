package D1;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends D1.w0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final D1.E0 f2074r = D1.E0.c(null, android.view.WindowInsets.CONSUMED);

    public x0(D1.E0 e6, android.view.WindowInsets windowInsets) {
        super(e6, windowInsets);
    }

    @Override // D1.t0, D1.z0
    public p182w1.b g(int i3) {
        return p182w1.b.c(this.f2061c.getInsets(D1.B0.a(i3)));
    }

    @Override // D1.t0, D1.z0
    public p182w1.b h(int i3) {
        return p182w1.b.c(this.f2061c.getInsetsIgnoringVisibility(D1.B0.a(i3)));
    }

    @Override // D1.t0, D1.z0
    public boolean q(int i3) {
        return this.f2061c.isVisible(D1.B0.a(i3));
    }

    public x0(D1.E0 e6, D1.x0 x0Var) {
        super(e6, x0Var);
    }

    @Override // D1.t0, D1.z0
    public final void d(android.view.View view) {
    }
}
