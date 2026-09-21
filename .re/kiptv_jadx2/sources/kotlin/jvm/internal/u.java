package kotlin.jvm.internal;

import E6.InterfaceC0330c;
import H6.AbstractC0428s;

public class u extends v implements E6.t {
    public u(Class cls, String str, String str2, int i3) {
        super(AbstractC2538c.NO_RECEIVER, cls, str, str2, i3);
    }

    @Override
    public final InterfaceC0330c computeReflected() {
        return B.f24540a.h(this);
    }

    public Object get(Object obj) {
        return ((AbstractC0428s) getGetter()).call(obj);
    }

    @Override
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override
    public final E6.s getGetter() {
        return ((E6.t) getReflected()).getGetter();
    }
}
