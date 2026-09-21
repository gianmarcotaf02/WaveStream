package D1;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends D1.v0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p182w1.b f2070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p182w1.b f2071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p182w1.b f2072q;

    public w0(D1.E0 e6, android.view.WindowInsets windowInsets) {
        super(e6, windowInsets);
        this.f2070o = null;
        this.f2071p = null;
        this.f2072q = null;
    }

    @Override // D1.z0
    public p182w1.b i() {
        if (this.f2071p == null) {
            this.f2071p = p182w1.b.c(this.f2061c.getMandatorySystemGestureInsets());
        }
        return this.f2071p;
    }

    @Override // D1.z0
    public p182w1.b k() {
        if (this.f2070o == null) {
            this.f2070o = p182w1.b.c(this.f2061c.getSystemGestureInsets());
        }
        return this.f2070o;
    }

    @Override // D1.z0
    public p182w1.b m() {
        if (this.f2072q == null) {
            this.f2072q = p182w1.b.c(this.f2061c.getTappableElementInsets());
        }
        return this.f2072q;
    }

    @Override // D1.t0, D1.z0
    public D1.E0 n(int i3, int i9, int i10, int i11) {
        return D1.E0.c(null, this.f2061c.inset(i3, i9, i10, i11));
    }

    public w0(D1.E0 e6, D1.w0 w0Var) {
        super(e6, w0Var);
        this.f2070o = null;
        this.f2071p = null;
        this.f2072q = null;
    }

    @Override // D1.u0, D1.z0
    public void u(p182w1.b bVar) {
    }
}
