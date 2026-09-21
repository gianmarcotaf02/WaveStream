package kotlin.jvm.internal;

import E6.InterfaceC0330c;

public abstract class q extends s implements E6.l {
    @Override
    public InterfaceC0330c computeReflected() {
        return B.f24540a.f(this);
    }

    @Override
    public Object getDelegate(Object obj) {
        return ((E6.l) getReflected()).getDelegate(obj);
    }

    @Override
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override
    public E6.s getGetter() {
        return ((E6.l) getReflected()).getGetter();
    }

    @Override
    public E6.k getSetter() {
        return ((E6.l) getReflected()).getSetter();
    }
}
