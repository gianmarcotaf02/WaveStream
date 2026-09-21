package D1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class t0 extends z0 {

    public static boolean f2057i = false;
    public static Method j;

    public static Class f2058k;

    public static Field f2059l;

    public static Field f2060m;

    public final WindowInsets f2061c;

    public p182w1.b[] f2062d;

    public p182w1.b f2063e;

    public E0 f2064f;
    public p182w1.b g;

    public int f2065h;

    public t0(E0 e6, WindowInsets windowInsets) {
        super(e6);
        this.f2063e = null;
        this.f2061c = windowInsets;
    }

    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2058k = cls;
            f2059l = cls.getDeclaredField("mVisibleInsets");
            f2060m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2059l.setAccessible(true);
            f2060m.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
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
        E0 e6 = this.f2064f;
        return e6 != null ? e6.f1967a.j() : p182w1.b.f29759e;
    }

    private p182w1.b z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2057i) {
            B();
        }
        Method method = j;
        if (method != null && f2058k != null && f2059l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2059l.get(f2060m.get(objInvoke));
                if (rect != null) {
                    return p182w1.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
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

    @Override
    public void d(View view) {
        p182w1.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = p182w1.b.f29759e;
        }
        s(bVarZ);
    }

    @Override
    public void e(E0 e6) {
        e6.f1967a.t(this.f2064f);
        p182w1.b bVar = this.g;
        z0 z0Var = e6.f1967a;
        z0Var.s(bVar);
        z0Var.v(this.f2065h);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Objects.equals(this.g, t0Var.g) && C(this.f2065h, t0Var.f2065h);
    }

    @Override
    public p182w1.b g(int i3) {
        return w(i3, false);
    }

    @Override
    public p182w1.b h(int i3) {
        return w(i3, true);
    }

    @Override
    public final p182w1.b l() {
        if (this.f2063e == null) {
            WindowInsets windowInsets = this.f2061c;
            this.f2063e = p182w1.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2063e;
    }

    @Override
    public E0 n(int i3, int i9, int i10, int i11) {
        s0 p0Var;
        E0 e0C = E0.c(null, this.f2061c);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            p0Var = new r0(e0C);
        } else if (i12 >= 30) {
            p0Var = new q0(e0C);
        } else {
            p0Var = i12 >= 29 ? new p0(e0C) : new n0(e0C);
        }
        p0Var.g(E0.a(l(), i3, i9, i10, i11));
        p0Var.e(E0.a(j(), i3, i9, i10, i11));
        return p0Var.b();
    }

    @Override
    public boolean p() {
        return this.f2061c.isRound();
    }

    @Override
    public boolean q(int i3) {
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i3 & i9) != 0 && !A(i9)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void r(p182w1.b[] bVarArr) {
        this.f2062d = bVarArr;
    }

    @Override
    public void s(p182w1.b bVar) {
        this.g = bVar;
    }

    @Override
    public void t(E0 e6) {
        this.f2064f = e6;
    }

    @Override
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
                        E0 e6 = this.f2064f;
                        C0227l c0227lF = e6 != null ? e6.f1967a.f() : f();
                        if (c0227lF != null) {
                            int i11 = Build.VERSION.SDK_INT;
                            return p182w1.b.b(i11 >= 28 ? AbstractC0225j.k(c0227lF.f2036a) : 0, i11 >= 28 ? AbstractC0225j.m(c0227lF.f2036a) : 0, i11 >= 28 ? AbstractC0225j.l(c0227lF.f2036a) : 0, i11 >= 28 ? AbstractC0225j.j(c0227lF.f2036a) : 0);
                        }
                    }
                }
            } else {
                if (z6) {
                    p182w1.b bVarY2 = y();
                    p182w1.b bVarJ2 = j();
                    return p182w1.b.b(Math.max(bVarY2.f29760a, bVarJ2.f29760a), 0, Math.max(bVarY2.f29762c, bVarJ2.f29762c), Math.max(bVarY2.f29763d, bVarJ2.f29763d));
                }
                if ((this.f2065h & 2) == 0) {
                    p182w1.b bVarL2 = l();
                    E0 e9 = this.f2064f;
                    bVarJ = e9 != null ? e9.f1967a.j() : null;
                    int iMin = bVarL2.f29763d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f29763d);
                    }
                    return p182w1.b.b(bVarL2.f29760a, 0, bVarL2.f29762c, iMin);
                }
            }
        } else {
            if (z6) {
                return p182w1.b.b(0, Math.max(y().f29761b, l().f29761b), 0, 0);
            }
            if ((this.f2065h & 4) == 0) {
                return p182w1.b.b(0, l().f29761b, 0, 0);
            }
        }
        return bVar;
    }

    public t0(E0 e6, t0 t0Var) {
        this(e6, new WindowInsets(t0Var.f2061c));
    }
}
