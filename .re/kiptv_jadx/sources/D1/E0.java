package D1;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D1.E0 f1966b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1.z0 f1967a;

    static {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f1966b = D1.y0.f2077s;
        } else if (i3 >= 30) {
            f1966b = D1.x0.f2074r;
        } else {
            f1966b = D1.z0.f2079b;
        }
    }

    public E0(android.view.WindowInsets windowInsets) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            this.f1967a = new D1.y0(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f1967a = new D1.x0(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f1967a = new D1.w0(this, windowInsets);
        } else if (i3 >= 28) {
            this.f1967a = new D1.v0(this, windowInsets);
        } else {
            this.f1967a = new D1.u0(this, windowInsets);
        }
    }

    public static p182w1.b a(p182w1.b bVar, int i3, int i9, int i10, int i11) {
        int iMax = java.lang.Math.max(0, bVar.f29760a - i3);
        int iMax2 = java.lang.Math.max(0, bVar.f29761b - i9);
        int iMax3 = java.lang.Math.max(0, bVar.f29762c - i10);
        int iMax4 = java.lang.Math.max(0, bVar.f29763d - i11);
        return (iMax == i3 && iMax2 == i9 && iMax3 == i10 && iMax4 == i11) ? bVar : p182w1.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static D1.E0 c(android.view.View view, android.view.WindowInsets windowInsets) {
        windowInsets.getClass();
        D1.E0 e6 = new D1.E0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            java.util.WeakHashMap weakHashMap = D1.U.f1980a;
            D1.E0 e0A = D1.M.a(view);
            D1.z0 z0Var = e6.f1967a;
            z0Var.t(e0A);
            z0Var.d(view.getRootView());
            z0Var.v(view.getWindowSystemUiVisibility());
        }
        return e6;
    }

    public final android.view.WindowInsets b() {
        D1.z0 z0Var = this.f1967a;
        if (z0Var instanceof D1.t0) {
            return ((D1.t0) z0Var).f2061c;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1.E0)) {
            return false;
        }
        return java.util.Objects.equals(this.f1967a, ((D1.E0) obj).f1967a);
    }

    public final int hashCode() {
        D1.z0 z0Var = this.f1967a;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.hashCode();
    }

    public E0(D1.E0 e6) {
        if (e6 != null) {
            D1.z0 z0Var = e6.f1967a;
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 >= 34 && (z0Var instanceof D1.y0)) {
                this.f1967a = new D1.y0(this, (D1.y0) z0Var);
            } else if (i3 >= 30 && (z0Var instanceof D1.x0)) {
                this.f1967a = new D1.x0(this, (D1.x0) z0Var);
            } else if (i3 >= 29 && (z0Var instanceof D1.w0)) {
                this.f1967a = new D1.w0(this, (D1.w0) z0Var);
            } else if (i3 >= 28 && (z0Var instanceof D1.v0)) {
                this.f1967a = new D1.v0(this, (D1.v0) z0Var);
            } else if (z0Var instanceof D1.u0) {
                this.f1967a = new D1.u0(this, (D1.u0) z0Var);
            } else if (z0Var instanceof D1.t0) {
                this.f1967a = new D1.t0(this, (D1.t0) z0Var);
            } else {
                this.f1967a = new D1.z0(this);
            }
            z0Var.e(this);
            return;
        }
        this.f1967a = new D1.z0(this);
    }
}
