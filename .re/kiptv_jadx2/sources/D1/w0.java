package D1;

import android.view.WindowInsets;

public class w0 extends v0 {

    public p182w1.b f2070o;

    public p182w1.b f2071p;

    public p182w1.b f2072q;

    public w0(E0 e6, WindowInsets windowInsets) {
        super(e6, windowInsets);
        this.f2070o = null;
        this.f2071p = null;
        this.f2072q = null;
    }

    @Override
    public p182w1.b i() {
        if (this.f2071p == null) {
            this.f2071p = p182w1.b.c(this.f2061c.getMandatorySystemGestureInsets());
        }
        return this.f2071p;
    }

    @Override
    public p182w1.b k() {
        if (this.f2070o == null) {
            this.f2070o = p182w1.b.c(this.f2061c.getSystemGestureInsets());
        }
        return this.f2070o;
    }

    @Override
    public p182w1.b m() {
        if (this.f2072q == null) {
            this.f2072q = p182w1.b.c(this.f2061c.getTappableElementInsets());
        }
        return this.f2072q;
    }

    @Override
    public E0 n(int i3, int i9, int i10, int i11) {
        return E0.c(null, this.f2061c.inset(i3, i9, i10, i11));
    }

    public w0(E0 e6, w0 w0Var) {
        super(e6, w0Var);
        this.f2070o = null;
        this.f2071p = null;
        this.f2072q = null;
    }

    @Override
    public void u(p182w1.b bVar) {
    }
}
