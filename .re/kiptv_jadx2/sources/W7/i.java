package W7;

import B.C0063a;
import E5.D0;
import U7.EnumC0955c;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;

public abstract class i extends g {

    public final InterfaceC0981g f10743k;

    public i(InterfaceC0981g interfaceC0981g, p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        super(hVar, i3, enumC0955c);
        this.f10743k = interfaceC0981g;
    }

    @Override
    public final Object c(U7.A a2, p100l6.c cVar) {
        Object objG = g(new B(a2), cVar);
        return objG == p109m6.a.f25430h ? objG : p070h6.A.f22523a;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        Object objCollect;
        p070h6.A a2 = p070h6.A.f22523a;
        if (this.f10740i == -3) {
            p100l6.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0063a c0063a = new C0063a(23);
            p100l6.h hVar = this.f10739h;
            p100l6.h hVarPlus = !((Boolean) hVar.fold(bool, c0063a)).booleanValue() ? context.plus(hVar) : S7.C.q(context, hVar, false);
            if (kotlin.jvm.internal.m.a(hVarPlus, context)) {
                Object objG = g(interfaceC0982h, cVar);
                if (objG == p109m6.a.f25430h) {
                    return objG;
                }
            } else {
                p100l6.d dVar = p100l6.d.f24819h;
                if (kotlin.jvm.internal.m.a(hVarPlus.get(dVar), context.get(dVar))) {
                    p100l6.h context2 = cVar.getContext();
                    if (!(interfaceC0982h instanceof B) && !(interfaceC0982h instanceof x)) {
                        interfaceC0982h = new D0(interfaceC0982h, context2);
                    }
                    Object objC = AbstractC1009c.c(hVarPlus, interfaceC0982h, X7.a.m(hVarPlus), new h(this, null), cVar);
                    if (objC == p109m6.a.f25430h) {
                        return objC;
                    }
                } else {
                    objCollect = super.collect(interfaceC0982h, cVar);
                    if (objCollect == p109m6.a.f25430h) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(interfaceC0982h, cVar);
            if (objCollect == p109m6.a.f25430h) {
                return objCollect;
            }
        }
        return a2;
    }

    public abstract Object g(InterfaceC0982h interfaceC0982h, p100l6.c cVar);

    @Override
    public final String toString() {
        return this.f10743k + " -> " + super.toString();
    }
}
