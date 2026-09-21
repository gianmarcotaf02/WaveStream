package V7;

import U7.EnumC0955c;

public final class W implements l0, InterfaceC0981g, W7.v {

    public final U f10419h;

    public W(U u6) {
        this.f10419h = u6;
    }

    @Override
    public final InterfaceC0981g a(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0955c != EnumC0955c.f10176i) ? r.r(this, hVar, i3, enumC0955c) : this;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        ((n0) this.f10419h).collect(interfaceC0982h, cVar);
        return p109m6.a.f25430h;
    }

    @Override
    public final Object getValue() {
        return ((n0) this.f10419h).getValue();
    }
}
