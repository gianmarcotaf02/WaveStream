package D1;

import android.view.View;
import android.view.WindowInsets;

public class x0 extends w0 {

    public static final E0 f2074r = E0.c(null, WindowInsets.CONSUMED);

    public x0(E0 e6, WindowInsets windowInsets) {
        super(e6, windowInsets);
    }

    @Override
    public p182w1.b g(int i3) {
        return p182w1.b.c(this.f2061c.getInsets(B0.a(i3)));
    }

    @Override
    public p182w1.b h(int i3) {
        return p182w1.b.c(this.f2061c.getInsetsIgnoringVisibility(B0.a(i3)));
    }

    @Override
    public boolean q(int i3) {
        return this.f2061c.isVisible(B0.a(i3));
    }

    public x0(E0 e6, x0 x0Var) {
        super(e6, x0Var);
    }

    @Override
    public final void d(View view) {
    }
}
