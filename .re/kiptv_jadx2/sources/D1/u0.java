package D1;

import android.view.WindowInsets;

public class u0 extends t0 {

    public p182w1.b f2068n;

    public u0(E0 e6, WindowInsets windowInsets) {
        super(e6, windowInsets);
        this.f2068n = null;
    }

    @Override
    public E0 b() {
        return E0.c(null, this.f2061c.consumeStableInsets());
    }

    @Override
    public E0 c() {
        return E0.c(null, this.f2061c.consumeSystemWindowInsets());
    }

    @Override
    public final p182w1.b j() {
        if (this.f2068n == null) {
            WindowInsets windowInsets = this.f2061c;
            this.f2068n = p182w1.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2068n;
    }

    @Override
    public boolean o() {
        return this.f2061c.isConsumed();
    }

    @Override
    public void u(p182w1.b bVar) {
        this.f2068n = bVar;
    }

    public u0(E0 e6, u0 u0Var) {
        super(e6, u0Var);
        this.f2068n = null;
        this.f2068n = u0Var.f2068n;
    }
}
