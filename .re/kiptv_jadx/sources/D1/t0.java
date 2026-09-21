package D1;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends D1.z0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f2057i = false;
    public static java.lang.reflect.Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static java.lang.Class f2058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static java.lang.reflect.Field f2059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static java.lang.reflect.Field f2060m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets f2061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p182w1.b[] f2062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p182w1.b f2063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D1.E0 f2064f;
    public p182w1.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2065h;

    public t0(D1.E0 e6, android.view.WindowInsets windowInsets) {
        super(e6);
        this.f2063e = null;
        this.f2061c = windowInsets;
    }

    private static void B() {
        try {
            j = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            f2058k = cls;
            f2059l = cls.getDeclaredField("mVisibleInsets");
            f2060m = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2059l.setAccessible(true);
            f2060m.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e6) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f2057i = true;
    }

    public static boolean C(int i3, int i9) {
        return (i3 & 6) == (i9 & 6);
    }

    private p182w1.b w(int i3, boolean z6) {
        p182w1.b bVarA = p182w1.b.f29759e;
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i3 & i9) != 0) {
                bVarA = p182w1.b.a(bVarA, x(i9, z6));
            }
        }
        return bVarA;
    }

    private p182w1.b y() {
        D1.E0 e6 = this.f2064f;
        return e6 != null ? e6.f1967a.j() : p182w1.b.f29759e;
    }

    private p182w1.b z(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2057i) {
            B();
        }
        java.lang.reflect.Method method = j;
        if (method != null && f2058k != null && f2059l != null) {
            try {
                java.lang.Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) f2059l.get(f2060m.get(objInvoke));
                if (rect != null) {
                    return p182w1.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (java.lang.ReflectiveOperationException e6) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    public boolean A(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !x(i3, false).equals(p182w1.b.f29759e);
    }

    @Override // D1.z0
    public void d(android.view.View view) {
        p182w1.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = p182w1.b.f29759e;
        }
        s(bVarZ);
    }

    @Override // D1.z0
    public void e(D1.E0 e6) {
        e6.f1967a.t(this.f2064f);
        p182w1.b bVar = this.g;
        D1.z0 z0Var = e6.f1967a;
        z0Var.s(bVar);
        z0Var.v(this.f2065h);
    }

    @Override // D1.z0
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        D1.t0 t0Var = (D1.t0) obj;
        return java.util.Objects.equals(this.g, t0Var.g) && C(this.f2065h, t0Var.f2065h);
    }

    @Override // D1.z0
    public p182w1.b g(int i3) {
        return w(i3, false);
    }

    @Override // D1.z0
    public p182w1.b h(int i3) {
        return w(i3, true);
    }

    @Override // D1.z0
    public final p182w1.b l() {
        if (this.f2063e == null) {
            android.view.WindowInsets windowInsets = this.f2061c;
            this.f2063e = p182w1.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2063e;
    }

    @Override // D1.z0
    public D1.E0 n(int i3, int i9, int i10, int i11) {
        D1.s0 p0Var;
        D1.E0 e0C = D1.E0.c(null, this.f2061c);
        int i12 = android.os.Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            p0Var = new D1.r0(e0C);
        } else if (i12 >= 30) {
            p0Var = new D1.q0(e0C);
        } else {
            p0Var = i12 >= 29 ? new D1.p0(e0C) : new D1.n0(e0C);
        }
        p0Var.g(D1.E0.a(l(), i3, i9, i10, i11));
        p0Var.e(D1.E0.a(j(), i3, i9, i10, i11));
        return p0Var.b();
    }

    @Override // D1.z0
    public boolean p() {
        return this.f2061c.isRound();
    }

    @Override // D1.z0
    public boolean q(int i3) {
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i3 & i9) != 0 && !A(i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // D1.z0
    public void r(p182w1.b[] bVarArr) {
        this.f2062d = bVarArr;
    }

    @Override // D1.z0
    public void s(p182w1.b bVar) {
        this.g = bVar;
    }

    @Override // D1.z0
    public void t(D1.E0 e6) {
        this.f2064f = e6;
    }

    @Override // D1.z0
    public void v(int i3) {
        this.f2065h = i3;
    }

    public p182w1.b x(int i3, boolean z6) {
        p182w1.b bVarJ;
        int i9;
        p182w1.b bVar = p182w1.b.f29759e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    p182w1.b[] bVarArr = this.f2062d;
                    bVarJ = bVarArr != null ? bVarArr[E8.l.B(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    p182w1.b bVarL = l();
                    p182w1.b bVarY = y();
                    int i10 = bVarL.f29763d;
                    if (i10 > bVarY.f29763d) {
                        return p182w1.b.b(0, 0, 0, i10);
                    }
                    p182w1.b bVar2 = this.g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i9 = this.g.f29763d) > bVarY.f29763d) {
                        return p182w1.b.b(0, 0, 0, i9);
                    }
                } else {
                    if (i3 == 16) {
                        return k();
                    }
                    if (i3 == 32) {
                        return i();
                    }
                    if (i3 == 64) {
                        return m();
                    }
                    if (i3 == 128) {
                        D1.E0 e6 = this.f2064f;
                        D1.C0227l c0227lF = e6 != null ? e6.f1967a.f() : f();
                        if (c0227lF != null) {
                            int i11 = android.os.Build.VERSION.SDK_INT;
                            return p182w1.b.b(i11 >= 28 ? D1.AbstractC0225j.k(c0227lF.f2036a) : 0, i11 >= 28 ? D1.AbstractC0225j.m(c0227lF.f2036a) : 0, i11 >= 28 ? D1.AbstractC0225j.l(c0227lF.f2036a) : 0, i11 >= 28 ? D1.AbstractC0225j.j(c0227lF.f2036a) : 0);
                        }
                    }
                }
            } else {
                if (z6) {
                    p182w1.b bVarY2 = y();
                    p182w1.b bVarJ2 = j();
                    return p182w1.b.b(java.lang.Math.max(bVarY2.f29760a, bVarJ2.f29760a), 0, java.lang.Math.max(bVarY2.f29762c, bVarJ2.f29762c), java.lang.Math.max(bVarY2.f29763d, bVarJ2.f29763d));
                }
                if ((this.f2065h & 2) == 0) {
                    p182w1.b bVarL2 = l();
                    D1.E0 e9 = this.f2064f;
                    bVarJ = e9 != null ? e9.f1967a.j() : null;
                    int iMin = bVarL2.f29763d;
                    if (bVarJ != null) {
                        iMin = java.lang.Math.min(iMin, bVarJ.f29763d);
                    }
                    return p182w1.b.b(bVarL2.f29760a, 0, bVarL2.f29762c, iMin);
                }
            }
        } else {
            if (z6) {
                return p182w1.b.b(0, java.lang.Math.max(y().f29761b, l().f29761b), 0, 0);
            }
            if ((this.f2065h & 4) == 0) {
                return p182w1.b.b(0, l().f29761b, 0, 0);
            }
        }
        return bVar;
    }

    public t0(D1.E0 e6, D1.t0 t0Var) {
        this(e6, new android.view.WindowInsets(t0Var.f2061c));
    }
}
