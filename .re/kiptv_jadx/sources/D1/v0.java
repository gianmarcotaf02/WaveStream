package D1;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends D1.u0 {
    public v0(D1.E0 e6, android.view.WindowInsets windowInsets) {
        super(e6, windowInsets);
    }

    @Override // D1.z0
    public D1.E0 a() {
        return D1.E0.c(null, this.f2061c.consumeDisplayCutout());
    }

    @Override // D1.t0, D1.z0
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1.v0)) {
            return false;
        }
        D1.v0 v0Var = (D1.v0) obj;
        return java.util.Objects.equals(this.f2061c, v0Var.f2061c) && java.util.Objects.equals(this.g, v0Var.g) && D1.t0.C(this.f2065h, v0Var.f2065h);
    }

    @Override // D1.z0
    public D1.C0227l f() {
        android.view.DisplayCutout displayCutout = this.f2061c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new D1.C0227l(displayCutout);
    }

    @Override // D1.z0
    public int hashCode() {
        return this.f2061c.hashCode();
    }

    public v0(D1.E0 e6, D1.v0 v0Var) {
        super(e6, v0Var);
    }
}
