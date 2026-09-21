package p161s7;

import N6.InterfaceC0689c;
import N6.InterfaceC0697k;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class b implements j {

    public static final b f27379i = new b(0);

    public final int f27380h;

    public b(int i3) {
        this.f27380h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f27380h) {
            case 0:
                InterfaceC0697k it = (InterfaceC0697k) obj;
                int i3 = d.f27382a;
                m.e(it, "it");
                return it.h();
            default:
                InterfaceC0689c interfaceC0689c = (InterfaceC0689c) obj;
                m.b(interfaceC0689c);
                return d.l(interfaceC0689c);
        }
    }
}
