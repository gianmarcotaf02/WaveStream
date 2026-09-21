package W7;

import U7.EnumC0955c;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;

public final class j extends i {
    public j(InterfaceC0981g interfaceC0981g, Z7.d dVar, int i3, EnumC0955c enumC0955c, int i9) {
        super(interfaceC0981g, (i9 & 2) != 0 ? p100l6.i.f24820h : dVar, (i9 & 4) != 0 ? -3 : i3, (i9 & 8) != 0 ? EnumC0955c.f10175h : enumC0955c);
    }

    @Override
    public final g d(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        return new j(this.f10743k, hVar, i3, enumC0955c);
    }

    @Override
    public final InterfaceC0981g e() {
        return this.f10743k;
    }

    @Override
    public final Object g(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        Object objCollect = this.f10743k.collect(interfaceC0982h, cVar);
        return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
    }
}
