package V7;

import E5.D0;
import W7.AbstractC1009c;

public final class C0980f implements InterfaceC0981g {

    public final InterfaceC0981g f10457h;

    public final p194x6.m f10458i;

    public C0980f(InterfaceC0981g interfaceC0981g, p194x6.m mVar) {
        this.f10457h = interfaceC0981g;
        this.f10458i = mVar;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        a2.f24539h = AbstractC1009c.f10731b;
        Object objCollect = this.f10457h.collect(new D0(this, a2, interfaceC0982h, 1), cVar);
        return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
    }
}
