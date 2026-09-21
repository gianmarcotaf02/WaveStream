package V7;

import W7.AbstractC1009c;

public final class Q implements InterfaceC0981g {

    public final int f10415h = 0;

    public final InterfaceC0981g[] f10416i;
    public final p117n6.i j;

    public Q(InterfaceC0981g[] interfaceC0981gArr, p194x6.o oVar) {
        this.f10416i = interfaceC0981gArr;
        this.j = (p117n6.i) oVar;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        switch (this.f10415h) {
            case 0:
                Object objA = AbstractC1009c.a(interfaceC0982h, S.f10417h, cVar, new P((p194x6.o) this.j, (p100l6.c) null), this.f10416i);
                return objA == p109m6.a.f25430h ? objA : p070h6.A.f22523a;
            case 1:
                Object objA2 = AbstractC1009c.a(interfaceC0982h, S.f10417h, cVar, new P((p194x6.p) this.j, (p100l6.c) null), this.f10416i);
                return objA2 == p109m6.a.f25430h ? objA2 : p070h6.A.f22523a;
            default:
                Object objA3 = AbstractC1009c.a(interfaceC0982h, S.f10417h, cVar, new P((p100l6.c) null, (p194x6.q) this.j), this.f10416i);
                return objA3 == p109m6.a.f25430h ? objA3 : p070h6.A.f22523a;
        }
    }

    public Q(InterfaceC0981g[] interfaceC0981gArr, p194x6.p pVar) {
        this.f10416i = interfaceC0981gArr;
        this.j = (p117n6.i) pVar;
    }

    public Q(InterfaceC0981g[] interfaceC0981gArr, p194x6.q qVar) {
        this.f10416i = interfaceC0981gArr;
        this.j = (p117n6.i) qVar;
    }
}
