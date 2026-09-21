package p138q1;

import D7.t;
import F.I;
import K0.C0656d;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.InterfaceC0774h;
import Q0.j0;
import kotlin.jvm.internal.A;
import p175v0.F;

public final class v extends AbstractC0776j implements j0, InterfaceC0774h {

    public final F f26571x;
    public I y;

    public v() {
        F f9 = new F(0, new t(2, this, v.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 2), 9);
        N0(f9);
        this.f26571x = f9;
    }

    @Override
    public final void f0() {
        A a2 = new A();
        AbstractC0777k.p(this, new C0656d(a2, this, 12));
        I i3 = (I) a2.f24539h;
        if (this.f26571x.S0().b()) {
            I i9 = this.y;
            if (i9 != null) {
                i9.b();
            }
            if (i3 != null) {
                i3.a();
            } else {
                i3 = null;
            }
            this.y = i3;
        }
    }
}
