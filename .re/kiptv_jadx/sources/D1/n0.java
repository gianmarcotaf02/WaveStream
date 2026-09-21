package D1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends D1.s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f2042e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2043f = false;
    public static java.lang.reflect.Constructor g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2044h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.view.WindowInsets f2045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p182w1.b f2046d;

    public n0() {
        this.f2045c = i();
    }

    private static android.view.WindowInsets i() {
        if (!f2043f) {
            try {
                f2042e = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException e6) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f2043f = true;
        }
        java.lang.reflect.Field field = f2042e;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException e9) {
                android.util.Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f2044h) {
            try {
                g = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException e10) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f2044h = true;
        }
        java.lang.reflect.Constructor constructor = g;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException e11) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // D1.s0
    public D1.E0 b() {
        a();
        D1.E0 e0C = D1.E0.c(null, this.f2045c);
        p182w1.b[] bVarArr = this.f2056b;
        D1.z0 z0Var = e0C.f1967a;
        z0Var.r(bVarArr);
        z0Var.u(this.f2046d);
        return e0C;
    }

    @Override // D1.s0
    public void e(p182w1.b bVar) {
        this.f2046d = bVar;
    }

    @Override // D1.s0
    public void g(p182w1.b bVar) {
        android.view.WindowInsets windowInsets = this.f2045c;
        if (windowInsets != null) {
            this.f2045c = windowInsets.replaceSystemWindowInsets(bVar.f29760a, bVar.f29761b, bVar.f29762c, bVar.f29763d);
        }
    }

    public n0(D1.E0 e6) {
        super(e6);
        this.f2045c = e6.b();
    }
}
