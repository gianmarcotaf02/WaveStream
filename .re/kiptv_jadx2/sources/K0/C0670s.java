package K0;

import Q0.AbstractC0777k;
import R0.AbstractC0844q0;
import R0.C0848t;

public final class C0670s extends AbstractC0660h {
    @Override
    public final void O0(InterfaceC0672u interfaceC0672u) {
        v vVar = (v) AbstractC0777k.h(this, AbstractC0844q0.f8978u);
        if (vVar != null) {
            C0848t c0848t = (C0848t) vVar;
            if (interfaceC0672u == null) {
                InterfaceC0672u.f6734a.getClass();
                interfaceC0672u = w.f6735a;
            }
            R0.J.f8790a.a(c0848t.f8991b, interfaceC0672u);
        }
    }

    @Override
    public final boolean Q0(int i3) {
        return (i3 == 3 || i3 == 4) ? false : true;
    }

    @Override
    public final Object g() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
