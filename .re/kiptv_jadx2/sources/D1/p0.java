package D1;

import android.view.WindowInsets;

public class p0 extends s0 {

    public final WindowInsets.Builder f2052c;

    public p0() {
        this.f2052c = o0.h();
    }

    @Override
    public E0 b() {
        a();
        E0 e0C = E0.c(null, this.f2052c.build());
        e0C.f1967a.r(this.f2056b);
        return e0C;
    }

    @Override
    public void d(p182w1.b bVar) {
        this.f2052c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(p182w1.b bVar) {
        this.f2052c.setStableInsets(bVar.d());
    }

    @Override
    public void f(p182w1.b bVar) {
        this.f2052c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(p182w1.b bVar) {
        this.f2052c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(p182w1.b bVar) {
        this.f2052c.setTappableElementInsets(bVar.d());
    }

    public p0(E0 e6) {
        WindowInsets.Builder builderH;
        super(e6);
        WindowInsets windowInsetsB = e6.b();
        if (windowInsetsB != null) {
            builderH = o0.i(windowInsetsB);
        } else {
            builderH = o0.h();
        }
        this.f2052c = builderH;
    }
}
