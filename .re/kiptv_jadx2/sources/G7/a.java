package G7;

import C7.a0;
import N6.InterfaceC0694h;
import N6.T;
import N6.U;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class a implements j {

    public static final a f3829i = new a(0);
    public static final a j = new a(1);

    public final int f3830h;

    public a(int i3) {
        this.f3830h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        a0 it = (a0) obj;
        switch (this.f3830h) {
            case 0:
                m.e(it, "it");
                InterfaceC0694h interfaceC0694hH = it.u0().h();
                return Boolean.valueOf(interfaceC0694hH != null && (interfaceC0694hH instanceof U) && (((U) interfaceC0694hH).h() instanceof T));
            default:
                m.e(it, "it");
                InterfaceC0694h interfaceC0694hH2 = it.u0().h();
                return Boolean.valueOf(interfaceC0694hH2 != null && ((interfaceC0694hH2 instanceof T) || (interfaceC0694hH2 instanceof U)));
        }
    }
}
