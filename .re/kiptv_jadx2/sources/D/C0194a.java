package D;

import x.EnumC3061p0;

public final class C0194a {

    public int f1664a;

    public boolean f1665b;

    public int f1666c;

    public float f1667d;

    public Object f1668e;

    public static int a(E.p pVar, boolean z6) {
        return z6 ? ((E.q) p078i6.o.q1(pVar.f2675m)).f2682a + 1 : ((E.q) p078i6.o.h1(pVar.f2675m)).f2682a - 1;
    }

    public static int b(t tVar, boolean z6) {
        return z6 ? ((u) p078i6.o.q1(tVar.f1754k)).f1761a + 1 : ((u) p078i6.o.h1(tVar.f1754k)).f1761a - 1;
    }

    public static int c(E.p pVar, boolean z6) {
        if (z6) {
            E.q qVar = (E.q) p078i6.o.q1(pVar.f2675m);
            return (pVar.f2679q == EnumC3061p0.f30978h ? qVar.f2695p : qVar.f2696q) + 1;
        }
        E.q qVar2 = (E.q) p078i6.o.h1(pVar.f2675m);
        return (pVar.f2679q == EnumC3061p0.f30978h ? qVar2.f2695p : qVar2.f2696q) - 1;
    }
}
