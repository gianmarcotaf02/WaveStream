package D1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

public final class E0 {

    public static final E0 f1966b;

    public final z0 f1967a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f1966b = y0.f2077s;
        } else if (i3 >= 30) {
            f1966b = x0.f2074r;
        } else {
            f1966b = z0.f2079b;
        }
    }

    public E0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            this.f1967a = new y0(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f1967a = new x0(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f1967a = new w0(this, windowInsets);
        } else if (i3 >= 28) {
            this.f1967a = new v0(this, windowInsets);
        } else {
            this.f1967a = new u0(this, windowInsets);
        }
    }

    public static p182w1.b a(p182w1.b bVar, int i3, int i9, int i10, int i11) {
        int iMax = Math.max(0, bVar.f29760a - i3);
        int iMax2 = Math.max(0, bVar.f29761b - i9);
        int iMax3 = Math.max(0, bVar.f29762c - i10);
        int iMax4 = Math.max(0, bVar.f29763d - i11);
        return (iMax == i3 && iMax2 == i9 && iMax3 == i10 && iMax4 == i11) ? bVar : p182w1.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static E0 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        E0 e6 = new E0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = U.f1980a;
            E0 e0A = M.a(view);
            z0 z0Var = e6.f1967a;
            z0Var.t(e0A);
            z0Var.d(view.getRootView());
            z0Var.v(view.getWindowSystemUiVisibility());
        }
        return e6;
    }

    public final WindowInsets b() {
        z0 z0Var = this.f1967a;
        if (z0Var instanceof t0) {
            return ((t0) z0Var).f2061c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        return Objects.equals(this.f1967a, ((E0) obj).f1967a);
    }

    public final int hashCode() {
        z0 z0Var = this.f1967a;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.hashCode();
    }

    public E0(E0 e6) {
        if (e6 != null) {
            z0 z0Var = e6.f1967a;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34 && (z0Var instanceof y0)) {
                this.f1967a = new y0(this, (y0) z0Var);
            } else if (i3 >= 30 && (z0Var instanceof x0)) {
                this.f1967a = new x0(this, (x0) z0Var);
            } else if (i3 >= 29 && (z0Var instanceof w0)) {
                this.f1967a = new w0(this, (w0) z0Var);
            } else if (i3 >= 28 && (z0Var instanceof v0)) {
                this.f1967a = new v0(this, (v0) z0Var);
            } else if (z0Var instanceof u0) {
                this.f1967a = new u0(this, (u0) z0Var);
            } else if (z0Var instanceof t0) {
                this.f1967a = new t0(this, (t0) z0Var);
            } else {
                this.f1967a = new z0(this);
            }
            z0Var.e(this);
            return;
        }
        this.f1967a = new z0(this);
    }
}
