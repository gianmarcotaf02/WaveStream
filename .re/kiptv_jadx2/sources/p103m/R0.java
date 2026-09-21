package p103m;

import androidx.appcompat.widget.Toolbar;
import p095l.n;

public final class R0 implements Runnable {

    public final int f24962h;

    public final Toolbar f24963i;

    public R0(Toolbar toolbar, int i3) {
        this.f24962h = i3;
        this.f24963i = toolbar;
    }

    @Override
    public final void run() {
        switch (this.f24962h) {
            case 0:
                T0 t9 = this.f24963i.f15756S;
                n nVar = t9 == null ? null : t9.f24965i;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f24963i.m();
                break;
        }
    }
}
