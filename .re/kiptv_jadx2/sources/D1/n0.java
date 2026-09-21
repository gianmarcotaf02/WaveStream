package D1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class n0 extends s0 {

    public static Field f2042e = null;

    public static boolean f2043f = false;
    public static Constructor g = null;

    public static boolean f2044h = false;

    public WindowInsets f2045c;

    public p182w1.b f2046d;

    public n0() {
        this.f2045c = i();
    }

    private static WindowInsets i() {
        if (!f2043f) {
            try {
                f2042e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f2043f = true;
        }
        Field field = f2042e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f2044h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f2044h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override
    public E0 b() {
        a();
        E0 e0C = E0.c(null, this.f2045c);
        p182w1.b[] bVarArr = this.f2056b;
        z0 z0Var = e0C.f1967a;
        z0Var.r(bVarArr);
        z0Var.u(this.f2046d);
        return e0C;
    }

    @Override
    public void e(p182w1.b bVar) {
        this.f2046d = bVar;
    }

    @Override
    public void g(p182w1.b bVar) {
        WindowInsets windowInsets = this.f2045c;
        if (windowInsets != null) {
            this.f2045c = windowInsets.replaceSystemWindowInsets(bVar.f29760a, bVar.f29761b, bVar.f29762c, bVar.f29763d);
        }
    }

    public n0(E0 e6) {
        super(e6);
        this.f2045c = e6.b();
    }
}
