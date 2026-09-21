package D1;

import android.view.WindowInsets;

public final class y0 extends x0 {

    public static final E0 f2077s = E0.c(null, WindowInsets.CONSUMED);

    public y0(E0 e6, WindowInsets windowInsets) {
        super(e6, windowInsets);
    }

    @Override
    public p182w1.b g(int i3) {
        return p182w1.b.c(this.f2061c.getInsets(D0.a(i3)));
    }

    @Override
    public p182w1.b h(int i3) {
        return p182w1.b.c(this.f2061c.getInsetsIgnoringVisibility(D0.a(i3)));
    }

    @Override
    public boolean q(int i3) {
        return this.f2061c.isVisible(D0.a(i3));
    }

    public y0(E0 e6, y0 y0Var) {
        super(e6, y0Var);
    }
}
