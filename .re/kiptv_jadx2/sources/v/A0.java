package v;

import android.view.View;
import android.widget.Magnifier;

public final class A0 implements y0 {

    public static final A0 f28797b = new A0(0);

    public static final A0 f28798c = new A0(1);

    public final int f28799a;

    public A0(int i3) {
        this.f28799a = i3;
    }

    @Override
    public final boolean a() {
        switch (this.f28799a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final x0 b(View view, p113n1.c cVar) {
        switch (this.f28799a) {
            case 0:
                return new z0(new Magnifier(view));
            default:
                return new B0(new Magnifier(view));
        }
    }
}
