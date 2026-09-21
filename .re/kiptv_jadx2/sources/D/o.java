package D;

import E6.InterfaceC0330c;
import p020c0.e1;

public final class o extends kotlin.jvm.internal.v implements E6.r {

    public final int f1708h;

    public o(int i3, int i9, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i3);
        this.f1708h = i9;
    }

    @Override
    public final InterfaceC0330c computeReflected() {
        return kotlin.jvm.internal.B.f24540a.g(this);
    }

    @Override
    public final Object get() {
        switch (this.f1708h) {
            case 0:
                return ((e1) this.receiver).getValue();
            case 1:
                return ((e1) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override
    public final Object invoke() {
        return get();
    }

    @Override
    public final E6.q getGetter() {
        return ((E6.r) getReflected()).getGetter();
    }
}
